package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.communication.channel.nfc.Tag;

/* renamed from: xld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xld implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Tag((android.nfc.Tag) parcel.readParcelable(Tag.class.getClassLoader()));
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Tag[i];
    }
}
