package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.idcredit.IdCreditResult;

/* renamed from: awmr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awmr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new IdCreditResult(parcel.createByteArray());
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new IdCreditResult[i];
    }
}
