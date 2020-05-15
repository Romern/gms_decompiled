package p000;

import android.content.Context;
import android.util.LongSparseArray;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.smartdevice.postsetup.ConnectionHint;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: mlq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mlq {

    /* renamed from: a */
    public static final lvn f33956a = new lvn("WifiSourceSocket");

    /* renamed from: b */
    public final ahie f33957b;

    /* renamed from: c */
    public final ExecutorService f33958c;

    /* renamed from: d */
    public final LongSparseArray f33959d = new LongSparseArray();

    /* renamed from: e */
    public byte[] f33960e;

    /* renamed from: f */
    private final mlh f33961f;

    /* renamed from: g */
    private final mle f33962g;

    /* renamed from: h */
    private final LongSparseArray f33963h = new LongSparseArray();

    /* renamed from: i */
    private final bmzi f33964i = bmzn.m108681a(mlf.f33936a);

    /* renamed from: j */
    private boolean f33965j;

    /* renamed from: k */
    private String f33966k;

    /* renamed from: l */
    private final Queue f33967l = new ArrayDeque();

    /* renamed from: m */
    private boolean f33968m;

    public mlq(mlh mlh, ahie ahie, ExecutorService executorService, mle mle) {
        bmxy.m108581a(mlh);
        this.f33961f = mlh;
        bmxy.m108581a(ahie);
        this.f33957b = ahie;
        bmxy.m108581a(executorService);
        this.f33958c = executorService;
        bmxy.m108581a(mle);
        this.f33962g = mle;
    }

    /* renamed from: a */
    static mlq m25294a(mlh mlh, Context context, ExecutorService executorService, mle mle) {
        ahif ahif = new ahif();
        ahif.f67236a = "backup.d2d";
        return new mlq(mlh, ahcb.m55439a(context, ahif.mo36530a()), executorService, mle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        return;
     */
    /* renamed from: b */
    private final synchronized void m25295b(PayloadTransferUpdate payloadTransferUpdate) {
        int i = payloadTransferUpdate.f80477b;
        if (i != 3) {
            long j = payloadTransferUpdate.f80476a;
            if (i == 1) {
                f33956a.mo25409a("Successfully send payload (id=%d).", Long.valueOf(j));
                mjm mjm = (mjm) this.f33959d.get(j);
                if (mjm != null) {
                    mjm.mo20024a(1);
                    this.f33959d.delete(j);
                }
                this.f33968m = false;
                this.f33967l.remove();
                m25297d();
            } else if (i == 2) {
                f33956a.mo25418e("Failed to send payload (id=%d)! Transport will shut down soon.", Long.valueOf(j));
            } else if (i != 4) {
                f33956a.mo25418e("Unexpected PayloadTransferUpdate status: %d. Ignoring.", Integer.valueOf(payloadTransferUpdate.f80477b));
            } else {
                f33956a.mo25418e("Payload cancelled. Should not happen!", new Object[0]);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0097, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c4, code lost:
        return;
     */
    /* renamed from: c */
    private final synchronized void m25296c(PayloadTransferUpdate payloadTransferUpdate) {
        PayloadTransferUpdate payloadTransferUpdate2 = payloadTransferUpdate;
        synchronized (this) {
            long j = payloadTransferUpdate2.f80476a;
            mlg mlg = (mlg) this.f33963h.get(j);
            if (mlg != null) {
                mjm mjm = (mjm) this.f33959d.get(j);
                int i = payloadTransferUpdate2.f80477b;
                if (i == 3) {
                    try {
                        long j2 = payloadTransferUpdate2.f80479d - mlg.f33939c;
                        lvn lvn = f33956a;
                        Long valueOf = Long.valueOf(j2);
                        lvn.mo25409a("Received %d bytes from stream payload (id=%d)", valueOf, Long.valueOf(j));
                        byte[] bArr = new byte[((int) j2)];
                        int read = mlg.f33937a.read(bArr);
                        if (((long) read) != j2) {
                            f33956a.mo25418e("Expected %d bytes from incoming stream but got %d bytes!", valueOf, Integer.valueOf(read));
                        }
                        mlg.f33938b.write(bArr, 0, read);
                        mlg.f33939c += j2;
                    } catch (IOException e) {
                        f33956a.mo25417e("Failed to copy received bytes from stream payload (id=%d).", e, Long.valueOf(j));
                        if (mjm != null) {
                            mjm.mo20024a(3);
                        }
                    }
                } else if (i == 1) {
                    this.f33963h.remove(j);
                    this.f33959d.remove(j);
                    if (mjm != null) {
                        mjm.mo20024a(1);
                    }
                } else if (i == 2) {
                    f33956a.mo25418e("Failed to send payload (id=%d)! Transport will shut down soon.", Long.valueOf(j));
                } else if (i != 4) {
                    f33956a.mo25418e("Invalid PayloadTransferUpdate status: %d. Ignoring.", Integer.valueOf(payloadTransferUpdate2.f80477b));
                } else {
                    f33956a.mo25418e("Payload cancelled. Should not happen!", new Object[0]);
                }
            }
        }
    }

    /* renamed from: d */
    private final synchronized void m25297d() {
        String str;
        if (!this.f33965j && !this.f33968m && !this.f33967l.isEmpty() && (str = this.f33966k) != null) {
            this.f33968m = true;
            this.f33957b.mo36526a(str, (ahiq) this.f33967l.element());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized int mo20152a() {
        ahie ahie;
        ahie ahie2;
        f33956a.mo25412b("connect", new Object[0]);
        if (this.f33965j) {
            f33956a.mo25416d("Ignore as socket is shutdown already.", new Object[0]);
            return 2;
        }
        bqgy c = bqgy.m112818c();
        try {
            mle mle = this.f33962g;
            mle.f33932a.mo25409a("getConnectionHint", new Object[0]);
            arsy arsy = mle.f33933b;
            arsy.getClass();
            String str = ((ConnectionHint) mle.mo20138a(new mkx(arsy))).f108098b;
            f33956a.mo25412b("connectionHint=%s", str);
            ahie ahie3 = this.f33957b;
            mlm mlm = new mlm(this, c, str);
            ahik ahik = new ahik();
            ahik.mo36534a(Strategy.f80482c);
            ahie3.mo36520a(str, mlm, ahik.f67244a);
            mll mll = (mll) c.get(((Long) this.f33964i.mo6606a()).longValue(), TimeUnit.MILLISECONDS);
            int i = mll.f33947b.f67235a.f30115i;
            if (i == 0) {
                this.f33966k = mll.f33946a;
                this.f33957b.mo36527b();
                return 0;
            } else if (i != 15) {
                ahie2 = this.f33957b;
                ahie2.mo36527b();
                return 4;
            } else {
                ahie = this.f33957b;
                ahie.mo36527b();
                return 1;
            }
        } catch (TimeoutException e) {
            try {
                f33956a.mo25412b("Timed out when trying to connect.", new Object[0]);
                c.cancel(true);
                ahie = this.f33957b;
            } catch (Throwable th) {
                this.f33957b.mo36527b();
                throw th;
            }
        } catch (InterruptedException | ExecutionException e2) {
            ahie2 = this.f33957b;
        } catch (mld e3) {
            this.f33957b.mo36527b();
            return 3;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo20155b() {
        f33956a.mo25412b("shutdown", new Object[0]);
        if (this.f33965j) {
            f33956a.mo25412b("Already shutdown. Nothing to do.", new Object[0]);
            return;
        }
        this.f33965j = true;
        this.f33957b.mo36528c();
    }

    /* renamed from: b */
    public final synchronized void mo20156b(ahiq ahiq) {
        if (!this.f33965j) {
            int i = ahiq.f67252b;
            if (i == 1) {
                mlh mlh = this.f33961f;
                byte[] bArr = ahiq.f67253c;
                mlx.f33978d.mo25414c("onBytesReceived", new Object[0]);
                try {
                    mpm mpm = (mpm) bxvk.m124014a(mpm.f34178i, bArr);
                    if ((mpm.f34180a & 1) != 0) {
                        mpl a = mpl.m25483a(mpm.f34181b);
                        if (a == null) {
                            a = mpl.PACKET_TYPE_UNSPECIFIED;
                        }
                        if (a == mpl.ERROR && (mpm.f34180a & 8) != 0) {
                            mpn mpn = mpm.f34184e;
                            if (mpn == null) {
                                mpn = mpn.f34188e;
                            }
                            if ((mpn.f34190a & 1) != 0) {
                                mpn mpn2 = mpm.f34184e;
                                if (mpn2 == null) {
                                    mpn2 = mpn.f34188e;
                                }
                                if (mpn2.f34191b == 1) {
                                    mlx.f33978d.mo25416d("Stream error received!", new Object[0]);
                                    ((mlx) mlh).f33841a.mo20029a().mo20024a(3);
                                    return;
                                }
                            }
                        }
                    }
                    ((mlx) mlh).f33841a.mo20043b(mpm);
                } catch (bxwf e) {
                    mlx.f33978d.mo25417e("Invalid packet received.", e, new Object[0]);
                    ((mlx) mlh).f33841a.mo20046e();
                }
            } else if (i != 3) {
                f33956a.mo25418e("Invalid payload type: %s", Integer.valueOf(ahiq.f67252b));
            } else {
                mlh mlh2 = this.f33961f;
                mlx.f33978d.mo25414c("onStreamReceived", new Object[0]);
                miu a2 = ((mlx) mlh2).f33841a.mo20029a();
                this.f33959d.put(ahiq.f67251a, a2);
                this.f33963h.put(ahiq.f67251a, new mlg(ahiq.f67255e.mo36538a(), a2.mo20025a()));
            }
        } else {
            f33956a.mo25414c("Already shutdown. Ignoring received payload %d", Long.valueOf(ahiq.f67251a));
        }
    }

    /* renamed from: c */
    public final synchronized void mo20157c() {
        f33956a.mo25412b("onDisconnected", new Object[0]);
        this.f33966k = null;
        this.f33960e = null;
        this.f33968m = false;
        this.f33967l.clear();
        for (int i = 0; i < this.f33959d.size(); i++) {
            ((mjm) this.f33959d.valueAt(i)).mo20024a(2);
        }
        this.f33959d.clear();
        this.f33963h.clear();
        if (!this.f33965j) {
            this.f33961f.mo20139c();
        }
    }

    /* renamed from: a */
    public final synchronized void mo20153a(ahiq ahiq) {
        if (this.f33966k == null) {
            f33956a.mo25416d("Unable to send payload as devices are disconnected. Transport will shutdown soon.", new Object[0]);
            return;
        }
        this.f33967l.offer(ahiq);
        m25297d();
    }

    /* renamed from: a */
    public final synchronized void mo20154a(PayloadTransferUpdate payloadTransferUpdate) {
        if (this.f33965j) {
            f33956a.mo25414c("Already shutdown. Ignoring update for payload %d", Long.valueOf(payloadTransferUpdate.f80476a));
            return;
        }
        if (this.f33968m) {
            if (payloadTransferUpdate.f80476a == ((ahiq) this.f33967l.element()).f67251a) {
                m25295b(payloadTransferUpdate);
                return;
            }
        }
        m25296c(payloadTransferUpdate);
    }
}
