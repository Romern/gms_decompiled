package p000;

import java.util.concurrent.Executor;

/* renamed from: bbhp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbhp implements bbfp {

    /* renamed from: a */
    public final Executor f102662a;

    /* renamed from: b */
    public final bmzi f102663b;

    /* renamed from: c */
    public final bmzi f102664c;

    /* renamed from: d */
    public final bbjn f102665d;

    /* renamed from: e */
    public final String f102666e;

    /* renamed from: f */
    public final boolean f102667f;

    /* renamed from: g */
    public final bbhh f102668g;

    /* renamed from: h */
    private final bbho f102669h = new bbho(this);

    public bbhp(bbhl bbhl) {
        this.f102662a = bbhl.f102652a;
        this.f102663b = bbhl.f102653b;
        this.f102664c = bbhl.f102654c;
        this.f102668g = bbhl.f102657f;
        this.f102665d = bbhl.f102655d;
        this.f102666e = bbhl.f102656e;
        this.f102667f = true;
        bmxy.m108581a(this.f102662a);
        bmxy.m108581a(this.f102663b);
        bmxy.m108581a(this.f102664c);
        bmxy.m108581a(this.f102668g);
        bmxy.m108581a(this.f102666e);
    }

    /* renamed from: a */
    public final bqgg mo56143a(Iterable iterable) {
        bbhi bbhi = new bbhi();
        bbhm bbhm = new bbhm(this, iterable);
        cazf.m127594a(bbhm);
        bbhi.f102634b = bbhm;
        bbho bbho = this.f102669h;
        cazf.m127594a(bbho);
        bbhi.f102633a = bbho;
        cazf.m127595a(bbhi.f102633a, bbho.class);
        cazf.m127595a(bbhi.f102634b, bbhm.class);
        return new bbhj(bbhi.f102633a, bbhi.f102634b).f102635a.mo75201b();
    }

    /* renamed from: a */
    public final bqgg mo56101a(Iterable iterable, bbfu bbfu) {
        throw null;
    }
}
