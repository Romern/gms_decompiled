package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.senderprotocol.Channel$FlattenedChannel;

/* renamed from: ofy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ofy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Channel$FlattenedChannel[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return Channel$FlattenedChannel.m22093a(parcel.readInt(), parcel.readInt(), parcel.readInt(), olk.m29083a(parcel.readString()));
    }
}
