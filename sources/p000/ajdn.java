package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.MessageWrapper;
import com.google.android.gms.nearby.messages.internal.PublishRequest;

/* renamed from: ajdn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajdn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PublishRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        MessageWrapper messageWrapper = null;
        Strategy strategy = null;
        IBinder iBinder = null;
        String str = null;
        String str2 = null;
        IBinder iBinder2 = null;
        ClientAppContext clientAppContext = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 2:
                    messageWrapper = (MessageWrapper) sed.m34998a(parcel2, readInt, MessageWrapper.CREATOR);
                    break;
                case 3:
                    strategy = (Strategy) sed.m34998a(parcel2, readInt, Strategy.CREATOR);
                    break;
                case 4:
                    iBinder = sed.m35021r(parcel2, readInt);
                    break;
                case 5:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 6:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 7:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 8:
                    iBinder2 = sed.m35021r(parcel2, readInt);
                    break;
                case 9:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 10:
                    clientAppContext = (ClientAppContext) sed.m34998a(parcel2, readInt, ClientAppContext.CREATOR);
                    break;
                case 11:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new PublishRequest(i, messageWrapper, strategy, iBinder, str, str2, z, iBinder2, z2, clientAppContext, i2);
    }
}
