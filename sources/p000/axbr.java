package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.common.FifeNetworkImageView;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import com.google.android.wallet.p097ui.common.SelectorView;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: axbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axbr extends bkdx implements bkdb, bkfe, bjwt, bjwp {

    /* renamed from: C */
    private String f95701C;

    /* renamed from: a */
    public SelectorView f95702a;

    /* renamed from: b */
    axbk f95703b;

    /* renamed from: c */
    public bkdx f95704c;

    /* renamed from: d */
    awzs f95705d;

    /* renamed from: e */
    axcn f95706e;

    /* renamed from: f */
    ImageWithCaptionView f95707f;

    /* renamed from: g */
    FrameLayout f95708g;

    /* renamed from: h */
    TextView f95709h;

    /* renamed from: i */
    FrameLayout f95710i;

    /* renamed from: j */
    View f95711j;

    /* renamed from: k */
    public Object f95712k;

    /* renamed from: l */
    LogContext f95713l;

    /* renamed from: m */
    boolean f95714m = false;

    /* renamed from: n */
    public final C1230nw f95715n = new C1230nw();

    /* renamed from: o */
    final C1230nw f95716o = new C1230nw();

    /* renamed from: p */
    public boolean f95717p;

    /* renamed from: q */
    public boolean f95718q;

    /* renamed from: r */
    public final bjes f95719r = new bjes(1730);

    /* renamed from: s */
    private ConstraintLayout f95720s;

    /* renamed from: t */
    private final List f95721t = new ArrayList();

    /* renamed from: u */
    private boolean f95722u;

    /* renamed from: v */
    private final bkip f95723v = new bkip();

    /* renamed from: a */
    public static axbr m82191a(bmgn bmgn, int i, String str, LogContext logContext, BuyFlowConfig buyFlowConfig) {
        axbr axbr = new axbr();
        Bundle a = bkdx.m105383a(i, bmgn, logContext);
        a.putString("analyticsSessionId", str);
        a.putParcelable("buyFlowConfig", buyFlowConfig);
        axbr.setArguments(a);
        return axbr;
    }

    /* renamed from: b */
    private static long m82194b(Object obj) {
        long j = obj instanceof bmgk ? ((bmgk) obj).f129248b : obj instanceof bmgd ? ((bmgd) obj).f129216b : 0;
        if (obj == null || j != 0) {
            return j;
        }
        throw new IllegalStateException("UiReference is not set for option");
    }

    /* renamed from: B */
    public final boolean mo52723B() {
        if (this.f95717p) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("EventListener.EXTRA_ENABLE_UI_ENABLED", false);
            mo51905a(18, bundle);
            this.f95718q = true;
            return false;
        }
        awzs awzs = this.f95705d;
        if (awzs != null) {
            awzs.mo65882c(true);
        }
        axbk axbk = this.f95703b;
        if (axbk != null) {
            axbk.mo65882c(true);
        }
        bkdx bkdx = this.f95704c;
        if (bkdx != null) {
            bkdx.mo65882c(true);
        }
        int childCount = this.f95702a.getChildCount();
        bkfr.m105567a(this.f95702a, getResources().getQuantityString(C0126R.plurals.wallet_expanding_instrument_selector, childCount, Integer.valueOf(childCount)));
        return true;
    }

    /* renamed from: C */
    public final void mo52724C() {
        if (this.f95707f != null) {
            C0973ew ewVar = new C0973ew();
            ewVar.mo10543a(this.f95720s);
            ewVar.mo10541a((int) C0126R.C0129id.header_icon_container, 3);
            ewVar.mo10545b(this.f95720s);
        }
        FrameLayout frameLayout = this.f95710i;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    /* renamed from: D */
    public final void mo52725D() {
        if (this.f95707f != null) {
            C0973ew ewVar = new C0973ew();
            ewVar.mo10543a(this.f95720s);
            ewVar.mo10541a((int) C0126R.C0129id.instrument_selector_header_container, 4);
            ewVar.mo10545b(this.f95720s);
        }
        FrameLayout frameLayout = this.f95710i;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }

    /* renamed from: W */
    public final long mo52837W() {
        mo65884y();
        return ((bmgn) this.f124069w).f129276b;
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        if (!(this.f95712k instanceof bmgk) && this.f95704c == null) {
            return false;
        }
        axbk axbk = this.f95703b;
        if (axbk != null && !axbk.mo52775bR()) {
            return false;
        }
        bkdx bkdx = this.f95704c;
        if (bkdx == null || bkdx.mo52775bR()) {
            return true;
        }
        return false;
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f95723v;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        ArrayList arrayList = new ArrayList(3);
        awzs awzs = this.f95705d;
        if (awzs != null) {
            arrayList.add(awzs);
        }
        axbk axbk = this.f95703b;
        if (axbk != null) {
            arrayList.add(axbk);
        }
        bkdx bkdx = this.f95704c;
        if (bkdx != null) {
            arrayList.add(bkdx);
        }
        return arrayList;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        ArrayList arrayList = new ArrayList(2);
        axbk axbk = this.f95703b;
        if (axbk != null) {
            arrayList.add(new bkde(axbk));
        }
        bkdx bkdx = this.f95704c;
        if (bkdx != null) {
            arrayList.add(new bkde(bkdx));
        }
        return arrayList;
    }

    /* renamed from: bY */
    public final void mo52947bY() {
        super.mo52947bY();
        axbk axbk = this.f95703b;
        if (axbk != null) {
            axbk.mo52947bY();
        }
        bkdx bkdx = this.f95704c;
        if (bkdx != null) {
            bkdx.mo52947bY();
        }
        bxwc bxwc = ((bmgn) this.f124069w).f129278d;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bmgk bmgk = (bmgk) bxwc.get(i);
            bmfu bmfu = bmgk.f129255i;
            if (bmfu == null) {
                bmfu = bmfu.f129167j;
            }
            bmki bmki = bmfu.f129176h;
            if (bmki == null) {
                bmki = bmki.f129802w;
            }
            if ((bmki.f129804a & 1) != 0) {
                bmfu bmfu2 = bmgk.f129255i;
                if (bmfu2 == null) {
                    bmfu2 = bmfu.f129167j;
                }
                bmki bmki2 = bmfu2.f129176h;
                if (bmki2 == null) {
                    bmki2 = bmki.f129802w;
                }
                bmdn bmdn = bmki2.f129805b;
                if (bmdn == null) {
                    bmdn = bmdn.f128831k;
                }
                bjwl.m104790b(this, bmdn.f128835c, this.f124196aK);
            }
        }
    }

    /* renamed from: cl */
    public final bwdm mo52930cl() {
        Object obj = this.f95712k;
        if (!(obj instanceof bmgk)) {
            return null;
        }
        bmgk bmgk = (bmgk) obj;
        if ((bmgk.f129247a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) == 0) {
            return null;
        }
        bwdm bwdm = bmgk.f129263q;
        return bwdm == null ? bwdm.f158904d : bwdm;
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f95719r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        boolean z = this.f124195aJ;
        ImageWithCaptionView imageWithCaptionView = this.f95707f;
        if (imageWithCaptionView != null) {
            imageWithCaptionView.setEnabled(z);
        }
        SelectorView selectorView = this.f95702a;
        if (selectorView != null) {
            selectorView.setEnabled(z);
        }
        axbk axbk = this.f95703b;
        if (axbk != null) {
            axbk.mo52808n(z);
        }
        bkdx bkdx = this.f95704c;
        if (bkdx != null) {
            bkdx.mo52808n(z);
        }
        awzs awzs = this.f95705d;
        if (awzs != null) {
            awzs.mo52808n(z);
        }
    }

    /* renamed from: m */
    public final void mo52994m() {
        int width = this.f95708g.getWidth();
        int childCount = this.f95702a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f95702a.getChildAt(i);
            if (childAt instanceof axbs) {
                axbs axbs = (axbs) childAt;
                axbs.f95730h = true;
                axbs.f95732j = Math.max(axbs.f95731i, width);
            }
        }
        this.f95702a.mo72099h();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f95701C = getArguments().getString("analyticsSessionId");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Object obj = this.f95712k;
        if (obj instanceof bmgk) {
            bjvp.m104736a(bundle, "selectedInstrument", (bmgk) obj);
        } else if (obj instanceof bmgd) {
            bjvp.m104736a(bundle, "selectedAdditionalOption", (bmgd) obj);
        }
        bundle.putBoolean("isUpdatingInstrumentSelectorRequired", this.f95717p);
        bundle.putBoolean("isWaitingForUpdatedInstrumentSelector", this.f95718q);
        int b = this.f95716o.mo15537b();
        long[] jArr = new long[b];
        Bundle[] bundleArr = new Bundle[b];
        for (int i = 0; i < b; i++) {
            long a = this.f95716o.mo15533a(i);
            jArr[i] = a;
            bundleArr[i] = (Bundle) this.f95716o.mo15534a(a);
        }
        bundle.putLongArray("redirectFormSavedStateKeys", jArr);
        bundle.putParcelableArray("redirectFormSavedStateValues", bundleArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmgn.f129273o.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        return null;
    }

    /* renamed from: t */
    public final axcn mo52995t() {
        if (this.f95706e == null) {
            this.f95706e = axcn.m82317a(this);
        }
        return this.f95706e;
    }

    /* renamed from: z */
    public final void mo52731z() {
        awzs awzs = this.f95705d;
        if (awzs != null) {
            awzs.mo65882c(false);
        }
        axbk axbk = this.f95703b;
        if (axbk != null) {
            axbk.mo65882c(false);
        }
        bkdx bkdx = this.f95704c;
        if (bkdx != null) {
            bkdx.mo65882c(false);
        }
    }

    /* renamed from: b */
    public final String mo52922b(String str) {
        Object obj = this.f95712k;
        if (obj instanceof bmgk) {
            return ((bmgk) obj).f129251e;
        }
        return !(obj instanceof bmgd) ? "" : this.f95704c.mo52823a(str);
    }

    /* renamed from: b */
    public final void mo52058b(Intent intent) {
        if (chhm.f188622a.mo6606a().mo85238a()) {
            bkdx bkdx = this.f95704c;
            if (bkdx instanceof bjwt) {
                ((bjwt) bkdx).mo52058b(intent);
                return;
            }
            return;
        }
        bkdx bkdx2 = this.f95704c;
        if (bkdx2 instanceof axbb) {
            ((axbb) bkdx2).mo52058b(intent);
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
    private final void m82192a(Object obj) {
        FragmentManager childFragmentManager = getChildFragmentManager();
        FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
        awzs awzs = this.f95705d;
        if (awzs != null) {
            this.f95723v.mo66036b(awzs);
            beginTransaction.remove(this.f95705d);
            this.f95705d = null;
        }
        axbk axbk = this.f95703b;
        if (axbk != null) {
            this.f95723v.mo66036b(axbk);
            beginTransaction.remove(this.f95703b);
            this.f95703b.mo52947bY();
            this.f95703b = null;
        }
        bkdx bkdx = this.f95704c;
        if (bkdx != null) {
            if (bkdx instanceof bkiz) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("previouslyLaunchedAndAborted", ((bkiz) this.f95704c).f124351m);
                this.f95716o.mo15540b(this.f95704c.mo52837W(), bundle);
            }
            this.f95723v.mo66036b(this.f95704c);
            beginTransaction.remove(this.f95704c);
            this.f95704c.mo52947bY();
            this.f95704c = null;
        }
        beginTransaction.commit();
        childFragmentManager.executePendingTransactions();
        int i = 0;
        if (obj instanceof bmgk) {
            bmgk bmgk = (bmgk) obj;
            if ((bmgk.f129247a & 32) != 0) {
                FragmentManager childFragmentManager2 = getChildFragmentManager();
                long j = bmgk.f129248b;
                StringBuilder sb = new StringBuilder(34);
                sb.append(j);
                sb.append("descriptionTag");
                String sb2 = sb.toString();
                awzs awzs2 = (awzs) childFragmentManager2.findFragmentByTag(sb2);
                this.f95705d = awzs2;
                if (awzs2 == null) {
                    bmeb bmeb = bmgk.f129254h;
                    if (bmeb == null) {
                        bmeb = bmeb.f128902g;
                    }
                    this.f95705d = awzs.m81798a(bmeb, this.f123961aF, this.f95701C, this.f95713l);
                    childFragmentManager2.beginTransaction().replace(C0126R.C0129id.description_form_holder, this.f95705d, sb2).commit();
                }
                this.f95723v.mo66032a(this.f95705d);
            }
            if (awia.m79998b(bmgk)) {
                FragmentManager childFragmentManager3 = getChildFragmentManager();
                sdo.m34971a((bmgk.f129247a & 2048) != 0, (Object) "Editable instruments should have fixInfoForm");
                long j2 = bmgk.f129248b;
                StringBuilder sb3 = new StringBuilder(30);
                sb3.append(j2);
                sb3.append("fixInfoTag");
                String sb4 = sb3.toString();
                axbk axbk2 = (axbk) childFragmentManager3.findFragmentByTag(sb4);
                this.f95703b = axbk2;
                if (axbk2 == null) {
                    bmge bmge = bmgk.f129260n;
                    if (bmge == null) {
                        bmge = bmge.f129225f;
                    }
                    int i2 = this.f123961aF;
                    String str = this.f95701C;
                    LogContext logContext = this.f95713l;
                    axbk axbk3 = new axbk();
                    Bundle a = bkdx.m105383a(i2, bmge, logContext);
                    a.putString("analyticsSessionId", str);
                    axbk3.setArguments(a);
                    this.f95703b = axbk3;
                    childFragmentManager3.beginTransaction().replace(C0126R.C0129id.fix_info_form_holder, this.f95703b, sb4).commit();
                }
                bjwk bjwk = this.f124196aK;
                if (bjwk != null) {
                    this.f95703b.f124196aK = bjwk;
                }
                this.f95723v.mo66032a(this.f95703b);
            }
            if ((bmgk.f129247a & 64) != 0) {
                bmfu bmfu = bmgk.f129255i;
                if (bmfu == null) {
                    bmfu = bmfu.f129167j;
                }
                mo52993a(bmfu, bmgk.f129251e);
            }
        } else if (obj instanceof bmgd) {
            bmgd bmgd = (bmgd) obj;
            if ((bmgd.f129215a & 16) != 0) {
                bmfu bmfu2 = bmgd.f129219e;
                if (bmfu2 == null) {
                    bmfu2 = bmfu.f129167j;
                }
                mo52993a(bmfu2, bmgd.f129217c);
            }
        }
        View view = this.f95711j;
        if (this.f95722u || this.f124071y || mo52777bV().isEmpty()) {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    private final void m82193a(Object obj, boolean z) {
        if (obj instanceof bmgk) {
            bmgk bmgk = (bmgk) obj;
            if ((bmgk.f129247a & 4096) != 0) {
                if (z || mo52995t() == null) {
                    BuyFlowConfig buyFlowConfig = (BuyFlowConfig) getArguments().getParcelable("buyFlowConfig");
                    bmkl bmkl = bmgk.f129261o;
                    if (bmkl == null) {
                        bmkl = bmkl.f129847j;
                    }
                    axcn a = axcn.m82318a(this, bmkl, mo65980at(), buyFlowConfig);
                    this.f95706e = a;
                    a.f124196aK = this.f124196aK;
                    return;
                }
                return;
            }
        }
        if (mo52995t() != null) {
            axcn.m82319b(this);
            this.f95706e = null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0445  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0496  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0498  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x04a1  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x04f0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x017d A[LOOP:1: B:43:0x017b->B:44:0x017d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x019a A[LOOP:2: B:46:0x0198->B:47:0x019a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x020b  */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object obj;
        int size;
        int i;
        int size2;
        int i2;
        bmgh[] bmghArr;
        int length;
        int i3;
        boolean z;
        int i4;
        bxvw bxvw;
        boolean z2;
        bmdn bmdn;
        Object obj2;
        String str;
        bxvd da;
        bmno bmno;
        bmno bmno2;
        int length2;
        Bundle bundle2 = bundle;
        if (bundle2 != null) {
            long[] longArray = bundle2.getLongArray("redirectFormSavedStateKeys");
            Parcelable[] parcelableArray = bundle2.getParcelableArray("redirectFormSavedStateValues");
            if (!(longArray == null || parcelableArray == null || (length2 = longArray.length) != parcelableArray.length)) {
                for (int i5 = 0; i5 < length2; i5++) {
                    this.f95716o.mo15540b(longArray[i5], (Bundle) parcelableArray[i5]);
                }
            }
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_instrument_selector, (ViewGroup) null, false);
        this.f95720s = constraintLayout;
        SelectorView selectorView = (SelectorView) constraintLayout.findViewById(C0126R.C0129id.instrument_selector_view);
        this.f95702a = selectorView;
        this.f95723v.mo66032a((bkiq) selectorView);
        SelectorView selectorView2 = this.f95702a;
        selectorView2.f152209e = this;
        selectorView2.f152210f = this;
        selectorView2.f152212h = mo65980at();
        this.f95702a.f152211g = mo52837W();
        int i6 = 2;
        int i7 = 1;
        if (bundle2 != null) {
            this.f95717p = bundle2.getBoolean("isUpdatingInstrumentSelectorRequired");
            this.f95718q = bundle2.getBoolean("isWaitingForUpdatedInstrumentSelector");
        } else {
            this.f95717p = awfo.m79853a((bmgn) this.f124069w) == 2;
        }
        this.f95711j = this.f95720s.findViewById(C0126R.C0129id.instrument_selector_form_separator);
        if ((((bmgn) this.f124069w).f129275a & 512) != 0 && ((Boolean) awjl.f94550l.mo58455c()).booleanValue()) {
            this.f95707f = (ImageWithCaptionView) this.f95720s.findViewById(C0126R.C0129id.header_icon);
            this.f95708g = (FrameLayout) this.f95720s.findViewById(C0126R.C0129id.header_icon_container);
            ImageWithCaptionView imageWithCaptionView = this.f95707f;
            bmgn bmgn = (bmgn) this.f124069w;
            if ((bmgn.f129275a & 512) != 0) {
                bmno2 = bmgn.f129288n;
                if (bmno2 == null) {
                    bmno2 = bmno.f130138m;
                }
            } else {
                bmno2 = null;
            }
            imageWithCaptionView.mo71992a(bmno2, awia.m79973a(), ((Boolean) awir.f94488a.mo58455c()).booleanValue());
            this.f95708g.setVisibility(0);
        }
        if (!((bmgn) this.f124069w).f129277c.isEmpty()) {
            this.f95709h = (TextView) this.f95720s.findViewById(C0126R.C0129id.instrument_selector_header);
            this.f95710i = (FrameLayout) this.f95720s.findViewById(C0126R.C0129id.instrument_selector_header_container);
            this.f95709h.setText(((bmgn) this.f124069w).f129277c);
            this.f95709h.setTag(C0126R.C0129id.summary_expander_transition_name, "expandedField");
        }
        if (bundle2 != null) {
            if (bundle2.containsKey("selectedInstrument")) {
                obj = bjvp.m104730a(bundle2, "selectedInstrument", (bxxk) bmgk.f129245r.mo74142c(7));
            } else if (bundle2.containsKey("selectedAdditionalOption")) {
                obj = bjvp.m104730a(bundle2, "selectedAdditionalOption", (bxxk) bmgd.f129213j.mo74142c(7));
            }
            if (obj == null) {
                obj = awev.m79818a((bmgn) this.f124069w);
            }
            this.f95702a.removeAllViews();
            this.f95715n.mo15542c();
            Activity activity = getActivity();
            bxwc bxwc = ((bmgn) this.f124069w).f129278d;
            size = bxwc.size();
            for (i = 0; i < size; i++) {
                bmgk bmgk = (bmgk) bxwc.get(i);
                this.f95715n.mo15540b(bmgk.f129248b, bmgk);
            }
            bxwc bxwc2 = ((bmgn) this.f124069w).f129279e;
            size2 = bxwc2.size();
            for (i2 = 0; i2 < size2; i2++) {
                bmgd bmgd = (bmgd) bxwc2.get(i2);
                this.f95715n.mo15540b(bmgd.f129216b, bmgd);
            }
            bmghArr = (bmgh[]) ((bmgn) this.f124069w).f129280f.toArray(new bmgh[0]);
            if (bmghArr.length == 0) {
                bmgh[] bmghArr2 = new bmgh[1];
                bmgg bmgg = (bmgg) bmgh.f129239d.mo74144da();
                bxwc bxwc3 = ((bmgn) this.f124069w).f129278d;
                int size3 = bxwc3.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    bmgg.mo66787a(((bmgk) bxwc3.get(i8)).f129248b);
                }
                bxwc bxwc4 = ((bmgn) this.f124069w).f129279e;
                int size4 = bxwc4.size();
                for (int i9 = 0; i9 < size4; i9++) {
                    bmgg.mo66787a(((bmgd) bxwc4.get(i9)).f129216b);
                }
                bmghArr2[0] = (bmgh) bmgg.mo74062i();
                bmghArr = bmghArr2;
            }
            length = bmghArr.length;
            i3 = 0;
            while (i3 < length) {
                bmgh bmgh = bmghArr[i3];
                if ((bmgh.f129241a & i7) != 0) {
                    ContextThemeWrapper contextThemeWrapper = this.f123962aG;
                    bmnr bmnr = bmgh.f129242b;
                    if (bmnr == null) {
                        bmnr = bmnr.f130153o;
                    }
                    axbl axbl = new axbl(contextThemeWrapper);
                    axbl.f124136q = bmnr;
                    axbl.f95694a.mo72003a(bmnr);
                    this.f95702a.addView(axbl);
                }
                bxvw bxvw2 = bmgh.f129243c;
                int size5 = bxvw2.size();
                int i10 = 0;
                while (i10 < size5) {
                    Object a = this.f95715n.mo15534a(((Long) bxvw2.get(i10)).longValue());
                    if (a instanceof bmgk) {
                        bmgk bmgk2 = (bmgk) a;
                        int a2 = bmgj.m108003a(bmgk2.f129259m);
                        if (a2 != 0 && a2 == 6) {
                            bxvw = bxvw2;
                        } else {
                            axbm axbm = new axbm(activity);
                            axbm.mo52987a(bmgk2);
                            bxvw = bxvw2;
                            axbm.mo65945a(bmgk2.f129248b);
                            axbm.f124133n = this.f124071y;
                            this.f95702a.addView(axbm);
                        }
                    } else {
                        bxvw = bxvw2;
                        if (a instanceof bmgd) {
                            bmgd bmgd2 = (bmgd) a;
                            int a3 = bmgc.m107996a(bmgd2.f129223i);
                            if (a3 == 0 || a3 != i6) {
                                if ((bmgd2.f129215a & 16) != 0) {
                                    axbj a4 = axbj.m82161a(activity, bmgd2);
                                    a4.f124133n = this.f124071y;
                                    this.f95702a.addView(a4);
                                } else if (bmgd2.f129220f.size() <= 0) {
                                    continue;
                                } else {
                                    if (m82194b(obj) == m82194b(bmgd2)) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    bxwc bxwc5 = bmgd2.f129220f;
                                    int size6 = bxwc5.size();
                                    int i11 = 0;
                                    while (i11 < size6) {
                                        bmfu bmfu = (bmfu) bxwc5.get(i11);
                                        int i12 = bmfu.f129169a;
                                        if ((i12 & 1) != 0) {
                                            bmhy bmhy = bmfu.f129170b;
                                            if (bmhy == null) {
                                                bmhy = bmhy.f129503u;
                                            }
                                            bmdn = bmhy.f129506b;
                                            if (bmdn == null) {
                                                bmdn = bmdn.f128831k;
                                            }
                                        } else if ((i12 & 4) != 0) {
                                            bmjb bmjb = bmfu.f129172d;
                                            if (bmjb == null) {
                                                bmjb = bmjb.f129661l;
                                            }
                                            bmdn = bmjb.f129664b;
                                            if (bmdn == null) {
                                                bmdn = bmdn.f128831k;
                                            }
                                        } else if ((i12 & 32) != 0) {
                                            bmhi bmhi = bmfu.f129175g;
                                            if (bmhi == null) {
                                                bmhi = bmhi.f129409r;
                                            }
                                            bmdn = bmhi.f129412b;
                                            if (bmdn == null) {
                                                bmdn = bmdn.f128831k;
                                            }
                                        } else if ((i12 & 16) != 0) {
                                            bmgp bmgp = bmfu.f129174f;
                                            if (bmgp == null) {
                                                bmgp = bmgp.f129296i;
                                            }
                                            bmdn = bmgp.f129299b;
                                            if (bmdn == null) {
                                                bmdn = bmdn.f128831k;
                                            }
                                        } else if ((i12 & 8) != 0) {
                                            bmeb bmeb = bmfu.f129173e;
                                            if (bmeb == null) {
                                                bmeb = bmeb.f128902g;
                                            }
                                            bmdn = bmeb.f128905b;
                                            if (bmdn == null) {
                                                bmdn = bmdn.f128831k;
                                            }
                                        } else if ((i12 & 2) != 0) {
                                            bmil bmil = bmfu.f129171c;
                                            if (bmil == null) {
                                                bmil = bmil.f129588g;
                                            }
                                            bmdn = bmil.f129591b;
                                            if (bmdn == null) {
                                                bmdn = bmdn.f128831k;
                                            }
                                        } else if ((i12 & 64) != 0) {
                                            bmki bmki = bmfu.f129176h;
                                            if (bmki == null) {
                                                bmki = bmki.f129802w;
                                            }
                                            bmdn = bmki.f129805b;
                                            if (bmdn == null) {
                                                bmdn = bmdn.f128831k;
                                            }
                                        } else {
                                            throw new IllegalArgumentException("Unknown Instrument Form");
                                        }
                                        if (bmdn != null) {
                                            obj2 = obj;
                                            if ((bmdn.f128833a & 8) != 0) {
                                                str = bmdn.f128837e;
                                                da = bmgd.f129213j.mo74144da();
                                                if (TextUtils.isEmpty(str)) {
                                                    str = bmgd2.f129217c;
                                                }
                                                bmgh[] bmghArr3 = bmghArr;
                                                if (da.f164950c) {
                                                    da.mo74035c();
                                                    da.f164950c = false;
                                                }
                                                bmgd bmgd3 = (bmgd) da.f164949b;
                                                str.getClass();
                                                int i13 = length;
                                                bmgd3.f129215a |= 2;
                                                bmgd3.f129217c = str;
                                                bmno = bmgd2.f129218d;
                                                if (bmno == null) {
                                                    bmno = bmno.f130138m;
                                                }
                                                if (da.f164950c) {
                                                    da.mo74035c();
                                                    da.f164950c = false;
                                                }
                                                bmgd bmgd4 = (bmgd) da.f164949b;
                                                bmno.getClass();
                                                bmgd4.f129218d = bmno;
                                                int i14 = bmgd4.f129215a | 4;
                                                bmgd4.f129215a = i14;
                                                bxwc bxwc6 = bxwc5;
                                                int i15 = size6;
                                                long j = bmgd2.f129216b;
                                                int i16 = i14 | 1;
                                                bmgd4.f129215a = i16;
                                                bmgd4.f129216b = j;
                                                bmfu.getClass();
                                                bmgd4.f129219e = bmfu;
                                                bmgd4.f129215a = i16 | 16;
                                                bmgd bmgd5 = (bmgd) da.mo74062i();
                                                axbj a5 = axbj.m82161a(activity, bmgd5);
                                                a5.f124133n = this.f124071y;
                                                this.f95702a.addView(a5);
                                                boolean z3 = (!z2) & z2;
                                                obj = z2 ? obj2 : bmgd5;
                                                i11++;
                                                z2 = z3;
                                                bxwc5 = bxwc6;
                                                bmghArr = bmghArr3;
                                                length = i13;
                                                size6 = i15;
                                            }
                                        } else {
                                            obj2 = obj;
                                        }
                                        str = null;
                                        da = bmgd.f129213j.mo74144da();
                                        if (TextUtils.isEmpty(str)) {
                                        }
                                        bmgh[] bmghArr32 = bmghArr;
                                        if (da.f164950c) {
                                        }
                                        bmgd bmgd32 = (bmgd) da.f164949b;
                                        str.getClass();
                                        int i132 = length;
                                        bmgd32.f129215a |= 2;
                                        bmgd32.f129217c = str;
                                        bmno = bmgd2.f129218d;
                                        if (bmno == null) {
                                        }
                                        if (da.f164950c) {
                                        }
                                        bmgd bmgd42 = (bmgd) da.f164949b;
                                        bmno.getClass();
                                        bmgd42.f129218d = bmno;
                                        int i142 = bmgd42.f129215a | 4;
                                        bmgd42.f129215a = i142;
                                        bxwc bxwc62 = bxwc5;
                                        int i152 = size6;
                                        long j2 = bmgd2.f129216b;
                                        int i162 = i142 | 1;
                                        bmgd42.f129215a = i162;
                                        bmgd42.f129216b = j2;
                                        bmfu.getClass();
                                        bmgd42.f129219e = bmfu;
                                        bmgd42.f129215a = i162 | 16;
                                        bmgd bmgd52 = (bmgd) da.mo74062i();
                                        axbj a52 = axbj.m82161a(activity, bmgd52);
                                        a52.f124133n = this.f124071y;
                                        this.f95702a.addView(a52);
                                        boolean z32 = (!z2) & z2;
                                        if (z2) {
                                        }
                                        i11++;
                                        z2 = z32;
                                        bxwc5 = bxwc62;
                                        bmghArr = bmghArr32;
                                        length = i132;
                                        size6 = i152;
                                    }
                                }
                            }
                        } else {
                            throw new IllegalStateException("Unknown option type");
                        }
                    }
                    i10++;
                    bxvw2 = bxvw;
                    bmghArr = bmghArr;
                    length = length;
                    i6 = 2;
                }
                i3++;
                i6 = 2;
                i7 = 1;
            }
            if (this.f95702a.getChildCount() == 1 || !((bmgn) this.f124069w).f129287m) {
                z = false;
            } else {
                z = true;
            }
            this.f95722u = z;
            if (obj == null) {
                SelectorView selectorView3 = this.f95702a;
                ArrayList arrayList = new ArrayList();
                int childCount = selectorView3.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    arrayList.add(((bkfc) selectorView3.mo72095a(i17)).mo65943f());
                }
                int size7 = arrayList.size();
                int i18 = 0;
                while (i18 < size7) {
                    obj = arrayList.get(i18);
                    if ((obj instanceof bmgk) && !awia.m80002c((bmgk) obj)) {
                        i18++;
                    }
                }
                throw new IllegalStateException("No available options to display to the user.");
            }
            this.f95702a.mo72096a(m82194b(obj));
            SelectorView selectorView4 = this.f95702a;
            if (this.f95722u) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            selectorView4.setVisibility(i4);
            if (this.f95707f != null) {
                if (!this.f95722u) {
                    this.f95708g.setVisibility(0);
                    bmno bmno3 = ((bmgn) this.f124069w).f129288n;
                    if (bmno3 == null) {
                        bmno3 = bmno.f130138m;
                    }
                    if (bjvn.m104718a(bmno3.f130142c)) {
                        this.f95707f.post(new axbn(this));
                    } else {
                        ((FifeNetworkImageView) this.f95707f).f151949h = new axbo(this);
                    }
                } else {
                    this.f95708g.setVisibility(8);
                }
            }
            if (bundle2 == null && ((bmgn) this.f124069w).f129283i) {
                this.f95702a.f152205a.mo66025a(1);
            }
            if (this.f95717p) {
                mo51905a(26, Bundle.EMPTY);
            }
            return this.f95720s;
        }
        obj = null;
        if (obj == null) {
        }
        this.f95702a.removeAllViews();
        this.f95715n.mo15542c();
        Activity activity2 = getActivity();
        bxwc bxwc7 = ((bmgn) this.f124069w).f129278d;
        size = bxwc7.size();
        while (i < size) {
        }
        bxwc bxwc22 = ((bmgn) this.f124069w).f129279e;
        size2 = bxwc22.size();
        while (i2 < size2) {
        }
        bmghArr = (bmgh[]) ((bmgn) this.f124069w).f129280f.toArray(new bmgh[0]);
        if (bmghArr.length == 0) {
        }
        length = bmghArr.length;
        i3 = 0;
        while (i3 < length) {
        }
        if (this.f95702a.getChildCount() == 1) {
        }
        z = false;
        this.f95722u = z;
        if (obj == null) {
        }
        this.f95702a.mo72096a(m82194b(obj));
        SelectorView selectorView42 = this.f95702a;
        if (this.f95722u) {
        }
        selectorView42.setVisibility(i4);
        if (this.f95707f != null) {
        }
        this.f95702a.f152205a.mo66025a(1);
        if (this.f95717p) {
        }
        return this.f95720s;
    }

    /* renamed from: a */
    public final bmgo mo52992a(Bundle bundle) {
        bkdx bkdx;
        axbk axbk;
        bkdx bkdx2;
        axbf axbf;
        bjzo bjzo;
        bxvd da = bmgo.f129290e.mo74144da();
        Object obj = this.f95712k;
        if (obj instanceof bmgk) {
            bmgk bmgk = (bmgk) obj;
            bxvd da2 = bmgl.f129265g.mo74144da();
            String str = bmgk.f129249c;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bmgl bmgl = (bmgl) da2.f164949b;
            str.getClass();
            bmgl.f129267a |= 1;
            bmgl.f129268b = str;
            if (bmgk.f129250d.mo73744a() > 0) {
                ByteString bxtx = bmgk.f129250d;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bmgl bmgl2 = (bmgl) da2.f164949b;
                bxtx.getClass();
                bmgl2.f129267a |= 2;
                bmgl2.f129269c = bxtx;
            }
            if (awia.m79998b(bmgk) && (axbk = this.f95703b) != null) {
                bxvd da3 = bmgf.f129233e.mo74144da();
                if (!((((bmge) axbk.f124069w).f129227a & 4) == 0 || (bjzo = axbk.f95688a) == null)) {
                    bmbs a = bjzo.mo52928a(Bundle.EMPTY);
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bmgf bmgf = (bmgf) da3.f164949b;
                    a.getClass();
                    bmgf.f129236b = a;
                    bmgf.f129235a |= 1;
                }
                if (!((((bmge) axbk.f124069w).f129227a & 8) == 0 || (axbf = axbk.f95689b) == null)) {
                    bmif m = axbf.mo52980m();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bmgf bmgf2 = (bmgf) da3.f164949b;
                    m.getClass();
                    bmgf2.f129237c = m;
                    bmgf2.f129235a |= 2;
                }
                if (!((((bmge) axbk.f124069w).f129227a & 16) == 0 || (bkdx2 = axbk.f95690c) == null)) {
                    bmfv a2 = awia.m79972a(bkdx2, Bundle.EMPTY);
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bmgf bmgf3 = (bmgf) da3.f164949b;
                    a2.getClass();
                    bmgf3.f129238d = a2;
                    bmgf3.f129235a |= 4;
                }
                bmgf bmgf4 = (bmgf) da3.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bmgl bmgl3 = (bmgl) da2.f164949b;
                bmgf4.getClass();
                bmgl3.f129270d = bmgf4;
                bmgl3.f129267a |= 4;
            }
            bkdx bkdx3 = this.f95704c;
            if (bkdx3 != null) {
                bmfv a3 = awia.m79972a(bkdx3, bundle);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bmgl bmgl4 = (bmgl) da2.f164949b;
                a3.getClass();
                bmgl4.f129271e = a3;
                bmgl4.f129267a |= 8;
            }
            axcn axcn = this.f95706e;
            if (axcn != null && axcn.mo52775bR()) {
                bmkm x = this.f95706e.mo66087x();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bmgl bmgl5 = (bmgl) da2.f164949b;
                x.getClass();
                bmgl5.f129272f = x;
                bmgl5.f129267a |= 16;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmgo bmgo = (bmgo) da.f164949b;
            bmgl bmgl6 = (bmgl) da2.mo74062i();
            bmgl6.getClass();
            bmgo.f129293b = bmgl6;
            bmgo.f129292a = 1;
        } else if ((obj instanceof bmgd) && (bkdx = this.f95704c) != null) {
            bmfv a4 = awia.m79972a(bkdx, bundle);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmgo bmgo2 = (bmgo) da.f164949b;
            a4.getClass();
            bmgo2.f129293b = a4;
            bmgo2.f129292a = 2;
        }
        ArrayList arrayList = new ArrayList(5);
        ArrayList arrayList2 = new ArrayList(5);
        bxwc bxwc = ((bmgn) this.f124069w).f129278d;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bmgk bmgk2 = (bmgk) bxwc.get(i);
            int a5 = bmgj.m108003a(bmgk2.f129259m);
            if (a5 != 0 && a5 == 2) {
                arrayList.add(Long.valueOf(bmgk2.f129248b));
            } else {
                int a6 = bmgj.m108003a(bmgk2.f129259m);
                if (a6 != 0 && a6 == 6) {
                    arrayList2.add(Long.valueOf(bmgk2.f129248b));
                }
            }
        }
        bxwc bxwc2 = ((bmgn) this.f124069w).f129279e;
        int size2 = bxwc2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            bmgd bmgd = (bmgd) bxwc2.get(i2);
            int a7 = bmgc.m107996a(bmgd.f129223i);
            if (a7 != 0 && a7 == 2) {
                arrayList2.add(Long.valueOf(bmgd.f129216b));
            }
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmgo bmgo3 = (bmgo) da.f164949b;
        if (!bmgo3.f129294c.mo73666a()) {
            bmgo3.f129294c = GeneratedMessageLite.m124020a(bmgo3.f129294c);
        }
        bxsy.m123078a(arrayList, bmgo3.f129294c);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmgo bmgo4 = (bmgo) da.f164949b;
        if (!bmgo4.f129295d.mo73666a()) {
            bmgo4.f129295d = GeneratedMessageLite.m124020a(bmgo4.f129295d);
        }
        bxsy.m123078a(arrayList2, bmgo4.f129295d);
        return (bmgo) da.mo74062i();
    }

    /* renamed from: a */
    public final void mo51905a(int i, Bundle bundle) {
        if (i == 4) {
            Object obj = this.f95712k;
            if ((obj instanceof bmgd) && ((bmgd) obj).f129221g) {
                if (bundle == Bundle.EMPTY) {
                    bundle = new Bundle();
                }
                bundle.putBoolean("EventListener.EXTRA_SHOULD_AUTO_SUBMIT", true);
            }
        }
        super.mo51905a(i, bundle);
        if (this.f95714m && i == 4 && bkde.m105359l(mo52778bW())) {
            this.f124196aK.mo65592a(false);
            this.f95714m = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo52993a(bmfu bmfu, String str) {
        if (bmfu != null) {
            bkdx bkdx = (bkdx) getChildFragmentManager().findFragmentById(C0126R.C0129id.instrument_form_holder);
            this.f95704c = bkdx;
            if (bkdx == null || !awia.m79987a(bkdx, bmfu)) {
                bjwk bjwk = this.f124196aK;
                if (bjwk != null && !bjwk.f123518h) {
                    this.f95714m = true;
                    bjwk.mo65592a(true);
                }
                bkdx a = awia.m79969a(bmfu, this.f123961aF, str, this.f95701C, bpis.FLOW_TYPE_BUYFLOW, this.f95713l, (BuyFlowConfig) getArguments().getParcelable("buyFlowConfig"));
                this.f95704c = a;
                if (a instanceof bkiz) {
                    bkiz bkiz = (bkiz) a;
                    bkiz.f124350l = true;
                    Bundle bundle = (Bundle) this.f95716o.mo15534a(bkiz.mo52837W());
                    if (bundle != null) {
                        bkiz.f124351m = bundle.getBoolean("previouslyLaunchedAndAborted");
                    }
                }
                getChildFragmentManager().beginTransaction().replace(C0126R.C0129id.instrument_form_holder, this.f95704c).commit();
                OrchestrationViewEvent.m93828c(getActivity(), this.f95701C, this.f95704c.mo51919co());
            }
            bjwk bjwk2 = this.f124196aK;
            if (bjwk2 != null) {
                this.f95704c.f124196aK = bjwk2;
            }
            this.f95723v.mo66032a(this.f95704c);
        }
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        bmmq bmmq;
        long j;
        int a = bmmb.m108166a(bmmv.f130058d);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 17) {
            super.mo51910a(bmmv, list);
            return;
        }
        SelectorView selectorView = this.f95702a;
        if (bmmv.f130056b == 11) {
            bmmq = (bmmq) bmmv.f130057c;
        } else {
            bmmq = bmmq.f130039c;
        }
        if (bmmq.f130041a == 3) {
            j = ((Long) bmmq.f130042b).longValue();
        } else {
            j = 0;
        }
        selectorView.mo72096a(j);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axbr.a(java.lang.Object, boolean):void
     arg types: [bxxc, int]
     candidates:
      axbr.a(int, android.os.Bundle):void
      axbr.a(bmfu, java.lang.String):void
      axbr.a(bmmv, java.util.List):void
      axbr.a(java.lang.Object, java.lang.Object):void
      bkdx.a(android.os.Bundle, android.view.View):android.view.View
      bkdx.a(int, android.os.Bundle):void
      bkdx.a(bmmv, java.util.List):void
      bkdx.a(java.util.List, boolean):boolean
      bkge.a(android.os.Bundle, android.view.View):android.view.View
      bkge.a(int, android.os.Bundle):void
      bkge.a(android.view.View, java.lang.String):void
      bkbr.a(int, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      bkbr.a(android.os.Bundle, android.view.View):android.view.View
      bjxu.a(android.view.View, java.lang.String):void
      bkdb.a(int, android.os.Bundle):void
      bjwm.a(bmmv, java.util.List):void
      bkdb.a(int, android.os.Bundle):void
      bkfe.a(java.lang.Object, java.lang.Object):void
      axbr.a(java.lang.Object, boolean):void */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo52728a(Object obj, Object obj2) {
        LogContext logContext;
        bxxc bxxc = (bxxc) obj;
        if (m82194b(bxxc) != m82194b((bxxc) obj2)) {
            if (this.f95712k != null) {
                OrchestrationViewEvent.m93827b(getActivity(), this.f95701C, this.f95719r);
                m82193a((Object) bxxc, true);
            } else {
                m82193a((Object) bxxc, false);
            }
            if (m82194b(this.f95712k) != m82194b(bxxc)) {
                if (!(!chhj.m148729b() || (logContext = this.f95713l) == null || logContext == mo65980at())) {
                    bjst.m104530b(this.f95713l);
                }
                this.f95713l = chhj.m148729b() ? bjst.m104513a(mo65980at(), m82194b(bxxc)) : mo65980at();
                this.f95712k = bxxc;
                m82192a(bxxc);
                bjwl.m104782a(this.f124196aK, this.f95721t, m82194b(bxxc));
            } else {
                m82192a(bxxc);
            }
        }
        if (chig.f188649a.mo6606a().mo85257a()) {
            this.f95702a.post(new axbp(this));
        }
    }

    /* renamed from: a */
    public final void mo52771a(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bjwj bjwj = (bjwj) arrayList.get(i);
            int a = bmna.m108191a(bjwj.f123509a.f130094d);
            int i2 = 1;
            if (a == 0) {
                a = 1;
            }
            int i3 = a - 1;
            if (!(i3 == 1 || i3 == 18)) {
                if (!(i3 == 23 || i3 == 3)) {
                    if (i3 != 4) {
                        Locale locale = Locale.US;
                        Object[] objArr = new Object[1];
                        int a2 = bmna.m108191a(bjwj.f123509a.f130094d);
                        if (a2 != 0) {
                            i2 = a2;
                        }
                        objArr[0] = Integer.valueOf(i2 - 1);
                        throw new IllegalArgumentException(String.format(locale, "Unsupported trigger type: %s", objArr));
                    }
                }
            }
            this.f95721t.add(bjwj);
        }
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        axbk axbk = this.f95703b;
        if (axbk != null && axbk.mo52281a(bmas)) {
            return true;
        }
        bkdx bkdx = this.f95704c;
        if (bkdx == null || !bkdx.mo52281a(bmas)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo52055a(bmne bmne) {
        bmmy bmmy;
        int a = bmna.m108191a(bmne.f130094d);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 3 || i2 == 4 || i2 == 18) {
            return bjwl.m104786a(bmne, m82194b(this.f95712k));
        }
        if (i2 != 23) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            int a2 = bmna.m108191a(bmne.f130094d);
            if (a2 != 0) {
                i = a2;
            }
            objArr[0] = Integer.valueOf(i - 1);
            throw new IllegalArgumentException(String.format(locale, "Unsupported trigger type: %s", objArr));
        }
        boolean z = this.f95702a.f152208d;
        int a3 = bmna.m108191a(bmne.f130094d);
        if (a3 != 0 && a3 == 24) {
            if (bmne.f130091a == 9) {
                bmmy = (bmmy) bmne.f130092b;
            } else {
                bmmy = bmmy.f130070b;
            }
            return bmmy.f130072a == z;
        }
        int a4 = bmna.m108191a(bmne.f130094d);
        if (a4 != 0) {
            i = a4;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unsupported trigger type: ");
        sb.append(i - 1);
        throw new IllegalArgumentException(sb.toString());
    }
}
