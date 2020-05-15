package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.wallet.addinstrument.AddInstrumentRootFragment$AddInstrumentPageDetails;
import com.google.android.gms.wallet.analytics.events.OrchestrationDcbEvent;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.gms.wallet.p088ui.common.PageDetails;
import com.google.android.gms.wallet.service.orchestration.AddInstrumentSubmitRequest;
import com.google.android.wallet.p097ui.common.FocusedViewToTopScrollView;
import com.google.android.wallet.p097ui.common.FormHeaderView;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import com.google.android.wallet.p097ui.common.LegalMessageContainer;
import java.util.Arrays;
import java.util.List;

/* renamed from: awcj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awcj extends awzg implements bkbo, bkio, bjem, bjvx {

    /* renamed from: k */
    public static final /* synthetic */ int f94176k = 0;

    /* renamed from: a */
    InfoMessageView f94177a;

    /* renamed from: b */
    LegalMessageContainer f94178b;

    /* renamed from: c */
    FormHeaderView f94179c;

    /* renamed from: d */
    FrameLayout f94180d;

    /* renamed from: e */
    axbr f94181e;

    /* renamed from: f */
    bkdx f94182f;

    /* renamed from: g */
    bkig f94183g;

    /* renamed from: h */
    boolean f94184h;

    /* renamed from: i */
    byte[] f94185i;

    /* renamed from: j */
    final awpc f94186j = new awch(this);

    /* renamed from: l */
    private ViewGroup f94187l;

    /* renamed from: m */
    private FocusedViewToTopScrollView f94188m;

    /* renamed from: n */
    private final bjes f94189n = new bjes(13);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean, java.lang.String):void
     arg types: [com.google.android.gms.wallet.addinstrument.AddInstrumentRootFragment$AddInstrumentPageDetails, int, java.lang.String]
     candidates:
      awcj.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View
      awcj.a(android.os.Bundle, byte[], java.util.List):java.lang.Object
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
    private final void m79647B() {
        AddInstrumentRootFragment$AddInstrumentPageDetails addInstrumentRootFragment$AddInstrumentPageDetails = new AddInstrumentRootFragment$AddInstrumentPageDetails(this.f95398ak);
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
        addInstrumentRootFragment$AddInstrumentPageDetails.f110468q = (bmav) da.mo74062i();
        addInstrumentRootFragment$AddInstrumentPageDetails.f110454c = bwgz.HANDLE_UI_ERROR;
        mo52364a((PageDetails) addInstrumentRootFragment$AddInstrumentPageDetails, false, "dcbError");
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
    private final void m79648a(blxq blxq) {
        bmgo bmgo;
        bmfv bmfv;
        awpb awpb = mo52839Y().f94357a;
        bmar bmar = this.f95398ak.f110467p;
        awou awou = (awou) awpb;
        sdo.m34971a(awou.mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        if (!awou.mo52425a(blxq)) {
            Message.obtain(awou.f94784u, 42, new AddInstrumentSubmitRequest(awou.f94765b, blxq, bmar.f128492a)).sendToTarget();
        }
        blxp blxp = blxq.f128120c;
        if (blxp == null) {
            blxp = blxp.f128108g;
        }
        if (blxp.f128111b == 2) {
            bmgo = (bmgo) blxp.f128112c;
        } else {
            bmgo = bmgo.f129290e;
        }
        if (bmgo.f129292a == 2) {
            bmfv = (bmfv) bmgo.f129293b;
        } else {
            bmfv = bmfv.f129179c;
        }
        if (bmfv.f129181a == 4) {
            Object obj = this.f94181e.f95712k;
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

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final awpc mo51913b() {
        return this.f94186j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo51917c() {
        boolean z;
        boolean z2 = false;
        if (((Boolean) awja.f94513a.mo58455c()).booleanValue() || bkfr.m105580a(getActivity(), bmap.ENABLE_SCROLL_TO_TOP)) {
            z = true;
        } else {
            z = false;
        }
        if ((((Boolean) awja.f94513a.mo58455c()).booleanValue() || bkfr.m105580a(getActivity(), bmap.ENABLE_SMOOTH_SCROLLING)) && bkfr.m105612e(getActivity())) {
            z2 = true;
        }
        FocusedViewToTopScrollView focusedViewToTopScrollView = this.f94188m;
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
        return (bxxk) blxm.f128081e.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final bxxk mo51921e() {
        return (bxxk) blxq.f128116d.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        super.mo51922f();
        boolean z = this.f124195aJ;
        InfoMessageView infoMessageView = this.f94177a;
        if (infoMessageView != null) {
            infoMessageView.setEnabled(z);
        }
        axbr axbr = this.f94181e;
        if (axbr != null) {
            axbr.mo52808n(z);
        }
        bkdx bkdx = this.f94182f;
        if (bkdx != null) {
            bkdx.mo52808n(z);
        }
        bkig bkig = this.f94183g;
        if (bkig != null) {
            bkig.mo52808n(z);
        }
        FormHeaderView formHeaderView = this.f94179c;
        if (formHeaderView != null) {
            formHeaderView.setEnabled(z);
        }
        LegalMessageContainer legalMessageContainer = this.f94178b;
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
        blxo blxo = (blxo) obj;
        if ((blxo.f128097a & 128) == 0) {
            return null;
        }
        bmlz bmlz = blxo.f128104h;
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
        return (bxxk) blxo.f128095k.mo74142c(7);
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
            int a = bmda.m107911a(bkbn.mo65788c().f128777i);
            if (a == 0) {
                a = 1;
            }
            if (bkfr.m105620h(a) && bkbn.mo52710b().getVisibility() == 0) {
                break;
            }
            i++;
        }
        if (bkbn != null) {
            bkbn.mo52710b().requestFocus();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f94185i = getArguments().getByteArray("parameters");
        if (bundle != null) {
            this.f94184h = bundle.getBoolean("shouldMakeInitializeRequest", false);
        } else if (!this.f95371O) {
            this.f94184h = true;
            OrchestrationViewEvent.m93828c(getActivity(), this.f95359C, this.f94189n);
        } else {
            this.f95368L = 1;
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("shouldMakeInitializeRequest", this.f94184h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo51914b(Object obj) {
        blxp blxp = (blxp) obj;
        bxvd da = blxq.f128116d.mo74144da();
        bmaj a = awfx.m79878a(this.f95398ak.f110465n.f128483c.mo73780k());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blxq blxq = (blxq) da.f164949b;
        a.getClass();
        blxq.f128119b = a;
        int i = blxq.f128118a | 1;
        blxq.f128118a = i;
        if (blxp != null) {
            blxp.getClass();
            blxq.f128120c = blxp;
            blxq.f128118a = i | 2;
        }
        blxq blxq2 = (blxq) da.mo74062i();
        m79648a(blxq2);
        return blxq2;
    }

    /* renamed from: c */
    public final void mo51918c(int i) {
        if (bkfr.m105620h(i)) {
            OrchestrationViewEvent.m93825a(getActivity(), this.f95359C, new bjes(1621));
            if (!mo52804a((List) null)) {
                this.f95363G.mo66055n();
            } else if (mo52870ac()) {
                mo52873af();
            } else {
                mo51906a(Bundle.EMPTY, (byte[]) null);
            }
        }
    }

    /* renamed from: b */
    public final void mo51915b(int i) {
        if (i == 1) {
            OrchestrationDcbEvent.m93820a(getActivity(), this.f95359C, 2);
        } else if (i != 5) {
            OrchestrationDcbEvent.m93820a(getActivity(), this.f95359C, 3);
            mo52839Y().f94357a.mo52428c();
            m79647B();
        } else {
            OrchestrationDcbEvent.m93820a(getActivity(), this.f95359C, 4);
            mo52839Y().f94357a.mo52428c();
            m79647B();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzk.a(bmdb, android.view.ViewGroup, boolean):bkbn
     arg types: [bmdb, android.view.ViewGroup, int]
     candidates:
      awcj.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View
      awcj.a(android.os.Bundle, byte[], java.util.List):java.lang.Object
      awzg.a(awyy, int, long):void
      awzg.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean, java.lang.String):void
      awzk.a(com.google.android.gms.wallet.shared.BuyFlowConfig, java.lang.String, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      awzk.a(android.os.Bundle, byte[], java.util.List):java.lang.Object
      awzk.a(long, int, int):void
      awzk.a(awyy, int, long):void
      awzk.a(bmav, boolean, boolean):void
      awzk.a(bmnr, android.view.ViewGroup, boolean):void
      awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, int, int):void
      awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean, java.lang.String):void
      awzk.a(java.util.List, android.view.ViewGroup, boolean):void
      bkbr.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View
      awzk.a(bmdb, android.view.ViewGroup, boolean):bkbn */
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
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0184, code lost:
        if (r0 != false) goto L_0x01ae;
     */
    /* renamed from: b */
    public final void mo51916b(boolean z) {
        bmfs bmfs;
        bmfs bmfs2;
        boolean z2;
        bmgn bmgn;
        if (z) {
            this.f95357A.setVisibility(8);
            this.f95363G.mo66025a(3);
        }
        this.f94187l.removeAllViews();
        this.f95402ao.clear();
        blxo blxo = (blxo) this.f95397aj;
        if ((blxo.f128097a & 1) != 0) {
            this.f95373Q = blxo.f128100d;
        }
        InfoMessageView infoMessageView = this.f94177a;
        bmnr bmnr = blxo.f128101e;
        if (bmnr == null) {
            bmnr = bmnr.f130153o;
        }
        infoMessageView.mo72006b(bmnr);
        if ((((blxo) this.f95397aj).f128097a & 4) != 0) {
            OrchestrationViewEvent.m93828c(getActivity(), this.f95359C, new bjes(1));
        }
        bxwc bxwc = ((blxo) this.f95397aj).f128102f;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bkbn a = mo52845a((bmdb) bxwc.get(i), this.f94187l, false);
            a.mo52706a(this);
            bkfr.m105560a((Context) this.f123962aG, a.mo52703a());
        }
        LegalMessageContainer legalMessageContainer = this.f94178b;
        legalMessageContainer.f152111a = this.f124196aK;
        legalMessageContainer.mo72026a(this);
        LegalMessageContainer legalMessageContainer2 = this.f94178b;
        legalMessageContainer2.f152112b = this;
        bmjf[] bmjfArr = (bmjf[]) ((blxo) this.f95397aj).f128103g.toArray(new bmjf[0]);
        bjxv k = mo65820k(this.f94178b.getId());
        if (bmjfArr == null) {
            legalMessageContainer2.mo72027a(null, k);
        } else {
            legalMessageContainer2.mo72027a(Arrays.asList(bmjfArr), k);
        }
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        this.f95363G.mo66040d();
        this.f95363G.mo66037b(false);
        this.f95385aC.clear();
        this.f95386aD.clear();
        this.f94181e = (axbr) getChildFragmentManager().findFragmentByTag("instrumentSelector");
        if (((blxo) this.f95397aj).f128098b == 5) {
            if (this.f94180d.getVisibility() != 0) {
                this.f94180d.setVisibility(0);
            }
            if (this.f94181e == null || z) {
                blxo blxo2 = (blxo) this.f95397aj;
                if (blxo2.f128098b == 5) {
                    bmgn = (bmgn) blxo2.f128099c;
                } else {
                    bmgn = bmgn.f129273o;
                }
                this.f94181e = axbr.m82191a(bmgn, this.f123961aF, this.f95359C, mo65980at(), this.f95358B);
                OrchestrationViewEvent.m93828c(getActivity(), this.f95359C, this.f94181e.f95719r);
                beginTransaction.replace(C0126R.C0129id.instrument_selector_fragment_holder, this.f94181e, "instrumentSelector");
            }
            this.f95385aC.add(new bkde(this.f94181e));
            this.f95386aD.add(this.f94181e);
            this.f95363G.mo66032a(this.f94181e);
            this.f94179c.setVisibility(8);
        } else {
            axbr axbr = this.f94181e;
            if (axbr != null) {
                beginTransaction.remove(axbr);
                this.f94181e = null;
            }
            this.f94180d.setVisibility(8);
        }
        this.f94182f = (bkdx) getChildFragmentManager().findFragmentByTag("instrumentActivationForm");
        blxo blxo3 = (blxo) this.f95397aj;
        if (blxo3.f128098b != 6) {
            bkdx bkdx = this.f94182f;
            if (bkdx != null) {
                beginTransaction.remove(bkdx);
                this.f94182f = null;
            }
        } else {
            if (!z) {
                bkdx bkdx2 = this.f94182f;
                bmfs bmfs3 = (bmfs) blxo3.f128099c;
                int i2 = bmfs3.f129158b;
                if (i2 == 1) {
                    int i3 = ((bmgr) bmfs3.f129159c).f129317a;
                    if (i3 == 1) {
                        z2 = bkdx2 instanceof bkan;
                    } else if (i3 == 2) {
                        z2 = bkdx2 instanceof bkam;
                    } else if (i3 == 3) {
                        z2 = bkdx2 instanceof bkaq;
                    }
                } else if (i2 == 2) {
                    z2 = bkdx2 instanceof bkiu;
                }
            }
            this.f94182f = bjvh.m104692a((bmfs) blxo3.f128099c, this.f123961aF, mo65980at());
            OrchestrationViewEvent.m93828c(getActivity(), this.f95359C, this.f94182f.mo51919co());
            beginTransaction.replace(C0126R.C0129id.instrument_activation_fragment_holder, this.f94182f, "instrumentActivationForm");
            this.f95385aC.add(new bkde(this.f94182f));
            this.f95386aD.add(this.f94182f);
            this.f95363G.mo66032a(this.f94182f);
            blxo blxo4 = (blxo) this.f95397aj;
            if (blxo4.f128098b == 6) {
                bmfs = (bmfs) blxo4.f128099c;
            } else {
                bmfs = bmfs.f129155e;
            }
            if ((bmfs.f129157a & 1) == 0) {
                this.f94179c.setVisibility(8);
            } else {
                this.f94179c.setVisibility(0);
                FormHeaderView formHeaderView = this.f94179c;
                blxo blxo5 = (blxo) this.f95397aj;
                if (blxo5.f128098b == 6) {
                    bmfs2 = (bmfs) blxo5.f128099c;
                } else {
                    bmfs2 = bmfs.f129155e;
                }
                bmdn bmdn = bmfs2.f129160d;
                if (bmdn == null) {
                    bmdn = bmdn.f128831k;
                }
                formHeaderView.mo71963a(bmdn, this.f123963aH, null, this.f95386aD);
            }
        }
        this.f94183g = (bkig) getChildFragmentManager().findFragmentByTag("encryptionForm");
        blxo blxo6 = (blxo) this.f95397aj;
        if ((blxo6.f128097a & 512) == 0) {
            bkig bkig = this.f94183g;
            if (bkig != null) {
                beginTransaction.remove(bkig);
                this.f94183g = null;
            }
        } else {
            if (this.f94183g == null || z) {
                bmdj bmdj = blxo6.f128106j;
                if (bmdj == null) {
                    bmdj = bmdj.f128803l;
                }
                axcp a2 = axcp.m82327a(bmdj, this.f123961aF, this.f95359C, mo65980at());
                this.f94183g = a2;
                beginTransaction.replace(C0126R.C0129id.encryption_fragment_holder, a2, "encryptionForm");
            }
            this.f95385aC.add(new bkde(this.f94183g));
            this.f95386aD.add(this.f94183g);
        }
        bjwk bjwk = this.f124196aK;
        if (bjwk != null) {
            axbr axbr2 = this.f94181e;
            if (axbr2 != null) {
                axbr2.f124196aK = bjwk;
            }
            bkdx bkdx3 = this.f94182f;
            if (bkdx3 != null) {
                bkdx3.f124196aK = this.f124196aK;
            }
            bkig bkig2 = this.f94183g;
            if (bkig2 != null) {
                bkig2.f124196aK = this.f124196aK;
            }
            bjwl.m104784a(this, 2, this.f124196aK);
            bjwl.m104784a(this, 1, this.f124196aK);
        }
        beginTransaction.commit();
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
        this.f95357A = layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_add_instrument_widget, viewGroup, false);
        mo52851a((awib) getActivity());
        this.f94188m = (FocusedViewToTopScrollView) mo52872ae();
        this.f94181e = (axbr) getChildFragmentManager().findFragmentByTag("instrumentSelector");
        this.f94182f = (bkdx) getChildFragmentManager().findFragmentByTag("instrumentActivationForm");
        this.f94183g = (bkig) getChildFragmentManager().findFragmentByTag("encryptionForm");
        this.f94177a = (InfoMessageView) this.f95357A.findViewById(C0126R.C0129id.top_info_message);
        this.f94178b = (LegalMessageContainer) this.f95357A.findViewById(C0126R.C0129id.legal_message_container);
        this.f94179c = (FormHeaderView) this.f95357A.findViewById(C0126R.C0129id.instrument_activation_fragment_form_header);
        this.f94180d = (FrameLayout) this.f95357A.findViewById(C0126R.C0129id.instrument_selector_fragment_holder);
        this.f94187l = (ViewGroup) this.f95357A.findViewById(C0126R.C0129id.submit_button_container);
        this.f95363G.mo66029a((bkio) this);
        if (this.f94184h) {
            mo52865a((Runnable) new awcg(this));
        } else if (this.f95368L == 1) {
            mo52888b("onInitialLoad");
        }
        return this.f95357A;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo51902a(Bundle bundle, byte[] bArr, List list) {
        bmfs bmfs;
        bxvd da = blxp.f128108g.mo74144da();
        axbr axbr = this.f94181e;
        if (axbr != null) {
            bmgo a = axbr.mo52992a(bundle);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blxp blxp = (blxp) da.f164949b;
            a.getClass();
            blxp.f128112c = a;
            blxp.f128111b = 2;
        }
        bkdx bkdx = this.f94182f;
        if (bkdx != null) {
            blxo blxo = (blxo) this.f95397aj;
            if (blxo.f128098b == 6) {
                bmfs = (bmfs) blxo.f128099c;
            } else {
                bmfs = bmfs.f129155e;
            }
            bmft a2 = bjvh.m104697a(bkdx, bmfs);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blxp blxp2 = (blxp) da.f164949b;
            a2.getClass();
            blxp2.f128112c = a2;
            blxp2.f128111b = 3;
        }
        bkig bkig = this.f94183g;
        if (bkig != null) {
            bmdk m = bkig.mo66019m();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blxp blxp3 = (blxp) da.f164949b;
            m.getClass();
            blxp3.f128115f = m;
            blxp3.f128110a |= 8;
        }
        List asList = Arrays.asList(this.f94178b.mo72028a());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blxp blxp4 = (blxp) da.f164949b;
        if (!blxp4.f128114e.mo73666a()) {
            blxp4.f128114e = bxvk.m124021a(blxp4.f128114e);
        }
        bxsy.m123078a(asList, blxp4.f128114e);
        if (bArr != null) {
            bxtx a3 = bxtx.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blxp blxp5 = (blxp) da.f164949b;
            a3.getClass();
            blxp5.f128110a |= 4;
            blxp5.f128113d = a3;
        }
        return (blxp) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51903a() {
        mo51906a(Bundle.EMPTY, (byte[]) null);
    }

    /* renamed from: a */
    public final void mo51904a(int i) {
        super.mo51904a(i);
        if (i == 1) {
            FocusedViewToTopScrollView focusedViewToTopScrollView = this.f94188m;
            focusedViewToTopScrollView.f151970r = false;
            focusedViewToTopScrollView.mo71903a(false);
            this.f95357A.setVisibility(0);
            this.f95363G.mo66047g(false);
            mo52881an().postDelayed(awgc.m79888a(this, "scrollToTop"), 1000);
            return;
        }
        this.f95363G.mo66047g(true);
    }

    /* renamed from: a */
    public final void mo51905a(int i, Bundle bundle) {
        if (i != 8) {
            super.mo51905a(i, bundle);
        } else {
            mo51906a(bundle, bundle.getByteArray("EventListener.EXTRA_DEPENDENCY_GRAPH_ACTION_TOKEN"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51906a(Bundle bundle, byte[] bArr) {
        mo52895f((blxp) mo52885b(bundle, bArr, (List) null));
    }

    /* renamed from: a */
    public final void mo51907a(bjer bjer) {
        OrchestrationViewEvent.m93828c(getActivity(), this.f95359C, bjer.mo51919co());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51908a(bmaf bmaf) {
        throw new UnsupportedOperationException("Refreshes are not supported by AddInstrument.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51909a(bmaq bmaq, bwgz bwgz, bmar bmar, blxo blxo, bmav bmav, boolean z, String str) {
        mo52853a(bmav, bmaq);
        AddInstrumentRootFragment$AddInstrumentPageDetails addInstrumentRootFragment$AddInstrumentPageDetails = new AddInstrumentRootFragment$AddInstrumentPageDetails();
        addInstrumentRootFragment$AddInstrumentPageDetails.f110460i = blxo;
        if (!(blxo == null || (blxo.f128097a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0)) {
            bmkw bmkw = blxo.f128105i;
            if (bmkw == null) {
                bmkw = bmkw.f129898c;
            }
            addInstrumentRootFragment$AddInstrumentPageDetails.f110463l = bmkw;
        }
        addInstrumentRootFragment$AddInstrumentPageDetails.f110468q = bmav;
        addInstrumentRootFragment$AddInstrumentPageDetails.f110467p = bmar;
        addInstrumentRootFragment$AddInstrumentPageDetails.f110454c = bwgz;
        addInstrumentRootFragment$AddInstrumentPageDetails.f110465n = bmaq;
        addInstrumentRootFragment$AddInstrumentPageDetails.f110452a = false;
        mo52364a(addInstrumentRootFragment$AddInstrumentPageDetails, z, str);
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        bmmp bmmp;
        bmmp bmmp2;
        bxvw bxvw;
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
        byte[] k = bmmp.f130037d.mo73780k();
        Bundle bundle = new Bundle();
        bjvp.m104737a(bundle, "EventListener.EXTRA_TRIGGER_VALUE_REFERENCES", list);
        if (bmmv.f130056b == 4) {
            bmmp2 = (bmmp) bmmv.f130057c;
        } else {
            bmmp2 = bmmp.f130032e;
        }
        if (!bmmp2.f130035b) {
            if (bmmv.f130056b == 4) {
                bmmp3 = (bmmp) bmmv.f130057c;
            } else {
                bmmp3 = bmmp.f130032e;
            }
            bxvw = bmmp3.f130034a;
        } else {
            bxvw = null;
        }
        if (!mo52804a((List) bxvw)) {
            mo52817Q();
        } else {
            mo51906a(bundle, k);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51911a(Object obj) {
        if (obj instanceof blxm) {
            mo52808n(false);
            mo52900j(2);
            mo52839Y().f94357a.mo52398a((blxm) obj);
        } else if (obj instanceof blxq) {
            mo52808n(false);
            mo52900j(3);
            m79648a((blxq) obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo51912a(PageDetails pageDetails) {
        mo52860a(pageDetails, 1);
        return false;
    }
}
