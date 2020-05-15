package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.support.p002v7.widget.RecyclerView;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.Display;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatus;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;
import com.google.android.gms.mobiledataplan.MdpFlexTimeWindow;
import com.google.android.gms.mobiledataplan.WalletBalanceInfo;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationResponse;
import com.google.android.gms.mobiledataplan.p055ui.MobileDataPlanSettingsChimeraActivity;

/* renamed from: agtw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agtw {

    /* renamed from: I */
    private static final srn f66518I = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: w */
    public static final Object f66519w = new Object();

    /* renamed from: x */
    public static agtw f66520x;

    /* renamed from: A */
    private final Object f66521A;

    /* renamed from: B */
    private agxx f66522B;

    /* renamed from: C */
    private MdpDataPlanStatus[] f66523C;

    /* renamed from: D */
    private WalletBalanceInfo f66524D;

    /* renamed from: E */
    private Boolean f66525E;

    /* renamed from: F */
    private boolean f66526F;

    /* renamed from: G */
    private final Object f66527G;

    /* renamed from: H */
    private bxyk f66528H;

    /* renamed from: a */
    public MobileDataPlanSettingsChimeraActivity f66529a;

    /* renamed from: b */
    public ProgressBar f66530b;

    /* renamed from: c */
    public TextView f66531c;

    /* renamed from: d */
    public final Object f66532d;

    /* renamed from: e */
    public boolean f66533e;

    /* renamed from: f */
    public boolean f66534f;

    /* renamed from: g */
    public RecyclerView f66535g;

    /* renamed from: h */
    public agug f66536h;

    /* renamed from: i */
    public Display f66537i;

    /* renamed from: j */
    public FragmentManager f66538j;

    /* renamed from: k */
    public Resources f66539k;

    /* renamed from: l */
    public MdpCarrierPlanIdResponse f66540l;

    /* renamed from: m */
    public int f66541m;

    /* renamed from: n */
    public int f66542n;

    /* renamed from: o */
    public String f66543o;

    /* renamed from: p */
    public String f66544p;

    /* renamed from: q */
    public String f66545q;

    /* renamed from: r */
    public GetConsentInformationResponse f66546r;

    /* renamed from: s */
    public boolean f66547s;

    /* renamed from: t */
    public boolean f66548t;

    /* renamed from: u */
    boolean f66549u;

    /* renamed from: v */
    public boolean f66550v;

    /* renamed from: y */
    private FrameLayout f66551y;

    /* renamed from: z */
    private agph f66552z;

    @Deprecated
    public agtw() {
        this.f66532d = new Object();
        this.f66521A = new Object();
        this.f66548t = false;
        this.f66527G = new Object();
        this.f66549u = false;
        this.f66550v = false;
        if (agvh.m55172b() == null) {
            agvh.m55171a();
        }
    }

    /* renamed from: a */
    public static void m55115a() {
        synchronized (f66519w) {
            if (f66520x != null) {
                agtw agtw = f66520x;
                RecyclerView recyclerView = agtw.f66535g;
                if (recyclerView != null) {
                    recyclerView.clearOnScrollListeners();
                }
                agtw.mo36099c();
                agtw.f66529a = null;
                agtw.f66530b = null;
                agtw.f66531c = null;
                agtw.f66535g = null;
                agtw.f66536h = null;
                agtw.f66537i = null;
                agtw.f66538j = null;
                agtw.f66539k = null;
                agtw.f66551y = null;
                agtw.f66552z = null;
                agtw.f66522B = null;
                agtw.f66540l = null;
                agtw.f66523C = null;
                agtw.f66543o = null;
                agtw.f66544p = null;
                agtw.f66545q = null;
                agtw.f66525E = null;
                agtw.f66528H = null;
            }
            f66520x = null;
        }
    }

    /* renamed from: b */
    public static agtw m55116b() {
        agtw agtw;
        synchronized (f66519w) {
            agtw = f66520x;
        }
        return agtw;
    }

    /* renamed from: c */
    public final void mo36099c() {
        if (this.f66529a != null) {
            this.f66536h.mo36117c();
            RecyclerView recyclerView = this.f66535g;
            if (recyclerView != null) {
                recyclerView.setAdapter(null);
            }
        }
    }

    /* renamed from: d */
    public final void mo36100d() {
        int i;
        int i2;
        if (this.f66529a != null && (i = this.f66541m) < (i2 = this.f66542n) && i >= 0 && i2 <= this.f66536h.mo161a()) {
            this.f66536h.mo36118e(this.f66541m, this.f66542n);
            this.f66542n = this.f66541m;
        }
    }

    /* renamed from: e */
    public final void mo36101e() {
        if (this.f66529a != null && this.f66530b.getVisibility() == 8) {
            this.f66551y.setVisibility(0);
        }
    }

    /* renamed from: f */
    public final void mo36102f() {
        if (this.f66529a != null) {
            this.f66551y.setVisibility(8);
        }
    }

    /* renamed from: g */
    public final agph mo36103g() {
        return mo36093a((Context) null);
    }

    /* renamed from: h */
    public final String mo36104h() {
        String a = agvn.m55181a(this.f66540l);
        if (a.isEmpty()) {
            a = agpk.m54726a().mo35826a(agyq.m55288i(rpr.m34216b()));
        }
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        for (agzc agzc : agyq.m55295p(rpr.m34216b())) {
            if (agzc.mo36196d()) {
                return agzc.mo36200g();
            }
        }
        return null;
    }

    /* renamed from: i */
    public final ConsentAgreementText mo36105i() {
        GetConsentInformationResponse getConsentInformationResponse = this.f66546r;
        if (getConsentInformationResponse != null) {
            return getConsentInformationResponse.f80277b;
        }
        return null;
    }

    /* renamed from: j */
    public final boolean mo36106j() {
        if (this.f66525E == null) {
            boolean z = false;
            if (!cfmd.m140089i() && agze.m55336a(this.f66523C)) {
                z = true;
            }
            this.f66525E = Boolean.valueOf(z);
        }
        return this.f66525E.booleanValue();
    }

    /* renamed from: b */
    public final void mo36098b(boolean z) {
        synchronized (this.f66527G) {
            this.f66526F = z;
            if (!z && cfmq.m140245p()) {
                agrl.m54942a().mo35987a(43, "controlledEnd", (String) null, bygd.FINISH_UI_AFTER_USER_TRIGGER, System.currentTimeMillis(), agvh.m55172b());
            }
        }
    }

    /* renamed from: a */
    public final agph mo36093a(Context context) {
        agph agph;
        synchronized (this.f66521A) {
            if (this.f66552z == null) {
                if (context == null) {
                    context = rpr.m34216b();
                }
                this.f66552z = agpg.m54719a(context, agpe.m54718a());
            }
            agph = this.f66552z;
        }
        return agph;
    }

    public agtw(MobileDataPlanSettingsChimeraActivity mobileDataPlanSettingsChimeraActivity) {
        this.f66532d = new Object();
        this.f66521A = new Object();
        boolean z = false;
        this.f66548t = false;
        this.f66527G = new Object();
        this.f66549u = false;
        this.f66550v = false;
        if (agvh.m55172b() == null) {
            agvh.m55171a();
        }
        this.f66529a = mobileDataPlanSettingsChimeraActivity;
        this.f66537i = mobileDataPlanSettingsChimeraActivity.getWindowManager().getDefaultDisplay();
        this.f66530b = (ProgressBar) mobileDataPlanSettingsChimeraActivity.findViewById(C0126R.C0129id.progress_loader);
        this.f66531c = (TextView) mobileDataPlanSettingsChimeraActivity.findViewById(C0126R.C0129id.progress_loader_text);
        this.f66551y = (FrameLayout) mobileDataPlanSettingsChimeraActivity.findViewById(C0126R.C0129id.refresh_bar);
        this.f66538j = mobileDataPlanSettingsChimeraActivity.getSupportFragmentManager();
        this.f66539k = mobileDataPlanSettingsChimeraActivity.getResources();
        this.f66535g = (RecyclerView) mobileDataPlanSettingsChimeraActivity.findViewById(C0126R.C0129id.dataplan_recyclerview);
        this.f66536h = new agug();
        this.f66522B = new agxx();
        Intent intent = mobileDataPlanSettingsChimeraActivity.getIntent();
        if (intent != null && intent.getIntExtra("NOTIFICATION_LOGGING_NOTIFICATION_TYPE", 0) == 2) {
            z = true;
        }
        this.f66547s = z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agug.a(int, agya):void
     arg types: [int, agxw]
     candidates:
      agug.a(android.view.ViewGroup, int):acm
      agug.a(acm, int):void
      abh.a(android.view.ViewGroup, int):acm
      abh.a(int, java.lang.Object):void
      abh.a(acm, int):void
      agug.a(int, agya):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agug.a(int, agya):void
     arg types: [int, agym]
     candidates:
      agug.a(android.view.ViewGroup, int):acm
      agug.a(acm, int):void
      abh.a(android.view.ViewGroup, int):acm
      abh.a(int, java.lang.Object):void
      abh.a(acm, int):void
      agug.a(int, agya):void */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36094a(MdpDataPlanStatusResponse mdpDataPlanStatusResponse, boolean z) {
        bxyk bxyk;
        btar btar;
        MdpDataPlanStatusResponse mdpDataPlanStatusResponse2 = mdpDataPlanStatusResponse;
        if (this.f66529a != null) {
            if (!z) {
                if (cfmd.m140089i() || cfnm.m140637h()) {
                    agvm.m55175a();
                }
            } else if (cfmd.m140089i()) {
                agrl.m54942a().mo35987a(52, (String) null, (String) null, bygd.CACHING_CACHED_PLAN_SHOWN, System.currentTimeMillis(), agvh.m55172b());
            }
            if (mdpDataPlanStatusResponse2 == null) {
                ((bnsl) f66518I.mo68388c()).mo68405a("Tried to display a null data plan status");
                mo36095a(new NullPointerException());
                return;
            }
            if (agpk.m54727d()) {
                bxzx c = agpk.m54726a().mo35843c();
                if (!"CLIENT_MdpUx".equals(c != null ? c.f165201c : null)) {
                    MobileDataPlanSettingsChimeraActivity mobileDataPlanSettingsChimeraActivity = this.f66529a;
                    String h = mo36104h();
                    TextView textView = (TextView) mobileDataPlanSettingsChimeraActivity.findViewById(C0126R.C0129id.user_notice_links);
                    CardView cardView = (CardView) mobileDataPlanSettingsChimeraActivity.findViewById(C0126R.C0129id.user_notice_card);
                    ((TextView) mobileDataPlanSettingsChimeraActivity.findViewById(C0126R.C0129id.user_notice_body)).setText(mobileDataPlanSettingsChimeraActivity.getString(C0126R.string.user_notice_text, new Object[]{h}));
                    textView.setText(Html.fromHtml(mobileDataPlanSettingsChimeraActivity.getString(C0126R.string.user_notice_links, new Object[]{cfmj.m140159h(), cfmj.m140162k()})));
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    ((ImageView) mobileDataPlanSettingsChimeraActivity.findViewById(C0126R.C0129id.user_notice_close)).setOnClickListener(new aguj(cardView));
                    cardView.setVisibility(0);
                    agrl.m54942a().mo35987a(71, (String) null, "R.id.user_notice_card", bygd.SHOW_PRIVACY_NOTICE, System.currentTimeMillis(), agvh.m55172b());
                }
            }
            if (this.f66550v) {
                agpk.m54726a().mo35828a(bygb.OPT_IN, "CLIENT_MdpUx");
                this.f66550v = false;
            }
            if (mdpDataPlanStatusResponse.mo44037a() != null) {
                bxyk = mdpDataPlanStatusResponse.mo44037a();
            } else {
                bxyk = bxzt.m124580a(System.currentTimeMillis());
            }
            this.f66528H = bxyk;
            agrl.m54942a().mo35984a(23, cflu.m139985c() ? Integer.valueOf((int) cflu.m139988f()) : null, mdpDataPlanStatusResponse2.f80187b.length, bygd.DATA_PLAN_LOADED, System.currentTimeMillis(), agvh.m55172b());
            mo36099c();
            this.f66525E = null;
            this.f66523C = mdpDataPlanStatusResponse2.f80187b;
            this.f66524D = mdpDataPlanStatusResponse2.f80190e;
            this.f66543o = mdpDataPlanStatusResponse2.f80189d;
            agxx agxx = this.f66522B;
            agxx.f66825a = this.f66540l;
            agxx.f66827c = mo36106j();
            agxx agxx2 = this.f66522B;
            agxx2.f66826b = mdpDataPlanStatusResponse2;
            this.f66536h.mo36116a(agxx2);
            MdpDataPlanStatus[] mdpDataPlanStatusArr = this.f66523C;
            if (mdpDataPlanStatusArr != null) {
                int length = mdpDataPlanStatusArr.length;
                if (cflu.m139985c()) {
                    int length2 = this.f66523C.length;
                    cflu.m139988f();
                    if (((long) this.f66523C.length) > cflu.m139988f()) {
                        length = (int) cflu.m139988f();
                    }
                }
                for (int i = 0; i < length; i++) {
                    MdpDataPlanStatus mdpDataPlanStatus = this.f66523C[i];
                    if (mdpDataPlanStatus != null) {
                        this.f66536h.mo36116a(new agxy(mdpDataPlanStatus));
                        MdpFlexTimeWindow[] mdpFlexTimeWindowArr = mdpDataPlanStatus.f80168g;
                        if (mdpFlexTimeWindowArr != null) {
                            for (MdpFlexTimeWindow mdpFlexTimeWindow : mdpFlexTimeWindowArr) {
                                if (mdpFlexTimeWindow != null) {
                                    this.f66536h.mo36116a(new agxz(mdpFlexTimeWindow, mdpDataPlanStatus.f80164c, mdpDataPlanStatus.f80165d, !mo36106j(), agvn.m55182a(mdpDataPlanStatus, this.f66529a)));
                                }
                            }
                        }
                    }
                }
            }
            if (this.f66524D != null && agqg.m54840G().booleanValue()) {
                this.f66536h.mo36116a(new agxv(this.f66524D, this.f66540l));
            }
            MdpDataPlanStatus[] mdpDataPlanStatusArr2 = this.f66523C;
            if (((mdpDataPlanStatusArr2 != null && mdpDataPlanStatusArr2.length > 0) || (this.f66524D != null && agqg.m54840G().booleanValue())) && !cfmd.m140089i()) {
                this.f66536h.mo36116a(new agyl(mdpDataPlanStatusResponse2, this.f66540l));
            }
            this.f66535g.setAdapter(this.f66536h);
            this.f66535g.setVisibility(0);
            if (this.f66529a != null) {
                synchronized (this.f66532d) {
                    this.f66533e = true;
                    if (this.f66534f) {
                        this.f66530b.setVisibility(8);
                        this.f66531c.setVisibility(8);
                    }
                }
            }
            int a = this.f66536h.mo161a();
            this.f66542n = a;
            this.f66541m = a;
            if (cfmd.m140089i()) {
                if (!cfnm.m140633d()) {
                    agug agug = this.f66536h;
                    int i2 = this.f66542n;
                    this.f66542n = i2 + 1;
                    agug.mo36115a(i2, (agya) new agxw(this.f66539k.getString(C0126R.string.separator_line_title_buy_data)));
                }
                agug agug2 = this.f66536h;
                int i3 = this.f66542n;
                this.f66542n = i3 + 1;
                agug2.mo36115a(i3, (agya) new agym(this.f66539k.getString(C0126R.string.upsell_placeholder_text), cfnm.m140633d()));
                this.f66549u = true;
            }
            if (!cfnm.m140634e()) {
                this.f66536h.mo36116a(new agxw(this.f66539k.getString(C0126R.string.common_notifications)));
                if (cfnf.m140504e()) {
                    agvg[] values = agvg.values();
                    for (agvg agvg : values) {
                        if (agvg.mo36129a()) {
                            int i4 = Build.VERSION.SDK_INT;
                            this.f66536h.mo36116a(new agyb(this.f66539k.getString(agvg.f66646m), this.f66539k.getString(agvg.f66647n), agvg.f66645l));
                        }
                    }
                } else {
                    int i5 = Build.VERSION.SDK_INT;
                    this.f66536h.mo36116a(new agyb(this.f66539k.getString(C0126R.string.notification_link_low_balance), this.f66539k.getString(C0126R.string.notification_description_low_balance), "com.google.android.gms.mobiledataplan.NOTIFICATION.LOW_BALANCE"));
                    if (agqg.m54862q().booleanValue()) {
                        this.f66536h.mo36116a(new agyb(this.f66539k.getString(C0126R.string.notification_link_upsell_offer), this.f66539k.getString(C0126R.string.notification_description_upsell_offer), "com.google.android.gms.mobiledataplan.NOTIFICATION.UPSELL_OFFER"));
                    }
                    if (agqg.m54859n().booleanValue()) {
                        this.f66536h.mo36116a(new agyb(this.f66539k.getString(C0126R.string.notification_link_account_alert), this.f66539k.getString(C0126R.string.notification_description_account_alert), "com.google.android.gms.mobiledataplan.NOTIFICATION.ACCOUNT_ALERT"));
                    }
                }
            }
            rpr b = rpr.m34216b();
            if (cfnf.m140509j()) {
                String i6 = agyq.m55288i(b);
                agpk a2 = agpk.m54726a();
                btas d = a2.mo35844d(i6);
                if (d == null) {
                    btar = (btar) btas.f148044c.mo74144da();
                } else {
                    bxvd bxvd = (bxvd) d.mo74142c(5);
                    bxvd.mo73625a((bxvk) d);
                    btar = (btar) bxvd;
                }
                long j = ((btas) btar.f164949b).f148047b + 1;
                if (btar.f164950c) {
                    btar.mo74035c();
                    btar.f164950c = false;
                }
                ((btas) btar.f164949b).f148047b = j;
                boolean a3 = a2.mo35833a(i6, (btas) btar.mo74062i());
                if (cfmq.m140237h()) {
                    agrl a4 = agrl.m54942a();
                    bxvd da = booc.f133888c.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ((booc) da.f164949b).f133890a = boob.m111380a(5);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ((booc) da.f164949b).f133891b = a3;
                    a4.mo35992a((booc) da.mo74062i(), "MDP_UiAction", agvh.m55172b());
                }
                btas btas = (btas) btar.f164949b;
            }
            this.f66529a.invalidateOptionsMenu();
        }
    }

    /* renamed from: a */
    public final void mo36095a(Exception exc) {
        mo36098b(false);
        if (this.f66529a != null) {
            agvm.m55175a();
            mo36102f();
            agvf a = agvf.m55168a(exc);
            if (!cfmd.m140089i() || this.f66535g.getVisibility() != 0 || a.f66629j == 0) {
                this.f66535g.setVisibility(8);
                this.f66529a.mo44115a(exc);
                return;
            }
            bnsl bnsl = (bnsl) f66518I.mo68388c();
            bnsl.mo68437a(exc);
            bnsl.mo68420a("Showing error snackbar for error message %s", a);
            agvm.m55177a(this, this.f66529a.getString(a.f66629j), true);
            agrl.m54942a().mo35987a(54, (String) null, (String) null, bygd.CACHING_ERROR_SNACKBAR_SHOWN, System.currentTimeMillis(), agvh.m55172b());
            mo36100d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36096a(String str) {
        MdpDataPlanStatusResponse a;
        if (cfmd.m140089i() && this.f66529a != null) {
            RecyclerView recyclerView = this.f66535g;
            if ((recyclerView == null || recyclerView.getVisibility() != 0) && (a = agve.m55159a(str)) != null) {
                agvm.m55176a(this, a.mo44037a());
                mo36094a(a, true);
                this.f66530b.setVisibility(8);
                this.f66531c.setVisibility(8);
                mo36101e();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        if (p000.agpk.m54727d() == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        r5.f66529a.mo44117e();
        r0 = p000.agpk.m54726a().mo35843c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r0 == null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r0 = p000.bygb.m124774a(r0.f165204f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r0 != null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        r0 = p000.bygb.UNRECOGNIZED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        if (r0 == p000.bygb.OPT_OUT) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        if (r5.f66529a.mo44119h() == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        r5.f66529a.mo44118g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        if (r6 != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0049, code lost:
        if (p000.cfnm.m140637h() == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        p000.agvm.m55176a(r5, r5.f66528H);
        r6 = r5.f66522B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        if (r6 == null) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0054, code lost:
        r0 = r6.f66828d;
        r0.f66690y = r6.f66827c;
        r0.mo36148a(r6.f66826b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0060, code lost:
        r5.f66535g.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        if (r5.f66529a != null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006c, code lost:
        r6 = r5.f66532d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006e, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007a, code lost:
        if (p000.cfnm.f184575a.mo6606a().mo81681n() != false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007d, code lost:
        r0 = mo36104h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0085, code lost:
        if (android.text.TextUtils.isEmpty(r0) != false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0087, code lost:
        r5.f66531c.setText(r5.f66529a.getString(com.felicanetworks.mfc.C0126R.string.plan_loading_text_with_carrier, new java.lang.Object[]{r0}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009a, code lost:
        r5.f66531c.setText((int) com.felicanetworks.mfc.C0126R.string.plan_loading_text);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a2, code lost:
        r5.f66531c.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a7, code lost:
        r5.f66530b.setVisibility(0);
        r5.f66533e = false;
        r5.f66534f = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b0, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b1, code lost:
        mo36101e();
        mo36093a(r5.f66529a);
        p000.agve.m55160a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bc, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo36097a(boolean z) {
        synchronized (this.f66527G) {
            if (this.f66529a != null && !this.f66526F) {
                mo36098b(true);
            }
        }
    }
}
