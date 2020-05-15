package p000;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.gms.auth.api.phone.internal.SmsRetrieverEvent;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.concurrent.TimeUnit;

/* renamed from: ibh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ibh {

    /* renamed from: a */
    public static final Logger f20672a = new Logger("EventLogger");

    /* renamed from: a */
    public static ibf m15168a(String str, long j, int i) {
        hzx hzx = new hzx();
        hzx.mo12846b(15);
        hzx.mo12847c((int) TimeUnit.MILLISECONDS.toSeconds(j));
        if (str != null) {
            hzx.mo12845a(str);
        }
        if (i != 0) {
            hzx.mo12844a(i - 1);
        }
        return ibf.m15162a(hzx.f20616a, true);
    }

    /* renamed from: b */
    public static ibg m15177b(String str) {
        bxvd da = boge.f132963m.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boge boge = (boge) da.f164949b;
        boge.f132966b = 2;
        int i = boge.f132965a | 1;
        boge.f132965a = i;
        if (str != null) {
            str.getClass();
            boge.f132965a = 2 | i;
            boge.f132967c = str;
        }
        return ibg.m15165a((boge) da.mo74062i(), true);
    }

    /* renamed from: c */
    public static ibf m15180c(String str, int i) {
        hzx hzx = new hzx();
        hzx.mo12846b(12);
        if (str != null) {
            hzx.mo12845a(str);
        }
        if (i != 0) {
            hzx.mo12844a(i - 1);
        }
        return ibf.m15162a(hzx.f20616a, true);
    }

    /* renamed from: d */
    public static ibf m15183d(String str, int i) {
        hzx hzx = new hzx();
        hzx.mo12846b(16);
        if (str != null) {
            hzx.mo12845a(str);
        }
        if (i != 0) {
            hzx.mo12844a(i - 1);
        }
        return ibf.m15162a(hzx.f20616a, true);
    }

    /* renamed from: e */
    public static ibf m15186e(String str, int i) {
        hzx hzx = new hzx();
        hzx.mo12846b(21);
        if (str != null) {
            hzx.mo12845a(str);
        }
        if (i != 0) {
            hzx.mo12844a(i - 1);
        }
        return ibf.m15162a(hzx.f20616a, true);
    }

    /* renamed from: f */
    public static ibf m15188f(String str) {
        hzx hzx = new hzx();
        hzx.mo12846b(13);
        if (str != null) {
            hzx.mo12845a(str);
        }
        return ibf.m15162a(hzx.f20616a, true);
    }

    /* renamed from: g */
    public static ibf m15190g(String str) {
        hzx hzx = new hzx();
        hzx.mo12846b(18);
        if (str != null) {
            hzx.mo12845a(str);
        }
        return ibf.m15162a(hzx.f20616a, false);
    }

    /* renamed from: h */
    public static ibf m15191h(String str) {
        hzx hzx = new hzx();
        hzx.mo12846b(19);
        if (str != null) {
            hzx.mo12845a(str);
        }
        return ibf.m15162a(hzx.f20616a, false);
    }

    /* renamed from: i */
    public static ibf m15192i(String str) {
        hzx hzx = new hzx();
        hzx.mo12846b(20);
        if (str != null) {
            hzx.mo12845a(str);
        }
        return ibf.m15162a(hzx.f20616a, false);
    }

    /* renamed from: j */
    public static ibf m15193j(String str) {
        hzx hzx = new hzx();
        hzx.mo12846b(23);
        if (str != null) {
            hzx.mo12845a(str);
        }
        return ibf.m15162a(hzx.f20616a, false);
    }

    /* renamed from: b */
    public static ibg m15178b(String str, int i) {
        bxvd da = boge.f132963m.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boge boge = (boge) da.f164949b;
        boge.f132966b = 11;
        int i2 = boge.f132965a | 1;
        boge.f132965a = i2;
        boge.f132969e = i - 1;
        int i3 = i2 | 8;
        boge.f132965a = i3;
        if (str != null) {
            str.getClass();
            boge.f132965a = i3 | 2;
            boge.f132967c = str;
        }
        return ibg.m15165a((boge) da.mo74062i(), true);
    }

    /* renamed from: f */
    public static ibf m15189f(String str, int i) {
        hzx hzx = new hzx();
        hzx.mo12846b(22);
        if (str != null) {
            hzx.mo12845a(str);
        }
        if (i != 0) {
            hzx.mo12844a(i - 1);
        }
        return ibf.m15162a(hzx.f20616a, true);
    }

    /* renamed from: a */
    public static ibf m15169a(String str, bofz bofz) {
        bmxy.m108581a(bofz);
        hzx hzx = new hzx();
        hzx.mo12846b(17);
        int i = bofz.f132960d;
        hzx.f20616a.f10276l = PSKKeyManager.MAX_KEY_LENGTH_BYTES | hzx.f20616a.f10276l;
        hzx.f20616a.f10273i = i;
        if (str != null) {
            hzx.mo12845a(str);
        }
        return ibf.m15162a(hzx.f20616a, true);
    }

    /* renamed from: c */
    public static ibf m15181c(String str, long j) {
        hzx hzx = new hzx();
        hzx.mo12846b(14);
        hzx.mo12847c((int) TimeUnit.MILLISECONDS.toSeconds(j));
        if (str != null) {
            hzx.mo12845a(str);
        }
        return ibf.m15162a(hzx.f20616a, true);
    }

    /* renamed from: d */
    public static ibf m15184d(String str, long j) {
        hzx hzx = new hzx();
        hzx.mo12846b(24);
        hzx.mo12847c((int) TimeUnit.MILLISECONDS.toSeconds(j));
        if (str != null) {
            hzx.mo12845a(str);
        }
        return ibf.m15162a(hzx.f20616a, true);
    }

    /* renamed from: e */
    public static ibg m15187e(String str) {
        bxvd da = boge.f132963m.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boge boge = (boge) da.f164949b;
        boge.f132966b = 8;
        int i = boge.f132965a | 1;
        boge.f132965a = i;
        if (str != null) {
            str.getClass();
            boge.f132965a = i | 2;
            boge.f132967c = str;
        }
        return ibg.m15165a((boge) da.mo74062i(), true);
    }

    /* renamed from: b */
    public static ibg m15179b(String str, long j) {
        bxvd da = boge.f132963m.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boge boge = (boge) da.f164949b;
        boge.f132966b = 9;
        boge.f132965a |= 1;
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(j);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boge boge2 = (boge) da.f164949b;
        int i = boge2.f132965a | 128;
        boge2.f132965a = i;
        boge2.f132973i = seconds;
        if (str != null) {
            str.getClass();
            boge2.f132965a = i | 2;
            boge2.f132967c = str;
        }
        return ibg.m15165a((boge) da.mo74062i(), true);
    }

    /* renamed from: c */
    public static ibg m15182c(String str) {
        bxvd da = boge.f132963m.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boge boge = (boge) da.f164949b;
        boge.f132966b = 6;
        int i = boge.f132965a | 1;
        boge.f132965a = i;
        if (str != null) {
            str.getClass();
            boge.f132965a = i | 2;
            boge.f132967c = str;
        }
        return ibg.m15165a((boge) da.mo74062i(), true);
    }

    /* renamed from: d */
    public static ibg m15185d(String str) {
        bxvd da = boge.f132963m.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boge boge = (boge) da.f164949b;
        boge.f132966b = 7;
        int i = boge.f132965a | 1;
        boge.f132965a = i;
        if (str != null) {
            str.getClass();
            boge.f132965a = i | 2;
            boge.f132967c = str;
        }
        return ibg.m15165a((boge) da.mo74062i(), true);
    }

    /* renamed from: a */
    public static ibg m15170a(int i) {
        bxvd da = boge.f132963m.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boge boge = (boge) da.f164949b;
        boge.f132966b = 5;
        int i2 = boge.f132965a | 1;
        boge.f132965a = i2;
        boge.f132965a = i2 | 64;
        boge.f132972h = i;
        return ibg.m15165a((boge) da.mo74062i(), true);
    }

    /* renamed from: a */
    public static ibg m15171a(String str) {
        bxvd da = boge.f132963m.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boge boge = (boge) da.f164949b;
        boge.f132966b = 0;
        int i = boge.f132965a | 1;
        boge.f132965a = i;
        if (str != null) {
            str.getClass();
            boge.f132965a = i | 2;
            boge.f132967c = str;
        }
        return ibg.m15165a((boge) da.mo74062i(), true);
    }

    /* renamed from: a */
    public static ibg m15172a(String str, int i) {
        bxvd da = boge.f132963m.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boge boge = (boge) da.f164949b;
        boge.f132966b = 3;
        int i2 = boge.f132965a | 1;
        boge.f132965a = i2;
        boge.f132969e = i - 1;
        int i3 = i2 | 8;
        boge.f132965a = i3;
        if (str != null) {
            str.getClass();
            boge.f132965a = i3 | 2;
            boge.f132967c = str;
        }
        return ibg.m15165a((boge) da.mo74062i(), false);
    }

    /* renamed from: a */
    public static ibg m15173a(String str, long j) {
        bxvd da = boge.f132963m.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boge boge = (boge) da.f164949b;
        boge.f132966b = 1;
        boge.f132965a |= 1;
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(j);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boge boge2 = (boge) da.f164949b;
        int i = boge2.f132965a | 4;
        boge2.f132965a = i;
        boge2.f132968d = seconds;
        if (str != null) {
            str.getClass();
            boge2.f132965a = i | 2;
            boge2.f132967c = str;
        }
        return ibg.m15165a((boge) da.mo74062i(), true);
    }

    /* renamed from: a */
    public static ibg m15174a(String str, long j, bofz bofz) {
        bxvd da = boge.f132963m.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boge boge = (boge) da.f164949b;
        boge.f132966b = 10;
        boge.f132965a |= 1;
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(j);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boge boge2 = (boge) da.f164949b;
        int i = boge2.f132965a | 4;
        boge2.f132965a = i;
        boge2.f132968d = seconds;
        boge2.f132974j = bofz.f132960d;
        int i2 = i | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        boge2.f132965a = i2;
        if (str != null) {
            str.getClass();
            boge2.f132965a = i2 | 2;
            boge2.f132967c = str;
        }
        return ibg.m15165a((boge) da.mo74062i(), true);
    }

    /* renamed from: a */
    public static ibg m15175a(String str, boolean z, bofz bofz) {
        bxvd da = boge.f132963m.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boge boge = (boge) da.f164949b;
        boge.f132966b = 4;
        int i = boge.f132965a | 1;
        boge.f132965a = i;
        if (bofz != null) {
            boge.f132975k = bofz.f132960d;
            i |= 512;
            boge.f132965a = i;
        }
        if (str != null) {
            str.getClass();
            i |= 2;
            boge.f132965a = i;
            boge.f132967c = str;
        }
        boge.f132965a = i | 1024;
        boge.f132976l = z;
        return ibg.m15165a((boge) da.mo74062i(), true);
    }

    /* renamed from: a */
    private static final String m15176a(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
    }

    /* renamed from: a */
    public final void mo12886a(Context context, ibf ibf) {
        String a;
        if (!cceb.m129360d()) {
            f20672a.mo25412b("Metrics logging flag is not enabled.", new Object[0]);
            return;
        }
        bmxy.m108581a(context);
        bmxy.m108581a(ibf);
        SmsRetrieverEvent a2 = ibf.mo12871a();
        if (ibf.mo12872b() && (a = m15176a(context)) != null) {
            hzx hzx = new hzx(a2);
            hzx.f20616a.f10276l = 16 | hzx.f20616a.f10276l;
            a2 = hzx.f20616a;
            a2.f10269e = a;
        }
        iai iai = new iai(context);
        bmxy.m108581a(a2);
        roz b = rpa.m34196b();
        b.f43472a = new iag(a2);
        aucb b2 = iai.mo24732b(b.mo24977a());
        b2.mo50373a(ibd.f20670a);
        b2.mo50372a(ibe.f20671a);
    }

    /* renamed from: a */
    public final void mo12887a(Context context, ibg ibg) {
        String a;
        boge a2 = ibg.mo12881a();
        if (ibg.mo12882b() && (a = m15176a(context)) != null) {
            bxvd bxvd = (bxvd) a2.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) a2);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boge boge = (boge) bxvd.f164949b;
            boge boge2 = boge.f132963m;
            a.getClass();
            boge.f132965a |= 16;
            boge.f132970f = a;
            a2 = (boge) bxvd.mo74062i();
        }
        bxvd da = boct.f132600I.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boct boct = (boct) da.f164949b;
        boct.f132612c = 20;
        int i = boct.f132610a | 1;
        boct.f132610a = i;
        a2.getClass();
        boct.f132631v = a2;
        boct.f132610a = 4194304 | i;
        new qws(context, "ANDROID_AUTH", null).mo24333a((boct) da.mo74062i()).mo24327b();
        f20672a.mo25412b("Event logged", new Object[0]);
    }
}
