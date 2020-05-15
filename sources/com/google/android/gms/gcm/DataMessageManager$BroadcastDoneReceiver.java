package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataMessageManager$BroadcastDoneReceiver extends aacn {

    /* renamed from: a */
    public final aucf f32769a = new aucf();

    /* renamed from: b */
    boolean f32770b = true;

    /* renamed from: c */
    private final aajt f32771c;

    /* renamed from: d */
    private final Intent f32772d;

    /* renamed from: e */
    private final blmp f32773e;

    /* renamed from: f */
    private final long f32774f;

    public DataMessageManager$BroadcastDoneReceiver(aajt aajt, Intent intent, blmp blmp, long j) {
        super("gcm");
        this.f32771c = aajt;
        this.f32772d = intent;
        this.f32773e = blmp;
        this.f32774f = j;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        int resultCode = getResultCode();
        aajt aajt = this.f32771c;
        Intent intent2 = this.f32772d;
        blmp blmp = this.f32773e;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f32774f;
        if (resultCode == -1) {
            GcmChimeraService.m24303a("Successful broadcast to %s (id=%s time=%dms priority=%s)", blmp.f126870e, blmp.f126873h, Long.valueOf(elapsedRealtime), aajt.m21354a(blmp.f126882q));
        } else if (resultCode != 0) {
            GcmChimeraService.m24303a("%s returned error code=%d to broadcast (id=%s time=%dms priority=%s)", blmp.f126870e, Integer.valueOf(resultCode), blmp.f126873h, Long.valueOf(elapsedRealtime), aajt.m21354a(blmp.f126882q));
            blmo blmo = (blmo) blmp.f126864r.mo74144da();
            aajt.m21356a(blmo, "broadcastError", String.valueOf(resultCode));
            aajt.m21356a(blmo, "cat", blmp.f126870e);
            aajt.m21356a(blmo, "pid", blmp.f126873h);
            if (blmo.f164950c) {
                blmo.mo74035c();
                blmo.f164950c = false;
            }
            blmp blmp2 = (blmp) blmo.f164949b;
            "com.google.android.gsf.gtalkservice".getClass();
            blmp2.f126866a |= 16;
            blmp2.f126870e = "com.google.android.gsf.gtalkservice";
            aajt.f28313p.mo17091a(blmo);
        } else {
            String valueOf = String.valueOf(intent2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
            sb.append("broadcast intent callback: result=CANCELLED for");
            sb.append(valueOf);
            Log.w("GCM", sb.toString());
            String str = intent2.getPackage();
            if (str == null) {
                GcmChimeraService.m24303a("Broadcast sent to %s missing Intent package (id=%s time=%dms priority=%s)", blmp.f126870e, blmp.f126873h, Long.valueOf(elapsedRealtime), aajt.m21354a(blmp.f126882q));
            } else {
                aamh a = aamh.m21513a(intent2.getPackage(), (int) blmp.f126876k);
                if (aajt.f28304g.mo17191b(a)) {
                    try {
                        if ((a.mo17016a(aajt.f28311n, 8192).flags & 2097152) != 0) {
                            GcmChimeraService.m24303a("Failed to broadcast to stopped app %s (id=%s time=%dms priority=%s)", blmp.f126870e, blmp.f126873h, Long.valueOf(elapsedRealtime), aajt.m21354a(blmp.f126882q));
                            aajt.f28308k.mo17031a(aamh.m21513a(blmp.f126870e, (int) blmp.f126876k), blmp.f126873h, blmp.f126882q, 7);
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                    }
                    GcmChimeraService.m24303a("No response to broadcast from %s (id=%s time=%dms priority=%s)", blmp.f126870e, blmp.f126873h, Long.valueOf(elapsedRealtime), aajt.m21354a(blmp.f126882q));
                } else if (aajt.f28304g.f28943b.mo17029e(a) == 2) {
                    GcmChimeraService.m24303a("Failed to broadcast to %s, it may be updating (id=%s time=%dms priority=%s)", str, blmp.f126873h, Long.valueOf(elapsedRealtime), aajt.m21354a(blmp.f126882q));
                    aajt.f28315r.mo16952a(blmp);
                } else {
                    GcmChimeraService.m24303a("Failed to broadcast to uninstalled app %s (id=%s time=%dms priority=%s)", str, blmp.f126873h, Long.valueOf(elapsedRealtime), aajt.m21354a(blmp.f126882q));
                    aajt.f28308k.mo17031a(a, blmp.f126873h, blmp.f126882q, 5);
                    aajt.mo16912a(a);
                }
            }
        }
        this.f32769a.mo50393b((Object) null);
        mo19552a();
    }

    /* renamed from: a */
    public final boolean mo19552a() {
        boolean z;
        synchronized (this) {
            if (this.f32770b) {
                this.f32771c.mo16910a();
                z = true;
            } else {
                z = false;
            }
            this.f32770b = false;
        }
        return z;
    }
}
