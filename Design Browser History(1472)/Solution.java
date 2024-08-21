import java.util.Stack;

class BrowserHistory {

    private final Stack<String> back;
    private final Stack<String> forward;

    public BrowserHistory(String homepage) {
        back = new Stack<>();
        forward = new Stack<>();
        back.push(homepage);
    }

    public void visit(String url) {
        back.push(url);
        forward.clear();
    }

    public String back(int steps) {
        while (steps > 0 && back.size() > 1) {
            forward.push(back.pop());
            steps--;
        }
        return back.peek();
    }

    public String forward(int steps) {
        while (steps > 0 && !forward.isEmpty()) {
            back.push(forward.pop());
            steps--;
        }
        return back.peek();
    }

    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
        browserHistory.visit("google.com");
        browserHistory.visit("facebook.com");
        browserHistory.visit("youtube.com");
        
        System.out.println(browserHistory.back(1));  // Output: "facebook.com"
        System.out.println(browserHistory.back(1));  // Output: "google.com"
        System.out.println(browserHistory.forward(1)); // Output: "facebook.com"
        
        browserHistory.visit("linkedin.com");
        
        System.out.println(browserHistory.forward(2)); // Output: "linkedin.com"
        System.out.println(browserHistory.back(2));  // Output: "google.com"
        System.out.println(browserHistory.back(7));  // Output: "leetcode.com"
    }
}
