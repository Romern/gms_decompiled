package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.notification.SerializableNotification;

/* renamed from: arse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arse implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SerializableNotification[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SerializableNotification(parcel);
    }
}
