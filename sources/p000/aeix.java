package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.WifiScan;

/* renamed from: aeix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeix implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new WifiScan[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long[] jArr = WifiScan.f79398a;
        int[] iArr = WifiScan.f79399b;
        int[] iArr2 = WifiScan.f79399b;
        int[] iArr3 = WifiScan.f79399b;
        long[] jArr2 = jArr;
        int[] iArr4 = iArr;
        int[] iArr5 = iArr2;
        int[] iArr6 = iArr3;
        int[] iArr7 = WifiScan.f79399b;
        int[] iArr8 = WifiScan.f79399b;
        int[] iArr9 = WifiScan.f79399b;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 2:
                    jArr2 = sed.m35027x(parcel2, readInt);
                    break;
                case 3:
                    iArr4 = sed.m35026w(parcel2, readInt);
                    break;
                case 4:
                    iArr5 = sed.m35026w(parcel2, readInt);
                    break;
                case 5:
                    iArr6 = sed.m35026w(parcel2, readInt);
                    break;
                case 6:
                    iArr7 = sed.m35026w(parcel2, readInt);
                    break;
                case 7:
                    iArr8 = sed.m35026w(parcel2, readInt);
                    break;
                case 8:
                    iArr9 = sed.m35026w(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new WifiScan(j, jArr2, iArr4, iArr5, iArr6, iArr7, iArr8, iArr9);
    }
}
