package p000;

import android.content.Context;
import java.util.Random;

/* renamed from: aecg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aecg {

    /* renamed from: a */
    private final Random f63132a = new Random();

    /* renamed from: a */
    public final bqgg mo34033a(Context context, Class cls, String str, StackTraceElement[] stackTraceElementArr) {
        if (this.f63132a.nextDouble() >= cdnj.f181319a.mo6606a().mo77981D()) {
            return bqga.m112775a((Object) null);
        }
        aecf aecf = new aecf(String.format("Task timed out: %s:%s", cls.getName(), str));
        aecf.setStackTrace(stackTraceElementArr);
        rvq.m34532a(new aecd(aecf));
        rvk c = rvl.m34524c();
        c.f43750b = context;
        c.f43749a = bpun.TIMED_OUT_BACKGROUND_TASK_HANDLER;
        return new rvq().mo25209a(c.mo25198a()).f43775b;
    }
}
