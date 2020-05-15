package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.messaging.lighter.model.AutoValue_ContactId;
import com.google.android.libraries.messaging.lighter.model.ContactId;

/* renamed from: bcrl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcrl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_ContactId(parcel.readString(), parcel.readString(), (ContactId.ContactType) parcel.readParcelable(ContactId.class.getClassLoader()), (bmxv) parcel.readSerializable());
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_ContactId[i];
    }
}
