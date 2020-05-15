package p000;

import android.location.Location;
import com.google.android.gms.location.LocationResult;

/* renamed from: zju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zju extends aehy {

    /* renamed from: a */
    final zgh f55247a;

    /* renamed from: b */
    final aesj f55248b;

    /* renamed from: c */
    final /* synthetic */ zjv f55249c;

    public zju(zjv zjv, zgh zgh) {
        this.f55249c = zjv;
        bmxy.m108581a(zgh);
        this.f55247a = zgh;
        this.f55248b = new aesj(zjv.f55256f, this, zjv.f55255e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31178a() {
        this.f55248b.mo34511a(bngx.m109376e(), false);
    }

    /* renamed from: a */
    public final void mo9910a(LocationResult locationResult) {
        zjv zjv = this.f55249c;
        srn srn = zjv.f55250a;
        locationResult.f79358b.size();
        Location a = locationResult.mo43561a();
        if (a != null) {
            long a2 = zkb.m45638a(a);
            if (a2 != zjv.f55258h) {
                zjv.f55258h = a2;
                zjv.f55254d.mo9910a(locationResult);
            }
        }
    }
}
