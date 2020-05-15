package p000;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: avgm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avgm {

    /* renamed from: a */
    private final Context f93138a;

    /* renamed from: b */
    private final bmzi f93139b;

    /* renamed from: c */
    private final bmzi f93140c;

    /* renamed from: d */
    private final avfw f93141d;

    /* renamed from: e */
    private final avgn f93142e;

    /* renamed from: f */
    private final bboa f93143f;

    /* renamed from: g */
    private final bmxj f93144g;

    /* renamed from: h */
    private final bmxj f93145h;

    /* renamed from: i */
    private final bbny f93146i;

    /* renamed from: j */
    private final aveu f93147j;

    /* renamed from: k */
    private final ayte f93148k;

    /* renamed from: l */
    private final avgj f93149l;

    static {
        avex.m78396b();
    }

    public avgm(Context context, avgj avgj, bmzi bmzi, avfw avfw, avgn avgn, bboa bboa, bmxj bmxj, bmxj bmxj2, bbny bbny, aveu aveu, ayte ayte) {
        this.f93138a = context;
        this.f93149l = avgj;
        this.f93139b = null;
        this.f93140c = bmzi;
        this.f93141d = avfw;
        this.f93142e = avgn;
        this.f93143f = bboa;
        this.f93144g = bmxj;
        this.f93145h = bmxj2;
        this.f93146i = bbny;
        this.f93147j = aveu;
        this.f93148k = ayte;
    }

    /* renamed from: a */
    private final auzj m78458a(bxpe bxpe, Account account) {
        avfg avfg = new avfg(this.f93142e.mo51196a(account, bqgs.m112810a()), new avjn(this.f93138a, account.name));
        if ((bxpe.f164249a & 1) != 0) {
            avfh avfh = (avfh) this.f93144g.apply(account);
            bxok bxok = bxpe.f164251c;
            if (bxok == null) {
                bxok = bxok.f164161d;
            }
            if (!chbh.m148014l()) {
                avfh.mo51191a(bxok);
            } else {
                roz b = rpa.m34196b();
                b.f43472a = new wes(bxok);
                aucu.m76782a(((wez) this.f93145h.apply(account)).mo24701a(b.mo24977a()));
            }
        }
        bxvd da = auzj.f92827d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        auzj auzj = (auzj) da.f164949b;
        bxpe.getClass();
        auzj.f92830b = bxpe;
        auzj.f92829a |= 1;
        long a = this.f93148k.mo54417a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        auzj auzj2 = (auzj) da.f164949b;
        auzj2.f92829a |= 2;
        auzj2.f92831c = a;
        return avfg.mo51189a((auzj) da.mo74062i());
    }

    /* renamed from: c */
    public static bqbu m78467c() {
        return bqbu.m112533a(chbh.f188248a.mo6606a().mo84920B(), (int) chbh.f188248a.mo6606a().mo84921C());
    }

    /* renamed from: d */
    private static bxow m78468d() {
        return (bxow) bxoy.m122943a(aefi.m51788a((int) FragmentTransaction.TRANSIT_FRAGMENT_OPEN, aefl.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS).mo69980a(bxqr.f164418h)).mo86139a(brup.f143420a, m78467c().toString());
    }

    /* renamed from: e */
    private final List m78469e() {
        return soz.m35801d(this.f93138a, "com.google.android.gms");
    }

    /* renamed from: b */
    public final avgk mo51205b(avgl avgl) {
        return new avgk(this, avgl);
    }

    public avgm(Context context, bmzi bmzi, bmzi bmzi2, avfw avfw, avgn avgn, bboa bboa, bmxj bmxj, bmxj bmxj2, bbny bbny, aveu aveu, ayte ayte) {
        this.f93138a = context;
        this.f93149l = null;
        if (!chbh.f188248a.mo6606a().mo84949i()) {
            bmzi = bmzn.m108681a(bmzi);
            bmzi.mo6606a();
        }
        this.f93139b = bmzi;
        this.f93140c = bmzi2;
        this.f93141d = avfw;
        this.f93142e = avgn;
        this.f93143f = bboa;
        this.f93144g = bmxj;
        this.f93145h = bmxj2;
        this.f93146i = bbny;
        this.f93147j = aveu;
        this.f93148k = ayte;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.List, avfy]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* renamed from: b */
    public final List mo51206b() {
        List e = m78469e();
        this.f93142e.mo51197a(e);
        if (chbh.m148019q()) {
            bbms c = this.f93143f.mo56267c();
            bboa bboa = this.f93143f;
            bboa.getClass();
            try {
                bbmv.m88201a(c.f102930a.f102934a.mo56237a(bnjd.m109575a(bnjd.m109575a(bnjd.m109575a((Iterable) e, (bmxj) new avfy(bboa)), bbmq.f102927a), bbmt.f102932a)));
            } catch (IOException e2) {
                bnsi c2 = c.f102931b.mo68388c();
                c2.mo68437a(e2);
                c2.mo68432a("bbms", "a", 60, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c2.mo68405a("Failed to flush sync metadata!");
            }
            try {
                bbny bbny = this.f93146i;
                HashSet<Account> hashSet = new HashSet(e);
                HashSet hashSet2 = new HashSet();
                for (Account account : hashSet) {
                    hashSet2.add(bbny.mo56265a(account));
                }
                hashSet2.add(bbny.mo56264a());
                Uri a = bbny.mo56264a();
                ArrayList arrayList = new ArrayList(a.getPathSegments());
                bmxy.m108589a(!arrayList.isEmpty(), "Can't retrieve Uri parent!");
                arrayList.remove(arrayList.size() - 1);
                Uri build = a.buildUpon().path(bmxr.m108543a('/').mo66874a((Iterable) arrayList)).build();
                for (Uri uri : bbny.f102996a.mo60647c(build) ? bbny.f102996a.mo60650f(build) : bngx.m109376e()) {
                    if (!hashSet2.contains(uri)) {
                        bbny.f102996a.mo60651h(uri);
                    }
                }
            } catch (Exception e3) {
                bnsi c3 = avex.m78395a().mo68388c();
                c3.mo68402a((int) chbh.m148013k());
                c3.mo68437a(e3);
                c3.mo68432a("avgm", "a", 628, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c3.mo68405a("Sync metadata wipeout failed!");
            }
        }
        return e;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avgm.<init>(android.content.Context, avgj, bmzi, avfw, avgn, bboa, bmxj, bmxj, bbny, aveu, ayte):void
     arg types: [android.content.Context, avgj, avgd, avfw, avfu, bboa, avge, avgf, bbny, aveu, aytg]
     candidates:
      avgm.<init>(android.content.Context, bmzi, bmzi, avfw, avgn, bboa, bmxj, bmxj, bbny, aveu, ayte):void
      avgm.<init>(android.content.Context, avgj, bmzi, avfw, avgn, bboa, bmxj, bmxj, bbny, aveu, ayte):void */
    /* renamed from: a */
    public static avgm m78459a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (!chbh.f188248a.mo6606a().mo84939U()) {
            return new avgm(applicationContext, new avgj(new avgg(applicationContext)), (bmzi) new avgd(applicationContext), new avfw(applicationContext), (avgn) avfv.m78451a(applicationContext), avfo.m78443e(applicationContext), (bmxj) new avge(applicationContext), (bmxj) new avgf(context), avfo.m78441c(applicationContext), avfo.m78442d(applicationContext), (ayte) new aytg());
        }
        return new avgm(applicationContext, avfx.f93114a, new avga(applicationContext), new avfw(applicationContext), avfv.m78451a(applicationContext), avfo.m78443e(applicationContext), new avgb(applicationContext), new avgc(context), avfo.m78441c(applicationContext), avfo.m78442d(applicationContext), new aytg());
    }

    /* renamed from: a */
    private final bxok m78460a(avfh avfh, Account account) {
        if (!chbh.m148014l()) {
            return avfh.mo51193b();
        }
        try {
            roz b = rpa.m34196b();
            b.f43472a = new wer();
            return (bxok) aucu.m76782a(((wez) this.f93145h.apply(account)).mo24701a(b.mo24977a()));
        } catch (InterruptedException | ExecutionException e) {
            return bxok.f164161d;
        }
    }

    /* renamed from: a */
    public static bxow m78461a() {
        return (bxow) bxoy.m122943a(aefi.m51787a((int) FragmentTransaction.TRANSIT_FRAGMENT_OPEN).mo69980a(bxqr.f164418h)).mo86139a(brup.f143420a, m78467c().toString());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [bnic, bmxj]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0247 A[SYNTHETIC, Splitter:B:103:0x0247] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01e0 A[SYNTHETIC, Splitter:B:76:0x01e0] */
    /* renamed from: a */
    private final bxpe m78462a(ClientContext clientContext, avgl avgl, bbmr bbmr, AtomicBoolean atomicBoolean) {
        boolean z;
        bdwf bdwf;
        int i;
        bxpe bxpe;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        bxqc bxqc;
        ClientContext clientContext2 = clientContext;
        avgl avgl2 = avgl;
        bbmr bbmr2 = bbmr;
        AtomicBoolean atomicBoolean2 = atomicBoolean;
        Account account = clientContext2.f30213c;
        ClientContext clientContext3 = new ClientContext(clientContext2);
        clientContext3.f30216f = this.f93138a.getPackageName();
        clientContext3.mo17806d("https://www.googleapis.com/auth/webhistory");
        bxvd da = bxpc.f164232g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxpc bxpc = (bxpc) da.f164949b;
        "com.google.android.gms#udc-facs".getClass();
        bxpc.f164234a |= 1;
        bxpc.f164235b = "com.google.android.gms#udc-facs";
        String str = (String) this.f93140c.mo6606a();
        if (str != null) {
            bxvd da2 = bxpb.f164228c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bxpb bxpb = (bxpb) da2.f164949b;
            str.getClass();
            bxpb.f164230a = 2;
            bxpb.f164231b = str;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxpc bxpc2 = (bxpc) da.f164949b;
            bxpb bxpb2 = (bxpb) da2.mo74062i();
            bxpb2.getClass();
            bxpc2.f164236c = bxpb2;
            bxpc2.f164234a |= 2;
        }
        avfh avfh = (avfh) this.f93144g.apply(account);
        if (avfh.mo51192a()) {
            bxok a = m78460a(avfh, account);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxpc bxpc3 = (bxpc) da.f164949b;
            a.getClass();
            bxpc3.f164238e = a;
            bxpc3.f164234a |= 4;
            if (chbh.m148014l()) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxpc bxpc4 = (bxpc) da.f164949b;
                bxpc4.f164234a |= 8;
                bxpc4.f164239f = true;
            }
        }
        if (chbh.m148019q()) {
            if (bbmr2 != null) {
                Iterable<bxqc> a2 = bnjd.m109575a((Iterable) bbmr.mo56219a(), avfz.f93116a);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxpc bxpc5 = (bxpc) da.f164949b;
                bxpc5.mo73599a();
                for (bxqc bxqc2 : a2) {
                    bxpc5.f164237d.mo74153d(bxqc2.f164366l);
                }
            }
            avgl avgl3 = avgl.TRIGGERED_BY_EVENT;
            auzv auzv = auzv.UNKNOWN_SYNC_REASON;
            int ordinal = avgl.ordinal();
            if (ordinal == 1) {
                bxqc = bxqc.PERIODIC_SYNC;
            } else if (ordinal == 2) {
                bxqc = bxqc.FORCED_SYNC;
            } else if (ordinal != 3) {
                bxqc = bxqc.UNKNOWN_REQUEST_REASON;
            } else {
                bxqc = bxqc.EMPTY_CACHE;
            }
            if (bxqc != bxqc.UNKNOWN_REQUEST_REASON) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxpc bxpc6 = (bxpc) da.f164949b;
                bxqc.getClass();
                bxpc6.mo73599a();
                bxpc6.f164237d.mo74153d(bxqc.f164366l);
            }
        }
        bxpc bxpc7 = (bxpc) da.mo74062i();
        try {
            if (this.f93139b == null) {
                Object a3 = this.f93149l.mo6606a();
                if (adym.f62908d == null) {
                    adym.f62908d = chtv.m149566a(chtu.UNARY, "footprints.oneplatform.FootprintsService/GetActivityControlsSettings", ciie.m150370a(bxpc.f164232g), ciie.m150370a(bxpe.f164247d));
                }
                i = 2;
                z = true;
                try {
                    bxpe = (bxpe) ((adym) a3).f62911a.mo25553a(adym.f62908d, clientContext3, bxpc7, 10000, TimeUnit.MILLISECONDS);
                } catch (chuw | chux | gid e) {
                    e = e;
                    Throwable th = e;
                    if (bbmr2 != null) {
                    }
                    m78466a(false, avgl2, bbmr2, false, atomicBoolean2);
                    bnsi c = avex.m78395a().mo68388c();
                    c.mo68402a((int) chbh.m148013k());
                    c.mo68437a(th);
                    c.mo68432a("avgm", "a", 375, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Account sync failed!");
                    throw th;
                }
            } else {
                z = true;
                i = 2;
                if (!chbh.m148006d()) {
                    bxpe = ((bxow) ((bxow) this.f93139b.mo6606a()).mo86139a(bruw.f143433a, bruw.m114733a(clientContext2.f30213c.name))).mo73597a(bxpc7);
                } else {
                    bxpe = m78468d().mo73597a(bxpc7);
                }
            }
            auzj a4 = m78458a(bxpe, account);
            this.f93141d.mo51199a(account, bxpe, a4);
            if (a4 != null) {
                bxpe bxpe2 = a4.f92830b;
                if (bxpe2 == null) {
                    bxpe2 = bxpe.f164247d;
                }
                if (bxpe2.equals(bxpe)) {
                    z2 = false;
                    if (bbmr2 != null) {
                        try {
                            bbmu bbmu = bbmr2.f102928a;
                            if (bbmu != null) {
                                bbmv.m88201a(bbmu.f102933a.mo56231c());
                            }
                        } catch (IOException e2) {
                            bnsi c2 = bbmr2.f102929b.mo68388c();
                            c2.mo68437a(e2);
                            c2.mo68432a("bbmr", "b", 90, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            c2.mo68405a("Failed to update metadata after sync completed successfully!");
                        }
                        aveu aveu = this.f93147j;
                        bdwf a5 = bdwf.m91508a(i);
                        a5.mo58402a(bbmr.mo56222d(), avgi.f93125a);
                        a5.mo58403a(z2);
                        bxpv a6 = a5.mo58401a();
                        if (avgl2 == avgl.FORCED) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (avgl2 == avgl.PERIODIC) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (avgl2 == avgl.EMPTY_CACHE) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        aveu.mo51187a(a6, z3, z4, z5);
                    }
                    m78466a(z, avgl2, bbmr2, z2, atomicBoolean2);
                    return bxpe;
                }
            }
            z2 = true;
            if (bbmr2 != null) {
            }
            m78466a(z, avgl2, bbmr2, z2, atomicBoolean2);
            return bxpe;
        } catch (chuw | chux | gid e3) {
            e = e3;
            z = true;
            Throwable th2 = e;
            if (bbmr2 != null) {
                try {
                    bbmu bbmu2 = bbmr2.f102928a;
                    if (bbmu2 != null) {
                        bbmv.m88201a(bbmu2.f102933a.mo56232d());
                    }
                } catch (IOException e4) {
                    bnsi c3 = bbmr2.f102929b.mo68388c();
                    c3.mo68437a(e4);
                    c3.mo68432a("bbmr", "c", 102, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c3.mo68405a("Failed to update metadata after sync failed!");
                }
                aveu aveu2 = this.f93147j;
                if (th2 instanceof chuw) {
                    bdwf = bdwf.m91509a((chuw) th2);
                } else if (th2 instanceof chux) {
                    bdwf = bdwf.m91510a((chux) th2);
                } else if (th2 instanceof gil) {
                    bdwf = bdwf.m91508a(8);
                } else if (th2 instanceof C1020gis) {
                    bdwf = bdwf.m91508a(7);
                } else if (th2 instanceof UserRecoverableAuthException) {
                    bdwf = bdwf.m91508a(6);
                } else if (th2 instanceof gid) {
                    bdwf = bdwf.m91508a(5);
                } else {
                    bdwf = bdwf.m91508a(3);
                }
                bdwf.mo58402a(bbmr.mo56222d(), avgh.f93124a);
                bxpv a7 = bdwf.mo58401a();
                boolean z6 = avgl2 == avgl.FORCED;
                boolean z7 = avgl2 == avgl.PERIODIC;
                if (avgl2 != avgl.EMPTY_CACHE) {
                    z = false;
                }
                aveu2.mo51187a(a7, z6, z7, z);
            }
            m78466a(false, avgl2, bbmr2, false, atomicBoolean2);
            bnsi c4 = avex.m78395a().mo68388c();
            c4.mo68402a((int) chbh.m148013k());
            c4.mo68437a(th2);
            c4.mo68432a("avgm", "a", 375, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c4.mo68405a("Account sync failed!");
            throw th2;
        }
    }

    /* renamed from: a */
    public static bxqc m78463a(auzv auzv) {
        avgl avgl = avgl.TRIGGERED_BY_EVENT;
        auzv auzv2 = auzv.UNKNOWN_SYNC_REASON;
        switch (auzv.ordinal()) {
            case 1:
                return bxqc.PUSH_MESSAGE;
            case 2:
                return bxqc.FLAG_CHANGE;
            case 3:
                return bxqc.ACCOUNT_CHANGE;
            case 4:
                return bxqc.PUSH_REGISTRATION;
            case 5:
                return bxqc.DEVICE_BOOT;
            case 6:
                return bxqc.APP_UPDATE;
            default:
                return bxqc.UNKNOWN_REQUEST_REASON;
        }
    }

    /* renamed from: a */
    private final void m78464a(List list) {
        try {
            bbny bbny = this.f93146i;
            HashSet<Account> hashSet = new HashSet(list);
            HashSet hashSet2 = new HashSet();
            for (Account account : hashSet) {
                hashSet2.add(bbny.mo56265a(account));
            }
            hashSet2.add(bbny.mo56264a());
            Uri a = bbny.mo56264a();
            ArrayList arrayList = new ArrayList(a.getPathSegments());
            bmxy.m108589a(!arrayList.isEmpty(), "Can't retrieve Uri parent!");
            arrayList.remove(arrayList.size() - 1);
            Uri build = a.buildUpon().path(bmxr.m108543a('/').mo66874a((Iterable) arrayList)).build();
            for (Uri uri : bbny.f102996a.mo60647c(build) ? bbny.f102996a.mo60650f(build) : bngx.m109376e()) {
                if (!hashSet2.contains(uri)) {
                    bbny.f102996a.mo60651h(uri);
                }
            }
        } catch (Exception e) {
            bnsi c = avex.m78395a().mo68388c();
            c.mo68402a((int) chbh.m148013k());
            c.mo68437a(e);
            c.mo68432a("avgm", "a", 628, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Sync metadata wipeout failed!");
        }
    }

    /* renamed from: a */
    public static void m78465a(AtomicBoolean atomicBoolean) {
        if (atomicBoolean.compareAndSet(true, false)) {
            long T = chbh.f188248a.mo6606a().mo84938T();
            if (T > 0) {
                avet.m78389a(T, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: a */
    private static void m78466a(boolean z, avgl avgl, bbmr bbmr, boolean z2, AtomicBoolean atomicBoolean) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (avet.m78390a(chbh.f188248a.mo6606a().mo84937S())) {
            aves a = avet.m78388a();
            if (bbmr != null) {
                z3 = bbmr.mo56219a().contains(auzv.PUSH_MESSAGE);
            } else {
                z3 = false;
            }
            if (avgl == avgl.PERIODIC) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (avgl == avgl.FORCED) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (avgl == avgl.EMPTY_CACHE) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (bbmr != null) {
                bnrd a2 = bbmr.mo56219a().iterator();
                while (true) {
                    if (a2.hasNext()) {
                        if (((auzv) a2.next()) != auzv.PUSH_MESSAGE) {
                            z7 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z7 = false;
            ((beon) a.f93029b.mo6606a()).mo60861b(Boolean.valueOf(z), Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5), Boolean.valueOf(z6), Boolean.valueOf(z7), Boolean.valueOf(z2));
            atomicBoolean.set(true);
        }
    }

    /* renamed from: a */
    public final bxpe mo51200a(ClientContext clientContext, avgl avgl) {
        bbmr bbmr;
        Account account = clientContext.f30213c;
        mo51206b();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        try {
            Account account2 = clientContext.f30213c;
            if (chbh.m148019q()) {
                bbmr = this.f93143f.mo56266a(account2).mo56223a();
            } else {
                bbmr = null;
            }
            return m78462a(clientContext, avgl, bbmr, atomicBoolean);
        } finally {
            m78465a(atomicBoolean);
        }
    }

    /* renamed from: a */
    public final bxqg mo51201a(ClientContext clientContext, bxqf bxqf, boolean z) {
        bxqg bxqg;
        Account account = clientContext.f30213c;
        ClientContext clientContext2 = new ClientContext(clientContext);
        clientContext2.f30216f = this.f93138a.getPackageName();
        clientContext2.mo17806d("https://www.googleapis.com/auth/webhistory");
        if (z) {
            Account account2 = clientContext.f30213c;
            avfh avfh = (avfh) this.f93144g.apply(account2);
            if (avfh.mo51192a()) {
                bxvd bxvd = (bxvd) bxqf.mo74142c(5);
                bxvd.mo73625a((bxvk) bxqf);
                bxok a = m78460a(avfh, account2);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bxqf bxqf2 = (bxqf) bxvd.f164949b;
                bxqf bxqf3 = bxqf.f164373f;
                a.getClass();
                bxqf2.f164377c = a;
                bxqf2.f164375a |= 4;
                if (chbh.m148014l()) {
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bxqf bxqf4 = (bxqf) bxvd.f164949b;
                    bxqf4.f164375a |= 16;
                    bxqf4.f164379e = true;
                }
                bxqf = (bxqf) bxvd.mo74062i();
            }
        }
        bxqf bxqf5 = bxqf;
        if (this.f93139b == null) {
            Object a2 = this.f93149l.mo6606a();
            if (adym.f62909e == null) {
                adym.f62909e = chtv.m149566a(chtu.UNARY, "footprints.oneplatform.FootprintsService/UpdateActivityControlsSettings", ciie.m150370a(bxqf.f164373f), ciie.m150370a(bxqg.f164380b));
            }
            bxqg = (bxqg) ((adym) a2).f62911a.mo25553a(adym.f62909e, clientContext2, bxqf5, 10000, TimeUnit.MILLISECONDS);
        } else if (chbh.m148006d()) {
            bxqg = m78468d().mo73598a(bxqf5);
        } else {
            bxqg = ((bxow) ((bxow) this.f93139b.mo6606a()).mo86139a(bruw.f143433a, bruw.m114733a(clientContext.f30213c.name))).mo73598a(bxqf5);
        }
        bxpe bxpe = bxqg.f164382a;
        if (bxpe == null) {
            bxpe = bxpe.f164247d;
        }
        auzj a3 = m78458a(bxpe, clientContext2.f30213c);
        avfw avfw = this.f93141d;
        Account account3 = clientContext.f30213c;
        bxpe bxpe2 = bxqg.f164382a;
        if (bxpe2 == null) {
            bxpe2 = bxpe.f164247d;
        }
        avfw.mo51199a(account3, bxpe2, a3);
        return bxqg;
    }

    /* renamed from: a */
    public final ClientContext mo51202a(Account account) {
        ClientContext clientContext = new ClientContext();
        clientContext.f30212b = this.f93138a.getApplicationInfo().uid;
        clientContext.f30213c = account;
        clientContext.f30215e = this.f93138a.getPackageName();
        clientContext.f30216f = this.f93138a.getPackageName();
        clientContext.mo17806d("https://www.googleapis.com/auth/webhistory");
        return clientContext;
    }

    /* renamed from: a */
    public final void mo51203a(ClientContext clientContext, avgl avgl, AtomicBoolean atomicBoolean) {
        bbmr bbmr;
        Account account = clientContext.f30213c;
        if (chbh.m148019q()) {
            bbmr = this.f93143f.mo56266a(account).mo56223a();
            if (chbh.f188248a.mo6606a().mo84926H() && avgl == avgl.TRIGGERED_BY_EVENT && bbmr.mo56219a().isEmpty()) {
                return;
            }
        } else {
            bbmr = null;
        }
        m78462a(clientContext, avgl, bbmr, atomicBoolean);
    }

    /* renamed from: a */
    public final boolean mo51204a(avgl avgl) {
        mo51206b();
        List<Account> e = m78469e();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        boolean z = true;
        for (Account account : e) {
            try {
                mo51203a(mo51202a(account), avgl, atomicBoolean);
            } catch (chuw | chux | gid | InterruptedException | ExecutionException e2) {
                z = false;
            }
        }
        m78465a(atomicBoolean);
        return z;
    }
}
