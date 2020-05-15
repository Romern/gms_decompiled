package p000;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: sph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sph extends spe {

    /* renamed from: f */
    public PendingIntent f44926f;

    /* renamed from: g */
    final /* synthetic */ spj f44927g;

    /* renamed from: h */
    private BroadcastReceiver f44928h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sph(spj spj, spb spb, String str, int i) {
        super(spj, spb, str, i);
        this.f44927g = spj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25925a() {
        super.mo25925a();
        this.f44926f.cancel();
        this.f44926f = null;
        this.f44927g.f44921b.unregisterReceiver(this.f44928h);
        this.f44928h = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25926a(Handler handler) {
        String a = spj.m35833a(this.f44915b);
        this.f44926f = PendingIntent.getBroadcast(this.f44927g.f44921b, 0, new Intent(a).setPackage(this.f44927g.f44921b.getPackageName()), 134217728);
        this.f44928h = new spg(this);
        this.f44927g.f44921b.registerReceiver(this.f44928h, new IntentFilter(a), null, handler);
    }
}
