package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.analytics.internal.Command;

/* renamed from: flf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class flf implements Parcelable.Creator {
    @Deprecated
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Command(parcel);
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Command[i];
    }
}
