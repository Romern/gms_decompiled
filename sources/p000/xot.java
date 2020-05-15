package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment;

/* renamed from: xot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xot implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Attachment[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return Attachment.m23443a(parcel.readString());
        } catch (xou e) {
            throw new RuntimeException(e);
        }
    }
}
