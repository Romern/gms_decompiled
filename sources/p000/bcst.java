package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bcst */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcst implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConversationId.IdType[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ConversationId.IdType.m94851a(parcel.readInt());
    }
}
