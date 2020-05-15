package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.autofill.util.PaymentsUtils$CardNetwork;

/* renamed from: lqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lqz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PaymentsUtils$CardNetwork[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return PaymentsUtils$CardNetwork.m7183a(parcel.readInt(), parcel.readString());
    }
}
