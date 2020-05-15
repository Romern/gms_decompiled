package p000;

import android.util.Base64;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.concurrent.Callable;
import javax.crypto.Mac;

/* renamed from: acky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acky {
    /* renamed from: a */
    public static int m49354a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2 || i == 3) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        throw new IllegalArgumentException("unknown rankingStrategy");
    }

    /* renamed from: b */
    public static int m49364b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 6;
        }
        if (i != 4) {
            return i != 5 ? 5 : 8;
        }
        return 7;
    }

    /* renamed from: a */
    public static int m49355a(int i, int i2) {
        if (i == 0) {
            return i2 == 3 ? 2 : 1;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 3;
        }
        throw new IllegalArgumentException("unknown queryTokenizer");
    }

    /* renamed from: a */
    public static abtd m49356a(GlobalSearchApplicationInfo globalSearchApplicationInfo) {
        bxvd da = abtd.f58201j.mo74144da();
        String b = bmxx.m108578b(globalSearchApplicationInfo.f9562a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abtd abtd = (abtd) da.f164949b;
        b.getClass();
        abtd.f58203a |= 1;
        abtd.f58204b = b;
        String b2 = bmxx.m108578b(globalSearchApplicationInfo.f9563b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abtd abtd2 = (abtd) da.f164949b;
        b2.getClass();
        int i = abtd2.f58203a | 2;
        abtd2.f58203a = i;
        abtd2.f58205c = b2;
        int i2 = globalSearchApplicationInfo.f9564c;
        int i3 = i | 4;
        abtd2.f58203a = i3;
        abtd2.f58206d = i2;
        int i4 = globalSearchApplicationInfo.f9565d;
        int i5 = i3 | 8;
        abtd2.f58203a = i5;
        abtd2.f58207e = i4;
        int i6 = globalSearchApplicationInfo.f9566e;
        abtd2.f58203a = i5 | 16;
        abtd2.f58208f = i6;
        String b3 = bmxx.m108578b(globalSearchApplicationInfo.f9567f);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abtd abtd3 = (abtd) da.f164949b;
        b3.getClass();
        abtd3.f58203a |= 32;
        abtd3.f58209g = b3;
        String b4 = bmxx.m108578b(globalSearchApplicationInfo.f9568g);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abtd abtd4 = (abtd) da.f164949b;
        b4.getClass();
        abtd4.f58203a |= 64;
        abtd4.f58210h = b4;
        String b5 = bmxx.m108578b(globalSearchApplicationInfo.f9569h);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abtd abtd5 = (abtd) da.f164949b;
        b5.getClass();
        abtd5.f58203a |= 128;
        abtd5.f58211i = b5;
        return (abtd) da.mo74062i();
    }

    /* renamed from: a */
    public static abtv m49357a() {
        bxvd da = abtv.f58318i.mo74144da();
        int intValue = ((Integer) abzt.f58947bi.mo58455c()).intValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abtv abtv = (abtv) da.f164949b;
        abtv.f58320a |= 1;
        abtv.f58321b = intValue;
        int intValue2 = ((Integer) abzt.f58953bo.mo58455c()).intValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abtv abtv2 = (abtv) da.f164949b;
        abtv2.f58320a |= 2;
        abtv2.f58322c = intValue2;
        boolean booleanValue = ((Boolean) abzt.f58948bj.mo58455c()).booleanValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abtv abtv3 = (abtv) da.f164949b;
        abtv3.f58320a |= 4;
        abtv3.f58323d = booleanValue;
        boolean booleanValue2 = ((Boolean) acaw.f59311ao.mo58455c()).booleanValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abtv abtv4 = (abtv) da.f164949b;
        abtv4.f58320a |= 8;
        abtv4.f58324e = booleanValue2;
        boolean booleanValue3 = ((Boolean) acaw.f59273aC.mo58455c()).booleanValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abtv abtv5 = (abtv) da.f164949b;
        abtv5.f58320a |= 32;
        abtv5.f58325f = booleanValue3;
        int intValue3 = ((Integer) abzt.f58980co.mo58455c()).intValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abtv abtv6 = (abtv) da.f164949b;
        abtv6.f58320a |= 64;
        abtv6.f58326g = intValue3;
        boolean m = cemw.f183016a.mo6606a().mo79383m();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abtv abtv7 = (abtv) da.f164949b;
        abtv7.f58320a |= 128;
        abtv7.f58327h = m;
        return (abtv) da.mo74062i();
    }

    /* renamed from: a */
    public static bxxc m49358a(String str, bxxk bxxk) {
        if (str != null) {
            try {
                return (bxxc) bxxk.mo73657a(Base64.decode(str, 0));
            } catch (bxwf e) {
                absg.m48189a(e, "Corrupted message");
            }
        }
        try {
            return (bxxc) bxxk.mo73653a(ByteString.f164797b);
        } catch (bxwf e2) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public static GlobalSearchApplicationInfo m49359a(abtd abtd) {
        String str;
        String str2;
        String str3 = null;
        if (abtd == null) {
            return null;
        }
        if (!abtd.f58204b.isEmpty()) {
            str = abtd.f58204b;
        } else {
            str = null;
        }
        if (!abtd.f58205c.isEmpty()) {
            str2 = abtd.f58205c;
        } else {
            str2 = null;
        }
        int i = abtd.f58206d;
        int i2 = abtd.f58207e;
        int i3 = abtd.f58208f;
        String str4 = !abtd.f58209g.isEmpty() ? abtd.f58209g : null;
        String str5 = !abtd.f58210h.isEmpty() ? abtd.f58210h : null;
        if (!abtd.f58211i.isEmpty()) {
            str3 = abtd.f58211i;
        }
        return new GlobalSearchApplicationInfo(str, str2, i, i2, i3, str4, str5, str3);
    }

    /* renamed from: a */
    private static Object m49360a(Callable callable) {
        char c = 0;
        while (true) {
            try {
                return ((ackx) callable).call();
            } catch (NoSuchAlgorithmException e) {
                if (c <= 0) {
                    c = 1;
                } else {
                    throw e;
                }
            }
        }
    }

    /* renamed from: a */
    public static String m49361a(long j) {
        if (j > 1073741824) {
            Locale locale = Locale.US;
            double d = (double) j;
            Double.isNaN(d);
            return String.format(locale, "%.2fGB", Double.valueOf(d / 1.073741824E9d));
        } else if (j > 1048576) {
            Locale locale2 = Locale.US;
            double d2 = (double) j;
            Double.isNaN(d2);
            return String.format(locale2, "%.2fMB", Double.valueOf(d2 / 1048576.0d));
        } else if (j > 1024) {
            Locale locale3 = Locale.US;
            double d3 = (double) j;
            Double.isNaN(d3);
            return String.format(locale3, "%.2fKB", Double.valueOf(d3 / 1024.0d));
        } else {
            return String.format(Locale.US, "%d Bytes", Long.valueOf(j));
        }
    }

    /* renamed from: a */
    public static String m49362a(bxxc bxxc) {
        return Base64.encodeToString(bxxc.serializeToBytes(), 0);
    }

    /* renamed from: a */
    public static Mac m49363a(String str) {
        try {
            return (Mac) m49360a(new ackx(str));
        } catch (NoSuchAlgorithmException e) {
            absg.m48195b(e, "Mac algorithm %s not available", str);
            return null;
        } catch (Exception e2) {
            throw new RuntimeException("Unexpected exception from Mac.getInstance", e2);
        }
    }
}
