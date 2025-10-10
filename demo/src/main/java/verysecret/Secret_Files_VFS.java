package verysecret;
import work.prettyGUI;

public class Secret_Files_VFS {
    public static void main(String[] args) {
        prettyGUI gui = new prettyGUI();
        gui.CreateGUI();
        gui.appendText("Welcome to the O.M.N.I. system");
        gui.appendText("Proceed with authorization");
        gui.appendText("--------------------------------------");
        
        if (args.length >= 2) {
            String username = args[0];
            gui.setText(username);
            gui.setUNflagTr();
            String vfsPath = args[1];
            gui.setText("--vfs " + vfsPath);
            
            if (args.length >= 3) {
                String ssPath = args[2];
                gui.setText("--ss " + ssPath);
            }
        } else if (args.length == 1) {
            gui.setText(args[0]);
        } else {
            gui.appendText("Interactive mode - please enter your credentials");
        }
    }
}