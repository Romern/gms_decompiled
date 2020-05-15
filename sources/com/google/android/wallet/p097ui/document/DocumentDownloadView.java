package com.google.android.wallet.p097ui.document;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.android.volley.VolleyError;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.BlurredWebView;
import com.google.android.wallet.p097ui.common.InfoMessageView;

/* renamed from: com.google.android.wallet.ui.document.DocumentDownloadView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DocumentDownloadView extends LinearLayout implements View.OnClickListener, bkia, bkdf, bkid {

    /* renamed from: a */
    public bmev f152286a;

    /* renamed from: b */
    public bkib f152287b;

    /* renamed from: c */
    public bkht f152288c;

    /* renamed from: d */
    public bkhw f152289d;

    /* renamed from: e */
    public boolean f152290e;

    /* renamed from: f */
    public boolean f152291f;

    /* renamed from: g */
    public bmnr f152292g;

    /* renamed from: h */
    public String f152293h;

    /* renamed from: i */
    public Account f152294i;

    /* renamed from: j */
    public bwgw f152295j;

    /* renamed from: k */
    public BlurredWebView f152296k;

    /* renamed from: l */
    public InfoMessageView f152297l;

    /* renamed from: m */
    public Button f152298m;

    public DocumentDownloadView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final void m118812a(bmnr bmnr) {
        InfoMessageView infoMessageView = this.f152297l;
        if (infoMessageView != null) {
            infoMessageView.mo72003a(bmnr);
            this.f152297l.setVisibility(bmnr == null ? 8 : 0);
            mo72143b();
        }
    }

    /* renamed from: U */
    public final bkdw mo52821U() {
        return null;
    }

    /* renamed from: a */
    public final String mo52823a(String str) {
        return null;
    }

    /* renamed from: a */
    public final boolean mo65795a(Object obj) {
        return true;
    }

    /* renamed from: b */
    public final void mo72143b() {
        if (this.f152297l.f152083g != null) {
            this.f152298m.setTextColor(bkfr.m105587b(getResources().getColor(C0126R.color.wallet_uic_error_text_color_light)));
        } else {
            this.f152298m.setTextColor(bkfr.m105600c(getContext()));
        }
    }

    /* renamed from: cL */
    public final boolean mo65798cL() {
        return this.f152291f || this.f152290e;
    }

    /* renamed from: cM */
    public final boolean mo65799cM() {
        boolean cL = mo65798cL();
        if (!cL) {
            m118812a(this.f152292g);
        } else {
            m118812a((bmnr) null);
        }
        return cL;
    }

    /* renamed from: cN */
    public final boolean mo65800cN() {
        if (hasFocus() || !requestFocus()) {
            bkfr.m105602c(this);
            if (getError() != null) {
                bkfr.m105567a(this, getResources().getString(C0126R.string.wallet_uic_accessibility_event_form_field_error, this.f152298m.getText(), getError()));
            }
        }
        return hasFocus();
    }

    public final CharSequence getError() {
        return this.f152297l.mo72007c();
    }

    /* renamed from: n */
    public final void mo51927n() {
        bkht bkht = this.f152288c;
        if (bkht != null && bkht.f124247e != null) {
            bkib bkib = this.f152287b;
            Context context = getContext();
            bmev bmev = this.f152286a;
            this.f152288c = bkib.mo66010a(context, bmev.f129040b, bmev.f129041c, this, this.f152294i, this.f152295j);
        }
    }

    public void onClick(View view) {
        bkht bkht;
        if (this.f152289d != null && (bkht = this.f152288c) != null) {
            DownloadedDocument downloadedDocument = bkht.f124247e;
            if (downloadedDocument != null && downloadedDocument.mo72149a()) {
                mo51927n();
                this.f152289d.mo66008a(null);
                return;
            }
            this.f152289d.mo66008a(downloadedDocument);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        bkht bkht;
        bkib bkib = this.f152287b;
        if (!(bkib == null || (bkht = this.f152288c) == null)) {
            bkib.mo66011a(bkht);
            this.f152288c = null;
        }
        super.onDetachedFromWindow();
    }

    public final void onErrorResponse(VolleyError volleyError) {
        DownloadedDocument downloadedDocument = new DownloadedDocument("", "");
        this.f152288c.f124247e = downloadedDocument;
        m118813a(downloadedDocument);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superInstance"));
        this.f152290e = bundle.getBoolean("viewedDocument");
        m118812a((bmnr) bjvp.m104730a(bundle, "errorInfoMessage", (bxxk) bmnr.f130153o.mo74142c(7)));
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superInstance", super.onSaveInstanceState());
        bundle.putBoolean("viewedDocument", this.f152290e);
        bjvp.m104736a(bundle, "errorInfoMessage", this.f152297l.f152083g);
        return bundle;
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        Button button = this.f152298m;
        if (button != null) {
            button.setEnabled(z);
        }
        BlurredWebView blurredWebView = this.f152296k;
        if (blurredWebView != null) {
            blurredWebView.setEnabled(z);
            this.f152296k.setAlpha(mo72142a());
        }
    }

    public DocumentDownloadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private final void m118813a(DownloadedDocument downloadedDocument) {
        bkie bkie;
        if (!downloadedDocument.mo72149a()) {
            this.f152296k.loadDataWithBaseURL(null, downloadedDocument.f152299a, downloadedDocument.f152300b, null, null);
        }
        bkhw bkhw = this.f152289d;
        if (bkhw != null && (bkie = ((bkiu) bkhw).f124322a) != null) {
            bkie.mo66015a(downloadedDocument);
        }
    }

    public DocumentDownloadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DocumentDownloadView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    public final float mo72142a() {
        return isEnabled() ? 0.5f : 0.2f;
    }

    /* renamed from: a */
    public final void mo52763a(bkht bkht) {
        m118813a(bkht.f124247e);
    }

    /* renamed from: a */
    public final void mo65794a(CharSequence charSequence, boolean z) {
        if (TextUtils.isEmpty(charSequence)) {
            m118812a((bmnr) null);
            return;
        }
        bxvd da = bmnr.f130153o.mo74144da();
        String charSequence2 = charSequence.toString();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmnr bmnr = (bmnr) da.f164949b;
        charSequence2.getClass();
        int i = bmnr.f130155a | 4;
        bmnr.f130155a = i;
        bmnr.f130159e = charSequence2;
        bmnr.f130162h = 4;
        bmnr.f130155a = i | 32;
        m118812a((bmnr) da.mo74062i());
    }
}
