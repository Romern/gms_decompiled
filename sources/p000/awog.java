package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.gms.wallet.analytics.events.PaymentMethodsActionEvent;
import com.google.android.gms.wallet.p088ui.common.PageDetails;
import com.google.android.gms.wallet.p088ui.common.ProgressSpinnerView;
import com.google.android.gms.wallet.paymentmethods.InstrumentRankSpinner;
import com.google.android.gms.wallet.paymentmethods.PaymentMethodsFragment$PaymentMethodsPageDetails;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: awog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awog extends awzk implements View.OnClickListener, awnz, bkcg {

    /* renamed from: o */
    public static final /* synthetic */ int f94705o = 0;

    /* renamed from: a */
    PendingIntent[] f94706a;

    /* renamed from: b */
    boolean f94707b;

    /* renamed from: c */
    boolean f94708c;

    /* renamed from: d */
    bmfl f94709d;

    /* renamed from: e */
    bmsg f94710e;

    /* renamed from: f */
    public bmso f94711f;

    /* renamed from: g */
    boolean f94712g;

    /* renamed from: h */
    Button f94713h;

    /* renamed from: i */
    RecyclerView f94714i;

    /* renamed from: j */
    awoa f94715j;

    /* renamed from: k */
    LinearLayout f94716k;

    /* renamed from: l */
    bkch f94717l;

    /* renamed from: m */
    final awpc f94718m = new awoe(this);

    /* renamed from: n */
    int f94719n = 1;

    /* renamed from: p */
    private byte[] f94720p;

    /* renamed from: q */
    private byte[] f94721q;

    /* renamed from: r */
    private String[] f94722r;

    /* renamed from: a */
    public static awog m80409a(BuyFlowConfig buyFlowConfig, byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr, PendingIntent[] pendingIntentArr, boolean z, String str, LogContext logContext) {
        awog awog = new awog();
        Bundle a = awzk.m81653a(buyFlowConfig, str, logContext);
        if (bArr != null) {
            a.putByteArray("encryptedParams", bArr);
        } else if (bArr2 != null) {
            a.putByteArray("unencryptedParams", bArr2);
        }
        if (bArr3 != null) {
            a.putByteArray("initializeToken", bArr3);
        }
        a.putStringArray("actionIds", strArr);
        a.putParcelableArray("pendingIntents", pendingIntentArr);
        a.putBoolean("launchAddInstrumentWhenNoFop", z);
        awog.setArguments(a);
        return awog;
    }

    /* renamed from: w */
    private final void m80411w() {
        this.f94709d = null;
        this.f94710e = null;
        this.f94719n = 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final awpc mo51913b() {
        return this.f94718m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bS */
    public final boolean mo52365bS() {
        return this.f94712g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo51917c() {
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return new bjes(10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final bxxk mo51920d() {
        return (bxxk) bmsi.f130680e.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final bxxk mo51921e() {
        return (bxxk) bmsn.f130714d.mo74142c(7);
    }

    /* renamed from: f */
    public final void mo51922f() {
        super.mo51922f();
        boolean z = this.f124195aJ;
        Button button = this.f94713h;
        if (button != null && button.getVisibility() == 0) {
            this.f94713h.setEnabled(z);
        }
        RecyclerView recyclerView = this.f94714i;
        if (recyclerView != null && recyclerView.getVisibility() == 0) {
            this.f94714i.setEnabled(z);
            this.f94714i.setLayoutFrozen(!z);
            int childCount = this.f94714i.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView recyclerView2 = this.f94714i;
                ((awny) recyclerView2.getChildViewHolder(recyclerView2.getChildAt(i))).mo52350b(z);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final bmlz mo51924h() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo51925l() {
        mo52895f((Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final bxxk mo51926m() {
        return (bxxk) bmsl.f130698i.mo74142c(7);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo51927n() {
        byte[] bArr;
        mo52808n(false);
        this.f94708c = false;
        bmaq bmaq = this.f95398ak.f110465n;
        if (bmaq != null) {
            bArr = bmaq.f128483c.mo73780k();
        } else {
            bArr = null;
        }
        bxvd da = bmsi.f130680e.mo74144da();
        bmaj a = awfx.m79878a(bArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmsi bmsi = (bmsi) da.f164949b;
        a.getClass();
        bmsi.f130685d = a;
        bmsi.f130682a |= 1;
        byte[] bArr2 = this.f94720p;
        if (bArr2 != null) {
            bxtx a2 = bxtx.m123261a(bArr2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmsi bmsi2 = (bmsi) da.f164949b;
            a2.getClass();
            bmsi2.f130683b = 3;
            bmsi2.f130684c = a2;
        } else {
            byte[] bArr3 = this.f94721q;
            if (bArr3 != null) {
                bxtx a3 = bxtx.m123261a(bArr3);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmsi bmsi3 = (bmsi) da.f164949b;
                a3.getClass();
                bmsi3.f130683b = 4;
                bmsi3.f130684c = a3;
            }
        }
        mo52864a(da.mo74062i(), 2);
        mo52900j(2);
        mo52839Y().f94357a.mo52406a((bmsi) da.mo74062i());
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        int i3 = -1;
        if (i != 2) {
            if (i == 5 || i == 11) {
                int i4 = 0;
                if (intent != null && intent.getBooleanExtra("com.google.android.gms.wallet.firstparty.EXTRA_REFRESH", false)) {
                    mo51927n();
                }
                if (i2 == -1) {
                    this.f94712g = true;
                    PaymentMethodsActionEvent.m93837a(this.f123962aG, this.f95359C, i, 3);
                    return;
                } else if (i2 == 0) {
                    PaymentMethodsActionEvent.m93837a(this.f123962aG, this.f95359C, i, 4);
                    return;
                } else if (i2 != 1) {
                    PaymentMethodsActionEvent.m93837a(this.f123962aG, this.f95359C, i, 1);
                    return;
                } else {
                    if (intent != null) {
                        i4 = intent.getIntExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", 0);
                    }
                    PaymentMethodsActionEvent.m93838b(this.f123962aG, this.f95359C, i, i4);
                    return;
                }
            } else if (i != 1000) {
                if (i != 1004) {
                    super.onActivityResult(i, i2, intent);
                    return;
                } else if (i2 != 0) {
                    super.onActivityResult(i, i2, intent);
                    return;
                } else {
                    mo52873af();
                    return;
                }
            }
        }
        if (i2 == -1) {
            mo51927n();
            this.f94712g = true;
            PaymentMethodsActionEvent.m93837a(this.f123962aG, this.f95359C, i, 3);
        } else if (i2 == 0) {
            PaymentMethodsActionEvent.m93837a(this.f123962aG, this.f95359C, i, 4);
        } else if (i2 != 1) {
            PaymentMethodsActionEvent.m93837a(this.f123962aG, this.f95359C, i, 1);
        } else {
            if (intent != null) {
                i3 = intent.getIntExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", -1);
            }
            PaymentMethodsActionEvent.m93838b(this.f123962aG, this.f95359C, i, i3);
        }
    }

    public void onClick(View view) {
        if (view == this.f94713h && isResumed()) {
            bwhm bwhm = ((bmsl) this.f95397aj).f130704e;
            if (bwhm == null) {
                bwhm = bwhm.f159522h;
            }
            bwiv bwiv = bwhm.f159528e;
            if (bwiv == null) {
                bwiv = bwiv.f159693e;
            }
            startActivityForResult(awia.m79967a(bwiv, getActivity().getIntent(), this.f123962aG, this.f95358B), 1000);
            PaymentMethodsActionEvent.m93837a(this.f123962aG, this.f95359C, 1000, 2);
        }
    }

    public final void onCreate(Bundle bundle) {
        bmsl bmsl;
        bmav bmav;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f94720p = arguments.getByteArray("encryptedParams");
        this.f94721q = arguments.getByteArray("unencryptedParams");
        this.f94722r = arguments.getStringArray("actionIds");
        this.f94706a = awia.m79994a(arguments.getParcelableArray("pendingIntents"));
        this.f94707b = arguments.getBoolean("launchAddInstrumentWhenNoFop");
        if (bundle == null) {
            if (arguments.containsKey("initializeToken")) {
                this.f95368L = 1;
                bmsj bmsj = (bmsj) bjvp.m104730a(arguments, "initializeToken", (bxxk) bmsj.f130686f.mo74142c(7));
                PaymentMethodsFragment$PaymentMethodsPageDetails paymentMethodsFragment$PaymentMethodsPageDetails = new PaymentMethodsFragment$PaymentMethodsPageDetails();
                bmar bmar = null;
                if ((bmsj.f130688a & 8) != 0) {
                    bmsl = bmsj.f130692e;
                    if (bmsl == null) {
                        bmsl = bmsl.f130698i;
                    }
                } else {
                    bmsl = null;
                }
                paymentMethodsFragment$PaymentMethodsPageDetails.f110460i = bmsl;
                bmsl bmsl2 = bmsj.f130692e;
                if (bmsl2 == null) {
                    bmsl2 = bmsl.f130698i;
                }
                if ((bmsl2.f130700a & 16) != 0) {
                    bmsl bmsl3 = bmsj.f130692e;
                    if (bmsl3 == null) {
                        bmsl3 = bmsl.f130698i;
                    }
                    bmkw bmkw = bmsl3.f130707h;
                    if (bmkw == null) {
                        bmkw = bmkw.f129898c;
                    }
                    paymentMethodsFragment$PaymentMethodsPageDetails.f110463l = bmkw;
                }
                bmaq bmaq = bmsj.f130690c;
                if (bmaq == null) {
                    bmaq = bmaq.f128479l;
                }
                paymentMethodsFragment$PaymentMethodsPageDetails.f110465n = bmaq;
                if ((bmsj.f130688a & 1) != 0) {
                    bmav = bmsj.f130689b;
                    if (bmav == null) {
                        bmav = bmav.f128500h;
                    }
                } else {
                    bmav = null;
                }
                paymentMethodsFragment$PaymentMethodsPageDetails.f110468q = bmav;
                if ((bmsj.f130688a & 4) != 0 && (bmar = bmsj.f130691d) == null) {
                    bmar = bmar.f128490c;
                }
                paymentMethodsFragment$PaymentMethodsPageDetails.f110467p = bmar;
                this.f95399al = paymentMethodsFragment$PaymentMethodsPageDetails;
            } else {
                this.f94708c = true;
            }
            OrchestrationViewEvent.m93828c(getActivity(), this.f95359C, mo51919co());
            return;
        }
        this.f94708c = bundle.getBoolean("shouldMakeInitializeRequest", false);
        if (bundle.containsKey("pendingAction")) {
            this.f94709d = (bmfl) bjvp.m104730a(bundle, "pendingAction", (bxxk) bmfl.f129116i.mo74142c(7));
        }
        if (bundle.containsKey("pendingActionConfirmation")) {
            this.f94710e = (bmsg) bjvp.m104730a(bundle, "pendingActionConfirmation", (bxxk) bmsg.f130669d.mo74142c(7));
        }
        this.f94719n = bmfn.m107981a(bundle.getInt("pendingActionType"));
        this.f94712g = bundle.getBoolean("hasDataPossiblyBeenModified");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("shouldMakeInitializeRequest", this.f94708c);
        bjvp.m104736a(bundle, "pendingAction", this.f94709d);
        bjvp.m104736a(bundle, "pendingActionConfirmation", this.f94710e);
        int i = this.f94719n;
        int i2 = i - 1;
        if (i != 0) {
            bundle.putInt("pendingActionType", i2);
            bundle.putBoolean("hasDataPossiblyBeenModified", this.f94712g);
            return;
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo52070p() {
        mo52895f((bmsm) mo52885b(Bundle.EMPTY, (byte[]) null, (List) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo51914b(Object obj) {
        bmsm bmsm = (bmsm) obj;
        bxvd da = bmsn.f130714d.mo74144da();
        bmaj a = awfx.m79878a(this.f95398ak.f110465n.f128483c.mo73780k());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmsn bmsn = (bmsn) da.f164949b;
        a.getClass();
        bmsn.f130717b = a;
        int i = bmsn.f130716a | 1;
        bmsn.f130716a = i;
        if (bmsm != null) {
            bmsm.getClass();
            bmsn.f130718c = bmsm;
            bmsn.f130716a = i | 2;
        }
        bmsn bmsn2 = (bmsn) da.mo74062i();
        mo52839Y().f94357a.mo52407a(bmsn2, this.f95398ak.f110467p);
        this.f94712g = true;
        return bmsn2;
    }

    /* renamed from: c */
    public final void mo52062c(int i) {
        this.f94717l = null;
        if (i == 1) {
            int i2 = this.f94719n;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            } else if (i3 == 3) {
                mo52070p();
                return;
            } else if (i3 != 6) {
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                int i4 = this.f94719n;
                int i5 = i4 - 1;
                if (i4 == 0) {
                    throw null;
                }
                objArr[0] = Integer.valueOf(i5);
                throw new IllegalArgumentException(String.format(locale, "Unsupported action type=%s", objArr));
            }
        }
        m80411w();
    }

    /* renamed from: a */
    private final void m80410a(int i, bmfl bmfl) {
        if (isResumed()) {
            bwhm bwhm = bmfl.f129124g;
            if (bwhm == null) {
                bwhm = bwhm.f159522h;
            }
            bwiv bwiv = bwhm.f159528e;
            if (bwiv == null) {
                bwiv = bwiv.f159693e;
            }
            startActivityForResult(awia.m79967a(bwiv, getActivity().getIntent(), this.f123962aG, this.f95358B), i);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkfr.a(android.content.Context, android.widget.Button):void
     arg types: [android.view.ContextThemeWrapper, android.widget.Button]
     candidates:
      bkfr.a(android.content.Context, int):int
      bkfr.a(android.view.View, android.view.View):int
      bkfr.a(android.content.Context, java.lang.String):android.content.Intent
      bkfr.a(android.content.res.Resources, java.util.List):java.lang.String
      bkfr.a(java.lang.String, java.lang.String):java.lang.String
      bkfr.a(android.content.Context, android.view.View):void
      bkfr.a(android.view.View, int):void
      bkfr.a(android.view.View, android.util.TypedValue):void
      bkfr.a(android.view.View, java.lang.CharSequence):void
      bkfr.a(android.view.View, boolean):void
      bkfr.a(android.view.ViewGroup, int):void
      bkfr.a(android.view.ViewGroup, boolean):void
      bkfr.a(android.widget.ImageView, android.content.res.ColorStateList):void
      bkfr.a(android.widget.TextView, java.lang.String):void
      bkfr.a(android.widget.TextView, boolean):void
      bkfr.a(boolean, java.lang.Object):void
      bkfr.a(android.content.Context, bmap):boolean
      bkfr.a(android.content.Context, int[]):boolean
      bkfr.a(com.google.android.chimera.Activity, android.widget.TextView):boolean
      bkfr.a(android.content.Context, android.widget.Button):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f95357A = layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_payment_methods, viewGroup, false);
        mo52851a((awib) ((ProgressSpinnerView) this.f95357A.findViewById(C0126R.C0129id.progress_spinner_container)));
        Button button = (Button) this.f95357A.findViewById(C0126R.C0129id.add_payment_method);
        this.f94713h = button;
        button.setOnClickListener(this);
        bkfr.m105560a((Context) this.f123962aG, this.f94713h);
        RecyclerView recyclerView = (RecyclerView) this.f95357A.findViewById(C0126R.C0129id.recycler_view);
        this.f94714i = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.f94714i.setLayoutManager(new aah());
        this.f94716k = (LinearLayout) this.f95357A.findViewById(C0126R.C0129id.no_fop_page);
        if (this.f94708c) {
            mo52865a((Runnable) new awoc(this));
        } else if (this.f95368L == 1) {
            mo52888b("onInitialLoad");
        }
        if (bundle != null) {
            bkch bkch = (bkch) getFragmentManager().findFragmentByTag("PaymentMethodsFragment.confirmationDialog");
            this.f94717l = bkch;
            if (bkch != null) {
                bkch.f123992d = this;
            }
        }
        return this.f95357A;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.widget.LinearLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo51916b(boolean z) {
        String str;
        View view;
        bmsl bmsl = (bmsl) this.f95397aj;
        if ((bmsl.f130700a & 1) != 0) {
            str = bmsl.f130701b;
        } else {
            str = null;
        }
        this.f95373Q = str;
        if (z) {
            this.f95357A.setVisibility(4);
        }
        if ((((bmsl) this.f95397aj).f130700a & 4) != 0) {
            this.f94713h.setVisibility(0);
            Button button = this.f94713h;
            bwhm bwhm = ((bmsl) this.f95397aj).f130704e;
            if (bwhm == null) {
                bwhm = bwhm.f159522h;
            }
            bmnr bmnr = bwhm.f159526c;
            if (bmnr == null) {
                bmnr = bmnr.f130153o;
            }
            button.setText(bmnr.f130159e);
        } else {
            this.f94713h.setVisibility(8);
        }
        bxwc bxwc = ((bmsl) this.f95397aj).f130705f;
        int size = bxwc.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((bmsk) bxwc.get(i2)).f130696a.size();
        }
        ArrayList arrayList = new ArrayList(i);
        bxwc bxwc2 = ((bmsl) this.f95397aj).f130705f;
        int size2 = bxwc2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList.addAll(((bmsk) bxwc2.get(i3)).f130696a);
        }
        if (i == 0) {
            this.f94716k.setVisibility(0);
            this.f94714i.setVisibility(8);
            ImageWithCaptionView imageWithCaptionView = (ImageWithCaptionView) this.f95357A.findViewById(C0126R.C0129id.no_fop_image);
            bmno bmno = ((bmsl) this.f95397aj).f130702c;
            if (bmno == null) {
                bmno = bmno.f130138m;
            }
            imageWithCaptionView.mo71993a(bmno, awia.m79973a(), ((Boolean) awir.f94488a.mo58455c()).booleanValue(), mo65980at());
            if (((bmsl) this.f95397aj).f130703d.size() > 0) {
                LinearLayout linearLayout = (LinearLayout) this.f95357A.findViewById(C0126R.C0129id.no_fop_text_container);
                linearLayout.removeAllViews();
                linearLayout.setVisibility(0);
                for (int i4 = 0; i4 < ((bmsl) this.f95397aj).f130703d.size(); i4++) {
                    if (i4 != 0) {
                        view = this.f123963aH.inflate((int) C0126R.C0128layout.wallet_view_no_fop_page_subtitle, (ViewGroup) linearLayout, false);
                    } else {
                        view = this.f123963aH.inflate((int) C0126R.C0128layout.wallet_view_no_fop_page_title, (ViewGroup) linearLayout, false);
                    }
                    InfoMessageView infoMessageView = (InfoMessageView) view;
                    infoMessageView.mo72003a((bmnr) ((bmsl) this.f95397aj).f130703d.get(i4));
                    linearLayout.addView(infoMessageView);
                }
                return;
            }
            return;
        }
        awoa awoa = new awoa(this.f123962aG, arrayList, this.f94714i, this.f95376T);
        this.f94715j = awoa;
        awoa.f94695d = this;
        this.f94714i.setAdapter(awoa);
        this.f94714i.setVisibility(0);
        this.f94716k.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo51902a(Bundle bundle, byte[] bArr, List list) {
        bxvd da = bmsm.f130709d.mo74144da();
        if (this.f94709d != null) {
            bxvd da2 = bmfr.f129152b.mo74144da();
            bxvd da3 = bmfo.f129128d.mo74144da();
            int a = bmfn.m107981a(this.f94709d.f129120c);
            if (a == 0) {
                a = 1;
            }
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bmfo bmfo = (bmfo) da3.f164949b;
            bmfo.f129131b = a - 1;
            int i = 1 | bmfo.f129130a;
            bmfo.f129130a = i;
            bxtx bxtx = this.f94709d.f129121d;
            bxtx.getClass();
            bmfo.f129130a = i | 4;
            bmfo.f129132c = bxtx;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bmfr bmfr = (bmfr) da2.f164949b;
            bmfo bmfo2 = (bmfo) da3.mo74062i();
            bmfo2.getClass();
            if (!bmfr.f129154a.mo73666a()) {
                bmfr.f129154a = bxvk.m124021a(bmfr.f129154a);
            }
            bmfr.f129154a.add(bmfo2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmsm bmsm = (bmsm) da.f164949b;
            bmfr bmfr2 = (bmfr) da2.mo74062i();
            bmfr2.getClass();
            if (!bmsm.f130712b.mo73666a()) {
                bmsm.f130712b = bxvk.m124021a(bmsm.f130712b);
            }
            bmsm.f130712b.add(bmfr2);
        } else if (this.f94710e != null) {
            bxvd da4 = bmsh.f130675d.mo74144da();
            int a2 = bmfn.m107981a(this.f94710e.f130671a);
            if (a2 == 0) {
                a2 = 1;
            }
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bmsh bmsh = (bmsh) da4.f164949b;
            bmsh.f130678b = a2 - 1;
            int i2 = bmsh.f130677a | 1;
            bmsh.f130677a = i2;
            bxtx bxtx2 = this.f94710e.f130672b;
            bxtx2.getClass();
            bmsh.f130677a = i2 | 2;
            bmsh.f130679c = bxtx2;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmsm bmsm2 = (bmsm) da.f164949b;
            bmsh bmsh2 = (bmsh) da4.mo74062i();
            bmsh2.getClass();
            bmsm2.f130713c = bmsh2;
            bmsm2.f130711a |= 1;
        } else {
            throw new IllegalArgumentException("No pending action or confirmation action.");
        }
        return (bmsm) da.mo74062i();
    }

    /* renamed from: a */
    public final void mo51904a(int i) {
        super.mo51904a(i);
        if (i == 1) {
            if (this.f94707b && this.f94716k.getVisibility() == 0) {
                bmsl bmsl = (bmsl) this.f95397aj;
                if ((bmsl.f130700a & 4) != 0) {
                    bwhm bwhm = bmsl.f130704e;
                    if (bwhm == null) {
                        bwhm = bwhm.f159522h;
                    }
                    bwiv bwiv = bwhm.f159528e;
                    if (bwiv == null) {
                        bwiv = bwiv.f159693e;
                    }
                    startActivity(awia.m79967a(bwiv, getActivity().getIntent(), this.f123962aG, this.f95358B));
                    PaymentMethodsActionEvent.m93837a(this.f123962aG, this.f95359C, 1001, 2);
                    mo52873af();
                    return;
                }
            }
            if (bkfr.m105612e(getActivity()) && this.f94717l == null && !mo52869ab()) {
                this.f95357A.post(new awod(this));
            } else {
                this.f95357A.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public final void mo52362a(bmaq bmaq, bmav bmav, bwgz bwgz, bmar bmar, bmsl bmsl, boolean z, String str) {
        sdo.m34959a(bwgz);
        if (this.f94711f != null) {
            if (bwgz != bwgz.HANDLE_UI_ERROR) {
                ContextThemeWrapper contextThemeWrapper = this.f123962aG;
                String str2 = this.f95359C;
                int i = this.f94719n;
                int i2 = i - 1;
                if (i != 0) {
                    PaymentMethodsActionEvent.m93837a(contextThemeWrapper, str2, i2, 3);
                } else {
                    throw null;
                }
            } else {
                ContextThemeWrapper contextThemeWrapper2 = this.f123962aG;
                String str3 = this.f95359C;
                int i3 = this.f94719n;
                int i4 = i3 - 1;
                if (i3 != 0) {
                    PaymentMethodsActionEvent.m93837a(contextThemeWrapper2, str3, i4, 5);
                } else {
                    throw null;
                }
            }
            m80411w();
            this.f94711f = null;
        }
        mo52853a(bmav, bmaq);
        PaymentMethodsFragment$PaymentMethodsPageDetails paymentMethodsFragment$PaymentMethodsPageDetails = new PaymentMethodsFragment$PaymentMethodsPageDetails();
        paymentMethodsFragment$PaymentMethodsPageDetails.f110460i = bmsl;
        if (!(bmsl == null || (bmsl.f130700a & 16) == 0)) {
            bmkw bmkw = bmsl.f130707h;
            if (bmkw == null) {
                bmkw = bmkw.f129898c;
            }
            paymentMethodsFragment$PaymentMethodsPageDetails.f110463l = bmkw;
        }
        paymentMethodsFragment$PaymentMethodsPageDetails.f110468q = bmav;
        paymentMethodsFragment$PaymentMethodsPageDetails.f110454c = bwgz;
        paymentMethodsFragment$PaymentMethodsPageDetails.f110465n = bmaq;
        paymentMethodsFragment$PaymentMethodsPageDetails.f110467p = bmar;
        mo52364a(paymentMethodsFragment$PaymentMethodsPageDetails, z, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo52363a(bmde bmde) {
        if (this.f94717l != null) {
            getFragmentManager().beginTransaction().remove(this.f94717l).commit();
        }
        awzr a = awzr.m81794a(bmde);
        this.f94717l = a;
        a.f123992d = this;
        a.show(getFragmentManager(), "PaymentMethodsFragment.confirmationDialog");
    }

    /* renamed from: a */
    public final void mo52354a(bmfl bmfl) {
        int a = bmfn.m107981a(bmfl.f129120c);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        switch (a - 1) {
            case 2:
                m80410a(2, bmfl);
                break;
            case 3:
            case 7:
            case 8:
            case 9:
                this.f94709d = bmfl;
                int a2 = bmfn.m107981a(bmfl.f129120c);
                if (a2 == 0) {
                    a2 = 1;
                }
                this.f94719n = a2;
                if ((bmfl.f129118a & 64) == 0) {
                    mo52070p();
                    break;
                } else {
                    bmde bmde = bmfl.f129123f;
                    if (bmde == null) {
                        bmde = bmde.f128780k;
                    }
                    mo52363a(bmde);
                    break;
                }
            case 4:
            case 10:
            default:
                Locale locale = Locale.US;
                Object[] objArr = new Object[2];
                int a3 = bmfn.m107981a(bmfl.f129120c);
                if (a3 == 0) {
                    a3 = 1;
                }
                objArr[0] = Integer.valueOf(a3 - 1);
                objArr[1] = bmfl.f129119b;
                throw new UnsupportedOperationException(String.format(locale, "InstrumentAction with actionType=%s label=%s not supported", objArr));
            case 5:
                if (isResumed()) {
                    int length = this.f94722r.length;
                    int i2 = 0;
                    while (i2 < length) {
                        if (bmfl.f129122e.equals(this.f94722r[i2])) {
                            try {
                                startIntentSenderForResult(this.f94706a[i2].getIntentSender(), 5, null, 0, 0, 0, Bundle.EMPTY);
                                break;
                            } catch (IntentSender.SendIntentException e) {
                                Log.w("PaymentMethodsFragment", String.format(Locale.US, "Sending PendingIntent for action %s with id %s failed.", bmfl.f129119b, bmfl.f129122e), e);
                            }
                        } else {
                            i2++;
                        }
                    }
                    throw new UnsupportedOperationException(String.format(Locale.US, "Unsupported action %s with id %s", bmfl.f129119b, bmfl.f129122e));
                }
                return;
            case 6:
                this.f94709d = bmfl;
                int a4 = bmfn.m107981a(bmfl.f129120c);
                if (a4 == 0) {
                    a4 = 1;
                }
                this.f94719n = a4;
                if ((bmfl.f129118a & 64) != 0) {
                    bmde bmde2 = bmfl.f129123f;
                    if (bmde2 == null) {
                        bmde2 = bmde.f128780k;
                    }
                    mo52363a(bmde2);
                    break;
                } else {
                    Log.e("PaymentMethodsFragment", "Selected an INFO action with no confirmation dialog.");
                    break;
                }
            case 11:
                m80410a(11, bmfl);
                break;
        }
        ContextThemeWrapper contextThemeWrapper = this.f123962aG;
        String str = this.f95359C;
        int a5 = bmfn.m107981a(bmfl.f129120c);
        if (a5 != 0) {
            i = a5;
        }
        PaymentMethodsActionEvent.m93837a(contextThemeWrapper, str, i - 1, 2);
    }

    /* renamed from: a */
    public final void mo52364a(PageDetails pageDetails, boolean z, String str) {
        awoa awoa;
        awny awny;
        InstrumentRankSpinner instrumentRankSpinner;
        int i;
        super.mo52364a(pageDetails, z, str);
        if (pageDetails.f110454c == bwgz.HANDLE_UI_ERROR && (awoa = this.f94715j) != null && (awny = awoa.f94697f) != null) {
            if (awny.f94682C.getVisibility() == 0 && awny.f94682C.getSelectedItemPosition() != (i = (instrumentRankSpinner = awny.f94682C).f110306a)) {
                instrumentRankSpinner.setSelection(i);
            }
            awoa.f94697f = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51911a(Object obj) {
        if (obj instanceof bmsi) {
            mo52900j(2);
            mo52839Y().f94357a.mo52406a((bmsi) obj);
            mo52808n(false);
        } else if (obj instanceof bmsn) {
            mo52900j(3);
            mo52839Y().f94357a.mo52407a((bmsn) obj, this.f95398ak.f110467p);
            mo52808n(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo51912a(PageDetails pageDetails) {
        boolean z;
        if ((((bmsl) pageDetails.f110460i).f130700a & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "No ActionConfirmation provided in page.");
        bmsg bmsg = ((bmsl) pageDetails.f110460i).f130706g;
        if (bmsg == null) {
            bmsg = bmsg.f130669d;
        }
        this.f94710e = bmsg;
        int a = bmfn.m107981a(bmsg.f130671a);
        if (a == 0) {
            a = 1;
        }
        this.f94719n = a;
        bmde bmde = this.f94710e.f130673c;
        if (bmde == null) {
            bmde = bmde.f128780k;
        }
        mo52363a(bmde);
        return true;
    }
}
