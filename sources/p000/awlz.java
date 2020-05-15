package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.wallet.p097ui.common.FormHeaderView;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import com.google.android.wallet.p097ui.common.LegalMessageContainer;

/* renamed from: awlz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awlz implements awlx {

    /* renamed from: a */
    private final awma f94600a;

    public awlz(awma awma) {
        this.f94600a = awma;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.widget.LinearLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzk.a(bmdb, int, android.view.ViewGroup, boolean):bkbn
     arg types: [bmdb, int, android.view.ViewGroup, int]
     candidates:
      awzk.a(com.google.android.gms.wallet.shared.BuyFlowConfig, java.lang.String, com.google.android.gms.wallet.ui.common.PageDetails, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      awzk.a(awyy, bxxc, int, int):bkdx
      awzk.a(bmav, bmaq, java.util.List, int):void
      awzk.a(bmav, java.lang.String, boolean, boolean):void
      awzk.a(bmdb, int, android.view.ViewGroup, boolean):bkbn */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzk.a(bmdb, android.view.ViewGroup, boolean):bkbn
     arg types: [bmdb, android.view.ViewGroup, int]
     candidates:
      awma.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View
      awma.a(android.os.Bundle, byte[], java.util.List):java.lang.Object
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
    /* renamed from: a */
    public final void mo52255a(boolean z) {
        View view;
        awma awma = this.f94600a;
        LayoutInflater layoutInflater = awma.f123963aH;
        layoutInflater.inflate((int) C0126R.C0128layout.wallet_layout_fix_instrument_components, awma.f94603b, true);
        awma awma2 = this.f94600a;
        bwjm bwjm = (bwjm) awma2.f95397aj;
        View view2 = awma2.f95357A;
        bjwk bjwk = awma2.f124196aK;
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(C0126R.C0129id.info_message_container);
        bxwc bxwc = bwjm.f159815c;
        int size = bxwc.size();
        int i = 0;
        while (i < size) {
            bmnr bmnr = (bmnr) bxwc.get(i);
            InfoMessageView infoMessageView = (InfoMessageView) layoutInflater.inflate((int) C0126R.C0128layout.view_info_message_text, (ViewGroup) linearLayout, false);
            infoMessageView.setId(this.f94600a.f95376T.mo65614a());
            infoMessageView.mo72003a(bmnr);
            infoMessageView.f152084h = this.f94600a.mo65982av();
            linearLayout.addView(infoMessageView);
            this.f94600a.f95385aC.add(new bkde(bmnr.f130156b, infoMessageView, null));
            i++;
            view2 = view2;
        }
        View view3 = view2;
        if (bwjm.f159815c.size() <= 0) {
            linearLayout.setVisibility(8);
        } else {
            OrchestrationViewEvent.m93828c(this.f94600a.getActivity(), this.f94600a.f95359C, new bjes(1));
            linearLayout.setVisibility(0);
        }
        awyy a = awyy.m81590a(z, this.f94600a.f95363G);
        if ((bwjm.f159813a & 4) != 0) {
            awma awma3 = this.f94600a;
            bmgn bmgn = bwjm.f159817e;
            if (bmgn == null) {
                bmgn = bmgn.f129273o;
            }
            awma3.mo52846a(a, bmgn, 13, (int) C0126R.C0129id.instrument_selector_fragment_holder);
        }
        if ((8 & bwjm.f159813a) != 0) {
            awma awma4 = this.f94600a;
            bmfs bmfs = bwjm.f159818f;
            if (bmfs == null) {
                bmfs = bmfs.f129155e;
            }
            awma4.mo52846a(a, bmfs, 24, (int) C0126R.C0129id.instrument_activation_fragment_holder);
            bmfs bmfs2 = bwjm.f159818f;
            if (bmfs2 == null) {
                bmfs2 = bmfs.f129155e;
            }
            if ((bmfs2.f129157a & 1) != 0) {
                view = view3;
                FormHeaderView formHeaderView = (FormHeaderView) view.findViewById(C0126R.C0129id.instrument_activation_fragment_form_header);
                formHeaderView.setVisibility(0);
                bmfs bmfs3 = bwjm.f159818f;
                if (bmfs3 == null) {
                    bmfs3 = bmfs.f129155e;
                }
                bmdn bmdn = bmfs3.f129160d;
                if (bmdn == null) {
                    bmdn = bmdn.f128831k;
                }
                formHeaderView.mo71963a(bmdn, layoutInflater, this.f94600a.mo65982av(), this.f94600a.f95386aD);
            } else {
                view = view3;
            }
        } else {
            view = view3;
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(C0126R.C0129id.simple_form_fragments_holder);
        bxwc bxwc2 = bwjm.f159823k;
        int size2 = bxwc2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            FrameLayout frameLayout = new FrameLayout(this.f94600a.f123962aG);
            viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
            int a2 = this.f94600a.f95376T.mo65614a();
            frameLayout.setId(a2);
            this.f94600a.mo52846a(a, (bmeb) bxwc2.get(i2), 6, a2);
        }
        if ((bwjm.f159813a & 128) != 0) {
            awma awma5 = this.f94600a;
            bmdj bmdj = bwjm.f159827o;
            if (bmdj == null) {
                bmdj = bmdj.f128803l;
            }
            awma5.mo52846a(a, bmdj, 35, (int) C0126R.C0129id.encryption_fragment_holder);
        }
        LegalMessageContainer legalMessageContainer = (LegalMessageContainer) view.findViewById(C0126R.C0129id.fix_instrument_legal_message_container);
        if (bjwk != null) {
            legalMessageContainer.f152111a = bjwk;
        }
        awma awma6 = this.f94600a;
        legalMessageContainer.f152112b = awma6;
        legalMessageContainer.mo72027a(bwjm.f159819g, awma6.mo65820k(legalMessageContainer.getId()));
        legalMessageContainer.mo72026a(this.f94600a);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(C0126R.C0129id.page_button_container);
        if ((bwjm.f159813a & 16) != 0) {
            awma awma7 = this.f94600a;
            bmdb bmdb = bwjm.f159821i;
            if (bmdb == null) {
                bmdb = bmdb.f128767k;
            }
            bkbn a3 = awma7.mo52844a(bmdb, 1, viewGroup2, false);
            ((LinearLayout.LayoutParams) a3.mo52710b().getLayoutParams()).gravity = 16;
            a3.setId(C0126R.C0129id.wallet_cancel_button);
            a3.mo52710b().setOnClickListener(this.f94600a);
        }
        bxwc bxwc3 = bwjm.f159820h;
        int size3 = bxwc3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            this.f94600a.mo52845a((bmdb) bxwc3.get(i3), viewGroup2, false).mo52710b().setOnClickListener(this.f94600a);
        }
        int size4 = this.f94600a.f95385aC.size();
        for (int i4 = 0; i4 < size4; i4++) {
            Object obj = ((bkde) this.f94600a.f95385aC.get(i4)).f124039e;
            if (obj instanceof bkdx) {
                bkdx bkdx = (bkdx) obj;
                if (bkdx.mo52776bU() != null) {
                    this.f94600a.f95363G.mo66032a(bkdx);
                }
            }
        }
    }

    /* renamed from: a */
    public final String[] mo52256a() {
        LegalMessageContainer legalMessageContainer = (LegalMessageContainer) this.f94600a.f95357A.findViewById(C0126R.C0129id.fix_instrument_legal_message_container);
        return legalMessageContainer != null ? legalMessageContainer.mo72028a() : new String[0];
    }
}
