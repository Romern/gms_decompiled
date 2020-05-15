package p000;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.MdhFootprint;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: acgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acgc extends rns {

    /* renamed from: a */
    public final afmu f59740a;

    /* renamed from: b */
    final /* synthetic */ acgf f59741b;

    /* renamed from: c */
    private final acgd f59742c;

    /* renamed from: d */
    private final Queue f59743d = new ArrayDeque();

    /* renamed from: e */
    private boolean f59744e = false;

    public acgc(acgf acgf, acgd acgd, afmu afmu) {
        this.f59741b = acgf;
        this.f59742c = acgd;
        this.f59740a = afmu;
    }

    /* renamed from: b */
    private final boolean m49047b(acge acge) {
        int i = 0;
        while (i < 3) {
            try {
                byhq byhq = acge.f59751a;
                if (byhq != null) {
                    MdhFootprint mdhFootprint = acge.f59752b;
                    if (byhq.ordinal() == 1) {
                        this.f59740a.mo32721a(this, new MdhFootprintListSafeParcelable(bngx.m109356a(mdhFootprint)));
                    } else {
                        this.f59741b.f59757b.mo25418e("Listener re-set change type %s.", byhq);
                        throw new acgb();
                    }
                } else {
                    bngx bngx = acge.f59754d;
                    if (bngx != null) {
                        this.f59740a.mo32719a(this, acge.f59753c, new MdhFootprintListSafeParcelable(bngx));
                    } else {
                        this.f59740a.mo32720a(this, acge.f59755e);
                    }
                }
                return true;
            } catch (TransactionTooLargeException e) {
                i++;
                this.f59741b.f59757b.mo25416d("Listener send attempt %d/%d (TransactionTooLargeException)", Integer.valueOf(i), 3);
                try {
                    Thread.sleep((long) Math.scalb(Math.random(), i));
                } catch (InterruptedException e2) {
                }
            } catch (RemoteException e3) {
                this.f59741b.f59757b.mo25418e("Listener send to %s failed", this.f59742c.f59745a);
                return false;
            } catch (acgb e4) {
                return false;
            }
        }
        this.f59741b.f59757b.mo25418e("Listener send to %s failed (too many attempts)", this.f59742c.f59745a);
        return false;
    }

    /* renamed from: a */
    public final synchronized void mo32723a() {
        this.f59743d.clear();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        if (m49047b(r3) != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        r2.f59742c.mo32725a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2.f59744e = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0030, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0035, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo32724a(acge acge) {
        synchronized (this) {
            if (!this.f59744e) {
                this.f59744e = true;
            } else if (this.f59743d.size() < 16) {
                this.f59743d.add(acge);
            } else {
                this.f59742c.mo32725a();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2.f59742c.mo32725a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2.f59744e = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x002f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (m49047b(r3) != false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r3 = r2.f59741b.f59756a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        monitor-enter(r3);
     */
    /* renamed from: a */
    public final void mo11797a(Status status) {
        synchronized (this) {
            if (!this.f59743d.isEmpty()) {
                acge acge = (acge) this.f59743d.remove();
            } else {
                this.f59744e = false;
            }
        }
    }
}
