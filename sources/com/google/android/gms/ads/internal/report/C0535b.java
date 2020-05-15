package com.google.android.gms.ads.internal.report;

import java.lang.Thread;

/* renamed from: com.google.android.gms.ads.internal.report.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0535b implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    final /* synthetic */ Thread.UncaughtExceptionHandler f8563a;

    /* renamed from: b */
    final /* synthetic */ C0537d f8564b;

    public C0535b(C0537d dVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f8564b = dVar;
        this.f8563a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        try {
            this.f8564b.mo6711a(th);
            uncaughtExceptionHandler = this.f8563a;
            if (uncaughtExceptionHandler == null) {
                return;
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f8563a;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}
