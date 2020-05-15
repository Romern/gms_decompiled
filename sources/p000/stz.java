package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: stz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class stz implements ThreadFactory {

    /* renamed from: a */
    private final String f45157a;

    /* renamed from: b */
    private final ThreadFactory f45158b = Executors.defaultThreadFactory();

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f45158b.newThread(new sub(runnable, 0));
        newThread.setName(this.f45157a);
        return newThread;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    public stz(String str) {
        sdo.m34966a((Object) str, (Object) "Name must not be null");
        this.f45157a = str;
    }
}
