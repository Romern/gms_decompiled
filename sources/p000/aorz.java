package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.reminders.AccountState;

/* renamed from: aorz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aorz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AccountState[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        boolean[] zArr = null;
        boolean[] zArr2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                zArr = sed.m35025v(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                zArr2 = sed.m35025v(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new AccountState(zArr, zArr2);
    }
}
