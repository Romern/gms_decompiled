package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.reminders.model.DailyPatternEntity;
import com.google.android.gms.reminders.model.TimeEntity;

/* renamed from: aotl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aotl implements Parcelable.Creator {
    /* renamed from: a */
    public static void m69501a(DailyPatternEntity dailyPatternEntity, Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, dailyPatternEntity.f107122a, i, false);
        see.m35044a(parcel, 3, dailyPatternEntity.f107123b);
        see.m35041a(parcel, 4, dailyPatternEntity.f107124c);
        see.m35062b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        TimeEntity timeEntity = null;
        Integer num = null;
        Boolean bool = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                timeEntity = (TimeEntity) sed.m34998a(parcel, readInt, TimeEntity.CREATOR);
            } else if (a == 3) {
                num = sed.m35011h(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                bool = sed.m35007d(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new DailyPatternEntity(timeEntity, num, bool);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DailyPatternEntity[i];
    }
}
