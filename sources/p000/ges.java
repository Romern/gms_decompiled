package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.audiomodem.Encoding;
import com.google.android.gms.audiomodem.TokenReceiver$Params;

/* renamed from: ges */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ges implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TokenReceiver$Params[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Encoding[] encodingArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                encodingArr = (Encoding[]) sed.m35004b(parcel, readInt, Encoding.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new TokenReceiver$Params(encodingArr);
    }
}
