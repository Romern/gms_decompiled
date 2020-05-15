package com.google.android.gms.plus.audience;

import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CircleSelectionChimeraActivity extends anpc {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* bridge */ /* synthetic */ anpn mo42070a(Intent intent, Fragment fragment) {
        return mo46556r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo42078e() {
        return C0126R.string.plus_audience_selection_title_update_circles;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public FavaDiagnosticsEntity mo42081i() {
        return anlt.f77090b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final anpo mo42122q() {
        return (anpo) getSupportFragmentManager().findFragmentByTag("audienceSelectionList");
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public anpm mo46556r() {
        return anpm.m64956a(((anpc) this).f77382b, ((anpc) this).f77383c, this.f77385e, ((anpc) this).f77384d);
    }
}
