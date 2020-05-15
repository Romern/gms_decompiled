package p000;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.service.autofill.FillResponse;
import android.widget.FrameLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.autofill.fill.FillForm;

/* renamed from: lno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lno extends lim {

    /* renamed from: d */
    public static final srn f26456d = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: e */
    public final lic f26457e;

    /* renamed from: f */
    private final FillForm f26458f;

    /* renamed from: g */
    private final bmxv f26459g;

    /* renamed from: h */
    private final bmxv f26460h;

    /* renamed from: i */
    private final adzt f26461i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lno(lir lir, Bundle bundle, bngx bngx) {
        super(lir, bundle, bngx);
        adzt adzt;
        bmxv bmxv;
        bmxv bmxv2;
        lic lic = new lic(lir);
        if (ssw.m36269a()) {
            adzt = new adzt(lir.getMainLooper());
        } else {
            adzt = null;
        }
        this.f26159a.setTheme(C0126R.style.AutofillTransparentActivityTheme);
        FillForm fillForm = (FillForm) lqx.m19548a((Bundle) bundle.getParcelable("com.google.android.gms.autofill.extra.AUTOFILL_ID_FILL"));
        if (fillForm != null) {
            this.f26458f = fillForm;
            this.f26457e = lic;
            if (!cciw.f179109a.mo6606a().mo76082o()) {
                this.f26459g = bmxv.m108567c(bundle.getString("com.google.android.gms.autofill.extra.METRICS_CONTEXT"));
            } else {
                int i = bundle.getInt("com.google.android.gms.autofill.extra.METRICS_CONTEXT", -1);
                if (i != -1) {
                    StringBuilder sb = new StringBuilder(11);
                    sb.append(i);
                    bmxv2 = bmxv.m108566b(sb.toString());
                } else {
                    bmxv2 = bmvz.f131120a;
                }
                this.f26459g = bmxv2;
            }
            if (ssw.m36269a()) {
                bmxv = bmxv.m108567c(lqx.m19548a((Bundle) bundle.getParcelable("com.google.android.gms.autofill.extra.INLINE_PRESENTATION_SPEC")));
            } else {
                bmxv = bmvz.f131120a;
            }
            this.f26460h = bmxv;
            this.f26461i = adzt;
            return;
        }
        throw new lik("FillForm must be present in provided state bundle.");
    }

    /* renamed from: i */
    private final void m19444i() {
        mo15294a("");
    }

    /* renamed from: a */
    public final void mo15164a() {
        if (!this.f26160b.getBoolean("started", false)) {
            this.f26160b.putBoolean("started", true);
            bqga.m112781a(liw.m19221a(this.f26159a).mo15186a((lis) new lnm(this)), new lnn(this), bqfb.INSTANCE);
        }
        this.f26159a.setFinishOnTouchOutside(false);
        this.f26159a.getWindow().setType(2038);
        if (this.f26460h.mo66813a()) {
            this.f26159a.getContainerActivity().getWindow().setSoftInputMode(21);
            this.f26159a.getWindow().setBackgroundDrawable(new ColorDrawable(this.f26159a.getColor(C0126R.color.google_scrim)));
            FrameLayout frameLayout = new FrameLayout(this.f26159a);
            this.f26159a.setContentView(frameLayout);
            adzt adzt = this.f26461i;
            if (adzt != null) {
                adzt.postDelayed(new lnj(this, frameLayout), 1000);
                return;
            }
            return;
        }
        this.f26159a.getContainerActivity().getWindow().addFlags(262192);
    }

    /* renamed from: d */
    public final void mo15173d() {
        this.f26159a.overridePendingTransition(0, 0);
    }

    /* renamed from: f */
    public final void mo15175f() {
        mo15295h();
        this.f26457e.mo15157a();
    }

    /* renamed from: h */
    public final void mo15295h() {
        mo15165a(0);
    }

    /* renamed from: a */
    public final void mo15166a(int i, int i2, Intent intent) {
        if (i != 10000) {
            return;
        }
        if (i2 == -1) {
            kbz a = lrf.m19575a(this.f26159a, this.f26458f, this.f26459g.mo66810a(lnk.f26452a), this.f26460h);
            if (a != null) {
                mo15167a(-1, new Intent().putExtra("android.view.autofill.extra.AUTHENTICATION_RESULT", a.f23732a));
            } else {
                m19444i();
            }
        } else {
            m19444i();
        }
    }

    /* renamed from: a */
    public final void mo15294a(String str) {
        kbz kbz;
        kre a = krc.m18382a(this.f26159a);
        bmxv c = a.mo14828c();
        if (c.mo66813a() && str != null) {
            bxvd da = kdk.f23890c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            kdk kdk = (kdk) da.f164949b;
            str.getClass();
            kdk.f23892a |= 1;
            kdk.f23893b = str;
            kdk kdk2 = (kdk) da.mo74062i();
            kqv n = a.mo14839n();
            if (this.f26459g.mo66813a()) {
                kbz = n.mo14819a((String) this.f26459g.mo66814b(), ((keg) c.mo66814b()).mo14409a(kdk2, this.f26458f), this.f26460h);
            } else {
                kbz = n.mo14817a(((keg) c.mo66814b()).mo14409a(kdk2, this.f26458f));
            }
            if (kbz != null) {
                kca kca = new kca();
                kca.mo14361a(kbz.f23732a);
                FillResponse a2 = kca.mo14359a();
                if (a2 != null) {
                    mo15167a(-1, new Intent().putExtra("android.view.autofill.extra.AUTHENTICATION_RESULT", a2));
                } else {
                    mo15295h();
                }
            } else {
                mo15295h();
            }
        } else {
            mo15295h();
        }
    }
}
