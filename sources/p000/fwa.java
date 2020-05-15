package p000;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: fwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fwa implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ fwd f17402a;

    public fwa(fwd fwd) {
        this.f17402a = fwd;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        fwd fwd = this.f17402a;
        fyg fyg = new fyg(fwd.f17411e, fwd.f17414h, "80", "com.google.android.gms");
        fyg.mo11509a(this.f17402a.f17426t);
        return fyg;
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        aonl aonl;
        rtp rtp = (rtp) obj;
        if (rtp != null) {
            this.f17402a.f17422p.clear();
            int a = rtp.mo24660a();
            for (int i = 0; i < a; i++) {
                this.f17402a.f17422p.add(new fwc(fzm.m12787a((amfa) rtp.mo24661a(i), this.f17402a.f17415i), null, 3));
            }
            fwd fwd = this.f17402a;
            fvx fvx = new fvx(fwd, fwd.f17422p);
            fwd fwd2 = this.f17402a;
            aonl[] aonlArr = new aonl[4];
            aonlArr[0] = fwd2.f17431y;
            aonlArr[1] = fwd2.f17430x;
            aonlArr[2] = fvx;
            if (!fwd2.f17424r.mo11511a()) {
                aonl = this.f17402a.f17429w;
            } else {
                aonl = this.f17402a.f17428v;
            }
            aonlArr[3] = aonl;
            fwd2.mo43104a(new aonk(aonlArr));
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
