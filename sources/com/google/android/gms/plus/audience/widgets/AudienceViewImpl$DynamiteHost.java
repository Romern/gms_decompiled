package com.google.android.gms.plus.audience.widgets;

import android.content.Context;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.people.data.Audience;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AudienceViewImpl$DynamiteHost extends rqi {

    /* renamed from: a */
    private anrs f82332a;

    /* renamed from: a */
    private final void m68409a() {
        sdo.m34975b(this.f82332a != null, "call initialize() first");
    }

    public vzr getView() {
        m68409a();
        return vzs.m41642a(this.f82332a);
    }

    public void initialize(vzr vzr, vzr vzr2, rqm rqm) {
        this.f82332a = new anrs((Context) vzs.m41641a(vzr), (Context) vzs.m41641a(vzr2), rqm);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        m68409a();
        this.f82332a.onRestoreInstanceState(bundle.getParcelable("state"));
    }

    public Bundle onSaveInstanceState() {
        m68409a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("state", this.f82332a.onSaveInstanceState());
        return bundle;
    }

    public void setAudience(Audience audience) {
        m68409a();
        this.f82332a.mo42161a(audience);
    }

    public void setEditMode(int i) {
        m68409a();
        anrs anrs = this.f82332a;
        anrs.f77534e = i;
        anrs.mo42160a();
    }

    public void setIsUnderageAccount(boolean z) {
        m68409a();
        anrs anrs = this.f82332a;
        if (anrs.f77535f != z) {
            anrs.f77535f = z;
            anrs.mo42162b();
        }
    }

    public void setShowEmptyText(boolean z) {
        m68409a();
        anrs anrs = this.f82332a;
        anrs.f77532c = z;
        if (z) {
            Audience audience = anrs.f77533d;
            if (audience == null || audience.f30287b.size() > 0) {
                anrs.f77530a.setText((int) C0126R.string.common_chips_label_empty_circles);
            }
        }
    }
}
