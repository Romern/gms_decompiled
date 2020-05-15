package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: brmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brmi implements sjv {

    /* renamed from: a */
    private static final sek f142966a = new sek("FirebaseAuth", "PhoneNumberAuthPostProcessor");

    /* renamed from: a */
    public final void mo25654a() {
    }

    /* renamed from: b */
    public final void mo25655b() {
        f142966a.mo25416d("postProcess starts", new Object[0]);
        brlj.m114134a(TimeUnit.SECONDS.toMillis(120));
        f142966a.mo25416d("postProcess ends", new Object[0]);
    }
}
