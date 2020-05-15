package p000;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.util.concurrent.Executor;

/* renamed from: aedj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aedj implements aect {

    /* renamed from: a */
    public final bxvp f63208a;

    /* renamed from: b */
    public final aeec f63209b;

    /* renamed from: c */
    public final bbiw f63210c;

    /* renamed from: d */
    public final aeev f63211d;

    /* renamed from: e */
    private final bmzi f63212e;

    /* renamed from: f */
    private final aeeg f63213f;

    /* renamed from: g */
    private final bbiv f63214g;

    /* renamed from: h */
    private final bbnn f63215h;

    /* renamed from: i */
    private final bbim f63216i;

    /* renamed from: j */
    private final bqfj f63217j = bqfj.m112745a();

    public aedj(bxvp bxvp, aeev aeev, bmzi bmzi, aeeg aeeg, bbiv bbiv, bbnn bbnn, aeec aeec, bbiw bbiw, bbim bbim) {
        this.f63208a = bxvp;
        this.f63211d = aeev;
        this.f63212e = bmzi;
        this.f63213f = aeeg;
        this.f63214g = bbiv;
        this.f63215h = bbnn;
        this.f63209b = aeec;
        this.f63210c = bbiw;
        this.f63216i = bbim;
    }

    /* renamed from: a */
    public static bqgg m51666a(bqgg bqgg) {
        return bqdx.m112673a(bqgg, aecv.f63175a, bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final int mo34063a(bqgg bqgg, int i) {
        byks byks;
        aeef aeef = (aeef) this.f63212e.mo6606a();
        aeew a = aeew.m51774a(this.f63211d);
        if (aeef != null) {
            byks = aeef.mo34091b(i);
        } else {
            byks = null;
        }
        int a2 = a.mo34108a(byks, bqgg, null);
        if (this.f63211d.mo14852a()) {
            this.f63208a.mo3214a();
        }
        return a2;
    }

    /* renamed from: a */
    public final int mo34064a(bqgg bqgg, int i, bmxj bmxj) {
        byks byks;
        aeef aeef = (aeef) this.f63212e.mo6606a();
        aeew a = aeew.m51774a(this.f63211d);
        if (aeef != null) {
            byks = aeef.mo34091b(i);
        } else {
            byks = null;
        }
        int a2 = a.mo34108a(byks, bqgg, bmxj);
        if (this.f63211d.mo14852a()) {
            this.f63208a.mo3214a();
        }
        return a2;
    }

    @Deprecated
    /* renamed from: a */
    public final int mo34065a(String str) {
        return this.f63213f.mo34092a(str);
    }

    /* renamed from: a */
    public final bqgg mo34066a(bbjo bbjo, int i, Executor executor) {
        return mo34068a(new aecu(bbjo), i, executor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0062, code lost:
        if (r3 == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009a, code lost:
        if (((android.net.ConnectivityManager) r10.f102756b.mo6606a()).isActiveNetworkMetered() == false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a3, code lost:
        if (r0 != false) goto L_0x00b4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0060  */
    /* renamed from: a */
    public final bqgg mo34067a(bbjr bbjr, int i, bbmw bbmw) {
        char c;
        int intExtra;
        aeef aeef = (aeef) this.f63212e.mo6606a();
        if (aeef == null || !aeef.mo34090a(i)) {
            throw new bbjk();
        }
        int i2 = 1;
        if (i == 1) {
            bbiv bbiv = this.f63214g;
            bylh bylh = aeef.f63268a;
            if (bylh != null) {
                bylg bylg = bylh.f166836c;
                if (bylg == null) {
                    bylg = bylg.f166825e;
                }
                int a = byld.m124923a(bylg.f166829c);
                if (a == 0) {
                    a = 1;
                }
                boolean z = bylg.f166830d;
                if (a - 1 == 2) {
                    Intent registerReceiver = bbiv.f102755a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    if (!(registerReceiver == null || (intExtra = registerReceiver.getIntExtra("status", 1)) == 1)) {
                        if (intExtra == 2) {
                            c = 3;
                        } else if (intExtra == 5) {
                            c = 3;
                        } else if (intExtra == 3 || intExtra == 4) {
                            c = 2;
                        }
                        if (c != 3) {
                            if (c != 1) {
                            }
                            throw new bbjh();
                        }
                    }
                    c = 1;
                    if (c != 3) {
                    }
                }
                int a2 = bylf.m124925a(bylg.f166827a);
                if (a2 != 0) {
                    i2 = a2;
                }
                boolean z2 = bylg.f166828b;
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) bbiv.f102756b.mo6606a()).getActiveNetworkInfo();
                int i3 = i2 - 1;
                if (i3 != 2) {
                    if (i3 == 3) {
                        if (activeNetworkInfo != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            if (activeNetworkInfo.isConnected()) {
                            }
                            throw new bbjh();
                        }
                    }
                } else if (activeNetworkInfo != null) {
                    z2 = activeNetworkInfo.isConnected();
                }
            } else {
                throw new IllegalStateException("Unscheduled sync policy is not enabled");
            }
        }
        return bbjr.mo34062a(bbmw);
    }

    /* renamed from: a */
    public final bqgg mo34068a(bbjr bbjr, int i, Executor executor) {
        bqgg bqgg;
        this.f63208a.mo3214a();
        bbim bbim = this.f63216i;
        if (bbim != null) {
            bbim.mo56150a();
        }
        bbnn bbnn = this.f63215h;
        if (bbnn == null) {
            bqgg = this.f63217j.mo69205a(new aecz(this, bbjr, i), executor);
        } else {
            bqgg = this.f63217j.mo69205a(new aeda(this, bbjr, i, bbnn, executor), executor);
        }
        bqga.m112781a(bqgg, new aedi(this), executor);
        return bqgg;
    }
}
