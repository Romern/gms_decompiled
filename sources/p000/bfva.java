package p000;

import android.location.Location;

/* renamed from: bfva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfva extends adzy {

    /* renamed from: a */
    final /* synthetic */ bfvb f115385a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfva(bfvb bfvb, String str, String str2) {
        super(str, str2);
        this.f115385a = bfvb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9927a(Location location) {
        if (this.f115385a.mo62299d()) {
            this.f115385a.f115387d.mo62303a(location);
            bfvb bfvb = this.f115385a;
            int i = bfvb.f115386c + 1;
            bfvb.f115386c = i;
            bfvd bfvd = bfvb.f115387d;
            int i2 = bfvd.f115392q;
            if (i >= bfvd.f115399o || location.getAccuracy() <= ((float) this.f115385a.f115387d.f115400p)) {
                bfvd bfvd2 = this.f115385a.f115387d;
                bfvd2.mo62305a(bfvd2.f115397m);
            }
        }
    }
}
