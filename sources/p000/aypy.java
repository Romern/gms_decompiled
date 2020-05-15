package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.bluetooth.fastpair.HeadsetPiece;

/* renamed from: aypy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aypy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new HeadsetPiece[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        aypz f = HeadsetPiece.m94492f();
        if (readString == null) {
            readString = "";
        }
        f.mo54215a(readString);
        f.mo54217b(parcel.readInt());
        f.mo54214a(parcel.readInt());
        f.mo54216a(parcel.readByte() != 0);
        f.f98222a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        return f.mo54213a();
    }
}
