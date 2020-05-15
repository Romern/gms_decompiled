package p000;

import com.android.location.provider.ActivityRecognitionProvider;
import com.android.location.provider.ActivityRecognitionProviderClient;

/* renamed from: bgio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgio extends ActivityRecognitionProviderClient {
    public final void onProviderChanged(boolean z, ActivityRecognitionProvider activityRecognitionProvider) {
        synchronized (bgip.f116545a) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("onProviderChanged: isSupported=");
            sb.append(z);
            sb.toString();
            bgip.f116546b = activityRecognitionProvider;
        }
    }
}
