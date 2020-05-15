package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.messaging.lighter.model.AutoValue_MessageReceivedNotification;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification;

/* renamed from: bcru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcru implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutoValue_MessageReceivedNotification((ConversationId) parcel.readParcelable(MessageReceivedNotification.class.getClassLoader()), parcel.readString(), (ContactId) parcel.readParcelable(MessageReceivedNotification.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 1);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_MessageReceivedNotification[i];
    }
}
