package p000;

import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;

/* renamed from: bfqb */
public final /* synthetic */ class bfqb implements Runnable {

    /* renamed from: a */
    private final bfqm f114832a;

    /* renamed from: b */
    private final PrintWriter f114833b;

    /* renamed from: c */
    private final String[] f114834c;

    /* renamed from: d */
    private final FileDescriptor f114835d;

    /* renamed from: e */
    private final CountDownLatch f114836e;

    public bfqb(bfqm bfqm, PrintWriter printWriter, String[] strArr, FileDescriptor fileDescriptor, CountDownLatch countDownLatch) {
        this.f114832a = bfqm;
        this.f114833b = printWriter;
        this.f114834c = strArr;
        this.f114835d = fileDescriptor;
        this.f114836e = countDownLatch;
    }

    public final void run() {
        bfqm bfqm = this.f114832a;
        PrintWriter printWriter = this.f114833b;
        String[] strArr = this.f114834c;
        FileDescriptor fileDescriptor = this.f114835d;
        CountDownLatch countDownLatch = this.f114836e;
        printWriter.println("\nFused Location Provider State:");
        String valueOf = String.valueOf(bhce.m100624a(System.currentTimeMillis()));
        printWriter.print(valueOf.length() == 0 ? new String("Current System Time: ") : "Current System Time: ".concat(valueOf));
        String valueOf2 = String.valueOf(bhce.m100625b(SystemClock.elapsedRealtime()));
        printWriter.println(valueOf2.length() == 0 ? new String(", Current Elapsed Time: ") : ", Current Elapsed Time: ".concat(valueOf2));
        int length = strArr.length;
        String str = null;
        if (length <= 0 || !"--clients".equals(strArr[0])) {
            int c = aeri.m52438c(bfqm.f114879f);
            StringBuilder sb = new StringBuilder(29);
            sb.append("Location Enabled: ");
            sb.append(c);
            printWriter.println(sb.toString());
            boolean a = aeri.m52434a(bfqm.f114879f);
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("  NLP/GLS Consent: ");
            sb2.append(a);
            printWriter.println(sb2.toString());
            printWriter.println();
            bfqm.f114878e.mo62072a(fileDescriptor, printWriter, strArr);
            printWriter.println();
            printWriter.println("Active Location Requests:");
            for (bfph bfph : bfqm.f114883j.mo25992c()) {
                bfqm.m97527a(bfph, printWriter);
            }
            if (!bfqm.f114883j.mo25993d().isEmpty()) {
                printWriter.println();
                printWriter.println("Inactive Location Requests:");
                for (bfph bfph2 : bfqm.f114883j.mo25993d()) {
                    bfqm.m97527a(bfph2, printWriter);
                }
            }
            printWriter.println();
            bfqm.mo62135a(printWriter, (String) null);
            printWriter.println();
            int i = 0;
            for (short s : bfpk.f114795b) {
                i += s;
            }
            StringBuilder sb3 = new StringBuilder("FLP WakeLock Count:");
            for (int i2 = 0; i2 < bfpk.f114795b.length; i2++) {
                short s2 = bfpk.f114795b[i2];
                if (s2 > 0) {
                    int round = Math.round((((float) s2) / ((float) i)) * 100.0f);
                    sb3.append("\n  ");
                    sb3.append(bfpk.f114794a[i2]);
                    sb3.append(": ");
                    sb3.append((int) s2);
                    sb3.append(" (");
                    sb3.append(round);
                    sb3.append("%)");
                }
            }
            printWriter.println(sb3.toString());
            printWriter.println();
            printWriter.println("Event Log:");
            ListIterator b = bfqm.f114894u.iterator();
            while (b.hasNext()) {
                b.next();
            }
            while (b.hasPrevious()) {
                printWriter.println((String) b.previous());
            }
            printWriter.println();
        } else {
            if (length > 1) {
                if (!"--reset".equals(strArr[1])) {
                    str = strArr[1];
                } else {
                    ssq ssq = bfqm.f114890q;
                    ssq.f45098a = SystemClock.elapsedRealtime();
                    ssq.f45099b.clear();
                }
            }
            bfqm.mo62135a(printWriter, str);
        }
        bfqm.f114891r.mo25063a(printWriter);
        countDownLatch.countDown();
    }
}
