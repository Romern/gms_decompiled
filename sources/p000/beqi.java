package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.walletp2p.model.Contact;

/* renamed from: beqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beqi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Contact[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Contact(Uri.parse(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }
}
