package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;

/* renamed from: qay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qay {

    /* renamed from: a */
    public static final String f40845a = String.format(Locale.ROOT, "CastSDK/%d", 201515033);

    /* renamed from: b */
    private static final ptx f40846b = new qav("Utils");

    /* renamed from: c */
    private static final Random f40847c = new Random(SystemClock.elapsedRealtime());

    /* renamed from: d */
    private static final String[] f40848d = ccxv.f180201a.mo6606a().mo77015a().split("\\s+");

    /* renamed from: e */
    private static final bnic f40849e = bnic.m109490a("android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_WIFI_STATE");

    /* renamed from: a */
    public static long m31777a() {
        return f40847c.nextLong();
    }

    /* renamed from: b */
    public static SharedPreferences m31785b(Context context) {
        return context.getSharedPreferences("google_cast", 0);
    }

    /* renamed from: c */
    public static boolean m31789c() {
        if (!cday.f180398a.mo6606a().mo77186h()) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    /* renamed from: d */
    public static void m31792d() {
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static bltw m31778a(List list, List list2) {
        boolean z;
        boolean z2;
        byte[] bArr;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (list2 == null || list2.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            if (!ccxg.m131999b()) {
                return null;
            }
            if (z2 && ccxg.m131999b()) {
                return null;
            }
        }
        bxvd da = bltw.f127753c.mo74144da();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ScanResult scanResult = (ScanResult) it.next();
                if (scanResult.SSID == null || !m31783a(scanResult.SSID)) {
                    Object[] objArr = {scanResult.SSID, scanResult.BSSID, Integer.valueOf(scanResult.level)};
                    bxvd da2 = blub.f127773e.mo74144da();
                    String upperCase = scanResult.BSSID.toUpperCase(Locale.ROOT);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    blub blub = (blub) da2.f164949b;
                    upperCase.getClass();
                    blub.f127775a |= 1;
                    blub.f127776b = upperCase;
                    int i = scanResult.level;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    blub blub2 = (blub) da2.f164949b;
                    blub2.f127775a |= 2;
                    blub2.f127777c = i;
                    int i2 = scanResult.frequency;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    blub blub3 = (blub) da2.f164949b;
                    blub3.f127775a |= 4;
                    blub3.f127778d = i2;
                    blub blub4 = (blub) da2.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bltw bltw = (bltw) da.f164949b;
                    blub4.getClass();
                    if (!bltw.f127755a.mo73666a()) {
                        bltw.f127755a = bxvk.m124021a(bltw.f127755a);
                    }
                    bltw.f127755a.add(blub4);
                }
            }
            f40846b.mo23670a("Number of wifi environment scan results: %d", Integer.valueOf(((bltw) da.f164949b).f127755a.size()));
        }
        if (list2 != null && ccxg.m131999b()) {
            int size = list2.size();
            for (int i3 = 0; i3 < size; i3++) {
                String str = (String) list2.get(i3);
                bxvd da3 = blua.f127769c.mo74144da();
                int length = str.length();
                if (length >= 2 && (length & 1) == 0) {
                    bArr = new byte[(length >> 1)];
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            break;
                        }
                        int digit = Character.digit(str.charAt(i4), 16);
                        int digit2 = Character.digit(str.charAt(i4 + 1), 16);
                        if (digit != -1) {
                            if (digit2 == -1) {
                                break;
                            }
                            bArr[i4 / 2] = (byte) ((digit << 4) + digit2);
                            i4 += 2;
                        } else {
                            bArr = null;
                            break;
                        }
                    }
                }
                bArr = null;
                bxtx a = bxtx.m123261a(bArr);
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                blua blua = (blua) da3.f164949b;
                a.getClass();
                blua.f127771a |= 1;
                blua.f127772b = a;
                blua blua2 = (blua) da3.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bltw bltw2 = (bltw) da.f164949b;
                blua2.getClass();
                if (!bltw2.f127756b.mo73666a()) {
                    bltw2.f127756b = bxvk.m124021a(bltw2.f127756b);
                }
                bltw2.f127756b.add(blua2);
            }
            f40846b.mo23670a("Number of ble environment scan results: %d", Integer.valueOf(((bltw) da.f164949b).f127756b.size()));
        }
        return (bltw) da.mo74062i();
    }

    /* renamed from: b */
    public static SharedPreferences m31786b(Context context, String str) {
        return context.getSharedPreferences(str, 0);
    }

    /* renamed from: b */
    public static String m31787b(String str) {
        if (!str.startsWith("%")) {
            return str;
        }
        byte[] digest = spn.m35868b("SHA-1").digest(str.substring(1).getBytes(ptw.f40213a));
        int length = digest.length;
        StringBuilder sb = new StringBuilder(length + length + 1);
        sb.append("%");
        for (int i = 0; i < length; i++) {
            sb.append(String.format("%02X", Byte.valueOf(digest[i])));
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static boolean m31790c(Context context) {
        int i = Build.VERSION.SDK_INT;
        bnrd a = f40849e.iterator();
        while (a.hasNext()) {
            String str = (String) a.next();
            if (C1133kh.m17835a(context, str) != 0) {
                f40846b.mo23675c("%s is not granted. Don't request WiFi scan results for guest mode.", str);
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m31791c(String str) {
        for (String str2 : f40848d) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m31788b() {
        int i = Build.VERSION.SDK_INT;
        return ccxy.f180226a.mo6606a().mo77045g();
    }

    /* renamed from: a */
    public static String m31779a(String str, long j, String str2) {
        MessageDigest b = spn.m35868b("SHA-1");
        b.update(Long.toString(j).getBytes());
        int length = str2.length();
        byte[] digest = b.digest(str.getBytes(ptw.f40213a));
        int length2 = digest.length;
        StringBuilder sb = new StringBuilder(length + length2 + length2);
        sb.append(str2);
        for (int i = 0; i < length2; i++) {
            sb.append(String.format("%02X", Byte.valueOf(digest[i])));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m31780a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i = 0; i < length; i++) {
            sb.append(String.format("%02X", Byte.valueOf(bArr[i])));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m31781a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1;
    }

    /* renamed from: a */
    public static boolean m31782a(Context context, String str) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    spn.m35872c(context, str);
                    rfz.m33557a(context).mo24605a(str);
                    return true;
                }
            } catch (IllegalArgumentException | SecurityException e) {
                return false;
            }
        }
        throw new IllegalArgumentException("Context and packageName cannot be null or empty");
    }

    /* renamed from: a */
    public static boolean m31783a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Null ssid");
        } else if (str.length() >= 6) {
            return str.toLowerCase(Locale.ENGLISH).endsWith("_nomap");
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m31784a(List list, IntentFilter intentFilter) {
        boolean z;
        int size = list.size();
        int i = 0;
        while (i < size) {
            IntentFilter intentFilter2 = (IntentFilter) list.get(i);
            if (intentFilter == null && intentFilter2 == null) {
                z = true;
            } else if (intentFilter == null) {
                z = false;
            } else {
                if (intentFilter2 != null && intentFilter.countCategories() == intentFilter2.countCategories() && intentFilter.countActions() == intentFilter2.countActions() && intentFilter.countDataSchemes() == intentFilter2.countDataSchemes() && intentFilter.countDataTypes() == intentFilter2.countDataTypes()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < intentFilter.countCategories()) {
                            if (!intentFilter.getCategory(i2).equals(intentFilter2.getCategory(i2))) {
                                z = false;
                                break;
                            }
                            i2++;
                        } else {
                            int i3 = 0;
                            while (true) {
                                if (i3 < intentFilter.countActions()) {
                                    if (!intentFilter.getAction(i3).equals(intentFilter2.getAction(i3))) {
                                        z = false;
                                        break;
                                    }
                                    i3++;
                                } else {
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 < intentFilter.countDataSchemes()) {
                                            if (!intentFilter.getDataScheme(i4).equals(intentFilter2.getDataScheme(i4))) {
                                                z = false;
                                                break;
                                            }
                                            i4++;
                                        } else {
                                            int i5 = 0;
                                            while (true) {
                                                if (i5 < intentFilter.countDataTypes()) {
                                                    if (!intentFilter.getDataType(i5).equals(intentFilter2.getDataType(i5))) {
                                                        break;
                                                    }
                                                    i5++;
                                                } else {
                                                    z = true;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                z = false;
            }
            i++;
            if (z) {
                return true;
            }
        }
        return false;
    }
}
