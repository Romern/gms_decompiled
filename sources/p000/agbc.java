package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdns.MdnsServiceInfo;
import java.util.ArrayList;

/* renamed from: agbc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agbc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MdnsServiceInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String[] strArr = null;
        ArrayList arrayList = null;
        String[] strArr2 = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    strArr = sed.m34989A(parcel, readInt);
                    break;
                case 4:
                    arrayList = sed.m34992D(parcel, readInt);
                    break;
                case 5:
                    strArr2 = sed.m34989A(parcel, readInt);
                    break;
                case 6:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 7:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 8:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                case 9:
                    arrayList2 = sed.m34992D(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new MdnsServiceInfo(str, strArr, arrayList, strArr2, i, str2, str3, arrayList2);
    }
}
