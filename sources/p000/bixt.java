package p000;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import com.google.android.setupcompat.logging.CustomEvent;
import com.google.android.setupcompat.logging.MetricKey;
import java.util.concurrent.TimeUnit;

/* renamed from: bixt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bixt extends Fragment {

    /* renamed from: a */
    private static final String f122231a = bixt.class.getSimpleName();

    /* renamed from: b */
    private MetricKey f122232b;

    /* renamed from: c */
    private long f122233c;

    /* renamed from: d */
    private long f122234d = 0;

    public bixt() {
        setRetainInstance(true);
    }

    /* renamed from: a */
    public static void m102950a(Activity activity) {
        if (bizc.m103026b(activity.getIntent())) {
            bixy a = bixy.m102959a(activity.getApplicationContext());
            String a2 = bixs.m102949a(activity);
            Bundle bundle = new Bundle();
            bundle.putString("screenName", bixs.m102949a(activity));
            bundle.putString("intentAction", activity.getIntent().getAction());
            a.mo64853a(a2, bundle);
            int i = Build.VERSION.SDK_INT;
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager != null && !fragmentManager.isDestroyed()) {
                Fragment findFragmentByTag = fragmentManager.findFragmentByTag("lifecycle_monitor");
                if (findFragmentByTag == null) {
                    bixt bixt = new bixt();
                    try {
                        fragmentManager.beginTransaction().add(bixt, "lifecycle_monitor").commitNow();
                        findFragmentByTag = bixt;
                    } catch (IllegalStateException e) {
                        String str = f122231a;
                        String valueOf = String.valueOf(activity.getComponentName());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                        sb.append("Error occurred when attach to Activity:");
                        sb.append(valueOf);
                        Log.e(str, sb.toString(), e);
                    }
                } else if (!(findFragmentByTag instanceof bixt)) {
                    Log.wtf(f122231a, String.valueOf(activity.getClass().getSimpleName()).concat(" Incorrect instance on lifecycle fragment."));
                    return;
                }
                bixt bixt2 = (bixt) findFragmentByTag;
            }
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f122232b = MetricKey.m117809a("ScreenDuration", getActivity());
    }

    public final void onDetach() {
        boolean z;
        super.onDetach();
        Activity activity = getActivity();
        MetricKey metricKey = this.f122232b;
        long millis = TimeUnit.NANOSECONDS.toMillis(this.f122234d);
        bixv.m102956a(activity, "Context cannot be null.");
        bixv.m102956a(metricKey, "Timer name cannot be null.");
        if (millis >= 0) {
            z = true;
        } else {
            z = false;
        }
        bixv.m102958a(z, "Duration cannot be negative.");
        bixy a = bixy.m102959a(activity);
        Bundle bundle = new Bundle();
        bundle.putParcelable("MetricKey_bundle", MetricKey.m117808a(metricKey));
        bundle.putLong("timeMillis", millis);
        a.mo64852a(2, bundle);
    }

    public final void onPause() {
        super.onPause();
        this.f122234d += System.nanoTime() - this.f122233c;
    }

    public final void onResume() {
        super.onResume();
        this.f122233c = System.nanoTime();
        int i = Build.VERSION.SDK_INT;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putLong("onScreenResume", System.nanoTime());
        biyh.m102971a(getActivity(), CustomEvent.m117807a(MetricKey.m117809a("ScreenActivity", getActivity()), persistableBundle));
    }
}
