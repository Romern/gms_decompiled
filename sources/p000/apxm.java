package p000;

import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.security.settings.VerifyAppsSettingsChimeraActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: apxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apxm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f85068a;

    /* renamed from: b */
    final /* synthetic */ VerifyAppsSettingsChimeraActivity f85069b;

    public apxm(VerifyAppsSettingsChimeraActivity verifyAppsSettingsChimeraActivity, boolean z) {
        this.f85069b = verifyAppsSettingsChimeraActivity;
        this.f85068a = z;
    }

    public final void run() {
        ArrayList arrayList;
        apup a = new apus(this.f85069b).mo47632a(this.f85068a, 60, TimeUnit.SECONDS);
        VerifyAppsSettingsChimeraActivity verifyAppsSettingsChimeraActivity = this.f85069b;
        verifyAppsSettingsChimeraActivity.f107544p = false;
        if (verifyAppsSettingsChimeraActivity.f41601g != null) {
            verifyAppsSettingsChimeraActivity.runOnUiThread(new apxn(verifyAppsSettingsChimeraActivity));
            if (a != null) {
                long j = a.f84938a;
                Map h = verifyAppsSettingsChimeraActivity.mo58938h();
                if (h == null || h.isEmpty()) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry : h.entrySet()) {
                        if (((Long) entry.getKey()).longValue() <= j) {
                            for (PackageInfo packageInfo : (List) entry.getValue()) {
                                arrayList2.add(packageInfo.packageName);
                            }
                        }
                    }
                    arrayList = arrayList2;
                }
                verifyAppsSettingsChimeraActivity.runOnUiThread(new apxp(verifyAppsSettingsChimeraActivity, j, arrayList, a));
            } else {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) verifyAppsSettingsChimeraActivity.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    verifyAppsSettingsChimeraActivity.mo58936b((int) C0126R.string.common_network_unavailable);
                } else {
                    verifyAppsSettingsChimeraActivity.mo58936b((int) C0126R.string.play_protect_scan_timed_out);
                }
            }
        }
        synchronized (this.f85069b) {
            this.f85069b.f107543o = false;
        }
    }
}
