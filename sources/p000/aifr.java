package p000;

import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnConnectionRequestParams;
import com.google.android.gms.nearby.internal.connection.OnStoppedAdvertisingParams;

/* renamed from: aifr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aifr extends dck implements aifs {
    public aifr() {
        super("com.google.android.gms.nearby.internal.connection.IAdvertisingCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            mo36570a((OnConnectionRequestParams) dcl.m8163a(parcel, OnConnectionRequestParams.CREATOR));
            return true;
        } else if (i != 3) {
            return false;
        } else {
            OnStoppedAdvertisingParams onStoppedAdvertisingParams = (OnStoppedAdvertisingParams) dcl.m8163a(parcel, OnStoppedAdvertisingParams.CREATOR);
            return true;
        }
    }
}
