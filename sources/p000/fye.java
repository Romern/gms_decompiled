package p000;

import android.content.Context;
import com.google.android.chimera.Loader;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.p015ui.context.section.LoaderSectionInfo;
import com.google.android.gms.common.ConnectionResult;
import java.util.List;

/* renamed from: fye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fye extends Loader implements rkl, rka {

    /* renamed from: a */
    private final String f17609a;

    /* renamed from: b */
    private final List f17610b;

    /* renamed from: c */
    private final String[] f17611c;

    /* renamed from: d */
    private fzl f17612d;

    /* renamed from: e */
    private final rkb f17613e;

    /* renamed from: f */
    private rke f17614f;

    public fye(Context context, String str, LoaderSectionInfo loaderSectionInfo) {
        super(context);
        this.f17609a = str;
        this.f17610b = loaderSectionInfo.f9799l;
        this.f17611c = loaderSectionInfo.f9789b;
        allp a = allq.m61232a();
        a.f73626a = 80;
        allq a2 = a.mo40491a();
        rjy rjy = new rjy(context.getApplicationContext());
        rjy.mo24778a(this.f17609a);
        rjy.mo24782a(this);
        rjy.mo24780a(allr.f73629a, a2);
        this.f17613e = rjy.mo24784b();
    }

    /* renamed from: a */
    private final void m12709a() {
        rke rke = this.f17614f;
        if (rke != null) {
            rke.mo9460b();
            this.f17614f = null;
        }
    }

    /* renamed from: b */
    private final void m12710b() {
        this.f17612d = null;
    }

    /* renamed from: c */
    private final void m12711c() {
        if (!this.f17613e.mo24805i() && !this.f17613e.mo24806j()) {
            this.f17613e.mo24801e();
        }
        rjo rjo = allr.f73629a;
        rke a = amcf.m62589a(this.f17613e, this.f17609a, (String) null, (alkz) null);
        this.f17614f = a;
        a.mo9458a(this);
    }

    /* access modifiers changed from: protected */
    public final void onForceLoad() {
        super.onForceLoad();
        m12709a();
        m12710b();
        m12711c();
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        super.onReset();
        onStopLoading();
        m12710b();
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        super.onStartLoading();
        if (!takeContentChanged()) {
            fzl fzl = this.f17612d;
            if (fzl != null) {
                deliverResult(fzl.f17738a);
            } else if (this.f17614f == null) {
                m12711c();
            }
        } else {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        m12709a();
        rkb rkb = this.f17613e;
        if (rkb != null) {
            rkb.mo24803g();
        }
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        this.f17613e.mo24804h();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        alla alla = (alla) rkk;
        this.f17614f = null;
        rkb rkb = this.f17613e;
        if (rkb != null) {
            rkb.mo24803g();
        }
        if (alla.mo7183bo().mo17710c()) {
            amfb b = alla.mo40472b();
            if (this.f17612d == null) {
                fzl fzl = new fzl();
                this.f17612d = fzl;
                List list = this.f17610b;
                if (list != null) {
                    fzl.mo11563a(list);
                }
            }
            for (int i = 0; i < b.mo24660a(); i++) {
                ContactPerson a = fzm.m12787a(b.mo24661a(i), this.f17611c);
                if (a != null) {
                    this.f17612d.mo11561a(a);
                }
            }
            b.mo12460c();
            fzl fzl2 = this.f17612d;
            getContext();
            fzl2.mo11562a();
        }
        if (isStarted()) {
            deliverResult(this.f17612d.f17738a);
        }
    }
}
