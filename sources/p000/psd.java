package p000;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimerTask;

/* renamed from: psd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class psd {

    /* renamed from: a */
    public final ptx f40128a = new ptx("MediaQueue");

    /* renamed from: b */
    long f40129b;

    /* renamed from: c */
    public final psx f40130c;

    /* renamed from: d */
    List f40131d;

    /* renamed from: e */
    final SparseIntArray f40132e;

    /* renamed from: f */
    final LruCache f40133f;

    /* renamed from: g */
    final List f40134g;

    /* renamed from: h */
    final Deque f40135h;

    /* renamed from: i */
    public rke f40136i;

    /* renamed from: j */
    public rke f40137j;

    /* renamed from: k */
    public final Set f40138k = new HashSet();

    /* renamed from: l */
    private final Handler f40139l;

    /* renamed from: m */
    private final TimerTask f40140m;

    /* renamed from: j */
    private final void m31109j() {
        this.f40139l.removeCallbacks(this.f40140m);
    }

    /* renamed from: k */
    private final void m31110k() {
        rke rke = this.f40137j;
        if (rke != null) {
            rke.mo9460b();
            this.f40137j = null;
        }
    }

    /* renamed from: l */
    private final void m31111l() {
        rke rke = this.f40136i;
        if (rke != null) {
            rke.mo9460b();
            this.f40136i = null;
        }
    }

    /* renamed from: a */
    public final void mo23589a() {
        mo23594f();
        this.f40131d.clear();
        this.f40132e.clear();
        this.f40133f.evictAll();
        this.f40134g.clear();
        m31109j();
        this.f40135h.clear();
        m31110k();
        m31111l();
        mo23596h();
        mo23595g();
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* renamed from: b */
    public final void mo23590b() {
        psg psg;
        sdo.m34967a("Must be called from the main thread.");
        if (this.f40129b != 0 && this.f40137j == null) {
            m31110k();
            m31111l();
            psx psx = this.f40130c;
            sdo.m34967a("Must be called from the main thread.");
            if (!psx.mo23622e()) {
                psg = psx.mo23623f();
            } else {
                psg psg2 = new psg(psx);
                psx.mo23618a(psg2);
                psg = psg2;
            }
            this.f40137j = psg;
            psg.mo9458a(new prx(this));
        }
    }

    /* renamed from: c */
    public final void mo23591c() {
        m31109j();
        this.f40139l.postDelayed(this.f40140m, 500);
    }

    /* renamed from: d */
    public final long mo23592d() {
        int i;
        MediaStatus b = this.f40130c.mo23619b();
        if (b == null) {
            return 0;
        }
        MediaInfo mediaInfo = b.f29809a;
        if (mediaInfo != null) {
            i = mediaInfo.f29747b;
        } else {
            i = -1;
        }
        if (!MediaStatus.m22287a(b.f29813e, b.f29814f, b.f29820l, i)) {
            return b.f29810b;
        }
        return 0;
    }

    /* renamed from: e */
    public final void mo23593e() {
        this.f40132e.clear();
        for (int i = 0; i < this.f40131d.size(); i++) {
            this.f40132e.put(((Integer) this.f40131d.get(i)).intValue(), i);
        }
    }

    /* renamed from: f */
    public final void mo23594f() {
        Iterator it = this.f40138k.iterator();
        if (it.hasNext()) {
            psb psb = (psb) it.next();
            throw null;
        }
    }

    /* renamed from: g */
    public final void mo23595g() {
        Iterator it = this.f40138k.iterator();
        if (it.hasNext()) {
            psb psb = (psb) it.next();
            throw null;
        }
    }

    /* renamed from: h */
    public final void mo23596h() {
        Iterator it = this.f40138k.iterator();
        if (it.hasNext()) {
            psb psb = (psb) it.next();
            throw null;
        }
    }

    /* renamed from: i */
    public final void mo23597i() {
        Iterator it = this.f40138k.iterator();
        if (it.hasNext()) {
            psb psb = (psb) it.next();
            throw null;
        }
    }

    public psd(psx psx) {
        this.f40130c = psx;
        Math.max(20, 1);
        this.f40131d = new ArrayList();
        this.f40132e = new SparseIntArray();
        this.f40134g = new ArrayList();
        this.f40135h = new ArrayDeque(20);
        this.f40139l = new adzt(Looper.getMainLooper());
        this.f40140m = new prz(this);
        psx.mo23617a(new psc(this));
        this.f40133f = new psa(this);
        this.f40129b = mo23592d();
        mo23590b();
    }
}
