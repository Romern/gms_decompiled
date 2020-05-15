package p000;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: bakd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bakd {

    /* renamed from: a */
    public final Map f101106a = new HashMap();

    /* renamed from: b */
    public final Map f101107b = new HashMap();

    /* renamed from: c */
    public final Context f101108c;

    /* renamed from: d */
    public final Executor f101109d;

    /* renamed from: e */
    public final babr f101110e;

    /* renamed from: f */
    public final Object f101111f = new Object();

    /* renamed from: g */
    public bqgg f101112g;

    /* renamed from: h */
    private final accz f101113h;

    public bakd(accz accz, Context context, Executor executor, babr babr) {
        this.f101113h = accz;
        this.f101108c = context;
        this.f101109d = executor;
        this.f101110e = babr;
    }

    /* renamed from: a */
    public final bqgg mo55717a() {
        bqgg bqgg = this.f101112g;
        if (bqgg != null) {
            return bqgg;
        }
        bqgg a = bqdx.m112674a(this.f101113h.mo32705a(), new bakb(this), this.f101109d);
        this.f101112g = a;
        return a;
    }
}
