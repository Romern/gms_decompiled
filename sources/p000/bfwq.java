package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.location.geofencer.data.PendingIntentCacheItem;
import java.util.ArrayList;

/* renamed from: bfwq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfwq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PendingIntentCacheItem[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                pendingIntent = (PendingIntent) sed.m34998a(parcel, readInt, PendingIntent.CREATOR);
            } else if (a == 2) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 3) {
                arrayList = sed.m34992D(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                str2 = sed.m35020q(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new PendingIntentCacheItem(pendingIntent, str, arrayList, str2);
    }
}
