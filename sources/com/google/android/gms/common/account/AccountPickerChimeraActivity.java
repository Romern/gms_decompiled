package com.google.android.gms.common.account;

import android.accounts.Account;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountPickerChimeraActivity extends adcc {

    /* renamed from: b */
    public static final sek f30075b = new sek("CommonAccount", "AccountPicker");

    /* renamed from: c */
    public String f30076c;

    /* renamed from: d */
    public rhz f30077d;

    /* renamed from: e */
    public String f30078e;

    /* renamed from: f */
    public Account f30079f;

    /* renamed from: g */
    public bdej f30080g;

    /* renamed from: h */
    public TextView f30081h;

    /* renamed from: i */
    public View f30082i;

    /* renamed from: j */
    public ria f30083j;

    /* renamed from: k */
    public aczl f30084k;

    /* renamed from: l */
    public int f30085l = -1;

    /* renamed from: m */
    public boolean f30086m = true;

    /* renamed from: n */
    public boolean f30087n;

    /* renamed from: p */
    private TextView f30088p;

    /* renamed from: q */
    private TextView f30089q;

    /* renamed from: r */
    private qws f30090r;

    /* renamed from: a */
    private static String m22468a(String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse(str)).toUri(1);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f30084k.mo33274a(i, i2, intent);
    }

    public final void onBackPressed() {
        mo17689a(2);
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        TextView textView;
        ria ria = new ria(getIntent(), 1);
        this.f30083j = ria;
        setTheme(ria.f43022i);
        this.f30079f = this.f30083j.f43018e;
        super.onCreate(bundle);
        String str = null;
        setTitle((CharSequence) null);
        this.f30090r = new qws(getApplicationContext(), "ANDROID_AUTH", null);
        ria ria2 = this.f30083j;
        String a = spn.m35852a((Activity) this);
        if (a == null) {
            f30075b.mo25416d("Unable to get caller identity", new Object[0]);
            a = null;
        } else if (!adbx.m50147a(this, a)) {
            f30075b.mo25416d("App was not signed by Google.", new Object[0]);
            a = null;
        } else if (bmwb.m108443a(a, getPackageName())) {
            a = ria2.f43020g;
        }
        if (a != null) {
            this.f30078e = a;
            this.f30087n = rfz.m33557a(this).mo24610b(this.f30078e);
            this.f30076c = rib.m33627b(getApplication(), this.f30078e);
            if (this.f30084k == null) {
                aczj aczj = new aczj(getApplicationContext(), this.f30078e);
                ria ria3 = this.f30083j;
                aczj.f61144f = ria3.f43017d;
                aczj.mo33270a(ria3.f43014a);
                ria ria4 = this.f30083j;
                aczj.f61141c = ria4.f43015b;
                aczj.f61143e = ria4.f43026m;
                aczj.f61139a = true;
                aczj.f61140b = true;
                aczj.f61142d = ria4.f43025l;
                this.f30084k = (aczl) adcj.m50162a(this, aczj).mo3444a(aczl.class);
            }
            this.f30084k.f61157i.mo2445a(this, new rgo(this));
            this.f30084k.f61158j.mo2445a(this, new rgp(this));
            ria ria5 = this.f30083j;
            if (ria5.f43027n != 2) {
                int intExtra = ria5.f43021h.getIntExtra("overrideCustomTheme", 0);
                i = intExtra != 1 ? intExtra != 2 ? 0 : ria5.f43024k.mo66813a() ? cglu.m146177b() ? C0126R.C0128layout.f7380x23e8bc0f : C0126R.C0128layout.common_account_account_picker_first_party : C0126R.C0128layout.common_account_account_picker_generic : C0126R.C0128layout.common_account_account_picker_game;
            } else {
                i = C0126R.C0128layout.common_account_wearable_picker;
            }
            setContentView(i);
            if (!cglu.m146177b()) {
                this.f30081h = (TextView) findViewById(C0126R.C0129id.main_title);
                TextView textView2 = (TextView) findViewById(C0126R.C0129id.subtitle);
                ImageView imageView = (ImageView) findViewById(C0126R.C0129id.app_icon);
                RecyclerView recyclerView = (RecyclerView) findViewById(C0126R.C0129id.list);
                this.f30088p = (TextView) findViewById(C0126R.C0129id.consent_text);
                rhz rhz = new rhz(this.f30084k, -1, -1);
                this.f30077d = rhz;
                recyclerView.setAdapter(rhz);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(new aah());
                int dimensionPixelSize = getResources().getDimensionPixelSize(ric.m33628a(this, C0126R.attr.common_account_row_item_horizontal_padding, C0126R.dimen.common_account_row_item_horizontal_padding));
                if (this.f30081h == null) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                adcl.m50164a(this, recyclerView, i2, C0126R.C0127drawable.common_account_list_divider, dimensionPixelSize, dimensionPixelSize);
                if (this.f30083j.f43024k.mo66813a() && (textView = this.f30081h) != null) {
                    textView.setText((CharSequence) this.f30083j.f43024k.mo66814b());
                }
                ria ria6 = this.f30083j;
                if (ria6.f43023j) {
                    m22470a(ria6.mo24641b(), this.f30083j.mo24640a());
                }
                m22469a(textView2, imageView, recyclerView);
                return;
            }
            this.f30081h = (TextView) findViewById(C0126R.C0129id.main_title);
            this.f30082i = findViewById(C0126R.C0129id.selected_account_container);
            TextView textView3 = (TextView) findViewById(C0126R.C0129id.selected_account_email);
            TextView textView4 = (TextView) findViewById(C0126R.C0129id.subtitle);
            ImageView imageView2 = (ImageView) findViewById(C0126R.C0129id.app_icon);
            RecyclerView recyclerView2 = (RecyclerView) findViewById(C0126R.C0129id.list);
            this.f30088p = (TextView) findViewById(C0126R.C0129id.consent_text);
            this.f30089q = (TextView) findViewById(C0126R.C0129id.consent_text1p);
            rhz rhz2 = new rhz(this.f30084k, C0126R.C0128layout.common_account_manage_accounts_chip_view, C0126R.C0128layout.common_account_selected_account);
            this.f30077d = rhz2;
            recyclerView2.setAdapter(rhz2);
            recyclerView2.setHasFixedSize(true);
            recyclerView2.setLayoutManager(new aah());
            TextView textView5 = this.f30081h;
            if (textView5 != null && this.f30087n && this.f30079f == null) {
                textView5.setVisibility(0);
            }
            if (!(this.f30082i == null || this.f30079f == null || textView3 == null || !this.f30087n)) {
                findViewById(C0126R.C0129id.selected_account_container).setVisibility(0);
                Account account = this.f30079f;
                if (account != null) {
                    str = account.name;
                }
                textView3.setText(str);
            }
            if (this.f30087n) {
                m22470a(bmxv.m108566b(cglr.f187296a.mo6606a().mo84106a()), bmxv.m108566b(cglr.f187296a.mo6606a().mo84107b()));
            } else {
                m22470a(this.f30083j.mo24641b(), this.f30083j.mo24640a());
            }
            m22469a(textView4, imageView2, recyclerView2);
            return;
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        if (isFinishing() && this.f30086m) {
            mo17689a(2);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.f30084k.mo33276b();
    }

    /* renamed from: a */
    private final void m22469a(TextView textView, ImageView imageView, RecyclerView recyclerView) {
        if (imageView != null) {
            Drawable drawable = (Drawable) rib.m33626a(getApplication(), this.f30078e).mo66815c();
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        if (textView != null) {
            String string = getString(C0126R.string.common_account_account_chip_subtitle, new Object[]{this.f30076c});
            if (TextUtils.isEmpty(string)) {
                textView.setVisibility(8);
            } else {
                textView.setText(string);
                textView.setVisibility(0);
            }
        }
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new rgt(this, recyclerView));
        int i = Build.VERSION.SDK_INT;
        getWindow().setBackgroundDrawableResource(C0126R.C0127drawable.common_account_rounded_dialog_background);
        this.f30084k.mo33273a();
    }

    /* renamed from: a */
    private final void m22470a(bmxv bmxv, bmxv bmxv2) {
        if (cglu.m146177b() && this.f30087n) {
            View findViewById = findViewById(C0126R.C0129id.consent_divider);
            findViewById.setVisibility(0);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
            findViewById.setLayoutParams(layoutParams);
            String string = getString(C0126R.string.common_privacy_policy_composed_string);
            String string2 = getString(C0126R.string.common_terms_of_service_composed_string);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            TextView textView = this.f30089q;
            if (textView != null) {
                textView.setVisibility(0);
                this.f30089q.setMovementMethod(new LinkMovementMethod());
            }
            adcm.m50165a(this, spannableStringBuilder, string, m22468a((String) bmxv.mo66814b()), getTheme(), getThemeResId(), C0126R.attr.common_account_consent_color, null);
            adcm.m50165a(this, spannableStringBuilder2, string2, m22468a((String) bmxv2.mo66814b()), getTheme(), getThemeResId(), C0126R.attr.common_account_consent_color, null);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((CharSequence) spannableStringBuilder);
            spannableStringBuilder3.append((CharSequence) "  •  ");
            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
            TextView textView2 = this.f30089q;
            if (textView2 != null) {
                textView2.setText(spannableStringBuilder3);
                return;
            }
            return;
        }
        findViewById(C0126R.C0129id.consent_divider).setVisibility(0);
        this.f30088p.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(getString(C0126R.string.common_account_consent_text_permissions, new Object[]{this.f30076c}));
        if (bmxv.mo66813a() || bmxv2.mo66813a()) {
            this.f30088p.setMovementMethod(new LinkMovementMethod());
            String lowerCase = getString(C0126R.string.common_privacy_policy).toLowerCase();
            String lowerCase2 = getString(C0126R.string.common_terms_of_service).toLowerCase();
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
            if (bmxv.mo66813a()) {
                adcm.m50165a(this, spannableStringBuilder5, lowerCase, m22468a((String) bmxv.mo66814b()), getTheme(), getThemeResId(), C0126R.attr.common_account_link_color, null);
            } else {
                spannableStringBuilder5.append((CharSequence) lowerCase);
            }
            if (bmxv2.mo66813a()) {
                adcm.m50165a(this, spannableStringBuilder6, lowerCase2, m22468a((String) bmxv2.mo66814b()), getTheme(), getThemeResId(), C0126R.attr.common_account_link_color, null);
            } else {
                spannableStringBuilder6.append((CharSequence) lowerCase2);
            }
            spannableStringBuilder4.append((CharSequence) " ");
            spannableStringBuilder4.append(TextUtils.expandTemplate(getString(C0126R.string.common_account_consent_text_agreement), spannableStringBuilder5, spannableStringBuilder6));
        }
        this.f30088p.setText(spannableStringBuilder4);
    }

    /* renamed from: a */
    public final void mo17689a(int i) {
        int i2;
        List list = (List) this.f30084k.f61156h.mo2448b();
        bxvd da = bocn.f132573g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bocn bocn = (bocn) da.f164949b;
        bocn.f132576b = i - 1;
        bocn.f132575a |= 1;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bocn bocn2 = (bocn) da.f164949b;
        int i3 = bocn2.f132575a | 2;
        bocn2.f132575a = i3;
        bocn2.f132577c = i2;
        int i4 = this.f30085l;
        int i5 = i3 | 4;
        bocn2.f132575a = i5;
        bocn2.f132578d = i4;
        String str = this.f30078e;
        str.getClass();
        int i6 = i5 | 8;
        bocn2.f132575a = i6;
        bocn2.f132579e = str;
        bocn2.f132580f = 1;
        bocn2.f132575a = i6 | 16;
        bocn bocn3 = (bocn) da.mo74062i();
        bxvd da2 = boct.f132600I.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        boct boct = (boct) da2.f164949b;
        boct.f132612c = 17;
        int i7 = boct.f132610a | 1;
        boct.f132610a = i7;
        bocn3.getClass();
        boct.f132628s = bocn3;
        boct.f132610a = 524288 | i7;
        this.f30090r.mo24333a((boct) da2.mo74062i()).mo24327b();
    }
}
