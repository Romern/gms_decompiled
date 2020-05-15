package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.auth.AppIdentity;

/* renamed from: uer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uer implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AppIdentity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        if (parcel.readByte() == 1) {
            return AppIdentity.f30763a;
        }
        return AppIdentity.m22942a(parcel.readString(), parcel.readString());
    }
}
