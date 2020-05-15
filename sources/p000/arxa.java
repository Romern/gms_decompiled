package p000;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.chimera.Activity;
import com.google.android.gms.smartdevice.setup.p066ui.AppInstallTrackerFragment$2;

/* renamed from: arxa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arxa extends arzb {

    /* renamed from: a */
    public arwz f88394a;

    /* renamed from: b */
    public String f88395b;

    /* renamed from: c */
    public Runnable f88396c;

    /* renamed from: d */
    private Handler f88397d;

    /* renamed from: e */
    private BroadcastReceiver f88398e;

    /* renamed from: a */
    public final void mo48898a() {
        Runnable runnable = this.f88396c;
        if (runnable != null) {
            this.f88397d.removeCallbacks(runnable);
            this.f88396c = null;
        }
    }

    /* renamed from: b */
    public final void mo48899b() {
        Activity activity = getActivity();
        BroadcastReceiver broadcastReceiver = this.f88398e;
        if (broadcastReceiver != null && activity != null) {
            activity.unregisterReceiver(broadcastReceiver);
            this.f88398e = null;
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f88394a = (arwz) activity;
        } catch (ClassCastException e) {
            throw new RuntimeException("Containing activity must implement AppInstallTrackerFragment.Listener", e);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f88397d = new adzt(Looper.getMainLooper());
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("smartdevice.appPackage") : null;
        bmxy.m108581a(string);
        this.f88395b = string;
    }

    public final void onPause() {
        mo48898a();
        mo48899b();
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (new ascc(activity).mo49035a(this.f88395b)) {
            this.f88394a.mo48896a();
            return;
        }
        arwy arwy = new arwy(this);
        AppInstallTrackerFragment$2 appInstallTrackerFragment$2 = new AppInstallTrackerFragment$2(this, "smartdevice");
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        this.f88396c = arwy;
        this.f88398e = appInstallTrackerFragment$2;
        activity.registerReceiver(appInstallTrackerFragment$2, intentFilter);
        this.f88397d.postDelayed(arwy, 120000);
    }
}
