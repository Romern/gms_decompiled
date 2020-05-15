package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.rocket.impressions.Session;

/* renamed from: bebt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bebt implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Session[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Session(parcel);
    }
}
