package p000;

import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* renamed from: bsfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsfd {

    /* renamed from: a */
    public final Deque f144433a = new ArrayDeque();

    /* renamed from: b */
    private final String f144434b;

    /* renamed from: c */
    private final int f144435c;

    /* renamed from: d */
    private final double f144436d;

    /* renamed from: e */
    private final boolean f144437e;

    public bsfd(String str, int i, double d, boolean z) {
        this.f144434b = str;
        this.f144435c = i;
        this.f144436d = d;
        this.f144437e = z;
    }

    /* renamed from: a */
    private final void m115650a(double d) {
        while (!this.f144433a.isEmpty() && d - ((bsfs) this.f144433a.peekFirst()).f144498d >= this.f144436d) {
            this.f144433a.removeFirst();
        }
    }

    /* renamed from: a */
    public final void mo70481a(long j, PrintWriter printWriter) {
        int i;
        if (printWriter != null) {
            m115650a(bsgk.m115737a(j));
            double a = bsgk.m115737a(j);
            double d = a - this.f144436d;
            StringBuilder sb = new StringBuilder();
            Iterator it = this.f144433a.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                bsfs bsfs = (bsfs) it.next();
                double d2 = bsfs.f144498d;
                if (d2 > d && d2 <= a) {
                    sb.append(String.format("%.9f,%s", Double.valueOf(d2), Integer.valueOf(bsfs.f144497c)));
                    int i3 = 0;
                    while (true) {
                        double[] dArr = bsfs.f144499e;
                        if (dArr != null) {
                            i = dArr.length;
                        } else {
                            i = 0;
                        }
                        if (i3 >= i) {
                            break;
                        }
                        sb.append(String.format(",%s", Double.valueOf(bsfs.mo70516a(i3))));
                        i3++;
                    }
                    sb.append("\n");
                } else {
                    it.remove();
                    i2++;
                }
            }
            String a2 = boan.f132470d.mo68794a(sb.toString().getBytes(bmwy.f131158c));
            printWriter.println();
            printWriter.println(String.format("### start %s log ###", this.f144434b));
            printWriter.println(a2);
            printWriter.println(String.format("###  end %s log  ###", this.f144434b));
            if (i2 > 0) {
                printWriter.printf("#evidence dropped: %s%n", Integer.valueOf(i2));
            }
            printWriter.println();
        }
    }

    /* renamed from: a */
    public final void mo70482a(bsfs bsfs) {
        if (bsfs != null) {
            if (this.f144437e) {
                bsfs = new bsfs(bsfs.f144497c, bsfs.f144498d, bsfs.f144499e);
            }
            if (this.f144435c == this.f144433a.size()) {
                this.f144433a.removeFirst();
            }
            m115650a(bsfs.f144498d);
            this.f144433a.add(bsfs);
        }
    }
}
