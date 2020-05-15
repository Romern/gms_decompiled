package p000;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

/* renamed from: civz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class civz {
    /* renamed from: a */
    public static void m151064a(Throwable th) {
        Throwable th2 = th;
        while (th2 != null) {
            if (!(th2 instanceof UnknownHostException)) {
                th2 = th2.getCause();
            } else {
                return;
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        bqye.m113760a(th, printWriter);
        printWriter.flush();
        stringWriter.toString();
    }
}
