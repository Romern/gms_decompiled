package p000;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: baua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baua extends Exception {

    /* renamed from: a */
    public final bngx f101746a;

    private baua(String str, Throwable th, bngx bngx) {
        super(str, th);
        this.f101746a = bngx;
    }

    /* renamed from: a */
    private static String m87544a(Throwable th, int i) {
        String name = th.getClass().getName();
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 2 + String.valueOf(message).length());
        sb.append(name);
        sb.append(": ");
        sb.append(message);
        String sb2 = sb.toString();
        Throwable cause = th.getCause();
        if (cause == null) {
            return sb2;
        }
        if (i >= 5) {
            return String.valueOf(sb2).concat("\n(...)");
        }
        String a = m87544a(cause, i + 1);
        StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 12 + String.valueOf(a).length());
        sb3.append(sb2);
        sb3.append("\nCaused by: ");
        sb3.append(a);
        return sb3.toString();
    }

    /* renamed from: a */
    static Throwable m87545a(Throwable th) {
        Throwable cause = th.getCause();
        return (cause == null || !th.getClass().equals(ExecutionException.class)) ? th : m87545a(cause);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List, java.util.Collection], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static void m87546a(Collection r7, String str, Object... objArr) {
        PrintWriter printWriter;
        int i;
        int size = r7.size();
        bngs bngs = null;
        for (int i2 = 0; i2 < size; i2++) {
            try {
                bqga.m112780a((Future) ((bqgg) r7.get(i2)));
            } catch (CancellationException | ExecutionException e) {
                if (bngs == null) {
                    bngs = bngx.m109377j();
                }
                bngs.mo67668c(m87545a(e));
            }
        }
        if (bngs != null) {
            bngx a = bngs.mo67664a();
            String format = String.format(Locale.US, str, objArr);
            if (a.size() > 1) {
                int size2 = a.size();
                StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 34);
                sb.append(format);
                sb.append("\n");
                sb.append(size2);
                sb.append(" failure(s) in total:\n");
                String sb2 = sb.toString();
                try {
                    StringWriter stringWriter = new StringWriter();
                    try {
                        printWriter = new PrintWriter(stringWriter);
                        if (sb2 != null) {
                            printWriter.println(sb2);
                            i = 0;
                        } else {
                            i = 0;
                        }
                        while (i < a.size()) {
                            i++;
                            printWriter.printf("--- Failure %d ----------------------------\n", Integer.valueOf(i));
                            printWriter.println(m87544a((Throwable) a.get(i), 1));
                        }
                        printWriter.println("-------------------------------------------");
                        format = stringWriter.toString();
                        printWriter.close();
                        stringWriter.close();
                    } catch (Throwable th) {
                        stringWriter.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    String valueOf = String.valueOf(th2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 40);
                    sb3.append("Failed to build string from throwables: ");
                    sb3.append(valueOf);
                    format = sb3.toString();
                }
            }
            throw new baua(format, (Throwable) a.get(0), a);
        }
        return;
        throw th;
    }
}
