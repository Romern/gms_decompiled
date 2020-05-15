package p000;

import android.util.Log;
import java.util.ArrayDeque;

/* renamed from: ayfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayfv implements Runnable {

    /* renamed from: a */
    public final ArrayDeque f97500a = new ArrayDeque();

    /* renamed from: b */
    final /* synthetic */ ayfw f97501b;

    /* renamed from: c */
    private final Object f97502c;

    public ayfv(ayfw ayfw, Object obj) {
        this.f97501b = ayfw;
        this.f97502c = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r7 = android.os.SystemClock.elapsedRealtime();
        r4.mo53991a();
        r9 = android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x008d, code lost:
        if (android.util.Log.isLoggable("WearableService", 2) == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008f, code lost:
        r11 = r7 - r4.f97498a;
        r9 = r9 - r7;
        r2 = r15.f97501b.f97503a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0098, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r5 = r15.f97500a.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009f, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        android.util.Log.v("WearableService", java.lang.String.format("dispatched: %3d ms (%3d + %3d), %2d remaining, %40s, %s", java.lang.Long.valueOf(r11 + r9), java.lang.Long.valueOf(r11), java.lang.Long.valueOf(r9), java.lang.Integer.valueOf(r5), r15.f97502c, r4.f97499b));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d8, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d9, code lost:
        r0.getThreadGroup().uncaughtException(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e1, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e2, code lost:
        r4 = java.lang.String.valueOf(r4);
        r7 = new java.lang.StringBuilder(java.lang.String.valueOf(r4).length() + 26);
        r7.append("Failure while dispatching ");
        r7.append(r4);
        android.util.Log.w("WearableService", r7.toString(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0111, code lost:
        if (android.util.Log.isLoggable("WearableService", 2) == false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0113, code lost:
        r4 = java.lang.String.valueOf(r15);
        r6 = new java.lang.StringBuilder(java.lang.String.valueOf(r4).length() + 28);
        r6.append(r4);
        r6.append(" has no more tasks, removing");
        android.util.Log.v("WearableService", r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0137, code lost:
        r15.f97501b.f97504b.remove(r15.f97502c);
        r0.setName(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0144, code lost:
        return;
     */
    public final void run() {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        String valueOf = String.valueOf(this.f97502c);
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(valueOf).length());
        sb.append(name);
        sb.append("-");
        sb.append(valueOf);
        currentThread.setName(sb.toString());
        if (Log.isLoggable("WearableService", 2)) {
            String valueOf2 = String.valueOf(this);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 12);
            sb2.append(valueOf2);
            sb2.append(" is starting");
            Log.v("WearableService", sb2.toString());
        }
        while (true) {
            synchronized (this.f97501b.f97503a) {
                if (this.f97500a.isEmpty()) {
                    break;
                }
                ayfu ayfu = (ayfu) this.f97500a.removeFirst();
            }
        }
    }

    public final String toString() {
        int hashCode = hashCode();
        String valueOf = String.valueOf(this.f97502c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("WorkQueueRunnable[");
        sb.append(hashCode);
        sb.append(", ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
