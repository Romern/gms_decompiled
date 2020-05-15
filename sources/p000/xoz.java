package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.UvmEntries;

/* renamed from: xoz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xoz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AuthenticationExtensionsClientOutputs[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        UvmEntries uvmEntries = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 1) {
                sed.m35002b(parcel, readInt);
            } else {
                uvmEntries = (UvmEntries) sed.m34998a(parcel, readInt, UvmEntries.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new AuthenticationExtensionsClientOutputs(uvmEntries);
    }
}
