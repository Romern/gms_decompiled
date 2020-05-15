package p000;

import android.util.Log;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: anaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anaq {

    /* renamed from: a */
    private final ArrayBlockingQueue f76500a;

    /* renamed from: b */
    private bngs f76501b;

    /* renamed from: c */
    private int f76502c = 0;

    public anaq(int i) {
        this.f76500a = new ArrayBlockingQueue(i, true);
        this.f76501b = new bngs();
    }

    /* renamed from: a */
    private final void m63848a(String str, boolean z) {
        try {
            this.f76500a.put(new anam(this.f76501b.mo67664a(), str, z));
            this.f76501b = new bngs();
        } catch (InterruptedException e) {
            Log.e("FSA2_PaginatedQueue", "BlockingQueue.put interrupted, bailing out", e);
            throw new amyc(e);
        }
    }

    /* renamed from: b */
    public final void mo41607b() {
        this.f76500a.size();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: anaq.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      anaq.a(long, java.util.concurrent.TimeUnit):anao
      anaq.a(java.lang.String, boolean):void */
    /* renamed from: b */
    public final synchronized void mo41608b(String str) {
        m63848a(str, true);
    }

    /* renamed from: a */
    public final anao mo41603a() {
        try {
            return (anao) this.f76500a.take();
        } catch (InterruptedException e) {
            Log.e("FSA2_PaginatedQueue", "BlockingQueue.take interrupted, bailing out", e);
            throw new amyc(e);
        }
    }

    /* renamed from: a */
    public final anao mo41604a(long j, TimeUnit timeUnit) {
        try {
            return (anao) this.f76500a.poll(j, timeUnit);
        } catch (InterruptedException e) {
            Log.e("FSA2_PaginatedQueue", "BlockingQueue.take interrupted, bailing out", e);
            throw new amyc(e);
        }
    }

    /* renamed from: a */
    public final synchronized void mo41605a(Object obj) {
        this.f76501b.mo67668c(obj);
        this.f76502c++;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: anaq.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      anaq.a(long, java.util.concurrent.TimeUnit):anao
      anaq.a(java.lang.String, boolean):void */
    /* renamed from: a */
    public final synchronized void mo41606a(String str) {
        m63848a(str, false);
    }
}
