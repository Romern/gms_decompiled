package p000;

import java.io.IOException;

/* renamed from: cavp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cavp extends cavc {

    /* renamed from: b */
    final /* synthetic */ int f176162b;

    /* renamed from: c */
    final /* synthetic */ cavl f176163c;

    /* renamed from: d */
    final /* synthetic */ cawc f176164d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cavp(cawc cawc, String str, Object[] objArr, int i, cavl cavl) {
        super(str, objArr);
        this.f176164d = cawc;
        this.f176162b = i;
        this.f176163c = cavl;
    }

    /* renamed from: a */
    public final void mo74949a() {
        try {
            this.f176164d.mo74992b(this.f176162b, this.f176163c);
        } catch (IOException e) {
        }
    }
}
