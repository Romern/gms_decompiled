package com.google.android.gms.auth.account.otp;

import android.app.KeyguardManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.GoogleHelp;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OtpChimeraActivity extends deu implements grz {

    /* renamed from: b */
    public suo f10017b;

    /* renamed from: c */
    public grs f10018c;

    /* renamed from: d */
    public String f10019d;

    /* renamed from: e */
    public boolean f10020e;

    /* renamed from: f */
    private View f10021f;

    /* renamed from: g */
    private View f10022g;

    /* renamed from: h */
    private View f10023h;

    /* renamed from: i */
    private View f10024i;

    /* renamed from: j */
    private TextView f10025j;

    /* renamed from: k */
    private TextView f10026k;

    /* renamed from: l */
    private TextView f10027l;

    /* renamed from: m */
    private boolean f10028m;

    /* renamed from: a */
    private final void m6305a(View view) {
        this.f10021f.setVisibility(8);
        this.f10022g.setVisibility(8);
        this.f10023h.setVisibility(8);
        this.f10024i.setVisibility(8);
        view.setVisibility(0);
    }

    /* renamed from: b */
    private static String m6306b(String str) {
        sdo.m34974b(str.length() == 10);
        String substring = str.substring(0, 4);
        String substring2 = str.substring(4, 7);
        String substring3 = str.substring(7);
        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 2 + String.valueOf(substring2).length() + String.valueOf(substring3).length());
        sb.append(substring);
        sb.append(" ");
        sb.append(substring2);
        sb.append(" ");
        sb.append(substring3);
        return sb.toString();
    }

    /* renamed from: h */
    private final void m6307h() {
        grt grt;
        this.f10028m = true;
        setTheme(C0126R.style.IdentityWhiteAppTheme);
        mo8628aW().mo15853b(true);
        if (gnv.m13541an()) {
            setContentView((int) C0126R.C0128layout.ten_digit_otp_dialog);
            this.f10026k = (TextView) findViewById(C0126R.C0129id.otp_code1);
            this.f10027l = (TextView) findViewById(C0126R.C0129id.otp_code2);
        } else {
            setContentView((int) C0126R.C0128layout.eight_digit_otp_dialog);
            this.f10025j = (TextView) findViewById(C0126R.C0129id.otp_code);
        }
        this.f10021f = findViewById(C0126R.C0129id.otp_wheel);
        this.f10022g = findViewById(C0126R.C0129id.otp_results);
        this.f10024i = findViewById(C0126R.C0129id.otp_error);
        this.f10023h = findViewById(C0126R.C0129id.otp_no_accounts_available);
        if (!gnv.m13541an()) {
            grt = gro.m13782a(this);
        } else {
            grt = new gry(new grm(this), new grx(this));
        }
        this.f10018c = new grs(this, grt);
        suo a = new sun(mo8628aW(), getTitle()).mo26111a();
        this.f10017b = a;
        a.f45184c = new grp(this);
        if (this.f10017b.getCount() != 0) {
            this.f10019d = this.f10017b.mo26114a();
            this.f10018c.mo12145a(this.f10017b.mo26114a(), this.f10020e);
            return;
        }
        m6305a(this.f10023h);
    }

    /* renamed from: e */
    public final void mo7382e() {
        m6305a(this.f10021f);
    }

    /* renamed from: g */
    public final void mo7383g() {
        m6305a(this.f10024i);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i, intent);
        if (i == 0 && i2 == -1) {
            this.f10020e = true;
            m6307h();
            return;
        }
        onBackPressed();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10020e = false;
        this.f10028m = false;
        KeyguardManager keyguardManager = (KeyguardManager) getSystemService("keyguard");
        int i = Build.VERSION.SDK_INT;
        boolean isDeviceSecure = keyguardManager.isDeviceSecure();
        if (gnv.m13541an() && isDeviceSecure) {
            int i2 = Build.VERSION.SDK_INT;
            startActivityForResult(keyguardManager.createConfirmDeviceCredentialIntent(null, null), 0);
            return;
        }
        m6307h();
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0126R.C0130menu.otp_dialog, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() != C0126R.C0129id.auth_otp_help_item) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            GoogleHelp a = GoogleHelp.m66336a("android_security");
            a.mo43195a(this);
            a.f78776s = sjx.m35499a(this);
            a.f78774q = Uri.parse((String) ((bmzm) rsv.f43618g).f131273a);
            new aarh(this).mo31646a(a.mo43194a());
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        if (this.f10028m) {
            onBackPressed();
        }
        super.onPause();
    }

    /* renamed from: a */
    public final void mo7380a(String str) {
        if (str.length() == 8) {
            String substring = str.substring(0, 4);
            String substring2 = str.substring(4);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 2 + String.valueOf(substring2).length());
            sb.append("‭");
            sb.append(substring);
            sb.append(" ");
            sb.append(substring2);
            str = sb.toString();
        }
        this.f10025j.setText(str);
        m6305a(this.f10022g);
    }

    /* renamed from: a */
    public final void mo7381a(String str, String str2) {
        if (str.length() == 10 && str2.length() == 10) {
            TextView textView = this.f10026k;
            String valueOf = String.valueOf(m6306b(str));
            textView.setText(valueOf.length() == 0 ? new String("‭") : "‭".concat(valueOf));
            TextView textView2 = this.f10027l;
            String valueOf2 = String.valueOf(m6306b(str2));
            textView2.setText(valueOf2.length() == 0 ? new String("‭") : "‭".concat(valueOf2));
            m6305a(this.f10022g);
            return;
        }
        mo7383g();
    }
}
