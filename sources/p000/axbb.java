package p000;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.ocr.CreditCardOcrResult;
import com.google.android.gms.wallet.analytics.events.CreditCardEntryLaunchedEvent;
import com.google.android.gms.wallet.analytics.events.OrchestrationDependentEvent;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.common.FormEditText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: axbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axbb extends bkdx implements bkey, bjwt {

    /* renamed from: a */
    public axbe f95616a;

    /* renamed from: b */
    public axaz f95617b;

    /* renamed from: c */
    public bjzo f95618c;

    /* renamed from: d */
    public axbt f95619d;

    /* renamed from: e */
    final ArrayList f95620e = new ArrayList(3);

    /* renamed from: f */
    private View f95621f;

    /* renamed from: g */
    private View f95622g;

    /* renamed from: h */
    private final bkip f95623h = new bkip();

    /* renamed from: i */
    private boolean f95624i;

    /* renamed from: j */
    private boolean f95625j;

    /* renamed from: k */
    private String f95626k;

    /* renamed from: l */
    private String f95627l;

    /* renamed from: m */
    private bpis f95628m = bpis.FLOW_TYPE_UNKNOWN;

    /* renamed from: n */
    private final bjes f95629n = new bjes(1650);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        this.f95621f = layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_credit_card_form, viewGroup, false);
        axbe axbe = (axbe) getChildFragmentManager().findFragmentByTag("creditCardExpandedFieldFragment");
        this.f95616a = axbe;
        if (axbe == null) {
            int i = this.f123961aF;
            String str2 = this.f95627l;
            LogContext at = mo65980at();
            axbe axbe2 = new axbe();
            Bundle a = bkdx.m105383a(i, (bmhy) this.f124069w, at);
            a.putString("analyticsSessionId", str2);
            axbe2.setArguments(a);
            this.f95616a = axbe2;
            getChildFragmentManager().beginTransaction().add(C0126R.C0129id.credit_card_fragment_holder, this.f95616a, "creditCardExpandedFieldFragment").commit();
        }
        axbe axbe3 = this.f95616a;
        axbe3.f124196aK = this.f124196aK;
        this.f95620e.add(new bkde(axbe3));
        this.f95623h.mo66032a(this.f95616a);
        if (!this.f95624i) {
            axaz axaz = (axaz) getChildFragmentManager().findFragmentByTag("cardHolderNameFragment");
            this.f95617b = axaz;
            if (axaz == null) {
                bmhy bmhy = (bmhy) this.f124069w;
                if ((bmhy.f129505a & 16) != 0) {
                    bmia bmia = bmhy.f129512h;
                    if (bmia == null) {
                        bmia = bmia.f129522m;
                    }
                    if ((bmia.f129524a & 2) != 0) {
                        bmia bmia2 = ((bmhy) this.f124069w).f129512h;
                        if (bmia2 == null) {
                            bmia2 = bmia.f129522m;
                        }
                        str = bmia2.f129526c;
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
                bxxc bxxc = this.f124069w;
                bmdn bmdn = ((bmhy) bxxc).f129506b;
                if (bmdn == null) {
                    bmdn = bmdn.f128831k;
                }
                String str3 = bmdn.f128834b;
                bmdn bmdn2 = ((bmhy) this.f124069w).f129506b;
                if (bmdn2 == null) {
                    bmdn2 = bmdn.f128831k;
                }
                this.f95617b = axaz.m82058a(bxxc, str3, bmdn2.f128835c, 5, str, this.f123961aF, mo65980at());
                getChildFragmentManager().beginTransaction().add(C0126R.C0129id.card_holder_name_fragment_holder, this.f95617b, "cardHolderNameFragment").commit();
            }
            axaz axaz2 = this.f95617b;
            axaz2.f124196aK = this.f124196aK;
            this.f95620e.add(new bkde(axaz2));
            this.f95623h.mo66032a(this.f95617b);
        }
        bjzo bjzo = (bjzo) getChildFragmentManager().findFragmentByTag("addAddressExpandedFragment");
        this.f95618c = bjzo;
        if (bjzo == null) {
            bmbr bmbr = ((bmhy) this.f124069w).f129511g;
            if (bmbr == null) {
                bmbr = bmbr.f128572L;
            }
            this.f95618c = bjzo.m105001a(bmbr, this.f123961aF, mo65980at());
            getChildFragmentManager().beginTransaction().add(C0126R.C0129id.address_fragment_holder, this.f95618c, "addAddressExpandedFragment").commit();
        }
        bjzo bjzo2 = this.f95618c;
        bjzo2.f124196aK = this.f124196aK;
        this.f95620e.add(new bkde(bjzo2));
        this.f95623h.mo66032a(this.f95618c);
        OrchestrationViewEvent.m93828c(getActivity(), this.f95626k, this.f95618c.f123709i);
        if ((((bmhy) this.f124069w).f129505a & 32) != 0) {
            View findViewById = this.f95621f.findViewById(C0126R.C0129id.credit_card_legal_message_holder);
            this.f95622g = findViewById;
            findViewById.setVisibility(0);
            axbt axbt = (axbt) getChildFragmentManager().findFragmentById(C0126R.C0129id.credit_card_legal_message_holder);
            this.f95619d = axbt;
            if (axbt == null) {
                bmjh bmjh = ((bmhy) this.f124069w).f129513i;
                if (bmjh == null) {
                    bmjh = bmjh.f129700e;
                }
                this.f95619d = axbt.m82230a(bmjh, this.f123961aF, mo65980at());
                getChildFragmentManager().beginTransaction().add((int) C0126R.C0129id.credit_card_legal_message_holder, this.f95619d).commit();
            }
            this.f95619d.f124196aK = this.f124196aK;
            OrchestrationViewEvent.m93828c(getActivity(), this.f95626k, this.f95619d.f95735c);
        }
        this.f95618c.mo65675a(this);
        return this.f95621f;
    }

    /* renamed from: b */
    public final String mo52922b(String str) {
        return mo52806b(null) ? this.f95616a.mo52979t() : "";
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        axaz axaz;
        axbe axbe = this.f95616a;
        return (axbe == null || !axbe.mo52775bR() || (axaz = this.f95617b) == null || !axaz.mo52775bR() || this.f95618c == null) ? false : true;
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f95623h;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return null;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return this.f95620e;
    }

    /* renamed from: bY */
    public final void mo52947bY() {
        super.mo52947bY();
        axbe axbe = this.f95616a;
        if (axbe != null) {
            axbe.mo52947bY();
        }
        axaz axaz = this.f95617b;
        if (axaz != null) {
            axaz.mo52947bY();
        }
        bjzo bjzo = this.f95618c;
        if (bjzo != null) {
            bjzo.mo52947bY();
        }
        axbt axbt = this.f95619d;
        if (axbt != null) {
            axbt.mo52947bY();
        }
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f95629n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        axbe axbe = this.f95616a;
        if (axbe != null) {
            boolean z = this.f124195aJ;
            axbe.mo52808n(z);
            if (!this.f95624i) {
                this.f95617b.mo52808n(z);
            }
            this.f95618c.mo52808n(z);
            axbt axbt = this.f95619d;
            if (axbt != null) {
                axbt.mo52808n(z);
            }
        }
    }

    /* renamed from: m */
    public final int mo52971m() {
        bmik bmik = this.f95616a.f95668o;
        if (bmik == null) {
            return 0;
        }
        return bmik.f129586h;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        axaz axaz;
        if (i == 500) {
            this.f95616a.onActivityResult(500, i2, intent);
            CreditCardOcrResult a = CreditCardOcrResult.m67675a(intent);
            if (a != null && !this.f95624i) {
                this.f95617b.mo52965a(a.f81232e, 3);
                String[] strArr = a.f81241n;
                if (strArr != null && (axaz = this.f95617b) != null && this.f95616a.f95672s) {
                    List asList = Arrays.asList(strArr);
                    FormEditText formEditText = axaz.f95590a;
                    if (formEditText != null) {
                        formEditText.mo71921a(asList);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f95626k = getArguments().getString("buyFlowAnalyticsId");
        this.f95628m = (bpis) getArguments().getSerializable("flowTypeArg");
        bmhy bmhy = (bmhy) this.f124069w;
        boolean z = false;
        if (bmhy.f129518n.size() > 0 && ((bmld) bmhy.f129500o.mo14948a(Integer.valueOf(bmhy.f129518n.mo74151b(0)))) == bmld.UI_BANNER_BEHIND_CARD_LAYOUT && awfz.m79885a(rpr.m34216b(), "com.google.android.gms", "android.permission.CAMERA")) {
            z = true;
        }
        this.f95624i = z;
        if (bundle == null) {
            this.f95627l = CreditCardEntryLaunchedEvent.m93807a(getActivity(), "orchBuyFlow", awck.m79676a(getActivity()), awck.m79677b(getActivity()), this.f95628m);
            OrchestrationDependentEvent.m93822a(getActivity(), this.f95626k, this.f95627l, 1);
            return;
        }
        this.f95627l = bundle.getString("analyticsSessionId");
        this.f95625j = bundle.getBoolean("hasAppliedCreditCardInputResult");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("analyticsSessionId", this.f95627l);
        bundle.putBoolean("hasAppliedCreditCardInputResult", this.f95625j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmhy.f129503u.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        mo65884y();
        bmdn bmdn = ((bmhy) this.f124069w).f129506b;
        return bmdn == null ? bmdn.f128831k : bmdn;
    }

    /* renamed from: t */
    public final String mo52972t() {
        return this.f95616a.f95657d.getText().toString();
    }

    /* renamed from: b */
    public final void mo52058b(Intent intent) {
        this.f95616a.mo52058b(intent);
    }

    /* renamed from: a */
    public final void mo52935a(int i, int i2, boolean z) {
        axbt axbt = this.f95619d;
        if (axbt != null) {
            axbt.mo52997c(bjtv.m104615a(i));
        }
    }

    /* renamed from: a */
    public final void mo51905a(int i, Bundle bundle) {
        if ((i == 4 || i == 12) && bkde.m105359l(this.f95623h.f124307p) && !this.f95625j) {
            bmhy bmhy = (bmhy) this.f124069w;
            if ((bmhy.f129505a & 16) != 0) {
                bmia bmia = bmhy.f129512h;
                if (bmia == null) {
                    bmia = bmia.f129522m;
                }
                if (bmia.f129533j.size() > 0) {
                    int i2 = 1;
                    this.f95625j = true;
                    bmia bmia2 = ((bmhy) this.f124069w).f129512h;
                    if (bmia2 == null) {
                        bmia2 = bmia.f129522m;
                    }
                    bmik bmik = (bmik) bmia2.f129533j.get(0);
                    if (!this.f95624i && !TextUtils.isEmpty(bmik.f129585g)) {
                        int a = bmij.m108062a(bmik.f129580b);
                        if (a != 0 && a == 2) {
                            i2 = 3;
                        }
                        this.f95617b.mo52965a(bmik.f129585g, i2);
                    }
                }
            }
        }
        super.mo51905a(i, bundle);
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        axbe axbe = this.f95616a;
        if (axbe != null && axbe.mo52281a(bmas)) {
            return true;
        }
        axaz axaz = this.f95617b;
        if (axaz != null && axaz.mo52281a(bmas)) {
            return true;
        }
        bjzo bjzo = this.f95618c;
        if (bjzo == null || !bjzo.mo52281a(bmas)) {
            return false;
        }
        return true;
    }
}
