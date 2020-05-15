package p000;

/* renamed from: kjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class kjl {
    /* renamed from: a */
    public static kjk m17933a(kom kom) {
        return new kjk(kom);
    }

    /* renamed from: a */
    public abstract kom mo14516a();

    /* renamed from: b */
    public abstract bnic mo14517b();

    /* renamed from: b */
    public final kjl mo14531b(kpb... kpbArr) {
        kjk f = mo14534f();
        f.f24252a.mo67753b((Object[]) kpbArr);
        return f.mo14524a();
    }

    @Deprecated
    /* renamed from: c */
    public final bmxv mo14532c(kpb... kpbArr) {
        bnic b = mo14517b();
        bnpd c = bnpf.m110057c(b, bnic.m109496a((Object[]) kpbArr));
        if (c.isEmpty()) {
            return bmvz.f131120a;
        }
        if (c.size() == b.size()) {
            return bmxv.m108566b(this);
        }
        return bmxv.m108566b(mo14528a(c));
    }

    /* renamed from: c */
    public abstract lbc mo14518c();

    /* renamed from: d */
    public abstract int mo14519d();

    /* renamed from: d */
    public final kjl mo14533d(kpb... kpbArr) {
        bnic b = mo14517b();
        bnpd c = bnpf.m110057c(b, bnic.m109496a((Object[]) kpbArr));
        return c.size() != b.size() ? mo14528a(c) : this;
    }

    /* renamed from: e */
    public abstract bnhe mo14520e();

    /* renamed from: f */
    public final kjk mo14534f() {
        kjk a = m17933a(mo14516a());
        a.mo14525a(mo14517b());
        a.mo14526a(mo14518c());
        a.f24254c = mo14519d();
        for (kka kka : mo14520e().values()) {
            a.f24253b.mo67695b(Integer.valueOf(kka.mo14555b()), kka);
        }
        return a;
    }

    /* renamed from: a */
    public final kjl mo14528a(Iterable iterable) {
        kjk f = mo14534f();
        f.mo14527b(iterable);
        return f.mo14524a();
    }

    /* renamed from: a */
    public final kjl mo14529a(kpb... kpbArr) {
        kjk f = mo14534f();
        bnia j = bnic.m109500j();
        j.mo67753b((Object[]) kpbArr);
        f.f24252a = j;
        return f.mo14524a();
    }

    /* renamed from: a */
    public final boolean mo14530a(kpb kpb) {
        return mo14517b().contains(kpb);
    }
}
