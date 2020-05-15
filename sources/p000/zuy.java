package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: zuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zuy extends zvl implements zut {

    /* renamed from: c */
    private static final ScheduledExecutorService f55959c = snp.m35703a(1, 10);

    static {
        zvt.m46581a();
    }

    public zuy(rjx rjx, String str, String str2) {
        super(rjx, str, str2);
    }

    /* renamed from: a */
    public static void m46543a(aucb aucb, String str) {
        bqga.m112781a(bqga.m112773a(yun.m44873b(aucb), cdzd.m135494w(), TimeUnit.SECONDS, f55959c), new yuk(str), f55959c);
    }
}
