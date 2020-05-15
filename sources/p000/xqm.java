package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;

/* renamed from: xqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xqm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TokenBinding.TokenBindingStatus[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return TokenBinding.TokenBindingStatus.m23500a(parcel.readString());
        } catch (xqn e) {
            throw new RuntimeException(e);
        }
    }
}
