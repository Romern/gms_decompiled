package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import java.util.HashSet;

/* renamed from: arud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arud implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Assertion[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    bArr = sed.m35023t(parcel, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    bArr2 = sed.m35023t(parcel, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    bArr3 = sed.m35023t(parcel, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    bArr4 = sed.m35023t(parcel, readInt);
                    hashSet.add(6);
                    break;
                case 7:
                    i = sed.m35010g(parcel, readInt);
                    hashSet.add(7);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Assertion(hashSet, str, bArr, bArr2, bArr3, bArr4, i);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
