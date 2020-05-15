package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.document.DownloadedDocument;

/* renamed from: bkie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkie extends bkbq implements View.OnClickListener {

    /* renamed from: a */
    public bkid f124269a;

    /* renamed from: b */
    public DownloadedDocument f124270b;

    /* renamed from: d */
    WebView f124271d;

    /* renamed from: e */
    View f124272e;

    /* renamed from: f */
    ImageButton f124273f;

    /* renamed from: g */
    TextView f124274g;

    /* renamed from: h */
    View f124275h;

    /* renamed from: a */
    public static bkie m105766a(DownloadedDocument downloadedDocument, String str, int i) {
        Bundle a = bkbq.m105268a(i);
        a.putParcelable("document", downloadedDocument);
        a.putString("failedToLoadText", str);
        bkie bkie = new bkie();
        bkie.setArguments(a);
        return bkie;
    }

    /* renamed from: b */
    private final void m105767b(DownloadedDocument downloadedDocument) {
        this.f124275h.setVisibility(8);
        if (downloadedDocument.mo72149a()) {
            this.f124272e.setVisibility(0);
            this.f124271d.setVisibility(8);
            if (!TextUtils.isEmpty(this.f124274g.getText())) {
                this.f124274g.post(new bkic(this));
                return;
            }
            return;
        }
        this.f124272e.setVisibility(8);
        this.f124271d.setVisibility(0);
        this.f124271d.loadDataWithBaseURL(null, downloadedDocument.f152299a, downloadedDocument.f152300b, null, null);
    }

    public void onClick(View view) {
        bkid bkid = this.f124269a;
        if (bkid != null) {
            bkid.mo51927n();
        }
        this.f124275h.setVisibility(0);
        this.f124272e.setVisibility(8);
        this.f124271d.setVisibility(8);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final Dialog mo9306a() {
        View inflate = mo65816c().inflate((int) C0126R.C0128layout.view_document_dialog, (ViewGroup) null, false);
        this.f124270b = (DownloadedDocument) getArguments().getParcelable("document");
        this.f124272e = inflate.findViewById(C0126R.C0129id.error_overlay);
        this.f124275h = ((ViewStub) inflate.findViewById(C0126R.C0129id.progress_spinner)).inflate();
        ImageButton imageButton = (ImageButton) inflate.findViewById(C0126R.C0129id.refresh_button);
        this.f124273f = imageButton;
        imageButton.setOnClickListener(this);
        this.f124271d = (WebView) inflate.findViewById(C0126R.C0129id.mandate_web_view);
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.error_msg);
        this.f124274g = textView;
        textView.setText(getArguments().getString("failedToLoadText"));
        WebSettings settings = this.f124271d.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        DownloadedDocument downloadedDocument = this.f124270b;
        if (downloadedDocument != null) {
            m105767b(downloadedDocument);
        } else {
            this.f124275h.setVisibility(0);
            this.f124272e.setVisibility(8);
            this.f124271d.setVisibility(8);
        }
        bkbj bkbj = new bkbj(mo65815b());
        bkbj.mo65783b(inflate);
        bkbj.mo65782b((int) C0126R.string.wallet_uic_close, (DialogInterface.OnClickListener) null);
        return bkbj.mo65776a();
    }

    /* renamed from: a */
    public final void mo66015a(DownloadedDocument downloadedDocument) {
        getArguments().putParcelable("document", downloadedDocument);
        this.f124270b = downloadedDocument;
        if (this.f124275h != null) {
            m105767b(downloadedDocument);
        }
    }
}
