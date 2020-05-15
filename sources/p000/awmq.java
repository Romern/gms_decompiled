package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wallet.analytics.events.OrchestrationApiEvent;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.gms.wallet.idcredit.IdCreditFragment$IdCreditPageDetails;
import com.google.android.gms.wallet.idcredit.IdCreditResult;
import com.google.android.gms.wallet.p088ui.common.PageDetails;
import com.google.android.gms.wallet.p088ui.common.ProgressSpinnerView;
import com.google.android.wallet.p097ui.common.FocusedViewToTopScrollView;
import com.google.android.wallet.p097ui.common.LegalMessageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: awmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awmq extends awzg implements axai, bkio {

    /* renamed from: l */
    public static final /* synthetic */ int f94621l = 0;

    /* renamed from: a */
    boolean f94622a;

    /* renamed from: b */
    byte[] f94623b;

    /* renamed from: c */
    int f94624c;

    /* renamed from: d */
    bmrn[] f94625d;

    /* renamed from: e */
    boolean f94626e;

    /* renamed from: f */
    Bundle f94627f;

    /* renamed from: g */
    byte[] f94628g;

    /* renamed from: h */
    FocusedViewToTopScrollView f94629h;

    /* renamed from: i */
    LinearLayout f94630i;

    /* renamed from: j */
    ProgressSpinnerView f94631j;

    /* renamed from: k */
    final awpc f94632k = new awmo(this);

    /* renamed from: m */
    private final bjes f94633m = new bjes(11);

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final PageDetails mo52038J() {
        return new IdCreditFragment$IdCreditPageDetails();
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
        this.f95357A = layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_id_credit, viewGroup, false);
        this.f94629h = (FocusedViewToTopScrollView) this.f95357A.findViewById(C0126R.C0129id.content_scroll_view);
        this.f94630i = (LinearLayout) this.f95357A.findViewById(C0126R.C0129id.container);
        ProgressSpinnerView progressSpinnerView = (ProgressSpinnerView) this.f95357A.findViewById(C0126R.C0129id.progress_spinner_container);
        this.f94631j = progressSpinnerView;
        mo52851a((awib) progressSpinnerView);
        this.f95363G.mo66029a((bkio) this);
        if (this.f94622a) {
            mo52808n(false);
            this.f94622a = false;
            bxvd da = bmrj.f130504d.mo74144da();
            bmaj a = awfx.m79878a((byte[]) null);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmrj bmrj = (bmrj) da.f164949b;
            a.getClass();
            bmrj.f130507b = a;
            bmrj.f130506a = 1 | bmrj.f130506a;
            ByteString a2 = ByteString.m123261a(this.f94623b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmrj bmrj2 = (bmrj) da.f164949b;
            a2.getClass();
            bmrj2.f130506a |= 2;
            bmrj2.f130508c = a2;
            bmrj bmrj3 = (bmrj) da.mo74062i();
            mo52864a(bmrj3, 2);
            mo52865a((Runnable) new awmm(this, bmrj3));
        } else if (this.f95368L == 1) {
            mo52888b("onInitialLoad");
        }
        return this.f95357A;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final awpc mo51913b() {
        return this.f94632k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ long mo52060c(Object obj) {
        bmrl bmrl = (bmrl) obj;
        if (bmrl == null) {
            return 0;
        }
        return bmrl.f130524c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: cc */
    public final void mo52283cc() {
        axaj axaj = (axaj) mo52884b(10, axaj.class);
        if (axaj != null) {
            axaj.mo52941m();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: cf */
    public final bxxk mo52284cf() {
        return (bxxk) bmqu.f130430f.mo74142c(7);
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final bxxk mo51920d() {
        return (bxxk) bmrj.f130504d.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final bxxk mo51921e() {
        return (bxxk) bmrq.f130560d.mo74142c(7);
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
        bmrl bmrl = (bmrl) obj;
        if ((bmrl.f130522a & 4) == 0) {
            return null;
        }
        bmlz bmlz = bmrl.f130525d;
        return bmlz == null ? bmlz.f129993c : bmlz;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo51925l() {
        mo52280a((bmrn) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final bxxk mo51926m() {
        return (bxxk) bmrl.f130520u.mo74142c(7);
    }

    /* renamed from: n */
    public final void mo51927n() {
        bkfr.m105559a(getActivity(), getView());
    }

    public final void onCreate(Bundle bundle) {
        bmaq bmaq;
        bmav bmav;
        ByteString bxtx;
        bmkw bmkw;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (bundle != null) {
            this.f94622a = bundle.getBoolean("shouldMakeInitializeRequest", false);
            this.f94623b = bundle.getByteArray("encryptedParams");
            this.f94624c = bundle.getInt("screenIndex");
            if (bundle.containsKey("pageValuesPerScreen")) {
                List b = bjvp.m104742b(bundle, "pageValuesPerScreen", (bxxk) bmrn.f130543i.mo74142c(7));
                this.f94625d = (bmrn[]) b.toArray(new bmrn[b.size()]);
            }
            this.f94626e = bundle.getBoolean("pendingSubmit");
            this.f94627f = bundle.getBundle("pendingSubmitEventDetails");
            this.f94628g = bundle.getByteArray("pendingSubmitDependencyGraphActionToken");
            return;
        }
        if (this.f95371O) {
            this.f95368L = 1;
        } else if (arguments.containsKey("initializeToken")) {
            this.f95368L = 1;
            bmrk bmrk = (bmrk) bjvp.m104730a(arguments, "initializeToken", (bxxk) bmrk.f130509i.mo74142c(7));
            IdCreditFragment$IdCreditPageDetails idCreditFragment$IdCreditPageDetails = new IdCreditFragment$IdCreditPageDetails();
            byte[] bArr = null;
            if ((bmrk.f130511a & 8) != 0) {
                bmrl bmrl = bmrk.f130515e;
                if (bmrl == null) {
                    bmrl = bmrl.f130520u;
                }
                idCreditFragment$IdCreditPageDetails.f110460i = bmrl;
                bmrl bmrl2 = bmrk.f130515e;
                if (bmrl2 == null) {
                    bmrl2 = bmrl.f130520u;
                }
                if ((bmrl2.f130522a & 128) != 0) {
                    bmrl bmrl3 = bmrk.f130515e;
                    if (bmrl3 == null) {
                        bmrl3 = bmrl.f130520u;
                    }
                    bmkw = bmrl3.f130541t;
                    if (bmkw == null) {
                        bmkw = bmkw.f129898c;
                    }
                } else {
                    bmkw = null;
                }
                idCreditFragment$IdCreditPageDetails.f110463l = bmkw;
            }
            idCreditFragment$IdCreditPageDetails.f110457f = bmrk.f130516f;
            if ((bmrk.f130511a & 1) != 0) {
                bmaq = bmrk.f130512b;
                if (bmaq == null) {
                    bmaq = bmaq.f128479l;
                }
            } else {
                bmaq = null;
            }
            idCreditFragment$IdCreditPageDetails.f110465n = bmaq;
            if ((bmrk.f130511a & 2) != 0) {
                bmav = bmrk.f130513c;
                if (bmav == null) {
                    bmav = bmav.f128500h;
                }
            } else {
                bmav = null;
            }
            idCreditFragment$IdCreditPageDetails.f110468q = bmav;
            bwgz a = bwgz.m121952a(bmrk.f130518h);
            if (a == null) {
                a = bwgz.UNKNOWN_FLOW_INSTRUCTION;
            }
            idCreditFragment$IdCreditPageDetails.f110454c = a;
            bmar bmar = bmrk.f130514d;
            if (bmar == null) {
                bmar = bmar.f128490c;
            }
            idCreditFragment$IdCreditPageDetails.f110467p = bmar;
            if ((bmrk.f130511a & 16) != 0) {
                bmag bmag = bmrk.f130517g;
                if (bmag == null) {
                    bmag = bmag.f128442c;
                }
                if (bmag.f128444a == 2) {
                    bxtx = (ByteString) bmag.f128445b;
                } else {
                    bxtx = bxtx.f164797b;
                }
                bArr = bxtx.getKey();
            }
            idCreditFragment$IdCreditPageDetails.f110466o = new IdCreditResult(bArr);
            idCreditFragment$IdCreditPageDetails.f110452a = false;
            this.f95399al = idCreditFragment$IdCreditPageDetails;
        } else if (arguments.containsKey("encryptedParams")) {
            this.f94623b = arguments.getByteArray("encryptedParams");
            this.f94622a = true;
        } else {
            throw new IllegalArgumentException("IdCreditFragment requires either encrypted parameters or initialization token");
        }
        OrchestrationViewEvent.m93828c(getActivity(), this.f95359C, this.f94633m);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("shouldMakeInitializeRequest", this.f94622a);
        bundle.putByteArray("encryptedParams", this.f94623b);
        bundle.putInt("screenIndex", this.f94624c);
        bmrn[] bmrnArr = this.f94625d;
        if (bmrnArr != null) {
            bjvp.m104737a(bundle, "pageValuesPerScreen", Arrays.asList(bmrnArr));
        }
        bundle.putBoolean("pendingSubmit", this.f94626e);
        bundle.putBundle("pendingSubmitEventDetails", this.f94627f);
        bundle.putByteArray("pendingSubmitDependencyGraphActionToken", this.f94628g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final List mo52071q() {
        Object obj = this.f95397aj;
        if (obj == null) {
            return null;
        }
        bmrl bmrl = (bmrl) obj;
        if ((bmrl.f130522a & 64) == 0) {
            return null;
        }
        bmob bmob = bmrl.f130538q;
        if (bmob == null) {
            bmob = bmob.f130205b;
        }
        return bmob.f130207a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final bpis mo52073t() {
        return bpis.FLOW_TYPE_IDENTITY_CREDIT;
    }

    /* renamed from: x */
    public final void mo52285x() {
        Object obj = this.f95397aj;
        if (obj != null) {
            bmrl bmrl = (bmrl) obj;
            this.f95373Q = bmrl.f130523b;
            mo52891c(bmrl.f130526e);
        }
        FocusedViewToTopScrollView focusedViewToTopScrollView = this.f94629h;
        focusedViewToTopScrollView.f151970r = false;
        focusedViewToTopScrollView.mo71903a(false);
        this.f94630i.setVisibility(0);
        this.f95363G.mo66047g(false);
        mo52881an().postDelayed(awgc.m79888a(this, "scrollToTop"), 1000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final bmrn mo52282b(Bundle bundle, byte[] bArr) {
        bmrm bmrm = (bmrm) bmrn.f130543i.mo74144da();
        ArrayList a = mo52847a(6, awzs.class);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            bmed c = ((awzs) a.get(i)).mo52944a(bundle);
            if (bmrm.f164950c) {
                bmrm.mo74035c();
                bmrm.f164950c = false;
            }
            bmrn bmrn = (bmrn) bmrm.f164949b;
            c.getClass();
            bmrn.mo66807a();
            bmrn.f130546b.add(c);
        }
        ArrayList a2 = mo52847a(9, axaw.class);
        int size2 = a2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Bundle bundle2 = Bundle.EMPTY;
            bmog m = ((axaw) a2.get(i2)).mo52957m();
            if (m != null) {
                if (bmrm.f164950c) {
                    bmrm.mo74035c();
                    bmrm.f164950c = false;
                }
                bmrn bmrn2 = (bmrn) bmrm.f164949b;
                m.getClass();
                bmrn2.mo66809c();
                bmrn2.f130550f.add(m);
            }
        }
        axco axco = (axco) mo52884b(8, axco.class);
        if (axco != null) {
            bmkv t = axco.mo66092t();
            if (bmrm.f164950c) {
                bmrm.mo74035c();
                bmrm.f164950c = false;
            }
            bmrn bmrn3 = (bmrn) bmrm.f164949b;
            t.getClass();
            bmrn3.f130549e = t;
            bmrn3.f130545a |= 1;
        }
        axaj axaj = (axaj) mo52884b(10, axaj.class);
        if (axaj != null) {
            bxvd da = bmfc.f129065e.mo74144da();
            bmdn bmdn = ((bmfb) axaj.f124069w).f129055b;
            if (bmdn == null) {
                bmdn = bmdn.f128831k;
            }
            String str = bmdn.f128834b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmfc bmfc = (bmfc) da.f164949b;
            str.getClass();
            bmfc.f129067a |= 1;
            bmfc.f129068b = str;
            bmdn bmdn2 = ((bmfb) axaj.f124069w).f129055b;
            if (bmdn2 == null) {
                bmdn2 = bmdn.f128831k;
            }
            ByteString bxtx = bmdn2.f128836d;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmfc bmfc2 = (bmfc) da.f164949b;
            bxtx.getClass();
            bmfc2.f129067a |= 2;
            bmfc2.f129069c = bxtx;
            byte[] bArr2 = axaj.f95520d;
            if (bArr2 != null) {
                ByteString a3 = bxtx.m123261a(bArr2);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmfc bmfc3 = (bmfc) da.f164949b;
                a3.getClass();
                if (!bmfc3.f129070d.mo73666a()) {
                    bmfc3.f129070d = GeneratedMessageLite.m124021a(bmfc3.f129070d);
                }
                bmfc3.f129070d.add(a3);
            }
            bmfc bmfc4 = (bmfc) da.mo74062i();
            if (bmrm.f164950c) {
                bmrm.mo74035c();
                bmrm.f164950c = false;
            }
            bmrn bmrn4 = (bmrn) bmrm.f164949b;
            bmfc4.getClass();
            bmrn4.mo66808b();
            bmrn4.f130547c.add(bmfc4);
        }
        axag axag = (axag) mo52884b(15, axag.class);
        if (axag != null) {
            bmeu l = axag.mo52938l();
            if (bmrm.f164950c) {
                bmrm.mo74035c();
                bmrm.f164950c = false;
            }
            bmrn bmrn5 = (bmrn) bmrm.f164949b;
            l.getClass();
            bmrn5.f130552h = l;
            bmrn5.f130545a |= 4;
        }
        ArrayList arrayList = new ArrayList();
        int size3 = this.f95404aq.size();
        for (int i3 = 0; i3 < size3; i3++) {
            if (((LegalMessageView) this.f95404aq.get(i3)).getVisibility() == 0) {
                arrayList.add(((LegalMessageView) this.f95404aq.get(i3)).mo71871g());
            }
        }
        bmrm.mo66806a(Arrays.asList(arrayList.size() != 0 ? (String[]) arrayList.toArray(new String[arrayList.size()]) : new String[0]));
        if (bArr != null) {
            ByteString a4 = ByteString.m123261a(bArr);
            if (bmrm.f164950c) {
                bmrm.mo74035c();
                bmrm.f164950c = false;
            }
            bmrn bmrn6 = (bmrn) bmrm.f164949b;
            a4.getClass();
            bmrn6.f130545a |= 2;
            bmrn6.f130551g = a4;
        }
        return (bmrn) bmrm.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo51917c() {
        boolean z;
        boolean z2 = false;
        if (((Boolean) awja.f94517e.mo58455c()).booleanValue() || bkfr.m105580a(getActivity(), bmap.ENABLE_SCROLL_TO_TOP)) {
            z = true;
        } else {
            z = false;
        }
        if ((((Boolean) awja.f94517e.mo58455c()).booleanValue() || bkfr.m105580a(getActivity(), bmap.ENABLE_SMOOTH_SCROLLING)) && bkfr.m105612e(getActivity())) {
            z2 = true;
        }
        FocusedViewToTopScrollView focusedViewToTopScrollView = this.f94629h;
        if (focusedViewToTopScrollView != null) {
            focusedViewToTopScrollView.f151970r = z;
            focusedViewToTopScrollView.mo71903a(z2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo52064d(Object obj) {
        bmrl bmrl = (bmrl) obj;
        bxvd bxvd = (bxvd) bmrl.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bmrl);
        bmlz h = mo51924h();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bmrl bmrl2 = (bmrl) bxvd.f164949b;
        bmrl bmrl3 = bmrl.f130520u;
        h.getClass();
        bmrl2.f130525d = h;
        bmrl2.f130522a |= 4;
        return (bmrl) bxvd.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bxxc mo52042a(long j) {
        int intValue = ((Integer) this.f95375S.mo15534a(j)).intValue();
        int intValue2 = ((Integer) this.f95374R.mo15534a(j)).intValue();
        if (intValue2 == 0) {
            return (bmnr) ((bmrl) this.f95397aj).f130539r.get(intValue);
        }
        if (intValue2 == 6) {
            return (bmeb) ((bmrl) this.f95397aj).f130531j.get(intValue);
        }
        if (intValue2 == 15) {
            bmet bmet = ((bmrl) this.f95397aj).f130537p;
            return bmet == null ? bmet.f129017l : bmet;
        } else if (intValue2 == 17) {
            return (bmjf) ((bmrl) this.f95397aj).f130533l.get(intValue);
        } else {
            if (intValue2 == 31) {
                return (bmdb) ((bmrl) this.f95397aj).f130536o.get(intValue);
            }
            switch (intValue2) {
                case 8:
                    return (bmkt) ((bmrl) this.f95397aj).f130534m.get(intValue);
                case 9:
                    return (bmof) ((bmrl) this.f95397aj).f130535n.get(intValue);
                case 10:
                    return (bmfb) ((bmrl) this.f95397aj).f130532k.get(intValue);
                case 11:
                    return (bmno) ((bmrl) this.f95397aj).f130540s.get(intValue);
                default:
                    return null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final PageDetails mo52043a(Intent intent) {
        byte[] byteArray = intent.getBundleExtra("webViewComponentCallbackData").getByteArray("EventListener.EXTRA_WEBVIEW_COMPONENT_COMPLETE_WITH_CALLBACK_DATA");
        IdCreditFragment$IdCreditPageDetails idCreditFragment$IdCreditPageDetails = new IdCreditFragment$IdCreditPageDetails();
        idCreditFragment$IdCreditPageDetails.f110454c = bwgz.COMPLETE_FLOW_IMMEDIATELY;
        idCreditFragment$IdCreditPageDetails.f110466o = new IdCreditResult(byteArray);
        return idCreditFragment$IdCreditPageDetails;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo51902a(Bundle bundle, byte[] bArr, List list) {
        bmrl bmrl = (bmrl) this.f95397aj;
        if (!bmrl.f130530i) {
            return mo52282b(bundle, bArr);
        }
        if (this.f94624c >= bmrl.f130529h.size() - 1) {
            this.f94625d[this.f94624c] = mo52282b(bundle, (byte[]) null);
            bmrm bmrm = (bmrm) bmrn.f130543i.mo74144da();
            bmrn[] bmrnArr = this.f94625d;
            for (bmrn bmrn : bmrnArr) {
                bxwc bxwc = bmrn.f130546b;
                if (bmrm.f164950c) {
                    bmrm.mo74035c();
                    bmrm.f164950c = false;
                }
                bmrn bmrn2 = (bmrn) bmrm.f164949b;
                bmrn2.mo66807a();
                bxsy.m123078a(bxwc, bmrn2.f130546b);
                bxwc bxwc2 = bmrn.f130550f;
                if (bmrm.f164950c) {
                    bmrm.mo74035c();
                    bmrm.f164950c = false;
                }
                bmrn bmrn3 = (bmrn) bmrm.f164949b;
                bmrn3.mo66809c();
                bxsy.m123078a(bxwc2, bmrn3.f130550f);
                if ((bmrn.f130545a & 1) != 0) {
                    if ((((bmrn) bmrm.f164949b).f130545a & 1) == 0) {
                        bmkv bmkv = bmrn.f130549e;
                        if (bmkv == null) {
                            bmkv = bmkv.f129891f;
                        }
                        if (bmrm.f164950c) {
                            bmrm.mo74035c();
                            bmrm.f164950c = false;
                        }
                        bmrn bmrn4 = (bmrn) bmrm.f164949b;
                        bmkv.getClass();
                        bmrn4.f130549e = bmkv;
                        bmrn4.f130545a |= 1;
                    } else {
                        throw new IllegalArgumentException("Multiple tax info forms in a page are not supported.");
                    }
                }
                if (bmrn.f130547c.size() > 0) {
                    if (((bmrn) bmrm.f164949b).f130547c.size() <= 0) {
                        bxwc bxwc3 = bmrn.f130547c;
                        if (bmrm.f164950c) {
                            bmrm.mo74035c();
                            bmrm.f164950c = false;
                        }
                        bmrn bmrn5 = (bmrn) bmrm.f164949b;
                        bmrn5.mo66808b();
                        bxsy.m123078a(bxwc3, bmrn5.f130547c);
                    } else {
                        throw new IllegalArgumentException("Document upload forms on multiple screens are not supported.");
                    }
                }
                if ((bmrn.f130545a & 4) != 0) {
                    bmeu bmeu = bmrn.f130552h;
                    if (bmeu == null) {
                        bmeu = bmeu.f129030f;
                    }
                    if (bmrm.f164950c) {
                        bmrm.mo74035c();
                        bmrm.f164950c = false;
                    }
                    bmrn bmrn6 = (bmrn) bmrm.f164949b;
                    bmeu.getClass();
                    bmrn6.f130552h = bmeu;
                    bmrn6.f130545a |= 4;
                }
                bmrm.mo66806a(bmrn.f130548d);
            }
            if (bArr != null) {
                ByteString a = ByteString.m123261a(bArr);
                if (bmrm.f164950c) {
                    bmrm.mo74035c();
                    bmrm.f164950c = false;
                }
                bmrn bmrn7 = (bmrn) bmrm.f164949b;
                a.getClass();
                bmrn7.f130545a |= 2;
                bmrn7.f130551g = a;
            }
            return (bmrn) bmrm.mo74062i();
        }
        throw new IllegalArgumentException("Submit should only be allowed on the last screen.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final bwgz mo52056b(PageDetails pageDetails) {
        bwgz b = super.mo52056b(pageDetails);
        if (b == bwgz.UNKNOWN_FLOW_INSTRUCTION) {
            return pageDetails.f110452a ? bwgz.CONTINUE_FLOW_WITH_CURRENT_PAGE : bwgz.COMPLETE_FLOW_IMMEDIATELY;
        }
        return b;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzk.a(bmnr, android.view.ViewGroup, boolean):void
     arg types: [bmnr, android.widget.LinearLayout, int]
     candidates:
      awmq.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View
      awmq.a(android.os.Bundle, byte[], java.util.List):java.lang.Object
      awzg.a(awyy, int, long):void
      awzg.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean, java.lang.String):void
      awzk.a(com.google.android.gms.wallet.shared.BuyFlowConfig, java.lang.String, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      awzk.a(bmdb, android.view.ViewGroup, boolean):bkbn
      awzk.a(android.os.Bundle, byte[], java.util.List):java.lang.Object
      awzk.a(long, int, int):void
      awzk.a(awyy, int, long):void
      awzk.a(bmav, boolean, boolean):void
      awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, int, int):void
      awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean, java.lang.String):void
      awzk.a(java.util.List, android.view.ViewGroup, boolean):void
      bkbr.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View
      awzk.a(bmnr, android.view.ViewGroup, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo51916b(boolean z) {
        int i;
        mo52892d(z);
        this.f94630i.removeAllViews();
        this.f94630i.setVisibility(8);
        int size = ((bmrl) this.f95397aj).f130539r.size();
        for (int i2 = 0; i2 < size; i2++) {
            mo52850a(((bmnr) ((bmrl) this.f95397aj).f130539r.get(i2)).f130156b, 0, i2);
        }
        int size2 = ((bmrl) this.f95397aj).f130540s.size();
        for (int i3 = 0; i3 < size2; i3++) {
            mo52850a(((bmno) ((bmrl) this.f95397aj).f130540s.get(i3)).f130141b, 11, i3);
        }
        int size3 = ((bmrl) this.f95397aj).f130531j.size();
        for (int i4 = 0; i4 < size3; i4++) {
            bmdn bmdn = ((bmeb) ((bmrl) this.f95397aj).f130531j.get(i4)).f128905b;
            if (bmdn == null) {
                bmdn = bmdn.f128831k;
            }
            mo52850a(bmdn.f128835c, 6, i4);
        }
        int size4 = ((bmrl) this.f95397aj).f130535n.size();
        for (int i5 = 0; i5 < size4; i5++) {
            mo52850a(((bmof) ((bmrl) this.f95397aj).f130535n.get(i5)).f130218b, 9, i5);
        }
        int size5 = ((bmrl) this.f95397aj).f130534m.size();
        for (int i6 = 0; i6 < size5; i6++) {
            bmdn bmdn2 = ((bmkt) ((bmrl) this.f95397aj).f130534m.get(i6)).f129887c;
            if (bmdn2 == null) {
                bmdn2 = bmdn.f128831k;
            }
            mo52850a(bmdn2.f128835c, 8, i6);
        }
        int size6 = ((bmrl) this.f95397aj).f130532k.size();
        for (int i7 = 0; i7 < size6; i7++) {
            bmdn bmdn3 = ((bmfb) ((bmrl) this.f95397aj).f130532k.get(i7)).f129055b;
            if (bmdn3 == null) {
                bmdn3 = bmdn.f128831k;
            }
            mo52850a(bmdn3.f128835c, 10, i7);
        }
        bmrl bmrl = (bmrl) this.f95397aj;
        if ((bmrl.f130522a & 32) != 0) {
            bmet bmet = bmrl.f130537p;
            if (bmet == null) {
                bmet = bmet.f129017l;
            }
            mo52850a(bmet.f129021c, 15, 0);
        }
        int size7 = ((bmrl) this.f95397aj).f130533l.size();
        for (int i8 = 0; i8 < size7; i8++) {
            mo52850a(((bmjf) ((bmrl) this.f95397aj).f130533l.get(i8)).f129688b, 17, i8);
        }
        int size8 = ((bmrl) this.f95397aj).f130536o.size();
        for (int i9 = 0; i9 < size8; i9++) {
            mo52850a(((bmdb) ((bmrl) this.f95397aj).f130536o.get(i9)).f128770b, 31, i9);
        }
        int size9 = ((bmrl) this.f95397aj).f130527f.size();
        for (int i10 = 0; i10 < size9; i10++) {
            mo52857a((bmnr) ((bmrl) this.f95397aj).f130527f.get(i10), (ViewGroup) this.f94630i, true);
        }
        bmrl bmrl2 = (bmrl) this.f95397aj;
        if (!bmrl2.f130530i) {
            mo52867a(bmrl2.f130529h, this.f94630i, z);
        } else {
            if (z) {
                OrchestrationViewEvent.m93828c(getActivity(), this.f95359C, new bjes(1639));
            }
            awyy a = awyy.m81591a(z, (bmlv) ((bmrl) this.f95397aj).f130529h.get(this.f94624c), this.f94630i, this.f95363G);
            bxvw bxvw = ((bmlv) ((bmrl) this.f95397aj).f130529h.get(this.f94624c)).f129973i;
            int size10 = bxvw.size();
            for (int i11 = 0; i11 < size10; i11++) {
                mo52852a(a, ((Long) bxvw.get(i11)).longValue());
            }
        }
        axaj axaj = (axaj) mo52884b(10, axaj.class);
        if (axaj != null) {
            bmrl bmrl3 = (bmrl) this.f95397aj;
            if (!bmrl3.f130530i || this.f94624c >= bmrl3.f130529h.size() - 1) {
                axaj.f95521e = this;
            } else {
                throw new IllegalArgumentException("Document upload forms are only supported on the final screen of a page.");
            }
        }
        int size11 = ((bmrl) this.f95397aj).f130528g.size();
        for (int i12 = 0; i12 < size11; i12++) {
            mo52857a((bmnr) ((bmrl) this.f95397aj).f130528g.get(i12), (ViewGroup) this.f94630i, true);
        }
        if (this.f95358B.f110418b.f110412g == 1) {
            int childCount = this.f94630i.getChildCount();
            if (childCount > 0) {
                int i13 = childCount - 1;
                View childAt = this.f94630i.getChildAt(i13);
                if (childAt instanceof bkbn) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                    marginLayoutParams.bottomMargin = 0;
                    childAt.setLayoutParams(marginLayoutParams);
                    this.f94630i.addView(new View(this.f123962aG), i13, new LinearLayout.LayoutParams(0, 0, 1.0f));
                    i = 0;
                    LinearLayout linearLayout = this.f94630i;
                    C1280ps.m19885a(linearLayout, 0, linearLayout.getPaddingTop(), 0, i);
                }
            }
            i = getResources().getDimensionPixelSize(C0126R.dimen.wallet_spacing_form_bottom);
            LinearLayout linearLayout2 = this.f94630i;
            C1280ps.m19885a(linearLayout2, 0, linearLayout2.getPaddingTop(), 0, i);
        }
        if (this.f124196aK != null) {
            mo52868aa();
            bjwl.m104784a(this, 1, this.f124196aK);
            bjwl.m104784a(this, 2, this.f124196aK);
        }
        this.f95363G.mo66025a(3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51903a() {
        mo52278a(Bundle.EMPTY, (byte[]) null);
    }

    /* renamed from: a */
    public final void mo51904a(int i) {
        axaj axaj = (axaj) mo52884b(10, axaj.class);
        if (axaj == null || axaj.mo52775bR() || mo52869ab()) {
            mo52285x();
        }
        super.mo51904a(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52045a(long j, bxxc bxxc) {
        int intValue = ((Integer) this.f95375S.mo15534a(j)).intValue();
        if (((Integer) this.f95374R.mo15534a(j)).intValue() == 6) {
            bmrl bmrl = (bmrl) this.f95397aj;
            bxvd bxvd = (bxvd) bmrl.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) bmrl);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bmrl bmrl2 = (bmrl) bxvd.f164949b;
            bmrl bmrl3 = bmrl.f130520u;
            bxxc.getClass();
            if (!bmrl2.f130531j.mo73666a()) {
                bmrl2.f130531j = GeneratedMessageLite.m124021a(bmrl2.f130531j);
            }
            bmrl2.f130531j.set(intValue, bxxc);
            this.f95397aj = bxvd.mo74062i();
        }
    }

    /* renamed from: a */
    public final void mo52278a(Bundle bundle, byte[] bArr) {
        mo52280a((bmrn) mo52885b(bundle, bArr, (List) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51908a(bmaf bmaf) {
        throw new UnsupportedOperationException("Refresh is not supported.");
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        bmmp bmmp;
        bmmp bmmp2;
        int i;
        bmmp bmmp3;
        ByteString bxtx;
        int a = bmmb.m108166a(bmmv.f130058d);
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        bxvw bxvw = null;
        if (i2 == 3) {
            OrchestrationViewEvent.m93825a(getActivity(), this.f95359C, new bjes(1621));
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
            }
            if (!mo52804a((List) bxvw)) {
                mo52817Q();
                return;
            }
            Bundle bundle = new Bundle();
            bjvp.m104737a(bundle, "EventListener.EXTRA_TRIGGER_VALUE_REFERENCES", list);
            if (bmmv.f130056b == 4) {
                bmmp2 = (bmmp) bmmv.f130057c;
            } else {
                bmmp2 = bmmp.f130032e;
            }
            byte[] k = bmmp2.f130037d.getKey();
            mo52808n(false);
            axaj axaj = (axaj) mo52884b(10, axaj.class);
            if (axaj == null || (i = axaj.f95517a) == 3 || i == 5) {
                mo52278a(bundle, k);
                return;
            }
            this.f94626e = true;
            this.f94627f = bundle;
            this.f94628g = k;
        } else if (i2 != 8) {
            if (i2 != 15) {
                super.mo51910a(bmmv, list);
                return;
            }
            OrchestrationViewEvent.m93825a(getActivity(), this.f95359C, new bjes(1640));
            if (!mo52804a((List) null)) {
                mo52817Q();
                return;
            }
            int size = ((bmrl) this.f95397aj).f130529h.size();
            int i3 = this.f94624c;
            if (i3 == 0) {
                this.f94625d = new bmrn[size];
            }
            this.f94625d[i3] = mo52282b((Bundle) null, (byte[]) null);
            int i4 = this.f94624c + 1;
            this.f94624c = i4;
            if (!((bmrl) this.f95397aj).f130530i || i4 >= size) {
                throw new IllegalArgumentException("No next screen to advance to.");
            }
            this.f95368L = 1;
            mo52880am();
        } else if (mo52804a((List) null)) {
            if (bmmv.f130056b == 6) {
                bmmf bmmf = (bmmf) bmmv.f130057c;
                if ((bmmf.f130005a & 1) != 0) {
                    PageDetails pageDetails = this.f95398ak;
                    bmag bmag = bmmf.f130006b;
                    if (bmag == null) {
                        bmag = bmag.f128442c;
                    }
                    if (bmag.f128444a == 2) {
                        bxtx = (ByteString) bmag.f128445b;
                    } else {
                        bxtx = bxtx.f164797b;
                    }
                    pageDetails.f110466o = new IdCreditResult(bxtx.getKey());
                }
            }
            mo52873af();
        } else {
            mo52817Q();
        }
    }

    /* renamed from: a */
    public final void mo52279a(bmrl bmrl, List list, bwgz bwgz, bmav bmav, bmaq bmaq, bmar bmar, long j, bmag bmag, boolean z, String str) {
        int i;
        ByteString bxtx;
        bmkw bmkw;
        bmrl bmrl2 = bmrl;
        bmav bmav2 = bmav;
        bmaq bmaq2 = bmaq;
        long j2 = j;
        bmag bmag2 = bmag;
        if (bmav2 == null || bkfr.m105582a(bmav)) {
            i = 2;
        } else {
            i = 3;
        }
        OrchestrationApiEvent.m93817a(getActivity(), i, bmaq2, bmav2, this.f95359C);
        mo52853a(bmav2, bmaq2);
        boolean z2 = false;
        byte[] bArr = null;
        if (bmrl2 != null) {
            this.f94624c = 0;
            this.f94625d = null;
        }
        IdCreditFragment$IdCreditPageDetails idCreditFragment$IdCreditPageDetails = new IdCreditFragment$IdCreditPageDetails();
        idCreditFragment$IdCreditPageDetails.f110460i = bmrl2;
        if (bmrl2 != null) {
            if ((bmrl2.f130522a & 128) != 0) {
                bmkw = bmrl2.f130541t;
                if (bmkw == null) {
                    bmkw = bmkw.f129898c;
                }
            } else {
                bmkw = null;
            }
            idCreditFragment$IdCreditPageDetails.f110463l = bmkw;
        }
        idCreditFragment$IdCreditPageDetails.f110457f = list;
        idCreditFragment$IdCreditPageDetails.f110468q = bmav2;
        idCreditFragment$IdCreditPageDetails.f110454c = bwgz;
        idCreditFragment$IdCreditPageDetails.f110465n = bmaq2;
        idCreditFragment$IdCreditPageDetails.f110467p = bmar;
        if (bmag2 != null) {
            if (bmag2.f128444a == 2) {
                bxtx = (ByteString) bmag2.f128445b;
            } else {
                bxtx = bxtx.f164797b;
            }
            bArr = bxtx.getKey();
        }
        idCreditFragment$IdCreditPageDetails.f110466o = new IdCreditResult(bArr);
        if (j2 > 0) {
            z2 = true;
        }
        idCreditFragment$IdCreditPageDetails.f110452a = z2;
        idCreditFragment$IdCreditPageDetails.f110459h = j2;
        mo52364a(idCreditFragment$IdCreditPageDetails, z, str);
    }

    /* renamed from: a */
    public final void mo52280a(bmrn bmrn) {
        bxvd da = bmrq.f130560d.mo74144da();
        bmaj a = awfx.m79878a(this.f95398ak.f110465n.f128483c.mo73780k());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmrq bmrq = (bmrq) da.f164949b;
        a.getClass();
        bmrq.f130563b = a;
        bmrq.f130562a |= 1;
        if (bmrn == null) {
            bmrn = bmrn.f130543i;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmrq bmrq2 = (bmrq) da.f164949b;
        bmrn.getClass();
        bmrq2.f130564c = bmrn;
        bmrq2.f130562a |= 2;
        bmrq bmrq3 = (bmrq) da.mo74062i();
        mo52864a(bmrq3, 3);
        mo52865a((Runnable) new awmn(this, bmrq3));
        this.f94626e = false;
        this.f94627f = null;
        this.f94628g = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51911a(Object obj) {
        if (obj instanceof bmrj) {
            mo52900j(2);
            mo52839Y().f94357a.mo52402a((bmrj) obj);
            mo52808n(false);
        } else if (obj instanceof bmrq) {
            mo52900j(3);
            mo52839Y().f94357a.mo52403a((bmrq) obj, this.f95398ak.f110467p);
            mo52808n(false);
        } else if (obj instanceof bmqu) {
            mo52900j(5);
            axaj axaj = (axaj) mo52884b(10, axaj.class);
            mo52839Y().f94357a.mo52401a((bmqu) obj, axaj.f95519c, axaj.mo52940l());
            mo52808n(!this.f94626e);
            axaj.f95524h = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        if (!((bmrl) this.f95397aj).f130530i) {
            return super.mo52281a(bmas);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo51912a(PageDetails pageDetails) {
        mo52860a(pageDetails, 5);
        return false;
    }
}
