package com.google.android.gms.tapandpay.tokenization;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.RemoteException;
import android.support.p001v4.widget.NestedScrollView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.Fragment;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.material.button.MaterialButton;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SelectVerificationMethodChimeraActivity extends atex implements asin, rkl, auat, auaj {

    /* renamed from: b */
    public static final srn f108854b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: A */
    private View f108855A;

    /* renamed from: B */
    private View f108856B;

    /* renamed from: C */
    private ViewGroup f108857C;

    /* renamed from: D */
    private boolean f108858D = true;

    /* renamed from: E */
    private boolean f108859E;

    /* renamed from: F */
    private String f108860F;

    /* renamed from: G */
    private boolean f108861G;

    /* renamed from: c */
    atzj f108862c;

    /* renamed from: d */
    atra f108863d;

    /* renamed from: e */
    public AccountInfo f108864e;

    /* renamed from: f */
    String f108865f;

    /* renamed from: g */
    public btjx f108866g;

    /* renamed from: h */
    public atam f108867h;

    /* renamed from: i */
    public boolean f108868i;

    /* renamed from: j */
    public boolean f108869j = false;

    /* renamed from: k */
    atxz f108870k = new atqy(this);

    /* renamed from: l */
    atzf f108871l;

    /* renamed from: m */
    ayxa f108872m;

    /* renamed from: n */
    rjx f108873n;

    /* renamed from: o */
    rjx f108874o;

    /* renamed from: p */
    rjx f108875p;

    /* renamed from: q */
    private BroadcastReceiver f108876q;

    /* renamed from: r */
    private BroadcastReceiver f108877r;

    /* renamed from: s */
    private ProgressBar f108878s;

    /* renamed from: t */
    private View f108879t;

    /* renamed from: u */
    private ImageView f108880u;

    /* renamed from: v */
    private String f108881v;

    /* renamed from: w */
    private byte[] f108882w;

    /* renamed from: x */
    private CardInfo f108883x;

    /* renamed from: y */
    private String f108884y;

    /* renamed from: z */
    private String f108885z;

    /* renamed from: a */
    private static int m93239a(String str, String str2) {
        if (str == null || str2 == null) {
            bnsl bnsl = (bnsl) f108854b.mo68387b();
            bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "a", 940, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("couldn't extract numbers");
            return 1;
        }
        long a = cgxo.f187982a.mo6606a().mo84687a();
        if (((long) str.length()) < a || ((long) str2.length()) < a) {
            return 1;
        }
        int min = Math.min(str.length(), str2.length());
        return m93241a(str, min).equals(m93241a(str2, min)) ? 3 : 2;
    }

    /* renamed from: b */
    private final void m93244b(String str) {
        mo59463a(false);
        this.f108869j = true;
        this.f108885z = null;
        Message a = atva.m76433a(this.f108883x, this.f108864e, this.f108881v, this.f108882w, this.f108865f, str, false, true, this.f108866g.mo73642k(), this.f108863d);
        try {
            bnsl a2 = f108854b.mo26019b(aske.m74275a());
            a2.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "b", 1194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            a2.mo68405a("Starting SubmitActivationCode task");
            this.f108870k.mo50311a(a);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f108854b.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "b", 1197, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error calling SubmitActivationCode");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atam.a(btjx, java.lang.Boolean, java.lang.Boolean):bpaq
     arg types: [btjx, int, java.lang.Boolean]
     candidates:
      atam.a(com.google.android.gms.tapandpay.firstparty.CardInfo, java.lang.String, boolean):void
      atam.a(java.lang.String, int, int):void
      atam.a(java.lang.String, boolean, java.lang.String):void
      atam.a(btjx, java.lang.Boolean, java.lang.Boolean):bpaq */
    /* renamed from: p */
    private final void m93245p() {
        mo59463a(true);
        btjx btjx = this.f108866g;
        if (btjx != null) {
            btnv a = btnv.m116964a(btjx.f149197d);
            if (a == null) {
                a = btnv.UNRECOGNIZED;
            }
            if (a == btnv.APP) {
                Intent a2 = VerificationMethodView.m93294a(this.f108866g, this.f108884y, this);
                if (a2 != null) {
                    startActivityForResult(a2, ErrorInfo.TYPE_FSC_HTTP_ERROR);
                    atam atam = this.f108867h;
                    CardInfo cardInfo = this.f108883x;
                    String str = this.f108865f;
                    btjx btjx2 = this.f108866g;
                    Boolean valueOf = Boolean.valueOf(this.f108868i);
                    bxvd b = atam.mo49753b(68, cardInfo);
                    bpaq a3 = atam.m75296a(btjx2, (Boolean) true, valueOf);
                    if (b.f164950c) {
                        b.mo74035c();
                        b.f164950c = false;
                    }
                    bpbx bpbx = (bpbx) b.f164949b;
                    bpbx bpbx2 = bpbx.f135635S;
                    a3.getClass();
                    bpbx.f135664j = a3;
                    bpbx.f135655a |= 128;
                    atam.mo49742a((bpbx) b.mo74062i(), str);
                    return;
                }
                return;
            }
        }
        bnsl bnsl = (bnsl) f108854b.mo68388c();
        bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "p", 1010, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Activation method became null or a non-app activation method before we gotthe issuer app result, not handling issuer app result");
    }

    /* renamed from: q */
    private final void m93246q() {
        try {
            this.f108870k.mo50311a(atur.m76407a(this.f108883x.f108340a, this.f108864e, this.f108881v, this.f108865f, this.f108863d));
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f108854b.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "q", 1248, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error calling GetSelectedActivationMethod");
        }
    }

    /* renamed from: c */
    public final void mo59466c(boolean z) {
        int i;
        View view = this.f108856B;
        int i2 = 8;
        if (!z) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        View view2 = this.f108855A;
        if (!z) {
            i2 = 0;
        }
        view2.setVisibility(i2);
        for (int i3 = 0; i3 < this.f108857C.getChildCount(); i3++) {
            ((VerificationMethodView) this.f108857C.getChildAt(i3)).setChecked(false);
        }
        if (!z) {
            this.f108866g = null;
        }
    }

    /* renamed from: e */
    public final void mo59467e() {
        bnsl a = f108854b.mo26019b(aske.m74275a());
        a.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "e", 668, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68405a("Connected to TokenizePanService");
        if (isFinishing()) {
            return;
        }
        if (this.f108866g == null) {
            try {
                this.f108870k.mo50311a(atur.m76407a(this.f108883x.f108340a, this.f108864e, this.f108881v, this.f108865f, this.f108863d));
            } catch (RemoteException e) {
                bnsl bnsl = (bnsl) f108854b.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "q", 1248, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Error calling GetSelectedActivationMethod");
            }
        } else if (this.f108885z != null) {
            bnsl a2 = f108854b.mo26019b(aske.m74275a());
            a2.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "e", 677, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            a2.mo68405a("Submitting issuer activation code from onTokenizePanServiceConnected");
            String str = this.f108885z;
            mo59463a(false);
            this.f108869j = true;
            this.f108885z = null;
            Message a3 = atva.m76433a(this.f108883x, this.f108864e, this.f108881v, this.f108882w, this.f108865f, str, false, true, this.f108866g.mo73642k(), this.f108863d);
            try {
                bnsl a4 = f108854b.mo26019b(aske.m74275a());
                a4.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "b", 1194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                a4.mo68405a("Starting SubmitActivationCode task");
                this.f108870k.mo50311a(a3);
            } catch (RemoteException e2) {
                bnsl bnsl2 = (bnsl) f108854b.mo68388c();
                bnsl2.mo68437a(e2);
                bnsl2.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "b", 1197, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Error calling SubmitActivationCode");
            }
        } else {
            mo59470i();
            mo59474n();
        }
    }

    /* renamed from: g */
    public final void mo59468g() {
        rjx rjx = this.f108873n;
        if (rjx != null) {
            rjx.mo24769w().mo9459a(this, 30, TimeUnit.SECONDS);
            return;
        }
        atzj atzj = this.f108862c;
        if (atzj != null) {
            atzj.mo50329a().mo9459a(this, 30, TimeUnit.SECONDS);
            return;
        }
        throw new IllegalStateException("No clients available");
    }

    /* renamed from: h */
    public final void mo59469h() {
        if (!this.f108859E) {
            this.f108859E = this.f108883x.f108347h != null;
            asju.m74252a(new asjs(this, this.f108864e.f108326b), this.f108883x, this.f108880u);
        }
    }

    /* renamed from: i */
    public final void mo59470i() {
        TextView textView = (TextView) findViewById(C0126R.C0129id.SelectVerificationMethodLabel);
        textView.announceForAccessibility(textView.getText());
    }

    /* renamed from: j */
    public final void mo59471j() {
        for (int i = 0; i < this.f108857C.getChildCount(); i++) {
            View childAt = this.f108857C.getChildAt(i);
            if (childAt instanceof VerificationMethodView) {
                ((VerificationMethodView) childAt).mo59487a();
            }
        }
    }

    /* renamed from: l */
    public final VerificationMethodView mo59472l() {
        for (int i = 0; i < this.f108857C.getChildCount(); i++) {
            VerificationMethodView verificationMethodView = (VerificationMethodView) this.f108857C.getChildAt(i);
            if (((CompoundButton) verificationMethodView.findViewById(C0126R.C0129id.RadioButton)).isChecked()) {
                return verificationMethodView;
            }
        }
        return null;
    }

    /* renamed from: m */
    public final void mo59473m() {
        auar auar = new auar();
        auar.f91333a = 204;
        auar.f91334b = getString(C0126R.string.tp_autofill_dialog_title);
        auar.f91335c = getString(C0126R.string.tp_autofill_dialog_message);
        auar.f91336d = getString(C0126R.string.tp_autofill_dialog_confirm);
        auar.f91337e = getString(C0126R.string.common_no_thanks);
        auar.f91340h = bpan.AUTOFILL_CODE;
        auar.f91341i = this.f108864e;
        auar.mo50344a().show(getSupportFragmentManager(), "SelectVerificationActy.otpAutofillDialog");
    }

    /* renamed from: n */
    public final void mo59474n() {
        mo59463a(false);
        try {
            this.f108870k.mo50311a(atuu.m76414a(this.f108883x.f108340a, this.f108864e, this.f108881v, this.f108882w, this.f108865f, this.f108863d));
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f108854b.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "n", 1265, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error calling ListActivationMethods");
        }
    }

    /* renamed from: o */
    public final void mo59475o() {
        mo59461a(getString(C0126R.string.tp_activation_code_error_title), getString(C0126R.string.tp_activation_code_nonretryable_error_body), getString(C0126R.string.common_ok), 203);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atam.a(btjx, java.lang.Boolean, java.lang.Boolean):bpaq
     arg types: [btjx, int, java.lang.Boolean]
     candidates:
      atam.a(com.google.android.gms.tapandpay.firstparty.CardInfo, java.lang.String, boolean):void
      atam.a(java.lang.String, int, int):void
      atam.a(java.lang.String, boolean, java.lang.String):void
      atam.a(btjx, java.lang.Boolean, java.lang.Boolean):bpaq */
    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        btka btka;
        String str;
        String str2;
        String str3;
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        super.onActivityResult(i, i2, intent);
        int i5 = 0;
        if (i3 != 101) {
            if (i3 != 102) {
                if (i3 == 301) {
                    bnsl a = f108854b.mo26019b(aske.m74275a());
                    a.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "onActivityResult", 586, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    a.mo68405a("Issuer app activity finished.");
                    mo59463a(true);
                    btjx btjx = this.f108866g;
                    if (btjx != null) {
                        btnv a2 = btnv.m116964a(btjx.f149197d);
                        if (a2 == null) {
                            a2 = btnv.UNRECOGNIZED;
                        }
                        if (a2 == btnv.APP) {
                            btjx btjx2 = this.f108866g;
                            if (btjx2.f149194a == 5) {
                                btka btka2 = (btka) btjx2.f149195b;
                                if (btka2.f149216d != null) {
                                    if (i4 != -1 || intent2 == null) {
                                        if (i4 == -1) {
                                            bnsl a3 = f108854b.mo26019b(aske.m74275a());
                                            a3.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "a", 1055, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            a3.mo68405a("Issuer app result had null intent, returning");
                                        } else {
                                            bnsl a4 = f108854b.mo26019b(aske.m74275a());
                                            a4.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "a", 1052, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            a4.mo68409a("Issuer app did not have result code OK, returning. Result code was: %s", i4);
                                        }
                                        this.f108867h.mo49744a(this.f108883x, this.f108865f, btka2.f149214b, btka2.f149213a, i2, "", "", "");
                                    } else {
                                        bnsl a5 = f108854b.mo26019b(aske.m74275a());
                                        a5.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "a", 1070, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        a5.mo68405a("Issuer app successfully returned RESULT_OK with non-null intent");
                                        btjx btjx3 = this.f108866g;
                                        if (btjx3.f149194a == 5) {
                                            btka = (btka) btjx3.f149195b;
                                        } else {
                                            btka = btka.f149211f;
                                        }
                                        btjz btjz = btka.f149216d;
                                        if (btjz == null) {
                                            btjz = btjz.f149206d;
                                        }
                                        bxwc bxwc = btjz.f149208a;
                                        int size = bxwc.size();
                                        int i6 = 0;
                                        while (true) {
                                            str = null;
                                            if (i6 >= size) {
                                                str2 = null;
                                                str3 = null;
                                                break;
                                            }
                                            String str4 = (String) bxwc.get(i6);
                                            i6++;
                                            if (intent2.hasExtra(str4)) {
                                                str2 = intent2.getStringExtra(str4);
                                                str3 = str4;
                                                break;
                                            }
                                        }
                                        if (str2 == null) {
                                            bnsl a6 = f108854b.mo26019b(aske.m74275a());
                                            a6.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "a", 1088, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            a6.mo68405a("Issuer app has no response extra, returning");
                                            this.f108867h.mo49744a(this.f108883x, this.f108865f, btka2.f149214b, btka2.f149213a, -1, "", "", "");
                                        } else {
                                            bxwc bxwc2 = btjz.f149209b;
                                            int size2 = bxwc2.size();
                                            int i7 = 0;
                                            while (true) {
                                                if (i7 >= size2) {
                                                    bnsl a7 = f108854b.mo26019b(aske.m74275a());
                                                    a7.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "a", 1111, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                    a7.mo68420a("Issuer app response is not approved, handling error. Response was %s", str2);
                                                    this.f108867h.mo49744a(this.f108883x, this.f108865f, btka2.f149214b, btka2.f149213a, -1, str3, str2, "");
                                                    mo59475o();
                                                    break;
                                                }
                                                int i8 = i7 + 1;
                                                if (TextUtils.equals(str2, (String) bxwc2.get(i7))) {
                                                    bnsl a8 = f108854b.mo26019b(aske.m74275a());
                                                    a8.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "a", 1126, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                    a8.mo68420a("Issuer app response value was %s and verification was approved", str2);
                                                    bxwc bxwc3 = btjz.f149210c;
                                                    int size3 = bxwc3.size();
                                                    while (true) {
                                                        if (i5 >= size3) {
                                                            break;
                                                        }
                                                        String str5 = (String) bxwc3.get(i5);
                                                        i5++;
                                                        if (intent2.hasExtra(str5)) {
                                                            str = intent2.getStringExtra(str5);
                                                            break;
                                                        }
                                                    }
                                                    if (str == null) {
                                                        bnsl a9 = f108854b.mo26019b(aske.m74275a());
                                                        a9.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "a", 1139, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                        a9.mo68405a("Issuer app response has no activation code, handling error");
                                                        this.f108867h.mo49744a(this.f108883x, this.f108865f, btka2.f149214b, btka2.f149213a, -1, str3, str2, "");
                                                        mo59475o();
                                                    } else {
                                                        bnsl a10 = f108854b.mo26019b(aske.m74275a());
                                                        a10.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "a", 1154, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                        a10.mo68405a("Received activation code from issuer app");
                                                        this.f108885z = str;
                                                        this.f108867h.mo49744a(this.f108883x, this.f108865f, btka2.f149214b, btka2.f149213a, -1, str3, str2, str);
                                                    }
                                                } else {
                                                    i7 = i8;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            bnsl bnsl = (bnsl) f108854b.mo68388c();
                            bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "a", 1044, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68405a("Issuer app selected activation method is null or has null subfields");
                        }
                    }
                    bnsl bnsl2 = (bnsl) f108854b.mo68388c();
                    bnsl2.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "a", 1036, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Activation method became null or a non-app activation method before we gotthe issuer app result, not handling issuer app result");
                } else if (i3 == 302) {
                    mo59463a(true);
                    btjx btjx4 = this.f108866g;
                    if (btjx4 != null) {
                        btnv a11 = btnv.m116964a(btjx4.f149197d);
                        if (a11 == null) {
                            a11 = btnv.UNRECOGNIZED;
                        }
                        if (a11 == btnv.APP) {
                            Intent a12 = VerificationMethodView.m93294a(this.f108866g, this.f108884y, this);
                            if (a12 != null) {
                                startActivityForResult(a12, ErrorInfo.TYPE_FSC_HTTP_ERROR);
                                atam atam = this.f108867h;
                                CardInfo cardInfo = this.f108883x;
                                String str6 = this.f108865f;
                                btjx btjx5 = this.f108866g;
                                Boolean valueOf = Boolean.valueOf(this.f108868i);
                                bxvd b = atam.mo49753b(68, cardInfo);
                                bpaq a13 = atam.m75296a(btjx5, (Boolean) true, valueOf);
                                if (b.f164950c) {
                                    b.mo74035c();
                                    b.f164950c = false;
                                }
                                bpbx bpbx = (bpbx) b.f164949b;
                                bpbx bpbx2 = bpbx.f135635S;
                                a13.getClass();
                                bpbx.f135664j = a13;
                                bpbx.f135655a |= 128;
                                atam.mo49742a((bpbx) b.mo74062i(), str6);
                            }
                        }
                    }
                    bnsl bnsl3 = (bnsl) f108854b.mo68388c();
                    bnsl3.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "p", 1010, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("Activation method became null or a non-app activation method before we gotthe issuer app result, not handling issuer app result");
                }
            } else if (i4 == -1) {
                setResult(-1);
                finish();
            } else if (i4 == 0 || i4 == 3) {
                setResult(0);
                finish();
            } else if (i4 == 4 || i4 == 12) {
                mo59466c(false);
            } else if (i4 != 13) {
                mo59466c(true);
            } else {
                setResult(2);
                finish();
            }
        } else if (i4 == -1) {
            setResult(-1);
            finish();
        } else if (i4 == 3) {
            setResult(0);
            finish();
        } else if (i4 == 4 || i4 == 12) {
            mo59466c(false);
        } else if (i4 != 13) {
            mo59466c(true);
        } else {
            setResult(2);
            finish();
        }
        if (isFinishing()) {
            this.f108863d.mo50317a();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        atpo atpo = new atpo();
        alir a = aliq.m60909a();
        cazf.m127594a(a);
        atpo.f90637a = a;
        cazf.m127595a(atpo.f90637a, alir.class);
        ayxa a2 = new atpp(atpo.f90637a).f90638a.mo40366a();
        cazf.m127593a(a2, "Cannot return null from a non-@Nullable component method");
        this.f108872m = a2;
        setTheme(C0126R.style.TpActivityTheme);
        setContentView((int) C0126R.C0128layout.tp_activity_select_verification_method);
        int i2 = Build.VERSION.SDK_INT;
        setRequestedOrientation(1);
        setTitle("");
        mo8628aW().mo15853b(true);
        mo8628aW().mo15863e((int) C0126R.C0127drawable.quantum_gm_ic_close_vd_theme_24);
        this.f108864e = (AccountInfo) getIntent().getParcelableExtra("extra_account_info");
        this.f108861G = getIntent().getBooleanExtra("nfc_device", true);
        AccountInfo accountInfo = this.f108864e;
        int i3 = 0;
        if (accountInfo == null || TextUtils.isEmpty(accountInfo.f108326b)) {
            bnsl bnsl = (bnsl) f108854b.mo68388c();
            bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "onCreate", 271, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Missing accountInfo, finishing");
            setResult(0);
            finish();
            return;
        }
        if (this.f108867h == null) {
            this.f108867h = new atam(this, this.f108864e);
        }
        String stringExtra = getIntent().getStringExtra("extra_calling_package");
        this.f108881v = stringExtra;
        if (stringExtra == null) {
            setResult(0);
            finish();
            return;
        }
        if (getIntent().hasExtra("activaton_receipt")) {
            this.f108882w = getIntent().getByteArrayExtra("activaton_receipt");
        }
        LayoutInflater layoutInflater = getLayoutInflater();
        if (cgwn.m147270t() && getIntent().getBooleanExtra("EXTRA_USE_SUW_UI", false)) {
            layoutInflater.inflate((int) C0126R.C0128layout.tp_select_verification_header, (ViewGroup) findViewById(C0126R.C0129id.SetupWizardUiHeader), true);
            findViewById(C0126R.C0129id.SelectVerificationMethodLabel).setVisibility(8);
            findViewById(C0126R.C0129id.SelectVerificationMethodSubtitle).setVisibility(8);
            ((TextView) findViewById(C0126R.C0129id.SuwSelectVerificationMethodLabel)).setTextSize(24.0f);
            ((TextView) findViewById(C0126R.C0129id.SuwSelectVerificationMethodSubtitle)).setTextSize(16.0f);
            findViewById(C0126R.C0129id.SuwAppLogo).setVisibility(0);
            findViewById(C0126R.C0129id.SetupWizardUiHeader).setVisibility(0);
            MaterialButton materialButton = (MaterialButton) findViewById(C0126R.C0129id.ContinueButton);
            materialButton.setText((int) C0126R.string.common_next);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) materialButton.getLayoutParams();
            layoutParams.removeRule(14);
            layoutParams.addRule(21);
            materialButton.setLayoutParams(layoutParams);
        }
        this.f108883x = (CardInfo) getIntent().getParcelableExtra("card_info");
        this.f108865f = getIntent().getStringExtra("session_id");
        this.f108884y = getIntent().getStringExtra("wallet_id");
        this.f108863d = new atra(this);
        this.f108878s = (ProgressBar) findViewById(C0126R.C0129id.ActivationMethodsProgressBar);
        this.f108879t = findViewById(C0126R.C0129id.VerificationMethodLayout);
        this.f108880u = (ImageView) findViewById(C0126R.C0129id.CardArtImageView);
        this.f108855A = findViewById(C0126R.C0129id.ContinueButton);
        this.f108856B = findViewById(C0126R.C0129id.EnterCode);
        this.f108857C = (ViewGroup) findViewById(C0126R.C0129id.VerificationMethods);
        if (atyj.m76564a(this.f108883x)) {
            ((TextView) findViewById(C0126R.C0129id.SelectVerificationMethodSubtitle)).setText((int) C0126R.string.tp_select_verification_method_subtitle_paypal);
            ((TextView) findViewById(C0126R.C0129id.UpdateInfoText)).setText((int) C0126R.string.tp_verification_methods_footer_paypal);
            ((TextView) findViewById(C0126R.C0129id.SelectVerificationMethodLabel)).setText((int) C0126R.string.tp_select_verification_method_title);
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            ((NestedScrollView) findViewById(C0126R.C0129id.MainContent)).setNestedScrollingEnabled(false);
        }
        if (bundle != null) {
            this.f108868i = bundle.getBoolean("is_autofill_consent_granted", false);
            byte[] byteArray = bundle.getByteArray("selected_activation_method");
            if (byteArray != null) {
                try {
                    this.f108866g = (btjx) bxvk.m124016a(btjx.f149192h, byteArray, bxus.m123744c());
                } catch (bxwf e) {
                    bnsl bnsl2 = (bnsl) f108854b.mo68388c();
                    bnsl2.mo68437a(e);
                    bnsl2.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "onCreate", 330, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Failed to parse the selected activation method");
                }
            }
        }
        this.f108876q = new aacn("tapandpay") {
            /* class com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity.C16662 */

            /* renamed from: a */
            public final void mo6253a(Context context, Intent intent) {
                SelectVerificationMethodChimeraActivity selectVerificationMethodChimeraActivity = SelectVerificationMethodChimeraActivity.this;
                srn srn = SelectVerificationMethodChimeraActivity.f108854b;
                selectVerificationMethodChimeraActivity.mo59469h();
            }
        };
        this.f108877r = new aacn("tapandpay") {
            /* class com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity.C16673 */

            /* renamed from: a */
            public final void mo6253a(Context context, Intent intent) {
                SelectVerificationMethodChimeraActivity selectVerificationMethodChimeraActivity = SelectVerificationMethodChimeraActivity.this;
                srn srn = SelectVerificationMethodChimeraActivity.f108854b;
                selectVerificationMethodChimeraActivity.mo59471j();
            }
        };
        mo59469h();
        String str = this.f108883x.f108351l;
        ((TextView) findViewById(C0126R.C0129id.VirtualAccountNumber)).setText(this.f108883x.f108360u);
        findViewById(C0126R.C0129id.VirtualAccountNumberLayout).setVisibility(0);
        String join = TextUtils.join(" ", bqcg.m112564a(str.toCharArray()));
        findViewById(C0126R.C0129id.VirtualAccountNumberLayout).setContentDescription(getString(C0126R.string.tp_virtual_account_number_accessibility, new Object[]{join}));
        String stringExtra2 = getIntent().getStringExtra("nodeId");
        this.f108860F = stringExtra2;
        if (TextUtils.isEmpty(stringExtra2)) {
            this.f108873n = rjx.m33697b((Activity) this);
            this.f108874o = rjx.m33693a((Activity) this);
        } else {
            if (this.f108875p == null) {
                this.f108875p = axoz.m82854b(this);
            }
            boolean booleanExtra = getIntent().getBooleanExtra("shouldCompressRpcs", false);
            atqz atqz = new atqz(this, this.f108875p, this.f108860F, this.f108863d, booleanExtra);
            this.f108870k = atqz;
            this.f108862c = new atzj(this.f108875p, this.f108860F, booleanExtra);
            this.f108871l = new atzf(this.f108875p, this.f108862c, atqz);
        }
        View view = this.f108856B;
        if (bundle == null || !bundle.getBoolean("enter_code_view_visible", false)) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        this.f108856B.setOnClickListener(new atqt(this));
        View view2 = this.f108855A;
        if (bundle != null && !bundle.getBoolean("continue_button_visible", true)) {
            i3 = 8;
        }
        view2.setVisibility(i3);
        this.f108855A.setOnClickListener(new atqu(this));
        if (cgwn.m147275y()) {
            aywx a3 = this.f108872m.f98673b.mo54504a(92635);
            a3.mo54481a(ayxb.m85017a(this.f108864e.f108326b));
            a3.mo54503a(getContainerActivity());
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0126R.C0130menu.tp_menu_select_verification_method, menu);
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        atra atra = this.f108863d;
        if (atra != null) {
            atra.mo50317a();
        }
        super.onDestroy();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId != C0126R.C0129id.tp_remove_card) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            auao.m76657a(getSupportFragmentManager(), this, this.f108883x, this.f108861G);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        unregisterReceiver(this.f108876q);
        unregisterReceiver(this.f108877r);
        atzf atzf = this.f108871l;
        if (atzf != null) {
            atzf.mo50328b();
        }
        rjx rjx = this.f108874o;
        if (rjx == null) {
            atzj atzj = this.f108862c;
            if (atzj != null) {
                atzj.mo50332b(this);
            } else {
                throw new IllegalStateException("client unavailable");
            }
        } else {
            rjx.mo24733b((asin) this);
        }
        this.f108870k.mo50310a(this);
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("SelectVerificationActy.otpAutofillDialog");
        if (findFragmentByTag != null) {
            ((DialogFragment) findFragmentByTag).dismissAllowingStateLoss();
        }
        this.f108858D = false;
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        registerReceiver(this.f108876q, new IntentFilter("com.google.android.gms.tapandpay.ACTION_CARD_ART_DOWNLOADED"));
        mo59471j();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        registerReceiver(this.f108877r, new IntentFilter(intentFilter));
        if (!isFinishing()) {
            atzf atzf = this.f108871l;
            if (atzf != null) {
                atzf.mo50327a();
            }
            this.f108870k.mo50137a(this, "com.google.android.gms.tapandpay.tokenization.TokenizePanService");
            rjx rjx = this.f108874o;
            if (rjx != null) {
                rjx.mo24720a((asin) this);
            }
            atzj atzj = this.f108862c;
            if (atzj != null) {
                atzj.mo50331a(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onResumeFragments() {
        super.onResumeFragments();
        this.f108858D = true;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        boolean z;
        super.onSaveInstanceState(bundle);
        btjx btjx = this.f108866g;
        if (btjx != null) {
            bundle.putByteArray("selected_activation_method", btjx.mo73642k());
        }
        boolean z2 = true;
        if (this.f108856B.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        bundle.putBoolean("enter_code_view_visible", z);
        if (this.f108855A.getVisibility() != 0) {
            z2 = false;
        }
        bundle.putBoolean("continue_button_visible", z2);
        bundle.putBoolean("is_autofill_consent_granted", this.f108868i);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        asjl.m74236a(this, "Select Verification Method");
    }

    /* renamed from: b */
    public final void mo59464b(btnf btnf) {
        mo59461a((btnf != null && !btnf.f149603b.isEmpty()) ? btnf.f149603b : getString(C0126R.string.common_something_went_wrong), (btnf != null && !btnf.f149604c.isEmpty()) ? btnf.f149604c : getString(C0126R.string.tp_generic_error_content), getString(C0126R.string.common_dismiss), 202);
    }

    /* renamed from: a */
    public static String m93240a(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int length = str.length() - 1; length >= 0; length--) {
            char charAt = str.charAt(length);
            if (!Character.isDigit(charAt)) {
                break;
            }
            sb.append(charAt);
        }
        return sb.reverse().toString();
    }

    /* renamed from: a */
    public static String m93241a(String str, int i) {
        return str.substring(str.length() - i);
    }

    /* renamed from: b */
    public final void mo49541b(CardInfo cardInfo) {
        bhnh.m101202a(findViewById(C0126R.C0129id.MainContent), getString(C0126R.string.tp_card_deleted_notification, new Object[]{cardInfo.f108343d}), 0);
    }

    /* renamed from: a */
    private final void m93242a(int i, Intent intent) {
        btka btka;
        String str;
        String str2;
        String str3;
        int i2 = i;
        Intent intent2 = intent;
        mo59463a(true);
        btjx btjx = this.f108866g;
        if (btjx != null) {
            btnv a = btnv.m116964a(btjx.f149197d);
            if (a == null) {
                a = btnv.UNRECOGNIZED;
            }
            if (a == btnv.APP) {
                btjx btjx2 = this.f108866g;
                if (btjx2.f149194a == 5) {
                    btka btka2 = (btka) btjx2.f149195b;
                    if (btka2.f149216d != null) {
                        if (i2 != -1 || intent2 == null) {
                            if (i2 == -1) {
                                bnsl a2 = f108854b.mo26019b(aske.m74275a());
                                a2.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "a", 1055, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                a2.mo68405a("Issuer app result had null intent, returning");
                            } else {
                                bnsl a3 = f108854b.mo26019b(aske.m74275a());
                                a3.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "a", 1052, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                a3.mo68409a("Issuer app did not have result code OK, returning. Result code was: %s", i2);
                            }
                            this.f108867h.mo49744a(this.f108883x, this.f108865f, btka2.f149214b, btka2.f149213a, i, "", "", "");
                            return;
                        }
                        bnsl a4 = f108854b.mo26019b(aske.m74275a());
                        a4.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "a", 1070, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        a4.mo68405a("Issuer app successfully returned RESULT_OK with non-null intent");
                        btjx btjx3 = this.f108866g;
                        if (btjx3.f149194a == 5) {
                            btka = (btka) btjx3.f149195b;
                        } else {
                            btka = btka.f149211f;
                        }
                        btjz btjz = btka.f149216d;
                        if (btjz == null) {
                            btjz = btjz.f149206d;
                        }
                        bxwc bxwc = btjz.f149208a;
                        int size = bxwc.size();
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            str = null;
                            if (i4 >= size) {
                                str2 = null;
                                str3 = null;
                                break;
                            }
                            String str4 = (String) bxwc.get(i4);
                            i4++;
                            if (intent2.hasExtra(str4)) {
                                str2 = intent2.getStringExtra(str4);
                                str3 = str4;
                                break;
                            }
                        }
                        if (str2 != null) {
                            bxwc bxwc2 = btjz.f149209b;
                            int size2 = bxwc2.size();
                            int i5 = 0;
                            while (i5 < size2) {
                                int i6 = i5 + 1;
                                if (TextUtils.equals(str2, (String) bxwc2.get(i5))) {
                                    bnsl a5 = f108854b.mo26019b(aske.m74275a());
                                    a5.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "a", 1126, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    a5.mo68420a("Issuer app response value was %s and verification was approved", str2);
                                    bxwc bxwc3 = btjz.f149210c;
                                    int size3 = bxwc3.size();
                                    while (true) {
                                        if (i3 >= size3) {
                                            break;
                                        }
                                        String str5 = (String) bxwc3.get(i3);
                                        i3++;
                                        if (intent2.hasExtra(str5)) {
                                            str = intent2.getStringExtra(str5);
                                            break;
                                        }
                                    }
                                    if (str == null) {
                                        bnsl a6 = f108854b.mo26019b(aske.m74275a());
                                        a6.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "a", 1139, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        a6.mo68405a("Issuer app response has no activation code, handling error");
                                        this.f108867h.mo49744a(this.f108883x, this.f108865f, btka2.f149214b, btka2.f149213a, -1, str3, str2, "");
                                        mo59475o();
                                        return;
                                    }
                                    bnsl a7 = f108854b.mo26019b(aske.m74275a());
                                    a7.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "a", 1154, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    a7.mo68405a("Received activation code from issuer app");
                                    this.f108885z = str;
                                    this.f108867h.mo49744a(this.f108883x, this.f108865f, btka2.f149214b, btka2.f149213a, -1, str3, str2, str);
                                    return;
                                }
                                i5 = i6;
                            }
                            bnsl a8 = f108854b.mo26019b(aske.m74275a());
                            a8.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "a", 1111, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            a8.mo68420a("Issuer app response is not approved, handling error. Response was %s", str2);
                            this.f108867h.mo49744a(this.f108883x, this.f108865f, btka2.f149214b, btka2.f149213a, -1, str3, str2, "");
                            mo59475o();
                            return;
                        }
                        bnsl a9 = f108854b.mo26019b(aske.m74275a());
                        a9.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "a", 1088, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        a9.mo68405a("Issuer app has no response extra, returning");
                        this.f108867h.mo49744a(this.f108883x, this.f108865f, btka2.f149214b, btka2.f149213a, -1, "", "", "");
                        return;
                    }
                }
                bnsl bnsl = (bnsl) f108854b.mo68388c();
                bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "a", 1044, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Issuer app selected activation method is null or has null subfields");
                return;
            }
        }
        bnsl bnsl2 = (bnsl) f108854b.mo68388c();
        bnsl2.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "a", 1036, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("Activation method became null or a non-app activation method before we gotthe issuer app result, not handling issuer app result");
    }

    /* renamed from: b */
    public final void mo59465b(boolean z) {
        Intent className = new Intent().setClassName(this, "com.google.android.gms.tapandpay.tokenization.EnterVerificationCodeActivity");
        className.putExtra("extra_account_info", this.f108864e);
        className.putExtra("extra_calling_package", this.f108881v);
        boolean z2 = false;
        className.putExtra("EXTRA_USE_SUW_UI", getIntent().getBooleanExtra("EXTRA_USE_SUW_UI", false));
        className.putExtra("card_info", this.f108883x);
        byte[] bArr = this.f108882w;
        if (bArr != null) {
            className.putExtra("activation_receipt", bArr);
        }
        className.putExtra("session_id", this.f108865f);
        className.putExtra("activation_method", this.f108866g.mo73642k());
        className.putExtra("nodeId", this.f108860F);
        btnv a = btnv.m116964a(this.f108866g.f149197d);
        if (a == null) {
            a = btnv.UNRECOGNIZED;
        }
        if (a == btnv.ISSUER_STATEMENT) {
            z2 = true;
        } else if (z) {
            z2 = true;
        }
        className.putExtra("should_start_on_interstitial", z2);
        className.putExtra("is_redirect", z);
        className.putExtra("is_autofill_consent_granted", this.f108868i);
        CardInfo cardInfo = this.f108883x;
        bepr bepr = (bepr) this.f108880u.getDrawable();
        Bitmap bitmap = null;
        if (bepr != null && bepr.f112005h) {
            Drawable drawable = bepr.f112004g;
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            }
        }
        Uri uri = cardInfo.f108347h;
        if (!(uri == null || bitmap == null)) {
            asju.f89098a = new asjt(uri, bitmap);
        }
        className.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
        if (z) {
            startActivityForResult(className, 102);
        } else {
            startActivityForResult(className, 101);
        }
    }

    /* renamed from: a */
    private final void m93243a(Boolean bool) {
        VerificationMethodView l = mo59472l();
        if (l != null) {
            mo59460a(l, bool);
            return;
        }
        bnsl bnsl = (bnsl) f108854b.mo68388c();
        bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "a", 1633, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("There is no checked method on OTP autofill consent dialog dismissal");
    }

    /* renamed from: a */
    public final aucb mo49538a(CardInfo cardInfo) {
        rjx rjx = this.f108873n;
        if (rjx != null) {
            return rjx.mo24749h(cardInfo.f108340a);
        }
        atzj atzj = this.f108862c;
        if (atzj != null) {
            String str = cardInfo.f108340a;
            Bundle bundle = new Bundle();
            bundle.putString("billingCardId", str);
            aucf aucf = new aucf();
            ((atzg) atzj.mo50330a("deleteAbToken", bundle, auaa.f91308c.mo66854a())).f91220b = new atzi(aucf);
            return aucf.f91388a;
        }
        throw new IllegalStateException("No clients available");
    }

    /* renamed from: a */
    public final void mo49193a() {
        mo59468g();
    }

    /* renamed from: a */
    public final void mo50173a(int i, int i2) {
        boolean z = false;
        switch (i2) {
            case ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR:
            case 203:
                if (i == -2) {
                    setResult(0);
                    finish();
                    return;
                } else if (i == -1) {
                    mo59474n();
                    return;
                } else {
                    return;
                }
            case 202:
                setResult(2);
                finish();
                return;
            case 204:
                if (i == -1) {
                    z = true;
                }
                this.f108868i = z;
                m93243a(Boolean.valueOf(z));
                return;
            case 205:
                this.f108868i = false;
                m93243a((Boolean) null);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo59457a(CompoundButton compoundButton) {
        this.f108855A.setVisibility(0);
        for (int i = 0; i < this.f108857C.getChildCount(); i++) {
            VerificationMethodView verificationMethodView = (VerificationMethodView) this.f108857C.getChildAt(i);
            verificationMethodView.setChecked(((CompoundButton) verificationMethodView.findViewById(C0126R.C0129id.RadioButton)) == compoundButton);
        }
    }

    /* renamed from: a */
    public final void mo59458a(btnf btnf) {
        String string = (btnf != null && !stm.m36302d(btnf.f149604c)) ? btnf.f149604c : getString(C0126R.string.tp_generic_error_content);
        String string2 = (btnf != null && !stm.m36302d(btnf.f149603b)) ? btnf.f149603b : getString(C0126R.string.common_something_went_wrong);
        if (this.f108858D) {
            auar auar = new auar();
            auar.f91333a = ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR;
            auar.f91334b = string2;
            auar.f91335c = string;
            auar.f91336d = getString(C0126R.string.common_try_again);
            auar.f91337e = getString(C0126R.string.common_cancel);
            auar.f91339g = C0126R.C0127drawable.tp_wear_button_retry;
            auar.f91340h = bpan.VERIFICATION_RPC_RETRY;
            auar.f91341i = this.f108864e;
            auar.mo50344a().show(getSupportFragmentManager(), "SelectVerificationActy.errorDialog");
        }
    }

    /* renamed from: a */
    public final void mo59459a(bxwf bxwf) {
        bnsl bnsl = (bnsl) f108854b.mo68388c();
        bnsl.mo68437a(bxwf);
        bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "a", 1296, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Failed to parse proto");
        setResult(2);
        finish();
    }

    /* renamed from: a */
    public final void mo59460a(VerificationMethodView verificationMethodView, Boolean bool) {
        mo59463a(false);
        try {
            this.f108870k.mo50311a(atuy.m76426a(this.f108883x.f108340a, this.f108864e, this.f108881v, this.f108882w, verificationMethodView.f108930a.mo73642k(), this.f108865f, this.f108863d));
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f108854b.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "a", 1285, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error calling SelectActivationMethod");
        }
        atam atam = this.f108867h;
        CardInfo cardInfo = this.f108883x;
        String str = this.f108865f;
        btjx btjx = verificationMethodView.f108930a;
        Boolean bool2 = verificationMethodView.f108936g;
        bxvd b = atam.mo49753b(15, cardInfo);
        bpaq a = atam.m75296a(btjx, bool2, bool);
        if (b.f164950c) {
            b.mo74035c();
            b.f164950c = false;
        }
        bpbx bpbx = (bpbx) b.f164949b;
        bpbx bpbx2 = bpbx.f135635S;
        a.getClass();
        bpbx.f135664j = a;
        bpbx.f135655a |= 128;
        atam.mo49742a((bpbx) b.mo74062i(), str);
    }

    /* renamed from: a */
    public final void mo59461a(String str, String str2, String str3, int i) {
        if (this.f108858D) {
            auar auar = new auar();
            auar.f91333a = i;
            auar.f91334b = str;
            auar.f91335c = str2;
            auar.f91340h = bpan.SELECT_VERIFICATION_ERROR;
            auar.f91336d = str3;
            auar.mo50344a().show(getSupportFragmentManager(), "SelectVerificationActy.errorDialog");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final void mo59462a(List list) {
        this.f108857C.removeAllViews();
        for (int i = 0; i < list.size(); i++) {
            VerificationMethodView verificationMethodView = (VerificationMethodView) getLayoutInflater().inflate((int) C0126R.C0128layout.tp_verification_method_item, (ViewGroup) null, true);
            String str = this.f108884y;
            CardInfo cardInfo = this.f108883x;
            verificationMethodView.f108930a = (btjx) list.get(i);
            verificationMethodView.f108931b = str;
            verificationMethodView.f108932c = cardInfo;
            if (verificationMethodView.mo59487a()) {
                verificationMethodView.setOnClickListener(new atqw(this, verificationMethodView));
                ((CompoundButton) verificationMethodView.findViewById(C0126R.C0129id.RadioButton)).setOnCheckedChangeListener(new atqx(this));
                this.f108857C.addView(verificationMethodView);
            } else {
                bnsl bnsl = (bnsl) f108854b.mo68388c();
                bnsl.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "a", 816, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Server returned unrecognized activation method");
            }
        }
        if (this.f108857C.getChildCount() <= 0) {
            bnsl bnsl2 = (bnsl) f108854b.mo68388c();
            bnsl2.mo68432a("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodChimeraActivity", "a", 827, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Received list of not a single recognized activation method");
        } else if (this.f108855A.getVisibility() == 0) {
            VerificationMethodView verificationMethodView2 = (VerificationMethodView) this.f108857C.getChildAt(0);
            verificationMethodView2.setChecked(true);
            verificationMethodView2.setAccessibilityLiveRegion(1);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        asmj asmj = (asmj) rkk;
        if (asmj != null && asmj.mo7183bo().mo17710c()) {
            CardInfo[] cardInfoArr = asmj.mo49241b().f108369a;
            for (CardInfo cardInfo : cardInfoArr) {
                if (cardInfo.f108340a.equals(this.f108883x.f108340a)) {
                    int i = cardInfo.f108345f.f108459b;
                    if (i == 5 || i == 6) {
                        setResult(-1);
                        finish();
                    } else if (i == 4) {
                        setResult(0);
                        finish();
                    } else if (i == 1) {
                        setResult(444, new Intent().putExtra("token_status", cardInfo.f108345f));
                        finish();
                    }
                    this.f108883x = cardInfo;
                    mo59469h();
                    return;
                }
            }
            setResult(0);
            finish();
        }
    }

    /* renamed from: a */
    public final void mo59463a(boolean z) {
        if (z && !this.f108869j) {
            this.f108878s.setVisibility(8);
            this.f108879t.setVisibility(0);
            return;
        }
        this.f108879t.setVisibility(8);
        this.f108878s.setVisibility(0);
    }
}
