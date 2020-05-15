package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.orchestration.BuyFlowIntegratorDataRequest;

/* renamed from: awte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awte implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BuyFlowIntegratorDataRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        String str = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                bArr = sed.m35023t(parcel, readInt);
            } else if (a == 3) {
                bArr2 = sed.m35023t(parcel, readInt);
            } else if (a == 4) {
                bArr3 = sed.m35023t(parcel, readInt);
            } else if (a == 5) {
                str = sed.m35020q(parcel, readInt);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                bundle = sed.m35022s(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new BuyFlowIntegratorDataRequest(bArr, bArr2, bArr3, str, bundle);
    }
}
