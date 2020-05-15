package p000;

import com.google.android.gms.common.Feature;

/* renamed from: rkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rkw extends rks {

    /* renamed from: b */
    public final rob f43198b;

    public rkw(rob rob, aucf aucf) {
        super(4, aucf);
        this.f43198b = rob;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24836a(rmc rmc, boolean z) {
    }

    /* renamed from: c */
    public final void mo24838c(rni rni) {
        roi roi = (roi) rni.f43371d.remove(this.f43198b);
        if (roi != null) {
            roi.f43438b.mo24972a(rni.f43369b, this.f43192a);
            roi.f43437a.f43435a.mo24967a();
            return;
        }
        this.f43192a.mo50393b((Object) false);
    }

    /* renamed from: a */
    public final Feature[] mo24833a(rni rni) {
        roi roi = (roi) rni.f43371d.get(this.f43198b);
        if (roi != null) {
            return roi.f43437a.f43436b;
        }
        return null;
    }
}
