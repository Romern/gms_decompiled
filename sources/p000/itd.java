package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: itd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class itd {

    /* renamed from: a */
    public static final bmyx f21658a = bmyx.m108640a(',');

    /* renamed from: b */
    public final List f21659b;

    /* renamed from: c */
    public final String f21660c;

    /* renamed from: d */
    public final Account f21661d;

    /* renamed from: e */
    public final List f21662e;

    /* renamed from: f */
    public final byte[] f21663f;

    /* renamed from: g */
    public final ipr f21664g;

    /* renamed from: h */
    public final ite f21665h;

    /* renamed from: i */
    public final ipz f21666i;

    /* renamed from: j */
    public final sek f21667j = new sek(new String[]{"EnrollKeyName"}, (byte[]) null);

    /* renamed from: k */
    private final Context f21668k;

    /* renamed from: l */
    private final int f21669l;

    /* renamed from: m */
    private final byte[] f21670m;

    /* renamed from: n */
    private final byte[] f21671n;

    /* renamed from: o */
    private final List f21672o;

    /* renamed from: p */
    private final iti f21673p;

    /* renamed from: q */
    private final itf f21674q;

    /* renamed from: r */
    private final ipj f21675r;

    /* renamed from: s */
    private final asfb f21676s;

    public itd(Context context, int i, List list, String str, Account account, List list2, byte[] bArr, byte[] bArr2, byte[] bArr3, List list3) {
        this.f21668k = context;
        this.f21669l = i;
        this.f21659b = list;
        this.f21660c = str;
        this.f21661d = account;
        this.f21662e = list2;
        this.f21670m = bArr2;
        this.f21671n = bArr3;
        this.f21672o = list3;
        this.f21663f = bArr;
        this.f21664g = new ipr(context);
        this.f21673p = ith.m16097a(context);
        this.f21665h = new ite(context);
        this.f21666i = new ipz(context);
        this.f21675r = new ipj(context, account);
        this.f21674q = new itf(str, context);
        this.f21676s = new asfb(context, 1, "CryptauthEnroller", null, "com.google.android.gms");
    }

    /* renamed from: b */
    private final void m16090b(List list) {
        if (this.f21670m == null) {
            this.f21666i.mo13247a(this.f21661d.name, list);
            ite ite = new ite(this.f21668k);
            Account account = this.f21661d;
            long longValue = ((Long) ipl.f21491a.mo58455c()).longValue();
            String valueOf = String.valueOf(account.name);
            String str = valueOf.length() == 0 ? new String("OneTimeTag_") : "OneTimeTag_".concat(valueOf);
            long millis = longValue + TimeUnit.DAYS.toMillis(1);
            ite.f21678b.mo25412b("schedule OneTime directive : start=%d, end=%d", Long.valueOf(longValue), Long.valueOf(millis));
            ite.mo13335a(str, account.name, ite.f21677a, longValue, millis, false);
        }
    }

    /* renamed from: a */
    public final ehi mo13332a() {
        this.f21667j.mo25414c("ClientName requesting CustomKey is %s", this.f21660c);
        return mo13333a(this.f21659b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x017a, code lost:
        if (r1.f21676s.mo49124e() == false) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x017c, code lost:
        r1.f21676s.mo49120c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0181, code lost:
        r5.mo13331a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0184, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01a4, code lost:
        if (r1.f21676s.mo49124e() != false) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01d4, code lost:
        if (r1.f21676s.mo49124e() != false) goto L_0x017c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012e A[Catch:{ ehf -> 0x0187, iqr -> 0x0185 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x012f A[Catch:{ ehf -> 0x0187, iqr -> 0x0185 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01be A[Catch:{ all -> 0x0189 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01d7 A[SYNTHETIC, Splitter:B:66:0x01d7] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:60:0x01aa=Splitter:B:60:0x01aa, B:54:0x018e=Splitter:B:54:0x018e} */
    /* renamed from: a */
    public final ehi mo13333a(List list) {
        List list2;
        ehi a;
        byte[] bArr;
        boolean z;
        boolean z2;
        ipm ipm;
        if (list.isEmpty()) {
            ehg ehg = new ehg();
            ehg.f14948a = ehh.ENROLLMENT_RUN_SCHEDULED;
            return ehg.mo10145a();
        }
        iss a2 = isr.m16057a(this.f21668k, 0, 5);
        if (((Boolean) ipl.f21506p.mo58455c()).booleanValue()) {
            list2 = this.f21664g.mo13227a(this.f21661d.name);
        } else {
            list2 = new ArrayList();
            list2.add(this.f21663f);
        }
        this.f21676s.mo49111a(30000);
        itc itc = new itc(this.f21668k, this.f21661d, a2);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            ehd ehd = new ehd();
            try {
                ehd.mo10139a(list);
                ehd.mo10138a(this.f21661d.name);
                ehd.mo10141b("com.google.android.gms");
                ehd.f14912c = this.f21673p.mo13336a(list2).mo73642k();
                ehd.mo10137a(itc);
                ehd.mo10136a(new ipo(this.f21668k));
                ehd.f14913d = this.f21670m;
                ehd.f14914e = this.f21671n;
                List list3 = this.f21662e;
                if (list3 == null || list3.isEmpty()) {
                    bArr = null;
                } else {
                    bArr = (byte[]) this.f21662e.get(0);
                }
                ehd.f14915f = bArr;
                ehd.f14916g = this.f21672o;
                if (this.f21671n != null) {
                    z = true;
                } else {
                    z = false;
                }
                ehd.f14911b = z;
                ehd.f14917h = this.f21664g;
                ehd.mo10135a(this.f21675r);
                ehd.f14910a = itj.m16102a(this.f21669l);
                itf itf = this.f21674q;
                String str = this.f21661d.name;
                if (!f21658a.mo66917a().mo66925c((CharSequence) ipl.f21499i.mo58455c()).contains(itf.f21680a)) {
                    try {
                        ita ita = itf.f21681b.mo13220a("authzen", str).f21655b;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (ita.f21652c < currentTimeMillis) {
                            if (ita.f21653d <= currentTimeMillis) {
                                a2.f21627d = 4;
                                z2 = true;
                            } else {
                                a2.f21627d = 2;
                                z2 = false;
                            }
                            ehd.mo10140a(z2);
                            ipm = new ipm(this.f21668k);
                            byte[] bArr2 = this.f21670m;
                            byte[] bArr3 = this.f21671n;
                            sek sek = this.f21667j;
                            if (ipm.f21512b != null) {
                                ipm.f21512b = new xed(ipm.f21511a);
                            }
                            ehd.f14919j = new ipn(bArr2, bArr3, ipm.f21512b, ipm.f21511a, sek);
                            ehd.f14918i = new sek(new String[]{"EnrollCryptauthFramework"}, (byte[]) null);
                            a = itg.m16096a(ehd.mo10134a());
                            a2.f21625b = a.f14968a.f14966p;
                            a2.mo13321a(2, SystemClock.elapsedRealtime() - elapsedRealtime);
                        } else {
                            a2.f21627d = 5;
                        }
                    } catch (isu e) {
                        itf.f21682c.mo25415d("No authzen symmetric key found", e, new Object[0]);
                        a2.f21627d = 7;
                        z2 = true;
                    }
                } else {
                    a2.f21627d = 3;
                }
                z2 = true;
                ehd.mo10140a(z2);
                ipm = new ipm(this.f21668k);
                byte[] bArr22 = this.f21670m;
                byte[] bArr32 = this.f21671n;
                sek sek2 = this.f21667j;
                if (ipm.f21512b != null) {
                }
                ehd.f14919j = new ipn(bArr22, bArr32, ipm.f21512b, ipm.f21511a, sek2);
                ehd.f14918i = new sek(new String[]{"EnrollCryptauthFramework"}, (byte[]) null);
                a = itg.m16096a(ehd.mo10134a());
                a2.f21625b = a.f14968a.f14966p;
                a2.mo13321a(2, SystemClock.elapsedRealtime() - elapsedRealtime);
            } catch (ehf e2) {
                e = e2;
                a2.f21625b = e.f14947a.f14966p;
                a2.mo13321a(2, SystemClock.elapsedRealtime() - elapsedRealtime);
                if (!e.f14947a.f14967q) {
                    m16090b(list);
                    ehg ehg2 = new ehg();
                    ehg2.f14948a = e.f14947a;
                    a = ehg2.mo10145a();
                } else {
                    m16090b(list);
                    throw e;
                }
            } catch (iqr e3) {
                try {
                    m16090b(list);
                    ehg ehg3 = new ehg();
                    ehg3.f14948a = ehh.CLIENT_INTERNAL_ERROR;
                    a = ehg3.mo10145a();
                } catch (Throwable th) {
                    if (this.f21676s.mo49124e()) {
                        this.f21676s.mo49120c();
                    }
                    itc.mo13331a();
                    throw th;
                }
            }
        } catch (ehf e4) {
            e = e4;
            a2.f21625b = e.f14947a.f14966p;
            a2.mo13321a(2, SystemClock.elapsedRealtime() - elapsedRealtime);
            if (!e.f14947a.f14967q) {
            }
        } catch (iqr e5) {
            m16090b(list);
            ehg ehg32 = new ehg();
            ehg32.f14948a = ehh.CLIENT_INTERNAL_ERROR;
            a = ehg32.mo10145a();
        }
    }
}
