package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.android.volley.toolbox.ImageLoader;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.wallet.p097ui.common.BlurredWebView;
import com.google.android.wallet.p097ui.common.FormHeaderView;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import com.google.android.wallet.p097ui.common.LegalMessageView;
import com.google.android.wallet.p097ui.document.DocumentDownloadView;
import com.google.android.wallet.p097ui.document.DownloadedDocument;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bkiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkiu extends bkdx implements bkhw {

    /* renamed from: f */
    private static final bjes f124321f = new bjes(24);

    /* renamed from: a */
    public bkie f124322a;

    /* renamed from: b */
    FormHeaderView f124323b;

    /* renamed from: c */
    public LegalMessageView f124324c;

    /* renamed from: d */
    ViewGroup f124325d;

    /* renamed from: e */
    DocumentDownloadView f124326e;

    /* renamed from: g */
    private final bkip f124327g = new bkip();

    /* renamed from: h */
    private View f124328h;

    /* renamed from: i */
    private final ArrayList f124329i = new ArrayList();

    /* renamed from: j */
    private final ArrayList f124330j = new ArrayList();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.fragment_mandate, viewGroup, false);
        this.f124328h = inflate;
        FormHeaderView formHeaderView = (FormHeaderView) inflate.findViewById(C0126R.C0129id.mandate_form_header);
        this.f124323b = formHeaderView;
        bmdn bmdn = ((bmgv) this.f124069w).f129342b;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        formHeaderView.mo71963a(bmdn, layoutInflater, mo65982av(), this.f124329i);
        this.f124325d = (ViewGroup) this.f124328h.findViewById(C0126R.C0129id.dynamic_mandate_info_message_list);
        ImageLoader b = bjvn.m104721b(getActivity().getApplicationContext());
        Boolean bool = (Boolean) bjwd.f123461a.mo54082a();
        bxwc bxwc = ((bmgv) this.f124069w).f129345e;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            this.f124325d.addView(bkfr.m105549a(layoutInflater, (bmnr) bxwc.get(i), b, this.f124325d, mo65818aq(), bool.booleanValue(), this));
        }
        this.f124326e = (DocumentDownloadView) this.f124328h.findViewById(C0126R.C0129id.document_download);
        bmgv bmgv = (bmgv) this.f124069w;
        if ((bmgv.f129341a & 2) != 0) {
            DocumentDownloadView documentDownloadView = this.f124326e;
            documentDownloadView.f152289d = this;
            bmev bmev = bmgv.f129343c;
            if (bmev == null) {
                bmev = bmev.f129037e;
            }
            bmgv bmgv2 = (bmgv) this.f124069w;
            String str = bmgv2.f129346f;
            bmnr bmnr = bmgv2.f129347g;
            if (bmnr == null) {
                bmnr = bmnr.f130153o;
            }
            boolean z = ((bmgv) this.f124069w).f129348h;
            bkib c = bjvn.m104722c(getActivity().getApplicationContext());
            Account cn = mo51878cn();
            bwgw cm = mo51877cm();
            documentDownloadView.f152286a = bmev;
            documentDownloadView.f152293h = str;
            documentDownloadView.f152292g = bmnr;
            documentDownloadView.f152291f = z;
            documentDownloadView.f152287b = c;
            documentDownloadView.f152294i = cn;
            documentDownloadView.f152295j = cm;
            documentDownloadView.f152296k = (BlurredWebView) documentDownloadView.findViewById(C0126R.C0129id.mandate_web_view);
            documentDownloadView.f152296k.getSettings().setLoadWithOverviewMode(true);
            documentDownloadView.f152296k.getSettings().setUseWideViewPort(true);
            documentDownloadView.f152296k.setHorizontalScrollBarEnabled(false);
            documentDownloadView.f152296k.setVerticalScrollBarEnabled(false);
            documentDownloadView.f152296k.setAlpha(documentDownloadView.mo72142a());
            documentDownloadView.f152298m = (Button) documentDownloadView.findViewById(C0126R.C0129id.show_mandate_button);
            documentDownloadView.f152298m.setOnClickListener(documentDownloadView);
            documentDownloadView.f152298m.setText(documentDownloadView.f152293h);
            documentDownloadView.f152297l = (InfoMessageView) documentDownloadView.findViewById(C0126R.C0129id.error_text);
            documentDownloadView.mo72143b();
            bkib bkib = documentDownloadView.f152287b;
            Context context = documentDownloadView.getContext();
            bmev bmev2 = documentDownloadView.f152286a;
            documentDownloadView.f152288c = bkib.mo66010a(context, bmev2.f129040b, bmev2.f129041c, documentDownloadView, documentDownloadView.f152294i, cm);
            ArrayList arrayList = this.f124330j;
            bmev bmev3 = ((bmgv) this.f124069w).f129343c;
            if (bmev3 == null) {
                bmev3 = bmev.f129037e;
            }
            arrayList.add(new bkde(bmev3.f129039a, this.f124326e, null));
            this.f124326e.setVisibility(0);
        } else {
            this.f124326e.setVisibility(8);
        }
        this.f124324c = (LegalMessageView) this.f124328h.findViewById(C0126R.C0129id.mandate_legal_message);
        if ((((bmgv) this.f124069w).f129341a & 4) != 0) {
            this.f124324c.setVisibility(0);
            LegalMessageView legalMessageView = this.f124324c;
            bmjf bmjf = ((bmgv) this.f124069w).f129344d;
            if (bmjf == null) {
                bmjf = bmjf.f129685i;
            }
            legalMessageView.mo72030a(bmjf);
            LegalMessageView legalMessageView2 = this.f124324c;
            legalMessageView2.f123948a = this;
            legalMessageView2.mo65792a(mo65982av());
            this.f124324c.mo65790a(layoutInflater.getContext().getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_page_left_column_width));
            ArrayList arrayList2 = this.f124330j;
            bmjf bmjf2 = ((bmgv) this.f124069w).f129344d;
            if (bmjf2 == null) {
                bmjf2 = bmjf.f129685i;
            }
            arrayList2.add(new bkde(bmjf2.f129688b, this.f124324c, null));
            LegalMessageView legalMessageView3 = this.f124324c;
            bmjf bmjf3 = ((bmgv) this.f124069w).f129344d;
            if (bmjf3 == null) {
                bmjf3 = bmjf.f129685i;
            }
            bjwl.m104784a(legalMessageView3, bmjf3.f129688b, this.f124196aK);
        } else {
            this.f124324c.setVisibility(8);
        }
        Fragment findFragmentByTag = getFragmentManager().findFragmentByTag("mandateDialogFragment");
        if (findFragmentByTag instanceof bkie) {
            bkie bkie = (bkie) findFragmentByTag;
            this.f124322a = bkie;
            bkie.f123958c = this;
            bkie.f124269a = this.f124326e;
        }
        return this.f124328h;
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        return false;
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        return mo52806b((List) null);
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f124327g;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return this.f124329i;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return this.f124330j;
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return f124321f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        if (this.f124328h != null) {
            boolean z = this.f124195aJ;
            this.f124323b.setEnabled(z);
            this.f124324c.setEnabled(z);
            this.f124326e.setEnabled(z);
            int childCount = this.f124325d.getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f124325d.getChildAt(i).setEnabled(z);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmgv.f129339j.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        mo65884y();
        bmdn bmdn = ((bmgv) this.f124069w).f129342b;
        return bmdn == null ? bmdn.f128831k : bmdn;
    }

    /* renamed from: a */
    public final void mo51905a(int i, Bundle bundle) {
        bkie bkie;
        DownloadedDocument downloadedDocument;
        super.mo51905a(i, bundle);
        if (i == 16 && (bkie = this.f124322a) != null && (downloadedDocument = bkie.f124270b) != null && !downloadedDocument.mo72149a()) {
            DocumentDownloadView documentDownloadView = this.f124326e;
            documentDownloadView.f152290e = true;
            documentDownloadView.mo65794a(null, false);
        }
    }

    /* renamed from: a */
    public final void mo66008a(DownloadedDocument downloadedDocument) {
        if (getFragmentManager().findFragmentByTag("mandateDialogFragment") == null) {
            bkie a = bkie.m105766a(downloadedDocument, ((bmgv) this.f124069w).f129349i, this.f123961aF);
            this.f124322a = a;
            a.f123958c = this;
            a.f124269a = this.f124326e;
            a.setTargetFragment(this, -1);
            this.f124322a.show(getFragmentManager(), "mandateDialogFragment");
        }
    }
}
