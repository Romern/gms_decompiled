package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: bbom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bbom {

    /* renamed from: a */
    public final bqgj f103024a;

    public bbom() {
        bqha bqha = new bqha();
        bqha.mo69261a();
        bqha.mo69262a("LIT-TimeoutScheduler");
        this.f103024a = mo56279a(new ScheduledThreadPoolExecutor(1, bqha.m112820a(bqha)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bqgj mo56279a(ScheduledExecutorService scheduledExecutorService);
}
