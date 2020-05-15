package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks;

/* renamed from: butc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class butc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DeviceDetailsLinks[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        butd h = DeviceDetailsLinks.m151151h();
        h.mo73102a(bArr);
        boolean z = true;
        h.mo73101a(parcel.readByte() != 0);
        h.mo73100a(parcel.readString());
        h.mo73103b(parcel.readString());
        if (parcel.readByte() == 0) {
            z = false;
        }
        h.mo73104b(z);
        h.mo73105c(parcel.readString());
        h.mo73106d(parcel.readString());
        return h.mo73099a();
    }
}
