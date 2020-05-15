package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.messaging.lighter.model.NotificationMetadata;

/* renamed from: bctw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bctw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new NotificationMetadata(parcel.readHashMap(NotificationMetadata.class.getClassLoader()));
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new NotificationMetadata[i];
    }
}
