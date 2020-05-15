package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.Executor;

/* renamed from: bath */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bath extends BroadcastReceiver {

    /* renamed from: a */
    public final azzo f101696a;

    /* renamed from: b */
    public final IntentFilter f101697b;

    /* renamed from: c */
    private final batc f101698c;

    /* renamed from: d */
    private final batd f101699d;

    /* renamed from: e */
    private final batf f101700e;

    /* renamed from: f */
    private final Executor f101701f;

    public bath(batc batc, azzo azzo, batd batd, batf batf, Executor executor) {
        this.f101698c = batc;
        this.f101696a = azzo;
        this.f101697b = new IntentFilter(((bata) batd).f101690a);
        this.f101699d = batd;
        this.f101700e = batf;
        this.f101701f = executor;
    }

    public final void onReceive(Context context, Intent intent) {
        bqgg bqgg;
        if (intent.getAction().equals(((bata) this.f101699d).f101690a)) {
            batc batc = this.f101698c;
            batd batd = this.f101699d;
            batf batf = this.f101700e;
            synchronized (((basl) batc).f101661b) {
                if (!((basl) batc).f101661b.contains(batd)) {
                    bqgg = bqga.m112775a((Object) false);
                } else {
                    bqgg = bqdx.m112673a(((basl) batc).mo55936a(batd, batf), bask.f101659a, bqfb.INSTANCE);
                }
            }
            bqga.m112781a(bqgg, new batg(this), this.f101701f);
        }
    }
}
