package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.request.DataUpdateListenerUnregistrationRequest;

/* renamed from: zen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zen implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DataUpdateListenerUnregistrationRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        PendingIntent pendingIntent = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                pendingIntent = (PendingIntent) sed.m34998a(parcel, readInt, PendingIntent.CREATOR);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                iBinder = sed.m35021r(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new DataUpdateListenerUnregistrationRequest(pendingIntent, iBinder);
    }
}
