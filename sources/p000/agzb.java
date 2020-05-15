package p000;

import android.content.Context;
import android.os.Build;
import java.util.HashSet;
import java.util.Set;

/* renamed from: agzb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agzb {

    /* renamed from: a */
    private final wwr f66899a;

    public agzb(Context context) {
        this.f66899a = new wwr(context);
    }

    /* renamed from: a */
    private static void m55316a(Throwable th, StringBuilder sb, Set set, String str) {
        if (th != null && !set.contains(th)) {
            set.add(th);
            if (str != null) {
                sb.append(str);
            }
            sb.append(th.getClass().getName());
            sb.append(':');
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append("\n\tat ");
                sb.append(stackTraceElement);
            }
            int i = Build.VERSION.SDK_INT;
            for (Throwable th2 : bqye.f141934a.mo69461a(th)) {
                m55316a(th2, sb, set, "\nSuppressed: ");
            }
            if (th.getCause() != null) {
                m55316a(th.getCause(), sb, set, "\nCaused by: ");
            }
        }
    }

    /* renamed from: a */
    public final void mo36211a(String str, Throwable th) {
        if (agqg.m54837D().booleanValue()) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace.length != 0) {
                StringBuilder sb = new StringBuilder();
                m55316a(th, sb, new HashSet(), null);
                StackTraceElement stackTraceElement = stackTrace[0];
                String fileName = stackTraceElement.getFileName() == null ? "unknown source" : stackTraceElement.getFileName();
                wwv wwv = new wwv();
                wwv.mo29499a(th.getClass().getName());
                wwv.mo29500b(sb.toString());
                wwv.mo29501c(stackTraceElement.getClassName());
                wwv.mo29502d(fileName);
                wwv.mo29498a(stackTraceElement.getLineNumber());
                wwv.mo29503e(stackTraceElement.getMethodName());
                wwv.f51512j = "com.google.android.gms.mobiledataplan";
                wwv.f51499d = "com.google.android.gms.mobiledataplan.SILENT_FEEDBACK";
                wwv.mo29496b();
                wwv.f51498c = str;
                this.f66899a.mo29488b(wwv.mo29490a());
            }
        }
    }
}
