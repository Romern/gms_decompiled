package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.LabelValue;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import java.util.ArrayList;

/* renamed from: axdp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axdp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LabelValueRow[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList a = sqc.m35954a();
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a2 = sed.m34995a(readInt);
            if (a2 == 2) {
                str = sed.m35020q(parcel, readInt);
            } else if (a2 == 3) {
                str2 = sed.m35020q(parcel, readInt);
            } else if (a2 != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                a = sed.m35005c(parcel, readInt, LabelValue.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new LabelValueRow(str, str2, a);
    }
}
