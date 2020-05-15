package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.reminders.model.DateTimeEntity;
import com.google.android.gms.reminders.model.RecurrenceStartEntity;

/* renamed from: aoty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoty implements Parcelable.Creator {
    /* renamed from: a */
    public static void m69515a(RecurrenceStartEntity recurrenceStartEntity, Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, recurrenceStartEntity.f107170a, i, false);
        see.m35062b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        DateTimeEntity dateTimeEntity = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                dateTimeEntity = (DateTimeEntity) sed.m34998a(parcel, readInt, DateTimeEntity.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new RecurrenceStartEntity(dateTimeEntity);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RecurrenceStartEntity[i];
    }
}
