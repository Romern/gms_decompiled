package p000;

import android.content.Context;

/* renamed from: anjg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anjg {

    /* renamed from: a */
    public final Context f76995a;

    /* renamed from: b */
    public final anje f76996b;

    /* renamed from: c */
    public final bmxv f76997c;

    public anjg(Context context, anje anje) {
        this.f76995a = context;
        this.f76996b = anje;
        this.f76997c = bmxv.m108567c(sex.m35104a(context));
    }

    /* renamed from: a */
    public final String mo41869a(int i) {
        return this.f76995a.getResources().getString(i);
    }

    /* renamed from: a */
    public final void mo41870a() {
        if (!this.f76997c.mo66813a()) {
            anjb.m64557b("Missing NotificationManager - cannot cancel notification", new Object[0]);
        } else {
            ((sex) this.f76997c.mo66814b()).mo25440a(1);
        }
    }
}
