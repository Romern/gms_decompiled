package p000;

import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: bqye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqye {

    /* renamed from: a */
    public static final bqxy f141934a;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    static {
        bqxy bqxy;
        Integer num = null;
        try {
            num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
        } catch (Throwable th) {
            th = th;
            PrintStream printStream = System.err;
            String name = bqyc.class.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 133);
            sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb.append(name);
            sb.append("will be used. The error is: ");
            printStream.println(sb.toString());
            th.printStackTrace(System.err);
            bqxy = new bqyc();
            f141934a = bqxy;
            if (num == null) {
            }
        }
        if (num != null) {
            try {
                if (num.intValue() >= 19) {
                    bqxy = new bqyd();
                    f141934a = bqxy;
                    if (num == null) {
                        num.intValue();
                        return;
                    }
                    return;
                }
            } catch (Throwable th2) {
                th = th2;
                PrintStream printStream2 = System.err;
                String name2 = bqyc.class.getName();
                StringBuilder sb2 = new StringBuilder(String.valueOf(name2).length() + 133);
                sb2.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
                sb2.append(name2);
                sb2.append("will be used. The error is: ");
                printStream2.println(sb2.toString());
                th.printStackTrace(System.err);
                bqxy = new bqyc();
                f141934a = bqxy;
                if (num == null) {
                }
            }
        }
        if (Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
            bqxy = new bqyc();
        } else {
            bqxy = new bqyb();
        }
        f141934a = bqxy;
        if (num == null) {
        }
    }

    /* renamed from: a */
    public static void m113758a(Throwable th) {
        f141934a.mo69462b(th);
    }

    /* renamed from: a */
    public static void m113759a(Throwable th, PrintStream printStream) {
        f141934a.mo69458a(th, printStream);
    }

    /* renamed from: a */
    public static void m113760a(Throwable th, PrintWriter printWriter) {
        f141934a.mo69459a(th, printWriter);
    }

    /* renamed from: a */
    public static void m113761a(Throwable th, Throwable th2) {
        f141934a.mo69460a(th, th2);
    }
}
