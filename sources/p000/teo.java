package p000;

import android.text.TextUtils;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: teo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class teo implements teu {

    /* renamed from: a */
    public static final sek f45776a = tea.m36798a("verifier");

    /* renamed from: b */
    public final BlockingQueue f45777b;

    /* renamed from: c */
    public final cbqy f45778c;

    /* renamed from: d */
    public final sza f45779d;

    /* renamed from: e */
    public final tdx f45780e;

    /* renamed from: f */
    private final tes f45781f;

    /* renamed from: g */
    private final tem f45782g = new tem(this);

    public teo(cbqy cbqy, sza sza, tdx tdx, tes tes) {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        this.f45778c = cbqy;
        this.f45779d = sza;
        this.f45780e = tdx;
        this.f45781f = tes;
        this.f45777b = arrayBlockingQueue;
    }

    /* renamed from: a */
    public static cboe m36846a(String str, String str2) {
        bxvd da = cboo.f177842c.mo74144da();
        if (!TextUtils.isEmpty(str)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str.getClass();
            ((cboo) da.f164949b).f177845b = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str2.getClass();
            ((cboo) da.f164949b).f177844a = str2;
        }
        bxvd da2 = cboe.f177806c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        cboe cboe = (cboe) da2.f164949b;
        cboo cboo = (cboo) da.mo74062i();
        cboo.getClass();
        cboe.f177809b = cboo;
        cboe.f177808a = 1;
        return (cboe) da2.mo74062i();
    }

    /* renamed from: e */
    private final void m36847e() {
        this.f45781f.mo26449b(this.f45782g);
    }

    /* renamed from: a */
    public final void mo26427a() {
    }

    /* renamed from: b */
    public final cbqy mo26428b() {
        return this.f45778c;
    }

    /* renamed from: c */
    public final String mo26429c() {
        cbqg cbqg;
        cbqy cbqy = this.f45778c;
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
        return cboa.f177790a;
    }

    /* renamed from: d */
    public final cbqy mo26430d() {
        cbqg cbqg;
        cbqg cbqg2;
        f45776a.mo25409a("do verification", new Object[0]);
        this.f45781f.mo26447a(this.f45782g);
        try {
            BlockingQueue blockingQueue = this.f45777b;
            cbqy cbqy = this.f45778c;
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
            cbqy cbqy2 = this.f45778c;
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
            cbqy cbqy3 = (cbqy) blockingQueue.poll(Math.min(cdgc.m133124e(), j - bxyk2.f165097a), TimeUnit.SECONDS);
            f45776a.mo25409a("Found verification %s", cbqy3);
            if (cbqy3 == null) {
                m36847e();
                tds.m36774a(rpr.m34216b()).mo26411a(this.f45780e, this.f45778c, 11);
                f45776a.mo25416d("No message received in time", new Object[0]);
                return this.f45779d.mo26253a(this.f45780e, this.f45778c, m36846a("", ""));
            }
            m36847e();
            return cbqy3;
        } catch (InterruptedException e) {
            m36847e();
            throw new tdw("blocking queue polling failed.", 39, false, e);
        }
    }
}
