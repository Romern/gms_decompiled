package p000;

import android.util.Pair;

/* renamed from: baam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baam {

    /* renamed from: a */
    public static final bnic f100372a = bnic.m109491a(bqam.UNKNOWN_HOST_EXCEPTION, bqam.UNAVAILABLE, bqam.DEADLINE_EXCEEDED);

    /* renamed from: b */
    public final cayo f100373b;

    /* renamed from: c */
    public final baaw f100374c;

    /* renamed from: d */
    public final baqy f100375d;

    /* renamed from: e */
    public final bamc f100376e;

    /* renamed from: f */
    public final cayo f100377f;

    /* renamed from: g */
    public final cayo f100378g;

    /* renamed from: h */
    public volatile bygw f100379h;

    /* renamed from: i */
    public long f100380i = Long.MIN_VALUE;

    /* renamed from: j */
    private final babf f100381j;

    public baam(cayo cayo, baaw baaw, babf babf, bamc bamc, cayo cayo2, cayo cayo3) {
        this.f100373b = cayo;
        this.f100374c = baaw;
        this.f100381j = babf;
        this.f100376e = bamc;
        this.f100377f = cayo2;
        this.f100378g = cayo3;
        baqy baqy = new baqy(cayo);
        this.f100375d = baqy;
        baal baal = new baal(this);
        bqfb bqfb = bqfb.INSTANCE;
        synchronized (baqy.f101584g) {
            baqy.f101584g.add(Pair.create(baal, bqfb));
        }
    }

    /* renamed from: a */
    public final bqgg mo55547a() {
        bqgg bqgg;
        babf babf = this.f100381j;
        try {
            baax baax = new baax();
            babg babg = babf.f100412a;
            cazf.m127594a(babg);
            baax.f100404b = babg;
            if (baax.f100403a == null) {
                baax.f100403a = new baco();
            }
            cazf.m127595a(baax.f100404b, babg.class);
            bqgg = new babh(baax.f100404b).f100413a.mo75201b();
        } catch (RuntimeException e) {
            bqgg = bqga.m112777a((Throwable) e);
        }
        return bqdx.m112673a(bqdf.m112620a(bqgg, Exception.class, new baah(this), bqfb.INSTANCE), new baai(this), bqfb.INSTANCE);
    }
}
