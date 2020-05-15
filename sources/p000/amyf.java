package p000;

/* renamed from: amyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amyf extends amyd {

    /* renamed from: c */
    private static final bnhe f76371c;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b(alut.OK, 1);
        h.mo67695b(alut.UNKNOWN, 2);
        h.mo67695b(alut.INVALID_ARGUMENT, 3);
        h.mo67695b(alut.NOT_FOUND, 4);
        h.mo67695b(alut.ALREADY_EXISTS, 5);
        h.mo67695b(alut.ABORTED, 6);
        h.mo67695b(alut.INTERNAL, 7);
        f76371c = h.mo67618b();
    }

    public amyf() {
        super(3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final byte[] mo41557a() {
        amig.m62939a();
        return cfvk.f185780a.mo6606a().mo82981as().serializeToBytes();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final bnhe mo41558b() {
        return f76371c;
    }
}
