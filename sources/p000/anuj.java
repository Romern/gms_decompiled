package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: anuj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anuj {
    /* renamed from: a */
    public static Bundle m65341a(Context context, ClientContext clientContext) {
        anui anui = new anui(context, clientContext);
        anui.mo42291b();
        PendingIntent activity = PendingIntent.getActivity(context, 0, anui.mo42290a(), 0);
        Bundle bundle = new Bundle();
        bundle.putParcelable("pendingIntent", activity);
        return bundle;
    }
}
