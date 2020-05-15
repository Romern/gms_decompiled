package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.authzen.Permit;
import com.google.android.gms.auth.authzen.PermitAccess;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: ifp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ifp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Permit[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        PermitAccess permitAccess = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 2:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 4:
                default:
                    sed.m35002b(parcel, readInt);
                    break;
                case 5:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                case 6:
                    permitAccess = (PermitAccess) sed.m34998a(parcel, readInt, PermitAccess.CREATOR);
                    break;
                case 7:
                    arrayList = sed.m35005c(parcel, readInt, PermitAccess.CREATOR);
                    break;
                case 8:
                    arrayList2 = sed.m34992D(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            PermitAccess permitAccess2 = (PermitAccess) arrayList.get(i2);
            hashMap.put(permitAccess2.f10391b, permitAccess2);
        }
        return new Permit(i, str, str2, str3, permitAccess, hashMap, new HashSet(arrayList2));
    }
}
