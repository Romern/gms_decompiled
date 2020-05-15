package p000;

import java.io.PrintWriter;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;

/* renamed from: bfud */
public final /* synthetic */ class bfud implements Runnable {

    /* renamed from: a */
    private final bfuh f115314a;

    /* renamed from: b */
    private final PrintWriter f115315b;

    /* renamed from: c */
    private final CountDownLatch f115316c;

    public bfud(bfuh bfuh, PrintWriter printWriter, CountDownLatch countDownLatch) {
        this.f115314a = bfuh;
        this.f115315b = printWriter;
        this.f115316c = countDownLatch;
    }

    public final void run() {
        bfuh bfuh = this.f115314a;
        PrintWriter printWriter = this.f115315b;
        CountDownLatch countDownLatch = this.f115316c;
        printWriter.println("\nFused Device Orientation Provider State:");
        bfuo bfuo = bfuh.f115330f;
        printWriter.println("--Start OrientationEngine Log--");
        bfuo.mo62270a(printWriter);
        printWriter.println("Active Device Orientation Requests:");
        printWriter.println(bfuo.f115363f.toString());
        printWriter.println("--End OrientationEngine Log--");
        printWriter.println("\nActive Device Orientation Listener ");
        for (bfub bfub : bfuh.f115327c.mo25992c()) {
            bfuh.m97900a(bfub, printWriter);
        }
        if (!bfuh.f115327c.mo25993d().isEmpty()) {
            printWriter.println("\nInactive Device Orientation Listener ");
            for (bfub bfub2 : bfuh.f115327c.mo25993d()) {
                bfuh.m97900a(bfub2, printWriter);
            }
        }
        printWriter.println();
        printWriter.println("Event Log:");
        ListIterator b = bfuh.f115329e.iterator();
        while (b.hasNext()) {
            b.next();
        }
        while (b.hasPrevious()) {
            printWriter.println((String) b.previous());
        }
        countDownLatch.countDown();
    }
}
