package p000;

import android.os.Parcel;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

/* renamed from: hxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class hxp extends dck implements hxq {
    public hxp() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    /* renamed from: a */
    public void mo12788a(ProxyResponse proxyResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo12789a(String str) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo12788a((ProxyResponse) dcl.m8163a(parcel, ProxyResponse.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo12789a(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
