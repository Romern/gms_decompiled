package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import com.google.android.wallet.p097ui.common.SummaryTextLayout;
import com.google.android.wallet.p097ui.expander.SummaryExpanderWrapper;

/* renamed from: awgp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awgp {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public static InfoMessageView m79905a(bjwk bjwk, bmnr bmnr, LayoutInflater layoutInflater, bjxu bjxu, ViewGroup viewGroup, int i, int i2, int i3) {
        InfoMessageView infoMessageView = (InfoMessageView) layoutInflater.inflate((int) C0126R.C0128layout.view_info_message_text, viewGroup, false);
        infoMessageView.setId(i3);
        infoMessageView.mo72003a(bmnr);
        infoMessageView.f152084h = bjxu;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) infoMessageView.getLayoutParams();
        int a = C1260oz.m19820a(marginLayoutParams);
        int b = C1260oz.m19822b(marginLayoutParams);
        C1260oz.m19821a(marginLayoutParams, a + i);
        C1260oz.m19823b(marginLayoutParams, b + i2);
        viewGroup.addView(infoMessageView, marginLayoutParams);
        bjwl.m104784a(infoMessageView, bmnr.f130156b, bjwk);
        return infoMessageView;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public static SummaryExpanderWrapper m79906a(bmlv bmlv, ViewGroup viewGroup, bkdw bkdw, bkfk bkfk, boolean z) {
        SummaryExpanderWrapper summaryExpanderWrapper = (SummaryExpanderWrapper) LayoutInflater.from(viewGroup.getContext()).inflate((int) C0126R.C0128layout.wallet_view_field_group, viewGroup, false);
        m79907a(summaryExpanderWrapper, bmlv, bkdw, (int) C0126R.C0129id.icon, (int) C0126R.C0129id.summary_text, (int) C0126R.C0129id.container, (int) C0126R.C0129id.summary_title, bkfk);
        if (!z) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) summaryExpanderWrapper.getLayoutParams();
            C1260oz.m19821a(marginLayoutParams, 0);
            C1260oz.m19823b(marginLayoutParams, 0);
        }
        return summaryExpanderWrapper;
    }

    /* renamed from: a */
    public static void m79907a(SummaryExpanderWrapper summaryExpanderWrapper, bmlv bmlv, bkdw bkdw, int i, int i2, int i3, int i4, bkfk bkfk) {
        bmno bmno = bmlv.f129971g;
        if (bmno == null) {
            bmno = bmno.f130138m;
        }
        if (bjvn.m104718a(bmno.f130142c)) {
            ImageView imageView = (ImageView) summaryExpanderWrapper.findViewById(i);
            Context context = summaryExpanderWrapper.getContext();
            bmno bmno2 = bmlv.f129971g;
            if (bmno2 == null) {
                bmno2 = bmno.f130138m;
            }
            imageView.setImageResource(bkfr.m105586b(context, bmno2.f130142c));
            summaryExpanderWrapper.mo72167d(i);
            ((SummaryTextLayout) summaryExpanderWrapper.findViewById(i2)).mo72106a(bmlv.f129970f);
            summaryExpanderWrapper.mo72165b(i2);
            bkip bkip = summaryExpanderWrapper.f152305a;
            int a = bmlu.m108157a(bmlv.f129968d);
            boolean z = true;
            if (a == 0) {
                a = 1;
            }
            if (a != 7) {
                z = false;
            }
            bkip.mo66034a(z);
            summaryExpanderWrapper.mo72166c(i4);
            summaryExpanderWrapper.f152311g = bkfk;
            if (!((Boolean) awim.f94475a.mo58455c()).booleanValue()) {
                bxvd bxvd = (bxvd) bmlv.mo74142c(5);
                bxvd.mo73625a((bxvk) bmlv);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bmlv bmlv2 = (bmlv) bxvd.f164949b;
                bmlv bmlv3 = bmlv.f129963p;
                bmlv2.f129976l = 2;
                bmlv2.f129965a |= 2048;
                bmlv = (bmlv) bxvd.mo74062i();
            }
            summaryExpanderWrapper.mo72164a(bmlv);
            summaryExpanderWrapper.f152316l = bkdw;
            summaryExpanderWrapper.f152309e = (ViewGroup) summaryExpanderWrapper.findViewById(i3);
            return;
        }
        throw new IllegalArgumentException("Field group icons must be embedded images.");
    }
}
