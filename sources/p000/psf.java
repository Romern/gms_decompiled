package p000;

import com.google.android.gms.cast.MediaQueueItem;
import java.util.Iterator;

/* renamed from: psf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class psf implements ptz {

    /* renamed from: a */
    final /* synthetic */ psx f40142a;

    public psf(psx psx) {
        this.f40142a = psx;
    }

    /* renamed from: a */
    public final void mo23599a() {
        psx psx = this.f40142a;
        Iterator it = psx.f40170i.values().iterator();
        if (it.hasNext()) {
            psw psw = (psw) it.next();
            if (psx.mo23620c()) {
                throw null;
            } else if (!psx.mo23620c()) {
                throw null;
            } else {
                throw null;
            }
        } else {
            for (psq psq : this.f40142a.f40168g) {
                psq.mo23610a();
            }
            for (psl psl : this.f40142a.f40169h) {
                psl.mo23277a();
            }
        }
    }

    /* renamed from: b */
    public final void mo23603b() {
        for (psq psq : this.f40142a.f40168g) {
            psq.mo23611b();
        }
        for (psl psl : this.f40142a.f40169h) {
        }
    }

    /* renamed from: c */
    public final void mo23605c() {
        for (psq psq : this.f40142a.f40168g) {
            psq.mo23612c();
        }
        for (psl psl : this.f40142a.f40169h) {
        }
    }

    /* renamed from: d */
    public final void mo23607d() {
        for (psq psq : this.f40142a.f40168g) {
            psq.mo23613d();
        }
        for (psl psl : this.f40142a.f40169h) {
        }
    }

    /* renamed from: e */
    public final void mo23608e() {
        for (psq psq : this.f40142a.f40168g) {
            psq.mo23615f();
        }
        for (psl psl : this.f40142a.f40169h) {
        }
    }

    /* renamed from: f */
    public final void mo23609f() {
        for (psl psl : this.f40142a.f40169h) {
        }
    }

    /* renamed from: b */
    public final void mo23604b(int[] iArr) {
        for (psl psl : this.f40142a.f40169h) {
            psl.mo23587b(iArr);
        }
    }

    /* renamed from: c */
    public final void mo23606c(int[] iArr) {
        for (psl psl : this.f40142a.f40169h) {
            psl.mo23588c(iArr);
        }
    }

    /* renamed from: a */
    public final void mo23600a(int[] iArr) {
        for (psl psl : this.f40142a.f40169h) {
            psl.mo23584a(iArr);
        }
    }

    /* renamed from: a */
    public final void mo23601a(int[] iArr, int i) {
        for (psl psl : this.f40142a.f40169h) {
            psl.mo23585a(iArr, i);
        }
    }

    /* renamed from: a */
    public final void mo23602a(MediaQueueItem[] mediaQueueItemArr) {
        for (psl psl : this.f40142a.f40169h) {
            psl.mo23586a(mediaQueueItemArr);
        }
    }
}
