package p000;

import android.text.TextUtils;
import android.util.SparseIntArray;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bjxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjxj {

    /* renamed from: a */
    public static final byte[] f123572a = {111};

    /* renamed from: b */
    public static final byte[] f123573b = {-124};

    /* renamed from: c */
    public static final byte[] f123574c = {-91};

    /* renamed from: d */
    public static final byte[] f123575d = {80};

    /* renamed from: e */
    public static final byte[] f123576e = {79};

    /* renamed from: f */
    public static final byte[] f123577f = {-97, 56};

    /* renamed from: g */
    public static final byte[] f123578g = {-120};

    /* renamed from: h */
    public static final byte[] f123579h = {-126};

    /* renamed from: i */
    public static final byte[] f123580i = {-108};

    /* renamed from: j */
    public static final byte[] f123581j = {119};

    /* renamed from: k */
    public static final byte[] f123582k = {Byte.MIN_VALUE};

    /* renamed from: l */
    public static final byte[] f123583l = {112};

    /* renamed from: m */
    public static final byte[] f123584m = {86};

    /* renamed from: n */
    public static final byte[] f123585n = {87};

    /* renamed from: o */
    public static final byte[] f123586o = {-97, 107};

    /* renamed from: p */
    public static final byte[] f123587p = {90};

    /* renamed from: q */
    public static final byte[] f123588q = {95, 32};

    /* renamed from: r */
    public static final byte[] f123589r = {95, 36};

    /* renamed from: s */
    public static final byte[] f123590s = {-97, 11};

    /* renamed from: t */
    private static final Pattern f123591t = Pattern.compile("/");

    /* renamed from: u */
    private static final Pattern f123592u = Pattern.compile("^(?:[A-Z])(\\d{1,19})\\^([^\\^]{2,26})\\^(\\d{4}|\\^)(?:[0-9]{3}|\\^)(?:\\S*)$");

    /* renamed from: v */
    private static final Pattern f123593v = Pattern.compile("^(\\d{1,19})D(\\d{4}|=)(?:[0-9]{3}|=)(?:\\S*)F$");

    /* renamed from: w */
    private static final Pattern f123594w = Pattern.compile("^(\\d{1,19})D(\\d{4}|=)(?:[0-9]{3}|=)(?:\\S*)(?:[F]?)$");

    /* renamed from: x */
    private static final SparseIntArray f123595x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(19);
        f123595x = sparseIntArray;
        sparseIntArray.append(m104839a(f123572a), 1);
        f123595x.append(m104839a(f123573b), 1);
        f123595x.append(m104839a(f123574c), 1);
        f123595x.append(m104839a(f123575d), 2);
        f123595x.append(m104839a(f123576e), 1);
        f123595x.append(m104839a(f123577f), 1);
        f123595x.append(m104839a(f123578g), 1);
        f123595x.append(m104839a(f123579h), 1);
        f123595x.append(m104839a(f123580i), 1);
        f123595x.append(m104839a(f123581j), 1);
        f123595x.append(m104839a(f123582k), 1);
        f123595x.append(m104839a(f123583l), 1);
        f123595x.append(m104839a(f123584m), 2);
        f123595x.append(m104839a(f123585n), 1);
        f123595x.append(m104839a(f123586o), 1);
        f123595x.append(m104839a(f123587p), 3);
        f123595x.append(m104839a(f123588q), 2);
        f123595x.append(m104839a(f123589r), 3);
        f123595x.append(m104839a(f123590s), 2);
    }

    /* renamed from: a */
    static int m104839a(byte[] bArr) {
        byte b = 0;
        for (byte b2 : bArr) {
            b = (b << 8) | b2;
        }
        return (bArr.length << 16) | b;
    }

    /* renamed from: b */
    public static byte[] m104844b(bjxh bjxh) {
        if (bjxh == null) {
            return new byte[0];
        }
        List a = bjxi.m104837a(bjxh.f123570b, 0);
        int size = a.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += bjve.m104686a(((bjxg) a.get(i2)).f123568a);
        }
        byte[] bArr = new byte[(i + 2)];
        bArr[0] = -125;
        bArr[1] = (byte) i;
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3 + 2] = 0;
        }
        return bArr;
    }

    /* renamed from: c */
    public static bjws m104845c(bjxh bjxh) {
        String str;
        int i;
        int i2;
        if (!Arrays.equals(bjxh.f123569a, f123583l)) {
            return null;
        }
        bjxh a = m104840a(bjxh, f123587p);
        String str2 = "";
        if (a != null) {
            str = m104841a(a);
        } else {
            str = str2;
        }
        bjxh a2 = m104840a(bjxh, f123588q);
        if (a2 != null) {
            str2 = m104842a(m104841a(a2));
        }
        bjxh a3 = m104840a(bjxh, f123590s);
        if (a3 != null) {
            str2 = m104842a(m104841a(a3));
        }
        bjxh a4 = m104840a(bjxh, f123589r);
        if (a4 != null) {
            String a5 = m104841a(a4);
            i = Integer.parseInt(a5.substring(2, 4));
            i2 = Integer.parseInt(a5.substring(0, 2));
        } else {
            i2 = 0;
            i = 0;
        }
        bjxh a6 = m104840a(bjxh, f123584m);
        if (a6 != null) {
            Matcher matcher = f123592u.matcher(m104841a(a6));
            if (matcher.find()) {
                str = matcher.group(1);
                str2 = m104842a(matcher.group(2));
                String group = matcher.group(3);
                i = Integer.parseInt(group.substring(2, 4));
                i2 = Integer.parseInt(group.substring(0, 2));
            }
        }
        bjxh a7 = m104840a(bjxh, f123586o);
        if (a7 != null) {
            Matcher matcher2 = f123593v.matcher(m104841a(a7));
            if (matcher2.find()) {
                str = matcher2.group(1);
                String group2 = matcher2.group(2);
                i = Integer.parseInt(group2.substring(2, 4));
                i2 = Integer.parseInt(group2.substring(0, 2));
            }
        }
        bjxh a8 = m104840a(bjxh, f123585n);
        if (a8 != null) {
            Matcher matcher3 = f123594w.matcher(m104841a(a8));
            if (matcher3.find()) {
                str = matcher3.group(1);
                String group3 = matcher3.group(2);
                i = Integer.parseInt(group3.substring(2, 4));
                i2 = Integer.parseInt(group3.substring(0, 2));
            }
        }
        if (str2 == null && str == null && (i <= 0 || i2 <= 0)) {
            return null;
        }
        return new bjws(str, i, i2, str2);
    }

    /* renamed from: a */
    public static bjxh m104840a(bjxh bjxh, byte[] bArr) {
        if (Arrays.equals(bjxh.f123569a, bArr)) {
            return bjxh;
        }
        int size = bjxh.f123571c.size();
        for (int i = 0; i < size; i++) {
            bjxh a = m104840a((bjxh) bjxh.f123571c.get(i), bArr);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m104841a(bjxh bjxh) {
        int i = 0;
        if (f123595x.get(m104839a(bjxh.f123569a), 1) != 2) {
            byte[] bArr = bjxh.f123570b;
            char[] cArr = bjve.f123376a;
            int length = bArr.length;
            char[] cArr2 = new char[(length + length)];
            while (i < length) {
                int a = bjve.m104686a(bArr[i]);
                int i2 = i + i;
                cArr2[i2] = bjve.f123376a[a >> 4];
                cArr2[i2 + 1] = bjve.f123376a[a & 15];
                i++;
            }
            return new String(cArr2);
        }
        byte[] bArr2 = bjxh.f123570b;
        StringBuilder sb = new StringBuilder();
        int length2 = bArr2.length;
        while (i < length2) {
            sb.append((char) bjve.m104686a(bArr2[i]));
            i++;
        }
        return sb.toString();
    }

    /* renamed from: a */
    static String m104842a(String str) {
        String replaceAll = f123591t.matcher(str).replaceAll("");
        return TextUtils.getTrimmedLength(replaceAll) == 0 ? "" : replaceAll;
    }

    /* renamed from: a */
    public static byte[] m104843a(bjxf bjxf) {
        bjxh a = bjxi.m104836a(bjxf);
        if (a == null) {
            return new byte[0];
        }
        if (Arrays.equals(a.f123569a, f123581j)) {
            bjxh a2 = m104840a(a, f123580i);
            return a2 != null ? a2.f123570b : new byte[0];
        } else if (!Arrays.equals(a.f123569a, f123582k)) {
            return new byte[0];
        } else {
            byte[] bArr = a.f123570b;
            int length = bArr.length;
            return length < 2 ? new byte[0] : Arrays.copyOfRange(bArr, 2, length);
        }
    }
}
