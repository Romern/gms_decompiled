package com.google.android.gms.plus.audience;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AudienceSearchChimeraActivity extends anpc implements TextView.OnEditorActionListener, TextWatcher, anqf {

    /* renamed from: x */
    private EditText f82276x;

    /* renamed from: y */
    private anon f82277y;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rqa.a(android.content.Intent, boolean):boolean
     arg types: [android.content.Intent, int]
     candidates:
      rqa.a(android.content.Intent, int):int
      rqa.a(android.content.Intent, boolean):boolean */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ anpn mo42070a(Intent intent, Fragment fragment) {
        String str = ((anpc) this).f77382b;
        String str2 = ((anpc) this).f77383c;
        boolean a = rqa.m34225a(intent, false);
        boolean j = rqa.m34235j(intent);
        boolean k = rqa.m34236k(intent);
        boolean k2 = rqa.m34236k(intent);
        boolean l = rqa.m34237l(intent);
        boolean booleanExtra = intent.getBooleanExtra("EXTRA_SEARCH_EMAIL", false);
        String str3 = this.f77385e;
        String str4 = ((anpc) this).f77384d;
        anon anon = new anon();
        anon.setArguments(anon.m64877a(str, str2, a, j, k, k2, l, booleanExtra, str3, str4));
        this.f82277y = anon;
        return anon;
    }

    public final void afterTextChanged(Editable editable) {
        if (!TextUtils.isEmpty(editable.toString())) {
            this.f82277y.mo42046a(editable.toString());
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo42078e() {
        return C0126R.string.plus_audience_selection_title_search;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo42079g() {
        mo42076a(riv.f43130x, mo42086n());
        super.mo42079g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo42080h() {
        mo42076a(riv.f43131y, (ClientActionDataEntity) null);
        super.mo42080h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final FavaDiagnosticsEntity mo42081i() {
        return riw.f43138f;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
        return true;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42073a(Bundle bundle) {
        findViewById(C0126R.C0129id.action_buttons).setVisibility(8);
        this.f77387g.mo42123a(this);
        EditText editText = (EditText) LayoutInflater.from(this).inflate((int) C0126R.C0128layout.plus_audience_selection_search_box, (ViewGroup) null);
        this.f82276x = editText;
        editText.setOnEditorActionListener(this);
        this.f82276x.addTextChangedListener(this);
        ((LinearLayout) findViewById(C0126R.C0129id.search_container)).addView(this.f82276x, 0);
    }

    /* renamed from: a */
    public final void mo42031a(Object obj) {
        if (this.f77387g.f77451a.f30287b.size() > 0) {
            mo42079g();
        }
    }
}
