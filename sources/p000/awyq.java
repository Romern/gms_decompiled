package p000;

import android.app.KeyguardManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysRequest;
import com.google.android.gms.wallet.intentoperation.RemoveSignatureBasedAuthPublicKeyOperation;
import com.google.android.gms.wallet.p088ui.common.FingerprintButton;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: awyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awyq extends bkdx implements View.OnClickListener, awyu, awzd, awge, bjwp {

    /* renamed from: C */
    private final bkip f95286C = new bkip();

    /* renamed from: D */
    private Intent f95287D;

    /* renamed from: E */
    private Intent f95288E;

    /* renamed from: F */
    private awfr f95289F;

    /* renamed from: G */
    private awgf f95290G;

    /* renamed from: H */
    private View f95291H;

    /* renamed from: I */
    private bmcf f95292I;

    /* renamed from: J */
    private bmch f95293J;

    /* renamed from: K */
    private bmck f95294K;

    /* renamed from: L */
    private bmcr f95295L;

    /* renamed from: M */
    private int f95296M;

    /* renamed from: N */
    private boolean f95297N;

    /* renamed from: O */
    private boolean f95298O;

    /* renamed from: P */
    private String f95299P;

    /* renamed from: Q */
    private final List f95300Q = new ArrayList();

    /* renamed from: R */
    private final List f95301R = new ArrayList();

    /* renamed from: S */
    private final List f95302S = new ArrayList();

    /* renamed from: a */
    bkbn f95303a;

    /* renamed from: b */
    bkbn f95304b;

    /* renamed from: c */
    bkbn f95305c;

    /* renamed from: d */
    bkbn f95306d;

    /* renamed from: e */
    FingerprintButton f95307e;

    /* renamed from: f */
    View f95308f;

    /* renamed from: g */
    ViewGroup f95309g;

    /* renamed from: h */
    ViewGroup f95310h;

    /* renamed from: i */
    ViewGroup f95311i;

    /* renamed from: j */
    ViewGroup f95312j;

    /* renamed from: k */
    awyv f95313k;

    /* renamed from: l */
    axby f95314l;

    /* renamed from: m */
    public bkbn f95315m;

    /* renamed from: n */
    public awyo f95316n;

    /* renamed from: o */
    public awyp f95317o;

    /* renamed from: p */
    boolean f95318p = true;

    /* renamed from: q */
    boolean f95319q = true;

    /* renamed from: r */
    boolean f95320r = false;

    /* renamed from: s */
    public int f95321s = 3;

    /* renamed from: t */
    public int f95322t = 0;

    /* renamed from: u */
    public bmcc f95323u = null;

    /* renamed from: v */
    private final bjes f95324v = new bjes(18);

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010c  */
    /* renamed from: a */
    public static awyq m81545a(bmcb bmcb, int i, LogContext logContext, BuyFlowConfig buyFlowConfig) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        bmck bmck;
        bmcf bmcf;
        boolean z5 = false;
        if (bmcb == null || bmcb.f128653c.size() <= 0) {
            z = false;
        } else {
            z = true;
        }
        bmxy.m108589a(z, "Must provide an AuthType");
        if (((bmca) bmcb.f128653c.get(0)).f128646a != 7 || bmcb.f128653c.size() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        bmxy.m108588a(z2);
        if (bmcb.f128653c.size() != 1) {
            if (bmcb.f128653c.size() != 2 || (((bmca) bmcb.f128653c.get(0)).f128646a != 6 && ((bmca) bmcb.f128653c.get(0)).f128646a != 1 && ((bmca) bmcb.f128653c.get(0)).f128646a != 3)) {
                z3 = false;
                bmxy.m108589a(z3, "This type of AuthenticationForm not supported.");
                if (((bmca) bmcb.f128653c.get(0)).f128646a == 6) {
                    bmca bmca = (bmca) bmcb.f128653c.get(0);
                    if (bmca.f128646a == 6) {
                        bmcf = (bmcf) bmca.f128647b;
                    } else {
                        bmcf = bmcf.f128663i;
                    }
                    if ((bmcf.f128665a & 32) == 0 || bmcb.f128653c.size() == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                } else {
                    z4 = true;
                }
                bmxy.m108589a(z4, "Should always have backup authentication method for signature based biometrics.");
                if (((bmca) bmcb.f128653c.get(0)).f128646a == 1) {
                    bmca bmca2 = (bmca) bmcb.f128653c.get(0);
                    if (bmca2.f128646a == 1) {
                        bmck = (bmck) bmca2.f128647b;
                    } else {
                        bmck = bmck.f128698j;
                    }
                    if ((bmck.f128700a & 128) == 0 || bmcb.f128653c.size() == 2) {
                        z5 = true;
                    }
                } else {
                    z5 = true;
                }
                bmxy.m108589a(z5, "Should always have backup authentication method for signature based fingerprint.");
                awyq awyq = new awyq();
                Bundle a = bkdx.m105383a(i, bmcb, logContext);
                a.putParcelable("buyFlowConfig", buyFlowConfig);
                awyq.setArguments(a);
                return awyq;
            } else if (!(((bmca) bmcb.f128653c.get(1)).f128646a == 3 || ((bmca) bmcb.f128653c.get(1)).f128646a == 2 || ((bmca) bmcb.f128653c.get(1)).f128646a == 4 || ((bmca) bmcb.f128653c.get(1)).f128646a == 5)) {
                z3 = false;
                bmxy.m108589a(z3, "This type of AuthenticationForm not supported.");
                if (((bmca) bmcb.f128653c.get(0)).f128646a == 6) {
                }
                bmxy.m108589a(z4, "Should always have backup authentication method for signature based biometrics.");
                if (((bmca) bmcb.f128653c.get(0)).f128646a == 1) {
                }
                bmxy.m108589a(z5, "Should always have backup authentication method for signature based fingerprint.");
                awyq awyq2 = new awyq();
                Bundle a2 = bkdx.m105383a(i, bmcb, logContext);
                a2.putParcelable("buyFlowConfig", buyFlowConfig);
                awyq2.setArguments(a2);
                return awyq2;
            }
        }
        z3 = true;
        bmxy.m108589a(z3, "This type of AuthenticationForm not supported.");
        if (((bmca) bmcb.f128653c.get(0)).f128646a == 6) {
        }
        bmxy.m108589a(z4, "Should always have backup authentication method for signature based biometrics.");
        if (((bmca) bmcb.f128653c.get(0)).f128646a == 1) {
        }
        bmxy.m108589a(z5, "Should always have backup authentication method for signature based fingerprint.");
        awyq awyq22 = new awyq();
        Bundle a22 = bkdx.m105383a(i, bmcb, logContext);
        a22.putParcelable("buyFlowConfig", buyFlowConfig);
        awyq22.setArguments(a22);
        return awyq22;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awyq.a(int, boolean):void
     arg types: [int, int]
     candidates:
      awyq.a(int, bxtx):void
      awyq.a(int, java.security.Signature):void
      awyq.a(bmmv, java.util.List):void
      bkdx.a(android.os.Bundle, android.view.View):android.view.View
      bkdx.a(int, android.os.Bundle):void
      bkdx.a(bmmv, java.util.List):void
      bkdx.a(java.util.List, boolean):boolean
      bkge.a(android.os.Bundle, android.view.View):android.view.View
      bkge.a(int, android.os.Bundle):void
      bkge.a(android.view.View, java.lang.String):void
      bkbr.a(int, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      bkbr.a(android.os.Bundle, android.view.View):android.view.View
      bjxu.a(android.view.View, java.lang.String):void
      bkdb.a(int, android.os.Bundle):void
      bjwm.a(bmmv, java.util.List):void
      awge.a(int, bxtx):void
      awyq.a(int, boolean):void */
    /* renamed from: b */
    private final void m81550b(int i) {
        m81546a(i, true);
    }

    /* renamed from: c */
    private final bmcw m81551c(int i) {
        if (i == 1) {
            bmck bmck = this.f95294K;
            if (bmck == null) {
                return null;
            }
            bmcw bmcw = bmck.f128708i;
            return bmcw == null ? bmcw.f128758e : bmcw;
        } else if (i == 2) {
            bmcr bmcr = this.f95295L;
            if (bmcr == null) {
                return null;
            }
            bmcw bmcw2 = bmcr.f128737f;
            return bmcw2 == null ? bmcw.f128758e : bmcw2;
        } else if (i == 4) {
            bmcf bmcf = this.f95292I;
            if (bmcf == null || (bmcf.f128665a & 32) == 0) {
                return null;
            }
            bmcw bmcw3 = bmcf.f128671g;
            return bmcw3 == null ? bmcw.f128758e : bmcw3;
        } else {
            StringBuilder sb = new StringBuilder(45);
            sb.append("Unexpected authenticationMethod = ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: t */
    private final void m81553t() {
        if (this.f95293J != null) {
            xnn a = wzk.m42526a(getContext());
            ArrayList arrayList = new ArrayList();
            bxwc bxwc = this.f95293J.f128683d;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new PublicKeyCredentialDescriptor("public-key", ((bsnu) bxwc.get(i)).f146339a.mo73780k(), null));
            }
            xqc xqc = new xqc();
            xqc.mo30032a(this.f95293J.f128682c.mo73780k());
            xqc.mo30031a(this.f95293J.f128685f);
            xqc.f52905a = Double.valueOf((double) this.f95293J.f128684e);
            xqc.f52906b = arrayList;
            PublicKeyCredentialRequestOptions a2 = xqc.mo30030a();
            roz b = rpa.m34196b();
            b.f43472a = new xnl(a2);
            a.mo24701a(b.mo24977a()).mo50373a(new awyn(this));
            return;
        }
        throw new IllegalStateException("FidoVerificationComponent is not initialized yet");
    }

    /* renamed from: u */
    private final void m81554u() {
        int i;
        boolean z = this.f95298O;
        int i2 = 0;
        if (!z || this.f95313k != null) {
            i = 4;
        } else {
            i = 0;
        }
        bkbn bkbn = this.f95304b;
        if (bkbn == null) {
            ViewGroup viewGroup = this.f95311i;
            if (viewGroup == null || this.f95296M == 2) {
                ViewGroup viewGroup2 = this.f95310h;
                if (viewGroup2 != null && this.f95296M != 3) {
                    viewGroup2.setVisibility(i);
                } else if (this.f95314l != null && this.f95296M != 5) {
                    View view = this.f95308f;
                    if (!z) {
                        i2 = 4;
                    }
                    view.setVisibility(i2);
                }
            } else {
                viewGroup.setVisibility(i);
            }
        } else {
            bkbn.mo52710b().setVisibility(i);
        }
    }

    /* renamed from: v */
    private final void m81555v() {
        View view;
        if (this.f95298O && this.f95296M == 4) {
            bkbn bkbn = this.f95304b;
            if (bkbn != null) {
                view = bkbn.mo52710b();
            } else if (this.f95311i != null) {
                view = this.f95303a.mo52710b();
            } else {
                view = this.f95310h != null ? this.f95315m.mo52710b() : this.f95314l != null ? this.f95308f : null;
            }
            if (view == null) {
                throw new IllegalStateException("Should provide a valid secondary authentication method");
            } else if (view != this.f95308f) {
                onClick(view);
                this.f95298O = false;
            }
        }
    }

    /* renamed from: w */
    private final bxvd m81556w() {
        bxvd da = bmcl.f128709d.mo74144da();
        bmdn bmdn = this.f95294K.f128701b;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        bxtx bxtx = bmdn.f128836d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmcl bmcl = (bmcl) da.f164949b;
        bxtx.getClass();
        bmcl.f128711a |= 1;
        bmcl.f128712b = bxtx;
        return da;
    }

    /* renamed from: x */
    private final bxvd m81557x() {
        bxvd da = bmcg.f128673d.mo74144da();
        bmdn bmdn = this.f95292I.f128666b;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        bxtx bxtx = bmdn.f128836d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmcg bmcg = (bmcg) da.f164949b;
        bxtx.getClass();
        bmcg.f128675a |= 1;
        bmcg.f128676b = bxtx;
        return da;
    }

    /* renamed from: z */
    private final bxvd m81558z() {
        bxvd da = bmcs.f128739e.mo74144da();
        bmdn bmdn = this.f95295L.f128732a;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        bxtx bxtx = bmdn.f128836d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmcs bmcs = (bmcs) da.f164949b;
        bxtx.getClass();
        bmcs.f128741a |= 1;
        bmcs.f128742b = bxtx;
        return da;
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        return false;
    }

    /* renamed from: a */
    public final boolean mo52055a(bmne bmne) {
        return false;
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        return true;
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f95286C;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return Collections.emptyList();
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        ArrayList arrayList = new ArrayList(1);
        if (getView() != null && this.f95308f != null && getView().getVisibility() == 0 && this.f95308f.getVisibility() == 0) {
            arrayList.add(new bkde(this.f95314l));
        }
        return arrayList;
    }

    /* renamed from: bZ */
    public final void mo52779bZ() {
        throw new UnsupportedOperationException("UiNode doesn't support custom parents.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: ca */
    public final boolean mo52781ca() {
        return true;
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f95324v;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        boolean z = this.f124195aJ;
        bkbn bkbn = this.f95305c;
        boolean z2 = true;
        if (bkbn != null && !this.f95297N) {
            bkbn.mo52710b().setEnabled(z && !this.f95290G.f94296g);
        }
        FingerprintButton fingerprintButton = this.f95307e;
        if (fingerprintButton != null && !this.f95297N) {
            if (!z || this.f95290G.f94296g) {
                z2 = false;
            }
            fingerprintButton.setEnabled(z2);
        }
        bkbn bkbn2 = this.f95304b;
        if (bkbn2 != null) {
            bkbn2.mo52710b().setEnabled(z);
        }
        axby axby = this.f95314l;
        if (axby != null) {
            axby.mo52808n(z);
        }
        bkbn bkbn3 = this.f95303a;
        if (bkbn3 != null) {
            bkbn3.mo52710b().setEnabled(z);
        }
        bkbn bkbn4 = this.f95315m;
        if (bkbn4 != null) {
            bkbn4.mo52710b().setEnabled(z);
        }
    }

    /* renamed from: l */
    public final void mo52782l() {
        FingerprintButton fingerprintButton = this.f95307e;
        if (fingerprintButton != null) {
            fingerprintButton.mo60058a();
        }
    }

    /* renamed from: m */
    public final bmcc mo52783m() {
        if (this.f95323u == null && this.f95314l != null) {
            bxvd da = bmcc.f128656e.mo74144da();
            axby axby = this.f95314l;
            Bundle bundle = Bundle.EMPTY;
            bmjc t = axby.mo66101t();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmcc bmcc = (bmcc) da.f164949b;
            t.getClass();
            bmcc.f128660c = t;
            bmcc.f128659b = 4;
            this.f95323u = (bmcc) da.mo74062i();
        }
        return this.f95323u;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo52784n() {
        mo52768a(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo52785o() {
        mo52768a(8);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awyq.a(int, boolean):void
     arg types: [int, int]
     candidates:
      awyq.a(int, bxtx):void
      awyq.a(int, java.security.Signature):void
      awyq.a(bmmv, java.util.List):void
      bkdx.a(android.os.Bundle, android.view.View):android.view.View
      bkdx.a(int, android.os.Bundle):void
      bkdx.a(bmmv, java.util.List):void
      bkdx.a(java.util.List, boolean):boolean
      bkge.a(android.os.Bundle, android.view.View):android.view.View
      bkge.a(int, android.os.Bundle):void
      bkge.a(android.view.View, java.lang.String):void
      bkbr.a(int, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      bkbr.a(android.os.Bundle, android.view.View):android.view.View
      bjxu.a(android.view.View, java.lang.String):void
      bkdb.a(int, android.os.Bundle):void
      bjwm.a(bmmv, java.util.List):void
      awge.a(int, bxtx):void
      awyq.a(int, boolean):void */
    public final void onActivityResult(int i, int i2, Intent intent) {
        int a;
        int i3 = 0;
        if (i == 1 && (a = bmcq.m107901a(this.f95295L.f128733b)) != 0 && a == 3) {
            i2 = bjyw.m104941b(getActivity().getApplicationContext()) ? -1 : 0;
        }
        if (i2 == -1) {
            if (i == 1) {
                mo52769a(2, (Signature) null);
            } else if (i == 2) {
                bxvd da = bmcc.f128656e.mo74144da();
                bxvd da2 = bmcn.f128722c.mo74144da();
                String stringExtra = intent.getStringExtra("encodedPreauthProofToken");
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bmcn bmcn = (bmcn) da2.f164949b;
                stringExtra.getClass();
                bmcn.f128724a |= 1;
                bmcn.f128725b = stringExtra;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmcc bmcc = (bmcc) da.f164949b;
                bmcn bmcn2 = (bmcn) da2.mo74062i();
                bmcn2.getClass();
                bmcc.f128660c = bmcn2;
                bmcc.f128659b = 1;
                this.f95323u = (bmcc) da.mo74062i();
                m81546a(3, intent.getBooleanExtra("shouldPerformFingerprintAuthEnrollment", false));
            } else if (i != 3) {
            } else {
                if (intent.hasExtra("FIDO2_ERROR_EXTRA")) {
                    AuthenticatorErrorResponse a2 = AuthenticatorErrorResponse.m23451a(intent.getByteArrayExtra("FIDO2_ERROR_EXTRA"));
                    bxvd da3 = bmcc.f128656e.mo74144da();
                    bxvd da4 = bmcj.f128692e.mo74144da();
                    bxvd da5 = bmci.f128687d.mo74144da();
                    long c = (long) a2.mo18674c();
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bmci bmci = (bmci) da5.f164949b;
                    int i4 = 1 | bmci.f128689a;
                    bmci.f128689a = i4;
                    bmci.f128690b = c;
                    String str = a2.f31728b;
                    str.getClass();
                    bmci.f128689a = i4 | 2;
                    bmci.f128691c = str;
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    bmcj bmcj = (bmcj) da4.f164949b;
                    bmci bmci2 = (bmci) da5.mo74062i();
                    bmci2.getClass();
                    bmcj.f128696c = bmci2;
                    bmcj.f128694a = 2 | bmcj.f128694a;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bmcc bmcc2 = (bmcc) da3.f164949b;
                    bmcj bmcj2 = (bmcj) da4.mo74062i();
                    bmcj2.getClass();
                    bmcc2.f128660c = bmcj2;
                    bmcc2.f128659b = 8;
                    this.f95323u = (bmcc) da3.mo74062i();
                    List list = this.f95300Q;
                    int size = list.size();
                    while (i3 < size) {
                        this.f124196aK.mo65590a((bjwj) list.get(i3));
                        i3++;
                    }
                    return;
                }
                AuthenticatorAssertionResponse a3 = AuthenticatorAssertionResponse.m23445a(intent.getByteArrayExtra("FIDO2_RESPONSE_EXTRA"));
                bxvd da6 = bmcc.f128656e.mo74144da();
                bxvd da7 = bmcj.f128692e.mo74144da();
                bmdn bmdn = this.f95293J.f128681b;
                if (bmdn == null) {
                    bmdn = bmdn.f128831k;
                }
                bxtx bxtx = bmdn.f128836d;
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                bmcj bmcj3 = (bmcj) da7.f164949b;
                bxtx.getClass();
                bmcj3.f128694a |= 4;
                bmcj3.f128697d = bxtx;
                bxvd da8 = bsnt.f146330f.mo74144da();
                bxtx a4 = bxtx.m123261a(a3.f31721c);
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                bsnt bsnt = (bsnt) da8.f164949b;
                a4.getClass();
                bsnt.f146332a = 2 | bsnt.f146332a;
                bsnt.f146334c = a4;
                bxtx a5 = bxtx.m123261a(a3.f31719a);
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                bsnt bsnt2 = (bsnt) da8.f164949b;
                a5.getClass();
                bsnt2.f146332a |= 1;
                bsnt2.f146333b = a5;
                bxtx a6 = bxtx.m123261a(a3.f31722d);
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                bsnt bsnt3 = (bsnt) da8.f164949b;
                a6.getClass();
                bsnt3.f146332a |= 8;
                bsnt3.f146336e = a6;
                bxtx a7 = bxtx.m123261a(a3.f31720b);
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                bsnt bsnt4 = (bsnt) da8.f164949b;
                a7.getClass();
                bsnt4.f146332a |= 4;
                bsnt4.f146335d = a7;
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                bmcj bmcj4 = (bmcj) da7.f164949b;
                bsnt bsnt5 = (bsnt) da8.mo74062i();
                bsnt5.getClass();
                bmcj4.f128695b = bsnt5;
                bmcj4.f128694a |= 1;
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                bmcc bmcc3 = (bmcc) da6.f164949b;
                bmcj bmcj5 = (bmcj) da7.mo74062i();
                bmcj5.getClass();
                bmcc3.f128660c = bmcj5;
                bmcc3.f128659b = 8;
                this.f95323u = (bmcc) da6.mo74062i();
                m81546a(6, false);
            }
        } else if (i2 == 0 && i == 3) {
            List list2 = this.f95301R;
            int size2 = list2.size();
            while (i3 < size2) {
                this.f124196aK.mo65590a((bjwj) list2.get(i3));
                i3++;
            }
        }
    }

    public void onClick(View view) {
        if (this.f95304b != null && view.getId() == this.f95304b.mo52710b().getId()) {
            bxvd da = bmcc.f128656e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmcc bmcc = (bmcc) da.f164949b;
            bmcc.f128659b = 3;
            bmcc.f128660c = true;
            this.f95323u = (bmcc) da.mo74062i();
            this.f95321s = 2;
            awyo awyo = this.f95316n;
            if (awyo != null) {
                awyo.mo52032D();
                FingerprintButton fingerprintButton = this.f95307e;
                if (fingerprintButton != null) {
                    fingerprintButton.mo60058a();
                }
            }
        } else if (this.f95303a != null && view.getId() == this.f95303a.mo52710b().getId()) {
            startActivityForResult(this.f95287D, 1);
        } else if (this.f95315m != null && view.getId() == this.f95315m.mo52710b().getId()) {
            startActivityForResult(this.f95288E, 2);
        } else if (this.f95305c != null && view.getId() == this.f95305c.mo52710b().getId()) {
            this.f95320r = true;
            mo52774b(true);
        } else if (this.f95306d != null && view.getId() == this.f95306d.mo52710b().getId()) {
            m81553t();
        }
    }

    public final void onPause() {
        super.onPause();
        FingerprintButton fingerprintButton = this.f95307e;
        if (fingerprintButton == null) {
            awyv awyv = this.f95313k;
            if (awyv != null) {
                awyv.f95331d = null;
            }
        } else {
            fingerprintButton.mo60060a((awzd) null);
        }
        this.f95290G.mo52120a(null);
        mo52774b(false);
    }

    public final void onResume() {
        super.onResume();
        this.f95290G.mo52120a(this);
        FingerprintButton fingerprintButton = this.f95307e;
        if (fingerprintButton == null) {
            awyv awyv = this.f95313k;
            if (awyv != null) {
                awyv.f95331d = this;
            }
        } else {
            fingerprintButton.mo60060a(this);
        }
        mo52774b(this.f95318p);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f95290G.mo52120a(null);
        bundle.putBoolean("showSecondaryAuthentication", this.f95298O);
        bundle.putInt("authenticationStatus", this.f95321s);
        bundle.putInt("authenticationMethod", this.f95322t);
        bjvp.m104736a(bundle, "authenticationFormValue", this.f95323u);
        bundle.putBoolean("isAuthenticationEnabled", this.f95318p);
        bundle.putBoolean("shouldRunBiometricAuthentication", this.f95320r);
        FingerprintButton fingerprintButton = this.f95307e;
        if (fingerprintButton != null) {
            fingerprintButton.mo60060a((awzd) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmcb.f128649e.mo74142c(7);
    }

    /* renamed from: q */
    public final void mo52788q() {
        List list = this.f95302S;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            bjwj bjwj = (bjwj) list.get(i);
            if (this.f124196aK.mo65593b(bjwj) && bjwj.f123509a.f130095e) {
                z = true;
            }
        }
        this.f95321s = 1;
        awyo awyo = this.f95316n;
        if (awyo != null && !z) {
            awyo.mo52032D();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        mo65884y();
        bmdn bmdn = ((bmcb) this.f124069w).f128652b;
        return bmdn == null ? bmdn.f128831k : bmdn;
    }

    /* renamed from: b */
    public final void mo52773b() {
        if (!this.f95298O) {
            this.f95298O = true;
            m81554u();
        }
    }

    /* renamed from: b */
    public final void mo52774b(boolean z) {
        if (this.f95313k != null) {
            boolean z2 = true;
            boolean z3 = !this.f95320r ? false : z && !this.f95298O;
            if (getActivity() != null) {
                Activity activity = getActivity();
                if (this.f95305c == null && z3) {
                    z2 = false;
                }
                activity.setVisible(z2);
            }
            if (z3) {
                awyv awyv = this.f95313k;
                awyv.f95332e = new CancellationSignal();
                adzt adzt = new adzt(Looper.getMainLooper());
                adzt.getClass();
                awyr awyr = new awyr(adzt);
                BiometricPrompt build = new BiometricPrompt.Builder(awyv.f95328a).setTitle(awyv.f95329b.f128667c).setSubtitle(awyv.f95329b.f128668d).setDescription(awyv.f95329b.f128669e).setNegativeButton(awyv.f95329b.f128670f, awyr, new awys(awyv)).build();
                awyt awyt = new awyt(awyv);
                BiometricPrompt.CryptoObject cryptoObject = awyv.f95330c;
                if (cryptoObject != null) {
                    build.authenticate(cryptoObject, awyv.f95332e, awyr, awyt);
                } else {
                    build.authenticate(awyv.f95332e, awyr, awyt);
                }
            } else {
                awyv awyv2 = this.f95313k;
                CancellationSignal cancellationSignal = awyv2.f95332e;
                if (cancellationSignal != null && !cancellationSignal.isCanceled()) {
                    awyv2.f95332e.cancel();
                }
            }
        } else {
            FingerprintButton fingerprintButton = this.f95307e;
            if (fingerprintButton != null) {
                fingerprintButton.f110444j = z;
                fingerprintButton.mo60063b();
            }
        }
    }

    /* renamed from: c */
    private final void m81552c(String str) {
        this.f95298O = true;
        this.f95307e.mo60061a(str);
        this.f95307e.setEnabled(true ^ this.f95297N);
    }

    /* renamed from: c */
    public final void mo52780c() {
        this.f95320r = false;
        mo52774b(false);
        if (!this.f95298O) {
            this.f95298O = true;
            m81554u();
            m81555v();
        }
    }

    /* renamed from: a */
    private final void m81546a(int i, boolean z) {
        awyp awyp;
        this.f95322t = i;
        if (z) {
            bmcb bmcb = (bmcb) this.f124069w;
            if (!((bmcb.f128651a & 2) == 0 || (awyp = this.f95317o) == null)) {
                bmct bmct = bmcb.f128654d;
                if (bmct == null) {
                    bmct = bmct.f128745b;
                }
                awyp.mo52053a(new SetUpBiometricAuthenticationKeysRequest(bmct.mo73642k()));
                return;
            }
        }
        mo52788q();
    }

    /* renamed from: a */
    private final void m81547a(bmcm bmcm) {
        boolean z;
        boolean z2;
        boolean z3;
        bmdb bmdb;
        int i;
        bmcm bmcm2 = bmcm;
        boolean z4 = true;
        if ((bmcm2.f128716a & 4) == 0) {
            z = false;
        } else {
            z = true;
        }
        if ((((bmcb) this.f124069w).f128651a & 2) == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z == z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        bmxy.m108589a(z3, "gaia_pin_form.enroll_signature_based_auth_confirmation_dialog and setup_signature_based_auth must be both present if any one exists");
        this.f95288E = axcz.m82344a(getContext(), mo65980at(), (BuyFlowConfig) getArguments().getParcelable("buyFlowConfig"), bmcm2);
        this.f95310h = (ViewGroup) this.f95291H.findViewById(C0126R.C0129id.gaia_pin_button_container);
        bmdb bmdb2 = bmcm2.f128718c;
        if (bmdb2 != null) {
            bmdb = bmdb2;
        } else {
            bmdb = bmdb.f128767k;
        }
        int a = bmda.m107911a(bmdb.f128777i);
        if (a != 0) {
            i = a;
        } else {
            i = 1;
        }
        bkbn a2 = bkbs.m105282a(bmdb, i, this.f123962aG, this.f124196aK, mo65980at(), this.f123963aH, this.f95310h, 0, 0, bjxv.m104862d().mo65614a(), true, false);
        this.f95315m = a2;
        a2.mo52710b().setOnClickListener(this);
        FingerprintButton fingerprintButton = this.f95307e;
        if (fingerprintButton != null) {
            if (this.f95296M == 3) {
                z4 = false;
            }
            fingerprintButton.mo60062a(z4);
        }
        if (this.f95296M == 3) {
            this.f95310h.setVisibility(0);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.b(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.b(int, int):void
      bmxy.b(boolean, java.lang.Object):void */
    /* renamed from: a */
    private final void m81548a(bmcr bmcr) {
        bmdb bmdb;
        int i;
        int i2 = Build.VERSION.SDK_INT;
        boolean z = true;
        bmxy.m108601b(true, (Object) "LockscreenForm is only applicable over 21");
        this.f95295L = bmcr;
        int a = bmcq.m107901a(bmcr.f128733b);
        if (a != 0 && a == 3) {
            this.f95287D = new Intent("android.app.action.SET_NEW_PASSWORD");
        } else {
            this.f95287D = ((KeyguardManager) getContext().getSystemService("keyguard")).createConfirmDeviceCredentialIntent(bmcr.f128735d, bmcr.f128736e);
        }
        this.f95311i = (ViewGroup) this.f95291H.findViewById(C0126R.C0129id.lockscreen_button_container);
        bmdb bmdb2 = bmcr.f128734c;
        if (bmdb2 != null) {
            bmdb = bmdb2;
        } else {
            bmdb = bmdb.f128767k;
        }
        bmdb bmdb3 = bmcr.f128734c;
        if (bmdb3 == null) {
            bmdb3 = bmdb.f128767k;
        }
        int a2 = bmda.m107911a(bmdb3.f128777i);
        if (a2 != 0) {
            i = a2;
        } else {
            i = 1;
        }
        bkbn a3 = bkbs.m105282a(bmdb, i, this.f123962aG, this.f124196aK, mo65980at(), this.f123963aH, this.f95311i, 0, 0, bjxv.m104862d().mo65614a(), true, false);
        this.f95303a = a3;
        a3.mo52710b().setOnClickListener(this);
        FingerprintButton fingerprintButton = this.f95307e;
        if (fingerprintButton != null) {
            if (this.f95296M == 2) {
                z = false;
            }
            fingerprintButton.mo60062a(z);
        }
        if (this.f95296M == 2) {
            this.f95311i.setVisibility(0);
        }
    }

    /* renamed from: a */
    private final void m81549a(bmjb bmjb) {
        View findViewById = this.f95291H.findViewById(C0126R.C0129id.username_password_form_holder);
        this.f95308f = findViewById;
        if (this.f95296M == 5) {
            findViewById.setVisibility(0);
        }
        axby axby = (axby) getChildFragmentManager().findFragmentByTag("usernamePasswordFragment");
        this.f95314l = axby;
        if (axby == null) {
            this.f95314l = axby.m82259a(bmjb, this.f123961aF, mo65980at());
            getChildFragmentManager().beginTransaction().add(C0126R.C0129id.username_password_form_holder, this.f95314l, "usernamePasswordFragment").commit();
        }
        this.f95286C.mo66032a(this.f95314l);
        this.f95286C.mo66038c();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bmjb bmjb;
        bmcm bmcm;
        bmcr bmcr;
        bmdb bmdb;
        bmdb bmdb2;
        int i;
        boolean z;
        bmdb bmdb3;
        boolean z2;
        Bundle bundle2 = bundle;
        FingerprintManager.CryptoObject cryptoObject = null;
        r3 = null;
        r3 = null;
        r3 = null;
        BiometricPrompt.CryptoObject cryptoObject2 = null;
        cryptoObject = null;
        cryptoObject = null;
        cryptoObject = null;
        if (mo65891as() == null || mo65891as().f124174a == null) {
            throw null;
        }
        this.f95290G = (awgf) mo65891as().f124174a.mo3444a(awgf.class);
        this.f95291H = layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_authentication_form, viewGroup, false);
        if (bundle2 != null) {
            this.f95298O = bundle2.getBoolean("showSecondaryAuthentication", false);
            this.f95321s = bundle2.getInt("authenticationStatus");
            this.f95322t = bundle2.getInt("authenticationMethod");
            this.f95323u = (bmcc) bjvp.m104730a(bundle2, "authenticationFormValue", (bxxk) bmcc.f128656e.mo74142c(7));
            this.f95318p = bundle2.getBoolean("isAuthenticationEnabled", true);
            this.f95320r = bundle2.getBoolean("shouldRunBiometricAuthentication", true);
        }
        this.f95289F = awfr.m79859a(getContext(), (BuyFlowConfig) getArguments().getParcelable("buyFlowConfig"));
        bmca bmca = (bmca) ((bmcb) this.f124069w).f128653c.get(0);
        int i2 = bmca.f128646a;
        if (i2 == 6) {
            this.f95296M = 4;
            bmcf bmcf = (bmcf) bmca.f128647b;
            this.f95292I = bmcf;
            if ((bmcf.f128665a & 32) != 0) {
                bmcw bmcw = bmcf.f128671g;
                if (bmcw == null) {
                    bmcw = bmcw.f128758e;
                }
                int a = bmce.m107889a(bmcw.f128761b);
                if (a == 0) {
                    z2 = true;
                } else if (a == 2) {
                    Signature b = this.f95289F.mo52107b(2);
                    if (b != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        cryptoObject2 = new BiometricPrompt.CryptoObject(b);
                    }
                } else {
                    z2 = true;
                }
                if (!z2) {
                    this.f95297N = true;
                    this.f95298O = true;
                } else {
                    this.f95297N = false;
                }
            }
            this.f95313k = new awyv(getActivity(), cryptoObject2, bmcf);
            if ((bmcf.f128665a & 64) != 0) {
                this.f95312j = (ViewGroup) this.f95291H.findViewById(C0126R.C0129id.trigger_biometric_button_container);
                bmdb bmdb4 = bmcf.f128672h;
                if (bmdb4 != null) {
                    bmdb3 = bmdb4;
                } else {
                    bmdb3 = bmdb.f128767k;
                }
                int a2 = bmda.m107911a(bmdb3.f128777i);
                bkbn a3 = bkbs.m105282a(bmdb3, a2 != 0 ? a2 : 1, this.f123962aG, this.f124196aK, mo65980at(), this.f123963aH, this.f95312j, 0, 0, bjxv.m104862d().mo65614a(), true, false);
                this.f95305c = a3;
                a3.mo52710b().setOnClickListener(this);
                this.f95312j.setVisibility(0);
                this.f95319q = false;
            } else {
                this.f95320r = true;
            }
        } else if (i2 == 1) {
            this.f95296M = 1;
            bmck bmck = (bmck) bmca.f128647b;
            this.f95294K = bmck;
            FingerprintButton fingerprintButton = (FingerprintButton) this.f95291H.findViewById(C0126R.C0129id.fingerprint_button);
            this.f95307e = fingerprintButton;
            fingerprintButton.setVisibility(0);
            this.f95307e.mo60060a(this);
            this.f95307e.f110442h = mo65980at();
            if ((bmck.f128700a & 128) != 0) {
                bmcw bmcw2 = bmck.f128708i;
                if (bmcw2 == null) {
                    bmcw2 = bmcw.f128758e;
                }
                this.f95299P = bmcw2.f128762c;
                bmcw bmcw3 = bmck.f128708i;
                if (bmcw3 == null) {
                    bmcw3 = bmcw.f128758e;
                }
                int a4 = bmce.m107889a(bmcw3.f128761b);
                if (a4 == 0) {
                    z = true;
                } else if (a4 == 2) {
                    Signature b2 = this.f95289F.mo52107b(2);
                    if (b2 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        cryptoObject = new FingerprintManager.CryptoObject(b2);
                    }
                } else {
                    z = true;
                }
                if (!z) {
                    this.f95297N = true;
                    m81552c(this.f95299P);
                } else {
                    this.f95297N = false;
                }
            }
            FingerprintButton fingerprintButton2 = this.f95307e;
            fingerprintButton2.f110446l = cryptoObject;
            fingerprintButton2.f110441g = bmck;
            fingerprintButton2.mo60059a(fingerprintButton2.f110440f);
            fingerprintButton2.mo60063b();
        } else if (i2 == 3) {
            this.f95296M = 5;
            m81549a((bmjb) bmca.f128647b);
        } else if (i2 == 4) {
            this.f95296M = 2;
            m81548a((bmcr) bmca.f128647b);
        } else if (i2 == 5) {
            this.f95296M = 3;
            m81547a((bmcm) bmca.f128647b);
        } else if (i2 == 7) {
            this.f95296M = 6;
            bmch bmch = (bmch) bmca.f128647b;
            this.f95293J = bmch;
            if ((bmch.f128680a & 32) != 0) {
                this.f95309g = (ViewGroup) this.f95291H.findViewById(C0126R.C0129id.fido_button_container);
                bmdb bmdb5 = bmch.f128686g;
                if (bmdb5 != null) {
                    bmdb2 = bmdb5;
                } else {
                    bmdb2 = bmdb.f128767k;
                }
                bmdb bmdb6 = bmch.f128686g;
                if (bmdb6 == null) {
                    bmdb6 = bmdb.f128767k;
                }
                int a5 = bmda.m107911a(bmdb6.f128777i);
                if (a5 != 0) {
                    i = a5;
                } else {
                    i = 1;
                }
                bkbn a6 = bkbs.m105282a(bmdb2, i, this.f123962aG, this.f124196aK, mo65980at(), this.f123963aH, this.f95309g, 0, 0, bjxv.m104862d().mo65614a(), true, false);
                this.f95306d = a6;
                a6.mo52710b().setOnClickListener(this);
                this.f95309g.setVisibility(0);
            }
        }
        if (((bmcb) this.f124069w).f128653c.size() > 1) {
            if (((bmca) ((bmcb) this.f124069w).f128653c.get(1)).f128646a == 2) {
                bmca bmca2 = (bmca) ((bmcb) this.f124069w).f128653c.get(1);
                if (bmca2.f128646a == 2) {
                    bmdb = (bmdb) bmca2.f128647b;
                } else {
                    bmdb = bmdb.f128767k;
                }
                bkbn bkbn = (bkbn) this.f95291H.findViewById(C0126R.C0129id.use_skip_authentication_button);
                this.f95304b = bkbn;
                bkbn.mo52707a(bmdb);
                this.f95304b.mo65787a(mo65980at());
                this.f95304b.mo52703a().setTextColor(bkfr.m105600c(this.f123962aG));
                this.f95304b.mo52710b().setOnClickListener(this);
                this.f95307e.mo60062a(true);
            } else if (((bmca) ((bmcb) this.f124069w).f128653c.get(1)).f128646a == 4) {
                bmca bmca3 = (bmca) ((bmcb) this.f124069w).f128653c.get(1);
                if (bmca3.f128646a == 4) {
                    bmcr = (bmcr) bmca3.f128647b;
                } else {
                    bmcr = bmcr.f128730g;
                }
                m81548a(bmcr);
            } else if (((bmca) ((bmcb) this.f124069w).f128653c.get(1)).f128646a == 5) {
                bmca bmca4 = (bmca) ((bmcb) this.f124069w).f128653c.get(1);
                if (bmca4.f128646a == 5) {
                    bmcm = (bmcm) bmca4.f128647b;
                } else {
                    bmcm = bmcm.f128714f;
                }
                m81547a(bmcm);
            } else if (((bmca) ((bmcb) this.f124069w).f128653c.get(1)).f128646a == 3) {
                bmca bmca5 = (bmca) ((bmcb) this.f124069w).f128653c.get(1);
                if (bmca5.f128646a == 3) {
                    bmjb = (bmjb) bmca5.f128647b;
                } else {
                    bmjb = bmjb.f129661l;
                }
                m81549a(bmjb);
            }
        }
        m81554u();
        m81555v();
        mo51922f();
        return this.f95291H;
    }

    /* renamed from: a */
    public final void mo52768a(int i) {
        getView().setVisibility(i);
        FingerprintButton fingerprintButton = this.f95307e;
        if (fingerprintButton != null) {
            fingerprintButton.setVisibility(i);
        }
        axby axby = this.f95314l;
        if (axby != null && i == 0) {
            axby.f95744b.mo66025a(3);
            mo51905a(9, Bundle.EMPTY);
        }
    }

    /* renamed from: a */
    public final void mo52119a(int i, bxtx bxtx) {
        bmcc bmcc;
        if (bxtx == null) {
            bmcw c = m81551c(i);
            if (c.f128763d) {
                Activity activity = getActivity();
                Context context = getContext();
                BuyFlowConfig buyFlowConfig = (BuyFlowConfig) getArguments().getParcelable("buyFlowConfig");
                int a = bmce.m107889a(c.f128761b);
                if (a == 0) {
                    a = 1;
                }
                Intent startIntent = IntentOperation.getStartIntent(context, RemoveSignatureBasedAuthPublicKeyOperation.class, "com.google.android.gms.wallet.ACTION_REMOVE_SIGNATURE_BASED_AUTH_PUBLIC_KEY");
                sef.m35071a(buyFlowConfig, startIntent, "com.google.android.gms.wallet.buyFlowConfig");
                startIntent.putExtra("EXTRA_AUTHENTICATOR", a - 1);
                activity.startService(startIntent);
            }
            if (i == 2) {
                bxvd da = bmcc.f128656e.mo74144da();
                bxvd z = m81558z();
                if (z.f164950c) {
                    z.mo74035c();
                    z.f164950c = false;
                }
                bmcs bmcs = (bmcs) z.f164949b;
                bmcs bmcs2 = bmcs.f128739e;
                bmcs.f128741a = 4 | bmcs.f128741a;
                bmcs.f128744d = true;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmcc bmcc2 = (bmcc) da.f164949b;
                bmcs bmcs3 = (bmcs) z.mo74062i();
                bmcs3.getClass();
                bmcc2.f128660c = bmcs3;
                bmcc2.f128659b = 5;
                this.f95323u = (bmcc) da.mo74062i();
                m81550b(2);
            } else {
                if (i != 4) {
                    m81552c(this.f95299P);
                } else {
                    this.f95298O = true;
                }
                m81554u();
                m81555v();
            }
        } else {
            if (i == 1) {
                bxvd da2 = bmcc.f128656e.mo74144da();
                bxvd w = m81556w();
                if (w.f164950c) {
                    w.mo74035c();
                    w.f164950c = false;
                }
                bmcl bmcl = (bmcl) w.f164949b;
                bmcl bmcl2 = bmcl.f128709d;
                bxtx.getClass();
                bmcl.f128711a |= 2;
                bmcl.f128713c = bxtx;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bmcc bmcc3 = (bmcc) da2.f164949b;
                bmcl bmcl3 = (bmcl) w.mo74062i();
                bmcl3.getClass();
                bmcc3.f128660c = bmcl3;
                bmcc3.f128659b = 2;
                bmcc = (bmcc) da2.mo74062i();
            } else if (i == 2) {
                bxvd da3 = bmcc.f128656e.mo74144da();
                bxvd z2 = m81558z();
                if (z2.f164950c) {
                    z2.mo74035c();
                    z2.f164950c = false;
                }
                bmcs bmcs4 = (bmcs) z2.f164949b;
                bmcs bmcs5 = bmcs.f128739e;
                bxtx.getClass();
                bmcs4.f128741a = 2 | bmcs4.f128741a;
                bmcs4.f128743c = bxtx;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bmcc bmcc4 = (bmcc) da3.f164949b;
                bmcs bmcs6 = (bmcs) z2.mo74062i();
                bmcs6.getClass();
                bmcc4.f128660c = bmcs6;
                bmcc4.f128659b = 5;
                bmcc = (bmcc) da3.mo74062i();
            } else if (i == 4) {
                bxvd da4 = bmcc.f128656e.mo74144da();
                bxvd x = m81557x();
                if (x.f164950c) {
                    x.mo74035c();
                    x.f164950c = false;
                }
                bmcg bmcg = (bmcg) x.f164949b;
                bmcg bmcg2 = bmcg.f128673d;
                bxtx.getClass();
                bmcg.f128675a = 2 | bmcg.f128675a;
                bmcg.f128677c = bxtx;
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                bmcc bmcc5 = (bmcc) da4.f164949b;
                bmcg bmcg3 = (bmcg) x.mo74062i();
                bmcg3.getClass();
                bmcc5.f128660c = bmcg3;
                bmcc5.f128659b = 7;
                bmcc = (bmcc) da4.mo74062i();
            } else {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Unexpected authenticationMethod = ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            this.f95323u = bmcc;
            m81550b(i);
        }
        mo51922f();
    }

    /* renamed from: a */
    public final void mo52769a(int i, Signature signature) {
        int a;
        bmcw c = m81551c(i);
        if (c == null || (a = bmce.m107889a(c.f128761b)) == 0 || a != 3 || (signature = this.f95289F.mo52107b(3)) != null) {
            Signature signature2 = signature;
            if (c == null || signature2 == null) {
                if (i == 2) {
                    bxvd da = bmcc.f128656e.mo74144da();
                    bxvd z = m81558z();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bmcc bmcc = (bmcc) da.f164949b;
                    bmcs bmcs = (bmcs) z.mo74062i();
                    bmcs.getClass();
                    bmcc.f128660c = bmcs;
                    bmcc.f128659b = 5;
                    this.f95323u = (bmcc) da.mo74062i();
                } else if (i != 4) {
                    bxvd da2 = bmcc.f128656e.mo74144da();
                    bxvd w = m81556w();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bmcc bmcc2 = (bmcc) da2.f164949b;
                    bmcl bmcl = (bmcl) w.mo74062i();
                    bmcl.getClass();
                    bmcc2.f128660c = bmcl;
                    bmcc2.f128659b = 2;
                    this.f95323u = (bmcc) da2.mo74062i();
                } else {
                    bxvd da3 = bmcc.f128656e.mo74144da();
                    bxvd x = m81557x();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bmcc bmcc3 = (bmcc) da3.f164949b;
                    bmcg bmcg = (bmcg) x.mo74062i();
                    bmcg.getClass();
                    bmcc3.f128660c = bmcg;
                    bmcc3.f128659b = 7;
                    this.f95323u = (bmcc) da3.mo74062i();
                }
                m81550b(i);
                return;
            }
            awgf awgf = this.f95290G;
            awfr awfr = this.f95289F;
            byte[] k = bxtx.m123258a(c.f128760a).mo73780k();
            awgf.f94296g = true;
            spn.m35857a(new awgd(awgf, awgf.f26825a, awfr, k, signature2, i), new Void[0]);
            return;
        }
        mo52119a(i, (bxtx) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo52770a(PendingIntent pendingIntent) {
        try {
            startIntentSenderForResult(pendingIntent.getIntentSender(), 3, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e) {
            List list = this.f95300Q;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.f124196aK.mo65590a((bjwj) list.get(i));
            }
        }
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        int a = bmmb.m108166a(bmmv.f130058d);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 36) {
            super.mo51910a(bmmv, list);
            return;
        }
        int i = this.f95296M;
        if (i == 6) {
            m81553t();
            return;
        }
        StringBuilder sb = new StringBuilder(84);
        sb.append("START_AUTHENTICATION resulting action is not yet supported for auth type ");
        sb.append(i);
        throw new UnsupportedOperationException(sb.toString());
    }

    /* renamed from: a */
    public final void mo52771a(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bjwj bjwj = (bjwj) arrayList.get(i);
            int a = bmna.m108191a(bjwj.f123509a.f130094d);
            int i2 = 1;
            if (a == 0) {
                a = 1;
            }
            switch (a - 1) {
                case 20:
                    this.f95300Q.add(bjwj);
                    break;
                case 21:
                    this.f95301R.add(bjwj);
                    break;
                case 22:
                    this.f95302S.add(bjwj);
                    break;
                default:
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[1];
                    int a2 = bmna.m108191a(bjwj.f123509a.f130094d);
                    if (a2 != 0) {
                        i2 = a2;
                    }
                    objArr[0] = Integer.valueOf(i2 - 1);
                    throw new IllegalArgumentException(String.format(locale, "Unsupported trigger type: %s", objArr));
            }
        }
    }

    /* renamed from: a */
    public final void mo52772a(boolean z) {
        this.f95318p = z;
        mo52774b(z);
    }
}
