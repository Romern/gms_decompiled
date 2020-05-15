package p000;

import android.os.SystemClock;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Semaphore;

/* renamed from: nwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nwd extends Thread {

    /* renamed from: a */
    public final SparseArray f36720a = new SparseArray();

    /* renamed from: b */
    public final Queue f36721b = new ArrayDeque(8);

    /* renamed from: c */
    public final Semaphore f36722c = new Semaphore(0);

    /* renamed from: d */
    public final Object f36723d = new Object();

    /* renamed from: e */
    public volatile boolean f36724e = true;

    /* renamed from: f */
    public nij f36725f;

    /* renamed from: g */
    final /* synthetic */ nwe f36726g;

    /* renamed from: h */
    private final Semaphore f36727h = new Semaphore(0);

    /* renamed from: i */
    private boolean f36728i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nwd(nwe nwe) {
        super("ClientConnectionThread");
        this.f36726g = nwe;
    }

    /* renamed from: a */
    public final void mo21739a() {
        synchronized (this.f36723d) {
            int availablePermits = this.f36727h.availablePermits();
            if (availablePermits != 0) {
                bnsi c = nip.f35749b.mo68388c();
                c.mo68432a("nwd", "a", 2271, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68409a("completion semaphore has permits already %d", availablePermits);
                this.f36727h.drainPermits();
                nwp.m28033a(this.f36727h);
            } else {
                nwp.m28033a(this.f36727h);
            }
        }
    }

    public final void run() {
        nij nij;
        int i;
        while (this.f36724e) {
            try {
                this.f36722c.acquire();
                synchronized (this.f36723d) {
                    Integer num = (Integer) this.f36721b.peek();
                    if (num != null) {
                        nwc nwc = (nwc) this.f36720a.get(num.intValue());
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        nuu.m27792a(nwc);
                        boolean b = nwp.m28037b(this.f36727h);
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        bxvd da = bpcn.f135799h.mo74144da();
                        synchronized (this.f36723d) {
                            nij = null;
                            if (!b) {
                                if (!this.f36727h.tryAcquire()) {
                                    bnsi c = nip.f35749b.mo68388c();
                                    c.mo68432a("nwd", "run", 2175, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    c.mo68420a("Timeout in ClientConnectionThread while launching %s", nwc.f36715b.f35741a);
                                    nij nij2 = this.f36725f;
                                    this.f36725f = null;
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    bpcn bpcn = (bpcn) da.f164949b;
                                    bpcn.f135801a |= 16;
                                    bpcn.f135806f = 3;
                                    nij = nij2;
                                    this.f36728i = false;
                                }
                            }
                            if (this.f36728i) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bpcn bpcn2 = (bpcn) da.f164949b;
                                bpcn2.f135801a |= 16;
                                bpcn2.f135806f = 1;
                            } else {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bpcn bpcn3 = (bpcn) da.f164949b;
                                bpcn3.f135801a |= 16;
                                bpcn3.f135806f = 2;
                            }
                            this.f36728i = false;
                        }
                        if (nij != null) {
                            nij.mo20770a("Timeout connecting from CAMS");
                            i = 0;
                        } else {
                            i = 0;
                        }
                        while (i < nwc.f36714a.length()) {
                            int i2 = nwc.f36714a.get(i);
                            if (i2 != 0) {
                                bxvd da2 = bpco.f135808c.mo74144da();
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bpco bpco = (bpco) da2.f164949b;
                                bpco.f135810a |= 1;
                                bpco.f135811b = i2;
                                bpco bpco2 = (bpco) da2.mo74062i();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bpcn bpcn4 = (bpcn) da.f164949b;
                                bpco2.getClass();
                                if (!bpcn4.f135807g.mo73666a()) {
                                    bpcn4.f135807g = bxvk.m124021a(bpcn4.f135807g);
                                }
                                bpcn4.f135807g.add(bpco2);
                            }
                            i++;
                        }
                        String str = nwc.f36718e;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bpcn bpcn5 = (bpcn) da.f164949b;
                        str.getClass();
                        bpcn5.f135801a |= 4;
                        bpcn5.f135804d = str;
                        int i3 = nwc.f36717d;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bpcn bpcn6 = (bpcn) da.f164949b;
                        bpcn6.f135801a |= 2;
                        bpcn6.f135803c = i3;
                        String flattenToShortString = nwc.f36715b.f35741a.flattenToShortString();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bpcn bpcn7 = (bpcn) da.f164949b;
                        flattenToShortString.getClass();
                        int i4 = bpcn7.f135801a | 1;
                        bpcn7.f135801a = i4;
                        bpcn7.f135802b = flattenToShortString;
                        bpcn7.f135801a = i4 | 8;
                        bpcn7.f135805e = (int) (elapsedRealtime2 - elapsedRealtime);
                        nwe nwe = this.f36726g;
                        int i5 = nwe.f36732u;
                        nwe.f36781g.mo20855a((bpcn) da.mo74062i());
                    }
                }
            } catch (InterruptedException e) {
                this.f36724e = false;
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo21740a(nij nij) {
        boolean z;
        boolean z2;
        synchronized (this.f36723d) {
            synchronized (this.f36723d) {
                z = false;
                if (nij != null) {
                    try {
                        if (nij == this.f36725f) {
                            z2 = true;
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                z2 = false;
            }
            if (!z2) {
                return false;
            }
            if (this.f36725f != null) {
                z = true;
            }
            this.f36728i = z;
            this.f36725f = null;
            mo21739a();
            return true;
        }
    }
}
