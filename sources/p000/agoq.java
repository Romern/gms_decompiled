package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusRequest;

/* renamed from: agoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agoq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MdpDataPlanStatusRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        Bundle bundle = null;
        Integer num = null;
        Long l = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 2) {
                bundle = sed.m35022s(parcel, readInt);
            } else if (a == 3) {
                num = sed.m35011h(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                l = sed.m35013j(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new MdpDataPlanStatusRequest(str, bundle, num, l);
    }
}
