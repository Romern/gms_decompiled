package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.UnsubscribeRequest;

/* renamed from: ajdu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajdu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UnsubscribeRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        String str = null;
        String str2 = null;
        ClientAppContext clientAppContext = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 2:
                    iBinder = sed.m35021r(parcel, readInt);
                    break;
                case 3:
                    iBinder2 = sed.m35021r(parcel, readInt);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) sed.m34998a(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 5:
                    i2 = sed.m35010g(parcel, readInt);
                    break;
                case 6:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 7:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 8:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 9:
                    clientAppContext = (ClientAppContext) sed.m34998a(parcel, readInt, ClientAppContext.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new UnsubscribeRequest(i, iBinder, iBinder2, pendingIntent, i2, str, str2, z, clientAppContext);
    }
}
