package p000;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.AddListenerRequest;

/* renamed from: axpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axpq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AddListenerRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        IBinder iBinder = null;
        IntentFilter[] intentFilterArr = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                iBinder = sed.m35021r(parcel, readInt);
            } else if (a == 3) {
                intentFilterArr = (IntentFilter[]) sed.m35004b(parcel, readInt, IntentFilter.CREATOR);
            } else if (a == 4) {
                str = sed.m35020q(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                str2 = sed.m35020q(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new AddListenerRequest(iBinder, intentFilterArr, str, str2);
    }
}
