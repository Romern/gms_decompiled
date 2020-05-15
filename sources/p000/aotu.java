package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.reminders.model.DailyPatternEntity;
import com.google.android.gms.reminders.model.MonthlyPatternEntity;
import com.google.android.gms.reminders.model.RecurrenceEndEntity;
import com.google.android.gms.reminders.model.RecurrenceEntity;
import com.google.android.gms.reminders.model.RecurrenceStartEntity;
import com.google.android.gms.reminders.model.WeeklyPatternEntity;
import com.google.android.gms.reminders.model.YearlyPatternEntity;

/* renamed from: aotu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aotu implements Parcelable.Creator {
    /* renamed from: a */
    public static void m69511a(RecurrenceEntity recurrenceEntity, Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35044a(parcel, 2, recurrenceEntity.f107158a);
        see.m35044a(parcel, 3, recurrenceEntity.f107159b);
        see.m35040a(parcel, 4, recurrenceEntity.f107160c, i, false);
        see.m35040a(parcel, 5, recurrenceEntity.f107161d, i, false);
        see.m35040a(parcel, 6, recurrenceEntity.f107162e, i, false);
        see.m35040a(parcel, 7, recurrenceEntity.f107163f, i, false);
        see.m35040a(parcel, 8, recurrenceEntity.f107164g, i, false);
        see.m35040a(parcel, 9, recurrenceEntity.f107165h, i, false);
        see.m35062b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Integer num = null;
        Integer num2 = null;
        RecurrenceStartEntity recurrenceStartEntity = null;
        RecurrenceEndEntity recurrenceEndEntity = null;
        DailyPatternEntity dailyPatternEntity = null;
        WeeklyPatternEntity weeklyPatternEntity = null;
        MonthlyPatternEntity monthlyPatternEntity = null;
        YearlyPatternEntity yearlyPatternEntity = null;
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
                    recurrenceStartEntity = (RecurrenceStartEntity) sed.m34998a(parcel, readInt, RecurrenceStartEntity.CREATOR);
                    break;
                case 5:
                    recurrenceEndEntity = (RecurrenceEndEntity) sed.m34998a(parcel, readInt, RecurrenceEndEntity.CREATOR);
                    break;
                case 6:
                    dailyPatternEntity = (DailyPatternEntity) sed.m34998a(parcel, readInt, DailyPatternEntity.CREATOR);
                    break;
                case 7:
                    weeklyPatternEntity = (WeeklyPatternEntity) sed.m34998a(parcel, readInt, WeeklyPatternEntity.CREATOR);
                    break;
                case 8:
                    monthlyPatternEntity = (MonthlyPatternEntity) sed.m34998a(parcel, readInt, MonthlyPatternEntity.CREATOR);
                    break;
                case 9:
                    yearlyPatternEntity = (YearlyPatternEntity) sed.m34998a(parcel, readInt, YearlyPatternEntity.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new RecurrenceEntity(num, num2, recurrenceStartEntity, recurrenceEndEntity, dailyPatternEntity, weeklyPatternEntity, monthlyPatternEntity, yearlyPatternEntity);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RecurrenceEntity[i];
    }
}
