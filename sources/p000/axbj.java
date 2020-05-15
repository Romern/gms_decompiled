package p000;

import android.content.Context;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;

/* renamed from: axbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axbj extends axbs {
    public axbj(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static axbj m82161a(Context context, bmgd bmgd) {
        axbj axbj = new axbj(context);
        axbj.mo52983a(bmgd);
        axbj.mo65945a(bmgd.f129216b);
        return axbj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final bmno mo52984c() {
        bmno bmno = ((bmgd) this.f124136q).f129218d;
        return bmno == null ? bmno.f130138m : bmno;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo52985d() {
        bmgd bmgd = (bmgd) this.f124136q;
        if ((bmgd.f129215a & 4) == 0) {
            return false;
        }
        bmno bmno = bmgd.f129218d;
        if (bmno == null) {
            bmno = bmno.f130138m;
        }
        if (!bmno.f130142c.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo52983a(bmgd bmgd) {
        super.mo52996a((bxxc) bmgd);
        setId(bqcr.m112590a(((bmgd) this.f124136q).f129216b));
        this.f95726d.setText(bmgd.f129217c);
    }

    /* renamed from: a */
    public final void mo52924a(boolean z, boolean z2) {
        int i;
        super.mo52924a(z, z2);
        if (!this.f95730h && !mo52985d()) {
            ImageWithCaptionView imageWithCaptionView = this.f95725c;
            if (!z) {
                i = 0;
            } else {
                i = 8;
            }
            imageWithCaptionView.setVisibility(i);
        }
    }
}
