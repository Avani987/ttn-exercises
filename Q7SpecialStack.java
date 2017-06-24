import java.util.Stack;

public class Q7SpecialStack {

        Stack<Integer> s;
        Stack<Integer> minStack;

        Q7SpecialStack() {
            s = new Stack<Integer>();
            minStack= new Stack<Integer>();
        }

        void getMin()
        {
            Integer min=0;
            if(!minStack.isEmpty()) {
                min = minStack.peek();
                System.out.println("Minimum Element in the " + " stack is: " + min);
            }
            else{
                System.out.println("No elements in the Stack");
            }
        }

        void printStack()
        {
            System.out.println("Stack: " + s);
        }

        void peek()
        {
            Integer top=0;
            if (s.isEmpty())
            {
                System.out.println("Stack is empty ");
                return;
            }

            top = s.peek();
            System.out.print("Top Most Element is: ");
            System.out.println(top);
        }


        void pop()
        {
            Integer m=0,t=0;
            if (s.isEmpty())
            {
                System.out.println("Stack is empty");
                return;
            }

            System.out.print("Top Most Element Removed: ");
            t = s.pop();
            System.out.println(t);
            m=minStack.peek();
            if(t==m)
             minStack.pop();
        }

        void push(Integer x)
        {
            if (minStack.isEmpty() || x < minStack.peek())
                minStack.push(x);

            s.push(x);
            System.out.println("Number Inserted: " + x);
        }

    public static void main(String[] args)
    {
        Q7SpecialStack s = new Q7SpecialStack();
        s.push(3);
        s.push(5);
        s.printStack();
        s.getMin();
        s.push(2);
        s.push(1);
        s.printStack();
        s.getMin();
        s.pop();
        s.getMin();
    }
    }



