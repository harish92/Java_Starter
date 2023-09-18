

public class Ex4 {
    
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("harr");
        sb.append("dsfsdf");
        sb.insert(1, "dsfsdf");
        sb.deleteCharAt(1);
        sb.ensureCapacity(100);
        String c = sb.toString();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);
        System.out.println(c);
    }
}
