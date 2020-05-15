package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.BirthdayEntity;
import com.google.android.gms.people.protomodel.EmailEntity;
import com.google.android.gms.people.protomodel.NameEntity;
import com.google.android.gms.people.protomodel.PersonEntity;
import com.google.android.gms.people.protomodel.PhoneEntity;
import com.google.android.gms.people.protomodel.PhotoEntity;
import java.util.ArrayList;

/* renamed from: amoy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amoy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PersonEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 9) {
                arrayList5 = sed.m35005c(parcel, readInt, BirthdayEntity.CREATOR);
            } else if (a == 11) {
                arrayList3 = sed.m35005c(parcel, readInt, EmailEntity.CREATOR);
            } else if (a == 13) {
                arrayList4 = sed.m35005c(parcel, readInt, PhoneEntity.CREATOR);
            } else if (a == 4) {
                arrayList = sed.m35005c(parcel, readInt, NameEntity.CREATOR);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                arrayList2 = sed.m35005c(parcel, readInt, PhotoEntity.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new PersonEntity(str, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
    }
}
