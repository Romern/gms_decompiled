package p000;

import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ProgressBar;
import com.felicanetworks.mfc.C0126R;
import java.util.Iterator;
import java.util.List;

/* renamed from: vtf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vtf extends vsw {

    /* renamed from: a */
    public vsi f49947a;

    /* renamed from: b */
    private vte f49948b;

    /* renamed from: c */
    private ProgressBar f49949c;

    /* renamed from: a */
    public final void mo28835a() {
        Log.i("CAR.DRIVINGMODE", "DrivingModeFrxDownloadFragment#onInstallError");
        mo28822m().mo28865b(new vtg());
        this.f49930g.mo28758a(bpdi.DRIVING_MODE, bpdh.DRIVING_MODE_GEARHEAD_INSTALL_FAILURE);
    }

    /* renamed from: b */
    public final bpeb mo28806b() {
        return bpeb.DRIVING_MODE_FRX_DOWNLOAD;
    }

    /* renamed from: c */
    public final CharSequence mo28807c() {
        return getString(C0126R.string.car_driving_mode_frx_loading_screen_header);
    }

    /* renamed from: h */
    public final CharSequence mo28817h() {
        return getString(C0126R.string.car_driving_mode_frx_download_body);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        StringBuilder sb = new StringBuilder(80);
        sb.append("DrivingModeFrxDownloadFragment#onActivityResult: ");
        sb.append(i);
        sb.append(" rescode:");
        sb.append(i2);
        Log.i("CAR.DRIVINGMODE", sb.toString());
        if (i == 1 && i2 == 0) {
            mo28835a();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        vuk.m41322a();
        vsi f = vuk.m41327f(getContext());
        this.f49947a = f;
        f.mo28795k();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ProgressBar progressBar = (ProgressBar) ((ViewStub) onCreateView.findViewById(C0126R.C0129id.layout_progress_stub)).inflate();
        this.f49949c = progressBar;
        progressBar.setIndeterminate(false);
        this.f49949c.setMax(100);
        return onCreateView;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f49947a.mo28798n();
    }

    public final void onStart() {
        super.onStart();
        vte vte = new vte(this, getActivity());
        this.f49948b = vte;
        vuk.m41322a();
        vte.f49941b = vte.f49940a.getPackageManager();
        vte.f49942c = vte.f49941b.getPackageInstaller();
        try {
            if (((long) vte.f49941b.getPackageInfo("com.google.android.projection.gearhead", 0).versionCode) >= ccul.m131705d()) {
                vte.f49944e = 1;
            } else {
                vte.f49944e = 2;
            }
        } catch (PackageManager.NameNotFoundException e) {
            vte.f49944e = 3;
        }
        vte.f49942c.registerSessionCallback(vte);
        List<PackageInstaller.SessionInfo> allSessions = vte.f49942c.getAllSessions();
        if (allSessions != null) {
            Iterator<PackageInstaller.SessionInfo> it = allSessions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PackageInstaller.SessionInfo next = it.next();
                if ("com.google.android.projection.gearhead".equals(next.getAppPackageName())) {
                    vte.f49943d = next.getSessionId();
                    vte.f49944e = 4;
                    vte.f49945f = next.getProgress();
                    break;
                }
            }
        }
        int i = this.f49948b.f49944e;
        StringBuilder sb = new StringBuilder(39);
        sb.append("Android Auto package state: ");
        sb.append(i);
        Log.i("CAR.DRIVINGMODE", sb.toString());
        if (i == 2 || i == 3) {
            vte vte2 = this.f49948b;
            Intent intent = new Intent("com.android.vending.billing.PURCHASE");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setPackage("com.android.vending");
            intent.putExtra("backend", 3);
            intent.putExtra("document_type", 1);
            intent.putExtra("full_docid", "com.google.android.projection.gearhead");
            intent.putExtra("backend_docid", "com.google.android.projection.gearhead");
            intent.putExtra("offer_type", 1);
            vte2.f49946g.startActivityForResult(intent, 1);
            vte2.f49946g.f49930g.mo28758a(bpdi.DRIVING_MODE, vte2.f49944e == 2 ? bpdh.DRIVING_MODE_GEARHEAD_INSTALL_START_UPDATE : bpdh.DRIVING_MODE_GEARHEAD_INSTALL_START);
        } else if (i == 1) {
            mo28822m().mo28866c(new vth());
        } else if (i == 4) {
            mo28836a(this.f49948b.f49945f);
        }
    }

    public final void onStop() {
        super.onStop();
        vte vte = this.f49948b;
        vte.f49942c.unregisterSessionCallback(vte);
        this.f49948b = null;
    }

    /* renamed from: a */
    public final void mo28836a(float f) {
        this.f49949c.setProgress((int) (f * 100.0f));
    }
}
