package p000;

import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnStartAdvertisingResultParams;

/* renamed from: aigt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aigt extends dck implements aigu {
    public aigt() {
        super("com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        mo36573a((OnStartAdvertisingResultParams) dcl.m8163a(parcel, OnStartAdvertisingResultParams.CREATOR));
        return true;
    }
}
