package com.google.android.gms.plus.audience;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import java.util.Comparator;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class FaclSelectionChimeraActivity extends CircleSelectionChimeraActivity {

    /* renamed from: x */
    public static final Comparator f82302x = new anqu();

    /* renamed from: A */
    public boolean f82303A;

    /* renamed from: B */
    public boolean f82304B;

    /* renamed from: C */
    public boolean f82305C;

    /* renamed from: D */
    public boolean f82306D;

    /* renamed from: E */
    public String f82307E;

    /* renamed from: y */
    public boolean f82308y;

    /* renamed from: z */
    public boolean f82309z;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ anpn mo42070a(Intent intent, Fragment fragment) {
        return mo46556r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo42078e() {
        return C0126R.string.plus_choose_facl_title;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final FavaDiagnosticsEntity mo42081i() {
        return rih.f43047a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final rqa mo42082j() {
        rqa j = super.mo42082j();
        j.mo25009a(this.f82305C);
        j.mo25014b(this.f82304B);
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo42084l() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("FaclSelectionActivity.HasShowCircles", this.f82308y);
        bundle.putBoolean("FaclSelectionActivity.ShowContacts", this.f82309z);
        bundle.putBoolean("FaclSelectionActivity.ShowCircles", this.f82303A);
        bundle.putBoolean("FaclSelectionActivity.Contacts", this.f82304B);
        bundle.putBoolean("FaclSelectionActivity.Circles", this.f82305C);
        bundle.putBoolean("FaclSelectionActivity.CirclesHidden", this.f82306D);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final anpm mo46556r() {
        Bundle a = anpm.m64955a(((anpc) this).f77382b, ((anpc) this).f77383c, false, false, true, false, null, true, null, this.f77385e, ((anpc) this).f77384d, false, false, 0, 0, 0, null);
        anqw anqw = new anqw();
        anqw.setArguments(a);
        return anqw;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42073a(Bundle bundle) {
        Intent intent = getIntent();
        boolean z = true;
        if (bundle != null) {
            this.f82308y = bundle.getBoolean("FaclSelectionActivity.HasShowCircles");
            this.f82309z = bundle.getBoolean("FaclSelectionActivity.ShowContacts");
            this.f82303A = bundle.getBoolean("FaclSelectionActivity.ShowCircles");
            this.f82304B = bundle.getBoolean("FaclSelectionActivity.Contacts");
            this.f82305C = bundle.getBoolean("FaclSelectionActivity.Circles");
            if (this.f82303A && !bundle.getBoolean("FaclSelectionActivity.CirclesHidden")) {
                z = false;
            }
            this.f82306D = z;
        } else {
            this.f82308y = intent.getBooleanExtra("HAS_SHOW_CIRCLES", false);
            this.f82309z = intent.getBooleanExtra("SHOW_ALL_CONTACTS_CHECKBOX", false);
            this.f82303A = intent.getBooleanExtra("SHOW_ALL_CIRCLES_CHECKBOX", false);
            this.f82304B = rqa.m34233h(intent);
            boolean g = rqa.m34232g(intent);
            this.f82305C = g;
            if (this.f82303A && !g) {
                z = false;
            }
            this.f82306D = z;
        }
        String a = rqa.m34223a(intent);
        this.f82307E = a;
        if (TextUtils.isEmpty(a)) {
            this.f82307E = getString(C0126R.string.plus_facl_default_description);
        }
    }
}
