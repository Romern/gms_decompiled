package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.internal.firstparty.SetSelectedTokenRequest;

/* renamed from: asyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asyv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SetSelectedTokenRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        long j = 0;
        boolean z = true;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 3) {
                j = sed.m35012i(parcel, readInt);
            } else if (a == 4) {
                z = sed.m35006c(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                i = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new SetSelectedTokenRequest(str, j, z, i);
    }
}
