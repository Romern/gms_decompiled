package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.location.quake.ScreenStateListener$1;

/* renamed from: bgqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgqs extends bgtb implements bgrq {

    /* renamed from: b */
    public static final /* synthetic */ int f117305b = 0;

    /* renamed from: a */
    public boolean f117306a;

    /* renamed from: c */
    private final Context f117307c;

    /* renamed from: d */
    private BroadcastReceiver f117308d;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public bgqs(Context context, bgsq bgsq) {
        super(bgsq);
        this.f117307c = context;
    }

    /* renamed from: a */
    public final int mo63067a() {
        return 3;
    }

    /* renamed from: b */
    public final synchronized void mo63068b() {
        this.f117306a = false;
        if (this.f117308d == null) {
            this.f117308d = new ScreenStateListener$1(this, "location");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            this.f117307c.registerReceiver(this.f117308d, intentFilter);
        }
    }

    /* renamed from: c */
    public final synchronized void mo63069c() {
        BroadcastReceiver broadcastReceiver = this.f117308d;
        if (broadcastReceiver != null) {
            this.f117307c.unregisterReceiver(broadcastReceiver);
            this.f117308d = null;
        }
    }

    /* renamed from: d */
    public final int mo63109d() {
        return this.f117306a ? 2 : 1;
    }
}
