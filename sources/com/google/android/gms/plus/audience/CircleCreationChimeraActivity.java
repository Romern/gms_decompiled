package com.google.android.gms.plus.audience;

import android.app.PendingIntent;
import android.content.Context;
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
import com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CircleCreationChimeraActivity extends FragmentActivity implements rjz, rka, anql {

    /* renamed from: a */
    public AddToCircleConsentData f82294a;

    /* renamed from: b */
    private rkb f82295b;

    /* renamed from: c */
    private String f82296c;

    /* renamed from: d */
    private String f82297d;

    /* renamed from: e */
    private String f82298e;

    /* renamed from: f */
    private AudienceMember f82299f;

    /* renamed from: g */
    private int f82300g;

    /* renamed from: h */
    private boolean f82301h;

    /* renamed from: a */
    private final void m68362a(FavaDiagnosticsEntity favaDiagnosticsEntity) {
        shz.m35340a(this, this.f82296c, this.f82297d, favaDiagnosticsEntity, anlt.f77091c, this.f82298e, null);
    }

    /* renamed from: c */
    private final void m68365c() {
        mo42127a(0, new rqd(3, null, 3, null).mo25022a(), null);
    }

    /* renamed from: b */
    public final boolean mo42128b() {
        if (this.f82301h) {
            return false;
        }
        AddToCircleConsentData addToCircleConsentData = this.f82294a;
        if (addToCircleConsentData == null) {
            m68365c();
            return true;
        } else if (!addToCircleConsentData.f82336a) {
            return false;
        } else {
            startActivityForResult(ansi.m65104a(this.f82296c, this.f82297d, addToCircleConsentData.f82337b, addToCircleConsentData.f82338c, addToCircleConsentData.f82339d, this.f82300g), 2000);
            return true;
        }
    }

    public final void finish() {
        aoni aoni = (aoni) getSupportFragmentManager().findFragmentByTag("progressDialog");
        if (aoni != null) {
            aoni.dismissAllowingStateLoss();
        }
        super.finish();
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        if (this.f82294a == null) {
            rjo rjo = allr.f73629a;
            amcp.m62614a(this.f82295b, this.f82296c, this.f82297d).mo9458a(new anqh(this));
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 2000 && (i2 == -1 || i2 == 1 || i2 == 1)) {
            this.f82301h = true;
            anqt anqt = (anqt) getSupportFragmentManager().findFragmentByTag("CircleCreationFragment");
            if (anqt != null) {
                anqt.mo42144d();
                return;
            }
        }
        m68365c();
    }

    public final void onBackPressed() {
        m68365c();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f82296c = rqc.m34255a(getIntent());
        this.f82297d = rqc.m34257c(getIntent());
        try {
            this.f82298e = spn.m35870c((Activity) this);
            this.f82299f = rqc.m34258d(getIntent());
            if (((anqt) getSupportFragmentManager().findFragmentByTag("CircleCreationFragment")) == null) {
                getSupportFragmentManager().beginTransaction().add(16908290, new anqt(), "CircleCreationFragment").commit();
            }
            this.f82301h = false;
            if (bundle != null) {
                this.f82294a = (AddToCircleConsentData) bundle.getParcelable("addToCircleConsentData");
                if (bundle.containsKey("addToCircleConsentDataResultCode") && bundle.containsKey("addToCircleConsentDataResultIntent")) {
                    new anqj(new Status(bundle.getInt("addToCircleConsentDataResultCode"), null, (PendingIntent) bundle.getParcelable("addToCircleConsentDataResultIntent")));
                }
            } else {
                this.f82294a = null;
            }
            this.f82300g = rqc.m34256b(getIntent());
            rjy rjy = new rjy(this, this, this);
            rjo rjo = allr.f73629a;
            allp allp = new allp();
            allp.f73626a = this.f82300g;
            rjy.mo24780a(rjo, allp.mo40491a());
            rkb b = rjy.mo24784b();
            this.f82295b = b;
            b.mo24801e();
        } catch (SecurityException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
            sb.append("SecurityException ");
            sb.append(valueOf);
            Log.w("CircleCreationActivity", sb.toString());
            m68365c();
        }
    }

    public final void onStart() {
        super.onStart();
        this.f82295b.mo24801e();
    }

    public final void onStop() {
        this.f82295b.mo24803g();
        super.onStop();
    }

    /* renamed from: a */
    private final void m68363a(FavaDiagnosticsEntity favaDiagnosticsEntity, ClientActionDataEntity clientActionDataEntity) {
        Context applicationContext = getApplicationContext();
        shy shy = new shy(applicationContext);
        shy.mo25576a(this.f82296c);
        shy.mo25573a(favaDiagnosticsEntity);
        shy.mo25581c(anlt.f77091c);
        shy.mo25582c(this.f82297d);
        shy.mo25575a(clientActionDataEntity);
        shy.mo25579b(this.f82298e);
        shz.m35341a(applicationContext, shy);
    }

    /* renamed from: a */
    private final void m68364a(String str, Intent intent) {
        Bundle b = aong.m66136b(str);
        b.putInt("resultCode", 7);
        b.putParcelable("dataIntent", intent);
        anqi anqi = new anqi();
        anqi.setArguments(b);
        getSupportFragmentManager().beginTransaction().add(anqi, "errorDialog").commitAllowingStateLoss();
    }

    /* renamed from: a */
    public final void mo42126a() {
        getSupportFragmentManager().beginTransaction().add(aonc.m66132a(getResources().getString(C0126R.string.plus_add_to_new_circle_progress_message)), "progressDialog").commitAllowingStateLoss();
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        if (this.f82294a == null) {
            this.f82295b.mo24801e();
        }
    }

    /* renamed from: a */
    public final void mo42127a(int i, Intent intent, Status status) {
        aofz aofz;
        aofz aofz2;
        String str;
        Intent intent2 = intent;
        Status status2 = status;
        rqd rqd = new rqd(intent2);
        setResult(i, intent);
        int i2 = rqd.f43516b;
        if (i2 == 1) {
            rqd rqd2 = new rqd(intent2);
            List asList = Arrays.asList(rqd2.f43515a.f30294d);
            FavaDiagnosticsEntity favaDiagnosticsEntity = anls.f77079a;
            if (asList != null) {
                ArrayList arrayList = new ArrayList();
                int size = asList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    String str2 = (String) asList.get(i3);
                    if (!TextUtils.isEmpty(str2)) {
                        if (!str2.startsWith("p") && !str2.startsWith("s")) {
                            Log.w("AclDetails", "Circle ID should start with 'p' or 's'");
                        }
                        aogb aogb = new aogb();
                        aogb.mo42699a(str2);
                        arrayList.add(aogb.mo42698a());
                    }
                }
                if (!arrayList.isEmpty()) {
                    aofy aofy = new aofy();
                    aofy.mo42695a(arrayList);
                    aofz = aofy.mo42692a();
                } else if (Log.isLoggable("AclDetails", 5)) {
                    String valueOf = String.valueOf(asList);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                    sb.append("no LoggedCircles added for circle IDs: ");
                    sb.append(valueOf);
                    Log.w("AclDetails", sb.toString());
                    aofz = null;
                } else {
                    aofz = null;
                }
            } else {
                aofz = null;
            }
            m68363a(favaDiagnosticsEntity, (ClientActionDataEntity) aofz);
            int i4 = rqd2.f43517c;
            if (i4 == 1) {
                FavaDiagnosticsEntity favaDiagnosticsEntity2 = anls.f77080b;
                if (asList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = asList.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        String str3 = (String) asList.get(i5);
                        if (!TextUtils.isEmpty(str3)) {
                            aogb aogb2 = new aogb();
                            aogb2.mo42699a(str3);
                            arrayList2.add(aogb2.mo42698a());
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        aofy aofy2 = new aofy();
                        aofv aofv = new aofv();
                        aofv.mo42688a(arrayList2);
                        aofy2.mo42693a(aofv.mo42687a());
                        aofz2 = aofy2.mo42692a();
                    } else if (Log.isLoggable("AclDetails", 5)) {
                        String valueOf2 = String.valueOf(asList);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 39);
                        sb2.append("no LoggedCircles added for circle IDs: ");
                        sb2.append(valueOf2);
                        Log.w("AclDetails", sb2.toString());
                        aofz2 = null;
                    } else {
                        aofz2 = null;
                    }
                } else {
                    aofz2 = null;
                }
                m68363a(favaDiagnosticsEntity2, (ClientActionDataEntity) aofz2);
                finish();
            } else if (i4 == 2) {
                m68362a(anls.f77087i);
                if (status2 != null && status2.f30115i == 101) {
                    String str4 = this.f82299f.f30296f;
                    if (TextUtils.isEmpty(str4)) {
                        str = getString(C0126R.string.plus_update_circles_not_allowed_default_message);
                    } else {
                        str = String.format(getString(C0126R.string.plus_update_circles_not_allowed_message, new Object[]{str4}), new Object[0]);
                    }
                } else {
                    str = getString(C0126R.string.plus_update_circles_failed_message);
                }
                m68364a(str, intent2);
            } else if (i4 == 3) {
                finish();
            }
        } else if (i2 == 2) {
            m68362a(anls.f77088j);
            m68364a(getString(C0126R.string.plus_circle_creation_failed_to_create_circle_message), intent2);
        } else if (i2 == 3) {
            finish();
        }
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        new anqj(new Status(connectionResult.f30065c, null, connectionResult.f30066d));
    }
}
