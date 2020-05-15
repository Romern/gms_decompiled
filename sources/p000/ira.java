package p000;

import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.ExportedSymmetricKey;
import com.google.android.gms.common.api.Status;

/* renamed from: ira */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ira extends dck implements irb {
    public ira() {
        super("com.google.android.gms.auth.cryptauth.internal.IExportedSymmetricKeyCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo13174a((ExportedSymmetricKey) dcl.m8163a(parcel, ExportedSymmetricKey.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo13175a((Status) dcl.m8163a(parcel, Status.CREATOR));
        }
        return true;
    }
}
