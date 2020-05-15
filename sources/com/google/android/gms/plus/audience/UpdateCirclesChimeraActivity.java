package com.google.android.gms.plus.audience;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.Loader;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.circles.AddToCircleConsentData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class UpdateCirclesChimeraActivity extends CircleSelectionChimeraActivity implements anrf, aonh, rjz, rka {

    /* renamed from: A */
    public boolean f82322A;

    /* renamed from: B */
    private anul f82323B = anuy.f77749a;

    /* renamed from: C */
    private AudienceMember f82324C;

    /* renamed from: D */
    private boolean f82325D;

    /* renamed from: E */
    private rkb f82326E;

    /* renamed from: F */
    private final rkl f82327F = new anrb(this);

    /* renamed from: G */
    private final rkl f82328G = new anrc(this);

    /* renamed from: x */
    public Bitmap f82329x;

    /* renamed from: y */
    public AddToCircleConsentData f82330y;

    /* renamed from: z */
    public Status f82331z;

    /* renamed from: a */
    private final void m68393a(ArrayList arrayList, ArrayList arrayList2) {
        List list = this.f77387g.f77451a.f30287b;
        ArrayList arrayList3 = new ArrayList(rqa.m34230e(getIntent()));
        arrayList.clear();
        arrayList.addAll(list);
        arrayList.removeAll(arrayList3);
        arrayList2.clear();
        arrayList2.addAll(arrayList3);
        arrayList2.removeAll(list);
    }

    /* renamed from: u */
    private final int m68394u() {
        String str = this.f77385e;
        if (!TextUtils.isEmpty(str)) {
            return Integer.parseInt(str);
        }
        return 0;
    }

    /* renamed from: c */
    public final void mo43090c() {
        mo42080h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo42079g() {
        String str;
        shz.m35339a(getApplicationContext(), ((anpc) this).f77382b, ((anpc) this).f77383c, anls.f77082d, anlt.f77089a, ((anpc) this).f77384d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m68393a(arrayList, arrayList2);
        if (arrayList.size() + arrayList2.size() <= 0) {
            super.mo42079g();
            return;
        }
        if (arrayList.size() > 0 && arrayList2.size() == 0) {
            str = getString(C0126R.string.plus_add_to_circle_progress);
        } else if (arrayList.size() != 0 || arrayList2.size() <= 0) {
            str = getString(C0126R.string.plus_update_circles_progress);
        } else {
            str = getString(C0126R.string.plus_remove_from_circle_progress);
        }
        getSupportFragmentManager().beginTransaction().add(aonc.m66132a(str), "progressDialog").commitAllowingStateLoss();
        if (this.f82331z != null && mo46562s()) {
            return;
        }
        if (this.f82331z == null) {
            this.f82322A = true;
        } else {
            mo46563t();
        }
    }

    /* renamed from: h */
    public final void mo42080h() {
        if (mo42117c(0)) {
            shz.m35339a(getApplicationContext(), ((anpc) this).f77382b, ((anpc) this).f77383c, anls.f77083e, anlt.f77089a, ((anpc) this).f77384d);
            super.mo42080h();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final FavaDiagnosticsEntity mo42081i() {
        return anlt.f77089a;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 2000) {
            if (i == 1) {
                if (intent != null) {
                    rqd rqd = new rqd(intent);
                    if (rqd.f43516b == 1 && rqd.f43517c == 1) {
                        rqa rqa = new rqa(new Intent());
                        rqa.mo25006a(this.f82324C);
                        rqa.mo25008a(new ArrayList(Arrays.asList(rqd.f43515a)));
                        rqa.mo25012b(new ArrayList());
                        rqa.mo25013b((List) new ArrayList(rqa.m34230e(getIntent())));
                        mo42077b(rqa.f43513a);
                        return;
                    }
                    mo42118o();
                    return;
                }
                mo42118o();
            } else if (i != 0) {
            } else {
                if (i2 == -1) {
                    if (this.f82331z.mo17709b()) {
                        rjo rjo = allr.f73629a;
                        amcp.m62614a(this.f82326E, ((anpc) this).f77382b, ((anpc) this).f77383c).mo9458a(this.f82327F);
                    }
                    rjo rjo2 = allr.f73629a;
                    amdi.m62651a(this.f82326E, ((anpc) this).f77382b, ((anpc) this).f77383c, 0, true);
                    return;
                }
                super.onActivityResult(0, i2, intent);
            }
        } else if (i2 == -1 || i2 == 1 || i2 == 1) {
            mo46563t();
        } else {
            aoni aoni = (aoni) getSupportFragmentManager().findFragmentByTag("progressDialog");
            if (aoni != null) {
                aoni.dismissAllowingStateLoss();
            }
            mo42080h();
        }
    }

    public void onClick(View view) {
        if (view.getId() == C0126R.C0129id.audience_selection_create_circle_view) {
            rqb rqb = new rqb(((anpc) this).f77382b, this.f77385e);
            rqb.f43514a.putExtra("com.google.android.gms.common.audience.EXTRA_PAGE_ID", ((anpc) this).f77383c);
            AudienceMember audienceMember = this.f82324C;
            if (!TextUtils.isEmpty(audienceMember.f30295e)) {
                rqb.f43514a.putExtra("com.google.android.gms.common.audience.EXTRA_TARGET_PERSON", audienceMember);
            }
            rqb.f43514a.putExtra("com.google.android.gms.common.audience.EXTRA_HEADER_TEXT_COLOR", rqa.m34222a(getIntent(), getResources().getColor(C0126R.color.plus_add_to_circles_header_text)));
            rqb.f43514a.putExtra("com.google.android.gms.common.audience.EXTRA_HEADER_BACKGROUND_COLOR", rqa.m34226b(getIntent(), getResources().getColor(C0126R.color.plus_add_to_circles_header_grey)));
            Intent intent = rqb.f43514a;
            if (intent != null) {
                super.mo42116a(new anra(this, intent));
            }
        }
        super.onClick(view);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        onLoadFinished(loader, (amey) obj);
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("hasLoggedCircleLoad", this.f82325D);
        bundle.putParcelable("addToCircleConsentData", this.f82330y);
        Status status = this.f82331z;
        if (status != null) {
            bundle.putInt("addToCircleConsentDataResultCode", status.f30115i);
            bundle.putParcelable("addToCircleConsentDataResultIntent", this.f82331z.f30117k);
        }
    }

    public final void onStart() {
        super.onStart();
        this.f82326E.mo24801e();
    }

    public final void onStop() {
        this.f82326E.mo24803g();
        super.onStop();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final anpm mo46556r() {
        return anpm.m64956a(((anpc) this).f77382b, ((anpc) this).f77383c, this.f77385e, ((anpc) this).f77384d);
    }

    /* renamed from: s */
    public final boolean mo46562s() {
        if (!this.f82331z.mo17710c()) {
            rqa rqa = new rqa(new Intent());
            rqa.mo25006a(this.f82324C);
            rqa.mo25008a(new ArrayList());
            rqa.mo25012b(new ArrayList());
            rqa.mo25013b((List) new ArrayList(rqa.m34230e(getIntent())));
            getSupportFragmentManager().beginTransaction().add(anrd.m65041a(getString(C0126R.string.plus_update_circles_failed_message), rqa.f43513a), "errorDialog").commitAllowingStateLoss();
            return true;
        }
        AddToCircleConsentData addToCircleConsentData = this.f82330y;
        if (!addToCircleConsentData.f82336a) {
            return false;
        }
        startActivityForResult(ansi.m65104a(((anpc) this).f77382b, ((anpc) this).f77383c, addToCircleConsentData.f82337b, addToCircleConsentData.f82338c, addToCircleConsentData.f82339d, m68394u()), 2000);
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: t */
    public final void mo46563t() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m68393a(arrayList, arrayList2);
        String str = ((anpc) this).f77382b;
        String str2 = ((anpc) this).f77383c;
        String str3 = this.f82324C.f30295e;
        String str4 = this.f77385e;
        String str5 = ((anpc) this).f77384d;
        sdo.m34969a(str, (Object) "Account name must not be empty.");
        sdo.m34969a(str3, (Object) "Update person ID must not be empty");
        if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "Circles to add and remove are empty, nothing to do.");
        Bundle bundle = new Bundle();
        bundle.putString("accountName", str);
        bundle.putString("plusPageId", str2);
        bundle.putString("updatePersonId", str3);
        bundle.putParcelableArrayList("circleIdsToAdd", arrayList);
        bundle.putParcelableArrayList("circleIdsToRemove", arrayList2);
        bundle.putString("callingPackageName", str5);
        bundle.putString("clientApplicationId", str4);
        anrg anrg = new anrg();
        anrg.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().add(anrg, "updateCircles").commitAllowingStateLoss();
        if (anrg.f77494e || anrg.f77493d || anrg.f77495f != null) {
            throw new IllegalStateException("UpdateCirclesChimeraFragment should only be used once.");
        }
        rkb rkb = anrg.f77490a;
        if (rkb == null || !rkb.mo24805i()) {
            anrg.f77493d = true;
            rkb rkb2 = anrg.f77490a;
            if (rkb2 != null && !rkb2.mo24806j()) {
                anrg.f77490a.mo24801e();
            }
        } else if (!anrg.f77494e) {
            anrg.mo42152a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ anpn mo42070a(Intent intent, Fragment fragment) {
        return mo46556r();
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        if (this.f82330y == null) {
            this.f82326E.mo24801e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42073a(Bundle bundle) {
        AudienceMember c = rqa.m34228c(getIntent());
        this.f82324C = c;
        sdo.checkIfNull(c, "Update person ID must not be null.");
        if (bundle != null) {
            this.f82325D = bundle.getBoolean("hasLoggedCircleLoad", false);
            this.f82330y = (AddToCircleConsentData) bundle.getParcelable("addToCircleConsentData");
            if (bundle.containsKey("addToCircleConsentDataResultCode") && bundle.containsKey("addToCircleConsentDataResultIntent")) {
                this.f82331z = new Status(bundle.getInt("addToCircleConsentDataResultCode"), null, (PendingIntent) bundle.getParcelable("addToCircleConsentDataResultIntent"));
            }
        } else {
            this.f82325D = false;
        }
        rkb a = this.f82323B.mo42293a(this, m68394u(), ((anpc) this).f77384d);
        this.f82326E = a;
        a.mo24790a((rjz) this);
        this.f82326E.mo24791a((rka) this);
    }

    /* renamed from: a */
    public final void mo42074a(Loader loader, amey amey) {
        super.onLoadFinished(loader, amey);
        if (!this.f82325D) {
            shz.m35339a(getApplicationContext(), ((anpc) this).f77382b, ((anpc) this).f77383c, anls.f77081c, anlt.f77089a, ((anpc) this).f77384d);
            this.f82325D = true;
        }
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        if (this.f82330y == null) {
            rjo rjo = allr.f73629a;
            amcp.m62614a(this.f82326E, ((anpc) this).f77382b, ((anpc) this).f77383c).mo9458a(this.f82327F);
        }
        findViewById(C0126R.C0129id.add_to_circles_user_icon).setVisibility(8);
        if (!TextUtils.isEmpty(this.f82324C.f30297g)) {
            rjo rjo2 = allr.f73629a;
            amcy.m62630a(this.f82326E, this.f82324C.f30297g, 1, 1).mo9458a(this.f82328G);
        }
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        this.f82331z = new Status(connectionResult.f30065c);
    }

    /* renamed from: a */
    public final void mo42151a(Status status, ArrayList arrayList, ArrayList arrayList2) {
        String str;
        aoni aoni = (aoni) getSupportFragmentManager().findFragmentByTag("progressDialog");
        if (aoni != null) {
            aoni.dismissAllowingStateLoss();
        }
        rqa rqa = new rqa(new Intent());
        rqa.mo25006a(this.f82324C);
        rqa.mo25008a(arrayList);
        rqa.mo25012b(arrayList2);
        rqa.mo25013b((List) new ArrayList(rqa.m34230e(getIntent())));
        Intent intent = rqa.f43513a;
        if (status == null || !status.mo17710c()) {
            if (status != null && status.f30115i == 101) {
                String str2 = this.f82324C.f30296f;
                if (TextUtils.isEmpty(str2)) {
                    str = getString(C0126R.string.plus_update_circles_not_allowed_default_message);
                } else {
                    str = String.format(getString(C0126R.string.plus_update_circles_not_allowed_message, new Object[]{str2}), new Object[0]);
                }
            } else {
                str = getString(C0126R.string.plus_update_circles_failed_message);
            }
            getSupportFragmentManager().beginTransaction().add(anrd.m65041a(str, intent), "errorDialog").commitAllowingStateLoss();
            return;
        }
        mo42077b(intent);
    }
}
