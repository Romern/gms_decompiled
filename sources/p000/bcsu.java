package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bcsu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcsu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConversationId.OneOfId[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ConversationId.IdType idType = ConversationId.IdType.ONE_TO_ONE;
        int ordinal = ((ConversationId.IdType) parcel.readParcelable(getClass().getClassLoader())).ordinal();
        if (ordinal == 0) {
            return bcpt.m89601a((ContactId) parcel.readParcelable(getClass().getClassLoader()));
        }
        if (ordinal != 1) {
            return null;
        }
        return bcpt.m89602a((ConversationId.GroupId) parcel.readParcelable(getClass().getClassLoader()));
    }
}
