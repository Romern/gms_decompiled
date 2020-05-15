package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.location.quake.DeepStillListener$1;

/* renamed from: bgpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgpi extends bgtb {

    /* renamed from: a */
    public static final /* synthetic */ int f117196a = 0;

    /* renamed from: b */
    private final Context f117197b;

    /* renamed from: c */
    private BroadcastReceiver f117198c;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public bgpi(Context context, bgsq bgsq) {
        super(bgsq);
        this.f117197b = context;
    }

    /* renamed from: a */
    public final int mo63067a() {
        return berb.f112107Z ? 3 : 2;
    }

    /* renamed from: b */
    public final synchronized void mo63068b() {
        if (this.f117198c == null) {
            this.f117198c = new DeepStillListener$1(this, "location");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.location.activity.DEEP_STILL_MODE_ENABLED");
            intentFilter.addAction("com.google.android.location.activity.DEEP_STILL_MODE_DISABLED");
            this.f117197b.registerReceiver(this.f117198c, intentFilter);
        }
    }

    /* renamed from: c */
    public final synchronized void mo63069c() {
        BroadcastReceiver broadcastReceiver = this.f117198c;
        if (broadcastReceiver != null) {
            this.f117197b.unregisterReceiver(broadcastReceiver);
            this.f117198c = null;
        }
    }
}
