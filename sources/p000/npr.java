package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.CrashInfoParcel;

/* renamed from: npr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class npr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CrashInfoParcel[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        if (parcel.readByte() == 0) {
            return new CrashInfoParcel((Throwable) null);
        }
        return new CrashInfoParcel(parcel);
    }
}
