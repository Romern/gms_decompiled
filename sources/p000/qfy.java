package p000;

import android.app.PendingIntent;
import android.content.Context;

/* renamed from: qfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qfy {

    /* renamed from: a */
    public final Context f41142a;

    /* renamed from: b */
    public final skc f41143b;

    public qfy(Context context) {
        this.f41142a = context;
        this.f41143b = new skc(context);
    }

    /* renamed from: a */
    public final void mo24024a() {
        skc skc = this.f41143b;
        Context context = this.f41142a;
        skc.mo25668a(PendingIntent.getService(context, 0, qga.m32112a(context), 134217728));
    }
}
