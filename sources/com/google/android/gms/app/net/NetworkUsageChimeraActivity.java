package com.google.android.gms.app.net;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.viewpager.widget.ViewPager;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetworkUsageChimeraActivity extends deu {

    /* renamed from: b */
    public TabLayout f9492b;

    /* renamed from: c */
    public Map f9493c;

    /* renamed from: d */
    public ViewPager f9494d;

    /* renamed from: e */
    public fop f9495e;

    /* renamed from: f */
    public Spinner f9496f;

    /* renamed from: g */
    private WeakReference f9497g;

    /* renamed from: a */
    public final boolean mo7143a(int i) {
        Map map = this.f9493c;
        if (map == null || map.isEmpty()) {
            return false;
        }
        return this.f9493c.values().contains(Integer.valueOf(i));
    }

    /* renamed from: e */
    public final synchronized void mo7144e() {
        Future future;
        int i = Build.VERSION.SDK_INT;
        if (!((Boolean) skj.f44624g.mo58455c()).booleanValue()) {
            future = smb.m35631a().mo25735a(getContentResolver(), Process.myUid());
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            future = smb.m35631a().mo25736a(rpr.m34216b(), Process.myUid(), smh.m35658c(currentTimeMillis).longValue(), currentTimeMillis, false, true);
        }
        new fox(this.f9495e, future).execute(new Void[0]);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.common_activity_network_usage);
        this.f9496f = (Spinner) findViewById(C0126R.C0129id.network_spinner);
        cdlq.m133991c();
        fow fow = new fow(this, new fov(this));
        this.f9497g = new WeakReference(fow);
        fow.execute(new Object[0]);
        if (mo8628aW() != null) {
            mo8628aW().mo15853b(true);
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0126R.C0130menu.common_menu_network_usage, menu);
        if (soz.m35800c(this) || cdpc.f181504a.mo6606a().mo78135a()) {
            menu.findItem(C0126R.C0129id.action_launch_advanced_item).setVisible(true);
        } else {
            menu.findItem(C0126R.C0129id.action_launch_advanced_item).setVisible(false);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C0126R.C0129id.action_launch_advanced_item) {
            startActivity(new Intent().setClassName(this, "com.google.android.gms.app.net.NetworkUsageActivityAdvanced"));
        } else if (itemId == C0126R.C0129id.action_update) {
            mo7144e();
            Toast.makeText(this, (int) C0126R.string.common_network_usage_updating_report, 1).show();
            return true;
        } else if (itemId == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        getSharedPreferences("NetworkUsagePrefs", 0).unregisterOnSharedPreferenceChangeListener(this.f9495e);
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        AsyncTask.Status status;
        super.onStop();
        WeakReference weakReference = this.f9497g;
        if (weakReference != null) {
            fow fow = (fow) weakReference.get();
            if (fow != null && ((status = fow.getStatus()) == AsyncTask.Status.RUNNING || status == AsyncTask.Status.PENDING)) {
                fow.cancel(true);
            }
            this.f9497g.clear();
        }
    }
}
