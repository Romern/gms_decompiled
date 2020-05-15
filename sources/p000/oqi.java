package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.carrierauth.EAPAKARequest;

/* renamed from: oqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oqi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new EAPAKARequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 2) {
                num = sed.m35011h(parcel, readInt);
            } else if (a == 3) {
                num2 = sed.m35011h(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                num3 = sed.m35011h(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new EAPAKARequest(str, num, num2, num3);
    }
}
