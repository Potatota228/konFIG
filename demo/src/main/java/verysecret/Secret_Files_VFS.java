package verysecret;
import work.prettyGUI;

public class Secret_Files_VFS {
    public static void main(String[] args) {
        prettyGUI gui = new prettyGUI();
        gui.CreateGUI();
        gui.appendText("Welcome to the O.M.N.I. system");
        gui.appendText("Proceed with authorization");
        gui.appendText("--------------------------------------");
        
        // Проверяем наличие аргументов командной строки
        if (args.length >= 2) {
            // Первый аргумент - имя пользователя
            String username = args[0];
            gui.setText("name " + username);
            
            // Второй аргумент - путь к VFS
            String vfsPath = args[1];
            gui.setText("--vfs " + vfsPath);
            
            // Третий аргумент (опционально) - путь к скрипту SS
            if (args.length >= 3) {
                String ssPath = args[2];
                gui.setText("--ss " + ssPath);
            }
        } else if (args.length == 1) {
            // Если передан только один аргумент - используем его как имя
            gui.setText("name " + args[0]);
        } else {
            // Если аргументов нет - запускаем в интерактивном режиме
            gui.appendText("Interactive mode - please enter your credentials");
        }
    }
}