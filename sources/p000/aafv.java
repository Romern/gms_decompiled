package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.stats.PlayerStatsEntity;

/* renamed from: aafv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aafv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlayerStatsEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        Bundle bundle = null;
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    f = sed.m35015l(parcel2, readInt);
                    break;
                case 2:
                    f2 = sed.m35015l(parcel2, readInt);
                    break;
                case 3:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 4:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 5:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 6:
                    f3 = sed.m35015l(parcel2, readInt);
                    break;
                case 7:
                    f4 = sed.m35015l(parcel2, readInt);
                    break;
                case 8:
                    bundle = sed.m35022s(parcel2, readInt);
                    break;
                case 9:
                    f5 = sed.m35015l(parcel2, readInt);
                    break;
                case 10:
                    f6 = sed.m35015l(parcel2, readInt);
                    break;
                case 11:
                    f7 = sed.m35015l(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new PlayerStatsEntity(f, f2, i, i2, i3, f3, f4, bundle, f5, f6, f7);
    }
}
