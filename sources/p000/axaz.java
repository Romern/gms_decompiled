package p000;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.common.FormEditText;
import com.google.android.wallet.p097ui.expander.SummaryExpanderWrapper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: axaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axaz extends bkdx {

    /* renamed from: a */
    FormEditText f95590a;

    /* renamed from: b */
    View f95591b;

    /* renamed from: c */
    View f95592c;

    /* renamed from: d */
    final ArrayList f95593d = new ArrayList(1);

    /* renamed from: e */
    private final bjes f95594e = new bjes(5);

    /* renamed from: f */
    private final bkip f95595f = new bkip();

    /* renamed from: g */
    private SummaryExpanderWrapper f95596g;

    /* renamed from: h */
    private final ArrayList f95597h = new ArrayList(1);

    /* renamed from: i */
    private String f95598i;

    /* renamed from: j */
    private long f95599j;

    /* renamed from: k */
    private int f95600k;

    /* renamed from: l */
    private String f95601l;

    /* renamed from: a */
    public static axaz m82058a(bxxc bxxc, String str, long j, int i, String str2, int i2, LogContext logContext) {
        String str3;
        axaz axaz = new axaz();
        Bundle a = bkdx.m105383a(i2, bxxc, logContext);
        a.putString("formId", str);
        a.putLong("formUiReference", j);
        a.putInt("fieldId", i);
        a.putString("initialValue", str2);
        if (bxxc != null) {
            if (bxxc instanceof bmie) {
                str3 = "protoLiteCreditCardUpdateForm";
            } else if (bxxc instanceof bmhy) {
                str3 = "protoLiteCreditCardForm";
            } else {
                throw new IllegalArgumentException("CardHolderNameFragment should be called only by CreditCardUpdateForm or CreditCardForm");
            }
            a.putString("protoLiteType", str3);
        }
        axaz.setArguments(a);
        return axaz;
    }

    /* renamed from: T */
    public final ArrayList mo52820T() {
        return this.f95597h;
    }

    /* renamed from: W */
    public final long mo52837W() {
        return 0;
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        return mo52806b((List) null);
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f95595f;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return null;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return this.f95593d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bX */
    public final long mo52966bX() {
        return this.f95599j;
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f95594e;
    }

    /* renamed from: e */
    public final void mo52834e(int i) {
        View view = this.f95592c;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        View view = this.f95592c;
        if (view != null) {
            boolean z = this.f124195aJ;
            view.setEnabled(z);
            this.f95596g.setEnabled(z);
        }
    }

    /* renamed from: m */
    public final String mo52967m() {
        return this.f95590a.getText().toString();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f95598i = arguments.getString("formId");
        this.f95599j = arguments.getLong("formUiReference");
        this.f95600k = arguments.getInt("fieldId");
        this.f95601l = arguments.getString("initialValue");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        if (getArguments().getString("protoLiteType").equals("protoLiteCreditCardUpdateForm")) {
            return (bxxk) bmie.f129546r.mo74142c(7);
        }
        return (bxxk) bmhy.f129503u.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.String, int):java.lang.String
      com.google.android.wallet.ui.common.FormEditText.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.FormEditText.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(bmnn, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(int, int):boolean
      bkdf.a(java.lang.CharSequence, boolean):void
      bjwm.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_card_holder_name, viewGroup, false);
        this.f95591b = inflate;
        SummaryExpanderWrapper summaryExpanderWrapper = (SummaryExpanderWrapper) inflate.findViewById(C0126R.C0129id.credit_card_name_wrapper);
        this.f95596g = summaryExpanderWrapper;
        summaryExpanderWrapper.mo72161a(this, C0126R.C0129id.name_summary_image, C0126R.C0129id.card_holder_name_summary);
        this.f95592c = this.f95591b.findViewById(C0126R.C0129id.card_holder_name_container);
        FormEditText formEditText = (FormEditText) this.f95591b.findViewById(C0126R.C0129id.card_holder_name);
        this.f95590a = formEditText;
        formEditText.mo71919a(mo65980at());
        this.f95590a.mo71914a(mo65985l(5));
        this.f95593d.add(new bkde(0, this.f95590a, this.f95601l));
        if (bundle == null && !TextUtils.isEmpty(this.f95601l)) {
            this.f95590a.mo71832a((CharSequence) this.f95601l, 6);
        }
        this.f95597h.add(this.f95592c);
        return this.f95591b;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.String, int):java.lang.String
      com.google.android.wallet.ui.common.FormEditText.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.FormEditText.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(bmnn, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(int, int):boolean
      bkdf.a(java.lang.CharSequence, boolean):void
      bjwm.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo52965a(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            this.f95590a.mo71832a((CharSequence) str, i);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.String, int):java.lang.String
      com.google.android.wallet.ui.common.FormEditText.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.FormEditText.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(bmnn, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void
      com.google.android.wallet.ui.common.FormEditText.a(int, int):boolean
      bjwm.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void */
    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        bmaf bmaf = bmas.f128496a;
        if (bmaf == null) {
            bmaf = bmaf.f128436d;
        }
        if (!bmaf.f128438a.equals(this.f95598i)) {
            return false;
        }
        bmaf bmaf2 = bmas.f128496a;
        if (bmaf2 == null) {
            bmaf2 = bmaf.f128436d;
        }
        if (bmaf2.f128439b != this.f95600k) {
            return false;
        }
        this.f95590a.mo65794a((CharSequence) bmas.f128497b, true);
        return true;
    }
}
