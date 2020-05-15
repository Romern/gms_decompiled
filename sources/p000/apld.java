package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;

/* renamed from: apld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apld extends adzx {

    /* renamed from: a */
    private final aeab f84684a;

    /* renamed from: b */
    private final Context f84685b;

    public apld(Context context, Handler handler, aeab aeab) {
        super("scheduler", "UriTaskContentObserverForSecondaryUser", handler);
        this.f84685b = context;
        this.f84684a = aeab;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13611a(boolean z, Uri uri) {
        Intent intent = new Intent();
        intent.setClassName(this.f84685b, "com.google.android.gms.gcm.nts.SchedulerInternalReceiver");
        intent.putExtra("OP_CODE", 3);
        intent.putExtra("content_uri_flags_array", new int[]{this.f84684a.f62978b});
        intent.putExtra("content_uri_array", new Uri[]{this.f84684a.f62977a});
        intent.putExtra("triggered_uris", new Uri[]{uri});
        intent.putExtra("user_serial", aajg.m21344d());
        aajg.m21336a(this.f84685b, 0, intent, "com.google.android.gms.permission.INTERNAL_BROADCAST", null, null);
    }
}
