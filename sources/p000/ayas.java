package p000;

import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import android.util.Log;
import com.google.android.gms.wearable.ConnectionConfiguration;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ayas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayas implements Closeable {

    /* renamed from: a */
    public Thread f96963a;

    /* renamed from: b */
    public final ConnectionConfiguration f96964b;

    /* renamed from: c */
    private final long f96965c = System.currentTimeMillis();

    /* renamed from: d */
    private final long f96966d = SystemClock.elapsedRealtime();

    /* renamed from: e */
    private long f96967e;

    /* renamed from: f */
    private int f96968f;

    /* renamed from: g */
    private int f96969g;

    /* renamed from: h */
    private int f96970h;

    /* renamed from: i */
    private int f96971i;

    /* renamed from: j */
    private final AtomicLong f96972j = new AtomicLong(0);

    /* renamed from: k */
    private final AtomicLong f96973k = new AtomicLong(0);

    /* renamed from: l */
    private final Handler f96974l;

    /* renamed from: m */
    private String f96975m;

    public ayas(Handler handler, ConnectionConfiguration connectionConfiguration) {
        this.f96974l = handler;
        this.f96964b = connectionConfiguration;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo53841a(int i) {
        if (this.f96967e == 0) {
            this.f96970h++;
            this.f96968f += i;
        }
    }

    /* renamed from: a */
    public final synchronized void mo53842a(String str) {
        if (this.f96975m == null) {
            this.f96975m = str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo53846b(int i) {
        if (this.f96967e == 0) {
            this.f96971i++;
            this.f96969g += i;
        }
    }

    public final synchronized void close() {
        if (this.f96967e == 0) {
            this.f96967e = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: b */
    public final void mo53847b(boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z) {
            this.f96972j.set(elapsedRealtime);
            return;
        }
        long andSet = this.f96972j.getAndSet(0);
        if (andSet > 0) {
            long j = elapsedRealtime - andSet;
            if (j > 1000) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("took ");
                sb.append(j);
                sb.append(" ms to process the read");
                Log.w("Wear_Transport", sb.toString());
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo53843a(ssb ssb) {
        if (this.f96967e == 0) {
            long j = this.f96972j.get();
            long j2 = this.f96973k.get();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (j != 0) {
                long j3 = elapsedRealtime - j;
                if (j3 > 1000) {
                    String valueOf = String.valueOf(DateUtils.formatElapsedTime(j3 / 1000));
                    ssb.println(valueOf.length() == 0 ? new String("STUCK WHILE PROCESSING READ ") : "STUCK WHILE PROCESSING READ ".concat(valueOf));
                }
            }
            if (j2 != 0) {
                long j4 = elapsedRealtime - j2;
                if (j4 > 1000) {
                    String valueOf2 = String.valueOf(DateUtils.formatElapsedTime(j4 / 1000));
                    ssb.println(valueOf2.length() == 0 ? new String("STUCK WHILE WRITING ") : "STUCK WHILE WRITING ".concat(valueOf2));
                }
            }
            ssb.print("Current: ");
        } else {
            ssb.print("    Old: ");
        }
        String str = this.f96975m;
        String str2 = "";
        if (str != null) {
            str2 = str.length() == 0 ? new String(", ") : ", ".concat(str);
        }
        long j5 = this.f96967e;
        if (j5 == 0) {
            j5 = SystemClock.elapsedRealtime();
        }
        ssb.printf("%s, writes/reads (%d/%d), bytes (%d/%d), duration %s%s", ayjl.m84112a(this.f96965c), Integer.valueOf(this.f96970h), Integer.valueOf(this.f96971i), Integer.valueOf(this.f96968f), Integer.valueOf(this.f96969g), DateUtils.formatElapsedTime((j5 - this.f96966d) / 1000), str2);
        ssb.println();
    }

    /* renamed from: a */
    public final void mo53844a(boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z) {
            this.f96973k.set(elapsedRealtime);
            this.f96974l.removeMessages(hashCode());
            this.f96974l.sendMessageDelayed(this.f96974l.obtainMessage(hashCode(), this), chnj.m149039o());
            return;
        }
        long andSet = this.f96973k.getAndSet(0);
        if (andSet > 0) {
            long j = elapsedRealtime - andSet;
            if (j > 1000) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("took ");
                sb.append(j);
                sb.append(" ms to perform write");
                Log.w("Wear_Transport", sb.toString());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0072, code lost:
        return false;
     */
    /* renamed from: a */
    public final synchronized boolean mo53845a() {
        if (this.f96967e == 0) {
            long j = this.f96973k.get();
            StringBuilder sb = new StringBuilder(39);
            sb.append("Write start time:  ");
            sb.append(j);
            ayaw.m83718a(sb.toString());
            if (j > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - j;
                StringBuilder sb2 = new StringBuilder(42);
                sb2.append("Last write duration:  ");
                sb2.append(elapsedRealtime);
                ayaw.m83718a(sb2.toString());
                if (elapsedRealtime > chnj.m149039o()) {
                    long o = chnj.m149039o();
                    StringBuilder sb3 = new StringBuilder(59);
                    sb3.append("Write has been stuck for more than ");
                    sb3.append(o);
                    sb3.append(" ms.");
                    Log.w("Wear_Transport", sb3.toString());
                    return true;
                }
            }
        }
    }
}
