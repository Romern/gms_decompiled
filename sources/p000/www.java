package p000;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import java.util.ArrayList;

/* renamed from: www */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class www implements Parcelable.Creator {
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
    public static void m42419a(FeedbackOptions feedbackOptions, Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 2, feedbackOptions.f31590a, false);
        see.m35037a(parcel, 3, feedbackOptions.f31591b, false);
        see.m35046a(parcel, 5, feedbackOptions.f31592c, false);
        see.m35040a(parcel, 6, feedbackOptions.f31593d, i, false);
        see.m35046a(parcel, 7, feedbackOptions.f31594e, false);
        see.m35040a(parcel, 8, feedbackOptions.f31595f, i, false);
        see.m35046a(parcel, 9, feedbackOptions.f31596g, false);
        see.m35066c(parcel, 10, feedbackOptions.f31597h, false);
        see.m35051a(parcel, 11, feedbackOptions.f31598i);
        see.m35040a(parcel, 12, feedbackOptions.f31599j, i, false);
        see.m35040a(parcel, 13, feedbackOptions.f31600k, i, false);
        see.m35051a(parcel, 14, feedbackOptions.f31601l);
        see.m35040a(parcel, 15, feedbackOptions.f31602m, i, false);
        see.m35046a(parcel, 16, feedbackOptions.f31603n, false);
        see.m35051a(parcel, 17, feedbackOptions.f31604o);
        see.m35036a(parcel, 18, feedbackOptions.f31605p);
        see.m35062b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        ApplicationErrorReport applicationErrorReport = null;
        String str3 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str4 = null;
        ArrayList arrayList = null;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
        Bitmap bitmap = null;
        String str5 = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    bundle = sed.m35022s(parcel2, readInt);
                    break;
                case 4:
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
                case 5:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 6:
                    applicationErrorReport = (ApplicationErrorReport) sed.m34998a(parcel2, readInt, ApplicationErrorReport.CREATOR);
                    break;
                case 7:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 8:
                    bitmapTeleporter = (BitmapTeleporter) sed.m34998a(parcel2, readInt, BitmapTeleporter.CREATOR);
                    break;
                case 9:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 10:
                    arrayList = sed.m35005c(parcel2, readInt, FileTeleporter.CREATOR);
                    break;
                case 11:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 12:
                    themeSettings = (ThemeSettings) sed.m34998a(parcel2, readInt, ThemeSettings.CREATOR);
                    break;
                case 13:
                    logOptions = (LogOptions) sed.m34998a(parcel2, readInt, LogOptions.CREATOR);
                    break;
                case 14:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 15:
                    bitmap = (Bitmap) sed.m34998a(parcel2, readInt, Bitmap.CREATOR);
                    break;
                case 16:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 17:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 18:
                    j = sed.m35012i(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new FeedbackOptions(str, bundle, str2, applicationErrorReport, str3, bitmapTeleporter, str4, arrayList, z, themeSettings, logOptions, z2, bitmap, str5, z3, j);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FeedbackOptions[i];
    }
}
