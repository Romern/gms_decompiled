package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.File;

/* renamed from: qhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qhy {

    /* renamed from: a */
    private static final Logger f41437a = qgn.m32143a("AndroidBuildModule");

    /* renamed from: b */
    private static final bnhe f41438b;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b("client_id", qhq.BASE_CLIENT_ID);
        h.mo67695b("search_client_id", qhq.SEARCH_CLIENT_ID);
        h.mo67695b("voicesearch_client_id", qhq.VOICESEARCH_CLIENT_ID);
        h.mo67695b("maps_client_id", qhq.MAPS_CLIENT_ID);
        h.mo67695b("youtube_client_id", qhq.YOUTUBE_CLIENT_ID);
        h.mo67695b("market_client_id", qhq.MARKET_CLIENT_ID);
        h.mo67695b("shopper_client_id", qhq.SHOPPER_CLIENT_ID);
        h.mo67695b("wallet_client_id", qhq.WALLET_CLIENT_ID);
        h.mo67695b("chrome_client_id", qhq.CHROME_CLIENT_ID);
        f41438b = h.mo67618b();
    }

    /* renamed from: a */
    private static bmxv m32194a(Context context, String str) {
        String str2;
        try {
            str2 = aymk.m84258a(context.getContentResolver(), str);
        } catch (SecurityException e) {
            f41437a.mo25415d("Unable to get partner string with key: %s", e, str);
            str2 = null;
        }
        return bmxv.m108567c(str2);
    }

    /* renamed from: a */
    static File m32195a() {
        return new File("/system/recovery-from-boot.p");
    }

    /* renamed from: a */
    static qhf m32196a(Context context, File file, qdu qdu, qjw qjw) {
        bxvd da = qhf.f41317r.mo74144da();
        if (qjw.mo24054a(qhf.class, 1) && !TextUtils.isEmpty(Build.FINGERPRINT)) {
            String str = Build.FINGERPRINT;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qhf qhf = (qhf) da.f164949b;
            str.getClass();
            qhf.f41319a |= 1;
            qhf.f41320b = str;
        }
        String radioVersion = Build.getRadioVersion();
        if (qjw.mo24054a(qhf.class, 4)) {
            if (TextUtils.isEmpty(radioVersion)) {
                radioVersion = null;
            }
            SharedPreferences sharedPreferences = qdu.f41032b;
            if (sharedPreferences == null) {
                sharedPreferences = context.getSharedPreferences("DeviceConfigUtils", 0);
            }
            String string = sharedPreferences.getString("lastRadio", null);
            if (radioVersion == null) {
                radioVersion = string;
            } else if (!radioVersion.equals(string)) {
                sharedPreferences.edit().putString("lastRadio", radioVersion).apply();
            }
            if (!TextUtils.isEmpty(radioVersion)) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                qhf qhf2 = (qhf) da.f164949b;
                radioVersion.getClass();
                qhf2.f41319a |= 2;
                qhf2.f41321c = radioVersion;
            }
        }
        if (qjw.mo24054a(qhf.class, 5) && !TextUtils.isEmpty(Build.BOOTLOADER)) {
            String str2 = Build.BOOTLOADER;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qhf qhf3 = (qhf) da.f164949b;
            str2.getClass();
            qhf3.f41319a |= 4;
            qhf3.f41322d = str2;
        }
        if (qjw.mo24054a(qhf.class, 2) && !TextUtils.isEmpty(Build.HARDWARE)) {
            String str3 = Build.HARDWARE;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qhf qhf4 = (qhf) da.f164949b;
            str3.getClass();
            qhf4.f41319a |= 8;
            qhf4.f41323e = str3;
        }
        if (qjw.mo24054a(qhf.class, 3) && !TextUtils.isEmpty(Build.BRAND)) {
            String str4 = Build.BRAND;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qhf qhf5 = (qhf) da.f164949b;
            str4.getClass();
            qhf5.f41319a |= 16;
            qhf5.f41324f = str4;
        }
        if (qjw.mo24054a(qhf.class, 9) && !TextUtils.isEmpty(Build.DEVICE)) {
            String str5 = Build.DEVICE;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qhf qhf6 = (qhf) da.f164949b;
            str5.getClass();
            qhf6.f41319a |= 512;
            qhf6.f41329k = str5;
        }
        if (qjw.mo24054a(qhf.class, 11) && !TextUtils.isEmpty(Build.MODEL)) {
            String str6 = Build.MODEL;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qhf qhf7 = (qhf) da.f164949b;
            str6.getClass();
            qhf7.f41319a |= 1024;
            qhf7.f41330l = str6;
        }
        if (qjw.mo24054a(qhf.class, 12) && !TextUtils.isEmpty(Build.MANUFACTURER)) {
            String str7 = Build.MANUFACTURER;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qhf qhf8 = (qhf) da.f164949b;
            str7.getClass();
            qhf8.f41319a |= 2048;
            qhf8.f41331m = str7;
        }
        if (qjw.mo24054a(qhf.class, 13) && !TextUtils.isEmpty(Build.PRODUCT)) {
            String str8 = Build.PRODUCT;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qhf qhf9 = (qhf) da.f164949b;
            str8.getClass();
            qhf9.f41319a |= 4096;
            qhf9.f41332n = str8;
        }
        if (qjw.mo24054a(qhf.class, 7)) {
            long j = Build.TIME / 1000;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qhf qhf10 = (qhf) da.f164949b;
            qhf10.f41319a |= 64;
            qhf10.f41326h = j;
        }
        if (qjw.mo24054a(qhf.class, 10)) {
            int i = Build.VERSION.SDK_INT;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qhf qhf11 = (qhf) da.f164949b;
            qhf11.f41319a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            qhf11.f41328j = i;
        }
        if (qjw.mo24054a(qhf.class, 19)) {
            int i2 = Build.VERSION.SDK_INT;
            String str9 = Build.VERSION.SECURITY_PATCH;
            if (!TextUtils.isEmpty(str9)) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                qhf qhf12 = (qhf) da.f164949b;
                str9.getClass();
                qhf12.f41319a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                qhf12.f41335q = str9;
            }
        }
        if (qjw.mo24054a(qhf.class, 14)) {
            boolean exists = file.exists();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qhf qhf13 = (qhf) da.f164949b;
            qhf13.f41319a |= 8192;
            qhf13.f41333o = exists;
        }
        if (qjw.mo24054a(qhf.class, 16)) {
            srd.m36078b(context);
        }
        if (qjw.mo24054a(qhf.class, 15)) {
            bngs j2 = bngx.m109377j();
            bnrd a = f41438b.keySet().iterator();
            while (a.hasNext()) {
                String str10 = (String) a.next();
                bmxv a2 = m32194a(context, str10);
                if (a2.mo66813a()) {
                    bxvd da2 = qhr.f41407d.mo74144da();
                    qhq qhq = (qhq) f41438b.get(str10);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    qhr qhr = (qhr) da2.f164949b;
                    qhr.f41410b = qhq.f41406j;
                    qhr.f41409a |= 1;
                    String str11 = (String) a2.mo66814b();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    qhr qhr2 = (qhr) da2.f164949b;
                    str11.getClass();
                    qhr2.f41409a |= 2;
                    qhr2.f41411c = str11;
                    j2.mo67668c((qhr) da2.mo74062i());
                }
            }
            da.mo73935B(j2.mo67664a());
        }
        if (qjw.mo24054a(qhf.class, 6)) {
            bmxv a3 = m32194a(context, "client_id");
            if (a3.mo66813a()) {
                String str12 = (String) a3.mo66814b();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                qhf qhf14 = (qhf) da.f164949b;
                str12.getClass();
                qhf14.f41319a |= 32;
                qhf14.f41325g = str12;
            }
        }
        if (qjw.mo24054a(qhf.class, 8)) {
            String packageName = context.getPackageName();
            try {
                int i3 = context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                qhf qhf15 = (qhf) da.f164949b;
                qhf15.f41319a |= 128;
                qhf15.f41327i = i3;
            } catch (PackageManager.NameNotFoundException e) {
                f41437a.mo25419f("Our own package not found: %s.", e, packageName);
            }
        }
        return (qhf) da.mo74062i();
    }
}
