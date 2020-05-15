package p000;

import java.util.UUID;

/* renamed from: blit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class blit extends blij implements blip {

    /* renamed from: a */
    private final Exception f126639a;

    public blit(String str) {
        super(str, UUID.randomUUID());
        if (bljh.m107251a()) {
            this.f126639a = new blio();
        } else {
            this.f126639a = blis.f126637a;
        }
    }

    /* renamed from: a */
    public final bljc mo66578a(bljd bljd) {
        return bljc.m107233a(2);
    }

    /* renamed from: a */
    public final void mo66581a(int i) {
    }

    /* renamed from: a */
    public final void mo66582a(boolean z) {
    }

    /* renamed from: d */
    public final Exception mo66577d() {
        return this.f126639a;
    }

    /* renamed from: e */
    public final boolean mo66583e() {
        return false;
    }

    /* renamed from: a */
    public final bljg mo66580a(String str, bljf bljf) {
        return new blit(str, this);
    }

    public blit(String str, blip blip) {
        super(str, blip);
        this.f126639a = blip.mo66577d();
    }
}
