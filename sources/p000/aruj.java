package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.DeviceSignals;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: aruj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aruj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ExchangeAssertionsForUserCredentialsRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        DeviceSignals deviceSignals = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    arrayList = sed.m35005c(parcel, readInt, Assertion.CREATOR);
                    hashSet.add(2);
                    break;
                case 3:
                    deviceSignals = (DeviceSignals) sed.m34998a(parcel, readInt, DeviceSignals.CREATOR);
                    hashSet.add(3);
                    break;
                case 4:
                    i = sed.m35010g(parcel, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    str = sed.m35020q(parcel, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    str2 = sed.m35020q(parcel, readInt);
                    hashSet.add(6);
                    break;
                case 7:
                    str3 = sed.m35020q(parcel, readInt);
                    hashSet.add(7);
                    break;
                case 8:
                    str4 = sed.m35020q(parcel, readInt);
                    hashSet.add(8);
                    break;
                case 9:
                    z = sed.m35006c(parcel, readInt);
                    hashSet.add(9);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ExchangeAssertionsForUserCredentialsRequest(hashSet, arrayList, deviceSignals, i, str, str2, str3, str4, z);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
