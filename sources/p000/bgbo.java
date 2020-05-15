package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import com.google.android.location.internal.server.C1681x8ae236e2;

/* renamed from: bgbo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgbo extends bgbp {

    /* renamed from: a */
    private final bugr f116000a;

    /* renamed from: b */
    private final Handler f116001b;

    /* renamed from: c */
    private final bgbn f116002c;

    /* renamed from: d */
    private BroadcastReceiver f116003d;

    public bgbo(Context context, bugr bugr, Handler handler) {
        this.f116000a = bugr;
        this.f116001b = handler;
        this.f116002c = new bgbn(context);
    }

    /* renamed from: a */
    public final void mo62618a() {
        if (this.f116003d == null) {
            bgbn bgbn = this.f116002c;
            Context context = bgbn.f115999a;
            this.f116000a.mo72646b(bgbn, this.f116001b);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("c.g.a.l.i.s.CacheSeverContextHubBridge");
            C1681x8ae236e2 cacheServerContextHubBridge$RealCacheServerContextHubBridge$GlsCacheResponseReceiver = new C1681x8ae236e2(this.f116000a);
            this.f116003d = cacheServerContextHubBridge$RealCacheServerContextHubBridge$GlsCacheResponseReceiver;
            context.registerReceiver(cacheServerContextHubBridge$RealCacheServerContextHubBridge$GlsCacheResponseReceiver, intentFilter);
        }
    }

    /* renamed from: b */
    public final void mo62619b() {
        if (this.f116003d != null) {
            bgbn bgbn = this.f116002c;
            Context context = bgbn.f115999a;
            this.f116000a.mo72645b(bgbn);
            context.unregisterReceiver(this.f116003d);
            this.f116003d = null;
        }
    }
}
