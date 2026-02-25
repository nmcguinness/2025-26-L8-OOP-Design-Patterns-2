package org.example.factory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Main theApp = new Main();
            theApp.run();
        }

        public void run()
        {
            Task t1 = new Task("Reload weapon");
            Task t2 = new Task("Press W and move forward");

            IProcessor proc = ProcessorFactory.create(ProcessorType.Console);
            proc.process(t1);
            proc.process(t2);
        }
}
