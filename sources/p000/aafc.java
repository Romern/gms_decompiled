package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;

/* renamed from: aafc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aafc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new RealTimeMessage(parcel.readString(), parcel.createByteArray(), parcel.readInt());
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RealTimeMessage[i];
    }
}
