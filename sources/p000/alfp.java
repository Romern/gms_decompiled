package p000;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.pay.PayGlobalActionCard;

/* renamed from: alfp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alfp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PayGlobalActionCard[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        Bitmap bitmap = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bitmap bitmap2 = null;
        PendingIntent pendingIntent = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 2:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    bitmap = (Bitmap) sed.m34998a(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 4:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 5:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                case 6:
                    bitmap2 = (Bitmap) sed.m34998a(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 7:
                    pendingIntent = (PendingIntent) sed.m34998a(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 8:
                    str4 = sed.m35020q(parcel, readInt);
                    break;
                case 9:
                    i2 = sed.m35010g(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new PayGlobalActionCard(i, str, bitmap, str2, str3, str4, bitmap2, pendingIntent, i2);
    }
}
