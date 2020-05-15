package com.google.android.gms.wallet.common.p079ui;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.Spinner;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.wallet.common.ui.AccountSelector */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountSelector extends FrameLayout implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    public Account f110042a;

    /* renamed from: b */
    public Spinner f110043b;

    /* renamed from: c */
    public awgq f110044c;

    public AccountSelector(Context context) {
        super(context);
        m93875a(context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.gms.wallet.common.ui.AccountSelector, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    private final void m93875a(Context context) {
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.wallet_view_account_selector, (ViewGroup) this, true);
        Spinner spinner = (Spinner) findViewById(C0126R.C0129id.account_spinner);
        this.f110043b = spinner;
        spinner.setOnItemSelectedListener(this);
    }

    /* renamed from: b */
    public final boolean mo59832b() {
        return this.f110043b.getVisibility() == 0;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        awgk awgk;
        if (view != null && (awgk = (awgk) view.getTag()) != null) {
            mo59831a(awgk.f94305a);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
            mo59831a((Account) bundle.getParcelable("currentAccount"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("currentAccount", this.f110042a);
        return bundle;
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (mo59832b()) {
            this.f110043b.setEnabled(z);
        }
    }

    public AccountSelector(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m93875a(context);
    }

    public AccountSelector(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m93875a(context);
    }

    /* renamed from: a */
    public final void mo59830a() {
        awgl awgl;
        if (this.f110042a != null && mo59832b()) {
            Spinner spinner = this.f110043b;
            Account account = this.f110042a;
            int i = -1;
            if (mo59832b() && (awgl = (awgl) this.f110043b.getAdapter()) != null) {
                int i2 = 0;
                while (true) {
                    if (i2 < awgl.getCount()) {
                        if (sdg.m34949a(((awgk) awgl.getItem(i2)).f94305a, account)) {
                            i = i2;
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
            }
            spinner.setSelection(i);
        }
    }

    /* renamed from: a */
    public final void mo59831a(Account account) {
        if (!sdg.m34949a(this.f110042a, account)) {
            this.f110042a = account;
            mo59830a();
            awgq awgq = this.f110044c;
            if (awgq != null) {
                awgq.mo52132a(account);
            }
        }
    }
}
