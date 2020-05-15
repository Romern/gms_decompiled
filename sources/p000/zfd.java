package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.request.SensorUnregistrationRequest;

/* renamed from: zfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zfd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SensorUnregistrationRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                iBinder = sed.m35021r(parcel, readInt);
            } else if (a == 2) {
                pendingIntent = (PendingIntent) sed.m34998a(parcel, readInt, PendingIntent.CREATOR);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                iBinder2 = sed.m35021r(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new SensorUnregistrationRequest(iBinder, pendingIntent, iBinder2);
    }
}
