package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.ExceptionParcel;

/* renamed from: nqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nqj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return new ExceptionParcel((Throwable) parcel.readSerializable());
        } catch (RuntimeException e) {
            return new ExceptionParcel(e);
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ExceptionParcel[i];
    }
}
