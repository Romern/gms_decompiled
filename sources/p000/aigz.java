package p000;

import android.app.Activity;
import android.content.Context;
import android.nfc.NfcAdapter;
import android.os.Build;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: aigz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aigz {

    /* renamed from: d */
    private static final WeakHashMap f68885d = new WeakHashMap();

    /* renamed from: a */
    public final Context f68886a;

    /* renamed from: b */
    public boolean f68887b = true;

    /* renamed from: c */
    public boolean f68888c;

    /* renamed from: e */
    private final WeakReference f68889e;

    /* renamed from: f */
    private final NfcAdapter f68890f;

    /* renamed from: g */
    private boolean f68891g;

    private aigz(Activity activity) {
        this.f68886a = activity.getApplicationContext();
        this.f68889e = new WeakReference(activity);
        this.f68890f = NfcAdapter.getDefaultAdapter(this.f68886a);
        activity.getApplication().registerActivityLifecycleCallbacks(new aigy(this, this.f68889e));
    }

    /* renamed from: a */
    public static synchronized aigz m57242a(Activity activity) {
        aigz aigz;
        synchronized (aigz.class) {
            if (!f68885d.containsKey(activity)) {
                f68885d.put(activity, new aigz(activity));
            }
            aigz = (aigz) f68885d.get(activity);
        }
        return aigz;
    }

    /* renamed from: a */
    public final void mo37477a() {
        NfcAdapter nfcAdapter;
        Activity activity;
        if (!this.f68887b || !this.f68888c) {
            if (this.f68891g) {
                Activity activity2 = (Activity) this.f68889e.get();
                if (activity2 != null) {
                    this.f68890f.disableReaderMode(activity2);
                }
                this.f68891g = false;
            }
        } else if (!this.f68891g) {
            int i = Build.VERSION.SDK_INT;
            if (this.f68886a.getPackageManager().hasSystemFeature("android.hardware.nfc") && C1133kh.m17835a(this.f68886a, "android.permission.NFC") == 0 && (nfcAdapter = this.f68890f) != null && nfcAdapter.isEnabled() && (activity = (Activity) this.f68889e.get()) != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("presence", 100);
                this.f68890f.enableReaderMode(activity, new aigx(this), 385, bundle);
                this.f68891g = true;
            }
        }
    }
}
