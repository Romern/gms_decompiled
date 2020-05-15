package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.DeviceDetails;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: aqyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqyr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BootstrapConfigurations[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        long j = 0;
        long j2 = 0;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        Bundle bundle = null;
        DeviceDetails deviceDetails = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str2 = sed.m35020q(parcel2, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    str3 = sed.m35020q(parcel2, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    str = sed.m35020q(parcel2, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    z = sed.m35006c(parcel2, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    arrayList = sed.m35005c(parcel2, readInt, BootstrapAccount.CREATOR);
                    hashSet.add(6);
                    break;
                case 7:
                    bundle = sed.m35022s(parcel2, readInt);
                    hashSet.add(7);
                    break;
                case 8:
                    z2 = sed.m35006c(parcel2, readInt);
                    hashSet.add(8);
                    break;
                case 9:
                    z3 = sed.m35006c(parcel2, readInt);
                    hashSet.add(9);
                    break;
                case 10:
                    i = sed.m35010g(parcel2, readInt);
                    hashSet.add(10);
                    break;
                case 11:
                    j = sed.m35012i(parcel2, readInt);
                    hashSet.add(11);
                    break;
                case 12:
                    j2 = sed.m35012i(parcel2, readInt);
                    hashSet.add(12);
                    break;
                case 13:
                    deviceDetails = (DeviceDetails) sed.m34998a(parcel2, readInt, DeviceDetails.CREATOR);
                    hashSet.add(13);
                    j2 = j2;
                    break;
                case 14:
                    z4 = sed.m35006c(parcel2, readInt);
                    hashSet.add(14);
                    break;
                case 15:
                    z5 = sed.m35006c(parcel2, readInt);
                    hashSet.add(15);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        long j3 = j2;
        if (parcel.dataPosition() == b) {
            return new BootstrapConfigurations(hashSet, str2, str3, str, z, arrayList, bundle, z2, z3, i, j, j3, deviceDetails, z4, z5);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel2);
    }
}
