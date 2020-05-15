package p000;

import android.content.pm.PackageManager;
import android.os.Build;
import com.felicanetworks.mfc.BuildConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: rga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rga {

    /* renamed from: a */
    public static final Set f42899a = Collections.unmodifiableSet(new HashSet(Arrays.asList("com.android.settings", "com.android.systemui")));

    /* renamed from: b */
    public final boolean f42900b;

    /* renamed from: c */
    public final PackageManager f42901c;

    public rga(PackageManager packageManager) {
        this.f42901c = packageManager;
        boolean z = false;
        if (BuildConfig.FLAVOR_client.equals(Build.BRAND) && packageManager.hasSystemFeature("com.google.android.feature.GOOGLE_EXPERIENCE")) {
            z = true;
        }
        this.f42900b = z;
    }
}
