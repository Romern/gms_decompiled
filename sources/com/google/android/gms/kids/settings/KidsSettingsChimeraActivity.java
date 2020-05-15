package com.google.android.gms.kids.settings;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Fragment;
import java.util.UUID;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class KidsSettingsChimeraActivity extends aduk {

    /* renamed from: d */
    private static final bjbc f79260d;

    /* renamed from: b */
    public adtv f79261b;

    static {
        bjbb bjbb = new bjbb();
        bjbb.f122457a = 2132018265;
        bjbb.f122458b = true;
        f79260d = bjbb.mo64964a();
    }

    /* renamed from: a */
    public static ComponentName m66806a(Context context) {
        return new ComponentName(context, "com.google.android.gms.kids.settings.KidsSettingsActivity");
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Fragment fragment;
        super.onCreate(bundle);
        setTheme(f79260d.mo64965a(getIntent()));
        this.f79261b = (adtv) aduo.m51219a(this).mo3444a(adtv.class);
        int i = 31;
        if ("com.google.android.gms.kids.settings.GOLD_FROM_FL".equals(getIntent().getAction())) {
            i = 34;
        } else if ("com.google.android.gms.kids.settings.GOLD_FROM_SUNSHINE".equals(getIntent().getAction())) {
            i = 35;
        } else if ("com.google.android.gms.kids.settings.GOLD_FROM_PLAY_STORE".equals(getIntent().getAction())) {
            if (ceqw.f183329a.mo6606a().mo79649b()) {
                String stringExtra = getIntent().getStringExtra("play_store_entry_point");
                if (((stringExtra.hashCode() == -848597455 && stringExtra.equals("play_store_family_home")) ? (char) 0 : 65535) == 0) {
                    i = 36;
                }
            }
            i = 1;
        } else if (getIntent().hasCategory("com.android.settings.suggested.category.PARENTAL_CONTROLS")) {
            i = 33;
        } else if (getIntent().getComponent() != null && "com.google.android.gms.kids.settings.KidsSettingsActivity".equals(getIntent().getComponent().getClassName())) {
            i = 32;
        }
        if (bundle != null) {
            this.f79261b.f62729e = bundle.getString("session-id");
            this.f79261b.f62730f = i;
        } else if (getSharedPreferences("settings", 0).getBoolean("has_supervised_account", false)) {
            this.f79261b.mo33821a(602);
            if (!ceqs.f183325a.mo6606a().mo79646a()) {
                startActivity(this.f79261b.mo33820a(getIntent()));
            } else {
                startActivityForResult(new Intent("com.google.android.gms.kids.action.VIEW_PARENTAL_CONTROLS").setComponent(new ComponentName(getApplication(), "com.google.android.gms.kids.TransparencyActivity")), 0);
            }
            finish();
        } else {
            int i2 = i - 1;
            if (i2 != 0) {
                if (i2 != 33) {
                    fragment = new adtj();
                } else {
                    fragment = adty.m51203a(btur.SETTINGS_NEXT_STEPS);
                }
                getSupportFragmentManager().beginTransaction().add(16908290, fragment, "fragment").commitNow();
                this.f79261b.f62729e = getIntent().hasExtra("session-id") ? getIntent().getStringExtra("session-id") : UUID.randomUUID().toString();
                adtv adtv = this.f79261b;
                adtv.f62730f = i;
                if (ceqw.f183329a.mo6606a().mo79653f()) {
                    qws qws = adtv.f62728d;
                    bxvd da = btum.f150505c.mo74144da();
                    bxvd da2 = btuk.f150497e.mo74144da();
                    int i3 = adtv.f62730f;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    btuk btuk = (btuk) da2.f164949b;
                    int i4 = i3 - 1;
                    if (i3 != 0) {
                        btuk.f150500b = i4;
                        int i5 = 1 | btuk.f150499a;
                        btuk.f150499a = i5;
                        String str = adtv.f62729e;
                        str.getClass();
                        btuk.f150499a = i5 | 2;
                        btuk.f150501c = str;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        btum btum = (btum) da.f164949b;
                        btuk btuk2 = (btuk) da2.mo74062i();
                        btuk2.getClass();
                        btum.f150508b = btuk2;
                        btum.f150507a = 2;
                        qwo a = qws.mo24333a(da.mo74062i());
                        a.f42320d = "KIDS_SUPERVISION";
                        a.mo24328b(300);
                        a.mo24327b();
                        return;
                    }
                    throw null;
                }
                return;
            }
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("session-id", this.f79261b.f62729e);
    }
}
