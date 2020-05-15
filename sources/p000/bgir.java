package p000;

import android.os.IBinder;
import com.android.location.provider.ActivityRecognitionProvider;
import com.android.location.provider.ActivityRecognitionProviderWatcher;

/* renamed from: bgir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgir implements bgis {
    /* renamed from: a */
    public final IBinder mo62870a() {
        return ActivityRecognitionProviderWatcher.getInstance().getBinder();
    }

    /* renamed from: b */
    public final ActivityRecognitionProvider mo62871b() {
        return ActivityRecognitionProviderWatcher.getInstance().getActivityRecognitionProvider();
    }
}
