package p000;

import android.os.SystemClock;

/* renamed from: nnt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nnt implements Runnable {

    /* renamed from: a */
    final /* synthetic */ noj f36115a;

    public nnt(noj noj) {
        this.f36115a = noj;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ojq.a(long, boolean):void
     arg types: [long, int]
     candidates:
      ojq.a(java.lang.Class, android.os.IBinder):java.lang.Object
      ojq.a(ogy, ogx):void
      ojq.a(android.content.res.Resources, int):byte[]
      ojq.a(long, boolean):void */
    public final void run() {
        noj noj = this.f36115a;
        if (noj.f36157B != null) {
            noj.f36174S = SystemClock.elapsedRealtime();
            noj noj2 = this.f36115a;
            noj2.f36157B.mo22214a(noj2.f36174S, false);
        }
    }
}
