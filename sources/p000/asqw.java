package p000;

import com.google.android.gms.tapandpay.firstparty.CardInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: asqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asqw {

    /* renamed from: K */
    private static final srn f89422K = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: L */
    private static final bnic f89423L = bnic.m109490a((Object) 27, (Object) 37);

    /* renamed from: A */
    public boolean f89424A;

    /* renamed from: B */
    public long f89425B;

    /* renamed from: C */
    public long f89426C;

    /* renamed from: D */
    public int f89427D;

    /* renamed from: E */
    public asrb f89428E;

    /* renamed from: F */
    public asrb f89429F;

    /* renamed from: G */
    public asrb f89430G;

    /* renamed from: H */
    public int f89431H = 2;

    /* renamed from: I */
    public int f89432I = 1;

    /* renamed from: J */
    public int f89433J = 1;

    /* renamed from: M */
    private final asrd f89434M = new asrd();

    /* renamed from: N */
    private final asrd f89435N = new asrd();

    /* renamed from: O */
    private final asrd f89436O = new asrd();

    /* renamed from: a */
    public final String f89437a = UUID.randomUUID().toString();

    /* renamed from: b */
    public final List f89438b = new ArrayList();

    /* renamed from: c */
    public String f89439c;

    /* renamed from: d */
    public String f89440d;

    /* renamed from: e */
    public String f89441e;

    /* renamed from: f */
    public boolean f89442f;

    /* renamed from: g */
    public boolean f89443g;

    /* renamed from: h */
    public boolean f89444h;

    /* renamed from: i */
    public long f89445i;

    /* renamed from: j */
    public int f89446j;

    /* renamed from: k */
    public int f89447k;

    /* renamed from: l */
    public long f89448l;

    /* renamed from: m */
    public int f89449m;

    /* renamed from: n */
    public long f89450n = -1;

    /* renamed from: o */
    public long f89451o = -1;

    /* renamed from: p */
    public long f89452p = -1;

    /* renamed from: q */
    public long f89453q = -1;

    /* renamed from: r */
    public volatile int f89454r;

    /* renamed from: s */
    public boolean f89455s;

    /* renamed from: t */
    public asqu f89456t;

    /* renamed from: u */
    public CardInfo f89457u;

    /* renamed from: v */
    public boolean f89458v;

    /* renamed from: w */
    public String f89459w = "";

    /* renamed from: x */
    public int f89460x;

    /* renamed from: y */
    public boolean f89461y;

    /* renamed from: z */
    public boolean f89462z;

    /* renamed from: a */
    private static void m74487a(assu assu, asrd asrd) {
        try {
            byte[] h = assu.mo49442h();
            int i = 0;
            while (i < h.length) {
                asst a = asst.m74710a(h, i);
                int a2 = a.mo49444a();
                int b = a.mo49445b();
                int c = assu.m74717c(a2);
                asrd.mo49401a(a2, b);
                i = i + c + 1;
            }
        } catch (assv | RuntimeException e) {
            assu.mo49450e();
        }
    }

    /* renamed from: a */
    public final boolean mo49396a() {
        return this.f89450n != -1;
    }

    /* renamed from: b */
    public final long mo49397b() {
        return this.f89451o - this.f89450n;
    }

    /* renamed from: c */
    public final asqw mo49398c() {
        asqw asqw = new asqw();
        asqw.f89439c = this.f89439c;
        asqw.f89440d = this.f89440d;
        asqw.f89441e = this.f89441e;
        asqw.f89454r = !f89423L.contains(Integer.valueOf(this.f89454r)) ? this.f89454r : !cgwn.m147252b() ? 12 : 39;
        asqw.f89457u = this.f89457u;
        asqw.f89455s = this.f89455s;
        asqw.f89456t = this.f89456t;
        asqw.f89447k = this.f89447k;
        asqw.f89446j = this.f89446j;
        asqw.f89449m = this.f89449m;
        asqw.f89444h = this.f89444h;
        asqw.f89445i = this.f89445i;
        asqw.f89458v = this.f89458v;
        asqw.f89459w = this.f89459w;
        asqw.f89460x = this.f89460x;
        asqw.f89426C = this.f89426C;
        asqw.f89427D = this.f89427D;
        return asqw;
    }

    /* renamed from: d */
    public final int mo49399d() {
        return this.f89438b.size();
    }

    /* renamed from: a */
    public final void mo49395a(asqt asqt) {
        this.f89438b.add(asqt);
        try {
            aste a = aste.m74751a(asqt.f89400a);
            char c = (char) ((a.f89647a << 8) | (a.f89648b & 255));
            if (c == 32810) {
                this.f89430G = asrb.m74509a(this.f89436O, a.mo49457b());
            } else if (c == 32936) {
                asrd asrd = this.f89434M;
                byte[] bArr = asqt.f89400a;
                this.f89428E = new asrb(asrd, bArr, 7, bArr.length - 1);
            } else if (c == 32942) {
                this.f89429F = asrb.m74509a(this.f89435N, a.mo49457b());
            }
            byte[] a2 = asqt.f89401b.mo49461a();
            assr assr = null;
            if (a2.length > 0 && asqt.f89401b.f89655a != 0) {
                try {
                    assu a3 = assu.m74713a(a2);
                    if (a3 instanceof assr) {
                        assr = a3.mo49448c();
                    }
                } catch (assv | RuntimeException e) {
                }
            }
            if (assr != null) {
                try {
                    bmxv b = assr.mo49439b(165, 40760);
                    if (b.mo66813a()) {
                        if (assr.f89619b == 111) {
                            m74487a((assu) b.mo66814b(), this.f89434M);
                        }
                    }
                    bmxv b2 = assr.mo49439b(140);
                    if (b2.mo66813a()) {
                        m74487a((assu) b2.mo66814b(), this.f89435N);
                    }
                    bmxv b3 = assr.mo49439b(40809);
                    if (b3.mo66813a()) {
                        m74487a((assu) b3.mo66814b(), this.f89436O);
                    }
                } catch (assx e2) {
                    bnsl bnsl = (bnsl) f89422K.mo68387b();
                    bnsl.mo68437a(e2);
                    bnsl.mo68405a("Not valid tag when extracting DOLs");
                }
            }
        } catch (RuntimeException e3) {
            bnsl bnsl2 = (bnsl) f89422K.mo68387b();
            bnsl2.mo68437a(e3);
            bnsl2.mo68405a("Request APDU in wrong format");
        }
    }
}
