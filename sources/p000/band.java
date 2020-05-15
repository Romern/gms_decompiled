package p000;

import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.leveldb.WriteBatch;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: band */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class band extends bamz implements banb {

    /* renamed from: g */
    public final Object f101335g = new Object();

    /* renamed from: h */
    public final WriteBatch f101336h = WriteBatch.create();

    /* renamed from: i */
    public final Comparator f101337i = bqcv.f140491b;

    /* renamed from: j */
    public final NavigableSet f101338j = new TreeSet(this.f101337i);

    /* renamed from: k */
    public volatile boolean f101339k;

    /* renamed from: l */
    final /* synthetic */ bane f101340l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public band(bane bane) {
        super(bane);
        this.f101340l = bane;
        bane.f101341a.writeLock().lock();
    }

    /* renamed from: b */
    public final void mo55796b() {
        bmxy.m108601b(!this.f101328a, "Transaction is closed");
        bmxy.m108601b(!this.f101339k, "Transaction is successful already");
        this.f101339k = true;
    }

    public final void close() {
        boolean z;
        bmxy.m108601b(!this.f101328a, "Transaction is closed");
        try {
            if (this.f101339k) {
                this.f101340l.f101343c.mo55788e().write(this.f101336h);
            }
            try {
                this.f101336h.close();
                try {
                    if (!this.f101339k) {
                        mo55797b(this.f101330c);
                    } else {
                        mo55794a(this.f101329b);
                    }
                    if (!z) {
                        mo55797b(this.f101332e);
                    }
                } finally {
                    this.f101328a = true;
                    this.f101340l.f101341a.writeLock().unlock();
                    if (this.f101339k) {
                        mo55794a(this.f101331d);
                    } else {
                        mo55797b(this.f101332e);
                    }
                }
            } catch (Throwable th) {
                this.f101328a = true;
                this.f101340l.f101341a.writeLock().unlock();
                if (this.f101339k) {
                    mo55794a(this.f101331d);
                } else {
                    mo55797b(this.f101332e);
                }
                throw th;
            }
        } catch (LevelDbException e) {
            if (!this.f101340l.f101344d.mo32684f()) {
                this.f101340l.f101343c.mo55784a((Exception) e);
            } else if (bams.m87144a((Throwable) e)) {
                this.f101340l.f101346f.mo55758a();
            }
            throw e;
        } catch (Throwable th2) {
            this.f101336h.close();
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo55797b(Set set) {
        synchronized (set) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                bamf bamf = (bamf) it.next();
                try {
                    synchronized (bamf.f101252a) {
                        bamf.mo55741a();
                    }
                } catch (RuntimeException e) {
                    ((achw) this.f101340l.f101342b.mo16713a()).mo25418e("Close listeners failed", new Object[0]);
                    ((acdc) this.f101340l.f101345e.mo16713a()).mo32707a("MDH LevelDb close listeners failed", e);
                }
            }
        }
    }
}
