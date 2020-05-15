package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;

/* renamed from: ajdp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajdp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SubscribeRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        IBinder iBinder = null;
        Strategy strategy = null;
        IBinder iBinder2 = null;
        MessageFilter messageFilter = null;
        PendingIntent pendingIntent = null;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        IBinder iBinder3 = null;
        ClientAppContext clientAppContext = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 2:
                    iBinder = sed.m35021r(parcel2, readInt);
                    break;
                case 3:
                    strategy = (Strategy) sed.m34998a(parcel2, readInt, Strategy.CREATOR);
                    break;
                case 4:
                    iBinder2 = sed.m35021r(parcel2, readInt);
                    break;
                case 5:
                    messageFilter = (MessageFilter) sed.m34998a(parcel2, readInt, MessageFilter.CREATOR);
                    break;
                case 6:
                    pendingIntent = (PendingIntent) sed.m34998a(parcel2, readInt, PendingIntent.CREATOR);
                    break;
                case 7:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 8:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 9:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 10:
                    bArr = sed.m35023t(parcel2, readInt);
                    break;
                case 11:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 12:
                    iBinder3 = sed.m35021r(parcel2, readInt);
                    break;
                case 13:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 14:
                    clientAppContext = (ClientAppContext) sed.m34998a(parcel2, readInt, ClientAppContext.CREATOR);
                    break;
                case 15:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 16:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 17:
                    i4 = sed.m35010g(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new SubscribeRequest(i, iBinder, strategy, iBinder2, messageFilter, pendingIntent, i2, str, str2, bArr, z, iBinder3, z2, clientAppContext, z3, i3, i4);
    }
}
