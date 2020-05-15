package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.gms.wallet.p088ui.common.PageDetails;
import com.google.android.gms.wallet.setupwizard.PaymentsSetupWizardChimeraActivity;
import com.google.android.gms.wallet.setupwizard.PaymentsSetupWizardFragment$AndroidSetupWizardPageDetails;
import com.google.android.gms.wallet.setupwizard.SetupWizardInfoMessageView;
import com.google.android.gms.wallet.setupwizard.WalletGlifLayout;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.common.FocusedViewToTopScrollView;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import com.google.android.wallet.p097ui.common.SelectorView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: awxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awxv extends awzg implements View.OnClickListener, bkio, bkfe {

    /* renamed from: n */
    public static final /* synthetic */ int f95249n = 0;

    /* renamed from: a */
    awxr f95250a;

    /* renamed from: b */
    SetupWizardInfoMessageView f95251b;

    /* renamed from: c */
    SelectorView f95252c;

    /* renamed from: d */
    awzs f95253d;

    /* renamed from: e */
    biyp f95254e;

    /* renamed from: f */
    long f95255f;

    /* renamed from: g */
    boolean f95256g;

    /* renamed from: h */
    bwgi f95257h = null;

    /* renamed from: i */
    boolean f95258i;

    /* renamed from: j */
    awxy f95259j;

    /* renamed from: k */
    WalletGlifLayout f95260k;

    /* renamed from: l */
    final awpc f95261l = new awxt(this);

    /* renamed from: m */
    rjx f95262m;

    /* renamed from: o */
    private final bjes f95263o = new bjes(23);

    /* renamed from: p */
    private String f95264p;

    /* renamed from: q */
    private boolean f95265q = false;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awxv.a(bwgi, java.util.List):int
     arg types: [bwgi, bxwc]
     candidates:
      awxv.a(java.lang.Object, java.lang.Object):void
      awzg.a(int, int):void
      awzg.a(int, android.os.Bundle):void
      awzg.a(java.util.List, boolean):boolean
      awzg.a(boolean, boolean):boolean
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
      awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean):void
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
      bkfe.a(java.lang.Object, java.lang.Object):void
      awxv.a(bwgi, java.util.List):int */
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
     method: com.google.android.wallet.ui.common.InfoMessageView.a(bmnr, boolean):void
     arg types: [bmnr, int]
     candidates:
      com.google.android.wallet.ui.common.InfoMessageView.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.InfoMessageView.a(android.widget.TextView, android.content.res.ColorStateList):void
      com.google.android.wallet.ui.common.InfoMessageView.a(android.widget.TextView, java.lang.String):void
      com.google.android.wallet.ui.common.InfoMessageView.a(android.view.View, java.lang.String):void
      com.google.android.wallet.ui.common.InfoMessageView.a(android.widget.TextView, int):void
      com.google.android.wallet.ui.common.InfoMessageView.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.InfoMessageView.a(java.lang.CharSequence, boolean):void
      bjxu.a(android.view.View, java.lang.String):void
      bkdf.a(java.lang.CharSequence, boolean):void
      bjwm.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.InfoMessageView.a(bmnr, boolean):void */
    /* renamed from: E */
    private final void m81430E() {
        boolean z;
        int i;
        bwgj bwgj;
        bwgi bwgi;
        bwgj bwgj2;
        bwgj bwgj3;
        int size = ((bwgo) this.f95397aj).f159236g.size();
        bwgo bwgo = (bwgo) this.f95397aj;
        if (bwgo.f159231b != 12 || ((bwgj) bwgo.f159232c).f159211a.size() <= 0) {
            z = false;
        } else {
            bwgo bwgo2 = (bwgo) this.f95397aj;
            if (bwgo2.f159231b == 12) {
                bwgj3 = (bwgj) bwgo2.f159232c;
            } else {
                bwgj3 = bwgj.f159209b;
            }
            size = bwgj3.f159211a.size();
            z = true;
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (!z) {
                bwgi = (bwgi) ((bwgo) this.f95397aj).f159236g.get(i2);
            } else {
                bwgo bwgo3 = (bwgo) this.f95397aj;
                if (bwgo3.f159231b == 12) {
                    bwgj2 = (bwgj) bwgo3.f159232c;
                } else {
                    bwgj2 = bwgj.f159209b;
                }
                bwgi = (bwgi) bwgj2.f159211a.get(i2);
            }
            Context context = getContext();
            bjxv bjxv = this.f95376T;
            long b = (long) m81435b(i2);
            axac axac = new axac(context);
            axac.f95491c = bjxv;
            axac.f124136q = bwgi;
            sdo.m34971a(bwgi.f159206b.size() > 0, (Object) "There is no info message provided in creatable instrument.");
            sdo.m34971a(bwgi.f159206b.size() <= 2, (Object) "There is more than 2 info messages provided in creatable instrument.");
            axac.setTag(bwgi);
            axac.f95489a.setId(axac.f95491c.mo65614a());
            axac.f95490b.setId(axac.f95491c.mo65614a());
            axac.f124130k.setId(axac.f95491c.mo65614a());
            InfoMessageView infoMessageView = axac.f95489a;
            infoMessageView.f152081e = false;
            infoMessageView.mo72004a((bmnr) bwgi.f159206b.get(0), false);
            if (bwgi.f159206b.size() == 2) {
                InfoMessageView infoMessageView2 = axac.f95490b;
                infoMessageView2.f152081e = false;
                infoMessageView2.mo72004a((bmnr) bwgi.f159206b.get(1), false);
                axac.f95490b.setVisibility(0);
            }
            axac.mo65945a(b);
            this.f95252c.addView(axac);
        }
        if (!z) {
            i = m81432a(this.f95257h, (List) ((bwgo) this.f95397aj).f159236g);
        } else {
            bwgi bwgi2 = this.f95257h;
            bwgo bwgo4 = (bwgo) this.f95397aj;
            if (bwgo4.f159231b == 12) {
                bwgj = (bwgj) bwgo4.f159232c;
            } else {
                bwgj = bwgj.f159209b;
            }
            i = m81432a(bwgi2, (List) bwgj.f159211a);
        }
        this.f95252c.mo72096a((long) m81435b(i));
    }

    /* renamed from: F */
    private final boolean m81431F() {
        return ((bwgo) this.f95397aj).f159236g.size() > 0 && (((bwgo) this.f95397aj).f159230a & 32) == 0;
    }

    /* renamed from: a */
    private static int m81432a(bwgi bwgi, List list) {
        if (bwgi == null) {
            return -1;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (bwgi.equals(list.get(i))) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    private static int m81435b(int i) {
        return i + 1;
    }

    /* renamed from: B */
    public final boolean mo52723B() {
        return true;
    }

    /* renamed from: C */
    public final void mo52724C() {
    }

    /* renamed from: D */
    public final void mo52725D() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final PageDetails mo52038J() {
        return new PaymentsSetupWizardFragment$AndroidSetupWizardPageDetails();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final awpc mo51913b() {
        return this.f95261l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo51917c() {
        boolean z;
        boolean z2 = false;
        if (((Boolean) awja.f94520h.mo58455c()).booleanValue() || bkfr.m105580a(getActivity(), bmap.ENABLE_SCROLL_TO_TOP)) {
            z = true;
        } else {
            z = false;
        }
        if ((((Boolean) awja.f94520h.mo58455c()).booleanValue() || bkfr.m105580a(getActivity(), bmap.ENABLE_SMOOTH_SCROLLING)) && bkfr.m105612e(getActivity())) {
            z2 = true;
        }
        FocusedViewToTopScrollView focusedViewToTopScrollView = (FocusedViewToTopScrollView) mo52872ae();
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
        return (bxxk) bwgk.f159212d.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final bxxk mo51921e() {
        return (bxxk) bwgq.f159244d.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        super.mo51922f();
        boolean z = this.f124195aJ;
        ArrayList arrayList = this.f95385aC;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            Object obj = ((bkde) arrayList.get(i)).f124039e;
            if (obj instanceof bkfm) {
                ((bkfm) obj).mo52808n(z);
            } else if (obj instanceof View) {
                ((View) obj).setEnabled(z);
            }
        }
        SetupWizardInfoMessageView setupWizardInfoMessageView = this.f95251b;
        if (setupWizardInfoMessageView != null) {
            bkfr.m105608d(setupWizardInfoMessageView, z);
        }
        awxr awxr = this.f95250a;
        if (awxr != null) {
            if (z && mo52775bR()) {
                z2 = true;
            }
            awxr.setEnabled(z2);
        }
        SelectorView selectorView = this.f95252c;
        if (selectorView != null) {
            selectorView.setEnabled(z);
        }
        biyp biyp = this.f95254e;
        if (biyp != null) {
            biyp.mo64888a(z);
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
        mo52895f((Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final bxxk mo51926m() {
        return (bxxk) bwgo.f159228j.mo74142c(7);
    }

    /* renamed from: n */
    public final void mo51927n() {
        bkfr.m105559a(getActivity().getApplicationContext(), this.f95357A);
        awxr awxr = this.f95250a;
        if (awxr != null && awxr.getVisibility() == 0) {
            this.f95259j.mo52736c(this.f95250a.f95244c).requestFocus();
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
    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        if (i != 1004) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "WebViewComponent is not supported yet.");
        if (i == 1000) {
            mo52808n(true);
            if (i2 == -1) {
                if (m81431F()) {
                    this.f95254e.mo64885a(8);
                    long longExtra = intent.getLongExtra("com.google.android.gms.wallet.f1InstrumentId", 0);
                    if (longExtra != 0) {
                        mo52729b(longExtra);
                    } else {
                        mo52873af();
                    }
                } else {
                    mo52873af();
                }
            } else if (m81431F()) {
                this.f95252c.mo72096a(0L);
                this.f95257h = null;
            }
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onClick(View view) {
        char c;
        awxy awxy = this.f95259j;
        if (view != awxy.f95267a) {
            c = view == awxy.f95268b ? (char) 7 : 0;
        } else {
            c = 4;
        }
        if (c == 4) {
            if (((bwgo) this.f95397aj).f159236g.size() <= 0) {
                bwgo bwgo = (bwgo) this.f95397aj;
                if (bwgo.f159231b != 12 || ((bwgj) bwgo.f159232c).f159211a.size() <= 0) {
                    bwgo bwgo2 = (bwgo) this.f95397aj;
                    if (bwgo2.f159231b == 10) {
                        m81434a((bwiv) bwgo2.f159232c);
                        return;
                    } else if (!this.f95265q) {
                        OrchestrationViewEvent.m93825a(getActivity(), this.f95359C, new bjes(1621));
                        if (mo52804a((List) null)) {
                            mo52895f((bwgp) mo52885b(Bundle.EMPTY, (byte[]) null, (List) null));
                            return;
                        }
                        return;
                    } else {
                        mo52873af();
                        return;
                    }
                }
            }
            bwgi bwgi = this.f95257h;
            if (bwgi == null) {
                return;
            }
            if ((bwgi.f159205a & 2) != 0) {
                bwiv bwiv = bwgi.f159208d;
                if (bwiv == null) {
                    bwiv = bwiv.f159693e;
                }
                m81434a(bwiv);
                return;
            }
            mo52726a(mo51878cn(), this.f95257h.f159207c.mo73780k(), awxx.m81467a(this.f95264p));
        } else if (c == 7) {
            mo52886b(101, 5);
        } else {
            throw new IllegalArgumentException("Unexpected click event");
        }
    }

    public final void onCreate(Bundle bundle) {
        bwgo bwgo;
        bwgz bwgz;
        bmaq bmaq;
        bmav bmav;
        bwgj bwgj;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f95264p = arguments.getString("glifThemeStyle");
        this.f95256g = arguments.getBoolean("showSkipButton");
        boolean z = arguments.getBoolean("requireCachedResponse");
        this.f95258i = z;
        if (bundle != null) {
            this.f95255f = bundle.getLong("initializeRequestInstrumentId", 0);
            int i = bundle.getInt("selectedCreatableInstrumentIndex", -1);
            if (i != -1) {
                bwgo bwgo2 = (bwgo) this.f95397aj;
                if (bwgo2.f159231b != 12 || ((bwgj) bwgo2.f159232c).f159211a.size() <= 0) {
                    this.f95257h = (bwgi) ((bwgo) this.f95397aj).f159236g.get(i);
                    return;
                }
                bwgo bwgo3 = (bwgo) this.f95397aj;
                if (bwgo3.f159231b == 12) {
                    bwgj = (bwgj) bwgo3.f159232c;
                } else {
                    bwgj = bwgj.f159209b;
                }
                this.f95257h = (bwgi) bwgj.f159211a.get(i);
                return;
            }
            return;
        }
        this.f95368L = 1;
        if (z) {
            bwgn bwgn = (bwgn) bjvp.m104730a(arguments, "initializeResponse", (bxxk) bwgn.f159218h.mo74142c(7));
            PaymentsSetupWizardFragment$AndroidSetupWizardPageDetails paymentsSetupWizardFragment$AndroidSetupWizardPageDetails = new PaymentsSetupWizardFragment$AndroidSetupWizardPageDetails();
            bmar bmar = null;
            if ((bwgn.f159220a & 16) != 0) {
                bwgo = bwgn.f159225f;
                if (bwgo == null) {
                    bwgo = bwgo.f159228j;
                }
            } else {
                bwgo = null;
            }
            paymentsSetupWizardFragment$AndroidSetupWizardPageDetails.f110460i = bwgo;
            if ((bwgn.f159220a & 32) != 0) {
                bwgz = bwgz.m121952a(bwgn.f159226g);
                if (bwgz == null) {
                    bwgz = bwgz.UNKNOWN_FLOW_INSTRUCTION;
                }
            } else {
                bwgz = null;
            }
            sdo.m34959a(bwgz);
            paymentsSetupWizardFragment$AndroidSetupWizardPageDetails.f110454c = bwgz;
            if ((bwgn.f159220a & 2) != 0) {
                bmaq = bwgn.f159222c;
                if (bmaq == null) {
                    bmaq = bmaq.f128479l;
                }
            } else {
                bmaq = null;
            }
            paymentsSetupWizardFragment$AndroidSetupWizardPageDetails.f110465n = bmaq;
            if ((1 & bwgn.f159220a) != 0) {
                bmav = bwgn.f159221b;
                if (bmav == null) {
                    bmav = bmav.f128500h;
                }
            } else {
                bmav = null;
            }
            paymentsSetupWizardFragment$AndroidSetupWizardPageDetails.f110468q = bmav;
            if ((bwgn.f159220a & 4) != 0 && (bmar = bwgn.f159223d) == null) {
                bmar = bmar.f128490c;
            }
            paymentsSetupWizardFragment$AndroidSetupWizardPageDetails.f110467p = bmar;
            this.f95399al = paymentsSetupWizardFragment$AndroidSetupWizardPageDetails;
        }
        OrchestrationViewEvent.m93828c(getActivity(), this.f95359C, this.f95263o);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awxv.a(bwgi, java.util.List):int
     arg types: [bwgi, bxwc]
     candidates:
      awxv.a(java.lang.Object, java.lang.Object):void
      awzg.a(int, int):void
      awzg.a(int, android.os.Bundle):void
      awzg.a(java.util.List, boolean):boolean
      awzg.a(boolean, boolean):boolean
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
      awzk.a(com.google.android.gms.wallet.ui.common.PageDetails, boolean):void
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
      bkfe.a(java.lang.Object, java.lang.Object):void
      awxv.a(bwgi, java.util.List):int */
    public final void onSaveInstanceState(Bundle bundle) {
        int i;
        bwgj bwgj;
        super.onSaveInstanceState(bundle);
        bundle.putLong("initializeRequestInstrumentId", this.f95255f);
        bwgo bwgo = (bwgo) this.f95397aj;
        if (bwgo.f159231b != 12 || ((bwgj) bwgo.f159232c).f159211a.size() <= 0) {
            i = m81432a(this.f95257h, (List) ((bwgo) this.f95397aj).f159236g);
        } else {
            bwgi bwgi = this.f95257h;
            bwgo bwgo2 = (bwgo) this.f95397aj;
            if (bwgo2.f159231b == 12) {
                bwgj = (bwgj) bwgo2.f159232c;
            } else {
                bwgj = bwgj.f159209b;
            }
            i = m81432a(bwgi, (List) bwgj.f159211a);
        }
        bundle.putInt("selectedCreatableInstrumentIndex", i);
    }

    /* renamed from: z */
    public final void mo52731z() {
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
    public static awxv m81433a(BuyFlowConfig buyFlowConfig, String str, bwgn bwgn, String str2, boolean z, boolean z2, LogContext logContext) {
        sdo.m34969a(str, (Object) "analyticsSessionId must be valid");
        awxv awxv = new awxv();
        Bundle a = awzk.m81653a(buyFlowConfig, str, logContext);
        bjvp.m104736a(a, "initializeResponse", bwgn);
        a.putString("glifThemeStyle", str2);
        a.putBoolean("showSkipButton", z);
        a.putBoolean("requireCachedResponse", z2);
        awxv.setArguments(a);
        return awxv;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo51914b(Object obj) {
        bwgp bwgp = (bwgp) obj;
        bxvd da = bwgq.f159244d.mo74144da();
        bmaj a = awfx.m79878a(this.f95398ak.f110465n.f128483c.mo73780k());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwgq bwgq = (bwgq) da.f164949b;
        a.getClass();
        bwgq.f159247b = a;
        bwgq.f159246a |= 1;
        if (bwgp == null) {
            bwgp = bwgp.f159240c;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwgq bwgq2 = (bwgq) da.f164949b;
        bwgp.getClass();
        bwgq2.f159248c = bwgp;
        bwgq2.f159246a |= 2;
        bwgq bwgq3 = (bwgq) da.mo74062i();
        mo52839Y().f94357a.mo52409a(bwgq3, this.f95398ak.f110467p);
        return bwgq3;
    }

    /* renamed from: a */
    private final void m81434a(bwiv bwiv) {
        int a = bwix.m122006a(bwiv.f159696b);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 9) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            int a2 = bwix.m122006a(bwiv.f159696b);
            if (a2 != 0) {
                i = a2;
            }
            objArr[0] = Integer.valueOf(i - 1);
            throw new IllegalArgumentException(String.format(locale, "SetupWizard doesn't support this widget type yet: %d", objArr));
        }
        mo52726a(mo51878cn(), bwiv.f159698d.mo73780k(), awxx.m81467a(this.f95264p));
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
        this.f95357A = layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_setupwizard, viewGroup, false);
        mo52851a((awib) getActivity());
        this.f95253d = (awzs) getChildFragmentManager().findFragmentById(C0126R.C0129id.fragment_holder);
        this.f95251b = (SetupWizardInfoMessageView) this.f95357A.findViewById(C0126R.C0129id.top_info_message);
        SelectorView selectorView = (SelectorView) this.f95357A.findViewById(C0126R.C0129id.creatable_list);
        this.f95252c = selectorView;
        selectorView.f152205a.mo66034a(true);
        this.f95252c.f152212h = mo65980at();
        SelectorView selectorView2 = this.f95252c;
        selectorView2.f152209e = this;
        selectorView2.f152210f = this;
        WalletGlifLayout walletGlifLayout = (WalletGlifLayout) getActivity().findViewById(C0126R.C0129id.setup_wizard_layout);
        this.f95260k = walletGlifLayout;
        this.f95259j = (awxy) walletGlifLayout.mo71342a(biyn.class);
        biyo biyo = new biyo(this.f123962aG);
        biyo.mo64883a(C0126R.string.common_skip);
        biyo.f122327b = this;
        biyo.f122328c = 7;
        biyo.f122329d = 2132018230;
        biyp a = biyo.mo64882a();
        this.f95254e = a;
        this.f95259j.mo52735b(a);
        if (this.f95256g) {
            this.f95254e.mo64885a(0);
        } else {
            this.f95254e.mo64885a(8);
        }
        biyo biyo2 = new biyo(this.f123962aG);
        biyo2.f122328c = 4;
        biyo2.f122329d = 2132018229;
        biyp a2 = biyo2.mo64882a();
        this.f95259j.mo52733a(a2);
        awxr awxr = new awxr(this, this.f123962aG, a2, this.f95259j);
        this.f95250a = awxr;
        awxr.mo65787a(mo65980at());
        this.f95250a.setEnabled(mo52775bR());
        this.f95250a.setVisibility(8);
        awxy awxy = this.f95259j;
        biyp biyp = awxy.f122314f;
        awxr awxr2 = this.f95250a;
        biyp.f122336f = awxr2;
        awxy.f95269c = awxr2;
        if (this.f95255f != 0 || !this.f95258i) {
            mo52865a((Runnable) new awxs(this));
        } else if (this.f95368L == 1) {
            mo52888b("onInitialLoad");
        }
        return this.f95357A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo52729b(long j) {
        mo52808n(false);
        getActivity().setTitle((int) C0126R.string.wallet_spinner_visible);
        this.f95255f = j;
        bxvd da = bwgk.f159212d.mo74144da();
        bmaj a = awfx.m79878a((byte[]) null);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwgk bwgk = (bwgk) da.f164949b;
        a.getClass();
        bwgk.f159215b = a;
        bwgk.f159214a |= 1;
        if (j != 0) {
            bxvd da2 = bwgh.f159199c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bwgh bwgh = (bwgh) da2.f164949b;
            bwgh.f159201a |= 1;
            bwgh.f159202b = j;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwgk bwgk2 = (bwgk) da.f164949b;
            bwgh bwgh2 = (bwgh) da2.mo74062i();
            bwgh2.getClass();
            bwgk2.f159216c = bwgh2;
            bwgk2.f159214a |= 4;
        }
        bwgk bwgk3 = (bwgk) da.mo74062i();
        mo52864a(bwgk3, 2);
        mo52900j(2);
        mo52839Y().f94357a.mo52408a(bwgk3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo51902a(Bundle bundle, byte[] bArr, List list) {
        bxvd da = bwgp.f159240c.mo74144da();
        awzs awzs = this.f95253d;
        if (awzs != null) {
            bmed c = awzs.mo52944a(bundle);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwgp bwgp = (bwgp) da.f164949b;
            c.getClass();
            bwgp.f159243b = c;
            bwgp.f159242a |= 1;
        }
        return (bwgp) da.mo74062i();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzs.a(bmeb, int, boolean, java.lang.String, boolean, com.google.android.wallet.clientlog.LogContext, com.google.android.gms.wallet.shared.BuyFlowConfig):awzs
     arg types: [bmeb, int, int, java.lang.String, int, com.google.android.wallet.clientlog.LogContext, ?[OBJECT, ARRAY]]
     candidates:
      bkjj.a(android.view.ViewGroup, com.google.android.wallet.ui.expander.SummaryExpanderWrapper, bmdx, java.lang.String, int, int, boolean):void
      awzs.a(bmeb, int, boolean, java.lang.String, boolean, com.google.android.wallet.clientlog.LogContext, com.google.android.gms.wallet.shared.BuyFlowConfig):awzs */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    public final void mo51916b(boolean z) {
        String str;
        bmnr bmnr;
        awzs awzs;
        bwgj bwgj;
        bmeb bmeb;
        bxtx bxtx;
        if (z) {
            this.f95357A.setVisibility(4);
        }
        bwgo bwgo = (bwgo) this.f95397aj;
        int i = bwgo.f159230a;
        if ((i & 4) != 0) {
            str = bwgo.f159234e;
        } else {
            str = null;
        }
        this.f95373Q = str;
        SetupWizardInfoMessageView setupWizardInfoMessageView = this.f95251b;
        if ((i & 8) != 0) {
            bmnr = bwgo.f159235f;
            if (bmnr == null) {
                bmnr = bmnr.f130153o;
            }
        } else {
            bmnr = null;
        }
        setupWizardInfoMessageView.mo72003a(bmnr);
        this.f95251b.f152084h = mo65982av();
        if ((((bwgo) this.f95397aj).f159230a & 32) != 0) {
            this.f95250a.setVisibility(0);
            awxr awxr = this.f95250a;
            bmdb bmdb = ((bwgo) this.f95397aj).f159237h;
            if (bmdb == null) {
                bmdb = bmdb.f128767k;
            }
            awxr.mo52707a(bmdb);
        } else {
            this.f95250a.setVisibility(8);
        }
        bwgo bwgo2 = (bwgo) this.f95397aj;
        if (bwgo2.f159231b == 11 && ((bxtx) bwgo2.f159232c).mo73744a() > 0) {
            if (this.f95262m == null) {
                this.f95262m = rjx.m33696b(getActivity().getApplicationContext());
            }
            rjx rjx = this.f95262m;
            bwgo bwgo3 = (bwgo) this.f95397aj;
            if (bwgo3.f159231b == 11) {
                bxtx = (bxtx) bwgo3.f159232c;
            } else {
                bxtx = bxtx.f164797b;
            }
            byte[] k = bxtx.mo73780k();
            roz b = rpa.m34196b();
            b.f43472a = new asmu(k);
            rjx.mo24732b(b.mo24977a());
        }
        this.f95385aC.clear();
        this.f95386aD.clear();
        this.f95363G.mo66040d();
        this.f95363G.mo66037b(false);
        this.f95252c.removeAllViews();
        boolean z2 = true;
        if ((((bwgo) this.f95397aj).f159230a & 1) != 0 && (getActivity() instanceof PaymentsSetupWizardChimeraActivity)) {
            PaymentsSetupWizardChimeraActivity paymentsSetupWizardChimeraActivity = (PaymentsSetupWizardChimeraActivity) getActivity();
            bmno bmno = ((bwgo) this.f95397aj).f159233d;
            if (bmno == null) {
                bmno = bmno.f130138m;
            }
            paymentsSetupWizardChimeraActivity.mo60039a(ImageWithCaptionView.m118565a(bmno, paymentsSetupWizardChimeraActivity));
            paymentsSetupWizardChimeraActivity.mo60040b(bmno.f130149j);
        }
        bwgo bwgo4 = (bwgo) this.f95397aj;
        if ((bwgo4.f159230a & 64) != 0) {
            if (this.f95253d == null || z) {
                bmeb bmeb2 = bwgo4.f159238i;
                if (bmeb2 == null) {
                    bmeb = bmeb.f128902g;
                } else {
                    bmeb = bmeb2;
                }
                this.f95253d = awzs.m81800a(bmeb, this.f123961aF, true, this.f95359C, false, mo65980at(), (BuyFlowConfig) null);
                getChildFragmentManager().beginTransaction().replace(C0126R.C0129id.fragment_holder, this.f95253d).commit();
            }
            this.f95363G.mo66032a(this.f95253d);
            this.f95363G.mo66025a(3);
            this.f95363G.mo66029a((bkio) this);
        } else if (this.f95253d != null) {
            getChildFragmentManager().beginTransaction().remove(this.f95253d).commit();
            this.f95253d = null;
        }
        bwgo bwgo5 = (bwgo) this.f95397aj;
        if (bwgo5.f159231b != 11 || ((bxtx) bwgo5.f159232c).mo73744a() <= 0) {
            z2 = false;
        }
        this.f95265q = z2;
        if (!z2) {
            bwgo bwgo6 = (bwgo) this.f95397aj;
            if (bwgo6.f159231b == 12 && ((bwgj) bwgo6.f159232c).f159211a.size() > 0) {
                if (!m81431F() && z) {
                    bwgo bwgo7 = (bwgo) this.f95397aj;
                    if (bwgo7.f159231b == 12) {
                        bwgj = (bwgj) bwgo7.f159232c;
                    } else {
                        bwgj = bwgj.f159209b;
                    }
                    this.f95257h = (bwgi) bwgj.f159211a.get(0);
                }
                m81430E();
                awzs = this.f95253d;
                if (awzs != null) {
                    this.f95385aC.add(new bkde(awzs));
                    this.f95386aD.add(this.f95253d);
                }
                if (!this.f95265q) {
                    this.f95254e.mo64885a(8);
                    return;
                }
                return;
            }
        }
        if (!this.f95265q && ((bwgo) this.f95397aj).f159236g.size() > 0) {
            if (!m81431F() && z) {
                this.f95257h = (bwgi) ((bwgo) this.f95397aj).f159236g.get(0);
            }
            m81430E();
        }
        awzs = this.f95253d;
        if (awzs != null) {
        }
        if (!this.f95265q) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51903a() {
        throw new UnsupportedOperationException("SetupWizard doesn't support auto submit.");
    }

    /* renamed from: a */
    public final void mo51904a(int i) {
        super.mo51904a(i);
        if (i == 1) {
            this.f95357A.setVisibility(0);
        }
        WalletGlifLayout walletGlifLayout = this.f95260k;
        if (walletGlifLayout != null) {
            walletGlifLayout.mo7880a();
        }
        this.f95363G.mo66047g(true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo52726a(Account account, byte[] bArr, int[] iArr) {
        if (spn.m35876d(getActivity().getApplicationContext(), "com.google.android.gms.wallet.im.SetupWizardImRootActivity") != 1) {
            spn.m35856a(getActivity().getApplicationContext(), "com.google.android.gms.wallet.im.SetupWizardImRootActivity", true);
        }
        Intent h = spn.m35893h("com.google.android.gms.wallet.im.SetupWizardImRootActivity");
        h.putExtra("com.google.android.gms.wallet.account", account);
        h.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", bArr);
        h.putExtra("com.google.android.gms.wallet.buyFlowConfig", this.f95358B);
        h.putExtra("com.google.android.gms.themeResIds", iArr);
        bwgo bwgo = (bwgo) this.f95397aj;
        if ((bwgo.f159230a & 1) != 0) {
            bmno bmno = bwgo.f159233d;
            if (bmno == null) {
                bmno = bmno.f130138m;
            }
            bjvp.m104735a(h, "com.google.android.gms.wallet.im.SetupWizardImRootChimeraActivity.EXTRA_GLIF_ICON", bmno);
        }
        startActivityForResult(h, 1000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51908a(bmaf bmaf) {
        throw new UnsupportedOperationException("Refreshes are not supported by setupwizard");
    }

    /* renamed from: a */
    public final void mo52727a(bmaq bmaq, bwgz bwgz, bmar bmar, bwgo bwgo, bmav bmav, boolean z, String str) {
        mo52853a(bmav, bmaq);
        this.f95255f = 0;
        PaymentsSetupWizardFragment$AndroidSetupWizardPageDetails paymentsSetupWizardFragment$AndroidSetupWizardPageDetails = new PaymentsSetupWizardFragment$AndroidSetupWizardPageDetails();
        paymentsSetupWizardFragment$AndroidSetupWizardPageDetails.f110460i = bwgo;
        paymentsSetupWizardFragment$AndroidSetupWizardPageDetails.f110468q = bmav;
        sdo.m34959a(bwgz);
        paymentsSetupWizardFragment$AndroidSetupWizardPageDetails.f110454c = bwgz;
        paymentsSetupWizardFragment$AndroidSetupWizardPageDetails.f110465n = bmaq;
        paymentsSetupWizardFragment$AndroidSetupWizardPageDetails.f110467p = bmar;
        mo52364a(paymentsSetupWizardFragment$AndroidSetupWizardPageDetails, z, str);
    }

    /* renamed from: a */
    public final void mo52364a(PageDetails pageDetails, boolean z, String str) {
        bwgo bwgo = (bwgo) pageDetails.f110460i;
        if (z && bwgo != null && bwgo.f159231b != 10 && bwgo.f159236g.size() == 0 && ((bwgo.f159231b != 12 || ((bwgj) bwgo.f159232c).f159211a.size() == 0) && (bwgo.f159230a & 64) == 0)) {
            mo52886b(1, 1);
        }
        super.mo52364a(pageDetails, z, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51911a(Object obj) {
        if (obj instanceof bwgk) {
            mo52900j(2);
            mo52839Y().f94357a.mo52408a((bwgk) obj);
            mo52808n(false);
        } else if (obj instanceof bwgq) {
            mo52900j(3);
            mo52839Y().f94357a.mo52409a((bwgq) obj, this.f95398ak.f110467p);
            mo52808n(false);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo52728a(Object obj, Object obj2) {
        bwgi bwgi = (bwgi) obj;
        bwgi bwgi2 = (bwgi) obj2;
        if (this.f95257h != bwgi) {
            this.f95257h = bwgi;
            if (m81431F()) {
                mo52808n(false);
                mo52726a(mo51878cn(), this.f95257h.f159207c.mo73780k(), awxx.m81467a(this.f95264p));
            }
        }
    }
}
