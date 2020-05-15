package com.google.android.gms.app.net;

import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentTransaction;
import java.io.File;
import java.util.concurrent.Future;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetworkUsageChimeraActivityAdvanced extends deu implements fos, foj, fpm {

    /* renamed from: b */
    public fpk f9498b;

    /* renamed from: c */
    private fom f9499c;

    /* renamed from: a */
    public final void mo7145a(int i, int i2, int i3) {
        ((Button) this.f9498b.f17086d.findViewById(i)).setText(fpk.m12123a(i2, i3));
    }

    /* renamed from: e */
    public final void mo7149e() {
        if (this.f9499c == null) {
            this.f9499c = new fom();
        }
        mo7147a(this.f9499c);
        this.f9499c.f17016a.f17041e = this;
    }

    public final void onBackPressed() {
        fpk fpk;
        if (this.f9499c.isVisible() || ((fpk = this.f9498b) != null && fpk.isVisible())) {
            super.onBackPressed();
            return;
        }
        mo7149e();
        invalidateOptionsMenu();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.common_activity_network_usage_advanced);
        mo7149e();
        if (cdkf.f181108a.mo6606a().mo77793d()) {
            Spinner spinner = (Spinner) findViewById(C0126R.C0129id.network_stats_spinner);
            findViewById(C0126R.C0129id.spinner_linear_layout).setVisibility(0);
            ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, new String[]{"Data Usage", "Share Wireless Radio Activity Summary"});
            arrayAdapter.setDropDownViewResource(17367049);
            spinner.setAdapter((SpinnerAdapter) arrayAdapter);
            spinner.setOnItemSelectedListener(new foy(this));
            spinner.setVisibility(0);
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0126R.C0130menu.common_menu_network_usage_advanced, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "WirelessRadioActivitySummary.txt").delete();
        super.onDestroy();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        fpk fpk;
        Future future;
        int itemId = menuItem.getItemId();
        if (itemId == C0126R.C0129id.action_update) {
            int i = Build.VERSION.SDK_INT;
            if (!((Boolean) skj.f44624g.mo58455c()).booleanValue()) {
                future = smb.m35631a().mo25735a(getContentResolver(), Process.myUid());
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                future = smb.m35631a().mo25736a(rpr.m34216b(), Process.myUid(), smh.m35658c(currentTimeMillis).longValue(), currentTimeMillis, false, true);
            }
            new foz(this.f9499c, future).execute(new Void[0]);
            Toast.makeText(this, "Refreshing network usage report.", 1).show();
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            if (this.f9499c.isVisible() || ((fpk = this.f9498b) != null && fpk.isVisible())) {
                C1094ix.m16252a(getContainerActivity());
            } else {
                mo7149e();
                invalidateOptionsMenu();
            }
            return true;
        }
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem = menu.findItem(C0126R.C0129id.action_update);
        if (this.f9499c.isVisible()) {
            findItem.setVisible(true);
        } else {
            findItem.setVisible(false);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    /* renamed from: a */
    public final void mo7146a(int i, int i2, int i3, int i4) {
        ((Button) this.f9498b.f17086d.findViewById(i)).setText(fpk.m12124a(i4, i3, i2));
    }

    /* renamed from: a */
    public final void mo7147a(Fragment fragment) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(C0126R.C0129id.network_usage_activity_advanced_content, fragment);
        beginTransaction.commit();
        getSupportFragmentManager().executePendingTransactions();
    }

    /* renamed from: a */
    public final void mo7148a(smj smj) {
        String smj2 = smj.toString();
        fon fon = new fon();
        Bundle bundle = new Bundle();
        bundle.putString("SUMMARY_KEY", smj2);
        fon.setArguments(bundle);
        mo7147a(fon);
    }
}
