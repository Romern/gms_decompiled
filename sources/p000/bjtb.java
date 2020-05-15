package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.wallet.clientlog.TimedEvent;

/* renamed from: bjtb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjtb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new TimedEvent(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TimedEvent[i];
    }
}
