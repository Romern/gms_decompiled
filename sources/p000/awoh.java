package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.p085pm.PmResult;

/* renamed from: awoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awoh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PmResult[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PmResult(parcel);
    }
}
