package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;

/* renamed from: zdb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zdb extends zdh {

    /* renamed from: a */
    final /* synthetic */ PendingIntent f54930a;

    /* renamed from: b */
    final /* synthetic */ zdc f54931b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zdb(zdc zdc, Context context, PendingIntent pendingIntent, zdf zdf, ytt ytt, Handler handler, PendingIntent pendingIntent2) {
        super(context, null, pendingIntent, zdf, ytt, handler);
        this.f54931b = zdc;
        this.f54930a = pendingIntent2;
    }

    /* renamed from: a */
    public final void mo30942a() {
        this.f54931b.f54934c.mo30956b(this.f54930a, this);
    }

    /* renamed from: b */
    public final void mo30943b() {
        this.f54931b.f54934c.mo30955b(this.f54930a);
    }
}
