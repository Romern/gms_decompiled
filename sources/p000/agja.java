package p000;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: agja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agja extends Thread {

    /* renamed from: a */
    final /* synthetic */ agjb f65660a;

    /* renamed from: b */
    private final Object f65661b;

    /* renamed from: c */
    private final BlockingQueue f65662c;

    /* renamed from: d */
    private boolean f65663d = false;

    public agja(agjb agjb, String str, BlockingQueue blockingQueue) {
        this.f65660a = agjb;
        sdo.m34959a((Object) str);
        sdo.m34959a(blockingQueue);
        this.f65661b = new Object();
        this.f65662c = blockingQueue;
        setName(str);
    }

    /* renamed from: a */
    private final void m54342a(InterruptedException interruptedException) {
        this.f65660a.mo35497E().f65567f.mo35436a(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* renamed from: b */
    private final void m54343b() {
        agjb agjb = this.f65660a;
        AtomicLong atomicLong = agjb.f65664f;
        synchronized (agjb.f65667c) {
            if (!this.f65663d) {
                this.f65660a.f65668d.release();
                this.f65660a.f65667c.notifyAll();
                agjb agjb2 = this.f65660a;
                if (this == agjb2.f65665a) {
                    agjb2.f65665a = null;
                } else if (this != agjb2.f65666b) {
                    agjb2.mo35497E().f65564c.mo35435a("Current scheduler thread is neither worker nor network");
                } else {
                    agjb2.f65666b = null;
                }
                this.f65663d = true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0054, code lost:
        m54343b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0057, code lost:
        return;
     */
    public final void run() {
        int i;
        boolean z = false;
        while (!z) {
            try {
                agjb agjb = this.f65660a;
                AtomicLong atomicLong = agjb.f65664f;
                agjb.f65668d.acquire();
                z = true;
            } catch (InterruptedException e) {
                m54342a(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                agiz agiz = (agiz) this.f65662c.poll();
                if (agiz == null) {
                    synchronized (this.f65661b) {
                        if (this.f65662c.peek() == null) {
                            agjb agjb2 = this.f65660a;
                            AtomicLong atomicLong2 = agjb.f65664f;
                            boolean z2 = agjb2.f65669e;
                            try {
                                this.f65661b.wait(30000);
                            } catch (InterruptedException e2) {
                                m54342a(e2);
                            }
                        }
                    }
                    agjb agjb3 = this.f65660a;
                    AtomicLong atomicLong3 = agjb.f65664f;
                    synchronized (agjb3.f65667c) {
                        if (this.f65662c.peek() == null) {
                            if (this.f65660a.mo35538v().mo35314a(aghn.f65488an)) {
                                m54343b();
                            }
                        }
                    }
                } else {
                    if (!agiz.f65656a) {
                        i = 10;
                    } else {
                        i = threadPriority;
                    }
                    Process.setThreadPriority(i);
                    agiz.run();
                }
            }
        } catch (Throwable th) {
            m54343b();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo35488a() {
        synchronized (this.f65661b) {
            this.f65661b.notifyAll();
        }
    }
}
