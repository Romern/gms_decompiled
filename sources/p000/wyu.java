package p000;

import android.accounts.Account;
import android.app.ApplicationErrorReport;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.cast.JGCastService;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: wyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wyu {
    /* renamed from: a */
    public static void m42479a(Context context, ErrorReport errorReport, int i, Account account, String str, String str2, int i2) {
        abeh b = m42481b(context, errorReport, account);
        bxvd bxvd = (bxvd) b.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) b);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        abeh abeh = (abeh) bxvd.f164949b;
        abeh abeh2 = abeh.f57196I;
        abeh.f57215j = i - 1;
        abeh.f57206a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (!TextUtils.isEmpty(str)) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            abeh abeh3 = (abeh) bxvd.f164949b;
            str.getClass();
            abeh3.f57206a |= 8192;
            abeh3.f57219n = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            abeh abeh4 = (abeh) bxvd.f164949b;
            str2.getClass();
            abeh4.f57206a |= 4096;
            abeh4.f57218m = str2;
        }
        if (i2 > 0) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            abeh abeh5 = (abeh) bxvd.f164949b;
            abeh5.f57206a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            abeh5.f57220o = i2;
        }
        wzf.m42514a(context, (abeh) bxvd.mo74062i());
    }

    /* renamed from: b */
    static abeh m42481b(Context context, ErrorReport errorReport, Account account) {
        int length;
        int length2;
        byte[] bArr;
        bxvd da = abeh.f57196I.mo74144da();
        ApplicationErrorReport applicationErrorReport = errorReport.f31536a;
        if (applicationErrorReport != null && applicationErrorReport.packageName != null) {
            String str = errorReport.f31536a.packageName;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abeh abeh = (abeh) da.f164949b;
            str.getClass();
            abeh.f57206a |= 2;
            abeh.f57209d = str;
        } else if (!TextUtils.isEmpty(errorReport.f31527R)) {
            String str2 = errorReport.f31527R;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abeh abeh2 = (abeh) da.f164949b;
            str2.getClass();
            abeh2.f57206a |= 2;
            abeh2.f57209d = str2;
        }
        String str3 = null;
        if (!TextUtils.isEmpty(((abeh) da.f164949b).f57209d)) {
            try {
                str3 = context.getPackageManager().getPackageInfo(((abeh) da.f164949b).f57209d, 0).versionName;
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abeh abeh3 = (abeh) da.f164949b;
            str3.getClass();
            abeh3.f57207b |= 2;
            abeh3.f57199B = str3;
        }
        if (account != null) {
            String a = wzg.m42517a(account);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abeh abeh4 = (abeh) da.f164949b;
            a.getClass();
            abeh4.f57206a |= 4;
            abeh4.f57210e = a;
        }
        if (!TextUtils.isEmpty(errorReport.f31543ag)) {
            String str4 = errorReport.f31543ag;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abeh abeh5 = (abeh) da.f164949b;
            str4.getClass();
            abeh5.f57206a |= 64;
            abeh5.f57214i = str4;
        }
        String d = cdtr.m134942d();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abeh abeh6 = (abeh) da.f164949b;
        d.getClass();
        abeh6.f57206a |= 16;
        abeh6.f57212g = d;
        int i = rfi.f42869b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abeh abeh7 = (abeh) da.f164949b;
        abeh7.f57206a |= JGCastService.FLAG_PRIVATE_DISPLAY;
        abeh7.f57230y = i;
        long currentTimeMillis = System.currentTimeMillis();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abeh abeh8 = (abeh) da.f164949b;
        abeh8.f57206a |= 16777216;
        abeh8.f57225t = currentTimeMillis;
        if (errorReport.f31542af != null || errorReport.f31528S != null || !TextUtils.isEmpty(errorReport.f31565u) || (((bArr = errorReport.f31566v) != null && bArr.length > 0) || !TextUtils.isEmpty(errorReport.f31529T))) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abeh abeh9 = (abeh) da.f164949b;
            abeh9.f57207b |= 16;
            abeh9.f57202E = true;
        }
        Bundle bundle = errorReport.f31513D;
        if (bundle != null && bundle.size() > 0) {
            int size = errorReport.f31513D.size();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abeh abeh10 = (abeh) da.f164949b;
            abeh10.f57207b |= 4;
            abeh10.f57200C = size;
        }
        FileTeleporter[] fileTeleporterArr = errorReport.f31530U;
        if (fileTeleporterArr == null || (length2 = fileTeleporterArr.length) <= 0) {
            String[] strArr = errorReport.f31531V;
            if (strArr != null && (length = strArr.length) > 0) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                abeh abeh11 = (abeh) da.f164949b;
                abeh11.f57207b |= 8;
                abeh11.f57201D = length;
            }
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abeh abeh12 = (abeh) da.f164949b;
            abeh12.f57207b |= 8;
            abeh12.f57201D = length2;
        }
        return (abeh) da.mo74062i();
    }

    /* renamed from: a */
    public static void m42480a(Context context, ErrorReport errorReport, Account account) {
        ThemeSettings themeSettings = errorReport.f31534Y;
        int i = 193;
        if (themeSettings != null) {
            int i2 = themeSettings.f31623a;
            if (!(i2 == 0 || i2 == 1)) {
                i = i2 != 2 ? 194 : AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC;
            }
        } else {
            i = 194;
        }
        abeh b = m42481b(context, errorReport, account);
        bxvd bxvd = (bxvd) b.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) b);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        abeh abeh = (abeh) bxvd.f164949b;
        abeh abeh2 = abeh.f57196I;
        abeh.f57215j = 182;
        int i3 = abeh.f57206a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        abeh.f57206a = i3;
        abeh.f57216k = i - 1;
        abeh.f57206a = i3 | 1024;
        wzf.m42514a(context, (abeh) bxvd.mo74062i());
    }
}
