package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.setupcompat.logging.MetricKey;

/* renamed from: biyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biyg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new MetricKey(parcel.readString(), parcel.readString());
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MetricKey[i];
    }
}
