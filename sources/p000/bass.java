package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.SyncPolicy;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* renamed from: bass */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bass implements basb {

    /* renamed from: a */
    public final Executor f101671a;

    /* renamed from: b */
    public final Context f101672b;

    /* renamed from: c */
    public final batc f101673c;

    /* renamed from: d */
    public final bxuq f101674d;

    /* renamed from: e */
    public final Map f101675e = new HashMap();

    /* renamed from: f */
    public final afmp f101676f;

    /* renamed from: g */
    private final basz f101677g;

    /* renamed from: h */
    private final Account f101678h;

    /* renamed from: i */
    private final int f101679i;

    /* renamed from: j */
    private final int f101680j;

    /* renamed from: k */
    private final WeakHashMap f101681k = new WeakHashMap();

    public bass(Executor executor, Context context, batc batc, afmp afmp, bxuq bxuq, basz basz, Account account, int i, int i2) {
        this.f101671a = executor;
        this.f101672b = context;
        this.f101673c = batc;
        this.f101676f = afmp;
        this.f101674d = bxuq;
        this.f101677g = basz;
        this.f101678h = account;
        this.f101679i = i;
        this.f101680j = i2;
    }

    /* renamed from: b */
    private final basu m87497b(basc basc) {
        basu basu;
        synchronized (this.f101681k) {
            WeakReference weakReference = (WeakReference) this.f101681k.get(basc);
            if (weakReference != null) {
                basu = (basu) weakReference.get();
            } else {
                basu = null;
            }
            if (basu == null) {
                basu = new basu(basc, this.f101674d);
                this.f101681k.put(basc, new WeakReference(basu));
            }
        }
        return basu;
    }

    /* renamed from: a */
    public final batd mo55939a(String str) {
        String str2 = str.length() == 0 ? new String("com.google.android.gms.mdh.BROADCAST_") : "com.google.android.gms.mdh.BROADCAST_".concat(str);
        Account account = this.f101678h;
        bxvd da = bygz.f166410c.mo74144da();
        bxvd da2 = byhn.f166478e.mo74144da();
        int i = this.f101679i;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        byhn byhn = (byhn) da2.f164949b;
        int i2 = byhn.f166480a | 1;
        byhn.f166480a = i2;
        byhn.f166481b = i;
        int i3 = this.f101680j;
        byhn.f166480a = i2 | 2;
        byhn.f166482c = i3;
        byhm byhm = byhm.SYNC_LATEST_PER_SECONDARY_ID;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        byhn byhn2 = (byhn) da2.f164949b;
        byhn2.f166483d = byhm.f166477e;
        byhn2.f166480a |= 4;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bygz bygz = (bygz) da.f164949b;
        byhn byhn3 = (byhn) da2.mo74062i();
        byhn3.getClass();
        bygz.f166413b = byhn3;
        bygz.f166412a = 2;
        return new bata(str2, account, ((bygz) da.mo74062i()).mo73642k());
    }

    /* renamed from: a */
    public final bqgg mo55925a(basa basa) {
        Executor executor = this.f101671a;
        afmp afmp = this.f101676f;
        LatestFootprintFilter a = basn.m87494a(basa);
        aucf aucf = new aucf();
        afmp.mo34966a(new afmk(aucf, new aflp(afmp, a, aucf)));
        return basy.m87507a(executor, aucf.f91388a, new basp(this));
    }

    /* renamed from: a */
    public final bqgg mo55926a(basc basc) {
        aucb aucb;
        Executor executor = this.f101671a;
        afmp afmp = this.f101676f;
        basu b = m87497b(basc);
        synchronized (afmp.f64401i) {
            afmj afmj = (afmj) afmp.f64401i.get(b);
            if (afmj == null) {
                aucb = aucu.m76778a((Object) false);
            } else {
                afmj.f64378a = false;
                afmt afmt = afmj.f64380c;
                if (afmt != null) {
                    afmt.f64402a = false;
                }
                rob rob = afmp.f64396d.mo24714a(b, "registerLatestFootprintListener").f43429b;
                sdo.m34966a(rob, "Key must not be null");
                aucb = afmp.f64396d.mo24698a(rob);
            }
        }
        return basw.m87505a(executor, aucb);
    }

    /* renamed from: a */
    public final bqgg mo55927a(basc basc, basa basa) {
        afmj afmj;
        auck auck;
        Executor executor = this.f101671a;
        afmp afmp = this.f101676f;
        basu b = m87497b(basc);
        LatestFootprintFilter a = basn.m87494a(basa);
        synchronized (afmp.f64401i) {
            afmj afmj2 = (afmj) afmp.f64401i.get(b);
            if (afmj2 != null) {
                afmj = afmj2;
            } else {
                afmj afmj3 = new afmj(afmp);
                afmp.f64401i.put(b, afmj3);
                afmj = afmj3;
            }
            afmj.f64378a = true;
            rod a2 = afmp.f64396d.mo24714a(b, "registerLatestFootprintListener");
            rob rob = a2.f43429b;
            sdo.m34966a(rob, "Key must not be null");
            aucf aucf = new aucf();
            afmp.mo34966a(new afmk(aucf, new afls(afmp, a2, afmj, b, a, rob, aucf)));
            auck = aucf.f91388a;
        }
        return basw.m87505a(executor, auck);
    }

    /* renamed from: a */
    public final bqgg mo55928a(byte[] bArr, bxxc bxxc) {
        Executor executor = this.f101671a;
        afmp afmp = this.f101676f;
        basz basz = this.f101677g;
        bxvf bxvf = (bxvf) bygn.f166357a.mo74144da();
        bxvf.mo74125a(basz.f101689a, bxxc);
        byte[] k = ((bygn) bxvf.mo74062i()).mo73642k();
        aucf aucf = new aucf();
        afmp.mo34966a(new afmk(aucf, new aflr(afmp, bArr, k, aucf)));
        return basw.m87505a(executor, aucf.f91388a);
    }

    /* renamed from: a */
    public final void mo55929a(azzs azzs, basa basa) {
        SyncPolicy syncPolicy;
        auck auck;
        Executor executor = this.f101671a;
        afmp afmp = this.f101676f;
        if (azzs != null) {
            azzl azzl = (azzl) azzs;
            syncPolicy = new SyncPolicy(azzl.f100323a, basj.m87491a(azzl.f100324b), basj.m87491a(azzl.f100325c), basj.m87491a(azzl.f100326d), basj.m87491a(azzl.f100327e), azzl.f100328f, azzl.f100329g, azzl.f100330h);
        } else {
            syncPolicy = null;
        }
        LatestFootprintFilter a = basn.m87494a(basa);
        aucf aucf = new aucf();
        synchronized (afmp.f64400h) {
            afmm afmm = new afmm(afmp, aucf, syncPolicy, a);
            if (afmp.f64400h.isEmpty()) {
                afmm.mo34965a();
            }
            afmp.f64400h.add(afmm);
            auck = aucf.f91388a;
        }
        basw.m87505a(executor, auck);
    }
}
