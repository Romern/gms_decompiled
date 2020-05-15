package p000;

import android.content.Context;
import android.os.DropBoxManager;
import android.text.TextUtils;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aqdu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqdu {

    /* renamed from: c */
    public static boolean f85787c = false;

    /* renamed from: d */
    public static boolean f85788d = false;

    /* renamed from: e */
    public static boolean f85789e = false;

    /* renamed from: f */
    public static boolean f85790f = false;

    /* renamed from: g */
    public static boolean f85791g = false;

    /* renamed from: h */
    public static long f85792h;

    /* renamed from: i */
    public static String f85793i;

    /* renamed from: j */
    public static String f85794j;

    /* renamed from: k */
    public static final List f85795k = new ArrayList();

    /* renamed from: l */
    public static final Object f85796l = new Object();

    /* renamed from: a */
    public aqaw f85797a = null;

    /* renamed from: b */
    public final Context f85798b;

    /* renamed from: m */
    public String f85799m;

    /* renamed from: n */
    public String f85800n;

    /* renamed from: o */
    public String f85801o;

    /* renamed from: p */
    public int f85802p;

    /* renamed from: q */
    public bxvd f85803q = aqaw.f85497l.mo74144da();

    /* renamed from: r */
    private final apyy f85804r;

    /* renamed from: s */
    private final int f85805s;

    /* renamed from: t */
    private long f85806t;

    static {
        aqdu.class.getCanonicalName();
    }

    public aqdu(Context context, int i) {
        this.f85798b = context;
        this.f85805s = i;
        this.f85804r = new apyy(context, i);
        DropBoxManager dropBoxManager = (DropBoxManager) context.getSystemService("dropbox");
    }

    /* renamed from: a */
    public static void m71410a(Throwable th) {
        synchronized (f85796l) {
            f85795k.add(th.toString());
        }
    }

    /* renamed from: a */
    public final void mo47764a() {
        if (this.f85797a != null) {
            throw new IllegalStateException("Message already finalized");
        }
    }

    /* renamed from: a */
    public final void mo47765a(int i) {
        bxvd da = aqav.f85478r.mo74144da();
        int i2 = this.f85805s;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aqav aqav = (aqav) da.f164949b;
        int i3 = aqav.f85480a | 2;
        aqav.f85480a = i3;
        aqav.f85482c = i2;
        apyy apyy = this.f85804r;
        if (apyy == null) {
            long j = this.f85806t;
            aqav.f85480a = i3 | 4;
            aqav.f85483d = j;
        } else {
            long b = apyy.mo47714b();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aqav aqav2 = (aqav) da.f164949b;
            aqav2.f85480a |= 4;
            aqav2.f85483d = b;
        }
        boolean z = f85787c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aqav aqav3 = (aqav) da.f164949b;
        aqav3.f85480a |= 8;
        aqav3.f85484e = z;
        boolean a = sre.m36080a(this.f85798b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aqav aqav4 = (aqav) da.f164949b;
        aqav4.f85480a |= 4096;
        aqav4.f85493n = a;
        if (f85788d) {
            long j2 = f85792h;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aqav aqav5 = (aqav) da.f164949b;
            aqav5.f85480a |= 32;
            aqav5.f85486g = j2;
            String str = f85793i;
            if (str != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                aqav aqav6 = (aqav) da.f164949b;
                str.getClass();
                aqav6.f85480a |= 128;
                aqav6.f85487h = str;
            }
            f85788d = false;
            f85793i = null;
        }
        if (f85789e) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aqav aqav7 = (aqav) da.f164949b;
            aqav7.f85480a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            aqav7.f85488i = true;
            f85789e = false;
        }
        if (!TextUtils.isEmpty(f85794j)) {
            String substring = f85794j.substring(0, Math.min(128, f85794j.length()));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aqav aqav8 = (aqav) da.f164949b;
            substring.getClass();
            aqav8.f85480a |= 512;
            aqav8.f85490k = substring;
            f85794j = null;
        }
        if (!TextUtils.isEmpty(this.f85799m)) {
            String str2 = this.f85799m;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aqav aqav9 = (aqav) da.f164949b;
            str2.getClass();
            aqav9.f85480a |= 1024;
            aqav9.f85491l = str2;
        }
        if (!TextUtils.isEmpty(this.f85800n)) {
            String str3 = this.f85800n;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aqav aqav10 = (aqav) da.f164949b;
            str3.getClass();
            aqav10.f85480a |= 2048;
            aqav10.f85492m = str3;
        }
        if (!TextUtils.isEmpty(this.f85801o)) {
            String str4 = this.f85801o;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aqav aqav11 = (aqav) da.f164949b;
            str4.getClass();
            aqav11.f85480a |= 8192;
            aqav11.f85494o = str4;
        }
        synchronized (f85796l) {
            if (f85795k.size() > 0) {
                List list = f85795k;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                aqav aqav12 = (aqav) da.f164949b;
                if (!aqav12.f85489j.mo73666a()) {
                    aqav12.f85489j = bxvk.m124021a(aqav12.f85489j);
                }
                bxsy.m123078a(list, aqav12.f85489j);
                f85795k.clear();
            }
        }
        boolean z2 = f85790f;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aqav aqav13 = (aqav) da.f164949b;
        aqav13.f85480a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        aqav13.f85495p = z2;
        boolean z3 = f85791g;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aqav aqav14 = (aqav) da.f164949b;
        int i4 = aqav14.f85480a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        aqav14.f85480a = i4;
        aqav14.f85496q = z3;
        aqav14.f85481b = i - 1;
        int i5 = i4 | 1;
        aqav14.f85480a = i5;
        int i6 = this.f85802p;
        if (!(i6 == 0 || i6 == 1)) {
            aqav14.f85485f = i6 - 1;
            aqav14.f85480a = i5 | 16;
        }
        aqav aqav15 = (aqav) da.mo74062i();
        qws a2 = qws.m33019a(this.f85798b, "ANDROID_SNET_GCORE");
        if (cgkt.m145941m()) {
            a2.mo24337a(cagz.UNMETERED_OR_DAILY);
        }
        a2.mo24335a(aqav15.mo73642k()).mo24327b();
    }

    public aqdu(Context context, long j, int i) {
        this.f85798b = context;
        this.f85806t = j;
        this.f85805s = i;
        this.f85804r = null;
        DropBoxManager dropBoxManager = (DropBoxManager) context.getSystemService("dropbox");
    }

    public aqdu(Context context, apyy apyy, int i) {
        this.f85798b = context;
        this.f85805s = i;
        this.f85804r = apyy;
        DropBoxManager dropBoxManager = (DropBoxManager) context.getSystemService("dropbox");
    }
}
