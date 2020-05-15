package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.messaging.lighter.model.AutoValue_Notification;
import com.google.android.libraries.messaging.lighter.model.Notification;
import com.google.android.libraries.messaging.lighter.model.NotificationMetadata;

/* renamed from: bcrx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcrx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_Notification(parcel.readString(), Long.valueOf(parcel.readLong()), (NotificationMetadata) parcel.readParcelable(Notification.class.getClassLoader()), (Notification.OneOfType) parcel.readParcelable(Notification.class.getClassLoader()));
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_Notification[i];
    }
}
