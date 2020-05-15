package com.google.android.gms.auth.login;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.android.setupwizard.navigationbar.SetupWizardNavBar;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LoginActivityChimeraTask extends jem implements View.OnClickListener, blv {

    /* renamed from: n */
    public static final /* synthetic */ int f10997n = 0;

    /* renamed from: o */
    private static final String f10998o;

    /* renamed from: p */
    private static final String f10999p;

    /* renamed from: q */
    private static final String f11000q = String.valueOf(f10998o).concat(".token_request");

    /* renamed from: r */
    private static final String f11001r = String.valueOf(f10998o).concat(".backup");

    /* renamed from: s */
    private static final String f11002s = String.valueOf(f10998o).concat(".title");

    /* renamed from: t */
    private static final String f11003t = String.valueOf(f10998o).concat(" .browser_request");

    /* renamed from: u */
    private static final String f11004u = String.valueOf(f10998o).concat(".confirming_credentials");

    /* renamed from: v */
    private static final String f11005v = String.valueOf(f10998o).concat(".allow_credit_card");

    /* renamed from: A */
    private boolean f11006A;

    /* renamed from: B */
    private String f11007B;

    /* renamed from: C */
    private jfh f11008C;

    /* renamed from: D */
    private bjbx f11009D;

    /* renamed from: E */
    private View f11010E;

    /* renamed from: a */
    public TokenRequest f11011a;

    /* renamed from: m */
    public boolean f11012m;

    /* renamed from: w */
    private String f11013w;

    /* renamed from: x */
    private String f11014x;

    /* renamed from: y */
    private boolean f11015y;

    /* renamed from: z */
    private boolean f11016z;

    static {
        String concat = String.valueOf(LoginActivityChimeraTask.class.getName()).concat(".");
        f10998o = concat;
        f10999p = String.valueOf(concat).concat("auth_code");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    public static Intent m6667a(Context context, TokenRequest tokenRequest, String str, String str2, boolean z, boolean z2, String str3, boolean z3) {
        return new Intent().setClassName(context, "com.google.android.gms.auth.login.LoginActivityTask").putExtra(f11000q, tokenRequest).putExtra("password", str).putExtra(f10999p, str2).putExtra(f11001r, false).putExtra(f11003t, z).putExtra(f11004u, z2).putExtra(f11005v, z3).putExtra(f11002s, str3);
    }

    /* renamed from: j */
    private final void m6669j() {
        this.f11010E = this.f11009D.mo64985a();
    }

    /* renamed from: b */
    public final void mo3253b() {
    }

    /* renamed from: c */
    public final void mo7729c() {
        jer jer = new jer(this, getApplicationContext(), this.f11011a, this.f11014x, this.f11013w, this.f11015y, this.f11016z, this.f11006A);
        this.f11008C = jer;
        jer.execute(new Object[0]);
    }

    /* renamed from: i */
    public final void mo7735i() {
        if (!this.f11008C.cancel(false)) {
            Log.w("GLSActivity", "LoginActivityTask.BackgroudTask failed to cancel.");
        }
        Intent intent = new Intent();
        intent.putExtra("errorCode", 4);
        setResult(0, intent);
        finish();
    }

    public void onClick(View view) {
        mo7735i();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bjbx bjbx = this.f11009D;
        if (bjbx != null) {
            bjbx.removeView(this.f11010E);
            m6669j();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            m6668a(getIntent().getExtras());
        } else {
            m6668a(bundle);
        }
        if (mo13658e() == null) {
            int i = Build.VERSION.SDK_INT;
            bjbx bjbx = new bjbx(this);
            this.f11009D = bjbx;
            setContentView(bjbx);
            mo7729c();
        }
        int i2 = Build.VERSION.SDK_INT;
        m6669j();
    }

    public final void onPause() {
        super.onPause();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(f11000q, this.f11011a);
        bundle.putString("password", this.f11014x);
        bundle.putString(f10999p, this.f11013w);
        bundle.putBoolean(f11001r, this.f11015y);
        bundle.putBoolean(f11003t, this.f11016z);
        bundle.putBoolean(f11004u, this.f11006A);
        bundle.putString(f11002s, this.f11007B);
        bundle.putBoolean(f11005v, this.f11012m);
    }

    /* renamed from: a */
    private final void m6668a(Bundle bundle) {
        this.f11011a = (TokenRequest) bundle.getParcelable(f11000q);
        this.f11014x = bundle.getString("password");
        this.f11013w = bundle.getString(f10999p);
        this.f11015y = bundle.getBoolean(f11001r, false);
        this.f11007B = bundle.getString(f11002s);
        this.f11016z = bundle.getBoolean(f11003t, false);
        this.f11006A = bundle.getBoolean(f11004u, false);
        this.f11012m = bundle.getBoolean(f11005v, false);
    }

    /* renamed from: a */
    public final void mo3251a() {
        mo7735i();
    }

    /* renamed from: a */
    public final void mo3252a(SetupWizardNavBar setupWizardNavBar) {
        boolean z = this.f22282e;
        setupWizardNavBar.mo4069a(z, z);
        setupWizardNavBar.f7193b.setVisibility(4);
        setupWizardNavBar.f7192a.setEnabled(false);
    }
}
