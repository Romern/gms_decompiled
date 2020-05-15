package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: brye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brye extends chrs {

    /* renamed from: a */
    private final AtomicReference f143640a = new AtomicReference(bryd.m114865a(1));

    public brye(chqs chqs) {
        super(chqs);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.a(java.lang.Object, java.lang.Object):java.lang.Object
      bmxy.a(int, int):void
      bmxy.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo70029a(int i) {
        int i2 = ((bryd) this.f143640a.get()).f143639b;
        if (i2 == 1 || i2 == 4) {
            throw new IllegalStateException("Not started");
        }
        bmxy.m108589a(true, (Object) "Number requested must be non-negative");
        this.f189055b.mo70029a(i);
    }

    /* renamed from: b */
    public final void mo70032b() {
        bryd bryd;
        do {
            bryd = (bryd) this.f143640a.get();
            if (bryd.f143639b == 2) {
            } else {
                throw new IllegalStateException("Call was either not started or already half-closed.");
            }
        } while (!this.f143640a.compareAndSet(bryd, bryd.m114865a(3)));
        this.f189055b.mo70032b();
    }

    /* renamed from: a */
    public final void mo56351a(chqr chqr, chtr chtr) {
        bryd bryd;
        bryd bryd2;
        do {
            bryd = (bryd) this.f143640a.get();
            if (bryd.f143639b == 1) {
                bryd2 = bryd.m114865a(2);
            } else {
                bryd2 = bryd;
            }
        } while (!this.f143640a.compareAndSet(bryd, bryd2));
        int i = bryd.f143639b;
        if (i == 1) {
            this.f189055b.mo56351a(chqr, chtr);
        } else if (i == 4) {
            chqr.mo25570a(bryd.f143638a, new chtr());
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Already started");
            this.f189055b.mo70031a("start() called more than once", illegalStateException);
            throw illegalStateException;
        }
    }

    /* renamed from: a */
    public final void mo70030a(Object obj) {
        bmxy.m108582a(obj, "Message must be non-null");
        int i = ((bryd) this.f143640a.get()).f143639b;
        if (i == 2) {
            this.f189055b.mo70030a(obj);
        } else if (i != 5) {
            throw new IllegalStateException("Call was either not started or already half-closed.");
        }
    }

    /* renamed from: a */
    public final void mo70031a(String str, Throwable th) {
        bryd bryd;
        bryd bryd2;
        chuv chuv = chuv.f189216c;
        if (str != null) {
            chuv = chuv.mo85687a(str);
        }
        if (th != null) {
            chuv = chuv.mo85692c(th);
        }
        do {
            bryd = (bryd) this.f143640a.get();
            int i = bryd.f143639b;
            if (i != 4) {
                bryd2 = i != 1 ? bryd.m114866a(5, chuv) : bryd.m114866a(4, chuv);
            } else {
                bryd2 = bryd;
            }
        } while (!this.f143640a.compareAndSet(bryd, bryd2));
        this.f189055b.mo70031a(str, th);
    }
}
