package com.google.android.gms.backup.settings.component;

import android.accounts.Account;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.setupdesign.GlifLayout;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetBackupAccountFlowChimeraActivity extends Activity implements muz {

    /* renamed from: a */
    public static final lvn f29080a = new lvn("SetBackupAccountFlow");

    /* renamed from: b */
    public bsqh f29081b;

    /* renamed from: c */
    public bsqi f29082c;

    /* renamed from: d */
    public Account f29083d;

    /* renamed from: e */
    private final bqgj f29084e = new soc(1, 9);

    /* renamed from: f */
    private GlifLayout f29085f;

    /* renamed from: g */
    private TextView f29086g;

    /* renamed from: h */
    private TextView f29087h;

    /* renamed from: i */
    private TextView f29088i;

    /* renamed from: j */
    private biyp f29089j;

    /* renamed from: k */
    private biyp f29090k;

    /* renamed from: l */
    private Button f29091l;

    /* renamed from: m */
    private lvp f29092m;

    /* renamed from: n */
    private List f29093n;

    /* renamed from: o */
    private bsqq f29094o;

    /* renamed from: p */
    private bxvd f29095p;

    /* renamed from: d */
    private final void m21928d() {
        List a = mau.m24777a(this);
        this.f29093n = a;
        if (!a.isEmpty()) {
            int i = Build.VERSION.SDK_INT;
            if (getIntent().getParcelableExtra("account") == null) {
                f29080a.mo25412b("No account extra. Getting first account.", new Object[0]);
                this.f29083d = (Account) this.f29093n.get(0);
                getIntent().putExtra("account", this.f29083d);
            } else {
                this.f29083d = (Account) getIntent().getParcelableExtra("account");
            }
            this.f29088i.setVisibility(0);
            this.f29088i.setText(this.f29083d.name);
            setTitle(myg.m25743b());
            this.f29085f.mo71365c(myg.m25743b());
            this.f29089j.mo64887a((CharSequence) getString(C0126R.string.common_ok));
            this.f29089j.f122336f = new muq(this);
            this.f29094o = myg.m25738a(this);
            myg.m25742a(this, this.f29095p);
            this.f29086g.setMovementMethod(LinkMovementMethod.getInstance());
            if (ccno.f179554a.mo6606a().mo76469a()) {
                this.f29086g.setGravity(17);
                this.f29086g.setText(myg.m25744b(this, this.f29094o, this.f29095p));
                this.f29087h.setVisibility(0);
                this.f29087h.setText(myg.m25739a(this, this.f29094o));
            } else {
                this.f29086g.setGravity(8388611);
                this.f29086g.setText(myg.m25740a(this, this.f29094o, this.f29095p));
                this.f29087h.setVisibility(8);
            }
            this.f29091l.setVisibility(0);
            this.f29091l.setText((int) C0126R.string.change_backup_account_button_label);
            this.f29091l.setOnClickListener(new mur(this));
            if (getIntent().getBooleanExtra("turnOff", false)) {
                this.f29090k.mo64885a(0);
                this.f29090k.f122336f = new mus(this);
                return;
            }
            this.f29090k.mo64885a(4);
            return;
        }
        f29080a.mo25409a("No accounts for backup on device, launching add account", new Object[0]);
        mo17245b();
        finishAndRemoveTask();
    }

    /* renamed from: e */
    private final void m21929e() {
        setTitle((int) C0126R.string.backup_turned_off_title);
        this.f29085f.mo71365c(C0126R.string.backup_turned_off_title);
        this.f29086g.setGravity(17);
        this.f29086g.setText((int) C0126R.string.backup_turned_off_description);
        this.f29087h.setVisibility(8);
        this.f29089j.mo64887a((CharSequence) getString(17039370));
        this.f29089j.f122336f = new muu(this);
        this.f29090k.mo64885a(4);
        this.f29088i.setVisibility(4);
        this.f29091l.setVisibility(4);
    }

    /* renamed from: b */
    public final void mo17245b() {
        Intent className = new Intent().setClassName(this, "com.google.android.gms.backup.SetBackupAccountActivity");
        className.putExtra("turnOff", getIntent().getBooleanExtra("turnOff", false));
        className.putExtra("showDone", getIntent().getBooleanExtra("showDone", false));
        startActivity(className);
    }

    /* renamed from: c */
    public final bsqo mo17246c() {
        bxvd da = bsqo.f146669e.mo74144da();
        bsqq bsqq = this.f29094o;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsqo bsqo = (bsqo) da.f164949b;
        bsqq.getClass();
        bsqo.f146673c = bsqq;
        bsqo.f146671a |= 2;
        bsqh bsqh = (bsqh) this.f29095p.mo74062i();
        bsqh.getClass();
        bsqo.f146674d = bsqh;
        bsqo.f146671a |= 4;
        bsqh bsqh2 = this.f29081b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsqo bsqo2 = (bsqo) da.f164949b;
        bsqh2.getClass();
        bsqo2.f146672b = bsqh2;
        bsqo2.f146671a |= 1;
        return (bsqo) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        f29080a.mo25409a("onCreate", new Object[0]);
        if (ccoa.f179599a.mo6606a().mo76511b()) {
            setTheme(C0126R.style.BackupGlifV3DayNight);
        } else if (ccno.f179554a.mo6606a().mo76473e()) {
            setTheme(2132018266);
        } else {
            setTheme(2132018263);
        }
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.set_backup_account_flow);
        this.f29085f = (GlifLayout) findViewById(C0126R.C0129id.set_backup_account_layout);
        this.f29086g = (TextView) findViewById(C0126R.C0129id.set_backup_account_description);
        this.f29087h = (TextView) findViewById(C0126R.C0129id.set_backup_account_description_body);
        this.f29088i = (TextView) findViewById(C0126R.C0129id.backup_account);
        this.f29091l = (Button) findViewById(C0126R.C0129id.change_backup_account);
        new lsp(this);
        this.f29092m = new lvp(this);
        this.f29094o = bsqq.f146675b;
        this.f29095p = bsqh.f146634g.mo74144da();
        this.f29081b = mva.m25652a();
        this.f29082c = myg.m25737a();
        biyn biyn = (biyn) this.f29085f.mo71342a(biyn.class);
        biyo biyo = new biyo(this);
        biyo.f122328c = 5;
        biyo.f122329d = 2132018229;
        biyn.mo52733a(biyo.mo64882a());
        biyo biyo2 = new biyo(this);
        biyo2.f122328c = 7;
        biyo2.f122329d = 2132018230;
        biyn.mo52735b(biyo2.mo64882a());
        this.f29089j = biyn.f122314f;
        this.f29090k = biyn.f122315g;
        if (ccop.f179637a.mo6606a().mo76549g()) {
            this.f29090k.mo64887a((CharSequence) getString(C0126R.string.turn_off_backup_button_label));
        }
        m21928d();
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        f29080a.mo25409a("onNewIntent", new Object[0]);
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        f29080a.mo25409a("onPause", new Object[0]);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        f29080a.mo25409a("onResume", new Object[0]);
        super.onResume();
        if (this.f29092m.mo19644b()) {
            m21928d();
        } else {
            m21929e();
        }
    }

    /* renamed from: a */
    public final void mo17243a() {
        if (ccmz.m130714b()) {
            bsqv bsqv = (bsqv) bsqw.f146695g.mo74144da();
            bxvd da = bsrf.f146744d.mo74144da();
            bsmz bsmz = bsmz.ANDROID_BACKUP_SETTING_CHANGE;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsrf bsrf = (bsrf) da.f164949b;
            bsrf.f146747b = bsmz.f146213dO;
            bsrf.f146746a |= 1;
            bxvd da2 = bsrg.f146749m.mo74144da();
            bxvd da3 = bsqi.f146642h.mo74144da();
            bxvd da4 = bssl.f146873c.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bssl bssl = (bssl) da4.f164949b;
            bssl.f146876b = 2;
            bssl.f146875a |= 1;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bsqi bsqi = (bsqi) da3.f164949b;
            bssl bssl2 = (bssl) da4.mo74062i();
            bssl2.getClass();
            bsqi.f146645b = bssl2;
            bsqi.f146644a |= 1;
            bsqi bsqi2 = (bsqi) da3.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsrg bsrg = (bsrg) da2.f164949b;
            bsqi2.getClass();
            bsrg.f146753c = bsqi2;
            bsrg.f146751a |= 1;
            bssg bssg = (bssg) bssh.f146859b.mo74144da();
            bssg.mo70710a(btuh.ANDROID_BACKUP_SETTING_TURNED_OFF);
            bssh bssh = (bssh) bssg.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsrg bsrg2 = (bsrg) da2.f164949b;
            bssh.getClass();
            bsrg2.f146762l = bssh;
            bsrg2.f146752b |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsrf bsrf2 = (bsrf) da.f164949b;
            bsrg bsrg3 = (bsrg) da2.mo74062i();
            bsrg3.getClass();
            bsrf2.f146748c = bsrg3;
            bsrf2.f146746a |= 2;
            if (bsqv.f164950c) {
                bsqv.mo74035c();
                bsqv.f164950c = false;
            }
            bsqw bsqw = (bsqw) bsqv.f164949b;
            bsrf bsrf3 = (bsrf) da.mo74062i();
            bsrf3.getClass();
            bsqw.f146701e = bsrf3;
            bsqw.f146697a |= 4;
            bxvd da5 = bssm.f146877d.mo74144da();
            bsmx bsmx = bsmx.ANDROID_BACKUP_SET_BACKUP_ACCOUNT_FLOW;
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bssm bssm = (bssm) da5.f164949b;
            bssm.f146880b = bsmx.f145962iC;
            bssm.f146879a |= 1;
            bxvd da6 = bssi.f146862i.mo74144da();
            bsqh bsqh = this.f29081b;
            bxvd bxvd = (bxvd) bsqh.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) bsqh);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bsqh bsqh2 = (bsqh) bxvd.f164949b;
            bsqh bsqh3 = bsqh.f146634g;
            bsqh2.f146636a |= 1;
            bsqh2.f146637b = true;
            this.f29081b = (bsqh) bxvd.mo74062i();
            bsqo c = mo17246c();
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            bssi bssi = (bssi) da6.f164949b;
            c.getClass();
            bssi.f146867d = c;
            bssi.f146864a |= 32;
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bssm bssm2 = (bssm) da5.f164949b;
            bssi bssi2 = (bssi) da6.mo74062i();
            bssi2.getClass();
            bssm2.f146881c = bssi2;
            bssm2.f146879a |= 8;
            if (bsqv.f164950c) {
                bsqv.mo74035c();
                bsqv.f164950c = false;
            }
            bsqw bsqw2 = (bsqw) bsqv.f164949b;
            bssm bssm3 = (bssm) da5.mo74062i();
            bssm3.getClass();
            bsqw2.f146702f = bssm3;
            bsqw2.f146697a |= 8;
            max.m24779a(this, bsqv, null).mo50371a(muw.f34787a);
        }
        this.f29092m.mo19642a(false);
        m21929e();
    }

    /* renamed from: a */
    public final void mo17244a(String str) {
        if (getIntent().getBooleanExtra("showDone", false)) {
            setTitle((int) C0126R.string.backup_account_added_title);
            this.f29085f.mo71365c(C0126R.string.backup_account_added_title);
            this.f29086g.setGravity(17);
            this.f29086g.setText(getString(C0126R.string.backup_account_added_description, new Object[]{str}));
            this.f29087h.setVisibility(8);
            this.f29089j.mo64887a((CharSequence) getString(C0126R.string.common_done));
            this.f29089j.f122336f = new mut(this);
            this.f29090k.mo64885a(4);
            this.f29088i.setVisibility(4);
            this.f29091l.setVisibility(4);
            return;
        }
        finishAndRemoveTask();
    }
}
