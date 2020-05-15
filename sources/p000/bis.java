package p000;

import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: bis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bis implements bit {
    public bis() {
    }

    /* renamed from: a */
    public static final bin m3127a(Exception exc) {
        bin bin;
        return (!(exc instanceof bic) || (bin = ((bic) exc).f3290a) == null) ? bib.f3275e : bin;
    }

    public bis(bif bif, bie bie) {
        bix a = biy.m3166a();
        a.f3352h = bie;
        a.f3353i = new biq(bif);
    }

    /* renamed from: a */
    public static final void m3128a(bin bin, bin bin2, String str) {
        String replace = "2.1.0".replace(".", "");
        String str2 = bin2.f3321c;
        StringBuilder sb = new StringBuilder(String.valueOf(replace).length() + str.length() + String.valueOf(str2).length());
        sb.append(replace);
        sb.append(str);
        sb.append(str2);
        bin.f3322d = sb.toString();
        String str3 = bin2.f3323e;
        if (str.compareToIgnoreCase("07") == 0) {
            bix a = biy.m3166a();
            if (a.f3347c[33] == 92 && a.mo3184d(335633)) {
                String valueOf = String.valueOf(str3);
                String a2 = bji.m3201a(a.mo3182c(335633));
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 8 + String.valueOf(a2).length());
                sb2.append(valueOf);
                sb2.append(",AMOUNT=");
                sb2.append(a2);
                str3 = sb2.toString();
                a.f3347c[33] = -91;
            }
            if (a.mo3184d(335631)) {
                String valueOf2 = String.valueOf(str3);
                String a3 = bji.m3201a(a.mo3182c(335631));
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 15 + String.valueOf(a3).length());
                sb3.append(valueOf2);
                sb3.append(",MERCHANT_NAME=");
                sb3.append(a3);
                str3 = sb3.toString();
                a.f3347c[33] = 92;
            }
            if (a.mo3184d(335632)) {
                String valueOf3 = String.valueOf(str3);
                String a4 = bji.m3201a(a.mo3182c(335632));
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 15 + String.valueOf(a4).length());
                sb4.append(valueOf3);
                sb4.append(",MERCHANT_CODE=");
                sb4.append(a4);
                str3 = sb4.toString();
                a.f3347c[33] = 92;
            }
        }
        bin.f3323e = str3;
        bin.f3321c = bin2.f3321c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x02e9 A[Catch:{ Exception -> 0x037c, all -> 0x037a }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x02f6 A[Catch:{ Exception -> 0x037c, all -> 0x037a }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x02f7 A[Catch:{ Exception -> 0x037c, all -> 0x037a }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x030c A[Catch:{ Exception -> 0x037c, all -> 0x037a }] */
    /* renamed from: a */
    public final bil mo3165a() {
        boolean z;
        String str;
        byte[] bArr;
        String str2;
        String str3;
        bin bin = bib.f3271a;
        bil bil = new bil();
        try {
            bil bil2 = new bil();
            bix a = biy.m3166a();
            if (biw.OPERATION.f3341b != null) {
                String str4 = biw.OPERATION.f3342c;
                bix a2 = biy.m3166a();
                int i = 1;
                char c = 0;
                if (!a2.f3348d.isEmpty()) {
                    z = a2.f3347c[13] != 92;
                } else {
                    z = false;
                }
                if (z) {
                    if (a.f3347c[12] == 92) {
                        a.mo3191h(4);
                    }
                    if (a.f3347c[11] == 92) {
                        LinkedHashMap linkedHashMap = a.f3348d;
                        StringBuffer stringBuffer = new StringBuffer();
                        for (Integer num : linkedHashMap.keySet()) {
                            if (num.intValue() <= 335616) {
                                byte[] bArr2 = (byte[]) linkedHashMap.get(num);
                                Object[] objArr = new Object[i];
                                objArr[0] = Integer.valueOf(num.intValue());
                                String format = String.format("%06x", objArr);
                                Object[] objArr2 = new Object[i];
                                objArr2[0] = Integer.valueOf(bArr2.length);
                                String format2 = String.format("%04x", objArr2);
                                String a3 = bji.m3201a(bArr2);
                                StringBuilder sb = new StringBuilder(String.valueOf(format).length() + String.valueOf(format2).length() + String.valueOf(a3).length());
                                sb.append(format);
                                sb.append(format2);
                                sb.append(a3);
                                stringBuffer.append(sb.toString());
                                i = 1;
                                c = 0;
                            } else {
                                i = 1;
                                c = 0;
                            }
                        }
                        String stringBuffer2 = stringBuffer.toString();
                        Object[] objArr3 = new Object[i];
                        objArr3[c] = 8191;
                        String format3 = String.format("%04x", objArr3);
                        Object[] objArr4 = new Object[i];
                        objArr4[c] = Integer.valueOf(stringBuffer2.length() / 2);
                        String format4 = String.format("%04x", objArr4);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(format3).length() + String.valueOf(format4).length() + String.valueOf(stringBuffer2).length());
                        sb2.append(format3);
                        sb2.append(format4);
                        sb2.append(stringBuffer2);
                        String sb3 = sb2.toString();
                        String a4 = bji.m3201a(a.f3345a);
                        Object[] objArr5 = new Object[i];
                        objArr5[c] = 12287;
                        String format5 = String.format("%04x", objArr5);
                        Object[] objArr6 = new Object[i];
                        objArr6[c] = Integer.valueOf(a4.length() / 2);
                        String format6 = String.format("%04x", objArr6);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(format5).length() + String.valueOf(format6).length() + String.valueOf(a4).length());
                        sb4.append(format5);
                        sb4.append(format6);
                        sb4.append(a4);
                        String sb5 = sb4.toString();
                        Object[] objArr7 = new Object[i];
                        objArr7[c] = 45055;
                        String format7 = String.format("%04x", objArr7);
                        Object[] objArr8 = new Object[i];
                        objArr8[c] = (byte) 17;
                        String format8 = String.format("%02x", objArr8);
                        int length = String.valueOf(format7).length();
                        StringBuilder sb6 = new StringBuilder(length + 3 + String.valueOf(format8).length() + String.valueOf(sb3).length() + String.valueOf(sb5).length());
                        sb6.append('1');
                        sb6.append(format7);
                        sb6.append("01");
                        sb6.append(format8);
                        sb6.append(sb3);
                        sb6.append(sb5);
                        str3 = sb6.toString();
                    } else if (a.mo3184d(335636)) {
                        String a5 = bji.m3201a(a.mo3189g(335636));
                        StringBuilder sb7 = new StringBuilder(String.valueOf(a5).length() + 1);
                        sb7.append('1');
                        sb7.append(a5);
                        str3 = sb7.toString();
                    } else {
                        str3 = null;
                    }
                    if (str3 != null) {
                        byte[] a6 = bjd.m3179a(str3);
                        int length2 = a6.length;
                        int i2 = length2 + 2048;
                        bix.m3145f(a.mo3187f().mo3149a(a6, length2, new byte[i2], i2));
                    }
                    str = a.mo3173a();
                } else {
                    str = null;
                }
                if (str4 == null || str4.contentEquals("")) {
                    bArr = bjd.m3178a();
                } else {
                    StringBuilder sb8 = new StringBuilder(str4.length() + 1);
                    sb8.append('1');
                    sb8.append(str4);
                    bArr = bjd.m3179a(sb8.toString());
                }
                bix.m3145f(a.mo3187f().mo3153b(bArr));
                if (a.mo3187f().f3334a) {
                    a.mo3187f().mo3164a();
                }
                if (!z) {
                    byte[] bArr3 = a.f3347c;
                    if (bArr3[13] == 92) {
                        a.mo3185e().mo3143a(str4);
                        a.mo3187f().mo3152b(str4, (String) null);
                    } else if (bArr3[39] == 92) {
                        a.mo3185e().mo3144a(biw.OPERATION.f3342c, "PROVISIONING_DATA_CONTEXT", "dummy");
                    }
                } else {
                    if (biw.OPERATION.f3341b.equals(bii.REPERSO)) {
                        if (str4 != null) {
                            str2 = str4.substring(0, str4.length() - 8);
                            biw.OPERATION.f3342c = str2;
                            if (biw.OPERATION.f3341b.equals(bii.REPERSO)) {
                                bix.m3145f(a.mo3187f().mo3152b(str4, str2));
                            }
                            if (str == null) {
                                a.mo3185e().mo3144a(str2, "HCECLIENT_META_DATA", str);
                            }
                            if (biw.OPERATION.f3341b.equals(bii.REPERSO)) {
                                a.mo3185e().mo3143a(str4);
                            }
                        }
                    }
                    str2 = str4;
                    if (biw.OPERATION.f3341b.equals(bii.REPERSO)) {
                    }
                    if (str == null) {
                    }
                    if (biw.OPERATION.f3341b.equals(bii.REPERSO)) {
                    }
                }
                byte[] g = a.mo3189g(335620);
                if (g == null) {
                    byte[] g2 = a.mo3189g(335637);
                    byte[] g3 = a.mo3189g(335638);
                    if (g2 != null) {
                        if (g3 != null) {
                            byte[] bArr4 = a.f3347c;
                            bArr4[14] = -94;
                            g = bjf.m3187a(g3, g2, bArr4[27]);
                        }
                    }
                    g = bji.m3204a("0000000000000000000000000000000000000000000000000000000000000000");
                }
                bil2.f3319a = bji.m3201a(g);
                m3128a(bil2, bin, "02");
                bje.m3183a(bil2.f3322d, biw.OPERATION.f3341b, 0);
                bix a7 = biy.m3166a();
                bji.m3201a(a7.mo3189g(335640));
                biw.OPERATION.mo3170a();
                a7.mo3190h();
                return bil2;
            }
            throw new bic(bib.f3276f);
        } catch (Exception e) {
            m3128a(bil, m3127a(e), "02");
            bje.m3183a(bil.f3322d, biw.OPERATION.f3341b, 0);
            bix a8 = biy.m3166a();
            bji.m3201a(a8.mo3189g(335640));
            biw.OPERATION.mo3170a();
            a8.mo3190h();
            return bil;
        } catch (Throwable th) {
            m3128a(bil, bin, "02");
            bje.m3183a(bil.f3322d, biw.OPERATION.f3341b, 0);
            bix a9 = biy.m3166a();
            bji.m3201a(a9.mo3189g(335640));
            biw.OPERATION.mo3170a();
            a9.mo3190h();
            throw th;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bji.a(byte[], int, short):short
     arg types: [byte[], int, int]
     candidates:
      bji.a(byte[], int, byte):byte
      bji.a(byte[], int, long):int
      bji.a(byte[], int, short):short */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0353, code lost:
        throw new p000.bic(p000.bib.f3275e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0468, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        r5 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0369 A[Catch:{ bjl -> 0x034b, Exception -> 0x0058, all -> 0x0053 }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x036a A[Catch:{ bjl -> 0x034b, Exception -> 0x0058, all -> 0x0053 }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03fb A[SYNTHETIC, Splitter:B:195:0x03fb] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0411 A[SYNTHETIC, Splitter:B:197:0x0411] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[ExcHandler: Exception (r0v8 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:4:0x0022] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0468 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:22:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01f2 A[Catch:{ bjl -> 0x034b, Exception -> 0x0058, all -> 0x0053 }] */
    /* renamed from: a */
    public final bin mo3166a(bii bii, String str) {
        boolean z;
        Throwable th;
        boolean z2;
        String str2;
        byte[] bArr;
        byte b;
        byte[] bArr2;
        bii bii2 = bii;
        Log.i("amexhceclient", "::SDK Build Version::1.0.12");
        bin bin = bib.f3271a;
        bin bin2 = new bin();
        try {
            bix a = biy.m3166a();
            if (!bii2.equals(bii.PAYMENT)) {
                try {
                    if (!bii2.equals(bii.TAP_PAYMENT) && !bii2.equals(bii.LCM) && !bii2.equals(bii.REFRESH) && !bii2.equals(bii.REPERSO)) {
                        if (!bii2.equals(bii.PROVISION)) {
                            throw new bic(bib.f3276f);
                        }
                    }
                } catch (Exception e) {
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    z = false;
                    m3128a(bin2, bin, "01");
                    bje.m3183a(bin2.f3322d, bii2, 0);
                    bji.m3201a(biy.m3166a().mo3189g(335640));
                    biw.OPERATION.mo3170a();
                    throw th;
                }
            }
            try {
                boolean a2 = biy.m3166a().mo3185e().mo3145a();
                if (!bii2.equals(bii.REPERSO)) {
                    z2 = a2;
                    str2 = str;
                } else if (a2) {
                    str2 = str.concat("_reperso");
                    a.f3347c[39] = 92;
                    z2 = false;
                } else {
                    throw new bic(bib.f3276f);
                }
                bin bin3 = bib.f3271a;
                if (!z2) {
                    if (!bii.PROVISION.equals(bii2)) {
                        if (!bii.REPERSO.equals(bii2)) {
                            throw new bic(bib.f3276f);
                        }
                    }
                }
                biw.OPERATION.mo3171a(bii2);
                biw.OPERATION.f3342c = str2;
                bix a3 = biy.m3166a();
                if (z2) {
                    String str3 = biw.OPERATION.f3342c;
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1);
                    sb.append('1');
                    sb.append(str3);
                    bArr = bjd.m3179a(sb.toString());
                } else {
                    bArr = bjd.m3178a();
                }
                int a4 = a3.mo3187f().mo3148a(bArr);
                bix.m3145f(a4);
                if (z2) {
                    if (a4 == 0) {
                        throw new bic(bib.f3277g);
                    }
                }
                if (a4 > 0) {
                    bji.m3196a(a3.f3347c, 7, (long) a4);
                }
                if (z2) {
                    a.mo3178b();
                    int b2 = (int) bji.m3207b(a.f3347c, 7);
                    if (b2 != 0) {
                        byte[] bArr3 = new byte[b2];
                        bix.m3145f(a.mo3187f().mo3146a(1, null, 0, bArr3, b2));
                        Object[] a5 = bjd.m3180a(bArr3);
                        if (a5 != null) {
                            String obj = a5[0].toString();
                            if (Integer.parseInt(obj.substring(0, 4), 16) == 45055) {
                                if (Integer.parseInt(obj.substring(6, 8), 16) == 17) {
                                    int i = 8;
                                    while (i < obj.length()) {
                                        int i2 = i + 4;
                                        int parseInt = Integer.parseInt(obj.substring(i, i2), 16);
                                        int i3 = i2 + 4;
                                        int parseInt2 = Integer.parseInt(obj.substring(i2, i3), 16);
                                        int i4 = parseInt2 + parseInt2 + i3;
                                        String substring = obj.substring(i3, i4);
                                        if (parseInt == 8191) {
                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                            if (substring.length() >= 10) {
                                                int i5 = 0;
                                                while (i5 < substring.length()) {
                                                    int i6 = i5 + 6;
                                                    int parseInt3 = Integer.parseInt(substring.substring(i5, i6), 16);
                                                    int i7 = i6 + 4;
                                                    int parseInt4 = Integer.parseInt(substring.substring(i6, i7), 16);
                                                    int i8 = parseInt4 + parseInt4 + i7;
                                                    linkedHashMap.put(Integer.valueOf(parseInt3), bji.m3204a(substring.substring(i7, i8)));
                                                    i5 = i8;
                                                }
                                            } else {
                                                linkedHashMap = null;
                                            }
                                            a.f3348d = linkedHashMap;
                                        } else if (parseInt == 12287) {
                                            a.f3345a = bji.m3204a(substring);
                                        } else {
                                            throw new bic(bib.f3275e);
                                        }
                                        i = i4;
                                    }
                                    a.mo3179b(335636, bji.m3204a(obj));
                                    if (a.f3347c[40] == 92) {
                                        Object[] a6 = bjd.m3180a(new String(a.mo3189g(335642)).getBytes());
                                        if (a6 != null) {
                                            int i9 = 2;
                                            if (a6.length == 2) {
                                                String obj2 = a6[0].toString();
                                                String obj3 = a6[1].toString();
                                                Map map = (Map) bjk.m3215a(obj2);
                                                Map map2 = (Map) bjk.m3215a(obj3);
                                                if (map == null || map2 == null) {
                                                    throw new bic(bib.f3275e);
                                                }
                                                for (String str4 : map.keySet()) {
                                                    String str5 = (String) map.get(str4);
                                                    StringBuilder sb2 = new StringBuilder();
                                                    sb2.append(str4);
                                                    int length = str5.length() / i9;
                                                    if (length > 255) {
                                                        sb2.append("FF");
                                                        sb2.append(String.format("%04x", Integer.valueOf(length)));
                                                    } else {
                                                        sb2.append(String.format("%02x", Integer.valueOf(length)));
                                                    }
                                                    sb2.append(str5);
                                                    biu.m3137a(bji.m3204a(sb2.toString()));
                                                    i9 = 2;
                                                }
                                                biu.m3140c();
                                                biu.m3139b();
                                                biu.m3135a();
                                                for (String str6 : map2.keySet()) {
                                                    String str7 = (String) map2.get(str6);
                                                    String[] split = str6.split("-");
                                                    try {
                                                        if (split[0].compareTo("LOCK_CODE") == 0) {
                                                            bji.m3197a(bji.m3204a(str7), 0, a.f3345a, 24, 8);
                                                        } else if (split[0].compareTo("9601") != 0) {
                                                            if (split[0].compareTo("MST_SUPPORTED") == 0) {
                                                                a.f3345a[16] = str7.compareToIgnoreCase("true") == 0 ? (byte) 92 : -91;
                                                            }
                                                        } else if (split[1].compareTo("82") == 0) {
                                                            a.mo3174a(73490, bji.m3204a(str7));
                                                        } else if (split[1].compareTo("83") == 0) {
                                                            a.mo3174a(73491, bji.m3204a(str7));
                                                        }
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                    } catch (Throwable th22) {
                                                        th = th22;
                                                        th = th;
                                                        z = false;
                                                        m3128a(bin2, bin, "01");
                                                        bje.m3183a(bin2.f3322d, bii2, 0);
                                                        bji.m3201a(biy.m3166a().mo3189g(335640));
                                                        biw.OPERATION.mo3170a();
                                                        throw th;
                                                    }
                                                }
                                                a.mo3175a(new String(a.mo3189g(335643)));
                                            }
                                        }
                                        throw new bic(bib.f3275e);
                                    }
                                    b = a.f3346b[6];
                                    bArr2 = a.f3345a;
                                    if (b == bArr2[11]) {
                                        bArr2[11] = b;
                                    }
                                }
                            }
                            a.f3347c[40] = 92;
                            a.mo3179b(335642, obj.getBytes());
                            if (a.f3347c[40] == 92) {
                            }
                            b = a.f3346b[6];
                            bArr2 = a.f3345a;
                            if (b == bArr2[11]) {
                            }
                        } else {
                            throw new bic(bib.f3275e);
                        }
                    } else {
                        throw new bic(bib.f3275e);
                    }
                }
                bix a7 = biy.m3166a();
                byte[] bArr4 = a7.f3347c;
                bArr4[1] = -91;
                bArr4[4] = -91;
                bArr4[0] = -91;
                bArr4[11] = 92;
                bArr4[12] = -91;
                bArr4[13] = -91;
                bArr4[14] = -91;
                bArr4[16] = 0;
                bArr4[17] = -68;
                bArr4[23] = -91;
                bArr4[33] = -91;
                bArr4[31] = -57;
                bArr4[27] = -25;
                bArr4[38] = 0;
                if (biw.OPERATION.f3341b.equals(bii.TAP_PAYMENT)) {
                    if (bjf.m3184a(4, 8) == 92) {
                        a7.f3347c[15] = 51;
                        if (!z2) {
                            a7.f3347c[0] = 92;
                            bji.m3202a(a7.f3345a, 18, (short) -1);
                            a7.f3345a[8] = -1;
                        } else {
                            a7.f3347c[0] = -91;
                        }
                        a7.f3351g = null;
                        System.arraycopy(bja.f3360b, 0, a7.f3347c, 19, bja.f3360b.length);
                        if ((bii2.equals(bii.PAYMENT) || bii2.equals(bii.TAP_PAYMENT)) && a.mo3181c() == 0) {
                            a.f3350f = bib.f3280j;
                            bin3 = bib.f3280j;
                        }
                        m3128a(bin2, bin3, "01");
                        bje.m3183a(bin2.f3322d, bii2, 0);
                        return bin2;
                    }
                }
                if (a7.mo3180b(73473)) {
                    a7.f3347c[15] = -54;
                    if (!z2) {
                    }
                    a7.f3351g = null;
                    System.arraycopy(bja.f3360b, 0, a7.f3347c, 19, bja.f3360b.length);
                    a.f3350f = bib.f3280j;
                    bin3 = bib.f3280j;
                    m3128a(bin2, bin3, "01");
                    bje.m3183a(bin2.f3322d, bii2, 0);
                    return bin2;
                }
                a7.f3347c[15] = 51;
                if (!z2) {
                }
                a7.f3351g = null;
                System.arraycopy(bja.f3360b, 0, a7.f3347c, 19, bja.f3360b.length);
                a.f3350f = bib.f3280j;
                bin3 = bib.f3280j;
                m3128a(bin2, bin3, "01");
                bje.m3183a(bin2.f3322d, bii2, 0);
                return bin2;
            } catch (Exception e22) {
                e = e22;
            } catch (Throwable th3) {
            }
        } catch (Exception e3) {
            e = e3;
            Exception exc = e;
            try {
                m3128a(bin2, m3127a(exc), "01");
                bje.m3183a(bin2.f3322d, bii2, 0);
                if (biy.m3166a().f3347c[34] != 92) {
                    bji.m3201a(biy.m3166a().mo3189g(335640));
                    biw.OPERATION.mo3170a();
                }
                return bin2;
            } catch (Throwable th4) {
                th = th4;
                z = true;
                m3128a(bin2, bin, "01");
                bje.m3183a(bin2.f3322d, bii2, 0);
                if (z && biy.m3166a().f3347c[34] != 92) {
                    bji.m3201a(biy.m3166a().mo3189g(335640));
                    biw.OPERATION.mo3170a();
                }
                throw th;
            }
        } catch (Throwable th32) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final bip mo3167a(long j, String str) {
        long j2;
        bip bip;
        bip bip2;
        int i;
        int i2;
        boolean z;
        boolean z2;
        long j3 = j;
        bin bin = bib.f3271a;
        bip bip3 = new bip();
        try {
            bix a = biy.m3166a();
            biw.OPERATION.mo3171a(bii.REFRESHSTATUS);
            bip bip4 = new bip();
            biw.OPERATION.f3343d = j3;
            biw.OPERATION.f3342c = str;
            if (a.mo3185e().mo3145a()) {
                try {
                    a.mo3178b();
                    bix a2 = biy.m3166a();
                    if (a2.mo3181c() != 0) {
                        int i3 = a2.f3346b[7] * 3600;
                        TreeMap treeMap = a2.f3349e;
                        Iterator it = treeMap.keySet().iterator();
                        i2 = 3600;
                        i = 0;
                        while (it.hasNext()) {
                            bip bip5 = bip4;
                            long j4 = ((bih) treeMap.get((Integer) it.next())).f3303f;
                            long j5 = biw.OPERATION.f3343d;
                            if (j4 > j5) {
                                long j6 = j4 - j5;
                                if (j6 < ((long) i3)) {
                                    i++;
                                }
                                if (j6 < ((long) i2)) {
                                    i2 = (int) j6;
                                }
                            } else {
                                it.remove();
                            }
                            bip4 = bip5;
                        }
                        bip2 = bip4;
                    } else {
                        bip2 = bip4;
                        i2 = 3600;
                        i = 0;
                    }
                    int i4 = new int[]{i, i2}[0];
                    long j7 = (long) i2;
                    int c = a.mo3181c();
                    byte[] bArr = a.f3346b;
                    bArr[10] = (byte) c;
                    byte b = bArr[9];
                    if (c <= b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        z2 = z;
                    } else {
                        z2 = c - i4 <= b;
                    }
                    if (c != 0) {
                        bih a3 = a.mo3172a(false);
                        bji.m3202a(a.f3346b, 0, (short) a3.f3301d);
                        if (!z2) {
                            bip = bip2;
                            bip.f3328g = (a3.f3303f - biw.OPERATION.f3343d) - ((long) (a.f3346b[7] * 3600));
                        } else {
                            bip = bip2;
                        }
                    } else {
                        bip = bip2;
                        bArr[6] = 4;
                    }
                    bip.f3327f = bji.m3195a(a.f3346b, 2);
                    byte[] bArr2 = a.f3346b;
                    bip.f3325a = bArr2[10];
                    bip.f3326b = z2;
                    if (z2) {
                        bip.f3328g = j7;
                    }
                    bip.f3332k = c - i4;
                    bip.f3331j = bji.m3198a(bArr2[6]);
                    bip.f3329h = bji.m3199a(bji.m3195a(a.f3346b, 4));
                    String a4 = a.mo3173a();
                    if (a4 != null) {
                        a.mo3185e().mo3144a(biw.OPERATION.f3342c, "HCECLIENT_META_DATA", a4);
                    }
                } catch (Exception e) {
                    e = e;
                    j2 = j;
                    try {
                        m3128a(bip3, m3127a(e), "11");
                        bje.m3183a(bip3.f3322d, biw.OPERATION.f3341b, j2);
                        bip3.f3333l = bji.m3201a(biy.m3166a().mo3189g(335640));
                        if (biy.m3166a().f3347c[34] != 92) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        m3128a(bip3, bin, "11");
                        bje.m3183a(bip3.f3322d, biw.OPERATION.f3341b, j2);
                        bip3.f3333l = bji.m3201a(biy.m3166a().mo3189g(335640));
                        if (biy.m3166a().f3347c[34] != 92) {
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j2 = j;
                    m3128a(bip3, bin, "11");
                    bje.m3183a(bip3.f3322d, biw.OPERATION.f3341b, j2);
                    bip3.f3333l = bji.m3201a(biy.m3166a().mo3189g(335640));
                    if (biy.m3166a().f3347c[34] != 92) {
                    }
                    throw th;
                }
            } else {
                bip = bip4;
            }
            biw.OPERATION.mo3170a();
            a.mo3190h();
            m3128a(bip, bin, "11");
            bje.m3183a(bip.f3322d, biw.OPERATION.f3341b, j);
            bip.f3333l = bji.m3201a(biy.m3166a().mo3189g(335640));
            if (biy.m3166a().f3347c[34] == 92) {
                return bip;
            }
            biw.OPERATION.mo3170a();
            biy.m3166a().mo3190h();
            return bip;
        } catch (Exception e2) {
            e = e2;
            j2 = j3;
            m3128a(bip3, m3127a(e), "11");
            bje.m3183a(bip3.f3322d, biw.OPERATION.f3341b, j2);
            bip3.f3333l = bji.m3201a(biy.m3166a().mo3189g(335640));
            if (biy.m3166a().f3347c[34] != 92) {
                return bip3;
            }
            biw.OPERATION.mo3170a();
            biy.m3166a().mo3190h();
            return bip3;
        } catch (Throwable th3) {
            th = th3;
            j2 = j3;
            m3128a(bip3, bin, "11");
            bje.m3183a(bip3.f3322d, biw.OPERATION.f3341b, j2);
            bip3.f3333l = bji.m3201a(biy.m3166a().mo3189g(335640));
            if (biy.m3166a().f3347c[34] != 92) {
                biw.OPERATION.mo3170a();
                biy.m3166a().mo3190h();
            }
            throw th;
        }
    }
}
