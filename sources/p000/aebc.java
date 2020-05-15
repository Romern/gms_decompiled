package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Messenger;
import android.util.Log;
import com.google.android.chimera.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: aebc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aebc extends ContextWrapper {

    /* renamed from: a */
    public final Object f63033a = new Object();

    /* renamed from: b */
    public int f63034b;

    /* renamed from: c */
    public final Object f63035c = new Object();

    /* renamed from: d */
    public bqgj f63036d;

    /* renamed from: e */
    public Messenger f63037e;

    /* renamed from: f */
    public ComponentName f63038f;

    /* renamed from: g */
    public aeat f63039g;

    /* renamed from: h */
    public adzu f63040h;

    /* renamed from: i */
    public final bmzi f63041i = bmzn.m108681a(aeau.f63016a);

    /* renamed from: j */
    public final Map f63042j = new HashMap();

    /* renamed from: k */
    public final Map f63043k = new HashMap();

    /* renamed from: l */
    public final bmzi f63044l = bmzn.m108681a(aeav.f63017a);

    /* renamed from: m */
    public final aebd f63045m;

    public aebc(aebd aebd) {
        super((Context) aebd);
        this.f63045m = aebd;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo33997a() {
        synchronized (this.f63035c) {
            bqgj bqgj = this.f63036d;
            if (bqgj != null && !bqgj.isShutdown()) {
                if (!cdnj.f181319a.mo6606a().mo78006j()) {
                    List<Runnable> shutdownNow = bqgj.shutdownNow();
                    if (!shutdownNow.isEmpty()) {
                        int size = shutdownNow.size();
                        StringBuilder sb = new StringBuilder(79);
                        sb.append("Shutting down, but not all tasks are finished executing. Remaining: ");
                        sb.append(size);
                        Log.e("GmsTaskChimeraService", sb.toString());
                    }
                } else {
                    bqgj.shutdown();
                    if (!bqgj.isTerminated()) {
                        Log.e("GmsTaskChimeraService", "Shutting down, but not all tasks are finished executing.");
                    }
                }
                this.f63036d = null;
            }
        }
    }

    /* renamed from: b */
    public final void mo34001b() {
        this.f63045m.mo7135aZ();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Object mo34003c() {
        aebd aebd = this.f63045m;
        return aebd instanceof aeah ? ((Service) aebd).getContainerService() : aebd;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo34002b(int i) {
        aebd aebd = this.f63045m;
        if (aebd instanceof aeah) {
            ((Service) aebd).stopSelf(i);
        }
    }

    /* renamed from: a */
    public final void mo33998a(int i) {
        synchronized (this.f63033a) {
            this.f63034b = i;
            if (!this.f63039g.mo33990c(this.f63038f.getClassName())) {
                mo34002b(this.f63034b);
            }
        }
    }

    /* renamed from: a */
    public final void mo33999a(aebb aebb) {
        bljb a;
        synchronized (this.f63035c) {
            if (this.f63036d == null) {
                this.f63036d = sne.m35694a(2, 10);
            }
            bqgj bqgj = this.f63036d;
            try {
                synchronized (this.f63043k) {
                    if (!this.f63043k.containsKey(aebb.f63025a)) {
                        aecc aecc = new aecc(aebb.f63025a, aebb.f63026b, aebb.f63027c);
                        String str = aebb.f63025a;
                        aech aech = new aech(str.length() == 0 ? new String("nts:client:onRunTask:") : "nts:client:onRunTask:".concat(str));
                        try {
                            blji a2 = aebb.f63028d.f63040h.mo16694a("onRunTaskAsync", adzz.I_HAVE_PRIVILEGE_TO_CALL_THIS_API);
                            try {
                                a = blkh.m107281a("ScheduledTaskImpl");
                                bqgg a3 = bqga.m112771a(new aeaz(aebb, aecc), bqgj);
                                a.mo66586a(a3);
                                if (a != null) {
                                    a.close();
                                }
                                if (a2 != null) {
                                    a2.close();
                                }
                                aech.close();
                                a3.mo741a(new aeba(aebb, a3), bqfb.INSTANCE);
                                snl.m35700a(a3);
                                this.f63043k.put(aebb.f63025a, a3);
                            } catch (Throwable th) {
                                if (a2 != null) {
                                    a2.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            try {
                                aech.close();
                            } catch (Throwable th3) {
                                bqye.m113761a(th2, th3);
                            }
                            throw th2;
                        }
                    } else {
                        throw new IllegalStateException("More than one task with the same tag are running");
                    }
                }
            } catch (RejectedExecutionException e) {
                Log.w("GmsTaskChimeraService", "Executor is shutdown. onDestroy was called but main looper had an unprocessed start task message. The task will be retried with backoff delay.", e);
                aebb.mo33995a(1);
            }
        }
        return;
        throw th;
    }

    /* renamed from: a */
    public final boolean mo34000a(String str) {
        boolean z;
        synchronized (this.f63033a) {
            z = !this.f63039g.mo33988b(str, this.f63038f.getClassName());
            if (z) {
                String packageName = getPackageName();
                StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 44 + str.length());
                sb.append(packageName);
                sb.append(" ");
                sb.append(str);
                sb.append(": Task already running, won't start another");
                Log.w("GmsTaskChimeraService", sb.toString());
            }
        }
        return z;
    }
}
