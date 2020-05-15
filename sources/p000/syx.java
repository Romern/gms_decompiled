package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.constellation.PhoneNumberInfo;
import com.google.android.gms.constellation.VerifyPhoneNumberResponse;
import java.util.List;

/* renamed from: syx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class syx extends dck implements syy {
    public syx() {
        super("com.google.android.gms.constellation.internal.IConstellationCallbacks");
    }

    /* renamed from: a */
    public final void mo26248a(Status status, VerifyPhoneNumberResponse verifyPhoneNumberResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo26221a(Status status, List list) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo26221a((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.createTypedArrayList(PhoneNumberInfo.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo26248a((Status) dcl.m8163a(parcel, Status.CREATOR), (VerifyPhoneNumberResponse) dcl.m8163a(parcel, VerifyPhoneNumberResponse.CREATOR));
        }
        return true;
    }
}
