package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: atow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atow {
    /* renamed from: a */
    public static aucb m76241a(aucb aucb, long j, TimeUnit timeUnit) {
        snf a = snp.m35703a(1, 10);
        aucf aucf = new aucf();
        aucb.mo50371a(new atov(aucf, ((sny) a).schedule(new atou(aucf, j, timeUnit), j, timeUnit)));
        return aucf.f91388a;
    }
}
