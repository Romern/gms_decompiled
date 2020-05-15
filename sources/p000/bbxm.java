package p000;

import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: bbxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbxm implements bbps, bbxv {

    /* renamed from: a */
    public final Context f103675a;

    /* renamed from: b */
    public final bdaw f103676b;

    /* renamed from: c */
    public final bcfx f103677c;

    /* renamed from: d */
    public final List f103678d;

    /* renamed from: e */
    public final Random f103679e;

    /* renamed from: f */
    public bbpk f103680f;

    /* renamed from: g */
    public final Object f103681g = new Object();

    /* renamed from: h */
    public final Object f103682h = new Object();

    /* renamed from: i */
    final Map f103683i = new HashMap();

    /* renamed from: j */
    final Map f103684j = new HashMap();

    /* renamed from: k */
    public final bqgj f103685k = bboz.m88304a().f103024a;

    /* renamed from: l */
    public final azbk f103686l;

    /* renamed from: m */
    public final azbl f103687m;

    /* renamed from: n */
    public final bcky f103688n;

    /* renamed from: o */
    private final Map f103689o;

    /* renamed from: p */
    private final Map f103690p;

    public bbxm(Context context, Map map, bcky bcky, bdaw bdaw, azbk azbk, azbl azbl, bcfx bcfx, bbpt bbpt) {
        this.f103675a = context;
        this.f103689o = map;
        this.f103688n = bcky;
        this.f103676b = bdaw;
        this.f103686l = azbk;
        this.f103687m = azbl;
        this.f103677c = bcfx;
        this.f103678d = bnkn.m109665a(bbpt);
        this.f103690p = new HashMap();
        this.f103679e = new Random();
    }

    /* renamed from: a */
    private final bqgg m88561a(bcoh bcoh, bcoz bcoz, int i) {
        bqgg bqgg;
        bqgg bqgg2;
        bcoh bcoh2 = bcoh;
        int i2 = i;
        synchronized (this.f103682h) {
            bqgg = (bqgg) this.f103684j.get(bcoh2);
            if (bqgg != null) {
                if (!bqgg.isDone()) {
                    bbos.m88289a("TyRegController", "RegisterRefresh already pending");
                }
            }
            bcfx bcfx = this.f103677c;
            bcnr q = bcns.m89409q();
            q.mo57011b(12);
            q.mo57003a(i2);
            q.mo57012b(bcoh.mo57058b().mo57074e());
            q.mo57010a(bcoh.mo57059c().mo73781l());
            bcfx.mo56753a(q.mo57002a());
            if (bcoz.mo57137h() == 1) {
                bbos.m88289a("TyRegController", "User has no key.");
                bcfx bcfx2 = this.f103677c;
                bcnr q2 = bcns.m89409q();
                q2.mo57011b(14);
                q2.mo57003a(i2);
                q2.mo57012b(bcoh.mo57058b().mo57074e());
                q2.mo57010a(bcoh.mo57059c().mo73781l());
                bcfx2.mo56753a(q2.mo57002a());
                bcfx bcfx3 = this.f103677c;
                bcnr q3 = bcns.m89409q();
                q3.mo57011b(10016);
                q3.mo57012b(bcoh.mo57058b().mo57074e());
                q3.mo57010a(bcoh.mo57059c().mo73781l());
                bcfx3.mo56753a(q3.mo57002a());
                mo56273a(bcoh.mo57058b().mo57074e());
                synchronized (this.f103681g) {
                    this.f103683i.remove(Long.valueOf(bcoh.mo57057a()));
                }
                bbyp e = bbyq.m88623e();
                e.f103764d = 3;
                bqgg = bqga.m112775a(e.mo56550a());
            } else {
                bcei c = bcej.m88869c();
                c.f104034a = "register refresh";
                c.mo56735a(bcen.f104044e);
                bcej a = c.mo56734a();
                bcky bcky = this.f103688n;
                azbk azbk = this.f103686l;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                bbon.m88284a();
                long micros = timeUnit.toMicros(System.currentTimeMillis());
                ContactId e2 = bcoh.mo57058b().mo57074e();
                if (bcoz.mo57137h() == 2) {
                    bqgg a2 = bcky.f104427a.mo56942a(UUID.randomUUID(), new bcna(bcoh, bcky.f104428b, azbk, bcoz.mo57134d(), micros), bcky.f104427a.f104335d.mo56959a(), bcoh, bcoz, a);
                    bqgg2 = bcky.f104427a.mo56938a(bqga.m112786c(a2).mo69214a(new bckv(bcky, a2, bcoh, azbk, bcoz, a), bqfb.INSTANCE), e2, 7);
                } else {
                    bbyp e3 = bbyq.m88623e();
                    e3.f103764d = 3;
                    bqgg2 = bqga.m112775a(e3.mo56550a());
                }
                bqgg a3 = bqdx.m112673a(bqgg2, new bbxj(this, i2, bcoh2), bqfb.INSTANCE);
                bqgg = bqga.m112783b(a3).mo69216a(new bbxk(this, bqgg2, i, bcoh, a3), bqfb.INSTANCE);
            }
            this.f103684j.put(bcoh2, bqgg);
        }
        return bqgg;
    }

    /* renamed from: b */
    public final bqgg mo56341b(ContactId contactId) {
        bmxv a = this.f103676b.mo56669a(contactId);
        if (!a.mo66813a() || ((bcoh) a.mo66814b()).mo57060d() != bcog.VALID) {
            bcfx bcfx = this.f103677c;
            bcnr q = bcns.m89409q();
            q.mo57011b(7);
            q.mo57012b(contactId);
            bcfx.mo56753a(q.mo57002a());
            bcei c = bcej.m88869c();
            c.f104034a = "register";
            c.mo56735a(bcen.f104044e);
            bqgg a2 = bqga.m112771a(new bbww(this, contactId, c.mo56734a()), this.f103685k);
            bqgg a3 = bqdx.m112673a(a2, new bbxg(this), bqfb.INSTANCE);
            return bqga.m112783b(a3).mo69216a(new bbxh(this, a2, contactId, a3), bqfb.INSTANCE);
        }
        bbpo b = bbpp.m88355b();
        b.f103038a = 2;
        return bqga.m112775a(b.mo56336a());
    }

    /* renamed from: c */
    public final bqgg mo56342c(ContactId contactId) {
        return bqga.m112771a(new bbwz(this, contactId), this.f103685k);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.String, int):void
     arg types: [int, java.lang.String, int]
     candidates:
      bmxy.a(int, int, java.lang.String):java.lang.String
      bmxy.a(int, int, int):void
      bmxy.a(java.lang.Object, java.lang.String, int):void
      bmxy.a(java.lang.Object, java.lang.String, java.lang.Object):void
      bmxy.a(boolean, java.lang.String, char):void
      bmxy.a(boolean, java.lang.String, long):void
      bmxy.a(boolean, java.lang.String, java.lang.Object):void
      bmxy.a(boolean, java.lang.String, int):void */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c1, code lost:
        if (r6 > 0) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c4, code lost:
        p000.bqhi.m112839a(r6, java.util.concurrent.TimeUnit.MICROSECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c9, code lost:
        r2 = r1.f103678d;
        r3 = r2.size();
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d0, code lost:
        if (r4 >= r3) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d2, code lost:
        ((p000.bbpt) r2.get(r4)).mo54577a(r0);
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00de, code lost:
        return;
     */
    /* renamed from: d */
    public final void mo56490d(ContactId contactId) {
        ContactId contactId2 = contactId;
        if (!this.f103690p.containsKey(contactId2)) {
            Map map = this.f103690p;
            bqgu bqgu = new bqgu(new bqgt(null));
            bmxy.m108589a(!Double.isNaN(0.01d), "rate must be positive");
            synchronized (bqgu.mo69253a()) {
                bqgu.mo69254a(bqgu.f140634a.mo69252a());
                double micros = (double) TimeUnit.SECONDS.toMicros(1);
                Double.isNaN(micros);
                bqgu.f140637d = micros / 0.01d;
                double d = bqgu.f140636c;
                bqgu.f140636c = 0.01d;
                if (d != Double.POSITIVE_INFINITY) {
                    double d2 = 0.0d;
                    if (d != 0.0d) {
                        d2 = (bqgu.f140635b * 0.01d) / d;
                    }
                    bqgu.f140635b = d2;
                } else {
                    bqgu.f140635b = 0.01d;
                }
            }
            map.put(contactId2, bqgu);
        }
        bqgu bqgu2 = (bqgu) this.f103690p.get(contactId2);
        long max = Math.max(TimeUnit.MICROSECONDS.toMicros(0), 0L);
        bmxy.m108591a(true, "Requested permits (%s) must be positive", 1);
        synchronized (bqgu2.mo69253a()) {
            long a = bqgu2.f140634a.mo69252a();
            if (bqgu2.f140638e - max <= a) {
                bqgu2.mo69254a(a);
                long j = bqgu2.f140638e;
                double min = Math.min(1.0d, bqgu2.f140635b);
                bqgu2.f140638e = bqbs.m112528d(bqgu2.f140638e, (long) ((1.0d - min) * bqgu2.f140637d));
                bqgu2.f140635b -= min;
                long max2 = Math.max(j - a, 0L);
            }
        }
    }

    /* renamed from: a */
    public final bqgg mo56338a() {
        return this.f103685k.mo25819b(new bbxa(this));
    }

    /* renamed from: a */
    public final bqgg mo56339a(long j) {
        return bqdx.m112673a(mo56338a(), new bbxb(j), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56340a(bcoh bcoh) {
        bcei c = bcej.m88869c();
        c.f104034a = "unregister";
        c.mo56735a(bcen.f104044e);
        bcej a = c.mo56734a();
        for (bclf bclf : this.f103689o.values()) {
            bclf.mo56973a(bcoh);
        }
        return bqdx.m112673a(this.f103685k.mo25819b(new bbwx(this, bcoh)), new bbwy(this, bcoh, a), bqfb.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r1.mo66813a() == false) goto L_0x001c;
     */
    /* renamed from: a */
    public final bqgg mo56272a(bcoh bcoh, boolean z) {
        bmxv bmxv;
        synchronized (this.f103681g) {
            bmxv = (bmxv) this.f103683i.get(Long.valueOf(bcoh.mo57057a()));
            if (bmxv == null) {
            }
            bmxv = this.f103676b.mo56668a(bcoh);
            this.f103683i.put(Long.valueOf(bcoh.mo57057a()), bmxv);
        }
        if (!bmxv.mo66813a()) {
            return bqga.m112777a((Throwable) new RuntimeException("Missing Auth Token"));
        }
        bcoz bcoz = (bcoz) bmxv.mo66814b();
        if (!z && bcoz.mo57137h() != 1) {
            long longValue = bcoz.mo57132b().longValue();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            bbon.m88284a();
            if (longValue > timeUnit.toMicros(System.currentTimeMillis() + ((Long) bbqt.m88417a(this.f103675a).f103168j.mo58455c()).longValue())) {
                if (!mo56489a(bcoz)) {
                    return bqga.m112775a(bcoz);
                }
                m88561a(bcoh, bcoz, 109);
                return bqga.m112775a(bcoz);
            }
        }
        return bqdx.m112673a(m88561a(bcoh, bcoz, 110), new bbxi(this, bcoh), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo56488a(bcoh bcoh, bcoz bcoz) {
        long a = this.f103676b.mo56664a(bcoh, bcoz);
        synchronized (this.f103681g) {
            this.f103683i.put(Long.valueOf(a), bmxv.m108566b(bcoz));
        }
    }

    /* renamed from: a */
    public final void mo56273a(ContactId contactId) {
        this.f103685k.mo25812a(new bbxl(this, contactId));
    }

    /* renamed from: a */
    public final boolean mo56489a(bcoz bcoz) {
        long longValue = bcoz.mo57133c().longValue();
        bbon.m88284a();
        return longValue <= System.currentTimeMillis() - ((Long) bbqt.m88417a(this.f103675a).f103169k.mo58455c()).longValue();
    }
}
