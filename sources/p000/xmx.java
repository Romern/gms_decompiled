package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.credentialstore.KeyData;

/* renamed from: xmx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class xmx extends dck implements xmy {
    public xmx() {
        super("com.google.android.gms.fido.credentialstore.internal.IKeyDataCallbacks");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo29955a((Status) dcl.m8163a(parcel, Status.CREATOR), (KeyData) dcl.m8163a(parcel, KeyData.CREATOR));
        return true;
    }
}
