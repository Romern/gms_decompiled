package p000;

/* renamed from: bajs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bajs extends cazu {

    /* renamed from: b */
    private final cazn f101073b;

    /* renamed from: c */
    private final cazn f101074c;

    public bajs(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2) {
        super(cijl2, cbag.m127657a(bajs.class), cijl);
        this.f101073b = cbac.m127643a(cazn);
        this.f101074c = cbac.m127643a(cazn2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return this.f101073b.mo75201b();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        bykc bykc = (bykc) obj;
        cazn cazn = this.f101074c;
        bxwc bxwc = bykc.f166737d;
        int size = bxwc.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            byka a = byka.m124893a(((bykb) bxwc.get(i2)).f166730c);
            if (a == null) {
                a = byka.UNKNOWN;
            }
            if (a == byka.DELTA_FAILURE) {
                i++;
            }
        }
        if (i <= 0) {
            return bqga.m112775a(bykc);
        }
        if (i == bykc.f166737d.size()) {
            return cazn.mo75201b();
        }
        throw new bapa("If server fails to decode deltas, it should reject all changes with DELTA_FAILURE!");
    }
}
