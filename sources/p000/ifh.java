package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.authzen.AuthzenPublicKey;

/* renamed from: ifh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ifh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AuthzenPublicKey[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                bArr = sed.m35023t(parcel, readInt);
            } else if (a != 10000) {
                sed.m35002b(parcel, readInt);
            } else {
                i = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new AuthzenPublicKey(i, bArr);
    }
}
