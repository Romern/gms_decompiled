package p000;

import android.os.Build;
import java.util.ArrayList;

/* renamed from: blkd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blkd extends RuntimeException {
    public blkd(String str, StackTraceElement[] stackTraceElementArr) {
        super(str, null);
        setStackTrace(stackTraceElementArr);
    }

    /* renamed from: a */
    public static void m107278a(Throwable th) {
        int i = Build.VERSION.SDK_INT;
        ArrayList arrayList = new ArrayList();
        for (bljg b = blkh.m107292b(); b != null; b = b.mo66573a()) {
            arrayList.add(new StackTraceElement("tk_trace", b.mo66575c(), null, 0));
        }
        bqye.m113761a(th, new blkd("", (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0])));
    }

    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
