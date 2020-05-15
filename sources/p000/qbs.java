package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* renamed from: qbs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qbs extends qbo {

    /* renamed from: c */
    private final String f40903c;

    /* renamed from: d */
    private final PendingIntent f40904d;

    /* renamed from: e */
    private final qca f40905e;

    public qbs(qbn qbn, qbx qbx, qca qca, String str, PendingIntent pendingIntent) {
        super("StartMirroringOperation", qbn, qbx);
        this.f40903c = str;
        this.f40904d = pendingIntent;
        this.f40905e = qca;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f40899a.mo23878a(this.f40900b, this.f40905e, this.f40903c, this.f40904d);
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.cast.media.CastRemoteDisplayProviderService");
        context.startService(intent);
    }
}
