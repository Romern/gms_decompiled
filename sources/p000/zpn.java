package p000;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: zpn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class zpn extends deu {

    /* renamed from: b */
    public suo f55660b;

    /* renamed from: c */
    private final int f55661c;

    /* renamed from: d */
    private final AdapterView.OnItemSelectedListener f55662d = new zpm(this);

    public zpn(int i) {
        this.f55661c = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo19186a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo31315e() {
        return this.f55660b.mo26114a();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        C1341rz aW = mo8628aW();
        sun sun = new sun(aW);
        sun.mo26112a(this.f55661c);
        sun.f45175a = this.f55662d;
        if (getIntent().hasExtra("EXTRA_ACCOUNT")) {
            str = getIntent().getStringExtra("EXTRA_ACCOUNT");
        } else if (!cdyl.f181915a.mo6606a().mo78454c() || !getIntent().hasExtra("authAccount")) {
            str = getSharedPreferences("PREFS_NAME", 0).getString("PREFS_KEY_ACCOUNT_NAME", null);
        } else {
            str = getIntent().getStringExtra("authAccount");
        }
        sun.f45176b = str;
        this.f55660b = sun.mo26111a();
        aW.mo15841a(4, 4);
        aW.mo15853b(true);
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem add = menu.add(0, 1, 0, (int) C0126R.string.common_list_apps_menu_help_and_feedback);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/mobile/?p=google_settings_fitness"));
        intent.setFlags(276824064);
        if (intent.resolveActivity(getPackageManager()) != null) {
            add.setIntent(intent);
            add.setVisible(true);
        } else {
            add.setVisible(false);
        }
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.f55660b.mo26118b();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        suo suo = this.f55660b;
        if (suo != null) {
            bundle.putString("common.google_account_spinner.selected_account", suo.getItem(suo.f45183b));
            bundle.putStringArray("common.google_account_spinner.account_names", suo.f45182a);
        }
    }
}
