package modul05.Komposisi;

public class Komputer {
    private CPU cpu;
    private Monitor monitor;
    private Mouse mouse;

    public Komputer(String cpuMerk, int cpuSpeed, String monMerk, String mouseMerk, String mouseType) {
        // Komponen diciptakan saat instansiasi Komputer (komposisi)
        this.cpu = new CPU(cpuMerk, cpuSpeed);
        this.monitor = new Monitor(monMerk);
        this.mouse = new Mouse(mouseMerk, mouseType);
    }

    public void DisplaySpec() {
        System.out.println("=== SPESIFIKASI KOMPUTER ===");
        cpu.DisplaySpecCPU();
        monitor.DisplaySpecMonitor();
        mouse.DisplaySpecMouse();
    }
}
