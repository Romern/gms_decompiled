package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: bbfe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbfe {
    /* renamed from: a */
    public static long m87919a(bavd bavd) {
        if (bavd.f101878h != 0) {
            return TimeUnit.SECONDS.toMillis(bavd.f101878h);
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: b */
    public static String m87923b(bauy bauy) {
        return m87922a(bauy) ? bauy.f101856h : bauy.f101854f;
    }

    /* renamed from: a */
    public static bavr m87920a(String str, String str2) {
        bxvd da = bavr.f101916f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bavr bavr = (bavr) da.f164949b;
        str.getClass();
        bavr.f101918a |= 1;
        bavr.f101919b = str;
        if (bmxx.m108577a(str2)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bavr bavr2 = (bavr) da.f164949b;
            "com.google.android.gms".getClass();
            bavr2.f101918a |= 2;
            bavr2.f101920c = "com.google.android.gms";
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bavr bavr3 = (bavr) da.f164949b;
            str2.getClass();
            bavr3.f101918a |= 2;
            bavr3.f101920c = str2;
        }
        return (bavr) da.mo74062i();
    }

    /* renamed from: a */
    public static boolean m87921a(long j, ayte ayte) {
        return j <= ayte.mo54417a();
    }

    /* renamed from: a */
    public static boolean m87922a(bauy bauy) {
        if ((bauy.f101849a & 32) != 0) {
            bzny bzny = bauy.f101855g;
            if (bzny == null) {
                bzny = bzny.f170777b;
            }
            bxwc bxwc = bzny.f170779a;
            int size = bxwc.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (((bznx) bxwc.get(i)).f170775a == 4) {
                    return true;
                }
                i = i2;
            }
        }
        return false;
    }
}
