package p000;

import android.net.TrafficStats;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.service.HttpProxyChimeraService;

/* renamed from: afis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afis extends dck implements IInterface {

    /* renamed from: a */
    final /* synthetic */ HttpProxyChimeraService f64249a;

    public afis() {
        super("com.google.android.gms.maps.service.IHttpProxyService");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
        try {
            bwbl.m121723a(this.f64249a.getApplicationContext(), 4354);
            Bundle a = this.f64249a.mo43903a(bundle);
            TrafficStats.clearThreadStatsTag();
            parcel2.writeNoException();
            dcl.m8169b(parcel2, a);
            return true;
        } catch (Throwable th) {
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public afis(HttpProxyChimeraService httpProxyChimeraService) {
        super("com.google.android.gms.maps.service.IHttpProxyService");
        this.f64249a = httpProxyChimeraService;
    }
}
