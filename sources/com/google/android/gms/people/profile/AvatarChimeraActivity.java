package com.google.android.gms.people.profile;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.FragmentActivity;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ActionTargetEntity;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AvatarChimeraActivity extends FragmentActivity implements rjz, rka, amir {

    /* renamed from: a */
    public DialogFragment f81947a;

    /* renamed from: b */
    public boolean f81948b;

    /* renamed from: c */
    public Uri f81949c;

    /* renamed from: d */
    public Uri f81950d;

    /* renamed from: e */
    public Uri f81951e;

    /* renamed from: f */
    public boolean f81952f;

    /* renamed from: g */
    private rkb f81953g;

    /* renamed from: h */
    private String f81954h;

    /* renamed from: i */
    private int f81955i = -1;

    /* renamed from: j */
    private String f81956j;

    /* renamed from: k */
    private String f81957k;

    /* renamed from: l */
    private Uri f81958l;

    /* renamed from: m */
    private final rkl f81959m = new amij(this);

    /* renamed from: n */
    private final rkl f81960n = new amik(this);

    /* renamed from: o */
    private final rkl f81961o = new amil(this);

    public AvatarChimeraActivity() {
        almk.m61263a();
    }

    /* renamed from: g */
    private final void m68070g() {
        boolean z;
        if (this.f81949c != null) {
            z = true;
        } else {
            z = false;
        }
        rjo rjo = allr.f73629a;
        rkb rkb = this.f81953g;
        rkb.mo24795b(new amcr(rkb, this.f81956j, this.f81957k, this.f81951e, z)).mo9458a(this.f81961o);
        this.f81952f = true;
        this.f81947a = new amin();
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(this.f81947a, "progress_dialog");
        beginTransaction.commitAllowingStateLoss();
    }

    /* renamed from: a */
    public final void mo41195a() {
        Uri a = amio.m62946a(this, "camera-avatar.jpg");
        this.f81949c = a;
        if (a != null) {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", this.f81949c);
            int i = Build.VERSION.SDK_INT;
            intent.addFlags(1);
            intent.addFlags(2);
            try {
                startActivityForResult(intent, 1);
            } catch (ActivityNotFoundException e) {
                Log.w("People.Avatar", "No activity to take photo");
            }
        } else {
            Log.w("People.Avatar", "Failed to create temp file to take photo");
            mo46371f();
            mo46370e();
        }
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
    }

    /* renamed from: b */
    public final void mo41196b() {
        this.f81950d = Uri.EMPTY;
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        startActivityForResult(intent, 2);
    }

    /* renamed from: c */
    public final void mo41197c() {
        mo46370e();
    }

    /* renamed from: d */
    public final void mo46369d() {
        mo46368b(6);
        setResult(1);
        finish();
    }

    /* renamed from: e */
    public final void mo46370e() {
        mo46367a(riq.f43086c, "2");
        mo46368b(5);
        setResult(0);
        finish();
    }

    /* renamed from: f */
    public final void mo46371f() {
        Toast.makeText(this, (int) C0126R.string.people_avatar_error, 0).show();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (i2 == -1) {
                        this.f81951e = (Uri) intent.getParcelableExtra("com.google.android.gms.people.profile.EXTRA_URI");
                        if (this.f81953g.mo24805i()) {
                            m68070g();
                            return;
                        }
                        return;
                    }
                    mo46370e();
                }
            } else if (i2 == -1) {
                Uri data = intent.getData();
                this.f81950d = data;
                if (data == null || TextUtils.isEmpty(data.toString())) {
                    Log.w("People.Avatar", "Empty data returned from pick photo");
                    mo46371f();
                    mo46370e();
                    return;
                }
                Uri uri = this.f81950d;
                if (uri == null || (!"http".equals(uri.getScheme()) && !"https".equals(uri.getScheme()))) {
                    mo46366a(this.f81950d);
                    return;
                }
                this.f81958l = this.f81950d;
                this.f81950d = null;
                if (this.f81953g.mo24805i()) {
                    String uri2 = this.f81958l.toString();
                    rjo rjo = allr.f73629a;
                    amcy.m62629a(this.f81953g, uri2).mo9458a(this.f81960n);
                }
            } else {
                mo46370e();
            }
        } else if (i2 == -1) {
            mo46366a(this.f81949c);
        } else {
            mo46370e();
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        getWindow().getDecorView();
        if (!soz.m35807f(this)) {
            try {
                this.f81954h = spn.m35870c((Activity) this);
                if (bundle != null) {
                    this.f81955i = bundle.getInt("app_id", -1);
                    this.f81956j = bundle.getString("account_name");
                    this.f81957k = bundle.getString("page_gaia_id");
                    this.f81948b = bundle.getBoolean("owner_loaded");
                    this.f81949c = (Uri) bundle.getParcelable("take_photo_uri");
                    this.f81950d = (Uri) bundle.getParcelable("pick_photo_uri");
                    this.f81958l = (Uri) bundle.getParcelable("remote_pick_photo_uri");
                    this.f81951e = (Uri) bundle.getParcelable("cropped_photo_uri");
                    this.f81952f = bundle.getBoolean("result_pending");
                }
                if (this.f81956j == null && this.f81957k == null && (extras = getIntent().getExtras()) != null) {
                    this.f81956j = extras.getString("com.google.android.gms.people.profile.EXTRA_ACCOUNT");
                    this.f81957k = extras.getString("com.google.android.gms.people.profile.EXTRA_PAGE_ID");
                }
                if (TextUtils.isEmpty(this.f81956j)) {
                    Log.e("People.Avatar", "Profile image account name is unspecified");
                    mo46368b(2);
                    setResult(0);
                    finish();
                    return;
                }
                if (this.f81955i == -1) {
                    Bundle extras2 = getIntent().getExtras();
                    if (extras2 != null) {
                        this.f81955i = extras2.getInt("com.google.android.gms.people.profile.EXTRA_APP_ID", -1);
                    }
                    if (this.f81955i == -1) {
                        int intValue = ((Integer) ancf.f76620a.getOrDefault(this.f81954h, -1)).intValue();
                        this.f81955i = intValue;
                        if (intValue == -1) {
                            Log.e("People.Avatar", "EXTRA_SOCIAL_CLIENT_APP_ID must be set");
                            mo46368b(3);
                            setResult(0);
                            finish();
                            return;
                        }
                    }
                }
                rjy rjy = new rjy(this);
                rjy.f43173b = this.f81954h;
                rjo rjo = allr.f73629a;
                allp allp = new allp();
                allp.f73626a = this.f81955i;
                rjy.mo24780a(rjo, allp.mo40491a());
                rkb b = rjy.mo24784b();
                this.f81953g = b;
                b.mo24790a((rjz) this);
                this.f81953g.mo24791a((rka) this);
                if (bundle == null) {
                    mo46368b(4);
                    mo46367a(riq.f43084a, "2");
                }
            } catch (SecurityException e) {
                setResult(0);
                finish();
            }
        } else {
            Log.w("People.Avatar", "This activity is not available for restricted profile.");
            setResult(0);
            finish();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("app_id", this.f81955i);
        bundle.putString("account_name", this.f81956j);
        bundle.putString("page_gaia_id", this.f81957k);
        bundle.putBoolean("owner_loaded", this.f81948b);
        bundle.putParcelable("take_photo_uri", this.f81949c);
        bundle.putParcelable("pick_photo_uri", this.f81950d);
        bundle.putParcelable("remote_pick_photo_uri", this.f81958l);
        bundle.putParcelable("cropped_photo_uri", this.f81951e);
        bundle.putBoolean("result_pending", this.f81952f);
    }

    public final void onStart() {
        super.onStart();
        if (!this.f81953g.mo24805i() && !this.f81953g.mo24806j()) {
            this.f81953g.mo24801e();
        }
    }

    public final void onStop() {
        super.onStop();
        if (this.f81953g.mo24805i() || this.f81953g.mo24806j()) {
            this.f81953g.mo24803g();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.people.profile.AvatarChimeraActivity.a(int, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.gms.people.profile.AvatarChimeraActivity.a(com.google.android.gms.common.server.FavaDiagnosticsEntity, java.lang.String):void
      com.google.android.gms.people.profile.AvatarChimeraActivity.a(int, boolean):void */
    /* renamed from: b */
    public final void mo46368b(int i) {
        mo46365a(i, false);
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        if (!this.f81948b) {
            rjo rjo = allr.f73629a;
            amcf.m62587a(this.f81953g, this.f81956j, this.f81957k).mo9458a(this.f81959m);
            return;
        }
        Uri uri = this.f81958l;
        if (uri != null) {
            rjo rjo2 = allr.f73629a;
            amcy.m62629a(this.f81953g, uri.toString()).mo9458a(this.f81960n);
        } else if ((this.f81949c != null || this.f81950d != null) && !this.f81952f && this.f81951e != null) {
            m68070g();
        }
    }

    /* renamed from: a */
    public final void mo46365a(int i, boolean z) {
        if (cfyr.f186175a.mo6606a().mo83142a()) {
            bxvd da = amly.f75240d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amly amly = (amly) da.f164949b;
            amly.f75243b = i - 1;
            int i2 = amly.f75242a | 1;
            amly.f75242a = i2;
            amly.f75242a = i2 | 2;
            amly.f75244c = z;
            amly amly2 = (amly) da.mo74062i();
            String str = this.f81956j;
            bxvd da2 = amoh.f75593x.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            amoh amoh = (amoh) da2.f164949b;
            amly2.getClass();
            amoh.f75612r = amly2;
            amoh.f75595a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
            alml.m61288a(str, da2);
        }
    }

    /* renamed from: a */
    public final void mo46366a(Uri uri) {
        Intent className = new Intent().setClassName(this, "com.google.android.gms.people.profile.AvatarPreviewActivity");
        className.setAction("android.intent.action.VIEW");
        className.putExtra("com.google.android.gms.people.profile.EXTRA_ACCOUNT", this.f81956j);
        className.putExtra("com.google.android.gms.people.profile.EXTRA_URI", uri);
        startActivityForResult(className, 3);
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        mo46371f();
        mo46369d();
    }

    /* renamed from: a */
    public final void mo46367a(FavaDiagnosticsEntity favaDiagnosticsEntity, String str) {
        shy shy = new shy(this);
        shy.mo25579b(this.f81954h);
        shy.mo25581c(anlm.f77058b);
        shy.mo25576a(this.f81956j);
        shy.mo25573a(favaDiagnosticsEntity);
        if (str != null) {
            aoer aoer = new aoer();
            aoer.f78259b = str;
            aoer.f78260c.add(62);
            shy.mo25574a((ActionTargetEntity) aoer.mo42642a());
        }
        shz.m35341a(this, shy);
    }
}
