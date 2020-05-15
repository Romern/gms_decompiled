package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.reminders.model.CustomizedSnoozePresetEntity;
import com.google.android.gms.reminders.model.TimeEntity;

/* renamed from: aotk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aotk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CustomizedSnoozePresetEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        TimeEntity timeEntity = null;
        TimeEntity timeEntity2 = null;
        TimeEntity timeEntity3 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                timeEntity = (TimeEntity) sed.m34998a(parcel, readInt, TimeEntity.CREATOR);
            } else if (a == 3) {
                timeEntity2 = (TimeEntity) sed.m34998a(parcel, readInt, TimeEntity.CREATOR);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                timeEntity3 = (TimeEntity) sed.m34998a(parcel, readInt, TimeEntity.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new CustomizedSnoozePresetEntity(timeEntity, timeEntity2, timeEntity3);
    }
}
