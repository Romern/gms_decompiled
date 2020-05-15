package p000;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: avfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avfo {

    /* renamed from: c */
    private static final Object f93089c = new Object();

    /* renamed from: d */
    private static volatile avfo f93090d;

    /* renamed from: a */
    public aeez f93091a;

    /* renamed from: b */
    public final avfk f93092b;

    /* renamed from: e */
    private final Context f93093e;

    /* renamed from: f */
    private final beju f93094f;

    /* renamed from: g */
    private final bbny f93095g;

    /* renamed from: h */
    private final aveu f93096h;

    /* renamed from: i */
    private final Executor f93097i;

    /* renamed from: j */
    private final Executor f93098j;

    /* renamed from: k */
    private final Object f93099k = new Object();

    /* renamed from: l */
    private volatile aeeh f93100l = null;

    private avfo(Context context) {
        this.f93093e = context;
        befa befa = new befa(bngx.m109356a(beff.m94940a(context).mo60653a()));
        bejv bejv = new bejv();
        bejv.f111685a = snp.m35702a(10);
        bejv.f111686b = befa;
        bejv.mo60768a(bejj.f111648a);
        long E = chbh.f188248a.mo6606a().mo84923E();
        if (E != 0) {
            bely a = belz.m95285a(context);
            belr a2 = bels.m95262a(context);
            a2.f111790b = snp.m35704b(10);
            a2.f111791c = batx.m87540a(new aytg(), a.mo60792a(), (int) E);
            bejv.mo60767a(a2.mo60784a(), a);
        }
        this.f93094f = bejv.mo60766a();
        this.f93095g = new bbny(context, befa, "udcmobstoreprivate");
        this.f93096h = new aveu(new avfi(context), new bbis(), avfj.f93083a);
        this.f93092b = new avfk(context, new bbil(new aytg(), (int) chbh.f188248a.mo6606a().mo84964x()));
        this.f93097i = snp.m35702a(10);
        this.f93098j = snp.m35702a(9);
        if (chbh.m148016n()) {
            bmxj a3 = m78439a();
            aeey aeey = new aeey(aval.SYNC_ID_UNKNOWN);
            aeey.mo34110a(aval.SYNC_ID_CUSTOM_CACHE, aeeg.m51723a("com.google.android.gms.udc.service.UdcContextInitService", "UdcSyncPeriodic", "UdcSyncOneOff", new avfl(a3)));
            this.f93091a = aeey.mo34109a();
        }
    }

    /* renamed from: a */
    public static avfo m78438a(Context context) {
        if (f93090d == null) {
            synchronized (f93089c) {
                if (f93090d == null) {
                    f93090d = new avfo(context.getApplicationContext());
                }
            }
        }
        return f93090d;
    }

    /* renamed from: b */
    public static beju m78440b(Context context) {
        return m78438a(context).f93094f;
    }

    /* renamed from: c */
    public static bbny m78441c(Context context) {
        return m78438a(context).f93095g;
    }

    /* renamed from: d */
    public static aveu m78442d(Context context) {
        return m78438a(context).f93096h;
    }

    /* renamed from: e */
    public static bboa m78443e(Context context) {
        bbnz bbnz = new bbnz();
        bbob a = bboc.m88268a(auzv.f92840h);
        a.mo56269a(m78440b(context));
        bbnz.f103000b = a.mo56268a();
        bbny c = m78441c(context);
        if (c != null) {
            bbnz.f102999a = c;
            String str = bbnz.f102999a == null ? " mobstoreHelper" : "";
            if (bbnz.f103000b == null) {
                str = str.concat(" pdsSyncMetadataManagerFactory");
            }
            if (str.isEmpty()) {
                return new bbnw(bbnz.f102999a, bbnz.f103000b);
            }
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
        }
        throw new NullPointerException("Null mobstoreHelper");
    }

    /* renamed from: f */
    public static Executor m78444f(Context context) {
        return m78438a(context).f93097i;
    }

    /* renamed from: g */
    public static aeeh m78445g(Context context) {
        aeeh aeeh;
        avfo a = m78438a(context);
        if (a.f93100l == null) {
            synchronized (a.f93099k) {
                if (a.f93100l == null) {
                    Context context2 = a.f93093e;
                    avfo a2 = m78438a(context2);
                    aeet a3 = aeet.m51742a();
                    a3.mo34098a(context2);
                    aeez aeez = a2.f93091a;
                    if (aeez == null) {
                        a3.mo34101a(m78439a());
                        a3.mo34103a(bnhe.m109408a(aval.SYNC_ID_CUSTOM_CACHE, aeeg.m51722a("com.google.android.gms.udc.service.UdcContextInitService", "UdcSyncPeriodic", "UdcSyncOneOff")));
                    } else {
                        a3.mo34097a(aeez);
                    }
                    a3.mo34102a(new avfm(context2));
                    a3.mo34105a(a2.f93098j);
                    if (chbh.f188248a.mo6606a().mo84956p()) {
                        a3.mo34100a(a2.f93094f);
                        a3.mo34104a("udc");
                        aeeh = a3.mo34095a(auzv.f92840h);
                    } else {
                        aeeh = a3.mo34106b();
                    }
                    a.f93100l = aeeh;
                }
            }
        }
        return a.f93100l;
    }

    /* renamed from: a */
    private static bmxj m78439a() {
        return !chbh.f188248a.mo6606a().mo84958r() ? new aecr() : avfn.f93088a;
    }
}
