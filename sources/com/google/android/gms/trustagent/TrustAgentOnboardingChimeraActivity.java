package com.google.android.gms.trustagent;

import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.p037ui.LinkSpan;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TrustAgentOnboardingChimeraActivity extends aupe implements auoi {

    /* renamed from: b */
    public static final aunx f109125b = new aunx("TrustAgent", "TrustAgentOnboardingActivity");

    /* renamed from: h */
    private static final IntentFilter f109126h = new IntentFilter("com.google.android.setupwizard.LINK_SPAN_CLICKED");

    /* renamed from: c */
    final BroadcastReceiver f109127c = new aacn("trustagent") {
        /* class com.google.android.gms.trustagent.TrustAgentOnboardingChimeraActivity.C16701 */

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            if (!TrustAgentOnboardingChimeraActivity.this.isFinishing() && "trustagent_learn_more".equals(intent.getStringExtra("id"))) {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/mobile/?p=personal_unlocking"));
                intent2.putExtra("com.android.browser.application_id", TrustAgentOnboardingChimeraActivity.this.getPackageName());
                try {
                    TrustAgentOnboardingChimeraActivity.this.startActivity(intent2);
                } catch (ActivityNotFoundException e) {
                    aunx aunx = TrustAgentOnboardingChimeraActivity.f109125b;
                    String valueOf = String.valueOf(intent2.toString());
                    aunx.mo50710a(valueOf.length() == 0 ? new String("Actvity was not found for intent, ") : "Actvity was not found for intent, ".concat(valueOf), e, new Object[0]).mo50706a();
                }
            }
        }
    };

    /* renamed from: d */
    public boolean f109128d;

    /* renamed from: e */
    public Context f109129e;

    /* renamed from: f */
    public Intent f109130f;

    /* renamed from: g */
    public boolean f109131g;

    /* renamed from: i */
    private final aulf f109132i = new aulf(this);

    /* renamed from: j */
    private final auol f109133j = auol.m77454a();

    /* renamed from: k */
    private Intent f109134k;

    /* renamed from: l */
    private aure f109135l;

    /* renamed from: m */
    private TextView f109136m;

    /* renamed from: n */
    private Button f109137n;

    /* renamed from: o */
    private LinearLayout f109138o;

    /* renamed from: a */
    public static void m93403a(Activity activity) {
        Intent intent = new Intent();
        intent.setClassName(activity, "com.google.android.gms.trustagent.TrustAgentOnboardingActivity");
        try {
            activity.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            aunw a = f109125b.mo50711a("Cannot find %s.", intent.getComponent().toString());
            a.mo50706a();
            a.mo50707b();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: auol.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      auol.a(java.lang.String, long):long
      auol.a(java.lang.String, java.lang.String):java.lang.String
      auol.a(java.lang.String, java.lang.Object):void
      aupn.a(java.lang.String, long):long
      aupn.a(java.lang.String, java.lang.String):java.lang.String
      auol.a(java.lang.String, boolean):void */
    /* renamed from: g */
    private final void m93405g() {
        this.f109133j.mo50728a("trust_agent_onboarding_shown_key", true);
    }

    /* renamed from: e */
    public final void mo59551e() {
        if (this.f109130f == null) {
            this.f109136m.setVisibility(8);
            findViewById(C0126R.C0129id.trust_agent_onboarding_divider).setVisibility(8);
            findViewById(C0126R.C0129id.trust_agent_onboarding_divider).setVisibility(8);
            this.f109137n.setText((int) C0126R.string.trust_agent_button_got_it);
            this.f109137n.setOnClickListener(new aule(this));
            return;
        }
        boolean a = aupi.m77556a((KeyguardManager) getSystemService("keyguard"));
        this.f109131g = a;
        if (!a) {
            this.f109136m.setText(this.f109135l.mo50818d());
        } else if (this.f109128d) {
            this.f109136m.setText(this.f109135l.mo50817c());
        } else {
            this.f109136m.setText(String.format("%s. %s", getString(C0126R.string.trust_agent_smartlock_disabled_title), getString(C0126R.string.trust_agent_smartlock_disabled_detail)));
            this.f109137n.setText((int) C0126R.string.trust_agent_button_got_it);
            this.f109137n.setOnClickListener(new aulc(this));
            return;
        }
        this.f109137n.setText(this.f109135l.mo50819e());
        this.f109137n.setOnClickListener(new auld(this));
    }

    /* renamed from: h */
    public final void mo50722h() {
        m93405g();
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
    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        f109125b.mo50711a("activity result return: %d, %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 1) {
            if (i2 == 1) {
                mo59549a(38);
                f109125b.mo50711a("SL set, return ok", new Object[0]);
                this.f109130f.putExtra("extra_check_started", true);
                startActivity(this.f109130f);
                finish();
                return;
            }
            mo59549a(39);
        }
    }

    public final void onCreate(Bundle bundle) {
        aure aure;
        char c;
        super.onCreate(bundle);
        f109125b.mo50711a("onCreate", new Object[0]);
        if (bundle != null) {
            this.f109134k = (Intent) bundle.getParcelable("intent");
        } else {
            this.f109134k = getIntent();
        }
        this.f109129e = getApplicationContext();
        this.f109133j.mo50726a(this);
        if (this.f109133j.mo50734b()) {
            m93405g();
        }
        mo8628aW().mo15853b(true);
        mo8628aW().mo15839a(0.0f);
        setContentView((int) C0126R.C0128layout.trust_agent_onboarding_activity);
        TextView textView = (TextView) findViewById(C0126R.C0129id.trust_agent_onboarding_text_title);
        TextView textView2 = (TextView) findViewById(C0126R.C0129id.trust_agent_onboarding_text_body);
        this.f109136m = (TextView) findViewById(C0126R.C0129id.trust_agent_onboarding_text_screenlock);
        this.f109137n = (Button) findViewById(C0126R.C0129id.trust_agent_onboarding_got_it_button);
        this.f109138o = (LinearLayout) findViewById(C0126R.C0129id.trust_agent_onboarding_spinner);
        String stringExtra = this.f109134k.getStringExtra("extra_intent_to_start");
        if (stringExtra == null) {
            aure = new aurd();
        } else {
            if (stringExtra.hashCode() == 1549989476 && stringExtra.equals("OnboardingSmartLockComponent")) {
                c = 0;
            } else {
                c = 65535;
            }
            if (c != 0) {
                aure = new aurd();
            } else {
                aure = new aurf();
            }
        }
        this.f109135l = aure;
        textView.setText(aure.mo50814a());
        textView2.setText(this.f109135l.mo50816b());
        LinkSpan.m22734a(textView2, "trustagent_learn_more");
        this.f109130f = this.f109135l.mo50815a(this.f109129e);
        mo59549a(14);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f109133j.mo50730b(this);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        onBackPressed();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        aki.m919a(this).mo872a(this.f109127c);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        aki.m919a(this).mo873a(this.f109127c, f109126h);
        this.f109131g = aupi.m77556a((KeyguardManager) getSystemService("keyguard"));
        this.f109128d = false;
        Intent intent = this.f109130f;
        if (intent != null) {
            intent.putExtra("extra_intent_from", aupk.m77566a(this.f109134k.getStringExtra("extra_intent_from"), this.f109134k.getStringExtra("extra_intent_to_start")));
            if (this.f109131g) {
                if (getSupportLoaderManager().getLoader(0) == null) {
                    getSupportLoaderManager().initLoader(0, new Bundle(), this.f109132i);
                } else {
                    getSupportLoaderManager().restartLoader(0, new Bundle(), this.f109132i);
                }
                mo59550a(true);
            }
        }
        mo59551e();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("intent", this.f109134k);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    public static void m93404a(Activity activity, auol auol) {
        if (!auol.mo50736c("trust_agent_onboarding_shown_key")) {
            m93403a(activity);
        }
    }

    /* renamed from: a */
    public final void mo59549a(int i) {
        bogj bogj = (bogj) bohi.f133070z.mo74144da();
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi = (bohi) bogj.f164949b;
        bohi.f133088r = i - 1;
        bohi.f133071a |= 4096;
        String a = aupk.m77566a(this.f109134k.getStringExtra("extra_intent_from"), this.f109134k.getStringExtra("extra_intent_to_start"));
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi2 = (bohi) bogj.f164949b;
        a.getClass();
        int i2 = bohi2.f133071a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        bohi2.f133071a = i2;
        bohi2.f133093w = a;
        boolean z = this.f109131g;
        bohi2.f133071a = i2 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        bohi2.f133079i = z;
        aupk.m77567a(this, (bohi) bogj.mo74062i());
    }

    /* renamed from: a */
    public final void mo59550a(boolean z) {
        if (!z) {
            this.f109138o.setVisibility(8);
            this.f109136m.setVisibility(0);
            this.f109137n.setVisibility(0);
            return;
        }
        this.f109138o.setVisibility(0);
        this.f109136m.setVisibility(8);
        this.f109137n.setVisibility(8);
    }
}
