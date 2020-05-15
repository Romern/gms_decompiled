package com.google.android.gms.plus.audience;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AclSelectionChimeraActivity extends anpc implements View.OnClickListener {

    /* renamed from: x */
    private anob f82272x;

    /* renamed from: y */
    private View f82273y;

    /* renamed from: z */
    private boolean f82274z;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo42078e() {
        return C0126R.string.plus_audience_selection_title_acl;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo42079g() {
        mo42076a(riv.f43114h, mo42086n());
        super.mo42079g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo42080h() {
        mo42076a(riv.f43113g, (ClientActionDataEntity) null);
        super.mo42080h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final FavaDiagnosticsEntity mo42081i() {
        return riw.f43133a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final rqa mo42082j() {
        rqa j = super.mo42082j();
        j.mo25005a(this.f82272x.f77264a);
        return j;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            mo42075a(riw.f43133a, riw.f43138f);
            if (i2 == -1) {
                anqg anqg = this.f77387g;
                anqg.mo42124a(sfi.m35163a(anqg.f77451a, (AudienceMember) rqa.m34231f(intent).get(0)), this);
            }
        }
    }

    public void onClick(View view) {
        super.onClick(view);
        if (view == this.f82273y) {
            onSearchRequested();
        }
    }

    public final boolean onSearchRequested() {
        rqa rqa = new rqa(new Intent().setClassName(this, "com.google.android.gms.plus.audience.AudienceSearchActivity"));
        rqa.mo25007a(((anpc) this).f77382b);
        rqa.mo25017c(((anpc) this).f77383c);
        rqa.mo25019d(this.f77385e);
        rqa.f43513a.putExtra("com.google.android.gms.common.acl.EXTRA_TITLE_TEXT", getString(C0126R.string.plus_audience_selection_title_search));
        rqa.f43513a.putExtra("EXTRA_SEARCH_DEVICE", this.f82274z);
        startActivityForResult(rqa.f43513a, 1);
        mo42075a(riw.f43133a, riw.f43138f);
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rqa.a(android.content.Intent, boolean):boolean
     arg types: [android.content.Intent, int]
     candidates:
      rqa.a(android.content.Intent, int):int
      rqa.a(android.content.Intent, boolean):boolean */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ anpn mo42070a(Intent intent, Fragment fragment) {
        AclSelectionChimeraActivity aclSelectionChimeraActivity;
        Intent intent2 = intent;
        Fragment fragment2 = fragment;
        this.f82274z = rqa.m34237l(intent);
        if (fragment2 == null || !(fragment2 instanceof anob)) {
            aclSelectionChimeraActivity = this;
            aclSelectionChimeraActivity.f82272x = anob.m64855a(((anpc) this).f77382b, ((anpc) this).f77383c, intent2.getBooleanExtra("SHOULD_LOAD_SUGGESTED", false), rqa.m34225a(intent2, true), rqa.m34235j(intent), rqa.m34236k(intent), Integer.valueOf(intent2.getIntExtra("LOAD_PEOPLE_TYPE", -1)), rqa.m34223a(intent), rqa.m34227b(intent), ((anpc) this).f77384d, rqa.m34234i(intent), intent2.getBooleanExtra("EXTRA_INCLUDE_SUGGESTIONS_WITH_PEOPLE", false), intent2.getIntExtra("EXTRA_MAX_SUGGESTED_IMAGES", 0), intent2.getIntExtra("EXTRA_MAX_SUGGESTED_LIST_ITEMS", 0), intent2.getIntExtra("EXTRA_MAX_SUGGESTED_DEVICE", 0), null);
        } else {
            this.f82272x = (anob) fragment2;
            aclSelectionChimeraActivity = this;
        }
        return aclSelectionChimeraActivity.f82272x;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42072a(alzr alzr) {
        this.f82272x.mo42030a(alzr);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42073a(Bundle bundle) {
        View inflate = LayoutInflater.from(this).inflate((int) C0126R.C0128layout.plus_audience_selection_title_search, (ViewGroup) findViewById(C0126R.C0129id.title_frame), true);
        this.f82273y = inflate;
        inflate.setOnClickListener(this);
        this.f82272x.f77267d = this.f77386f;
    }
}
