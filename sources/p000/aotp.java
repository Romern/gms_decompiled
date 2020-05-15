package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.reminders.model.FeatureIdProtoEntity;

/* renamed from: aotp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aotp implements Parcelable.Creator {
    /* renamed from: a */
    public static void m69507a(FeatureIdProtoEntity featureIdProtoEntity, Parcel parcel) {
        int a = see.m35030a(parcel);
        see.m35045a(parcel, 2, featureIdProtoEntity.f107136a);
        see.m35045a(parcel, 3, featureIdProtoEntity.f107137b);
        see.m35062b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Long l = null;
        Long l2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                l = sed.m35013j(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                l2 = sed.m35013j(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new FeatureIdProtoEntity(l, l2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FeatureIdProtoEntity[i];
    }
}
