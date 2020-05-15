package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: jdj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jdj extends rrj {

    /* renamed from: a */
    private static final sek f22224a = ght.m13171a("Auth", "DpcInstallLaunchingIntentLoader");

    /* renamed from: b */
    private final jfs f22225b;

    /* renamed from: c */
    private final String f22226c;

    /* renamed from: d */
    private final Bundle f22227d;

    public jdj(Context context, jfs jfs, String str, Bundle bundle) {
        super(context);
        this.f22225b = jfs;
        this.f22226c = str;
        this.f22227d = bundle;
    }

    /* renamed from: a */
    public final Bundle loadInBackground() {
        PendingIntent pendingIntent;
        try {
            pendingIntent = (PendingIntent) aucu.m76783a(this.f22225b.mo24732b(new jfq(this.f22226c, this.f22227d)), 1, TimeUnit.MINUTES);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            f22224a.mo25417e("Failed to get PhoneskyDpcInstallActivity launching intent.", e, new Object[0]);
            pendingIntent = null;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("pending_intent", pendingIntent);
        return bundle;
    }
}
