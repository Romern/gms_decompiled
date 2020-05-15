package p000;

import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.app.net.NetworkUsageChimeraActivity;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;

/* renamed from: fow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fow extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ NetworkUsageChimeraActivity f17046a;

    /* renamed from: b */
    private final fov f17047b;

    public fow(NetworkUsageChimeraActivity networkUsageChimeraActivity, fov fov) {
        this.f17046a = networkUsageChimeraActivity;
        this.f17047b = fov;
    }

    /* access modifiers changed from: protected */
    public final Object doInBackground(Object... objArr) {
        this.f17046a.f9493c = sks.m35544a();
        NetworkUsageChimeraActivity networkUsageChimeraActivity = this.f17046a;
        SharedPreferences.Editor edit = networkUsageChimeraActivity.getSharedPreferences("NetworkUsagePrefs", 0).edit();
        if (ssk.m36236a(networkUsageChimeraActivity, 1) || networkUsageChimeraActivity.mo7143a(0)) {
            edit.putBoolean("CELLULAR_TAB_ENABLE", true);
            edit.apply();
        }
        if (ssk.m36236a(networkUsageChimeraActivity, 2) || networkUsageChimeraActivity.mo7143a(1)) {
            edit.putBoolean("WIFI_TAB_ENABLE", true);
            edit.apply();
        }
        if (!ssk.m36236a(networkUsageChimeraActivity, 3) && !networkUsageChimeraActivity.mo7143a(3)) {
            return null;
        }
        edit.putBoolean("ETHERNET_TAB_ENABLE", true);
        edit.apply();
        return null;
    }

    /* access modifiers changed from: protected */
    public final void onPostExecute(Object obj) {
        fop fop;
        fpe fpe;
        fov fov = this.f17047b;
        NetworkUsageChimeraActivity networkUsageChimeraActivity = fov.f17045a;
        networkUsageChimeraActivity.f9494d = (ViewPager) networkUsageChimeraActivity.findViewById(C0126R.C0129id.tab_content);
        NetworkUsageChimeraActivity networkUsageChimeraActivity2 = fov.f17045a;
        networkUsageChimeraActivity2.f9495e = new fop(networkUsageChimeraActivity2.getSupportFragmentManager(), fov.f17045a);
        SharedPreferences sharedPreferences = fov.f17045a.getSharedPreferences("NetworkUsagePrefs", 0);
        sharedPreferences.registerOnSharedPreferenceChangeListener(fov.f17045a.f9495e);
        NetworkUsageChimeraActivity networkUsageChimeraActivity3 = fov.f17045a;
        networkUsageChimeraActivity3.f9494d.mo2136a(networkUsageChimeraActivity3.f9495e);
        ArrayList arrayList = new ArrayList();
        NetworkUsageChimeraActivity networkUsageChimeraActivity4 = fov.f17045a;
        networkUsageChimeraActivity4.f9492b = (TabLayout) networkUsageChimeraActivity4.findViewById(C0126R.C0129id.network_tabs);
        if (sharedPreferences.getBoolean("CELLULAR_TAB_ENABLE", false)) {
            arrayList.add(fov.f17045a.getString(C0126R.string.data_usage_tab_mobile));
        }
        if (sharedPreferences.getBoolean("WIFI_TAB_ENABLE", false)) {
            arrayList.add(fov.f17045a.getString(C0126R.string.data_usage_tab_wifi));
        }
        if (sharedPreferences.getBoolean("ETHERNET_TAB_ENABLE", false)) {
            arrayList.add(fov.f17045a.getString(C0126R.string.data_usage_tab_ethernet));
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(fov.f17045a, 17367048, arrayList);
        arrayAdapter.setDropDownViewResource(17367049);
        fov.f17045a.f9496f.setAdapter((SpinnerAdapter) arrayAdapter);
        fov.f17045a.f9496f.setOnItemSelectedListener(new fou(fov));
        fov.f17045a.findViewById(C0126R.C0129id.spinner_linear_layout).setVisibility(0);
        fov.f17045a.f9492b.setVisibility(8);
        fov.f17045a.mo7144e();
        if (sharedPreferences.getBoolean("ETHERNET_TAB_ENABLE", false) && (fop = fov.f17045a.f9495e) != null && fop.f17025b.get(3) != null && (fpe = ((foo) fop.f17025b.get(3)).f17022b) != null && !fpe.f17074e.isEmpty() && !fpe.f17072a.isEmpty()) {
            fpc fpc = (fpc) fpe.f17072a.get(Integer.valueOf(((Integer) fpe.f17074e.get(0)).intValue()));
            bmzs.m108696a(fpc);
            if (fpc.f17064b.mo25754e() != 0) {
                arrayList.add(fov.f17045a.getString(C0126R.string.data_usage_tab_ethernet));
                arrayAdapter.setDropDownViewResource(17367049);
                fov.f17045a.f9496f.setAdapter((SpinnerAdapter) arrayAdapter);
            }
        }
    }
}
