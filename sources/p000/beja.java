package p000;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* renamed from: beja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beja implements bejx {

    /* renamed from: a */
    public static final TimeUnit f111626a = TimeUnit.MILLISECONDS;

    /* renamed from: b */
    public final Context f111627b;

    /* renamed from: c */
    public final String f111628c;

    /* renamed from: d */
    public final Handler f111629d;

    /* renamed from: e */
    public final bmzi f111630e;

    /* renamed from: f */
    public final TimeUnit f111631f;

    /* renamed from: g */
    public final bqgk f111632g;

    /* renamed from: h */
    public final beis f111633h;

    /* renamed from: i */
    private final bqeh f111634i;

    public beja(beix beix) {
        this.f111627b = beix.f111615a;
        this.f111634i = beix.f111616b;
        this.f111628c = beix.f111617c;
        this.f111629d = beix.f111618d;
        this.f111630e = beix.f111619e;
        this.f111631f = beix.f111620f;
        this.f111632g = beix.f111621g;
        this.f111633h = beix.f111622h;
    }

    /* renamed from: a */
    public static beix m95159a() {
        return new beix();
    }

    /* renamed from: a */
    public final bqgg mo60742a(bqgg bqgg) {
        bqgg a = bqdx.m112674a(bqgg, this.f111634i, bqfb.INSTANCE);
        return bqga.m112786c(bqgg, a).mo69214a(new beit(this, bqgg, a), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo60743a(bqgg bqgg, Runnable runnable) {
        return bqdx.m112673a(bqgg, new beiu(this, runnable), bqfb.INSTANCE);
    }
}
