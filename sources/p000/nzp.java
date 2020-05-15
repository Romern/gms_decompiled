package p000;

import android.app.ActivityManager;

/* renamed from: nzp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nzp {

    /* renamed from: a */
    private static final bnic f37015a = bnic.m109491a(aymd.BUILD_TYPE_INTERNAL, aymd.BUILD_TYPE_PRODLMP, aymd.BUILD_TYPE_PRODMNC);

    /* renamed from: a */
    public static boolean m28234a() {
        return !ActivityManager.isRunningInTestHarness() && f37015a.contains(stu.m36327m());
    }
}
