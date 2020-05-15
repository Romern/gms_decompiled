package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.wallet.activity.GenericDelegatorChimeraActivity;
import com.google.android.gms.wallet.p088ui.redirect.PopupRedirectChimeraActivity;
import com.google.android.gms.wallet.p088ui.verifypin.KeyPadView;
import com.google.android.gms.wallet.p088ui.verifypin.PinDotsView;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.clientlog.TimedEvent;
import java.util.ArrayList;

/* renamed from: axcz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axcz extends awcc implements View.OnClickListener, axcw, awgb, bkcg {

    /* renamed from: l */
    public static final /* synthetic */ int f95801l = 0;

    /* renamed from: m */
    private static final String f95802m = awhg.m79946a("verifyPinActivityDelegate");

    /* renamed from: c */
    public StringBuilder f95803c;

    /* renamed from: d */
    public TextView f95804d;

    /* renamed from: e */
    public TimedEvent f95805e;

    /* renamed from: f */
    public int f95806f = 0;

    /* renamed from: g */
    Button f95807g;

    /* renamed from: h */
    final Handler f95808h = new adzt();

    /* renamed from: i */
    PinDotsView f95809i;

    /* renamed from: j */
    awhg f95810j;

    /* renamed from: k */
    int f95811k;

    /* renamed from: n */
    private final axcy f95812n = new axcy(this);

    /* renamed from: o */
    private Button f95813o;

    /* renamed from: p */
    private BuyFlowConfig f95814p;

    /* renamed from: q */
    private bkch f95815q;

    /* renamed from: r */
    private bmcm f95816r;

    /* renamed from: s */
    private KeyPadView f95817s;

    /* renamed from: t */
    private boolean f95818t;

    /* renamed from: u */
    private boolean f95819u;

    public axcz(GenericDelegatorChimeraActivity genericDelegatorChimeraActivity) {
        super(genericDelegatorChimeraActivity);
    }

    /* renamed from: a */
    public static Intent m82344a(Context context, LogContext logContext, BuyFlowConfig buyFlowConfig, bmcm bmcm) {
        Intent b = awcc.m79594b(context, new Intent(), logContext);
        b.setAction("com.google.android.gms.wallet.firstparty.ACTION_VERIFY_PIN_ACTIVITY").putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        bjvp.m104735a(b, "gaiaPinForm", bmcm);
        return b;
    }

    /* renamed from: j */
    private final void m82345j() {
        if (this.f95815q != null) {
            this.f94160a.getSupportFragmentManager().beginTransaction().remove(this.f95815q).commit();
        }
        bmde bmde = this.f95816r.f128719d;
        if (bmde == null) {
            bmde = bmde.f128780k;
        }
        awzr a = awzr.m81794a(bmde);
        this.f95815q = a;
        a.f123992d = this;
        a.show(this.f94160a.getSupportFragmentManager(), "confirmationDialog");
    }

    /* renamed from: k */
    private final void m82346k() {
        if (this.f95811k < 0) {
            this.f95811k = mo53030i().f94357a.mo52395a(this.f95812n);
        }
    }

    /* renamed from: b */
    public final void mo51849b(Bundle bundle) {
        super.mo51849b(bundle);
        int i = Build.VERSION.SDK_INT;
        this.f94160a.setRequestedOrientation(1);
        if (bundle != null) {
            this.f95803c = new StringBuilder(bundle.getString("pin", ""));
            this.f95806f = bundle.getInt("createReauthTokenRetryCount");
            this.f95811k = bundle.getInt("serviceConnectionSavePoint", -1);
            if (bundle.containsKey("apiRequestEvent")) {
                this.f95805e = (TimedEvent) bundle.getParcelable("apiRequestEvent");
            }
            this.f95819u = bundle.getBoolean("shouldPerformFingerprintAuthEnrollment");
            bkch bkch = (bkch) this.f94160a.getSupportFragmentManager().findFragmentByTag("confirmationDialog");
            this.f95815q = bkch;
            if (bkch != null) {
                bkch.f123992d = this;
            }
        } else {
            this.f95818t = true;
            this.f95803c = new StringBuilder();
        }
        this.f95814p = (BuyFlowConfig) this.f94160a.getIntent().getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig");
        this.f95816r = (bmcm) bjvp.m104729a(this.f94160a.getIntent(), "gaiaPinForm", (bxxk) bmcm.f128714f.mo74142c(7));
        this.f94160a.setContentView((int) C0126R.C0128layout.wallet_activity_verify_pin);
        KeyPadView keyPadView = (KeyPadView) this.f94160a.findViewById(C0126R.C0129id.keypad_view);
        this.f95817s = keyPadView;
        keyPadView.f110594a = this;
        PinDotsView pinDotsView = (PinDotsView) this.f94160a.findViewById(C0126R.C0129id.pin_dots_view);
        this.f95809i = pinDotsView;
        pinDotsView.mo60137a(this.f95803c.length());
        this.f95804d = (TextView) this.f94160a.findViewById(C0126R.C0129id.error_message);
        TextView textView = (TextView) this.f94160a.findViewById(C0126R.C0129id.enter_pin_title);
        bmdn bmdn = this.f95816r.f128717b;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        textView.setText(bmdn.f128837e);
        sdo.m34974b(this.f94160a.getIntent().getExtras().containsKey("gaiaPinForm"));
        bmcm bmcm = this.f95816r;
        bxvj bxvj = bmdo.f128844b;
        bmcm.mo74135a(bxvj);
        sdo.m34974b(bmcm.f164952m.mo73911a(bxvj.f164958d));
        Button button = (Button) this.f94160a.findViewById(C0126R.C0129id.forgot_pin_button);
        this.f95807g = button;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) button.getLayoutParams();
        if ((this.f95816r.f128716a & 8) != 0) {
            layoutParams.gravity = 5;
        } else {
            layoutParams.gravity = 1;
        }
        this.f95807g.setLayoutParams(layoutParams);
        this.f95807g.setOnClickListener(this);
        this.f95807g.setVisibility(0);
        int i2 = this.f95816r.f128716a;
        if ((i2 & 4) != 0) {
            if ((i2 & 8) != 0) {
                Button button2 = (Button) this.f94160a.findViewById(C0126R.C0129id.enroll_fingerprint_button);
                this.f95813o = button2;
                bmdb bmdb = this.f95816r.f128720e;
                if (bmdb == null) {
                    bmdb = bmdb.f128767k;
                }
                button2.setText(bmdb.f128773e);
                this.f95813o.setOnClickListener(this);
                this.f95813o.setVisibility(0);
            } else if (this.f95818t) {
                m82345j();
            }
        }
        if (mo53030i() == null) {
            this.f95810j = awhg.m79945a(16, this.f95814p, mo53029h());
            this.f94160a.getSupportFragmentManager().beginTransaction().add(this.f95810j, f95802m).commitNow();
        }
    }

    /* renamed from: c */
    public final void mo52062c(int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.f95819u = z;
    }

    /* renamed from: d */
    public final void mo51852d() {
        m82346k();
    }

    /* renamed from: h */
    public final Account mo53029h() {
        return this.f95814p.f110418b.f110407b;
    }

    /* renamed from: i */
    public final awhg mo53030i() {
        if (this.f95810j == null) {
            this.f95810j = (awhg) this.f94160a.getSupportFragmentManager().findFragmentByTag(f95802m);
        }
        return this.f95810j;
    }

    public void onClick(View view) {
        if (this.f95807g.getId() != view.getId()) {
            Button button = this.f95813o;
            if (button != null && button.getId() == view.getId()) {
                m82345j();
            }
        } else if (chiv.f188665a.mo6606a().mo85269b()) {
            Context baseContext = this.f94160a.getBaseContext();
            bmcm bmcm = this.f95816r;
            bxvj bxvj = bmdo.f128844b;
            bmcm.mo74135a(bxvj);
            Object b = bmcm.f164952m.mo73913b(bxvj.f164958d);
            if (b == null) {
                b = bxvj.f164956b;
            } else {
                bxvj.mo74139a(b);
            }
            this.f94160a.startActivity(PopupRedirectChimeraActivity.m94289a(baseContext, (bmki) b, new ArrayList(0), "", this.f94160a.getThemeResId(), this.f94161b, this.f95814p, mo53029h()));
        } else {
            bmcm bmcm2 = this.f95816r;
            bxvj bxvj2 = bmdo.f128844b;
            bmcm2.mo74135a(bxvj2);
            Object b2 = bmcm2.f164952m.mo73913b(bxvj2.f164958d);
            if (b2 == null) {
                b2 = bxvj2.f164956b;
            } else {
                bxvj2.mo74139a(b2);
            }
            this.f94160a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((bmki) b2).f129806c)));
        }
    }

    /* renamed from: c */
    public final void mo51850c() {
        mo53030i().f94357a.mo52397a(this.f95812n, this.f95811k);
        this.f95811k = -1;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: h */
    public final void mo52066h(Bundle bundle) {
        char c;
        int i;
        String a = awgc.m79889a(bundle);
        switch (a.hashCode()) {
            case -709064469:
                if (a.equals("setResultAndFinish")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -334152750:
                if (a.equals("doAnimateError")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 613572429:
                if (a.equals("doAnimateSuccess")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1469451456:
                if (a.equals("handleError")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            String string = bundle.getString("encodedPreauthProofToken");
            Intent intent = new Intent();
            intent.putExtra("encodedPreauthProofToken", string);
            intent.putExtra("shouldPerformFingerprintAuthEnrollment", this.f95819u);
            this.f94160a.setResult(-1, intent);
            this.f94160a.finish();
        } else if (c == 1) {
            int i2 = bundle.getInt("errorCode");
            TextView textView = this.f95804d;
            if (i2 != 1) {
                i = i2 != 2 ? i2 == 100 ? C0126R.string.wallet_uic_network_error_message : C0126R.string.wallet_pin_generic_error : C0126R.string.wallet_pin_locked;
            } else {
                i = C0126R.string.wallet_pin_invalid;
            }
            textView.setText(i);
            this.f95804d.setVisibility(0);
            int i3 = Build.VERSION.SDK_INT;
            TextView textView2 = this.f95804d;
            textView2.announceForAccessibility(textView2.getText());
            this.f95803c.setLength(0);
            mo53028a(true);
        } else if (c == 2) {
            String string2 = bundle.getString("encodedPreauthProofToken");
            this.f95809i.mo60138b(2);
            awgc a2 = awgc.m79888a(this, "setResultAndFinish");
            a2.f94286a.putString("encodedPreauthProofToken", string2);
            this.f95808h.postDelayed(a2, this.f95809i.mo60136a());
        } else if (c == 3) {
            mo53027a(bundle.getInt("errorCode"));
        }
    }

    /* renamed from: a */
    public final void mo53027a(int i) {
        this.f95809i.mo60138b(3);
        awgc a = awgc.m79888a(this, "handleError");
        a.f94286a.putInt("errorCode", i);
        this.f95808h.postDelayed(a, this.f95809i.mo60136a());
    }

    /* renamed from: c */
    public final void mo51851c(Bundle bundle) {
        super.mo51851c(bundle);
        m82346k();
        bundle.putString("pin", this.f95803c.toString());
        bundle.putInt("createReauthTokenRetryCount", this.f95806f);
        bundle.putInt("serviceConnectionSavePoint", this.f95811k);
        bundle.putBoolean("shouldPerformFingerprintAuthEnrollment", this.f95819u);
        TimedEvent timedEvent = this.f95805e;
        if (timedEvent != null) {
            bundle.putParcelable("apiRequestEvent", timedEvent);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void
     arg types: [com.google.android.gms.wallet.activity.GenericDelegatorChimeraActivity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, int]
     candidates:
      awia.a(bwiv, android.content.Intent, android.content.Context, com.google.android.gms.wallet.shared.BuyFlowConfig):android.content.Intent
      awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void */
    /* renamed from: a */
    public final void mo51845a(Bundle bundle) {
        super.mo51845a(bundle);
        GenericDelegatorChimeraActivity genericDelegatorChimeraActivity = this.f94160a;
        awia.m79981a((Activity) genericDelegatorChimeraActivity, (BuyFlowConfig) genericDelegatorChimeraActivity.getIntent().getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig"), awia.f94383e, true);
    }

    /* renamed from: a */
    public final void mo53028a(boolean z) {
        this.f95817s.setEnabled(z);
        this.f95807g.setEnabled(z);
        Button button = this.f95813o;
        if (button != null) {
            button.setEnabled(z);
        }
    }
}
