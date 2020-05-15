package p000;

import android.os.Parcel;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.MdhFootprint;
import com.google.android.gms.mdh.SyncStatus;
import com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: acgk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acgk extends rns {

    /* renamed from: a */
    final /* synthetic */ acgn f59774a;

    /* renamed from: b */
    public final afnj f59775b;

    /* renamed from: c */
    private final acgl f59776c;

    /* renamed from: d */
    private final Queue f59777d = new ArrayDeque();

    /* renamed from: e */
    private boolean f59778e = false;

    public acgk(acgn acgn, acgl acgl, afnj afnj) {
        this.f59774a = acgn;
        this.f59776c = acgl;
        this.f59775b = afnj;
    }

    /* renamed from: b */
    private final boolean m49065b(acgm acgm) {
        int i = 0;
        while (i < 3) {
            try {
                byhx byhx = acgm.f59784a;
                if (byhx != null) {
                    MdhFootprint mdhFootprint = acgm.f59785b;
                    if (byhx.ordinal() == 1) {
                        afnj afnj = this.f59775b;
                        MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable = new MdhFootprintListSafeParcelable(bngx.m109356a(mdhFootprint));
                        Parcel bj = afnj.mo8529bj();
                        dcl.m8164a(bj, this);
                        dcl.m8165a(bj, mdhFootprintListSafeParcelable);
                        afnj.mo8530c(2, bj);
                    } else {
                        this.f59774a.f59790b.mo25418e("Listener re-set change type %s.", byhx);
                        throw new acgj();
                    }
                } else {
                    bngx bngx = acgm.f59787d;
                    if (bngx == null) {
                        bacv bacv = acgm.f59788e;
                        afnj afnj2 = this.f59775b;
                        SyncStatus a = accu.m48909a(bacv);
                        Parcel bj2 = afnj2.mo8529bj();
                        dcl.m8164a(bj2, this);
                        dcl.m8165a(bj2, a);
                        afnj2.mo8530c(4, bj2);
                    } else {
                        TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter = acgm.f59786c;
                        afnj afnj3 = this.f59775b;
                        MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable2 = new MdhFootprintListSafeParcelable(bngx);
                        Parcel bj3 = afnj3.mo8529bj();
                        dcl.m8164a(bj3, this);
                        dcl.m8165a(bj3, timeSeriesFootprintsSubscriptionFilter);
                        dcl.m8165a(bj3, mdhFootprintListSafeParcelable2);
                        afnj3.mo8530c(1, bj3);
                    }
                }
                return true;
            } catch (TransactionTooLargeException e) {
                i++;
                this.f59774a.f59790b.mo25416d("Listener send attempt %d/%d (TransactionTooLargeException)", Integer.valueOf(i), 3);
                try {
                    Thread.sleep((long) Math.scalb(Math.random(), i));
                } catch (InterruptedException e2) {
                }
            } catch (RemoteException e3) {
                this.f59774a.f59790b.mo25418e("Listener send to %s failed", this.f59776c.f59779a);
                return false;
            } catch (acgj e4) {
                return false;
            }
        }
        this.f59774a.f59790b.mo25418e("Listener send to %s failed (too many attempts)", this.f59776c.f59779a);
        return false;
    }

    /* renamed from: a */
    public final synchronized void mo32736a() {
        this.f59777d.clear();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        if (m49065b(r3) != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        r2.f59776c.mo32738a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2.f59778e = false;
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
    public final void mo32737a(acgm acgm) {
        synchronized (this) {
            if (!this.f59778e) {
                this.f59778e = true;
            } else if (this.f59777d.size() < 16) {
                this.f59777d.add(acgm);
            } else {
                this.f59776c.mo32738a();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2.f59776c.mo32738a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2.f59778e = false;
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
        if (m49065b(r3) != false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r3 = r2.f59774a.f59789a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        monitor-enter(r3);
     */
    /* renamed from: a */
    public final void mo11797a(Status status) {
        synchronized (this) {
            if (!this.f59777d.isEmpty()) {
                acgm acgm = (acgm) this.f59777d.remove();
            } else {
                this.f59778e = false;
            }
        }
    }
}
