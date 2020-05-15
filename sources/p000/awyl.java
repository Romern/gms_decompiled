package p000;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.volley.VolleyError;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.gms.wallet.p088ui.common.PageDetails;
import com.google.android.gms.wallet.p088ui.common.ProgressSpinnerView;
import com.google.android.gms.wallet.p088ui.component.alert.AlertView;
import com.google.android.gms.wallet.p088ui.component.filter.FilterView;
import com.google.android.gms.wallet.timelineview.TimelineViewFragment$TimelineViewPageDetails;
import com.google.android.wallet.p097ui.document.DownloadedDocument;
import java.util.List;
import java.util.Locale;

/* renamed from: awyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awyl extends awzg implements bkid, bkia {

    /* renamed from: h */
    public static final /* synthetic */ int f95275h = 0;

    /* renamed from: a */
    bkht f95276a;

    /* renamed from: b */
    bmev f95277b;

    /* renamed from: c */
    boolean f95278c;

    /* renamed from: d */
    LinearLayout f95279d;

    /* renamed from: e */
    AlertView f95280e;

    /* renamed from: f */
    bkie f95281f;

    /* renamed from: g */
    final awpc f95282g = new awyj(this);

    /* renamed from: i */
    private final bjes f95283i = new bjes(25);

    /* renamed from: j */
    private byte[] f95284j;

    /* renamed from: C */
    private final void m81502C() {
        bkib c = bjvn.m104722c(getActivity().getApplicationContext());
        ContextThemeWrapper contextThemeWrapper = this.f123962aG;
        bmev bmev = this.f95277b;
        this.f95276a = c.mo66010a(contextThemeWrapper, bmev.f129040b, bmev.f129041c, this, mo51878cn(), mo51877cm());
    }

    /* renamed from: D */
    private final void m81503D() {
        if (this.f95276a != null) {
            bjvn.m104722c(getActivity().getApplicationContext()).mo66011a(this.f95276a);
            this.f95276a = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo52762B() {
        mo52808n(false);
        this.f95278c = false;
        bxvd da = bwkp.f159995d.mo74144da();
        bmaj a = awfx.m79878a((byte[]) null);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwkp bwkp = (bwkp) da.f164949b;
        a.getClass();
        bwkp.f159998b = a;
        bwkp.f159997a |= 1;
        bxtx a2 = bxtx.m123261a(this.f95284j);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwkp bwkp2 = (bwkp) da.f164949b;
        a2.getClass();
        bwkp2.f159997a |= 2;
        bwkp2.f159999c = a2;
        bwkp bwkp3 = (bwkp) da.mo74062i();
        mo52864a(bwkp3, 2);
        mo52865a((Runnable) new awyi(this, bwkp3));
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final PageDetails mo52038J() {
        return new TimelineViewFragment$TimelineViewPageDetails();
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
        this.f95357A = layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_timeline_view, viewGroup, false);
        mo52851a((awib) ((ProgressSpinnerView) this.f95357A.findViewById(C0126R.C0129id.progress_spinner_container)));
        this.f95279d = (LinearLayout) this.f95357A.findViewById(C0126R.C0129id.container);
        if (this.f95278c) {
            mo52762B();
        } else if (this.f95368L == 1) {
            mo52888b("onInitialLoad");
        }
        bkie bkie = (bkie) getFragmentManager().findFragmentByTag("tagDocumentDownloadDialog");
        this.f95281f = bkie;
        if (bkie != null) {
            bkie.f123958c = this;
            bkie.f124269a = this;
        }
        return this.f95357A;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final awpc mo51913b() {
        return this.f95282g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ long mo52060c(Object obj) {
        bwkr bwkr = (bwkr) obj;
        if (bwkr == null) {
            return 0;
        }
        return bwkr.f160012b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo51917c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: cg */
    public final List mo52766cg() {
        Object obj = this.f95397aj;
        if (obj == null) {
            return null;
        }
        bwkr bwkr = (bwkr) obj;
        if ((bwkr.f160011a & 32) == 0) {
            return null;
        }
        bwib bwib = bwkr.f160023m;
        if (bwib == null) {
            bwib = bwib.f159607c;
        }
        int a = bwia.m121981a(bwib.f159610b);
        if (a == 0 || a != 3) {
            return null;
        }
        bwib bwib2 = ((bwkr) this.f95397aj).f160023m;
        if (bwib2 == null) {
            bwib2 = bwib.f159607c;
        }
        return bwib2.f159609a;
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final bxxk mo51920d() {
        return (bxxk) bwkp.f159995d.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final bxxk mo51921e() {
        return (bxxk) bwkt.f160035d.mo74142c(7);
    }

    /* renamed from: f */
    public final void mo51922f() {
        super.mo51922f();
        boolean z = this.f124195aJ;
        AlertView alertView = this.f95280e;
        if (alertView != null) {
            alertView.setEnabled(z);
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
        bwkr bwkr = (bwkr) obj;
        if ((bwkr.f160011a & 8) == 0) {
            return null;
        }
        bmlz bmlz = bwkr.f160018h;
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
        return (bxxk) bwkr.f160009r.mo74142c(7);
    }

    /* renamed from: n */
    public final void mo51927n() {
        bkht bkht;
        if (this.f95277b != null && (bkht = this.f95276a) != null && bkht.f124247e != null) {
            m81502C();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (intent != null && intent.getBooleanExtra("com.google.android.gms.wallet.firstparty.EXTRA_REFRESH", false)) {
            mo52762B();
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onCreate(Bundle bundle) {
        bmaq bmaq;
        bmav bmav;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f95284j = arguments.getByteArray("parameters");
        if (bundle != null) {
            this.f95278c = bundle.getBoolean("shouldMakeInitializeRequest", false);
            if (bundle.containsKey("downloadDocument")) {
                this.f95277b = (bmev) bjvp.m104730a(bundle, "downloadDocument", (bxxk) bmev.f129037e.mo74142c(7));
                return;
            }
            return;
        }
        if (this.f95371O) {
            this.f95368L = 1;
        } else if (arguments.containsKey("initializeToken")) {
            this.f95368L = 1;
            bwkq bwkq = (bwkq) bjvp.m104730a(arguments, "initializeToken", (bxxk) bwkq.f160000g.mo74142c(7));
            TimelineViewFragment$TimelineViewPageDetails timelineViewFragment$TimelineViewPageDetails = new TimelineViewFragment$TimelineViewPageDetails();
            bwkr bwkr = bwkq.f160006e;
            if (bwkr == null) {
                bwkr = bwkr.f160009r;
            }
            timelineViewFragment$TimelineViewPageDetails.f110460i = bwkr;
            bwkr bwkr2 = bwkq.f160006e;
            if (bwkr2 == null) {
                bwkr2 = bwkr.f160009r;
            }
            if ((bwkr2.f160011a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                bwkr bwkr3 = bwkq.f160006e;
                if (bwkr3 == null) {
                    bwkr3 = bwkr.f160009r;
                }
                bmkw bmkw = bwkr3.f160026p;
                if (bmkw == null) {
                    bmkw = bmkw.f129898c;
                }
                timelineViewFragment$TimelineViewPageDetails.f110463l = bmkw;
            }
            timelineViewFragment$TimelineViewPageDetails.f110457f = bwkq.f160007f;
            bmar bmar = null;
            if ((bwkq.f160002a & 2) != 0) {
                bmaq = bwkq.f160004c;
                if (bmaq == null) {
                    bmaq = bmaq.f128479l;
                }
            } else {
                bmaq = null;
            }
            timelineViewFragment$TimelineViewPageDetails.f110465n = bmaq;
            if ((bwkq.f160002a & 1) != 0) {
                bmav = bwkq.f160003b;
                if (bmav == null) {
                    bmav = bmav.f128500h;
                }
            } else {
                bmav = null;
            }
            timelineViewFragment$TimelineViewPageDetails.f110468q = bmav;
            if ((bwkq.f160002a & 4) != 0 && (bmar = bwkq.f160005d) == null) {
                bmar = bmar.f128490c;
            }
            timelineViewFragment$TimelineViewPageDetails.f110467p = bmar;
            this.f95399al = timelineViewFragment$TimelineViewPageDetails;
        } else {
            this.f95278c = true;
        }
        OrchestrationViewEvent.m93828c(getActivity(), this.f95359C, this.f95283i);
    }

    public final void onErrorResponse(VolleyError volleyError) {
        if (this.f95281f != null) {
            DownloadedDocument downloadedDocument = new DownloadedDocument("", "");
            this.f95276a.f124247e = downloadedDocument;
            this.f95281f.mo66015a(downloadedDocument);
        }
    }

    public final void onPause() {
        super.onPause();
        m81503D();
    }

    public final void onResume() {
        super.onResume();
        if (this.f95277b != null && this.f95276a == null) {
            m81502C();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bmev bmev = this.f95277b;
        if (bmev != null) {
            bjvp.m104736a(bundle, "downloadDocument", bmev);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final List mo52071q() {
        Object obj = this.f95397aj;
        if (obj == null) {
            return null;
        }
        bwkr bwkr = (bwkr) obj;
        if ((bwkr.f160011a & 64) == 0) {
            return null;
        }
        bmob bmob = bwkr.f160024n;
        if (bmob == null) {
            bmob = bmob.f130205b;
        }
        return bmob.f130207a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final bwgz mo52056b(PageDetails pageDetails) {
        Object obj = pageDetails.f110460i;
        if (obj == null || (((bwkr) obj).f160011a & 16) == 0) {
            return super.mo52056b(pageDetails);
        }
        return bwgz.CONTINUE_FLOW_WITH_NEW_PAGE_IN_OVERLAY;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo52064d(Object obj) {
        bwkr bwkr = (bwkr) obj;
        bmlz h = mo51924h();
        if (h == null) {
            return bwkr;
        }
        bxvd bxvd = (bxvd) bwkr.mo74142c(5);
        bxvd.mo73625a((bxvk) bwkr);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwkr bwkr2 = (bwkr) bxvd.f164949b;
        bwkr bwkr3 = bwkr.f160009r;
        h.getClass();
        bwkr2.f160018h = h;
        bwkr2.f160011a |= 8;
        return (bwkr) bxvd.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo52180e(Object obj) {
        bwkr bwkr = (bwkr) obj;
        bxwc bxwc = bwkr.f160022l;
        int size = bxwc.size();
        int i = 0;
        while (i < size) {
            bwhc bwhc = (bwhc) bxwc.get(i);
            long j = bwhc.f159488a;
            bwhn bwhn = ((bwkr) this.f95397aj).f160027q;
            if (bwhn == null) {
                bwhn = bwhn.f159531f;
            }
            if (j == bwhn.f159533a) {
                AlertView alertView = this.f95280e;
                bwhn bwhn2 = bwkr.f160027q;
                if (bwhn2 == null) {
                    bwhn2 = bwhn.f159531f;
                }
                alertView.mo60080a(bwhc, bwhn2);
                if (bwhn2 != null) {
                    bwkr bwkr2 = (bwkr) this.f95397aj;
                    bxvd bxvd = (bxvd) bwkr2.mo74142c(5);
                    bxvd.mo73625a((bxvk) bwkr2);
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bwkr bwkr3 = (bwkr) bxvd.f164949b;
                    bwkr bwkr4 = bwkr.f160009r;
                    bwhn2.getClass();
                    bwkr3.f160027q = bwhn2;
                    bwkr3.f160011a |= 512;
                    this.f95397aj = bxvd.mo74062i();
                }
                i++;
            } else {
                throw new UnsupportedOperationException(String.format(Locale.US, "Can not handle partialUpdateData: %s", Long.valueOf(bwhc.f159488a)));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo51914b(Object obj) {
        bwks bwks = (bwks) obj;
        bxvd da = bwkt.f160035d.mo74144da();
        bmaj a = awfx.m79878a(this.f95398ak.f110465n.f128483c.mo73780k());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwkt bwkt = (bwkt) da.f164949b;
        a.getClass();
        bwkt.f160038b = a;
        int i = bwkt.f160037a | 1;
        bwkt.f160037a = i;
        if (bwks != null) {
            bwks.getClass();
            bwkt.f160039c = bwks;
            bwkt.f160037a = i | 2;
        }
        mo52839Y().f94357a.mo52419a((bwkt) da.mo74062i(), this.f95398ak.f110467p);
        return da;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bxxc mo52042a(long j) {
        int intValue = ((Integer) this.f95375S.mo15534a(j)).intValue();
        int intValue2 = ((Integer) this.f95374R.mo15534a(j)).intValue();
        if (intValue2 == 0) {
            return (bmnr) ((bwkr) this.f95397aj).f160020j.get(intValue);
        }
        if (intValue2 == 6) {
            return (bmeb) ((bwkr) this.f95397aj).f160016f.get(intValue);
        }
        if (intValue2 == 11) {
            bmno bmno = ((bwkr) this.f95397aj).f160014d;
            return bmno == null ? bmno.f130138m : bmno;
        } else if (intValue2 == 25) {
            return (bmep) ((bwkr) this.f95397aj).f160019i.get(intValue);
        } else {
            if (intValue2 == 28) {
                return (bwin) ((bwkr) this.f95397aj).f160015e.get(intValue);
            }
            if (intValue2 != 33) {
                return null;
            }
            bwhv bwhv = ((bwkr) this.f95397aj).f160025o;
            return bwhv == null ? bwhv.f159578e : bwhv;
        }
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
        this.f95373Q = ((bwkr) this.f95397aj).f160013c;
        mo52892d(z);
        this.f95279d.removeAllViews();
        if (z) {
            this.f95357A.setVisibility(8);
        }
        bwkr bwkr = (bwkr) this.f95397aj;
        if ((bwkr.f160011a & 512) != 0) {
            bwhn bwhn = bwkr.f160027q;
            if (bwhn == null) {
                bwhn = bwhn.f159531f;
            }
            if (bwhn.f159534b.size() > 0) {
                AlertView alertView = (AlertView) this.f123963aH.inflate((int) C0126R.C0128layout.wallet_view_alert, (ViewGroup) this.f95279d, false);
                this.f95280e = alertView;
                alertView.f110505p = this.f124196aK;
                alertView.setId(mo65818aq().mo65614a());
                AlertView alertView2 = this.f95280e;
                bwhn bwhn2 = ((bwkr) this.f95397aj).f160027q;
                if (bwhn2 == null) {
                    bwhn2 = bwhn.f159531f;
                }
                alertView2.mo60081a(bwhn2, getActivity(), mo65820k(this.f95280e.getId()), this);
                this.f95279d.addView(this.f95280e);
            }
        }
        bwkr bwkr2 = (bwkr) this.f95397aj;
        if ((bwkr2.f160011a & 128) != 0) {
            bwhv bwhv = bwkr2.f160025o;
            if (bwhv == null) {
                bwhv = bwhv.f159578e;
            }
            mo52850a(bwhv.f159580a, 33, 0);
        }
        int size = ((bwkr) this.f95397aj).f160015e.size();
        for (int i = 0; i < size; i++) {
            mo52850a(((bwin) ((bwkr) this.f95397aj).f160015e.get(i)).f159655b, 28, i);
        }
        int size2 = ((bwkr) this.f95397aj).f160019i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            mo52850a(((bmep) ((bwkr) this.f95397aj).f160019i.get(i2)).f128983d, 25, i2);
        }
        int size3 = ((bwkr) this.f95397aj).f160020j.size();
        for (int i3 = 0; i3 < size3; i3++) {
            mo52850a(((bmnr) ((bwkr) this.f95397aj).f160020j.get(i3)).f130156b, 0, i3);
        }
        int size4 = ((bwkr) this.f95397aj).f160016f.size();
        for (int i4 = 0; i4 < size4; i4++) {
            bmdn bmdn = ((bmeb) ((bwkr) this.f95397aj).f160016f.get(i4)).f128905b;
            if (bmdn == null) {
                bmdn = bmdn.f128831k;
            }
            mo52850a(bmdn.f128835c, 6, i4);
        }
        bwkr bwkr3 = (bwkr) this.f95397aj;
        if ((bwkr3.f160011a & 4) != 0) {
            bmno bmno = bwkr3.f160014d;
            if (bmno == null) {
                bmno = bmno.f130138m;
            }
            mo52850a(bmno.f130141b, 11, 0);
        }
        mo52867a(((bwkr) this.f95397aj).f160017g, this.f95279d, z);
        if (!(mo51924h() == null || this.f124196aK == null)) {
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
        this.f95363G.mo66025a(3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo51902a(Bundle bundle, byte[] bArr, List list) {
        bxvd da = bwks.f160029e.mo74144da();
        if (this.f95280e != null) {
            bxvd da2 = bwho.f159539d.mo74144da();
            bwhn bwhn = ((bwkr) this.f95397aj).f160027q;
            if (bwhn == null) {
                bwhn = bwhn.f159531f;
            }
            long j = bwhn.f159533a;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bwho bwho = (bwho) da2.f164949b;
            bwho.f159541a |= 1;
            bwho.f159542b = j;
            bwhn bwhn2 = ((bwkr) this.f95397aj).f160027q;
            if (bwhn2 == null) {
                bwhn2 = bwhn.f159531f;
            }
            bxtx bxtx = bwhn2.f159537e;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bwho bwho2 = (bwho) da2.f164949b;
            bxtx.getClass();
            bwho2.f159541a |= 2;
            bwho2.f159543c = bxtx;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwks bwks = (bwks) da.f164949b;
            bwho bwho3 = (bwho) da2.mo74062i();
            bwho3.getClass();
            bwks.f160034d = bwho3;
            bwks.f160031a |= 4;
        }
        FilterView filterView = this.f95383aA;
        if (!(filterView == null || filterView.mo60090l() == null)) {
            bwhy l = this.f95383aA.mo60090l();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwks bwks2 = (bwks) da.f164949b;
            l.getClass();
            bwks2.f160033c = l;
            bwks2.f160031a |= 2;
        }
        return (bwks) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51903a() {
        throw new UnsupportedOperationException("Timeline view doesn't support auto submit.");
    }

    /* renamed from: a */
    public final void mo51904a(int i) {
        super.mo51904a(i);
        this.f95357A.setVisibility(0);
        this.f95363G.mo66047g(true);
    }

    /* renamed from: a */
    public final void mo51905a(int i, Bundle bundle) {
        super.mo51905a(i, bundle);
        if (i == 16 && this.f95281f != null) {
            m81503D();
            this.f95281f = null;
            this.f95277b = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52045a(long j, bxxc bxxc) {
        int intValue = ((Integer) this.f95375S.mo15534a(j)).intValue();
        if (((Integer) this.f95374R.mo15534a(j)).intValue() == 6) {
            bwkr bwkr = (bwkr) this.f95397aj;
            bxvd bxvd = (bxvd) bwkr.mo74142c(5);
            bxvd.mo73625a((bxvk) bwkr);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bwkr bwkr2 = (bwkr) bxvd.f164949b;
            bwkr bwkr3 = bwkr.f160009r;
            bxxc.getClass();
            if (!bwkr2.f160016f.mo73666a()) {
                bwkr2.f160016f = bxvk.m124021a(bwkr2.f160016f);
            }
            bwkr2.f160016f.set(intValue, bxxc);
            this.f95397aj = bxvd.mo74062i();
        }
    }

    /* renamed from: a */
    public final void mo52763a(bkht bkht) {
        bkie bkie = this.f95281f;
        if (bkie != null) {
            bkie.mo66015a(bkht.f124247e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51908a(bmaf bmaf) {
        throw new UnsupportedOperationException("Refreshes are not supported by Timeline view");
    }

    /* renamed from: a */
    public final void mo52764a(bmaq bmaq, bwgz bwgz, bmar bmar, bwkr bwkr, List list, bmav bmav, boolean z, String str) {
        mo52853a(bmav, bmaq);
        TimelineViewFragment$TimelineViewPageDetails timelineViewFragment$TimelineViewPageDetails = new TimelineViewFragment$TimelineViewPageDetails();
        timelineViewFragment$TimelineViewPageDetails.f110460i = bwkr;
        if (!(bwkr == null || (bwkr.f160011a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0)) {
            bmkw bmkw = bwkr.f160026p;
            if (bmkw == null) {
                bmkw = bmkw.f129898c;
            }
            timelineViewFragment$TimelineViewPageDetails.f110463l = bmkw;
        }
        timelineViewFragment$TimelineViewPageDetails.f110457f = list;
        timelineViewFragment$TimelineViewPageDetails.f110468q = bmav;
        timelineViewFragment$TimelineViewPageDetails.f110454c = bwgz;
        timelineViewFragment$TimelineViewPageDetails.f110465n = bmaq;
        timelineViewFragment$TimelineViewPageDetails.f110467p = bmar;
        mo52364a(timelineViewFragment$TimelineViewPageDetails, z, str);
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        bmmp bmmp;
        bxvw bxvw;
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
            bxvw = bmmp.f130034a;
        } else {
            bxvw = null;
        }
        if (mo52804a((List) bxvw)) {
            byte[] k = bmmp.f130037d.mo73780k();
            bwks bwks = (bwks) mo52885b(Bundle.EMPTY, (byte[]) null, (List) null);
            if (k != null && k.length > 0) {
                bxvd bxvd = (bxvd) bwks.mo74142c(5);
                bxvd.mo73625a((bxvk) bwks);
                bxtx a2 = bxtx.m123261a(k);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bwks bwks2 = (bwks) bxvd.f164949b;
                bwks bwks3 = bwks.f160029e;
                a2.getClass();
                bwks2.f160031a = 1 | bwks2.f160031a;
                bwks2.f160032b = a2;
                bwks = (bwks) bxvd.mo74062i();
            }
            mo52895f(bwks);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52765a(bwhy bwhy, byte[] bArr) {
        bwks bwks = (bwks) mo52885b(Bundle.EMPTY, (byte[]) null, (List) null);
        if (bwhy != null) {
            bxvd bxvd = (bxvd) bwks.mo74142c(5);
            bxvd.mo73625a((bxvk) bwks);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bwks bwks2 = (bwks) bxvd.f164949b;
            bwks bwks3 = bwks.f160029e;
            bwhy.getClass();
            bwks2.f160033c = bwhy;
            bwks2.f160031a |= 2;
            bwks = (bwks) bxvd.mo74062i();
        }
        if (bArr != null && bArr.length > 0) {
            bxvd bxvd2 = (bxvd) bwks.mo74142c(5);
            bxvd2.mo73625a((bxvk) bwks);
            bxtx a = bxtx.m123261a(bArr);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bwks bwks4 = (bwks) bxvd2.f164949b;
            bwks bwks5 = bwks.f160029e;
            a.getClass();
            bwks4.f160031a |= 1;
            bwks4.f160032b = a;
            bwks = (bwks) bxvd2.mo74062i();
        }
        mo52895f(bwks);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51911a(Object obj) {
        if (obj instanceof bwkp) {
            mo52900j(2);
            mo52839Y().f94357a.mo52418a((bwkp) obj);
            mo52808n(false);
        } else if (obj instanceof bwkt) {
            mo52900j(3);
            mo52839Y().f94357a.mo52419a((bwkt) obj, this.f95398ak.f110467p);
            mo52808n(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo51912a(PageDetails pageDetails) {
        bwkr bwkr = (bwkr) pageDetails.f110460i;
        if ((bwkr.f160011a & 16) != 0) {
            bmev bmev = bwkr.f160021k;
            if (bmev == null) {
                bmev = bmev.f129037e;
            }
            this.f95277b = bmev;
            bkie bkie = this.f95281f;
            if (bkie != null) {
                bkie.f123958c = null;
                getFragmentManager().beginTransaction().remove(this.f95281f).commit();
            }
            bkie a = bkie.m105766a(null, bmev.f129042d, this.f123961aF);
            this.f95281f = a;
            a.f123958c = this;
            a.f124269a = this;
            a.show(getFragmentManager(), "tagDocumentDownloadDialog");
            m81502C();
            return true;
        }
        mo52860a(pageDetails, 6);
        return false;
    }
}
