package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.orchestration.BuyFlowIntegratorDataResponse;

/* renamed from: awtg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awtg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BuyFlowIntegratorDataResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        PendingIntent pendingIntent = null;
        int i = 1;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                bArr2 = sed.m35023t(parcel, readInt);
            } else if (a == 3) {
                bArr3 = sed.m35023t(parcel, readInt);
            } else if (a == 4) {
                pendingIntent = (PendingIntent) sed.m34998a(parcel, readInt, PendingIntent.CREATOR);
            } else if (a == 5) {
                i = sed.m35010g(parcel, readInt);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                bArr = sed.m35023t(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new BuyFlowIntegratorDataResponse(bArr, bArr2, bArr3, pendingIntent, i);
    }
}
