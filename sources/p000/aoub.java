package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.reminders.model.DateTimeEntity;
import com.google.android.gms.reminders.model.ExternalApplicationLinkEntity;
import com.google.android.gms.reminders.model.LocationEntity;
import com.google.android.gms.reminders.model.LocationGroupEntity;
import com.google.android.gms.reminders.model.RecurrenceInfoEntity;
import com.google.android.gms.reminders.model.TaskEntity;
import com.google.android.gms.reminders.model.TaskIdEntity;

/* renamed from: aoub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoub implements Parcelable.Creator {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
    /* renamed from: a */
    public static void m69520a(TaskEntity taskEntity, Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, taskEntity.f107171a, i, false);
        see.m35044a(parcel, 3, taskEntity.f107172b);
        see.m35046a(parcel, 4, taskEntity.f107173c, false);
        see.m35040a(parcel, 6, taskEntity.f107181k, i, false);
        see.m35040a(parcel, 7, taskEntity.f107183m, i, false);
        see.m35040a(parcel, 8, taskEntity.f107182l, i, false);
        see.m35041a(parcel, 9, taskEntity.f107176f);
        see.m35041a(parcel, 11, taskEntity.f107177g);
        see.m35045a(parcel, 12, taskEntity.f107175e);
        see.m35040a(parcel, 13, taskEntity.f107184n, i, false);
        see.m35045a(parcel, 15, taskEntity.f107185o);
        see.m35052a(parcel, 16, taskEntity.f107186p, false);
        see.m35040a(parcel, 17, taskEntity.f107187q, i, false);
        see.m35052a(parcel, 18, taskEntity.f107188r, false);
        see.m35045a(parcel, 19, taskEntity.f107174d);
        see.m35044a(parcel, 20, taskEntity.f107189s);
        see.m35041a(parcel, 22, taskEntity.f107178h);
        see.m35041a(parcel, 23, taskEntity.f107179i);
        see.m35045a(parcel, 24, taskEntity.f107180j);
        see.m35040a(parcel, 26, taskEntity.f107190t, i, false);
        see.m35045a(parcel, 27, taskEntity.f107191u);
        see.m35045a(parcel, 1001, taskEntity.f107192v);
        see.m35062b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        TaskIdEntity taskIdEntity = null;
        Integer num = null;
        String str = null;
        Long l = null;
        Long l2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Long l3 = null;
        DateTimeEntity dateTimeEntity = null;
        DateTimeEntity dateTimeEntity2 = null;
        LocationEntity locationEntity = null;
        LocationGroupEntity locationGroupEntity = null;
        Long l4 = null;
        byte[] bArr = null;
        RecurrenceInfoEntity recurrenceInfoEntity = null;
        byte[] bArr2 = null;
        Integer num2 = null;
        ExternalApplicationLinkEntity externalApplicationLinkEntity = null;
        Long l5 = null;
        Long l6 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            DateTimeEntity dateTimeEntity3 = dateTimeEntity2;
            if (a == 2) {
                taskIdEntity = (TaskIdEntity) sed.m34998a(parcel2, readInt, TaskIdEntity.CREATOR);
                dateTimeEntity2 = dateTimeEntity3;
            } else if (a == 3) {
                num = sed.m35011h(parcel2, readInt);
                dateTimeEntity2 = dateTimeEntity3;
            } else if (a == 4) {
                str = sed.m35020q(parcel2, readInt);
                dateTimeEntity2 = dateTimeEntity3;
            } else if (a == 26) {
                externalApplicationLinkEntity = (ExternalApplicationLinkEntity) sed.m34998a(parcel2, readInt, ExternalApplicationLinkEntity.CREATOR);
                dateTimeEntity2 = dateTimeEntity3;
            } else if (a == 27) {
                l5 = sed.m35013j(parcel2, readInt);
                dateTimeEntity2 = dateTimeEntity3;
            } else if (a != 1001) {
                switch (a) {
                    case 6:
                        dateTimeEntity = (DateTimeEntity) sed.m34998a(parcel2, readInt, DateTimeEntity.CREATOR);
                        dateTimeEntity2 = dateTimeEntity3;
                        continue;
                    case 7:
                        locationEntity = (LocationEntity) sed.m34998a(parcel2, readInt, LocationEntity.CREATOR);
                        dateTimeEntity2 = dateTimeEntity3;
                        continue;
                    case 8:
                        dateTimeEntity2 = (DateTimeEntity) sed.m34998a(parcel2, readInt, DateTimeEntity.CREATOR);
                        continue;
                    case 9:
                        bool = sed.m35007d(parcel2, readInt);
                        dateTimeEntity2 = dateTimeEntity3;
                        continue;
                    default:
                        switch (a) {
                            case 11:
                                bool2 = sed.m35007d(parcel2, readInt);
                                dateTimeEntity2 = dateTimeEntity3;
                                continue;
                            case 12:
                                l2 = sed.m35013j(parcel2, readInt);
                                dateTimeEntity2 = dateTimeEntity3;
                                continue;
                            case 13:
                                locationGroupEntity = (LocationGroupEntity) sed.m34998a(parcel2, readInt, LocationGroupEntity.CREATOR);
                                dateTimeEntity2 = dateTimeEntity3;
                                continue;
                            default:
                                switch (a) {
                                    case 15:
                                        l4 = sed.m35013j(parcel2, readInt);
                                        dateTimeEntity2 = dateTimeEntity3;
                                        continue;
                                    case 16:
                                        bArr = sed.m35023t(parcel2, readInt);
                                        dateTimeEntity2 = dateTimeEntity3;
                                        continue;
                                    case 17:
                                        recurrenceInfoEntity = (RecurrenceInfoEntity) sed.m34998a(parcel2, readInt, RecurrenceInfoEntity.CREATOR);
                                        dateTimeEntity2 = dateTimeEntity3;
                                        continue;
                                    case 18:
                                        bArr2 = sed.m35023t(parcel2, readInt);
                                        dateTimeEntity2 = dateTimeEntity3;
                                        continue;
                                    case 19:
                                        l = sed.m35013j(parcel2, readInt);
                                        dateTimeEntity2 = dateTimeEntity3;
                                        continue;
                                    case 20:
                                        num2 = sed.m35011h(parcel2, readInt);
                                        dateTimeEntity2 = dateTimeEntity3;
                                        continue;
                                    default:
                                        switch (a) {
                                            case 22:
                                                bool3 = sed.m35007d(parcel2, readInt);
                                                dateTimeEntity2 = dateTimeEntity3;
                                                continue;
                                            case 23:
                                                bool4 = sed.m35007d(parcel2, readInt);
                                                dateTimeEntity2 = dateTimeEntity3;
                                                continue;
                                            case 24:
                                                l3 = sed.m35013j(parcel2, readInt);
                                                dateTimeEntity2 = dateTimeEntity3;
                                                continue;
                                            default:
                                                sed.m35002b(parcel2, readInt);
                                                dateTimeEntity2 = dateTimeEntity3;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                        }
                                }
                        }
                }
            } else {
                l6 = sed.m35013j(parcel2, readInt);
                dateTimeEntity2 = dateTimeEntity3;
            }
        }
        sed.m34994F(parcel2, b);
        return new TaskEntity(taskIdEntity, num, str, l, l2, bool, bool2, bool3, bool4, l3, dateTimeEntity, dateTimeEntity2, locationEntity, locationGroupEntity, l4, bArr, recurrenceInfoEntity, bArr2, num2, externalApplicationLinkEntity, l5, l6);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TaskEntity[i];
    }
}
