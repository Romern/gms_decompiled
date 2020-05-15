package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.internal.PlusSession;

/* renamed from: anwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anwl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlusSession[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        PlusCommonExtras plusCommonExtras = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a != 1000) {
                switch (a) {
                    case 1:
                        str = sed.m35020q(parcel, readInt);
                        continue;
                    case 2:
                        strArr = sed.m34989A(parcel, readInt);
                        continue;
                    case 3:
                        strArr2 = sed.m34989A(parcel, readInt);
                        continue;
                    case 4:
                        strArr3 = sed.m34989A(parcel, readInt);
                        continue;
                    case 5:
                        str2 = sed.m35020q(parcel, readInt);
                        continue;
                    case 6:
                        str3 = sed.m35020q(parcel, readInt);
                        continue;
                    case 7:
                        str4 = sed.m35020q(parcel, readInt);
                        continue;
                    case 8:
                        str5 = sed.m35020q(parcel, readInt);
                        continue;
                    case 9:
                        plusCommonExtras = (PlusCommonExtras) sed.m34998a(parcel, readInt, PlusCommonExtras.CREATOR);
                        continue;
                    default:
                        sed.m35002b(parcel, readInt);
                        continue;
                }
            } else {
                i = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new PlusSession(i, str, strArr, strArr2, strArr3, str2, str3, str4, str5, plusCommonExtras);
    }
}
