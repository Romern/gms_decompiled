package p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.google.android.cast.JGCastService;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import com.google.location.nearby.common.fastpair.DiscoveryListItem;
import java.util.List;
import java.util.Objects;

/* renamed from: ahsu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahsu implements Comparable {

    /* renamed from: c */
    private static final byzm f67967c = ahsf.m56458a(101);

    /* renamed from: a */
    public final sqv f67968a;

    /* renamed from: b */
    public aiaa f67969b;

    /* renamed from: d */
    private final ahst f67970d;

    public ahsu(Context context, aiaa aiaa) {
        this.f67970d = (ahst) ahgz.m55754a(context, ahst.class);
        this.f67968a = (sqv) ahgz.m55754a(context, sqv.class);
        this.f67969b = aiaa;
    }

    /* renamed from: K */
    private final Float m56511K() {
        aiaa aiaa = this.f67969b;
        if ((aiaa.f68513a & 1048576) != 0) {
            return Float.valueOf(aiaa.f68535w);
        }
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ahsu.a(aiab, boolean):void
     arg types: [aiab, int]
     candidates:
      ahsu.a(byzm, byzm):int
      ahsu.a(long, aiaa):boolean
      ahsu.a(long, java.lang.Long):boolean
      ahsu.a(aiaa, long):boolean
      ahsu.a(sqv, aiab):boolean
      ahsu.a(int, java.lang.String):void
      ahsu.a(aiab, boolean):void */
    /* renamed from: L */
    private final void m56512L() {
        List D = mo37057D();
        int size = D.size();
        for (int i = 0; i < size; i++) {
            mo37068a((aiab) D.get(i), false);
        }
    }

    /* renamed from: a */
    private static int m56513a(byzm byzm, byzm byzm2) {
        int i = 1;
        if (byzm == null) {
            return byzm2 != null ? -1 : 0;
        }
        if (byzm2 == null) {
            return 1;
        }
        int b = bzaw.m125599b(byzm.f169128b);
        if (b == 0) {
            b = 1;
        }
        int i2 = b - 1;
        int b2 = bzaw.m125599b(byzm2.f169128b);
        if (b2 != 0) {
            i = b2;
        }
        return i2 - (i - 1);
    }

    /* renamed from: a */
    private static boolean m56518a(byzm byzm) {
        return (byzm.f169127a & 4) != 0 || byzm.f169129c > 0.0d;
    }

    /* renamed from: b */
    public static boolean m56521b(long j, Long l) {
        if (l == null || j - l.longValue() >= cfod.f184793a.mo6606a().mo81885G()) {
            return true;
        }
        return false;
    }

    /* renamed from: A */
    public final Bitmap mo37054A() {
        aiaa aiaa = this.f67969b;
        if ((aiaa.f68513a & 8388608) == 0) {
            return null;
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(aiaa.f68538z.getKey(), 0, this.f67969b.f68538z.mo73744a());
        if (!bush.m120379a(decodeByteArray)) {
            return null;
        }
        return decodeByteArray;
    }

    /* renamed from: B */
    public final String mo37055B() {
        aiaa aiaa = this.f67969b;
        if ((aiaa.f68513a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != 0) {
            return aiaa.f68531s;
        }
        return null;
    }

    /* renamed from: C */
    public final boolean mo37056C() {
        bxwc bxwc = this.f67969b.f68505C;
        int size = bxwc.size();
        int i = 0;
        while (i < size) {
            byzm byzm = ((aiab) bxwc.get(i)).f68542b;
            if (byzm == null) {
                byzm = byzm.f169125d;
            }
            i++;
            if (m56518a(byzm)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    public final List mo37057D() {
        return this.f67969b.f68505C;
    }

    /* renamed from: E */
    public final Long mo37058E() {
        aiaa aiaa = this.f67969b;
        if ((aiaa.f68513a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE) != 0) {
            return Long.valueOf(aiaa.f68532t);
        }
        return null;
    }

    /* renamed from: F */
    public final Integer mo37059F() {
        Object[] objArr = new Object[2];
        aiaa aiaa = this.f67969b;
        objArr[0] = aiaa.f68537y;
        bzar a = bzar.m125589a(aiaa.f68533u);
        if (a == null) {
            a = bzar.DISCOVERY_ATTACHMENT_TYPE_UNKNOWN;
        }
        objArr[1] = a;
        return Integer.valueOf(Objects.hash(objArr));
    }

    /* renamed from: G */
    public final String mo37060G() {
        aiaa aiaa = this.f67969b;
        if ((aiaa.f68513a & 4194304) != 0) {
            return aiaa.f68537y;
        }
        return null;
    }

    /* renamed from: H */
    public final int mo37061H() {
        int a = ahzv.m56936a(this.f67969b.f68504B);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: I */
    public final int mo37062I() {
        int a = ahzx.m56938a(this.f67969b.f68507E);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: J */
    public final int mo37063J() {
        int a = ahzz.m56940a(this.f67969b.f68525m);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: b */
    public final String mo37071b() {
        return this.f67969b.f68503A;
    }

    /* renamed from: c */
    public final boolean mo37075c() {
        return m56517a(this.f67969b, this.f67968a.mo20505a());
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        double d;
        ahsu ahsu = (ahsu) obj;
        if (mo37085j() != ahsu.mo37085j()) {
            return !mo37080f() ? -1 : 1;
        }
        int a = m56513a(mo37094s(), ahsu.mo37094s());
        if (a != 0) {
            return a;
        }
        Double z = mo37102z();
        Double z2 = ahsu.mo37102z();
        double d2 = Double.MAX_VALUE;
        if (z != null) {
            d = z.doubleValue();
        } else {
            d = Double.MAX_VALUE;
        }
        Double valueOf = Double.valueOf(d);
        if (z2 != null) {
            d2 = z2.doubleValue();
        }
        return -valueOf.compareTo(Double.valueOf(d2));
    }

    /* renamed from: d */
    public final boolean mo37077d() {
        aiaa aiaa = this.f67969b;
        if ((aiaa.f68513a & 8) == 0) {
            return false;
        }
        Intent a = aiae.m56947a(aiaa.f68518f);
        if (a != null) {
            return "com.google.android.gms.nearby.discovery:ACTION_MAGIC_PAIR".equals(a.getAction());
        }
        ((bnsl) ahsd.f67925a.mo68388c()).mo68420a("FastPair: fail to parse action url %s", this.f67969b.f68518f);
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ahsu) {
            return ((ahsu) obj).f67969b.equals(this.f67969b);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo37080f() {
        bzbk a = bzbk.m125615a(this.f67969b.f68516d);
        if (a == null) {
            a = bzbk.NEARBY_TYPE_UNKNOWN;
        }
        return m56519a(a);
    }

    /* renamed from: g */
    public final boolean mo37081g() {
        int a = ahzz.m56940a(this.f67969b.f68525m);
        return a == 0 || a != 2;
    }

    /* renamed from: h */
    public final int mo37082h() {
        String str;
        bzbk bzbk = bzbk.NEARBY_TYPE_UNKNOWN;
        bzbk a = bzbk.m125615a(this.f67969b.f68516d);
        if (a == null) {
            a = bzbk.NEARBY_TYPE_UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 3 || ordinal == 4) {
            bzbk a2 = bzbk.m125615a(this.f67969b.f68516d);
            if (a2 == null) {
                a2 = bzbk.NEARBY_TYPE_UNKNOWN;
            }
            return Objects.hashCode(a2);
        }
        Object[] objArr = new Object[6];
        bzbk a3 = bzbk.m125615a(this.f67969b.f68516d);
        if (a3 == null) {
            a3 = bzbk.NEARBY_TYPE_UNKNOWN;
        }
        objArr[0] = a3;
        aiaa aiaa = this.f67969b;
        objArr[1] = aiaa.f68520h;
        objArr[2] = aiaa.f68521i;
        objArr[3] = aiaa.f68530r;
        objArr[4] = aiaa.f68522j;
        if (cfoj.m141564n()) {
            str = this.f67969b.f68517e;
        } else {
            str = null;
        }
        objArr[5] = str;
        return Objects.hash(objArr);
    }

    public final int hashCode() {
        aiaa aiaa = this.f67969b;
        int i = aiaa.f164758ag;
        if (i != 0) {
            return i;
        }
        int a = bxxm.f165037a.mo74228a(aiaa).mo74216a(aiaa);
        aiaa.f164758ag = a;
        return a;
    }

    /* renamed from: i */
    public final String mo37084i() {
        aiaa aiaa = this.f67969b;
        if ((aiaa.f68513a & 1) != 0) {
            return aiaa.f68515c;
        }
        return null;
    }

    /* renamed from: j */
    public final bzbk mo37085j() {
        aiaa aiaa = this.f67969b;
        if ((aiaa.f68513a & 2) == 0) {
            return null;
        }
        bzbk a = bzbk.m125615a(aiaa.f68516d);
        return a == null ? bzbk.NEARBY_TYPE_UNKNOWN : a;
    }

    /* renamed from: k */
    public final String mo37086k() {
        aiaa aiaa = this.f67969b;
        if ((aiaa.f68513a & 32) != 0) {
            return aiaa.f68520h;
        }
        return null;
    }

    /* renamed from: l */
    public final String mo37087l() {
        aiaa aiaa = this.f67969b;
        if ((aiaa.f68513a & 64) != 0) {
            return aiaa.f68521i;
        }
        return null;
    }

    /* renamed from: m */
    public final String mo37088m() {
        aiaa aiaa = this.f67969b;
        if ((aiaa.f68513a & 4) != 0) {
            return aiaa.f68517e;
        }
        return null;
    }

    /* renamed from: n */
    public final byte[] mo37089n() {
        aiaa aiaa = this.f67969b;
        if ((aiaa.f68513a & JGCastService.FLAG_PRIVATE_DISPLAY) != 0) {
            return aiaa.f68510H.getKey();
        }
        return null;
    }

    /* renamed from: o */
    public final String mo37090o() {
        aiaa aiaa = this.f67969b;
        if ((aiaa.f68513a & 8) == 0) {
            return null;
        }
        Intent a = aiae.m56947a(aiaa.f68518f);
        if (a != null) {
            return a.getStringExtra("com.google.android.gms.nearby.discovery.EXTRA_FAST_PAIR_SECRET");
        }
        ((bnsl) ahsd.f67925a.mo68388c()).mo68420a("FastPair: fail to parse action url %s", this.f67969b.f68518f);
        return null;
    }

    /* renamed from: p */
    public final byzb mo37091p() {
        aiaa aiaa = this.f67969b;
        if ((aiaa.f68513a & Integer.MIN_VALUE) == 0) {
            return null;
        }
        byzb byzb = aiaa.f68511I;
        return byzb == null ? byzb.f169045j : byzb;
    }

    /* renamed from: q */
    public final boolean mo37092q() {
        int a;
        return (mo37091p() == null || (a = bzbc.m125607a(mo37091p().f169049c)) == 0 || a != 2) ? false : true;
    }

    /* renamed from: r */
    public final List mo37093r() {
        byzb p = mo37091p();
        if (p == null) {
            return bngx.m109376e();
        }
        return new bxvv(p.f169052f, byzb.f169044g);
    }

    /* renamed from: s */
    public final byzm mo37094s() {
        byzm byzm = f67967c;
        bxwc bxwc = this.f67969b.f68505C;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            aiab aiab = (aiab) bxwc.get(i);
            if (m56520a(this.f67968a, aiab)) {
                byzm byzm2 = aiab.f68542b;
                if (byzm2 == null) {
                    byzm2 = byzm.f169125d;
                }
                if (m56513a(byzm2, byzm) > 0 && (byzm = aiab.f68542b) == null) {
                    byzm = byzm.f169125d;
                }
            }
        }
        return byzm;
    }

    /* renamed from: t */
    public final String mo37095t() {
        aiaa aiaa = this.f67969b;
        if ((aiaa.f68513a & 8) != 0) {
            return aiaa.f68518f;
        }
        return null;
    }

    public final String toString() {
        Object[] objArr = new Object[9];
        objArr[0] = mo37085j().name();
        int i = 1;
        objArr[1] = mo37060G();
        objArr[2] = mo37084i();
        objArr[3] = mo37086k();
        objArr[4] = mo37095t();
        objArr[5] = Boolean.valueOf(mo37056C());
        int b = bzaw.m125599b(mo37094s().f169128b);
        if (b != 0) {
            i = b;
        }
        objArr[6] = bzaw.m125598a(i);
        objArr[7] = Boolean.valueOf(mo37078e());
        objArr[8] = mo37088m();
        return String.format("[type=%s], [triggerId=%s], [id=%s], [title=%s], [url=%s], [targeting=%s], [R=%s], [ready=%s], [macAddress=%s]", objArr);
    }

    /* renamed from: u */
    public final Integer mo37097u() {
        aiaa aiaa = this.f67969b;
        if ((aiaa.f68513a & 8192) != 0) {
            return Integer.valueOf(aiaa.f68528p);
        }
        return null;
    }

    /* renamed from: v */
    public final byte[] mo37098v() {
        aiaa aiaa = this.f67969b;
        if ((aiaa.f68513a & 268435456) != 0) {
            return aiaa.f68508F.getKey();
        }
        return null;
    }

    /* renamed from: w */
    public final Integer mo37099w() {
        aiaa aiaa = this.f67969b;
        if ((aiaa.f68513a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0) {
            return Integer.valueOf(aiaa.f68529q);
        }
        return null;
    }

    /* renamed from: x */
    public final Long mo37100x() {
        aiaa aiaa = this.f67969b;
        if ((aiaa.f68513a & 512) != 0) {
            return Long.valueOf(aiaa.f68524l);
        }
        return null;
    }

    /* renamed from: y */
    public final Long mo37101y() {
        aiaa aiaa = this.f67969b;
        if ((aiaa.f68513a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            return Long.valueOf(aiaa.f68523k);
        }
        return null;
    }

    /* renamed from: z */
    public final Double mo37102z() {
        aiaa aiaa = this.f67969b;
        int i = aiaa.f68513a;
        if ((i & 8192) == 0 || (i & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) == 0) {
            return null;
        }
        return Double.valueOf(nhe.m26254b(aiaa.f68528p, aiaa.f68529q));
    }

    /* renamed from: e */
    public final boolean mo37078e() {
        bzbk j = mo37085j();
        if (j == bzbk.NEARBY_CHROMECAST || j == bzbk.NEARBY_WEAR) {
            return true;
        }
        boolean z = !this.f67969b.f68518f.isEmpty();
        if (TextUtils.isEmpty(this.f67969b.f68520h) || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static aiaa m56514a() {
        bxvd da = aiaa.f68501K.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aiaa aiaa = (aiaa) da.f164949b;
        aiaa.f68525m = 1;
        aiaa.f68513a |= 1024;
        return (aiaa) da.mo74062i();
    }

    /* renamed from: b */
    public static boolean m56522b(bzbk bzbk) {
        bzbk bzbk2 = bzbk.NEARBY_TYPE_UNKNOWN;
        int ordinal = bzbk.ordinal();
        if (ordinal == 3) {
            return cfod.f184793a.mo6606a().mo81921j();
        }
        if (ordinal == 4) {
            return cfod.f184793a.mo6606a().mo81911af();
        }
        if (ordinal == 5) {
            return cfod.f184793a.mo6606a().mo81882D();
        }
        ((bnsl) ahsd.f67925a.mo68387b()).mo68420a("Invalid item type %s", bzbk.name());
        return false;
    }

    /* renamed from: a */
    public static boolean m56515a(long j, aiaa aiaa) {
        if ((aiaa.f68513a & 4096) == 0 || j - aiaa.f68527o >= cfod.f184793a.mo6606a().mo81915d()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m56516a(long j, Long l) {
        return l == null || j - l.longValue() >= cfod.m141151k();
    }

    /* renamed from: a */
    static boolean m56517a(aiaa aiaa, long j) {
        Long l;
        int i = aiaa.f68513a;
        if ((67108864 & i) != 0 && aiaa.f68523k <= aiaa.f68506D) {
            return false;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            l = Long.valueOf(aiaa.f68523k);
        } else {
            l = null;
        }
        return !m56516a(j, l);
    }

    /* renamed from: b */
    public final void mo37072b(int i) {
        int a = ahzz.m56940a(this.f67969b.f68525m);
        if (a == 0) {
            a = 1;
        }
        if (a != i) {
            aiaa aiaa = this.f67969b;
            bxvd bxvd = (bxvd) aiaa.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) aiaa);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            aiaa aiaa2 = (aiaa) bxvd.f164949b;
            aiaa aiaa3 = aiaa.f68501K;
            aiaa2.f68525m = i - 1;
            aiaa2.f68513a |= 1024;
            this.f67969b = (aiaa) bxvd.mo74062i();
            m56512L();
            this.f67970d.mo37046b(this);
        }
    }

    /* renamed from: a */
    public static boolean m56519a(bzbk bzbk) {
        return bzbk == bzbk.NEARBY_CHROMECAST || bzbk == bzbk.NEARBY_WEAR || bzbk == bzbk.NEARBY_DEVICE;
    }

    /* renamed from: a */
    public static boolean m56520a(sqv sqv, aiab aiab) {
        byzm byzm = aiab.f68542b;
        if (byzm == null) {
            byzm = byzm.f169125d;
        }
        if (m56518a(byzm)) {
            return (aiab.f68541a & 2) != 0 && sqv.mo20505a() - aiab.f68543c < cfod.m141151k();
        }
        return true;
    }

    /* renamed from: b */
    public final void mo37073b(int i, String str) {
        if (str == null) {
            aiaa aiaa = this.f67969b;
            bxvd bxvd = (bxvd) aiaa.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) aiaa);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            aiaa aiaa2 = (aiaa) bxvd.f164949b;
            aiaa aiaa3 = aiaa.f68501K;
            aiaa2.f68513a &= -16777217;
            aiaa2.f68503A = aiaa.f68501K.f68503A;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            aiaa aiaa4 = (aiaa) bxvd.f164949b;
            aiaa4.f68504B = i - 1;
            aiaa4.f68513a |= 33554432;
            this.f67969b = (aiaa) bxvd.mo74062i();
        } else {
            aiaa aiaa5 = this.f67969b;
            bxvd bxvd2 = (bxvd) aiaa5.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) aiaa5);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            aiaa aiaa6 = (aiaa) bxvd2.f164949b;
            aiaa aiaa7 = aiaa.f68501K;
            str.getClass();
            int i2 = aiaa6.f68513a | 16777216;
            aiaa6.f68513a = i2;
            aiaa6.f68503A = str;
            aiaa6.f68504B = i - 1;
            aiaa6.f68513a = i2 | 33554432;
            this.f67969b = (aiaa) bxvd2.mo74062i();
        }
        this.f67970d.mo37046b(this);
    }

    /* renamed from: a */
    public final DiscoveryListItem mo37064a(Intent intent) {
        String str;
        String str2;
        float f;
        String str3;
        String str4;
        boolean z;
        String i = mo37084i();
        String k = mo37086k();
        String l = mo37087l();
        aiaa aiaa = this.f67969b;
        int i2 = aiaa.f68513a;
        if ((32768 & i2) != 0) {
            str = aiaa.f68530r;
        } else {
            str = null;
        }
        if ((i2 & AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS) != 0) {
            str2 = aiaa.f68534v;
        } else {
            str2 = null;
        }
        if (m56511K() != null) {
            f = m56511K().floatValue();
        } else {
            f = -1.0f;
        }
        aiaa aiaa2 = this.f67969b;
        int i3 = aiaa2.f68513a;
        if ((2097152 & i3) != 0) {
            str3 = aiaa2.f68536x;
        } else {
            str3 = null;
        }
        if ((i3 & 128) != 0) {
            str4 = aiaa2.f68522j;
        } else {
            str4 = mo37095t();
        }
        boolean g = mo37081g();
        bzbk j = mo37085j();
        Bitmap A = mo37054A();
        int a = bzbo.m125621a(this.f67969b.f68526n);
        if (a == 0) {
            a = 1;
        }
        if (a == 3) {
            z = true;
        } else {
            z = false;
        }
        return new DiscoveryListItem(i, k, l, str, str2, f, str3, str4, g, j, intent, A, z, mo37102z(), mo37088m());
    }

    /* renamed from: a */
    public final void mo37065a(int i) {
        aiaa aiaa = this.f67969b;
        bxvd bxvd = (bxvd) aiaa.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) aiaa);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        aiaa aiaa2 = (aiaa) bxvd.f164949b;
        aiaa aiaa3 = aiaa.f68501K;
        aiaa2.f68507E = i - 1;
        aiaa2.f68513a |= 134217728;
        this.f67969b = (aiaa) bxvd.mo74062i();
        this.f67970d.mo37046b(this);
    }

    /* renamed from: b */
    public final boolean mo37074b(long j) {
        return m56515a(j, this.f67969b);
    }

    /* renamed from: a */
    public final void mo37066a(int i, String str) {
        ((bnsl) ahsd.f67925a.mo68390d()).mo68424a("Item disabled on client: %s, %s", str, this);
        mo37073b(i, str);
    }

    /* renamed from: a */
    public final void mo37067a(long j) {
        aiaa aiaa = this.f67969b;
        bxvd bxvd = (bxvd) aiaa.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) aiaa);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        aiaa aiaa2 = (aiaa) bxvd.f164949b;
        aiaa aiaa3 = aiaa.f68501K;
        aiaa2.f68513a |= 67108864;
        aiaa2.f68506D = j;
        this.f67969b = (aiaa) bxvd.mo74062i();
        m56512L();
        aiaa aiaa4 = this.f67969b;
        bxvd bxvd2 = (bxvd) aiaa4.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) aiaa4);
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        aiaa aiaa5 = (aiaa) bxvd2.f164949b;
        aiaa5.f68513a &= -8193;
        aiaa5.f68528p = 0;
        this.f67969b = (aiaa) bxvd2.mo74062i();
        this.f67970d.mo37046b(this);
    }

    /* renamed from: a */
    public final void mo37068a(aiab aiab, boolean z) {
        bxvd bxvd = (bxvd) aiab.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) aiab);
        if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            aiab aiab2 = (aiab) bxvd.f164949b;
            aiab aiab3 = aiab.f68539d;
            aiab2.f68541a |= 2;
            aiab2.f68543c = currentTimeMillis;
        } else {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            aiab aiab4 = (aiab) bxvd.f164949b;
            aiab aiab5 = aiab.f68539d;
            aiab4.f68541a &= -3;
            aiab4.f68543c = 0;
        }
        List D = mo37057D();
        aiab aiab6 = (aiab) bxvd.mo74062i();
        aiaa aiaa = this.f67969b;
        bxvd bxvd2 = (bxvd) aiaa.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) aiaa);
        int size = D.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (((aiab) D.get(i2)) == aiab) {
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                aiaa aiaa2 = (aiaa) bxvd2.f164949b;
                aiaa aiaa3 = aiaa.f68501K;
                aiab6.getClass();
                aiaa2.mo37329a();
                aiaa2.f68505C.set(i, aiab6);
            }
            i++;
        }
        this.f67969b = (aiaa) bxvd2.mo74062i();
        this.f67970d.mo37046b(this);
    }

    /* renamed from: a */
    public final void mo37069a(Long l) {
        if (l != null) {
            aiaa aiaa = this.f67969b;
            bxvd bxvd = (bxvd) aiaa.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) aiaa);
            long longValue = l.longValue();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            aiaa aiaa2 = (aiaa) bxvd.f164949b;
            aiaa aiaa3 = aiaa.f68501K;
            aiaa2.f68513a |= 4096;
            aiaa2.f68527o = longValue;
            this.f67969b = (aiaa) bxvd.mo74062i();
        } else {
            aiaa aiaa4 = this.f67969b;
            bxvd bxvd2 = (bxvd) aiaa4.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) aiaa4);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            aiaa aiaa5 = (aiaa) bxvd2.f164949b;
            aiaa aiaa6 = aiaa.f68501K;
            aiaa5.f68513a &= -4097;
            aiaa5.f68527o = 0;
            this.f67969b = (aiaa) bxvd2.mo74062i();
        }
        this.f67970d.mo37046b(this);
    }

    /* renamed from: a */
    public final void mo37070a(boolean z) {
        int i;
        int a = ahzz.m56940a(this.f67969b.f68525m);
        if (a == 0 || a != 3) {
            if (!z) {
                i = 4;
            } else {
                i = 2;
            }
            mo37072b(i);
        }
    }
}
