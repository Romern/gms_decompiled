package p000;

import java.util.Set;

/* renamed from: bamj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bamj {

    /* renamed from: a */
    private final cayo f101261a;

    /* renamed from: b */
    private final cayo f101262b;

    public bamj(cayo cayo, cayo cayo2) {
        this.f101262b = cayo;
        this.f101261a = cayo2;
    }

    /* renamed from: a */
    public final void mo55758a() {
        for (bami bami : (Set) this.f101262b.mo16713a()) {
            try {
                bami.mo55757b();
            } catch (Exception e) {
                ((acdc) this.f101261a.mo16713a()).mo32707a("MDH database wipe out failed", e);
            }
        }
    }
}
