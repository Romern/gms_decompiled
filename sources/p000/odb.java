package p000;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: odb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class odb {

    /* renamed from: a */
    public bpcx f37210a;

    /* renamed from: b */
    final /* synthetic */ odc f37211b;

    /* renamed from: c */
    private final bpcy f37212c;

    /* renamed from: d */
    private final bmza f37213d;

    public odb(odc odc, bpcy bpcy) {
        this.f37211b = odc;
        this.f37212c = bpcy;
        bmza a = bmza.m108657a(odc.f37215b);
        a.mo66929c();
        this.f37213d = a;
    }

    /* renamed from: a */
    public final synchronized bpcx mo21984a() {
        if (!mo21985b()) {
            bpcy bpcy = this.f37212c;
            odc odc = odc.f37214a;
            bxvd da = bpcx.f135883d.mo74144da();
            int i = bpcy.f135894f;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpcx bpcx = (bpcx) da.f164949b;
            bpcx.f135885a |= 1;
            bpcx.f135886b = i;
            bpds a = odj.m28480a(UUID.randomUUID());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpcx bpcx2 = (bpcx) da.f164949b;
            a.getClass();
            bpcx2.f135887c = a;
            bpcx2.f135885a |= 2;
            this.f37210a = (bpcx) da.mo74062i();
        }
        bmza bmza = this.f37213d;
        bmza.mo66929c();
        bmza.mo66930d();
        return this.f37210a;
    }

    /* renamed from: b */
    public final boolean mo21985b() {
        return this.f37213d.mo66928a(TimeUnit.NANOSECONDS) < this.f37211b.f37216c && this.f37213d.f131251a;
    }
}
