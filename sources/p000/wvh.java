package p000;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.FelicaException;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import java.util.ArrayList;

/* renamed from: wvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wvh implements Parcelable.Creator {
    /* renamed from: a */
    public static final ErrorReport m42338a(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        ApplicationErrorReport applicationErrorReport = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str14 = null;
        String str15 = null;
        byte[] bArr = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        Bundle bundle = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        String str27 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str28 = null;
        FileTeleporter[] fileTeleporterArr = null;
        String[] strArr4 = null;
        String str29 = null;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
        String str30 = null;
        Bundle bundle2 = null;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        String str31 = null;
        ArrayList arrayList2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        boolean z2 = false;
        int i9 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i10 = 0;
        while (parcel.dataPosition() < b) {
            int a = sed.m34996a(parcel);
            switch (sed.m34995a(a)) {
                case 2:
                    applicationErrorReport = (ApplicationErrorReport) sed.m34998a(parcel2, a, ApplicationErrorReport.CREATOR);
                    break;
                case 3:
                    str = sed.m35020q(parcel2, a);
                    break;
                case 4:
                    i = sed.m35010g(parcel2, a);
                    break;
                case 5:
                    str2 = sed.m35020q(parcel2, a);
                    break;
                case 6:
                    str3 = sed.m35020q(parcel2, a);
                    break;
                case 7:
                    str4 = sed.m35020q(parcel2, a);
                    break;
                case 8:
                    str5 = sed.m35020q(parcel2, a);
                    break;
                case 9:
                    str6 = sed.m35020q(parcel2, a);
                    break;
                case 10:
                    str7 = sed.m35020q(parcel2, a);
                    break;
                case 11:
                    str8 = sed.m35020q(parcel2, a);
                    break;
                case 12:
                    i2 = sed.m35010g(parcel2, a);
                    break;
                case 13:
                    str9 = sed.m35020q(parcel2, a);
                    break;
                case 14:
                    str10 = sed.m35020q(parcel2, a);
                    break;
                case 15:
                    str11 = sed.m35020q(parcel2, a);
                    break;
                case 16:
                    str12 = sed.m35020q(parcel2, a);
                    break;
                case 17:
                    str13 = sed.m35020q(parcel2, a);
                    break;
                case 18:
                    strArr = sed.m34989A(parcel2, a);
                    break;
                case 19:
                    strArr2 = sed.m34989A(parcel2, a);
                    break;
                case 20:
                    strArr3 = sed.m34989A(parcel2, a);
                    break;
                case 21:
                    str14 = sed.m35020q(parcel2, a);
                    break;
                case 22:
                    str15 = sed.m35020q(parcel2, a);
                    break;
                case 23:
                    bArr = sed.m35023t(parcel2, a);
                    break;
                case 24:
                    i3 = sed.m35010g(parcel2, a);
                    break;
                case 25:
                    i4 = sed.m35010g(parcel2, a);
                    break;
                case 26:
                    i5 = sed.m35010g(parcel2, a);
                    break;
                case 27:
                    i6 = sed.m35010g(parcel2, a);
                    break;
                case 28:
                    str16 = sed.m35020q(parcel2, a);
                    break;
                case 29:
                    str17 = sed.m35020q(parcel2, a);
                    break;
                case 30:
                    str18 = sed.m35020q(parcel2, a);
                    break;
                case 31:
                    bundle = sed.m35022s(parcel2, a);
                    break;
                case 32:
                    z = sed.m35006c(parcel2, a);
                    break;
                case 33:
                    i7 = sed.m35010g(parcel2, a);
                    break;
                case 34:
                    i8 = sed.m35010g(parcel2, a);
                    break;
                case 35:
                    z2 = sed.m35006c(parcel2, a);
                    break;
                case 36:
                    str19 = sed.m35020q(parcel2, a);
                    break;
                case FelicaException.TYPE_NOT_CLOSED:
                    str20 = sed.m35020q(parcel2, a);
                    break;
                case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                    i9 = sed.m35010g(parcel2, a);
                    break;
                case FelicaException.TYPE_USED_BY_OTHER_APP:
                    str21 = sed.m35020q(parcel2, a);
                    break;
                case FelicaException.TYPE_PUSH_FAILED:
                    str22 = sed.m35020q(parcel2, a);
                    break;
                case 41:
                    str23 = sed.m35020q(parcel2, a);
                    break;
                case FelicaException.TYPE_ALREADY_ACTIVATED:
                    str24 = sed.m35020q(parcel2, a);
                    break;
                case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                    str25 = sed.m35020q(parcel2, a);
                    break;
                case FelicaException.TYPE_RESET_FAILED:
                    str26 = sed.m35020q(parcel2, a);
                    break;
                case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                    str27 = sed.m35020q(parcel2, a);
                    break;
                case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                    bitmapTeleporter = (BitmapTeleporter) sed.m34998a(parcel2, a, BitmapTeleporter.CREATOR);
                    break;
                case 47:
                    str28 = sed.m35020q(parcel2, a);
                    break;
                case 48:
                    fileTeleporterArr = (FileTeleporter[]) sed.m35004b(parcel2, a, FileTeleporter.CREATOR);
                    break;
                case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                    strArr4 = sed.m34989A(parcel2, a);
                    break;
                case 50:
                    z3 = sed.m35006c(parcel2, a);
                    break;
                case 51:
                    str29 = sed.m35020q(parcel2, a);
                    break;
                case 52:
                    themeSettings = (ThemeSettings) sed.m34998a(parcel2, a, ThemeSettings.CREATOR);
                    break;
                case 53:
                    logOptions = (LogOptions) sed.m34998a(parcel2, a, LogOptions.CREATOR);
                    break;
                case 54:
                    str30 = sed.m35020q(parcel2, a);
                    break;
                case 55:
                    z4 = sed.m35006c(parcel2, a);
                    break;
                case FelicaException.TYPE_ACTIVATE_FAILED:
                    bundle2 = sed.m35022s(parcel2, a);
                    break;
                case 57:
                    arrayList = sed.m35005c(parcel2, a, RectF.CREATOR);
                    break;
                case FelicaException.TYPE_OFFLINE_CANCELED:
                    z5 = sed.m35006c(parcel2, a);
                    break;
                case FelicaException.TYPE_NOW_EXECUTING_FALP:
                    bitmap = (Bitmap) sed.m34998a(parcel2, a, Bitmap.CREATOR);
                    break;
                case FelicaException.TYPE_MFC_NOT_FOUND:
                    str31 = sed.m35020q(parcel2, a);
                    break;
                case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                    arrayList2 = sed.m34992D(parcel2, a);
                    break;
                case 62:
                    i10 = sed.m35010g(parcel2, a);
                    break;
                default:
                    sed.m35002b(parcel2, a);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new ErrorReport(applicationErrorReport, str, i, str2, str3, str4, str5, str6, str7, str8, i2, str9, str10, str11, str12, str13, strArr, strArr2, strArr3, str14, str15, bArr, i3, i4, i5, i6, str16, str17, str18, bundle, z, i7, i8, z2, str19, str20, i9, str21, str22, str23, str24, str25, str26, str27, bitmapTeleporter, str28, fileTeleporterArr, strArr4, z3, str29, themeSettings, logOptions, str30, z4, bundle2, arrayList, z5, bitmap, str31, arrayList2, i10);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m42338a(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ErrorReport[i];
    }

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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String[], boolean):void
     arg types: [android.os.Parcel, int, java.lang.String[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
     arg types: [android.os.Parcel, int, android.os.Bundle, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
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
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void */
    /* renamed from: a */
    public static void m42339a(ErrorReport errorReport, Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, errorReport.f31536a, i, false);
        see.m35046a(parcel, 3, errorReport.f31546b, false);
        see.m35063b(parcel, 4, errorReport.f31547c);
        see.m35046a(parcel, 5, errorReport.f31548d, false);
        see.m35046a(parcel, 6, errorReport.f31549e, false);
        see.m35046a(parcel, 7, errorReport.f31550f, false);
        see.m35046a(parcel, 8, errorReport.f31551g, false);
        see.m35046a(parcel, 9, errorReport.f31552h, false);
        see.m35046a(parcel, 10, errorReport.f31553i, false);
        see.m35046a(parcel, 11, errorReport.f31554j, false);
        see.m35063b(parcel, 12, errorReport.f31555k);
        see.m35046a(parcel, 13, errorReport.f31556l, false);
        see.m35046a(parcel, 14, errorReport.f31557m, false);
        see.m35046a(parcel, 15, errorReport.f31558n, false);
        see.m35046a(parcel, 16, errorReport.f31559o, false);
        see.m35046a(parcel, 17, errorReport.f31560p, false);
        see.m35058a(parcel, 18, errorReport.f31561q, false);
        see.m35058a(parcel, 19, errorReport.f31562r, false);
        see.m35058a(parcel, 20, errorReport.f31563s, false);
        see.m35046a(parcel, 21, errorReport.f31564t, false);
        see.m35046a(parcel, 22, errorReport.f31565u, false);
        see.m35052a(parcel, 23, errorReport.f31566v, false);
        see.m35063b(parcel, 24, errorReport.f31567w);
        see.m35063b(parcel, 25, errorReport.f31568x);
        see.m35063b(parcel, 26, errorReport.f31569y);
        see.m35063b(parcel, 27, errorReport.f31570z);
        see.m35046a(parcel, 28, errorReport.f31510A, false);
        see.m35046a(parcel, 29, errorReport.f31511B, false);
        see.m35046a(parcel, 30, errorReport.f31512C, false);
        see.m35037a(parcel, 31, errorReport.f31513D, false);
        see.m35051a(parcel, 32, errorReport.f31514E);
        see.m35063b(parcel, 33, errorReport.f31515F);
        see.m35063b(parcel, 34, errorReport.f31516G);
        see.m35051a(parcel, 35, errorReport.f31517H);
        see.m35046a(parcel, 36, errorReport.f31518I, false);
        see.m35046a(parcel, 37, errorReport.f31519J, false);
        see.m35063b(parcel, 38, errorReport.f31520K);
        see.m35046a(parcel, 39, errorReport.f31521L, false);
        see.m35046a(parcel, 40, errorReport.f31522M, false);
        see.m35046a(parcel, 41, errorReport.f31523N, false);
        see.m35046a(parcel, 42, errorReport.f31524O, false);
        see.m35046a(parcel, 43, errorReport.f31525P, false);
        see.m35046a(parcel, 44, errorReport.f31526Q, false);
        see.m35046a(parcel, 45, errorReport.f31527R, false);
        see.m35040a(parcel, 46, errorReport.f31528S, i, false);
        see.m35046a(parcel, 47, errorReport.f31529T, false);
        see.m35057a(parcel, 48, errorReport.f31530U, i);
        see.m35058a(parcel, 49, errorReport.f31531V, false);
        see.m35051a(parcel, 50, errorReport.f31532W);
        see.m35046a(parcel, 51, errorReport.f31533X, false);
        see.m35040a(parcel, 52, errorReport.f31534Y, i, false);
        see.m35040a(parcel, 53, errorReport.f31535Z, i, false);
        see.m35046a(parcel, 54, errorReport.f31537aa, false);
        see.m35051a(parcel, 55, errorReport.f31538ab);
        see.m35037a(parcel, 56, errorReport.f31539ac, false);
        see.m35066c(parcel, 57, errorReport.f31540ad, false);
        see.m35051a(parcel, 58, errorReport.f31541ae);
        see.m35040a(parcel, 59, errorReport.f31542af, i, false);
        see.m35046a(parcel, 60, errorReport.f31543ag, false);
        see.m35065b(parcel, 61, errorReport.f31544ah, false);
        see.m35063b(parcel, 62, errorReport.f31545ai);
        see.m35062b(parcel, a);
    }
}
