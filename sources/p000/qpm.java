package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.chimera.debug.items.ModuleItem;

/* renamed from: qpm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qpm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ModuleItem[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 4:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 5:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 6:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 7:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 8:
                    i4 = sed.m35010g(parcel2, readInt);
                    break;
                case 9:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new ModuleItem(i, str, i2, str2, i3, j, str3, i4, z);
    }
}
