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
import com.google.android.gms.googlehelp.OfflineSuggestion;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import java.util.ArrayList;

/* renamed from: aase */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aase implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new HelpConfig[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        Account account = null;
        String str3 = null;
        Bundle bundle = null;
        ArrayList arrayList = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        Bundle bundle4 = null;
        Bitmap bitmap = null;
        byte[] bArr = null;
        String str4 = null;
        Uri uri = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        String str5 = null;
        ErrorReport errorReport = null;
        ThemeSettings themeSettings = null;
        PendingIntent pendingIntent = null;
        Boolean bool = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z3 = false;
        boolean z4 = false;
        int i4 = 0;
        int i5 = 0;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                str = sed.m35020q(parcel2, readInt);
            } else if (a == 3) {
                str2 = sed.m35020q(parcel2, readInt);
            } else if (a == 4) {
                account = (Account) sed.m34998a(parcel2, readInt, Account.CREATOR);
            } else if (a == 5) {
                str3 = sed.m35020q(parcel2, readInt);
            } else if (a == 6) {
                bundle = sed.m35022s(parcel2, readInt);
            } else if (a == 8) {
                z = sed.m35006c(parcel2, readInt);
            } else if (a == 9) {
                z2 = sed.m35006c(parcel2, readInt);
            } else if (a == 11) {
                arrayList = sed.m34992D(parcel2, readInt);
            } else if (a == 19) {
                str4 = sed.m35020q(parcel2, readInt);
            } else if (a == 25) {
                arrayList3 = sed.m35005c(parcel2, readInt, OfflineSuggestion.CREATOR);
            } else if (a == 50) {
                bundle3 = sed.m35022s(parcel2, readInt);
            } else if (a == 15) {
                bundle4 = sed.m35022s(parcel2, readInt);
            } else if (a == 16) {
                bitmap = (Bitmap) sed.m34998a(parcel2, readInt, Bitmap.CREATOR);
            } else if (a == 22) {
                uri = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
            } else if (a == 23) {
                arrayList2 = sed.m35005c(parcel2, readInt, OverflowMenuItem.CREATOR);
            } else if (a == 38) {
                z3 = sed.m35006c(parcel2, readInt);
            } else if (a == 39) {
                errorReport = (ErrorReport) sed.m34998a(parcel2, readInt, ErrorReport.CREATOR);
            } else if (a == 52) {
                pendingIntent = (PendingIntent) sed.m34998a(parcel2, readInt, PendingIntent.CREATOR);
            } else if (a != 53) {
                switch (a) {
                    case 31:
                        str5 = sed.m35020q(parcel2, readInt);
                        continue;
                    case 32:
                        bArr = sed.m35023t(parcel2, readInt);
                        continue;
                    case 33:
                        i2 = sed.m35010g(parcel2, readInt);
                        continue;
                    case 34:
                        i3 = sed.m35010g(parcel2, readInt);
                        continue;
                    case 35:
                        bundle2 = sed.m35022s(parcel2, readInt);
                        continue;
                    case 36:
                        i = sed.m35010g(parcel2, readInt);
                        continue;
                    default:
                        switch (a) {
                            case 41:
                                themeSettings = (ThemeSettings) sed.m34998a(parcel2, readInt, ThemeSettings.CREATOR);
                                continue;
                            case FelicaException.TYPE_ALREADY_ACTIVATED:
                                z4 = sed.m35006c(parcel2, readInt);
                                continue;
                            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                                i4 = sed.m35010g(parcel2, readInt);
                                continue;
                            default:
                                switch (a) {
                                    case FelicaException.TYPE_ACTIVATE_FAILED:
                                        i5 = sed.m35010g(parcel2, readInt);
                                        continue;
                                    case 57:
                                        z5 = sed.m35006c(parcel2, readInt);
                                        continue;
                                    case FelicaException.TYPE_OFFLINE_CANCELED:
                                        z6 = sed.m35006c(parcel2, readInt);
                                        continue;
                                    case FelicaException.TYPE_NOW_EXECUTING_FALP:
                                        z7 = sed.m35006c(parcel2, readInt);
                                        continue;
                                    case FelicaException.TYPE_MFC_NOT_FOUND:
                                        z8 = sed.m35006c(parcel2, readInt);
                                        continue;
                                    case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                                        str6 = sed.m35020q(parcel2, readInt);
                                        continue;
                                    case 62:
                                        str7 = sed.m35020q(parcel2, readInt);
                                        continue;
                                    case 63:
                                        str8 = sed.m35020q(parcel2, readInt);
                                        continue;
                                    case 64:
                                        str9 = sed.m35020q(parcel2, readInt);
                                        continue;
                                    default:
                                        sed.m35002b(parcel2, readInt);
                                        continue;
                                        continue;
                                        continue;
                                }
                        }
                }
            } else {
                bool = sed.m35007d(parcel2, readInt);
            }
        }
        sed.m34994F(parcel2, b);
        return new HelpConfig(str, str2, account, str3, bundle, z, z2, arrayList, bundle2, bundle3, i, bundle4, bitmap, bArr, i2, i3, str4, uri, arrayList2, arrayList3, z3, z4, i4, str5, errorReport, themeSettings, pendingIntent, bool, i5, z5, z6, z7, z8, str6, str7, str8, str9);
    }
}
