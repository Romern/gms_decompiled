package p000;

import android.content.ComponentName;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.display.CarRegionId;

/* renamed from: nqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nqo extends nij {

    /* renamed from: v */
    public final oos f36421v = this.f35723t.mo21650a(1, new nqn(this));

    /* renamed from: w */
    public nud f36422w;

    /* renamed from: x */
    private nwv f36423x;

    /* renamed from: y */
    private boolean f36424y;

    static {
        odk.m28481a("CAR.CAM.FALLBACK");
    }

    public nqo(nip nip, niv niv, oqa oqa, CarRegionId carRegionId) {
        super(nip, niv, new ComponentName(nip.mo20797a(), nqo.class), oqa, carRegionId);
        ccux.m131754c();
    }

    /* renamed from: a */
    public final void mo20766a(Configuration configuration, int i) {
    }

    /* renamed from: a */
    public final void mo20770a(String str) {
    }

    /* renamed from: b */
    public final int mo20773b() {
        return 1;
    }

    /* renamed from: b */
    public final void mo20774b(nil nil) {
    }

    /* renamed from: c */
    public final oos mo20776c() {
        return this.f36421v;
    }

    /* renamed from: c */
    public final void mo20777c(int i) {
    }

    /* renamed from: d */
    public final boolean mo20778d() {
        return false;
    }

    /* renamed from: e */
    public final void mo20779e() {
    }

    /* renamed from: f */
    public final void mo20780f() {
        super.mo20780f();
        mo21469s();
    }

    /* renamed from: g */
    public final void mo20781g() {
        super.mo20781g();
        mo21469s();
        this.f36424y = false;
    }

    /* renamed from: h */
    public final void mo20782h() {
    }

    /* renamed from: i */
    public final void mo20783i() {
    }

    /* renamed from: j */
    public final void mo20784j() {
        this.f35723t.mo21675b(this.f36421v);
    }

    /* renamed from: k */
    public final boolean mo20785k() {
        return this.f36424y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo20786l() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final String mo20787m() {
        return "";
    }

    /* renamed from: r */
    public final void mo21468r() {
        this.f35723t.mo21681d(this.f36421v);
        DisplayManager displayManager = (DisplayManager) this.f35705b.mo20797a().getSystemService("display");
        DrawingSpec w = this.f36421v.mo22458w();
        this.f36423x = new nwv(displayManager, this.f35705b.mo20797a().getPackageName(), w.f29402a, w.f29403b, w.f29404c, w.f29405d, new nqk(this));
        nud nud = new nud(this.f35705b.mo20797a(), this.f36423x.f36842a.getDisplay());
        this.f36422w = nud;
        nud.setContentView((int) C0126R.C0128layout.car_fallback_layout);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.f36422w.getDisplay().getMetrics(displayMetrics);
        Drawable a = C1583oob.m29298a(this.f35705b.mo20797a(), "ic_error", displayMetrics);
        if (a != null) {
            ((ImageView) this.f36422w.findViewById(C0126R.C0129id.fallback_image)).setImageDrawable(a);
        }
        this.f36422w.show();
    }

    /* renamed from: s */
    public final void mo21469s() {
        nud nud = this.f36422w;
        if (nud != null) {
            nud.dismiss();
            this.f36422w = null;
        }
        nwv nwv = this.f36423x;
        if (nwv != null) {
            nwv.mo21768a();
            this.f36423x = null;
        }
    }

    /* renamed from: x */
    public final ComponentName mo20792x() {
        return null;
    }

    /* renamed from: a */
    public final void mo20771a(nij nij) {
        super.mo20771a(nij);
        this.f36424y = true;
        this.f35723t.mo21687f(this.f36421v);
        this.f35705b.mo20830e(this);
        if (nij != null) {
            this.f35705b.mo20809a(this, (nik) null);
        }
    }

    /* renamed from: a */
    public final void mo20772a(nil nil) {
        super.mo20772a(nil);
        if (this.f36421v.mo22458w() != null && this.f36422w == null) {
            mo21468r();
        } else if (this.f36421v.mo22405A()) {
            this.f35723t.mo21675b(this.f36421v);
        }
        this.f35705b.mo20808a(this);
        this.f35705b.mo20825c(this);
    }
}
