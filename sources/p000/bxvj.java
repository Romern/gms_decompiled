package p000;

/* renamed from: bxvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxvj extends bxuq {

    /* renamed from: a */
    final bxxc f164955a;

    /* renamed from: b */
    public final Object f164956b;

    /* renamed from: c */
    final bxxc f164957c;

    /* renamed from: d */
    public final bxvi f164958d;

    public bxvj(bxxc bxxc, Object obj, bxxc bxxc2, bxvi bxvi) {
        if (bxxc == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        } else if (bxvi.f164954b == bxzf.MESSAGE && bxxc2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        } else {
            this.f164955a = bxxc;
            this.f164956b = obj;
            this.f164957c = bxxc2;
            this.f164958d = bxvi;
        }
    }

    /* renamed from: a */
    public final int mo73900a() {
        return this.f164958d.f164953a;
    }

    /* renamed from: b */
    public final bxzf mo74140b() {
        return this.f164958d.f164954b;
    }

    /* renamed from: a */
    public final void mo74139a(Object obj) {
        if (this.f164958d.mo74137a() == bxzg.ENUM) {
            ((Integer) obj).intValue();
            throw null;
        }
    }
}
