package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.reminders.LoadRemindersOptions;
import java.util.ArrayList;

/* renamed from: aosb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aosb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LoadRemindersOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        ArrayList arrayList3 = null;
        Long l5 = null;
        Long l6 = null;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 3:
                    arrayList = sed.m34992D(parcel2, readInt);
                    break;
                case 4:
                    arrayList2 = sed.m34990B(parcel2, readInt);
                    break;
                case 5:
                    l = sed.m35013j(parcel2, readInt);
                    break;
                case 6:
                    l2 = sed.m35013j(parcel2, readInt);
                    break;
                case 7:
                    l3 = sed.m35013j(parcel2, readInt);
                    break;
                case 8:
                    l4 = sed.m35013j(parcel2, readInt);
                    break;
                case 9:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 10:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 11:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 12:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 13:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 14:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 15:
                    arrayList3 = sed.m34992D(parcel2, readInt);
                    break;
                case 16:
                    l5 = sed.m35013j(parcel2, readInt);
                    break;
                case 17:
                    l6 = sed.m35013j(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new LoadRemindersOptions(arrayList, arrayList2, l, l2, l3, l4, z, i, z2, z3, i2, i3, arrayList3, l5, l6);
    }
}
