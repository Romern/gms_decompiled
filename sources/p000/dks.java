package p000;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* renamed from: dks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dks {

    /* renamed from: a */
    public final dkr f13423a;

    /* renamed from: b */
    public final ExecutorService f13424b;

    /* renamed from: c */
    public final Object f13425c = new Object();

    /* renamed from: d */
    public final ArrayDeque f13426d;

    /* renamed from: e */
    public final ArrayList f13427e;

    /* renamed from: f */
    public int f13428f = 0;

    private dks(dkr dkr, ExecutorService executorService) {
        this.f13423a = dkr;
        this.f13424b = executorService;
        this.f13426d = new ArrayDeque();
        this.f13427e = new ArrayList();
    }

    /* renamed from: a */
    public static dks m8749a(dkr dkr, ExecutorService executorService) {
        return new dks(dkr, executorService);
    }

    /* renamed from: a */
    public final String mo9222a() {
        String str;
        synchronized (this.f13425c) {
            str = (String) this.f13426d.pollFirst();
        }
        return str;
    }
}
