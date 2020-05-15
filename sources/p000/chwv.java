package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* renamed from: chwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chwv {

    /* renamed from: a */
    public static final Logger f189426a = Logger.getLogger(chwv.class.getName());

    /* renamed from: b */
    public final String f189427b;

    /* renamed from: c */
    public final AtomicLong f189428c = new AtomicLong();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.a(java.lang.Object, java.lang.Object):java.lang.Object
      bmxy.a(int, int):void
      bmxy.a(boolean, java.lang.Object):void */
    public chwv(String str) {
        bmxy.m108589a(true, (Object) "value must be positive");
        this.f189427b = str;
        this.f189428c.set(Long.MAX_VALUE);
    }
}
