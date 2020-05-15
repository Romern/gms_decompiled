package p000;

import java.util.concurrent.ExecutorService;

/* renamed from: acbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acbq {

    /* renamed from: a */
    public static final ExecutorService f59447a = sne.m35694a(4, 10);

    /* renamed from: b */
    public static volatile achu f59448b;

    /* renamed from: c */
    private static volatile acdc f59449c;

    /* renamed from: a */
    public static acdc m48833a() {
        if (f59449c == null) {
            f59449c = new acdc(new abyp(rpr.m34216b(), "MobileDataHub"));
        }
        return f59449c;
    }
}
