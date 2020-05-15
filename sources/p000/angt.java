package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: angt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class angt implements aaak {

    /* renamed from: a */
    public static final angt f76813a = new angt();

    /* renamed from: b */
    private static final Object f76814b = new Object();

    /* renamed from: c */
    private static volatile boolean f76815c = false;

    private angt() {
    }

    /* renamed from: a */
    public final void mo16662a() {
    }

    /* renamed from: a */
    public final void mo16663a(aaab aaab, Status status) {
        if (!f76815c) {
            synchronized (f76814b) {
                if (!f76815c) {
                    anij.m64484d(rpr.m34216b());
                    f76815c = true;
                }
            }
        }
    }
}
