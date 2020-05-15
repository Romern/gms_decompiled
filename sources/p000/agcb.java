package p000;

import android.os.Parcel;
import com.google.android.gms.mdns.MdnsServiceInfo;
import java.util.List;

/* renamed from: agcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agcb extends dck implements agcc {

    /* renamed from: a */
    private final rod f65206a;

    public agcb() {
        super("com.google.android.gms.mdns.internal.IMdnsServiceBrowserListener");
    }

    /* renamed from: a */
    public final void mo35214a() {
        this.f65206a.mo24968a(new agch());
    }

    /* renamed from: b */
    public final void mo35220b(MdnsServiceInfo mdnsServiceInfo) {
        this.f65206a.mo24968a(new agce(mdnsServiceInfo));
    }

    /* renamed from: a */
    public final void mo35215a(int i) {
        this.f65206a.mo24968a(new agcg(i));
    }

    public agcb(rod rod) {
        super("com.google.android.gms.mdns.internal.IMdnsServiceBrowserListener");
        this.f65206a = rod;
    }

    /* renamed from: a */
    public final void mo35216a(int i, int i2) {
        this.f65206a.mo24968a(new agcj(i, i2));
    }

    /* renamed from: a */
    public final void mo35217a(MdnsServiceInfo mdnsServiceInfo) {
        this.f65206a.mo24968a(new agcd(mdnsServiceInfo));
    }

    /* renamed from: a */
    public final void mo35218a(String str) {
        this.f65206a.mo24968a(new agcf(str));
    }

    /* renamed from: a */
    public final void mo35219a(List list, int i) {
        this.f65206a.mo24968a(new agci(list, i));
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                mo35217a((MdnsServiceInfo) dcl.m8163a(parcel, MdnsServiceInfo.CREATOR));
                return true;
            case 2:
                mo35220b((MdnsServiceInfo) dcl.m8163a(parcel, MdnsServiceInfo.CREATOR));
                return true;
            case 3:
                mo35218a(parcel.readString());
                return true;
            case 4:
                mo35215a(parcel.readInt());
                return true;
            case 5:
                mo35214a();
                return true;
            case 6:
                mo35219a(parcel.createStringArrayList(), parcel.readInt());
                return true;
            case 7:
                mo35216a(parcel.readInt(), parcel.readInt());
                return true;
            default:
                return false;
        }
    }
}
