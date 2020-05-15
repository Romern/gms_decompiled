package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.reminders.model.DateTimeEntity;
import com.google.android.gms.reminders.model.RecurrenceEndEntity;

/* renamed from: aotw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aotw implements Parcelable.Creator {
    /* renamed from: a */
    public static void m69513a(RecurrenceEndEntity recurrenceEndEntity, Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, recurrenceEndEntity.f107154a, i, false);
        see.m35044a(parcel, 4, recurrenceEndEntity.f107155b);
        see.m35041a(parcel, 5, recurrenceEndEntity.f107156c);
        see.m35040a(parcel, 6, recurrenceEndEntity.f107157d, i, false);
        see.m35062b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        DateTimeEntity dateTimeEntity = null;
        Integer num = null;
        Boolean bool = null;
        DateTimeEntity dateTimeEntity2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                dateTimeEntity = (DateTimeEntity) sed.m34998a(parcel, readInt, DateTimeEntity.CREATOR);
            } else if (a == 4) {
                num = sed.m35011h(parcel, readInt);
            } else if (a == 5) {
                bool = sed.m35007d(parcel, readInt);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                dateTimeEntity2 = (DateTimeEntity) sed.m34998a(parcel, readInt, DateTimeEntity.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new RecurrenceEndEntity(dateTimeEntity, num, bool, dateTimeEntity2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RecurrenceEndEntity[i];
    }
}
