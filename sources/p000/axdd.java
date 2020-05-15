package p000;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.gms.wallet.p088ui.common.PageDetails;
import com.google.android.gms.wallet.p088ui.common.ProgressSpinnerView;
import com.google.android.wallet.p097ui.common.FocusedViewToTopScrollView;
import java.util.List;

/* renamed from: axdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axdd extends awzg {

    /* renamed from: d */
    public static final /* synthetic */ int f95825d = 0;

    /* renamed from: a */
    boolean f95826a;

    /* renamed from: b */
    FocusedViewToTopScrollView f95827b;

    /* renamed from: c */
    final awpc f95828c = new axdc(this);

    /* renamed from: e */
    private final bjes f95829e = new bjes(29);

    /* renamed from: f */
    private byte[] f95830f;

    /* renamed from: g */
    private LinearLayout f95831g;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f95357A = layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_user_management, viewGroup, false);
        this.f95831g = (LinearLayout) this.f95357A.findViewById(C0126R.C0129id.container);
        mo52851a((awib) ((ProgressSpinnerView) this.f95357A.findViewById(C0126R.C0129id.progress_spinner_container)));
        this.f95827b = (FocusedViewToTopScrollView) this.f95357A.findViewById(C0126R.C0129id.content_scroll_view);
        if (this.f95826a) {
            mo52808n(false);
            this.f95826a = false;
            bxvd da = bwld.f160092d.mo74144da();
            bmaj a = awfx.m79878a((byte[]) null);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwld bwld = (bwld) da.f164949b;
            a.getClass();
            bwld.f160095b = a;
            bwld.f160094a = 1 | bwld.f160094a;
            ByteString a2 = ByteString.m123261a(this.f95830f);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwld bwld2 = (bwld) da.f164949b;
            a2.getClass();
            bwld2.f160094a |= 2;
            bwld2.f160096c = a2;
            bwld bwld3 = (bwld) da.mo74062i();
            mo52864a(bwld3, 2);
            mo52865a((Runnable) new axdb(this, bwld3));
        } else if (this.f95368L == 1) {
            mo52888b("onInitialLoad");
        }
        return this.f95357A;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final awpc mo51913b() {
        return this.f95828c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo51917c() {
        boolean z;
        boolean z2 = false;
        if (((Boolean) awja.f94522j.mo58455c()).booleanValue() || bkfr.m105580a(getActivity(), bmap.ENABLE_SCROLL_TO_TOP)) {
            z = true;
        } else {
            z = false;
        }
        if ((((Boolean) awja.f94522j.mo58455c()).booleanValue() || bkfr.m105580a(getActivity(), bmap.ENABLE_SMOOTH_SCROLLING)) && bkfr.m105612e(getActivity())) {
            z2 = true;
        }
        FocusedViewToTopScrollView focusedViewToTopScrollView = this.f95827b;
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
        bmlz bmlz = ((bwlf) obj).f160114g;
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
        return (bxxk) bwlf.f160106i.mo74142c(7);
    }

    public final void onCreate(Bundle bundle) {
        bwlf bwlf;
        bmav bmav;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f95830f = arguments.getByteArray("parameters");
        if (bundle == null) {
            if (arguments.containsKey("initializeToken")) {
                this.f95368L = 1;
                bwle bwle = (bwle) bjvp.m104730a(arguments, "initializeToken", (bxxk) bwle.f160097g.mo74142c(7));
                PageDetails pageDetails = new PageDetails();
                bmar bmar = null;
                if ((bwle.f160099a & 4) != 0) {
                    bwlf = bwle.f160102d;
                    if (bwlf == null) {
                        bwlf = bwlf.f160106i;
                    }
                } else {
                    bwlf = null;
                }
                pageDetails.f110460i = bwlf;
                bwlf bwlf2 = bwle.f160102d;
                if (bwlf2 == null) {
                    bwlf2 = bwlf.f160106i;
                }
                if ((bwlf2.f160108a & 2) != 0) {
                    bwlf bwlf3 = bwle.f160102d;
                    if (bwlf3 == null) {
                        bwlf3 = bwlf.f160106i;
                    }
                    bmkw bmkw = bwlf3.f160115h;
                    if (bmkw == null) {
                        bmkw = bmkw.f129898c;
                    }
                    pageDetails.f110463l = bmkw;
                }
                bmaq bmaq = bwle.f160101c;
                if (bmaq == null) {
                    bmaq = bmaq.f128479l;
                }
                pageDetails.f110465n = bmaq;
                if ((bwle.f160099a & 1) != 0) {
                    bmav = bwle.f160100b;
                    if (bmav == null) {
                        bmav = bmav.f128500h;
                    }
                } else {
                    bmav = null;
                }
                pageDetails.f110468q = bmav;
                if ((bwle.f160099a & 16) != 0 && (bmar = bwle.f160104f) == null) {
                    bmar = bmar.f128490c;
                }
                pageDetails.f110467p = bmar;
                this.f95399al = pageDetails;
            } else {
                this.f95826a = true;
            }
            OrchestrationViewEvent.m93828c(getActivity(), this.f95359C, this.f95829e);
            return;
        }
        this.f95826a = bundle.getBoolean("shouldMakeInitializeRequest", false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo51914b(Object obj) {
        bwlg bwlg = (bwlg) obj;
        bxvd da = bwlh.f160123d.mo74144da();
        bmaj a = awfx.m79878a(this.f95398ak.f110465n.f128483c.mo73780k());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwlh bwlh = (bwlh) da.f164949b;
        a.getClass();
        bwlh.f160126b = a;
        int i = bwlh.f160125a | 1;
        bwlh.f160125a = i;
        if (bwlg != null) {
            bwlg.getClass();
            bwlh.f160127c = bwlg;
            bwlh.f160125a = i | 2;
        }
        bwlh bwlh2 = (bwlh) da.mo74062i();
        mo52839Y().f94357a.mo52421a(bwlh2, this.f95398ak.f110467p);
        return bwlh2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo51916b(boolean z) {
        mo52892d(z);
        int size = ((bwlf) this.f95397aj).f160110c.size();
        for (int i = 0; i < size; i++) {
            bmdn bmdn = ((bmeb) ((bwlf) this.f95397aj).f160110c.get(i)).f128905b;
            if (bmdn == null) {
                bmdn = bmdn.f128831k;
            }
            mo52850a(bmdn.f128835c, 6, i);
        }
        int size2 = ((bwlf) this.f95397aj).f160113f.size();
        for (int i2 = 0; i2 < size2; i2++) {
            mo52850a(((bmem) ((bwlf) this.f95397aj).f160113f.get(i2)).f128966a, 26, i2);
        }
        int size3 = ((bwlf) this.f95397aj).f160112e.size();
        for (int i3 = 0; i3 < size3; i3++) {
            mo52850a(((bmde) ((bwlf) this.f95397aj).f160112e.get(i3)).f128783b, 30, i3);
        }
        int size4 = ((bwlf) this.f95397aj).f160111d.size();
        for (int i4 = 0; i4 < size4; i4++) {
            mo52850a(((bmof) ((bwlf) this.f95397aj).f160111d.get(i4)).f130218b, 9, i4);
        }
        this.f95831g.removeAllViews();
        if (z) {
            this.f95357A.setVisibility(8);
        }
        mo52867a(((bwlf) this.f95397aj).f160109b, this.f95831g, z);
        if (mo51924h() != null && this.f124196aK != null) {
            int size5 = this.f95385aC.size();
            for (int i5 = 0; i5 < size5; i5++) {
                Object obj = ((bkde) this.f95385aC.get(i5)).f124039e;
                if (obj instanceof bkdx) {
                    ((bkdx) obj).f124196aK = this.f124196aK;
                }
            }
            mo52868aa();
            bjwl.m104784a(this, 1, this.f124196aK);
            bjwl.m104784a(this, 2, this.f124196aK);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bxxc mo52042a(long j) {
        int intValue = ((Integer) this.f95375S.mo15534a(j)).intValue();
        int intValue2 = ((Integer) this.f95374R.mo15534a(j)).intValue();
        if (intValue2 == 6) {
            return (bmeb) ((bwlf) this.f95397aj).f160110c.get(intValue);
        }
        if (intValue2 == 9) {
            return (bmof) ((bwlf) this.f95397aj).f160111d.get(intValue);
        }
        if (intValue2 == 26) {
            return (bmem) ((bwlf) this.f95397aj).f160113f.get(intValue);
        }
        if (intValue2 != 30) {
            return null;
        }
        return (bmde) ((bwlf) this.f95397aj).f160112e.get(intValue);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo51902a(Bundle bundle, byte[] bArr, List list) {
        bxvd da = bwlg.f160117e.mo74144da();
        SparseArray a = mo52842a(bundle, list);
        List<bmed> list2 = (List) a.get(6);
        if (list2 != null) {
            for (bmed bmed : list2) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwlg bwlg = (bwlg) da.f164949b;
                bmed.getClass();
                if (!bwlg.f160120b.mo73666a()) {
                    bwlg.f160120b = GeneratedMessageLite.m124021a(bwlg.f160120b);
                }
                bwlg.f160120b.add(bmed);
            }
        }
        List<bmog> list3 = (List) a.get(9);
        if (list3 != null) {
            for (bmog bmog : list3) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwlg bwlg2 = (bwlg) da.f164949b;
                bmog.getClass();
                if (!bwlg2.f160121c.mo73666a()) {
                    bwlg2.f160121c = GeneratedMessageLite.m124021a(bwlg2.f160121c);
                }
                bwlg2.f160121c.add(bmog);
            }
        }
        ByteString a2 = ByteString.m123261a(bArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwlg bwlg3 = (bwlg) da.f164949b;
        a2.getClass();
        bwlg3.f160119a |= 1;
        bwlg3.f160122d = a2;
        return (bwlg) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51903a() {
        throw new UnsupportedOperationException("Embedded settings doesn't support auto submit.");
    }

    /* renamed from: a */
    public final void mo51904a(int i) {
        super.mo51904a(i);
        if (i == 1) {
            this.f95357A.setVisibility(0);
        }
        this.f95363G.mo66047g(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52045a(long j, bxxc bxxc) {
        int intValue = ((Integer) this.f95375S.mo15534a(j)).intValue();
        if (((Integer) this.f95374R.mo15534a(j)).intValue() == 6) {
            bwlf bwlf = (bwlf) this.f95397aj;
            bxvd bxvd = (bxvd) bwlf.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) bwlf);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bwlf bwlf2 = (bwlf) bxvd.f164949b;
            bwlf bwlf3 = bwlf.f160106i;
            bxxc.getClass();
            if (!bwlf2.f160110c.mo73666a()) {
                bwlf2.f160110c = GeneratedMessageLite.m124021a(bwlf2.f160110c);
            }
            bwlf2.f160110c.set(intValue, bxxc);
            this.f95397aj = bxvd.mo74062i();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51908a(bmaf bmaf) {
        throw new UnsupportedOperationException("Refreshes are not supported by Embedded settings");
    }

    /* renamed from: a */
    public final void mo53034a(bmaq bmaq, bwgz bwgz, bmar bmar, bwlf bwlf, bmav bmav, boolean z, String str) {
        PageDetails pageDetails = new PageDetails();
        pageDetails.f110460i = bwlf;
        if (!(bwlf == null || (bwlf.f160108a & 2) == 0)) {
            bmkw bmkw = bwlf.f160115h;
            if (bmkw == null) {
                bmkw = bmkw.f129898c;
            }
            pageDetails.f110463l = bmkw;
        }
        pageDetails.f110468q = bmav;
        pageDetails.f110454c = bwgz;
        pageDetails.f110465n = bmaq;
        pageDetails.f110467p = bmar;
        mo52364a(pageDetails, z, str);
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        bmmp bmmp;
        bmmp bmmp2;
        bxvw bxvw;
        bmmp bmmp3;
        bmmp bmmp4;
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
        byte[] k = bmmp.f130037d.getKey();
        Bundle bundle = new Bundle();
        bjvp.m104737a(bundle, "EventListener.EXTRA_TRIGGER_VALUE_REFERENCES", list);
        if (bmmv.f130056b == 4) {
            bmmp2 = (bmmp) bmmv.f130057c;
        } else {
            bmmp2 = bmmp.f130032e;
        }
        if (!bmmp2.f130035b) {
            if (bmmv.f130056b == 4) {
                bmmp4 = (bmmp) bmmv.f130057c;
            } else {
                bmmp4 = bmmp.f130032e;
            }
            bxvw = bmmp4.f130034a;
        } else {
            bxvw = null;
        }
        if (mo52804a((List) bxvw)) {
            if (bmmv.f130056b == 4) {
                bmmp3 = (bmmp) bmmv.f130057c;
            } else {
                bmmp3 = bmmp.f130032e;
            }
            mo52895f((bwlg) mo52885b(bundle, k, bmmp3.f130036c));
            return;
        }
        mo52808n(true);
        mo52814N();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51911a(Object obj) {
        if (obj instanceof bwld) {
            mo52839Y().f94357a.mo52420a((bwld) obj);
            mo52808n(false);
        } else if (obj instanceof bwlh) {
            mo52839Y().f94357a.mo52421a((bwlh) obj, this.f95398ak.f110467p);
            mo52808n(false);
        }
    }
}
