package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification;
import com.google.android.libraries.messaging.lighter.model.Notification;

/* renamed from: bctv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bctv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Notification.OneOfType[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Notification.NotificationType notificationType = Notification.NotificationType.MESSAGE_RECEIVED;
        if (((Notification.NotificationType) parcel.readParcelable(getClass().getClassLoader())).ordinal() != 0) {
            return null;
        }
        return bcqh.m89627a((MessageReceivedNotification) parcel.readParcelable(getClass().getClassLoader()));
    }
}
