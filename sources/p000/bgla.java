package p000;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bgla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgla {

    /* renamed from: a */
    public static final bgla f116740a = new bgla();

    /* renamed from: b */
    public final List f116741b = new ArrayList();

    /* renamed from: c */
    public final Map f116742c = new HashMap();

    /* renamed from: d */
    public long f116743d = -1;

    private bgla() {
    }

    /* renamed from: a */
    private static final String m99226a(long j) {
        return j + "ms (" + (j / 60000) + "min) ";
    }

    /* renamed from: a */
    public final String mo62965a(long j, long j2) {
        String valueOf = String.valueOf(m99226a(j));
        StringBuilder sb = new StringBuilder(12);
        double d = (double) j;
        double d2 = (double) j2;
        Double.isNaN(d);
        Double.isNaN(d2);
        sb.append((int) ((d / d2) * 100.0d));
        sb.append("%");
        String valueOf2 = String.valueOf(sb.toString());
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* renamed from: a */
    public final synchronized void mo62966a(PrintWriter printWriter, long j) {
        int length;
        printWriter.println("####NlpWakeLockStats (since last process restart)###");
        long j2 = this.f116743d;
        if (j2 != -1) {
            long j3 = j - j2;
            if (j3 <= 0) {
                j3 = 1;
            }
            String valueOf = String.valueOf(m99226a(j3));
            printWriter.println(valueOf.length() == 0 ? new String("Time since first lock: ") : "Time since first lock: ".concat(valueOf));
            printWriter.println("--Locks currently held:");
            List list = this.f116741b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                bgky bgky = (bgky) list.get(i);
                if (bgky.mo62964a()) {
                    String str = bgky.f116732c;
                    String a = mo62965a(bgky.mo62963a(j), j3);
                    boolean a2 = bgky.mo62964a();
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(a).length());
                    sb.append(str);
                    sb.append(" timeHeld= ");
                    sb.append(a);
                    sb.append(" isHeld=");
                    sb.append(a2);
                    printWriter.println(sb.toString());
                }
            }
            printWriter.println("--Locks that timed out:");
            List list2 = this.f116741b;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                bgky bgky2 = (bgky) list2.get(i2);
                if (!bgky2.mo62964a()) {
                    String str2 = bgky2.f116732c;
                    boolean a3 = bgky2.mo62964a();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 13);
                    sb2.append(str2);
                    sb2.append(" isHeld=");
                    sb2.append(a3);
                    printWriter.println(sb2.toString());
                }
            }
            printWriter.println("--Historical locks:");
            for (Map.Entry entry : this.f116742c.entrySet()) {
                bgkz bgkz = (bgkz) entry.getValue();
                String str3 = (String) entry.getKey();
                String a4 = bgkz.f116739e.mo62965a(bgkz.f116735a, j3);
                int i3 = bgkz.f116736b;
                StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 37 + String.valueOf(a4).length());
                sb3.append(str3);
                sb3.append(", sumOfTimeHeld= ");
                sb3.append(a4);
                sb3.append(", count= ");
                sb3.append(i3);
                printWriter.println(sb3.toString());
                short[] sArr = bgkz.f116737c;
                int i4 = 0;
                while (true) {
                    length = sArr.length;
                    if (i4 >= length) {
                        break;
                    }
                    short s = sArr[i4];
                    int i5 = bgkz.f116738d[i4];
                    StringBuilder sb4 = new StringBuilder(33);
                    sb4.append("  x < ");
                    sb4.append((int) s);
                    sb4.append("ms, count ");
                    sb4.append(i5);
                    printWriter.println(sb4.toString());
                    i4++;
                }
                short s2 = sArr[length - 1];
                int i6 = bgkz.f116738d[length];
                StringBuilder sb5 = new StringBuilder(33);
                sb5.append("  x > ");
                sb5.append((int) s2);
                sb5.append("ms, count ");
                sb5.append(i6);
                printWriter.println(sb5.toString());
            }
            printWriter.println();
            return;
        }
        printWriter.println("WakeLockTracker not initialized");
    }
}
