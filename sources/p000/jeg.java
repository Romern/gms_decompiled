package p000;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.auth.firstparty.shared.LatencyTracker;

/* renamed from: jeg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class jeg extends FragmentActivity {

    /* renamed from: a */
    private boolean f22278a;

    /* renamed from: b */
    protected final String f22279b;

    /* renamed from: c */
    protected LatencyTracker f22280c;

    /* renamed from: d */
    protected boolean f22281d;

    /* renamed from: e */
    protected boolean f22282e;

    public jeg() {
        String simpleName = getClass().getSimpleName();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2);
        sb.append("[");
        sb.append(simpleName);
        sb.append("]");
        this.f22279b = sb.toString();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        String string;
        LatencyTracker latencyTracker;
        Intent intent = getIntent();
        if (bundle != null) {
            LatencyTracker latencyTracker2 = (LatencyTracker) bundle.getParcelable("latency.tracker");
            this.f22280c = latencyTracker2;
            if (latencyTracker2 == null) {
                this.f22280c = LatencyTracker.m6593a("session").mo7691b(getClass().getSimpleName());
            }
        } else {
            if (intent != null) {
                latencyTracker = (LatencyTracker) intent.getParcelableExtra("latency.tracker");
            } else {
                latencyTracker = null;
            }
            if (latencyTracker == null) {
                latencyTracker = LatencyTracker.m6593a("session");
            }
            this.f22280c = latencyTracker.mo7691b(getClass().getSimpleName());
        }
        if (bundle != null) {
            str = "Icicle";
        } else {
            str = "Intent";
        }
        if (str.length() == 0) {
            new String("onCreate() with ");
        } else {
            "onCreate() with ".concat(str);
        }
        super.onCreate(bundle);
        int i = getResources().getConfiguration().screenLayout;
        if (bundle == null) {
            bundle = getIntent().getExtras();
            if (bundle == null) {
                bundle = new Bundle();
            }
            if (bundle.containsKey("notificationId") && (string = bundle.getString("notificationId")) != null) {
                if (string.indexOf("-") > 0) {
                    sex.m35104a(this).mo25444a(string, 1);
                } else {
                    sex.m35104a(this).mo25444a(string, 2);
                }
                setResult(0);
                finish();
                return;
            }
        }
        this.f22278a = bundle.getBoolean("showingProgressDialog", false);
        setResult(0, intent);
        this.f22281d = bundle.getBoolean("is_setup_wizard", bundle.getBoolean("firstRun"));
        this.f22282e = bundle.getBoolean("useImmersiveMode");
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("showingProgressDialog", this.f22278a);
        bundle.putBoolean("firstRun", this.f22281d);
        bundle.putBoolean("useImmersiveMode", this.f22282e);
        bundle.putParcelable("latency.tracker", this.f22280c);
    }

    public void startActivity(Intent intent) {
        if (intent != null) {
            intent.putExtra("useImmersiveMode", this.f22282e);
            intent.putExtra("firstRun", this.f22281d);
            if (!(intent.getComponent() == null || intent.getComponent().getPackageName() == null || !intent.getComponent().getPackageName().startsWith("com.google.android.gms"))) {
                this.f22280c.f10872d.mo7690a(intent);
                String valueOf = String.valueOf(intent.toString());
                if (valueOf.length() == 0) {
                    new String("Starting intent: ");
                } else {
                    "Starting intent: ".concat(valueOf);
                }
            }
            super.startActivity(intent);
        }
    }

    public void startActivityForResult(Intent intent, int i) {
        if (intent != null) {
            intent.putExtra("useImmersiveMode", this.f22282e);
            intent.putExtra("firstRun", this.f22281d);
            if (!(intent.getComponent() == null || intent.getComponent().getPackageName() == null || !intent.getComponent().getPackageName().startsWith("com.google.android.gms"))) {
                this.f22280c.f10872d.mo7690a(intent);
                String valueOf = String.valueOf(intent.toString());
                if (valueOf.length() == 0) {
                    new String("Starting intent for result: ");
                } else {
                    "Starting intent for result: ".concat(valueOf);
                }
            }
            super.startActivityForResult(intent, i);
        }
    }
}
