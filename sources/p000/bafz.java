package p000;

import android.accounts.Account;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bafz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bafz implements bafu {

    /* renamed from: c */
    private static final bann f100752c;

    /* renamed from: a */
    public final Map f100753a = new HashMap();

    /* renamed from: b */
    public final bqej f100754b = bqej.m112702a();

    /* renamed from: d */
    private final cayo f100755d;

    /* renamed from: e */
    private final cayo f100756e;

    /* renamed from: f */
    private final barb f100757f;

    /* renamed from: g */
    private final barb f100758g;

    /* renamed from: h */
    private final bamr f100759h;

    /* renamed from: i */
    private final cayo f100760i;

    /* renamed from: j */
    private final babr f100761j;

    static {
        banm a = bann.m87218a();
        a.mo55807a(':');
        f100752c = a.mo55806a();
    }

    public bafz(cayo cayo, cayo cayo2, barb barb, barb barb2, bamr bamr, cayo cayo3, babr babr) {
        this.f100755d = cayo;
        this.f100756e = cayo2;
        this.f100757f = barb;
        this.f100758g = barb2;
        this.f100759h = bamr;
        this.f100760i = cayo3;
        this.f100761j = babr;
    }

    /* renamed from: a */
    public final bafv mo55681a(Account account, int i, int i2) {
        bafv bafv;
        Account account2 = account;
        int i3 = i;
        int i4 = i2;
        babm a = babm.m86492a(account2, bafi.m86741a(i3, i4, byhm.SYNC_FULL_SNAPSHOT));
        bobb a2 = bobb.m111033a();
        synchronized (this.f100753a) {
            try {
                bafv = (bafv) this.f100753a.get(a);
                if (bafv == null) {
                    String a3 = f100752c.mo55808a(account2.type);
                    String a4 = f100752c.mo55808a(account2.name);
                    StringBuilder sb = new StringBuilder(String.valueOf(a3).length() + 25 + String.valueOf(a4).length());
                    sb.append(a3);
                    sb.append(':');
                    sb.append(a4);
                    sb.append(':');
                    sb.append(i3);
                    sb.append(':');
                    sb.append(i4);
                    bamr b = this.f100759h.mo55781b(sb.toString());
                    a2.mo68842a(b);
                    cayo cayo = this.f100756e;
                    bamq a5 = b.mo55779a("ts-data");
                    a2.mo68842a(a5);
                    bamn bamn = new bamn(this.f100755d, ((Integer) this.f100757f.mo32621a()).intValue(), (bxxk) byhy.f166528f.mo74142c(7), b.mo55779a("ts-changelog"), this.f100761j);
                    a2.mo68842a(bamn);
                    bamn bamn2 = new bamn(this.f100755d, ((Integer) this.f100757f.mo32621a()).intValue(), (bxxk) byhy.f166528f.mo74142c(7), b.mo55779a("ts-synclog"), this.f100761j);
                    a2.mo68842a(bamn2);
                    bamf bamf = new bamf(new bamo(b.mo55779a("ts-metadata")));
                    a2.mo68842a(bamf);
                    baga baga = new baga(cayo, a, a5, bamn, bamn2, bamf, b, this.f100760i, this, ((Integer) this.f100758g.mo32621a()).intValue());
                    this.f100753a.put(a, baga);
                    bafv = baga;
                }
                this.f100754b.mo69174c(a);
            } catch (IOException e) {
                IOException iOException = e;
                try {
                    a2.close();
                } catch (IOException e2) {
                    ((achw) this.f100756e.mo16713a()).mo25418e("Failure cleaning up erroneous creation of accessor object", new Object[0]);
                }
                throw banv.m87235a(iOException);
            }
        }
        return bafv;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        synchronized (this.f100753a) {
            for (Map.Entry entry : this.f100753a.entrySet()) {
                ((achw) this.f100756e.mo16713a()).mo25416d("Channel %s was not closed. Closing it in finalizer.", entry.getKey());
                ((bafv) entry.getValue()).close();
            }
        }
        super.finalize();
    }

    /* renamed from: a */
    public final void mo55682a() {
        synchronized (this.f100753a) {
            while (!this.f100754b.mo69173b()) {
                try {
                    this.f100753a.wait();
                } catch (InterruptedException e) {
                    ((achw) this.f100756e.mo16713a()).mo25417e("resetAndDelete interrupted", e, new Object[0]);
                }
            }
            this.f100759h.mo55780a();
        }
    }
}
