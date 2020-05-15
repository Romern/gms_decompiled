package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.NotificationSettings;
import com.google.android.gms.tapandpay.internal.firstparty.SetNotificationSettingsRequest;

/* renamed from: asyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asyt implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SetNotificationSettingsRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        NotificationSettings notificationSettings = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 1) {
                sed.m35002b(parcel, readInt);
            } else {
                notificationSettings = (NotificationSettings) sed.m34998a(parcel, readInt, NotificationSettings.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new SetNotificationSettingsRequest(notificationSettings);
    }
}
