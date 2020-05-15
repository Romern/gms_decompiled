package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: bqxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bqxi {

    /* renamed from: a */
    private static final bqxg f141863a;

    /* renamed from: b */
    private static final Map f141864b;

    /* renamed from: c */
    private static final Map f141865c;

    /* renamed from: d */
    private static final Map f141866d;

    /* renamed from: e */
    private static final Map f141867e;

    /* renamed from: f */
    private static final Map f141868f;

    /* renamed from: g */
    private static final Map f141869g;

    /* renamed from: h */
    private static final Map f141870h;

    /* renamed from: i */
    private static final Map f141871i;

    /* renamed from: j */
    private static final Map f141872j;

    /* renamed from: k */
    private static final Map f141873k;

    /* renamed from: l */
    private static final Map f141874l;

    /* renamed from: m */
    private static final Map f141875m;

    /* renamed from: n */
    private static final Map f141876n;

    /* renamed from: o */
    private static final Map f141877o;

    /* renamed from: p */
    private static final Map f141878p;

    static {
        bqxg B = m113634B();
        f141863a = B;
        B.mo69409a();
        HashMap hashMap = new HashMap();
        hashMap.put(0, "");
        hashMap.put(1, "nowidecg");
        hashMap.put(2, "widecg");
        f141864b = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(0, "");
        hashMap2.put(4, "lowdr");
        hashMap2.put(8, "highdr");
        f141865c = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(0, "");
        hashMap3.put(120, "ldpi");
        hashMap3.put(160, "mdpi");
        hashMap3.put(Integer.valueOf((int) BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED), "tvdpi");
        hashMap3.put(240, "hdpi");
        hashMap3.put(320, "xhdpi");
        hashMap3.put(480, "xxhdpi");
        hashMap3.put(640, "xxxhdpi");
        hashMap3.put(65534, "anydpi");
        hashMap3.put(65535, "nodpi");
        f141866d = Collections.unmodifiableMap(hashMap3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(1, "nokeys");
        hashMap4.put(2, "qwerty");
        hashMap4.put(3, "12key");
        f141867e = Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(1, "keysexposed");
        hashMap5.put(2, "keyshidden");
        hashMap5.put(3, "keyssoft");
        f141868f = Collections.unmodifiableMap(hashMap5);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(1, "nonav");
        hashMap6.put(2, "dpad");
        hashMap6.put(3, "trackball");
        hashMap6.put(4, "wheel");
        f141869g = Collections.unmodifiableMap(hashMap6);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(4, "navexposed");
        hashMap7.put(8, "navhidden");
        f141870h = Collections.unmodifiableMap(hashMap7);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(1, "port");
        hashMap8.put(2, "land");
        f141871i = Collections.unmodifiableMap(hashMap8);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(64, "ldltr");
        hashMap9.put(128, "ldrtl");
        f141872j = Collections.unmodifiableMap(hashMap9);
        HashMap hashMap10 = new HashMap();
        hashMap10.put(16, "notlong");
        hashMap10.put(32, "long");
        f141873k = Collections.unmodifiableMap(hashMap10);
        HashMap hashMap11 = new HashMap();
        hashMap11.put(1, "notround");
        hashMap11.put(2, "round");
        f141874l = Collections.unmodifiableMap(hashMap11);
        HashMap hashMap12 = new HashMap();
        hashMap12.put(1, "small");
        hashMap12.put(2, "normal");
        hashMap12.put(3, "large");
        hashMap12.put(4, "xlarge");
        f141875m = Collections.unmodifiableMap(hashMap12);
        HashMap hashMap13 = new HashMap();
        hashMap13.put(1, "notouch");
        hashMap13.put(3, "finger");
        f141876n = Collections.unmodifiableMap(hashMap13);
        HashMap hashMap14 = new HashMap();
        hashMap14.put(16, "notnight");
        hashMap14.put(32, "night");
        f141877o = Collections.unmodifiableMap(hashMap14);
        HashMap hashMap15 = new HashMap();
        hashMap15.put(2, "desk");
        hashMap15.put(3, "car");
        hashMap15.put(4, "television");
        hashMap15.put(5, "appliance");
        hashMap15.put(6, "watch");
        hashMap15.put(7, "vrheadset");
        f141878p = Collections.unmodifiableMap(hashMap15);
    }

    /* renamed from: B */
    public static bqxg m113634B() {
        bqxg bqxg = new bqxg();
        bqxg.mo69427q(52);
        bqxg.mo69415e(0);
        bqxg.mo69417g(0);
        bqxg.f141811a = new byte[2];
        bqxg.f141812b = new byte[2];
        bqxg.mo69419i(0);
        bqxg.mo69429s(0);
        bqxg.mo69412b(0);
        bqxg.mo69414d(0);
        bqxg.mo69418h(0);
        bqxg.mo69413c(0);
        bqxg.mo69424n(0);
        bqxg.mo69420j(0);
        bqxg.mo69426p(0);
        bqxg.mo69416f(0);
        bqxg.mo69422l(0);
        bqxg.mo69430t(0);
        bqxg.mo69428r(0);
        bqxg.mo69425o(0);
        bqxg.mo69421k(0);
        bqxg.f141813c = new byte[4];
        bqxg.f141814d = new byte[8];
        bqxg.mo69423m(0);
        bqxg.mo69410a(0);
        bqxg.mo69411a(new byte[0]);
        return bqxg;
    }

    /* renamed from: C */
    private final String m113635C() {
        return m113640a(mo69348d(), 97);
    }

    /* renamed from: D */
    private final String m113636D() {
        return m113640a(mo69349e(), 48);
    }

    /* renamed from: a */
    static bqxi m113637a(ByteBuffer byteBuffer) {
        boolean z;
        int position = byteBuffer.position();
        int i = byteBuffer.getInt();
        if (i >= 28) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108592a(z, "Expected minimum ResourceConfiguration size of %s, got %s", 28, i);
        bqxg B = m113634B();
        B.mo69427q(i);
        B.mo69415e((char) byteBuffer.getShort());
        B.mo69417g((char) byteBuffer.getShort());
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        byte[] bArr2 = new byte[2];
        byteBuffer.get(bArr2);
        B.f141811a = bArr;
        B.f141812b = bArr2;
        B.mo69419i(bqcw.m112606a(byteBuffer.get()));
        B.mo69429s(bqcw.m112606a(byteBuffer.get()));
        B.mo69412b((char) byteBuffer.getShort());
        B.mo69414d(bqcw.m112606a(byteBuffer.get()));
        B.mo69418h(bqcw.m112606a(byteBuffer.get()));
        B.mo69413c(bqcw.m112606a(byteBuffer.get()));
        byteBuffer.get();
        B.mo69424n((char) byteBuffer.getShort());
        B.mo69420j((char) byteBuffer.getShort());
        B.mo69426p((char) byteBuffer.getShort());
        B.mo69416f((char) byteBuffer.getShort());
        if (i >= 32) {
            B.mo69422l(bqcw.m112606a(byteBuffer.get()));
            B.mo69430t(bqcw.m112606a(byteBuffer.get()));
            B.mo69428r((char) byteBuffer.getShort());
        }
        if (i >= 36) {
            B.mo69425o((char) byteBuffer.getShort());
            B.mo69421k((char) byteBuffer.getShort());
        }
        if (i >= 48) {
            byte[] bArr3 = new byte[4];
            byteBuffer.get(bArr3);
            byte[] bArr4 = new byte[8];
            byteBuffer.get(bArr4);
            B.f141813c = bArr3;
            B.f141814d = bArr4;
        }
        if (i >= 52) {
            B.mo69423m(bqcw.m112606a(byteBuffer.get()));
            B.mo69410a(bqcw.m112606a(byteBuffer.get()));
            byteBuffer.getShort();
        }
        byte[] bArr5 = new byte[(i - (byteBuffer.position() - position))];
        byteBuffer.get(bArr5);
        B.mo69411a(bArr5);
        return B.mo69409a();
    }

    /* renamed from: A */
    public final String mo69431A() {
        return m113639a(mo69368v());
    }

    /* renamed from: a */
    public abstract int mo69345a();

    /* renamed from: b */
    public abstract int mo69346b();

    /* renamed from: c */
    public abstract int mo69347c();

    /* renamed from: d */
    public abstract byte[] mo69348d();

    /* renamed from: e */
    public abstract byte[] mo69349e();

    /* renamed from: f */
    public abstract int mo69351f();

    /* renamed from: g */
    public abstract int mo69352g();

    /* renamed from: h */
    public abstract int mo69353h();

    /* renamed from: i */
    public abstract int mo69355i();

    /* renamed from: j */
    public abstract int mo69356j();

    /* renamed from: k */
    public abstract int mo69357k();

    /* renamed from: l */
    public abstract int mo69358l();

    /* renamed from: m */
    public abstract int mo69359m();

    /* renamed from: n */
    public abstract int mo69360n();

    /* renamed from: o */
    public abstract int mo69361o();

    /* renamed from: p */
    public abstract int mo69362p();

    /* renamed from: q */
    public abstract int mo69363q();

    /* renamed from: r */
    public abstract int mo69364r();

    /* renamed from: s */
    public abstract int mo69365s();

    /* renamed from: t */
    public abstract int mo69366t();

    public final String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        bqxg bqxg = f141863a;
        bqxg.mo69427q(mo69345a());
        bqxg.mo69411a(mo69371y());
        if (bqxg.mo69409a().equals(this) && Arrays.equals(mo69371y(), new byte[mo69371y().length])) {
            return "default";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        bqxh bqxh = bqxh.MCC;
        if (mo69346b() != 0) {
            int b = mo69346b();
            StringBuilder sb = new StringBuilder(14);
            sb.append("mcc");
            sb.append(b);
            str = sb.toString();
        } else {
            str = "";
        }
        linkedHashMap.put(bqxh, str);
        bqxh bqxh2 = bqxh.MNC;
        if (mo69347c() != 0) {
            int c = mo69347c();
            StringBuilder sb2 = new StringBuilder(14);
            sb2.append("mnc");
            sb2.append(c);
            str2 = sb2.toString();
        } else {
            str2 = "";
        }
        linkedHashMap.put(bqxh2, str2);
        linkedHashMap.put(bqxh.LANGUAGE_STRING, m113635C());
        linkedHashMap.put(bqxh.LOCALE_SCRIPT_STRING, mo69433z());
        bqxh bqxh3 = bqxh.REGION_STRING;
        if (!m113636D().isEmpty()) {
            String valueOf = String.valueOf(m113636D());
            str3 = valueOf.length() == 0 ? new String("r") : "r".concat(valueOf);
        } else {
            str3 = "";
        }
        linkedHashMap.put(bqxh3, str3);
        linkedHashMap.put(bqxh.LOCALE_VARIANT_STRING, mo69431A());
        linkedHashMap.put(bqxh.SCREEN_LAYOUT_DIRECTION, (String) m113638a(f141872j, Integer.valueOf(mo69362p() & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC), ""));
        bqxh bqxh4 = bqxh.SMALLEST_SCREEN_WIDTH_DP;
        if (mo69364r() != 0) {
            int r = mo69364r();
            StringBuilder sb3 = new StringBuilder(15);
            sb3.append("sw");
            sb3.append(r);
            sb3.append("dp");
            str4 = sb3.toString();
        } else {
            str4 = "";
        }
        linkedHashMap.put(bqxh4, str4);
        bqxh bqxh5 = bqxh.SCREEN_WIDTH_DP;
        if (mo69365s() != 0) {
            int s = mo69365s();
            StringBuilder sb4 = new StringBuilder(14);
            sb4.append("w");
            sb4.append(s);
            sb4.append("dp");
            str5 = sb4.toString();
        } else {
            str5 = "";
        }
        linkedHashMap.put(bqxh5, str5);
        bqxh bqxh6 = bqxh.SCREEN_HEIGHT_DP;
        if (mo69366t() != 0) {
            int t = mo69366t();
            StringBuilder sb5 = new StringBuilder(14);
            sb5.append("h");
            sb5.append(t);
            sb5.append("dp");
            str6 = sb5.toString();
        } else {
            str6 = "";
        }
        linkedHashMap.put(bqxh6, str6);
        linkedHashMap.put(bqxh.SCREEN_LAYOUT_SIZE, (String) m113638a(f141875m, Integer.valueOf(mo69362p() & 15), ""));
        linkedHashMap.put(bqxh.SCREEN_LAYOUT_LONG, (String) m113638a(f141873k, Integer.valueOf(mo69362p() & 48), ""));
        linkedHashMap.put(bqxh.SCREEN_LAYOUT_ROUND, (String) m113638a(f141874l, Integer.valueOf(mo69369w() & 3), ""));
        linkedHashMap.put(bqxh.COLOR_MODE_HDR, (String) m113638a(f141865c, Integer.valueOf(mo69370x() & 12), ""));
        linkedHashMap.put(bqxh.COLOR_MODE_WIDE_COLOR_GAMUT, (String) m113638a(f141864b, Integer.valueOf(mo69370x() & 3), ""));
        linkedHashMap.put(bqxh.ORIENTATION, (String) m113638a(f141871i, Integer.valueOf(mo69351f()), ""));
        linkedHashMap.put(bqxh.UI_MODE_TYPE, (String) m113638a(f141878p, Integer.valueOf(mo69363q() & 15), ""));
        linkedHashMap.put(bqxh.UI_MODE_NIGHT, (String) m113638a(f141877o, Integer.valueOf(mo69363q() & 48), ""));
        bqxh bqxh7 = bqxh.DENSITY_DPI;
        Map map = f141866d;
        Integer valueOf2 = Integer.valueOf(mo69353h());
        int h = mo69353h();
        StringBuilder sb6 = new StringBuilder(14);
        sb6.append(h);
        sb6.append("dpi");
        linkedHashMap.put(bqxh7, (String) m113638a(map, valueOf2, sb6.toString()));
        linkedHashMap.put(bqxh.TOUCHSCREEN, (String) m113638a(f141876n, Integer.valueOf(mo69352g()), ""));
        linkedHashMap.put(bqxh.KEYBOARD_HIDDEN, (String) m113638a(f141868f, Integer.valueOf(mo69357k() & 3), ""));
        linkedHashMap.put(bqxh.KEYBOARD, (String) m113638a(f141867e, Integer.valueOf(mo69355i()), ""));
        linkedHashMap.put(bqxh.NAVIGATION_HIDDEN, (String) m113638a(f141870h, Integer.valueOf(mo69357k() & 12), ""));
        linkedHashMap.put(bqxh.NAVIGATION, (String) m113638a(f141869g, Integer.valueOf(mo69356j()), ""));
        bqxh bqxh8 = bqxh.SCREEN_SIZE;
        if (mo69358l() == 0 && mo69359m() == 0) {
            str7 = "";
        } else {
            int l = mo69358l();
            int m = mo69359m();
            StringBuilder sb7 = new StringBuilder(23);
            sb7.append(l);
            sb7.append("x");
            sb7.append(m);
            str7 = sb7.toString();
        }
        linkedHashMap.put(bqxh8, str7);
        if (mo69360n() != 0) {
            int n = mo69360n();
            StringBuilder sb8 = new StringBuilder(12);
            sb8.append("v");
            sb8.append(n);
            str8 = sb8.toString();
            if (mo69361o() != 0) {
                String valueOf3 = String.valueOf(str8);
                int o = mo69361o();
                StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf3).length() + 12);
                sb9.append(valueOf3);
                sb9.append(".");
                sb9.append(o);
                str8 = sb9.toString();
            }
        } else {
            str8 = "";
        }
        linkedHashMap.put(bqxh.SDK_VERSION, str8);
        String z = mo69433z();
        String A = mo69431A();
        if (!z.isEmpty() || !A.isEmpty()) {
            StringBuilder sb10 = new StringBuilder("b+");
            sb10.append(m113635C());
            if (!z.isEmpty()) {
                String valueOf4 = String.valueOf(z);
                sb10.append(valueOf4.length() == 0 ? new String("+") : "+".concat(valueOf4));
            }
            String D = m113636D();
            if (!D.isEmpty()) {
                String valueOf5 = String.valueOf(D);
                sb10.append(valueOf5.length() == 0 ? new String("+") : "+".concat(valueOf5));
            }
            if (!A.isEmpty()) {
                String valueOf6 = String.valueOf(A);
                sb10.append(valueOf6.length() == 0 ? new String("+") : "+".concat(valueOf6));
            }
            linkedHashMap.put(bqxh.LANGUAGE_STRING, sb10.toString());
            linkedHashMap.remove(bqxh.LOCALE_SCRIPT_STRING);
            linkedHashMap.remove(bqxh.REGION_STRING);
            linkedHashMap.remove(bqxh.LOCALE_VARIANT_STRING);
        }
        Collection values = linkedHashMap.values();
        values.removeAll(Collections.singleton(""));
        return bmxr.m108543a('-').mo66874a((Iterable) values);
    }

    /* renamed from: u */
    public abstract byte[] mo69367u();

    /* renamed from: v */
    public abstract byte[] mo69368v();

    /* renamed from: w */
    public abstract int mo69369w();

    /* renamed from: x */
    public abstract int mo69370x();

    /* renamed from: y */
    public abstract byte[] mo69371y();

    /* renamed from: z */
    public final String mo69433z() {
        return m113639a(mo69367u());
    }

    /* renamed from: a */
    private static final Object m113638a(Map map, Object obj, Object obj2) {
        Object obj3 = map.get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    /* renamed from: a */
    private static final String m113639a(byte[] bArr) {
        int length = bArr.length;
        int a = bqce.m112559a(bArr, (byte) 0, 0, length);
        if (a >= 0) {
            length = a;
        }
        return new String(bArr, 0, length, bmwy.f131156a);
    }

    /* renamed from: a */
    private static String m113640a(byte[] bArr, int i) {
        boolean z;
        if (bArr.length == 2) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "Language or region value must be 2 bytes.");
        byte b = bArr[0];
        if (b == 0 && bArr[1] == 0) {
            return "";
        }
        if ((bqcw.m112606a(b) & 128) == 0) {
            return new String(bArr, bmwy.f131156a);
        }
        return new String(new byte[]{(byte) ((bArr[1] & 31) + i), (byte) (((bArr[1] & 224) >>> 5) + i + ((bArr[0] & 3) << 3)), (byte) (i + ((bArr[0] & 124) >>> 2))}, bmwy.f131156a);
    }

    /* renamed from: a */
    public static byte[] m113641a(String str) {
        boolean z;
        byte[] bytes = str.getBytes(bmwy.f131156a);
        int length = bytes.length;
        if (length == 2) {
            return bytes;
        }
        byte[] bArr = new byte[2];
        if (length == 3) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108600b(z);
        for (int i = 0; i < length; i++) {
            byte b = bytes[i];
            bmxy.m108600b(b >= 97 && b <= 122);
        }
        bArr[0] = (byte) (((bytes[2] - 97) << 2) | ((bytes[1] - 97) >> 3) | 128);
        bArr[1] = (byte) (((bytes[1] - 97) << 5) | (bytes[0] - 97));
        return bArr;
    }
}
