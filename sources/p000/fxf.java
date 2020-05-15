package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.p015ui.context.SelectionFragmentOptions;
import java.util.ArrayList;

/* renamed from: fxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fxf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SelectionFragmentOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        ArrayList arrayList = null;
        String[] strArr = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList2 = null;
        Bundle bundle = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 4:
                    arrayList = sed.m35005c(parcel2, readInt, ContactPerson.CREATOR);
                    break;
                case 5:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 6:
                    strArr = sed.m34989A(parcel2, readInt);
                    break;
                case 7:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 8:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 9:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 10:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 11:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 12:
                    arrayList2 = sed.m35005c(parcel2, readInt, Bundle.CREATOR);
                    break;
                case 13:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 14:
                    z4 = sed.m35006c(parcel2, readInt);
                    break;
                case 15:
                    bundle = sed.m35022s(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new SelectionFragmentOptions(str, i, arrayList, z, strArr, i2, i3, str2, str3, z2, arrayList2, z3, z4, bundle);
    }
}
