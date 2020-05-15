package p000;

import java.util.Locale;

/* renamed from: ardl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ardl implements arql {

    /* renamed from: a */
    final /* synthetic */ long f87432a;

    /* renamed from: b */
    final /* synthetic */ ardm f87433b;

    public ardl(ardm ardm, long j) {
        this.f87433b = ardm;
        this.f87432a = j;
    }

    /* renamed from: a */
    public final void mo48368a() {
        String format = String.format(Locale.US, "A message was not received or sent for %d millis", Long.valueOf(this.f87432a));
        ardn.f87438h.mo25418e(format, new Object[0]);
        this.f87433b.f87436c.mo48437b(10580, format);
    }
}
