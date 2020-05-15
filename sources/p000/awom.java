package p000;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.gms.wallet.firstparty.p080pm.SecurePaymentsData;
import com.google.android.gms.wallet.firstparty.p080pm.SecurePaymentsPayload;
import com.google.android.gms.wallet.p085pm.PmResult;
import com.google.android.gms.wallet.p085pm.PmRootChimeraActivity;
import com.google.android.gms.wallet.p085pm.PmRootFragment$PurchaseManagerPageDetails;
import com.google.android.gms.wallet.p088ui.common.PageDetails;
import com.google.android.gms.wallet.p088ui.common.ProgressSpinnerView;
import com.google.android.gms.wallet.p088ui.component.pagefooter.PageFooterView;
import com.google.android.gms.wallet.p088ui.component.pageheader.PageHeaderView;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.common.FocusedViewToTopScrollView;
import com.google.android.wallet.p097ui.common.FormEditText;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: awom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awom extends awzg implements View.OnClickListener, bkio, bkjl, awyo {

    /* renamed from: t */
    public static final /* synthetic */ int f94726t = 0;

    /* renamed from: a */
    FocusedViewToTopScrollView f94727a;

    /* renamed from: aL */
    private View f94728aL;

    /* renamed from: b */
    bkbn f94729b;

    /* renamed from: c */
    Button f94730c;

    /* renamed from: d */
    InfoMessageView f94731d;

    /* renamed from: e */
    PageHeaderView f94732e;

    /* renamed from: f */
    PageFooterView f94733f;

    /* renamed from: g */
    LinearLayout f94734g;

    /* renamed from: h */
    byte[] f94735h;

    /* renamed from: i */
    byte[] f94736i;

    /* renamed from: j */
    boolean f94737j;

    /* renamed from: k */
    List f94738k;

    /* renamed from: l */
    bwgw f94739l;

    /* renamed from: m */
    boolean f94740m;

    /* renamed from: n */
    bwel f94741n;

    /* renamed from: o */
    bkdx f94742o;

    /* renamed from: p */
    axcn f94743p;

    /* renamed from: q */
    bkig f94744q;

    /* renamed from: r */
    final List f94745r = new ArrayList();

    /* renamed from: s */
    final awpc f94746s = new awok(this);

    public awom() {
        new bjes(1619);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo52376B() {
        mo52379a((List) null, Bundle.EMPTY, (byte[]) null);
    }

    /* renamed from: D */
    public final void mo52032D() {
        throw new UnsupportedOperationException("Use the AuthenticationSuccess trigger with skipDefaultAction set to true");
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final PageDetails mo52038J() {
        return new PmRootFragment$PurchaseManagerPageDetails();
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
        this.f95357A = layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_purchase_manager, viewGroup, false);
        this.f94728aL = getActivity().findViewById(C0126R.C0129id.wallet_root);
        this.f94727a = (FocusedViewToTopScrollView) this.f95357A.findViewById(C0126R.C0129id.content_scroll_view);
        mo52851a((awib) ((ProgressSpinnerView) this.f95357A.findViewById(C0126R.C0129id.progress_spinner_container)));
        this.f94742o = (bkdx) getChildFragmentManager().findFragmentById(C0126R.C0129id.instrument_form_fragment_holder);
        axcn a = axcn.m82317a(this);
        this.f94743p = a;
        if (a != null) {
            a.f124427e = this;
            a.f124196aK = this.f124196aK;
        }
        this.f94744q = (bkig) getChildFragmentManager().findFragmentById(C0126R.C0129id.encryption_fragment_holder);
        ColorStateList c = bkfr.m105600c(this.f123962aG);
        Button button = (Button) this.f95357A.findViewById(C0126R.C0129id.cancel_button);
        this.f94730c = button;
        button.setOnClickListener(this);
        this.f94730c.setTextColor(c);
        this.f94734g = (LinearLayout) this.f95357A.findViewById(C0126R.C0129id.buttons_container);
        this.f95384aB = (ViewGroup) this.f95357A.findViewById(C0126R.C0129id.sticky_button_container);
        this.f94732e = (PageHeaderView) this.f95357A.findViewById(C0126R.C0129id.page_header);
        this.f94733f = (PageFooterView) this.f95357A.findViewById(C0126R.C0129id.page_footer);
        this.f95378V = getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_spacing_button_top_bottom);
        if (this.f94740m) {
            mo52865a((Runnable) new awoj(this));
        } else if (this.f95368L == 1) {
            mo52888b("onInitialLoad");
        }
        if (bundle != null && bundle.containsKey("activityVisibility")) {
            this.f94728aL.setVisibility(bundle.getInt("activityVisibility"));
        }
        return this.f95357A;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final awpc mo51913b() {
        return this.f94746s;
    }

    /* renamed from: b */
    public final void mo52057b(int i, Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo51917c() {
        boolean z;
        boolean z2 = false;
        if (((Boolean) awja.f94521i.mo58455c()).booleanValue() || bkfr.m105580a(getActivity(), bmap.ENABLE_SCROLL_TO_TOP)) {
            z = true;
        } else {
            z = false;
        }
        if ((((Boolean) awja.f94521i.mo58455c()).booleanValue() || bkfr.m105580a(getActivity(), bmap.ENABLE_SMOOTH_SCROLLING)) && bkfr.m105612e(getActivity())) {
            z2 = true;
        }
        FocusedViewToTopScrollView focusedViewToTopScrollView = this.f94727a;
        if (focusedViewToTopScrollView != null) {
            focusedViewToTopScrollView.f151970r = z;
            focusedViewToTopScrollView.mo71903a(z2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: cd */
    public final void mo52380cd() {
        View view = this.f94728aL;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ce */
    public final void mo52381ce() {
        View view = this.f94728aL;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final bxxk mo51920d() {
        return (bxxk) bwjw.f159882e.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final bxxk mo51921e() {
        return (bxxk) bwka.f159929d.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        bkdx bkdx;
        super.mo51922f();
        boolean z = this.f124195aJ;
        bkdx bkdx2 = this.f94742o;
        if (bkdx2 != null) {
            bkdx2.mo52808n(z);
        }
        InfoMessageView infoMessageView = this.f94731d;
        if (infoMessageView != null) {
            infoMessageView.setEnabled(z);
        }
        bkbn bkbn = this.f94729b;
        if (bkbn != null) {
            View b = bkbn.mo52710b();
            boolean z2 = true;
            if (!z || ((bkdx = this.f94742o) != null && !bkdx.mo52775bR())) {
                z2 = false;
            }
            b.setEnabled(z2);
        }
        Button button = this.f94730c;
        if (button != null) {
            button.setEnabled(z);
        }
        PageHeaderView pageHeaderView = this.f94732e;
        if (pageHeaderView != null) {
            pageHeaderView.setEnabled(z);
        }
        PageFooterView pageFooterView = this.f94733f;
        if (pageFooterView != null) {
            pageFooterView.setEnabled(z);
        }
        bkig bkig = this.f94744q;
        if (bkig != null) {
            bkig.mo52808n(z);
        }
        if (!z) {
            bkfr.m105576a(this);
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
        bwjy bwjy = (bwjy) obj;
        if ((bwjy.f159902a & 16) == 0) {
            return null;
        }
        bmlz bmlz = bwjy.f159906e;
        return bmlz == null ? bmlz.f129993c : bmlz;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo51925l() {
        mo52378a((bwjz) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final bxxk mo51926m() {
        return (bxxk) bwjy.f159900r.mo74142c(7);
    }

    /* renamed from: n */
    public final void mo51927n() {
        bkfr.m105559a(getActivity().getApplicationContext(), this.f95357A);
        this.f94729b.mo52710b().requestFocus();
    }

    public void onClick(View view) {
        if (view == this.f94729b) {
            OrchestrationViewEvent.m93825a(getActivity(), this.f95359C, new bjes(1621));
            bwgz bwgz = bwgz.UNKNOWN_FLOW_INSTRUCTION;
            int ordinal = this.f95398ak.f110454c.ordinal();
            if (!(ordinal == 1 || ordinal == 2)) {
                if (ordinal == 5 || ordinal == 8) {
                    if (this.f94737j) {
                        mo52376B();
                        return;
                    } else {
                        mo52873af();
                        return;
                    }
                } else if (ordinal != 10) {
                    int i = this.f95398ak.f110454c.f159484u;
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Unknown flow instruction: ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            mo52376B();
        } else if (view == this.f94730c) {
            OrchestrationViewEvent.m93825a(getActivity(), this.f95359C, new bjes(1622));
            mo52065d(6);
        }
    }

    public final void onCreate(Bundle bundle) {
        bwjy bwjy;
        bwgw bwgw;
        bwiu bwiu;
        bmar bmar;
        String str;
        bxtx bxtx;
        bmkw bmkw;
        Bundle bundle2 = bundle;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments.containsKey("encryptedParameters")) {
            this.f94735h = arguments.getByteArray("encryptedParameters");
        }
        if (arguments.containsKey("unencryptedParameters")) {
            this.f94736i = arguments.getByteArray("unencryptedParameters");
        }
        int i = 0;
        if (bundle2 != null) {
            this.f94740m = bundle2.getBoolean("shouldMakeInitializeRequest", false);
            this.f94737j = bundle2.getBoolean("returnSecurePayload", false);
            if (bundle2.containsKey("androidEnvConfig")) {
                this.f94739l = (bwgw) bjvp.m104730a(bundle2, "androidEnvConfig", (bxxk) bwgw.f159292f.mo74142c(7));
            }
            if (bundle2.containsKey("forwardSecureDataMapping")) {
                this.f94738k = bjvp.m104742b(bundle2, "forwardSecureDataMapping", (bxxk) bwhd.f159491c.mo74142c(7));
                return;
            }
            return;
        }
        int i2 = 1;
        if (arguments.containsKey("securePaymentsPayload")) {
            this.f95368L = 1;
            SecurePaymentsPayload securePaymentsPayload = (SecurePaymentsPayload) arguments.getParcelable("securePaymentsPayload");
            bwkc bwkc = (bwkc) bjvp.m104733a(securePaymentsPayload.f110176a, (bxxk) bwkc.f159947g.mo74142c(7));
            this.f94738k = bwkc.f159954f;
            bwjx bwjx = bwkc.f159951c;
            if (bwjx == null) {
                bwjx = bwjx.f159888j;
            }
            bmav bmav = null;
            if ((bwjx.f159890a & 16) != 0) {
                bwjx bwjx2 = bwkc.f159951c;
                if (bwjx2 == null) {
                    bwjx2 = bwjx.f159888j;
                }
                bwjy = bwjx2.f159895f;
                if (bwjy == null) {
                    bwjy = bwjy.f159900r;
                }
            } else {
                bwjy = null;
            }
            this.f94737j = bwkc.f159953e;
            if (bwkc.f159949a == 3) {
                bwgw = (bwgw) bwkc.f159950b;
            } else {
                bwgw = bwgw.f159292f;
            }
            this.f94739l = bwgw;
            PmRootFragment$PurchaseManagerPageDetails pmRootFragment$PurchaseManagerPageDetails = new PmRootFragment$PurchaseManagerPageDetails();
            bwjx bwjx3 = bwkc.f159951c;
            if (bwjx3 == null) {
                bwjx3 = bwjx.f159888j;
            }
            if ((bwjx3.f159890a & 32) != 0) {
                bwjx bwjx4 = bwkc.f159951c;
                if (bwjx4 == null) {
                    bwjx4 = bwjx.f159888j;
                }
                bwiu = bwjx4.f159896g;
                if (bwiu == null) {
                    bwiu = bwiu.f159689b;
                }
            } else {
                bwiu = null;
            }
            pmRootFragment$PurchaseManagerPageDetails.f110458g = bwiu;
            if (bwjy != null) {
                pmRootFragment$PurchaseManagerPageDetails.f110452a = bwjy.f159908g;
                if ((bwjy.f159902a & 2048) != 0) {
                    bmkw = bwjy.f159914m;
                    if (bmkw == null) {
                        bmkw = bmkw.f129898c;
                    }
                } else {
                    bmkw = null;
                }
                pmRootFragment$PurchaseManagerPageDetails.f110463l = bmkw;
            }
            bwjx bwjx5 = bwkc.f159951c;
            if (bwjx5 == null) {
                bwjx5 = bwjx.f159888j;
            }
            bmaq bmaq = bwjx5.f159892c;
            if (bmaq == null) {
                bmaq = bmaq.f128479l;
            }
            pmRootFragment$PurchaseManagerPageDetails.f110465n = bmaq;
            bwjx bwjx6 = bwkc.f159951c;
            if (bwjx6 == null) {
                bwjx6 = bwjx.f159888j;
            }
            bwgz a = bwgz.m121952a(bwjx6.f159894e);
            if (a == null) {
                a = bwgz.UNKNOWN_FLOW_INSTRUCTION;
            }
            pmRootFragment$PurchaseManagerPageDetails.f110454c = a;
            bwjx bwjx7 = bwkc.f159951c;
            if (bwjx7 == null) {
                bwjx7 = bwjx.f159888j;
            }
            if ((bwjx7.f159890a & 4) != 0) {
                bwjx bwjx8 = bwkc.f159951c;
                if (bwjx8 == null) {
                    bwjx8 = bwjx.f159888j;
                }
                bmar = bwjx8.f159893d;
                if (bmar == null) {
                    bmar = bmar.f128490c;
                }
            } else {
                bmar = null;
            }
            pmRootFragment$PurchaseManagerPageDetails.f110467p = bmar;
            awoi a2 = PmResult.m94081a();
            bwjx bwjx9 = bwkc.f159951c;
            if (bwjx9 == null) {
                bwjx9 = bwjx.f159888j;
            }
            if ((bwjx9.f159890a & 64) != 0) {
                bwjx bwjx10 = bwkc.f159951c;
                if (bwjx10 == null) {
                    bwjx10 = bwjx.f159888j;
                }
                str = bwjx10.f159897h;
            } else {
                str = null;
            }
            a2.mo52369a(str);
            bwjx bwjx11 = bwkc.f159951c;
            if (bwjx11 == null) {
                bwjx11 = bwjx.f159888j;
            }
            if ((bwjx11.f159890a & 128) != 0) {
                bwjx bwjx12 = bwkc.f159951c;
                if (bwjx12 == null) {
                    bwjx12 = bwjx.f159888j;
                }
                bmag bmag = bwjx12.f159898i;
                if (bmag == null) {
                    bmag = bmag.f128442c;
                }
                if (bmag.f128444a == 2) {
                    bxtx = (bxtx) bmag.f128445b;
                } else {
                    bxtx = bxtx.f164797b;
                }
                a2.mo52370a(bxtx.mo73780k());
            }
            pmRootFragment$PurchaseManagerPageDetails.f110466o = a2.f94723a;
            bwjx bwjx13 = bwkc.f159951c;
            if (bwjx13 == null) {
                bwjx13 = bwjx.f159888j;
            }
            bwgz a3 = bwgz.m121952a(bwjx13.f159894e);
            if (a3 == null) {
                a3 = bwgz.UNKNOWN_FLOW_INSTRUCTION;
            }
            if (a3 == bwgz.HANDLE_UI_ERROR) {
                bwjy = bwjy.f159900r;
                bwjx bwjx14 = bwkc.f159951c;
                if (bwjx14 == null) {
                    bwjx14 = bwjx.f159888j;
                }
                if ((bwjx14.f159890a & 1) != 0) {
                    bwjx bwjx15 = bwkc.f159951c;
                    if (bwjx15 == null) {
                        bwjx15 = bwjx.f159888j;
                    }
                    bmav = bwjx15.f159891b;
                    if (bmav == null) {
                        bmav = bmav.f128500h;
                    }
                }
                int a4 = bmau.m107847a(bmav.f128504c);
                if (a4 != 0 && a4 == 2) {
                    pmRootFragment$PurchaseManagerPageDetails.f110468q = bmav;
                } else {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[1];
                    int a5 = bmau.m107847a(bmav.f128504c);
                    if (a5 != 0) {
                        i2 = a5;
                    }
                    objArr[0] = Integer.valueOf(i2);
                    throw new IllegalArgumentException(String.format(locale, "Invalid initialize error action: %s", objArr));
                }
            }
            if (!(bwjy == null || (bwjy.f159902a & 512) == 0)) {
                bxvd bxvd = (bxvd) bwjy.mo74142c(5);
                bxvd.mo73625a((bxvk) bwjy);
                bmfu bmfu = bwjy.f159911j;
                if (bmfu == null) {
                    bmfu = bmfu.f129167j;
                }
                bxvd bxvd2 = (bxvd) bmfu.mo74142c(5);
                bxvd2.mo73625a((bxvk) bmfu);
                SecurePaymentsData[] securePaymentsDataArr = securePaymentsPayload.f110177b;
                bxwc bxwc = bwkc.f159952d;
                int length = securePaymentsDataArr.length;
                if (length == bxwc.size()) {
                    ArrayList arrayList = new ArrayList(length);
                    int i3 = 0;
                    while (i3 < length) {
                        SecurePaymentsData securePaymentsData = securePaymentsDataArr[i3];
                        int size = bxwc.size();
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            bwhd bwhd = (bwhd) bxwc.get(i);
                            i++;
                            if (securePaymentsData.f110174a == bwhd.f159493a) {
                                bmaf bmaf = bwhd.f159494b;
                                if (bmaf == null) {
                                    bmaf = bmaf.f128436d;
                                }
                                arrayList.add(new awhy(bmaf, securePaymentsData.f110175b));
                            }
                        }
                        i3++;
                        i = 0;
                    }
                    if (arrayList.size() == securePaymentsDataArr.length) {
                        int size2 = arrayList.size();
                        int i4 = 0;
                        while (i4 < size2) {
                            awhy awhy = (awhy) arrayList.get(i4);
                            bmfu bmfu2 = (bmfu) bxvd2.f164949b;
                            if ((bmfu2.f129169a & 64) != 0) {
                                String str2 = awhy.f94377a.f128438a;
                                bmki bmki = bmfu2.f129176h;
                                if (bmki == null) {
                                    bmki = bmki.f129802w;
                                }
                                bmdn bmdn = bmki.f129805b;
                                if (bmdn == null) {
                                    bmdn = bmdn.f128831k;
                                }
                                if (str2.equals(bmdn.f128834b)) {
                                    int i5 = awhy.f94377a.f128439b;
                                    if (i5 == 1) {
                                        bmki bmki2 = ((bmfu) bxvd2.f164949b).f129176h;
                                        if (bmki2 == null) {
                                            bmki2 = bmki.f129802w;
                                        }
                                        bxvd bxvd3 = (bxvd) bmki2.mo74142c(5);
                                        bxvd3.mo73625a((bxvk) bmki2);
                                        String str3 = awhy.f94378b;
                                        if (bxvd3.f164950c) {
                                            bxvd3.mo74035c();
                                            bxvd3.f164950c = false;
                                        }
                                        bmki bmki3 = (bmki) bxvd3.f164949b;
                                        str3.getClass();
                                        bmki3.f129804a |= 2;
                                        bmki3.f129806c = str3;
                                        if (bxvd2.f164950c) {
                                            bxvd2.mo74035c();
                                            bxvd2.f164950c = false;
                                        }
                                        bmfu bmfu3 = (bmfu) bxvd2.f164949b;
                                        bmki bmki4 = (bmki) bxvd3.mo74062i();
                                        bmki4.getClass();
                                        bmfu3.f129176h = bmki4;
                                        bmfu3.f129169a |= 64;
                                    } else if (i5 == 2) {
                                        bmki bmki5 = ((bmfu) bxvd2.f164949b).f129176h;
                                        if (bmki5 == null) {
                                            bmki5 = bmki.f129802w;
                                        }
                                        bxvd bxvd4 = (bxvd) bmki5.mo74142c(5);
                                        bxvd4.mo73625a((bxvk) bmki5);
                                        String str4 = awhy.f94378b;
                                        if (bxvd4.f164950c) {
                                            bxvd4.mo74035c();
                                            bxvd4.f164950c = false;
                                        }
                                        bmki bmki6 = (bmki) bxvd4.f164949b;
                                        str4.getClass();
                                        bmki6.f129804a |= 4;
                                        bmki6.f129807d = str4;
                                        if (bxvd2.f164950c) {
                                            bxvd2.mo74035c();
                                            bxvd2.f164950c = false;
                                        }
                                        bmfu bmfu4 = (bmfu) bxvd2.f164949b;
                                        bmki bmki7 = (bmki) bxvd4.mo74062i();
                                        bmki7.getClass();
                                        bmfu4.f129176h = bmki7;
                                        bmfu4.f129169a |= 64;
                                    } else {
                                        throw new IllegalArgumentException(String.format(Locale.US, "Unsupported SecureData fieldId=%d", Integer.valueOf(awhy.f94377a.f128439b)));
                                    }
                                    i4++;
                                }
                            }
                            Locale locale2 = Locale.US;
                            bmaf bmaf2 = awhy.f94377a;
                            throw new IllegalArgumentException(String.format(locale2, "Unsupported SecureData FormFieldReference formId=%s fieldId=%d", bmaf2.f128438a, Integer.valueOf(bmaf2.f128439b)));
                        }
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bwjy bwjy2 = (bwjy) bxvd.f164949b;
                        bmfu bmfu5 = (bmfu) bxvd2.mo74062i();
                        bwjy bwjy3 = bwjy.f159900r;
                        bmfu5.getClass();
                        bwjy2.f159911j = bmfu5;
                        bwjy2.f159902a |= 512;
                        bwjy = (bwjy) bxvd.mo74062i();
                    } else {
                        throw new IllegalArgumentException("SecurePaymentsData and SecureDataMapping are mismatched.");
                    }
                } else {
                    throw new IllegalArgumentException(String.format(Locale.US, "Lengths of SecurePaymentsData (%d) and SecureDataMapping (%d) do not match", Integer.valueOf(length), Integer.valueOf(bxwc.size())));
                }
            }
            pmRootFragment$PurchaseManagerPageDetails.f110460i = bwjy;
            bwjx bwjx16 = bwkc.f159951c;
            if (bwjx16 == null) {
                bwjx16 = bwjx.f159888j;
            }
            if ((bwjx16.f159890a & 2) == 0) {
                Log.e("PmRootFragment", "Bad action token, no ResponseContext. Exiting.");
                mo52897g(-1);
            }
            this.f95399al = pmRootFragment$PurchaseManagerPageDetails;
            return;
        }
        this.f94740m = true;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        int i;
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("shouldMakeInitializeRequest", this.f94740m);
        bundle.putBoolean("returnSecurePayload", this.f94737j);
        View view = this.f94728aL;
        if (view != null) {
            i = view.getVisibility();
        } else {
            i = 0;
        }
        bundle.putInt("activityVisibility", i);
        bwgw bwgw = this.f94739l;
        if (bwgw != null) {
            bjvp.m104736a(bundle, "androidEnvConfig", bwgw);
        }
        List list = this.f94738k;
        if (list != null) {
            bjvp.m104737a(bundle, "forwardSecureDataMapping", list);
        }
    }

    /* renamed from: z */
    public final void mo52079z() {
        mo52376B();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzk.a(bmdb, android.view.ViewGroup, boolean):bkbn
     arg types: [bmdb, android.widget.LinearLayout, int]
     candidates:
      awom.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View
      awom.a(android.os.Bundle, byte[], java.util.List):java.lang.Object
      awom.a(java.util.List, android.os.Bundle, byte[]):void
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
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e5, code lost:
        if ((r1.f129169a & 64) != 0) goto L_0x0101;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02ff A[LOOP:2: B:122:0x02fd->B:123:0x02ff, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0244  */
    /* renamed from: b */
    public final void mo51916b(boolean z) {
        PageFooterView pageFooterView;
        bwjy bwjy;
        bkdx bkdx;
        bwjy bwjy2;
        bwjy bwjy3;
        ViewGroup viewGroup;
        bjwk bjwk;
        int size;
        int i;
        bmfu bmfu;
        bmjl bmjl;
        if (z) {
            this.f95357A.setVisibility(4);
        }
        bwjy bwjy4 = (bwjy) this.f95397aj;
        this.f95373Q = bwjy4.f159903b;
        this.f95372P = bwjy4.f159910i;
        mo52891c(bwjy4.f159909h);
        InfoMessageView infoMessageView = (InfoMessageView) this.f95357A.findViewById(C0126R.C0129id.top_info_message);
        this.f94731d = infoMessageView;
        bmnr bmnr = ((bwjy) this.f95397aj).f159905d;
        if (bmnr == null) {
            bmnr = bmnr.f130153o;
        }
        infoMessageView.mo72006b(bmnr);
        bwjy bwjy5 = (bwjy) this.f95397aj;
        if ((bwjy5.f159902a & 2) != 0) {
            PageHeaderView pageHeaderView = this.f94732e;
            pageHeaderView.f110581a = this;
            bmjt bmjt = bwjy5.f159904c;
            if (bmjt == null) {
                bmjt = bmjt.f129732k;
            }
            pageHeaderView.mo60127a(bmjt);
            this.f94732e.setVisibility(0);
        } else {
            this.f94732e.setVisibility(8);
        }
        boolean z2 = true;
        if (getActivity() instanceof PmRootChimeraActivity) {
            if (!((bwjy) this.f95397aj).f159903b.isEmpty() || (4 & ((bwjy) this.f95397aj).f159902a) != 0) {
                ((PmRootChimeraActivity) getActivity()).mo51888o(true);
            } else {
                ((PmRootChimeraActivity) getActivity()).mo51888o(false);
            }
        }
        bwjy bwjy6 = (bwjy) this.f95397aj;
        if ((bwjy6.f159902a & 32) != 0) {
            bmdb bmdb = bwjy6.f159907f;
            if (bmdb == null) {
                bmdb = bmdb.f128767k;
            }
            bkbn a = mo52845a(bmdb, (ViewGroup) this.f94734g, true);
            this.f94729b = a;
            View b = a.mo52710b();
            bkdx bkdx2 = this.f94742o;
            if (bkdx2 != null && !bkdx2.mo52775bR()) {
                z2 = false;
            }
            b.setEnabled(z2);
            this.f94729b.mo52710b().setOnClickListener(this);
        } else {
            bkbn bkbn = this.f94729b;
            if (bkbn != null) {
                bkbn.mo52710b().setVisibility(8);
            }
        }
        bwjy bwjy7 = (bwjy) this.f95397aj;
        if ((bwjy7.f159902a & 512) != 0) {
            bmfu bmfu2 = bwjy7.f159911j;
            if (bmfu2 == null) {
                bmfu2 = bmfu.f129167j;
            }
        }
        bwjy bwjy8 = (bwjy) this.f95397aj;
        int i2 = bwjy8.f159902a;
        if (((i2 & 4096) == 0 || (i2 & 32) != 0) && !bwjy8.f159917p) {
            this.f94730c.setVisibility(0);
            pageFooterView = this.f94733f;
            if (pageFooterView != null) {
                bwjy bwjy9 = (bwjy) this.f95397aj;
                if ((bwjy9.f159902a & 4096) != 0) {
                    bmjl = bwjy9.f159916o;
                    if (bmjl == null) {
                        bmjl = bmjl.f129720b;
                    }
                } else {
                    bmjl = null;
                }
                bjwk bjwk2 = this.f124196aK;
                FragmentManager childFragmentManager = getChildFragmentManager();
                LogContext at = mo65980at();
                String str = this.f95359C;
                int i3 = this.f123961aF;
                if (bmjl == null) {
                    pageFooterView.setVisibility(8);
                } else {
                    pageFooterView.setVisibility(0);
                    ArrayList arrayList = pageFooterView.f110580a;
                    int size2 = arrayList.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        childFragmentManager.beginTransaction().remove((awzs) arrayList.get(i4)).commit();
                    }
                    pageFooterView.f110580a.clear();
                    bxwc bxwc = bmjl.f129722a;
                    int size3 = bxwc.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        bmeb bmeb = (bmeb) bxwc.get(i5);
                        bmdn bmdn = bmeb.f128905b;
                        if (bmdn == null) {
                            bmdn = bmdn.f128831k;
                        }
                        awzs awzs = (awzs) childFragmentManager.findFragmentByTag(bmdn.f128834b);
                        if (awzs == null) {
                            awzs = awzs.m81798a(bmeb, i3, str, at);
                            FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
                            int id = pageFooterView.getId();
                            bmdn bmdn2 = bmeb.f128905b;
                            if (bmdn2 == null) {
                                bmdn2 = bmdn.f128831k;
                            }
                            beginTransaction.add(id, awzs, bmdn2.f128834b).commit();
                        }
                        awzs.f124196aK = bjwk2;
                        pageFooterView.f110580a.add(awzs);
                    }
                }
            }
            this.f95385aC.clear();
            this.f95386aD.clear();
            this.f95363G.mo66040d();
            this.f95363G.mo66037b(false);
            bwjy = (bwjy) this.f95397aj;
            if ((bwjy.f159902a & 512) == 0) {
                if (this.f94742o == null || z) {
                    bmfu bmfu3 = bwjy.f159911j;
                    if (bmfu3 == null) {
                        bmfu = bmfu.f129167j;
                    } else {
                        bmfu = bmfu3;
                    }
                    this.f94742o = awia.m79969a(bmfu, C0126R.style.WalletEmptyStyle, ((bwjy) this.f95397aj).f159903b, this.f95359C, bpis.FLOW_TYPE_PURCHASE_MANAGER, mo65980at(), this.f95358B);
                    getChildFragmentManager().beginTransaction().replace(C0126R.C0129id.instrument_form_fragment_holder, this.f94742o).commit();
                }
                this.f95363G.mo66032a(this.f94742o);
                this.f95363G.mo66025a(3);
                this.f95363G.mo66029a((bkio) this);
            } else if (this.f94742o != null) {
                getChildFragmentManager().beginTransaction().remove(this.f94742o).commit();
                this.f94742o = null;
            }
            bkdx = this.f94742o;
            if (bkdx != null) {
                this.f95385aC.add(new bkde(bkdx));
                this.f95386aD.add(this.f94742o);
            }
            bwjy2 = (bwjy) this.f95397aj;
            if ((bwjy2.f159902a & 1024) == 0) {
                if (this.f94743p == null || z) {
                    bmkl bmkl = bwjy2.f159912k;
                    if (bmkl == null) {
                        bmkl = bmkl.f129847j;
                    }
                    axcn a2 = axcn.m82318a(this, bmkl, mo65980at(), this.f95358B);
                    this.f94743p = a2;
                    a2.f124427e = this;
                    a2.f124196aK = this.f124196aK;
                }
            } else if (this.f94743p != null) {
                axcn.m82319b(this);
                this.f94743p = null;
            }
            this.f94744q = (bkig) getChildFragmentManager().findFragmentById(C0126R.C0129id.encryption_fragment_holder);
            bwjy3 = (bwjy) this.f95397aj;
            if ((bwjy3.f159902a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) == 0) {
                if (this.f94744q == null || z) {
                    bmdj bmdj = bwjy3.f159918q;
                    if (bmdj == null) {
                        bmdj = bmdj.f128803l;
                    }
                    this.f94744q = axcp.m82327a(bmdj, C0126R.style.WalletEmptyStyle, this.f95359C, mo65980at());
                    getChildFragmentManager().beginTransaction().replace(C0126R.C0129id.encryption_fragment_holder, this.f94744q).commit();
                }
                this.f95385aC.add(new bkde(this.f94744q));
            } else if (this.f94744q != null) {
                getChildFragmentManager().beginTransaction().remove(this.f94744q).commit();
                this.f94744q = null;
            }
            viewGroup = (ViewGroup) this.f95357A.findViewById(C0126R.C0129id.simple_form_fragments_holder);
            if (((bwjy) this.f95397aj).f159915n.size() == 0 || z) {
                viewGroup.removeAllViews();
                List list = this.f94745r;
                size = list.size();
                for (i = 0; i < size; i++) {
                    getChildFragmentManager().beginTransaction().remove((awzs) list.get(i)).commit();
                }
            }
            this.f94745r.clear();
            if (((bwjy) this.f95397aj).f159915n.size() != 0) {
                bxwc bxwc2 = ((bwjy) this.f95397aj).f159915n;
                int size4 = bxwc2.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    bmeb bmeb2 = (bmeb) bxwc2.get(i6);
                    FragmentManager childFragmentManager2 = getChildFragmentManager();
                    bmdn bmdn3 = bmeb2.f128905b;
                    if (bmdn3 == null) {
                        bmdn3 = bmdn.f128831k;
                    }
                    awzs awzs2 = (awzs) childFragmentManager2.findFragmentByTag(bmdn3.f128834b);
                    if (awzs2 == null || z) {
                        awzs2 = awzs.m81798a(bmeb2, this.f123961aF, this.f95359C, mo65980at());
                        awzs2.f124196aK = this.f124196aK;
                        awzs2.f95441a = this;
                        FragmentTransaction beginTransaction2 = getChildFragmentManager().beginTransaction();
                        int id2 = viewGroup.getId();
                        bmdn bmdn4 = bmeb2.f128905b;
                        if (bmdn4 == null) {
                            bmdn4 = bmdn.f128831k;
                        }
                        beginTransaction2.add(id2, awzs2, bmdn4.f128834b).commit();
                    }
                    this.f94745r.add(awzs2);
                    this.f95385aC.add(new bkde(awzs2));
                }
            }
            bjwk = this.f124196aK;
            if (bjwk == null) {
                bkdx bkdx3 = this.f94742o;
                if (bkdx3 != null) {
                    bkdx3.f124196aK = bjwk;
                }
                bkig bkig = this.f94744q;
                if (bkig != null) {
                    bkig.f124196aK = this.f124196aK;
                }
                bjwl.m104784a(this, 4, this.f124196aK);
                bjwl.m104784a(this, 1, this.f124196aK);
                bjwl.m104784a(this, 2, this.f124196aK);
                return;
            }
            return;
        }
        this.f94730c.setVisibility(8);
        pageFooterView = this.f94733f;
        if (pageFooterView != null) {
        }
        this.f95385aC.clear();
        this.f95386aD.clear();
        this.f95363G.mo66040d();
        this.f95363G.mo66037b(false);
        bwjy = (bwjy) this.f95397aj;
        if ((bwjy.f159902a & 512) == 0) {
        }
        bkdx = this.f94742o;
        if (bkdx != null) {
        }
        bwjy2 = (bwjy) this.f95397aj;
        if ((bwjy2.f159902a & 1024) == 0) {
        }
        this.f94744q = (bkig) getChildFragmentManager().findFragmentById(C0126R.C0129id.encryption_fragment_holder);
        bwjy3 = (bwjy) this.f95397aj;
        if ((bwjy3.f159902a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) == 0) {
        }
        viewGroup = (ViewGroup) this.f95357A.findViewById(C0126R.C0129id.simple_form_fragments_holder);
        viewGroup.removeAllViews();
        List list2 = this.f94745r;
        size = list2.size();
        while (i < size) {
        }
        this.f94745r.clear();
        if (((bwjy) this.f95397aj).f159915n.size() != 0) {
        }
        bjwk = this.f124196aK;
        if (bjwk == null) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final PageDetails mo52043a(Intent intent) {
        byte[] byteArray = intent.getBundleExtra("webViewComponentCallbackData").getByteArray("EventListener.EXTRA_WEBVIEW_COMPONENT_COMPLETE_WITH_CALLBACK_DATA");
        PmRootFragment$PurchaseManagerPageDetails pmRootFragment$PurchaseManagerPageDetails = new PmRootFragment$PurchaseManagerPageDetails();
        pmRootFragment$PurchaseManagerPageDetails.f110454c = bwgz.COMPLETE_FLOW_IMMEDIATELY;
        awoi a = PmResult.m94081a();
        a.mo52370a(byteArray);
        pmRootFragment$PurchaseManagerPageDetails.f110466o = a.f94723a;
        return pmRootFragment$PurchaseManagerPageDetails;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo51902a(Bundle bundle, byte[] bArr, List list) {
        bxvd da = bwjz.f159921g.mo74144da();
        bkdx bkdx = this.f94742o;
        if (bkdx != null) {
            bmfv a = awia.m79972a(bkdx, bundle);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwjz bwjz = (bwjz) da.f164949b;
            a.getClass();
            bwjz.f159924b = a;
            bwjz.f159923a |= 1;
        }
        axcn axcn = this.f94743p;
        if (!(axcn == null || axcn.mo66087x() == null)) {
            bmkm x = this.f94743p.mo66087x();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwjz bwjz2 = (bwjz) da.f164949b;
            x.getClass();
            bwjz2.f159926d = x;
            bwjz2.f159923a |= 4;
        }
        bkig bkig = this.f94744q;
        if (bkig != null) {
            bmdk m = bkig.mo66019m();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwjz bwjz3 = (bwjz) da.f164949b;
            m.getClass();
            bwjz3.f159928f = m;
            bwjz3.f159923a |= 8;
        }
        if (!this.f94745r.isEmpty()) {
            for (int i = 0; i < this.f94745r.size(); i++) {
                bmed c = ((awzs) this.f94745r.get(i)).mo52944a(bundle);
                if (c != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bwjz bwjz4 = (bwjz) da.f164949b;
                    c.getClass();
                    if (!bwjz4.f159927e.mo73666a()) {
                        bwjz4.f159927e = bxvk.m124021a(bwjz4.f159927e);
                    }
                    bwjz4.f159927e.add(c);
                }
            }
        }
        if (bArr != null) {
            bxtx a2 = bxtx.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwjz bwjz5 = (bwjz) da.f164949b;
            a2.getClass();
            bwjz5.f159923a |= 2;
            bwjz5.f159925c = a2;
        }
        return (bwjz) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51903a() {
        mo52376B();
    }

    /* renamed from: a */
    public final void mo51904a(int i) {
        super.mo51904a(i);
        if (i == 1) {
            this.f95357A.setVisibility(0);
        }
        this.f95363G.mo66047g(true);
    }

    /* renamed from: a */
    public final void mo51905a(int i, Bundle bundle) {
        if (i != 8) {
            super.mo51905a(i, bundle);
        } else {
            mo52376B();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51908a(bmaf bmaf) {
        throw new UnsupportedOperationException("Refreshes are not supported by purchase manager");
    }

    /* renamed from: a */
    public final void mo52377a(bmaq bmaq, bwgz bwgz, bmar bmar, String str, String str2, bwjy bwjy, bmav bmav, bmag bmag, boolean z, String str3, bwiu bwiu) {
        bmkw bmkw;
        bxtx bxtx;
        mo52853a(bmav, bmaq);
        awoi a = PmResult.m94081a();
        a.mo52369a(str);
        if (bmag != null) {
            if (bmag.f128444a == 2) {
                bxtx = (bxtx) bmag.f128445b;
            } else {
                bxtx = bxtx.f164797b;
            }
            a.mo52370a(bxtx.mo73780k());
        }
        if (str2 != null) {
            a.f94723a.f110311d = str2;
        }
        bwel bwel = this.f94741n;
        if (bwel != null) {
            a.f94723a.f110312e = bwel;
        }
        PmRootFragment$PurchaseManagerPageDetails pmRootFragment$PurchaseManagerPageDetails = new PmRootFragment$PurchaseManagerPageDetails();
        pmRootFragment$PurchaseManagerPageDetails.f110460i = bwjy;
        if (bwjy != null) {
            if ((bwjy.f159902a & 2048) != 0) {
                bmkw = bwjy.f159914m;
                if (bmkw == null) {
                    bmkw = bmkw.f129898c;
                }
            } else {
                bmkw = null;
            }
            pmRootFragment$PurchaseManagerPageDetails.f110463l = bmkw;
        }
        pmRootFragment$PurchaseManagerPageDetails.f110468q = bmav;
        pmRootFragment$PurchaseManagerPageDetails.f110454c = bwgz;
        pmRootFragment$PurchaseManagerPageDetails.f110465n = bmaq;
        pmRootFragment$PurchaseManagerPageDetails.f110467p = bmar;
        pmRootFragment$PurchaseManagerPageDetails.f110466o = a.f94723a;
        pmRootFragment$PurchaseManagerPageDetails.f110456e = bmag;
        if (bwjy != null) {
            pmRootFragment$PurchaseManagerPageDetails.f110452a = bwjy.f159908g;
        }
        pmRootFragment$PurchaseManagerPageDetails.f110458g = bwiu;
        mo52364a(pmRootFragment$PurchaseManagerPageDetails, z, str3);
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        bmmp bmmp;
        bmmp bmmp2;
        bxvw bxvw;
        bmmp bmmp3;
        bwgz bwgz = bwgz.UNKNOWN_FLOW_INSTRUCTION;
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
                bmmp3 = (bmmp) bmmv.f130057c;
            } else {
                bmmp3 = bmmp.f130032e;
            }
            bxvw = bmmp3.f130034a;
        } else {
            bxvw = null;
        }
        mo52379a(bxvw, bundle, k);
    }

    /* renamed from: a */
    public final void mo52378a(bwjz bwjz) {
        SecurePaymentsData[] securePaymentsDataArr;
        bmed bmed;
        bmed bmed2;
        bmdy bmdy;
        bmqk bmqk;
        String str;
        String str2;
        bmed bmed3;
        bmed bmed4;
        bmed bmed5;
        bmdy bmdy2;
        String str3;
        String str4;
        bwjz bwjz2 = bwjz;
        axcn axcn = this.f94743p;
        if (axcn != null && !axcn.mo52775bR()) {
            this.f94743p.mo66086w();
            return;
        }
        boolean z = false;
        mo52808n(false);
        bxvd da = bwka.f159929d.mo74144da();
        bmaj a = awfx.m79878a(this.f95398ak.f110465n.f128483c.mo73780k());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwka bwka = (bwka) da.f164949b;
        a.getClass();
        bwka.f159932b = a;
        int i = 1;
        int i2 = bwka.f159931a | 1;
        bwka.f159931a = i2;
        int i3 = 2;
        if (bwjz2 != null) {
            bwjz.getClass();
            bwka.f159933c = bwjz2;
            bwka.f159931a = i2 | 2;
        }
        if (!this.f94737j) {
            Object obj = this.f95397aj;
            if (!(obj == null || ((bwjy) obj).f159913l.size() == 0 || ((bwjy) this.f95397aj).f159913l.size() <= 0)) {
                bkdx bkdx = this.f94742o;
                if (bkdx instanceof bkjj) {
                    bkjj bkjj = (bkjj) bkdx;
                    int size = ((bwjy) this.f95397aj).f159913l.size();
                    bxvd da2 = bwel.f159000b.mo74144da();
                    for (int i4 = 0; i4 < size; i4++) {
                        int i5 = ((bwhd) ((bwjy) this.f95397aj).f159913l.get(i4)).f159493a;
                        bmaf bmaf = ((bwhd) ((bwjy) this.f95397aj).f159913l.get(i4)).f159494b;
                        if (bmaf == null) {
                            bmaf = bmaf.f128436d;
                        }
                        int size2 = bkjj.f124403e.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                break;
                            }
                            bkji bkji = (bkji) bkjj.f124403e.get(i6);
                            if (bmaf.f128438a.equals(bkji.f124380c) && bmaf.f128440c == bkji.f124381g && bmaf.f128439b == bkji.f124378a) {
                                View b = bkft.m105641b((View) bkjj.f124407i.get(bkji.f124379b));
                                if (b instanceof FormEditText) {
                                    str4 = ((FormEditText) b).mo71937m();
                                }
                            } else {
                                i6++;
                            }
                        }
                        str4 = null;
                        bxvd da3 = bwek.f158995d.mo74144da();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bwek bwek = (bwek) da3.f164949b;
                        bwek.f158997a |= 1;
                        bwek.f158998b = i5;
                        String b2 = bmxx.m108578b(str4);
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bwek bwek2 = (bwek) da3.f164949b;
                        b2.getClass();
                        bwek2.f158997a |= 2;
                        bwek2.f158999c = b2;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bwel bwel = (bwel) da2.f164949b;
                        bwek bwek3 = (bwek) da3.mo74062i();
                        bwek3.getClass();
                        if (!bwel.f159002a.mo73666a()) {
                            bwel.f159002a = bxvk.m124021a(bwel.f159002a);
                        }
                        bwel.f159002a.add(bwek3);
                    }
                    this.f94741n = (bwel) da2.mo74062i();
                }
            }
            bwka bwka2 = (bwka) da.mo74062i();
            mo52864a(bwka2, 3);
            mo52900j(3);
            mo52839Y().f94357a.mo52417a(bwka2, this.f95398ak.f110467p);
            return;
        }
        bwjz bwjz3 = bwka.f159933c;
        if (bwjz3 == null) {
            bwjz3 = bwjz.f159921g;
        }
        bmfv bmfv = bwjz3.f159924b;
        if (bmfv == null) {
            bmfv = bmfv.f129179c;
        }
        int i7 = 5;
        bxvd bxvd = (bxvd) bmfv.mo74142c(5);
        bxvd.mo73625a((bxvk) bmfv);
        List list = this.f94738k;
        if (list != null) {
            int size3 = list.size();
            securePaymentsDataArr = new SecurePaymentsData[size3];
            int i8 = 0;
            while (i8 < size3) {
                bwhd bwhd = (bwhd) list.get(i8);
                if (((bmfv) bxvd.f164949b).f129181a == 11) {
                    bmaf bmaf2 = bwhd.f159494b;
                    if (bmaf2 == null) {
                        bmaf2 = bmaf.f128436d;
                    }
                    String str5 = bmaf2.f128438a;
                    bmfv bmfv2 = (bmfv) bxvd.f164949b;
                    if (bmfv2.f129181a != 11) {
                        bmed = bmed.f128915f;
                    } else {
                        bmed = (bmed) bmfv2.f129182b;
                    }
                    if (str5.equals(bmed.f128918b)) {
                        bmaf bmaf3 = bwhd.f159494b;
                        if (bmaf3 == null) {
                            bmaf3 = bmaf.f128436d;
                        }
                        if (bmaf3.f128439b == i) {
                            bmfv bmfv3 = (bmfv) bxvd.f164949b;
                            if (bmfv3.f129181a != 11) {
                                bmed2 = bmed.f128915f;
                            } else {
                                bmed2 = (bmed) bmfv3.f129182b;
                            }
                            bmaf bmaf4 = bwhd.f159494b;
                            if (bmaf4 == null) {
                                bmaf4 = bmaf.f128436d;
                            }
                            bmec bmec = (bmec) bmed2.f128920d.get(bmaf4.f128440c);
                            if (bmec.f128913a != i3) {
                                bmdy = bmdy.f128893c;
                            } else {
                                bmdy = (bmdy) bmec.f128914b;
                            }
                            if (bmdy.f128895a == i) {
                                bmqk = (bmqk) bmdy.f128896b;
                            } else {
                                bmqk = bmqk.f130403g;
                            }
                            bxvd bxvd2 = (bxvd) bmqk.mo74142c(i7);
                            bxvd2.mo73625a((bxvk) bmqk);
                            bmqk bmqk2 = (bmqk) bxvd2.f164949b;
                            if (bmqk2.f130406b == 8) {
                                str = (String) bmqk2.f130407c;
                            } else {
                                str = "";
                            }
                            if (str.isEmpty()) {
                                bmqk bmqk3 = (bmqk) bxvd2.f164949b;
                                if (bmqk3.f130406b == i3) {
                                    str2 = (String) bmqk3.f130407c;
                                } else {
                                    str2 = "";
                                }
                                if (bxvd2.f164950c) {
                                    bxvd2.mo74035c();
                                    bxvd2.f164950c = z;
                                }
                                bmqk bmqk4 = (bmqk) bxvd2.f164949b;
                                bmqk bmqk5 = bmqk.f130403g;
                                "".getClass();
                                bmqk4.f130406b = i3;
                                bmqk4.f130407c = "";
                            } else {
                                bmqk bmqk6 = (bmqk) bxvd2.f164949b;
                                if (bmqk6.f130406b == 8) {
                                    str3 = (String) bmqk6.f130407c;
                                } else {
                                    str3 = "";
                                }
                                if (bxvd2.f164950c) {
                                    bxvd2.mo74035c();
                                    bxvd2.f164950c = z;
                                }
                                bmqk bmqk7 = (bmqk) bxvd2.f164949b;
                                bmqk bmqk8 = bmqk.f130403g;
                                "".getClass();
                                bmqk7.f130406b = 8;
                                bmqk7.f130407c = "";
                                str2 = str3;
                            }
                            bmfv bmfv4 = (bmfv) bxvd.f164949b;
                            if (bmfv4.f129181a != 11) {
                                bmed3 = bmed.f128915f;
                            } else {
                                bmed3 = (bmed) bmfv4.f129182b;
                            }
                            bxvd bxvd3 = (bxvd) bmed3.mo74142c(5);
                            bxvd3.mo73625a((bxvk) bmed3);
                            bmaf bmaf5 = bwhd.f159494b;
                            if (bmaf5 == null) {
                                bmaf5 = bmaf.f128436d;
                            }
                            int i9 = bmaf5.f128440c;
                            bmfv bmfv5 = (bmfv) bxvd.f164949b;
                            if (bmfv5.f129181a != 11) {
                                bmed4 = bmed.f128915f;
                            } else {
                                bmed4 = (bmed) bmfv5.f129182b;
                            }
                            bmaf bmaf6 = bwhd.f159494b;
                            if (bmaf6 == null) {
                                bmaf6 = bmaf.f128436d;
                            }
                            bmec bmec2 = (bmec) bmed4.f128920d.get(bmaf6.f128440c);
                            bxvd bxvd4 = (bxvd) bmec2.mo74142c(5);
                            bxvd4.mo73625a((bxvk) bmec2);
                            bmfv bmfv6 = (bmfv) bxvd.f164949b;
                            if (bmfv6.f129181a != 11) {
                                bmed5 = bmed.f128915f;
                            } else {
                                bmed5 = (bmed) bmfv6.f129182b;
                            }
                            bmaf bmaf7 = bwhd.f159494b;
                            if (bmaf7 == null) {
                                bmaf7 = bmaf.f128436d;
                            }
                            bmec bmec3 = (bmec) bmed5.f128920d.get(bmaf7.f128440c);
                            if (bmec3.f128913a != 2) {
                                bmdy2 = bmdy.f128893c;
                            } else {
                                bmdy2 = (bmdy) bmec3.f128914b;
                            }
                            bxvd bxvd5 = (bxvd) bmdy2.mo74142c(5);
                            bxvd5.mo73625a((bxvk) bmdy2);
                            if (bxvd5.f164950c) {
                                bxvd5.mo74035c();
                                bxvd5.f164950c = false;
                            }
                            bmdy bmdy3 = (bmdy) bxvd5.f164949b;
                            bmqk bmqk9 = (bmqk) bxvd2.mo74062i();
                            bmdy bmdy4 = bmdy.f128893c;
                            bmqk9.getClass();
                            bmdy3.f128896b = bmqk9;
                            bmdy3.f128895a = 1;
                            if (bxvd4.f164950c) {
                                bxvd4.mo74035c();
                                bxvd4.f164950c = false;
                            }
                            bmec bmec4 = (bmec) bxvd4.f164949b;
                            bmdy bmdy5 = (bmdy) bxvd5.mo74062i();
                            bmec bmec5 = bmec.f128911c;
                            bmdy5.getClass();
                            bmec4.f128914b = bmdy5;
                            bmec4.f128913a = 2;
                            if (bxvd3.f164950c) {
                                bxvd3.mo74035c();
                                bxvd3.f164950c = false;
                            }
                            bmed bmed6 = (bmed) bxvd3.f164949b;
                            bmec bmec6 = (bmec) bxvd4.mo74062i();
                            bmed bmed7 = bmed.f128915f;
                            bmec6.getClass();
                            bmed6.mo66783a();
                            bmed6.f128920d.set(i9, bmec6);
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            bmfv bmfv7 = (bmfv) bxvd.f164949b;
                            bmed bmed8 = (bmed) bxvd3.mo74062i();
                            bmed8.getClass();
                            bmfv7.f129182b = bmed8;
                            bmfv7.f129181a = 11;
                            securePaymentsDataArr[i8] = new SecurePaymentsData(bwhd.f159493a, str2);
                            i8++;
                            z = false;
                            i7 = 5;
                            i = 1;
                            i3 = 2;
                        }
                    }
                }
                Locale locale = Locale.US;
                Object[] objArr = new Object[3];
                bmaf bmaf8 = bwhd.f159494b;
                if (bmaf8 == null) {
                    bmaf8 = bmaf.f128436d;
                }
                objArr[0] = bmaf8.f128438a;
                bmaf bmaf9 = bwhd.f159494b;
                if (bmaf9 == null) {
                    bmaf9 = bmaf.f128436d;
                }
                objArr[1] = Integer.valueOf(bmaf9.f128439b);
                bmaf bmaf10 = bwhd.f159494b;
                if (bmaf10 == null) {
                    bmaf10 = bmaf.f128436d;
                }
                objArr[2] = Integer.valueOf(bmaf10.f128440c);
                throw new IllegalArgumentException(String.format(locale, "Unsupported SecureDataMapping FormFieldReference formId=%s fieldId=%d repeatedFieldIndex=%d", objArr));
            }
        }
        securePaymentsDataArr = new SecurePaymentsData[0];
        bwjz bwjz4 = ((bwka) da.f164949b).f159933c;
        if (bwjz4 == null) {
            bwjz4 = bwjz.f159921g;
        }
        bxvd bxvd6 = (bxvd) bwjz4.mo74142c(5);
        bxvd6.mo73625a((bxvk) bwjz4);
        if (bxvd6.f164950c) {
            bxvd6.mo74035c();
            bxvd6.f164950c = false;
        }
        bwjz bwjz5 = (bwjz) bxvd6.f164949b;
        bmfv bmfv8 = (bmfv) bxvd.mo74062i();
        bmfv8.getClass();
        bwjz5.f159924b = bmfv8;
        bwjz5.f159923a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwka bwka3 = (bwka) da.f164949b;
        bwjz bwjz6 = (bwjz) bxvd6.mo74062i();
        bwjz6.getClass();
        bwka3.f159933c = bwjz6;
        bwka3.f159931a |= 2;
        SecurePaymentsPayload securePaymentsPayload = new SecurePaymentsPayload(((bwka) da.mo74062i()).mo73642k(), securePaymentsDataArr);
        PageDetails pageDetails = this.f95398ak;
        PmResult pmResult = PmResult.m94081a().f94723a;
        pmResult.f110308a = securePaymentsPayload;
        pageDetails.f110466o = pmResult;
        mo52873af();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51911a(Object obj) {
        if (obj instanceof bwjw) {
            mo52900j(2);
            mo52839Y().f94357a.mo52416a((bwjw) obj);
            mo52808n(false);
        } else if (obj instanceof bwka) {
            mo52900j(3);
            mo52839Y().f94357a.mo52417a((bwka) obj, this.f95398ak.f110467p);
            mo52808n(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo52379a(List list, Bundle bundle, byte[] bArr) {
        if (mo52804a(list)) {
            mo52378a((bwjz) mo52885b(bundle, bArr, (List) null));
        }
    }
}
