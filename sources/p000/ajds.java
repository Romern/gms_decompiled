package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.MessageWrapper;
import com.google.android.gms.nearby.messages.internal.UnpublishRequest;

/* renamed from: ajds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajds implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UnpublishRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        MessageWrapper messageWrapper = null;
        IBinder iBinder = null;
        String str = null;
        String str2 = null;
        ClientAppContext clientAppContext = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 2:
                    messageWrapper = (MessageWrapper) sed.m34998a(parcel, readInt, MessageWrapper.CREATOR);
                    break;
                case 3:
                    iBinder = sed.m35021r(parcel, readInt);
                    break;
                case 4:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 6:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 7:
                    clientAppContext = (ClientAppContext) sed.m34998a(parcel, readInt, ClientAppContext.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new UnpublishRequest(i, messageWrapper, iBinder, str, str2, z, clientAppContext);
    }
}
