package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.account.BaseAccountChipAccountPickerChimeraActivity$2;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;

/* renamed from: rhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class rhb extends rhc {

    /* renamed from: b */
    public static final sek f42954b = new sek("CommonAccount", "BaseAccountChipAccountPicker");

    /* renamed from: l */
    private static final int f42955l = 2;

    /* renamed from: c */
    public rha f42956c;

    /* renamed from: d */
    public int f42957d = 2;

    /* renamed from: j */
    private qws f42958j;

    /* renamed from: k */
    private String f42959k;

    /* renamed from: a */
    private static void m33591a(Context context, SpannableStringBuilder spannableStringBuilder, String str, String str2, Resources.Theme theme, int i) {
        if (TextUtils.isEmpty(str2)) {
            spannableStringBuilder.append((CharSequence) str);
            return;
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        if (!TextUtils.isEmpty(str2)) {
            spannableStringBuilder.setSpan(new BaseAccountChipAccountPickerChimeraActivity$2(str2, theme, i, context), length, spannableStringBuilder.length(), 33);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo17696e() {
        setContentView((int) C0126R.C0128layout.common_account_chip_account_picker);
        this.f42967i = (ListView) findViewById(16908298);
        if (this.f42966h.mo66813a() && ((acyq) this.f42966h.mo66814b()).mo33248c()) {
            bmxv d = ((acyq) this.f42966h.mo66814b()).mo33249d();
            bmxv e = ((acyq) this.f42966h.mo66814b()).mo33250e();
            TextView textView = (TextView) findViewById(C0126R.C0129id.consent_text);
            if (textView != null) {
                findViewById(C0126R.C0129id.consent_divider).setVisibility(0);
                textView.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(C0126R.string.common_account_consent_text_permissions, new Object[]{mo24628l()}));
                if (d.mo66813a() || e.mo66813a()) {
                    textView.setMovementMethod(new LinkMovementMethod());
                    String lowerCase = getString(C0126R.string.common_privacy_policy).toLowerCase();
                    String lowerCase2 = getString(C0126R.string.common_terms_of_service).toLowerCase();
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    m33591a(this, spannableStringBuilder2, lowerCase, (String) d.mo66815c(), getTheme(), getThemeResId());
                    m33591a(this, spannableStringBuilder3, lowerCase2, (String) e.mo66815c(), getTheme(), getThemeResId());
                    spannableStringBuilder.append((CharSequence) " ");
                    spannableStringBuilder.append(TextUtils.expandTemplate(getString(C0126R.string.common_account_consent_text_agreement), spannableStringBuilder2, spannableStringBuilder3));
                }
                textView.setText(spannableStringBuilder);
            }
        }
        this.f42967i.setAdapter((ListAdapter) this.f42956c);
        this.f42967i.setChoiceMode(1);
        this.f42967i.setItemsCanFocus(false);
        this.f42967i.setOnItemClickListener(new rgz(this));
        this.f42967i.scrollBy(0, -1);
        this.f42967i.scrollBy(0, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final ArrayList mo24625g() {
        ArrayList g = super.mo24625g();
        return (g.isEmpty() || TextUtils.isEmpty(this.f42959k)) ? g : soz.m35785a(g, this.f42959k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract rha mo17693h();

    public final void onBackPressed() {
        this.f42957d = 2;
        super.onBackPressed();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f42958j = new qws(getApplicationContext(), "ANDROID_AUTH", null);
        this.f42959k = getIntent().getStringExtra("hostedDomainFilter");
        this.f42956c = mo17693h();
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        if (isFinishing()) {
            bxvd da = bocn.f132573g.mo74144da();
            int i = this.f42957d;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bocn bocn = (bocn) da.f164949b;
            int i2 = i - 1;
            if (i != 0) {
                bocn.f132576b = i2;
                bocn.f132575a |= 1;
                int size = mo24625g().size();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bocn bocn2 = (bocn) da.f164949b;
                int i3 = bocn2.f132575a | 2;
                bocn2.f132575a = i3;
                bocn2.f132577c = size;
                int i4 = this.f42963e;
                int i5 = i3 | 4;
                bocn2.f132575a = i5;
                bocn2.f132578d = i4;
                String str = this.f42965g;
                if (str != null) {
                    str.getClass();
                    bocn2.f132575a = i5 | 8;
                    bocn2.f132579e = str;
                }
                bxvd da2 = boct.f132600I.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                boct boct = (boct) da2.f164949b;
                boct.f132612c = 17;
                boct.f132610a |= 1;
                int i6 = f42955l;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bocn bocn3 = (bocn) da.f164949b;
                int i7 = i6 - 1;
                if (i6 != 0) {
                    bocn3.f132580f = i7;
                    bocn3.f132575a |= 16;
                    bocn bocn4 = (bocn) da.mo74062i();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    boct boct2 = (boct) da2.f164949b;
                    bocn4.getClass();
                    boct2.f132628s = bocn4;
                    boct2.f132610a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                    this.f42958j.mo24333a((boct) da2.mo74062i()).mo24327b();
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        super.onDestroy();
    }

    public final void onStart() {
        super.onStart();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo24624a(Bundle bundle) {
        bundle.putBoolean("pickedFromAccountChips", true);
    }
}
