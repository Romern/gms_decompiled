package p000;

import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.TimeoutException;

/* renamed from: zvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zvj {

    /* renamed from: a */
    public static final bnnn f55992a = bngf.m109302f();

    /* renamed from: b */
    public static int f55993b = 0;

    /* renamed from: c */
    public static int f55994c = 0;

    /* renamed from: d */
    public static int f55995d = 0;

    /* renamed from: e */
    public static int f55996e = 0;

    /* renamed from: f */
    public static int f55997f = 0;

    /* renamed from: g */
    public static int f55998g = 0;

    /* renamed from: h */
    public static int f55999h = 0;

    /* renamed from: i */
    public static int f56000i = 0;

    /* renamed from: j */
    public static long f56001j = 0;

    /* renamed from: k */
    public static long f56002k = 0;

    /* renamed from: l */
    public static int f56003l = 0;

    /* renamed from: m */
    public static int f56004m = 0;

    /* renamed from: n */
    public static int f56005n = 0;

    /* renamed from: o */
    public static int f56006o = 0;

    /* renamed from: p */
    public static int f56007p = 0;

    /* renamed from: q */
    public static int f56008q = 0;

    /* renamed from: r */
    public static int f56009r = 0;

    /* renamed from: s */
    public static int f56010s = 0;

    /* renamed from: t */
    public static final long f56011t = 0;

    /* renamed from: u */
    public static final long f56012u = 0;

    /* renamed from: v */
    private static final bnnn f56013v = bngf.m109302f();

    /* renamed from: w */
    private static final bnnn f56014w = bngf.m109302f();

    /* renamed from: x */
    private static final PriorityQueue f56015x = new PriorityQueue(11);

    /* renamed from: y */
    private static final PriorityQueue f56016y = new PriorityQueue(11);

    /* renamed from: z */
    private static final Map f56017z = new HashMap();

    /* renamed from: a */
    public static synchronized void m46561a(long j) {
        synchronized (zvj.class) {
            f56015x.offer(Long.valueOf(j));
            while (f56015x.size() >= 10) {
                f56015x.poll();
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m46565b(long j) {
        synchronized (zvj.class) {
            f56016y.offer(Long.valueOf(j));
            while (f56016y.size() >= 10) {
                f56016y.poll();
            }
        }
    }

    /* renamed from: c */
    public static void m46567c(PrintWriter printWriter) {
        printWriter.append((CharSequence) "===== DeviceSyncStats =====\n").append((CharSequence) "Event driven sync: ").append((CharSequence) String.valueOf(ceab.m135731d())).append(10);
        m46568d(printWriter);
    }

    /* renamed from: d */
    private static synchronized void m46568d(PrintWriter printWriter) {
        synchronized (zvj.class) {
            printWriter.append((CharSequence) "Top ").append((CharSequence) "10").append((CharSequence) " slow message handling:\n");
            for (Map.Entry entry : f56017z.entrySet()) {
                printWriter.append(9).append((CharSequence) entry.getKey()).append((CharSequence) ": ").append((CharSequence) String.valueOf(entry.getValue())).append(10);
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m46562a(PrintWriter printWriter) {
        synchronized (zvj.class) {
            printWriter.append((CharSequence) "===== SyncStats =====\n");
            printWriter.append((CharSequence) "SyncRequestCount: ").append((CharSequence) String.valueOf(f55993b)).append(10);
            printWriter.append((CharSequence) "SyncRequestsCompleted: ").append((CharSequence) String.valueOf(f55994c)).append(10);
            printWriter.append((CharSequence) "LastSyncRequestTimestamp: ").append((CharSequence) new Date(f56001j).toString()).append(10);
            printWriter.append((CharSequence) "LastSuccessfulSyncRequestTimestamp: ").append((CharSequence) new Date(f56002k).toString()).append(10);
            printWriter.append((CharSequence) "SyncRequestsSkipped: emptyNodes: ").append((CharSequence) String.valueOf(f55995d)).append((CharSequence) ", sessionActive: ").append((CharSequence) String.valueOf(f55996e)).append((CharSequence) ", emptyStore: ").append((CharSequence) String.valueOf(f55997f)).append((CharSequence) ", tooEarly: ").append((CharSequence) String.valueOf(f55998g)).append((CharSequence) ", badNetwork: ").append((CharSequence) String.valueOf(f55999h)).append((CharSequence) ", dailyLimit: ").append((CharSequence) String.valueOf(f56000i)).append(10);
            printWriter.append((CharSequence) "Syncs: total: ").append((CharSequence) String.valueOf(f56003l)).append((CharSequence) ", Status: (succeeded: ").append((CharSequence) String.valueOf(f56007p)).append((CharSequence) ", failed: ").append((CharSequence) String.valueOf(f56008q)).append((CharSequence) "), Sync over: (wifi: ").append((CharSequence) String.valueOf(f56004m)).append((CharSequence) ", mobile: ").append((CharSequence) String.valueOf(f56006o)).append((CharSequence) ", bluetooth: ").append((CharSequence) String.valueOf(f56005n)).append((CharSequence) ")\n");
            printWriter.append((CharSequence) "Top ").append((CharSequence) "10").append((CharSequence) " slow requests: ").append((CharSequence) String.valueOf(f56015x)).append(10);
        }
    }

    /* renamed from: b */
    public static synchronized void m46566b(PrintWriter printWriter) {
        synchronized (zvj.class) {
            printWriter.append((CharSequence) "===== DeviceSyncStats =====\n").append((CharSequence) "Event driven sync: ").append((CharSequence) String.valueOf(ceab.m135731d())).append(10);
            printWriter.append((CharSequence) "Top ").append((CharSequence) "10").append((CharSequence) " slow operations: ").append((CharSequence) String.valueOf(f56016y)).append(10);
            m46568d(printWriter);
            printWriter.append((CharSequence) "Changes: ACKed: ").append((CharSequence) String.valueOf(f56009r)).append((CharSequence) ", failed: ").append((CharSequence) String.valueOf(f56010s)).append(10);
            zvk[] values = zvk.values();
            for (zvk zvk : values) {
                printWriter.append((CharSequence) zvk.name()).append((CharSequence) ": sync exceptions: ").append((CharSequence) String.valueOf(f55992a.mo67285a(zvk))).append((CharSequence) ", timeouts: ").append((CharSequence) String.valueOf(f56013v.mo67285a(zvk))).append((CharSequence) ", interrupts: ").append((CharSequence) String.valueOf(f56014w.mo67285a(zvk))).append(10);
            }
            printWriter.append((CharSequence) "Missing data source count: ").append((CharSequence) String.valueOf(0L)).append(10);
            printWriter.append((CharSequence) "Data sources downloaded on demand: ").append((CharSequence) String.valueOf(0L)).append(10);
        }
    }

    /* renamed from: a */
    public static synchronized void m46563a(String str, long j) {
        synchronized (zvj.class) {
            PriorityQueue priorityQueue = (PriorityQueue) f56017z.get(str);
            if (priorityQueue == null) {
                priorityQueue = new PriorityQueue(11);
            }
            priorityQueue.offer(Long.valueOf(j));
            while (priorityQueue.size() >= 10) {
                priorityQueue.poll();
            }
            f56017z.put(str, priorityQueue);
        }
    }

    /* renamed from: a */
    public static synchronized void m46564a(zvk zvk, Exception exc) {
        synchronized (zvj.class) {
            if (exc instanceof TimeoutException) {
                f56013v.add(zvk);
            } else if (exc instanceof InterruptedException) {
                f56014w.add(zvk);
            } else {
                f55992a.add(zvk);
            }
        }
    }
}
