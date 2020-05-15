package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.reminders.model.TimeEntity;

/* renamed from: aouf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aouf implements Parcelable.Creator {
    /* renamed from: a */
    public static void m69523a(TimeEntity timeEntity, Parcel parcel) {
        int a = see.m35030a(parcel);
        see.m35044a(parcel, 2, timeEntity.f107195a);
        see.m35044a(parcel, 3, timeEntity.f107196b);
        see.m35044a(parcel, 4, timeEntity.f107197c);
        see.m35062b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                num = sed.m35011h(parcel, readInt);
            } else if (a == 3) {
                num2 = sed.m35011h(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                num3 = sed.m35011h(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new TimeEntity(num, num2, num3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TimeEntity[i];
    }
}
