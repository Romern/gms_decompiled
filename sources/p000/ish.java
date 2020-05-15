package p000;

import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.SignedBlob;
import com.google.android.gms.common.api.Status;

/* renamed from: ish */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ish extends dck implements isi {
    public ish() {
        super("com.google.android.gms.auth.cryptauth.internal.ISignedResultCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo13176a((SignedBlob) dcl.m8163a(parcel, SignedBlob.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo13177a((Status) dcl.m8163a(parcel, Status.CREATOR));
        }
        return true;
    }
}
