package p000;

import android.accounts.Account;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.format.DateFormat;
import android.util.Log;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: axmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axmo {

    /* renamed from: a */
    static final RequestQueue f96196a = rpr.m34216b().getRequestQueue();

    /* renamed from: a */
    private static bzvq m82726a(int i) {
        bxvd da = bzvq.f171540c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzvq bzvq = (bzvq) da.f164949b;
        bzvq.f171543b = i;
        bzvq.f171542a |= 1;
        return (bzvq) da.mo74062i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x025d A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x025e A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0278 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0279 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0292 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0293 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02b1 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02b2 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02ce A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02cf A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02f6 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02f7 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0327 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0333 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0341 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0342 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0364 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0365 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0379 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x037a A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0397 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0398 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03a5 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0489 A[SYNTHETIC, Splitter:B:169:0x0489] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008e A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008f A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c3 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c4 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00db A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00dc A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010f A[SYNTHETIC, Splitter:B:53:0x010f] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0138 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0139 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0158 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0159 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x017d A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x017e A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0195 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0196 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b0 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01b1 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01cb A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01cc A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01e4 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01e5 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x020c A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x020d A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0227 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0228 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0242 A[Catch:{ IOException -> 0x048a }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0243 A[Catch:{ IOException -> 0x048a }] */
    /* renamed from: a */
    public static RequestFuture m82727a(String str, Account account, bxxc bxxc, bxxc bxxc2, int i) {
        char c;
        bxvd da;
        bxvd da2;
        PackageInfo packageInfo;
        bxvd da3;
        bxvd da4;
        String country;
        String variant;
        String str2;
        int i2;
        String str3;
        String str4;
        String str5 = str;
        if (Log.isLoggable("WalletP2PRpc", 4)) {
            Log.i("WalletP2PRpc", str.length() == 0 ? new String("Calling RPC: ") : "Calling RPC: ".concat(str5));
        }
        RequestFuture newFuture = RequestFuture.newFuture();
        sdo.m34977c(str);
        try {
            String a = axmb.m82712a();
            int hashCode = a.hashCode();
            if (hashCode != -1711584601) {
                if (hashCode != 72607563) {
                    if (hashCode == 1928147227 && a.equals("DEVELOPMENT")) {
                        c = 1;
                        String format = String.format("%s/%s", c == 0 ? c != 1 ? c != 2 ? "https://clients5.google.com/cm" : "http://localhost:25005/cm" : "https://wallet-dev.sandbox.google.com/cm" : "https://wallet-web.sandbox.google.com/cm", str5);
                        da = bzvm.f171524g.mo74144da();
                        da2 = bzvj.f171518d.mo74144da();
                        if (!da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bzvj bzvj = (bzvj) da2.f164949b;
                        bzvj.f171520a |= 1;
                        bzvj.f171521b = false;
                        bzvr bzvr = (bzvr) bzvs.f171544b.mo74144da();
                        bzvr.mo74583a(m82726a(100));
                        bzvr.mo74583a(m82726a(102));
                        bzvs bzvs = (bzvs) bzvr.mo74062i();
                        if (!da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bzvj bzvj2 = (bzvj) da2.f164949b;
                        bzvs.getClass();
                        bzvj2.f171522c = bzvs;
                        bzvj2.f171520a |= 2;
                        if (!da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bzvm bzvm = (bzvm) da.f164949b;
                        bzvj bzvj3 = (bzvj) da2.mo74062i();
                        bzvj3.getClass();
                        bzvm.f171529d = bzvj3;
                        bzvm.f171526a |= 4;
                        packageInfo = rpr.m34216b().getPackageManager().getPackageInfo(rpr.m34216b().getPackageName(), 0);
                        if (packageInfo != null) {
                            String valueOf = String.valueOf(packageInfo.versionCode);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bzvm bzvm2 = (bzvm) da.f164949b;
                            valueOf.getClass();
                            bzvm2.f171526a |= 8;
                            bzvm2.f171530e = valueOf;
                        }
                        da3 = bzvx.f171563i.mo74144da();
                        if (!da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bzvx bzvx = (bzvx) da3.f164949b;
                        bzvx.f171569e = 1;
                        int i3 = bzvx.f171565a | 512;
                        bzvx.f171565a = i3;
                        bzvx.f171572h = 5;
                        bzvx.f171565a = i3 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                        String str6 = Build.DEVICE;
                        if (!da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bzvx bzvx2 = (bzvx) da3.f164949b;
                        str6.getClass();
                        bzvx2.f171565a |= 2048;
                        bzvx2.f171570f = str6;
                        long longValue = ((Long) axmc.f96175a.mo58455c()).longValue();
                        if (!da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bzvx bzvx3 = (bzvx) da3.f164949b;
                        bzvx3.f171565a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                        bzvx3.f171571g = longValue;
                        String str7 = Build.PRODUCT;
                        if (!da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bzvx bzvx4 = (bzvx) da3.f164949b;
                        str7.getClass();
                        bzvx4.f171565a |= 64;
                        bzvx4.f171566b = str7;
                        String str8 = Build.MODEL;
                        if (!da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bzvx bzvx5 = (bzvx) da3.f164949b;
                        str8.getClass();
                        bzvx5.f171565a |= 128;
                        bzvx5.f171567c = str8;
                        String str9 = Build.MANUFACTURER;
                        if (!da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bzvx bzvx6 = (bzvx) da3.f164949b;
                        str9.getClass();
                        bzvx6.f171565a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        bzvx6.f171568d = str9;
                        if (!da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bzvm bzvm3 = (bzvm) da.f164949b;
                        bzvx bzvx7 = (bzvx) da3.mo74062i();
                        bzvx7.getClass();
                        bzvm3.f171527b = bzvx7;
                        bzvm3.f171526a |= 1;
                        da4 = bzvy.f171573n.mo74144da();
                        String a2 = axmb.m82712a();
                        if (!da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        bzvy bzvy = (bzvy) da4.f164949b;
                        a2.getClass();
                        bzvy.f171575a |= 16;
                        bzvy.f171576b = a2;
                        String str10 = Build.ID;
                        if (!da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        bzvy bzvy2 = (bzvy) da4.f164949b;
                        str10.getClass();
                        bzvy2.f171575a |= 32;
                        bzvy2.f171577c = str10;
                        String str11 = Build.TAGS;
                        if (!da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        bzvy bzvy3 = (bzvy) da4.f164949b;
                        str11.getClass();
                        bzvy3.f171575a |= 64;
                        bzvy3.f171578d = str11;
                        String str12 = Build.VERSION.RELEASE;
                        if (!da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        bzvy bzvy4 = (bzvy) da4.f164949b;
                        str12.getClass();
                        bzvy4.f171575a |= 1024;
                        bzvy4.f171580f = str12;
                        int i4 = Build.VERSION.SDK_INT;
                        if (!da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        bzvy bzvy5 = (bzvy) da4.f164949b;
                        bzvy5.f171575a |= 2048;
                        bzvy5.f171581g = i4;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        bzvy bzvy6 = (bzvy) da4.f164949b;
                        bzvy6.f171575a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                        bzvy6.f171583i = currentTimeMillis;
                        TimeZone timeZone = TimeZone.getDefault();
                        long rawOffset = (long) timeZone.getRawOffset();
                        if (!da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        bzvy bzvy7 = (bzvy) da4.f164949b;
                        bzvy7.f171575a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                        bzvy7.f171584j = rawOffset;
                        String id = timeZone.getID();
                        if (!da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        bzvy bzvy8 = (bzvy) da4.f164949b;
                        id.getClass();
                        int i5 = bzvy8.f171575a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                        bzvy8.f171575a = i5;
                        bzvy8.f171585k = id;
                        bzvy8.f171579e = 5;
                        bzvy8.f171575a = i5 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        Locale locale = Locale.getDefault();
                        String locale2 = locale.toString();
                        if (!da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        bzvy bzvy9 = (bzvy) da4.f164949b;
                        locale2.getClass();
                        bzvy9.f171575a |= 4096;
                        bzvy9.f171582h = locale2;
                        StringBuilder sb = new StringBuilder();
                        sb.append(locale.getLanguage());
                        country = locale.getCountry();
                        variant = locale.getVariant();
                        if (!country.isEmpty()) {
                            sb.append('-');
                            sb.append(country);
                        }
                        if (!variant.isEmpty()) {
                            sb.append('-');
                            sb.append(variant);
                        }
                        String sb2 = sb.toString();
                        if (!da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        bzvy bzvy10 = (bzvy) da4.f164949b;
                        sb2.getClass();
                        bzvy10.f171575a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                        bzvy10.f171586l = sb2;
                        boolean z = !DateFormat.is24HourFormat(rpr.m34216b());
                        if (!da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        bzvy bzvy11 = (bzvy) da4.f164949b;
                        bzvy11.f171575a = 262144 | bzvy11.f171575a;
                        bzvy11.f171587m = z;
                        if (!da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bzvm bzvm4 = (bzvm) da.f164949b;
                        bzvy bzvy12 = (bzvy) da4.mo74062i();
                        bzvy12.getClass();
                        bzvm4.f171528c = bzvy12;
                        bzvm4.f171526a |= 2;
                        if (!da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bzvm bzvm5 = (bzvm) da.f164949b;
                        int i6 = i - 1;
                        if (i == 0) {
                            bzvm5.f171531f = i6;
                            bzvm5.f171526a |= 16;
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            beqo.m95442a((bzvm) da.mo74062i(), byteArrayOutputStream);
                            beqo.m95442a(bxxc, byteArrayOutputStream);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            rpr b = rpr.m34216b();
                            boolean a3 = axmb.m82713a(axmb.m82712a());
                            if (chle.f188742a.mo6606a().mo85324a()) {
                                str4 = !a3 ? "oauth2:https://www.googleapis.com/auth/sierrasandbox https://www.googleapis.com/auth/walletsandbox https://www.googleapis.com/auth/googlepay.nonprod" : "oauth2:https://www.googleapis.com/auth/sierra https://www.googleapis.com/auth/wallet https://www.googleapis.com/auth/googlepay";
                            } else if (!a3) {
                                str2 = "oauth2:https://www.googleapis.com/auth/sierrasandbox https://www.googleapis.com/auth/walletsandbox";
                                axmj axmj = new axmj(b, format, byteArray, account, str2, bxxc2, newFuture, newFuture);
                                axmj.setShouldCache(false);
                                Locale locale3 = Locale.getDefault();
                                PackageInfo packageInfo2 = rpr.m34216b().getPackageManager().getPackageInfo(rpr.m34216b().getPackageName(), 0);
                                str3 = packageInfo2.versionName;
                                i2 = packageInfo2.versionCode;
                                axmj.mo53245a("User-Agent", String.format("walletp2p %s-v%d (Android %s %s %s %s)", str3, Integer.valueOf(i2), Build.PRODUCT, Build.ID, Build.MODEL, Build.TAGS));
                                String language = locale3.getLanguage();
                                String country2 = locale3.getCountry();
                                StringBuilder sb3 = new StringBuilder(String.valueOf(language).length() + 1 + String.valueOf(country2).length());
                                sb3.append(language);
                                sb3.append("-");
                                sb3.append(country2);
                                axmj.mo53245a("Accept-Language", sb3.toString());
                                f96196a.add(axmj);
                                return newFuture;
                            } else {
                                str4 = "oauth2:https://www.googleapis.com/auth/sierra https://www.googleapis.com/auth/wallet";
                            }
                            str2 = str4;
                            axmj axmj2 = new axmj(b, format, byteArray, account, str2, bxxc2, newFuture, newFuture);
                            axmj2.setShouldCache(false);
                            Locale locale32 = Locale.getDefault();
                            try {
                                PackageInfo packageInfo22 = rpr.m34216b().getPackageManager().getPackageInfo(rpr.m34216b().getPackageName(), 0);
                                str3 = packageInfo22.versionName;
                                try {
                                    i2 = packageInfo22.versionCode;
                                } catch (PackageManager.NameNotFoundException e) {
                                    i2 = -1;
                                    axmj2.mo53245a("User-Agent", String.format("walletp2p %s-v%d (Android %s %s %s %s)", str3, Integer.valueOf(i2), Build.PRODUCT, Build.ID, Build.MODEL, Build.TAGS));
                                    String language2 = locale32.getLanguage();
                                    String country22 = locale32.getCountry();
                                    StringBuilder sb32 = new StringBuilder(String.valueOf(language2).length() + 1 + String.valueOf(country22).length());
                                    sb32.append(language2);
                                    sb32.append("-");
                                    sb32.append(country22);
                                    axmj2.mo53245a("Accept-Language", sb32.toString());
                                    f96196a.add(axmj2);
                                    return newFuture;
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                str3 = "NOT_AVAILABLE";
                                i2 = -1;
                                axmj2.mo53245a("User-Agent", String.format("walletp2p %s-v%d (Android %s %s %s %s)", str3, Integer.valueOf(i2), Build.PRODUCT, Build.ID, Build.MODEL, Build.TAGS));
                                String language22 = locale32.getLanguage();
                                String country222 = locale32.getCountry();
                                StringBuilder sb322 = new StringBuilder(String.valueOf(language22).length() + 1 + String.valueOf(country222).length());
                                sb322.append(language22);
                                sb322.append("-");
                                sb322.append(country222);
                                axmj2.mo53245a("Accept-Language", sb322.toString());
                                f96196a.add(axmj2);
                                return newFuture;
                            }
                            axmj2.mo53245a("User-Agent", String.format("walletp2p %s-v%d (Android %s %s %s %s)", str3, Integer.valueOf(i2), Build.PRODUCT, Build.ID, Build.MODEL, Build.TAGS));
                            String language222 = locale32.getLanguage();
                            String country2222 = locale32.getCountry();
                            StringBuilder sb3222 = new StringBuilder(String.valueOf(language222).length() + 1 + String.valueOf(country2222).length());
                            sb3222.append(language222);
                            sb3222.append("-");
                            sb3222.append(country2222);
                            axmj2.mo53245a("Accept-Language", sb3222.toString());
                            f96196a.add(axmj2);
                            return newFuture;
                        }
                        throw null;
                    }
                } else if (a.equals("LOCAL")) {
                    c = 2;
                    String format2 = String.format("%s/%s", c == 0 ? c != 1 ? c != 2 ? "https://clients5.google.com/cm" : "http://localhost:25005/cm" : "https://wallet-dev.sandbox.google.com/cm" : "https://wallet-web.sandbox.google.com/cm", str5);
                    da = bzvm.f171524g.mo74144da();
                    da2 = bzvj.f171518d.mo74144da();
                    if (!da2.f164950c) {
                    }
                    bzvj bzvj4 = (bzvj) da2.f164949b;
                    bzvj4.f171520a |= 1;
                    bzvj4.f171521b = false;
                    bzvr bzvr2 = (bzvr) bzvs.f171544b.mo74144da();
                    bzvr2.mo74583a(m82726a(100));
                    bzvr2.mo74583a(m82726a(102));
                    bzvs bzvs2 = (bzvs) bzvr2.mo74062i();
                    if (!da2.f164950c) {
                    }
                    bzvj bzvj22 = (bzvj) da2.f164949b;
                    bzvs2.getClass();
                    bzvj22.f171522c = bzvs2;
                    bzvj22.f171520a |= 2;
                    if (!da.f164950c) {
                    }
                    bzvm bzvm6 = (bzvm) da.f164949b;
                    bzvj bzvj32 = (bzvj) da2.mo74062i();
                    bzvj32.getClass();
                    bzvm6.f171529d = bzvj32;
                    bzvm6.f171526a |= 4;
                    packageInfo = rpr.m34216b().getPackageManager().getPackageInfo(rpr.m34216b().getPackageName(), 0);
                    if (packageInfo != null) {
                    }
                    da3 = bzvx.f171563i.mo74144da();
                    if (!da3.f164950c) {
                    }
                    bzvx bzvx8 = (bzvx) da3.f164949b;
                    bzvx8.f171569e = 1;
                    int i32 = bzvx8.f171565a | 512;
                    bzvx8.f171565a = i32;
                    bzvx8.f171572h = 5;
                    bzvx8.f171565a = i32 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                    String str62 = Build.DEVICE;
                    if (!da3.f164950c) {
                    }
                    bzvx bzvx22 = (bzvx) da3.f164949b;
                    str62.getClass();
                    bzvx22.f171565a |= 2048;
                    bzvx22.f171570f = str62;
                    long longValue2 = ((Long) axmc.f96175a.mo58455c()).longValue();
                    if (!da3.f164950c) {
                    }
                    bzvx bzvx32 = (bzvx) da3.f164949b;
                    bzvx32.f171565a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                    bzvx32.f171571g = longValue2;
                    String str72 = Build.PRODUCT;
                    if (!da3.f164950c) {
                    }
                    bzvx bzvx42 = (bzvx) da3.f164949b;
                    str72.getClass();
                    bzvx42.f171565a |= 64;
                    bzvx42.f171566b = str72;
                    String str82 = Build.MODEL;
                    if (!da3.f164950c) {
                    }
                    bzvx bzvx52 = (bzvx) da3.f164949b;
                    str82.getClass();
                    bzvx52.f171565a |= 128;
                    bzvx52.f171567c = str82;
                    String str92 = Build.MANUFACTURER;
                    if (!da3.f164950c) {
                    }
                    bzvx bzvx62 = (bzvx) da3.f164949b;
                    str92.getClass();
                    bzvx62.f171565a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    bzvx62.f171568d = str92;
                    if (!da.f164950c) {
                    }
                    bzvm bzvm32 = (bzvm) da.f164949b;
                    bzvx bzvx72 = (bzvx) da3.mo74062i();
                    bzvx72.getClass();
                    bzvm32.f171527b = bzvx72;
                    bzvm32.f171526a |= 1;
                    da4 = bzvy.f171573n.mo74144da();
                    String a22 = axmb.m82712a();
                    if (!da4.f164950c) {
                    }
                    bzvy bzvy13 = (bzvy) da4.f164949b;
                    a22.getClass();
                    bzvy13.f171575a |= 16;
                    bzvy13.f171576b = a22;
                    String str102 = Build.ID;
                    if (!da4.f164950c) {
                    }
                    bzvy bzvy22 = (bzvy) da4.f164949b;
                    str102.getClass();
                    bzvy22.f171575a |= 32;
                    bzvy22.f171577c = str102;
                    String str112 = Build.TAGS;
                    if (!da4.f164950c) {
                    }
                    bzvy bzvy32 = (bzvy) da4.f164949b;
                    str112.getClass();
                    bzvy32.f171575a |= 64;
                    bzvy32.f171578d = str112;
                    String str122 = Build.VERSION.RELEASE;
                    if (!da4.f164950c) {
                    }
                    bzvy bzvy42 = (bzvy) da4.f164949b;
                    str122.getClass();
                    bzvy42.f171575a |= 1024;
                    bzvy42.f171580f = str122;
                    int i42 = Build.VERSION.SDK_INT;
                    if (!da4.f164950c) {
                    }
                    bzvy bzvy52 = (bzvy) da4.f164949b;
                    bzvy52.f171575a |= 2048;
                    bzvy52.f171581g = i42;
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (!da4.f164950c) {
                    }
                    bzvy bzvy62 = (bzvy) da4.f164949b;
                    bzvy62.f171575a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                    bzvy62.f171583i = currentTimeMillis2;
                    TimeZone timeZone2 = TimeZone.getDefault();
                    long rawOffset2 = (long) timeZone2.getRawOffset();
                    if (!da4.f164950c) {
                    }
                    bzvy bzvy72 = (bzvy) da4.f164949b;
                    bzvy72.f171575a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                    bzvy72.f171584j = rawOffset2;
                    String id2 = timeZone2.getID();
                    if (!da4.f164950c) {
                    }
                    bzvy bzvy82 = (bzvy) da4.f164949b;
                    id2.getClass();
                    int i52 = bzvy82.f171575a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                    bzvy82.f171575a = i52;
                    bzvy82.f171585k = id2;
                    bzvy82.f171579e = 5;
                    bzvy82.f171575a = i52 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    Locale locale4 = Locale.getDefault();
                    String locale22 = locale4.toString();
                    if (!da4.f164950c) {
                    }
                    bzvy bzvy92 = (bzvy) da4.f164949b;
                    locale22.getClass();
                    bzvy92.f171575a |= 4096;
                    bzvy92.f171582h = locale22;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(locale4.getLanguage());
                    country = locale4.getCountry();
                    variant = locale4.getVariant();
                    if (!country.isEmpty()) {
                    }
                    if (!variant.isEmpty()) {
                    }
                    String sb22 = sb4.toString();
                    if (!da4.f164950c) {
                    }
                    bzvy bzvy102 = (bzvy) da4.f164949b;
                    sb22.getClass();
                    bzvy102.f171575a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                    bzvy102.f171586l = sb22;
                    boolean z2 = !DateFormat.is24HourFormat(rpr.m34216b());
                    if (!da4.f164950c) {
                    }
                    bzvy bzvy112 = (bzvy) da4.f164949b;
                    bzvy112.f171575a = 262144 | bzvy112.f171575a;
                    bzvy112.f171587m = z2;
                    if (!da.f164950c) {
                    }
                    bzvm bzvm42 = (bzvm) da.f164949b;
                    bzvy bzvy122 = (bzvy) da4.mo74062i();
                    bzvy122.getClass();
                    bzvm42.f171528c = bzvy122;
                    bzvm42.f171526a |= 2;
                    if (!da.f164950c) {
                    }
                    bzvm bzvm52 = (bzvm) da.f164949b;
                    int i62 = i - 1;
                    if (i == 0) {
                    }
                }
            } else if (a.equals("SANDBOX")) {
                c = 0;
                String format22 = String.format("%s/%s", c == 0 ? c != 1 ? c != 2 ? "https://clients5.google.com/cm" : "http://localhost:25005/cm" : "https://wallet-dev.sandbox.google.com/cm" : "https://wallet-web.sandbox.google.com/cm", str5);
                da = bzvm.f171524g.mo74144da();
                da2 = bzvj.f171518d.mo74144da();
                if (!da2.f164950c) {
                }
                bzvj bzvj42 = (bzvj) da2.f164949b;
                bzvj42.f171520a |= 1;
                bzvj42.f171521b = false;
                bzvr bzvr22 = (bzvr) bzvs.f171544b.mo74144da();
                bzvr22.mo74583a(m82726a(100));
                bzvr22.mo74583a(m82726a(102));
                bzvs bzvs22 = (bzvs) bzvr22.mo74062i();
                if (!da2.f164950c) {
                }
                bzvj bzvj222 = (bzvj) da2.f164949b;
                bzvs22.getClass();
                bzvj222.f171522c = bzvs22;
                bzvj222.f171520a |= 2;
                if (!da.f164950c) {
                }
                bzvm bzvm62 = (bzvm) da.f164949b;
                bzvj bzvj322 = (bzvj) da2.mo74062i();
                bzvj322.getClass();
                bzvm62.f171529d = bzvj322;
                bzvm62.f171526a |= 4;
                packageInfo = rpr.m34216b().getPackageManager().getPackageInfo(rpr.m34216b().getPackageName(), 0);
                if (packageInfo != null) {
                }
                da3 = bzvx.f171563i.mo74144da();
                if (!da3.f164950c) {
                }
                bzvx bzvx82 = (bzvx) da3.f164949b;
                bzvx82.f171569e = 1;
                int i322 = bzvx82.f171565a | 512;
                bzvx82.f171565a = i322;
                bzvx82.f171572h = 5;
                bzvx82.f171565a = i322 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                String str622 = Build.DEVICE;
                if (!da3.f164950c) {
                }
                bzvx bzvx222 = (bzvx) da3.f164949b;
                str622.getClass();
                bzvx222.f171565a |= 2048;
                bzvx222.f171570f = str622;
                long longValue22 = ((Long) axmc.f96175a.mo58455c()).longValue();
                if (!da3.f164950c) {
                }
                bzvx bzvx322 = (bzvx) da3.f164949b;
                bzvx322.f171565a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                bzvx322.f171571g = longValue22;
                String str722 = Build.PRODUCT;
                if (!da3.f164950c) {
                }
                bzvx bzvx422 = (bzvx) da3.f164949b;
                str722.getClass();
                bzvx422.f171565a |= 64;
                bzvx422.f171566b = str722;
                String str822 = Build.MODEL;
                if (!da3.f164950c) {
                }
                bzvx bzvx522 = (bzvx) da3.f164949b;
                str822.getClass();
                bzvx522.f171565a |= 128;
                bzvx522.f171567c = str822;
                String str922 = Build.MANUFACTURER;
                if (!da3.f164950c) {
                }
                bzvx bzvx622 = (bzvx) da3.f164949b;
                str922.getClass();
                bzvx622.f171565a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                bzvx622.f171568d = str922;
                if (!da.f164950c) {
                }
                bzvm bzvm322 = (bzvm) da.f164949b;
                bzvx bzvx722 = (bzvx) da3.mo74062i();
                bzvx722.getClass();
                bzvm322.f171527b = bzvx722;
                bzvm322.f171526a |= 1;
                da4 = bzvy.f171573n.mo74144da();
                String a222 = axmb.m82712a();
                if (!da4.f164950c) {
                }
                bzvy bzvy132 = (bzvy) da4.f164949b;
                a222.getClass();
                bzvy132.f171575a |= 16;
                bzvy132.f171576b = a222;
                String str1022 = Build.ID;
                if (!da4.f164950c) {
                }
                bzvy bzvy222 = (bzvy) da4.f164949b;
                str1022.getClass();
                bzvy222.f171575a |= 32;
                bzvy222.f171577c = str1022;
                String str1122 = Build.TAGS;
                if (!da4.f164950c) {
                }
                bzvy bzvy322 = (bzvy) da4.f164949b;
                str1122.getClass();
                bzvy322.f171575a |= 64;
                bzvy322.f171578d = str1122;
                String str1222 = Build.VERSION.RELEASE;
                if (!da4.f164950c) {
                }
                bzvy bzvy422 = (bzvy) da4.f164949b;
                str1222.getClass();
                bzvy422.f171575a |= 1024;
                bzvy422.f171580f = str1222;
                int i422 = Build.VERSION.SDK_INT;
                if (!da4.f164950c) {
                }
                bzvy bzvy522 = (bzvy) da4.f164949b;
                bzvy522.f171575a |= 2048;
                bzvy522.f171581g = i422;
                long currentTimeMillis22 = System.currentTimeMillis();
                if (!da4.f164950c) {
                }
                bzvy bzvy622 = (bzvy) da4.f164949b;
                bzvy622.f171575a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                bzvy622.f171583i = currentTimeMillis22;
                TimeZone timeZone22 = TimeZone.getDefault();
                long rawOffset22 = (long) timeZone22.getRawOffset();
                if (!da4.f164950c) {
                }
                bzvy bzvy722 = (bzvy) da4.f164949b;
                bzvy722.f171575a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                bzvy722.f171584j = rawOffset22;
                String id22 = timeZone22.getID();
                if (!da4.f164950c) {
                }
                bzvy bzvy822 = (bzvy) da4.f164949b;
                id22.getClass();
                int i522 = bzvy822.f171575a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                bzvy822.f171575a = i522;
                bzvy822.f171585k = id22;
                bzvy822.f171579e = 5;
                bzvy822.f171575a = i522 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                Locale locale42 = Locale.getDefault();
                String locale222 = locale42.toString();
                if (!da4.f164950c) {
                }
                bzvy bzvy922 = (bzvy) da4.f164949b;
                locale222.getClass();
                bzvy922.f171575a |= 4096;
                bzvy922.f171582h = locale222;
                StringBuilder sb42 = new StringBuilder();
                sb42.append(locale42.getLanguage());
                country = locale42.getCountry();
                variant = locale42.getVariant();
                if (!country.isEmpty()) {
                }
                if (!variant.isEmpty()) {
                }
                String sb222 = sb42.toString();
                if (!da4.f164950c) {
                }
                bzvy bzvy1022 = (bzvy) da4.f164949b;
                sb222.getClass();
                bzvy1022.f171575a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                bzvy1022.f171586l = sb222;
                boolean z22 = !DateFormat.is24HourFormat(rpr.m34216b());
                if (!da4.f164950c) {
                }
                bzvy bzvy1122 = (bzvy) da4.f164949b;
                bzvy1122.f171575a = 262144 | bzvy1122.f171575a;
                bzvy1122.f171587m = z22;
                if (!da.f164950c) {
                }
                bzvm bzvm422 = (bzvm) da.f164949b;
                bzvy bzvy1222 = (bzvy) da4.mo74062i();
                bzvy1222.getClass();
                bzvm422.f171528c = bzvy1222;
                bzvm422.f171526a |= 2;
                if (!da.f164950c) {
                }
                bzvm bzvm522 = (bzvm) da.f164949b;
                int i622 = i - 1;
                if (i == 0) {
                }
            }
            c = 65535;
            String format222 = String.format("%s/%s", c == 0 ? c != 1 ? c != 2 ? "https://clients5.google.com/cm" : "http://localhost:25005/cm" : "https://wallet-dev.sandbox.google.com/cm" : "https://wallet-web.sandbox.google.com/cm", str5);
            da = bzvm.f171524g.mo74144da();
            da2 = bzvj.f171518d.mo74144da();
            if (!da2.f164950c) {
            }
            bzvj bzvj422 = (bzvj) da2.f164949b;
            bzvj422.f171520a |= 1;
            bzvj422.f171521b = false;
            bzvr bzvr222 = (bzvr) bzvs.f171544b.mo74144da();
            bzvr222.mo74583a(m82726a(100));
            bzvr222.mo74583a(m82726a(102));
            bzvs bzvs222 = (bzvs) bzvr222.mo74062i();
            if (!da2.f164950c) {
            }
            bzvj bzvj2222 = (bzvj) da2.f164949b;
            bzvs222.getClass();
            bzvj2222.f171522c = bzvs222;
            bzvj2222.f171520a |= 2;
            if (!da.f164950c) {
            }
            bzvm bzvm622 = (bzvm) da.f164949b;
            bzvj bzvj3222 = (bzvj) da2.mo74062i();
            bzvj3222.getClass();
            bzvm622.f171529d = bzvj3222;
            bzvm622.f171526a |= 4;
            try {
                packageInfo = rpr.m34216b().getPackageManager().getPackageInfo(rpr.m34216b().getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e3) {
                packageInfo = null;
            }
            if (packageInfo != null) {
            }
            da3 = bzvx.f171563i.mo74144da();
            if (!da3.f164950c) {
            }
            bzvx bzvx822 = (bzvx) da3.f164949b;
            bzvx822.f171569e = 1;
            int i3222 = bzvx822.f171565a | 512;
            bzvx822.f171565a = i3222;
            bzvx822.f171572h = 5;
            bzvx822.f171565a = i3222 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
            String str6222 = Build.DEVICE;
            if (!da3.f164950c) {
            }
            bzvx bzvx2222 = (bzvx) da3.f164949b;
            str6222.getClass();
            bzvx2222.f171565a |= 2048;
            bzvx2222.f171570f = str6222;
            long longValue222 = ((Long) axmc.f96175a.mo58455c()).longValue();
            if (!da3.f164950c) {
            }
            bzvx bzvx3222 = (bzvx) da3.f164949b;
            bzvx3222.f171565a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            bzvx3222.f171571g = longValue222;
            String str7222 = Build.PRODUCT;
            if (!da3.f164950c) {
            }
            bzvx bzvx4222 = (bzvx) da3.f164949b;
            str7222.getClass();
            bzvx4222.f171565a |= 64;
            bzvx4222.f171566b = str7222;
            String str8222 = Build.MODEL;
            if (!da3.f164950c) {
            }
            bzvx bzvx5222 = (bzvx) da3.f164949b;
            str8222.getClass();
            bzvx5222.f171565a |= 128;
            bzvx5222.f171567c = str8222;
            String str9222 = Build.MANUFACTURER;
            if (!da3.f164950c) {
            }
            bzvx bzvx6222 = (bzvx) da3.f164949b;
            str9222.getClass();
            bzvx6222.f171565a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bzvx6222.f171568d = str9222;
            if (!da.f164950c) {
            }
            bzvm bzvm3222 = (bzvm) da.f164949b;
            bzvx bzvx7222 = (bzvx) da3.mo74062i();
            bzvx7222.getClass();
            bzvm3222.f171527b = bzvx7222;
            bzvm3222.f171526a |= 1;
            da4 = bzvy.f171573n.mo74144da();
            String a2222 = axmb.m82712a();
            if (!da4.f164950c) {
            }
            bzvy bzvy1322 = (bzvy) da4.f164949b;
            a2222.getClass();
            bzvy1322.f171575a |= 16;
            bzvy1322.f171576b = a2222;
            String str10222 = Build.ID;
            if (!da4.f164950c) {
            }
            bzvy bzvy2222 = (bzvy) da4.f164949b;
            str10222.getClass();
            bzvy2222.f171575a |= 32;
            bzvy2222.f171577c = str10222;
            String str11222 = Build.TAGS;
            if (!da4.f164950c) {
            }
            bzvy bzvy3222 = (bzvy) da4.f164949b;
            str11222.getClass();
            bzvy3222.f171575a |= 64;
            bzvy3222.f171578d = str11222;
            String str12222 = Build.VERSION.RELEASE;
            if (!da4.f164950c) {
            }
            bzvy bzvy4222 = (bzvy) da4.f164949b;
            str12222.getClass();
            bzvy4222.f171575a |= 1024;
            bzvy4222.f171580f = str12222;
            int i4222 = Build.VERSION.SDK_INT;
            if (!da4.f164950c) {
            }
            bzvy bzvy5222 = (bzvy) da4.f164949b;
            bzvy5222.f171575a |= 2048;
            bzvy5222.f171581g = i4222;
            long currentTimeMillis222 = System.currentTimeMillis();
            if (!da4.f164950c) {
            }
            bzvy bzvy6222 = (bzvy) da4.f164949b;
            bzvy6222.f171575a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            bzvy6222.f171583i = currentTimeMillis222;
            TimeZone timeZone222 = TimeZone.getDefault();
            long rawOffset222 = (long) timeZone222.getRawOffset();
            if (!da4.f164950c) {
            }
            bzvy bzvy7222 = (bzvy) da4.f164949b;
            bzvy7222.f171575a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
            bzvy7222.f171584j = rawOffset222;
            String id222 = timeZone222.getID();
            if (!da4.f164950c) {
            }
            bzvy bzvy8222 = (bzvy) da4.f164949b;
            id222.getClass();
            int i5222 = bzvy8222.f171575a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
            bzvy8222.f171575a = i5222;
            bzvy8222.f171585k = id222;
            bzvy8222.f171579e = 5;
            bzvy8222.f171575a = i5222 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            Locale locale422 = Locale.getDefault();
            String locale2222 = locale422.toString();
            if (!da4.f164950c) {
            }
            bzvy bzvy9222 = (bzvy) da4.f164949b;
            locale2222.getClass();
            bzvy9222.f171575a |= 4096;
            bzvy9222.f171582h = locale2222;
            StringBuilder sb422 = new StringBuilder();
            sb422.append(locale422.getLanguage());
            country = locale422.getCountry();
            variant = locale422.getVariant();
            if (!country.isEmpty()) {
            }
            if (!variant.isEmpty()) {
            }
            String sb2222 = sb422.toString();
            if (!da4.f164950c) {
            }
            bzvy bzvy10222 = (bzvy) da4.f164949b;
            sb2222.getClass();
            bzvy10222.f171575a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            bzvy10222.f171586l = sb2222;
            boolean z222 = !DateFormat.is24HourFormat(rpr.m34216b());
            if (!da4.f164950c) {
            }
            bzvy bzvy11222 = (bzvy) da4.f164949b;
            bzvy11222.f171575a = 262144 | bzvy11222.f171575a;
            bzvy11222.f171587m = z222;
            if (!da.f164950c) {
            }
            bzvm bzvm4222 = (bzvm) da.f164949b;
            bzvy bzvy12222 = (bzvy) da4.mo74062i();
            bzvy12222.getClass();
            bzvm4222.f171528c = bzvy12222;
            bzvm4222.f171526a |= 2;
            if (!da.f164950c) {
            }
            bzvm bzvm5222 = (bzvm) da.f164949b;
            int i6222 = i - 1;
            if (i == 0) {
            }
        } catch (IOException e4) {
            throw new IllegalArgumentException(e4);
        }
    }
}
