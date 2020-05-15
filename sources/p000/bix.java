package p000;

import java.security.MessageDigest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: bix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bix {

    /* renamed from: a */
    public byte[] f3345a = new byte[37];

    /* renamed from: b */
    public byte[] f3346b = new byte[11];

    /* renamed from: c */
    public final byte[] f3347c = new byte[41];

    /* renamed from: d */
    public LinkedHashMap f3348d = new LinkedHashMap();

    /* renamed from: e */
    public final TreeMap f3349e = new TreeMap();

    /* renamed from: f */
    public bin f3350f;

    /* renamed from: g */
    public bih f3351g;

    /* renamed from: h */
    public bie f3352h = null;

    /* renamed from: i */
    public biq f3353i = null;

    /* renamed from: j */
    private final LinkedHashMap f3354j = new LinkedHashMap();

    /* renamed from: k */
    private MessageDigest f3355k;

    /* renamed from: f */
    public static final void m3145f(int i) {
        if (i == -20) {
            throw new bic(bib.f3289s);
        } else if (i < 0) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Secure Component Status:: ");
            sb.append(i);
            throw new bic(sb.toString());
        }
    }

    /* renamed from: a */
    public final bih mo3172a(boolean z) {
        if (this.f3349e.size() == 0) {
            return null;
        }
        bih bih = (bih) this.f3349e.firstEntry().getValue();
        if (z) {
            this.f3349e.remove(Integer.valueOf(bih.f3301d));
            if (this.f3349e.size() == 0) {
                this.f3347c[12] = 92;
            } else {
                bji.m3202a(this.f3346b, 0, ((Integer) this.f3349e.firstKey()).shortValue());
            }
        }
        return bih;
    }

    /* renamed from: b */
    public final void mo3178b() {
        String a = mo3185e().mo3142a(biw.OPERATION.f3342c, "HCECLIENT_META_DATA");
        if (Integer.parseInt(a.substring(0, 4), 16) == 45055) {
            int i = 8;
            if (Integer.parseInt(a.substring(6, 8), 16) == 17) {
                while (i < a.length()) {
                    int i2 = i + 4;
                    int parseInt = Integer.parseInt(a.substring(i, i2), 16);
                    int i3 = i2 + 4;
                    int parseInt2 = Integer.parseInt(a.substring(i2, i3), 16);
                    int i4 = parseInt2 + parseInt2 + i3;
                    String substring = a.substring(i3, i4);
                    if (parseInt != 16383) {
                        if (parseInt == 20479) {
                            this.f3346b = bji.m3204a(substring);
                        }
                    } else if (substring.length() >= 6) {
                        int i5 = 0;
                        while (i5 < substring.length()) {
                            int i6 = i5 + 4;
                            int parseInt3 = Integer.parseInt(substring.substring(i5, i6), 16);
                            int i7 = i6 + 2;
                            int parseInt4 = Integer.parseInt(substring.substring(i6, i7), 16);
                            bih bih = new bih();
                            int i8 = parseInt4 + parseInt4 + i7;
                            bih.mo3162a(bji.m3204a(substring.substring(i7, i8)), true, true);
                            this.f3349e.put(Integer.valueOf(parseInt3), bih);
                            i5 = i8;
                        }
                    }
                    i = i4;
                }
                return;
            }
        }
        if (biw.OPERATION.f3341b.equals(bii.REFRESHSTATUS)) {
            mo3175a(a);
            return;
        }
        this.f3347c[40] = 92;
        mo3179b(335643, a.getBytes());
    }

    /* renamed from: c */
    public final int mo3181c() {
        if (this.f3349e.size() != 0 || biy.m3166a().f3351g == null) {
            return this.f3349e.size();
        }
        return 1;
    }

    /* renamed from: d */
    public final int mo3183d() {
        return ((Integer) this.f3349e.lastKey()).intValue();
    }

    /* renamed from: e */
    public final bie mo3185e() {
        if (this.f3352h == null) {
            this.f3352h = new biz();
        }
        return this.f3352h;
    }

    /* renamed from: g */
    public final MessageDigest mo3188g() {
        try {
            if (this.f3355k == null) {
                this.f3355k = bji.m3208b(170);
            }
            return this.f3355k;
        } catch (bic e) {
            return null;
        }
    }

    /* renamed from: h */
    public final void mo3190h() {
        try {
            this.f3349e.clear();
            byte[] bArr = this.f3345a;
            bji.m3203a(bArr, 0, bArr.length, (byte) 0);
            byte[] bArr2 = this.f3346b;
            bji.m3203a(bArr2, 0, bArr2.length, (byte) 0);
            this.f3348d.clear();
            this.f3354j.clear();
            byte[] bArr3 = this.f3347c;
            bji.m3203a(bArr3, 0, bArr3.length, (byte) 0);
            this.f3350f = null;
            this.f3351g = null;
        } catch (bic e) {
        }
    }

    /* renamed from: c */
    public final byte[] mo3182c(int i) {
        LinkedHashMap linkedHashMap = this.f3354j;
        Integer valueOf = Integer.valueOf(i);
        if (linkedHashMap.containsKey(valueOf)) {
            return (byte[]) this.f3354j.get(valueOf);
        }
        return null;
    }

    /* renamed from: d */
    public final boolean mo3184d(int i) {
        return this.f3354j.containsKey(Integer.valueOf(i));
    }

    /* renamed from: e */
    public final bih mo3186e(int i) {
        Iterator it = this.f3349e.keySet().iterator();
        bih bih = null;
        int i2 = 0;
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            if (intValue <= i) {
                bih = (bih) this.f3349e.get(num);
                it.remove();
                i2 = intValue;
            } else {
                bji.m3202a(this.f3346b, 0, (short) intValue);
                return bih;
            }
        }
        this.f3347c[12] = 92;
        if (i2 != 0) {
            bji.m3202a(this.f3346b, 0, (short) i2);
        }
        return bih;
    }

    /* renamed from: g */
    public final byte[] mo3189g(int i) {
        LinkedHashMap linkedHashMap = this.f3354j;
        Integer valueOf = Integer.valueOf(i);
        if (!linkedHashMap.containsKey(valueOf)) {
            return null;
        }
        byte[] bArr = (byte[]) this.f3354j.get(valueOf);
        this.f3354j.remove(valueOf);
        return bArr;
    }

    /* renamed from: f */
    public final biq mo3187f() {
        if (this.f3353i == null) {
            this.f3353i = new biq();
        }
        return this.f3353i;
    }

    /* renamed from: h */
    public final void mo3191h(int i) {
        byte b = (byte) i;
        this.f3346b[6] = b;
        this.f3345a[11] = b;
    }

    /* renamed from: a */
    public final String mo3173a() {
        String str;
        if (this.f3347c[11] != 92) {
            return null;
        }
        if (!this.f3349e.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Integer num : this.f3349e.keySet()) {
                bih bih = (bih) this.f3349e.get(num);
                byte[] bArr = new byte[(bih.f3304g != null ? 31 : 13)];
                bArr[0] = Byte.MIN_VALUE;
                bArr[1] = 2;
                short a = bji.m3202a(bArr, 2, (short) bih.f3301d);
                int i = a + 1;
                bArr[a] = -125;
                int i2 = i + 1;
                bArr[i] = 1;
                int i3 = i2 + 1;
                bArr[i2] = bih.f3302e;
                int i4 = i3 + 1;
                bArr[i3] = -120;
                bArr[i4] = 4;
                int a2 = bji.m3196a(bArr, i4 + 1, bih.f3303f);
                byte[] bArr2 = bih.f3304g;
                if (bArr2 != null) {
                    int i5 = a2 + 1;
                    bArr[a2] = -121;
                    bArr[i5] = 16;
                    System.arraycopy(bArr2, 0, bArr, i5 + 1, 16);
                }
                String a3 = bji.m3201a(bArr);
                String format = String.format("%04x", Integer.valueOf(num.intValue()));
                String format2 = String.format("%02x", Integer.valueOf(a3.length() / 2));
                StringBuilder sb2 = new StringBuilder(String.valueOf(format).length() + String.valueOf(format2).length() + String.valueOf(a3).length());
                sb2.append(format);
                sb2.append(format2);
                sb2.append(a3);
                sb.append(sb2.toString());
            }
            str = sb.toString();
        } else {
            str = "";
        }
        String format3 = String.format("%04x", 16383);
        String format4 = String.format("%04x", Integer.valueOf(str.length() / 2));
        StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + String.valueOf(format4).length() + String.valueOf(str).length());
        sb3.append(format3);
        sb3.append(format4);
        sb3.append(str);
        String sb4 = sb3.toString();
        String a4 = bji.m3201a(this.f3346b);
        String format5 = String.format("%04x", 20479);
        String format6 = String.format("%04x", Integer.valueOf(a4.length() / 2));
        StringBuilder sb5 = new StringBuilder(String.valueOf(format5).length() + String.valueOf(format6).length() + String.valueOf(a4).length());
        sb5.append(format5);
        sb5.append(format6);
        sb5.append(a4);
        String sb6 = sb5.toString();
        String format7 = String.format("%04x", 45055);
        String format8 = String.format("%02x", (byte) 17);
        StringBuilder sb7 = new StringBuilder(String.valueOf(format7).length() + 2 + String.valueOf(format8).length());
        sb7.append(format7);
        sb7.append("01");
        sb7.append(format8);
        String sb8 = sb7.toString();
        StringBuilder sb9 = new StringBuilder(String.valueOf(sb8).length() + String.valueOf(sb4).length() + String.valueOf(sb6).length());
        sb9.append(sb8);
        sb9.append(sb4);
        sb9.append(sb6);
        return sb9.toString();
    }

    /* renamed from: b */
    public final void mo3179b(int i, byte[] bArr) {
        this.f3354j.put(Integer.valueOf(i), bArr);
    }

    /* renamed from: b */
    public final boolean mo3180b(int i) {
        return this.f3348d.containsKey(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo3174a(int i, byte[] bArr) {
        this.f3348d.put(Integer.valueOf(i), bArr);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final void mo3175a(String str) {
        byte[] bArr;
        Object[] a = bjd.m3180a(str.getBytes());
        if (a != null) {
            try {
                Map map = (Map) bjk.m3215a(a[0].toString());
                boolean z = false;
                for (String str2 : map.keySet()) {
                    String str3 = (String) map.get(str2);
                    String[] split = str2.split("-");
                    String str4 = split[0];
                    char c = 65535;
                    switch (str4.hashCode()) {
                        case -1879938808:
                            if (str4.equals("LUPC_THRESHOLD")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -1256737748:
                            if (str4.equals("LUPC_COUNT")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -876244829:
                            if (str4.equals("REFRESH_REQUIRED")) {
                                c = 6;
                                break;
                            }
                            break;
                        case -616568552:
                            if (str4.equals("TOKEN_STATUS")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 1072621520:
                            if (str4.equals("RUNNING_ATC")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 1560767941:
                            if (str4.equals("LUPC_REFRESH_CHECK_BACK")) {
                                c = 7;
                                break;
                            }
                            break;
                        case 1563366645:
                            if (str4.equals("MAX_ATC")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 2036800969:
                            if (str4.equals("TOKEN_DATA_VERSION")) {
                                c = 4;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            this.f3346b[10] = Byte.parseByte(str3, 16);
                            break;
                        case 1:
                            bji.m3197a(bji.m3204a(str3), 0, this.f3346b, 7, 3);
                            break;
                        case 2:
                            bji.m3197a(bji.m3204a(str3), 0, this.f3346b, 2, 2);
                            break;
                        case 3:
                            bji.m3197a(bji.m3204a(str3), 0, this.f3346b, 0, 2);
                            break;
                        case 4:
                            bji.m3197a(bji.m3204a(str3), 0, this.f3346b, 4, 2);
                            break;
                        case 5:
                            bji.m3197a(bji.m3204a(str3), 0, this.f3346b, 6, 1);
                            break;
                        case 6:
                        case 7:
                            break;
                        default:
                            int b = bji.m3205b(split[0]);
                            String[] split2 = str3.split("-");
                            bih bih = new bih();
                            if (this.f3349e.containsKey(Integer.valueOf(bji.m3205b(split2[0])))) {
                                bih = (bih) this.f3349e.get(Integer.valueOf(bji.m3205b(split2[0])));
                            }
                            if (b != 37889) {
                                if (b != 38401) {
                                    break;
                                } else {
                                    int b2 = bji.m3205b(split2[0]);
                                    bih.f3300c = bji.m3204a(split2[1]);
                                    this.f3349e.put(Integer.valueOf(b2), bih);
                                    break;
                                }
                            } else {
                                int b3 = bji.m3205b(split2[0]);
                                byte b4 = bji.m3204a(split2[3])[0];
                                if (split2[4].compareToIgnoreCase("null") != 0) {
                                    bArr = bji.m3204a(split2[4]);
                                } else {
                                    bArr = null;
                                }
                                long b5 = bji.m3206b(bji.m3204a(split2[5]));
                                bih.f3301d = b3;
                                bih.f3304g = bArr;
                                bih.f3302e = b4;
                                bih.f3303f = b5;
                                this.f3349e.put(Integer.valueOf(b3), bih);
                                z = true;
                                break;
                            }
                    }
                }
                if (!z) {
                    this.f3349e.clear();
                }
            } catch (bjl e) {
                throw new bic(bib.f3275e);
            }
        } else {
            throw new bic(bib.f3275e);
        }
    }

    /* renamed from: a */
    public final void mo3176a(byte[] bArr, boolean z) {
        bih bih;
        bih bih2 = new bih();
        if (bih2.mo3162a(bArr, z, false)) {
            int i = bih2.f3301d;
            TreeMap treeMap = this.f3349e;
            Integer valueOf = Integer.valueOf(i);
            if (treeMap.containsKey(valueOf)) {
                bih = (bih) this.f3349e.get(valueOf);
            } else {
                bih = null;
            }
            int a = bji.m3195a(this.f3346b, 2);
            int i2 = bih2.f3301d;
            if (i2 <= a) {
                throw new bic(bib.f3283m);
            } else if (bih == null) {
                this.f3349e.put(Integer.valueOf(i2), bih2);
            } else if (z) {
                bih.f3298a = bih2.f3298a;
                bih.f3299b = bih2.f3299b;
                bih.f3304g = bih2.f3304g;
                bih.f3302e = bih2.f3302e;
            } else {
                bih.f3300c = bih2.f3300c;
            }
        }
    }

    /* renamed from: a */
    public final byte[] mo3177a(int i) {
        LinkedHashMap linkedHashMap = this.f3348d;
        Integer valueOf = Integer.valueOf(i);
        if (linkedHashMap.containsKey(valueOf)) {
            return (byte[]) this.f3348d.get(valueOf);
        }
        return null;
    }
}
