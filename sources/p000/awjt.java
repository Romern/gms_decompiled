package p000;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.gms.wallet.embeddedlandingpage.BalanceCardView;
import com.google.android.gms.wallet.embeddedlandingpage.EmbeddedLandingPageFragment$EmbeddedLandingPageDetails;
import com.google.android.gms.wallet.p088ui.common.PageDetails;
import com.google.android.gms.wallet.p088ui.common.ProgressSpinnerView;
import com.google.android.gms.wallet.p088ui.component.alert.AlertView;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import com.google.android.wallet.p097ui.common.LinkView;
import java.util.List;
import java.util.Locale;

/* renamed from: awjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awjt extends awzk {

    /* renamed from: f */
    public static final /* synthetic */ int f94557f = 0;

    /* renamed from: a */
    boolean f94558a;

    /* renamed from: b */
    GridLayout f94559b;

    /* renamed from: c */
    BalanceCardView f94560c;

    /* renamed from: d */
    AlertView f94561d;

    /* renamed from: e */
    final awpc f94562e = new awjr(this);

    /* renamed from: g */
    private byte[] f94563g;

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final PageDetails mo52038J() {
        return new EmbeddedLandingPageFragment$EmbeddedLandingPageDetails();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.widget.GridLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f95357A = layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_embedded_landing_page, viewGroup, false);
        mo52851a((awib) ((ProgressSpinnerView) this.f95357A.findViewById(C0126R.C0129id.progress_spinner_container)));
        GridLayout gridLayout = (GridLayout) this.f95357A.findViewById(C0126R.C0129id.card_view_container);
        this.f94559b = gridLayout;
        this.f94560c = (BalanceCardView) layoutInflater.inflate((int) C0126R.C0128layout.wallet_view_elp_balance_card, (ViewGroup) gridLayout, false);
        if (this.f94558a) {
            mo52181g();
        } else if (this.f95368L == 1) {
            mo52888b("onInitialLoad");
        }
        return this.f95357A;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final awpc mo51913b() {
        return this.f94562e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo51917c() {
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return new bjes(26);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final bxxk mo51920d() {
        return (bxxk) bwiy.f159700d.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final bxxk mo51921e() {
        return (bxxk) bwjc.f159734d.mo74142c(7);
    }

    /* renamed from: f */
    public final void mo51922f() {
        super.mo51922f();
        boolean z = this.f124195aJ;
        BalanceCardView balanceCardView = this.f94560c;
        if (balanceCardView != null) {
            balanceCardView.setEnabled(z);
        }
        AlertView alertView = this.f94561d;
        if (alertView != null) {
            alertView.setEnabled(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo52181g() {
        mo52808n(false);
        this.f94558a = false;
        bxvd da = bwiy.f159700d.mo74144da();
        bmaj a = awfx.m79878a((byte[]) null);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwiy bwiy = (bwiy) da.f164949b;
        a.getClass();
        bwiy.f159703b = a;
        bwiy.f159702a |= 1;
        bxtx a2 = bxtx.m123261a(this.f94563g);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwiy bwiy2 = (bwiy) da.f164949b;
        a2.getClass();
        bwiy2.f159702a |= 2;
        bwiy2.f159704c = a2;
        bwiy bwiy3 = (bwiy) da.mo74062i();
        mo52864a(bwiy3, 2);
        mo52865a((Runnable) new awjq(this, bwiy3));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final bmlz mo51924h() {
        Object obj = this.f95397aj;
        if (obj == null) {
            return null;
        }
        bwja bwja = (bwja) obj;
        if ((bwja.f159716a & 16) == 0) {
            return null;
        }
        bmlz bmlz = bwja.f159725j;
        return bmlz == null ? bmlz.f129993c : bmlz;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo51925l() {
        throw new UnsupportedOperationException("makeResponseContextOnlySubmitRequest() is not supported by ELP.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final bxxk mo51926m() {
        return (bxxk) bwja.f159714m.mo74142c(7);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (intent != null && intent.getBooleanExtra("com.google.android.gms.wallet.firstparty.EXTRA_REFRESH", false)) {
            mo52181g();
        }
        if (i == 1004 && i2 == 0) {
            mo52873af();
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        bwja bwja;
        bmav bmav;
        bmkw bmkw;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f94563g = arguments.getByteArray("embeddedLandingPageParameters");
        if (bundle == null) {
            if (arguments.containsKey("initializeToken")) {
                this.f95368L = 1;
                bwiz bwiz = (bwiz) bjvp.m104730a(arguments, "initializeToken", (bxxk) bwiz.f159705g.mo74142c(7));
                EmbeddedLandingPageFragment$EmbeddedLandingPageDetails embeddedLandingPageFragment$EmbeddedLandingPageDetails = new EmbeddedLandingPageFragment$EmbeddedLandingPageDetails();
                bmar bmar = null;
                if ((bwiz.f159707a & 8) != 0) {
                    bwja = bwiz.f159711e;
                    if (bwja == null) {
                        bwja = bwja.f159714m;
                    }
                } else {
                    bwja = null;
                }
                embeddedLandingPageFragment$EmbeddedLandingPageDetails.f110460i = bwja;
                if ((bwiz.f159707a & 8) != 0) {
                    bwja bwja2 = bwiz.f159711e;
                    if (bwja2 == null) {
                        bwja2 = bwja.f159714m;
                    }
                    if ((bwja2.f159716a & 32) != 0) {
                        bwja bwja3 = bwiz.f159711e;
                        if (bwja3 == null) {
                            bwja3 = bwja.f159714m;
                        }
                        bmkw = bwja3.f159727l;
                        if (bmkw == null) {
                            bmkw = bmkw.f129898c;
                        }
                    } else {
                        bmkw = null;
                    }
                    embeddedLandingPageFragment$EmbeddedLandingPageDetails.f110463l = bmkw;
                }
                bmaq bmaq = bwiz.f159709c;
                if (bmaq == null) {
                    bmaq = bmaq.f128479l;
                }
                embeddedLandingPageFragment$EmbeddedLandingPageDetails.f110465n = bmaq;
                if ((bwiz.f159707a & 1) != 0) {
                    bmav = bwiz.f159708b;
                    if (bmav == null) {
                        bmav = bmav.f128500h;
                    }
                } else {
                    bmav = null;
                }
                embeddedLandingPageFragment$EmbeddedLandingPageDetails.f110468q = bmav;
                bwgz a = bwgz.m121952a(bwiz.f159712f);
                if (a == null) {
                    a = bwgz.UNKNOWN_FLOW_INSTRUCTION;
                }
                embeddedLandingPageFragment$EmbeddedLandingPageDetails.f110454c = a;
                if ((bwiz.f159707a & 4) != 0 && (bmar = bwiz.f159710d) == null) {
                    bmar = bmar.f128490c;
                }
                embeddedLandingPageFragment$EmbeddedLandingPageDetails.f110467p = bmar;
                this.f95399al = embeddedLandingPageFragment$EmbeddedLandingPageDetails;
            } else {
                this.f94558a = true;
            }
            OrchestrationViewEvent.m93828c(getActivity(), this.f95359C, mo51919co());
            return;
        }
        this.f94558a = bundle.getBoolean("shouldMakeInitializeRequest", false);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("shouldMakeInitializeRequest", this.f94558a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo51914b(Object obj) {
        bwjb bwjb = (bwjb) obj;
        bxvd da = bwjc.f159734d.mo74144da();
        bmaj a = awfx.m79878a(this.f95398ak.f110465n.f128483c.mo73780k());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwjc bwjc = (bwjc) da.f164949b;
        a.getClass();
        bwjc.f159737b = a;
        int i = bwjc.f159736a | 1;
        bwjc.f159736a = i;
        bwjb.getClass();
        bwjc.f159738c = bwjb;
        bwjc.f159736a = i | 2;
        bwjc bwjc2 = (bwjc) da.mo74062i();
        mo52839Y().f94357a.mo52411a(bwjc2, this.f95398ak.f110467p);
        return bwjc2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo52180e(Object obj) {
        bwja bwja = (bwja) obj;
        bxwc bxwc = bwja.f159726k;
        int size = bxwc.size();
        int i = 0;
        while (i < size) {
            bwhc bwhc = (bwhc) bxwc.get(i);
            long j = bwhc.f159488a;
            bwhn bwhn = ((bwja) this.f95397aj).f159724i;
            if (bwhn == null) {
                bwhn = bwhn.f159531f;
            }
            if (j == bwhn.f159533a) {
                AlertView alertView = this.f94561d;
                bwhn bwhn2 = bwja.f159724i;
                if (bwhn2 == null) {
                    bwhn2 = bwhn.f159531f;
                }
                alertView.mo60080a(bwhc, bwhn2);
                if (bwhn2 != null) {
                    bwja bwja2 = (bwja) this.f95397aj;
                    bxvd bxvd = (bxvd) bwja2.mo74142c(5);
                    bxvd.mo73625a((bxvk) bwja2);
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bwja bwja3 = (bwja) bxvd.f164949b;
                    bwja bwja4 = bwja.f159714m;
                    bwhn2.getClass();
                    bwja3.f159724i = bwhn2;
                    bwja3.f159716a |= 8;
                    this.f95397aj = bxvd.mo74062i();
                }
                i++;
            } else {
                throw new UnsupportedOperationException(String.format(Locale.US, "Can not handle partialUpdateData: %s", bwhc));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bxxc mo52042a(long j) {
        int intValue = ((Integer) this.f95375S.mo15534a(j)).intValue();
        int intValue2 = ((Integer) this.f95374R.mo15534a(j)).intValue();
        if (intValue2 == 6) {
            return (bmeb) ((bwja) this.f95397aj).f159719d.get(intValue);
        }
        switch (intValue2) {
            case 25:
                return (bmep) ((bwja) this.f95397aj).f159720e.get(intValue);
            case 26:
                return (bmem) ((bwja) this.f95397aj).f159721f.get(intValue);
            case 27:
                return (bmfq) ((bwja) this.f95397aj).f159722g.get(intValue);
            default:
                return null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.widget.GridLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo51916b(boolean z) {
        bwhm bwhm;
        mo52892d(z);
        int size = ((bwja) this.f95397aj).f159720e.size();
        for (int i = 0; i < size; i++) {
            mo52850a(((bmep) ((bwja) this.f95397aj).f159720e.get(i)).f128983d, 25, i);
        }
        int size2 = ((bwja) this.f95397aj).f159721f.size();
        for (int i2 = 0; i2 < size2; i2++) {
            mo52850a(((bmem) ((bwja) this.f95397aj).f159721f.get(i2)).f128966a, 26, i2);
        }
        int size3 = ((bwja) this.f95397aj).f159719d.size();
        for (int i3 = 0; i3 < size3; i3++) {
            bmdn bmdn = ((bmeb) ((bwja) this.f95397aj).f159719d.get(i3)).f128905b;
            if (bmdn == null) {
                bmdn = bmdn.f128831k;
            }
            mo52850a(bmdn.f128835c, 6, i3);
        }
        int size4 = ((bwja) this.f95397aj).f159722g.size();
        for (int i4 = 0; i4 < size4; i4++) {
            mo52850a(((bmfq) ((bwja) this.f95397aj).f159722g.get(i4)).f129144b, 27, i4);
        }
        this.f94559b.removeAllViews();
        this.f95373Q = ((bwja) this.f95397aj).f159717b;
        if (z) {
            this.f95357A.setVisibility(4);
        }
        bwja bwja = (bwja) this.f95397aj;
        if ((bwja.f159716a & 8) != 0) {
            bwhn bwhn = bwja.f159724i;
            if (bwhn == null) {
                bwhn = bwhn.f159531f;
            }
            if (bwhn.f159534b.size() > 0) {
                AlertView alertView = (AlertView) this.f123963aH.inflate((int) C0126R.C0128layout.wallet_view_alert, (ViewGroup) this.f94559b, false);
                this.f94561d = alertView;
                alertView.f110505p = this.f124196aK;
                alertView.setId(mo65818aq().mo65614a());
                AlertView alertView2 = this.f94561d;
                bwhn bwhn2 = ((bwja) this.f95397aj).f159724i;
                if (bwhn2 == null) {
                    bwhn2 = bwhn.f159531f;
                }
                alertView2.mo60081a(bwhn2, getActivity(), mo65820k(this.f94561d.getId()), this);
                this.f94559b.addView(this.f94561d);
            }
        }
        bwja bwja2 = (bwja) this.f95397aj;
        if ((bwja2.f159716a & 4) != 0) {
            BalanceCardView balanceCardView = this.f94560c;
            bwhu bwhu = bwja2.f159723h;
            if (bwhu == null) {
                bwhu = bwhu.f159567j;
            }
            bjxv aq = mo65818aq();
            balanceCardView.f110147r = bwhu;
            balanceCardView.f110148s = aq;
            balanceCardView.f110149t = this;
            LayoutInflater from = LayoutInflater.from(balanceCardView.getContext());
            balanceCardView.f110143n.removeAllViews();
            Button button = balanceCardView.f110144o;
            if (button != null) {
                balanceCardView.f110136g.removeView(button);
            }
            balanceCardView.mo59900a(balanceCardView.f110145p);
            balanceCardView.mo59900a(balanceCardView.f110146q);
            InfoMessageView infoMessageView = balanceCardView.f110137h;
            bmnr bmnr = bwhu.f159570b;
            if (bmnr == null) {
                bmnr = bmnr.f130153o;
            }
            infoMessageView.mo72006b(bmnr);
            bkfr.m105573a(balanceCardView.f110138i, bwhu.f159574f);
            bwhu bwhu2 = balanceCardView.f110147r;
            if ((bwhu2.f159569a & 64) == 0) {
                balanceCardView.f110139j.setVisibility(8);
            } else {
                bmjz bmjz = bwhu2.f159577i;
                if (bmjz == null) {
                    bmjz = bmjz.f129768d;
                }
                balanceCardView.f110139j.setVisibility(0);
                InfoMessageView infoMessageView2 = balanceCardView.f110141l;
                bmnr bmnr2 = bmjz.f129770a;
                if (bmnr2 == null) {
                    bmnr2 = bmnr.f130153o;
                }
                infoMessageView2.mo72006b(bmnr2);
                InfoMessageView infoMessageView3 = balanceCardView.f110142m;
                bmnr bmnr3 = bmjz.f129771b;
                if (bmnr3 == null) {
                    bmnr3 = bmnr.f130153o;
                }
                infoMessageView3.mo72006b(bmnr3);
                balanceCardView.f110140k.setProgress(bmjz.f129772c);
            }
            balanceCardView.f110143n.setVisibility(8);
            bwhu bwhu3 = balanceCardView.f110147r;
            if ((4 & bwhu3.f159569a) != 0) {
                bmnr bmnr4 = bwhu3.f159571c;
                if (bmnr4 == null) {
                    bmnr4 = bmnr.f130153o;
                }
                balanceCardView.f110143n.addView(InfoMessageView.m118576a(from, bmnr4, balanceCardView.f110143n, balanceCardView.f110148s));
                balanceCardView.f110143n.setVisibility(0);
            }
            bwhu bwhu4 = balanceCardView.f110147r;
            if ((bwhu4.f159569a & 8) != 0) {
                bwhm bwhm2 = bwhu4.f159572d;
                if (bwhm2 != null) {
                    bwhm = bwhm2;
                } else {
                    bwhm = bwhm.f159522h;
                }
                balanceCardView.f110143n.addView(LinkView.m118645a(bwhm, balanceCardView.getContext(), balanceCardView.f110143n, balanceCardView, from, balanceCardView.f110148s, balanceCardView.f110149t));
                balanceCardView.f110143n.setVisibility(0);
            }
            int size5 = balanceCardView.f110147r.f159573e.size();
            for (int i5 = 0; i5 < size5; i5++) {
                InfoMessageView a = InfoMessageView.m118576a(from, (bmnr) balanceCardView.f110147r.f159573e.get(i5), balanceCardView.f110136g, balanceCardView.f110148s);
                balanceCardView.f110136g.addView(a);
                balanceCardView.f110145p.add(a);
                if (i5 == 0) {
                    int i6 = balanceCardView.f110147r.f159569a;
                    if ((i6 & 4) == 0 && (i6 & 8) == 0) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a.getLayoutParams();
                        marginLayoutParams.topMargin = (int) balanceCardView.getResources().getDimension(C0126R.dimen.wallet_elp_balance_card_content_margin_medium);
                        a.setLayoutParams(marginLayoutParams);
                    }
                }
            }
            bwhu bwhu5 = balanceCardView.f110147r;
            if ((bwhu5.f159569a & 32) != 0) {
                bwhm bwhm3 = bwhu5.f159576h;
                balanceCardView.f110144o = LinkView.m118644a(bwhm3 != null ? bwhm3 : bwhm.f159522h, balanceCardView.getContext(), balanceCardView.f110136g, from, balanceCardView.f110148s, balanceCardView.f110149t);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) balanceCardView.f110144o.getLayoutParams();
                marginLayoutParams2.topMargin = balanceCardView.f110150u;
                balanceCardView.f110144o.setLayoutParams(marginLayoutParams2);
                balanceCardView.f110136g.addView(balanceCardView.f110144o);
            }
            int size6 = balanceCardView.f110147r.f159575g.size();
            for (int i7 = 0; i7 < size6; i7++) {
                InfoMessageView a2 = InfoMessageView.m118576a(from, (bmnr) balanceCardView.f110147r.f159575g.get(i7), balanceCardView.f110136g, balanceCardView.f110148s);
                balanceCardView.f110136g.addView(a2);
                balanceCardView.f110146q.add(a2);
                if (i7 == 0) {
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) a2.getLayoutParams();
                    marginLayoutParams3.topMargin = balanceCardView.f110150u;
                    a2.setLayoutParams(marginLayoutParams3);
                }
            }
            this.f94559b.addView(this.f94560c);
        }
        mo52867a(((bwja) this.f95397aj).f159718c, this.f94559b, z);
        if (mo51924h() != null) {
            bjwl.m104784a(this, 1, this.f124196aK);
            bjwl.m104784a(this, 2, this.f124196aK);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo51902a(Bundle bundle, byte[] bArr, List list) {
        bwhn bwhn;
        bwjb bwjb = bwjb.f159729d;
        bwja bwja = (bwja) this.f95397aj;
        if ((bwja.f159716a & 8) != 0) {
            bwhn = bwja.f159724i;
            if (bwhn == null) {
                bwhn = bwhn.f159531f;
            }
        } else {
            bwhn = null;
        }
        if (bwhn != null) {
            bxvd da = bwjb.f159729d.mo74144da();
            bxtx a = bxtx.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwjb bwjb2 = (bwjb) da.f164949b;
            a.getClass();
            bwjb2.f159731a |= 1;
            bwjb2.f159732b = a;
            bxvd da2 = bwho.f159539d.mo74144da();
            long j = bwhn.f159533a;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bwho bwho = (bwho) da2.f164949b;
            int i = bwho.f159541a | 1;
            bwho.f159541a = i;
            bwho.f159542b = j;
            bxtx bxtx = bwhn.f159537e;
            bxtx.getClass();
            bwho.f159541a = i | 2;
            bwho.f159543c = bxtx;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwjb bwjb3 = (bwjb) da.f164949b;
            bwho bwho2 = (bwho) da2.mo74062i();
            bwho2.getClass();
            bwjb3.f159733c = bwho2;
            bwjb3.f159731a |= 2;
            return (bwjb) da.mo74062i();
        }
        throw new IllegalStateException("No alert available when trying to dismiss an alert.");
    }

    /* renamed from: a */
    public final void mo51904a(int i) {
        super.mo51904a(i);
        if (i != 1) {
            return;
        }
        if (!bkfr.m105612e(getActivity()) || mo52869ab()) {
            this.f95357A.setVisibility(0);
        } else {
            this.f95357A.post(new awjp(this));
        }
    }

    /* renamed from: a */
    public final void mo52179a(bmaq bmaq, bmav bmav, bwgz bwgz, bmar bmar, bwja bwja, boolean z, String str) {
        bmkw bmkw;
        mo52853a(bmav, bmaq);
        EmbeddedLandingPageFragment$EmbeddedLandingPageDetails embeddedLandingPageFragment$EmbeddedLandingPageDetails = new EmbeddedLandingPageFragment$EmbeddedLandingPageDetails();
        embeddedLandingPageFragment$EmbeddedLandingPageDetails.f110460i = bwja;
        if (bwja != null) {
            if ((bwja.f159716a & 32) != 0) {
                bmkw = bwja.f159727l;
                if (bmkw == null) {
                    bmkw = bmkw.f129898c;
                }
            } else {
                bmkw = null;
            }
            embeddedLandingPageFragment$EmbeddedLandingPageDetails.f110463l = bmkw;
        }
        embeddedLandingPageFragment$EmbeddedLandingPageDetails.f110468q = bmav;
        embeddedLandingPageFragment$EmbeddedLandingPageDetails.f110454c = bwgz;
        embeddedLandingPageFragment$EmbeddedLandingPageDetails.f110465n = bmaq;
        embeddedLandingPageFragment$EmbeddedLandingPageDetails.f110467p = bmar;
        mo52364a(embeddedLandingPageFragment$EmbeddedLandingPageDetails, z, str);
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        bmmp bmmp;
        int a = bmmb.m108166a(bmmv.f130058d);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 3) {
            super.mo51910a(bmmv, list);
            return;
        }
        Bundle bundle = Bundle.EMPTY;
        if (bmmv.f130056b == 4) {
            bmmp = (bmmp) bmmv.f130057c;
        } else {
            bmmp = bmmp.f130032e;
        }
        mo52895f((bwjb) mo52885b(bundle, bmmp.f130037d.mo73780k(), (List) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51911a(Object obj) {
        if (obj instanceof bwiy) {
            mo52900j(2);
            mo52839Y().f94357a.mo52410a((bwiy) obj);
            mo52808n(false);
        } else if (obj instanceof bwjc) {
            mo52900j(3);
            mo52839Y().f94357a.mo52411a((bwjc) obj, this.f95398ak.f110467p);
            mo52808n(false);
        }
    }
}
