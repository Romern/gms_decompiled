package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.FACLData;
import com.google.android.gms.auth.firstparty.shared.ScopeDetail;
import java.util.ArrayList;

/* renamed from: izi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class izi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ScopeDetail[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = new ArrayList();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        FACLData fACLData = null;
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
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                    str4 = sed.m35020q(parcel, readInt);
                    break;
                case 6:
                    str5 = sed.m35020q(parcel, readInt);
                    break;
                case 7:
                    arrayList = sed.m34992D(parcel, readInt);
                    break;
                case 8:
                    fACLData = (FACLData) sed.m34998a(parcel, readInt, FACLData.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new ScopeDetail(i, str, str2, str3, str4, str5, arrayList, fACLData);
    }
}
