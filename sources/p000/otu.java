package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.carsetup.FirstActivityImpl;

/* renamed from: otu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class otu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FirstActivityImpl.LocalBinder[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder instanceof FirstActivityImpl.LocalBinder) {
            return (FirstActivityImpl.LocalBinder) readStrongBinder;
        }
        return new FirstActivityImpl.LocalBinder(null, null);
    }
}
