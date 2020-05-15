package p000;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: arhq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arhq {

    /* renamed from: a */
    public static final ScheduledExecutorService f87736a = snp.m35703a(Integer.MAX_VALUE, 10);

    /* renamed from: b */
    public final arhr f87737b;

    /* renamed from: c */
    public bqfp f87738c;

    /* renamed from: d */
    public Future f87739d;

    /* renamed from: e */
    public boolean f87740e;

    public arhq(boolean z, arhs arhs, int i) {
        arhr arhr;
        if (z) {
            arhr = new arhr(arhs, 12, i);
        } else {
            arhr = new arhr(arhs, 11, i);
        }
        this.f87737b = arhr;
    }
}
