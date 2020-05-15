package p000;

import android.accounts.Account;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Message;
import android.text.Html;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.wallet.analytics.events.OrchestrationApiEvent;
import com.google.android.gms.wallet.analytics.events.OrchestrationDcbEvent;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.gms.wallet.analytics.events.SubmitButtonPositionEvent;
import com.google.android.gms.wallet.buyflow.BuyFlowFragment$BuyFlowPageDetails;
import com.google.android.gms.wallet.buyflow.BuyFlowResult;
import com.google.android.gms.wallet.common.p079ui.BottomSheetView;
import com.google.android.gms.wallet.common.p079ui.PopoverView;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysRequest;
import com.google.android.gms.wallet.p088ui.common.PageDetails;
import com.google.android.gms.wallet.p088ui.common.ProgressSpinnerView;
import com.google.android.gms.wallet.service.orchestration.BuyflowSubmitRequest;
import com.google.android.gms.wallet.service.reauth.ReauthProofTokenRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.common.FocusedViewToTopScrollView;
import com.google.android.wallet.p097ui.common.FormEditText;
import com.google.android.wallet.p097ui.common.FormHeaderView;
import com.google.android.wallet.p097ui.common.LegalMessageView;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: awer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awer extends awzg implements View.OnClickListener, ViewTreeObserver.OnGlobalFocusChangeListener, bkcy, bkio, bkih, awzt, bjwt, awyo, bkcg, bjvx, bkjl, awyp, bkcb {

    /* renamed from: a */
    public static final byte[] f94220a = new byte[0];

    /* renamed from: aL */
    private View f94221aL;

    /* renamed from: aM */
    private bwdp f94222aM;

    /* renamed from: aN */
    private final bjes f94223aN = new bjes(7);

    /* renamed from: aO */
    private boolean f94224aO;

    /* renamed from: aP */
    private boolean f94225aP;

    /* renamed from: aQ */
    private boolean f94226aQ;

    /* renamed from: aR */
    private boolean f94227aR;

    /* renamed from: aS */
    private final List f94228aS = new ArrayList();

    /* renamed from: b */
    bkch f94229b;

    /* renamed from: c */
    View f94230c;

    /* renamed from: d */
    public byte[] f94231d;

    /* renamed from: e */
    public blzf f94232e;

    /* renamed from: f */
    byaa f94233f;

    /* renamed from: g */
    boolean f94234g = false;

    /* renamed from: h */
    PopoverView f94235h;

    /* renamed from: i */
    BottomSheetView f94236i;

    /* renamed from: j */
    public boolean f94237j;

    /* renamed from: k */
    ViewGroup f94238k;

    /* renamed from: l */
    final List f94239l = new ArrayList();

    /* renamed from: m */
    byte[] f94240m;

    /* renamed from: n */
    int f94241n = 0;

    /* renamed from: o */
    bjvy f94242o;

    /* renamed from: p */
    public awen f94243p = new awen(this);

    /* renamed from: q */
    public aweq f94244q;

    /* renamed from: r */
    public awep f94245r;

    /* renamed from: s */
    boolean f94246s;

    /* renamed from: t */
    public awgc f94247t;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public static awer m79720a(byte[] bArr, byte[] bArr2, BuyFlowConfig buyFlowConfig, String str, byte[] bArr3, LogContext logContext) {
        blym blym;
        sdo.m34966a(bArr, "initializeResponseToken must not be null");
        sdo.m34969a(str, (Object) "analyticsSessionId must be valid");
        awer awer = new awer();
        blxx blxx = (blxx) bjvp.m104733a(bArr, (bxxk) blxx.f128159j.mo74142c(7));
        if ((blxx.f128161a & 16) != 0) {
            blym = blxx.f128166f;
            if (blym == null) {
                blym = blym.f128215R;
            }
        } else {
            blym = null;
        }
        sdo.m34966a(buyFlowConfig, "buyFlowConfig must not be null");
        sdo.m34966a(buyFlowConfig.f110418b.f110407b, "account must be set in buyFlowConfig");
        sdo.m34969a(str, (Object) "analyticsSessionId must be valid");
        Bundle a = bkbr.m105273a((int) C0126R.style.WalletEmptyStyle, logContext);
        bjvp.m104736a(a, "pageProto", blym);
        a.putParcelable("buyFlowConfig", buyFlowConfig);
        a.putString("analyticsSessionId", str);
        bjvp.m104736a(a, "initializeResponse", blxx);
        a.putByteArray("encryptedParams", null);
        if (bArr2 != null && bArr2.length > 0) {
            a.putByteArray("unencryptedParams", bArr2);
        }
        if (bArr3 != null) {
            a.putByteArray("buyFlowStateToken", bArr3);
        }
        awer.setArguments(a);
        return awer;
    }

    /* renamed from: aA */
    private final View m79724aA() {
        bkbn bkbn;
        int size = this.f95402ao.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bkbn = null;
                break;
            }
            bkbn = (bkbn) this.f95402ao.get(i);
            if (((Integer) this.f95374R.mo15535a(bkbn.mo65788c().f128770b, -1)).intValue() == 7 && bkbn.mo52710b().getVisibility() == 0) {
                break;
            }
            i++;
        }
        if (bkbn != null) {
            return bkbn.mo52710b();
        }
        awyq I = mo52037I();
        if (I != null) {
            return I.getView();
        }
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean, java.lang.String):void
     arg types: [com.google.android.gms.wallet.buyflow.BuyFlowFragment$BuyFlowPageDetails, int, java.lang.String]
     candidates:
      awer.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View
      awer.a(android.os.Bundle, byte[], java.util.List):java.lang.Object
      awer.a(bmaf, android.os.Bundle, byte[]):void
      awer.a(byte[], java.util.List, java.util.List):void
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
    /* renamed from: aB */
    private final void m79725aB() {
        BuyFlowFragment$BuyFlowPageDetails buyFlowFragment$BuyFlowPageDetails = new BuyFlowFragment$BuyFlowPageDetails(this.f95398ak);
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
        buyFlowFragment$BuyFlowPageDetails.f110468q = (bmav) da.mo74062i();
        buyFlowFragment$BuyFlowPageDetails.f110454c = bwgz.HANDLE_UI_ERROR;
        mo52364a((PageDetails) buyFlowFragment$BuyFlowPageDetails, false, "dcbError");
    }

    /* renamed from: aC */
    private final void m79726aC() {
        bjwk bjwk = this.f124196aK;
        if (bjwk != null) {
            this.f124196aK = bjwk;
            mo52868aa();
            bjwl.m104784a(this, 2, this.f124196aK);
            bjwl.m104784a(this, 1, this.f124196aK);
        }
    }

    /* renamed from: aD */
    private final void m79727aD() {
        long j;
        blym blym = (blym) this.f95397aj;
        if ((blym.f128235a & 4194304) != 0) {
            bwio bwio = blym.f128217A;
            if (bwio == null) {
                bwio = bwio.f159659d;
            }
            if ((bwio.f159661a & 2) != 0) {
                ArrayList arrayList = new ArrayList();
                int size = this.f94239l.size();
                for (int i = 0; i < size; i++) {
                    bjwj bjwj = (bjwj) this.f94239l.get(i);
                    long j2 = bjwj.f123509a.f130093c;
                    bwio bwio2 = ((blym) this.f95397aj).f128217A;
                    if (bwio2 == null) {
                        bwio2 = bwio.f159659d;
                    }
                    if (j2 == bwio2.f159662b) {
                        arrayList.add(bjwj);
                    }
                }
                bwio bwio3 = ((blym) this.f95397aj).f128217A;
                if (bwio3 == null) {
                    bwio3 = bwio.f159659d;
                }
                boolean b = mo52889b(bwio3);
                bjwk bjwk = this.f124196aK;
                if (!b) {
                    j = 0;
                } else {
                    j = 1;
                }
                bjwl.m104782a(bjwk, arrayList, j);
                bxvd da = bwip.f159664e.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwip bwip = (bwip) da.f164949b;
                bwip.f159666a |= 1;
                bwip.f159667b = b;
                bwip bwip2 = (bwip) da.mo74062i();
                blym blym2 = (blym) this.f95397aj;
                bxvd bxvd = (bxvd) blym2.mo74142c(5);
                bxvd.mo73625a((bxvk) blym2);
                blyj blyj = (blyj) bxvd;
                bwio bwio4 = ((blym) this.f95397aj).f128217A;
                if (bwio4 == null) {
                    bwio4 = bwio.f159659d;
                }
                bxvd bxvd2 = (bxvd) bwio4.mo74142c(5);
                bxvd2.mo73625a((bxvk) bwio4);
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bwio bwio5 = (bwio) bxvd2.f164949b;
                bwip2.getClass();
                bwio5.f159663c = bwip2;
                bwio5.f159661a |= 2;
                if (blyj.f164950c) {
                    blyj.mo74035c();
                    blyj.f164950c = false;
                }
                blym blym3 = (blym) blyj.f164949b;
                bwio bwio6 = (bwio) bxvd2.mo74062i();
                bxvu bxvu = blym.f128214M;
                bwio6.getClass();
                blym3.f128217A = bwio6;
                blym3.f128235a |= 4194304;
                this.f95397aj = blyj.mo74062i();
            }
        }
    }

    /* renamed from: aE */
    private final int m79728aE() {
        awyq I = mo52037I();
        if (I != null) {
            return I.f95321s;
        }
        return 0;
    }

    /* renamed from: aF */
    private final ArrayList m79729aF() {
        ArrayList a = mo52847a(18, awyq.class);
        ArrayList a2 = mo52847a(6, awzs.class);
        for (int i = 0; i < a2.size(); i++) {
            a.addAll(((awzs) a2.get(i)).mo52920c());
        }
        return a;
    }

    /* renamed from: aG */
    private final String m79730aG() {
        bwio bwio;
        Object obj = this.f95397aj;
        if (obj == null) {
            return null;
        }
        bwio bwio2 = ((blym) obj).f128218B;
        if (bwio2 == null) {
            bwio2 = bwio.f159659d;
        }
        String str = ((blym) this.f95397aj).f128223G;
        if (bwio2 == null || (bwio = (bwio) this.f95387aE.mo15534a(bwio2.f159662b)) == null) {
            return str;
        }
        bwip bwip = bwio.f159663c;
        if (bwip == null) {
            bwip = bwip.f159664e;
        }
        return bwip.f159668c;
    }

    /* renamed from: ay */
    private final boolean m79731ay() {
        return ((Boolean) awja.f94514b.mo58455c()).booleanValue() || bkfr.m105580a(getActivity(), bmap.ENABLE_SCROLL_TO_TOP);
    }

    /* renamed from: az */
    private final boolean m79732az() {
        return ((Boolean) awja.f94514b.mo58455c()).booleanValue() || bkfr.m105580a(getActivity(), bmap.ENABLE_SMOOTH_SCROLLING);
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
    /* renamed from: b */
    public static awer m79733b(byte[] bArr, byte[] bArr2, BuyFlowConfig buyFlowConfig, String str, byte[] bArr3, LogContext logContext) {
        boolean z = true;
        if (bArr == null && bArr2 == null) {
            z = false;
        }
        sdo.m34971a(z, (Object) "encryptedBuyFlowParams and unencryptedBuyFlowParams cannot both be null");
        awer awer = new awer();
        Bundle a = awzk.m81653a(buyFlowConfig, str, logContext);
        a.putByteArray("encryptedParams", bArr);
        if (bArr2 != null && bArr2.length > 0) {
            a.putByteArray("unencryptedParams", bArr2);
        }
        if (bArr3 != null) {
            a.putByteArray("buyFlowStateToken", bArr3);
        }
        awer.setArguments(a);
        return awer;
    }

    /* renamed from: g */
    private final void m79735g(boolean z) {
        if (!mo52804a((List) null)) {
            mo52808n(true);
            mo52814N();
            ArrayList aF = m79729aF();
            int size = aF.size();
            for (int i = 0; i < size; i++) {
                ((awyq) aF.get(i)).mo52782l();
            }
            return;
        }
        bkfr.m105559a(getActivity(), this.f95357A);
        if (z) {
            bwio bwio = ((blym) this.f95397aj).f128260z;
            if (bwio == null) {
                bwio = bwio.f159659d;
            }
            if (mo52889b(bwio) && (((blym) this.f95397aj).f128235a & 1048576) != 0) {
                this.f95363G.mo66041d(true);
                if (this.f94229b != null) {
                    getFragmentManager().beginTransaction().remove(this.f94229b).commit();
                }
                bmde bmde = ((blym) this.f95397aj).f128259y;
                if (bmde == null) {
                    bmde = bmde.f128780k;
                }
                awzr a = awzr.m81794a(bmde);
                this.f94229b = a;
                a.f123993e = this;
                a.f123992d = this;
                a.show(getFragmentManager(), "confirmationDialog");
                return;
            }
        }
        mo52054a((byte[]) null, (List) null, (List) null);
    }

    /* renamed from: h */
    private final void m79736h(boolean z) {
        if (this.f95398ak.f110454c == bwgz.COMPLETE_FLOW_AFTER_DISPLAYING_NEW_PAGE) {
            this.f95398ak.f110466o = mo52036H();
            mo52873af();
        } else if (!z) {
            mo52054a((byte[]) null, (List) null, (List) null);
        } else {
            m79735g(true);
        }
    }

    /* renamed from: A */
    public final bwef mo52029A() {
        bwef bwef = this.f94232e.f128347j;
        return bwef == null ? bwef.f158969g : bwef;
    }

    /* renamed from: B */
    public final void mo52030B() {
        if (!this.f94226aQ) {
            this.f94226aQ = true;
            mo52033E();
        }
        if (this.f94246s && this.f94235h.mo59873a() && isResumed()) {
            mo52067o();
        }
    }

    /* renamed from: C */
    public final boolean mo52031C() {
        return this.f95398ak.f110468q != null;
    }

    /* renamed from: D */
    public final void mo52032D() {
        m79736h(true);
    }

    /* renamed from: E */
    public final void mo52033E() {
        int i;
        if (getActivity() != null && this.f94225aP) {
            if ((this.f94226aQ || this.f94236i != null) && this.f95357A.getVisibility() == 0) {
                if (!this.f94227aR) {
                    View aA = m79724aA();
                    if (getActivity() == null) {
                        i = 1;
                    } else if (aA != null) {
                        ViewGroup u = mo52074u();
                        int childCount = u.getChildCount();
                        int i2 = 0;
                        while (true) {
                            if (i2 < childCount) {
                                if (aA.equals(u.getChildAt(i2))) {
                                    i = 5;
                                    break;
                                }
                                i2++;
                            } else {
                                int[] iArr = new int[2];
                                aA.getLocationOnScreen(iArr);
                                Point d = awia.m80003d(getActivity());
                                i = iArr[1] + aA.getHeight() >= d.y ? iArr[1] >= d.y ? 4 : 3 : 2;
                            }
                        }
                    } else {
                        i = 1;
                    }
                    if (i != 1) {
                        this.f94227aR = true;
                        awqc.m80662a(getActivity(), new SubmitButtonPositionEvent(i, !this.f95363G.f124294c, this.f95359C));
                        boolean a = bkfr.m105581a(getActivity(), 2);
                        if (i == 5) {
                            if (this.f94236i != null) {
                                ViewGroup viewGroup = this.f94238k;
                                this.f94221aL = viewGroup;
                                viewGroup.post(awgc.m79888a(this, "requestViewOnScreenOrMakeFullScreen"));
                            }
                        } else if (a) {
                            this.f94221aL = m79724aA();
                            if (!(this.f94235h == null && this.f94236i == null)) {
                                this.f94221aL.post(awgc.m79888a(this, "requestViewOnScreenOrMakeFullScreen"));
                            }
                        }
                    }
                }
                if (!this.f94224aO) {
                    this.f94224aO = true;
                    if (bkfr.m105581a(getActivity(), 3)) {
                        ViewGroup viewGroup2 = this.f94238k;
                        this.f94221aL = viewGroup2;
                        viewGroup2.post(awgc.m79888a(this, "requestViewOnScreenOrMakeFullScreen"));
                    }
                }
            }
        }
    }

    /* renamed from: F */
    public final void mo52034F() {
        mo52808n(false);
        mo52063c(true);
        bxvd da = blxw.f128152f.mo74144da();
        bmaj a = awfx.m79878a(this.f94233f.f165220b.mo73780k());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blxw blxw = (blxw) da.f164949b;
        a.getClass();
        blxw.f128155b = a;
        blxw.f128154a = 1 | blxw.f128154a;
        byte[] bArr = this.f94231d;
        if (bArr != null) {
            bxtx a2 = bxtx.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blxw blxw2 = (blxw) da.f164949b;
            a2.getClass();
            blxw2.f128154a |= 2;
            blxw2.f128156c = a2;
        }
        blzf blzf = this.f94232e;
        if (blzf != null) {
            blxw blxw3 = (blxw) da.f164949b;
            blzf.getClass();
            blxw3.f128157d = blzf;
            blxw3.f128154a |= 4;
        }
        bwhf a3 = awfx.m79880a(this.f123962aG, this.f123961aF);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blxw blxw4 = (blxw) da.f164949b;
        a3.getClass();
        blxw4.f128158e = a3;
        blxw4.f128154a |= 8;
        blxw blxw5 = (blxw) da.mo74062i();
        mo52864a(blxw5, 2);
        mo52900j(2);
        mo52839Y().f94357a.mo52399a(blxw5, this.f94233f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final bxxk mo52035G() {
        return (bxxk) blyo.f128277e.mo74142c(7);
    }

    /* renamed from: H */
    public final BuyFlowResult mo52036H() {
        byte[] bArr;
        bxtx bxtx;
        bmag bmag = this.f95398ak.f110456e;
        awet a = BuyFlowResult.m93847a();
        a.mo52083a(this.f94233f.mo73642k());
        if (bmag == null) {
            bArr = f94220a;
        } else {
            if (bmag.f128444a == 2) {
                bxtx = (bxtx) bmag.f128445b;
            } else {
                bxtx = bxtx.f164797b;
            }
            bArr = bxtx.mo73780k();
        }
        a.mo52084b(bArr);
        a.mo52082a(m79728aE());
        return a.f94248a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final awyq mo52037I() {
        ArrayList aF = m79729aF();
        int size = aF.size();
        for (int i = 0; i < size; i++) {
            awyq awyq = (awyq) aF.get(i);
            View view = awyq.getView();
            if (view != null && view.getVisibility() == 0) {
                return awyq;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final PageDetails mo52038J() {
        return new BuyFlowFragment$BuyFlowPageDetails();
    }

    /* renamed from: K */
    public final void mo52039K() {
        if (this.f94237j) {
            mo52865a((Runnable) new awel(this));
        } else if (this.f95368L == 1) {
            mo52888b("onInitialLoad");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final axcn mo52040L() {
        axbr axbr = (axbr) mo52884b(13, axbr.class);
        if (axbr != null) {
            return axbr.mo52995t();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final bkhs mo52041M() {
        axbr axbr = (axbr) mo52884b(13, axbr.class);
        if (axbr != null) {
            bkdx bkdx = axbr.f95704c;
            if (bkdx instanceof bkhs) {
                return (bkhs) bkdx;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final awpc mo51913b() {
        return this.f94243p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ long mo52060c(Object obj) {
        blym blym = (blym) obj;
        if (blym == null) {
            return 0;
        }
        return blym.f128237c;
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final bxxk mo51920d() {
        return (bxxk) blxw.f128152f.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final bxxk mo51921e() {
        return (bxxk) blyq.f128291f.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo51925l() {
        mo52895f((Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final bxxk mo51926m() {
        return (bxxk) blym.f128215R.mo74142c(7);
    }

    /* renamed from: n */
    public final void mo51927n() {
        bkfr.m105559a(getActivity(), this.f95357A);
        View aA = m79724aA();
        if (aA != null) {
            aA.requestFocus();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo52067o() {
        PopoverView popoverView = this.f94235h;
        if (popoverView != null && !popoverView.mo59873a()) {
            this.f94235h.mo59876b(true);
            this.f94246s = true;
            return;
        }
        this.f94246s = false;
        super.mo52067o();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f95363G.mo66029a((bkio) this);
        this.f95363G.mo66028a((bkih) this);
    }

    public void onClick(View view) {
        if (view instanceof bkbn) {
            int intValue = ((Integer) this.f95374R.mo15535a(((bkbn) view).mo65788c().f128770b, -1)).intValue();
            if (intValue == 7) {
                OrchestrationViewEvent.m93825a(getActivity(), this.f95359C, new bjes(1621));
                m79736h(true);
            } else if (intValue == 38) {
                OrchestrationViewEvent.m93825a(getActivity(), this.f95359C, new bjes(1622));
                mo52065d(6);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        blym blym;
        bmaq bmaq;
        blym blym2;
        bwit bwit;
        bmag bmag;
        bmav bmav;
        boolean z;
        bmkw bmkw;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (bundle != null) {
            if (bundle.getByteArray("unencryptedParams") != null) {
                this.f94232e = (blzf) bjvp.m104730a(bundle, "unencryptedParams", (bxxk) blzf.f128337k.mo74142c(7));
            }
            if (bundle.containsKey("encryptedParams")) {
                this.f94231d = bundle.getByteArray("encryptedParams");
            }
            this.f94237j = bundle.getBoolean("shouldMakeInitializeRequest", false);
            if (bundle.containsKey("requireReloadViews")) {
                this.f94234g = bundle.getBoolean("requireReloadViews");
            }
            if (bundle.containsKey("buyFlowStateToken")) {
                this.f94233f = (byaa) bjvp.m104730a(bundle, "buyFlowStateToken", (bxxk) byaa.f165217d.mo74142c(7));
            }
            this.f94240m = bundle.getByteArray("pendingSubmitDependencyGraphActionToken");
            this.f94241n = bundle.getInt("createReauthTokenRetryCount");
            this.f94246s = bundle.getBoolean("pendingWebViewPopupActivity");
            this.f94222aM = (bwdp) bjvp.m104730a(bundle, "lastPartialCallbackData", (bxxk) bwdp.f158910d.mo74142c(7));
        } else {
            if (arguments.getByteArray("unencryptedParams") != null) {
                this.f94232e = (blzf) bjvp.m104730a(arguments, "unencryptedParams", (bxxk) blzf.f128337k.mo74142c(7));
            }
            if (arguments.containsKey("encryptedParams")) {
                this.f94231d = arguments.getByteArray("encryptedParams");
            }
            if (this.f95371O) {
                this.f95368L = 1;
            } else if (arguments.containsKey("initializeResponse")) {
                blxx blxx = (blxx) bjvp.m104730a(arguments, "initializeResponse", (bxxk) blxx.f128159j.mo74142c(7));
                BuyFlowFragment$BuyFlowPageDetails buyFlowFragment$BuyFlowPageDetails = new BuyFlowFragment$BuyFlowPageDetails();
                bmar bmar = null;
                if ((blxx.f128161a & 16) != 0) {
                    blym = blxx.f128166f;
                    if (blym == null) {
                        blym = blym.f128215R;
                    }
                } else {
                    blym = null;
                }
                buyFlowFragment$BuyFlowPageDetails.f110460i = blym;
                buyFlowFragment$BuyFlowPageDetails.f110457f = blxx.f128167g;
                if ((blxx.f128161a & 2) != 0) {
                    bmaq = blxx.f128163c;
                    if (bmaq == null) {
                        bmaq = bmaq.f128479l;
                    }
                } else {
                    bmaq = null;
                }
                buyFlowFragment$BuyFlowPageDetails.f110465n = bmaq;
                if ((blxx.f128161a & 16) != 0) {
                    blym2 = blxx.f128166f;
                    if (blym2 == null) {
                        blym2 = blym.f128215R;
                    }
                } else {
                    blym2 = null;
                }
                if (blym2 != null) {
                    buyFlowFragment$BuyFlowPageDetails.f110455d = awev.m79820a(new bxvv(blym2.f128228L, blym.f128214M));
                    if (blym2.f128239e || blym2.f128240f > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    buyFlowFragment$BuyFlowPageDetails.f110452a = z;
                    buyFlowFragment$BuyFlowPageDetails.f110459h = blym2.f128240f;
                    int a = bmqm.m108288a(blym2.f128241g);
                    if (a == 0) {
                        a = 1;
                    }
                    buyFlowFragment$BuyFlowPageDetails.f110469r = a;
                    if ((blym2.f128235a & 536870912) != 0) {
                        bmkw = blym2.f128231P;
                        if (bmkw == null) {
                            bmkw = bmkw.f129898c;
                        }
                    } else {
                        bmkw = null;
                    }
                    buyFlowFragment$BuyFlowPageDetails.f110463l = bmkw;
                }
                if ((blxx.f128161a & 64) != 0) {
                    bwit = blxx.f128169i;
                    if (bwit == null) {
                        bwit = bwit.f159683d;
                    }
                } else {
                    bwit = null;
                }
                buyFlowFragment$BuyFlowPageDetails.f110462k = bwit;
                if ((blxx.f128161a & 8) != 0) {
                    bmag = blxx.f128165e;
                    if (bmag == null) {
                        bmag = bmag.f128442c;
                    }
                } else {
                    bmag = null;
                }
                buyFlowFragment$BuyFlowPageDetails.f110456e = bmag;
                if ((blxx.f128161a & 1) != 0) {
                    bmav = blxx.f128162b;
                    if (bmav == null) {
                        bmav = bmav.f128500h;
                    }
                } else {
                    bmav = null;
                }
                buyFlowFragment$BuyFlowPageDetails.f110468q = bmav;
                bwgz a2 = bwgz.m121952a(blxx.f128168h);
                if (a2 == null) {
                    a2 = bwgz.UNKNOWN_FLOW_INSTRUCTION;
                }
                buyFlowFragment$BuyFlowPageDetails.f110454c = a2;
                buyFlowFragment$BuyFlowPageDetails.f110466o = BuyFlowResult.f110016a;
                if ((blxx.f128161a & 4) != 0 && (bmar = blxx.f128164d) == null) {
                    bmar = bmar.f128490c;
                }
                buyFlowFragment$BuyFlowPageDetails.f110467p = bmar;
                this.f95399al = buyFlowFragment$BuyFlowPageDetails;
                this.f95368L = 1;
            } else if (arguments.containsKey("encryptedParams")) {
                this.f94237j = true;
            } else {
                throw new IllegalArgumentException("Must have a cart or initialize response");
            }
            if (arguments.containsKey("buyFlowStateToken")) {
                this.f94233f = (byaa) bjvp.m104730a(arguments, "buyFlowStateToken", (bxxk) byaa.f165217d.mo74142c(7));
            }
            PageDetails pageDetails = this.f95399al;
            if (pageDetails == null || this.f94233f == null) {
                if (pageDetails != null) {
                    bxvd da = byaa.f165217d.mo74144da();
                    bxtx bxtx = this.f95399al.f110465n.f128483c;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byaa byaa = (byaa) da.f164949b;
                    bxtx.getClass();
                    byaa.f165219a |= 1;
                    byaa.f165220b = bxtx;
                    this.f94233f = (byaa) da.mo74062i();
                } else if (this.f94233f == null) {
                    this.f94233f = byaa.f165217d;
                }
            } else if (!Arrays.equals(pageDetails.f110465n.f128483c.mo73780k(), this.f94233f.f165220b.mo73780k())) {
                throw new IllegalStateException("Invalid buy flow state token.");
            }
            OrchestrationViewEvent.m93828c(getActivity(), this.f95359C, this.f94223aN);
        }
        mo52876ai();
    }

    public final void onDetach() {
        super.onDetach();
        this.f95363G.mo66029a((bkio) null);
        this.f95363G.f124306o.remove(this);
    }

    public final void onGlobalFocusChanged(View view, View view2) {
        if (view2 instanceof FormEditText) {
            BottomSheetView bottomSheetView = this.f94236i;
            if (bottomSheetView == null) {
                awia.m80005f(getActivity());
            } else {
                bottomSheetView.mo59838a();
            }
            this.f95357A.getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.f94246s) {
            mo52067o();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("shouldMakeInitializeRequest", this.f94237j);
        bundle.putBoolean("requireReloadViews", this.f94234g);
        bjvp.m104736a(bundle, "buyFlowStateToken", this.f94233f);
        bundle.putByteArray("encryptedParams", this.f94231d);
        bjvp.m104736a(bundle, "unencryptedParams", this.f94232e);
        bundle.putByteArray("pendingSubmitDependencyGraphActionToken", this.f94240m);
        bundle.putInt("createReauthTokenRetryCount", this.f94241n);
        bundle.putBoolean("pendingWebViewPopupActivity", this.f94246s);
        bjvp.m104736a(bundle, "lastPartialCallbackData", this.f94222aM);
    }

    public final void onStart() {
        super.onStart();
        axcn L = mo52040L();
        if (L != null) {
            L.f124427e = this;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo52070p() {
        bkhs M = mo52041M();
        if (M != null && !M.f124234a) {
            M.mo66005u();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final List mo52071q() {
        Object obj = this.f95397aj;
        if (obj == null) {
            return null;
        }
        blym blym = (blym) obj;
        if ((blym.f128235a & 128) == 0) {
            return null;
        }
        bmob bmob = blym.f128242h;
        if (bmob == null) {
            bmob = bmob.f130205b;
        }
        return bmob.f130207a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo52072r() {
        awep awep = this.f94245r;
        if (awep != null) {
            awep.mo52027a((BuyFlowResult) this.f95398ak.f110466o);
            return;
        }
        throw new IllegalStateException("integratorPaymentAuthorizationRequestListener must be set!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final bpis mo52073t() {
        return bpis.FLOW_TYPE_BUYFLOW;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final ViewGroup mo52074u() {
        return (ViewGroup) getActivity().findViewById(C0126R.C0129id.bottom_sticky_button_container);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean mo52075v() {
        return true;
    }

    /* renamed from: w */
    public final void mo52076w() {
    }

    /* renamed from: x */
    public final void mo52077x() {
        if (!this.f94225aP) {
            this.f94225aP = true;
            mo52033E();
        }
    }

    /* renamed from: y */
    public final void mo52078y() {
    }

    /* renamed from: z */
    public final void mo52079z() {
        m79736h(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final PageDetails mo52061c(PageDetails pageDetails) {
        return new BuyFlowFragment$BuyFlowPageDetails(pageDetails);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0138 A[RETURN] */
    /* renamed from: c */
    public final void mo51917c() {
        boolean z;
        boolean z2;
        View view;
        Object obj;
        PopoverView popoverView = this.f94235h;
        boolean z3 = true;
        if (popoverView != null) {
            boolean e = bkfr.m105612e(getActivity());
            popoverView.f110108n = e;
            awhb awhb = popoverView.f110099e;
            if (awhb != null) {
                awhb.mo71903a(!popoverView.f110115u ? false : e);
            }
            popoverView.mo59877c();
            this.f94235h.f110113s = m79731ay();
            this.f94235h.f110114t = !bkfr.m105580a(getActivity(), bmap.DISABLE_BOTTOM_SHEET_SCROLL_DISMISS);
            this.f94235h.mo59878c(m79732az());
            PopoverView popoverView2 = this.f94235h;
            popoverView2.f110109o = awia.m80004e(getActivity());
            popoverView2.mo59877c();
            popoverView2.mo59874b();
        } else {
            BottomSheetView bottomSheetView = this.f94236i;
            if (bottomSheetView != null) {
                bottomSheetView.mo59839a(m79731ay());
                BottomSheetView bottomSheetView2 = this.f94236i;
                boolean z4 = !bkfr.m105580a(getActivity(), bmap.DISABLE_BOTTOM_SHEET_SCROLL_DISMISS);
                BottomSheetBehavior bottomSheetBehavior = bottomSheetView2.f110053i;
                if (bottomSheetBehavior.f151099m != 3) {
                    bottomSheetBehavior.mo71035b(z4);
                }
                this.f94236i.mo59841b(m79732az());
            } else {
                FocusedViewToTopScrollView focusedViewToTopScrollView = (FocusedViewToTopScrollView) mo52872ae();
                if (focusedViewToTopScrollView != null) {
                    focusedViewToTopScrollView.f151970r = m79731ay();
                    focusedViewToTopScrollView.mo71903a(m79732az());
                }
            }
        }
        if (!awia.m79986a(this.f123962aG.getResources()) || !((Boolean) awih.f94442c.mo58455c()).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        if (this.f95371O && (obj = this.f95397aj) != null) {
            int a = bmol.m108231a(((blym) obj).f128229N);
            if (a == 0) {
                z2 = false;
            } else if (a == 3) {
                z2 = true;
            }
            if (!z && !z2 && this.f94236i == null) {
                z3 = false;
            }
            view = this.f95357A;
            if (view == null) {
                this.f94230c = view.findViewById(C0126R.C0129id.padding_for_keyboard);
                if (z3 || !m79731ay()) {
                    getActivity().getWindow().setSoftInputMode(16);
                    this.f94230c.setVisibility(8);
                    return;
                }
                getActivity().getWindow().setSoftInputMode(48);
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) this.f123962aG.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                this.f94230c.setMinimumHeight(displayMetrics.heightPixels / 2);
                this.f94230c.setVisibility(4);
                return;
            }
            return;
        }
        z2 = false;
        z3 = false;
        view = this.f95357A;
        if (view == null) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo52064d(Object obj) {
        blym blym = (blym) obj;
        bmlz h = mo51924h();
        if (h != null) {
            bxvd bxvd = (bxvd) blym.mo74142c(5);
            bxvd.mo73625a((bxvk) blym);
            blyj blyj = (blyj) bxvd;
            if (blyj.f164950c) {
                blyj.mo74035c();
                blyj.f164950c = false;
            }
            blym blym2 = (blym) blyj.f164949b;
            bxvu bxvu = blym.f128214M;
            h.getClass();
            blym2.f128221E = h;
            blym2.f128235a |= 33554432;
            return (blym) blyj.mo74062i();
        }
        bxvd bxvd2 = (bxvd) blym.mo74142c(5);
        bxvd2.mo73625a((bxvk) blym);
        blyj blyj2 = (blyj) bxvd2;
        if (blyj2.f164950c) {
            blyj2.mo74035c();
            blyj2.f164950c = false;
        }
        blym blym3 = (blym) blyj2.f164949b;
        bxvu bxvu2 = blym.f128214M;
        blym3.f128221E = null;
        blym3.f128235a &= -33554433;
        return (blym) blyj2.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final bmlz mo51924h() {
        Object obj = this.f95397aj;
        if (obj == null) {
            return null;
        }
        blym blym = (blym) obj;
        if ((blym.f128235a & 33554432) == 0) {
            return null;
        }
        bmlz bmlz = blym.f128221E;
        return bmlz == null ? bmlz.f129993c : bmlz;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.material.bottomsheet.BottomSheetBehavior.a(int, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.material.bottomsheet.BottomSheetBehavior.a(android.view.View, int):void
      com.google.android.material.bottomsheet.BottomSheetBehavior.a(android.view.View, android.os.Parcelable):void
      com.google.android.material.bottomsheet.BottomSheetBehavior.a(android.view.View, float):boolean
      aim.a(android.view.View, android.os.Parcelable):void
      aim.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View):void
      aim.a(android.view.View, android.graphics.Rect):boolean
      aim.a(android.view.View, android.view.View):boolean
      com.google.android.material.bottomsheet.BottomSheetBehavior.a(int, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0124  */
    /* renamed from: h */
    public final void mo52066h(Bundle bundle) {
        char c;
        String a = awgc.m79889a(bundle);
        int hashCode = a.hashCode();
        if (hashCode != -552551840) {
            if (hashCode != 240541845) {
                if (hashCode == 1578260587 && a.equals("requestViewOnScreenOrMakeFullScreen")) {
                    c = 1;
                    if (c != 0) {
                        mo52033E();
                        return;
                    } else if (c == 1) {
                        PopoverView popoverView = this.f94235h;
                        if (popoverView != null) {
                            View view = this.f94221aL;
                            awhb awhb = popoverView.f110099e;
                            if (!awhb.f94342k && !awhb.f94343l && !awhb.f94339h && awhb != null && view != null) {
                                ViewParent parent = view.getParent();
                                while (parent instanceof View) {
                                    if (parent == awhb) {
                                        int f = popoverView.mo59881f();
                                        int scrollY = popoverView.f110099e.getScrollY();
                                        int dimensionPixelSize = popoverView.getResources().getDimensionPixelSize(C0126R.dimen.wallet_spacing_material_top_bottom);
                                        Rect rect = new Rect();
                                        view.getDrawingRect(rect);
                                        popoverView.f110099e.offsetDescendantRectToMyCoords(view, rect);
                                        rect.bottom += dimensionPixelSize;
                                        int computeScrollDeltaToGetChildRectOnScreen = popoverView.f110099e.computeScrollDeltaToGetChildRectOnScreen(rect);
                                        if (f - scrollY < computeScrollDeltaToGetChildRectOnScreen) {
                                            popoverView.f110099e.f94342k = true;
                                            popoverView.mo59872a(true);
                                            return;
                                        } else if (computeScrollDeltaToGetChildRectOnScreen > 0) {
                                            bkfr.m105563a(view, dimensionPixelSize);
                                            return;
                                        } else {
                                            return;
                                        }
                                    } else {
                                        parent = parent.getParent();
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        BottomSheetView bottomSheetView = this.f94236i;
                        if (bottomSheetView != null) {
                            View view2 = this.f94221aL;
                            if (!bottomSheetView.f110047c && !bottomSheetView.f110048d) {
                                Rect rect2 = new Rect();
                                view2.getDrawingRect(rect2);
                                bottomSheetView.offsetDescendantRectToMyCoords(view2, rect2);
                                int dimensionPixelSize2 = bottomSheetView.getResources().getDimensionPixelSize(C0126R.dimen.wallet_spacing_material_top_bottom);
                                int i = rect2.bottom;
                                int top = BottomSheetView.f110046b - bottomSheetView.getTop();
                                int i2 = (i + dimensionPixelSize2) - top;
                                if (i2 >= bottomSheetView.getTop()) {
                                    bottomSheetView.mo59838a();
                                    return;
                                } else if (i2 > 0) {
                                    bottomSheetView.f110053i.mo71026a(top + i2, true);
                                    return;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (c != 2) {
                        super.mo52066h(bundle);
                        return;
                    } else {
                        blyr blyr = (blyr) bjvp.m104730a(bundle, "submitBuyflowResponse", (bxxk) blyr.f128298p.mo74142c(7));
                        byaa byaa = (byaa) bjvp.m104730a(bundle, "buyflowStateToken", (bxxk) byaa.f165217d.mo74142c(7));
                        axcn L = mo52040L();
                        if (L == null || L.isResumed()) {
                            mo52049a(blyr, byaa);
                            return;
                        } else {
                            mo52881an().post(this.f94247t);
                            return;
                        }
                    }
                }
            } else if (a.equals("handleSubmitBuyflowResponse")) {
                c = 2;
                if (c != 0) {
                }
            }
        } else if (a.equals("logSubmitButtonAndMakeFullScreenIfNecessary")) {
            c = 0;
            if (c != 0) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
    }

    /* renamed from: b */
    private final void m79734b(List list, ViewGroup viewGroup, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bmnr bmnr = (bmnr) list.get(i);
            this.f95385aC.add(new bkde(bmnr.f130156b, awgp.m79905a(this.f124196aK, bmnr, this.f123963aH, (bjxu) null, viewGroup, 0, 0, this.f95376T.mo65614a()), null));
        }
        OrchestrationViewEvent.m93828c(getActivity(), this.f95359C, z ? new bjes(1) : new bjes(2));
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
    private final void m79721a(blyq blyq) {
        bmfv bmfv;
        awpb awpb = mo52839Y().f94357a;
        byte[] bArr = this.f94231d;
        byte[] bArr2 = bArr != null ? bArr : f94220a;
        blzf blzf = this.f94232e;
        byaa byaa = this.f94233f;
        bmar bmar = this.f95398ak.f110467p;
        awou awou = (awou) awpb;
        sdo.m34971a(awou.mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        if (!awou.mo52425a(blyq)) {
            Message.obtain(awou.f94784u, 22, new BuyflowSubmitRequest(awou.f94765b, blyq, bArr2, blzf, byaa, bmar.f128492a)).sendToTarget();
        }
        blyn blyn = blyq.f128295c;
        if (blyn == null) {
            blyn = blyn.f128261o;
        }
        if ((blyn.f128263a & 32) != 0) {
            blyn blyn2 = blyq.f128295c;
            if (blyn2 == null) {
                blyn2 = blyn.f128261o;
            }
            bmgo bmgo = blyn2.f128270h;
            if (bmgo == null) {
                bmgo = bmgo.f129290e;
            }
            if (bmgo.f129292a == 2) {
                bmfv = (bmfv) bmgo.f129293b;
            } else {
                bmfv = bmfv.f129179c;
            }
            bmil bmil = null;
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
                        bmil = bmfu2.f129171c;
                        if (bmil == null) {
                            bmil = bmil.f129588g;
                        }
                    } else {
                        throw new IllegalStateException("Submitting dcbVerifyAssociation Form when additional option is not selected");
                    }
                }
            } else if (bmgo.f129292a == 1) {
                bmgl bmgl = (bmgl) bmgo.f129293b;
                bmfv bmfv2 = bmgl.f129271e;
                if (bmfv2 == null) {
                    bmfv2 = bmfv.f129179c;
                }
                if (bmfv2.f129181a != 4) {
                    bmgf bmgf = bmgl.f129270d;
                    if (bmgf == null) {
                        bmgf = bmgf.f129233e;
                    }
                    bmfv bmfv3 = bmgf.f129238d;
                    if (bmfv3 == null) {
                        bmfv3 = bmfv.f129179c;
                    }
                    if (bmfv3.f129181a == 4) {
                        Object obj2 = ((axbr) mo52884b(13, axbr.class)).f95712k;
                        if (obj2 instanceof bmgk) {
                            bmgk bmgk = (bmgk) obj2;
                            bmge bmge = bmgk.f129260n;
                            if (bmge == null) {
                                bmge = bmge.f129225f;
                            }
                            bmfu bmfu3 = bmge.f129231e;
                            if (bmfu3 == null) {
                                bmfu3 = bmfu.f129167j;
                            }
                            if ((bmfu3.f129169a & 2) != 0) {
                                bmge bmge2 = bmgk.f129260n;
                                if (bmge2 == null) {
                                    bmge2 = bmge.f129225f;
                                }
                                bmfu bmfu4 = bmge2.f129231e;
                                if (bmfu4 == null) {
                                    bmfu4 = bmfu.f129167j;
                                }
                                bmil = bmfu4.f129171c;
                                if (bmil == null) {
                                    bmil = bmil.f129588g;
                                }
                            } else {
                                throw new IllegalStateException("Submitting dcbVerifyAssociation Form when option fix form is not selected");
                            }
                        }
                    }
                } else {
                    Object obj3 = ((axbr) mo52884b(13, axbr.class)).f95712k;
                    if (obj3 instanceof bmgk) {
                        bmgk bmgk2 = (bmgk) obj3;
                        bmfu bmfu5 = bmgk2.f129255i;
                        if (bmfu5 == null) {
                            bmfu5 = bmfu.f129167j;
                        }
                        if ((bmfu5.f129169a & 2) != 0) {
                            bmfu bmfu6 = bmgk2.f129255i;
                            if (bmfu6 == null) {
                                bmfu6 = bmfu.f129167j;
                            }
                            bmil = bmfu6.f129171c;
                            if (bmil == null) {
                                bmil = bmil.f129588g;
                            }
                        } else {
                            throw new IllegalStateException("Submitting dcbVerifyAssociation Form when option instrument form is not selected");
                        }
                    }
                }
            }
            if (bmil != null) {
                if (this.f94242o == null) {
                    this.f94242o = new bjvy(getActivity(), this);
                }
                this.f94242o.mo65574a(bmil.f129593d, bmil.f129594e);
            }
        }
    }

    /* renamed from: d */
    public final void mo52065d(int i) {
        if (mo52870ac()) {
            this.f95398ak.f110466o = mo52036H();
        }
        super.mo52065d(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final List mo51923g() {
        Object obj = this.f95397aj;
        if (obj != null) {
            return ((blym) obj).f128222F;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final bwgz mo52056b(PageDetails pageDetails) {
        bmav bmav = pageDetails.f110468q;
        blym blym = (blym) pageDetails.f110460i;
        BuyFlowResult buyFlowResult = (BuyFlowResult) pageDetails.f110466o;
        int i = awev.f94249a;
        bwgz bwgz = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        if (bmav != null) {
            return bwgz.HANDLE_UI_ERROR;
        }
        if (blym != null) {
            return bwgz.CONTINUE_FLOW_WITH_NEW_PAGE;
        }
        if (!TextUtils.isEmpty(buyFlowResult.f110017b) || !TextUtils.isEmpty(buyFlowResult.f110018c)) {
            return bwgz.COMPLETE_FLOW_IMMEDIATELY;
        }
        return bwgz;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo51914b(Object obj) {
        blyn blyn = (blyn) obj;
        bxvd da = blyq.f128291f.mo74144da();
        bmaj a = awfx.m79878a(this.f94233f.f165220b.mo73780k());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blyq blyq = (blyq) da.f164949b;
        a.getClass();
        blyq.f128294b = a;
        int i = blyq.f128293a | 1;
        blyq.f128293a = i;
        if (blyn != null) {
            blyn.getClass();
            blyq.f128295c = blyn;
            blyq.f128293a = i | 2;
        }
        m79721a((blyq) da.mo74062i());
        return da.mo74062i();
    }

    /* renamed from: c */
    public final void mo52062c(int i) {
        mo52808n(true);
        if (i == 1) {
            m79736h(false);
        }
    }

    /* renamed from: c */
    public final void mo52063c(boolean z) {
        if (getActivity() instanceof aweo) {
            ((aweo) getActivity()).mo52026a(z);
        }
    }

    /* renamed from: b */
    public final void mo51915b(int i) {
        if (i == 1) {
            OrchestrationDcbEvent.m93820a(getActivity(), this.f95359C, 2);
        } else if (i != 5) {
            OrchestrationDcbEvent.m93820a(getActivity(), this.f95359C, 3);
            mo52839Y().f94357a.mo52428c();
            m79725aB();
        } else {
            OrchestrationDcbEvent.m93820a(getActivity(), this.f95359C, 4);
            mo52839Y().f94357a.mo52428c();
            m79725aB();
        }
    }

    /* renamed from: b */
    public final void mo52057b(int i, Bundle bundle) {
        if (i != 0) {
            if (bundle != null) {
                mo51905a(5, bundle);
            } else {
                mo51905a(10, (Bundle) null);
            }
        } else if (chjk.f188682a.mo6606a().mo85280a()) {
            mo52808n(true);
        } else {
            mo51905a(19, bundle);
        }
    }

    /* renamed from: b */
    public final void mo52058b(Intent intent) {
        axbr axbr = (axbr) mo52884b(13, axbr.class);
        if (axbr != null) {
            axbr.mo52058b(intent);
        }
    }

    /* renamed from: b */
    public final void mo52059b(bkca bkca) {
        this.f94228aS.remove(bkca);
    }

    /* renamed from: a */
    private static final boolean m79722a(List list, long j) {
        return list == null || list.contains(Long.valueOf(j));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awer.b(java.util.List, android.view.ViewGroup, boolean):void
     arg types: [bxwc, android.view.ViewGroup, int]
     candidates:
      awzg.b(com.google.android.gms.wallet.ui.common.PageDetails, boolean, java.lang.String):void
      awzk.b(android.os.Bundle, byte[], java.util.List):java.lang.Object
      awzk.b(com.google.android.gms.wallet.ui.common.PageDetails, boolean, java.lang.String):void
      awer.b(java.util.List, android.view.ViewGroup, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzk.a(bmdb, android.view.ViewGroup, boolean):bkbn
     arg types: [bmdb, android.view.ViewGroup, int]
     candidates:
      awer.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View
      awer.a(android.os.Bundle, byte[], java.util.List):java.lang.Object
      awer.a(bmaf, android.os.Bundle, byte[]):void
      awer.a(byte[], java.util.List, java.util.List):void
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
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r4.f130207a.size() > 0) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03cd  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x088c  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x089d A[LOOP:15: B:352:0x089b->B:353:0x089d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x08be A[LOOP:16: B:355:0x08bc->B:356:0x08be, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x08da A[LOOP:17: B:358:0x08d8->B:359:0x08da, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x0923  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0172  */
    /* renamed from: b */
    public final void mo51916b(boolean z) {
        blym blym;
        bwio bwio;
        blym blym2;
        bwio bwio2;
        blym blym3;
        bwio bwio3;
        blym blym4;
        awzu awzu;
        int size;
        int i;
        int size2;
        int i2;
        int size3;
        int i3;
        PopoverView popoverView;
        int i4;
        bmbd bmbd;
        bmbd bmbd2;
        bmdx bmdx;
        bmdx bmdx2;
        bmno bmno;
        bxvd da;
        blyj blyj;
        bwio bwio4;
        bxvd bxvd;
        boolean z2 = z;
        int i5 = 8;
        boolean z3 = false;
        z3 = false;
        if (z2) {
            this.f95357A.setVisibility(8);
            this.f94224aO = false;
            this.f94225aP = false;
            this.f94227aR = false;
        }
        mo52892d(z);
        this.f94238k.removeAllViews();
        PopoverView popoverView2 = this.f94235h;
        if (popoverView2 != null) {
            popoverView2.mo59871a((View) null);
        }
        Object obj = this.f95397aj;
        if (obj != null) {
            blym blym5 = (blym) obj;
            int i6 = 1;
            boolean z4 = true;
            if (!blym5.f128227K) {
                if ((blym5.f128235a & 128) != 0) {
                    bmob bmob = blym5.f128242h;
                    if (bmob == null) {
                        bmob = bmob.f130205b;
                    }
                }
                if (z2) {
                    getActivity().invalidateOptionsMenu();
                }
                blym = (blym) this.f95397aj;
                this.f95373Q = blym.f128236b;
                if ((blym.f128235a & 2097152) == 0) {
                    bwio = blym.f128260z;
                    if (bwio == null) {
                        bwio = bwio.f159659d;
                    }
                } else {
                    bwio = null;
                }
                mo52859a(bwio);
                blym2 = (blym) this.f95397aj;
                if ((blym2.f128235a & 8388608) == 0) {
                    bwio2 = blym2.f128218B;
                    if (bwio2 == null) {
                        bwio2 = bwio.f159659d;
                    }
                } else {
                    bwio2 = null;
                }
                mo52859a(bwio2);
                if (!((((blym) this.f95397aj).f128235a & 4194304) == 0 || this.f94232e == null || !z2)) {
                    da = bwip.f159664e.mo74144da();
                    boolean z5 = this.f94232e.f128343e;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bwip bwip = (bwip) da.f164949b;
                    bwip.f159666a |= 1;
                    bwip.f159667b = z5;
                    bwip bwip2 = (bwip) da.mo74062i();
                    blym blym6 = (blym) this.f95397aj;
                    bxvd bxvd2 = (bxvd) blym6.mo74142c(5);
                    bxvd2.mo73625a((bxvk) blym6);
                    blyj = (blyj) bxvd2;
                    bwio4 = ((blym) this.f95397aj).f128217A;
                    if (bwio4 == null) {
                        bwio4 = bwio.f159659d;
                    }
                    bxvd = (bxvd) bwio4.mo74142c(5);
                    bxvd.mo73625a((bxvk) bwio4);
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bwio bwio5 = (bwio) bxvd.f164949b;
                    bwip2.getClass();
                    bwio5.f159663c = bwip2;
                    bwio5.f159661a |= 2;
                    if (blyj.f164950c) {
                        blyj.mo74035c();
                        blyj.f164950c = false;
                    }
                    blym blym7 = (blym) blyj.f164949b;
                    bwio bwio6 = (bwio) bxvd.mo74062i();
                    bwio6.getClass();
                    blym7.f128217A = bwio6;
                    blym7.f128235a |= 4194304;
                    this.f95397aj = blyj.mo74062i();
                }
                blym3 = (blym) this.f95397aj;
                if ((4194304 & blym3.f128235a) == 0) {
                    bwio3 = blym3.f128217A;
                    if (bwio3 == null) {
                        bwio3 = bwio.f159659d;
                    }
                } else {
                    bwio3 = null;
                }
                mo52859a(bwio3);
                blym4 = (blym) this.f95397aj;
                if ((blym4.f128235a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE) != 0 || blym4.f128255u.size() <= 0) {
                    if (((blym) this.f95397aj).f128225I.size() == 0) {
                        if (((blym) this.f95397aj).f128225I.size() <= 0) {
                            z4 = false;
                        }
                        sdo.m34975b(z4, "At least one component group should be present");
                        blym blym8 = (blym) this.f95397aj;
                        if ((blym8.f128235a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0) {
                            bmgn bmgn = blym8.f128252r;
                            if (bmgn == null) {
                                bmgn = bmgn.f129273o;
                            }
                            mo52850a(bmgn.f129276b, 13, 0);
                        }
                        blym blym9 = (blym) this.f95397aj;
                        if ((blym9.f128235a & 4096) != 0) {
                            bmet bmet = blym9.f128250p;
                            if (bmet == null) {
                                bmet = bmet.f129017l;
                            }
                            mo52850a(bmet.f129021c, 15, 0);
                        }
                        blym blym10 = (blym) this.f95397aj;
                        if ((blym10.f128235a & 1024) != 0) {
                            bmeq bmeq = blym10.f128248n;
                            if (bmeq == null) {
                                bmeq = bmeq.f128990h;
                            }
                            bmdn bmdn = bmeq.f128993b;
                            if (bmdn == null) {
                                bmdn = bmdn.f128831k;
                            }
                            mo52850a(bmdn.f128835c, 19, 0);
                        }
                        blym blym11 = (blym) this.f95397aj;
                        if ((blym11.f128235a & 2048) != 0) {
                            bmen bmen = blym11.f128249o;
                            if (bmen == null) {
                                bmen = bmen.f128969c;
                            }
                            bmdn bmdn2 = bmen.f128971a;
                            if (bmdn2 == null) {
                                bmdn2 = bmdn.f128831k;
                            }
                            mo52850a(bmdn2.f128835c, 20, 0);
                        }
                        blym blym12 = (blym) this.f95397aj;
                        if ((blym12.f128235a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE) != 0) {
                            bmof bmof = blym12.f128254t;
                            if (bmof == null) {
                                bmof = bmof.f130215h;
                            }
                            mo52850a(bmof.f130218b, 9, 0);
                        }
                        int size4 = ((blym) this.f95397aj).f128255u.size();
                        for (int i7 = 0; i7 < size4; i7++) {
                            mo52850a(((bmof) ((blym) this.f95397aj).f128255u.get(i7)).f130218b, 37, i7);
                        }
                        int size5 = ((blym) this.f95397aj).f128224H.size();
                        for (int i8 = 0; i8 < size5; i8++) {
                            bmdn bmdn3 = ((bmeb) ((blym) this.f95397aj).f128224H.get(i8)).f128905b;
                            if (bmdn3 == null) {
                                bmdn3 = bmdn.f128831k;
                            }
                            mo52850a(bmdn3.f128835c, 6, i8);
                        }
                        int size6 = ((blym) this.f95397aj).f128220D.size();
                        for (int i9 = 0; i9 < size6; i9++) {
                            mo52850a(((bmjv) ((blym) this.f95397aj).f128220D.get(i9)).f129754a, 14, i9);
                        }
                        int size7 = ((blym) this.f95397aj).f128245k.size();
                        for (int i10 = 0; i10 < size7; i10++) {
                            mo52850a(((bmdb) ((blym) this.f95397aj).f128245k.get(i10)).f128770b, 7, i10);
                        }
                        int size8 = ((blym) this.f95397aj).f128230O.size();
                        for (int i11 = 0; i11 < size8; i11++) {
                            mo52850a(((bmdb) ((blym) this.f95397aj).f128230O.get(i11)).f128770b, 31, i11);
                        }
                        blym blym13 = (blym) this.f95397aj;
                        if ((blym13.f128235a & 512) != 0) {
                            bmdb bmdb = blym13.f128246l;
                            if (bmdb == null) {
                                bmdb = bmdb.f128767k;
                            }
                            mo52850a(bmdb.f128770b, 38, 0);
                        }
                        int size9 = ((blym) this.f95397aj).f128226J.size();
                        for (int i12 = 0; i12 < size9; i12++) {
                            mo52850a(((bmoh) ((blym) this.f95397aj).f128226J.get(i12)).f130233a, 16, i12);
                        }
                        int size10 = ((blym) this.f95397aj).f128257w.size();
                        for (int i13 = 0; i13 < size10; i13++) {
                            mo52850a(((bmjf) ((blym) this.f95397aj).f128257w.get(i13)).f129688b, 17, i13);
                        }
                        int size11 = ((blym) this.f95397aj).f128258x.size();
                        for (int i14 = 0; i14 < size11; i14++) {
                            mo52850a(((bmnr) ((blym) this.f95397aj).f128258x.get(i14)).f130156b, 0, i14);
                        }
                        int size12 = ((blym) this.f95397aj).f128247m.size();
                        for (int i15 = 0; i15 < size12; i15++) {
                            bmdn bmdn4 = ((bmcb) ((blym) this.f95397aj).f128247m.get(i15)).f128652b;
                            if (bmdn4 == null) {
                                bmdn4 = bmdn.f128831k;
                            }
                            mo52850a(bmdn4.f128835c, 18, i15);
                        }
                        blym blym14 = (blym) this.f95397aj;
                        if ((blym14.f128235a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) != 0) {
                            bmfs bmfs = blym14.f128253s;
                            if (bmfs == null) {
                                bmfs = bmfs.f129155e;
                            }
                            bmdn bmdn5 = bmfs.f129160d;
                            if (bmdn5 == null) {
                                bmdn5 = bmdn.f128831k;
                            }
                            mo52850a(bmdn5.f128835c, 24, 0);
                        }
                        blym blym15 = (blym) this.f95397aj;
                        if ((blym15.f128235a & 8192) != 0) {
                            bmbd bmbd3 = blym15.f128251q;
                            if (bmbd3 == null) {
                                bmbd3 = bmbd.f128525j;
                            }
                            bmdn bmdn6 = bmbd3.f128528b;
                            if (bmdn6 == null) {
                                bmdn6 = bmdn.f128831k;
                            }
                            mo52850a(bmdn6.f128835c, 22, 0);
                        }
                        blym blym16 = (blym) this.f95397aj;
                        if ((blym16.f128235a & JGCastService.FLAG_PRIVATE_DISPLAY) != 0) {
                            bmdj bmdj = blym16.f128232Q;
                            if (bmdj == null) {
                                bmdj = bmdj.f128803l;
                            }
                            bmdn bmdn7 = bmdj.f128808d;
                            if (bmdn7 == null) {
                                bmdn7 = bmdn.f128831k;
                            }
                            mo52850a(bmdn7.f128835c, 35, 0);
                        }
                        m79726aC();
                        mo52867a(((blym) this.f95397aj).f128225I, this.f94238k, z2);
                    } else {
                        this.f123963aH.inflate((int) C0126R.C0128layout.wallet_layout_buyflow_components, this.f94238k, true);
                        m79726aC();
                        TypedArray obtainStyledAttributes = this.f123962aG.obtainStyledAttributes(new int[]{C0126R.attr.attrWalletShowTopDivider});
                        boolean z6 = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        awyy a = awyy.m81590a(z2, this.f95363G);
                        View findViewById = this.f95357A.findViewById(C0126R.C0129id.buy_flow_top_divider);
                        if (!z6) {
                            i4 = 8;
                        } else {
                            i4 = 0;
                        }
                        findViewById.setVisibility(i4);
                        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
                        ViewGroup viewGroup = (ViewGroup) this.f94238k.findViewById(C0126R.C0129id.top_message_holder);
                        if (((blym) this.f95397aj).f128243i.size() <= 0) {
                            viewGroup.setVisibility(8);
                        } else {
                            m79734b((List) ((blym) this.f95397aj).f128243i, viewGroup, true);
                        }
                        ViewGroup viewGroup2 = (ViewGroup) this.f94238k.findViewById(C0126R.C0129id.authentication_form_fragment_holder);
                        int size13 = ((blym) this.f95397aj).f128247m.size();
                        for (int i16 = 0; i16 < size13; i16++) {
                            FrameLayout frameLayout = new FrameLayout(this.f123962aG);
                            viewGroup2.addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
                            int a2 = this.f95376T.mo65614a();
                            frameLayout.setId(a2);
                            mo52846a(a, (bmcb) ((blym) this.f95397aj).f128247m.get(i16), 18, a2);
                        }
                        ViewGroup viewGroup3 = (ViewGroup) this.f95357A.findViewById(C0126R.C0129id.submit_and_cancel_button_container);
                        blym blym17 = (blym) this.f95397aj;
                        if ((blym17.f128235a & 512) != 0 && blym17.f128245k.size() == 0) {
                            bmdb bmdb2 = ((blym) this.f95397aj).f128246l;
                            if (bmdb2 == null) {
                                bmdb2 = bmdb.f128767k;
                            }
                            mo52845a(bmdb2, viewGroup3, false);
                            mo52850a(bmdb2.f128770b, 38, 0);
                        }
                        blym blym18 = (blym) this.f95397aj;
                        bmdb[] bmdbArr = (bmdb[]) blym18.f128245k.toArray(new bmdb[0]);
                        if (bmdbArr.length == 0 && !blym18.f128244j.isEmpty()) {
                            bxvd da2 = bmdb.f128767k.mo74144da();
                            String str = blym18.f128244j;
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bmdb bmdb3 = (bmdb) da2.f164949b;
                            str.getClass();
                            int i17 = bmdb3.f128769a | 8;
                            bmdb3.f128769a = i17;
                            bmdb3.f128773e = str;
                            bmdb3.f128769a = i17 | 2;
                            bmdb3.f128771c = true;
                            bmdbArr = new bmdb[]{(bmdb) da2.mo74062i()};
                        }
                        int length = bmdbArr.length;
                        int i18 = 0;
                        while (i18 < length) {
                            mo52845a(bmdbArr[i18], viewGroup3, z3);
                            mo52850a(bmdbArr[i18].f128770b, 7, i18);
                            i18++;
                            a = a;
                            i5 = 8;
                            z3 = false;
                            i6 = 1;
                        }
                        ViewGroup viewGroup4 = (ViewGroup) this.f95357A.findViewById(C0126R.C0129id.button_container);
                        int size14 = ((blym) this.f95397aj).f128230O.size();
                        for (int i19 = 0; i19 < size14; i19++) {
                            mo52845a((bmdb) ((blym) this.f95397aj).f128230O.get(i19), viewGroup4, z3);
                            mo52850a(((bmdb) ((blym) this.f95397aj).f128230O.get(i19)).f128770b, 31, i19);
                        }
                        if (((blym) this.f95397aj).f128220D.size() <= 2) {
                            if (((blym) this.f95397aj).f128220D.size() > 0) {
                                mo52846a(a, (bmjv) ((blym) this.f95397aj).f128220D.get(z3), 14, (int) C0126R.C0129id.top_line_items_fragment_holder);
                            }
                            if (((blym) this.f95397aj).f128220D.size() > i6) {
                                mo52846a(a, (bmjv) ((blym) this.f95397aj).f128220D.get(i6), 14, (int) C0126R.C0129id.bottom_line_items_fragment_holder);
                            }
                            blym blym19 = (blym) this.f95397aj;
                            if ((blym19.f128235a & 1024) != 0) {
                                bmeq bmeq2 = blym19.f128248n;
                                if (bmeq2 == null) {
                                    bmeq2 = bmeq.f128990h;
                                }
                                mo52846a(a, bmeq2, 19, (int) C0126R.C0129id.customer_form_fragment_holder);
                            }
                            blym blym20 = (blym) this.f95397aj;
                            if ((blym20.f128235a & 2048) != 0) {
                                bmen bmen2 = blym20.f128249o;
                                if (bmen2 == null) {
                                    bmen2 = bmen.f128969c;
                                }
                                mo52846a(a, bmen2, 20, (int) C0126R.C0129id.billing_fragment_holder);
                            }
                            FormHeaderView formHeaderView = (FormHeaderView) this.f94238k.findViewById(C0126R.C0129id.instrument_activation_fragment_form_header);
                            blym blym21 = (blym) this.f95397aj;
                            if ((blym21.f128235a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) == 0) {
                                formHeaderView.setVisibility(i5);
                                this.f95357A.findViewById(C0126R.C0129id.instrument_activation_fragment_holder).setVisibility(i5);
                                bmbd = null;
                            } else {
                                bmfs bmfs2 = blym21.f128253s;
                                if (bmfs2 == null) {
                                    bmfs2 = bmfs.f129155e;
                                }
                                if ((bmfs2.f129157a & i6) == 0) {
                                    formHeaderView.setVisibility(i5);
                                    bmbd = null;
                                } else {
                                    formHeaderView.setVisibility(z3);
                                    bmfs bmfs3 = ((blym) this.f95397aj).f128253s;
                                    if (bmfs3 == null) {
                                        bmfs3 = bmfs.f129155e;
                                    }
                                    bmdn bmdn8 = bmfs3.f129160d;
                                    if (bmdn8 == null) {
                                        bmdn8 = bmdn.f128831k;
                                    }
                                    formHeaderView.mo71963a(bmdn8, this.f123963aH, null, this.f95386aD);
                                    ArrayList arrayList = this.f95385aC;
                                    bmfs bmfs4 = ((blym) this.f95397aj).f128253s;
                                    if (bmfs4 == null) {
                                        bmfs4 = bmfs.f129155e;
                                    }
                                    bmdn bmdn9 = bmfs4.f129160d;
                                    if (bmdn9 == null) {
                                        bmdn9 = bmdn.f128831k;
                                    }
                                    bmbd = null;
                                    arrayList.add(new bkde(bmdn9.f128835c, formHeaderView, null));
                                }
                                bmfs bmfs5 = ((blym) this.f95397aj).f128253s;
                                if (bmfs5 == null) {
                                    bmfs5 = bmfs.f129155e;
                                }
                                mo52846a(a, bmfs5, 24, (int) C0126R.C0129id.instrument_activation_fragment_holder);
                            }
                            Activity activity = getActivity();
                            blym blym22 = (blym) this.f95397aj;
                            if ((blym22.f128235a & 8192) != 0) {
                                bmbd2 = blym22.f128251q;
                                if (bmbd2 == null) {
                                    bmbd2 = bmbd.f128525j;
                                }
                            } else {
                                bmbd2 = bmbd;
                            }
                            bmbd a3 = awia.m79971a(activity, bmbd2);
                            if (a3 != null) {
                                mo52846a(a, a3, 22, (int) C0126R.C0129id.account_selector_fragment_holder);
                            }
                            blym blym23 = (blym) this.f95397aj;
                            if ((blym23.f128235a & 4096) != 0) {
                                bmet bmet2 = blym23.f128250p;
                                if (bmet2 == null) {
                                    bmet2 = bmet.f129017l;
                                }
                                mo52846a(a, bmet2, 15, (int) C0126R.C0129id.customer_selector_fragment_holder);
                            }
                            blym blym24 = (blym) this.f95397aj;
                            if ((blym24.f128235a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0) {
                                bmgn bmgn2 = blym24.f128252r;
                                if (bmgn2 == null) {
                                    bmgn2 = bmgn.f129273o;
                                }
                                mo52846a(a, bmgn2, 13, (int) C0126R.C0129id.instruments_fragment_holder);
                            }
                            blym blym25 = (blym) this.f95397aj;
                            if ((blym25.f128235a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE) != 0) {
                                bmof bmof2 = blym25.f128254t;
                                if (bmof2 == null) {
                                    bmof2 = bmof.f130215h;
                                }
                                mo52846a(a, bmof2, 9, (int) C0126R.C0129id.selectable_ui_field_group_fragment_holder);
                            }
                            if (((blym) this.f95397aj).f128255u.size() > 0) {
                                ViewGroup viewGroup5 = (ViewGroup) this.f94238k.findViewById(C0126R.C0129id.selectable_ui_field_group_fragment_holder);
                                int size15 = ((blym) this.f95397aj).f128255u.size();
                                for (int i20 = 0; i20 < size15; i20++) {
                                    FrameLayout frameLayout2 = new FrameLayout(this.f123962aG);
                                    viewGroup5.addView(frameLayout2, new ViewGroup.LayoutParams(-1, -2));
                                    int a4 = this.f95376T.mo65614a();
                                    frameLayout2.setId(a4);
                                    mo52846a(a, (bmof) ((blym) this.f95397aj).f128255u.get(i20), 37, a4);
                                }
                            }
                            ViewGroup viewGroup6 = (ViewGroup) this.f94238k.findViewById(C0126R.C0129id.simple_form_fragments_holder);
                            int size16 = ((blym) this.f95397aj).f128224H.size();
                            int i21 = 0;
                            while (i21 < size16) {
                                bmeb bmeb = (bmeb) ((blym) this.f95397aj).f128224H.get(i21);
                                if (bmeb != null && bmeb.f128906c.size() != 0 && bmeb.f128906c.size() == i6 && ((bmea) bmeb.f128906c.get(z3 ? 1 : 0)).f128899a == 2) {
                                    bmea bmea = (bmea) bmeb.f128906c.get(z3);
                                    if (bmea.f128899a != 2) {
                                        bmdx = bmdx.f128886d;
                                    } else {
                                        bmdx = (bmdx) bmea.f128900b;
                                    }
                                    if (bmdx.f128888a == 12) {
                                        bmea bmea2 = (bmea) bmeb.f128906c.get(z3);
                                        if (bmea2.f128899a != 2) {
                                            bmdx2 = bmdx.f128886d;
                                        } else {
                                            bmdx2 = (bmdx) bmea2.f128900b;
                                        }
                                        if (bmdx2.f128888a == 12) {
                                            bmno = (bmno) bmdx2.f128889b;
                                        } else {
                                            bmno = bmno.f130138m;
                                        }
                                        if ((bmno.f130140a & 2) != 0) {
                                            mo52846a(a, bmeb, 6, (int) C0126R.C0129id.logo_fragment_holder);
                                            this.f94238k.findViewById(C0126R.C0129id.logo_fragment_holder).setVisibility(z3);
                                            if (!((Boolean) awih.f94449j.mo58455c()).booleanValue()) {
                                                FrameLayout frameLayout3 = (FrameLayout) this.f94238k.findViewById(C0126R.C0129id.logo_fragment_holder);
                                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout3.getLayoutParams();
                                                layoutParams.width = -2;
                                                if (((Boolean) awih.f94448i.mo58455c()).booleanValue()) {
                                                    layoutParams.gravity = 17;
                                                }
                                                frameLayout3.setLayoutParams(layoutParams);
                                            }
                                            i21++;
                                            i6 = 1;
                                        }
                                    }
                                }
                                FrameLayout frameLayout4 = new FrameLayout(this.f123962aG);
                                viewGroup6.addView(frameLayout4, new ViewGroup.LayoutParams(-1, -2));
                                int a5 = this.f95376T.mo65614a();
                                frameLayout4.setId(a5);
                                awzs awzs = (awzs) mo52846a(a, bmeb, 6, a5);
                                if (i21 == size16 - 1) {
                                    awzs.mo52921l();
                                }
                                i21++;
                                i6 = 1;
                            }
                            blym blym26 = (blym) this.f95397aj;
                            if ((blym26.f128235a & JGCastService.FLAG_PRIVATE_DISPLAY) != 0) {
                                bmdj bmdj2 = blym26.f128232Q;
                                if (bmdj2 == null) {
                                    bmdj2 = bmdj.f128803l;
                                }
                                mo52846a(a, bmdj2, 35, (int) C0126R.C0129id.encryption_fragment_holder);
                            }
                            blym blym27 = (blym) this.f95397aj;
                            if ((blym27.f128235a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS) == 0) {
                                this.f94238k.findViewById(C0126R.C0129id.legal_message_set_fragment_holder).setVisibility(i5);
                            } else {
                                bmjh bmjh = blym27.f128256v;
                                if (bmjh == null) {
                                    bmjh = bmjh.f129700e;
                                }
                                mo52846a(a, bmjh, 21, (int) C0126R.C0129id.legal_message_set_fragment_holder);
                            }
                            ViewGroup viewGroup7 = (ViewGroup) this.f94238k.findViewById(C0126R.C0129id.bottom_message_holder);
                            if (((blym) this.f95397aj).f128258x.size() <= 0) {
                                viewGroup7.setVisibility(i5);
                            } else {
                                m79734b(((blym) this.f95397aj).f128258x, viewGroup7, z3);
                            }
                            int size17 = this.f95385aC.size();
                            for (int i22 = 0; i22 < size17; i22++) {
                                Object obj2 = ((bkde) this.f95385aC.get(i22)).f124039e;
                                if (obj2 instanceof bkdx) {
                                    bkdx bkdx = (bkdx) obj2;
                                    if (bkdx.mo52776bU() != null) {
                                        this.f95363G.mo66032a(bkdx);
                                    }
                                }
                            }
                            beginTransaction.commit();
                        } else {
                            throw new IllegalStateException("More than 2 lineItemContainers are not supported");
                        }
                    }
                    awzu = (awzu) mo52884b(22, awzu.class);
                    if (awzu != null) {
                        awzu.f95447e = this;
                    }
                    ArrayList a6 = mo52847a(18, awyq.class);
                    size = a6.size();
                    for (i = 0; i < size; i++) {
                        ((awyq) a6.get(i)).f95316n = this;
                        ((awyq) a6.get(i)).f95317o = this;
                    }
                    ArrayList a7 = mo52847a(6, awzs.class);
                    size2 = a7.size();
                    for (i2 = 0; i2 < size2; i2++) {
                        ((awzs) a7.get(i2)).f95441a = this;
                        ((awzs) a7.get(i2)).f95442b = this;
                    }
                    size3 = this.f95402ao.size();
                    for (i3 = 0; i3 < size3; i3++) {
                        ((bkbn) this.f95402ao.get(i3)).mo52710b().setOnClickListener(this);
                    }
                    popoverView = this.f94235h;
                    if (popoverView != null && z2) {
                        awhb awhb = popoverView.f110099e;
                        int i23 = awhb.f94326n;
                        if (awhb.f94333b && !awhb.f94339h && awhb.getScrollY() > popoverView.mo59881f()) {
                            popoverView.mo59872a(z3);
                        }
                    }
                    if (!this.f95398ak.f110452a && z2) {
                        bkfr.m105567a(this.f95357A, getActivity().getTitle());
                    }
                    if (z2) {
                        bmav bmav = this.f95398ak.f110468q;
                        if (bmav == null || !bkfr.m105582a(bmav)) {
                            this.f95363G.mo66025a(3);
                        } else {
                            this.f95363G.mo66025a(4);
                        }
                    }
                    m79727aD();
                    return;
                }
                throw new IllegalArgumentException("Only one of optional AmountInput or the repeat AmountInputs should be set.");
            }
            PopoverView popoverView3 = this.f94235h;
            if (popoverView3 == null) {
                BottomSheetView bottomSheetView = this.f94236i;
                if (bottomSheetView != null) {
                    bottomSheetView.mo59838a();
                }
            } else {
                popoverView3.mo59876b(true);
            }
            if (z2) {
            }
            blym = (blym) this.f95397aj;
            this.f95373Q = blym.f128236b;
            if ((blym.f128235a & 2097152) == 0) {
            }
            mo52859a(bwio);
            blym2 = (blym) this.f95397aj;
            if ((blym2.f128235a & 8388608) == 0) {
            }
            mo52859a(bwio2);
            da = bwip.f159664e.mo74144da();
            boolean z52 = this.f94232e.f128343e;
            if (da.f164950c) {
            }
            bwip bwip3 = (bwip) da.f164949b;
            bwip3.f159666a |= 1;
            bwip3.f159667b = z52;
            bwip bwip22 = (bwip) da.mo74062i();
            blym blym62 = (blym) this.f95397aj;
            bxvd bxvd22 = (bxvd) blym62.mo74142c(5);
            bxvd22.mo73625a((bxvk) blym62);
            blyj = (blyj) bxvd22;
            bwio4 = ((blym) this.f95397aj).f128217A;
            if (bwio4 == null) {
            }
            bxvd = (bxvd) bwio4.mo74142c(5);
            bxvd.mo73625a((bxvk) bwio4);
            if (bxvd.f164950c) {
            }
            bwio bwio52 = (bwio) bxvd.f164949b;
            bwip22.getClass();
            bwio52.f159663c = bwip22;
            bwio52.f159661a |= 2;
            if (blyj.f164950c) {
            }
            blym blym72 = (blym) blyj.f164949b;
            bwio bwio62 = (bwio) bxvd.mo74062i();
            bwio62.getClass();
            blym72.f128217A = bwio62;
            blym72.f128235a |= 4194304;
            this.f95397aj = blyj.mo74062i();
            blym3 = (blym) this.f95397aj;
            if ((4194304 & blym3.f128235a) == 0) {
            }
            mo52859a(bwio3);
            blym4 = (blym) this.f95397aj;
            if ((blym4.f128235a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE) != 0) {
            }
            if (((blym) this.f95397aj).f128225I.size() == 0) {
            }
            awzu = (awzu) mo52884b(22, awzu.class);
            if (awzu != null) {
            }
            ArrayList a62 = mo52847a(18, awyq.class);
            size = a62.size();
            while (i < size) {
            }
            ArrayList a72 = mo52847a(6, awzs.class);
            size2 = a72.size();
            while (i2 < size2) {
            }
            size3 = this.f95402ao.size();
            while (i3 < size3) {
            }
            popoverView = this.f94235h;
            awhb awhb2 = popoverView.f110099e;
            int i232 = awhb.f94326n;
            popoverView.mo59872a(z3);
            bkfr.m105567a(this.f95357A, getActivity().getTitle());
            if (z2) {
            }
            m79727aD();
            return;
        }
        mo52897g(-1);
    }

    /* renamed from: a */
    private static boolean m79723a(List list, bkdx bkdx) {
        if (bkdx != null) {
            return list == null || list.isEmpty() || list.contains(Long.valueOf(bkdx.mo52837W()));
        }
        return false;
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
        this.f95357A = layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_buyflow, viewGroup, false);
        this.f94238k = (ViewGroup) this.f95357A.findViewById(C0126R.C0129id.components_holder);
        mo52851a((awib) ((ProgressSpinnerView) getActivity().findViewById(C0126R.C0129id.progress_spinner_container)));
        this.f94235h = awia.m79995b(getActivity());
        this.f94236i = (BottomSheetView) getActivity().findViewById(C0126R.C0129id.bottom_sheet);
        this.f95357A.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
        mo52039K();
        if (bundle != null) {
            bkch bkch = (bkch) getFragmentManager().findFragmentByTag("confirmationDialog");
            this.f94229b = bkch;
            if (bkch != null) {
                bkch.f123993e = this;
                bkch.f123992d = this;
            }
        }
        return this.f95357A;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bxxc mo52042a(long j) {
        int intValue = ((Integer) this.f95375S.mo15534a(j)).intValue();
        int intValue2 = ((Integer) this.f95374R.mo15534a(j)).intValue();
        if (intValue2 == 0) {
            return (bmnr) ((blym) this.f95397aj).f128258x.get(intValue);
        }
        if (intValue2 == 9) {
            bmof bmof = ((blym) this.f95397aj).f128254t;
            return bmof == null ? bmof.f130215h : bmof;
        } else if (intValue2 == 22) {
            bmbd bmbd = ((blym) this.f95397aj).f128251q;
            if (bmbd == null) {
                return bmbd.f128525j;
            }
            return bmbd;
        } else if (intValue2 == 24) {
            bmfs bmfs = ((blym) this.f95397aj).f128253s;
            return bmfs == null ? bmfs.f129155e : bmfs;
        } else if (intValue2 == 31) {
            return (bmdb) ((blym) this.f95397aj).f128230O.get(intValue);
        } else {
            if (intValue2 == 35) {
                bmdj bmdj = ((blym) this.f95397aj).f128232Q;
                return bmdj == null ? bmdj.f128803l : bmdj;
            } else if (intValue2 == 6) {
                return (bmeb) ((blym) this.f95397aj).f128224H.get(intValue);
            } else {
                if (intValue2 == 7) {
                    return (bmdb) ((blym) this.f95397aj).f128245k.get(intValue);
                }
                if (intValue2 == 37) {
                    return (bmof) ((blym) this.f95397aj).f128255u.get(intValue);
                }
                if (intValue2 != 38) {
                    switch (intValue2) {
                        case 13:
                            bmgn bmgn = ((blym) this.f95397aj).f128252r;
                            if (bmgn == null) {
                                return bmgn.f129273o;
                            }
                            return bmgn;
                        case 14:
                            return (bmjv) ((blym) this.f95397aj).f128220D.get(intValue);
                        case 15:
                            bmet bmet = ((blym) this.f95397aj).f128250p;
                            return bmet == null ? bmet.f129017l : bmet;
                        case 16:
                            return (bmoh) ((blym) this.f95397aj).f128226J.get(intValue);
                        case 17:
                            return (bmjf) ((blym) this.f95397aj).f128257w.get(intValue);
                        case 18:
                            return (bmcb) ((blym) this.f95397aj).f128247m.get(intValue);
                        case 19:
                            bmeq bmeq = ((blym) this.f95397aj).f128248n;
                            return bmeq == null ? bmeq.f128990h : bmeq;
                        case 20:
                            bmen bmen = ((blym) this.f95397aj).f128249o;
                            return bmen == null ? bmen.f128969c : bmen;
                        default:
                            return null;
                    }
                } else {
                    bmdb bmdb = ((blym) this.f95397aj).f128246l;
                    return bmdb == null ? bmdb.f128767k : bmdb;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final PageDetails mo52043a(Intent intent) {
        byte[] byteArray = intent.getBundleExtra("webViewComponentCallbackData").getByteArray("EventListener.EXTRA_WEBVIEW_COMPONENT_COMPLETE_WITH_CALLBACK_DATA");
        BuyFlowFragment$BuyFlowPageDetails buyFlowFragment$BuyFlowPageDetails = new BuyFlowFragment$BuyFlowPageDetails();
        buyFlowFragment$BuyFlowPageDetails.f110454c = bwgz.COMPLETE_FLOW_IMMEDIATELY;
        awet a = BuyFlowResult.m93847a();
        a.mo52084b(byteArray);
        buyFlowFragment$BuyFlowPageDetails.f110466o = a.f94248a;
        return buyFlowFragment$BuyFlowPageDetails;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo51902a(Bundle bundle, byte[] bArr, List list) {
        bmjf bmjf;
        bmcc m;
        bmog m2;
        bxvd da = blyn.f128261o.mo74144da();
        axag axag = (axag) mo52884b(15, axag.class);
        if ((((blym) this.f95397aj).f128235a & 4096) != 0 && m79723a(list, axag)) {
            bmeu l = axag.mo52938l();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blyn blyn = (blyn) da.f164949b;
            l.getClass();
            blyn.f128272j = l;
            blyn.f128263a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        axae axae = (axae) mo52884b(19, axae.class);
        if ((((blym) this.f95397aj).f128235a & 1024) != 0 && m79723a(list, axae)) {
            bmer l2 = axae.mo52936l();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blyn blyn2 = (blyn) da.f164949b;
            l2.getClass();
            blyn2.f128264b = l2;
            blyn2.f128263a |= 1;
        }
        axab axab = (axab) mo52884b(20, axab.class);
        if ((((blym) this.f95397aj).f128235a & 2048) != 0 && m79723a(list, axab)) {
            bxvd da2 = bmeo.f128974c.mo74144da();
            View view = axab.f95482a;
            bmqf bmqf = ((bmen) axab.f124069w).f128972b;
            if (bmqf == null) {
                bmqf = bmqf.f130370r;
            }
            bmqk a = bkft.m105631a(view, bmqf);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bmeo bmeo = (bmeo) da2.f164949b;
            a.getClass();
            bmeo.f128977b = a;
            bmeo.f128976a |= 1;
            bmeo bmeo2 = (bmeo) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blyn blyn3 = (blyn) da.f164949b;
            bmeo2.getClass();
            blyn3.f128265c = bmeo2;
            blyn3.f128263a |= 2;
        }
        bkdx b = mo52884b(24, bkdx.class);
        if ((((blym) this.f95397aj).f128235a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) != 0 && m79723a(list, b)) {
            bmfs bmfs = ((blym) this.f95397aj).f128253s;
            if (bmfs == null) {
                bmfs = bmfs.f129155e;
            }
            bmft a2 = bjvh.m104697a(b, bmfs);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blyn blyn4 = (blyn) da.f164949b;
            a2.getClass();
            blyn4.f128271i = a2;
            blyn4.f128263a |= 64;
        }
        int i = ((blym) this.f95397aj).f128235a;
        if ((131072 & i) != 0 && (i & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) == 0) {
            throw new IllegalStateException("InstrumentForm is not supported.");
        }
        axbr axbr = (axbr) mo52884b(13, axbr.class);
        if ((((blym) this.f95397aj).f128235a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0 && m79723a(list, axbr)) {
            bmgo a3 = axbr.mo52992a(bundle);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blyn blyn5 = (blyn) da.f164949b;
            a3.getClass();
            blyn5.f128270h = a3;
            blyn5.f128263a |= 32;
        }
        axaw axaw = (axaw) mo52884b(9, axaw.class);
        if (m79723a(list, axaw) && axaw.mo52957m() != null) {
            bmog m3 = axaw.mo52957m();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blyn blyn6 = (blyn) da.f164949b;
            m3.getClass();
            blyn6.f128266d = m3;
            blyn6.f128263a |= 8;
        }
        ArrayList a4 = mo52847a(37, axaw.class);
        for (int i2 = 0; i2 < a4.size(); i2++) {
            axaw axaw2 = (axaw) a4.get(i2);
            if (m79723a(list, axaw2) && (m2 = axaw2.mo52957m()) != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                blyn blyn7 = (blyn) da.f164949b;
                m2.getClass();
                if (!blyn7.f128267e.mo73666a()) {
                    blyn7.f128267e = bxvk.m124021a(blyn7.f128267e);
                }
                blyn7.f128267e.add(m2);
            }
        }
        ArrayList a5 = mo52847a(18, awyq.class);
        awyq awyq = null;
        for (int i3 = 0; i3 < a5.size(); i3++) {
            awyq awyq2 = (awyq) a5.get(i3);
            View view2 = awyq2.getView();
            if (view2 != null && view2.getVisibility() == 0) {
                awyq = awyq2;
            }
        }
        if (m79723a(list, awyq) && (m = awyq.mo52783m()) != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blyn blyn8 = (blyn) da.f164949b;
            m.getClass();
            blyn8.f128275m = m;
            blyn8.f128263a |= 1024;
        }
        axbt axbt = (axbt) mo52884b(21, axbt.class);
        ArrayList arrayList = new ArrayList();
        if (!((((blym) this.f95397aj).f128235a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS) == 0 || !m79723a(list, axbt) || (bmjf = axbt.f95734b) == null || (bmjf.f129687a & 32) == 0)) {
            arrayList.add(bmjf.f129693g);
        }
        int size = this.f95404aq.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (((LegalMessageView) this.f95404aq.get(i4)).getVisibility() == 0) {
                arrayList.add(((LegalMessageView) this.f95404aq.get(i4)).mo71871g());
            }
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blyn blyn9 = (blyn) da.f164949b;
        blyn9.mo66772a();
        bxsy.m123078a(arrayList, blyn9.f128268f);
        ArrayList a6 = mo52847a(6, awzs.class);
        if (((blym) this.f95397aj).f128224H.size() > 0 && !a6.isEmpty()) {
            int size2 = a6.size();
            ArrayList arrayList2 = new ArrayList();
            for (int i5 = 0; i5 < size2; i5++) {
                awzs awzs = (awzs) a6.get(i5);
                if (m79723a(list, awzs)) {
                    arrayList2.add(awzs.mo52944a((Bundle) null));
                }
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blyn blyn10 = (blyn) da.f164949b;
            blyn10.mo66773b();
            bxsy.m123078a(arrayList2, blyn10.f128273k);
        }
        bkig bkig = (bkig) mo52884b(35, bkig.class);
        if ((((blym) this.f95397aj).f128235a & JGCastService.FLAG_PRIVATE_DISPLAY) != 0 && m79723a(list, bkig)) {
            bmdk m4 = bkig.mo66019m();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blyn blyn11 = (blyn) da.f164949b;
            m4.getClass();
            blyn11.f128276n = m4;
            blyn11.f128263a |= 2048;
        }
        blym blym = (blym) this.f95397aj;
        if ((blym.f128235a & 4) != 0) {
            bxtx bxtx = blym.f128238d;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blyn blyn12 = (blyn) da.f164949b;
            bxtx.getClass();
            blyn12.f128263a |= 16;
            blyn12.f128269g = bxtx;
        }
        if (bArr == null) {
            bArr = f94220a;
        }
        bxtx a7 = bxtx.m123261a(bArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blyn blyn13 = (blyn) da.f164949b;
        a7.getClass();
        blyn13.f128263a |= 512;
        blyn13.f128274l = a7;
        return (blyn) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51903a() {
        m79735g(false);
    }

    /* renamed from: a */
    public final void mo51904a(int i) {
        super.mo51904a(i);
        if (this.f95397aj != null) {
            PopoverView popoverView = this.f94235h;
            if (popoverView == null) {
                BottomSheetView bottomSheetView = this.f94236i;
                if (!(bottomSheetView == null || bottomSheetView.getVisibility() == 0)) {
                    bottomSheetView.setVisibility(0);
                }
            } else if (popoverView.getVisibility() != 0) {
                popoverView.setVisibility(0);
            }
        }
        if (this.f95357A.getVisibility() != 0) {
            if (((Boolean) bjwe.f123466A.mo54082a()).booleanValue()) {
                this.f95363G.f124309r.f124300i = true;
            } else {
                this.f95363G.f124299h = false;
            }
            if (!chft.f188571a.mo6606a().mo85202a()) {
                this.f95363G.mo66047g(false);
            } else {
                PopoverView popoverView2 = this.f94235h;
                if (popoverView2 == null) {
                    BottomSheetView bottomSheetView2 = this.f94236i;
                    if (bottomSheetView2 == null) {
                        FocusedViewToTopScrollView focusedViewToTopScrollView = (FocusedViewToTopScrollView) mo52872ae();
                        if (focusedViewToTopScrollView != null) {
                            focusedViewToTopScrollView.f151970r = false;
                            focusedViewToTopScrollView.mo71903a(false);
                        }
                    } else {
                        bottomSheetView2.mo59839a(false);
                        this.f94236i.mo59841b(false);
                    }
                } else {
                    popoverView2.f110113s = false;
                    popoverView2.mo59878c(false);
                }
                this.f95363G.mo66047g(false);
                mo52881an().postDelayed(awgc.m79888a(this, "scrollToTop"), 1000);
            }
            if (this.f94235h != null) {
                bkcd.m105305a(this.f95357A, 0, -1, new awek(this));
            } else {
                this.f95357A.setVisibility(0);
                if (((Boolean) bjwe.f123466A.mo54082a()).booleanValue()) {
                    this.f95363G.mo66042e();
                } else {
                    bkip bkip = this.f95363G;
                    bkip.f124299h = true;
                    bkip.mo66049h();
                }
                this.f95357A.post(awgc.m79888a(this, "logSubmitButtonAndMakeFullScreenIfNecessary"));
            }
        } else if (!this.f95363G.mo66047g(true)) {
            this.f94225aP = true;
            mo52033E();
        }
        if (i == 1) {
            blym blym = (blym) this.f95397aj;
            if ((blym.f128235a & 16777216) != 0) {
                bmde bmde = blym.f128219C;
                if (bmde == null) {
                    bmde = bmde.f128780k;
                }
                int a = bmdd.m107914a(bmde.f128791j);
                if (a != 0 && a == 2) {
                    bmde bmde2 = ((blym) this.f95397aj).f128219C;
                    if (bmde2 == null) {
                        bmde2 = bmde.f128780k;
                    }
                    if (bmde2.f128787f.size() == 1) {
                        bmde bmde3 = ((blym) this.f95397aj).f128219C;
                        if (bmde3 == null) {
                            bmde3 = bmde.f128780k;
                        }
                        if (!((bmnr) bmde3.f128787f.get(0)).f130159e.isEmpty()) {
                            ContextThemeWrapper contextThemeWrapper = this.f123962aG;
                            bmde bmde4 = ((blym) this.f95397aj).f128219C;
                            if (bmde4 == null) {
                                bmde4 = bmde.f128780k;
                            }
                            Toast.makeText(contextThemeWrapper, Html.fromHtml(((bmnr) bmde4.f128787f.get(0)).f130159e), 1).show();
                        }
                    }
                }
            }
        }
        mo52891c(m79730aG());
    }

    /* renamed from: a */
    public final void mo52044a(int i, int i2) {
        if (i2 != 6) {
            if (i2 != 7) {
                super.mo52044a(i, i2);
            } else if (i == 1) {
                mo52072r();
            } else if (i == 2) {
                mo52897g(i2);
            } else {
                StringBuilder sb = new StringBuilder(35);
                sb.append("Unexpected button code: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
        } else if (i == 1) {
            aweq aweq = this.f94244q;
            if (aweq != null) {
                aweq.mo52028a(this.f94222aM);
                this.f95368L = 2;
                mo52808n(false);
            }
        } else if (i == 2) {
            mo52897g(i2);
        } else {
            StringBuilder sb2 = new StringBuilder(35);
            sb2.append("Unexpected button code: ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
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
    public final void mo51905a(int i, Bundle bundle) {
        super.mo51905a(i, bundle);
        awyq I = mo52037I();
        if (i == 8) {
            mo52054a(bundle.getByteArray("EventListener.EXTRA_DEPENDENCY_GRAPH_ACTION_TOKEN"), new ArrayList(), (List) null);
        } else if (i == 26) {
            awou awou = (awou) mo52839Y().f94357a;
            sdo.m34971a(awou.mo52431f(), (Object) "Must specify connection to OrchestrationService!");
            Message.obtain(awou.f94784u, 65, null).sendToTarget();
        } else if (i != 15) {
            if (i == 16 && I != null) {
                I.mo52772a(true);
            }
        } else if (I != null) {
            I.mo52772a(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52045a(long j, bxxc bxxc) {
        int intValue = ((Integer) this.f95375S.mo15534a(j)).intValue();
        if (((Integer) this.f95374R.mo15534a(j)).intValue() == 6) {
            blym blym = (blym) this.f95397aj;
            bxvd bxvd = (bxvd) blym.mo74142c(5);
            bxvd.mo73625a((bxvk) blym);
            blyj blyj = (blyj) bxvd;
            if (blyj.f164950c) {
                blyj.mo74035c();
                blyj.f164950c = false;
            }
            blym blym2 = (blym) blyj.f164949b;
            bxvu bxvu = blym.f128214M;
            bxxc.getClass();
            blym2.mo66771a();
            blym2.f128224H.set(intValue, bxxc);
            this.f95397aj = blyj.mo74062i();
        }
    }

    /* renamed from: a */
    public final void mo52046a(Account account) {
        awzi awzi = this.f95369M;
        if (!mo51878cn().equals(account)) {
            mo52840Z();
            awzi.mo51860a(account);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52047a(bjwj bjwj) {
        int a = bmna.m108191a(bjwj.f123509a.f130094d);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i != 1) {
            if (i == 3) {
                return;
            }
            if (i != 4) {
                super.mo52047a(bjwj);
                return;
            }
        }
        this.f94239l.add(bjwj);
    }

    /* renamed from: a */
    public final void mo52048a(bkca bkca) {
        this.f94228aS.add(bkca);
    }

    /* JADX WARNING: Removed duplicated region for block: B:76:0x012c  */
    /* renamed from: a */
    public final void mo52049a(blyr blyr, byaa byaa) {
        bmav bmav;
        blym blym;
        blym blym2;
        bwiu bwiu;
        bmag bmag;
        bmar bmar;
        bwgz a;
        bxtx bxtx;
        bxtx bxtx2;
        blyr blyr2 = blyr;
        this.f94233f = byaa;
        if (blyr2.f128309j) {
            awev.m79821a(getActivity().getApplicationContext(), this.f95358B);
        }
        if (blyr2.f128304e) {
            bwgz a2 = bwgz.m121952a(blyr2.f128310k);
            if (a2 == null) {
                a2 = bwgz.UNKNOWN_FLOW_INSTRUCTION;
            }
            if (a2 == bwgz.UNKNOWN_FLOW_INSTRUCTION) {
                bxvd bxvd = (bxvd) blyr2.mo74142c(5);
                bxvd.mo73625a((bxvk) blyr2);
                bwgz bwgz = bwgz.COMPLETE_FLOW_IMMEDIATELY;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                blyr blyr3 = (blyr) bxvd.f164949b;
                blyr blyr4 = blyr.f128298p;
                blyr3.f128310k = bwgz.f159484u;
                blyr3.f128300a |= 512;
                blyr2 = (blyr) bxvd.mo74062i();
            }
        }
        byte[] bArr = new byte[0];
        if ((blyr2.f128300a & 4096) != 0) {
            bmag bmag2 = blyr2.f128313n;
            if (bmag2 == null) {
                bmag2 = bmag.f128442c;
            }
            if (bmag2.f128444a == 2) {
                bxtx2 = (bxtx) bmag2.f128445b;
            } else {
                bxtx2 = bxtx.f164797b;
            }
            bArr = bxtx2.mo73780k();
        }
        byte[] bArr2 = new byte[0];
        if ((blyr2.f128300a & 8192) != 0) {
            bmag bmag3 = blyr2.f128314o;
            if (bmag3 == null) {
                bmag3 = bmag.f128442c;
            }
            if (bmag3.f128444a == 2) {
                bxtx = (bxtx) bmag3.f128445b;
            } else {
                bxtx = bxtx.f164797b;
            }
            bArr2 = bxtx.mo73780k();
        }
        awet a3 = BuyFlowResult.m93847a();
        String str = blyr2.f128311l;
        BuyFlowResult buyFlowResult = a3.f94248a;
        buyFlowResult.f110018c = str;
        buyFlowResult.f110017b = blyr2.f128312m;
        a3.mo52083a(this.f94233f.mo73642k());
        a3.mo52084b(bArr);
        a3.f94248a.f110022g = bArr2;
        a3.mo52082a(m79728aE());
        BuyFlowResult buyFlowResult2 = a3.f94248a;
        bmaq bmaq = blyr2.f128302c;
        if (bmaq == null) {
            bmaq = bmaq.f128479l;
        }
        bmar bmar2 = null;
        if ((blyr2.f128300a & 1) != 0) {
            bmav = blyr2.f128301b;
            if (bmav == null) {
                bmav = bmav.f128500h;
            }
        } else {
            bmav = null;
        }
        if ((blyr2.f128300a & 32) != 0) {
            blym = blyr2.f128305f;
            if (blym == null) {
                blym = blym.f128215R;
            }
        } else {
            blym = null;
        }
        if ((blyr2.f128300a & 64) != 0) {
            blym2 = blyr2.f128307h;
            if (blym2 == null) {
                blym2 = blym.f128215R;
            }
        } else {
            blym2 = null;
        }
        if ((blyr2.f128300a & 128) != 0) {
            bwiu = blyr2.f128308i;
            if (bwiu == null) {
                bwiu = bwiu.f159689b;
            }
        } else {
            bwiu = null;
        }
        bxwc bxwc = blyr2.f128306g;
        if ((blyr2.f128300a & 4096) != 0) {
            bmag = blyr2.f128313n;
            if (bmag == null) {
                bmag = bmag.f128442c;
            }
        } else {
            bmag = null;
        }
        if ((blyr2.f128300a & 4) != 0) {
            bmar bmar3 = blyr2.f128303d;
            if (bmar3 != null) {
                bmar = bmar3;
                a = bwgz.m121952a(blyr2.f128310k);
                if (a == null) {
                    a = bwgz.UNKNOWN_FLOW_INSTRUCTION;
                }
                mo52051a(bmaq, bmav, blym, blym2, bwiu, null, bxwc, bmag, bmar, a, buyFlowResult2, false, 1, "onSubmitResponse");
            }
            bmar2 = bmar.f128490c;
        }
        bmar = bmar2;
        a = bwgz.m121952a(blyr2.f128310k);
        if (a == null) {
        }
        mo52051a(bmaq, bmav, blym, blym2, bwiu, null, bxwc, bmag, bmar, a, buyFlowResult2, false, 1, "onSubmitResponse");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51908a(bmaf bmaf) {
        mo52050a(bmaf, Bundle.EMPTY, (byte[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo52050a(bmaf bmaf, Bundle bundle, byte[] bArr) {
        mo52808n(false);
        bxvd da = blyo.f128277e.mo74144da();
        bmaj a = awfx.m79878a(this.f94233f.f165220b.mo73780k());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blyo blyo = (blyo) da.f164949b;
        a.getClass();
        blyo.f128280b = a;
        blyo.f128279a |= 1;
        blyn blyn = (blyn) mo52885b(bundle, bArr, (List) null);
        if (blyn != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blyo blyo2 = (blyo) da.f164949b;
            blyn.getClass();
            blyo2.f128281c = blyn;
            int i = blyo2.f128279a | 2;
            blyo2.f128279a = i;
            if (bmaf != null) {
                bmaf.getClass();
                blyo2.f128282d = bmaf;
                blyo2.f128279a = i | 4;
            }
            mo52864a(da.mo74062i(), 4);
            mo52900j(4);
            mo52839Y().f94357a.mo52400a((blyo) da.mo74062i(), this.f94233f, this.f95398ak.f110467p);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo52051a(bmaq bmaq, bmav bmav, blym blym, blym blym2, bwiu bwiu, bwit bwit, List list, bmag bmag, bmar bmar, bwgz bwgz, BuyFlowResult buyFlowResult, boolean z, int i, String str) {
        bxvv bxvv;
        boolean z2;
        bmaq bmaq2 = bmaq;
        bmav bmav2 = bmav;
        blym blym3 = blym;
        int i2 = 2;
        if (bmav2 != null && !bkfr.m105582a(bmav)) {
            i2 = 3;
        }
        OrchestrationApiEvent.m93817a(getActivity(), i2, bmaq, bmav, this.f95359C);
        bmkw bmkw = null;
        if (blym3 != null) {
            bxvv = new bxvv(blym3.f128228L, blym.f128214M);
        } else {
            bxvv = null;
        }
        List a = awev.m79820a(bxvv);
        mo52854a(bmav, bmaq, a, i);
        BuyFlowFragment$BuyFlowPageDetails buyFlowFragment$BuyFlowPageDetails = new BuyFlowFragment$BuyFlowPageDetails();
        buyFlowFragment$BuyFlowPageDetails.f110460i = blym3;
        buyFlowFragment$BuyFlowPageDetails.f110461j = blym2;
        if (blym3 != null) {
            if ((blym3.f128235a & 536870912) != 0 && (bmkw = blym3.f128231P) == null) {
                bmkw = bmkw.f129898c;
            }
            buyFlowFragment$BuyFlowPageDetails.f110463l = bmkw;
        }
        buyFlowFragment$BuyFlowPageDetails.f110457f = list;
        buyFlowFragment$BuyFlowPageDetails.f110468q = bmav2;
        buyFlowFragment$BuyFlowPageDetails.f110456e = bmag;
        buyFlowFragment$BuyFlowPageDetails.f110466o = buyFlowResult;
        buyFlowFragment$BuyFlowPageDetails.f110455d = a;
        buyFlowFragment$BuyFlowPageDetails.f110465n = bmaq2;
        buyFlowFragment$BuyFlowPageDetails.f110467p = bmar;
        buyFlowFragment$BuyFlowPageDetails.f110458g = bwiu;
        buyFlowFragment$BuyFlowPageDetails.f110462k = bwit;
        if (blym3 != null) {
            if (blym3.f128239e || blym3.f128240f > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            buyFlowFragment$BuyFlowPageDetails.f110452a = z2;
            buyFlowFragment$BuyFlowPageDetails.f110459h = blym3.f128240f;
            int a2 = bmqm.m108288a(blym3.f128241g);
            if (a2 == 0) {
                a2 = 1;
            }
            buyFlowFragment$BuyFlowPageDetails.f110469r = a2;
        }
        buyFlowFragment$BuyFlowPageDetails.f110454c = bwgz;
        byaa byaa = this.f94233f;
        bxvd bxvd = (bxvd) byaa.mo74142c(5);
        bxvd.mo73625a((bxvk) byaa);
        bxtx bxtx = bmaq2.f128483c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        byaa byaa2 = (byaa) bxvd.f164949b;
        byaa byaa3 = byaa.f165217d;
        bxtx.getClass();
        byaa2.f165219a |= 1;
        byaa2.f165220b = bxtx;
        this.f94233f = (byaa) bxvd.mo74062i();
        mo52364a(buyFlowFragment$BuyFlowPageDetails, z, str);
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        bmmp bmmp;
        bmmp bmmp2;
        bmmp bmmp3;
        bmmp bmmp4;
        bmmf bmmf;
        bmmf bmmf2;
        bxtx bxtx;
        bmme bmme;
        bwdm cl;
        int a = bmmb.m108166a(bmmv.f130058d);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        bxvw bxvw = null;
        if (i == 3) {
            if (bmmv.f130056b == 4) {
                bmmp = (bmmp) bmmv.f130057c;
            } else {
                bmmp = bmmp.f130032e;
            }
            if (!bmmp.f130035b) {
                bxvw = (bmmv.f130056b == 4 ? (bmmp) bmmv.f130057c : bmmp.f130032e).f130034a;
            }
            if (!mo52804a((List) bxvw)) {
                mo52808n(true);
                mo52814N();
                ArrayList aF = m79729aF();
                int size = aF.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((awyq) aF.get(i2)).mo52782l();
                }
                return;
            }
            if (bmmv.f130056b == 4) {
                bmmp2 = (bmmp) bmmv.f130057c;
            } else {
                bmmp2 = bmmp.f130032e;
            }
            byte[] k = bmmp2.f130037d.mo73780k();
            if (bmmv.f130056b == 4) {
                bmmp3 = (bmmp) bmmv.f130057c;
            } else {
                bmmp3 = bmmp.f130032e;
            }
            mo52054a(k, bxvw, bmmp3.f130036c);
        } else if (i == 4) {
            if (bmmv.f130056b == 4) {
                bmmp4 = (bmmp) bmmv.f130057c;
            } else {
                bmmp4 = bmmp.f130032e;
            }
            byte[] k2 = bmmp4.f130037d.mo73780k();
            Bundle bundle = new Bundle();
            bjvp.m104737a(bundle, "EventListener.EXTRA_TRIGGER_VALUE_REFERENCES", list);
            mo52050a((bmaf) null, bundle, k2);
        } else if (i != 8) {
            if (i != 23) {
                if (i != 33) {
                    if (i != 34) {
                        super.mo51910a(bmmv, list);
                    } else if (this.f94244q != null) {
                        if (bmmv.f130056b == 23) {
                            bmme = (bmme) bmmv.f130057c;
                        } else {
                            bmme = bmme.f129999b;
                        }
                        bxvd da = bwdp.f158910d.mo74144da();
                        int a2 = bmmd.m108168a(bmme.f130001a);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        int i3 = a2 - 1;
                        if (i3 == 1) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bwdp bwdp = (bwdp) da.f164949b;
                            bwdp.f158914c = 3;
                            bwdp.f158912a |= 1;
                        } else if (i3 == 2) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bwdp bwdp2 = (bwdp) da.f164949b;
                            bwdp2.f158914c = 4;
                            bwdp2.f158912a |= 1;
                        } else if (i3 == 3) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bwdp bwdp3 = (bwdp) da.f164949b;
                            bwdp3.f158914c = 1;
                            bwdp3.f158912a |= 1;
                        } else if (i3 == 5) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bwdp bwdp4 = (bwdp) da.f164949b;
                            bwdp4.f158914c = 5;
                            bwdp4.f158912a |= 1;
                        } else {
                            throw new IllegalStateException("Unknown CallbackTrigger");
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList a3 = mo52847a(6, awzs.class);
                        for (int i4 = 0; i4 < a3.size(); i4++) {
                            awzs awzs = (awzs) a3.get(i4);
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = awzs.f124408j;
                            int size2 = arrayList3.size();
                            for (int i5 = 0; i5 < size2; i5++) {
                                bwdm cl2 = ((bkag) arrayList3.get(i5)).mo52930cl();
                                if (cl2 != null) {
                                    arrayList2.add(cl2);
                                }
                            }
                            ArrayList arrayList4 = awzs.f124406h;
                            int size3 = arrayList4.size();
                            for (int i6 = 0; i6 < size3; i6++) {
                                bwdm cl3 = ((bkdx) arrayList4.get(i6)).mo52930cl();
                                if (cl3 != null) {
                                    arrayList2.add(cl3);
                                }
                            }
                            arrayList.addAll(arrayList2);
                        }
                        axbr axbr = (axbr) mo52884b(13, axbr.class);
                        if (!(axbr == null || (cl = axbr.mo52930cl()) == null)) {
                            arrayList.add(cl);
                        }
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bwdp bwdp5 = (bwdp) da.f164949b;
                        if (!bwdp5.f158913b.mo73666a()) {
                            bwdp5.f158913b = bxvk.m124021a(bwdp5.f158913b);
                        }
                        bxsy.m123078a(arrayList, bwdp5.f158913b);
                        bwdp bwdp6 = (bwdp) da.mo74062i();
                        this.f94222aM = bwdp6;
                        this.f94244q.mo52028a(bwdp6);
                        this.f95368L = 2;
                        mo52808n(false);
                    }
                } else if (!mo52804a((List) null)) {
                    mo52817Q();
                } else {
                    FocusedViewToTopScrollView focusedViewToTopScrollView = (FocusedViewToTopScrollView) mo52872ae();
                    if (focusedViewToTopScrollView != null) {
                        focusedViewToTopScrollView.fullScroll(130);
                    } else {
                        throw new IllegalArgumentException("SCROLL_TO_BOTTOM is not supported for this theme.");
                    }
                }
            } else if (!mo52804a((List) null)) {
                mo52817Q();
            } else {
                FocusedViewToTopScrollView focusedViewToTopScrollView2 = (FocusedViewToTopScrollView) mo52872ae();
                if (focusedViewToTopScrollView2 != null) {
                    focusedViewToTopScrollView2.pageScroll(130);
                } else {
                    throw new IllegalArgumentException("SCROLL_DOWN_BY_VISIBLE_HEIGHT is not supported for this theme.");
                }
            }
        } else if (!mo52804a((List) null)) {
            mo52808n(true);
            mo52814N();
            return;
        } else {
            awet a4 = BuyFlowResult.m93847a();
            if (bmmv.f130056b == 6) {
                bmmf = (bmmf) bmmv.f130057c;
            } else {
                bmmf = bmmf.f130003c;
            }
            if ((bmmf.f130005a & 1) != 0) {
                if (bmmv.f130056b == 6) {
                    bmmf2 = (bmmf) bmmv.f130057c;
                } else {
                    bmmf2 = bmmf.f130003c;
                }
                bmag bmag = bmmf2.f130006b;
                if (bmag == null) {
                    bmag = bmag.f128442c;
                }
                if (bmag.f128444a == 2) {
                    bxtx = (bxtx) bmag.f128445b;
                } else {
                    bxtx = bxtx.f164797b;
                }
                a4.mo52084b(bxtx.mo73780k());
            }
            a4.mo52082a(m79728aE());
            a4.mo52083a(this.f94233f.mo73642k());
            this.f95398ak.f110466o = a4.f94248a;
            mo52873af();
        }
        mo52891c(m79730aG());
        m79727aD();
    }

    /* renamed from: a */
    public final void mo52052a(bwef bwef) {
        this.f95368L = 0;
        mo52808n(true);
        blzf blzf = this.f94232e;
        if (blzf != null) {
            bxvd bxvd = (bxvd) blzf.mo74142c(5);
            bxvd.mo73625a((bxvk) blzf);
            blze blze = (blze) bxvd;
            if (blze.f164950c) {
                blze.mo74035c();
                blze.f164950c = false;
            }
            blzf blzf2 = (blzf) blze.f164949b;
            bwef.getClass();
            blzf2.f128347j = bwef;
            blzf2.f128339a |= 64;
            this.f94232e = (blzf) blze.mo74062i();
        }
        if ((bwef.f158971a & 2) != 0) {
            bwee bwee = bwef.f158975e;
            if (bwee == null) {
                bwee = bwee.f158964d;
            }
            mo52866a("", bwee.f158967b);
        }
        List list = this.f94228aS;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((bkca) list.get(i)).mo65831b();
        }
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
    public final void mo52053a(SetUpBiometricAuthenticationKeysRequest setUpBiometricAuthenticationKeysRequest) {
        awou awou = (awou) mo52839Y().f94357a;
        sdo.m34971a(awou.mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        Message.obtain(awou.f94784u, 64, setUpBiometricAuthenticationKeysRequest).sendToTarget();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51911a(Object obj) {
        mo52808n(false);
        if (obj instanceof blxw) {
            mo52900j(2);
            mo52839Y().f94357a.mo52399a((blxw) obj, this.f94233f);
        } else if (obj instanceof blyo) {
            mo52900j(4);
            mo52839Y().f94357a.mo52400a((blyo) obj, this.f94233f, this.f95398ak.f110467p);
        } else if (obj instanceof blyq) {
            mo52900j(3);
            m79721a((blyq) obj);
        } else if (obj == null) {
            mo52034F();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo52054a(byte[] bArr, List list, List list2) {
        bkjt d = mo52833d((List) this.f95385aC);
        int i = 0;
        if (d == null || !m79722a(list, d.mo52837W()) || !d.mo66099m()) {
            axcn L = mo52040L();
            if (L == null || !m79722a(list, L.mo52837W()) || L.mo52775bR()) {
                bkhs M = mo52041M();
                if (M == null || !m79722a(list, M.mo52837W()) || M.f124234a) {
                    mo52895f((blyn) mo52885b(Bundle.EMPTY, bArr, list2));
                    return;
                }
                mo52808n(false);
                M.mo66005u();
                return;
            }
            mo52808n(false);
            if (m79728aE() == 1) {
                awyq I = mo52037I();
                if (I != null) {
                    i = I.f95322t;
                }
                if (bkjm.f124424d.contains(Integer.valueOf(i))) {
                    L.f124430h = true;
                }
            }
            L.f124427e = this;
            L.mo66086w();
            return;
        }
        this.f94240m = bArr;
        if (d.mo66099m()) {
            String m = d.f124451d.mo71937m();
            mo52808n(false);
            ReauthProofTokenRequest reauthProofTokenRequest = new ReauthProofTokenRequest(mo51878cn(), m, 3, this.f94241n);
            mo52900j(6);
            mo52839Y().f94357a.mo52424a(reauthProofTokenRequest);
        }
    }

    /* renamed from: a */
    public final boolean mo52055a(bmne bmne) {
        long j;
        blym blym = (blym) this.f95397aj;
        if ((blym.f128235a & 4194304) != 0) {
            long j2 = bmne.f130093c;
            bwio bwio = blym.f128217A;
            if (bwio == null) {
                bwio = bwio.f159659d;
            }
            if (j2 == bwio.f159662b) {
                bwio bwio2 = ((blym) this.f95397aj).f128217A;
                if (bwio2 == null) {
                    bwio2 = bwio.f159659d;
                }
                bwip bwip = bwio2.f159663c;
                if (bwip == null) {
                    bwip = bwip.f159664e;
                }
                if (!bwip.f159667b) {
                    j = 0;
                } else {
                    j = 1;
                }
                return bjwl.m104786a(bmne, j);
            }
        }
        return super.mo52055a(bmne);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo51912a(PageDetails pageDetails) {
        int a = bmol.m108231a(((blym) pageDetails.f110460i).f128229N);
        if (a == 0) {
            a = 1;
        }
        mo52861a(pageDetails, 4, a);
        return false;
    }
}
