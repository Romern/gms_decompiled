package p000;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: psx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class psx implements pem {

    /* renamed from: j */
    public static final String f40161j = puc.f40227a;

    /* renamed from: a */
    public final Object f40162a;

    /* renamed from: b */
    public final Handler f40163b;

    /* renamed from: c */
    public final puc f40164c;

    /* renamed from: d */
    public final psn f40165d;

    /* renamed from: e */
    public final psd f40166e;

    /* renamed from: f */
    public prs f40167f;

    /* renamed from: g */
    public final List f40168g = new CopyOnWriteArrayList();

    /* renamed from: h */
    final List f40169h = new CopyOnWriteArrayList();

    /* renamed from: i */
    public final Map f40170i;

    public psx(puc puc) {
        new ConcurrentHashMap();
        this.f40170i = new ConcurrentHashMap();
        this.f40162a = new Object();
        this.f40163b = new adzt(Looper.getMainLooper());
        this.f40165d = new psn(this);
        sdo.m34959a(puc);
        this.f40164c = puc;
        puc.f40233e = new psf(this);
        this.f40164c.mo23631a(this.f40165d);
        this.f40166e = new psd(this);
    }

    /* renamed from: a */
    public final void mo23616a() {
        prs prs = this.f40167f;
        if (prs != null) {
            try {
                String d = mo23621d();
                pep pep = ((prt) prs).f40120a;
                if (pep != null) {
                    ptk.m31232a(d);
                    synchronized (((pfv) pep).f39069s) {
                        ((pfv) pep).f39069s.put(d, this);
                    }
                    roz b = rpa.m34196b();
                    b.f43472a = new pfd((pfv) pep, d);
                    ((rjx) pep).mo24732b(b.mo24977a());
                }
            } catch (IOException e) {
            }
            mo23624g();
        }
    }

    /* renamed from: b */
    public final MediaStatus mo23619b() {
        MediaStatus mediaStatus;
        synchronized (this.f40162a) {
            sdo.m34967a("Must be called from the main thread.");
            mediaStatus = this.f40164c.f40231c;
        }
        return mediaStatus;
    }

    /* renamed from: c */
    public final boolean mo23620c() {
        MediaInfo e;
        int i;
        sdo.m34967a("Must be called from the main thread.");
        sdo.m34967a("Must be called from the main thread.");
        MediaStatus b = mo23619b();
        if (b != null && b.f29813e == 4) {
            return true;
        }
        sdo.m34967a("Must be called from the main thread.");
        MediaStatus b2 = mo23619b();
        if (b2 != null && b2.f29813e == 5) {
            return true;
        }
        sdo.m34967a("Must be called from the main thread.");
        MediaStatus b3 = mo23619b();
        if (b3 != null && b3.f29813e == 2) {
            return true;
        }
        sdo.m34967a("Must be called from the main thread.");
        MediaStatus b4 = mo23619b();
        if (b4 != null) {
            if (b4.f29813e == 3) {
                return true;
            }
            sdo.m34967a("Must be called from the main thread.");
            synchronized (this.f40162a) {
                sdo.m34967a("Must be called from the main thread.");
                e = this.f40164c.mo23685e();
            }
            if (e != null && e.f29747b == 2) {
                synchronized (this.f40162a) {
                    sdo.m34967a("Must be called from the main thread.");
                    MediaStatus b5 = mo23619b();
                    i = b5 != null ? b5.f29814f : 0;
                }
                if (i == 2) {
                    return true;
                }
            }
        }
        sdo.m34967a("Must be called from the main thread.");
        MediaStatus b6 = mo23619b();
        if (b6 == null || b6.f29820l == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final String mo23621d() {
        sdo.m34967a("Must be called from the main thread.");
        return this.f40164c.f40174t;
    }

    /* renamed from: e */
    public final boolean mo23622e() {
        return this.f40167f != null;
    }

    /* renamed from: g */
    public final void mo23624g() {
        sdo.m34967a("Must be called from the main thread.");
        if (!mo23622e()) {
            mo23623f();
        } else {
            mo23618a(new pse(this));
        }
    }

    /* renamed from: f */
    public final rke mo23623f() {
        psp psp = new psp();
        psp.mo17716a(psp.m31154a(new Status(17, null)));
        return psp;
    }

    /* renamed from: a */
    public final void mo22975a(String str) {
        this.f40164c.mo23345b(str);
    }

    /* renamed from: a */
    public final void mo23617a(psl psl) {
        sdo.m34967a("Must be called from the main thread.");
        this.f40169h.add(psl);
    }

    /* renamed from: a */
    public final void mo23618a(pst pst) {
        try {
            if (!pst.f40158d) {
                for (psq psq : pst.f40159e.f40168g) {
                    psq.mo23614e();
                }
                for (psl psl : pst.f40159e.f40169h) {
                }
            }
            try {
                synchronized (pst.f40159e.f40162a) {
                    pst.mo23598d();
                }
            } catch (pua e) {
                pst.mo17716a(pst.m31165a(new Status(2100)));
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (Throwable th) {
            pst.mo17716a(pst.m31165a(new Status(2100)));
        }
    }
}
