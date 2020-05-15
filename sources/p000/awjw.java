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
import java.util.ArrayList;
import java.util.List;

/* renamed from: awjw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awjw extends awzg {

    /* renamed from: d */
    public static final /* synthetic */ int f94567d = 0;

    /* renamed from: a */
    boolean f94568a;

    /* renamed from: b */
    FocusedViewToTopScrollView f94569b;

    /* renamed from: c */
    final awpc f94570c = new awjv(this);

    /* renamed from: e */
    private final bjes f94571e = new bjes(27);

    /* renamed from: f */
    private byte[] f94572f;

    /* renamed from: g */
    private LinearLayout f94573g;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f95357A = layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_embedded_settings, viewGroup, false);
        this.f94573g = (LinearLayout) this.f95357A.findViewById(C0126R.C0129id.container);
        mo52851a((awib) ((ProgressSpinnerView) this.f95357A.findViewById(C0126R.C0129id.progress_spinner_container)));
        this.f94569b = (FocusedViewToTopScrollView) this.f95357A.findViewById(C0126R.C0129id.content_scroll_view);
        if (this.f94568a) {
            mo52808n(false);
            this.f94568a = false;
            bxvd da = bwje.f159748d.mo74144da();
            bmaj a = awfx.m79878a((byte[]) null);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwje bwje = (bwje) da.f164949b;
            a.getClass();
            bwje.f159751b = a;
            bwje.f159750a = 1 | bwje.f159750a;
            bxtx a2 = bxtx.m123261a(this.f94572f);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwje bwje2 = (bwje) da.f164949b;
            a2.getClass();
            bwje2.f159750a |= 2;
            bwje2.f159752c = a2;
            bwje bwje3 = (bwje) da.mo74062i();
            mo52864a(bwje3, 2);
            mo52865a((Runnable) new awju(this, bwje3));
        } else if (this.f95368L == 1) {
            mo52888b("onInitialLoad");
        }
        return this.f95357A;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final awpc mo51913b() {
        return this.f94570c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo51917c() {
        boolean z;
        boolean z2 = false;
        if (((Boolean) awja.f94515c.mo58455c()).booleanValue() || bkfr.m105580a(getActivity(), bmap.ENABLE_SCROLL_TO_TOP)) {
            z = true;
        } else {
            z = false;
        }
        if ((((Boolean) awja.f94515c.mo58455c()).booleanValue() || bkfr.m105580a(getActivity(), bmap.ENABLE_SMOOTH_SCROLLING)) && bkfr.m105612e(getActivity())) {
            z2 = true;
        }
        FocusedViewToTopScrollView focusedViewToTopScrollView = this.f94569b;
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
        return (bxxk) bwje.f159748d.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final bxxk mo51921e() {
        return (bxxk) bwji.f159782d.mo74142c(7);
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
        bwjg bwjg = (bwjg) obj;
        if ((bwjg.f159764a & 1) == 0) {
            return null;
        }
        bmlz bmlz = bwjg.f159772i;
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
        return (bxxk) bwjg.f159762k.mo74142c(7);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f94572f = arguments.getByteArray("parameters");
        if (bundle == null) {
            if (arguments.containsKey("initializeToken")) {
                this.f95368L = 1;
                bwjf bwjf = (bwjf) bjvp.m104730a(arguments, "initializeToken", (bxxk) bwjf.f159753g.mo74142c(7));
                PageDetails pageDetails = new PageDetails();
                if ((bwjf.f159755a & 8) != 0) {
                    bwjg bwjg = bwjf.f159759e;
                    if (bwjg == null) {
                        bwjg = bwjg.f159762k;
                    }
                    pageDetails.f110460i = bwjg;
                    bwjg bwjg2 = bwjf.f159759e;
                    if (bwjg2 == null) {
                        bwjg2 = bwjg.f159762k;
                    }
                    if ((bwjg2.f159764a & 2) != 0) {
                        bwjg bwjg3 = bwjf.f159759e;
                        if (bwjg3 == null) {
                            bwjg3 = bwjg.f159762k;
                        }
                        bmkw bmkw = bwjg3.f159773j;
                        if (bmkw == null) {
                            bmkw = bmkw.f129898c;
                        }
                        pageDetails.f110463l = bmkw;
                    }
                }
                bmaq bmaq = bwjf.f159757c;
                if (bmaq == null) {
                    bmaq = bmaq.f128479l;
                }
                pageDetails.f110465n = bmaq;
                if ((bwjf.f159755a & 1) != 0) {
                    bmav bmav = bwjf.f159756b;
                    if (bmav == null) {
                        bmav = bmav.f128500h;
                    }
                    pageDetails.f110468q = bmav;
                }
                if ((bwjf.f159755a & 4) != 0) {
                    bmar bmar = bwjf.f159758d;
                    if (bmar == null) {
                        bmar = bmar.f128490c;
                    }
                    pageDetails.f110467p = bmar;
                }
                this.f95399al = pageDetails;
            } else {
                this.f94568a = true;
            }
            OrchestrationViewEvent.m93828c(getActivity(), this.f95359C, this.f94571e);
            return;
        }
        this.f94568a = bundle.getBoolean("shouldMakeInitializeRequest", false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo51914b(Object obj) {
        bwjh bwjh = (bwjh) obj;
        bxvd da = bwji.f159782d.mo74144da();
        bmaj a = awfx.m79878a(this.f95398ak.f110465n.f128483c.mo73780k());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwji bwji = (bwji) da.f164949b;
        a.getClass();
        bwji.f159785b = a;
        bwji.f159784a |= 1;
        if (bwjh == null) {
            bwjh = bwjh.f159775f;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwji bwji2 = (bwji) da.f164949b;
        bwjh.getClass();
        bwji2.f159786c = bwjh;
        bwji2.f159784a |= 2;
        bwji bwji3 = (bwji) da.mo74062i();
        mo52839Y().f94357a.mo52413a(bwji3, this.f95398ak.f110467p);
        return bwji3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo51916b(boolean z) {
        mo52892d(z);
        int size = ((bwjg) this.f95397aj).f159765b.size();
        for (int i = 0; i < size; i++) {
            bmdn bmdn = ((bmeb) ((bwjg) this.f95397aj).f159765b.get(i)).f128905b;
            if (bmdn == null) {
                bmdn = bmdn.f128831k;
            }
            mo52850a(bmdn.f128835c, 6, i);
        }
        int size2 = ((bwjg) this.f95397aj).f159766c.size();
        for (int i2 = 0; i2 < size2; i2++) {
            bmdn bmdn2 = ((bmkt) ((bwjg) this.f95397aj).f159766c.get(i2)).f129887c;
            if (bmdn2 == null) {
                bmdn2 = bmdn.f128831k;
            }
            mo52850a(bmdn2.f128835c, 8, i2);
        }
        int size3 = ((bwjg) this.f95397aj).f159768e.size();
        for (int i3 = 0; i3 < size3; i3++) {
            mo52850a(((bmep) ((bwjg) this.f95397aj).f159768e.get(i3)).f128983d, 25, i3);
        }
        int size4 = ((bwjg) this.f95397aj).f159769f.size();
        for (int i4 = 0; i4 < size4; i4++) {
            mo52850a(((bmem) ((bwjg) this.f95397aj).f159769f.get(i4)).f128966a, 26, i4);
        }
        int size5 = ((bwjg) this.f95397aj).f159767d.size();
        for (int i5 = 0; i5 < size5; i5++) {
            mo52850a(((bmde) ((bwjg) this.f95397aj).f159767d.get(i5)).f128783b, 30, i5);
        }
        int size6 = ((bwjg) this.f95397aj).f159771h.size();
        for (int i6 = 0; i6 < size6; i6++) {
            bmdn bmdn3 = ((bmfd) ((bwjg) this.f95397aj).f159771h.get(i6)).f129073a;
            if (bmdn3 == null) {
                bmdn3 = bmdn.f128831k;
            }
            mo52850a(bmdn3.f128835c, 34, i6);
        }
        this.f94573g.removeAllViews();
        if (z) {
            this.f95357A.setVisibility(8);
        }
        mo52867a(((bwjg) this.f95397aj).f159770g, this.f94573g, z);
        if (mo51924h() != null) {
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
            return (bmeb) ((bwjg) this.f95397aj).f159765b.get(intValue);
        }
        if (intValue2 == 8) {
            return (bmkt) ((bwjg) this.f95397aj).f159766c.get(intValue);
        }
        if (intValue2 == 30) {
            return (bmde) ((bwjg) this.f95397aj).f159767d.get(intValue);
        }
        if (intValue2 == 34) {
            return (bmfd) ((bwjg) this.f95397aj).f159771h.get(intValue);
        }
        if (intValue2 == 25) {
            return (bmep) ((bwjg) this.f95397aj).f159768e.get(intValue);
        }
        if (intValue2 != 26) {
            return null;
        }
        return (bmem) ((bwjg) this.f95397aj).f159769f.get(intValue);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo51902a(Bundle bundle, byte[] bArr, List list) {
        bxvd da = bwjh.f159775f.mo74144da();
        SparseArray a = mo52842a(bundle, list);
        ArrayList arrayList = (ArrayList) a.get(6);
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bmed bmed = (bmed) arrayList.get(i);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwjh bwjh = (bwjh) da.f164949b;
                bmed.getClass();
                if (!bwjh.f159778b.mo73666a()) {
                    bwjh.f159778b = bxvk.m124021a(bwjh.f159778b);
                }
                bwjh.f159778b.add(bmed);
            }
        }
        ArrayList arrayList2 = (ArrayList) a.get(8);
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                bmkv bmkv = (bmkv) arrayList2.get(i2);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwjh bwjh2 = (bwjh) da.f164949b;
                bmkv.getClass();
                if (!bwjh2.f159779c.mo73666a()) {
                    bwjh2.f159779c = bxvk.m124021a(bwjh2.f159779c);
                }
                bwjh2.f159779c.add(bmkv);
            }
        }
        ArrayList arrayList3 = (ArrayList) a.get(34);
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                bmfe bmfe = (bmfe) arrayList3.get(i3);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwjh bwjh3 = (bwjh) da.f164949b;
                bmfe.getClass();
                if (!bwjh3.f159780d.mo73666a()) {
                    bwjh3.f159780d = bxvk.m124021a(bwjh3.f159780d);
                }
                bwjh3.f159780d.add(bmfe);
            }
        }
        return (bwjh) da.mo74062i();
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
            bwjg bwjg = (bwjg) this.f95397aj;
            bxvd bxvd = (bxvd) bwjg.mo74142c(5);
            bxvd.mo73625a((bxvk) bwjg);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bwjg bwjg2 = (bwjg) bxvd.f164949b;
            bwjg bwjg3 = bwjg.f159762k;
            bxxc.getClass();
            if (!bwjg2.f159765b.mo73666a()) {
                bwjg2.f159765b = bxvk.m124021a(bwjg2.f159765b);
            }
            bwjg2.f159765b.set(intValue, bxxc);
            this.f95397aj = bxvd.mo74062i();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51908a(bmaf bmaf) {
        throw new UnsupportedOperationException("Refreshes are not supported by Embedded settings");
    }

    /* renamed from: a */
    public final void mo52185a(bmaq bmaq, bwgz bwgz, bmar bmar, bwjg bwjg, bmav bmav, boolean z, String str) {
        mo52853a(bmav, bmaq);
        PageDetails pageDetails = new PageDetails();
        pageDetails.f110460i = bwjg;
        if (!(bwjg == null || (bwjg.f159764a & 2) == 0)) {
            bmkw bmkw = bwjg.f159773j;
            if (bmkw == null) {
                bmkw = bmkw.f129898c;
            }
            pageDetails.f110463l = bmkw;
        }
        pageDetails.f110468q = bmav;
        sdo.m34959a(bwgz);
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
            bwjh bwjh = (bwjh) mo52885b(bundle, (byte[]) null, bmmp3.f130036c);
            bxvd bxvd = (bxvd) bwjh.mo74142c(5);
            bxvd.mo73625a((bxvk) bwjh);
            if (k != null && k.length > 0) {
                bxtx a2 = bxtx.m123261a(k);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bwjh bwjh2 = (bwjh) bxvd.f164949b;
                bwjh bwjh3 = bwjh.f159775f;
                a2.getClass();
                bwjh2.f159777a = 1 | bwjh2.f159777a;
                bwjh2.f159781e = a2;
            }
            mo52895f((bwjh) bxvd.mo74062i());
            return;
        }
        mo52808n(true);
        mo52814N();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51911a(Object obj) {
        if (obj instanceof bwje) {
            mo52900j(2);
            mo52839Y().f94357a.mo52412a((bwje) obj);
            mo52808n(false);
        } else if (obj instanceof bwji) {
            mo52900j(3);
            mo52839Y().f94357a.mo52413a((bwji) obj, this.f95398ak.f110467p);
            mo52808n(false);
        }
    }
}
