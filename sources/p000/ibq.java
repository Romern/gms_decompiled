package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

/* renamed from: ibq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ibq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ProxyResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        PendingIntent pendingIntent = null;
        Bundle bundle = null;
        byte[] bArr = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i2 = sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                pendingIntent = (PendingIntent) sed.m34998a(parcel, readInt, PendingIntent.CREATOR);
            } else if (a == 3) {
                i3 = sed.m35010g(parcel, readInt);
            } else if (a == 4) {
                bundle = sed.m35022s(parcel, readInt);
            } else if (a == 5) {
                bArr = sed.m35023t(parcel, readInt);
            } else if (a != 1000) {
                sed.m35002b(parcel, readInt);
            } else {
                i = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new ProxyResponse(i, i2, pendingIntent, i3, bundle, bArr);
    }
}
