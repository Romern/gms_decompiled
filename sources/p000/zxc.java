package p000;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fonts.FontFetchResult;
import com.google.android.gms.fonts.FontMatchSpec;

/* renamed from: zxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zxc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FontFetchResult[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Status status = null;
        String str = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        FontMatchSpec fontMatchSpec = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                status = (Status) sed.m34998a(parcel, readInt, Status.CREATOR);
            } else if (a == 3) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) sed.m34998a(parcel, readInt, ParcelFileDescriptor.CREATOR);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                fontMatchSpec = (FontMatchSpec) sed.m34998a(parcel, readInt, FontMatchSpec.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new FontFetchResult(i, status, str, parcelFileDescriptor, fontMatchSpec);
    }
}
