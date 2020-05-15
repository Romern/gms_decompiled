package p000;

import android.content.Context;

/* renamed from: lwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lwv {

    /* renamed from: a */
    public final lwp f33129a;

    /* renamed from: b */
    public final lww f33130b;

    private lwv(lwp lwp, lww lww) {
        this.f33129a = lwp;
        this.f33130b = lww;
    }

    /* renamed from: a */
    public static lwv m24579a(Context context, lwp lwp) {
        return new lwv(lwp, lww.m24581a(context));
    }

    /* renamed from: a */
    public static void m24580a(String str) {
        sdo.m34975b(!str.isEmpty(), "applicationName must not be empty string.");
        sdo.m34975b(!str.contains("/"), "applicationName must not contain slash.");
    }
}
