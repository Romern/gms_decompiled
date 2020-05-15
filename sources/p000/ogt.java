package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.senderprotocol.ChannelMessage;
import java.nio.ByteBuffer;

/* renamed from: ogt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ogt implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ChannelMessage[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int readInt = parcel.readInt();
        ByteBuffer byteBuffer = (ByteBuffer) ojq.m28925a(ByteBuffer.class, parcel.readStrongBinder());
        int readInt2 = parcel.readInt();
        if (parcel.readByte() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (parcel.readByte() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (parcel.readByte() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (parcel.readByte() == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        return new ChannelMessage(readInt, byteBuffer, readInt2, z, z2, z3, z4, parcel.readInt(), parcel.readInt());
    }
}
