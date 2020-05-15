package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.FelicaException;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.ArrayList;

/* renamed from: aarg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aarg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GoogleHelp[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        Account account = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        Bitmap bitmap = null;
        ArrayList arrayList = null;
        Bundle bundle2 = null;
        Bitmap bitmap2 = null;
        byte[] bArr = null;
        String str4 = null;
        Uri uri = null;
        ArrayList arrayList2 = null;
        ThemeSettings themeSettings = null;
        ArrayList arrayList3 = null;
        ErrorReport errorReport = null;
        TogglingData togglingData = null;
        PendingIntent pendingIntent = null;
        String str5 = null;
        String str6 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z4 = false;
        boolean z5 = false;
        int i7 = 0;
        boolean z6 = false;
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
                    account = (Account) sed.m34998a(parcel2, readInt, Account.CREATOR);
                    break;
                case 4:
                    bundle = sed.m35022s(parcel2, readInt);
                    break;
                case 5:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 6:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 7:
                    arrayList = sed.m34992D(parcel2, readInt);
                    break;
                case 8:
                case 9:
                case 12:
                case 13:
                case 24:
                case 26:
                case 27:
                case 29:
                case 30:
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
                case 10:
                    bundle2 = sed.m35022s(parcel2, readInt);
                    break;
                case 11:
                    bitmap2 = (Bitmap) sed.m34998a(parcel2, readInt, Bitmap.CREATOR);
                    break;
                case 14:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 15:
                    uri = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 16:
                    arrayList2 = sed.m35005c(parcel2, readInt, OverflowMenuItem.CREATOR);
                    break;
                case 17:
                    i4 = sed.m35010g(parcel2, readInt);
                    break;
                case 18:
                    arrayList3 = sed.m35005c(parcel2, readInt, OfflineSuggestion.CREATOR);
                    break;
                case 19:
                    bArr = sed.m35023t(parcel2, readInt);
                    break;
                case 20:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 21:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 22:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 23:
                    errorReport = (ErrorReport) sed.m34998a(parcel2, readInt, ErrorReport.CREATOR);
                    break;
                case 25:
                    themeSettings = (ThemeSettings) sed.m34998a(parcel2, readInt, ThemeSettings.CREATOR);
                    break;
                case 28:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 31:
                    togglingData = (TogglingData) sed.m34998a(parcel2, readInt, TogglingData.CREATOR);
                    break;
                case 32:
                    i5 = sed.m35010g(parcel2, readInt);
                    break;
                case 33:
                    pendingIntent = (PendingIntent) sed.m34998a(parcel2, readInt, PendingIntent.CREATOR);
                    break;
                case 34:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 35:
                    bitmap = (Bitmap) sed.m34998a(parcel2, readInt, Bitmap.CREATOR);
                    break;
                case 36:
                    i6 = sed.m35010g(parcel2, readInt);
                    break;
                case FelicaException.TYPE_NOT_CLOSED:
                    z4 = sed.m35006c(parcel2, readInt);
                    break;
                case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                    z5 = sed.m35006c(parcel2, readInt);
                    break;
                case FelicaException.TYPE_USED_BY_OTHER_APP:
                    i7 = sed.m35010g(parcel2, readInt);
                    break;
                case FelicaException.TYPE_PUSH_FAILED:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 41:
                    z6 = sed.m35006c(parcel2, readInt);
                    break;
                case FelicaException.TYPE_ALREADY_ACTIVATED:
                    str6 = sed.m35020q(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new GoogleHelp(i, str, account, bundle, str2, str3, bitmap, z, z2, arrayList, bundle2, bitmap2, bArr, i2, i3, str4, uri, arrayList2, i4, themeSettings, arrayList3, z3, errorReport, togglingData, i5, pendingIntent, i6, z4, z5, i7, str5, z6, str6);
    }
}
