package com.google.android.places.p095ui.placepicker;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.places.ui.placepicker.PlacePickerChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlacePickerChimeraActivity extends deu implements bind, bimv {

    /* renamed from: b */
    public boolean f151433b;

    /* renamed from: c */
    public rke f151434c;

    /* renamed from: d */
    private bine f151435d;

    /* renamed from: e */
    private bilt f151436e;

    /* renamed from: f */
    private bils f151437f;

    /* renamed from: g */
    private rke f151438g;

    /* renamed from: h */
    private int f151439h;

    /* renamed from: i */
    private final Bundle m117773i() {
        Bundle extras = getIntent().getExtras();
        return extras == null ? new Bundle() : extras;
    }

    /* renamed from: a */
    public final void mo64770a() {
        aeig aeig = new aeig();
        LocationRequest a = LocationRequest.m66854a();
        a.mo43553c(100);
        aeig.mo34172a(a);
        LocationSettingsRequest a2 = aeig.mo34171a();
        rkb rkb = mo64784e().f120859c;
        this.f151434c = rkb.mo24787a((rle) new aekq(rkb, a2));
        this.f151434c.mo9459a(new bimz(this), cggj.m145237d(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    public final LocationRequestInternal mo64771b() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.mo43553c(100);
        locationRequest.mo43554c(5000L);
        locationRequest.mo43552b(16L);
        LocationRequestInternal a = LocationRequestInternal.m66889a("places_place_picker", locationRequest);
        if (m117773i().getString("gcore_client_name") != null) {
            a.mo43611a();
        }
        ComponentName b = spn.m35865b((Activity) this);
        if (b != null) {
            a.mo43613a(Collections.singletonList(new ClientIdentity(spn.m35897i(this, b.getPackageName()), b.getPackageName())));
        }
        return a;
    }

    /* renamed from: e */
    public final bils mo64784e() {
        if (this.f151437f == null) {
            this.f151437f = new bils(this, spn.m35852a((Activity) this), m117773i().getString("gcore_client_name"), m117773i().getString("account_name"));
        }
        return this.f151437f;
    }

    /* renamed from: g */
    public final binc mo64785g() {
        return new binc(spn.m35865b((Activity) this), m117773i());
    }

    /* renamed from: h */
    public final bilr mo64786h() {
        return new bilr(this);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2) {
            setResult(i2, intent);
            finish();
        }
    }

    public final void onBackPressed() {
        bine bine = this.f151435d;
        if (bine != null) {
            bine.mo64790b();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        if (r2 != 3) goto L_0x0063;
     */
    public final void onCreate(Bundle bundle) {
        int i;
        Integer num;
        super.onCreate(bundle);
        ComponentName b = spn.m35865b((Activity) this);
        if (b == null || b.getPackageName() == null) {
            if (Log.isLoggable("Places", 6)) {
                Log.e("Places", "Cannot find caller. Did you forget to use startActivityForResult?");
            }
            finish();
            return;
        }
        if (bundle != null) {
            this.f151433b = bundle.getBoolean("api_key_verified");
            i = bundle.getInt("launch_mode", 0);
            this.f151439h = i;
        } else {
            this.f151439h = 0;
            i = 0;
        }
        if (i == 0) {
            String packageName = b.getPackageName();
            for (String str : bmyx.m108640a(',').mo66918a((CharSequence) cggj.f186839a.mo6606a().mo83705e())) {
                if (str.equals(packageName)) {
                    this.f151439h = 3;
                    if (bundle == null) {
                        Intent intent = new Intent();
                        intent.setClassName(this, "com.google.android.location.places.ui.autocomplete.AutocompleteActivity");
                        Bundle extras = getIntent().getExtras();
                        if (extras != null) {
                            intent.putExtras(extras);
                        }
                        intent.putExtra("forwarded_app", spn.m35852a((Activity) this));
                        intent.putExtra("origin", 3);
                        intent.putExtra("mode", 1);
                        startActivityForResult(intent, 2);
                        return;
                    }
                    return;
                }
            }
            this.f151439h = 1;
        }
        setContentView((int) C0126R.C0128layout.place_picker_main);
        binf binf = new binf(getSupportFragmentManager());
        bine bine = (bine) binf.f120993a.findFragmentByTag("state_controller_fragment");
        if (bine == null) {
            bine = new bine();
            bine.setRetainInstance(true);
            binf.f120993a.beginTransaction().add(bine, "state_controller_fragment").commit();
        }
        this.f151435d = bine;
        Intent intent2 = getIntent();
        Integer num2 = null;
        if (intent2.hasExtra("primary_color")) {
            num = Integer.valueOf(intent2.getIntExtra("primary_color", 0));
        } else {
            num = null;
        }
        if (intent2.hasExtra("primary_color_dark")) {
            num2 = Integer.valueOf(intent2.getIntExtra("primary_color_dark", 0));
        }
        if (intent2.getBooleanExtra("hide_nearby_places", false)) {
            this.f151435d.f120972c = false;
        }
        if (intent2.hasExtra("account_name")) {
            this.f151435d.f120971b = intent2.getStringExtra("account_name");
        }
        String a = spn.m35852a((Activity) this);
        bine bine2 = this.f151435d;
        int intExtra = intent2.getIntExtra("reference_marker_overlay_resource_id", -1);
        int intExtra2 = intent2.getIntExtra("reference_marker_overlay_width_meters", -1);
        int intExtra3 = intent2.getIntExtra("reference_marker_overlay_height_meters", -1);
        if (!(intExtra == -1 || intExtra2 == -1 || intExtra3 == -1)) {
            bine2.f120975f = a;
            bine2.f120976g = true;
            bine2.f120977h = intExtra;
            bine2.f120978i = intExtra2;
            bine2.f120979j = intExtra3;
        }
        bine bine3 = this.f151435d;
        bine3.f120973d = num;
        bine3.f120974e = num2;
        bine3.mo64792c();
        this.f151435d.f120970a = this;
        rjo rjo = aeie.f63411a;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        bine bine = this.f151435d;
        if (bine != null) {
            bine.f120970a = null;
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("api_key_verified", this.f151433b);
        bundle.putInt("launch_mode", this.f151439h);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        if (this.f151436e == null) {
            mo64784e();
            rjo rjo = aema.f63501a;
            this.f151436e = new bilt(this);
        }
        if (!this.f151433b) {
            rke rke = this.f151438g;
            if (rke != null) {
                rke.mo9460b();
            }
            rjo rjo2 = aema.f63501a;
            rkb rkb = mo64784e().f120858b;
            rle a = rkb.mo24787a((rle) new aemv(aema.f63501a, rkb));
            this.f151438g = a;
            a.mo9459a(new bina(this), cggj.m145237d(), TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        rke rke = this.f151434c;
        if (rke != null) {
            rke.mo9460b();
            this.f151434c = null;
        }
        super.onStop();
    }
}
