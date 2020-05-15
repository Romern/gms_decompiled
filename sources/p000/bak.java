package p000;

import android.graphics.PointF;
import java.util.Collections;

/* renamed from: bak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bak extends azy {

    /* renamed from: e */
    private final PointF f2766e = new PointF();

    /* renamed from: f */
    private final azy f2767f;

    /* renamed from: g */
    private final azy f2768g;

    public bak(azy azy, azy azy2) {
        super(Collections.emptyList());
        this.f2767f = azy;
        this.f2768g = azy2;
        mo2938a(this.f2742c);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2936a(beo beo, float f) {
        return this.f2766e;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo2944f() {
        return this.f2766e;
    }

    /* renamed from: a */
    public final void mo2938a(float f) {
        this.f2767f.mo2938a(f);
        this.f2768g.mo2938a(f);
        this.f2766e.set(((Float) this.f2767f.mo2944f()).floatValue(), ((Float) this.f2768g.mo2944f()).floatValue());
        for (int i = 0; i < this.f2740a.size(); i++) {
            ((azx) this.f2740a.get(i)).mo2922a();
        }
    }
}
