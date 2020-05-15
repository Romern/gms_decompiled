package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.messaging.lighter.model.Notification;

/* renamed from: bctu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bctu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Notification.NotificationType[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return (Notification.NotificationType) Notification.NotificationType.m94872a(parcel.readInt()).mo66814b();
    }
}
