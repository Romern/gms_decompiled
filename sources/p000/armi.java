package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.metrics.SourceLogManager;

/* renamed from: armi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class armi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SourceLogManager[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SourceLogManager(parcel);
    }
}
