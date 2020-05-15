package p000;

import java.lang.Thread;

/* renamed from: agiy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agiy implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    final /* synthetic */ agjb f65654a;

    /* renamed from: b */
    private final String f65655b;

    public agiy(agjb agjb, String str) {
        this.f65654a = agjb;
        sdo.m34959a((Object) str);
        this.f65655b = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f65654a.mo35497E().f65564c.mo35436a(this.f65655b, th);
    }
}
