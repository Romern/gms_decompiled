package p000;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: fpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class fpy extends qkh {

    /* renamed from: f */
    public static fpy f17114f = null;

    /* renamed from: b */
    public boolean f17115b = false;

    /* renamed from: c */
    public final C1223np f17116c = new C1223np();

    /* renamed from: d */
    public final List f17117d = Collections.synchronizedList(new ArrayList());

    /* renamed from: e */
    public final C1246ol f17118e = new C1246ol();

    public fpy() {
        adyl.m51422a();
    }

    /* renamed from: a */
    private final void m12159a(Menu menu) {
        MenuItem findItem = menu.findItem(C0126R.C0129id.show_hide_debug);
        if (!adyl.m51424a(this)) {
            findItem.setTitle((int) C0126R.string.common_show_debug);
        } else {
            findItem.setTitle((int) C0126R.string.common_hide_debug);
        }
        findItem.setVisible(cdlk.m133967b());
    }

    /* renamed from: e */
    private final void m12160e() {
        f17114f = this;
        Bundle bundle = new Bundle();
        foi.m12085a(bundle, this.f17117d);
        Intent intent = new Intent("com.google.android.gms.GOOGLE_SETTINGS_OPERATION").setPackage(getPackageName());
        bundle.putString("className", "GoogleSettingsActivity");
        intent.putExtras(bundle);
        startService(intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Intent mo7152a(int i, String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract svf mo7153a(CharSequence charSequence, int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7102a(sug sug, Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo11121b(int i, int i2) {
        svf svf = (svf) this.f17116c.get(0);
        if (svf != null) {
            List list = (List) this.f17118e.mo15646f(i);
            if (list != null && !list.isEmpty()) {
                Intent a = mo7152a(i2, getResources().getString(i2));
                sui b = qkh.m32282b(this);
                b.mo26106c(i2);
                sef.m35072a(list, a, "items");
                b.mo26100a(a);
                b.mo26104a(true);
                if (!svf.mo26151b(b)) {
                    svf.mo26149a(b);
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("No SettingsCategory found for id 0");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: i */
    public final void mo7107i() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (soz.m35807f(this)) {
            Log.e("GoogleSettingsActivity", "Cannot run for restricted users.");
            Intent intent = getIntent();
            if (!(intent == null || intent.getComponent() == null)) {
                spn.m35854a(this, intent.getComponent());
                String valueOf = String.valueOf(intent.getComponent());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
                sb.append("Disabling ");
                sb.append(valueOf);
                Log.w("GoogleSettingsActivity", sb.toString());
            }
            finish();
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (mo8628aW() != null) {
            mo8628aW().mo15853b(true);
        }
        m12160e();
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0126R.C0130menu.core_google_settings_menu, menu);
        if (soz.m35800c(this)) {
            m12159a(menu);
        }
        if (adyl.m51429e(this) && cdpc.f181504a.mo6606a().mo78137c()) {
            menu.findItem(C0126R.C0129id.usage_reporting).setVisible(true);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public final void onDestroy() {
        if (f17114f == this) {
            f17114f = null;
        }
        super.onDestroy();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C0126R.C0129id.settings_help) {
            adyl.m51423a(Uri.parse((String) ((bmzm) rsv.f43618g).f131273a), this);
            return true;
        } else if (itemId == C0126R.C0129id.usage_reporting) {
            adyl.m51428d(this);
            return true;
        } else if (itemId == C0126R.C0129id.settings_oss_licenses) {
            adyl.m51427c(this);
            return true;
        } else if (itemId == C0126R.C0129id.show_hide_debug) {
            SharedPreferences sharedPreferences = getSharedPreferences("googlesettings", 0);
            boolean z = sharedPreferences.getBoolean("ShowDebug", false);
            sharedPreferences.edit().putBoolean("ShowDebug", !z).commit();
            if (z) {
                this.f41601g.mo26097a((svf) this.f17116c.remove(2));
                return true;
            }
            m12160e();
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            finish();
            return true;
        }
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        if (!this.f17115b) {
            return true;
        }
        m12159a(menu);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11119a(int i, int i2) {
        mo11120a(i, mo7153a(getText(i2), i));
        this.f17118e.mo15637a(i, new ArrayList());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11120a(int i, svf svf) {
        this.f17116c.put(Integer.valueOf(i), svf);
    }
}
