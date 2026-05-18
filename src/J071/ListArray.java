package J071;

public class ListArray {
    public static void main(String[] args) {
        ListArray alist = new ListArray();
        /*
        배열을 사용해서, 동적인 리스트를 만들어보기!

        1-1) alist.add(?); //목록에 하나 추가하기 (맨뒤에)
        1-2)* alist.add(int order, Object o); //목록에 정해진 순번에 추가하기

        2-1) alist.remove(); //목록에서 제거하기 (맨뒤에)
        2-2)* alist.remove(int order); // 정해진 순번 삭제하기

        alist.get(?); //목록에 순서를 넘겨서, 해당 값 가져오기
        alist.size(); // 목록의 현재 갯수 가져오기
        */
        alist.add(11);
        alist.add(22);
        alist.add(1, 2222);
        alist.add(33);
        alist.add(44);
        alist.printAll();
        alist.remove(2);
        System.out.println(alist.get(2));
        alist.printAll();
    }

    Object[] list;
    public ListArray(){
        list = new Object[0];
    }
    public int size(){
        return list.length;
    }
    public void printAll(){
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
    }
    public void add(int order, Object o){
        Object[] newlist = new Object[size() + 1];
        for(int i = 0; i < order; i++){
            newlist[i] = list[i];
        }
        newlist[order] = o;
        for(int i = order + 1; i < newlist.length; i++){
            newlist[i] = list[i -1];
        }
        list = newlist;
    }
    public void add(Object o){
        Object[] newlist = new Object[size() + 1];
        for(int i = 0; i < list.length; i++){
            newlist[i] = list[i];
        }
        newlist[list.length] = o;
        list = newlist;
    }
    public void remove(){
        remove(size() - 1);
    }
    public void remove(int order){
        Object[] newlist = new Object[size() - 1];
        for(int i = 0; i < order; i++){
            newlist[i] = list[i];
        }
        for(int i = order; i < newlist.length; i++){
            newlist[i] = list[i + 1];
        }
        list = newlist;
    }

    public Object get(int i){
        if(list == null){
            return null;
        } else {
            if(i > list.length -1){
                return null;
            }
            return list[i];
        }
    }
}
