package p000;

import java.io.IOException;

/* renamed from: cavr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cavr extends cavc {

    /* renamed from: b */
    final /* synthetic */ int f176168b;

    /* renamed from: c */
    final /* synthetic */ int f176169c;

    /* renamed from: d */
    final /* synthetic */ cawc f176170d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cavr(cawc cawc, String str, Object[] objArr, int i, int i2) {
        super(str, objArr);
        this.f176170d = cawc;
        this.f176168b = i;
        this.f176169c = i2;
    }

    /* renamed from: a */
    public final void mo74949a() {
        try {
            cawc cawc = this.f176170d;
            int i = this.f176168b;
            int i2 = this.f176169c;
            synchronized (cawc.f176211q) {
                cawc.f176211q.mo74974a(i, i2);
            }
        } catch (IOException e) {
        }
    }
}
