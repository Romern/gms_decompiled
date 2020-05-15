package p000;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.gms.wallet.p088ui.common.PageDetails;
import com.google.android.gms.wallet.p088ui.common.ProgressSpinnerView;
import com.google.android.gms.wallet.p088ui.component.pageheader.PageHeaderView;
import com.google.android.gms.wallet.selector.GenericSelectorResult;
import com.google.android.gms.wallet.selector.InitializeGenericSelectorRootFragment$GenericSelectorPageDetails;
import com.google.android.gms.wallet.service.orchestration.GenericSelectorSubmitRequest;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.p097ui.common.FocusedViewToTopScrollView;
import java.util.List;
import java.util.Locale;

/* renamed from: awot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awot extends awzg implements View.OnClickListener, awzt {

    /* renamed from: l */
    public static final /* synthetic */ int f94751l = 0;

    /* renamed from: a */
    FocusedViewToTopScrollView f94752a;

    /* renamed from: b */
    TextView f94753b;

    /* renamed from: c */
    TextView f94754c;

    /* renamed from: d */
    PageHeaderView f94755d;

    /* renamed from: e */
    awzu f94756e;

    /* renamed from: f */
    bkdx f94757f;

    /* renamed from: g */
    ViewGroup f94758g;

    /* renamed from: h */
    bkbn f94759h;

    /* renamed from: i */
    boolean f94760i;

    /* renamed from: j */
    awos f94761j = new awos(this);

    /* renamed from: k */
    public byte[] f94762k;

    /* renamed from: m */
    private Account f94763m;

    public awot() {
        new bjes(17);
    }

    /* renamed from: B */
    private final void m80480B() {
        if (!awyf.m81495a(getActivity())) {
            mo52874ag();
        } else {
            mo52865a((Runnable) new awop(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final PageDetails mo52038J() {
        return new InitializeGenericSelectorRootFragment$GenericSelectorPageDetails();
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
        this.f95357A = layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_initialize_generic_selector, viewGroup, false);
        FocusedViewToTopScrollView focusedViewToTopScrollView = (FocusedViewToTopScrollView) this.f95357A.findViewById(C0126R.C0129id.content_scroll_view);
        this.f94752a = focusedViewToTopScrollView;
        focusedViewToTopScrollView.setVisibility(8);
        mo52851a((awib) ((ProgressSpinnerView) this.f95357A.findViewById(C0126R.C0129id.progress_spinner_container)));
        this.f94758g = (ViewGroup) this.f95357A.findViewById(C0126R.C0129id.button_container);
        if (chgx.m148712b()) {
            this.f95384aB = (ViewGroup) this.f95357A.findViewById(C0126R.C0129id.bottom_sticky_button_container);
        }
        if (this.f94760i) {
            m80480B();
        } else if (this.f95368L == 1) {
            mo52888b("onInitialLoad");
        }
        return this.f95357A;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51903a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52393a(byte[] bArr) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final awpc mo51913b() {
        return this.f94761j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo51917c() {
        boolean z;
        if (this.f94752a != null) {
            boolean z2 = false;
            if (((Boolean) awja.f94519g.mo58455c()).booleanValue() || bkfr.m105580a(getActivity(), bmap.ENABLE_SCROLL_TO_TOP)) {
                z = true;
            } else {
                z = false;
            }
            if ((((Boolean) awja.f94519g.mo58455c()).booleanValue() || bkfr.m105580a(getActivity(), bmap.ENABLE_SMOOTH_SCROLLING)) && bkfr.m105612e(getActivity())) {
                z2 = true;
            }
            FocusedViewToTopScrollView focusedViewToTopScrollView = this.f94752a;
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
        return (bxxk) bmrb.f130459e.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        super.mo51922f();
        boolean z = this.f124195aJ;
        awzu awzu = this.f94756e;
        if (awzu != null) {
            awzu.mo52808n(z);
        }
        bkdx bkdx = this.f94757f;
        if (bkdx != null) {
            bkdx.mo52808n(z);
        }
        TextView textView = this.f94753b;
        if (textView != null) {
            textView.setEnabled(z);
        }
        TextView textView2 = this.f94754c;
        if (textView2 != null) {
            textView2.setEnabled(z);
        }
        bkbn bkbn = this.f94759h;
        if (bkbn != null) {
            bkbn.mo52710b().setEnabled(z);
        }
        PageHeaderView pageHeaderView = this.f94755d;
        if (pageHeaderView != null) {
            pageHeaderView.setEnabled(z);
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
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo51925l() {
        throw new UnsupportedOperationException("makeResponseContextOnlySubmitRequest() is not supported.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final bxxk mo51926m() {
        return (bxxk) bmrf.f130474i.mo74142c(7);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo51927n() {
        mo52865a((Runnable) new awoq(this));
    }

    public void onClick(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        byte[] bArr;
        bxtx bxtx;
        long j;
        if (view == this.f94759h.mo52710b()) {
            OrchestrationViewEvent.m93825a(getActivity(), this.f95359C, new bjes(1621));
            UserAddress userAddress = null;
            bmes bmes = null;
            if (!mo52804a((List) null)) {
                this.f95363G.mo66055n();
                return;
            }
            awoo a = GenericSelectorResult.m94087a();
            bkdx bkdx = this.f94757f;
            boolean z = false;
            if (bkdx instanceof axag) {
                int a2 = bmre.m108306a(((bmrf) this.f95397aj).f130481f);
                if (a2 != 0 && a2 == 3) {
                    mo52895f((bmrg) mo52885b(Bundle.EMPTY, (byte[]) null, (List) null));
                    return;
                }
                axag axag = (axag) this.f94757f;
                Object obj = axag.f95508d.get(Long.valueOf(axag.f95509e));
                if (obj instanceof bmes) {
                    bmes = (bmes) obj;
                }
                if (bmes != null) {
                    j = bmes.f129013d;
                } else {
                    j = 0;
                }
                PageDetails pageDetails = this.f95398ak;
                GenericSelectorResult genericSelectorResult = a.f94747a;
                genericSelectorResult.f110321c = j;
                if (bmes == null) {
                    z = true;
                }
                genericSelectorResult.f110322d = z;
                bxtx bxtx2 = axag.mo52938l().f129033b;
                GenericSelectorResult genericSelectorResult2 = a.f94747a;
                genericSelectorResult2.f110323e = bxtx2;
                pageDetails.f110466o = genericSelectorResult2;
                mo52873af();
            } else if (bkdx instanceof bkag) {
                bkag bkag = (bkag) bkdx;
                int a3 = bmre.m108306a(((bmrf) this.f95397aj).f130481f);
                if (a3 != 0 && a3 == 3) {
                    if (bkag instanceof awzy) {
                        Long valueOf = Long.valueOf(awzz.m81870a(((awzy) bkag).f95467g));
                        bxwc bxwc = ((bmrf) this.f95397aj).f130478c;
                        int size = bxwc.size();
                        bArr = null;
                        for (int i = 0; i < size; i++) {
                            bmqw bmqw = (bmqw) bxwc.get(i);
                            if (bmqw.f130444a == valueOf.longValue()) {
                                bmag bmag = bmqw.f130445b;
                                if (bmag == null) {
                                    bmag = bmag.f128442c;
                                }
                                if (bmag.f128444a == 2) {
                                    bxtx = (bxtx) bmag.f128445b;
                                } else {
                                    bxtx = bxtx.f164797b;
                                }
                                bArr = bxtx.mo73780k();
                            }
                        }
                    } else {
                        bArr = null;
                    }
                    if (bArr != null) {
                        PageDetails pageDetails2 = this.f95398ak;
                        a.mo52385a(bArr);
                        pageDetails2.f110466o = a.f94747a;
                        mo52873af();
                        return;
                    }
                    mo52895f((bmrg) mo52885b(Bundle.EMPTY, (byte[]) null, (List) null));
                    return;
                }
                bmbs a4 = bkag.mo52928a(Bundle.EMPTY);
                sdo.m34966a(a4, "Address fragment value should not be null.");
                String str5 = this.f94763m.name;
                if (a4 != null) {
                    adda a5 = UserAddress.m66752a();
                    a5.mo33334l(awjn.m80013a(a4.f128616f));
                    a5.mo33331i(str5);
                    if ((a4.f128611a & 8) != 0) {
                        btwp btwp = a4.f128615e;
                        if (btwp == null) {
                            btwp = btwp.f152728s;
                        }
                        btwp btwp2 = a4.f128615e;
                        if (btwp2 == null) {
                            btwp2 = btwp.f152728s;
                        }
                        a5.f61429a.f79129m = !btwp2.f152742m.isEmpty();
                        a5.mo33333k(btwp.f152747r);
                        int size2 = btwp.f152745p.size();
                        String str6 = "";
                        if (size2 > 0) {
                            str = (String) btwp.f152745p.get(0);
                        } else {
                            str = str6;
                        }
                        a5.mo33323a(str);
                        if (size2 >= 2) {
                            str2 = (String) btwp.f152745p.get(1);
                        } else {
                            str2 = str6;
                        }
                        a5.mo33324b(str2);
                        if (size2 >= 3) {
                            str3 = (String) btwp.f152745p.get(2);
                        } else {
                            str3 = str6;
                        }
                        a5.mo33325c(str3);
                        if (size2 >= 4) {
                            str4 = (String) btwp.f152745p.get(3);
                        } else {
                            str4 = str6;
                        }
                        a5.mo33326d(str4);
                        if (size2 >= 5) {
                            str6 = (String) btwp.f152745p.get(4);
                        }
                        a5.mo33327e(str6);
                        a5.mo33330h(btwp.f152731b);
                        a5.mo33332j(btwp.f152736g);
                        a5.mo33328f(btwp.f152734e);
                        a5.mo33335m(btwp.f152740k);
                        a5.mo33336n(btwp.f152741l);
                        a5.mo33329g(btwp.f152746q);
                    }
                    userAddress = a5.f61429a;
                }
                PageDetails pageDetails3 = this.f95398ak;
                GenericSelectorResult genericSelectorResult3 = a.f94747a;
                genericSelectorResult3.f110320b = userAddress;
                pageDetails3.f110466o = genericSelectorResult3;
                mo52873af();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        bmrf bmrf;
        bmkw bmkw;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f94762k = arguments.getByteArray("genericParameters");
        if (bundle == null) {
            if (arguments.containsKey("initializeToken")) {
                this.f94760i = false;
                this.f95368L = 1;
                bmrc bmrc = (bmrc) bjvp.m104730a(arguments, "initializeToken", (bxxk) bmrc.f130465f.mo74142c(7));
                InitializeGenericSelectorRootFragment$GenericSelectorPageDetails initializeGenericSelectorRootFragment$GenericSelectorPageDetails = new InitializeGenericSelectorRootFragment$GenericSelectorPageDetails();
                if (bmrc.f130468b == 5) {
                    bmrf = (bmrf) bmrc.f130469c;
                } else {
                    bmrf = bmrf.f130474i;
                }
                initializeGenericSelectorRootFragment$GenericSelectorPageDetails.f110460i = bmrf;
                Object obj = initializeGenericSelectorRootFragment$GenericSelectorPageDetails.f110460i;
                bmav bmav = null;
                if (obj != null) {
                    bmrf bmrf2 = (bmrf) obj;
                    if ((bmrf2.f130476a & 16) != 0) {
                        bmkw = bmrf2.f130482g;
                        if (bmkw == null) {
                            bmkw = bmkw.f129898c;
                        }
                    } else {
                        bmkw = null;
                    }
                    initializeGenericSelectorRootFragment$GenericSelectorPageDetails.f110463l = bmkw;
                }
                bmaq bmaq = bmrc.f130471e;
                if (bmaq == null) {
                    bmaq = bmaq.f128479l;
                }
                initializeGenericSelectorRootFragment$GenericSelectorPageDetails.f110465n = bmaq;
                if ((bmrc.f130467a & 1) != 0 && (bmav = bmrc.f130470d) == null) {
                    bmav = bmav.f128500h;
                }
                initializeGenericSelectorRootFragment$GenericSelectorPageDetails.f110468q = bmav;
                initializeGenericSelectorRootFragment$GenericSelectorPageDetails.f110454c = bwgz.UNKNOWN_FLOW_INSTRUCTION;
                this.f95399al = initializeGenericSelectorRootFragment$GenericSelectorPageDetails;
            } else {
                this.f94760i = true;
            }
            this.f94763m = this.f95358B.f110418b.f110407b;
            return;
        }
        this.f94760i = bundle.getBoolean("shouldMakeInitializeRequest", false);
        this.f94763m = (Account) bundle.getParcelable("account");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("shouldMakeInitializeRequest", this.f94760i);
        bundle.putParcelable("account", this.f94763m);
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
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo51914b(Object obj) {
        bmrg bmrg = (bmrg) obj;
        bxvd da = bmrh.f130490d.mo74144da();
        bmaj a = awfx.m79878a(this.f95398ak.f110465n.f128483c.mo73780k());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmrh bmrh = (bmrh) da.f164949b;
        a.getClass();
        bmrh.f130493b = a;
        int i = bmrh.f130492a | 1;
        bmrh.f130492a = i;
        if (bmrg != null) {
            bmrg.getClass();
            bmrh.f130494c = bmrg;
            bmrh.f130492a = i | 2;
        }
        bmrh bmrh2 = (bmrh) da.mo74062i();
        awou awou = (awou) mo52839Y().f94357a;
        sdo.m34971a(awou.mo52431f(), (Object) "Must specify connection to OrchestrationService!");
        Message.obtain(awou.f94784u, 63, new GenericSelectorSubmitRequest(awou.f94765b, bmrh2)).sendToTarget();
        return bmrh2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final PageDetails mo52043a(Intent intent) {
        byte[] byteArray = intent.getBundleExtra("webViewComponentCallbackData").getByteArray("EventListener.EXTRA_WEBVIEW_COMPONENT_COMPLETE_WITH_CALLBACK_DATA");
        InitializeGenericSelectorRootFragment$GenericSelectorPageDetails initializeGenericSelectorRootFragment$GenericSelectorPageDetails = new InitializeGenericSelectorRootFragment$GenericSelectorPageDetails();
        initializeGenericSelectorRootFragment$GenericSelectorPageDetails.f110454c = bwgz.COMPLETE_FLOW_IMMEDIATELY;
        awoo a = GenericSelectorResult.m94087a();
        a.mo52385a(byteArray);
        initializeGenericSelectorRootFragment$GenericSelectorPageDetails.f110466o = a.f94747a;
        return initializeGenericSelectorRootFragment$GenericSelectorPageDetails;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo51902a(Bundle bundle, byte[] bArr, List list) {
        bxvd da = bmrg.f130485d.mo74144da();
        bkdx bkdx = this.f94757f;
        if (bkdx instanceof axag) {
            bmeu l = ((axag) bkdx).mo52938l();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmrg bmrg = (bmrg) da.f164949b;
            l.getClass();
            bmrg.f130489c = l;
            bmrg.f130487a |= 2;
        } else if (bkdx instanceof bkag) {
            bmbs a = ((bkag) bkdx).mo52928a(bundle);
            sdo.m34966a(a, "Address fragment value should not be null.");
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmrg bmrg2 = (bmrg) da.f164949b;
            a.getClass();
            bmrg2.f130488b = a;
            bmrg2.f130487a |= 1;
        }
        return (bmrg) da.mo74062i();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzk.a(bmdb, android.view.ViewGroup, boolean):bkbn
     arg types: [bmdb, android.view.ViewGroup, int]
     candidates:
      awot.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View
      awot.a(android.os.Bundle, byte[], java.util.List):java.lang.Object
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
    /* renamed from: b */
    public final void mo51916b(boolean z) {
        bmbd bmbd;
        bmqx bmqx;
        if (chgx.m148712b()) {
            mo52892d(z);
        } else {
            this.f95363G.mo66040d();
            this.f95363G.mo66037b(false);
            this.f95386aD.clear();
        }
        this.f94758g.removeAllViews();
        bmdb bmdb = ((bmrf) this.f95397aj).f130480e;
        if (bmdb == null) {
            bmdb = bmdb.f128767k;
        }
        bkbn a = mo52845a(bmdb, this.f94758g, false);
        this.f94759h = a;
        a.mo52710b().setEnabled(bmdb.f128771c);
        this.f94759h.mo52710b().setVisibility(0);
        this.f94759h.mo52710b().setOnClickListener(this);
        this.f94755d = (PageHeaderView) this.f95357A.findViewById(C0126R.C0129id.page_header_view);
        bmrf bmrf = (bmrf) this.f95397aj;
        if ((bmrf.f130476a & 32) != 0) {
            PageHeaderView pageHeaderView = this.f94755d;
            pageHeaderView.f110581a = this;
            bmjt bmjt = bmrf.f130483h;
            if (bmjt == null) {
                bmjt = bmjt.f129732k;
            }
            pageHeaderView.mo60127a(bmjt);
        }
        bmrf bmrf2 = (bmrf) this.f95397aj;
        int i = bmrf2.f130476a;
        if ((i & 1) != 0) {
            if ((i & 32) == 0) {
                bmbr bmbr = bmrf2.f130477b;
                if (bmbr == null) {
                    bmbr = bmbr.f128572L;
                }
                if (!bmbr.f128589f.isEmpty()) {
                    bmbr bmbr2 = ((bmrf) this.f95397aj).f130477b;
                    if (bmbr2 == null) {
                        bmbr2 = bmbr.f128572L;
                    }
                    this.f95373Q = bmbr2.f128589f;
                }
            }
            bmra bmra = (bmra) bjvp.m104733a(this.f94762k, (bxxk) bmra.f130453e.mo74142c(7));
            int a2 = bmre.m108306a(((bmrf) this.f95397aj).f130481f);
            if (a2 == 0 || a2 != 3) {
                TextView textView = (TextView) this.f95357A.findViewById(C0126R.C0129id.share_address_text);
                this.f94753b = textView;
                textView.setVisibility(0);
                if (bmra.f130456b == 5) {
                    TextView textView2 = (TextView) this.f95357A.findViewById(C0126R.C0129id.app_name_text);
                    this.f94754c = textView2;
                    if (bmra.f130456b == 5) {
                        bmqx = (bmqx) bmra.f130457c;
                    } else {
                        bmqx = bmqx.f130447d;
                    }
                    textView2.setText(bmqx.f130451c);
                    this.f94754c.setVisibility(0);
                }
            }
            this.f94756e = (awzu) getChildFragmentManager().findFragmentByTag("AccountSelectorFragment");
            if (this.f95358B.f110418b.f110409d) {
                Activity activity = getActivity();
                bmba bmba = (bmba) bmbd.f128525j.mo74144da();
                awec.m79679a();
                Account[] a3 = awec.m79681a(activity);
                int length = a3.length;
                for (int i2 = 0; i2 < length; i2++) {
                    bmba.mo66777a(awia.m79970a(a3[i2], i2));
                }
                bmbd = (bmbd) bmba.mo74062i();
            } else {
                bmbd = null;
            }
            int i3 = 1;
            if (bmbd != null && bmbd.f128531e.size() > 1) {
                if (this.f94756e == null) {
                    this.f94756e = awzu.m81821a(bmbd, mo51878cn(), this.f123961aF, this.f95359C, this.f123964aI);
                    getChildFragmentManager().beginTransaction().replace(C0126R.C0129id.account_selector_fragment_holder, this.f94756e, "AccountSelectorFragment").commit();
                }
                awzu awzu = this.f94756e;
                awzu.f95447e = this;
                this.f95363G.mo66032a(awzu);
            }
            bkag bkag = (bkag) getChildFragmentManager().findFragmentByTag("SelectorFragment");
            this.f94757f = bkag;
            if (bkag == null) {
                bmbr bmbr3 = ((bmrf) this.f95397aj).f130477b;
                if (bmbr3 == null) {
                    bmbr3 = bmbr.f128572L;
                }
                int a4 = bmbk.m107867a(bmbr3.f128599p);
                if (a4 == 0) {
                    a4 = 1;
                }
                int i4 = a4 - 1;
                if (i4 == 1) {
                    bmbr bmbr4 = ((bmrf) this.f95397aj).f130477b;
                    if (bmbr4 == null) {
                        bmbr4 = bmbr.f128572L;
                    }
                    this.f94757f = bjzo.m105001a(bmbr4, this.f123961aF, this.f123964aI);
                } else if (i4 != 2) {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[1];
                    bmbr bmbr5 = ((bmrf) this.f95397aj).f130477b;
                    if (bmbr5 == null) {
                        bmbr5 = bmbr.f128572L;
                    }
                    int a5 = bmbk.m107867a(bmbr5.f128599p);
                    if (a5 != 0) {
                        i3 = a5;
                    }
                    objArr[0] = Integer.valueOf(i3 - 1);
                    throw new IllegalStateException(String.format(locale, "Unknown address form display type: %s", objArr));
                } else {
                    bmbr bmbr6 = ((bmrf) this.f95397aj).f130477b;
                    if (bmbr6 == null) {
                        bmbr6 = bmbr.f128572L;
                    }
                    if (bmbr6.f128592i.size() == 0) {
                        bmbr bmbr7 = ((bmrf) this.f95397aj).f130477b;
                        if (bmbr7 == null) {
                            bmbr7 = bmbr.f128572L;
                        }
                        if ((bmbr7.f128584a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                            mo52897g(555);
                            return;
                        }
                    }
                    bmbr bmbr8 = ((bmrf) this.f95397aj).f130477b;
                    if (bmbr8 == null) {
                        bmbr8 = bmbr.f128572L;
                    }
                    this.f94757f = awzy.m81847a(bmbr8, this.f123961aF, this.f95359C, this.f123964aI);
                }
                getChildFragmentManager().beginTransaction().replace(C0126R.C0129id.selector_fragment_holder, this.f94757f, "SelectorFragment").commit();
            }
            this.f95363G.mo66032a(this.f94757f);
            this.f95385aC.add(new bkde(this.f94757f));
            this.f95386aD.add(this.f94757f);
            this.f95363G.mo66025a(3);
        } else if ((i & 2) != 0) {
            bmet bmet = bmrf2.f130479d;
            if (bmet == null) {
                bmet = bmet.f129017l;
            }
            if (bmet.f129024f.size() == 0) {
                bmet bmet2 = ((bmrf) this.f95397aj).f130479d;
                if (bmet2 == null) {
                    bmet2 = bmet.f129017l;
                }
                if (bmet2.f129027i.isEmpty()) {
                    mo52897g(-1);
                    return;
                }
            }
            bmrf bmrf3 = (bmrf) this.f95397aj;
            if ((bmrf3.f130476a & 32) == 0) {
                bmet bmet3 = bmrf3.f130479d;
                if (bmet3 == null) {
                    bmet3 = bmet.f129017l;
                }
                this.f95373Q = bmet3.f129022d;
            }
            axag axag = (axag) getChildFragmentManager().findFragmentByTag("SelectorFragment");
            this.f94757f = axag;
            if (axag == null) {
                bmet bmet4 = ((bmrf) this.f95397aj).f130479d;
                if (bmet4 == null) {
                    bmet4 = bmet.f129017l;
                }
                this.f94757f = axag.m81905a(bmet4, this.f123961aF, this.f123964aI);
                getChildFragmentManager().beginTransaction().replace(C0126R.C0129id.selector_fragment_holder, this.f94757f, "SelectorFragment").commit();
            }
            this.f95363G.mo66032a(this.f94757f);
            this.f95385aC.add(new bkde(this.f94757f));
            this.f95386aD.add(this.f94757f);
        }
    }

    /* renamed from: a */
    public final void mo51904a(int i) {
        super.mo51904a(i);
        this.f94752a.setVisibility(0);
        if (chgx.m148712b() && this.f95384aB.getChildCount() > 0) {
            this.f95384aB.setVisibility(0);
        }
        if (i != 1) {
            this.f95363G.mo66047g(true);
            return;
        }
        FocusedViewToTopScrollView focusedViewToTopScrollView = this.f94752a;
        if (focusedViewToTopScrollView != null) {
            focusedViewToTopScrollView.f151970r = false;
            focusedViewToTopScrollView.mo71903a(false);
        }
        this.f95363G.mo66047g(false);
        mo52881an().postDelayed(awgc.m79888a(this, "scrollToTop"), 1000);
    }

    /* renamed from: a */
    public final void mo52046a(Account account) {
        if (!sdg.m34949a(account, this.f94763m)) {
            this.f94763m = account;
            this.f95397aj = null;
            mo52875ah();
            mo52840Z();
            mo52878ak();
            this.f94761j = new awos(this);
            awxz a = ApplicationParameters.m94174a(this.f95358B.f110418b);
            a.mo52739a(this.f94763m);
            ApplicationParameters applicationParameters = a.f95270a;
            awyb a2 = BuyFlowConfig.m94176a(this.f95358B);
            a2.mo52749a(applicationParameters);
            this.f95358B = a2.mo52748a();
            mo52876ai();
            if (this.f94757f != null) {
                getChildFragmentManager().beginTransaction().remove(this.f94757f).commit();
                this.f95363G.mo66036b(this.f94757f);
                this.f94757f = null;
                this.f95385aC.clear();
                this.f95386aD.clear();
            }
            m80480B();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51908a(bmaf bmaf) {
        throw new UnsupportedOperationException("Refreshes are not supported.");
    }

    /* renamed from: a */
    public final void mo52392a(bmaq bmaq, bwgz bwgz, bmrf bmrf, bmav bmav, GenericSelectorResult genericSelectorResult, String str, boolean z) {
        bmkw bmkw;
        mo52853a(bmav, bmaq);
        InitializeGenericSelectorRootFragment$GenericSelectorPageDetails initializeGenericSelectorRootFragment$GenericSelectorPageDetails = new InitializeGenericSelectorRootFragment$GenericSelectorPageDetails();
        initializeGenericSelectorRootFragment$GenericSelectorPageDetails.f110460i = bmrf;
        Object obj = initializeGenericSelectorRootFragment$GenericSelectorPageDetails.f110460i;
        if (obj != null) {
            bmrf bmrf2 = (bmrf) obj;
            if ((bmrf2.f130476a & 16) != 0) {
                bmkw = bmrf2.f130482g;
                if (bmkw == null) {
                    bmkw = bmkw.f129898c;
                }
            } else {
                bmkw = null;
            }
            initializeGenericSelectorRootFragment$GenericSelectorPageDetails.f110463l = bmkw;
        }
        initializeGenericSelectorRootFragment$GenericSelectorPageDetails.f110465n = bmaq;
        initializeGenericSelectorRootFragment$GenericSelectorPageDetails.f110466o = genericSelectorResult;
        initializeGenericSelectorRootFragment$GenericSelectorPageDetails.f110468q = bmav;
        initializeGenericSelectorRootFragment$GenericSelectorPageDetails.f110454c = bwgz;
        initializeGenericSelectorRootFragment$GenericSelectorPageDetails.f110464m = this.f95398ak.f110464m;
        mo52364a(initializeGenericSelectorRootFragment$GenericSelectorPageDetails, z, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51911a(Object obj) {
        mo51927n();
    }
}
