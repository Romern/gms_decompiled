package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.bluetooth.fastpair.HeadsetPiece;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;

/* renamed from: ayqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayqv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TrueWirelessHeadset[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        ayqw i = TrueWirelessHeadset.m94500i();
        i.mo54298b(bmxx.m108578b(readString));
        i.mo54297b((HeadsetPiece) HeadsetPiece.CREATOR.createFromParcel(parcel));
        i.mo54299c((HeadsetPiece) HeadsetPiece.CREATOR.createFromParcel(parcel));
        i.mo54294a((HeadsetPiece) HeadsetPiece.CREATOR.createFromParcel(parcel));
        i.f98304a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        i.mo54296b(parcel.readLong());
        i.mo54295a(bmxx.m108578b(parcel.readString()));
        i.mo54293a(parcel.readLong());
        return i.mo54292a();
    }
}
