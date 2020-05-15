package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.IconAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.instream.InstreamAdConfigurationParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.ads.internal.request.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0540a implements Parcelable.Creator {
    /* renamed from: a */
    public static final AdRequestInfoParcel m5535a(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        Bundle bundle = null;
        AdRequestParcel adRequestParcel = null;
        AdSizeParcel adSizeParcel = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        VersionInfoParcel versionInfoParcel = null;
        Bundle bundle2 = null;
        ArrayList arrayList = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList2 = null;
        String str7 = null;
        NativeAdOptionsParcel nativeAdOptionsParcel = null;
        ArrayList arrayList3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        IconAdOptionsParcel iconAdOptionsParcel = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        ArrayList arrayList4 = null;
        String str15 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        String str16 = null;
        InstreamAdConfigurationParcel instreamAdConfigurationParcel = null;
        String str17 = null;
        Bundle bundle6 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i7 = 0;
        boolean z6 = false;
        boolean z7 = false;
        int i8 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (parcel.dataPosition() < b) {
            int a = sed.m34996a(parcel);
            switch (sed.m34995a(a)) {
                case 1:
                    i = sed.m35010g(parcel2, a);
                    break;
                case 2:
                    bundle = sed.m35022s(parcel2, a);
                    break;
                case 3:
                    adRequestParcel = (AdRequestParcel) sed.m34998a(parcel2, a, AdRequestParcel.CREATOR);
                    break;
                case 4:
                    adSizeParcel = (AdSizeParcel) sed.m34998a(parcel2, a, AdSizeParcel.CREATOR);
                    break;
                case 5:
                    str = sed.m35020q(parcel2, a);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) sed.m34998a(parcel2, a, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) sed.m34998a(parcel2, a, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = sed.m35020q(parcel2, a);
                    break;
                case 9:
                    str3 = sed.m35020q(parcel2, a);
                    break;
                case 10:
                    str4 = sed.m35020q(parcel2, a);
                    break;
                case 11:
                    versionInfoParcel = (VersionInfoParcel) sed.m34998a(parcel2, a, VersionInfoParcel.CREATOR);
                    break;
                case 12:
                    bundle2 = sed.m35022s(parcel2, a);
                    break;
                case 13:
                    i2 = sed.m35010g(parcel2, a);
                    break;
                case 14:
                    arrayList = sed.m34992D(parcel2, a);
                    break;
                case 15:
                    bundle3 = sed.m35022s(parcel2, a);
                    break;
                case 16:
                    z = sed.m35006c(parcel2, a);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case 32:
                case 62:
                default:
                    sed.m35002b(parcel2, a);
                    break;
                case 18:
                    i3 = sed.m35010g(parcel2, a);
                    break;
                case 19:
                    i4 = sed.m35010g(parcel2, a);
                    break;
                case 20:
                    f = sed.m35015l(parcel2, a);
                    break;
                case 21:
                    str5 = sed.m35020q(parcel2, a);
                    break;
                case 25:
                    j = sed.m35012i(parcel2, a);
                    break;
                case 26:
                    str6 = sed.m35020q(parcel2, a);
                    break;
                case 27:
                    arrayList2 = sed.m34992D(parcel2, a);
                    break;
                case 28:
                    str7 = sed.m35020q(parcel2, a);
                    break;
                case 29:
                    nativeAdOptionsParcel = (NativeAdOptionsParcel) sed.m34998a(parcel2, a, NativeAdOptionsParcel.CREATOR);
                    break;
                case 30:
                    arrayList3 = sed.m34992D(parcel2, a);
                    break;
                case 31:
                    j2 = sed.m35012i(parcel2, a);
                    break;
                case 33:
                    str8 = sed.m35020q(parcel2, a);
                    break;
                case 34:
                    f2 = sed.m35015l(parcel2, a);
                    break;
                case 35:
                    i5 = sed.m35010g(parcel2, a);
                    break;
                case 36:
                    i6 = sed.m35010g(parcel2, a);
                    break;
                case FelicaException.TYPE_NOT_CLOSED:
                    z3 = sed.m35006c(parcel2, a);
                    break;
                case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                    z4 = sed.m35006c(parcel2, a);
                    break;
                case FelicaException.TYPE_USED_BY_OTHER_APP:
                    str9 = sed.m35020q(parcel2, a);
                    break;
                case FelicaException.TYPE_PUSH_FAILED:
                    z2 = sed.m35006c(parcel2, a);
                    break;
                case 41:
                    str10 = sed.m35020q(parcel2, a);
                    break;
                case FelicaException.TYPE_ALREADY_ACTIVATED:
                    z5 = sed.m35006c(parcel2, a);
                    break;
                case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                    i7 = sed.m35010g(parcel2, a);
                    break;
                case FelicaException.TYPE_RESET_FAILED:
                    bundle4 = sed.m35022s(parcel2, a);
                    break;
                case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                    str11 = sed.m35020q(parcel2, a);
                    break;
                case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                    iconAdOptionsParcel = (IconAdOptionsParcel) sed.m34998a(parcel2, a, IconAdOptionsParcel.CREATOR);
                    break;
                case 47:
                    z6 = sed.m35006c(parcel2, a);
                    break;
                case 48:
                    bundle5 = sed.m35022s(parcel2, a);
                    break;
                case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                    str12 = sed.m35020q(parcel2, a);
                    break;
                case 50:
                    str13 = sed.m35020q(parcel2, a);
                    break;
                case 51:
                    str14 = sed.m35020q(parcel2, a);
                    break;
                case 52:
                    z7 = sed.m35006c(parcel2, a);
                    break;
                case 53:
                    arrayList4 = sed.m34990B(parcel2, a);
                    break;
                case 54:
                    str15 = sed.m35020q(parcel2, a);
                    break;
                case 55:
                    arrayList5 = sed.m34992D(parcel2, a);
                    break;
                case FelicaException.TYPE_ACTIVATE_FAILED:
                    i8 = sed.m35010g(parcel2, a);
                    break;
                case 57:
                    z8 = sed.m35006c(parcel2, a);
                    break;
                case FelicaException.TYPE_OFFLINE_CANCELED:
                    z9 = sed.m35006c(parcel2, a);
                    break;
                case FelicaException.TYPE_NOW_EXECUTING_FALP:
                    z10 = sed.m35006c(parcel2, a);
                    break;
                case FelicaException.TYPE_MFC_NOT_FOUND:
                    arrayList6 = sed.m34992D(parcel2, a);
                    break;
                case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                    str16 = sed.m35020q(parcel2, a);
                    break;
                case 63:
                    instreamAdConfigurationParcel = (InstreamAdConfigurationParcel) sed.m34998a(parcel2, a, InstreamAdConfigurationParcel.CREATOR);
                    break;
                case 64:
                    str17 = sed.m35020q(parcel2, a);
                    break;
                case KeyInformation.AES128_DES56:
                    bundle6 = sed.m35022s(parcel2, a);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new AdRequestInfoParcel(i, bundle, adRequestParcel, adSizeParcel, str, applicationInfo, packageInfo, str2, str3, str4, versionInfoParcel, bundle2, i2, arrayList, bundle3, z, i3, i4, f, str5, j, str6, arrayList2, str7, nativeAdOptionsParcel, arrayList3, j2, str8, f2, z2, i5, i6, z3, z4, str9, str10, z5, i7, bundle4, str11, iconAdOptionsParcel, z6, bundle5, str12, str13, str14, z7, arrayList4, str15, arrayList5, i8, z8, z9, z10, arrayList6, str16, instreamAdConfigurationParcel, str17, bundle6);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m5535a(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AdRequestInfoParcel[i];
    }
}
