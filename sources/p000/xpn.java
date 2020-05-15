package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;

/* renamed from: xpn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xpn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new COSEAlgorithmIdentifier[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return COSEAlgorithmIdentifier.m23472a(parcel.readInt());
        } catch (xpo e) {
            throw new RuntimeException(e);
        }
    }
}
