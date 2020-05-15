package p000;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: tej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tej implements teu {

    /* renamed from: a */
    public static final sek f45751a = tea.m36798a("flash_call_verifier");

    /* renamed from: b */
    public final BlockingQueue f45752b;

    /* renamed from: c */
    public final sza f45753c;

    /* renamed from: d */
    public final tdx f45754d;

    /* renamed from: e */
    public final teg f45755e;

    /* renamed from: f */
    public final ReentrantLock f45756f = new ReentrantLock();

    /* renamed from: g */
    public cbqw f45757g;

    /* renamed from: h */
    public int f45758h = -1;

    /* renamed from: i */
    final tei f45759i = new tei(this);

    /* renamed from: j */
    public int f45760j;

    /* renamed from: k */
    private final List f45761k;

    /* renamed from: l */
    private int f45762l = 0;

    public tej(cbqy cbqy, sza sza, tdx tdx, teg teg) {
        cbqg cbqg;
        cboh cboh;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        this.f45753c = sza;
        this.f45754d = tdx;
        this.f45755e = teg;
        bxvd bxvd = (bxvd) cbqy.mo74142c(5);
        bxvd.mo73625a((bxvk) cbqy);
        cbqw cbqw = (cbqw) bxvd;
        this.f45757g = cbqw;
        this.f45752b = arrayBlockingQueue;
        cbqy cbqy2 = (cbqy) cbqw.f164949b;
        if (cbqy2.f178083a != 4) {
            cbqg = cbqg.f178018b;
        } else {
            cbqg = (cbqg) cbqy2.f178084b;
        }
        cbnz cbnz = cbqg.f178020a;
        cbnz = cbnz == null ? cbnz.f177781f : cbnz;
        if (cbnz.f177783a == 8) {
            cboh = (cboh) cbnz.f177784b;
        } else {
            cboh = cboh.f177813e;
        }
        if (cdgc.m133123d() && teg != null && cboh.f177815a.size() > 0) {
            this.f45760j = 3;
            bxwc bxwc = cboh.f177815a;
            this.f45761k = bxwc;
            if (teg.mo26435a((cbos) bxwc.get(this.f45762l))) {
                f45751a.mo25412b("Proceeding to trigger first phone call.", new Object[0]);
                mo26440a("");
                return;
            }
            teg.mo26434a(this.f45759i);
            f45751a.mo25412b("FlashCallChallenge initial request failed.", new Object[0]);
            return;
        }
        f45751a.mo25412b("FlashCall is not enable, Receiver is null, Challenge is null, or doesn't have phone ranges.", new Object[0]);
        this.f45761k = null;
        this.f45760j = 6;
        try {
            this.f45752b.put(cbqy.f178081i);
        } catch (InterruptedException e) {
            f45751a.mo25417e("fails to put into blocking queue.", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public static cboe m36832a(String str, int i) {
        bxvd da = cboe.f177806c.mo74144da();
        bxvd da2 = cboj.f177822c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        cboj cboj = (cboj) da2.f164949b;
        str.getClass();
        cboj.f177824a = str;
        cboj.f177825b = i - 2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cboe cboe = (cboe) da.f164949b;
        cboj cboj2 = (cboj) da2.mo74062i();
        cboj2.getClass();
        cboe.f177809b = cboj2;
        cboe.f177808a = 7;
        return (cboe) da.mo74062i();
    }

    /* renamed from: e */
    private final void m36833e() {
        teg teg = this.f45755e;
        if (teg != null) {
            teg.mo26436b(this.f45759i);
        }
    }

    /* renamed from: a */
    public final void mo26427a() {
    }

    /* renamed from: b */
    public final cbqy mo26428b() {
        cbqy cbqy;
        synchronized (this.f45756f) {
            cbqy = (cbqy) this.f45757g.mo74062i();
        }
        return cbqy;
    }

    /* renamed from: c */
    public final String mo26429c() {
        cbqg cbqg;
        String str;
        synchronized (this.f45756f) {
            cbqy cbqy = (cbqy) this.f45757g.f164949b;
            if (cbqy.f178083a == 4) {
                cbqg = (cbqg) cbqy.f178084b;
            } else {
                cbqg = cbqg.f178018b;
            }
            cbnz cbnz = cbqg.f178020a;
            if (cbnz == null) {
                cbnz = cbnz.f177781f;
            }
            cboa cboa = cbnz.f177785c;
            if (cboa == null) {
                cboa = cboa.f177788b;
            }
            str = cboa.f177790a;
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b0, code lost:
        return r0;
     */
    /* renamed from: d */
    public final cbqy mo26430d() {
        cbqg cbqg;
        cbqg cbqg2;
        long min;
        int i;
        cbqg cbqg3;
        cbqg cbqg4;
        f45751a.mo25409a("do verification.", new Object[0]);
        try {
            BlockingQueue blockingQueue = this.f45752b;
            synchronized (this.f45756f) {
                cbqy cbqy = (cbqy) this.f45757g.f164949b;
                if (cbqy.f178083a == 4) {
                    cbqg = (cbqg) cbqy.f178084b;
                } else {
                    cbqg = cbqg.f178018b;
                }
                cbnz cbnz = cbqg.f178020a;
                if (cbnz == null) {
                    cbnz = cbnz.f177781f;
                }
                cbrc cbrc = cbnz.f177787e;
                if (cbrc == null) {
                    cbrc = cbrc.f178104c;
                }
                bxyk bxyk = cbrc.f178106a;
                if (bxyk == null) {
                    bxyk = bxyk.f165095c;
                }
                long j = bxyk.f165097a;
                cbqy cbqy2 = (cbqy) this.f45757g.f164949b;
                if (cbqy2.f178083a == 4) {
                    cbqg2 = (cbqg) cbqy2.f178084b;
                } else {
                    cbqg2 = cbqg.f178018b;
                }
                cbnz cbnz2 = cbqg2.f178020a;
                if (cbnz2 == null) {
                    cbnz2 = cbnz.f177781f;
                }
                cbrc cbrc2 = cbnz2.f177787e;
                if (cbrc2 == null) {
                    cbrc2 = cbrc.f178104c;
                }
                bxyk bxyk2 = cbrc2.f178107b;
                if (bxyk2 == null) {
                    bxyk2 = bxyk.f165095c;
                }
                min = Math.min(cdgc.m133124e(), j - bxyk2.f165097a);
            }
            cbqy cbqy3 = (cbqy) blockingQueue.poll(min, TimeUnit.SECONDS);
            f45751a.mo25409a("Found verification %s.", cbqy3);
            m36833e();
            synchronized (this.f45756f) {
                if (cbqy3 != null) {
                    if (this.f45758h < 0) {
                        if (this.f45760j == 6) {
                            tds.m36774a(rpr.m34216b()).mo26411a(this.f45754d, (cbqy) this.f45757g.mo74062i(), 59);
                            f45751a.mo25418e("Flash call verification failed.", new Object[0]);
                        }
                    }
                }
                int i2 = this.f45758h;
                if (i2 < 0) {
                    tds.m36774a(rpr.m34216b()).mo26411a(this.f45754d, (cbqy) this.f45757g.mo74062i(), 60);
                    f45751a.mo25418e("No flash call received in time.", new Object[0]);
                    i = 3;
                } else {
                    String a = teg.m36823a(i2);
                    tds.m36774a(rpr.m34216b()).mo26408a(this.f45754d, 61, teg.m36824b(this.f45758h), a);
                    f45751a.mo25416d(a, new Object[0]);
                    i = teg.m36825c(this.f45758h);
                }
                cbqw cbqw = this.f45757g;
                cbqy cbqy4 = (cbqy) cbqw.f164949b;
                if (cbqy4.f178083a == 4) {
                    cbqg3 = (cbqg) cbqy4.f178084b;
                } else {
                    cbqg3 = cbqg.f178018b;
                }
                bxvd bxvd = (bxvd) cbqg3.mo74142c(5);
                bxvd.mo73625a((bxvk) cbqg3);
                cbqy cbqy5 = (cbqy) this.f45757g.f164949b;
                if (cbqy5.f178083a == 4) {
                    cbqg4 = (cbqg) cbqy5.f178084b;
                } else {
                    cbqg4 = cbqg.f178018b;
                }
                cbnz cbnz3 = cbqg4.f178020a;
                if (cbnz3 == null) {
                    cbnz3 = cbnz.f177781f;
                }
                bxvd bxvd2 = (bxvd) cbnz3.mo74142c(5);
                bxvd2.mo73625a((bxvk) cbnz3);
                bxvd da = cboh.f177813e.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((cboh) da.f164949b).f177816b = cbog.m128043a(6);
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                cbnz cbnz4 = (cbnz) bxvd2.f164949b;
                cboh cboh = (cboh) da.mo74062i();
                cboh.getClass();
                cbnz4.f177784b = cboh;
                cbnz4.f177783a = 8;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                cbnz cbnz5 = (cbnz) bxvd2.mo74062i();
                cbqg cbqg5 = cbqg.f178018b;
                cbnz5.getClass();
                ((cbqg) bxvd.f164949b).f178020a = cbnz5;
                if (cbqw.f164950c) {
                    cbqw.mo74035c();
                    cbqw.f164950c = false;
                }
                cbqy cbqy6 = (cbqy) cbqw.f164949b;
                cbqg cbqg6 = (cbqg) bxvd.mo74062i();
                cbqy cbqy7 = cbqy.f178081i;
                cbqg6.getClass();
                cbqy6.f178084b = cbqg6;
                cbqy6.f178083a = 4;
                cbqy a2 = this.f45753c.mo26253a(this.f45754d, (cbqy) this.f45757g.mo74062i(), m36832a("", i));
                return a2;
            }
        } catch (InterruptedException e) {
            m36833e();
            throw new tdw("blocking queue polling failed.", 39, false, e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo26440a(String str) {
        cbqg cbqg;
        cbqg cbqg2;
        cbqg cbqg3;
        cboh cboh;
        synchronized (this.f45756f) {
            int i = this.f45760j;
            if (i != 6 && i != 5) {
                if (i == 4) {
                    this.f45762l++;
                    this.f45755e.mo26436b(this.f45759i);
                    if (this.f45762l >= this.f45761k.size()) {
                        this.f45760j = 5;
                    } else if (!this.f45755e.mo26435a((cbos) this.f45761k.get(this.f45762l))) {
                        this.f45760j = 6;
                        return;
                    }
                }
                cbqw cbqw = this.f45757g;
                cbqy cbqy = (cbqy) cbqw.f164949b;
                if (cbqy.f178083a == 4) {
                    cbqg = (cbqg) cbqy.f178084b;
                } else {
                    cbqg = cbqg.f178018b;
                }
                bxvd bxvd = (bxvd) cbqg.mo74142c(5);
                bxvd.mo73625a((bxvk) cbqg);
                cbqy cbqy2 = (cbqy) this.f45757g.f164949b;
                if (cbqy2.f178083a == 4) {
                    cbqg2 = (cbqg) cbqy2.f178084b;
                } else {
                    cbqg2 = cbqg.f178018b;
                }
                cbnz cbnz = cbqg2.f178020a;
                if (cbnz == null) {
                    cbnz = cbnz.f177781f;
                }
                bxvd bxvd2 = (bxvd) cbnz.mo74142c(5);
                bxvd2.mo73625a((bxvk) cbnz);
                cbqy cbqy3 = (cbqy) this.f45757g.f164949b;
                if (cbqy3.f178083a == 4) {
                    cbqg3 = (cbqg) cbqy3.f178084b;
                } else {
                    cbqg3 = cbqg.f178018b;
                }
                cbnz cbnz2 = cbqg3.f178020a;
                if (cbnz2 == null) {
                    cbnz2 = cbnz.f177781f;
                }
                if (cbnz2.f177783a == 8) {
                    cboh = (cboh) cbnz2.f177784b;
                } else {
                    cboh = cboh.f177813e;
                }
                bxvd bxvd3 = (bxvd) cboh.mo74142c(5);
                bxvd3.mo73625a((bxvk) cboh);
                int i2 = this.f45760j;
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                cboh cboh2 = cboh.f177813e;
                ((cboh) bxvd3.f164949b).f177816b = cbog.m128043a(i2);
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                cbnz cbnz3 = (cbnz) bxvd2.f164949b;
                cboh cboh3 = (cboh) bxvd3.mo74062i();
                cboh3.getClass();
                cbnz3.f177784b = cboh3;
                cbnz3.f177783a = 8;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                cbnz cbnz4 = (cbnz) bxvd2.mo74062i();
                cbqg cbqg4 = cbqg.f178018b;
                cbnz4.getClass();
                ((cbqg) bxvd.f164949b).f178020a = cbnz4;
                if (cbqw.f164950c) {
                    cbqw.mo74035c();
                    cbqw.f164950c = false;
                }
                cbqy cbqy4 = (cbqy) cbqw.f164949b;
                cbqg cbqg5 = (cbqg) bxvd.mo74062i();
                cbqy cbqy5 = cbqy.f178081i;
                cbqg5.getClass();
                cbqy4.f178084b = cbqg5;
                cbqy4.f178083a = 4;
                bxvd da = cboi.f177819b.mo74144da();
                if (this.f45762l < this.f45761k.size()) {
                    cbos cbos = (cbos) this.f45761k.get(this.f45762l);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    cbos.getClass();
                    ((cboi) da.f164949b).f177821a = cbos;
                }
                cbqw cbqw2 = this.f45757g;
                cboc cboc = (cboc) cbod.f177801d.mo74144da();
                if (cboc.f164950c) {
                    cboc.mo74035c();
                    cboc.f164950c = false;
                }
                cboi cboi = (cboi) da.mo74062i();
                cboi.getClass();
                ((cbod) cboc.f164949b).f177805c = cboi;
                if (cbqw2.f164950c) {
                    cbqw2.mo74035c();
                    cbqw2.f164950c = false;
                }
                cbod cbod = (cbod) cboc.mo74062i();
                cbod.getClass();
                ((cbqy) cbqw2.f164949b).f178090h = cbod;
                new soa(9, new teh(this, str)).start();
            }
        }
    }
}
