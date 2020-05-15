package p000;

import android.os.SystemClock;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: bhsi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhsi implements bhqy, bhsj {

    /* renamed from: q */
    private static final bhrk f119445q = new bhrk();

    /* renamed from: a */
    public final bhrm f119446a;

    /* renamed from: b */
    public final bhuk f119447b;

    /* renamed from: c */
    public final Map f119448c = new HashMap();

    /* renamed from: d */
    public boolean f119449d;

    /* renamed from: e */
    public bhro f119450e;

    /* renamed from: f */
    public bhqx f119451f;

    /* renamed from: g */
    public bhwz f119452g;

    /* renamed from: h */
    public bhwv f119453h;

    /* renamed from: i */
    public int f119454i;

    /* renamed from: j */
    public final bhty f119455j;

    /* renamed from: k */
    public final bhxa f119456k;

    /* renamed from: l */
    public final bhxa f119457l;

    /* renamed from: m */
    public final bhrp f119458m;

    /* renamed from: n */
    public final bhsh f119459n = new bhsh(this);

    /* renamed from: o */
    public final bicw f119460o;

    /* renamed from: p */
    public bhsk f119461p;

    /* renamed from: r */
    private final bidf f119462r;

    static {
        Collections.singletonList(bhrj.f119386a);
    }

    /* renamed from: a */
    public static int m101448a(int i) {
        if (i != 0) {
            return i != 1 ? 1 : 4;
        }
        return 2;
    }

    /* renamed from: a */
    private final long m101449a(long j) {
        return j - this.f119462r.f120292a;
    }

    public bhsi(bhrm bhrm, bicw bicw, bhrp bhrp) {
        bict bict = (bict) bhrm;
        bicx bicx = bict.f120241d;
        bidf bidf = bict.f120238a;
        bhxg bhxg = new bhxg(bicx, bict.f120245h);
        this.f119446a = bhrm;
        this.f119460o = bicw;
        this.f119458m = bhrp;
        this.f119456k = bhxg;
        bicx bicx2 = bict.f120241d;
        bidf bidf2 = bict.f120238a;
        this.f119457l = new bhwl(bicx2, bict.f120245h, bict.f120243f);
        this.f119462r = bict.f120238a;
        this.f119447b = bict.f120241d;
        this.f119454i = -1;
        this.f119452g = null;
        this.f119455j = new bhty();
    }

    /* renamed from: a */
    public final bhqz mo64218a(bhqi bhqi) {
        long j;
        bhub bhub;
        int i;
        if (bhqi == null) {
            return null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i2 = 1;
        if (bhqi.f119325i) {
            bhub bhub2 = bhqi.f119326j;
            j = bhqi.f119320d;
            i = 1;
            bhub = bhub2;
        } else {
            bhwz bhwz = this.f119452g;
            if (bhwz != null) {
                if (bhwz.f119765a != bpol.AT_PLACE) {
                    i2 = 2;
                }
                bhwz bhwz2 = this.f119452g;
                bhub = bhwz2.f119767c;
                i = i2;
                j = m101449a(bhwz2.f119766b);
            } else {
                i = 0;
                j = elapsedRealtime;
                bhub = null;
            }
        }
        return new bhqz(i, bhqi, f119445q, bhub, j, bhqi.f119321e, bhqi.f119322f, bhqi.f119323g);
    }

    /* renamed from: a */
    public final bhqz mo64219a(String str) {
        return mo64218a(new bhqi(bhqi.f119317a, m101449a(this.f119452g.f119766b), str, 0, false, false, 1, 0, null));
    }

    /* renamed from: a */
    public final void mo64175a() {
        if (this.f119449d) {
            this.f119447b.mo64317a(2, 3, m101448a(this.f119454i));
            this.f119449d = false;
            this.f119452g = null;
            this.f119456k.mo64355a();
            bhsk bhsk = this.f119461p;
            bhsk.f119463a = null;
            bhso bhso = bhsk.f119464b;
            bhso.f119485j = null;
            bhtl bhtl = (bhtl) bhso.f119477b;
            bhtl.f119556g.execute(new bhtd(bhtl));
            this.f119461p = null;
            this.f119450e.mo64195b();
            this.f119450e = null;
            for (bhro bhro : this.f119448c.values()) {
                bhro.mo64195b();
            }
            bhty bhty = this.f119455j;
            long currentTimeMillis = System.currentTimeMillis();
            if (bhty.f119599n.size() == 10) {
                bhty.f119599n.remove();
            }
            bhty.f119599n.add(String.format(Locale.US, "Centralized place inference engine was stopped at: %d", Long.valueOf(currentTimeMillis)));
            this.f119448c.clear();
            this.f119453h = null;
            this.f119446a.mo64188a().mo64145b();
            this.f119454i = -1;
            return;
        }
        bhuj.m101555a();
    }

    /* renamed from: a */
    public final void mo64220a(bhqz bhqz) {
        bhqx bhqx = this.f119451f;
        if (bhqx == null) {
            bhuj.m101555a().mo64360b("No callback set for SemanticLocationInferenceEngine");
        } else if (bhqz == null) {
            bhuj.m101555a().mo64360b("SemanticLocationInternal is null, not sending to the callback");
        } else {
            bhqx.mo64174a(bhqz);
        }
    }
}
