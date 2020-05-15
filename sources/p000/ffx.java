package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.accountsettings.utils.ButtonConfig;

/* renamed from: ffx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ffx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ButtonConfig[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ButtonConfig(parcel.readString(), parcel.readInt(), parcel.readBundle(getClass().getClassLoader()));
    }
}
