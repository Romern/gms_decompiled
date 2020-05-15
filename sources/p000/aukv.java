package p000;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.preference.Preference;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.trustagent.PersonalUnlockingSettingsFragment$1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: aukv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aukv extends aupa {

    /* renamed from: c */
    public static final aunx f91993c = new aunx("TrustAgent", "PersonalUnlockingSettingsFragment");

    /* renamed from: d */
    public final List f91994d = new ArrayList();

    /* renamed from: e */
    public final Map f91995e = new HashMap();

    /* renamed from: f */
    public aumr f91996f;

    /* renamed from: h */
    private final auku f91997h = new auku(this);

    /* renamed from: i */
    private final Map f91998i = new HashMap();

    /* renamed from: j */
    private final BroadcastReceiver f91999j = new PersonalUnlockingSettingsFragment$1(this, "trustagent");

    /* renamed from: k */
    private boolean f92000k;

    /* renamed from: i */
    private final void m77239i() {
        if (getLoaderManager().getLoader(0) == null) {
            getLoaderManager().initLoader(0, new Bundle(), this.f91997h);
        } else {
            getLoaderManager().restartLoader(0, new Bundle(), this.f91997h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ boolean mo50625b(String str) {
        Bundle bundle = (Bundle) this.f91995e.get(str);
        Bundle bundle2 = bundle.getBundle("key_trustlet_intent_extras");
        String string = bundle.getString("key_trustlet_settings_activity_class_name");
        String string2 = bundle.getString("key_trustlet_settings_activity_intent_action");
        String string3 = bundle.getString("key_trustlet_settings_activity_package_name");
        Intent intent = new Intent();
        if (string != null) {
            intent.setClassName(rpr.m34216b(), string);
        } else {
            intent.setAction(string2);
        }
        intent.setPackage(string3);
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        try {
            startActivity(intent);
            return true;
        } catch (ActivityNotFoundException | SecurityException e) {
            f91993c.mo50710a("Cannot start activity.", e, new Object[0]).mo50706a();
            return false;
        }
    }

    /* renamed from: c */
    public final void mo9322c() {
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: d */
    public final void mo17248d() {
        char c;
        List list = this.f91994d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String str = (String) list.get(i);
            boolean z = ((Bundle) this.f91995e.get(str)).getBoolean("key_trustlet_is_suppored");
            String string = ((Bundle) this.f91995e.get(str)).getString("key_trustlet_pref_key");
            int i2 = ((Bundle) this.f91995e.get(str)).getInt("key_trustlet_icon_res_id");
            String string2 = ((Bundle) this.f91995e.get(str)).getString("key_trustlet_pref_title");
            String string3 = ((Bundle) this.f91995e.get(str)).getString("key_trustlet_pref_summary");
            int i3 = 1;
            if (string == null || i2 == 0 || string2 == null || string3 == null) {
                f91993c.mo50711a("trustlet %s has empty fields. Do not initialize trustlet preference. ", str);
            } else {
                Preference a = mo2204a((CharSequence) string);
                if (a == null) {
                    a = new Preference(getActivity());
                    a.mo1990c(string);
                    a.f1607w = false;
                    a.mo2018u();
                    a.mo1986b((CharSequence) string2);
                    a.mo1966a((CharSequence) string3);
                    a.mo1989c(i2);
                    switch (str.hashCode()) {
                        case -859925913:
                            if (str.equals("Face Unlock")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -581416398:
                            if (str.equals("Voice Unlock")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -549315433:
                            if (str.equals("PhonePosition")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -322116978:
                            if (str.equals("Bluetooth")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 77195495:
                            if (str.equals("Place")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c != 0) {
                        if (c != 1) {
                            i3 = c != 2 ? c != 3 ? c != 4 ? 999 : 5 : 4 : 3;
                        } else {
                            i3 = 2;
                        }
                    }
                    a.mo1974a(i3);
                    mo9317a().mo2019a(a);
                }
                if (z) {
                    int color = getResources().getColor(C0126R.color.coffee_personal_unlocking_icon_color);
                    Drawable drawable = getResources().getDrawable(i2);
                    drawable.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
                    a.mo1976a(drawable);
                    this.f91998i.put(str, a);
                } else {
                    mo9317a().mo2020b(a);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo50626e() {
        m77239i();
        mo50627f();
    }

    /* renamed from: f */
    public final void mo50627f() {
        if (((aupa) this).f92243g && this.f92000k) {
            List list = this.f91994d;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = (String) list.get(i);
                Preference preference = (Preference) this.f91998i.get(str);
                boolean z = ((Bundle) this.f91995e.get(str)).getBoolean("key_trustlet_is_enabled_by_device_policy");
                String string = ((Bundle) this.f91995e.get(str)).getString("key_trustlet_pref_summary");
                if (preference != null) {
                    if (z) {
                        preference.mo1981a(true);
                        preference.f1600p = new aukt(this, str);
                        preference.mo1966a((CharSequence) string);
                    } else {
                        preference.mo1966a((CharSequence) getString(C0126R.string.auth_trust_agent_dpm_disabled));
                        preference.mo1981a(false);
                    }
                }
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f91993c.mo50711a("onCreate", new Object[0]);
        mo9318a((int) C0126R.xml.personal_unlocking_settings_preferences);
        this.f91996f = aumr.m77322a(getActivity());
        mo17248d();
        this.f92000k = true;
        m77239i();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.android.facelock.FACE_UNLOCK_SETUP_COMPLETE");
        getActivity().registerReceiver(this.f91999j, intentFilter);
    }

    public final void onDestroy() {
        f91993c.mo50711a("onDestroy", new Object[0]);
        getActivity().unregisterReceiver(this.f91999j);
        super.onDestroy();
    }
}
