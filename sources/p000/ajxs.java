package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.sharing.ContactFilter;
import com.google.android.gms.nearby.sharing.internal.GetContactsCountParams;

/* renamed from: ajxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajxs implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetContactsCountParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        IBinder iBinder = null;
        ContactFilter contactFilter = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                iBinder = sed.m35021r(parcel, readInt);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                contactFilter = (ContactFilter) sed.m34998a(parcel, readInt, ContactFilter.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new GetContactsCountParams(iBinder, contactFilter);
    }
}
