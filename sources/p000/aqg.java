package p000;

import android.content.ContentProviderClient;
import android.os.Build;

/* renamed from: aqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqg implements AutoCloseable {

    /* renamed from: a */
    public final ContentProviderClient f1989a;

    public aqg(ContentProviderClient contentProviderClient) {
        this.f1989a = contentProviderClient;
    }

    public final void close() {
        int i = Build.VERSION.SDK_INT;
        this.f1989a.close();
    }
}
