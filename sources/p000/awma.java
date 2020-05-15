package p000;

import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wallet.analytics.events.OrchestrationApiEvent;
import com.google.android.gms.wallet.analytics.events.OrchestrationDcbEvent;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.gms.wallet.fixinstrument.FixInstrumentRootFragment$FixInstrumentPageDetails;
import com.google.android.gms.wallet.p088ui.common.PageDetails;
import com.google.android.gms.wallet.p088ui.common.ProgressSpinnerView;
import com.google.android.gms.wallet.service.orchestration.FixInstrumentSubmitRequest;
import com.google.android.wallet.p097ui.common.FocusedViewToTopScrollView;
import com.google.android.wallet.p097ui.common.FormHeaderView;
import com.google.android.wallet.p097ui.common.LegalMessageContainer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: awma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awma extends awzg implements View.OnClickListener, bkio, bjem, bjvx, bkcg {

    /* renamed from: h */
    public static final /* synthetic */ int f94601h = 0;

    /* renamed from: a */
    FocusedViewToTopScrollView f94602a;

    /* renamed from: b */
    ViewGroup f94603b;

    /* renamed from: c */
    boolean f94604c;

    /* renamed from: d */
    byte[] f94605d;

    /* renamed from: e */
    bkch f94606e;

    /* renamed from: f */
    awlx f94607f;

    /* renamed from: g */
    final awpc f94608g = new awlv(this);

    /* renamed from: i */
    private final bjes f94609i = new bjes(14);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean, java.lang.String):void
     arg types: [com.google.android.gms.wallet.ui.common.PageDetails, int, java.lang.String]
     candidates:
      awma.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View
      awma.a(android.os.Bundle, byte[], java.util.List):java.lang.Object
      awzg.a(awyy, int, long):void
      awzk.a(com.google.android.gms.wallet.shared.BuyFlowConfig, java.lang.String, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      awzk.a(bmdb, android.view.ViewGroup, boolean):bkbn
      awzk.a(android.os.Bundle, byte[], java.util.List):java.lang.Object
      awzk.a(long, int, int):void
      awzk.a(awyy, int, long):void
      awzk.a(bmav, boolean, boolean):void
      awzk.a(bmnr, android.view.ViewGroup, boolean):void
      awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, int, int):void
      awzk.a(java.util.List, android.view.ViewGroup, boolean):void
      bkbr.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View
      awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean, java.lang.String):void */
    /* renamed from: B */
    private final void m80133B() {
        PageDetails pageDetails = new PageDetails(this.f95398ak);
        bxvd da = bmav.f128500h.mo74144da();
        String string = getString(C0126R.string.wallet_uic_send_sms_for_dcb_error);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmav bmav = (bmav) da.f164949b;
        string.getClass();
        int i = bmav.f128502a | 1;
        bmav.f128502a = i;
        bmav.f128503b = string;
        bmav.f128504c = 1;
        bmav.f128502a = i | 8;
        pageDetails.f110468q = (bmav) da.mo74062i();
        pageDetails.f110454c = bwgz.HANDLE_UI_ERROR;
        mo52364a(pageDetails, false, "dcbError");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    private final void m80134a(bwjo bwjo) {
        bmfv bmfv;
        awpb awpb = mo52839Y().f94357a;
        bmar bmar = this.f95398ak.f110467p;
        awou awou = (awou) awpb;
        sdo.m34971a(awou.mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        if (!awou.mo52425a(bwjo)) {
            Message.obtain(awou.f94784u, 44, new FixInstrumentSubmitRequest(awou.f94765b, bwjo, bmar.f128492a)).sendToTarget();
        }
        if ((bwjo.f159840a & 2) != 0) {
            bwjn bwjn = bwjo.f159842c;
            if (bwjn == null) {
                bwjn = bwjn.f159829h;
            }
            bmgo bmgo = bwjn.f159832b;
            if (bmgo == null) {
                bmgo = bmgo.f129290e;
            }
            if (bmgo.f129292a == 2) {
                bmfv = (bmfv) bmgo.f129293b;
            } else {
                bmfv = bmfv.f129179c;
            }
            if (bmfv.f129181a == 4) {
                Object obj = ((axbr) mo52884b(13, axbr.class)).f95712k;
                if (obj instanceof bmgd) {
                    bmgd bmgd = (bmgd) obj;
                    bmfu bmfu = bmgd.f129219e;
                    if (bmfu == null) {
                        bmfu = bmfu.f129167j;
                    }
                    if ((bmfu.f129169a & 2) != 0) {
                        bmfu bmfu2 = bmgd.f129219e;
                        if (bmfu2 == null) {
                            bmfu2 = bmfu.f129167j;
                        }
                        bmil bmil = bmfu2.f129171c;
                        if (bmil == null) {
                            bmil = bmil.f129588g;
                        }
                        new bjvy(getActivity(), this).mo65574a(bmil.f129593d, bmil.f129594e);
                        return;
                    }
                    throw new IllegalStateException("Submitting dcbVerifyAssociation Form when option is not selected");
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bxxc mo52042a(long j) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final awpc mo51913b() {
        return this.f94608g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo51917c() {
        boolean z;
        boolean z2 = false;
        if (((Boolean) awja.f94516d.mo58455c()).booleanValue() || bkfr.m105580a(getActivity(), bmap.ENABLE_SCROLL_TO_TOP)) {
            z = true;
        } else {
            z = false;
        }
        if ((((Boolean) awja.f94516d.mo58455c()).booleanValue() || bkfr.m105580a(getActivity(), bmap.ENABLE_SMOOTH_SCROLLING)) && bkfr.m105612e(getActivity())) {
            z2 = true;
        }
        FocusedViewToTopScrollView focusedViewToTopScrollView = this.f94602a;
        if (focusedViewToTopScrollView != null) {
            focusedViewToTopScrollView.f151970r = z;
            focusedViewToTopScrollView.mo71903a(z2);
        }
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final bxxk mo51920d() {
        return (bxxk) bwjk.f159796e.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final bxxk mo51921e() {
        return (bxxk) bwjo.f159838d.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        super.mo51922f();
        boolean z = this.f124195aJ;
        FormHeaderView formHeaderView = (FormHeaderView) this.f95357A.findViewById(C0126R.C0129id.instrument_activation_fragment_form_header);
        if (formHeaderView != null) {
            formHeaderView.setEnabled(z);
        }
        LegalMessageContainer legalMessageContainer = (LegalMessageContainer) this.f95357A.findViewById(C0126R.C0129id.fix_instrument_legal_message_container);
        if (legalMessageContainer != null) {
            legalMessageContainer.setEnabled(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final List mo51923g() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final bmlz mo51924h() {
        Object obj = this.f95397aj;
        if (obj == null) {
            return null;
        }
        bwjm bwjm = (bwjm) obj;
        if ((bwjm.f159813a & 32) == 0) {
            return null;
        }
        bmlz bmlz = bwjm.f159822j;
        return bmlz == null ? bmlz.f129993c : bmlz;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo51925l() {
        mo52895f((Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final bxxk mo51926m() {
        return (bxxk) bwjm.f159811p.mo74142c(7);
    }

    /* renamed from: n */
    public final void mo51927n() {
        bkbn bkbn;
        bkfr.m105559a(this.f123962aG, this.f95357A);
        int size = this.f95402ao.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bkbn = null;
                break;
            }
            bkbn = (bkbn) this.f95402ao.get(i);
            if (bkbn.mo52710b().getVisibility() == 0 && bkbn.mo52710b().getId() != C0126R.C0129id.wallet_cancel_button) {
                break;
            }
            i++;
        }
        if (bkbn != null) {
            bkbn.mo52710b().requestFocus();
        }
    }

    public void onClick(View view) {
        if (view.getId() == C0126R.C0129id.wallet_cancel_button) {
            OrchestrationViewEvent.m93825a(getActivity(), this.f95359C, new bjes(1622));
            mo52899i(6);
        } else if (view instanceof bkbn) {
            OrchestrationViewEvent.m93825a(getActivity(), this.f95359C, new bjes(1621));
            if (!mo52804a((List) null)) {
                this.f95363G.mo66055n();
            } else if (!mo52870ac()) {
                int size = ((bwjm) this.f95397aj).f159825m.size();
                for (int i = 0; i < size; i++) {
                    if (mo52889b((bwio) ((bwjm) this.f95397aj).f159825m.get(i))) {
                        this.f95363G.mo66041d(true);
                        if (this.f94606e != null) {
                            getFragmentManager().beginTransaction().remove(this.f94606e).commit();
                        }
                        awzr a = awzr.m81794a((bmde) ((bwjm) this.f95397aj).f159824l.get(i));
                        this.f94606e = a;
                        a.f123993e = this;
                        a.f123992d = this;
                        a.show(getFragmentManager(), "confirmationDialog");
                        return;
                    }
                }
                mo52261w();
            } else {
                mo52873af();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        bwjm bwjm;
        bmav bmav;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (bundle == null) {
            if (this.f95371O) {
                this.f95368L = 1;
            } else if (arguments.containsKey("initializeToken")) {
                this.f95368L = 1;
                bwjl bwjl = (bwjl) bjvp.m104730a(arguments, "initializeToken", (bxxk) bwjl.f159802g.mo74142c(7));
                FixInstrumentRootFragment$FixInstrumentPageDetails fixInstrumentRootFragment$FixInstrumentPageDetails = new FixInstrumentRootFragment$FixInstrumentPageDetails();
                bmar bmar = null;
                if ((bwjl.f159804a & 8) != 0) {
                    bwjm = bwjl.f159808e;
                    if (bwjm == null) {
                        bwjm = bwjm.f159811p;
                    }
                } else {
                    bwjm = null;
                }
                fixInstrumentRootFragment$FixInstrumentPageDetails.f110460i = bwjm;
                bwjm bwjm2 = bwjl.f159808e;
                if (bwjm2 == null) {
                    bwjm2 = bwjm.f159811p;
                }
                if ((bwjm2.f159813a & 64) != 0) {
                    bwjm bwjm3 = bwjl.f159808e;
                    if (bwjm3 == null) {
                        bwjm3 = bwjm.f159811p;
                    }
                    bmkw bmkw = bwjm3.f159826n;
                    if (bmkw == null) {
                        bmkw = bmkw.f129898c;
                    }
                    fixInstrumentRootFragment$FixInstrumentPageDetails.f110463l = bmkw;
                }
                bmaq bmaq = bwjl.f159805b;
                if (bmaq == null) {
                    bmaq = bmaq.f128479l;
                }
                fixInstrumentRootFragment$FixInstrumentPageDetails.f110465n = bmaq;
                if ((bwjl.f159804a & 4) != 0) {
                    bmav = bwjl.f159807d;
                    if (bmav == null) {
                        bmav = bmav.f128500h;
                    }
                } else {
                    bmav = null;
                }
                fixInstrumentRootFragment$FixInstrumentPageDetails.f110468q = bmav;
                bwgz a = bwgz.m121952a(bwjl.f159809f);
                if (a == null) {
                    a = bwgz.UNKNOWN_FLOW_INSTRUCTION;
                }
                fixInstrumentRootFragment$FixInstrumentPageDetails.f110454c = a;
                if ((bwjl.f159804a & 2) != 0 && (bmar = bwjl.f159806c) == null) {
                    bmar = bmar.f128490c;
                }
                fixInstrumentRootFragment$FixInstrumentPageDetails.f110467p = bmar;
                this.f95399al = fixInstrumentRootFragment$FixInstrumentPageDetails;
            } else if (arguments.containsKey("parameters")) {
                this.f94605d = arguments.getByteArray("parameters");
                this.f94604c = true;
            } else {
                throw new IllegalArgumentException("FixInstrument requires either encrypted params or initialization token");
            }
            OrchestrationViewEvent.m93828c(getActivity(), this.f95359C, this.f94609i);
            return;
        }
        this.f94604c = bundle.getBoolean("shouldMakeInitializeRequest", false);
        this.f94605d = arguments.getByteArray("parameters");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("shouldMakeInitializeRequest", this.f94604c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo52261w() {
        mo52895f((bwjn) mo52885b(Bundle.EMPTY, (byte[]) null, (List) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo51914b(Object obj) {
        bwjn bwjn = (bwjn) obj;
        bxvd da = bwjo.f159838d.mo74144da();
        bmaj a = awfx.m79878a(this.f95398ak.f110465n.f128483c.mo73780k());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwjo bwjo = (bwjo) da.f164949b;
        a.getClass();
        bwjo.f159841b = a;
        int i = bwjo.f159840a | 1;
        bwjo.f159840a = i;
        if (bwjn != null) {
            bwjn.getClass();
            bwjo.f159842c = bwjn;
            bwjo.f159840a = i | 2;
        }
        bwjo bwjo2 = (bwjo) da.mo74062i();
        m80134a(bwjo2);
        return bwjo2;
    }

    /* renamed from: c */
    public final void mo52062c(int i) {
        this.f94606e = null;
        if (i != 1) {
            mo52808n(true);
        } else {
            mo52261w();
        }
    }

    /* renamed from: b */
    public final void mo51915b(int i) {
        if (i == 1) {
            OrchestrationDcbEvent.m93820a(getActivity(), this.f95359C, 2);
        } else if (i != 5) {
            OrchestrationDcbEvent.m93820a(getActivity(), this.f95359C, 3);
            mo52839Y().f94357a.mo52428c();
            m80133B();
        } else {
            OrchestrationDcbEvent.m93820a(getActivity(), this.f95359C, 4);
            mo52839Y().f94357a.mo52428c();
            m80133B();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo51916b(boolean z) {
        String str;
        bwjm bwjm = (bwjm) this.f95397aj;
        if ((bwjm.f159813a & 1) != 0) {
            str = bwjm.f159814b;
        } else {
            str = null;
        }
        this.f95373Q = str;
        if (z) {
            this.f95357A.setVisibility(8);
            this.f95363G.mo66025a(3);
        }
        mo52892d(z);
        this.f94603b.removeAllViews();
        if (((bwjm) this.f95397aj).f159816d.size() != 0) {
            this.f94607f = new awlw();
        } else {
            this.f94607f = new awlz(this);
        }
        this.f94607f.mo52255a(z);
        bjwl.m104784a(this, 2, this.f124196aK);
        bjwl.m104784a(this, 1, this.f124196aK);
        bxwc bxwc = ((bwjm) this.f95397aj).f159825m;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            mo52859a((bwio) bxwc.get(i));
        }
        mo52868aa();
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
        this.f95357A = layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_fix_instrument, viewGroup, false);
        this.f94602a = (FocusedViewToTopScrollView) this.f95357A.findViewById(C0126R.C0129id.content_scroll_view);
        mo52851a((awib) ((ProgressSpinnerView) this.f95357A.findViewById(C0126R.C0129id.progress_spinner_container)));
        this.f94603b = (ViewGroup) this.f95357A.findViewById(C0126R.C0129id.components_holder);
        this.f95384aB = (ViewGroup) this.f95357A.findViewById(C0126R.C0129id.bottom_sticky_button_container);
        this.f95363G.mo66029a((bkio) this);
        mo51917c();
        if (this.f94604c) {
            mo52865a((Runnable) new awlu(this));
        } else if (this.f95368L == 1) {
            mo52888b("onInitialLoad");
        }
        if (bundle != null) {
            bkch bkch = (bkch) getFragmentManager().findFragmentByTag("confirmationDialog");
            this.f94606e = bkch;
            if (bkch != null) {
                bkch.f123993e = this;
                bkch.f123992d = this;
            }
        }
        return this.f95357A;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo51902a(Bundle bundle, byte[] bArr, List list) {
        bxvd da = bwjn.f159829h.mo74144da();
        axbr axbr = (axbr) mo52884b(13, axbr.class);
        if (!((((bwjm) this.f95397aj).f159813a & 4) == 0 || axbr == null)) {
            bmgo a = axbr.mo52992a(bundle);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwjn bwjn = (bwjn) da.f164949b;
            a.getClass();
            bwjn.f159832b = a;
            bwjn.f159831a |= 1;
        }
        bkdx b = mo52884b(24, bkdx.class);
        if (b != null) {
            bwjm bwjm = (bwjm) this.f95397aj;
            if ((bwjm.f159813a & 8) != 0) {
                bmfs bmfs = bwjm.f159818f;
                if (bmfs == null) {
                    bmfs = bmfs.f129155e;
                }
                bmft a2 = bjvh.m104697a(b, bmfs);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwjn bwjn2 = (bwjn) da.f164949b;
                a2.getClass();
                bwjn2.f159833c = a2;
                bwjn2.f159831a |= 2;
            }
        }
        ArrayList a3 = mo52847a(6, awzs.class);
        if (!a3.isEmpty()) {
            int size = a3.size();
            for (int i = 0; i < size; i++) {
                bmed c = ((awzs) a3.get(i)).mo52944a(bundle);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwjn bwjn3 = (bwjn) da.f164949b;
                c.getClass();
                if (!bwjn3.f159836f.mo73666a()) {
                    bwjn3.f159836f = GeneratedMessageLite.m124021a(bwjn3.f159836f);
                }
                bwjn3.f159836f.add(c);
            }
        }
        bkig bkig = (bkig) mo52884b(35, bkig.class);
        if (!((((bwjm) this.f95397aj).f159813a & 128) == 0 || bkig == null)) {
            bmdk m = bkig.mo66019m();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwjn bwjn4 = (bwjn) da.f164949b;
            m.getClass();
            bwjn4.f159837g = m;
            bwjn4.f159831a |= 8;
        }
        List asList = Arrays.asList(this.f94607f.mo52256a());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwjn bwjn5 = (bwjn) da.f164949b;
        if (!bwjn5.f159834d.mo73666a()) {
            bwjn5.f159834d = GeneratedMessageLite.m124021a(bwjn5.f159834d);
        }
        bxsy.m123078a(asList, bwjn5.f159834d);
        if (bArr != null) {
            ByteString a4 = ByteString.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwjn bwjn6 = (bwjn) da.f164949b;
            a4.getClass();
            bwjn6.f159831a |= 4;
            bwjn6.f159835e = a4;
        }
        return (bwjn) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51903a() {
        mo52261w();
    }

    /* renamed from: a */
    public final void mo51904a(int i) {
        super.mo51904a(i);
        if (i == 1) {
            this.f95357A.setVisibility(0);
        }
        this.f95363G.mo66047g(true);
    }

    /* renamed from: a */
    public final void mo51905a(int i, Bundle bundle) {
        if (i != 8) {
            super.mo51905a(i, bundle);
        } else {
            mo52895f((bwjn) mo52885b(bundle, bundle.getByteArray("EventListener.EXTRA_DEPENDENCY_GRAPH_ACTION_TOKEN"), (List) null));
        }
    }

    /* renamed from: a */
    public final void mo51907a(bjer bjer) {
        OrchestrationViewEvent.m93828c(getActivity(), this.f95359C, bjer.mo51919co());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51908a(bmaf bmaf) {
        throw new UnsupportedOperationException("Refreshes are not supported by FixInstrument.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo52259a(bmaq bmaq, bwgz bwgz, bmar bmar, bwjm bwjm, bmav bmav, boolean z, String str) {
        int i = 2;
        if (bmav != null && !bkfr.m105582a(bmav)) {
            i = 3;
        }
        OrchestrationApiEvent.m93817a(getActivity(), i, bmaq, bmav, this.f95359C);
        mo52853a(bmav, bmaq);
        FixInstrumentRootFragment$FixInstrumentPageDetails fixInstrumentRootFragment$FixInstrumentPageDetails = new FixInstrumentRootFragment$FixInstrumentPageDetails();
        fixInstrumentRootFragment$FixInstrumentPageDetails.f110460i = bwjm;
        if (!(bwjm == null || (bwjm.f159813a & 64) == 0)) {
            bmkw bmkw = bwjm.f159826n;
            if (bmkw == null) {
                bmkw = bmkw.f129898c;
            }
            fixInstrumentRootFragment$FixInstrumentPageDetails.f110463l = bmkw;
        }
        fixInstrumentRootFragment$FixInstrumentPageDetails.f110468q = bmav;
        fixInstrumentRootFragment$FixInstrumentPageDetails.f110454c = bwgz;
        fixInstrumentRootFragment$FixInstrumentPageDetails.f110465n = bmaq;
        fixInstrumentRootFragment$FixInstrumentPageDetails.f110467p = bmar;
        fixInstrumentRootFragment$FixInstrumentPageDetails.f110452a = false;
        mo52364a(fixInstrumentRootFragment$FixInstrumentPageDetails, z, str);
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        bmmp bmmp;
        bxvw bxvw;
        bmmp bmmp2;
        bmmp bmmp3;
        int a = bmmb.m108166a(bmmv.f130058d);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 3) {
            super.mo51910a(bmmv, list);
            return;
        }
        if (bmmv.f130056b == 4) {
            bmmp = (bmmp) bmmv.f130057c;
        } else {
            bmmp = bmmp.f130032e;
        }
        if (!bmmp.f130035b) {
            if (bmmv.f130056b == 4) {
                bmmp3 = (bmmp) bmmv.f130057c;
            } else {
                bmmp3 = bmmp.f130032e;
            }
            bxvw = bmmp3.f130034a;
        } else {
            bxvw = null;
        }
        if (mo52804a((List) bxvw)) {
            if (bmmv.f130056b == 4) {
                bmmp2 = (bmmp) bmmv.f130057c;
            } else {
                bmmp2 = bmmp.f130032e;
            }
            mo52895f((bwjn) mo52885b(Bundle.EMPTY, bmmp2.f130037d.getKey(), (List) null));
            return;
        }
        mo52817Q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51911a(Object obj) {
        String str;
        mo52808n(false);
        if (obj instanceof bwjk) {
            mo52900j(2);
            mo52839Y().f94357a.mo52414a((bwjk) obj);
        } else if (!(obj instanceof bwjo)) {
            Object[] objArr = new Object[1];
            if (obj != null) {
                str = obj.getClass().getName();
            } else {
                str = null;
            }
            objArr[0] = str;
            throw new IllegalArgumentException(String.format("Unable to retry request for request: %s", objArr));
        } else {
            mo52900j(3);
            m80134a((bwjo) obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo51912a(PageDetails pageDetails) {
        mo52860a(pageDetails, 3);
        return false;
    }
}
