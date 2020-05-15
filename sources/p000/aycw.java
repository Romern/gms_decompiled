package p000;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: aycw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aycw implements ayjm {

    /* renamed from: a */
    public final AtomicInteger f97186a = new AtomicInteger(0);

    /* renamed from: b */
    public final AtomicInteger f97187b = new AtomicInteger(0);

    /* renamed from: c */
    private final AtomicInteger f97188c = new AtomicInteger(0);

    /* renamed from: d */
    private final Lock f97189d = new ReentrantLock();

    /* renamed from: e */
    private final Map f97190e = new HashMap();

    /* renamed from: a */
    public final IOException mo53934a(IOException iOException) {
        if (iOException instanceof aycv) {
            return ((aycv) iOException).f97185a;
        }
        mo53935a(iOException.getMessage());
        return iOException;
    }

    /* renamed from: a */
    public final void mo53935a(String str) {
        int i;
        this.f97188c.incrementAndGet();
        this.f97189d.lock();
        try {
            if (this.f97190e.containsKey(str)) {
                i = ((Integer) this.f97190e.get(str)).intValue();
            } else {
                i = 0;
            }
            this.f97190e.put(str, Integer.valueOf(i + 1));
        } finally {
            this.f97189d.unlock();
        }
    }

    /* renamed from: a */
    public final void mo53558a(ssb ssb, boolean z, boolean z2) {
        ssb.println("--- Logic driven events ----------");
        int i = this.f97186a.get();
        StringBuilder sb = new StringBuilder(34);
        sb.append("  Connection attempts: ");
        sb.append(i);
        ssb.println(sb.toString());
        int i2 = this.f97187b.get();
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("  Successfully connected: ");
        sb2.append(i2);
        ssb.println(sb2.toString());
        int i3 = this.f97188c.get();
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("  Disconnects: ");
        sb3.append(i3);
        ssb.println(sb3.toString());
        ssb.println("--- Disconnects by reason --------");
        this.f97189d.lock();
        try {
            for (Map.Entry entry : this.f97190e.entrySet()) {
                ssb.println(String.format("      %s: %s", entry.getKey(), entry.getValue()));
            }
        } finally {
            this.f97189d.unlock();
        }
    }
}
