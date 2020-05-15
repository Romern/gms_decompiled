package com.google.android.gms.mdm.receivers;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LockscreenChimeraReceiver extends IntentOperation {

    /* renamed from: a */
    private static boolean f80051a;

    /* renamed from: a */
    public static synchronized void m67198a(boolean z) {
        synchronized (LockscreenChimeraReceiver.class) {
            f80051a = z;
        }
    }

    /* renamed from: a */
    public static synchronized boolean m67199a() {
        boolean z;
        synchronized (LockscreenChimeraReceiver.class) {
            z = f80051a;
        }
        return z;
    }

    public final void onHandleIntent(Intent intent) {
        if (m67199a() && "android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            afzq.m53768e(this);
            afzq.m53769f(this);
            afyu.m53686a(new cake[]{cake.SCREEN_UNLOCKED}, null, null, null, (String) afzd.f64998l.mo10351a(), null, afzw.m53778a(this), null, null, null);
            m67198a(false);
        }
    }
}
