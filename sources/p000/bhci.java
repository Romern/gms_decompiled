package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.location.util.WifiScanNotificationHelper$1;

/* renamed from: bhci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhci {

    /* renamed from: a */
    public final aki f118296a;

    /* renamed from: b */
    public final aacn f118297b;

    /* renamed from: c */
    public final bfkx f118298c;

    /* renamed from: d */
    public boolean f118299d;

    /* renamed from: e */
    public bfvn f118300e;

    public bhci(Context context, Handler handler) {
        this.f118296a = aki.m919a(context);
        this.f118297b = new WifiScanNotificationHelper$1(this, "location", handler);
        this.f118298c = new bfkx("WifiScanNotificationsHelper", handler.getLooper().getThread());
    }
}
