package com.google.android.gms.plus.audience;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.circles.AddToCircleConsentData;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class UpdateActionOnlyChimeraActivity extends FragmentActivity implements rjz, rka, anoc, aonh {

    /* renamed from: a */
    public AddToCircleConsentData f82310a;

    /* renamed from: b */
    public alld f82311b;

    /* renamed from: c */
    public String f82312c;

    /* renamed from: d */
    public String f82313d;

    /* renamed from: e */
    private FragmentActivity f82314e = this;

    /* renamed from: f */
    private rkb f82315f;

    /* renamed from: g */
    private AudienceMember f82316g;

    /* renamed from: h */
    private String f82317h;

    /* renamed from: i */
    private String f82318i;

    /* renamed from: j */
    private String f82319j;

    /* renamed from: k */
    private String f82320k;

    /* renamed from: l */
    private int f82321l;

    /* renamed from: a */
    public final int mo46558a() {
        if (!TextUtils.isEmpty(this.f82317h)) {
            return Integer.parseInt(this.f82317h);
        }
        return 0;
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
    /* renamed from: b */
    public final void mo46561b() {
        shz.m35339a(getApplicationContext(), this.f82312c, this.f82313d, anls.f77080b, new FavaDiagnosticsEntity(this.f82320k, this.f82321l), this.f82318i);
        getSupportFragmentManager().beginTransaction().add(aonc.m66132a(getString(C0126R.string.plus_add_to_following_circle_progress)), "progressDialog").commitAllowingStateLoss();
        if (((anoe) getSupportFragmentManager().findFragmentByTag("AddToCircle")) == null) {
            String str = this.f82312c;
            String str2 = this.f82313d;
            String str3 = this.f82316g.f30295e;
            String str4 = this.f82319j;
            String str5 = this.f82317h;
            sdo.m34969a(str, (Object) "Account name must not be empty.");
            sdo.m34969a(str3, (Object) "Update person qualifiedId must not be empty.");
            sdo.m34969a(str4, (Object) "Circle to add must not be empty.");
            Bundle bundle = new Bundle();
            bundle.putString("accountName", str);
            bundle.putString("plusPageId", str2);
            bundle.putString("updatePersonId", str3);
            bundle.putString("circleIdToAdd", str4);
            bundle.putString("clientApplicationId", str5);
            anoe anoe = new anoe();
            anoe.setArguments(bundle);
            getSupportFragmentManager().beginTransaction().add(anoe, "AddToCircle").commitAllowingStateLoss();
            if (anoe.f77277c || anoe.f77276b || anoe.f77278d != null) {
                throw new IllegalStateException("AddToCircleChimeraFragment should only be used once.");
            }
            rkb rkb = anoe.f77275a;
            if (rkb == null || !rkb.mo24805i()) {
                anoe.f77276b = true;
                rkb rkb2 = anoe.f77275a;
                if (rkb2 != null && !rkb2.mo24806j()) {
                    anoe.f77275a.mo24801e();
                }
            } else if (!anoe.f77277c) {
                anoe.mo42035a();
            }
        }
    }

    /* renamed from: c */
    public final void mo43090c() {
        setResult(0, null);
        finish();
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        if (this.f82310a == null) {
            rjo rjo = allr.f73629a;
            amcp.m62614a(this.f82315f, this.f82312c, this.f82313d).mo9458a(new anqx(this));
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 2000) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 || i2 == 1 || i2 == 1) {
            mo46561b();
        } else {
            aoni aoni = (aoni) getSupportFragmentManager().findFragmentByTag("progressDialog");
            if (aoni != null) {
                aoni.dismissAllowingStateLoss();
            }
            mo46559a(0, null);
        }
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
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!soz.m35807f(this)) {
            try {
                this.f82318i = spn.m35870c((Activity) this);
                this.f82312c = intent.getStringExtra("EXTRA_ACCOUNT_NAME");
                this.f82313d = intent.getStringExtra("EXTRA_PLUS_PAGE_ID");
                this.f82317h = intent.getStringExtra("EXTRA_CLIENT_APPLICATION_ID");
                this.f82319j = intent.getStringExtra("EXTRA_TARGET_CIRCLE_ID");
                this.f82316g = (AudienceMember) intent.getParcelableExtra("EXTRA_UPDATE_PERSON");
                String stringExtra = intent.getStringExtra("EXTRA_START_VIEW_NAMESPACE");
                if (TextUtils.isEmpty(stringExtra)) {
                    stringExtra = "sg";
                }
                this.f82320k = stringExtra;
                this.f82321l = intent.getIntExtra("EXTRA_START_VIEW_TYPE_NUM", 0);
                sdo.m34969a(this.f82312c, (Object) "Account name must not be empty.");
                sdo.m34966a(this.f82316g, "Update person must not be null.");
                sdo.m34969a(this.f82319j, (Object) "Target circleId must not be null.");
                rjy rjy = new rjy(this, this, this);
                rjo rjo = allr.f73629a;
                allp allp = new allp();
                allp.f73626a = mo46558a();
                rjy.mo24780a(rjo, allp.mo40491a());
                this.f82315f = rjy.mo24784b();
                this.f82310a = null;
                this.f82311b = null;
                if (bundle != null) {
                    this.f82310a = (AddToCircleConsentData) bundle.getParcelable("addToCircleConsentData");
                    if (bundle.containsKey("addToCircleConsentDataResultCode") && bundle.containsKey("addToCircleConsentDataResultIntent")) {
                        this.f82311b = new anqz(new Status(bundle.getInt("addToCircleConsentDataResultCode"), null, (PendingIntent) bundle.getParcelable("addToCircleConsentDataResultIntent")));
                    }
                }
            } catch (SecurityException e) {
                mo46559a(0, null);
            }
        } else {
            Log.w("UpdateActionOnlyActivity", "This activity is not available for restricted profile.");
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("addToCircleConsentData", this.f82310a);
        alld alld = this.f82311b;
        if (alld != null) {
            bundle.putInt("addToCircleConsentDataResultCode", alld.mo7183bo().f30115i);
            bundle.putParcelable("addToCircleConsentDataResultIntent", this.f82311b.mo7183bo().f30117k);
        }
    }

    public final void onStart() {
        super.onStart();
        this.f82315f.mo24801e();
    }

    public final void onStop() {
        this.f82315f.mo24803g();
        super.onStop();
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        if (this.f82310a == null) {
            this.f82315f.mo24801e();
        }
    }

    /* renamed from: a */
    public final void mo46559a(int i, Intent intent) {
        setResult(i, intent);
        finish();
    }

    /* renamed from: a */
    public final void mo42034a(alle alle) {
        aoni aoni = (aoni) this.f82314e.getSupportFragmentManager().findFragmentByTag("progressDialog");
        if (aoni != null) {
            aoni.dismissAllowingStateLoss();
        }
        if (alle == null) {
            mo46560a((Status) null);
        } else if (!alle.mo7183bo().mo17710c()) {
            mo46560a(alle.mo7183bo());
        } else {
            rqf rqf = new rqf();
            rqf.f43520a.putExtra("EXTRA_TARGET_CIRCLE_ID", this.f82319j);
            rqf.f43520a.putExtra("EXTRA_UPDATE_PERSON", this.f82316g);
            mo46559a(-1, rqf.f43520a);
        }
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        this.f82311b = new anqz(new Status(connectionResult.f30065c, null, connectionResult.f30066d));
    }

    /* renamed from: a */
    public final void mo46560a(Status status) {
        String str;
        if (status != null && status.f30115i == 101) {
            String str2 = this.f82316g.f30296f;
            if (TextUtils.isEmpty(str2)) {
                str = getString(C0126R.string.plus_update_circles_not_allowed_default_message);
            } else {
                str = String.format(getString(C0126R.string.plus_update_circles_not_allowed_message, new Object[]{str2}), new Object[0]);
            }
        } else {
            str = getString(C0126R.string.plus_update_circles_failed_message);
        }
        Bundle b = aong.m66136b(str);
        b.putInt("resultCode", 7);
        anqy anqy = new anqy();
        anqy.setArguments(b);
        getSupportFragmentManager().beginTransaction().add(anqy, "errorDialog").commitAllowingStateLoss();
    }
}
