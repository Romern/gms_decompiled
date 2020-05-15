package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: sua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sua implements ThreadFactory {

    /* renamed from: a */
    private final String f45159a;

    /* renamed from: b */
    private final int f45160b;

    /* renamed from: c */
    private final AtomicInteger f45161c = new AtomicInteger();

    /* renamed from: d */
    private final ThreadFactory f45162d = Executors.defaultThreadFactory();

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
    public sua(String str, int i) {
        sdo.m34966a((Object) str, (Object) "Name must not be null");
        this.f45159a = str;
        this.f45160b = i;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f45162d.newThread(new sub(runnable, this.f45160b));
        String str = this.f45159a;
        int andIncrement = this.f45161c.getAndIncrement();
        StringBuilder sb = new StringBuilder(str.length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }
}
