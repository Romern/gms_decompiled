package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.google.android.setupcompat.logging.CustomEvent;
import com.google.android.setupcompat.logging.MetricKey;

/* renamed from: biyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biyh {
    /* renamed from: a */
    public static void m102971a(Context context, CustomEvent customEvent) {
        bixv.m102956a(context, "Context cannot be null.");
        bixv.m102956a(customEvent, "CustomEvent cannot be null.");
        bixy a = bixy.m102959a(context);
        Bundle bundle = new Bundle();
        bixv.m102956a(customEvent, "CustomEvent cannot be null");
        Bundle bundle2 = new Bundle();
        bundle2.putInt("CustomEvent_version", 1);
        bundle2.putLong("CustomEvent_timestamp", customEvent.f151466a);
        bundle2.putBundle("CustomEvent_metricKey", MetricKey.m117808a(customEvent.f151467b));
        bundle2.putBundle("CustomEvent_bundleValues", bixu.m102951a(new PersistableBundle(customEvent.f151468c)));
        bundle2.putBundle("CustomEvent_pii_bundleValues", bixu.m102951a(customEvent.f151469d));
        bundle.putParcelable("CustomEvent_bundle", bundle2);
        a.mo64852a(1, bundle);
    }
}
