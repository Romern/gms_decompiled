package p000;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.pay.PayCardArt;
import com.google.android.gms.pay.PayCardArtInfo;

/* renamed from: alfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alfm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PayCardArt[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        PayCardArtInfo payCardArtInfo = null;
        Bitmap bitmap = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                payCardArtInfo = (PayCardArtInfo) sed.m34998a(parcel, readInt, PayCardArtInfo.CREATOR);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                bitmap = (Bitmap) sed.m34998a(parcel, readInt, Bitmap.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new PayCardArt(payCardArtInfo, bitmap);
    }
}
