package com.ll;

import java.util.Scanner;

public class App {
    private Scanner scanner;
    private TodoController todoController;
    private SystemController systemController;

    public App() {
        scanner = new Scanner(System.in);
        todoController = new TodoController();
        systemController = new SystemController();
    }
    public void run() {
        System.out.println("할일 관리 앱, 시작");
            while (true) {
                System.out.println("명령)");
                String cmd = scanner.nextLine().trim();

                if(cmd.equals("exit")) {
                    systemController.exit();
                    break;
                } else if (cmd.equals("add")) {
                    todoController.add();
                }
                else if (cmd.equals("list")){
                    todoController.list();
                }
                else if (cmd.equals("delete")){
                    todoController.delete();
                } else if (cmd.equals("modify")){
                    todoController.modify();
                }
            }
            scanner.close();
    }
}