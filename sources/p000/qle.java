package p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.chimera.GoogleSettingsItem;
import java.util.ArrayList;

/* renamed from: qle */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qle implements Parcelable.Creator {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    /* renamed from: a */
    public static void m32339a(GoogleSettingsItem googleSettingsItem, Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, googleSettingsItem.f29955a);
        see.m35040a(parcel, 2, googleSettingsItem.f29956b, i, false);
        see.m35063b(parcel, 3, googleSettingsItem.f29957c);
        see.m35046a(parcel, 4, googleSettingsItem.f29958d, false);
        see.m35063b(parcel, 6, googleSettingsItem.f29959e);
        see.m35051a(parcel, 7, googleSettingsItem.f29960f);
        see.m35051a(parcel, 8, googleSettingsItem.f29961g);
        see.m35051a(parcel, 9, googleSettingsItem.f29962h);
        see.m35046a(parcel, 10, googleSettingsItem.f29963i, false);
        see.m35051a(parcel, 11, googleSettingsItem.f29964j);
        see.m35051a(parcel, 12, googleSettingsItem.f29965k);
        see.m35065b(parcel, 13, googleSettingsItem.f29966l, false);
        see.m35051a(parcel, 14, googleSettingsItem.f29967m);
        see.m35046a(parcel, 15, googleSettingsItem.f29968n, false);
        see.m35063b(parcel, 16, googleSettingsItem.f29969o);
        see.m35062b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        Intent intent = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        String str3 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 2:
                    intent = (Intent) sed.m34998a(parcel2, readInt, Intent.CREATOR);
                    break;
                case 3:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 4:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 5:
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
                case 6:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 7:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 8:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 9:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 10:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 11:
                    z4 = sed.m35006c(parcel2, readInt);
                    break;
                case 12:
                    z5 = sed.m35006c(parcel2, readInt);
                    break;
                case 13:
                    arrayList = sed.m34992D(parcel2, readInt);
                    break;
                case 14:
                    z6 = sed.m35006c(parcel2, readInt);
                    break;
                case 15:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 16:
                    i4 = sed.m35010g(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new GoogleSettingsItem(i, intent, i2, str, i3, z, z2, z3, str2, z4, z5, arrayList, z6, str3, i4);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GoogleSettingsItem[i];
    }
}
