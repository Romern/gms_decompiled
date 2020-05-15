package com.google.android.gms.ads.internal.request;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.FelicaException;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.safebrowsing.SafeBrowsingConfigParcel;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.ads.internal.request.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0541b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AdResponseParcel[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        LargeParcelTeleporter largeParcelTeleporter = null;
        String str7 = null;
        String str8 = null;
        RewardItemParcel rewardItemParcel = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        AutoClickProtectionConfigurationParcel autoClickProtectionConfigurationParcel = null;
        String str9 = null;
        ArrayList arrayList6 = null;
        String str10 = null;
        SafeBrowsingConfigParcel safeBrowsingConfigParcel = null;
        String str11 = null;
        Bundle bundle = null;
        ArrayList arrayList7 = null;
        String str12 = null;
        String str13 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        int i4 = 0;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
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
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 4:
                    arrayList = sed.m34992D(parcel2, readInt);
                    break;
                case 5:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 6:
                    arrayList2 = sed.m34992D(parcel2, readInt);
                    break;
                case 7:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 8:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 9:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 10:
                    arrayList3 = sed.m34992D(parcel2, readInt);
                    break;
                case 11:
                    j3 = sed.m35012i(parcel2, readInt);
                    break;
                case 12:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 13:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 14:
                    j4 = sed.m35012i(parcel2, readInt);
                    break;
                case 15:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 16:
                case 17:
                case 20:
                case 27:
                case 41:
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
                case 18:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 19:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 21:
                    str6 = sed.m35020q(parcel2, readInt);
                    break;
                case 22:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 23:
                    z4 = sed.m35006c(parcel2, readInt);
                    break;
                case 24:
                    z5 = sed.m35006c(parcel2, readInt);
                    break;
                case 25:
                    z6 = sed.m35006c(parcel2, readInt);
                    break;
                case 26:
                    z7 = sed.m35006c(parcel2, readInt);
                    break;
                case 28:
                    largeParcelTeleporter = (LargeParcelTeleporter) sed.m34998a(parcel2, readInt, LargeParcelTeleporter.CREATOR);
                    break;
                case 29:
                    str7 = sed.m35020q(parcel2, readInt);
                    break;
                case 30:
                    str8 = sed.m35020q(parcel2, readInt);
                    break;
                case 31:
                    z8 = sed.m35006c(parcel2, readInt);
                    break;
                case 32:
                    z9 = sed.m35006c(parcel2, readInt);
                    break;
                case 33:
                    rewardItemParcel = (RewardItemParcel) sed.m34998a(parcel2, readInt, RewardItemParcel.CREATOR);
                    break;
                case 34:
                    arrayList4 = sed.m34992D(parcel2, readInt);
                    break;
                case 35:
                    arrayList5 = sed.m34992D(parcel2, readInt);
                    break;
                case 36:
                    z10 = sed.m35006c(parcel2, readInt);
                    break;
                case FelicaException.TYPE_NOT_CLOSED:
                    autoClickProtectionConfigurationParcel = (AutoClickProtectionConfigurationParcel) sed.m34998a(parcel2, readInt, AutoClickProtectionConfigurationParcel.CREATOR);
                    break;
                case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                    z11 = sed.m35006c(parcel2, readInt);
                    break;
                case FelicaException.TYPE_USED_BY_OTHER_APP:
                    str9 = sed.m35020q(parcel2, readInt);
                    break;
                case FelicaException.TYPE_PUSH_FAILED:
                    arrayList6 = sed.m34992D(parcel2, readInt);
                    break;
                case FelicaException.TYPE_ALREADY_ACTIVATED:
                    z12 = sed.m35006c(parcel2, readInt);
                    break;
                case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                    str10 = sed.m35020q(parcel2, readInt);
                    break;
                case FelicaException.TYPE_RESET_FAILED:
                    safeBrowsingConfigParcel = (SafeBrowsingConfigParcel) sed.m34998a(parcel2, readInt, SafeBrowsingConfigParcel.CREATOR);
                    break;
                case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                    str11 = sed.m35020q(parcel2, readInt);
                    break;
                case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                    z13 = sed.m35006c(parcel2, readInt);
                    break;
                case 47:
                    z14 = sed.m35006c(parcel2, readInt);
                    break;
                case 48:
                    bundle = sed.m35022s(parcel2, readInt);
                    break;
                case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                    z15 = sed.m35006c(parcel2, readInt);
                    break;
                case 50:
                    i4 = sed.m35010g(parcel2, readInt);
                    break;
                case 51:
                    z16 = sed.m35006c(parcel2, readInt);
                    break;
                case 52:
                    arrayList7 = sed.m34992D(parcel2, readInt);
                    break;
                case 53:
                    z17 = sed.m35006c(parcel2, readInt);
                    break;
                case 54:
                    str12 = sed.m35020q(parcel2, readInt);
                    break;
                case 55:
                    str13 = sed.m35020q(parcel2, readInt);
                    break;
                case FelicaException.TYPE_ACTIVATE_FAILED:
                    z18 = sed.m35006c(parcel2, readInt);
                    break;
                case 57:
                    z19 = sed.m35006c(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new AdResponseParcel(i, str, str2, arrayList, i2, arrayList2, j, z, j2, arrayList3, j3, i3, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, largeParcelTeleporter, str7, str8, z8, z9, rewardItemParcel, arrayList4, arrayList5, z10, autoClickProtectionConfigurationParcel, z11, str9, arrayList6, z12, str10, safeBrowsingConfigParcel, str11, z13, z14, bundle, z15, i4, z16, arrayList7, z17, str12, str13, z18, z19);
    }
}
