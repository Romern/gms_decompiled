package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.api.model.MfaInfo;

/* renamed from: brqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brqt implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MfaInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 2) {
                str2 = sed.m35020q(parcel, readInt);
            } else if (a == 3) {
                str3 = sed.m35020q(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                j = sed.m35012i(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new MfaInfo(str, str2, str3, j);
    }
}
