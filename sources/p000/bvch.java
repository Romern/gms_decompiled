package p000;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: bvch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvch {

    /* renamed from: a */
    public static final bvcc f155588a = bvbx.f155571a;

    /* renamed from: b */
    public final Handler f155589b;

    /* renamed from: c */
    public final HashMap f155590c;

    /* renamed from: d */
    public final bnmu f155591d;

    /* renamed from: e */
    public final ArrayList f155592e;

    /* renamed from: f */
    public final HashSet f155593f;

    /* renamed from: g */
    public final Runnable f155594g = new bvby(this);

    public bvch(Handler handler) {
        this.f155589b = handler;
        this.f155590c = new HashMap();
        this.f155592e = new ArrayList();
        this.f155593f = new HashSet();
        this.f155591d = bnge.m109299s();
    }

    /* renamed from: a */
    public final bvbz mo73309a(bvcd bvcd) {
        bvcg bvcg = (bvcg) this.f155590c.get(bvcd);
        if (bvcg != null) {
            return bvcg.f155580b;
        }
        return null;
    }

    /* renamed from: b */
    public final void mo73312b(bvcd bvcd) {
        synchronized (this.f155590c) {
            bvcg bvcg = (bvcg) this.f155590c.remove(bvcd);
            this.f155592e.remove(bvcg);
            this.f155589b.removeCallbacks(bvcg);
            for (Runnable runnable : ((bndq) this.f155591d).mo67272e(bvcg)) {
                this.f155589b.removeCallbacks(runnable);
            }
            if (bvcg != null) {
                bvcg.f155581c = true;
                bvcg.run();
            }
        }
    }

    /* renamed from: a */
    public final void mo73310a(bvcd bvcd, bvbz bvbz, bvcd... bvcdArr) {
        synchronized (this.f155590c) {
            mo73312b(bvcd);
            bvcg bvcg = new bvcg(this, bvcd, bvbz, bvcdArr);
            this.f155590c.put(bvcd, bvcg);
            mo73311a(bvcg, 0);
        }
    }

    /* renamed from: a */
    public final void mo73311a(bvcg bvcg, long j) {
        bvca bvca = new bvca(this, bvcg);
        this.f155591d.mo67268a(bvcg, bvca);
        this.f155589b.postDelayed(bvca, j);
    }
}
