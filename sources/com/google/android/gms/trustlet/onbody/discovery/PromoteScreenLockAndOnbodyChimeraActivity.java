package com.google.android.gms.trustlet.onbody.discovery;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.setupdesign.GlifLayout;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PromoteScreenLockAndOnbodyChimeraActivity extends Activity implements auus {

    /* renamed from: a */
    public static final aunx f109232a = new aunx("TrustAgent", "OnbodyPromotionActivity");

    /* renamed from: c */
    public static final aumh f109233c = new auvi();

    /* renamed from: b */
    public auut f109234b;

    /* renamed from: d */
    private final auvj f109235d = new auvj(this);

    /* renamed from: e */
    private auvk f109236e;

    /* renamed from: f */
    private KeyguardManager f109237f;

    /* renamed from: g */
    private boolean f109238g;

    /* renamed from: h */
    private Button f109239h;

    /* renamed from: i */
    private Button f109240i;

    /* renamed from: j */
    private ViewGroup f109241j;

    /* renamed from: k */
    private TextView f109242k;

    /* renamed from: l */
    private ProgressBar f109243l;

    /* renamed from: m */
    private GlifLayout f109244m;

    /* renamed from: a */
    private final void m93522a(boolean z) {
        this.f109239h.setVisibility(0);
        this.f109239h.setText(getString(C0126R.string.trust_agent_button_got_it));
        this.f109239h.setOnClickListener(new auvf(this, z));
    }

    /* renamed from: b */
    public final void mo50945b() {
        if (aupi.m77556a(this.f109237f)) {
            f109232a.mo50711a("SL set, challenge SL", new Object[0]);
            Intent intent = new Intent();
            intent.setAction("android.app.action.CONFIRM_DEVICE_CREDENTIAL");
            startActivityForResult(intent, 2);
            return;
        }
        f109232a.mo50711a("starting SL part", new Object[0]);
        startActivityForResult(aupm.m77568a(getApplicationContext()), 1);
    }

    /* renamed from: c */
    public final void mo50946c() {
        this.f109240i.setVisibility(8);
        this.f109239h.setVisibility(8);
        this.f109241j.setVisibility(8);
        this.f109242k.setVisibility(8);
        this.f109243l.setVisibility(0);
        this.f109244m.mo71365c(C0126R.string.trust_agent_checking_smartlock_status);
        getSupportLoaderManager().initLoader(0, new Bundle(), this.f109235d);
    }

    /* renamed from: d */
    public final void mo50947d() {
        this.f109240i.setVisibility(8);
        this.f109241j.setVisibility(8);
        this.f109242k.setVisibility(0);
        this.f109243l.setVisibility(8);
        this.f109244m.mo71365c(C0126R.string.onbody_promotion_desc_smartlock_allset_title);
        this.f109242k.setText(this.f109234b.mo50961i());
        m93522a(true);
    }

    /* renamed from: e */
    public final void mo50948e() {
        this.f109240i.setVisibility(8);
        this.f109241j.setVisibility(8);
        this.f109242k.setVisibility(0);
        this.f109243l.setVisibility(8);
        this.f109244m.mo71363a(this.f109234b.mo50959g());
        this.f109244m.mo71362a(getDrawable(C0126R.C0127drawable.quantum_ic_lock_googblue_48));
        if (!this.f109234b.mo50960h().isEmpty()) {
            this.f109242k.setText(this.f109234b.mo50960h());
        } else {
            this.f109242k.setVisibility(8);
        }
        m93522a(false);
    }

    /* renamed from: f */
    public final void mo50949f() {
        auvk auvk = this.f109236e;
        auvk.f92603c = true;
        if (auvk.f92602b.mo50734b()) {
            auvk.mo50972a();
        }
    }

    /* renamed from: g */
    public final boolean mo50950g() {
        return aupi.m77556a(this.f109237f);
    }

    /* renamed from: h */
    public final void mo59577h() {
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        aunx aunx = f109232a;
        Integer valueOf = Integer.valueOf(i);
        aunx.mo50711a("activity result return: %d, %d", valueOf, Integer.valueOf(i2));
        if (i != 1) {
            if (i != 2) {
                f109232a.mo50711a("Invalid request code: %s", valueOf).mo50709d();
            } else if (i2 == -1) {
                f109232a.mo50711a("SL challenge passed", new Object[0]);
                mo59576a(33);
                this.f109234b.mo50956d();
            } else {
                f109232a.mo50711a("SL challenge failed", new Object[0]);
                mo59576a(34);
                mo59577h();
            }
        } else if (i2 == 1 && mo50950g()) {
            f109232a.mo50711a("SL set, return ok", new Object[0]);
            mo59576a(31);
            auvk auvk = this.f109236e;
            if (auvk.f92602b.mo50734b()) {
                auvk.f92602b.mo50733b("screen_lock_set_from", auvk.f92601a);
            }
            this.f109234b.mo50955c();
        } else {
            f109232a.mo50711a("not successful activity result from screen lock setting", new Object[0]);
            mo59576a(32);
            mo59577h();
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        char c;
        auut auut;
        super.onCreate(bundle);
        bjbb bjbb = new bjbb(bjbc.m103136a());
        bjbb.f122457a = 2132018260;
        bjbb.f122458b = true;
        setTheme(bjbb.mo64964a().mo64965a(getIntent()));
        setContentView((int) C0126R.C0128layout.onbody_promotion_activity);
        this.f109239h = (Button) findViewById(C0126R.C0129id.onbody_promotion_accept_button);
        this.f109240i = (Button) findViewById(C0126R.C0129id.onbody_promotion_cancel_button);
        this.f109241j = (ViewGroup) findViewById(C0126R.C0129id.onbody_promotion_intro_view);
        this.f109242k = (TextView) findViewById(C0126R.C0129id.onbody_promotion_desc_smartlock_set);
        this.f109243l = (ProgressBar) findViewById(C0126R.C0129id.onbody_promotion_checking_spinner);
        this.f109244m = (GlifLayout) findViewById(C0126R.C0129id.onbody_promotion_layout);
        this.f109237f = (KeyguardManager) getSystemService("keyguard");
        String stringExtra = getIntent().getStringExtra("extra_from_intent");
        Context applicationContext = getApplicationContext();
        switch (stringExtra.hashCode()) {
            case -1847923611:
                if (stringExtra.equals("com.google.android.gms.trustagent.discovery.WebpageOnbodyPromotionActivity")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1452109386:
                if (stringExtra.equals("from_security_advisor")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1341663249:
                if (stringExtra.equals("com.google.android.gms.trustagent.discovery.OnbodyScreenLockNotificationsManager$disablescreenlock")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1773221306:
                if (stringExtra.equals("com.google.android.gms.trustagent.discovery.OnbodyPromotionActivity")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1961855183:
                if (stringExtra.equals("com.google.android.gms.trustagent.trustlet.OnbodyLure")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2133393660:
                if (stringExtra.equals("com.google.android.gms.trustagent.discovery.OnbodyScreenLockNotificationsManager$addaccount")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1 || c == 2 || c == 3) {
            auut = new auuu(applicationContext, this);
        } else if (c == 4 || c == 5) {
            auut = new auvn(applicationContext, this);
        } else {
            auut = null;
        }
        this.f109234b = auut;
        auut.mo50952a();
        String stringExtra2 = getIntent().getStringExtra("extra_from_intent");
        auvk auvk = new auvk();
        Bundle bundle2 = new Bundle();
        bundle2.putString("from_intent", stringExtra2);
        auvk.setArguments(bundle2);
        this.f109236e = auvk;
        getSupportFragmentManager().beginTransaction().replace(16908290, this.f109236e, "PromoteScreenLockAndOnbodyFragment").commit();
        this.f109238g = mo50950g();
        mo59576a(28);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        this.f109234b.mo50957e();
        super.onDestroy();
    }

    /* renamed from: a */
    public final void mo50944a() {
        this.f109240i.setVisibility(0);
        this.f109239h.setVisibility(0);
        this.f109241j.setVisibility(0);
        this.f109242k.setVisibility(8);
        this.f109243l.setVisibility(8);
        this.f109244m.mo71363a(this.f109234b.mo50958f());
        this.f109241j.addView(this.f109234b.mo50951a(getLayoutInflater()));
        this.f109239h.setOnClickListener(new auvg(this));
        this.f109240i.setOnClickListener(new auvh(this));
    }

    /* renamed from: a */
    public final void mo59576a(int i) {
        bogj bogj = (bogj) bohi.f133070z.mo74144da();
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi = (bohi) bogj.f164949b;
        bohi.f133088r = i - 1;
        int i2 = bohi.f133071a | 4096;
        bohi.f133071a = i2;
        boolean z = this.f109238g;
        bohi.f133071a = i2 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        bohi.f133079i = z;
        String stringExtra = getIntent().getStringExtra("extra_from_intent");
        if (stringExtra != null) {
            if (bogj.f164950c) {
                bogj.mo74035c();
                bogj.f164950c = false;
            }
            bohi bohi2 = (bohi) bogj.f164949b;
            stringExtra.getClass();
            bohi2.f133071a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            bohi2.f133093w = stringExtra;
        }
        aupk.m77567a(this, (bohi) bogj.mo74062i());
    }
}
