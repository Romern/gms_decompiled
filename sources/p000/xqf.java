package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;

/* renamed from: xqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xqf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PublicKeyCredentialType[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return PublicKeyCredentialType.m23492a(parcel.readString());
        } catch (xqg e) {
            throw new RuntimeException(e);
        }
    }
}
