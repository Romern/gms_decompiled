package p000;

import android.accounts.Account;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: bafp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bafp implements bafj {

    /* renamed from: c */
    private static final bann f100712c;

    /* renamed from: a */
    public final Map f100713a = new HashMap();

    /* renamed from: b */
    public final bqej f100714b = bqej.m112702a();

    /* renamed from: d */
    private final cayo f100715d;

    /* renamed from: e */
    private final cayo f100716e;

    /* renamed from: f */
    private final barb f100717f;

    /* renamed from: g */
    private final barb f100718g;

    /* renamed from: h */
    private final bamr f100719h;

    /* renamed from: i */
    private final cayo f100720i;

    /* renamed from: j */
    private final cijl f100721j;

    /* renamed from: k */
    private final babr f100722k;

    static {
        banm a = bann.m87218a();
        a.mo55807a(':');
        f100712c = a.mo55806a();
    }

    public bafp(cayo cayo, cayo cayo2, barb barb, barb barb2, bamr bamr, cayo cayo3, cijl cijl, babr babr) {
        this.f100715d = cayo;
        this.f100716e = cayo2;
        this.f100717f = barb;
        this.f100718g = barb2;
        this.f100719h = bamr;
        this.f100720i = cayo3;
        this.f100721j = cijl;
        this.f100722k = babr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x015f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        ((p000.achw) r13.f100716e.mo16713a()).mo25418e("Failure cleaning up erroneous creation of accessor object", new java.lang.Object[0]);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:26:0x014f, B:35:0x015b] */
    /* renamed from: a */
    public final bafl mo55662a(Account account, int i, int i2) {
        byhs byhs;
        Map map;
        Account account2 = account;
        int i3 = i;
        int i4 = i2;
        bygz a = bafi.m86741a(i3, i4, byhm.SYNC_LATEST_PER_SECONDARY_ID);
        try {
            for (bygv bygv : ((bygw) ((baar) this.f100721j).mo6445a().get()).f166400a) {
                bygz bygz = bygv.f166392c;
                if (bygz == null) {
                    bygz = bygz.f166410c;
                }
                if (bygz.equals(a)) {
                    if (bygv.f166390a == 4) {
                        byhs = (byhs) bygv.f166391b;
                    } else {
                        byhs = byhs.f166502c;
                    }
                    babm a2 = babm.m86492a(account2, a);
                    bobb a3 = bobb.m111033a();
                    Map map2 = this.f100713a;
                    synchronized (map2) {
                        try {
                            bafl bafl = (bafl) this.f100713a.get(a2);
                            if (bafl == null) {
                                String a4 = f100712c.mo55808a(account2.type);
                                String a5 = f100712c.mo55808a(account2.name);
                                StringBuilder sb = new StringBuilder(String.valueOf(a4).length() + 25 + String.valueOf(a5).length());
                                sb.append(a4);
                                sb.append(':');
                                sb.append(a5);
                                sb.append(':');
                                sb.append(i3);
                                sb.append(':');
                                sb.append(i4);
                                bamr b = this.f100719h.mo55781b(sb.toString());
                                a3.mo68842a(b);
                                cayo cayo = this.f100716e;
                                bamq a6 = b.mo55779a("data");
                                a3.mo68842a(a6);
                                bamn bamn = new bamn(this.f100715d, ((Integer) this.f100717f.mo32621a()).intValue(), (bxxk) byhr.f166494g.mo74142c(7), b.mo55779a("changelog"), this.f100722k);
                                a3.mo68842a(bamn);
                                bamn bamn2 = new bamn(this.f100715d, ((Integer) this.f100717f.mo32621a()).intValue(), (bxxk) byhr.f166494g.mo74142c(7), b.mo55779a("synclog"), this.f100722k);
                                a3.mo68842a(bamn2);
                                bamf bamf = new bamf(new bamo(b.mo55779a("metadata")));
                                a3.mo68842a(bamf);
                                map = map2;
                                try {
                                    bafq bafq = new bafq(cayo, a2, byhs, a6, bamn, bamn2, bamf, b, this.f100720i, this, ((Integer) this.f100718g.mo32621a()).intValue());
                                    this.f100713a.put(a2, bafq);
                                    bafl = bafq;
                                } catch (IOException e) {
                                    e = e;
                                    IOException iOException = e;
                                    a3.close();
                                    throw banv.m87235a(iOException);
                                }
                            } else {
                                map = map2;
                            }
                            this.f100714b.mo69174c(a2);
                            return bafl;
                        } catch (IOException e2) {
                            e = e2;
                            map = map2;
                            IOException iOException2 = e;
                            a3.close();
                            throw banv.m87235a(iOException2);
                        } catch (Throwable th) {
                            th = th;
                            map = map2;
                            throw th;
                        }
                    }
                }
            }
            String valueOf = String.valueOf(a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 47);
            sb2.append("Didn't find find channel ");
            sb2.append(valueOf);
            sb2.append(" in ChannelConfigList.");
            throw new banv(sb2.toString());
        } catch (InterruptedException | ExecutionException e3) {
            throw new banv("Failed to retrieve Channel properties", e3);
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        synchronized (this.f100713a) {
            for (Map.Entry entry : this.f100713a.entrySet()) {
                ((achw) this.f100716e.mo16713a()).mo25416d("Channel %s was not closed. Closing it in finalizer.", entry.getKey());
                ((bafl) entry.getValue()).close();
            }
        }
        super.finalize();
    }

    /* renamed from: a */
    public final void mo55663a() {
        synchronized (this.f100713a) {
            while (!this.f100714b.mo69173b()) {
                try {
                    this.f100713a.wait();
                } catch (InterruptedException e) {
                    ((achw) this.f100716e.mo16713a()).mo25417e("resetAndDelete interrupted", e, new Object[0]);
                }
            }
            this.f100719h.mo55780a();
        }
    }
}
