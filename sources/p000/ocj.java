package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: ocj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ocj {

    /* renamed from: d */
    private static final long f37167d = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: e */
    private static final IntentFilter f37168e = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: a */
    public final Context f37169a;

    /* renamed from: b */
    public int f37170b = -1;

    /* renamed from: c */
    public bmxv f37171c = bmvz.f131120a;

    /* renamed from: f */
    private long f37172f = -1;

    public ocj(Context context) {
        this.f37169a = context;
    }

    /* renamed from: a */
    public final void mo21964a() {
        bmxv bmxv;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f37172f > f37167d) {
            this.f37172f = elapsedRealtime;
            Intent registerReceiver = this.f37169a.registerReceiver(null, f37168e);
            int i = -1;
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra("level", -1);
                int intExtra2 = registerReceiver.getIntExtra("scale", -1);
                int intExtra3 = registerReceiver.getIntExtra("temperature", -1);
                if (intExtra >= 0 && intExtra2 >= 0) {
                    i = (intExtra * (100000 / intExtra2)) / 1000;
                }
                this.f37170b = i;
                if (intExtra3 >= 0 && intExtra3 <= 1000) {
                    bmxv = bmxv.m108566b(Integer.valueOf(intExtra3));
                } else {
                    bmxv = bmvz.f131120a;
                }
                this.f37171c = bmxv;
                return;
            }
            this.f37170b = -1;
            this.f37171c = bmvz.f131120a;
        }
    }
}
