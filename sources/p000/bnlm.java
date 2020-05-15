package p000;

/* renamed from: bnlm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnlm implements bnky {

    /* renamed from: a */
    public static final bnlm f131811a = new bnlm();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bnkx mo67967a(bnlc bnlc, bnkx bnkx, bnkx bnkx2) {
        bnlo bnlo = (bnlo) bnlc;
        bnln bnln = (bnln) bnkx;
        bnln bnln2 = (bnln) bnkx2;
        if (bnln.get() == null) {
            return null;
        }
        bnln bnln3 = new bnln(bnlo.f131813h, bnln.get(), bnln.f131783a, bnln2);
        bnln3.f131812c = bnln.f131812c;
        return bnln3;
    }

    /* renamed from: b */
    public final bnle mo67972b() {
        return bnle.STRONG;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bnkx mo67968a(bnlc bnlc, Object obj, int i, bnkx bnkx) {
        return new bnln(((bnlo) bnlc).f131813h, obj, i, (bnln) bnkx);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bnlc mo67969a(bnlw bnlw, int i) {
        return new bnlo(bnlw, i);
    }

    /* renamed from: a */
    public final bnle mo67970a() {
        return bnle.WEAK;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo67971a(bnlc bnlc, bnkx bnkx, Object obj) {
        bnlo bnlo = (bnlo) bnlc;
        ((bnln) bnkx).f131812c = obj;
    }
}
