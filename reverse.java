import java.util.Stack;

public class reverse
{
    public static void main(String[] args)
    {
        Stack<Integer> st=new Stack<>();

        st.push(23);
        st.push(29);
        st.push(10);
        st.push(15);
        st.push(43);
        System.out.println(st);

        Stack<Integer> trt=new Stack<>();
        while(st.size()>0)
        {
            trt.push(st.pop());
        }
        System.out.println(trt);

        Stack<Integer> q=new Stack<>();
        while(trt.size()>0)
        {
            q.push(trt.pop());
        }
        System.out.println(q);

        while(q.size()>0)
        {
            st.push(q.pop());
        }

        System.out.println(st);
    }
}