package p000;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: oyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oyp extends ozg implements oya {

    /* renamed from: a */
    public static final bnsn f38631a = odk.m28481a("CAR.SETUP.FRX");

    /* renamed from: b */
    public oyc f38632b;

    /* renamed from: c */
    public ProgressBar f38633c;

    /* renamed from: a */
    public final bpeb mo22789a() {
        return bpeb.FRX_PRESETUP_INTRO_DOWNLOAD;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        bnsi d = f38631a.mo68390d();
        d.mo68432a("oyp", "onActivityResult", 107, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68411a("onActivityResult. requestCode=%d resultCode=%d", i, i2);
        if (i != 37) {
            return;
        }
        if (i2 == -1) {
            bnsi d2 = f38631a.mo68390d();
            d2.mo68432a("oyp", "onActivityResult", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("installation ok");
            mo22803b().f38656b.mo22797a(bpeb.FRX_PRESETUP_INTRO_DOWNLOAD, bpea.FRX_DOWNLOAD_START);
        } else if (i2 == 0) {
            bnsi d3 = f38631a.mo68390d();
            d3.mo68432a("oyp", "onActivityResult", 115, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d3.mo68405a("installation canceled");
            mo22790a(bpea.FRX_DOWNLOAD_START_FAILED);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Activity activity = getActivity();
        sdo.m34959a(activity);
        this.f38632b = new oyc(this, activity.getPackageManager(), "com.google.android.projection.gearhead", "");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Activity activity = getActivity();
        sdo.m34959a(activity);
        View a = mo22802a(activity, layoutInflater, viewGroup, false);
        m30034a(activity, a, (int) C0126R.C0127drawable.car_bottom_sheet_apps_illustration, (int) C0126R.string.car_setup_bottom_sheet_welcome_download_title, (int) C0126R.string.car_setup_bottom_sheet_welcome_download_body);
        a.findViewById(C0126R.C0129id.installing_progress_layout).setVisibility(0);
        this.f38633c = ozb.m30029a(getResources(), (ViewGroup) a);
        ((ImageView) a.findViewById(C0126R.C0129id.app_icon)).setImageResource(C0126R.C0127drawable.car_frx_install_icon);
        TextView textView = (TextView) a.findViewById(C0126R.C0129id.caption);
        textView.setVisibility(0);
        textView.setText((int) C0126R.string.car_setup_download_progress);
        this.f38632b.f38603g.mo2445a(this, new oyo(this));
        oyc oyc = this.f38632b;
        oyd oyd = (oyd) oyc.f38603g.mo2448b();
        bmxy.m108581a(oyd);
        int i = oyd.f38605a;
        if (!(i == 4 || i == 1 || i == 5)) {
            Intent a2 = oyi.m29995a(oyc.f38598b);
            if (a2.resolveActivity(oyc.f38600d) != null) {
                bnsi d = oyc.f38597a.mo68390d();
                d.mo68432a("oyc", "a", 137, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68420a("AppInstaller requesting install of pkg=%s", oyc.f38598b);
                oyc.f38599c.mo22770a(a2);
            } else {
                bnsi c = oyc.f38597a.mo68388c();
                c.mo68432a("oyc", "a", 143, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68420a("AppInstaller failed install intent unresolved for pkg=%s", oyc.f38598b);
                oyc.mo22776a(5);
            }
        }
        if (getContext() != null) {
            mo22803b();
        }
        return a;
    }

    /* renamed from: a */
    public final void mo22770a(Intent intent) {
        startActivityForResult(intent, 37);
    }

    /* renamed from: a */
    public final void mo22790a(bpea bpea) {
        mo22803b().f38656b.mo22797a(bpeb.FRX_PRESETUP_INTRO_DOWNLOAD, bpea);
        this.f38632b.f38603g.mo2444a(this);
        mo22803b().mo22804a(5);
    }

    /* renamed from: a */
    public final void mo22791a(oyd oyd) {
        int i;
        int i2 = oyd.f38605a;
        int i3 = (int) (oyd.f38606b * 100.0f);
        bnsi d = f38631a.mo68390d();
        d.mo68432a("oyp", "a", 124, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68411a("updateInstallationProgress status=%d, progress=%d", i2, i3);
        if (i2 == 1) {
            mo22803b().f38656b.mo22797a(bpeb.FRX_PRESETUP_INTRO_DOWNLOAD, bpea.FRX_DOWNLOAD_SUCCESS);
            this.f38632b.f38603g.mo2444a(this);
            ozj b = mo22803b();
            if (mo22803b().f38658d == 2) {
                i = 11;
            } else {
                i = 7;
            }
            b.mo22804a(i);
        } else if (i2 == 4) {
            this.f38633c.setIndeterminate(false);
            this.f38633c.setProgress(i3);
        } else if (i2 != 5) {
            this.f38633c.setIndeterminate(true);
        } else {
            mo22790a(bpea.FRX_DOWNLOAD_INSTALLATION_ERROR);
        }
    }
}
