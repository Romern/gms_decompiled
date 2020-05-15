package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.nfc.NfcAdapter;
import android.os.Build;
import android.os.Bundle;
import android.support.p002v7.widget.AppCompatImageView;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.volley.toolbox.ImageLoader;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.ocr.CreditCardOcrResult;
import com.google.android.gms.wallet.analytics.events.CreditCardEntryValidationEvent;
import com.google.android.gms.wallet.analytics.events.OcrActivityLaunchedEvent;
import com.google.android.gms.wallet.analytics.events.OcrEnabledStateEvent;
import com.google.android.gms.wallet.analytics.events.OcrResultReceivedEvent;
import com.google.android.gms.wallet.p088ui.component.instrument.creditcard.CreditCardImagesView;
import com.google.android.gms.wallet.p088ui.component.instrument.creditcard.CvcHintImageView;
import com.google.android.wallet.p097ui.common.DateEditText;
import com.google.android.wallet.p097ui.common.FifeNetworkImageView;
import com.google.android.wallet.p097ui.common.FormEditText;
import com.google.android.wallet.p097ui.common.MaterialFieldLayout;
import com.google.android.wallet.p097ui.creditcard.CreditCardNumberEditText;
import com.google.android.wallet.p097ui.expander.SummaryExpanderWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: axbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axbe extends bkdx implements View.OnClickListener, View.OnFocusChangeListener, AdapterView.OnItemClickListener, bkho, bjwt, bjwu {

    /* renamed from: C */
    private final bkip f95635C = new bkip();

    /* renamed from: D */
    private SummaryExpanderWrapper f95636D;

    /* renamed from: E */
    private RelativeLayout f95637E;

    /* renamed from: F */
    private Drawable f95638F;

    /* renamed from: G */
    private View f95639G;

    /* renamed from: H */
    private View f95640H;

    /* renamed from: I */
    private Intent f95641I;

    /* renamed from: J */
    private final ArrayList f95642J = new ArrayList(3);

    /* renamed from: K */
    private final ArrayList f95643K = new ArrayList(3);

    /* renamed from: L */
    private TextView f95644L;

    /* renamed from: M */
    private bmnz f95645M = bmnz.UI_NO_NFC_INPUT;

    /* renamed from: N */
    private bjww f95646N;

    /* renamed from: O */
    private boolean f95647O = false;

    /* renamed from: P */
    private boolean f95648P = false;

    /* renamed from: Q */
    private boolean f95649Q = false;

    /* renamed from: R */
    private boolean f95650R = false;

    /* renamed from: S */
    private boolean f95651S = false;

    /* renamed from: T */
    private boolean f95652T = false;

    /* renamed from: U */
    private boolean f95653U;

    /* renamed from: a */
    View f95654a;

    /* renamed from: b */
    public CreditCardNumberEditText f95655b;

    /* renamed from: c */
    public CreditCardImagesView f95656c;

    /* renamed from: d */
    public FormEditText f95657d;

    /* renamed from: e */
    public DateEditText f95658e;

    /* renamed from: f */
    ImageView f95659f;

    /* renamed from: g */
    public FormEditText f95660g;

    /* renamed from: h */
    View f95661h;

    /* renamed from: i */
    LinearLayout f95662i;

    /* renamed from: j */
    ImageView f95663j;

    /* renamed from: k */
    akoy f95664k;

    /* renamed from: l */
    View f95665l;

    /* renamed from: m */
    MaterialFieldLayout f95666m;

    /* renamed from: n */
    boolean f95667n = false;

    /* renamed from: o */
    public bmik f95668o;

    /* renamed from: p */
    public CvcHintImageView f95669p;

    /* renamed from: q */
    boolean f95670q = true;

    /* renamed from: r */
    public boolean f95671r;

    /* renamed from: s */
    public boolean f95672s = false;

    /* renamed from: t */
    public String f95673t;

    /* renamed from: u */
    akpf f95674u;

    /* renamed from: v */
    private final bjes f95675v = new bjes(4);

    /* renamed from: B */
    private final void m82111B() {
        akoy akoy = (akoy) getFragmentManager().findFragmentById(C0126R.C0129id.credit_card_ocr_fragment);
        this.f95664k = akoy;
        if (akoy == null) {
            this.f95674u = new axbd(this);
            this.f95664k = new akoy(getActivity(), this.f95641I.getExtras(), this.f95674u);
            getFragmentManager().beginTransaction().add((int) C0126R.C0129id.credit_card_ocr_fragment, this.f95664k).commit();
            TypedArray obtainStyledAttributes = this.f123962aG.obtainStyledAttributes(new int[]{C0126R.attr.uicFormStartEndMargin});
            int i = (int) (-obtainStyledAttributes.getDimension(0, 0.0f));
            obtainStyledAttributes.recycle();
            ((LinearLayout.LayoutParams) this.f95665l.getLayoutParams()).setMargins(i, 0, i, 0);
            m82114E();
        }
        getActivity().getWindow().clearFlags(2);
        getActivity().setRequestedOrientation(1);
        bkfr.m105607d(getActivity().getWindow().getDecorView());
        bkfr.m105559a(getActivity(), this.f95654a);
        m82115a(this.f95655b);
        this.f95665l.setVisibility(0);
    }

    /* renamed from: C */
    private final boolean m82112C() {
        return getResources().getConfiguration().orientation == 1 && new bxvv(((bmhy) this.f124069w).f129518n, bmhy.f129500o).contains(bmld.UI_EMBEDDED_CAMERA);
    }

    /* renamed from: D */
    private final TextView m82113D() {
        CreditCardNumberEditText creditCardNumberEditText = this.f95655b;
        if (creditCardNumberEditText == null) {
            return null;
        }
        if (!creditCardNumberEditText.mo65798cL()) {
            return this.f95655b;
        }
        if (!this.f95658e.mo65798cL()) {
            return this.f95658e;
        }
        if (!this.f95657d.mo65798cL()) {
            return this.f95657d;
        }
        if (!this.f95671r || this.f95660g.mo65798cL()) {
            return null;
        }
        return this.f95660g;
    }

    /* renamed from: E */
    private final void m82114E() {
        View findViewById = getActivity().findViewById(C0126R.C0129id.instrument_manager_container);
        if (findViewById == null) {
            findViewById = getActivity().findViewById(C0126R.C0129id.instrument_form_holder);
        }
        awia.m79980a(this.f95665l.getParent(), findViewById);
    }

    /* renamed from: a */
    private static final void m82115a(TextView textView) {
        if (textView.getError() != null && textView.length() == 0) {
            textView.setError(null);
        }
    }

    /* renamed from: c */
    private final void m82117c(String str) {
        if (getFragmentManager().findFragmentByTag("tagNfcErrorDialog") == null) {
            bkga bkga = new bkga();
            bkga.f124182a = getString(C0126R.string.wallet_uic_nfc_error_title);
            bkga.f124183b = str;
            bkga.f124185d = this.f123961aF;
            bkga.f124184c = getString(17039370);
            bkga.mo65976a().show(getFragmentManager(), "tagNfcErrorDialog");
        }
    }

    /* renamed from: e */
    private final void m82118e(String str) {
        Fragment findFragmentByTag = getFragmentManager().findFragmentByTag(str);
        if (findFragmentByTag != null) {
            getFragmentManager().beginTransaction().remove(findFragmentByTag).commit();
        }
    }

    /* renamed from: u */
    private final void m82119u() {
        bkiy.m105892a(this.f123961aF, this.f95646N.mo65605c()).show(getFragmentManager(), "tagNfcInfoDialog");
    }

    /* renamed from: v */
    private final boolean m82120v() {
        return this.f95645M != bmnz.UI_NO_NFC_INPUT;
    }

    /* renamed from: w */
    private final void m82121w() {
        if (!m82112C()) {
            mo52808n(false);
            TextView[] textViewArr = {this.f95655b, this.f95658e, this.f95657d};
            for (int i = 0; i < 3; i++) {
                TextView textView = textViewArr[i];
                if (textView.isFocused()) {
                    textView.clearFocus();
                    m82115a(textView);
                }
            }
            m82115a(this.f95655b);
            Fragment parentFragment = getParentFragment();
            if (parentFragment instanceof axbb) {
                parentFragment.startActivityForResult(this.f95641I, 500);
            } else {
                startActivityForResult(this.f95641I, 500);
            }
            awqc.m80662a(getActivity(), new OcrActivityLaunchedEvent(this.f95673t));
            return;
        }
        m82111B();
    }

    /* renamed from: x */
    private final void m82122x() {
        View inflate = ((ViewStub) this.f95654a.findViewById(C0126R.C0129id.simple_card_form_stub)).inflate();
        this.f95655b = (CreditCardNumberEditText) inflate.findViewById(C0126R.C0129id.credit_card_number);
        this.f95658e = (DateEditText) inflate.findViewById(C0126R.C0129id.exp_date);
        this.f95666m = (MaterialFieldLayout) inflate.findViewById(C0126R.C0129id.credit_card_number_layout);
        this.f95657d = (FormEditText) inflate.findViewById(C0126R.C0129id.cvc);
        mo52774b(true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkfr.a(android.widget.TextView, boolean):void
     arg types: [android.widget.TextView, int]
     candidates:
      bkfr.a(android.content.Context, int):int
      bkfr.a(android.view.View, android.view.View):int
      bkfr.a(android.content.Context, java.lang.String):android.content.Intent
      bkfr.a(android.content.res.Resources, java.util.List):java.lang.String
      bkfr.a(java.lang.String, java.lang.String):java.lang.String
      bkfr.a(android.content.Context, android.view.View):void
      bkfr.a(android.content.Context, android.widget.Button):void
      bkfr.a(android.view.View, int):void
      bkfr.a(android.view.View, android.util.TypedValue):void
      bkfr.a(android.view.View, java.lang.CharSequence):void
      bkfr.a(android.view.View, boolean):void
      bkfr.a(android.view.ViewGroup, int):void
      bkfr.a(android.view.ViewGroup, boolean):void
      bkfr.a(android.widget.ImageView, android.content.res.ColorStateList):void
      bkfr.a(android.widget.TextView, java.lang.String):void
      bkfr.a(boolean, java.lang.Object):void
      bkfr.a(android.content.Context, bmap):boolean
      bkfr.a(android.content.Context, int[]):boolean
      bkfr.a(com.google.android.chimera.Activity, android.widget.TextView):boolean
      bkfr.a(android.widget.TextView, boolean):void */
    /* renamed from: z */
    private final void m82123z() {
        TextView textView = this.f95644L;
        if (textView != null) {
            textView.requestFocus();
            TextView textView2 = this.f95644L;
            if (textView2 instanceof EditText) {
                ((EditText) textView2).setSelection(textView2.getText().length());
            }
            bkfr.m105575a(this.f95644L, true);
            m82115a(this.f95644L);
            TextView textView3 = this.f95644L;
            CreditCardNumberEditText creditCardNumberEditText = this.f95655b;
            if (textView3 == creditCardNumberEditText) {
                creditCardNumberEditText.mo66003i();
            }
            this.f95644L = null;
        }
    }

    /* renamed from: T */
    public final ArrayList mo52820T() {
        return this.f95642J;
    }

    /* renamed from: W */
    public final long mo52837W() {
        return 0;
    }

    /* renamed from: b */
    public final String mo52922b(String str) {
        String t = mo52979t();
        if (!mo52806b((List) null) || TextUtils.isEmpty(t)) {
            return "";
        }
        return String.format(getResources().getString(C0126R.string.wallet_add_credit_card_summary_expires), t, this.f95658e.getText().toString());
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        return mo52806b((List) null);
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f95635C;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return null;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return this.f95643K;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bX */
    public final long mo52966bX() {
        bmdn bmdn = ((bmhy) this.f124069w).f129506b;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        return bmdn.f128835c;
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f95675v;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        if (this.f95639G != null) {
            boolean z = this.f124195aJ;
            ImageView imageView = this.f95663j;
            if (imageView != null) {
                stq.m36308a(imageView, z);
            }
            stq.m36308a(this.f95639G, z);
            stq.m36308a(this.f95640H, z);
            this.f95636D.setEnabled(z);
        }
    }

    /* renamed from: m */
    public final void mo52975m() {
        if (this.f95664k != null) {
            getFragmentManager().beginTransaction().remove(this.f95664k).commit();
            this.f95664k = null;
            this.f95665l.setVisibility(8);
            getActivity().setRequestedOrientation(-1);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 500) {
            mo52974a(CreditCardOcrResult.m67675a(intent), i2, intent != null ? intent.getExtras() : null);
            mo52808n(true);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onClick(View view) {
        if ((view == null || view == this.f95659f || view == this.f95662i || view == this.f95661h) && this.f95641I != null) {
            m82121w();
        } else if (view == this.f95663j && getFragmentManager().findFragmentByTag("tagNfcInfoDialog") == null) {
            m82119u();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d5 A[EDGE_INSN: B:63:0x00d5->B:33:0x00d5 ?: BREAK  , SYNTHETIC] */
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        this.f95673t = getArguments().getString("analyticsSessionId");
        Iterator it = new bxvv(((bmhy) this.f124069w).f129520r, bmhy.f129502s).iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            bmlx bmlx = bmlx.UNKNOWN_CREDIT_CARD_OCR_OPTION;
            bmld bmld = bmld.UI_NO_CAMERA_INPUT;
            bmnz bmnz = bmnz.UI_NO_NFC_INPUT;
            int ordinal = ((bmlx) it.next()).ordinal();
            if (ordinal == 1) {
                this.f95651S = true;
            } else if (ordinal == 2) {
                this.f95652T = true;
            } else if (ordinal == 3) {
                this.f95649Q = true;
            } else if (ordinal == 4) {
                this.f95672s = true;
            } else if (ordinal == 5) {
                this.f95650R = true;
            }
        }
        akoz a = awfx.m79876a(getActivity());
        a.mo39625a(mo65984ax());
        a.mo39626a(this.f95651S);
        a.mo39629b(this.f95652T);
        if (((bmhy) this.f124069w).f129518n.size() > 0) {
            bjvn.m104715a(a, (bmld) bmhy.f129500o.mo14948a(Integer.valueOf(((bmhy) this.f124069w).f129518n.mo74151b(0))), ((bmhy) this.f124069w).f129521t);
        }
        this.f95641I = a.mo39623a();
        if (NfcAdapter.getDefaultAdapter(getActivity()) != null) {
            Iterator it2 = new bxvv(((bmhy) this.f124069w).f129519p, bmhy.f129501q).iterator();
            while (true) {
                if (it2.hasNext()) {
                    break;
                }
                bmnz bmnz2 = (bmnz) it2.next();
                if (bmnz2 == bmnz.UI_SMALL_NFC_ICON || bmnz2 == bmnz.UI_NFC_DROP_DOWN_BUTTON || bmnz2 == bmnz.UI_NFC_DROP_DOWN_BUTTON_V2) {
                    this.f95645M = bmnz2;
                }
                if (it2.hasNext()) {
                }
            }
        }
        this.f95646N = m82120v() ? new bjwy(getActivity(), this) : new bjwz();
        if (bundle == null) {
            bmhy bmhy = (bmhy) this.f124069w;
            if ((bmhy.f129505a & 16) != 0) {
                bmia bmia = bmhy.f129512h;
                if (bmia == null) {
                    bmia = bmia.f129522m;
                }
                if (bmia.f129533j.size() <= 0) {
                    z = false;
                }
            } else {
                z = false;
            }
            this.f95653U = z;
            return;
        }
        this.f95668o = (bmik) bjvp.m104730a(bundle, "creditCardInputResult", (bxxk) bmik.f129577j.mo74142c(7));
        this.f95648P = bundle.getBoolean("ocrDynamiteFragmentOpen");
        this.f95653U = bundle.getBoolean("hasOcrBeenLaunched");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkfr.a(android.widget.TextView, boolean):void
     arg types: [android.widget.TextView, int]
     candidates:
      bkfr.a(android.content.Context, int):int
      bkfr.a(android.view.View, android.view.View):int
      bkfr.a(android.content.Context, java.lang.String):android.content.Intent
      bkfr.a(android.content.res.Resources, java.util.List):java.lang.String
      bkfr.a(java.lang.String, java.lang.String):java.lang.String
      bkfr.a(android.content.Context, android.view.View):void
      bkfr.a(android.content.Context, android.widget.Button):void
      bkfr.a(android.view.View, int):void
      bkfr.a(android.view.View, android.util.TypedValue):void
      bkfr.a(android.view.View, java.lang.CharSequence):void
      bkfr.a(android.view.View, boolean):void
      bkfr.a(android.view.ViewGroup, int):void
      bkfr.a(android.view.ViewGroup, boolean):void
      bkfr.a(android.widget.ImageView, android.content.res.ColorStateList):void
      bkfr.a(android.widget.TextView, java.lang.String):void
      bkfr.a(boolean, java.lang.Object):void
      bkfr.a(android.content.Context, bmap):boolean
      bkfr.a(android.content.Context, int[]):boolean
      bkfr.a(com.google.android.chimera.Activity, android.widget.TextView):boolean
      bkfr.a(android.widget.TextView, boolean):void */
    public final void onFocusChange(View view, boolean z) {
        int i = 8;
        if (view != this.f95657d) {
            CreditCardNumberEditText creditCardNumberEditText = this.f95655b;
            if (view == creditCardNumberEditText) {
                CreditCardImagesView creditCardImagesView = this.f95656c;
                if (z || creditCardNumberEditText.mo65775cO()) {
                    i = 0;
                }
                creditCardImagesView.setVisibility(i);
            }
        } else if (!this.f95671r) {
            CvcHintImageView cvcHintImageView = this.f95669p;
            if (z) {
                i = 0;
            }
            cvcHintImageView.setVisibility(i);
        }
        if (z && (view instanceof TextView)) {
            TextView textView = (TextView) view;
            awia.m80005f(textView.getContext());
            bkfr.m105575a(textView, true);
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (((bkcr) this.f95655b.getAdapter().getItem(i)).f124020c == 1) {
            m82121w();
        } else if (getFragmentManager().findFragmentByTag("tagNfcInfoDialog") == null) {
            m82119u();
        } else {
            StringBuilder sb = new StringBuilder(44);
            sb.append("Unknown DropDownItem event type: 2");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final void onPause() {
        boolean z;
        super.onPause();
        this.f95670q = this.f95646N.mo65605c();
        this.f95646N.mo65604b();
        if (this.f95664k != null) {
            z = true;
        } else {
            z = false;
        }
        this.f95648P = z;
        mo52975m();
    }

    public final void onResume() {
        super.onResume();
        this.f95646N.mo65602a();
        boolean c = this.f95646N.mo65605c();
        if (!this.f95646N.mo65606d() && !this.f95670q && c) {
            m82118e("tagNfcInfoDialog");
            m82119u();
        }
        if (this.f95648P && m82112C()) {
            m82111B();
            this.f95648P = false;
        }
        m82123z();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bjvp.m104736a(bundle, "creditCardInputResult", this.f95668o);
        bundle.putBoolean("ocrDynamiteFragmentOpen", this.f95648P);
        bundle.putBoolean("hasOcrBeenLaunched", this.f95653U);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        boolean z;
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            bmhy bmhy = (bmhy) this.f124069w;
            if ((bmhy.f129505a & 16) != 0) {
                bmia bmia = bmhy.f129512h;
                if (bmia == null) {
                    bmia = bmia.f129522m;
                }
                if (bmia.f129533j.size() > 0) {
                    bmia bmia2 = ((bmhy) this.f124069w).f129512h;
                    if (bmia2 == null) {
                        bmia2 = bmia.f129522m;
                    }
                    bmik bmik = (bmik) bmia2.f129533j.get(0);
                    int a = bmij.m108062a(bmik.f129580b);
                    int i2 = 1;
                    if (a != 0) {
                        i = a != 2 ? 1 : 3;
                    } else {
                        i = 1;
                    }
                    m82116a(bmik.f129582d, bmik.f129583e, bmik.f129584f, bmik.f129585g, i);
                    int a2 = bmij.m108062a(bmik.f129580b);
                    if (a2 != 0 && a2 == 2) {
                        boolean z2 = !TextUtils.isEmpty(bmik.f129582d);
                        if (bmik.f129583e != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Activity activity = getActivity();
                        int a3 = bmih.m108060a(bmik.f129581c);
                        if (a3 != 0) {
                            i2 = a3;
                        }
                        OcrResultReceivedEvent.m93816a(activity, awfu.m79872a(i2 - 1), true, z2, z, this.f95673t);
                    }
                }
            }
        }
        if (this.f95671r) {
            m82114E();
        }
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
    public final String mo52979t() {
        bmhu h = this.f95655b.mo66002h();
        if (h == null) {
            return "";
        }
        bmno bmno = h.f129493c;
        if (bmno == null) {
            bmno = bmno.f130138m;
        }
        String str = bmno.f130149j;
        String g = this.f95655b.mo66001g();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(g).length());
        sb.append(str);
        sb.append(" - ");
        sb.append(g);
        return sb.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.wallet.ui.creditcard.CreditCardNumberEditText.a(java.util.List, java.lang.String):bmhs
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.String, int):java.lang.String
      com.google.android.wallet.ui.common.FormEditText.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.FormEditText.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(bmnn, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(int, int):boolean
      bkdf.a(java.lang.CharSequence, boolean):void
      bjwm.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.String, int):java.lang.String
      com.google.android.wallet.ui.common.FormEditText.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.FormEditText.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(bmnn, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(int, int):boolean
      bkdf.a(java.lang.CharSequence, boolean):void
      bjwm.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void */
    /* renamed from: a */
    private final void m82116a(String str, int i, int i2, String str2, int i3) {
        int i4;
        bkfr.m105607d(getActivity().getWindow().getDecorView());
        if (!TextUtils.isEmpty(str)) {
            this.f95655b.mo71832a((CharSequence) str, i3);
            this.f95655b.mo65799cM();
            CreditCardImagesView creditCardImagesView = this.f95656c;
            if (!this.f95655b.mo65775cO()) {
                i4 = 8;
            } else {
                i4 = 0;
            }
            creditCardImagesView.setVisibility(i4);
        }
        if (!(i == 0 || i2 == 0)) {
            this.f95658e.mo71883a(Integer.toString(i), Integer.toString(i2), i3);
            this.f95658e.mo65799cM();
        }
        m82115a(this.f95657d);
        if (this.f95671r && !TextUtils.isEmpty(str2)) {
            this.f95660g.mo71832a((CharSequence) str2, i3);
        }
    }

    /* renamed from: b */
    public final void mo52058b(Intent intent) {
        if (m82120v() && !this.f95646N.mo65606d()) {
            bkiy bkiy = (bkiy) getFragmentManager().findFragmentByTag("tagNfcInfoDialog");
            mo52808n(false);
            if (bkiy != null) {
                bkiy.mo66064d();
            } else {
                m82118e("tagNfcErrorDialog");
                if (this.f95663j != null) {
                    this.f95647O = true;
                    TypedArray obtainStyledAttributes = this.f123962aG.obtainStyledAttributes(new int[]{C0126R.attr.uicNfcInProgressDrawable, C0126R.attr.uicNfcDrawable});
                    Drawable drawable = obtainStyledAttributes.getDrawable(0);
                    this.f95638F = obtainStyledAttributes.getDrawable(1);
                    obtainStyledAttributes.recycle();
                    this.f95663j.setImageDrawable(drawable);
                }
            }
            this.f95646N.mo65603a(intent);
        }
    }

    /* renamed from: e */
    public final void mo52834e(int i) {
        LinearLayout linearLayout;
        View view = this.f95639G;
        if (view != null) {
            view.setVisibility(i);
        }
        View view2 = this.f95640H;
        if (view2 != null) {
            view2.setVisibility(i);
        }
        if (this.f95668o == null && (linearLayout = this.f95662i) != null) {
            linearLayout.setVisibility(i);
        }
        if (this.f95671r) {
            if (this.f95661h != null) {
                ((LinearLayout) this.f95654a.findViewById(C0126R.C0129id.background_ocr_button_image_and_text)).setVisibility(i);
                this.f95661h.setVisibility(i);
            }
            ((LinearLayout) this.f95654a.findViewById(C0126R.C0129id.credit_card_background_shape)).setVisibility(i);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(bkce, bkdf, boolean):void
     arg types: [com.google.android.wallet.ui.creditcard.CreditCardNumberEditText, com.google.android.wallet.ui.creditcard.CreditCardNumberEditText, int]
     candidates:
      com.google.android.wallet.ui.common.FormEditText.a(int, int, int):void
      com.google.android.wallet.ui.common.FormEditText.a(bkce, bkdf, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(bkce, bkdf, boolean):void
     arg types: [com.google.android.wallet.ui.common.DateEditText, com.google.android.wallet.ui.common.DateEditText, int]
     candidates:
      com.google.android.wallet.ui.common.DateEditText.a(int, int, int):void
      com.google.android.wallet.ui.common.DateEditText.a(int, java.lang.String, java.lang.String):void
      com.google.android.wallet.ui.common.DateEditText.a(java.lang.String, java.lang.String, int):void
      com.google.android.wallet.ui.common.FormEditText.a(int, int, int):void
      com.google.android.wallet.ui.common.FormEditText.a(bkce, bkdf, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(bkce, bkdf, boolean):void
     arg types: [bkbi, com.google.android.wallet.ui.common.FormEditText, int]
     candidates:
      com.google.android.wallet.ui.common.FormEditText.a(int, int, int):void
      com.google.android.wallet.ui.common.FormEditText.a(bkce, bkdf, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.wallet.ui.creditcard.CreditCardNumberEditText.a(java.util.List, java.lang.String):bmhs
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.String, int):java.lang.String
      com.google.android.wallet.ui.common.FormEditText.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.FormEditText.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(bmnn, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(int, int):boolean
      bkdf.a(java.lang.CharSequence, boolean):void
      bjwm.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.String, int):java.lang.String
      com.google.android.wallet.ui.common.FormEditText.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.FormEditText.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(bmnn, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(int, int):boolean
      bkdf.a(java.lang.CharSequence, boolean):void
      bjwm.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        bxvd bxvd;
        bxvk bxvk;
        String str2;
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_credit_card_info, viewGroup, false);
        this.f95654a = inflate;
        this.f95636D = (SummaryExpanderWrapper) inflate.findViewById(C0126R.C0129id.credit_card_details_wrapper);
        RelativeLayout relativeLayout = (RelativeLayout) layoutInflater.inflate((int) C0126R.C0128layout.view_ocr_and_error, (ViewGroup) null, false);
        this.f95637E = relativeLayout;
        this.f95662i = (LinearLayout) relativeLayout.findViewById(C0126R.C0129id.below_card_number_ocr_button);
        this.f95665l = this.f95654a.findViewById(C0126R.C0129id.credit_card_ocr_fragment);
        this.f95667n = true;
        bmld bmld = bmld.UI_NO_CAMERA_INPUT;
        if (((bmhy) this.f124069w).f129518n.size() > 0 && this.f95641I != null) {
            bmld = (bmld) bmhy.f129500o.mo14948a(Integer.valueOf(((bmhy) this.f124069w).f129518n.mo74151b(0)));
        }
        bmlx bmlx = bmlx.UNKNOWN_CREDIT_CARD_OCR_OPTION;
        bmnz bmnz = bmnz.UI_NO_NFC_INPUT;
        int ordinal = bmld.ordinal();
        if (ordinal != 1) {
            if (ordinal != 4) {
                if (ordinal == 10) {
                    View inflate2 = ((ViewStub) this.f95654a.findViewById(C0126R.C0129id.credit_card_shape_input_stub)).inflate();
                    this.f95655b = (CreditCardNumberEditText) inflate2.findViewById(C0126R.C0129id.credit_card_number);
                    this.f95658e = (DateEditText) inflate2.findViewById(C0126R.C0129id.exp_date);
                    this.f95666m = (MaterialFieldLayout) inflate2.findViewById(C0126R.C0129id.credit_card_number_layout);
                    LinearLayout linearLayout = (LinearLayout) inflate2.findViewById(C0126R.C0129id.credit_card_background_shape);
                    mo52774b(true);
                    int i = Build.VERSION.SDK_INT;
                    linearLayout.setBackgroundResource(C0126R.C0127drawable.wallet_credit_card_input_background);
                    linearLayout.setElevation((float) getResources().getDimensionPixelSize(C0126R.dimen.wallet_credit_card_input_background_elevation));
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f95658e.getLayoutParams();
                    C1260oz.m19823b(marginLayoutParams, 0);
                    this.f95658e.setLayoutParams(marginLayoutParams);
                    View findViewById = this.f95654a.findViewById(C0126R.C0129id.background_ocr_button);
                    this.f95661h = findViewById;
                    findViewById.setOnClickListener(this);
                    this.f95661h.setVisibility(0);
                    TypedArray obtainStyledAttributes = this.f123962aG.obtainStyledAttributes(new int[]{C0126R.attr.uicFormStartEndMargin});
                    int i2 = (int) (-obtainStyledAttributes.getDimension(0, 0.0f));
                    obtainStyledAttributes.recycle();
                    ((RelativeLayout.LayoutParams) this.f95661h.getLayoutParams()).setMargins(i2, 0, i2, 0);
                    int i3 = Build.VERSION.SDK_INT;
                    this.f95671r = true;
                } else if (ordinal == 6) {
                    m82122x();
                    this.f95655b.mo71830a(1);
                    this.f95655b.setOnItemClickListener(this);
                } else if (ordinal == 7) {
                    m82122x();
                    this.f95655b.mo71830a(2);
                    this.f95655b.setOnItemClickListener(this);
                } else if (ordinal == 8) {
                    m82122x();
                    this.f95666m.mo72050b(this.f95637E);
                    this.f95662i.setOnClickListener(this);
                }
            } else if (!this.f95653U) {
                m82122x();
                m82121w();
                this.f95653U = true;
            }
            this.f95667n = false;
            m82122x();
        } else {
            m82122x();
            mo52774b(false);
            ImageView imageView = (ImageView) this.f95654a.findViewById(C0126R.C0129id.ocr_icon);
            this.f95659f = imageView;
            imageView.setOnClickListener(this);
            this.f95659f.setVisibility(0);
        }
        awqc.m80662a(getActivity(), new OcrEnabledStateEvent(this.f95667n, bmld.f129927o, this.f95673t));
        int ordinal2 = this.f95645M.ordinal();
        if (ordinal2 == 1) {
            mo52774b(false);
            ImageView imageView2 = (ImageView) this.f95654a.findViewById(C0126R.C0129id.nfc_icon);
            this.f95663j = imageView2;
            imageView2.setOnClickListener(this);
            this.f95663j.setVisibility(0);
        } else if (ordinal2 == 2) {
            this.f95655b.mo71834b(1);
            this.f95655b.setOnItemClickListener(this);
        } else if (ordinal2 == 3) {
            this.f95655b.mo71834b(2);
            this.f95655b.setOnItemClickListener(this);
        }
        this.f95636D.mo72161a(this, C0126R.C0129id.credit_card_info_summary_image, C0126R.C0129id.credit_card_summary);
        this.f95639G = this.f95654a.findViewById(C0126R.C0129id.credit_card_number_container);
        this.f95640H = this.f95654a.findViewById(C0126R.C0129id.exp_date_and_cvc);
        this.f95655b.mo71919a(mo65980at());
        this.f95655b.mo71914a(mo65985l(1));
        CreditCardNumberEditText creditCardNumberEditText = this.f95655b;
        bmhy bmhy = (bmhy) this.f124069w;
        creditCardNumberEditText.f152264i = bmhy.f129507c;
        creditCardNumberEditText.f152267l = bmhy.f129510f;
        creditCardNumberEditText.f152259d = bmhy.f129508d;
        creditCardNumberEditText.f152260e = bmhy.f129509e;
        creditCardNumberEditText.mo71917a((bkce) creditCardNumberEditText, (bkdf) creditCardNumberEditText, false);
        this.f95655b.f152263h = this;
        bmhy bmhy2 = (bmhy) this.f124069w;
        if ((bmhy2.f129505a & 16) != 0) {
            bmia bmia = bmhy2.f129512h;
            if (bmia == null) {
                bmia = bmia.f129522m;
            }
            str = bmia.f129527d;
        } else {
            str = null;
        }
        this.f95643K.add(new bkde(0, this.f95655b, str));
        DateEditText dateEditText = (DateEditText) this.f95654a.findViewById(C0126R.C0129id.exp_date);
        this.f95658e = dateEditText;
        dateEditText.mo71919a(mo65980at());
        MaterialFieldLayout materialFieldLayout = (MaterialFieldLayout) this.f95654a.findViewById(C0126R.C0129id.exp_date_material_field_container);
        Activity activity = getActivity();
        bmhy bmhy3 = (bmhy) this.f124069w;
        bmqf a = awfx.m79879a(activity, bmhy3.f129514j, bmhy3.f129515k, bmhy3.f129516l, bmhy3.f129517m);
        bxvd bxvd2 = (bxvd) a.mo74142c(5);
        bxvd2.mo73625a((bxvk) a);
        long l = mo65985l(7);
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bmqf bmqf = (bmqf) bxvd2.f164949b;
        bmqf bmqf2 = bmqf.f130370r;
        bmqf.f130372a |= 2;
        bmqf.f130376e = l;
        bkft.m105629a((bmqf) bxvd2.mo74062i(), this.f95658e);
        materialFieldLayout.mo72052c();
        DateEditText dateEditText2 = this.f95658e;
        dateEditText2.mo71917a((bkce) dateEditText2, (bkdf) dateEditText2, true);
        if ((((bmhy) this.f124069w).f129505a & 16) != 0) {
            bxvd = blxc.f128037e.mo74144da();
            bmia bmia2 = ((bmhy) this.f124069w).f129512h;
            if (bmia2 == null) {
                bmia2 = bmia.f129522m;
            }
            int i4 = bmia2.f129529f;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            blxc blxc = (blxc) bxvd.f164949b;
            blxc.f128039a |= 2;
            blxc.f128041c = i4;
            bmia bmia3 = ((bmhy) this.f124069w).f129512h;
            if (bmia3 == null) {
                bmia3 = bmia.f129522m;
            }
            int i5 = bmia3.f129530g;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            blxc blxc2 = (blxc) bxvd.f164949b;
            blxc2.f128039a |= 1;
            blxc2.f128040b = i5;
        } else {
            bxvd = null;
        }
        ArrayList arrayList = this.f95643K;
        DateEditText dateEditText3 = this.f95658e;
        if (bxvd != null) {
            bxvk = bxvd.mo74062i();
        } else {
            bxvk = null;
        }
        arrayList.add(new bkde(0, dateEditText3, bxvk));
        FormEditText formEditText = (FormEditText) this.f95654a.findViewById(C0126R.C0129id.cvc);
        this.f95657d = formEditText;
        formEditText.mo71919a(mo65980at());
        this.f95657d.mo71914a(mo65985l(2));
        bkbi bkbi = new bkbi(this.f95657d, this.f95655b);
        this.f95657d.mo65972a((bkgj) bkbi);
        FormEditText formEditText2 = this.f95657d;
        formEditText2.mo71917a((bkce) bkbi, (bkdf) formEditText2, true);
        this.f95657d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(4)});
        this.f95657d.setOnFocusChangeListener(this);
        this.f95643K.add(new bkde(0, this.f95657d, null));
        CvcHintImageView cvcHintImageView = (CvcHintImageView) this.f95654a.findViewById(C0126R.C0129id.cvc_hint_image);
        this.f95669p = cvcHintImageView;
        cvcHintImageView.f110537g = getFragmentManager();
        if (this.f95671r) {
            FormEditText formEditText3 = (FormEditText) this.f95654a.findViewById(C0126R.C0129id.card_holder_name);
            this.f95660g = formEditText3;
            formEditText3.mo71919a(mo65980at());
            this.f95660g.mo71914a(mo65985l(5));
            ArrayList arrayList2 = this.f95643K;
            FormEditText formEditText4 = this.f95660g;
            bmia bmia4 = ((bmhy) this.f124069w).f129512h;
            if (bmia4 == null) {
                bmia4 = bmia.f129522m;
            }
            arrayList2.add(new bkde(0, formEditText4, bmia4.f129526c));
        }
        this.f95642J.add(this.f95639G);
        this.f95642J.add(this.f95640H);
        this.f95655b.setNextFocusDownId(C0126R.C0129id.exp_date);
        this.f95658e.setNextFocusDownId(C0126R.C0129id.cvc);
        this.f95657d.setNextFocusUpId(C0126R.C0129id.exp_date);
        this.f95658e.setNextFocusUpId(C0126R.C0129id.credit_card_number);
        if (this.f95671r) {
            this.f95657d.setNextFocusDownId(C0126R.C0129id.card_holder_name);
            this.f95660g.setNextFocusUpId(C0126R.C0129id.cvc);
        }
        bmhy bmhy4 = (bmhy) this.f124069w;
        if ((bmhy4.f129505a & 16) != 0 && bundle == null) {
            bmia bmia5 = bmhy4.f129512h;
            if (bmia5 == null) {
                bmia5 = bmia.f129522m;
            }
            String str3 = "";
            if (!bmia5.f129527d.isEmpty()) {
                this.f95655b.mo71832a((CharSequence) bmia5.f129527d, 6);
            } else {
                this.f95655b.mo71832a((CharSequence) str3, 1);
            }
            int i6 = bmia5.f129529f;
            if (i6 != 0) {
                str2 = Integer.toString(i6);
            } else {
                str2 = str3;
            }
            int i7 = bmia5.f129530g;
            if (i7 != 0) {
                str3 = Integer.toString(i7 - 2000);
            }
            if (!(bmia5.f129529f == 0 && bmia5.f129530g == 0)) {
                this.f95658e.mo71883a(str2, str3, 6);
            }
            if (!bmia5.f129526c.isEmpty() && this.f95671r) {
                this.f95660g.mo71832a((CharSequence) bmia5.f129526c, 6);
            }
        }
        this.f95636D.f152305a.mo66034a(this.f95671r);
        return this.f95654a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo52774b(boolean z) {
        int i;
        ImageView imageView;
        axbe axbe = this;
        boolean z2 = z;
        CreditCardImagesView creditCardImagesView = axbe.f95656c;
        if (creditCardImagesView != null) {
            creditCardImagesView.setVisibility(8);
        }
        View view = axbe.f95654a;
        if (!z2) {
            i = C0126R.C0129id.credit_card_images_above;
        } else {
            i = C0126R.C0129id.credit_card_images_inline;
        }
        CreditCardImagesView creditCardImagesView2 = (CreditCardImagesView) view.findViewById(i);
        axbe.f95656c = creditCardImagesView2;
        boolean z3 = false;
        creditCardImagesView2.setVisibility(0);
        if (axbe.f95656c.getChildCount() == 0) {
            CreditCardImagesView creditCardImagesView3 = axbe.f95656c;
            bxwc bxwc = ((bmhy) axbe.f124069w).f129507c;
            creditCardImagesView3.removeAllViews();
            creditCardImagesView3.f110532c = z2;
            ArrayList arrayList = new ArrayList(bxwc.size());
            int a = creditCardImagesView3.mo60099a().mo65614a();
            int dimensionPixelSize = creditCardImagesView3.getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_credit_card_icon_width);
            int dimensionPixelSize2 = creditCardImagesView3.getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_credit_card_icon_height);
            int size = bxwc.size();
            int i2 = -1;
            int i3 = 0;
            int i4 = -1;
            while (i3 < size) {
                bmhu bmhu = (bmhu) bxwc.get(i3);
                bmno bmno = bmhu.f129493c;
                if (bmno == null) {
                    bmno = bmno.f130138m;
                }
                if (bjvn.m104718a(bmno.f130142c)) {
                    imageView = new AppCompatImageView(creditCardImagesView3.getContext());
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    Context context = creditCardImagesView3.getContext();
                    bmno bmno2 = bmhu.f129493c;
                    if (bmno2 == null) {
                        bmno2 = bmno.f130138m;
                    }
                    imageView.setImageResource(bkfr.m105586b(context, bmno2.f130142c));
                } else {
                    imageView = new FifeNetworkImageView(creditCardImagesView3.getContext());
                }
                int i5 = Build.VERSION.SDK_INT;
                imageView.setLayerType(2, null);
                imageView.setId(a);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize2);
                if (i4 != i2) {
                    if (creditCardImagesView3.f110532c) {
                        bkfr.m105592b();
                        layoutParams.addRule(16, i4);
                    } else {
                        bkfr.m105592b();
                        layoutParams.addRule(17, i4);
                    }
                } else if (creditCardImagesView3.f110532c) {
                    bkfr.m105592b();
                    layoutParams.addRule(21);
                }
                layoutParams.addRule(15, i2);
                creditCardImagesView3.addView(imageView, layoutParams);
                if (imageView instanceof FifeNetworkImageView) {
                    FifeNetworkImageView fifeNetworkImageView = (FifeNetworkImageView) imageView;
                    fifeNetworkImageView.mo71888a();
                    bmno bmno3 = bmhu.f129493c;
                    if (bmno3 == null) {
                        bmno3 = bmno.f130138m;
                    }
                    String str = bmno3.f130142c;
                    ImageLoader a2 = bjvn.m104713a(creditCardImagesView3.getContext().getApplicationContext(), ((Integer) bjwd.f123463c.mo54082a()).intValue());
                    boolean booleanValue = ((Boolean) bjwd.f123461a.mo54082a()).booleanValue();
                    bmno bmno4 = bmhu.f129493c;
                    if (bmno4 == null) {
                        bmno4 = bmno.f130138m;
                    }
                    fifeNetworkImageView.mo71890a(str, a2, booleanValue, bmno4.f130143d);
                    fifeNetworkImageView.setErrorImageResId(C0126R.C0127drawable.wallet_card_general);
                }
                bmno bmno5 = bmhu.f129493c;
                if (bmno5 == null) {
                    bmno5 = bmno.f130138m;
                }
                if (!bmno5.f130149j.isEmpty()) {
                    bmno bmno6 = bmhu.f129493c;
                    if (bmno6 == null) {
                        bmno6 = bmno.f130138m;
                    }
                    imageView.setContentDescription(bmno6.f130149j);
                }
                imageView.setTag(bmhu);
                arrayList.add(imageView);
                i3++;
                z3 = false;
                i4 = a;
                i2 = -1;
                a = creditCardImagesView3.mo60099a().mo65614a();
                axbe = this;
            }
            creditCardImagesView3.f110530a = (ImageView[]) arrayList.toArray(new ImageView[arrayList.size()]);
            ImageView[] imageViewArr = creditCardImagesView3.f110530a;
            boolean z4 = creditCardImagesView3.f110532c;
            int i6 = Build.VERSION.SDK_INT;
            if (z4 || creditCardImagesView3.getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
                z3 = true;
            }
            creditCardImagesView3.f110531b = new axbc(imageViewArr, z3);
            CreditCardNumberEditText creditCardNumberEditText = axbe.f95655b;
            if (creditCardNumberEditText != null) {
                axbe.f95656c.mo60100a(creditCardNumberEditText.f152265j);
                if (z2) {
                    axbe.f95655b.setOnFocusChangeListener(axbe);
                } else {
                    axbe.f95655b.mo71916a((View.OnFocusChangeListener) axbe);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo39808a(int i, bjws bjws, long j) {
        m82118e("tagNfcInfoDialog");
        mo52808n(true);
        if (this.f95647O) {
            this.f95647O = false;
            this.f95663j.setImageDrawable(this.f95638F);
        }
        switch (i) {
            case 1:
            case 2:
                break;
            case 3:
            case 4:
                m82117c(getString(C0126R.string.wallet_uic_nfc_unsupported_error_message));
                break;
            case 5:
                m82117c(getString(C0126R.string.wallet_uic_nfc_transceive_error_message));
                break;
            case 6:
                m82117c(getString(C0126R.string.wallet_uic_nfc_timeout_error_message));
                break;
            case 7:
                m82117c(getString(C0126R.string.wallet_uic_nfc_rate_limit_error_message));
                break;
            default:
                StringBuilder sb = new StringBuilder(36);
                sb.append("Unknown NFC result code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
        if (bjws != null) {
            m82116a(bjws.f123530a, bjws.f123531b, bjws.f123532c, null, 4);
            this.f95644L = m82113D();
            m82123z();
        }
    }

    /* renamed from: a */
    public final void mo52974a(CreditCardOcrResult creditCardOcrResult, int i, Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        CreditCardNumberEditText creditCardNumberEditText;
        FormEditText formEditText;
        int length;
        CreditCardOcrResult creditCardOcrResult2 = creditCardOcrResult;
        Bundle bundle2 = bundle;
        int c = bkfr.m105599c(i);
        if (i != -1) {
            this.f95644L = this.f95655b;
            z2 = false;
            z = false;
        } else {
            bmik a = bjvn.m104712a(creditCardOcrResult, i);
            this.f95668o = a;
            boolean z5 = !TextUtils.isEmpty(a.f129582d);
            bmik bmik = this.f95668o;
            int i2 = bmik.f129583e;
            if (i2 != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            m82116a(bmik.f129582d, i2, bmik.f129584f, bmik.f129585g, 3);
            if (this.f95649Q) {
                DateEditText dateEditText = this.f95658e;
                int[] iArr = creditCardOcrResult2.f81239l;
                int[] iArr2 = creditCardOcrResult2.f81240m;
                if (!(iArr == null || iArr2 == null || (length = iArr.length) != iArr2.length)) {
                    ArrayList arrayList = new ArrayList(length);
                    for (int i3 = 0; i3 < iArr.length; i3++) {
                        arrayList.add(dateEditText.f151943l.mo65562a("", Integer.toString(iArr[i3]), Integer.toString(iArr2[i3])));
                    }
                    dateEditText.mo71921a((List) arrayList);
                }
            }
            if (this.f95672s && (formEditText = this.f95660g) != null) {
                formEditText.mo71921a(Arrays.asList(creditCardOcrResult2.f81241n));
            }
            if (this.f95650R && (creditCardNumberEditText = this.f95655b) != null) {
                creditCardNumberEditText.mo71921a(Arrays.asList(creditCardOcrResult2.f81242o));
            }
            this.f95644L = m82113D();
            m82123z();
            z2 = z5;
            z = z4;
        }
        if (bundle2 == null || !bundle2.getBoolean("com.google.android.gms.ocr.EXP_DATE_RECOGNITION_ENABLED")) {
            z3 = false;
        } else {
            z3 = true;
        }
        OcrResultReceivedEvent.m93816a(getActivity(), awfu.m79872a(c), z3, z2, z, this.f95673t);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.String, int):java.lang.String
      com.google.android.wallet.ui.common.FormEditText.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.FormEditText.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(bmnn, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void
      com.google.android.wallet.ui.common.FormEditText.a(int, int):boolean
      bjwm.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.wallet.ui.common.DateEditText.a(bmnn, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.String, int):java.lang.String
      com.google.android.wallet.ui.common.FormEditText.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.FormEditText.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(bmnn, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void
      com.google.android.wallet.ui.common.FormEditText.a(int, int):boolean
      bjwm.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.wallet.ui.creditcard.CreditCardNumberEditText.a(java.util.List, java.lang.String):bmhs
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.String, int):java.lang.String
      com.google.android.wallet.ui.common.FormEditText.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.FormEditText.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(bmnn, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void
      com.google.android.wallet.ui.common.FormEditText.a(int, int):boolean
      bjwm.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void */
    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        bmaf bmaf = bmas.f128496a;
        if (bmaf == null) {
            bmaf = bmaf.f128436d;
        }
        String str = bmaf.f128438a;
        bmdn bmdn = ((bmhy) this.f124069w).f129506b;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        if (!str.equals(bmdn.f128834b)) {
            return false;
        }
        bmaf bmaf2 = bmas.f128496a;
        if (bmaf2 == null) {
            bmaf2 = bmaf.f128436d;
        }
        int i = bmaf2.f128439b;
        if (i == 1) {
            this.f95655b.mo65794a((CharSequence) bmas.f128497b, true);
        } else if (i == 2) {
            this.f95657d.mo65794a((CharSequence) bmas.f128497b, true);
        } else if (i == 3 || i == 4) {
            this.f95658e.mo65794a((CharSequence) bmas.f128497b, true);
        } else if (i != 5) {
            bmaf bmaf3 = bmas.f128496a;
            if (bmaf3 == null) {
                bmaf3 = bmaf.f128436d;
            }
            int i2 = bmaf3.f128439b;
            StringBuilder sb = new StringBuilder(45);
            sb.append("Unknown FormFieldMessage fieldId: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else if (!this.f95671r) {
            return false;
        } else {
            this.f95660g.mo65794a((CharSequence) bmas.f128497b, true);
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo52804a(List list) {
        boolean a = super.mo52804a(list);
        boolean isEmpty = TextUtils.isEmpty(this.f95655b.getError());
        awqc.m80662a(getActivity(), new CreditCardEntryValidationEvent(!isEmpty, !TextUtils.isEmpty(this.f95658e.getError()), this.f95673t));
        return a;
    }
}
