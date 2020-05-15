package p000;

import java.util.List;

/* renamed from: phh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class phh implements ger {

    /* renamed from: a */
    final /* synthetic */ phj f39105a;

    public phh(phj phj) {
        this.f39105a = phj;
    }

    /* renamed from: a */
    public final void mo11744a(int i) {
        this.f39105a.f39114c.mo23670a("Receiving status changed: %d", Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo11745a(List list) {
        this.f39105a.f39115d.post(new phg(this, list));
    }
}
