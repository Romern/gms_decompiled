package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.wallet.analytics.events.NewWidgetActionEvent;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.gms.wallet.common.p079ui.CardActionBarView;
import com.google.android.gms.wallet.common.p079ui.CardHeaderView;
import com.google.android.gms.wallet.common.p079ui.CollapsibleCardContentsView;
import com.google.android.gms.wallet.common.p079ui.SectionView;
import com.google.android.gms.wallet.embeddedlandingpage.InstrumentDetailsView;
import com.google.android.gms.wallet.p084ow.ChooseAccountShimChimeraActivity;
import com.google.android.gms.wallet.p088ui.common.PageDetails;
import com.google.android.gms.wallet.p088ui.component.filter.FilterCategoryChipButton;
import com.google.android.gms.wallet.p088ui.component.filter.FilterView;
import com.google.android.gms.wallet.p088ui.component.filter.ManageFiltersChipButton;
import com.google.android.gms.wallet.p088ui.redirect.PopupRedirectChimeraActivity;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.clientlog.TimedEvent;
import com.google.android.wallet.p097ui.common.CallbackListenerScrollView;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import com.google.android.wallet.p097ui.common.LegalMessageView;
import com.google.android.wallet.p097ui.common.LinkView;
import com.google.android.wallet.p097ui.expander.SummaryExpanderWrapper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: awzk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class awzk extends bkge implements bkcy, bjwp, bjwm, bjwi, bjel, awym, bkbu, bkdg, bjwq, axas, bkbz {

    /* renamed from: a */
    private static final String f95356a = awhg.m79946a("orchestrationPage");

    /* renamed from: A */
    public View f95357A;

    /* renamed from: B */
    public BuyFlowConfig f95358B;

    /* renamed from: C */
    public String f95359C;

    /* renamed from: D */
    int f95360D = -1;

    /* renamed from: E */
    public awib f95361E;

    /* renamed from: F */
    public awic f95362F;

    /* renamed from: G */
    public final bkip f95363G = new bkip();

    /* renamed from: H */
    public TimedEvent f95364H;

    /* renamed from: I */
    public long f95365I;

    /* renamed from: J */
    public Object f95366J;

    /* renamed from: K */
    Handler f95367K;

    /* renamed from: L */
    public int f95368L;

    /* renamed from: M */
    public awzi f95369M;

    /* renamed from: N */
    boolean f95370N;

    /* renamed from: O */
    public boolean f95371O;

    /* renamed from: P */
    public CharSequence f95372P;

    /* renamed from: Q */
    public CharSequence f95373Q;

    /* renamed from: R */
    protected final C1230nw f95374R = new C1230nw();

    /* renamed from: S */
    protected final C1230nw f95375S = new C1230nw();

    /* renamed from: T */
    public bjxv f95376T;

    /* renamed from: U */
    protected int f95377U;

    /* renamed from: V */
    protected int f95378V;

    /* renamed from: W */
    Map f95379W = new HashMap();

    /* renamed from: X */
    public final ArrayList f95380X = new ArrayList();

    /* renamed from: Y */
    boolean f95381Y;

    /* renamed from: Z */
    int f95382Z = -1;

    /* renamed from: aA */
    public FilterView f95383aA;

    /* renamed from: aB */
    protected ViewGroup f95384aB;

    /* renamed from: aC */
    public final ArrayList f95385aC = new ArrayList();

    /* renamed from: aD */
    public final ArrayList f95386aD = new ArrayList();

    /* renamed from: aE */
    public final C1230nw f95387aE = new C1230nw();

    /* renamed from: aa */
    public boolean f95388aa;

    /* renamed from: ab */
    boolean f95389ab;

    /* renamed from: ac */
    public boolean f95390ac;

    /* renamed from: ad */
    int f95391ad = -1;

    /* renamed from: ae */
    int f95392ae = -1;

    /* renamed from: af */
    protected asw f95393af;

    /* renamed from: ag */
    public bjuf f95394ag;

    /* renamed from: ah */
    bjwr f95395ah;

    /* renamed from: ai */
    boolean f95396ai = false;

    /* renamed from: aj */
    public Object f95397aj;

    /* renamed from: ak */
    public PageDetails f95398ak = mo52038J();

    /* renamed from: al */
    public PageDetails f95399al;

    /* renamed from: am */
    PageDetails f95400am;

    /* renamed from: an */
    public Object f95401an;

    /* renamed from: ao */
    public final ArrayList f95402ao = new ArrayList();

    /* renamed from: ap */
    public final ArrayList f95403ap = new ArrayList();

    /* renamed from: aq */
    public final ArrayList f95404aq = new ArrayList();

    /* renamed from: ar */
    public final ArrayList f95405ar = new ArrayList();

    /* renamed from: as */
    public final ArrayList f95406as = new ArrayList();

    /* renamed from: at */
    public final ArrayList f95407at = new ArrayList();

    /* renamed from: au */
    public final ArrayList f95408au = new ArrayList();

    /* renamed from: av */
    public final ArrayList f95409av = new ArrayList();

    /* renamed from: aw */
    public final ArrayList f95410aw = new ArrayList();

    /* renamed from: ax */
    public final ArrayList f95411ax = new ArrayList();

    /* renamed from: ay */
    public final ArrayList f95412ay = new ArrayList();

    /* renamed from: az */
    public final ArrayList f95413az = new ArrayList();

    /* renamed from: b */
    private boolean f95414b;

    /* renamed from: c */
    private awym f95415c;

    /* renamed from: d */
    private final ArrayList f95416d = new ArrayList();

    /* renamed from: e */
    private final ArrayList f95417e = new ArrayList();

    /* renamed from: f */
    private final ArrayList f95418f = new ArrayList();

    /* renamed from: g */
    private final ArrayList f95419g = new ArrayList();

    /* renamed from: h */
    private final ArrayList f95420h = new ArrayList();

    /* renamed from: i */
    private atj f95421i;

    /* renamed from: j */
    private String f95422j;

    /* renamed from: k */
    private ViewGroup f95423k;

    /* renamed from: l */
    private final SparseArray f95424l = new SparseArray();

    /* renamed from: m */
    private int f95425m = 1;

    /* renamed from: y */
    awhg f95426y;

    /* renamed from: z */
    public bkcz f95427z;

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
    public static Bundle m81652a(BuyFlowConfig buyFlowConfig, String str, PageDetails pageDetails, LogContext logContext) {
        boolean z;
        sdo.checkIfNull(buyFlowConfig, "buyFlowConfig must not be null");
        sdo.checkIfNull(buyFlowConfig.f110418b.f110407b, "account must be set in buyFlowConfig");
        if (pageDetails != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "pageDetails are required to launch an overlay.");
        sdo.m34969a(str, (Object) "analyticsSessionId must be valid");
        Bundle a = bkbr.m105273a((int) C0126R.style.WalletEmptyStyle, logContext);
        a.putParcelable("buyFlowConfig", buyFlowConfig);
        a.putString("analyticsSessionId", str);
        a.putParcelable("initialPageDetails", pageDetails);
        return a;
    }

    /* renamed from: b */
    private final void mo51915b(int i) {
        if (i == 1 && this.f124196aK != null) {
            int size = this.f95416d.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f124196aK.mo65590a((bjwj) this.f95416d.get(i2));
            }
            this.f95416d.clear();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.gms.wallet.common.ui.SectionView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: c */
    private final void mo52831c(awyy awyy) {
        bmlp bmlp;
        int i;
        SectionView sectionView = (SectionView) this.f123963aH.inflate((int) C0126R.C0128layout.wallet_view_section, awyy.f95341c, false);
        sectionView.setId(this.f95376T.mo65614a());
        bmlv bmlv = awyy.f95340b;
        if (bmlv.f129966b == 15) {
            bmlp = (bmlp) bmlv.f129967c;
        } else {
            bmlp = bmlp.f129947h;
        }
        int a = bmlm.m108149a(bmlp.f129949a);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 2) {
            bmno bmno = bmlv.f129971g;
            if (bmno == null) {
                bmno = bmno.f130138m;
            }
            sectionView.f110121a = LayoutInflater.from(sectionView.getContext()).inflate((int) C0126R.C0128layout.wallet_view_section_default, (ViewGroup) sectionView, false);
            ((ImageWithCaptionView) sectionView.f110121a.findViewById(C0126R.C0129id.section_title_image)).mo71991a(bmno);
            bkfr.m105573a((TextView) sectionView.f110121a.findViewById(C0126R.C0129id.section_title_primary), bmlp.f129950b);
            bkfr.m105573a((TextView) sectionView.f110121a.findViewById(C0126R.C0129id.section_title_secondary), bmlp.f129951c);
            bkfr.m105573a((TextView) sectionView.f110121a.findViewById(C0126R.C0129id.section_description_primary), bmlp.f129952d);
            bkfr.m105573a((TextView) sectionView.f110121a.findViewById(C0126R.C0129id.section_description_secondary), bmlp.f129953e);
            TextView textView = (TextView) sectionView.f110121a.findViewById(C0126R.C0129id.section_status);
            bkfr.m105573a(textView, bmlp.f129954f);
            int a2 = bmlo.m108151a(bmlp.f129955g);
            if (a2 == 0) {
                a2 = 1;
            }
            if (a2 - 1 != 1) {
                i = C0126R.style.UicDisplayTypeDetailText;
            } else {
                i = C0126R.style.UicDisplayTypePendingText;
            }
            C1334rs.m20104a(textView, i);
        } else {
            sectionView.f110121a = LayoutInflater.from(sectionView.getContext()).inflate((int) C0126R.C0128layout.wallet_view_section_new, (ViewGroup) sectionView, false);
            TextView textView2 = (TextView) sectionView.f110121a.findViewById(C0126R.C0129id.section_title_text);
            bkfr.m105573a(textView2, bmlp.f129950b);
            textView2.setTextColor(bkfr.m105606d(sectionView.getContext(), (int) C0126R.attr.colorAccent));
        }
        sectionView.addView(sectionView.f110121a, 0);
        sectionView.f110121a.setOnClickListener(sectionView);
        sectionView.f110121a.setTag(C0126R.C0129id.summary_expander_transition_name, "summaryField");
        bkfr.m105573a((TextView) sectionView.findViewById(C0126R.C0129id.expanded_title_text), bmlv.f129970f);
        sectionView.f110123c = sectionView.findViewById(C0126R.C0129id.expanded_title_container);
        sectionView.f110123c.setOnClickListener(sectionView);
        sectionView.f110123c.setTag(C0126R.C0129id.summary_expander_transition_name, "expandedField");
        sectionView.f110122b = (ViewGroup) sectionView.findViewById(C0126R.C0129id.expanded_section_contents);
        sectionView.f110122b.setTag(C0126R.C0129id.summary_expander_transition_name, "expandedField");
        sectionView.f110124d = sectionView.findViewById(C0126R.C0129id.section_separator);
        bkip bkip = sectionView.f110125e;
        bkip.f124292a = true;
        bkip.f124305n = sectionView;
        bkip.mo66029a((bkio) sectionView);
        awyy.f95341c.addView(sectionView);
        this.f95411ax.add(sectionView);
        awyy.f95343e.mo66032a((bkiq) sectionView);
        awyx a3 = awyy.mo52799a();
        a3.mo52798a(sectionView.f110122b);
        a3.f95335b = sectionView.f110125e;
        awyy a4 = a3.mo52797a();
        bxvw bxvw = awyy.f95340b.f129973i;
        int size = bxvw.size();
        for (int i2 = 0; i2 < size; i2++) {
            mo52852a(a4, ((Long) bxvw.get(i2)).longValue());
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean):void
     arg types: [com.google.android.gms.wallet.ui.common.PageDetails, int]
     candidates:
      awzk.a(android.os.Bundle, bxxk):java.lang.Object
      awzk.a(awyy, java.lang.String):void
      awzk.a(android.os.Bundle, java.util.List):android.util.SparseArray
      awzk.a(android.os.Bundle, android.view.View):android.view.View
      awzk.a(int, java.lang.Class):java.util.ArrayList
      awzk.a(int, int):void
      awzk.a(int, android.os.Bundle):void
      awzk.a(int, bkdx):void
      awzk.a(long, bxxc):void
      awzk.a(android.view.View, rx):void
      awzk.a(awyy, long):void
      awzk.a(bmav, bmaq):void
      awzk.a(bmmv, java.util.List):void
      awzk.a(bwhy, byte[]):void
      awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, int):void
      awzk.a(java.lang.Object, int):void
      awzk.a(java.lang.String, java.lang.String):void
      awzk.a(boolean, boolean):boolean
      bkge.a(android.os.Bundle, android.view.View):android.view.View
      bkge.a(int, android.os.Bundle):void
      bkge.a(android.view.View, java.lang.String):void
      bkbr.a(int, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      bkbr.a(android.os.Bundle, android.view.View):android.view.View
      bjxu.a(android.view.View, java.lang.String):void
      bkdb.a(int, android.os.Bundle):void
      bkcy.a(int, int):void
      bjwm.a(bmmv, java.util.List):void
      awym.a(android.view.View, rx):void
      awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean):void */
    /* renamed from: d */
    private final void m81661d(PageDetails pageDetails) {
        mo52862a(pageDetails, false);
        this.f95389ab = this.f95388aa;
        this.f95388aa = false;
        this.f95368L = 1;
        mo52880am();
    }

    /* renamed from: g */
    private final void m81662g(Object obj) {
        bjwl.m104784a(this, mo52060c(obj), this.f124196aK);
    }

    /* renamed from: n */
    private final atn mo51927n() {
        atn atn = new atn();
        asd asd = new asd();
        ViewGroup viewGroup = this.f95423k;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                asd.mo2478d(this.f95423k.getChildAt(i));
            }
        }
        atn.mo2491a(asd);
        atn.mo2491a(new ask());
        atn.mo2457a(400);
        atn.mo2493b(0);
        return atn;
    }

    /* renamed from: p */
    private final boolean mo52070p() {
        return bkfr.m105612e(getActivity()) && mo52882ao() != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public bxxk mo52035G() {
        throw new UnsupportedOperationException("Must be implemented by subclasses to properly parse RefreshRequest protos.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public PageDetails mo52038J() {
        return new PageDetails();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo52815O() {
        mo52808n(true);
    }

    /* renamed from: W */
    public final long mo52837W() {
        return 0;
    }

    /* renamed from: X */
    public final boolean mo52838X() {
        return isResumed() && bkde.m105359l(this.f95385aC) && !this.f95414b;
    }

    /* renamed from: Y */
    public final awhg mo52839Y() {
        if (this.f95426y == null) {
            this.f95426y = (awhg) getActivity().getSupportFragmentManager().findFragmentByTag(f95356a);
        }
        return this.f95426y;
    }

    /* renamed from: Z */
    public final void mo52840Z() {
        if (mo52839Y() != null) {
            mo52875ah();
            getActivity().getSupportFragmentManager().beginTransaction().remove(this.f95426y).commit();
            getActivity().getSupportFragmentManager().executePendingTransactions();
            this.f95426y = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo51911a(Object obj);

    /* renamed from: a */
    public final void mo52864a(Object obj, int i) {
        this.f95366J = obj;
        this.f95425m = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo52827a(boolean z, boolean z2) {
        return z && z2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aa */
    public final void mo52868aa() {
        int b = this.f95387aE.mo15537b();
        for (int i = 0; i < b; i++) {
            bjwl.m104784a(this, ((bwio) this.f95387aE.mo15538b(i)).f159662b, this.f124196aK);
        }
    }

    /* renamed from: ab */
    public final boolean mo52869ab() {
        return this.f95427z != null;
    }

    /* renamed from: ac */
    public final boolean mo52870ac() {
        return this.f95398ak.f110454c == bwgz.COMPLETE_FLOW_AFTER_DISPLAYING_NEW_PAGE_IN_OVERLAY || this.f95398ak.f110454c == bwgz.COMPLETE_FLOW_AFTER_DISPLAYING_NEW_PAGE;
    }

    /* renamed from: ad */
    public final void mo52871ad() {
        if (this.f124196aK != null) {
            int size = this.f95418f.size();
            for (int i = 0; i < size; i++) {
                this.f124196aK.mo65590a((bjwj) this.f95418f.get(i));
            }
        }
    }

    /* renamed from: ae */
    public final CallbackListenerScrollView mo52872ae() {
        View view;
        CallbackListenerScrollView callbackListenerScrollView = (CallbackListenerScrollView) getActivity().findViewById(C0126R.C0129id.content_scroll_view);
        if (callbackListenerScrollView == null && (callbackListenerScrollView = (CallbackListenerScrollView) getActivity().findViewById(C0126R.C0129id.sud_scroll_view)) == null && (view = this.f95357A) != null) {
            return (CallbackListenerScrollView) view.findViewById(C0126R.C0129id.content_scroll_view);
        }
        return callbackListenerScrollView;
    }

    /* renamed from: af */
    public final void mo52873af() {
        awzi awzi = this.f95369M;
        if (awzi != null && !this.f95370N) {
            this.f95370N = true;
            awzi.mo51864a(this.f95398ak.f110466o, mo52365bS());
        }
    }

    /* renamed from: ag */
    public final void mo52874ag() {
        if (this.f95427z != null) {
            getFragmentManager().beginTransaction().remove(this.f95427z).commit();
        }
        this.f95398ak.f110454c = bwgz.HANDLE_UI_ERROR;
        bkcz a = bkcz.m105337a(2, (int) C0126R.string.wallet_uic_network_error_title, (int) C0126R.string.wallet_uic_network_error_message, 1000);
        this.f95427z = a;
        a.f124032a = this;
        a.show(getFragmentManager(), "PageFragment.ErrorDialog");
    }

    /* renamed from: ah */
    public final void mo52875ah() {
        if (this.f95360D < 0) {
            this.f95360D = mo52839Y().f94357a.mo52395a(mo51913b());
        }
    }

    /* renamed from: ai */
    public final void mo52876ai() {
        int i;
        if (mo52839Y() == null) {
            if (!mo52075v()) {
                i = 4;
            } else {
                i = 20;
            }
            this.f95426y = awhg.m79945a(i, this.f95358B, mo51878cn());
            getActivity().getSupportFragmentManager().beginTransaction().add(this.f95426y, f95356a).commit();
        }
    }

    /* renamed from: aj */
    public final void mo52877aj() {
        mo52839Y().f94357a.mo52397a(mo51913b(), this.f95360D);
        mo52878ak();
    }

    /* renamed from: ak */
    public final void mo52878ak() {
        this.f95360D = -1;
    }

    /* renamed from: al */
    public final bkgd mo52879al() {
        bkgd al = super.mo52879al();
        al.f124186a = this.f124196aK;
        al.f124191f = this.f95359C;
        return al;
    }

    /* access modifiers changed from: protected */
    /* renamed from: am */
    public final void mo52880am() {
        boolean z;
        bmkw bmkw = this.f95398ak.f110463l;
        boolean z2 = true;
        if (bmkw == null) {
            this.f95386aD.clear();
            this.f95385aC.clear();
            if (this.f95368L == 1) {
                z = true;
            } else {
                z = false;
            }
            mo52896f(z);
            this.f95414b = true;
            if (this.f95368L != 1) {
                z2 = false;
            }
            mo51916b(z2);
            this.f95414b = false;
            if (mo52838X()) {
                mo51904a(this.f95368L);
                return;
            }
            return;
        }
        this.f95373Q = bmkw.f129901b;
        if (!this.f95390ac && !mo52869ab()) {
            this.f95390ac = true;
            mo52067o();
        }
    }

    /* renamed from: an */
    public final Handler mo52881an() {
        if (this.f95367K == null) {
            this.f95367K = new adzt();
        }
        return this.f95367K;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ao */
    public final atj mo52882ao() {
        View findViewById;
        if (this.f95421i == null && (findViewById = getActivity().findViewById(16908290)) != null) {
            this.f95421i = new atj();
            this.f95393af = new asw((ViewGroup) findViewById);
        }
        return this.f95421i;
    }

    /* renamed from: ap */
    public final void mo52883ap() {
        if (this.f95381Y) {
            int i = this.f95382Z;
            if (i != -1) {
                if (i != -2) {
                    this.f95397aj = mo52064d(this.f95398ak.f110457f.get(i));
                } else {
                    this.f95397aj = this.f95398ak.f110460i;
                }
                this.f95398ak.f110468q = null;
                this.f95368L = 1;
                mo52880am();
                this.f95381Y = false;
                this.f95382Z = -1;
                return;
            }
            throw new IllegalStateException("A dependency triggered hiding the current page without showing another page.");
        } else if (this.f95382Z != -1) {
            throw new IllegalStateException("A dependency triggered showing a page without hiding the current page.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract awpc mo51913b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo51916b(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: bS */
    public boolean mo52365bS() {
        return false;
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f95363G;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return this.f95386aD;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return this.f95385aC;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public long mo52060c(Object obj) {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo51917c();

    /* access modifiers changed from: protected */
    /* renamed from: cd */
    public void mo52380cd() {
        throw new UnsupportedOperationException("Hiding page UI is not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: ce */
    public void mo52381ce() {
        throw new UnsupportedOperationException("Showing page UI is not supported");
    }

    /* access modifiers changed from: protected */
    /* renamed from: cf */
    public bxxk mo52284cf() {
        throw new UnsupportedOperationException("Must be implemented by subclasses to properly parse WriteDocumenthRequest protos.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: cg */
    public List mo52766cg() {
        return null;
    }

    /* renamed from: cn */
    public final Account mo51878cn() {
        return this.f95358B.f110418b.f110407b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public bxxk mo51921e() {
        throw new UnsupportedOperationException("Must be implemented by subclasses to properly parse SubmitRequest protos.");
    }

    /* renamed from: e */
    public final void mo52893e(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo51922f() {
        CharSequence charSequence;
        boolean z = this.f124195aJ;
        int size = this.f95409av.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((CardActionBarView) this.f95409av.get(i)).setEnabled(z);
        }
        int size2 = this.f95402ao.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((bkbn) this.f95402ao.get(i2)).mo52710b().setEnabled(z);
        }
        int size3 = this.f95407at.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ((ImageWithCaptionView) this.f95407at.get(i3)).setEnabled(z);
        }
        int size4 = this.f95408au.size();
        for (int i4 = 0; i4 < size4; i4++) {
            ((CardHeaderView) this.f95408au.get(i4)).setEnabled(z);
        }
        int size5 = this.f95410aw.size();
        for (int i5 = 0; i5 < size5; i5++) {
            ((CollapsibleCardContentsView) this.f95410aw.get(i5)).setEnabled(z);
        }
        int size6 = this.f95411ax.size();
        for (int i6 = 0; i6 < size6; i6++) {
            ((SectionView) this.f95411ax.get(i6)).setEnabled(z);
        }
        int size7 = this.f95412ay.size();
        for (int i7 = 0; i7 < size7; i7++) {
            ((InstrumentDetailsView) this.f95412ay.get(i7)).setEnabled(z);
        }
        int size8 = this.f95406as.size();
        for (int i8 = 0; i8 < size8; i8++) {
            ((SummaryExpanderWrapper) this.f95406as.get(i8)).setEnabled(z);
        }
        FilterView filterView = this.f95383aA;
        if (filterView != null) {
            filterView.setEnabled(z);
        }
        int size9 = this.f95385aC.size();
        for (int i9 = 0; i9 < size9; i9++) {
            Object obj = ((bkde) this.f95385aC.get(i9)).f124039e;
            if (obj instanceof bkfm) {
                ((bkfm) obj).mo52808n(z);
            } else if (obj instanceof View) {
                ((View) obj).setEnabled(z);
            }
        }
        if (!TextUtils.isEmpty(this.f95372P) && !this.f124195aJ) {
            charSequence = this.f95372P;
        } else {
            charSequence = this.f95373Q;
        }
        getActivity().getTitle();
        getActivity().setTitle(charSequence);
        int i10 = Build.VERSION.SDK_INT;
        getActivity().supportInvalidateOptionsMenu();
        if (!this.f124195aJ && !this.f95388aa) {
            z2 = true;
        }
        mo52063c(z2);
        if (!chjq.m148833b() && !this.f124195aJ && this.f95368L == 0) {
            this.f95363G.mo66041d(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract bmlz mo51924h();

    /* renamed from: h */
    public final void mo52898h(int i) {
        mo52848a(5, i, null, null, 1);
    }

    /* renamed from: i */
    public final void mo52899i(int i) {
        if (this.f95369M != null && !this.f95370N) {
            this.f95370N = true;
            if (mo52870ac()) {
                this.f95369M.mo51864a(this.f95398ak.f110466o, mo52365bS());
            } else {
                this.f95369M.mo51874c(i);
            }
        }
    }

    /* renamed from: j */
    public final void mo52900j(int i) {
        this.f95364H = bjst.m104515a(mo65980at(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo51925l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public bxxk mo51926m() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo52067o() {
        if (!this.f95370N) {
            bmkw bmkw = this.f95398ak.f110463l;
            Activity activity = getActivity();
            int a = bkjd.m105957a(this.f123962aG);
            LogContext logContext = this.f123964aI;
            BuyFlowConfig buyFlowConfig = this.f95358B;
            Account cn = mo51878cn();
            bmki bmki = bmkw.f129900a;
            if (bmki == null) {
                bmki = bmki.f129802w;
            }
            Intent a2 = PopupRedirectChimeraActivity.m94289a(activity, bmki, null, bmkw.f129901b, a, logContext, buyFlowConfig, cn);
            bjvp.m104735a(a2, "webViewComponent", bmkw);
            startActivityForResult(a2, 1004);
            getActivity().overridePendingTransition(0, 0);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean, java.lang.String):void
     arg types: [com.google.android.gms.wallet.ui.common.PageDetails, int, java.lang.String]
     candidates:
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzk.a(bmav, java.lang.String, boolean, boolean):void
     arg types: [bmav, java.lang.String, int, int]
     candidates:
      awzk.a(com.google.android.gms.wallet.shared.BuyFlowConfig, java.lang.String, com.google.android.gms.wallet.ui.common.PageDetails, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      awzk.a(bmdb, int, android.view.ViewGroup, boolean):bkbn
      awzk.a(awyy, bxxc, int, int):bkdx
      awzk.a(bmav, bmaq, java.util.List, int):void
      awzk.a(bmav, java.lang.String, boolean, boolean):void */
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        int i4;
        switch (i) {
            case 1001:
                if (i2 == -1) {
                    this.f95400am = (PageDetails) intent.getParcelableExtra("pageDetails");
                    break;
                } else {
                    mo52808n(true);
                    break;
                }
            case 1002:
                mo51925l();
                break;
            case 1003:
            default:
                super.onActivityResult(i, i2, intent);
                break;
            case 1004:
                this.f95390ac = false;
                if (i2 != -1) {
                    if (i2 == 0) {
                        mo52899i(6);
                        break;
                    } else if (i2 != 1) {
                        if (i2 == 2) {
                            mo52897g(-1);
                            break;
                        } else if (i2 == 100) {
                            Bundle bundleExtra = intent.getBundleExtra("webViewComponentErrorDetails");
                            PageDetails J = mo52038J();
                            J.f110454c = bwgz.HANDLE_UI_ERROR;
                            bxvd da = bmav.f128500h.mo74144da();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bmav bmav = (bmav) da.f164949b;
                            bmav.f128504c = 2;
                            bmav.f128502a |= 8;
                            String string = bundleExtra.getString("EventListener.EXTRA_WEBVIEW_COMPONENT_COMPLETE_WITH_ERROR");
                            if (string != null) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bmav bmav2 = (bmav) da.f164949b;
                                string.getClass();
                                bmav2.f128502a |= 16;
                                bmav2.f128506e = string;
                            }
                            J.f110468q = (bmav) da.mo74062i();
                            mo52364a(J, false, "webViewCompleteFlowWithError");
                            break;
                        } else {
                            throw new RuntimeException(String.format(Locale.US, "Unknown result code from popup redirect: %d", Integer.valueOf(i2)));
                        }
                    } else {
                        Bundle bundleExtra2 = intent.getBundleExtra("errorDetails");
                        if (bundleExtra2 != null) {
                            bmav a = bjvg.m104690a(bundleExtra2);
                            String string2 = bundleExtra2.getString("ErrorUtils.KEY_TITLE");
                            mo52808n(true);
                            mo52855a(a, string2, false, false);
                            break;
                        } else {
                            throw new IllegalArgumentException("Error result must provide error details.");
                        }
                    }
                } else {
                    mo52364a(mo52043a(intent), false, "webViewCompleteFlowWithCallbackData");
                    break;
                }
            case 1005:
                mo52808n(true);
                break;
            case 1006:
                if (i2 == -1) {
                    mo52765a((bwhy) bjvp.m104729a(intent, "filterValue", (bxxk) bwhy.f159603b.mo74142c(7)), intent.getByteArrayExtra("dependencyGraphActionToken"));
                    break;
                }
                break;
            case 1007:
                mo52873af();
                break;
            case 1008:
                if (i2 == -1) {
                    mo52873af();
                    break;
                } else {
                    mo52899i(1);
                    break;
                }
        }
        if (i < 1000 || i == 1003) {
            if (i != 1003) {
                i3 = i;
            } else {
                i3 = 1000;
            }
            if (intent != null) {
                i4 = intent.getIntExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", -1);
            } else {
                i4 = -1;
            }
            NewWidgetActionEvent.m93814a(this.f123962aG, this.f95359C, i3, 3, awia.m79964a(i2), i4);
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (awzi.class.isInstance(activity)) {
            this.f95369M = (awzi) activity;
            if (activity instanceof awym) {
                this.f95415c = (awym) activity;
                return;
            }
            return;
        }
        String valueOf = String.valueOf(awzi.class.getSimpleName());
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Parent activity must implement ") : "Parent activity must implement ".concat(valueOf));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean):void
     arg types: [com.google.android.gms.wallet.ui.common.PageDetails, int]
     candidates:
      awzk.a(android.os.Bundle, bxxk):java.lang.Object
      awzk.a(awyy, java.lang.String):void
      awzk.a(android.os.Bundle, java.util.List):android.util.SparseArray
      awzk.a(android.os.Bundle, android.view.View):android.view.View
      awzk.a(int, java.lang.Class):java.util.ArrayList
      awzk.a(int, int):void
      awzk.a(int, android.os.Bundle):void
      awzk.a(int, bkdx):void
      awzk.a(long, bxxc):void
      awzk.a(android.view.View, rx):void
      awzk.a(awyy, long):void
      awzk.a(bmav, bmaq):void
      awzk.a(bmmv, java.util.List):void
      awzk.a(bwhy, byte[]):void
      awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, int):void
      awzk.a(java.lang.Object, int):void
      awzk.a(java.lang.String, java.lang.String):void
      awzk.a(boolean, boolean):boolean
      bkge.a(android.os.Bundle, android.view.View):android.view.View
      bkge.a(int, android.os.Bundle):void
      bkge.a(android.view.View, java.lang.String):void
      bkbr.a(int, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      bkbr.a(android.os.Bundle, android.view.View):android.view.View
      bjxu.a(android.view.View, java.lang.String):void
      bkdb.a(int, android.os.Bundle):void
      bkcy.a(int, int):void
      bjwm.a(bmmv, java.util.List):void
      awym.a(android.view.View, rx):void
      awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean):void */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f95359C = arguments.getString("analyticsSessionId");
        PageDetails pageDetails = (PageDetails) arguments.getParcelable("initialPageDetails");
        this.f95371O = pageDetails != null;
        setHasOptionsMenu(true);
        CharSequence title = getActivity().getTitle();
        if (title != null) {
            this.f95373Q = title;
        }
        if (bundle == null) {
            if (arguments.containsKey("pageProto")) {
                this.f95397aj = bjvp.m104730a(arguments, "pageProto", mo51926m());
            }
            this.f95358B = (BuyFlowConfig) arguments.getParcelable("buyFlowConfig");
            if (pageDetails != null) {
                this.f95399al = pageDetails;
            }
        } else {
            if (bundle.containsKey("buyFlowConfig")) {
                this.f95358B = (BuyFlowConfig) bundle.getParcelable("buyFlowConfig");
            }
            this.f95379W = (Map) bundle.getSerializable("componentToIdMap");
            this.f95360D = bundle.getInt("serviceConnectionSavePoint", -1);
            this.f95365I = bundle.getLong("mTimeResponseReceivedMs");
            this.f95370N = bundle.getBoolean("hasPageFinished");
            mo52862a((PageDetails) bundle.getParcelable("pageDetails"), false);
            if (bundle.containsKey("activePage")) {
                this.f95397aj = bjvp.m104730a(bundle, "activePage", mo51926m());
            }
            if (bundle.containsKey("requestType")) {
                int i = bundle.getInt("requestType");
                this.f95425m = i != 1 ? i != 2 ? i != 3 ? i != 4 ? 1 : 5 : 4 : 3 : 2;
            }
            if (bundle.containsKey("lastNetworkMessage")) {
                int i2 = this.f95425m;
                Object obj = null;
                if (i2 != 0) {
                    bwgz bwgz = bwgz.UNKNOWN_FLOW_INSTRUCTION;
                    int i3 = i2 - 1;
                    if (i3 == 1) {
                        obj = m81654a(bundle, mo51920d());
                    } else if (i3 == 2) {
                        obj = m81654a(bundle, mo51921e());
                    } else if (i3 == 3) {
                        obj = m81654a(bundle, mo52035G());
                    } else if (i3 == 4) {
                        obj = m81654a(bundle, mo52284cf());
                    }
                }
                this.f95366J = obj;
            }
            if (bundle.containsKey("apiRequestEvent")) {
                this.f95364H = (TimedEvent) bundle.getParcelable("apiRequestEvent");
            }
            if (bundle.containsKey("componentIdGeneratorState")) {
                this.f95376T = bjxv.m104860b(bundle.getBundle("componentIdGeneratorState"));
            }
            this.f95390ac = bundle.getBoolean("webViewActivityLaunchState");
            if (bundle.containsKey("droidGuardManager")) {
                bjuf bjuf = new bjuf(getActivity(), getLoaderManager(), this);
                this.f95394ag = bjuf;
                Bundle bundle2 = bundle.getBundle("droidGuardManager");
                bjuf.f123339b = (bmnj) bjvp.m104730a(bundle2, "droidGuardForm", (bxxk) bmnj.f130108c.mo74142c(7));
                bjuf.f123340c = bundle2.getString("droidGuardResult");
                if (bundle2.getBoolean("hasPendingSubmit")) {
                    bjuf.f123343f = new bjue(bjuf);
                }
            }
        }
        if (this.f95376T == null) {
            this.f95376T = bjxv.m104862d();
        }
        int[] iArr = {C0126R.attr.uicFormStartEndMargin, C0126R.attr.internalUicUseGoogleMaterial2Theme};
        Arrays.sort(iArr);
        TypedArray obtainStyledAttributes = this.f123962aG.obtainStyledAttributes(iArr);
        this.f95377U = obtainStyledAttributes.getDimensionPixelSize(Arrays.binarySearch(iArr, (int) C0126R.attr.uicFormStartEndMargin), 0);
        obtainStyledAttributes.recycle();
        this.f95378V = getResources().getDimensionPixelSize(C0126R.dimen.wallet_spacing_material_top_bottom);
        mo52876ai();
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        int i;
        MenuItem menuItem;
        boolean z = this.f124195aJ;
        List cg = mo52766cg();
        if (cg != null) {
            i = cg.size();
            for (int i2 = 0; i2 < i; i2++) {
                bwic bwic = (bwic) cg.get(i2);
                int i3 = bwic.f159614a;
                if (i3 == 5) {
                    int i4 = i2 + 1;
                    menuItem = menu.add(0, i4, i4, ((bmnr) bwic.f159615b).f130159e).setEnabled(z);
                } else if (i3 == 6) {
                    bmno bmno = (bmno) bwic.f159615b;
                    if (bjvn.m104718a(bmno.f130142c)) {
                        int i5 = i2 + 1;
                        MenuItem enabled = menu.add(0, i5, i5, "").setIcon(getResources().getDrawable(bkfr.m105586b(this.f123962aG, bmno.f130142c))).setEnabled(z);
                        C1264pc.m19827a(enabled, bmno.f130149j);
                        menuItem = enabled;
                    } else {
                        throw new IllegalStateException("Menu item icon should be an embedded image.");
                    }
                } else {
                    throw new IllegalStateException("Menu item should contain a message item or an icon.");
                }
                menuItem.setShowAsAction(1);
            }
        } else {
            i = 0;
        }
        menu.close();
        List q = mo52071q();
        if (q != null) {
            int size = q.size();
            for (int i6 = 0; i6 < size; i6++) {
                int i7 = i + 1 + i6;
                menu.add(0, i7, i7, ((bmoa) q.get(i6)).f130202a).setEnabled(z);
            }
        }
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId() - 1;
        if (itemId < 0 || itemId >= this.f95380X.size()) {
            return false;
        }
        ((bjwf) this.f95380X.get(itemId)).mo65585a();
        return true;
    }

    public void onPause() {
        super.onPause();
        mo52881an().removeCallbacksAndMessages(null);
        mo52875ah();
        this.f95396ai = true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean, java.lang.String):void
     arg types: [com.google.android.gms.wallet.ui.common.PageDetails, int, java.lang.String]
     candidates:
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
    public void onResume() {
        bwgz bwgz;
        super.onResume();
        if (this.f95398ak.f110465n != null) {
            mo51917c();
        }
        mo52865a((Runnable) new awzh(this));
        PageDetails pageDetails = this.f95400am;
        if (pageDetails != null) {
            bwgz bwgz2 = bwgz.UNKNOWN_FLOW_INSTRUCTION;
            int ordinal = pageDetails.f110454c.ordinal();
            if (ordinal != 5) {
                if (ordinal == 13) {
                    if (pageDetails.f110460i == null) {
                        bwgz = bwgz.CONTINUE_FLOW_WITH_CURRENT_PAGE;
                    } else {
                        bwgz = bwgz.CONTINUE_FLOW_WITH_NEW_PAGE;
                    }
                    pageDetails.f110454c = bwgz;
                    mo52364a(pageDetails, false, "returningOverlay");
                } else if (ordinal == 15) {
                    pageDetails.f110454c = bwgz.CONTINUE_FLOW_WITH_CURRENT_PAGE;
                    mo52364a(pageDetails, false, "returningOverlay");
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("EventListener.EXTRA_DEPENDENCY_GRAPH_ACTION_TOKEN", pageDetails.f110453b);
                    mo51905a(8, bundle);
                } else if (!(ordinal == 8 || ordinal == 9)) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Return from overlay with unexpected flow instruction: %s", Integer.valueOf(pageDetails.f110454c.f159484u)));
                }
                this.f95400am = null;
            }
            pageDetails.f110454c = bwgz.COMPLETE_FLOW_IMMEDIATELY;
            mo52364a(pageDetails, false, "returningOverlay");
            this.f95400am = null;
        }
        if (this.f95396ai) {
            int size = this.f95420h.size();
            for (int i = 0; i < size; i++) {
                this.f124196aK.mo65590a((bjwj) this.f95420h.get(i));
            }
            this.f95420h.clear();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        boolean z;
        super.onSaveInstanceState(bundle);
        mo52875ah();
        bundle.putSerializable("componentToIdMap", (Serializable) this.f95379W);
        bundle.putInt("serviceConnectionSavePoint", this.f95360D);
        bundle.putParcelable("buyFlowConfig", this.f95358B);
        bundle.putLong("mTimeResponseReceivedMs", this.f95365I);
        bundle.putBoolean("hasPageFinished", this.f95370N);
        if (this.f95376T != null) {
            Bundle bundle2 = new Bundle();
            this.f95376T.mo65615a(bundle2);
            bundle.putBundle("componentIdGeneratorState", bundle2);
        }
        bundle.putParcelable("pageDetails", this.f95398ak);
        Object obj = this.f95397aj;
        if (obj != null) {
            bjvp.m104736a(bundle, "activePage", (bxxc) obj);
        }
        awib awib = this.f95361E;
        if (awib != null) {
            awib.mo51861a(bundle);
        }
        int i = this.f95425m;
        int i2 = i - 1;
        if (i != 0) {
            bundle.putInt("requestType", i2);
            bjvp.m104736a(bundle, "lastNetworkMessage", (bxxc) this.f95366J);
            TimedEvent timedEvent = this.f95364H;
            if (timedEvent != null) {
                bundle.putParcelable("apiRequestEvent", timedEvent);
            }
            bundle.putBoolean("webViewActivityLaunchState", this.f95390ac);
            bjuf bjuf = this.f95394ag;
            if (bjuf != null) {
                bjuf.f123342e = null;
                Bundle bundle3 = new Bundle();
                bjvp.m104736a(bundle3, "droidGuardForm", bjuf.f123339b);
                bundle3.putString("droidGuardResult", bjuf.f123340c);
                if (bjuf.f123343f != null) {
                    z = true;
                } else {
                    z = false;
                }
                bundle3.putBoolean("hasPendingSubmit", z);
                bundle.putBundle("droidGuardManager", bundle3);
                return;
            }
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public List mo52071q() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo52072r() {
        throw new UnsupportedOperationException("sendCallbackDataToIntegrator not supported");
    }

    /* renamed from: s */
    public final void mo51892s() {
        this.f95415c.mo51892s();
    }

    public final void setTitle(CharSequence charSequence) {
        this.f95373Q = charSequence;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public bpis mo52073t() {
        return bpis.FLOW_TYPE_UNKNOWN;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public ViewGroup mo52074u() {
        return this.f95384aB;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public boolean mo52075v() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo52180e(Object obj) {
        throw new UnsupportedOperationException("Partial page update not supported.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public bxxk mo51920d() {
        throw new UnsupportedOperationException("Must be implemented by subclasses to properly parse InitializeRequest protos.");
    }

    /* renamed from: g */
    public final void mo52897g(int i) {
        awzi awzi = this.f95369M;
        if (awzi != null && !this.f95370N) {
            this.f95370N = true;
            awzi.mo51858a(i);
        }
    }

    /* renamed from: b */
    public final bkdx mo52884b(int i, Class cls) {
        ArrayList arrayList = (ArrayList) this.f95424l.get(i, new ArrayList());
        if (arrayList.size() > 1) {
            throw new IllegalStateException(String.format(Locale.US, "Only single form fragment is expected of type %d", Integer.valueOf(i)));
        } else if (arrayList.size() == 1) {
            return (bkdx) cls.cast(arrayList.get(0));
        } else {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Object mo52064d(Object obj) {
        throw new UnsupportedOperationException("copyPageWithCurrentPageDependencyGraph not supported.");
    }

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
    public static Bundle m81653a(BuyFlowConfig buyFlowConfig, String str, LogContext logContext) {
        sdo.checkIfNull(buyFlowConfig, "buyFlowConfig must not be null");
        sdo.checkIfNull(buyFlowConfig.f110418b.f110407b, "account must be set in buyFlowConfig");
        sdo.m34969a(str, (Object) "analyticsSessionId must be valid");
        Bundle a = bkbr.m105273a((int) C0126R.style.WalletEmptyStyle, logContext);
        a.putParcelable("buyFlowConfig", buyFlowConfig);
        a.putString("analyticsSessionId", str);
        return a;
    }

    /* renamed from: d */
    public void mo52065d(int i) {
        ArrayList arrayList = this.f95417e;
        int size = arrayList.size();
        boolean z = true;
        for (int i2 = 0; i2 < size; i2++) {
            bjwj bjwj = (bjwj) arrayList.get(i2);
            if (this.f124196aK.mo65593b(bjwj) && bjwj.f123509a.f130095e) {
                z = false;
            }
        }
        if (!z) {
            return;
        }
        if (mo52870ac()) {
            mo52873af();
        } else {
            mo52899i(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public bwgz mo52056b(PageDetails pageDetails) {
        if (pageDetails.f110468q != null) {
            return bwgz.HANDLE_UI_ERROR;
        }
        if (pageDetails.f110460i != null) {
            return bwgz.CONTINUE_FLOW_WITH_NEW_PAGE;
        }
        return bwgz.UNKNOWN_FLOW_INSTRUCTION;
    }

    /* renamed from: a */
    private static Object m81654a(Bundle bundle, bxxk bxxk) {
        if (bxxk == null) {
            return null;
        }
        try {
            return bjvp.m104730a(bundle, "lastNetworkMessage", bxxk);
        } catch (AssertionError | ClassCastException e) {
            return null;
        }
    }

    /* renamed from: b */
    public final Object mo52885b(Bundle bundle, byte[] bArr, List list) {
        bjuf bjuf = this.f95394ag;
        if (bjuf != null && !TextUtils.isEmpty(bjuf.f123340c)) {
            if (bundle == null || bundle == Bundle.EMPTY) {
                bundle = new Bundle();
            }
            bjuf bjuf2 = this.f95394ag;
            bxvd da = bmnk.f130113c.mo74144da();
            String str = bjuf2.f123340c;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmnk bmnk = (bmnk) da.f164949b;
            str.getClass();
            bmnk.f130115a |= 1;
            bmnk.f130116b = str;
            bjvp.m104736a(bundle, "pageDroidGuardFormValue", (bmnk) da.mo74062i());
        }
        return mo51902a(bundle, bArr, list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo52892d(boolean z) {
        if (z) {
            int size = this.f95424l.size();
            if (size > 0) {
                FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
                for (int i = 0; i < size; i++) {
                    ArrayList arrayList = (ArrayList) this.f95424l.valueAt(i);
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        beginTransaction.remove((Fragment) arrayList.get(i2));
                    }
                }
                beginTransaction.commit();
            }
            getChildFragmentManager().executePendingTransactions();
            FilterView filterView = this.f95383aA;
            if (filterView != null) {
                axaq axaq = filterView.f110523d;
                axaq.f95547a = (axap) axaq.f95548b.f124187b.findFragmentByTag("FilterCategoryDialogFragment");
                axap axap = axaq.f95547a;
                if (axap != null) {
                    axap.dismiss();
                    axaq.f95547a = null;
                }
            }
            this.f95376T.mo65616b();
        }
        this.f95424l.clear();
        this.f95363G.mo66040d();
        this.f95363G.mo66037b(false);
        this.f95386aD.clear();
        this.f95385aC.clear();
        this.f95374R.mo15542c();
        this.f95375S.mo15542c();
        this.f95403ap.clear();
        this.f95406as.clear();
        this.f95407at.clear();
        this.f95404aq.clear();
        this.f95402ao.clear();
        this.f95405ar.clear();
        this.f95387aE.mo15542c();
        this.f95408au.clear();
        this.f95409av.clear();
        this.f95410aw.clear();
        this.f95411ax.clear();
        this.f95412ay.clear();
        this.f95413az.clear();
        if (mo52074u() != null) {
            mo52074u().removeAllViews();
        }
    }

    /* renamed from: n */
    public final void mo52808n(boolean z) {
        boolean z2 = true;
        if (!z && this.f95398ak.f110469r != 3) {
            z2 = false;
        }
        super.mo52808n(z2);
    }

    /* renamed from: a */
    private final void m81655a(awyy awyy, String str) {
        if (this.f95358B.f110418b.f110406a == 1) {
            Log.e("PageFragment", str);
            bxvw bxvw = awyy.f95340b.f129973i;
            int size = bxvw.size();
            for (int i = 0; i < size; i++) {
                mo52852a(awyy, ((Long) bxvw.get(i)).longValue());
            }
            return;
        }
        throw new IllegalStateException(str);
    }

    /* renamed from: o */
    public final void mo51888o(boolean z) {
        this.f95415c.mo51888o(z);
    }

    /* renamed from: a */
    private final void m81656a(bwiv bwiv) {
        Intent a = awia.m79967a(bwiv, getActivity().getIntent(), this.f123962aG, this.f95358B);
        int a2 = bwix.m122006a(bwiv.f159696b);
        int i = 1;
        if (a2 == 0) {
            a2 = 1;
        }
        startActivityForResult(a, a2 - 1);
        ContextThemeWrapper contextThemeWrapper = this.f123962aG;
        String str = this.f95359C;
        int a3 = bwix.m122006a(bwiv.f159696b);
        if (a3 != 0) {
            i = a3;
        }
        NewWidgetActionEvent.m93813a(contextThemeWrapper, str, i - 1);
    }

    /* renamed from: a */
    private static final boolean m81657a(View view) {
        return (view instanceof CardView) || (view instanceof FilterView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo51914b(Object obj) {
        throw new UnsupportedOperationException("constructAndSendSubmitRequest not supported.");
    }

    /* renamed from: a */
    public final long mo52841a(bwgx bwgx) {
        Integer num = (Integer) this.f95379W.get(bwgx);
        if (num == null) {
            num = 1;
        }
        Integer valueOf = Integer.valueOf(num.intValue() + 1);
        long a = bjtc.m104550a(bwgx, num.intValue());
        this.f95379W.put(bwgx, valueOf);
        return -a;
    }

    /* renamed from: b */
    public final void mo52886b(int i, int i2) {
        awzi awzi = this.f95369M;
        if (awzi != null && !this.f95370N) {
            this.f95370N = true;
            awzi.mo51882i(i, i2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo52828b(Bundle bundle) {
        mo52896f(true);
        if (bundle == null) {
            bkfr.m105576a(this);
        }
        bkcz bkcz = (bkcz) getFragmentManager().findFragmentByTag("PageFragment.ErrorDialog");
        this.f95427z = bkcz;
        if (bkcz != null) {
            bkcz.f124032a = this;
        }
        this.f95395ah = new bjwr(getContext().getApplicationContext(), getLoaderManager(), mo51878cn(), awyd.m81488a(mo65983aw()), this);
    }

    /* renamed from: a */
    public final SparseArray mo52842a(Bundle bundle, List list) {
        SparseArray sparseArray = new SparseArray();
        boolean z = true;
        if (list != null && !list.isEmpty()) {
            z = false;
        }
        ArrayList arrayList = this.f95385aC;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bkde bkde = (bkde) arrayList.get(i);
            if ((z || list.contains(Long.valueOf(bkde.f124038d))) && (bkde.f124039e instanceof bkeb)) {
                int intValue = ((Integer) this.f95374R.mo15534a(bkde.f124038d)).intValue();
                ArrayList arrayList2 = (ArrayList) sparseArray.get(intValue);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    sparseArray.put(intValue, arrayList2);
                }
                arrayList2.add(((bkeb) bkde.f124039e).mo52944a(bundle));
            }
        }
        return sparseArray;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo52829b(awyy awyy) {
        int a = bmlu.m108157a(awyy.f95340b.f129968d);
        if (a != 0 && a == 3) {
            mo52831c(awyy);
            return;
        }
        Locale locale = Locale.US;
        int i = 1;
        Object[] objArr = new Object[1];
        int a2 = bmlu.m108157a(awyy.f95340b.f129968d);
        if (a2 != 0) {
            i = a2;
        }
        objArr[0] = Integer.valueOf(i - 1);
        throw new IllegalStateException(String.format(locale, "Unsupported uiType for nested component groups : %s", objArr));
    }

    /* renamed from: f */
    public final void mo52894f(int i) {
        awic awic = this.f95362F;
        if (awic != null) {
            awic.mo51875c(i > 0);
        }
    }

    /* renamed from: f */
    public final void mo52895f(Object obj) {
        mo52808n(false);
        bjuf bjuf = this.f95394ag;
        if (bjuf == null || !bjuf.mo65534a()) {
            mo52864a(mo51914b(obj), 3);
            mo52900j(3);
            return;
        }
        bjuf bjuf2 = this.f95394ag;
        bjuf2.f123343f = new bjue(bjuf2);
        bjuf2.f123338a.postDelayed(bjuf2.f123343f, (long) ((Integer) bjwe.f123505z.mo54082a()).intValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo52843a(Bundle bundle, View view) {
        awib awib;
        super.mo52843a(bundle, view);
        if (!(bundle == null || (awib = this.f95361E) == null)) {
            awib.mo51871b(bundle);
        }
        if (this.f95397aj != null && this.f95368L == 0) {
            mo52880am();
        }
        return view;
    }

    /* renamed from: c */
    private final void mo52063c(boolean z) {
        awib awib = this.f95361E;
        if (awib != null) {
            awib.mo51868a(this.f95422j);
            if (this.f95388aa || (this.f95389ab && !this.f95361E.mo51880g() && this.f124195aJ)) {
                this.f95389ab = false;
                awia.m79996b(this.f95357A, !this.f124195aJ);
            }
            this.f95361E.mo51872b(z);
        }
    }

    /* renamed from: a */
    public final bkbn mo52844a(bmdb bmdb, int i, ViewGroup viewGroup, boolean z) {
        int i2;
        ViewGroup viewGroup2;
        boolean z2;
        int i3 = i;
        int i4 = this.f95378V;
        if (!z) {
            i2 = 0;
        } else {
            i2 = (i3 == 1 || i3 == 13) ? 0 : i4;
        }
        int a = bmcy.m107909a(bmdb.f128778j);
        if (a == 0 || a != 2 || mo52074u() == null) {
            viewGroup2 = viewGroup;
        } else {
            viewGroup2 = mo52074u();
        }
        if (this.f95358B.f110418b.f110412g == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        ContextThemeWrapper contextThemeWrapper = this.f123962aG;
        bkbn a2 = bkbs.m105283a(bmdb, i, contextThemeWrapper, this.f124196aK, mo65980at(), this.f123963aH, viewGroup2, i2, i2, this.f95376T.mo65614a(), bkfr.m105621h(contextThemeWrapper), bkfr.m105623i(contextThemeWrapper), z2);
        this.f95402ao.add(a2);
        return a2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo52887b(awyy awyy, long j) {
        int intValue = ((Integer) this.f95374R.mo15534a(j)).intValue();
        boolean z = false;
        if (!(!awyy.mo52801c() || intValue == 13 || intValue == 22 || intValue == 14 || intValue == 9 || intValue == 37)) {
            z = true;
        }
        FrameLayout frameLayout = new FrameLayout(this.f123962aG);
        awyy.f95341c.addView(frameLayout);
        if (z) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            C1260oz.m19821a(marginLayoutParams, this.f95377U);
            C1260oz.m19823b(marginLayoutParams, this.f95377U);
        }
        awyx a = awyy.mo52799a();
        a.mo52798a(frameLayout);
        mo52890c(a.mo52797a(), j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo52896f(boolean z) {
        if (z) {
            this.f124196aK = null;
            this.f95416d.clear();
            this.f95417e.clear();
            this.f95420h.clear();
            if (((Boolean) awjl.f94549k.mo58455c()).booleanValue()) {
                this.f95418f.clear();
                this.f95419g.clear();
            }
        }
        if (mo51924h() != null) {
            bjwk bjwk = this.f124196aK;
            if (bjwk == null) {
                this.f124196aK = new bjwk(mo51924h(), chgl.m148679c());
                bjwk = this.f124196aK;
                bjwk.f123519i = this;
            }
            bjwk.mo65592a(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public PageDetails mo52061c(PageDetails pageDetails) {
        return new PageDetails(pageDetails);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean):void
     arg types: [com.google.android.gms.wallet.ui.common.PageDetails, int]
     candidates:
      awzk.a(android.os.Bundle, bxxk):java.lang.Object
      awzk.a(awyy, java.lang.String):void
      awzk.a(android.os.Bundle, java.util.List):android.util.SparseArray
      awzk.a(android.os.Bundle, android.view.View):android.view.View
      awzk.a(int, java.lang.Class):java.util.ArrayList
      awzk.a(int, int):void
      awzk.a(int, android.os.Bundle):void
      awzk.a(int, bkdx):void
      awzk.a(long, bxxc):void
      awzk.a(android.view.View, rx):void
      awzk.a(awyy, long):void
      awzk.a(bmav, bmaq):void
      awzk.a(bmmv, java.util.List):void
      awzk.a(bwhy, byte[]):void
      awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, int):void
      awzk.a(java.lang.Object, int):void
      awzk.a(java.lang.String, java.lang.String):void
      awzk.a(boolean, boolean):boolean
      bkge.a(android.os.Bundle, android.view.View):android.view.View
      bkge.a(int, android.os.Bundle):void
      bkge.a(android.view.View, java.lang.String):void
      bkbr.a(int, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      bkbr.a(android.os.Bundle, android.view.View):android.view.View
      bjxu.a(android.view.View, java.lang.String):void
      bkdb.a(int, android.os.Bundle):void
      bkcy.a(int, int):void
      bjwm.a(bmmv, java.util.List):void
      awym.a(android.view.View, rx):void
      awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzk.a(bmav, boolean, boolean):void
     arg types: [bmav, boolean, int]
     candidates:
      awzk.a(com.google.android.gms.wallet.shared.BuyFlowConfig, java.lang.String, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      awzk.a(bmdb, android.view.ViewGroup, boolean):bkbn
      awzk.a(android.os.Bundle, byte[], java.util.List):java.lang.Object
      awzk.a(long, int, int):void
      awzk.a(awyy, int, long):void
      awzk.a(bmnr, android.view.ViewGroup, boolean):void
      awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, int, int):void
      awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean, java.lang.String):void
      awzk.a(java.util.List, android.view.ViewGroup, boolean):void
      bkbr.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View
      awzk.a(bmav, boolean, boolean):void */
    /* renamed from: b */
    public void mo52830b(PageDetails pageDetails, boolean z, String str) {
        bwiq bwiq;
        bwgz bwgz = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        int i = 1;
        switch (pageDetails.f110454c.ordinal()) {
            case 1:
            case 7:
            case 8:
            case 9:
                if (pageDetails.f110460i == null) {
                    int i2 = pageDetails.f110454c.f159484u;
                    StringBuilder sb = new StringBuilder(56);
                    sb.append("No page proto provided for flow instruction: ");
                    sb.append(i2);
                    Log.e("PageFragment", sb.toString());
                    mo52897g(-1);
                    return;
                }
                int i3 = spn.f44932a;
                m81661d(pageDetails);
                return;
            case 2:
                if (this.f95397aj == null) {
                    Log.e("PageFragment", "No mActivePage for continue with current page instruction.");
                    mo52897g(-1);
                    return;
                }
                mo52862a(pageDetails, true);
                mo51904a(0);
                mo52815O();
                return;
            case 3:
            case 4:
                mo52808n(false);
                mo52862a(pageDetails, false);
                bwiv bwiv = pageDetails.f110458g.f159691a;
                if (bwiv == null) {
                    bwiv = bwiv.f159693e;
                }
                Intent a = awia.m79967a(bwiv, getActivity().getIntent(), this.f123962aG, this.f95358B);
                if (pageDetails.f110454c == bwgz.CONTINUE_FLOW_WITH_NEXT_WIDGET_AND_SUBMIT_FLOW_IF_WIDGET_IS_CLOSED) {
                    startActivityForResult(a, 1002);
                    return;
                } else {
                    startActivityForResult(a, 1007);
                    return;
                }
            case 5:
            case 13:
            case 15:
                mo52862a(pageDetails, false);
                mo52873af();
                return;
            case 6:
                mo52899i(11);
                return;
            case 10:
                if (pageDetails.f110468q == null) {
                    Log.e("PageFragment", "No error provided for HANDLE_UI_ERROR instruction.");
                    mo52897g(-1);
                    return;
                }
                mo52862a(pageDetails, true);
                mo52808n(true);
                mo52856a(pageDetails.f110468q, z, false);
                return;
            case 11:
            case 14:
                if (pageDetails.f110460i == null) {
                    int i4 = pageDetails.f110454c.f159484u;
                    StringBuilder sb2 = new StringBuilder(58);
                    sb2.append("No overlayProto provided for flow instruction: ");
                    sb2.append(i4);
                    Log.e("PageFragment", sb2.toString());
                    mo52897g(-1);
                    return;
                }
                int i5 = spn.f44932a;
                if (mo51912a(pageDetails)) {
                    mo52862a(pageDetails, true);
                    mo52808n(true);
                    return;
                }
                return;
            case 12:
                if (pageDetails.f110461j == null) {
                    int i6 = pageDetails.f110454c.f159484u;
                    StringBuilder sb3 = new StringBuilder(60);
                    sb3.append("No basePage proto provided for flow instruction: ");
                    sb3.append(i6);
                    Log.e("PageFragment", sb3.toString());
                    mo52897g(-1);
                    return;
                } else if (pageDetails.f110460i == null) {
                    int i7 = pageDetails.f110454c.f159484u;
                    StringBuilder sb4 = new StringBuilder(59);
                    sb4.append("No overlay proto provided for flow instruction: ");
                    sb4.append(i7);
                    Log.e("PageFragment", sb4.toString());
                    mo52897g(-1);
                    return;
                } else {
                    int i8 = spn.f44932a;
                    if (!mo51912a(mo52061c(pageDetails))) {
                        pageDetails.f110460i = pageDetails.f110461j;
                        m81661d(pageDetails);
                        return;
                    }
                    throw new IllegalArgumentException("Overlay can not be displayed inline if the flow_instruction is CONTINUE_FLOW_WITH_NEW_PAGE_IN_OVERLAY_AND_UPDATE_BASE_PAGE");
                }
            case 16:
                this.f95368L = 2;
                if (mo52070p()) {
                    this.f95401an = pageDetails.f110460i;
                    this.f95393af.f2143b = new awzj(this);
                    mo52882ao().mo2489a(this.f95393af, mo51927n());
                    mo52882ao().mo2488a(this.f95393af);
                } else {
                    mo52180e(pageDetails.f110460i);
                }
                if (mo52838X()) {
                    mo51904a(this.f95368L);
                    return;
                }
                return;
            case 17:
                bwit bwit = pageDetails.f110462k;
                int a2 = bwis.m122001a(bwit.f159687c);
                if (a2 != 0 && a2 == 2) {
                    if (bwit.f159685a == 3) {
                        bwiq = (bwiq) bwit.f159686b;
                    } else {
                        bwiq = bwiq.f159670k;
                    }
                    Intent intent = new Intent("com.android.vending.billing.PURCHASE").addCategory("android.intent.category.DEFAULT").setPackage("com.android.vending");
                    if (bwiq.f159680i.size() > 0) {
                        intent.putStringArrayListExtra("serialized_docid_list", new ArrayList(bwiq.f159680i));
                    }
                    if ((bwiq.f159672a & 128) != 0) {
                        intent.putExtra("paymentsPurchaseParams", bwiq.f159681j);
                    }
                    if ((bwiq.f159672a & 1) != 0) {
                        intent.putExtra("authAccount", bwiq.f159673b);
                    }
                    if ((bwiq.f159672a & 2) != 0) {
                        intent.putExtra("offer_type", bwiq.f159674c);
                    }
                    if ((bwiq.f159672a & 4) != 0) {
                        intent.putExtra("offer_filter", bwiq.f159675d);
                    }
                    if ((bwiq.f159672a & 8) != 0) {
                        intent.putExtra("referral_url", bwiq.f159676e);
                    }
                    if ((bwiq.f159672a & 16) != 0) {
                        intent.putExtra("requires_checkout", bwiq.f159677f);
                    }
                    if ((bwiq.f159672a & 32) != 0) {
                        intent.putExtra("indirect_provisioning_type", bwiq.f159678g);
                    }
                    if ((bwiq.f159672a & 64) != 0) {
                        intent.putExtra("family_consistency_token", bwiq.f159679h);
                    }
                    startActivityForResult(intent, 1008);
                    return;
                }
                int a3 = bwis.m122001a(bwit.f159687c);
                if (a3 != 0) {
                    i = a3;
                }
                StringBuilder sb5 = new StringBuilder(40);
                sb5.append("Unsupported proxy flow type: ");
                sb5.append(i - 1);
                throw new IllegalArgumentException(sb5.toString());
            case 18:
                mo52862a(pageDetails, true);
                mo52072r();
                return;
            case 19:
                m81661d(pageDetails);
                mo52072r();
                return;
            default:
                Log.e("PageFragment", String.format(Locale.US, "Unexpected flow instruction provided: %s", Integer.valueOf(pageDetails.f110454c.f159484u)));
                mo52897g(-1);
                return;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo52890c(awyy awyy, long j) {
        int intValue = ((Integer) this.f95374R.mo15534a(j)).intValue();
        int a = this.f95376T.mo65614a();
        awyy.f95341c.setId(a);
        bxxc a2 = mo52042a(j);
        if (!(a2 instanceof bmbd) || (a2 = awia.m79971a(getActivity(), (bmbd) a2)) != null) {
            bkdx a3 = mo52846a(awyy, a2, intValue, a);
            boolean b = awyy.mo52800b();
            if (b) {
                awyy.f95342d.f152305a.mo66032a(a3);
                awyy.f95342d.mo72160a(new bkde(a3));
                awyy.f95342d.mo72169i();
            } else if (a3.mo52776bU() != null) {
                awyy.f95343e.mo66032a(a3);
            }
            a3.f124071y = false;
            if ((a3 instanceof axaw) && b) {
                ((axaw) a3).f95578h = true;
            }
        }
    }

    /* renamed from: a */
    public final bkbn mo52845a(bmdb bmdb, ViewGroup viewGroup, boolean z) {
        int a = bmda.m107911a(bmdb.f128777i);
        if (a == 0) {
            a = 1;
        }
        return mo52844a(bmdb, a, viewGroup, z);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzs.a(bmeb, int, boolean, java.lang.String, boolean, com.google.android.wallet.clientlog.LogContext, com.google.android.gms.wallet.shared.BuyFlowConfig):awzs
     arg types: [bmeb, int, int, java.lang.String, boolean, com.google.android.wallet.clientlog.LogContext, com.google.android.gms.wallet.shared.BuyFlowConfig]
     candidates:
      bkjj.a(android.view.ViewGroup, com.google.android.wallet.ui.expander.SummaryExpanderWrapper, bmdx, java.lang.String, int, int, boolean):void
      awzs.a(bmeb, int, boolean, java.lang.String, boolean, com.google.android.wallet.clientlog.LogContext, com.google.android.gms.wallet.shared.BuyFlowConfig):awzs */
    /* renamed from: a */
    public final bkdx mo52846a(awyy awyy, bxxc bxxc, int i, int i2) {
        bmeb bmeb;
        boolean isEmpty = mo52847a(14, axbv.class).isEmpty();
        bjwk bjwk = this.f124196aK;
        FragmentManager childFragmentManager = getChildFragmentManager();
        LogContext at = mo65980at();
        String str = this.f95359C;
        boolean z = awyy.f95339a;
        boolean b = awyy.mo52800b();
        bpis t = mo52073t();
        int i3 = this.f123961aF;
        BuyFlowConfig buyFlowConfig = this.f95358B;
        bkdx bkdx = (bkdx) childFragmentManager.findFragmentById(i2);
        if (!z && bkdx != null) {
            bkdx.f124196aK = bjwk;
        } else {
            if (bxxc instanceof bmgn) {
                bkdx = axbr.m82191a((bmgn) bxxc, i3, str, at, buyFlowConfig);
            } else if (bxxc instanceof bmeb) {
                bmeb bmeb2 = (bmeb) bxxc;
                if (awzs.m81801a(bmeb2)) {
                    bxvd bxvd = (bxvd) bmeb2.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) bmeb2);
                    bmeb = (bmeb) ((bmdz) bxvd).mo74062i();
                } else {
                    bmeb = bmeb2;
                }
                bkdx = awzs.m81800a(bmeb, i3, false, str, b, at, buyFlowConfig);
            } else if (bxxc instanceof bmof) {
                bmof bmof = (bmof) bxxc;
                sdo.m34962a(bmof.f130220d.size(), "At least one option must be provided.");
                axaw axaw = new axaw();
                Bundle a = bkdx.m105383a(i3, bmof, at);
                a.putString("analyticsId", str);
                axaw.setArguments(a);
                bkdx = axaw;
            } else if (bxxc instanceof bmkt) {
                bkdx = axco.m82324a((bmkt) bxxc, i3, at);
            } else if (bxxc instanceof bmjv) {
                axbv axbv = new axbv();
                Bundle a2 = bkdx.m105383a(i3, (bmjv) bxxc, at);
                a2.putBoolean("isTopContainer", isEmpty);
                axbv.setArguments(a2);
                bkdx = axbv;
            } else if (bxxc instanceof bmen) {
                axab axab = new axab();
                axab.setArguments(bkdx.m105383a(i3, (bmen) bxxc, at));
                bkdx = axab;
            } else if (bxxc instanceof bmeq) {
                bkdx = axae.m81889a((bmeq) bxxc, i3, str, t, at);
            } else if (bxxc instanceof bmbd) {
                bkdx = awzu.m81821a((bmbd) bxxc, buyFlowConfig.f110418b.f110407b, i3, str, at);
            } else if (bxxc instanceof bmet) {
                bkdx = axag.m81905a((bmet) bxxc, i3, at);
            } else if (bxxc instanceof bmjh) {
                bkdx = axbt.m82230a((bmjh) bxxc, i3, at);
            } else if (bxxc instanceof bmjf) {
                bmjf bmjf = (bmjf) bxxc;
                bxvd da = bmjh.f129700e.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmjh bmjh = (bmjh) da.f164949b;
                bmjf.getClass();
                bmjh.f129703b = bmjf;
                int i4 = bmjh.f129702a | 1;
                bmjh.f129702a = i4;
                long j = bmjf.f129688b;
                bmjh.f129702a = i4 | 2;
                bmjh.f129705d = j;
                bkdx = axbt.m82230a((bmjh) da.mo74062i(), i3, at);
            } else if (bxxc instanceof bmcb) {
                bkdx = awyq.m81545a((bmcb) bxxc, i3, at, buyFlowConfig);
            } else if (bxxc instanceof bmfs) {
                bkdx = bjvh.m104692a((bmfs) bxxc, i3, at);
            } else if (bxxc instanceof bwin) {
                axcf axcf = new axcf();
                Bundle a3 = bkdx.m105383a(i3, (bwin) bxxc, at);
                a3.putString("analyticsId", str);
                axcf.setArguments(a3);
                bkdx = axcf;
            } else if (bxxc instanceof bmfd) {
                axam axam = new axam();
                Bundle a4 = bkdx.m105383a(i3, (bmfd) bxxc, at);
                a4.putString("flowAnalyticsId", str);
                axam.setArguments(a4);
                bkdx = axam;
            } else if (bxxc instanceof bmdj) {
                bkdx = axcp.m82327a((bmdj) bxxc, i3, str, at);
            } else {
                throw new IllegalArgumentException("Unknown component type");
            }
            bkdx.f124196aK = bjwk;
            childFragmentManager.beginTransaction().replace(i2, bkdx).commit();
        }
        mo52849a(i, bkdx);
        OrchestrationViewEvent.m93828c(getActivity(), this.f95359C, bkdx.mo51919co());
        this.f95385aC.add(new bkde(bkdx));
        this.f95386aD.add(bkdx);
        return bkdx;
    }

    /* renamed from: c */
    public final void mo52891c(String str) {
        this.f95422j = str;
        awib awib = this.f95361E;
        if (awib != null && awib.mo51880g()) {
            mo52063c(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public bxxc mo52042a(long j) {
        throw new IllegalStateException("Child class should implement this.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public PageDetails mo52043a(Intent intent) {
        PageDetails J = mo52038J();
        J.f110454c = bwgz.COMPLETE_FLOW_IMMEDIATELY;
        return J;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo51902a(Bundle bundle, byte[] bArr, List list) {
        throw new UnsupportedOperationException("createPageValue not supported.");
    }

    /* renamed from: a */
    public final ArrayList mo52847a(int i, Class cls) {
        ArrayList arrayList = (ArrayList) this.f95424l.get(i, new ArrayList());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add((bkdx) cls.cast(arrayList.get(i2)));
        }
        return arrayList2;
    }

    /* renamed from: a */
    public void mo51904a(int i) {
        this.f95380X.clear();
        if (this.f124196aK != null) {
            List<bwic> cg = mo52766cg();
            if (cg != null) {
                for (bwic bwic : cg) {
                    bjwf bjwf = new bjwf();
                    bjwl.m104784a(bjwf, bwic.f159616c, this.f124196aK);
                    this.f95380X.add(bjwf);
                }
            }
            List<bmoa> q = mo52071q();
            if (q != null) {
                for (bmoa bmoa : q) {
                    bjwf bjwf2 = new bjwf();
                    bjwl.m104784a(bjwf2, bmoa.f130203b, this.f124196aK);
                    this.f95380X.add(bjwf2);
                }
            }
            m81662g(this.f95398ak.f110460i);
            List list = this.f95398ak.f110457f;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    m81662g(this.f95398ak.f110457f.get(i2));
                }
            }
            bjwl.m104784a(this, 4, this.f124196aK);
            bjwl.m104784a(this.f95395ah, 5, this.f124196aK);
            this.f124196aK.mo65592a(false);
            if (!chgi.m148673b()) {
                mo51915b(i);
            }
        }
        if (i != 0) {
            mo52815O();
        }
        mo51922f();
        this.f95363G.mo66037b(true);
        this.f95363G.mo66046g();
        if (this.f95383aA != null && mo52070p()) {
            mo52882ao().mo2489a(this.f95393af, mo51927n());
            FilterView filterView = this.f95383aA;
            atj ao = mo52882ao();
            asw asw = this.f95393af;
            filterView.f110526g = true;
            filterView.f110527h = ao;
            filterView.f110528i = asw;
        }
        if (chgi.m148673b()) {
            mo51915b(i);
        }
        this.f95368L = 0;
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean, java.lang.String):void
     arg types: [com.google.android.gms.wallet.ui.common.PageDetails, int, java.lang.String]
     candidates:
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
    /* renamed from: b */
    public final void mo52888b(String str) {
        boolean z;
        bwfv bwfv;
        if (this.f95399al != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "initialPageDetails must be provided before calling handleInitialPageDetails.");
        if (!this.f95371O) {
            LogContext at = mo65980at();
            PageDetails pageDetails = this.f95399al;
            bmaq bmaq = pageDetails.f110465n;
            List list = pageDetails.f110455d;
            if (!bjst.m104536d(at)) {
                Log.e("ClientLog", "Tried to log prefetchedInitialize() in an invalid session.");
            } else {
                bxvd e = bjst.m104537e(at);
                bwfe bwfe = bwfe.EVENT_NAME_PREFETCHED_INITIALIZE;
                if (e.f164950c) {
                    e.mo74035c();
                    e.f164950c = false;
                }
                bwfr bwfr = (bwfr) e.f164949b;
                bwfr bwfr2 = bwfr.f159113m;
                bwfr.f159121g = bwfe.f159083I;
                bwfr.f159115a |= 4;
                bwfv bwfv2 = bwfv.f159143e;
                if (e.f164950c) {
                    e.mo74035c();
                    e.f164950c = false;
                }
                bwfr bwfr3 = (bwfr) e.f164949b;
                bwfv2.getClass();
                bwfr3.f159117c = bwfv2;
                bwfr3.f159116b = 16;
                if (bmaq != null) {
                    bxvd da = bwfv.f159143e.mo74144da();
                    ByteString bxtx = bmaq.f128484d;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bwfv bwfv3 = (bwfv) da.f164949b;
                    bxtx.getClass();
                    bwfv3.f159145a |= 1;
                    bwfv3.f159146b = bxtx;
                    bxvv bxvv = new bxvv(bmaq.f128486f, bmaq.f128477g);
                    ArrayList arrayList = new ArrayList(bxvv.size());
                    int size = bxvv.size();
                    for (int i = 0; i < size; i++) {
                        arrayList.add(Integer.valueOf(((bxvp) bxvv.get(i)).mo3214a()));
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bwfv bwfv4 = (bwfv) da.f164949b;
                    if (!bwfv4.f159147c.mo73666a()) {
                        bwfv4.f159147c = GeneratedMessageLite.m124019a(bwfv4.f159147c);
                    }
                    bxsy.m123078a(arrayList, bwfv4.f159147c);
                    if (e.f164950c) {
                        e.mo74035c();
                        e.f164950c = false;
                    }
                    bwfr bwfr4 = (bwfr) e.f164949b;
                    bwfv bwfv5 = (bwfv) da.mo74062i();
                    bwfv5.getClass();
                    bwfr4.f159117c = bwfv5;
                    bwfr4.f159116b = 16;
                }
                if (list != null) {
                    bwfr bwfr5 = (bwfr) e.f164949b;
                    if (bwfr5.f159116b == 16) {
                        bwfv = (bwfv) bwfr5.f159117c;
                    } else {
                        bwfv = bwfv.f159143e;
                    }
                    bxvd bxvd = (bxvd) bwfv.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) bwfv);
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bwfv bwfv6 = (bwfv) bxvd.f164949b;
                    if (!bwfv6.f159148d.mo73666a()) {
                        bwfv6.f159148d = GeneratedMessageLite.m124019a(bwfv6.f159148d);
                    }
                    bxsy.m123078a(list, bwfv6.f159148d);
                    if (e.f164950c) {
                        e.mo74035c();
                        e.f164950c = false;
                    }
                    bwfr bwfr6 = (bwfr) e.f164949b;
                    bwfv bwfv7 = (bwfv) bxvd.mo74062i();
                    bwfv7.getClass();
                    bwfr6.f159117c = bwfv7;
                    bwfr6.f159116b = 16;
                }
                bjst.m104528a(at.mo71783b(), (bwfr) e.mo74062i());
            }
        }
        mo52364a(this.f95399al, true, str);
        this.f95399al = null;
    }

    /* renamed from: a */
    public void mo52044a(int i, int i2) {
        this.f95427z = null;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 5) {
                        mo52808n(true);
                    } else if (i2 == 1000) {
                        if (i == 1) {
                            mo51911a(this.f95366J);
                        } else if (i == 2) {
                            mo52899i(7);
                        } else {
                            StringBuilder sb = new StringBuilder(35);
                            sb.append("Unexpected button code: ");
                            sb.append(i);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                } else if (i == 1) {
                    mo51911a(this.f95366J);
                } else if (i == 2) {
                    mo52899i(6);
                } else {
                    StringBuilder sb2 = new StringBuilder(35);
                    sb2.append("Unexpected button code: ");
                    sb2.append(i);
                    throw new IllegalArgumentException(sb2.toString());
                }
            } else if (i == 0 || i == 2) {
                mo52808n(true);
                PageDetails pageDetails = this.f95398ak;
                pageDetails.f110468q = null;
                pageDetails.f110454c = bwgz.CONTINUE_FLOW_WITH_CURRENT_PAGE;
            } else {
                StringBuilder sb3 = new StringBuilder(35);
                sb3.append("Unexpected button code: ");
                sb3.append(i);
                throw new IllegalArgumentException(sb3.toString());
            }
        } else if (i == 0 || i == 2) {
            mo52897g(-1);
        } else {
            StringBuilder sb4 = new StringBuilder(35);
            sb4.append("Unexpected button code: ");
            sb4.append(i);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    /* renamed from: a */
    public final void mo52848a(int i, int i2, bmaq bmaq, List list, int i3) {
        if (C1710chip.m148790b() && (getActivity() instanceof awfk) && bmaq != null) {
            ((awfk) getActivity()).mo51887o().f94272c = bmaq.f128484d.getKey();
        }
        bjst.m104524a(mo65980at(), this.f95364H, i, i2, bmaq, list, i3);
        this.f95364H = null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzk.a(bmav, java.lang.String, boolean, boolean):void
     arg types: [bmav, java.lang.String, int, int]
     candidates:
      awzk.a(com.google.android.gms.wallet.shared.BuyFlowConfig, java.lang.String, com.google.android.gms.wallet.ui.common.PageDetails, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      awzk.a(bmdb, int, android.view.ViewGroup, boolean):bkbn
      awzk.a(awyy, bxxc, int, int):bkdx
      awzk.a(bmav, bmaq, java.util.List, int):void
      awzk.a(bmav, java.lang.String, boolean, boolean):void */
    /* renamed from: a */
    public void mo51905a(int i, Bundle bundle) {
        if (i != 4) {
            if (i == 5) {
                bmav a = bjvg.m104690a(bundle);
                String string = bundle.getString("ErrorUtils.KEY_TITLE");
                mo52808n(true);
                mo52855a(a, string, false, false);
            } else if (i != 9) {
                if (i == 10) {
                    mo52897g(-1);
                } else if (i != 25) {
                    switch (i) {
                        case 17:
                            this.f95388aa = true;
                            return;
                        case 18:
                            mo52808n(bundle.getBoolean("EventListener.EXTRA_ENABLE_UI_ENABLED", true));
                            return;
                        case 19:
                            mo52899i(6);
                            return;
                        case 20:
                            if (this.f124196aK != null) {
                                int size = this.f95419g.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    this.f124196aK.mo65590a((bjwj) this.f95419g.get(i2));
                                }
                                return;
                            }
                            return;
                        case 21:
                            bwhm bwhm = (bwhm) bjvp.m104730a(bundle, "EventListener.EXTRA_LINK_PROTO", (bxxk) bwhm.f159522h.mo74142c(7));
                            bwiv bwiv = bwhm.f159528e;
                            if (bwiv == null) {
                                bwiv = bwiv.f159693e;
                            }
                            if ((bwhm.f159524a & 8) == 0) {
                                bwiu bwiu = bwhm.f159527d;
                                if (bwiu == null) {
                                    bwiu = bwiu.f159689b;
                                }
                                bwiv = bwiu.f159691a;
                                if (bwiv == null) {
                                    bwiv = bwiv.f159693e;
                                }
                            }
                            m81656a(bwiv);
                            return;
                        case 22:
                            byte[] byteArray = bundle.getByteArray("EventListener.EXTRA_ALERT_ACTION_TOKEN");
                            Intent intent = getActivity().getIntent();
                            ContextThemeWrapper contextThemeWrapper = this.f123962aG;
                            BuyFlowConfig buyFlowConfig = this.f95358B;
                            awku awku = new awku(awia.m79966a(intent));
                            awku.f94574a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", byteArray);
                            startActivityForResult(ChooseAccountShimChimeraActivity.m94040a(contextThemeWrapper, awku.mo52186a(), buyFlowConfig), 1003);
                            NewWidgetActionEvent.m93813a(this.f123962aG, this.f95359C, 1000);
                            return;
                        default:
                            return;
                    }
                } else {
                    if (this.f95394ag == null) {
                        this.f95394ag = new bjuf(getActivity(), getLoaderManager(), this);
                    }
                    bjuf bjuf = this.f95394ag;
                    bmnj bmnj = (bmnj) bjvp.m104730a(bundle, "EventListener.EXTRA_DROID_GUARD_FORM", (bxxk) bmnj.f130108c.mo74142c(7));
                    bmnj bmnj2 = bjuf.f123339b;
                    if (bmnj2 == null || !bmnj2.equals(bmnj)) {
                        bjuf.f123340c = null;
                        bjuf.mo65535b();
                    }
                    bjuf.f123339b = bmnj;
                    if (TextUtils.isEmpty(bjuf.f123340c) && !bjuf.mo65534a()) {
                        bjuf.f123341d.initLoader(1, Bundle.EMPTY, bjuf);
                    }
                }
            } else if (mo52838X()) {
                this.f95363G.mo66047g(true);
            }
        } else if (this.f95397aj != null && mo52838X()) {
            mo51904a(this.f95368L);
        }
    }

    /* renamed from: b */
    public final boolean mo52889b(bwio bwio) {
        bwio bwio2;
        if (bwio == null || (bwio2 = (bwio) this.f95387aE.mo15534a(bwio.f159662b)) == null) {
            return false;
        }
        bwip bwip = bwio2.f159663c;
        if (bwip == null) {
            bwip = bwip.f159664e;
        }
        return bwip.f159667b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52849a(int i, bkdx bkdx) {
        ArrayList arrayList = (ArrayList) this.f95424l.get(i);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f95424l.put(i, arrayList);
        }
        arrayList.add(bkdx);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52850a(long j, int i, int i2) {
        this.f95374R.mo15540b(j, Integer.valueOf(i));
        this.f95375S.mo15540b(j, Integer.valueOf(i2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo52045a(long j, bxxc bxxc) {
        throw new IllegalStateException("Child class should implement this.");
    }

    /* renamed from: a */
    public final void mo51865a(View view, C1339rx rxVar) {
        this.f95415c.mo51865a(view, rxVar);
    }

    /* renamed from: a */
    public final void mo52851a(awib awib) {
        this.f95361E = awib;
        mo51922f();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.widget.FrameLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzk.a(bmdb, android.view.ViewGroup, boolean):bkbn
     arg types: [bmdb, android.view.ViewGroup, int]
     candidates:
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
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x022a  */
    /* renamed from: a */
    public void mo52824a(awyy awyy) {
        bmlv bmlv;
        int size;
        boolean z;
        bmlg bmlg;
        int a;
        bmls bmls;
        int i;
        awyy awyy2 = awyy;
        int a2 = bmlu.m108157a(awyy2.f95340b.f129968d);
        int i2 = 1;
        int i3 = 0;
        if (a2 != 0 && a2 == 2) {
            int a3 = bmlb.m108136a(awyy2.f95340b.f129979o);
            if (a3 != 0 && a3 == 2) {
                TypedArray obtainStyledAttributes = this.f123962aG.obtainStyledAttributes(new int[]{C0126R.attr.isLightTheme});
                boolean z2 = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
                LinearLayout linearLayout = new LinearLayout(this.f123962aG);
                linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                Resources resources = getResources();
                if (!z2) {
                    i = C0126R.color.wallet_page_error_background_dark;
                } else {
                    i = C0126R.color.wallet_page_error_background_light;
                }
                linearLayout.setBackgroundColor(resources.getColor(i));
                awyy2.f95341c.addView(linearLayout);
                awyx a4 = awyy.mo52799a();
                a4.mo52798a(linearLayout);
                awyy2 = a4.mo52797a();
            }
            bxvw bxvw = awyy2.f95340b.f129973i;
            int size2 = bxvw.size();
            while (i3 < size2) {
                mo52852a(awyy2, ((Long) bxvw.get(i3)).longValue());
                i3++;
            }
            return;
        }
        int a5 = bmlu.m108157a(awyy2.f95340b.f129968d);
        if ((a5 != 0 && a5 == 6) || ((a = bmlu.m108157a(awyy2.f95340b.f129968d)) != 0 && a == 9)) {
            CardView cardView = (CardView) this.f123963aH.inflate((int) C0126R.C0128layout.wallet_view_card_view, awyy2.f95341c, false);
            awyy2.f95341c.addView(cardView);
            CollapsibleCardContentsView collapsibleCardContentsView = (CollapsibleCardContentsView) cardView.findViewById(C0126R.C0129id.card_content_holder);
            collapsibleCardContentsView.setId(this.f95376T.mo65614a());
            this.f95410aw.add(collapsibleCardContentsView);
            FrameLayout frameLayout = collapsibleCardContentsView.f110079e;
            bmlv bmlv2 = awyy2.f95340b;
            long j = -1;
            if (bmlv2.f129966b == 16) {
                long j2 = ((bmlg) bmlv2.f129967c).f129933c;
                if (j2 > 0) {
                    awyx a6 = awyy.mo52799a();
                    a6.mo52798a(frameLayout);
                    awyy a7 = a6.mo52797a();
                    bmlv bmlv3 = awyy2.f95340b;
                    if (bmlv3.f129966b == 16) {
                        bmlg = (bmlg) bmlv3.f129967c;
                    } else {
                        bmlg = bmlg.f129929d;
                    }
                    mo52852a(a7, bmlg.f129933c);
                    View childAt = frameLayout.getChildAt(0);
                    if (childAt instanceof CardHeaderView) {
                        collapsibleCardContentsView.f110081g = (CardHeaderView) childAt;
                    }
                    j = j2;
                    bmlv = awyy2.f95340b;
                    if (bmlv.f129966b == 16) {
                        bmlg bmlg2 = (bmlg) bmlv.f129967c;
                        collapsibleCardContentsView.f110075a = getActivity();
                        int i4 = 5;
                        if (bmlg2 != null) {
                            i4 = bmlf.m108142a(bmlg2.f129931a);
                            if (i4 == 0) {
                                i4 = 1;
                            }
                            collapsibleCardContentsView.f110082h = i4;
                        } else {
                            collapsibleCardContentsView.f110082h = 5;
                        }
                        int i5 = i4 - 1;
                        if (i5 != 1) {
                            if (i5 == 2) {
                                collapsibleCardContentsView.f110079e.setVisibility(8);
                                collapsibleCardContentsView.f110080f.setVisibility(0);
                            } else if (i5 != 3) {
                                if (i5 != 4) {
                                    Locale locale = Locale.US;
                                    Object[] objArr = new Object[1];
                                    int a8 = bmlf.m108142a(bmlg2.f129931a);
                                    if (a8 != 0) {
                                        i2 = a8;
                                    }
                                    objArr[0] = Integer.valueOf(i2 - 1);
                                    throw new IllegalArgumentException(String.format(locale, "Unknown cardStyle: %d", objArr));
                                }
                                collapsibleCardContentsView.f110079e.setVisibility(0);
                                collapsibleCardContentsView.f110080f.setVisibility(0);
                            }
                        }
                        collapsibleCardContentsView.f110078d = !bmlg2.f129932b;
                        CardHeaderView cardHeaderView = collapsibleCardContentsView.f110081g;
                        if (cardHeaderView != null) {
                            int a9 = bmlf.m108142a(bmlg2.f129931a);
                            if (a9 == 0) {
                                a9 = 1;
                            }
                            if (a9 == 4) {
                                z = true;
                            } else {
                                z = false;
                            }
                            cardHeaderView.f110070i = z;
                            if (z && cardHeaderView.f110067f == null) {
                                cardHeaderView.f110067f = new TransitionDrawable(new Drawable[]{bkfr.m105589b(cardHeaderView.getContext(), (int) C0126R.attr.uicExpandDrawable), bkfr.m105589b(cardHeaderView.getContext(), (int) C0126R.attr.drawableWalletCollapse)});
                                cardHeaderView.f110067f.setCrossFadeEnabled(true);
                                cardHeaderView.f110066e.setImageDrawable(cardHeaderView.f110067f);
                            }
                            cardHeaderView.mo59855b(false);
                            collapsibleCardContentsView.f110081g.setFocusableInTouchMode(true);
                        }
                        collapsibleCardContentsView.mo59859a(false);
                        collapsibleCardContentsView.f110079e.setOnClickListener(collapsibleCardContentsView);
                    }
                    LinearLayout linearLayout2 = collapsibleCardContentsView.f110080f;
                    awyx a10 = awyy.mo52799a();
                    a10.mo52798a(linearLayout2);
                    awyy a11 = a10.mo52797a();
                    bxvw bxvw2 = awyy2.f95340b.f129973i;
                    size = bxvw2.size();
                    while (i3 < size) {
                        long longValue = ((Long) bxvw2.get(i3)).longValue();
                        if (longValue != j) {
                            mo52852a(a11, longValue);
                        }
                        i3++;
                    }
                    return;
                }
            }
            if (!bmlv2.f129970f.isEmpty()) {
                String str = awyy2.f95340b.f129970f;
                LayoutInflater layoutInflater = this.f123963aH;
                int a12 = this.f95376T.mo65614a();
                CardHeaderView cardHeaderView2 = (CardHeaderView) layoutInflater.inflate((int) C0126R.C0128layout.wallet_view_card_header, (ViewGroup) frameLayout, false);
                cardHeaderView2.setId(a12);
                cardHeaderView2.mo59853a(str);
                frameLayout.addView(cardHeaderView2);
                this.f95408au.add(cardHeaderView2);
                collapsibleCardContentsView.f110081g = (CardHeaderView) frameLayout.getChildAt(0);
            }
            bmlv = awyy2.f95340b;
            if (bmlv.f129966b == 16) {
            }
            LinearLayout linearLayout22 = collapsibleCardContentsView.f110080f;
            awyx a102 = awyy.mo52799a();
            a102.mo52798a(linearLayout22);
            awyy a112 = a102.mo52797a();
            bxvw bxvw22 = awyy2.f95340b.f129973i;
            size = bxvw22.size();
            while (i3 < size) {
            }
            return;
        }
        int a13 = bmlu.m108157a(awyy2.f95340b.f129968d);
        if (a13 != 0 && a13 == 3) {
            mo52831c(awyy);
            return;
        }
        int a14 = bmlu.m108157a(awyy2.f95340b.f129968d);
        if (a14 != 0 && a14 == 12) {
            bmlv bmlv4 = awyy2.f95340b;
            if (bmlv4.f129966b == 19) {
                int a15 = bmlr.m108154a(((bmls) bmlv4.f129967c).f129960a);
                if (a15 == 0 || a15 != 2) {
                    Locale locale2 = Locale.US;
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = Long.valueOf(awyy2.f95340b.f129969e);
                    bmlv bmlv5 = awyy2.f95340b;
                    if (bmlv5.f129966b == 19) {
                        bmls = (bmls) bmlv5.f129967c;
                    } else {
                        bmls = bmls.f129958b;
                    }
                    int a16 = bmlr.m108154a(bmls.f129960a);
                    if (a16 == 0) {
                        a16 = 1;
                    }
                    objArr2[1] = Integer.valueOf(a16 - 1);
                    m81655a(awyy2, String.format(locale2, "Sticky component group (%d) with position %d is not supported", objArr2));
                } else if (mo52074u() == null) {
                    m81655a(awyy2, String.format(Locale.US, "Sticky component group (%d) not supported by this widget", Long.valueOf(awyy2.f95340b.f129969e)));
                } else {
                    bxvw bxvw3 = awyy2.f95340b.f129973i;
                    int size3 = bxvw3.size();
                    int i6 = 0;
                    while (i6 < size3) {
                        long longValue2 = ((Long) bxvw3.get(i6)).longValue();
                        int intValue = ((Integer) this.f95374R.mo15534a(longValue2)).intValue();
                        if (intValue == 31 || intValue == 7) {
                            mo52845a((bmdb) mo52042a(longValue2), mo52074u(), false);
                            i6++;
                        } else {
                            throw new IllegalStateException(String.format(Locale.US, "Unsupported component (%d) in sticky component group (%d)", Long.valueOf(longValue2), Long.valueOf(awyy2.f95340b.f129969e)));
                        }
                    }
                }
            } else {
                m81655a(awyy2, String.format(Locale.US, "Sticky component group (%d) must specify sticky parameters", Long.valueOf(awyy2.f95340b.f129969e)));
            }
        } else {
            Locale locale3 = Locale.US;
            Object[] objArr3 = new Object[1];
            int a17 = bmlu.m108157a(awyy2.f95340b.f129968d);
            if (a17 != 0) {
                i2 = a17;
            }
            objArr3[0] = Integer.valueOf(i2 - 1);
            throw new IllegalStateException(String.format(locale3, "Component group UI type %s is not supported.", objArr3));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.gms.wallet.embeddedlandingpage.InstrumentDetailsView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.gms.wallet.ui.component.filter.FilterView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzk.a(bmdb, android.view.ViewGroup, boolean):bkbn
     arg types: [bmdb, android.view.ViewGroup, int]
     candidates:
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
    /* renamed from: a */
    public void mo52825a(awyy awyy, int i, long j) {
        int i2;
        String str;
        awyy awyy2 = awyy;
        int i3 = i;
        long j2 = j;
        if (i3 == 6 || i3 == 28) {
            mo52887b(awyy2, j2);
        } else if (i3 == 31 || i3 == 7 || i3 == 38) {
            mo52845a((bmdb) mo52042a(j2), awyy2.f95341c, true);
        } else {
            int i4 = 0;
            if (i3 == 16) {
                View inflate = this.f123963aH.inflate((int) C0126R.C0128layout.wallet_view_separator, awyy2.f95341c, false);
                awyy2.f95341c.addView(inflate);
                this.f95403ap.add(inflate);
                bjwl.m104784a(new bjwn(inflate), ((bmoh) mo52042a(j2)).f130233a, this.f124196aK);
                return;
            }
            String str2 = null;
            if (i3 == 17) {
                bmjf bmjf = (bmjf) mo52042a(j2);
                ViewGroup viewGroup = awyy2.f95341c;
                if (awyy.mo52801c()) {
                    i4 = this.f95377U;
                }
                bjwk bjwk = this.f124196aK;
                LayoutInflater layoutInflater = this.f123963aH;
                bjxu av = mo65982av();
                int a = this.f95376T.mo65614a();
                LegalMessageView legalMessageView = new LegalMessageView(layoutInflater.getContext());
                legalMessageView.setId(a);
                legalMessageView.mo72030a(bmjf);
                legalMessageView.mo65792a(av);
                viewGroup.addView(legalMessageView);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) legalMessageView.getLayoutParams();
                C1260oz.m19821a(marginLayoutParams, i4);
                C1260oz.m19823b(marginLayoutParams, i4);
                legalMessageView.setLayoutParams(marginLayoutParams);
                legalMessageView.mo65790a(layoutInflater.getContext().getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_page_left_column_width));
                bjwl.m104784a(legalMessageView, bmjf.f129688b, bjwk);
                this.f95385aC.add(new bkde(bmjf.f129688b, legalMessageView, null));
                this.f95404aq.add(legalMessageView);
            } else if (i3 == 0) {
                mo52857a((bmnr) mo52042a(j2), awyy2.f95341c, awyy.mo52801c());
            } else if (i3 == 11) {
                ViewGroup viewGroup2 = awyy2.f95341c;
                ImageWithCaptionView a2 = ImageWithCaptionView.m118566a((bmno) mo52042a(j2), this.f123962aG, viewGroup2, this.f95376T.mo65614a(), this.f95378V, 0, mo65980at());
                viewGroup2.addView(a2);
                this.f95407at.add(a2);
            } else {
                int i5 = 2;
                if (i3 == 25) {
                    bmep bmep = (bmep) mo52042a(j2);
                    ViewGroup viewGroup3 = awyy2.f95341c;
                    LayoutInflater layoutInflater2 = this.f123963aH;
                    bjxv bjxv = this.f95376T;
                    CardHeaderView cardHeaderView = (CardHeaderView) layoutInflater2.inflate((int) C0126R.C0128layout.wallet_view_card_header, viewGroup3, false);
                    cardHeaderView.setId(bjxv.mo65614a());
                    cardHeaderView.f110071j = bmep;
                    cardHeaderView.f110072k = this;
                    cardHeaderView.f110073l = String.format(cardHeaderView.getContext().getString(C0126R.string.wallet_card_header_collapse_icon_content_description), cardHeaderView.f110071j.f128986g);
                    String string = cardHeaderView.getContext().getString(C0126R.string.wallet_card_header_expand_icon_content_description);
                    Object[] objArr = new Object[1];
                    bmep bmep2 = cardHeaderView.f110071j;
                    if (bmep2.f128981b == 2) {
                        str = (String) bmep2.f128982c;
                    } else {
                        str = "";
                    }
                    objArr[0] = str;
                    cardHeaderView.f110074m = String.format(string, objArr);
                    if ((cardHeaderView.f110071j.f128980a & 32) != 0) {
                        cardHeaderView.f110068g.setVisibility(0);
                        ImageWithCaptionView imageWithCaptionView = cardHeaderView.f110068g;
                        bmoq bmoq = cardHeaderView.f110071j.f128988i;
                        if (bmoq == null) {
                            bmoq = bmoq.f130246g;
                        }
                        bmno bmno = bmoq.f130249b;
                        if (bmno == null) {
                            bmno = bmno.f130138m;
                        }
                        imageWithCaptionView.mo71992a(bmno, awia.m79973a(), ((Boolean) bjwd.f123461a.mo54082a()).booleanValue());
                    } else {
                        cardHeaderView.f110068g.setVisibility(8);
                    }
                    int dimensionPixelOffset = cardHeaderView.getContext().getResources().getDimensionPixelOffset(C0126R.dimen.wallet_card_header_image_start_margin);
                    bxwc bxwc = bmep.f128985f;
                    int size = bxwc.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        ImageWithCaptionView a3 = ImageWithCaptionView.m118566a((bmno) bxwc.get(i6), cardHeaderView.getContext(), cardHeaderView.f110065d, bjxv.mo65614a(), 0, 0, null);
                        ViewGroup.LayoutParams layoutParams = a3.getLayoutParams();
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            C1260oz.m19821a((ViewGroup.MarginLayoutParams) layoutParams, dimensionPixelOffset);
                            a3.setLayoutParams(layoutParams);
                        }
                        cardHeaderView.f110065d.addView(a3);
                    }
                    bxwc bxwc2 = bmep.f128989j;
                    int size2 = bxwc2.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        ImageWithCaptionView a4 = ImageWithCaptionView.m118566a((bmno) bxwc2.get(i7), cardHeaderView.getContext(), cardHeaderView.f110064c, bjxv.mo65614a(), 0, 0, null);
                        ViewGroup.LayoutParams layoutParams2 = a4.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            C1260oz.m19821a((ViewGroup.MarginLayoutParams) layoutParams2, dimensionPixelOffset);
                            a4.setLayoutParams(layoutParams2);
                        }
                        cardHeaderView.f110064c.addView(a4);
                    }
                    cardHeaderView.mo59854a(false);
                    viewGroup3.addView(cardHeaderView);
                    this.f95408au.add(cardHeaderView);
                } else if (i3 == 26) {
                    ViewGroup viewGroup4 = awyy2.f95341c;
                    LayoutInflater layoutInflater3 = this.f123963aH;
                    bjxv bjxv2 = this.f95376T;
                    CardActionBarView cardActionBarView = (CardActionBarView) layoutInflater3.inflate((int) C0126R.C0128layout.wallet_view_card_action_bar, viewGroup4, false);
                    cardActionBarView.setId(bjxv2.mo65614a());
                    bxwc bxwc3 = ((bmem) mo52042a(j2)).f128967b;
                    int size3 = bxwc3.size();
                    for (int i8 = 0; i8 < size3; i8++) {
                        bwhm bwhm = (bwhm) bxwc3.get(i8);
                        int a5 = bwhl.m121966a(bwhm.f159529f);
                        if (a5 == 0 || a5 == 1) {
                            bxvd bxvd = (bxvd) bwhm.mo74142c(5);
                            bxvd.mo73625a((GeneratedMessageLite) bwhm);
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            bwhm bwhm2 = (bwhm) bxvd.f164949b;
                            bwhm bwhm3 = bwhm.f159522h;
                            bwhm2.f159529f = 3;
                            bwhm2.f159524a |= 16;
                            bwhm = (bwhm) bxvd.mo74062i();
                        }
                        cardActionBarView.f110061a.addView(LinkView.m118644a(bwhm, cardActionBarView.getContext(), cardActionBarView.f110061a, layoutInflater3, bjxv2, this));
                    }
                    viewGroup4.addView(cardActionBarView);
                    this.f95409av.add(cardActionBarView);
                } else if (i3 == 27) {
                    bmfq bmfq = (bmfq) mo52042a(j2);
                    ViewGroup viewGroup5 = awyy2.f95341c;
                    LayoutInflater layoutInflater4 = this.f123963aH;
                    bjxv bjxv3 = this.f95376T;
                    InstrumentDetailsView instrumentDetailsView = (InstrumentDetailsView) layoutInflater4.inflate((int) C0126R.C0128layout.wallet_view_elp_instrument_details, viewGroup5, false);
                    instrumentDetailsView.setId(bjxv3.mo65614a());
                    if ((bmfq.f129143a & 2) != 0) {
                        ImageWithCaptionView imageWithCaptionView2 = instrumentDetailsView.f110151a;
                        bmno bmno2 = bmfq.f129145c;
                        if (bmno2 == null) {
                            bmno2 = bmno.f130138m;
                        }
                        imageWithCaptionView2.mo71992a(bmno2, awia.m79973a(), ((Boolean) bjwd.f123461a.mo54082a()).booleanValue());
                    } else {
                        instrumentDetailsView.f110151a.setVisibility(8);
                    }
                    TextView textView = instrumentDetailsView.f110152b;
                    if ((bmfq.f129143a & 8) != 0) {
                        str2 = bmfq.f129146d;
                    }
                    bkfr.m105573a(textView, str2);
                    int id = instrumentDetailsView.f110152b.getId();
                    if (bmfq.f129147e.size() != 0) {
                        bxwc bxwc4 = bmfq.f129147e;
                        int size4 = bxwc4.size();
                        for (int i9 = 0; i9 < size4; i9++) {
                            InfoMessageView infoMessageView = (InfoMessageView) layoutInflater4.inflate((int) C0126R.C0128layout.view_info_message_text_basic, (ViewGroup) instrumentDetailsView, false);
                            infoMessageView.mo72003a((bmnr) bxwc4.get(i9));
                            instrumentDetailsView.mo59903a(infoMessageView, id);
                            id = bjxv3.mo65614a();
                            infoMessageView.setId(id);
                            instrumentDetailsView.addView(infoMessageView);
                        }
                    }
                    if ((bmfq.f129143a & 64) != 0) {
                        bwhn bwhn = bmfq.f129150h;
                        if (bwhn == null) {
                            bwhn = bwhn.f159531f;
                        }
                        bxwc bxwc5 = bwhn.f159534b;
                        int size5 = bxwc5.size();
                        while (i4 < size5) {
                            bwhs bwhs = (bwhs) bxwc5.get(i4);
                            if ((bwhs.f159554a & 8) != 0) {
                                TextView textView2 = new TextView(instrumentDetailsView.getContext());
                                textView2.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
                                bwht bwht = bwhs.f159556c;
                                if (bwht == null) {
                                    bwht = bwht.f159561d;
                                }
                                textView2.setText(bwht.f159565c);
                                textView2.setTextColor(bkfr.m105606d(instrumentDetailsView.getContext(), (int) C0126R.attr.walletCardViewPageErrorColor));
                                instrumentDetailsView.mo59903a(textView2, id);
                                id = bjxv3.mo65614a();
                                textView2.setId(id);
                                instrumentDetailsView.addView(textView2);
                            }
                            i4++;
                        }
                    }
                    viewGroup5.addView(instrumentDetailsView);
                    this.f95412ay.add(instrumentDetailsView);
                } else if (i3 == 30) {
                    awzp awzp = new awzp((bmde) mo52042a(j2), mo52879al());
                    awzp.mo65834a(this.f124196aK);
                    this.f95413az.add(awzp);
                } else if (i3 == 33) {
                    bwhv bwhv = (bwhv) mo52042a(j2);
                    ViewGroup viewGroup6 = awyy2.f95341c;
                    LayoutInflater layoutInflater5 = this.f123963aH;
                    bkgd al = mo52879al();
                    bjwk bjwk2 = this.f124196aK;
                    FilterView filterView = (FilterView) layoutInflater5.inflate((int) C0126R.C0128layout.wallet_view_filter, viewGroup6, false);
                    filterView.f110522c = bwhv;
                    filterView.f110524e = al;
                    filterView.f110525f = this;
                    filterView.f110523d = new axaq(al);
                    LayoutInflater from = LayoutInflater.from(filterView.getContext());
                    bxwc bxwc6 = bwhv.f159581b;
                    int size6 = bxwc6.size();
                    int i10 = 0;
                    while (i10 < size6) {
                        bwhw bwhw = (bwhw) bxwc6.get(i10);
                        if (!TextUtils.isEmpty(bwhw.f159592e)) {
                            FilterCategoryChipButton filterCategoryChipButton = (FilterCategoryChipButton) from.inflate((int) C0126R.C0128layout.wallet_view_filter_category, (ViewGroup) filterView, false);
                            filterCategoryChipButton.f110518d = filterView.f110524e.f124186a;
                            axaq axaq = filterView.f110523d;
                            filterCategoryChipButton.f110517c = bwhw;
                            filterCategoryChipButton.f110519e = axaq;
                            String str3 = bwhw.f159591d;
                            if (!bwhw.f159592e.isEmpty()) {
                                String string2 = filterCategoryChipButton.getResources().getString(C0126R.string.wallet_filter_category_chip_button_text);
                                Object[] objArr2 = new Object[i5];
                                objArr2[0] = str3;
                                objArr2[1] = bwhw.f159592e;
                                str3 = String.format(string2, objArr2);
                            }
                            filterCategoryChipButton.f110515a.setText(str3);
                            if (bwhw.f159595h) {
                                filterCategoryChipButton.f110516b.setVisibility(0);
                                filterCategoryChipButton.f110516b.setContentDescription(bwhw.f159589b);
                                i2 = size6;
                                bjwl.m104784a(filterCategoryChipButton.f110516b, bwhw.f159588a, filterCategoryChipButton.f110518d);
                                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) filterCategoryChipButton.f110515a.getLayoutParams();
                                C1260oz.m19823b(layoutParams3, 0);
                                filterCategoryChipButton.f110515a.setLayoutParams(layoutParams3);
                            } else {
                                i2 = size6;
                            }
                            ColorStateList d = bkfr.m105606d(filterCategoryChipButton.getContext(), (int) C0126R.attr.uicColorMaterialAccent);
                            Drawable mutate = filterCategoryChipButton.getBackground().mutate();
                            int i11 = Build.VERSION.SDK_INT;
                            C1173lt.m19601a(mutate, d);
                            C1280ps.m19890a(filterCategoryChipButton, mutate);
                            filterView.addView(filterCategoryChipButton);
                        } else {
                            i2 = size6;
                        }
                        i10++;
                        size6 = i2;
                        i5 = 2;
                    }
                    if (!bwhv.f159582c.isEmpty()) {
                        filterView.f110521b = (ManageFiltersChipButton) from.inflate((int) C0126R.C0128layout.wallet_view_manage_filters, (ViewGroup) filterView, false);
                        filterView.f110521b.setText(bwhv.f159582c);
                        filterView.f110521b.setOnClickListener(filterView);
                        filterView.addView(filterView.f110521b);
                    }
                    filterView.f110523d.mo52951a();
                    bjwl.m104784a(filterView, bwhv.f159580a, bjwk2);
                    viewGroup6.addView(filterView);
                    this.f95383aA = filterView;
                    this.f95385aC.add(new bkde(bwhv.f159580a, this.f95383aA, null));
                } else {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unknown component type: %d", Integer.valueOf(i)));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52852a(awyy awyy, long j) {
        bmlv bmlv;
        bxwc bxwc = awyy.f95340b.f129978n;
        int size = bxwc.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bmlv = null;
                break;
            }
            bmlv = (bmlv) bxwc.get(i);
            i++;
            if (bmlv.f129969e == j) {
                break;
            }
        }
        if (bmlv != null) {
            awyx a = awyy.mo52799a();
            a.f95334a = bmlv;
            mo52829b(a.mo52797a());
            return;
        }
        mo52825a(awyy, ((Integer) this.f95374R.mo15534a(j)).intValue(), j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo52047a(bjwj bjwj) {
        bwgz bwgz = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        int a = bmna.m108191a(bjwj.f123509a.f130094d);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 6) {
            this.f95416d.add(bjwj);
        } else if (i2 == 16) {
            this.f95417e.add(bjwj);
        } else if (i2 == 19) {
            this.f95420h.add(bjwj);
        } else if (i2 == 8) {
            this.f95418f.add(bjwj);
        } else if (i2 != 9) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            int a2 = bmna.m108191a(bjwj.f123509a.f130094d);
            if (a2 != 0) {
                i = a2;
            }
            objArr[0] = Integer.valueOf(i - 1);
            throw new IllegalArgumentException(String.format(locale, "Unsupported trigger type: %s", objArr));
        } else {
            this.f95419g.add(bjwj);
        }
    }

    /* renamed from: a */
    public final void mo52853a(bmav bmav, bmaq bmaq) {
        mo52854a(bmav, bmaq, (List) null, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52854a(bmav bmav, bmaq bmaq, List list, int i) {
        int i2;
        int i3;
        int i4;
        if (bmav == null || bmav.equals(bmav.f128500h)) {
            i3 = 2;
            i2 = 0;
        } else {
            if (!bkfr.m105582a(bmav)) {
                i4 = 23;
            } else {
                i4 = 24;
            }
            i2 = i4;
            i3 = 5;
        }
        mo52848a(i3, i2, bmaq, list, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52855a(bmav bmav, String str, boolean z, boolean z2) {
        boolean z3;
        int i;
        if (this.f95427z != null) {
            getFragmentManager().beginTransaction().remove(this.f95427z).commit();
        }
        String str2 = bmav.f128503b;
        if (TextUtils.isEmpty(str2)) {
            str2 = bmav.f128506e;
        }
        int a = bmau.m107847a(bmav.f128504c);
        int i2 = 1;
        if (a == 0) {
            z3 = true;
        } else {
            z3 = a == 1;
        }
        boolean a2 = mo52827a(z3, z);
        if (!a2) {
            i = 1;
        } else {
            i = 2;
        }
        if (z3) {
            if (a2) {
                i2 = 3;
            } else {
                i2 = z2 ? 4 : 2;
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = getString(C0126R.string.wallet_uic_title_possibly_recoverable_error_dialog);
        }
        bkcz a3 = bkcz.m105338a(i, str, str2, i2);
        this.f95427z = a3;
        a3.f124032a = this;
        a3.show(getFragmentManager(), "PageFragment.ErrorDialog");
    }

    /* renamed from: a */
    public final void mo52856a(bmav bmav, boolean z, boolean z2) {
        mo52855a(bmav, (String) null, z, z2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean, java.lang.String):void
     arg types: [com.google.android.gms.wallet.ui.common.PageDetails, int, java.lang.String]
     candidates:
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
    /* JADX WARNING: Removed duplicated region for block: B:88:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0185  */
    /* renamed from: a */
    public void mo51910a(bmmv bmmv, List list) {
        bmmu bmmu;
        int i;
        bmmj bmmj;
        bmmh bmmh;
        bwgz bwgz = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        int a = bmmb.m108166a(bmmv.f130058d);
        int i2 = 1;
        if (a == 0) {
            a = 1;
        }
        int i3 = a - 1;
        if (i3 == 1) {
            long j = bmmv.f130059e;
            if (j == 4) {
                mo52381ce();
            } else if (this.f95382Z != -1) {
                throw new IllegalArgumentException("Cannot show multiple pages simultaneously");
            } else if (j != mo52060c(this.f95398ak.f110460i)) {
                List list2 = this.f95398ak.f110457f;
                if (list2 != null) {
                    int size = list2.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            if (bmmv.f130059e == mo52060c(this.f95398ak.f110457f.get(i4))) {
                                this.f95382Z = i4;
                                break;
                            }
                            i4++;
                        } else {
                            break;
                        }
                    }
                    if (this.f95382Z == -1) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Could not find page with UI reference %d", Long.valueOf(bmmv.f130059e)));
                    }
                }
            } else {
                this.f95382Z = -2;
            }
        } else if (i3 == 11) {
            long j2 = bmmv.f130059e;
            if (j2 == 4) {
                mo52380cd();
            } else if (j2 == mo52060c(this.f95397aj)) {
                this.f95381Y = true;
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "Could not hide component %d", Long.valueOf(bmmv.f130059e)));
            }
        } else if (i3 == 14) {
            bwio bwio = (bwio) this.f95387aE.mo15534a(bmmv.f130059e);
            if (bwio != null) {
                bxvd bxvd = (bxvd) bwio.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) bwio);
                if (bmmv.f130056b == 10) {
                    bmmu = (bmmu) bmmv.f130057c;
                } else {
                    bmmu = bmmu.f130049b;
                }
                bwip bwip = bmmu.f130051a;
                if (bwip == null) {
                    bwip = bwip.f159664e;
                }
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bwio bwio2 = (bwio) bxvd.f164949b;
                bwip.getClass();
                bwio2.f159663c = bwip;
                bwio2.f159661a |= 2;
                this.f95387aE.mo15540b(bmmv.f130059e, (bwio) bxvd.mo74062i());
                return;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "Invalid update variable resulting action %d", Long.valueOf(bmmv.f130059e)));
        } else if (i3 == 18) {
            List list3 = this.f95398ak.f110457f;
            if (list3 != null) {
                int size2 = list3.size();
                i = 0;
                while (true) {
                    if (i < size2) {
                        if (bmmv.f130059e == mo52060c(this.f95398ak.f110457f.get(i))) {
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
                if (i == -1) {
                    PageDetails J = mo52038J();
                    J.f110460i = mo52064d(this.f95398ak.f110457f.get(i));
                    J.f110454c = bwgz.CONTINUE_FLOW_WITH_NEW_PAGE_IN_OVERLAY;
                    PageDetails pageDetails = this.f95398ak;
                    J.f110465n = pageDetails.f110465n;
                    J.f110467p = pageDetails.f110467p;
                    mo52364a(J, false, "showPageInOverlayAction");
                    return;
                }
                throw new IllegalArgumentException(String.format(Locale.US, "Could not find page with UI reference %d", Long.valueOf(bmmv.f130059e)));
            }
            i = -1;
            if (i == -1) {
            }
        } else if (i3 == 21) {
            if (bmmv.f130056b == 12) {
                bmmj = (bmmj) bmmv.f130057c;
            } else {
                bmmj = bmmj.f130020b;
            }
            bwiu bwiu = bmmj.f130022a;
            if (bwiu == null) {
                bwiu = bwiu.f159689b;
            }
            bwiv bwiv = bwiu.f159691a;
            if (bwiv == null) {
                bwiv = bwiv.f159693e;
            }
            m81656a(bwiv);
        } else if (i3 == 25) {
            if (bmmv.f130056b == 15) {
                bmmh = (bmmh) bmmv.f130057c;
            } else {
                bmmh = bmmh.f130011c;
            }
            bwgz a2 = bwgz.m121952a(bmmh.f130013a);
            if (a2 == null) {
                a2 = bwgz.UNKNOWN_FLOW_INSTRUCTION;
            }
            int ordinal = a2.ordinal();
            if (ordinal == 5) {
                mo52873af();
            } else if (ordinal == 6) {
                mo52899i(10);
            } else if (ordinal != 15) {
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                bwgz a3 = bwgz.m121952a(bmmh.f130013a);
                if (a3 == null) {
                    a3 = bwgz.UNKNOWN_FLOW_INSTRUCTION;
                }
                objArr[0] = Integer.valueOf(a3.f159484u);
                throw new IllegalArgumentException(String.format(locale, "Unsupported FLOW_INSTRUCTION resulting action instruction: %s", objArr));
            } else {
                PageDetails pageDetails2 = this.f95398ak;
                bwgz a4 = bwgz.m121952a(bmmh.f130013a);
                if (a4 == null) {
                    a4 = bwgz.UNKNOWN_FLOW_INSTRUCTION;
                }
                pageDetails2.f110454c = a4;
                this.f95398ak.f110453b = bmmh.f130014b.getKey();
                mo52364a(this.f95398ak, false, "flowInstructionAction");
            }
        } else if (i3 != 32) {
            Locale locale2 = Locale.US;
            Object[] objArr2 = new Object[1];
            int a5 = bmmb.m108166a(bmmv.f130058d);
            if (a5 != 0) {
                i2 = a5;
            }
            objArr2[0] = Integer.valueOf(i2 - 1);
            throw new IllegalArgumentException(String.format(locale2, "PageFragment does not handle resulting action type %s", objArr2));
        } else {
            Context context = getContext();
            int a6 = bmmb.m108166a(bmmv.f130058d);
            if (a6 == 0 || a6 != 33) {
                Locale locale3 = Locale.US;
                Object[] objArr3 = new Object[1];
                int a7 = bmmb.m108166a(bmmv.f130058d);
                if (a7 != 0) {
                    i2 = a7;
                }
                objArr3[0] = Integer.valueOf(i2 - 1);
                throw new IllegalArgumentException(String.format(locale3, "showToast() called with incorrect action type: %s", objArr3));
            } else if (bmmv.f130056b == 22) {
                bmmt bmmt = (bmmt) bmmv.f130057c;
                int a8 = bmms.m108183a(bmmt.f130047b);
                if (a8 != 0 && a8 == 2) {
                    i2 = 0;
                }
                Toast.makeText(context, bmmt.f130046a, i2).show();
            } else {
                throw new IllegalArgumentException("showToast() called with null ToastAction");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52857a(bmnr bmnr, ViewGroup viewGroup, boolean z) {
        int i;
        if (z) {
            i = this.f95377U;
        } else {
            i = 0;
        }
        InfoMessageView a = awgp.m79905a(this.f124196aK, bmnr, this.f123963aH, mo65982av(), viewGroup, i, i, this.f95376T.mo65614a());
        this.f95385aC.add(new bkde(bmnr.f130156b, a, null));
        this.f95405ar.add(a);
    }

    /* renamed from: a */
    public final void mo52858a(bwhv bwhv) {
        ContextThemeWrapper contextThemeWrapper = this.f123962aG;
        Intent intent = getActivity().getIntent();
        LogContext at = mo65980at();
        BuyFlowConfig buyFlowConfig = this.f95358B;
        bmlz h = mo51924h();
        String str = this.f95359C;
        Intent a = awcc.m79593a(contextThemeWrapper, intent, at);
        a.setAction("com.google.android.gms.wallet.firstparty.ACTION_FILTER_ACTIVITY");
        a.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        bjvp.m104735a(a, "filter", bwhv);
        bjvp.m104735a(a, "dependencyGraph", h);
        a.putExtra("analyticsSessionId", str);
        startActivityForResult(a, 1006);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo52765a(bwhy bwhy, byte[] bArr) {
        throw new UnsupportedOperationException("makeSubmitRequestWithFilterValue not supported.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52859a(bwio bwio) {
        if (bwio != null) {
            this.f95387aE.mo15540b(bwio.f159662b, bwio);
        }
    }

    /* renamed from: a */
    public final void mo52860a(PageDetails pageDetails, int i) {
        mo52861a(pageDetails, i, 2);
    }

    /* renamed from: a */
    public final void mo52861a(PageDetails pageDetails, int i, int i2) {
        bjyc bjyc;
        bwgz bwgz = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        int ordinal = pageDetails.f110454c.ordinal();
        if (ordinal == 11 || ordinal == 12) {
            pageDetails.f110454c = bwgz.CONTINUE_FLOW_WITH_NEW_PAGE;
        } else if (ordinal == 14) {
            pageDetails.f110454c = bwgz.CLOSE_OVERLAY_AND_CONTINUE_FLOW_IN_MAIN_PAGE;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "Overlay launched with unexpected flow instruction: %s", Integer.valueOf(pageDetails.f110454c.f159484u)));
        }
        if (getActivity() instanceof bjyc) {
            bjyc = (bjyc) getActivity();
        } else {
            bjyc = null;
        }
        ContextThemeWrapper contextThemeWrapper = this.f123962aG;
        BuyFlowConfig buyFlowConfig = this.f95358B;
        LogContext at = mo65980at();
        String str = this.f95359C;
        Intent intent = new Intent();
        intent.setClassName(contextThemeWrapper, "com.google.android.gms.wallet.ui.common.OverlayActivity");
        intent.putExtra("pageDetails", pageDetails);
        intent.putExtra("overlayType", i);
        intent.putExtra("overlayStyle", i2 - 1);
        intent.putExtra("logContext", at);
        intent.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        intent.putExtra("sessionId", str);
        if (bjyc != null) {
            intent.putExtra("ephemeralPrivateKey", bjyc.mo51885m());
            intent.putExtra("cReqSessionKey", bjyc.mo51886n());
        }
        startActivityForResult(intent, 1001);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52862a(PageDetails pageDetails, boolean z) {
        bjtd f;
        if (z) {
            PageDetails pageDetails2 = this.f95398ak;
            pageDetails.f110460i = pageDetails2.f110460i;
            pageDetails.f110457f = pageDetails2.f110457f;
            pageDetails.f110463l = pageDetails2.f110463l;
        }
        this.f95398ak = pageDetails;
        if (!z) {
            this.f95397aj = pageDetails.f110460i;
        }
        bmaq bmaq = this.f95398ak.f110465n;
        if (bmaq != null) {
            bxvv<bmap> bxvv = new bxvv(bmaq.f128486f, bmaq.f128477g);
            List list = this.f95398ak.f110455d;
            bjtd f2 = bkfr.m105614f(getActivity());
            if (f2 != null) {
                ArrayList arrayList = f2.f123268a[0];
                arrayList.clear();
                for (bmap bmap : bxvv) {
                    arrayList.add(Integer.valueOf(bmap.f128476h));
                }
            }
            int i = 1;
            if (!(list == null || (f = bkfr.m105614f(getActivity())) == null)) {
                ArrayList arrayList2 = f.f123268a[1];
                arrayList2.clear();
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList2.add(Integer.valueOf(((Integer) list.get(i2)).intValue()));
                }
            }
            mo51917c();
            mo52393a(this.f95398ak.f110465n.f128485e.mo73780k());
            LogContext at = mo65980at();
            int a = bman.m107838a(this.f95398ak.f110465n.f128487h);
            if (a != 0) {
                i = a;
            }
            bjst.m104520a(at, i, new bxvv(this.f95398ak.f110465n.f128488i, bmaq.f128478j), this.f95398ak.f110465n.f128489k);
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
    public void mo52364a(PageDetails pageDetails, boolean z, String str) {
        bmav bmav = pageDetails.f110468q;
        if (bmav != null && !TextUtils.isEmpty(bmav.f128507f)) {
            Log.w("PageFragment", String.format(Locale.US, "%s UiError w/internalDetails=%s", str, pageDetails.f110468q.f128507f));
        }
        sdo.m34959a(pageDetails.f110454c);
        if (pageDetails.f110454c == bwgz.UNKNOWN_FLOW_INSTRUCTION) {
            Log.w("PageFragment", "No flow instruction provided.");
            pageDetails.f110454c = mo52056b(pageDetails);
        }
        this.f95365I = SystemClock.elapsedRealtime();
        if (pageDetails.f110463l != null) {
            int ordinal = pageDetails.f110454c.ordinal();
            if (ordinal == 1) {
                sdo.m34971a(z, (Object) "WebViewComponent should only be present at initialize flow.");
            } else if (!(ordinal == 10 || ordinal == 5 || ordinal == 6)) {
                throw new IllegalStateException(String.format(Locale.US, "WebViewComponent cannot support this flow instruction: %s", Integer.valueOf(pageDetails.f110454c.f159484u)));
            }
        }
        mo52830b(pageDetails, z, str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzk.a(bmav, boolean, boolean):void
     arg types: [bmav, int, int]
     candidates:
      awzk.a(com.google.android.gms.wallet.shared.BuyFlowConfig, java.lang.String, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      awzk.a(bmdb, android.view.ViewGroup, boolean):bkbn
      awzk.a(android.os.Bundle, byte[], java.util.List):java.lang.Object
      awzk.a(long, int, int):void
      awzk.a(awyy, int, long):void
      awzk.a(bmnr, android.view.ViewGroup, boolean):void
      awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, int, int):void
      awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean, java.lang.String):void
      awzk.a(java.util.List, android.view.ViewGroup, boolean):void
      bkbr.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View
      awzk.a(bmav, boolean, boolean):void */
    /* renamed from: a */
    public final void mo52863a(Exception exc) {
        if (exc instanceof UserRecoverableAuthException) {
            mo52808n(false);
            startActivityForResult(((UserRecoverableAuthException) exc).mo7366a(), 1005);
        } else if (exc instanceof gid) {
            bxvd da = bmav.f128500h.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmav bmav = (bmav) da.f164949b;
            bmav.f128504c = 2;
            bmav.f128502a |= 8;
            String string = getString(C0126R.string.wallet_uic_download_failed_error_message);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmav bmav2 = (bmav) da.f164949b;
            string.getClass();
            bmav2.f128502a |= 1;
            bmav2.f128503b = string;
            mo52856a((bmav) da.mo74062i(), false, false);
        } else {
            mo52866a(getString(C0126R.string.wallet_uic_title_possibly_recoverable_error_dialog), getString(C0126R.string.wallet_uic_download_failed_error_message));
        }
    }

    /* renamed from: a */
    public final void mo52865a(Runnable runnable) {
        if (mo52839Y().f94358b) {
            runnable.run();
        } else {
            mo52881an().post(runnable);
        }
    }

    /* renamed from: a */
    public final void mo52866a(String str, String str2) {
        if (this.f95427z != null) {
            getFragmentManager().beginTransaction().remove(this.f95427z).commit();
        }
        bkcz a = bkcz.m105338a(1, str, str2, 5);
        this.f95427z = a;
        a.f124032a = this;
        a.show(getFragmentManager(), "PageFragment.ErrorDialog");
    }

    /* renamed from: a */
    public final void mo52771a(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            mo52047a((bjwj) arrayList.get(i));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52867a(List list, ViewGroup viewGroup, boolean z) {
        int i;
        this.f95423k = viewGroup;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            mo52824a(awyy.m81591a(z, (bmlv) list.get(i3), viewGroup, this.f95363G));
        }
        if (viewGroup.getChildCount() > 0) {
            if (this.f95391ad == -1) {
                this.f95391ad = viewGroup.getPaddingTop();
            }
            if (this.f95392ae == -1) {
                this.f95392ae = viewGroup.getPaddingBottom();
            }
            int dimension = (int) getResources().getDimension(C0126R.dimen.wallet_card_view_page_margin_half);
            if (!m81657a(viewGroup.getChildAt(0))) {
                i = 0;
            } else {
                i = dimension;
            }
            if (m81657a(viewGroup.getChildAt(viewGroup.getChildCount() - 1))) {
                i2 = dimension;
            }
            C1280ps.m19885a(viewGroup, C1280ps.m19925i(viewGroup), i + this.f95391ad, C1280ps.m19927j(viewGroup), i2 + this.f95392ae);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo52393a(byte[] bArr) {
        awzi awzi = this.f95369M;
        if (awzi != null) {
            awzi.mo51869a(bArr);
        }
    }

    /* renamed from: a */
    public boolean mo52055a(bmne bmne) {
        bwgz bwgz = bwgz.UNKNOWN_FLOW_INSTRUCTION;
        int a = bmna.m108191a(bmne.f130094d);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 6) {
            return true;
        }
        if (i2 == 16 || i2 == 19 || i2 == 8 || i2 == 9) {
            return false;
        }
        int a2 = bmna.m108191a(bmne.f130094d);
        if (a2 != 0) {
            i = a2;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unsupported trigger type: ");
        sb.append(i - 1);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo51912a(PageDetails pageDetails) {
        throw new UnsupportedOperationException("displayOverlay not supported.");
    }
}
