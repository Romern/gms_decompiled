package p000;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: aeed */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeed implements aecs {

    /* renamed from: a */
    public final bats f63247a;

    /* renamed from: b */
    public final bmxj f63248b;

    /* renamed from: c */
    public final bmzi f63249c;

    /* renamed from: d */
    public final bmzi f63250d;

    /* renamed from: e */
    private final bnsn f63251e;

    /* renamed from: f */
    private final bnhe f63252f;

    /* renamed from: g */
    private final Executor f63253g;

    /* renamed from: h */
    private final bbiv f63254h;

    /* renamed from: i */
    private final bboc f63255i;

    /* renamed from: j */
    private final bbiw f63256j;

    /* renamed from: k */
    private final Object f63257k = new Object();

    /* renamed from: l */
    private final Map f63258l = new HashMap();

    /* renamed from: m */
    private final Map f63259m = new HashMap();

    /* renamed from: n */
    private final Map f63260n = new HashMap();

    /* renamed from: o */
    private final aeev f63261o;

    /* renamed from: p */
    private final aeeo f63262p;

    /* renamed from: q */
    private final aees f63263q;

    public aeed(aeev aeev, bats bats, bmxj bmxj, bnhe bnhe, bmzi bmzi, Executor executor, bbiv bbiv, aeeo aeeo, bmzi bmzi2, bboc bboc, aees aees, bbiw bbiw) {
        this.f63261o = aeev;
        this.f63247a = bats;
        this.f63251e = srn.m36126a("GmsSyncPolicyEngine", sgj.MDI_SYNC);
        this.f63248b = bmxj;
        this.f63252f = bnhe;
        this.f63249c = bmzi;
        this.f63253g = executor;
        this.f63254h = bbiv;
        this.f63262p = aeeo;
        this.f63250d = bmzi2;
        this.f63255i = bboc;
        this.f63263q = aees;
        this.f63256j = bbiw;
        if (bboc != null) {
            bmxy.m108582a(aees, "If syncMetadataManagerFactory is provided, also a syncMetadataUriHelper needs to be provided.");
        }
    }

    /* renamed from: a */
    public static aeef m51692a(aeeg aeeg) {
        bmzi d = aeeg.mo34056d();
        bmxy.m108581a(d);
        return new aeef((bylh) d.mo6606a());
    }

    /* renamed from: b */
    private final aect m51693b(aeeb aeeb) {
        aect aect;
        bmzi bmzi;
        aedq aedq;
        aeec aeec;
        bbiw bbiw;
        bbim bbim;
        bbim bbim2;
        batv batv;
        batv batv2;
        aeeb aeeb2 = aeeb;
        aeeg b = mo34079b(((aecp) aeeb2).f63165a);
        synchronized (this.f63257k) {
            aect = (aect) this.f63258l.get(aeeb2);
            if (aect == null) {
                bmxj bmxj = this.f63248b;
                if (bmxj == null) {
                    bmzi d = b.mo34056d();
                    bmxy.m108581a(d);
                    bmzi = aeef.m51716a(d);
                } else {
                    bmzi = aeef.m51716a(new aedk(bmxj, aeeb2));
                }
                bxvp bxvp = ((aecp) aeeb2).f63165a;
                aeev aeev = this.f63261o;
                bbiv bbiv = this.f63254h;
                bbnn a = m51694d() ? mo34077a(aeeb) : null;
                if (cfhk.f184104a.mo6606a().mo81256e()) {
                    aedq = new aedq(this, aeeb2);
                } else {
                    aedq = aedr.f63231a;
                }
                bbiw bbiw2 = this.f63256j;
                Account e = aeeb.mo34072e();
                if (e != null) {
                    bbim bbim3 = (bbim) this.f63260n.get(e);
                    if (bbim3 != null) {
                        aeec = aedq;
                        bbiw = bbiw2;
                        bbim = bbim3;
                    } else {
                        aeeo aeeo = this.f63262p;
                        Context context = aeeo.f63274a;
                        String str = aeeo.f63275b;
                        String str2 = aeeo.f63276c;
                        bbiw = bbiw2;
                        ayte ayte = aeeo.f63277d;
                        bmxj bmxj2 = aeeo.f63278e;
                        if (!cfgv.m139558c()) {
                            aeec = aedq;
                            bbij a2 = bbij.m88048a(context.getPackageName(), null, str2);
                            if (!cfgv.m139557b()) {
                                batv2 = batx.m87539a(ayte, e.toString(), aeev.m51766c());
                            } else {
                                batv2 = batx.m87541b(ayte, e.toString(), aeev.m51766c());
                            }
                            bbim2 = new bbim(a2, batv2, (bmzi) bmxj2.apply(e));
                        } else {
                            aeec = aedq;
                            bbij a3 = bbij.m88048a(context.getPackageName(), str, str2);
                            if (!cfgv.m139557b()) {
                                batv = batx.m87539a(ayte, e.toString(), aeev.m51766c());
                            } else {
                                batv = batx.m87541b(ayte, e.toString(), aeev.m51766c());
                            }
                            bbim2 = new bbim(a3, batv, 3002, (bmzi) bmxj2.apply(e), true);
                        }
                        this.f63260n.put(e, bbim2);
                        bbim = bbim2;
                    }
                } else {
                    aeec = aedq;
                    bbiw = bbiw2;
                    bbim = null;
                }
                aedj aedj = new aedj(bxvp, aeev, bmzi, b, bbiv, a, aeec, bbiw, bbim);
                this.f63258l.put(aeeb, aedj);
                aect = aedj;
            }
        }
        return aect;
    }

    /* renamed from: d */
    private final boolean m51694d() {
        return (this.f63255i == null || this.f63263q == null) ? false : true;
    }

    /* renamed from: h */
    private final boolean m51695h(bxvp bxvp) {
        aeeg b = mo34079b(bxvp);
        aeef a = this.f63248b == null ? m51692a(b) : mo34088f(bxvp);
        if (!a.mo34090a(2)) {
            bnsi a2 = this.f63247a.mo55954a();
            a2.mo68432a("aeed", "h", 530, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            a2.mo68409a("One time sync %d disabled", bxvp.mo3214a());
            return false;
        }
        aebi aebi = new aebi();
        aebi.f63097i = b.mo34053a();
        aebi.f63099k = b.mo34055c();
        aebi.mo34024a(0, 0);
        bylh bylh = a.f63268a;
        if (bylh != null) {
            byla byla = bylh.f166835b;
            if (byla == null) {
                byla = byla.f166805d;
            }
            if ((byla.f166807a & 1) != 0) {
                byla byla2 = a.f63268a.f166835b;
                if (byla2 == null) {
                    byla2 = byla.f166805d;
                }
                bykf bykf = byla2.f166808b;
                if (bykf == null) {
                    bykf = bykf.f166742c;
                }
                bykg bykg = bykf.f166745b;
                if (bykg == null) {
                    bykg = bykg.f166747c;
                }
                bxun bxun = bykg.f166749a;
                if (bxun == null) {
                    bxun = bxun.f164861c;
                }
                long a3 = bxzr.m124574a(bxun);
                bykg bykg2 = bykf.f166745b;
                if (bykg2 == null) {
                    bykg2 = bykg.f166747c;
                }
                bxun bxun2 = bykg2.f166750b;
                if (bxun2 == null) {
                    bxun2 = bxun.f164861c;
                }
                aebi.mo34004a(a3, bxzr.m124574a(bxun2));
                bykz bykz = bykf.f166744a;
                if (bykz == null) {
                    bykz = bykz.f166792l;
                }
                aeef.m51717a(bykz, aebi);
                ((aeat) this.f63249c.mo6606a()).mo33984a(aebi.mo33974b());
                bxvp.mo3214a();
                return true;
            }
        }
        throw new IllegalStateException("One-time sync policy is not enabled");
    }

    /* renamed from: e */
    public final bqgg mo34087e(bxvp bxvp) {
        return bqga.m112778a(new aedl(this, bxvp), this.f63253g);
    }

    /* renamed from: f */
    public final aeef mo34088f(bxvp bxvp) {
        return new aeef((bylh) this.f63248b.apply(bxvp));
    }

    /* renamed from: c */
    public final bqgg mo34083c(bxvp bxvp) {
        return bqga.m112775a(mo34077a(aeeb.m51685a(bxvp, null)));
    }

    /* renamed from: a */
    public final int mo34073a(bbje bbje) {
        aeef aeef;
        if (this.f63248b == null) {
            aeeg aeeg = (aeeg) this.f63252f.get(bbje.mo56162a());
            aeef = aeeg == null ? new aeef(null) : m51692a(aeeg);
        } else {
            aeef = mo34088f(bbje.mo56162a());
        }
        byks b = aeef.mo34091b(bbje.mo56164c());
        try {
            bngx bngx = (bngx) bbje.mo56163b().get();
            aeew a = aeew.m51774a(this.f63261o);
            bnre i = bngx.listIterator();
            int i2 = 0;
            while (i.hasNext()) {
                int a2 = a.mo34108a(b, (bqgg) i.next(), null);
                i2 = (i2 == 1 || a2 == 1) ? 1 : (i2 == 2 || a2 == 2) ? 2 : 0;
            }
            bbje.mo56162a().mo3214a();
            bbje.mo56164c();
            return i2;
        } catch (InterruptedException | ExecutionException e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            int a3 = aeew.m51774a(this.f63261o).mo34108a(b, bbje.mo56163b(), null);
            bbje.mo56162a().mo3214a();
            bbje.mo56164c();
            return a3;
        }
    }

    /* renamed from: d */
    public final bqgg mo34086d(bxvp bxvp) {
        return bqga.m112775a(mo34077a(aeeb.m51684a(bxvp)));
    }

    /* renamed from: c */
    public final void mo34084c() {
        bnrd a = this.f63252f.entrySet().iterator();
        while (a.hasNext()) {
            Map.Entry entry = (Map.Entry) a.next();
            bxvp bxvp = (bxvp) entry.getKey();
            aeeg aeeg = (aeeg) entry.getValue();
            aeef a2 = this.f63248b == null ? m51692a(aeeg) : mo34088f(bxvp);
            if (!a2.mo34090a(3)) {
                bnsi a3 = this.f63247a.mo55954a();
                a3.mo68432a("aeed", "c", 493, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                a3.mo68409a("Periodic sync %d disabled", bxvp.mo3214a());
            } else {
                try {
                    aebl aebl = new aebl();
                    aebl.f63097i = aeeg.mo34053a();
                    aebl.f63099k = aeeg.mo34054b();
                    bylh bylh = a2.f63268a;
                    if (bylh != null) {
                        byla byla = bylh.f166835b;
                        if (byla == null) {
                            byla = byla.f166805d;
                        }
                        if ((byla.f166807a & 2) != 0) {
                            byla byla2 = a2.f63268a.f166835b;
                            if (byla2 == null) {
                                byla2 = byla.f166805d;
                            }
                            bykh bykh = byla2.f166809c;
                            if (bykh == null) {
                                bykh = bykh.f166752c;
                            }
                            byki byki = bykh.f166755b;
                            if (byki == null) {
                                byki = byki.f166757d;
                            }
                            bxun bxun = byki.f166760b;
                            if (bxun == null) {
                                bxun = bxun.f164861c;
                            }
                            aebl.f63070a = bxzr.m124574a(bxun);
                            byki byki2 = bykh.f166755b;
                            if (byki2 == null) {
                                byki2 = byki.f166757d;
                            }
                            if ((byki2.f166759a & 2) != 0) {
                                byki byki3 = bykh.f166755b;
                                if (byki3 == null) {
                                    byki3 = byki.f166757d;
                                }
                                bxun bxun2 = byki3.f166761c;
                                if (bxun2 == null) {
                                    bxun2 = bxun.f164861c;
                                }
                                aebl.f63071b = bxzr.m124574a(bxun2);
                            }
                            bykz bykz = bykh.f166754a;
                            if (bykz == null) {
                                bykz = bykz.f166792l;
                            }
                            aeef.m51717a(bykz, aebl);
                            ((aeat) this.f63249c.mo6606a()).mo33984a(aebl.mo33974b());
                            bxvp.mo3214a();
                        }
                    }
                    throw new IllegalStateException("Periodic sync policy is not enabled");
                } catch (IllegalArgumentException e) {
                    if (aeev.m51769f()) {
                        bnsi c = this.f63247a.mo55957c();
                        c.mo68437a(e);
                        bnsl bnsl = (bnsl) c;
                        bnsl.mo68432a("aeed", "c", 501, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68409a("Scheduling periodic sync %d failed", bxvp.mo3214a());
                    } else {
                        bnsi b = this.f63251e.mo68387b();
                        b.mo68437a(e);
                        b.mo68432a("aeed", "c", 504, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        b.mo68409a("Scheduling periodic sync %d failed", bxvp.mo3214a());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final aect mo34089g(bxvp bxvp) {
        return m51693b(aeeb.m51685a(bxvp, null));
    }

    /* renamed from: a */
    public final aect mo34085d(bxvp bxvp, Account account) {
        return m51693b(aeeb.m51685a(bxvp, account));
    }

    /* renamed from: a */
    public final bbje mo34074a(bbjl bbjl, bbjb bbjb, Executor executor) {
        return mo34076a(bbjl.mo56168a(), bbjb, bbjl.mo56169b(), executor);
    }

    /* renamed from: a */
    public final bbje mo34075a(bxvp bxvp, avgk avgk, int i, Executor executor) {
        return mo34076a(bxvp, new aeea(avgk), i, executor);
    }

    /* renamed from: a */
    public final bbje mo34076a(bxvp bxvp, bbjb bbjb, int i, Executor executor) {
        bbjb.getClass();
        return new bbjc(bxvp, i, bqdx.m112674a(bqdx.m112673a(bqga.m112771a(new aedv(bbjb), executor), new aedw(this, bxvp, i, bbjb, executor), executor), new aedx(bbjb, executor), bqfb.INSTANCE));
    }

    /* renamed from: a */
    public final bbnn mo34077a(aeeb aeeb) {
        bbnn bbnn;
        Uri uri;
        if (m51694d()) {
            synchronized (this.f63257k) {
                bbnn = (bbnn) this.f63259m.get(aeeb);
                if (bbnn == null) {
                    if (!((aecp) aeeb).f63166b) {
                        aees aees = this.f63263q;
                        bxvp bxvp = ((aecp) aeeb).f63165a;
                        Account e = aeeb.mo34072e();
                        befh a = befi.m94962a(aees.f63283a);
                        a.mo60664c();
                        a.mo60660a(aees.f63284b);
                        if (e != null) {
                            a.mo60658a(e);
                        }
                        String str = aees.f63285c;
                        int a2 = bxvp.mo3214a();
                        StringBuilder sb = new StringBuilder(18);
                        sb.append("syncid_");
                        sb.append(a2);
                        String sb2 = sb.toString();
                        StringBuilder sb3 = new StringBuilder(str.length() + 2 + String.valueOf(sb2).length() + 10);
                        sb3.append(str);
                        sb3.append("/");
                        sb3.append(sb2);
                        sb3.append("/subid_none");
                        a.mo60663b(sb3.toString());
                        uri = a.mo60657a();
                    } else {
                        aees aees2 = this.f63263q;
                        bxvp bxvp2 = ((aecp) aeeb).f63165a;
                        befh a3 = befi.m94962a(aees2.f63283a);
                        a3.mo60664c();
                        a3.mo60660a(aees2.f63284b);
                        String str2 = aees2.f63285c;
                        int a4 = bxvp2.mo3214a();
                        StringBuilder sb4 = new StringBuilder(18);
                        sb4.append("syncid_");
                        sb4.append(a4);
                        String sb5 = sb4.toString();
                        StringBuilder sb6 = new StringBuilder(str2.length() + 14 + String.valueOf(sb5).length() + 10);
                        sb6.append(str2);
                        sb6.append("/allAccounts/");
                        sb6.append(sb5);
                        sb6.append("/subid_none");
                        a3.mo60663b(sb6.toString());
                        uri = a3.mo60657a();
                    }
                    bbnn = this.f63255i.mo56270a(uri);
                    this.f63259m.put(aeeb, bbnn);
                }
            }
            return bbnn;
        }
        throw new IllegalStateException("Cannot get SyncMetadataManager when stats have not been enabeld.");
    }

    /* renamed from: b */
    public final aeeg mo34079b(bxvp bxvp) {
        aeeg aeeg = (aeeg) this.f63252f.get(bxvp);
        if (aeeg != null) {
            return aeeg;
        }
        throw new IllegalArgumentException(String.format("Unknown sync id %d", Integer.valueOf(bxvp.mo3214a())));
    }

    /* renamed from: b */
    public final bqgg mo34080b(bxvp bxvp, Account account) {
        return bqga.m112775a(mo34077a(aeeb.m51685a(bxvp, account)));
    }

    /* renamed from: b */
    public final void mo34081b() {
        try {
            mo34084c();
        } catch (RuntimeException e) {
            if (aeev.m51769f()) {
                bnsi c = this.f63247a.mo55957c();
                c.mo68437a(e);
                bnsl bnsl = (bnsl) c;
                bnsl.mo68432a("aeed", "b", 477, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Scheduling periodic syncs failed");
                return;
            }
            bnsi b = this.f63251e.mo68387b();
            b.mo68437a(e);
            b.mo68432a("aeed", "b", 479, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Scheduling periodic syncs failed");
        }
    }

    /* renamed from: a */
    public final bqgg mo34078a() {
        return bqga.m112778a(new aedy(this), this.f63253g);
    }
}
