package p000;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: uga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uga {

    /* renamed from: a */
    public final ugb f47489a;

    /* renamed from: b */
    public CountDownLatch f47490b;

    /* renamed from: c */
    public int f47491c;

    /* renamed from: d */
    private final ufv f47492d;

    /* renamed from: e */
    private final AtomicBoolean f47493e = new AtomicBoolean();

    public uga(int i) {
        sdo.m34974b(ufy.m38299a(i));
        this.f47489a = null;
        this.f47492d = new ufv(null);
        this.f47491c = i;
        this.f47493e.set(true);
        this.f47492d.mo27242a(this.f47491c);
    }

    /* renamed from: a */
    public final void mo27305a() {
        if (!this.f47493e.getAndSet(true)) {
            ugb ugb = this.f47489a;
            if (ugb.f47495a.decrementAndGet() == 0) {
                ugb.mo27310b();
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: b */
    public final ufm mo27307b() {
        ugb ugb = this.f47489a;
        if (ugb == null) {
            return null;
        }
        sdo.m34971a(ugb.f47500f != null, (Object) "Download hasn't been started yet");
        return ugb.f47500f;
    }

    /* renamed from: a */
    public final void mo27306a(ufx ufx) {
        this.f47492d.mo27304a(ufx);
    }

    public uga(ugb ugb) {
        sdo.m34959a(ugb);
        this.f47489a = ugb;
        this.f47492d = ugb.f47498d;
    }
}
