package p000;

import android.os.Parcel;
import com.google.android.gms.beacon.BleSighting;
import java.util.List;

/* renamed from: nfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nfu extends dck implements nfv {

    /* renamed from: a */
    final rod f35466a;

    public nfu() {
        super("com.google.android.gms.beacon.internal.IBleListener");
    }

    /* renamed from: a */
    public final void mo20572a(int i) {
        this.f35466a.mo24968a(new nfq(i));
    }

    /* renamed from: a */
    public final void mo20573a(int i, BleSighting bleSighting) {
        this.f35466a.mo24968a(new nfo(i, bleSighting));
    }

    public nfu(rod rod) {
        super("com.google.android.gms.beacon.internal.IBleListener");
        this.f35466a = rod;
    }

    /* renamed from: a */
    public final void mo20574a(String str) {
        this.f35466a.mo24968a(new nfr(str));
    }

    /* renamed from: a */
    public final void mo20575a(List list) {
        this.f35466a.mo24968a(new nfp(list));
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            mo20573a(parcel.readInt(), (BleSighting) dcl.m8163a(parcel, BleSighting.CREATOR));
            return true;
        } else if (i == 3) {
            mo20575a(parcel.createTypedArrayList(BleSighting.CREATOR));
            return true;
        } else if (i == 4) {
            mo20574a(parcel.readString());
            return true;
        } else if (i != 5) {
            return false;
        } else {
            mo20572a(parcel.readInt());
            return true;
        }
    }
}
