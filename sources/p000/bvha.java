package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.location.nearby.messages.debug.internal.DebugPokeRequest;

/* renamed from: bvha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvha implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DebugPokeRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        byte[] bArr = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        IBinder iBinder5 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 4) {
                bArr = sed.m35023t(parcel, readInt);
            } else if (a == 5) {
                iBinder = sed.m35021r(parcel, readInt);
            } else if (a != 1000) {
                switch (a) {
                    case 7:
                        iBinder2 = sed.m35021r(parcel, readInt);
                        continue;
                    case 8:
                        iBinder3 = sed.m35021r(parcel, readInt);
                        continue;
                    case 9:
                        iBinder4 = sed.m35021r(parcel, readInt);
                        continue;
                    case 10:
                        iBinder5 = sed.m35021r(parcel, readInt);
                        continue;
                    default:
                        sed.m35002b(parcel, readInt);
                        continue;
                }
            } else {
                i = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new DebugPokeRequest(i, bArr, iBinder, iBinder2, iBinder3, iBinder4, iBinder5);
    }
}
