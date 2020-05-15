package p000;

import android.net.Uri;
import android.util.Base64;
import java.io.UnsupportedEncodingException;

/* renamed from: emn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class emn {

    /* renamed from: a */
    final String f15272a;

    /* renamed from: b */
    final String f15273b;

    /* renamed from: c */
    final String f15274c;

    /* renamed from: d */
    final long f15275d;

    /* renamed from: e */
    final String f15276e;

    /* renamed from: f */
    final boolean f15277f;

    /* renamed from: g */
    Integer f15278g;

    /* renamed from: h */
    Uri f15279h;

    /* renamed from: i */
    Long f15280i;

    /* renamed from: j */
    Integer f15281j;

    /* renamed from: k */
    Uri f15282k;

    /* renamed from: l */
    Long f15283l;

    /* renamed from: m */
    Integer f15284m;

    /* renamed from: n */
    String f15285n;

    /* renamed from: o */
    String f15286o;

    /* renamed from: p */
    String f15287p;

    /* renamed from: q */
    final int f15288q;

    /* renamed from: r */
    Long f15289r;

    /* renamed from: s */
    int f15290s;

    /* renamed from: t */
    Uri f15291t;

    /* renamed from: u */
    boolean f15292u;

    /* renamed from: v */
    String f15293v;

    /* renamed from: w */
    String f15294w;

    public emn(String str, String str2, Uri uri, long j, String str3, int i, boolean z, int i2) {
        this(str, str2, uri.toString(), j, str3, i, z, Integer.valueOf(i2));
        this.f15291t = uri;
    }

    /* renamed from: a */
    public static emn m10670a(String str) {
        String[] split;
        int length;
        Long l;
        Integer num;
        Long l2;
        Uri uri;
        String str2;
        String str3;
        String str4;
        Uri uri2;
        Integer num2;
        Long l3;
        Integer num3;
        boolean z;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9 = str;
        if (str9 == null || (length = (split = str9.split("@", -1)).length) < 16) {
            return null;
        }
        try {
            if (!split[0].equals("null")) {
                l = Long.valueOf(split[0]);
            } else {
                l = null;
            }
            String str10 = split[1];
            String str11 = split[2];
            String str12 = split[3];
            long parseLong = Long.parseLong(split[4]);
            String str13 = split[5];
            int parseInt = Integer.parseInt(split[6]);
            boolean parseBoolean = Boolean.parseBoolean(split[7]);
            if (!split[8].equals("null")) {
                uri = Uri.parse(split[8]);
                l2 = Long.valueOf(Long.parseLong(split[9]));
                num = Integer.valueOf(Integer.parseInt(split[10]));
            } else {
                uri = null;
                l2 = null;
                num = null;
            }
            if (!split[11].equals("null")) {
                Uri parse = Uri.parse(split[11]);
                Long valueOf = Long.valueOf(Long.parseLong(split[12]));
                num2 = Integer.valueOf(Integer.parseInt(split[13]));
                String str14 = split[14];
                String str15 = split[15];
                if (length < 18) {
                    uri2 = parse;
                    l3 = valueOf;
                    str4 = str14;
                    str3 = str15;
                    str2 = null;
                } else if (split[17].equals("null")) {
                    uri2 = parse;
                    l3 = valueOf;
                    str4 = str14;
                    str3 = str15;
                    str2 = null;
                } else {
                    str2 = split[17];
                    uri2 = parse;
                    l3 = valueOf;
                    str4 = str14;
                    str3 = str15;
                }
            } else {
                l3 = null;
                num2 = null;
                uri2 = null;
                str4 = null;
                str3 = null;
                str2 = null;
            }
            if (length >= 17) {
                try {
                    num3 = Integer.valueOf(Integer.parseInt(split[16]));
                } catch (NumberFormatException e) {
                    num3 = null;
                }
            } else {
                num3 = null;
            }
            if (split.length >= 21) {
                z = Boolean.parseBoolean(split[18]);
                if (!split[19].equals("null")) {
                    str7 = m10673c(split[19]);
                } else {
                    str7 = null;
                }
                String str16 = str7;
                if (!split[20].equals("null")) {
                    str8 = m10673c(split[20]);
                } else {
                    str8 = null;
                }
                str6 = str16;
                str5 = str8;
            } else {
                str6 = null;
                str5 = null;
                z = false;
            }
            emn emn = new emn(str10, str12, str11, parseLong, str13, parseInt, parseBoolean, num3);
            if (uri != null) {
                emn.mo10279a(uri, l2.longValue(), num.intValue());
            }
            if (uri2 != null) {
                emn.mo10280a(uri2, l3.longValue(), num2.intValue(), str4, str3, str2);
            }
            emn.f15292u = z;
            emn.f15293v = str6;
            emn.f15294w = str5;
            emn.f15289r = l;
            return emn;
        } catch (NumberFormatException e2) {
            return null;
        }
    }

    /* renamed from: b */
    static String m10672b(String str) {
        try {
            return Base64.encodeToString(str.getBytes("UTF-8"), 11);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: c */
    static String m10673c(String str) {
        try {
            return new String(Base64.decode(str, 11), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public final void mo10278a() {
        this.f15279h = null;
        this.f15280i = null;
        this.f15281j = null;
    }

    /* renamed from: b */
    public final void mo10281b() {
        this.f15282k = null;
        this.f15283l = null;
        this.f15284m = null;
        this.f15285n = null;
        this.f15286o = null;
        this.f15287p = null;
    }

    /* renamed from: d */
    public final String mo10283d() {
        return m10671a(this.f15272a, this.f15273b);
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        Uri uri = this.f15279h;
        if (uri != null) {
            String valueOf = String.valueOf(uri);
            String valueOf2 = String.valueOf(this.f15280i);
            String valueOf3 = String.valueOf(this.f15281j);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
            sb.append(valueOf);
            sb.append("@");
            sb.append(valueOf2);
            sb.append("@");
            sb.append(valueOf3);
            str = sb.toString();
        } else {
            str = "null@null@null";
        }
        Uri uri2 = this.f15282k;
        if (uri2 != null) {
            String valueOf4 = String.valueOf(uri2);
            String valueOf5 = String.valueOf(this.f15283l);
            String valueOf6 = String.valueOf(this.f15284m);
            String str4 = this.f15285n;
            String str5 = this.f15286o;
            int length = String.valueOf(valueOf4).length();
            int length2 = String.valueOf(valueOf5).length();
            StringBuilder sb2 = new StringBuilder(length + 4 + length2 + String.valueOf(valueOf6).length() + String.valueOf(str4).length() + String.valueOf(str5).length());
            sb2.append(valueOf4);
            sb2.append("@");
            sb2.append(valueOf5);
            sb2.append("@");
            sb2.append(valueOf6);
            sb2.append("@");
            sb2.append(str4);
            sb2.append("@");
            sb2.append(str5);
            str2 = sb2.toString();
        } else {
            str2 = "null@null@null@null@null";
        }
        String valueOf7 = String.valueOf(this.f15289r);
        String str6 = this.f15272a;
        String str7 = this.f15274c;
        String str8 = this.f15273b;
        long j = this.f15275d;
        String str9 = this.f15276e;
        int i = this.f15288q;
        boolean z = this.f15277f;
        Integer num = this.f15278g;
        if (num == null) {
            num = "null";
        }
        String valueOf8 = String.valueOf(num);
        String str10 = this.f15287p;
        if (str10 == null) {
            str10 = "null";
        }
        String str11 = "null";
        boolean z2 = this.f15292u;
        String str12 = this.f15293v;
        if (str12 != null) {
            str3 = m10672b(str12);
        } else {
            str3 = str11;
        }
        boolean z3 = z;
        String str13 = this.f15294w;
        String b = str13 != null ? m10672b(str13) : str11;
        int length3 = String.valueOf(valueOf7).length();
        int length4 = String.valueOf(str6).length();
        int length5 = String.valueOf(str7).length();
        int length6 = String.valueOf(str8).length();
        int length7 = String.valueOf(str9).length();
        int length8 = String.valueOf(str).length();
        int length9 = String.valueOf(str2).length();
        int length10 = String.valueOf(valueOf8).length();
        StringBuilder sb3 = new StringBuilder(length3 + 56 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + str10.length() + String.valueOf(str3).length() + String.valueOf(b).length());
        sb3.append(valueOf7);
        sb3.append("@");
        sb3.append(str6);
        sb3.append("@");
        sb3.append(str7);
        sb3.append("@");
        sb3.append(str8);
        sb3.append("@");
        sb3.append(j);
        sb3.append("@");
        sb3.append(str9);
        sb3.append("@");
        sb3.append(i);
        sb3.append("@");
        sb3.append(z3);
        sb3.append("@");
        sb3.append(str);
        sb3.append("@");
        sb3.append(str2);
        sb3.append("@");
        sb3.append(valueOf8);
        sb3.append("@");
        sb3.append(str10);
        sb3.append("@");
        sb3.append(z2);
        sb3.append("@");
        sb3.append(str3);
        sb3.append("@");
        sb3.append(b);
        sb3.append("@");
        return sb3.toString();
    }

    /* renamed from: c */
    public final String mo10282c() {
        Long l = this.f15289r;
        if (l == null) {
            return m10671a(this.f15272a, this.f15273b);
        }
        return Long.toString(l.longValue());
    }

    private emn(String str, String str2, String str3, long j, String str4, int i, boolean z, Integer num) {
        this.f15289r = null;
        this.f15290s = 0;
        this.f15292u = false;
        this.f15272a = str;
        this.f15273b = str2;
        this.f15274c = str3;
        this.f15275d = j;
        this.f15276e = str4;
        this.f15288q = i;
        this.f15277f = z;
        this.f15278g = num;
        mo10278a();
        mo10281b();
    }

    /* renamed from: a */
    static String m10671a(String str, String str2) {
        return "_" + str + ":" + str2;
    }

    /* renamed from: a */
    public final void mo10279a(Uri uri, long j, int i) {
        this.f15279h = uri;
        this.f15280i = Long.valueOf(j);
        this.f15281j = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo10280a(Uri uri, long j, int i, String str, String str2, String str3) {
        this.f15282k = uri;
        this.f15283l = Long.valueOf(j);
        this.f15284m = Integer.valueOf(i);
        this.f15285n = str;
        this.f15286o = str2;
        this.f15287p = str3;
    }
}
