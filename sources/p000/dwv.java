package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.Set;

/* renamed from: dwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dwv {
    /* renamed from: a */
    private static bxho m9718a(Context context, String str) {
        bxvd da = bxho.f163438f.mo74144da();
        if (!TextUtils.isEmpty(str)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxho bxho = (bxho) da.f164949b;
            str.getClass();
            bxho.f163440a |= 1;
            bxho.f163441b = str;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo == null) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("dwv", "a", 94, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("[NetworkUtil] Null package info for %s", str);
                return (bxho) da.mo74062i();
            }
            if (!TextUtils.isEmpty(packageInfo.versionName)) {
                String str2 = packageInfo.versionName;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxho bxho2 = (bxho) da.f164949b;
                str2.getClass();
                bxho2.f163440a |= 2;
                bxho2.f163442c = str2;
            }
            long j = (long) packageInfo.versionCode;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxho bxho3 = (bxho) da.f164949b;
            bxho3.f163440a |= 4;
            bxho3.f163443d = j;
            String a = spn.m35850a(packageInfo);
            if (a != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxho bxho4 = (bxho) da.f164949b;
                a.getClass();
                bxho4.f163440a |= 8;
                bxho4.f163444e = a;
            }
            return (bxho) da.mo74062i();
        } catch (PackageManager.NameNotFoundException e) {
            bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("dwv", "a", 90, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("[NetworkUtil] Failed to find package info for %s", str);
            return (bxho) da.mo74062i();
        }
    }

    /* renamed from: a */
    private static bxik m9719a(doh doh) {
        bxij bxij = (bxij) bxik.f163530b.mo74144da();
        if (cdgp.f180782a.mo6606a().mo77579ax()) {
            return (bxik) bxij.mo74062i();
        }
        Set<Integer> a = dwq.m9675s().mo9776a(doh, 2);
        if (a == null || a.isEmpty()) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dwv", "a", 163, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[NetworkUtil] No active synchronizable contexts.");
            return (bxik) bxij.mo74062i();
        }
        for (Integer num : a) {
            int intValue = num.intValue();
            bxvd da = bxiq.f163553d.mo74144da();
            bxco b = tiq.m37051b(intValue);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxiq bxiq = (bxiq) da.f164949b;
            bxiq.f163556b = b.f162973bD;
            bxiq.f163555a |= 1;
            long j = dwq.m9666j().f14362a.getLong(efd.m10294a(intValue), 0);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxiq bxiq2 = (bxiq) da.f164949b;
            bxiq2.f163555a |= 2;
            bxiq2.f163557c = j;
            bxij.mo73579a(da);
        }
        return (bxik) bxij.mo74062i();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ecv.a(doh, boolean):ecu
     arg types: [doh, int]
     candidates:
      ecv.a(doh, ecu):void
      ecv.a(doh, tjq):void
      eev.a(doh, tjq):void
      ecv.a(doh, boolean):ecu */
    /* renamed from: a */
    public static bxjc m9720a(Context context, doh doh) {
        bxho bxho;
        bxik bxik;
        sdo.m34959a(doh);
        bxvd da = bxjc.f163605j.mo74144da();
        bxvd da2 = bxho.f163438f.mo74144da();
        if (!TextUtils.isEmpty("com.google.android.gms")) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bxho bxho2 = (bxho) da2.f164949b;
            "com.google.android.gms".getClass();
            bxho2.f163440a |= 1;
            bxho2.f163441b = "com.google.android.gms";
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            if (packageInfo == null) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("dwv", "a", 94, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("[NetworkUtil] Null package info for %s", "com.google.android.gms");
                bxho = (bxho) da2.mo74062i();
            } else {
                if (!TextUtils.isEmpty(packageInfo.versionName)) {
                    String str = packageInfo.versionName;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bxho bxho3 = (bxho) da2.f164949b;
                    str.getClass();
                    bxho3.f163440a |= 2;
                    bxho3.f163442c = str;
                }
                long j = (long) packageInfo.versionCode;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bxho bxho4 = (bxho) da2.f164949b;
                bxho4.f163440a |= 4;
                bxho4.f163443d = j;
                String a = spn.m35850a(packageInfo);
                if (a != null) {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bxho bxho5 = (bxho) da2.f164949b;
                    a.getClass();
                    bxho5.f163440a |= 8;
                    bxho5.f163444e = a;
                }
                bxho = (bxho) da2.mo74062i();
            }
        } catch (PackageManager.NameNotFoundException e) {
            bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("dwv", "a", 90, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("[NetworkUtil] Failed to find package info for %s", "com.google.android.gms");
            bxho = (bxho) da2.mo74062i();
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxjc bxjc = (bxjc) da.f164949b;
        bxho.getClass();
        bxjc.f163608b = bxho;
        bxjc.f163607a |= 1;
        bxvd da3 = bxho.f163438f.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bxho bxho6 = (bxho) da3.f164949b;
        "com.google.android.gms".getClass();
        bxho6.f163440a |= 1;
        bxho6.f163441b = "com.google.android.gms";
        String a2 = stu.m36315a();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bxho bxho7 = (bxho) da3.f164949b;
        a2.getClass();
        bxho7.f163440a |= 2;
        bxho7.f163442c = a2;
        long b = (long) stu.m36316b();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bxho bxho8 = (bxho) da3.f164949b;
        bxho8.f163440a |= 4;
        bxho8.f163443d = b;
        bxho bxho9 = (bxho) da3.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxjc bxjc2 = (bxjc) da.f164949b;
        bxho9.getClass();
        bxjc2.f163609c = bxho9;
        bxjc2.f163607a |= 2;
        String c = dwq.m9659c();
        int d = dwq.m9660d();
        bxvd da4 = bxho.f163438f.mo74144da();
        if (!TextUtils.isEmpty(c)) {
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bxho bxho10 = (bxho) da4.f164949b;
            c.getClass();
            bxho10.f163440a |= 1;
            bxho10.f163441b = c;
        }
        if (d != -1) {
            long j2 = (long) d;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bxho bxho11 = (bxho) da4.f164949b;
            bxho11.f163440a |= 4;
            bxho11.f163443d = j2;
        }
        bxho bxho12 = (bxho) da4.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxjc bxjc3 = (bxjc) da.f164949b;
        bxho12.getClass();
        bxjc3.f163614h = bxho12;
        bxjc3.f163607a |= 64;
        long a3 = dwq.m9665i().mo20505a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxjc bxjc4 = (bxjc) da.f164949b;
        bxjc4.f163607a |= 4;
        bxjc4.f163610d = a3;
        String str2 = dwq.m9678v().mo9974a(doh, false).f14703a.f46294b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxjc bxjc5 = (bxjc) da.f164949b;
        str2.getClass();
        bxjc5.f163607a |= 8;
        bxjc5.f163611e = str2;
        bxvd da5 = bxhs.f163461g.mo74144da();
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        bxhs bxhs = (bxhs) da5.f164949b;
        bxhs.f163466d = 1;
        bxhs.f163463a |= 4;
        String str3 = Build.MANUFACTURER;
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        bxhs bxhs2 = (bxhs) da5.f164949b;
        str3.getClass();
        bxhs2.f163463a |= 1;
        bxhs2.f163464b = str3;
        String str4 = Build.MODEL;
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        bxhs bxhs3 = (bxhs) da5.f164949b;
        str4.getClass();
        bxhs3.f163463a |= 2;
        bxhs3.f163465c = str4;
        String str5 = Build.VERSION.RELEASE;
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        bxhs bxhs4 = (bxhs) da5.f164949b;
        str5.getClass();
        bxhs4.f163463a |= 8;
        bxhs4.f163467e = str5;
        int i = Build.VERSION.SDK_INT;
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        bxhs bxhs5 = (bxhs) da5.f164949b;
        bxhs5.f163463a |= 16;
        bxhs5.f163468f = i;
        bxhs bxhs6 = (bxhs) da5.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxjc bxjc6 = (bxjc) da.f164949b;
        bxhs6.getClass();
        bxjc6.f163612f = bxhs6;
        bxjc6.f163607a |= 16;
        bxij bxij = (bxij) bxik.f163530b.mo74144da();
        if (!cdgp.f180782a.mo6606a().mo77579ax()) {
            Set<Integer> a4 = dwq.m9675s().mo9776a(doh, 2);
            if (a4 == null || a4.isEmpty()) {
                bnsl bnsl3 = (bnsl) dss.f13961a.mo68387b();
                bnsl3.mo68432a("dwv", "a", 163, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("[NetworkUtil] No active synchronizable contexts.");
                bxik = (bxik) bxij.mo74062i();
            } else {
                for (Integer num : a4) {
                    int intValue = num.intValue();
                    bxvd da6 = bxiq.f163553d.mo74144da();
                    bxco b2 = tiq.m37051b(intValue);
                    if (da6.f164950c) {
                        da6.mo74035c();
                        da6.f164950c = false;
                    }
                    bxiq bxiq = (bxiq) da6.f164949b;
                    bxiq.f163556b = b2.f162973bD;
                    bxiq.f163555a |= 1;
                    long j3 = dwq.m9666j().f14362a.getLong(efd.m10294a(intValue), 0);
                    if (da6.f164950c) {
                        da6.mo74035c();
                        da6.f164950c = false;
                    }
                    bxiq bxiq2 = (bxiq) da6.f164949b;
                    bxiq2.f163555a |= 2;
                    bxiq2.f163557c = j3;
                    bxij.mo73579a(da6);
                }
                bxik = (bxik) bxij.mo74062i();
            }
        } else {
            bxik = (bxik) bxij.mo74062i();
        }
        String a5 = cdhx.f180926a.mo6606a().mo77630a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxjc bxjc7 = (bxjc) da.f164949b;
        a5.getClass();
        int i2 = bxjc7.f163607a | 128;
        bxjc7.f163607a = i2;
        bxjc7.f163615i = a5;
        new Object[1][0] = bxik;
        bxik.getClass();
        bxjc7.f163613g = bxik;
        bxjc7.f163607a = i2 | 32;
        return (bxjc) da.mo74062i();
    }
}
