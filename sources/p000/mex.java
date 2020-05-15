package p000;

import android.app.backup.BackupManagerMonitor;
import android.app.backup.BackupObserver;
import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.CountDownLatch;

/* renamed from: mex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mex {

    /* renamed from: a */
    public static final lvn f33552a = new lvn("BackupTask");

    /* renamed from: b */
    public final String f33553b;

    /* renamed from: c */
    public final CountDownLatch f33554c;

    /* renamed from: d */
    public final mew f33555d;

    /* renamed from: e */
    public final mfp f33556e;

    /* renamed from: f */
    public Integer f33557f;

    /* renamed from: g */
    public Integer f33558g;

    /* renamed from: h */
    public boolean f33559h = false;

    /* renamed from: i */
    private final Context f33560i;

    /* renamed from: j */
    private final long f33561j;

    /* renamed from: k */
    private final lvp f33562k;

    /* renamed from: l */
    private final BackupManagerMonitor f33563l;

    /* renamed from: m */
    private boolean f33564m;

    /* renamed from: n */
    private final BackupObserver f33565n = new mev(this);

    public mex(Context context, lvp lvp, mfp mfp, String str, long j, BackupManagerMonitor backupManagerMonitor) {
        sdo.m34974b(!TextUtils.isEmpty(str));
        this.f33560i = context;
        this.f33553b = str;
        this.f33561j = j;
        this.f33562k = lvp;
        this.f33554c = new CountDownLatch(1);
        this.f33555d = new mew(this, this.f33560i.getMainLooper());
        this.f33556e = mfp;
        this.f33563l = backupManagerMonitor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0046, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo19903a() {
        if (!this.f33564m) {
            this.f33564m = true;
            this.f33555d.sendMessageDelayed(this.f33555d.obtainMessage(0), this.f33561j);
            lvp lvp = this.f33562k;
            if (lvp.mo19648f()) {
                lvp.f33054a.cancelBackups();
            }
            f33552a.mo25409a("Requesting backup of %s", this.f33553b);
            int a = this.f33562k.mo19638a(new String[]{this.f33553b}, this.f33565n, this.f33563l, 1);
            if (a != 0) {
                mo19904a(a);
            }
        } else {
            f33552a.mo25412b("Called run on a task that is already running.", new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo19905b(int i) {
        this.f33557f = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo19904a(int i) {
        this.f33555d.removeMessages(2);
        this.f33555d.removeMessages(1);
        this.f33555d.removeMessages(0);
        this.f33558g = Integer.valueOf(i);
        this.f33554c.countDown();
    }
}
