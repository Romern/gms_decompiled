package p000;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;

/* renamed from: lmr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lmr implements bqfp {

    /* renamed from: a */
    final /* synthetic */ lqm f26396a;

    /* renamed from: b */
    final /* synthetic */ lmt f26397b;

    /* renamed from: c */
    final /* synthetic */ lms f26398c;

    public lmr(lms lms, lqm lqm, lmt lmt) {
        this.f26398c = lms;
        this.f26396a = lqm;
        this.f26397b = lmt;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        bmxv bmxv = (bmxv) obj;
        if (bmxv.mo66813a()) {
            this.f26396a.f201a.setOnClickListener(new lmq(this, this.f26397b, bmxv));
            this.f26396a.f201a.setAlpha(1.0f);
            this.f26396a.f201a.setEnabled(true);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bnsl bnsl = (bnsl) lmu.f26404d.mo68388c();
        bnsl.mo68437a(th);
        bnsl.mo68448m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo15273a(lmt lmt, bmxv bmxv) {
        try {
            if (!lmt.f26403d) {
                this.f26398c.f26399a.f26159a.startActivity((Intent) bmxv.mo66814b());
            } else {
                this.f26398c.f26399a.f26159a.startActivityForResult((Intent) bmxv.mo66814b(), 0);
            }
        } catch (ActivityNotFoundException e) {
            bnsl bnsl = (bnsl) lmu.f26404d.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68448m();
            Toast.makeText(this.f26398c.f26399a.f26159a, (int) C0126R.string.common_something_went_wrong, 0).show();
        }
    }
}
