package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.reminders.model.DateTimeEntity;
import com.google.android.gms.reminders.model.TimeEntity;

/* renamed from: aotn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aotn implements Parcelable.Creator {
    /* renamed from: a */
    public static void m69505a(DateTimeEntity dateTimeEntity, Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35044a(parcel, 2, dateTimeEntity.f107125a);
        see.m35044a(parcel, 3, dateTimeEntity.f107126b);
        see.m35044a(parcel, 4, dateTimeEntity.f107127c);
        see.m35040a(parcel, 5, dateTimeEntity.f107128d, i, false);
        see.m35044a(parcel, 6, dateTimeEntity.f107129e);
        see.m35044a(parcel, 7, dateTimeEntity.f107130f);
        see.m35045a(parcel, 8, dateTimeEntity.f107131g);
        see.m35041a(parcel, 9, dateTimeEntity.f107132h);
        see.m35041a(parcel, 10, dateTimeEntity.f107133i);
        see.m35062b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        TimeEntity timeEntity = null;
        Integer num4 = null;
        Integer num5 = null;
        Long l = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    num = sed.m35011h(parcel, readInt);
                    break;
                case 3:
                    num2 = sed.m35011h(parcel, readInt);
                    break;
                case 4:
                    num3 = sed.m35011h(parcel, readInt);
                    break;
                case 5:
                    timeEntity = (TimeEntity) sed.m34998a(parcel, readInt, TimeEntity.CREATOR);
                    break;
                case 6:
                    num4 = sed.m35011h(parcel, readInt);
                    break;
                case 7:
                    num5 = sed.m35011h(parcel, readInt);
                    break;
                case 8:
                    l = sed.m35013j(parcel, readInt);
                    break;
                case 9:
                    bool = sed.m35007d(parcel, readInt);
                    break;
                case 10:
                    bool2 = sed.m35007d(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new DateTimeEntity(num, num2, num3, timeEntity, num4, num5, l, bool, bool2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DateTimeEntity[i];
    }
}
