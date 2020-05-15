package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.setup.accounts.DeviceRiskSignals;
import com.google.android.gms.smartdevice.setup.accounts.ScreenlockState;
import com.google.android.gms.smartdevice.setup.accounts.StarguardData;
import java.util.HashSet;

/* renamed from: arug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arug implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DeviceRiskSignals[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        String str2 = null;
        ScreenlockState screenlockState = null;
        StarguardData starguardData = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    i = sed.m35010g(parcel2, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    j3 = sed.m35012i(parcel2, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    str = sed.m35020q(parcel2, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    str2 = sed.m35020q(parcel2, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    j = sed.m35012i(parcel2, readInt);
                    hashSet.add(6);
                    break;
                case 7:
                    j2 = sed.m35012i(parcel2, readInt);
                    hashSet.add(7);
                    break;
                case 8:
                    screenlockState = (ScreenlockState) sed.m34998a(parcel2, readInt, ScreenlockState.CREATOR);
                    hashSet.add(8);
                    break;
                case 9:
                    starguardData = (StarguardData) sed.m34998a(parcel2, readInt, StarguardData.CREATOR);
                    hashSet.add(9);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new DeviceRiskSignals(hashSet, i, j3, str, str2, j, j2, screenlockState, starguardData);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel2);
    }
}
