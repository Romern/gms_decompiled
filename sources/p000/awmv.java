package p000;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.gms.wallet.p082im.ImRootChimeraActivity;
import com.google.android.gms.wallet.p082im.ImRootFragment$InstrumentManagerPageDetails;
import com.google.android.gms.wallet.p082im.InstrumentManagerExtras;
import com.google.android.gms.wallet.p082im.InstrumentManagerResult;
import com.google.android.gms.wallet.p088ui.common.PageDetails;
import com.google.android.gms.wallet.p088ui.component.pageheader.PageHeaderView;
import com.google.android.wallet.p097ui.common.FocusedViewToTopScrollView;
import com.google.android.wallet.p097ui.common.FormHeaderView;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.List;

/* renamed from: awmv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class awmv extends awzg implements View.OnClickListener, bkio, bjwt {

    /* renamed from: p */
    public static final /* synthetic */ int f94636p = 0;

    /* renamed from: a */
    Button f94637a;

    /* renamed from: b */
    InfoMessageView f94638b;

    /* renamed from: c */
    FormHeaderView f94639c;

    /* renamed from: d */
    PageHeaderView f94640d;

    /* renamed from: e */
    FrameLayout f94641e;

    /* renamed from: f */
    FrameLayout f94642f;

    /* renamed from: g */
    awzs f94643g;

    /* renamed from: h */
    public bkdx f94644h;

    /* renamed from: i */
    bkig f94645i;

    /* renamed from: j */
    protected boolean f94646j;

    /* renamed from: k */
    public byte[] f94647k;

    /* renamed from: l */
    boolean f94648l;

    /* renamed from: m */
    protected boolean f94649m = true;

    /* renamed from: n */
    protected boolean f94650n = true;

    /* renamed from: o */
    public final awpc f94651o = new awmt(this);

    /* renamed from: q */
    private boolean f94652q;

    public awmv() {
        new bjes(1620);
    }

    /* renamed from: a */
    private final void m80222a(Button button) {
        button.setTextColor(bkfr.m105600c(this.f123962aG));
    }

    /* renamed from: c */
    private final void m80223c(boolean z) {
        int i = z ? this.f95377U : 0;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f94641e.getLayoutParams();
        C1260oz.m19821a(marginLayoutParams, i);
        C1260oz.m19823b(marginLayoutParams, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final awpc mo51913b() {
        return this.f94651o;
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final bxxk mo51921e() {
        return (bxxk) bmsb.f130640e.mo74142c(7);
    }

    /* renamed from: f */
    public void mo51922f() {
        super.mo51922f();
        boolean z = this.f124195aJ;
        InfoMessageView infoMessageView = this.f94638b;
        if (infoMessageView != null) {
            infoMessageView.setEnabled(z);
        }
        Button button = this.f94637a;
        if (button != null) {
            button.setEnabled(z);
        }
        awzs awzs = this.f94643g;
        if (awzs != null) {
            awzs.mo52808n(z);
        }
        bkdx bkdx = this.f94644h;
        if (bkdx != null) {
            bkdx.mo52808n(z);
        }
        FormHeaderView formHeaderView = this.f94639c;
        if (formHeaderView != null) {
            formHeaderView.setEnabled(z);
        }
        PageHeaderView pageHeaderView = this.f94640d;
        if (pageHeaderView != null) {
            pageHeaderView.setEnabled(z);
        }
        bkig bkig = this.f94645i;
        if (bkig != null) {
            bkig.mo52808n(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final List mo51923g() {
        Object obj = this.f95397aj;
        if (obj != null) {
            return ((bmrx) obj).f130610l;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final bmlz mo51924h() {
        Object obj = this.f95397aj;
        if (obj == null) {
            return null;
        }
        bmrx bmrx = (bmrx) obj;
        if ((bmrx.f130599a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) == 0) {
            return null;
        }
        bmlz bmlz = bmrx.f130614p;
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
        return (bxxk) bmrx.f130597t.mo74142c(7);
    }

    /* renamed from: n */
    public final void mo51927n() {
        bkbn bkbn;
        bkfr.m105559a(this.f123962aG.getApplicationContext(), this.f95357A);
        int size = this.f95402ao.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bkbn = null;
                break;
            }
            bkbn = (bkbn) this.f95402ao.get(i);
            if (bkbn.mo52710b().getVisibility() == 0) {
                break;
            }
            i++;
        }
        if (bkbn != null) {
            bkbn.mo52710b().requestFocus();
        }
    }

    public void onClick(View view) {
        if (view == this.f94637a) {
            mo52065d(6);
        } else if (mo52870ac()) {
            mo52873af();
        } else if (!mo52804a((List) null)) {
            this.f95363G.mo66055n();
        } else {
            this.f95363G.mo66041d(true);
            mo52294a(Bundle.EMPTY, (byte[]) null);
            bkfr.m105559a(getActivity(), this.f95357A);
        }
    }

    public final void onCreate(Bundle bundle) {
        bmav bmav;
        boolean z;
        int i;
        bmkw bmkw;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f94646j = arguments.getBoolean("isDialog");
        this.f94652q = arguments.getBoolean("showCancelButton");
        this.f94649m = arguments.getBoolean("showTitleInHeader", true);
        this.f94650n = arguments.getBoolean("showHeaderSeparator", true);
        if (bundle == null) {
            if (!this.f95371O) {
                if (arguments.containsKey("actionToken")) {
                    bmsf bmsf = (bmsf) bjvp.m104730a(arguments, "actionToken", (bxxk) bmsf.f130661f.mo74142c(7));
                    bmrv bmrv = bmsf.f130665c;
                    if (bmrv == null) {
                        bmrv = bmrv.f130586g;
                    }
                    bmrw bmrw = bmsf.f130664b;
                    if (bmrw == null) {
                        bmrw = bmrw.f130595a;
                    }
                    InstrumentManagerExtras instrumentManagerExtras = new InstrumentManagerExtras(bmrw);
                    ImRootFragment$InstrumentManagerPageDetails imRootFragment$InstrumentManagerPageDetails = new ImRootFragment$InstrumentManagerPageDetails();
                    bmar bmar = null;
                    if ((bmrv.f130588a & 8) != 0) {
                        bmrx bmrx = bmrv.f130592e;
                        if (bmrx == null) {
                            bmrx = bmrx.f130597t;
                        }
                        imRootFragment$InstrumentManagerPageDetails.f110460i = bmrx;
                        bmrx bmrx2 = bmrv.f130592e;
                        if (bmrx2 == null) {
                            bmrx2 = bmrx.f130597t;
                        }
                        if ((bmrx2.f130599a & 2097152) != 0) {
                            bmrx bmrx3 = bmrv.f130592e;
                            if (bmrx3 == null) {
                                bmrx3 = bmrx.f130597t;
                            }
                            bmkw = bmrx3.f130615q;
                            if (bmkw == null) {
                                bmkw = bmkw.f129898c;
                            }
                        } else {
                            bmkw = null;
                        }
                        imRootFragment$InstrumentManagerPageDetails.f110463l = bmkw;
                    }
                    bmaq bmaq = bmrv.f130590c;
                    if (bmaq == null) {
                        bmaq = bmaq.f128479l;
                    }
                    imRootFragment$InstrumentManagerPageDetails.f110465n = bmaq;
                    if ((bmrv.f130588a & 1) != 0) {
                        bmav = bmrv.f130589b;
                        if (bmav == null) {
                            bmav = bmav.f128500h;
                        }
                    } else {
                        bmav = null;
                    }
                    imRootFragment$InstrumentManagerPageDetails.f110468q = bmav;
                    bwgz a = bwgz.m121952a(bmrv.f130593f);
                    if (a == null) {
                        a = bwgz.UNKNOWN_FLOW_INSTRUCTION;
                    }
                    imRootFragment$InstrumentManagerPageDetails.f110454c = a;
                    if ((bmrv.f130588a & 4) != 0 && (bmar = bmrv.f130591d) == null) {
                        bmar = bmar.f128490c;
                    }
                    imRootFragment$InstrumentManagerPageDetails.f110467p = bmar;
                    imRootFragment$InstrumentManagerPageDetails.f110466o = InstrumentManagerResult.f110253a;
                    imRootFragment$InstrumentManagerPageDetails.f110464m = instrumentManagerExtras;
                    if ((bmrv.f130588a & 8) != 0) {
                        bmrx bmrx4 = bmrv.f130592e;
                        if (bmrx4 == null) {
                            bmrx4 = bmrx.f130597t;
                        }
                        if (bmrx4.f130611m || bmrx4.f130612n > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        imRootFragment$InstrumentManagerPageDetails.f110452a = z;
                        imRootFragment$InstrumentManagerPageDetails.f110459h = bmrx4.f130612n;
                        if ((bmrx4.f130599a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0) {
                            i = bmqm.m108288a(bmrx4.f130613o);
                            if (i == 0) {
                                i = 1;
                            }
                        } else {
                            i = imRootFragment$InstrumentManagerPageDetails.f110469r;
                        }
                        imRootFragment$InstrumentManagerPageDetails.f110469r = i;
                    }
                    this.f95399al = imRootFragment$InstrumentManagerPageDetails;
                    this.f94648l = false;
                } else {
                    this.f94647k = arguments.getByteArray("instrumentManagerParams");
                    this.f94648l = true;
                }
            }
            this.f95368L = 1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public int mo52299x() {
        return this.f94646j ? !ImRootChimeraActivity.m94010a(this.f95358B) ? C0126R.C0128layout.wallet_fragment_instrument_manager_dialog : C0126R.C0128layout.wallet_fragment_instrument_manager_dialog_gm2 : C0126R.C0128layout.wallet_fragment_instrument_manager;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo52300z() {
        PageHeaderView pageHeaderView = (PageHeaderView) this.f95357A.findViewById(C0126R.C0129id.page_header_view);
        this.f94640d = pageHeaderView;
        pageHeaderView.f110581a = this;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f95357A = layoutInflater.inflate(mo52299x(), viewGroup, false);
        mo52851a((awib) getActivity());
        this.f94639c = (FormHeaderView) this.f95357A.findViewById(C0126R.C0129id.instrument_activation_form_header);
        this.f94641e = (FrameLayout) this.f95357A.findViewById(C0126R.C0129id.fragment_holder);
        this.f94642f = (FrameLayout) this.f95357A.findViewById(C0126R.C0129id.encryption_fragment_holder);
        mo52300z();
        this.f94644h = (bkdx) getChildFragmentManager().findFragmentById(C0126R.C0129id.fragment_holder);
        this.f94645i = (bkig) getChildFragmentManager().findFragmentById(C0126R.C0129id.encryption_fragment_holder);
        FocusedViewToTopScrollView focusedViewToTopScrollView = (FocusedViewToTopScrollView) mo52872ae();
        if (focusedViewToTopScrollView != null) {
            focusedViewToTopScrollView.f151920p = this;
        }
        if (this.f94648l) {
            mo52865a((Runnable) new awms(this));
        } else if (this.f95368L == 1) {
            mo52888b("onInitialLoad");
        }
        return this.f95357A;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo51914b(Object obj) {
        bmry bmry = (bmry) obj;
        bxvd da = bmsb.f130640e.mo74144da();
        Parcelable parcelable = this.f95398ak.f110464m;
        if (parcelable instanceof InstrumentManagerExtras) {
            bmrw bmrw = ((InstrumentManagerExtras) parcelable).f110252a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmsb bmsb = (bmsb) da.f164949b;
            bmrw.getClass();
            bmsb.f130644c = bmrw;
            bmsb.f130642a |= 2;
        }
        bmaj a = awfx.m79878a(this.f95398ak.f110465n.f128483c.mo73780k());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmsb bmsb2 = (bmsb) da.f164949b;
        a.getClass();
        bmsb2.f130643b = a;
        bmsb2.f130642a |= 1;
        if (bmry == null) {
            bmry = bmry.f130619f;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmsb bmsb3 = (bmsb) da.f164949b;
        bmry.getClass();
        bmsb3.f130645d = bmry;
        bmsb3.f130642a |= 4;
        mo52839Y().f94357a.mo52405a((bmsb) da.mo74062i(), this.f95398ak.f110467p);
        return da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo51917c() {
        boolean z;
        boolean z2 = false;
        if (((Boolean) awja.f94518f.mo58455c()).booleanValue() || bkfr.m105580a(getActivity(), bmap.ENABLE_SCROLL_TO_TOP)) {
            z = true;
        } else {
            z = false;
        }
        if ((((Boolean) awja.f94518f.mo58455c()).booleanValue() || bkfr.m105580a(getActivity(), bmap.ENABLE_SMOOTH_SCROLLING)) && bkfr.m105612e(getActivity())) {
            z2 = true;
        }
        FocusedViewToTopScrollView focusedViewToTopScrollView = (FocusedViewToTopScrollView) mo52872ae();
        if (focusedViewToTopScrollView != null) {
            focusedViewToTopScrollView.f151970r = z;
            focusedViewToTopScrollView.mo71903a(z2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ PageDetails mo52043a(Intent intent) {
        byte[] byteArray = intent.getBundleExtra("webViewComponentCallbackData").getByteArray("EventListener.EXTRA_WEBVIEW_COMPONENT_COMPLETE_WITH_CALLBACK_DATA");
        ImRootFragment$InstrumentManagerPageDetails imRootFragment$InstrumentManagerPageDetails = new ImRootFragment$InstrumentManagerPageDetails();
        imRootFragment$InstrumentManagerPageDetails.f110454c = bwgz.COMPLETE_FLOW_IMMEDIATELY;
        awmy a = InstrumentManagerResult.m94021a();
        a.mo52305a(byteArray);
        imRootFragment$InstrumentManagerPageDetails.f110466o = a.f94653a;
        return imRootFragment$InstrumentManagerPageDetails;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo51902a(Bundle bundle, byte[] bArr, List list) {
        bmfs bmfs;
        bxvd da = bmry.f130619f.mo74144da();
        if (awia.m79991a(this.f94644h)) {
            bmfv a = awia.m79972a(this.f94644h, bundle);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmry bmry = (bmry) da.f164949b;
            a.getClass();
            bmry.f130623c = a;
            bmry.f130622b = 2;
        } else {
            bkdx bkdx = this.f94644h;
            if (bkdx instanceof axae) {
                bmer l = ((axae) bkdx).mo52936l();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmry bmry2 = (bmry) da.f164949b;
                l.getClass();
                bmry2.f130623c = l;
                bmry2.f130622b = 1;
            } else if (bkdx instanceof axbf) {
                bmif m = ((axbf) bkdx).mo52980m();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmry bmry3 = (bmry) da.f164949b;
                m.getClass();
                bmry3.f130623c = m;
                bmry3.f130622b = 3;
            } else if ((bkdx instanceof bkan) || (bkdx instanceof bkaq) || (bkdx instanceof bkiu) || (bkdx instanceof bkam)) {
                bmrx bmrx = (bmrx) this.f95397aj;
                if (bmrx.f130600b == 21) {
                    bmfs = (bmfs) bmrx.f130601c;
                } else {
                    bmfs = bmfs.f129155e;
                }
                bmft a2 = bjvh.m104697a(bkdx, bmfs);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmry bmry4 = (bmry) da.f164949b;
                a2.getClass();
                bmry4.f130623c = a2;
                bmry4.f130622b = 7;
            }
        }
        if (bArr != null) {
            bxtx a3 = bxtx.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmry bmry5 = (bmry) da.f164949b;
            a3.getClass();
            bmry5.f130621a |= 32;
            bmry5.f130624d = a3;
        }
        bkig bkig = this.f94645i;
        if (bkig != null) {
            bmdk m2 = bkig.mo66019m();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmry bmry6 = (bmry) da.f164949b;
            m2.getClass();
            bmry6.f130625e = m2;
            bmry6.f130621a |= 64;
        }
        return (bmry) da.mo74062i();
    }

    /* renamed from: b */
    public final void mo52058b(Intent intent) {
        bkdx bkdx = this.f94644h;
        if (bkdx instanceof bjwt) {
            ((bjwt) bkdx).mo52058b(intent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo51916b(boolean z) {
        String str;
        String str2;
        boolean z2;
        bmfs bmfs;
        bmfs bmfs2;
        boolean z3;
        Button button;
        this.f95363G.mo66040d();
        this.f95363G.mo66037b(false);
        this.f95386aD.clear();
        this.f95363G.mo66029a((bkio) this);
        this.f95402ao.clear();
        if (this.f94646j) {
            sdo.m34975b(((bmrx) this.f95397aj).f130605g.size() == 1, "Dialog pages must contain exactly one button.");
            bkbn bkbn = (bkbn) this.f95357A.findViewById(C0126R.C0129id.submit_button);
            bkbn.mo52707a((bmdb) ((bmrx) this.f95397aj).f130605g.get(0));
            bkbn.mo52710b().setOnClickListener(this);
            bkbn.mo65787a(mo65980at());
            m80222a(bkbn.mo52703a());
            this.f95402ao.add(bkbn);
            Button button2 = (Button) this.f95357A.findViewById(C0126R.C0129id.cancel_button);
            this.f94637a = button2;
            m80222a(button2);
        } else {
            ViewGroup viewGroup = (ViewGroup) getActivity().findViewById(C0126R.C0129id.sticky_button_container);
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.setVisibility(8);
            }
            ViewGroup viewGroup2 = (ViewGroup) getActivity().findViewById(C0126R.C0129id.im_button_container);
            if (viewGroup2 != null) {
                viewGroup2.removeAllViews();
                viewGroup2.setVisibility(8);
            }
            ViewGroup viewGroup3 = ((bmrx) this.f95397aj).f130606h ? (ViewGroup) getActivity().findViewById(C0126R.C0129id.sticky_button_container) : (ViewGroup) this.f95357A.findViewById(C0126R.C0129id.im_button_container);
            mo52295a(viewGroup3);
            if (this.f95358B.f110418b.f110412g == 1 && viewGroup3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup3.getLayoutParams();
                C1260oz.m19821a(marginLayoutParams, 0);
                C1260oz.m19823b(marginLayoutParams, 0);
                C1280ps.m19885a(viewGroup3, 0, 0, 0, 0);
                if (!((bmrx) this.f95397aj).f130606h) {
                    this.f95357A.findViewById(C0126R.C0129id.button_spacer).setVisibility(0);
                }
            }
        }
        if (this.f94652q && (button = this.f94637a) != null) {
            button.setVisibility(0);
            this.f94637a.setOnClickListener(this);
        }
        InfoMessageView infoMessageView = (InfoMessageView) this.f95357A.findViewById(C0126R.C0129id.top_info_message);
        this.f94638b = infoMessageView;
        bmnr bmnr = ((bmrx) this.f95397aj).f130604f;
        if (bmnr == null) {
            bmnr = bmnr.f130153o;
        }
        infoMessageView.mo72006b(bmnr);
        if ((((bmrx) this.f95397aj).f130599a & 4194304) == 0 || !((Boolean) awis.f94491b.mo58455c()).booleanValue()) {
            if (this.f94643g != null) {
                getChildFragmentManager().beginTransaction().remove(this.f94643g).commit();
                this.f94643g = null;
            }
            this.f95357A.findViewById(C0126R.C0129id.brand_divider).setVisibility(8);
        } else {
            bmeb bmeb = ((bmrx) this.f95397aj).f130616r;
            if (bmeb == null) {
                bmeb = bmeb.f128902g;
            }
            this.f94643g = awzs.m81798a(bmeb, this.f123961aF, this.f95359C, mo65980at());
            getChildFragmentManager().beginTransaction().replace(C0126R.C0129id.brand_fragment_holder, this.f94643g).commit();
            this.f95357A.findViewById(C0126R.C0129id.brand_divider).setVisibility(0);
        }
        awib awib = this.f95361E;
        if (awib != null) {
            bmoc bmoc = ((bmrx) this.f95397aj).f130607i;
            if (bmoc == null) {
                bmoc = bmoc.f130208e;
            }
            if (this.f95368L == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            awib.mo51867a(bmoc, z3);
        }
        bmrx bmrx = (bmrx) this.f95397aj;
        if ((bmrx.f130599a & 1024) != 0) {
            str = bmrx.f130608j;
        } else {
            str = null;
        }
        mo52891c(str);
        bmrx bmrx2 = (bmrx) this.f95397aj;
        if ((bmrx2.f130599a & 2048) != 0) {
            str2 = bmrx2.f130609k;
        } else {
            str2 = null;
        }
        this.f95372P = str2;
        bmjt bmjt = bmrx2.f130603e;
        if (bmjt == null) {
            bmjt = bmjt.f129732k;
        }
        if ((((bmrx) this.f95397aj).f130599a & 2) == 0) {
            bxvd da = bmjt.f129732k.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmjt bmjt2 = (bmjt) da.f164949b;
            int i = bmjt2.f129734a | 1;
            bmjt2.f129734a = i;
            bmjt2.f129735b = 0;
            String str3 = ((bmrx) this.f95397aj).f130602d;
            str3.getClass();
            int i2 = i | 8;
            bmjt2.f129734a = i2;
            bmjt2.f129738e = str3;
            bmjt2.f129736c = 1;
            bmjt2.f129734a = i2 | 2;
            bmjt = (bmjt) da.mo74062i();
        }
        this.f94640d.mo60128a(bmjt, this.f94649m, this.f94650n);
        this.f95385aC.clear();
        FormHeaderView formHeaderView = this.f94639c;
        if (formHeaderView != null) {
            formHeaderView.setVisibility(8);
        }
        int i3 = ((bmrx) this.f95397aj).f130600b;
        if (i3 == 2) {
            z2 = true;
        } else {
            z2 = i3 == 3 || i3 == 1 || i3 == 21;
        }
        if (this.f94646j && z2) {
            throw new IllegalArgumentException("This theme does not support forms.");
        }
        bkdx bkdx = (bkdx) getChildFragmentManager().findFragmentById(C0126R.C0129id.fragment_holder);
        this.f94644h = bkdx;
        if (z2) {
            if (bkdx == null || z) {
                bmrx bmrx3 = (bmrx) this.f95397aj;
                int i4 = bmrx3.f130600b;
                if (i4 == 2) {
                    this.f94644h = awia.m79969a((bmfu) bmrx3.f130601c, this.f123961aF, bmrx3.f130602d, this.f95359C, bpis.FLOW_TYPE_INSTRUMENT_MANAGER, mo65980at(), this.f95358B);
                    m80223c(true);
                } else if (i4 == 3) {
                    this.f94644h = axbf.m82146a((bmie) bmrx3.f130601c, this.f123961aF, mo65980at());
                    OrchestrationViewEvent.m93828c(this.f123962aG.getApplicationContext(), this.f95359C, this.f94644h.mo51919co());
                    m80223c(true);
                } else if (i4 == 1) {
                    this.f94644h = axae.m81889a((bmeq) bmrx3.f130601c, this.f123961aF, this.f95359C, bpis.FLOW_TYPE_INSTRUMENT_MANAGER, mo65980at());
                    m80223c(true);
                } else if (i4 == 21) {
                    if ((((bmfs) bmrx3.f130601c).f129157a & 1) != 0) {
                        this.f94639c.setVisibility(0);
                        FormHeaderView formHeaderView2 = this.f94639c;
                        bmrx bmrx4 = (bmrx) this.f95397aj;
                        if (bmrx4.f130600b == 21) {
                            bmfs2 = (bmfs) bmrx4.f130601c;
                        } else {
                            bmfs2 = bmfs.f129155e;
                        }
                        bmdn bmdn = bmfs2.f129160d;
                        if (bmdn == null) {
                            bmdn = bmdn.f128831k;
                        }
                        formHeaderView2.mo71963a(bmdn, this.f123963aH, null, this.f95386aD);
                    }
                    bmrx bmrx5 = (bmrx) this.f95397aj;
                    if (bmrx5.f130600b == 21) {
                        bmfs = (bmfs) bmrx5.f130601c;
                    } else {
                        bmfs = bmfs.f129155e;
                    }
                    this.f94644h = bjvh.m104692a(bmfs, this.f123961aF, mo65980at());
                    m80223c(false);
                }
                bmav bmav = this.f95398ak.f110468q;
                if (bmav == null || !bkfr.m105582a(bmav)) {
                    this.f95363G.mo66025a(3);
                } else {
                    this.f95363G.mo66025a(4);
                }
            }
            this.f95386aD.add(this.f94644h);
            this.f95363G.mo66032a(this.f94644h);
            getChildFragmentManager().beginTransaction().replace(C0126R.C0129id.fragment_holder, this.f94644h).commit();
        } else if (bkdx != null) {
            getChildFragmentManager().beginTransaction().remove(this.f94644h).commit();
            this.f94644h = null;
        }
        bkdx bkdx2 = this.f94644h;
        if (bkdx2 != null) {
            this.f95385aC.add(new bkde(bkdx2));
        }
        if (!this.f94649m) {
            bmrx bmrx6 = (bmrx) this.f95397aj;
            if ((bmrx6.f130599a & 2) != 0) {
                bmjt bmjt3 = bmrx6.f130603e;
                if (bmjt3 == null) {
                    bmjt3 = bmjt.f129732k;
                }
                String b = PageHeaderView.m94278b(bmjt3);
                if (!TextUtils.isEmpty(b)) {
                    this.f95373Q = b;
                }
            }
        }
        this.f94645i = (bkig) getChildFragmentManager().findFragmentById(C0126R.C0129id.encryption_fragment_holder);
        bmrx bmrx7 = (bmrx) this.f95397aj;
        if ((bmrx7.f130599a & 8388608) == 0) {
            if (this.f94645i != null) {
                getChildFragmentManager().beginTransaction().remove(this.f94645i).commit();
                this.f94645i = null;
            }
            FrameLayout frameLayout = this.f94642f;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        } else if (this.f94642f != null) {
            if (this.f94645i == null || z) {
                bmdj bmdj = bmrx7.f130617s;
                if (bmdj == null) {
                    bmdj = bmdj.f128803l;
                }
                this.f94645i = axcp.m82327a(bmdj, this.f123961aF, this.f95359C, mo65980at());
                getChildFragmentManager().beginTransaction().replace(C0126R.C0129id.encryption_fragment_holder, this.f94645i).commit();
            }
            this.f95385aC.add(new bkde(this.f94645i));
        } else {
            throw new IllegalArgumentException("No holder is found for encryption form");
        }
        if (mo51924h() != null) {
            bkdx bkdx3 = this.f94644h;
            if (bkdx3 != null) {
                bkdx3.f124196aK = this.f124196aK;
            }
            bkig bkig = this.f94645i;
            if (bkig != null) {
                bkig.f124196aK = this.f124196aK;
            }
            bjwl.m104784a(this, 1, this.f124196aK);
            bjwl.m104784a(this, 2, this.f124196aK);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51903a() {
        mo52294a(Bundle.EMPTY, (byte[]) null);
    }

    /* renamed from: a */
    public void mo51904a(int i) {
        super.mo51904a(i);
        if (i != 1) {
            this.f95363G.mo66047g(true);
            return;
        }
        FocusedViewToTopScrollView focusedViewToTopScrollView = (FocusedViewToTopScrollView) mo52872ae();
        if (focusedViewToTopScrollView != null) {
            focusedViewToTopScrollView.f151970r = false;
            focusedViewToTopScrollView.mo71903a(false);
        }
        this.f95363G.mo66047g(false);
        mo52881an().postDelayed(awgc.m79888a(this, "scrollToTop"), 1000);
    }

    /* renamed from: a */
    public final void mo51905a(int i, Bundle bundle) {
        if (i != 8) {
            super.mo51905a(i, bundle);
            return;
        }
        mo52294a(Bundle.EMPTY, bundle.getByteArray("EventListener.EXTRA_DEPENDENCY_GRAPH_ACTION_TOKEN"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo52294a(Bundle bundle, byte[] bArr) {
        mo52895f((bmry) mo52885b(bundle, bArr, (List) null));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzk.a(bmdb, int, android.view.ViewGroup, boolean):bkbn
     arg types: [bmdb, int, android.view.ViewGroup, int]
     candidates:
      awzk.a(com.google.android.gms.wallet.shared.BuyFlowConfig, java.lang.String, com.google.android.gms.wallet.ui.common.PageDetails, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      awzk.a(awyy, bxxc, int, int):bkdx
      awzk.a(bmav, bmaq, java.util.List, int):void
      awzk.a(bmav, java.lang.String, boolean, boolean):void
      awzk.a(bmdb, int, android.view.ViewGroup, boolean):bkbn */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo52295a(ViewGroup viewGroup) {
        TypedArray obtainStyledAttributes = this.f123962aG.obtainStyledAttributes(new int[]{C0126R.attr.walletRaisedButtonGravity});
        int i = obtainStyledAttributes.getInt(0, 17);
        obtainStyledAttributes.recycle();
        viewGroup.setVisibility(0);
        bxwc bxwc = ((bmrx) this.f95397aj).f130605g;
        int size = bxwc.size();
        for (int i2 = 0; i2 < size; i2++) {
            bkbn a = mo52844a((bmdb) bxwc.get(i2), 3, viewGroup, false);
            a.mo52710b().setOnClickListener(this);
            ((LinearLayout.LayoutParams) a.mo52710b().getLayoutParams()).gravity = i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51908a(bmaf bmaf) {
        mo52296a(bmaf, Bundle.EMPTY, (byte[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo52296a(bmaf bmaf, Bundle bundle, byte[] bArr) {
        mo52808n(false);
        bxvd da = bmrz.f130626e.mo74144da();
        bmaj a = awfx.m79878a(this.f95398ak.f110465n.f128483c.mo73780k());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmrz bmrz = (bmrz) da.f164949b;
        a.getClass();
        bmrz.f130629b = a;
        bmrz.f130628a |= 1;
        bmry bmry = (bmry) mo52885b(bundle, bArr, (List) null);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmrz bmrz2 = (bmrz) da.f164949b;
        bmry.getClass();
        bmrz2.f130630c = bmry;
        bmrz2.f130628a |= 2;
        if (bmaf == null) {
            bmaf = bmaf.f128436d;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmrz bmrz3 = (bmrz) da.f164949b;
        bmaf.getClass();
        bmrz3.f130631d = bmaf;
        bmrz3.f130628a |= 4;
        bmrz bmrz4 = (bmrz) da.mo74062i();
        mo52864a(bmrz4, 4);
        mo52900j(4);
        mo52839Y().f94357a.mo52404a(bmrz4, this.f95398ak.f110467p);
    }

    /* renamed from: a */
    public final void mo52297a(bmaq bmaq, bwgz bwgz, bmar bmar, bmrx bmrx, bmav bmav, InstrumentManagerResult instrumentManagerResult, String str, boolean z) {
        boolean z2;
        bmkw bmkw;
        mo52853a(bmav, bmaq);
        ImRootFragment$InstrumentManagerPageDetails imRootFragment$InstrumentManagerPageDetails = new ImRootFragment$InstrumentManagerPageDetails();
        imRootFragment$InstrumentManagerPageDetails.f110460i = bmrx;
        if (bmrx != null) {
            if ((bmrx.f130599a & 2097152) != 0) {
                bmkw = bmrx.f130615q;
                if (bmkw == null) {
                    bmkw = bmkw.f129898c;
                }
            } else {
                bmkw = null;
            }
            imRootFragment$InstrumentManagerPageDetails.f110463l = bmkw;
        }
        imRootFragment$InstrumentManagerPageDetails.f110468q = bmav;
        imRootFragment$InstrumentManagerPageDetails.f110454c = bwgz;
        imRootFragment$InstrumentManagerPageDetails.f110465n = bmaq;
        imRootFragment$InstrumentManagerPageDetails.f110467p = bmar;
        imRootFragment$InstrumentManagerPageDetails.f110466o = instrumentManagerResult;
        imRootFragment$InstrumentManagerPageDetails.f110464m = this.f95398ak.f110464m;
        if (bmrx != null) {
            int i = 1;
            if (bmrx.f130611m || bmrx.f130612n > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            imRootFragment$InstrumentManagerPageDetails.f110452a = z2;
            imRootFragment$InstrumentManagerPageDetails.f110459h = bmrx.f130612n;
            if ((bmrx.f130599a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0) {
                int a = bmqm.m108288a(bmrx.f130613o);
                if (a != 0) {
                    i = a;
                }
            } else {
                i = imRootFragment$InstrumentManagerPageDetails.f110469r;
            }
            imRootFragment$InstrumentManagerPageDetails.f110469r = i;
        }
        mo52364a(imRootFragment$InstrumentManagerPageDetails, z, str);
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        bmmp bmmp;
        bmmp bmmp2;
        bmmp bmmp3;
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
            byte[] k = bmmp.f130037d.mo73780k();
            Bundle bundle = new Bundle();
            bjvp.m104737a(bundle, "EventListener.EXTRA_TRIGGER_VALUE_REFERENCES", list);
            if (bmmv.f130056b == 4) {
                bmmp2 = (bmmp) bmmv.f130057c;
            } else {
                bmmp2 = bmmp.f130032e;
            }
            if (!bmmp2.f130035b) {
                bxvw = (bmmv.f130056b == 4 ? (bmmp) bmmv.f130057c : bmmp.f130032e).f130034a;
            }
            if (!mo52804a((List) bxvw)) {
                mo52817Q();
            } else {
                mo52294a(bundle, k);
            }
        } else if (i == 4) {
            if (bmmv.f130056b == 4) {
                bmmp3 = (bmmp) bmmv.f130057c;
            } else {
                bmmp3 = bmmp.f130032e;
            }
            byte[] k2 = bmmp3.f130037d.mo73780k();
            Bundle bundle2 = new Bundle();
            bjvp.m104737a(bundle2, "EventListener.EXTRA_TRIGGER_VALUE_REFERENCES", list);
            mo52296a((bmaf) null, bundle2, k2);
        } else if (i != 23) {
            if (i != 33) {
                super.mo51910a(bmmv, list);
                return;
            }
            FocusedViewToTopScrollView focusedViewToTopScrollView = (FocusedViewToTopScrollView) mo52872ae();
            if (focusedViewToTopScrollView != null) {
                focusedViewToTopScrollView.fullScroll(130);
                return;
            }
            throw new IllegalArgumentException("SCROLL_TO_BOTTOM is not supported for this theme.");
        } else if (!mo52804a((List) null)) {
            mo52817Q();
        } else {
            FocusedViewToTopScrollView focusedViewToTopScrollView2 = (FocusedViewToTopScrollView) mo52872ae();
            if (focusedViewToTopScrollView2 != null) {
                focusedViewToTopScrollView2.pageScroll(130);
                return;
            }
            throw new IllegalArgumentException("SCROLL_DOWN_BY_VISIBLE_HEIGHT is not supported for this theme.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51911a(Object obj) {
        if (obj instanceof bmsb) {
            mo52900j(3);
            mo52839Y().f94357a.mo52405a((bmsb) obj, this.f95398ak.f110467p);
            mo52808n(false);
        } else if (obj instanceof bmrz) {
            mo52900j(4);
            mo52839Y().f94357a.mo52404a((bmrz) obj, this.f95398ak.f110467p);
            mo52808n(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo51912a(PageDetails pageDetails) {
        mo52860a(pageDetails, 2);
        return false;
    }
}
