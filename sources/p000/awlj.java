package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.p080pm.SecurePaymentsData;
import com.google.android.gms.wallet.firstparty.p080pm.SecurePaymentsPayload;

/* renamed from: awlj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awlj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SecurePaymentsPayload[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        byte[] bArr = null;
        SecurePaymentsData[] securePaymentsDataArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                bArr = sed.m35023t(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                securePaymentsDataArr = (SecurePaymentsData[]) sed.m35004b(parcel, readInt, SecurePaymentsData.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new SecurePaymentsPayload(bArr, securePaymentsDataArr);
    }
}
