package p000;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.instantapps.p051ui.InstallSupervisorChimeraFragment$2;

/* renamed from: adlp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adlp extends adms {

    /* renamed from: a */
    public static final adfs f62123a = new adfs("InstallSupervisorChimeraFragment");

    /* renamed from: g */
    private static final Intent f62124g = new Intent().setPackage("com.android.vending").setAction("com.google.android.finsky.BIND_PLAY_INSTALL_SERVICE");

    /* renamed from: b */
    public boolean f62125b;

    /* renamed from: c */
    public eml f62126c;

    /* renamed from: h */
    private TextView f62127h;

    /* renamed from: i */
    private int f62128i = 0;

    /* renamed from: j */
    private final ServiceConnection f62129j = new adlo(this, "instantapps");

    /* renamed from: k */
    private final BroadcastReceiver f62130k = new InstallSupervisorChimeraFragment$2(this, "instantapps");

    /* renamed from: a */
    public final void mo33635a() {
        mo33637a("InstallSupervisorFragment.Failure");
        admp admp = this.f62172e;
        if (admp != null) {
            admp.mo33654a(0);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f62171d.mo33666k();
        if (bundle != null) {
            this.f62125b = bundle.getBoolean("InstallRequested", false);
            this.f62128i = bundle.getInt("LastInstallUpdate", 0);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.setup_download_supervisor_fragment, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.description);
        this.f62127h = textView;
        textView.setText(getString(C0126R.string.supervisor_downloading_description, getString(C0126R.string.supervisor_title)));
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("InstallRequested", this.f62125b);
        bundle.putInt("LastInstallUpdate", this.f62128i);
    }

    public final void onStart() {
        super.onStart();
        if (this.f62125b) {
            mo33636a(this.f62128i);
        } else if (!getActivity().bindService(f62124g, this.f62129j, 1)) {
            f62123a.mo33426b("Failed to bind to service", new Object[0]);
            mo33635a();
        }
        getActivity().registerReceiver(this.f62130k, new IntentFilter("com.google.android.finsky.installapi.ACTION_INSTALL_STATUS"));
    }

    public final void onStop() {
        super.onStop();
        if (this.f62126c != null) {
            try {
                getActivity().unbindService(this.f62129j);
            } catch (IllegalArgumentException e) {
                f62123a.mo33424a(e);
            }
            this.f62126c = null;
        }
        getActivity().unregisterReceiver(this.f62130k);
    }

    /* renamed from: a */
    public final void mo33636a(int i) {
        int i2;
        boolean z;
        boolean z2;
        this.f62128i = i;
        switch (i) {
            case 0:
            case 1:
                i2 = C0126R.string.supervisor_downloading_description;
                z2 = false;
                z = false;
                break;
            case 2:
            case 3:
            case 5:
                i2 = 0;
                z2 = false;
                z = true;
                break;
            case 4:
                i2 = C0126R.string.supervisor_installing_description;
                z2 = false;
                z = false;
                break;
            case 6:
                i2 = 0;
                z2 = true;
                z = false;
                break;
            default:
                f62123a.mo33429c("Unknown install update %d", Integer.valueOf(i));
                i2 = 0;
                z2 = false;
                z = false;
                break;
        }
        if (i2 != 0) {
            this.f62127h.setText(getString(i2, getString(C0126R.string.supervisor_title)));
        }
        if (z2) {
            mo33637a("InstallSupervisorFragment.Success");
            admp admp = this.f62172e;
            if (admp != null) {
                admp.mo33657g();
            }
        }
        if (z) {
            mo33635a();
        }
    }

    /* renamed from: a */
    public final void mo33637a(String str) {
        admq admq = this.f62173f;
        if (admq != null) {
            admq.mo33659a(str);
        }
    }
}
