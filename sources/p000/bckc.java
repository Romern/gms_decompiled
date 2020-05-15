package p000;

import android.content.Context;

/* renamed from: bckc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bckc {

    /* renamed from: a */
    static final chtn f104364a = chtn.m149536a("google.internal.communications.instantmessaging.v1.tachyonerror-bin", new bckb());

    /* renamed from: b */
    private static bckc f104365b = null;

    /* renamed from: a */
    public static bckc m89179a() {
        if (f104365b == null) {
            f104365b = new bckc();
        }
        return f104365b;
    }

    /* renamed from: a */
    public final int mo56953a(Context context, Throwable th) {
        if (!bbqk.m88407a(context)) {
            return 6;
        }
        if (!(th.getCause() instanceof gid)) {
            return !(th instanceof bcjr) ? 9 : 8;
        }
        return 7;
    }
}
