package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Looper;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.contextmanager.producer.module.indooroutdoor.WifiFeatureGroupGenerator;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: dzh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dzh extends dyd {

    /* renamed from: b */
    public static final long f14475b = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: j */
    public static final long f14476j = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: k */
    public static final dxr f14477k = new dxr(new dzf(), "IndoorOutdoorProducer", new int[]{57}, null, true);

    /* renamed from: l */
    private final dzz f14478l = new dzz(cdgr.f180849am, cdgr.f180848al, cdgr.f180847ak);

    /* renamed from: m */
    private ebv f14479m;

    public dzh(Context context, doh doh, String str, dqb dqb) {
        super(context, doh, f14477k, str, dqb);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* renamed from: a */
    private final void m9878a(ebv ebv) {
        int i = this.f14478l.f14510b;
        boolean z = true;
        boolean z2 = false;
        if (i != 100) {
            if (i != 102) {
                if (i == 104) {
                    z = false;
                } else if (i != 105) {
                    bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                    bnsl.mo68432a("dzh", "a", (int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68409a("[IndoorOutdoorProducer] Unknown priority %s", i);
                    z = false;
                } else {
                    z = false;
                }
            }
            ebt ebt = ebv.f14629c;
            ebt.f14622a = z;
            if (z) {
                ebt.mo9929b();
            } else if (ebt.f14623b) {
                ebt.mo9928a();
            }
            ebv.mo9931a(z2);
        }
        z2 = true;
        ebt ebt2 = ebv.f14629c;
        ebt2.f14622a = z;
        if (z) {
        }
        ebv.mo9931a(z2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: c */
    private final void m9879c() {
        boolean z;
        ebv ebv;
        boolean z2 = false;
        Object[] objArr = {this.f14479m, Integer.valueOf(this.f14478l.f14510b), Long.valueOf(this.f14478l.f14511c)};
        if (this.f14479m == null) {
            try {
                this.f14479m = new ebv(this.f14388d, new dzg(this), Looper.getMainLooper());
            } catch (IOException e) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("dzh", "c", 227, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[IndoorOutdoorProducer] The IndoorOutdoorGenerator couldn't be initialized due to an IOException");
                return;
            }
        }
        long max = Math.max(this.f14478l.f14511c, 5000L);
        ebx ebx = this.f14479m.f14627a;
        ebx.m10080a(max);
        ebx.f14637c = max;
        ebx.mo9933a();
        ebv ebv2 = this.f14479m;
        int i = this.f14478l.f14510b;
        if (i == 100) {
            z = true;
        } else if (i != 102) {
            if (i == 104) {
                z = true;
            } else if (i != 105) {
                bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
                bnsl2.mo68432a("dzh", "a", (int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68409a("[IndoorOutdoorProducer] Unknown priority %s", i);
                z = false;
            } else {
                z = false;
            }
            ebt ebt = ebv2.f14629c;
            ebt.f14622a = z2;
            if (z2) {
                ebt.mo9929b();
            } else if (ebt.f14623b) {
                ebt.mo9928a();
            }
            ebv2.mo9931a(z);
            ebv = this.f14479m;
            if (ebv.f14631e) {
                ebv.f14631e = true;
                WifiFeatureGroupGenerator wifiFeatureGroupGenerator = ebv.f14628b;
                if (!wifiFeatureGroupGenerator.f7717c) {
                    wifiFeatureGroupGenerator.f7717c = true;
                    wifiFeatureGroupGenerator.f7715a.registerReceiver(wifiFeatureGroupGenerator, new IntentFilter("android.net.wifi.SCAN_RESULTS"), null, wifiFeatureGroupGenerator.f7716b);
                }
                ebx ebx2 = ebv.f14627a;
                if (!ebx2.f14639e) {
                    ebx2.f14639e = true;
                    ebx2.mo9933a();
                }
                ebr ebr = ebv.f14630d;
                if (!ebr.f14615b) {
                    ebr.f14615b = true;
                    ebr.f14618e.post(new ebp(ebr));
                }
                ebt ebt2 = ebv.f14629c;
                if (!ebt2.f14623b) {
                    ebt2.f14623b = true;
                    if (ebt2.f14622a) {
                        ebt2.mo9928a();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        } else {
            z = false;
        }
        z2 = true;
        ebt ebt3 = ebv2.f14629c;
        ebt3.f14622a = z2;
        if (z2) {
        }
        ebv2.mo9931a(z);
        ebv = this.f14479m;
        if (ebv.f14631e) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9848b() {
        ebv ebv = this.f14479m;
        if (ebv != null && ebv.f14631e) {
            ebx ebx = ebv.f14627a;
            ebx.f14639e = false;
            ebx.mo9933a();
            WifiFeatureGroupGenerator wifiFeatureGroupGenerator = ebv.f14628b;
            if (wifiFeatureGroupGenerator.f7717c) {
                wifiFeatureGroupGenerator.f7715a.unregisterReceiver(wifiFeatureGroupGenerator);
                wifiFeatureGroupGenerator.f7717c = false;
            }
            ebt ebt = ebv.f14629c;
            ebt.mo9929b();
            ebt.f14623b = false;
            ebr ebr = ebv.f14630d;
            if (ebr.f14615b) {
                ebr.f14618e.post(new ebq(ebr));
                ebr.f14615b = false;
            }
            ebv.f14631e = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9845a() {
        m9879c();
    }

    /* renamed from: a */
    public final void mo9854a(dwa dwa) {
        new Object[1][0] = dwa;
        this.f14478l.mo9897a(dwa);
        m9879c();
    }

    /* renamed from: a */
    public final void mo9855a(dwa dwa, dwa dwa2) {
        Object[] objArr = {dwa, dwa2};
        this.f14478l.mo9898a(dwa, dwa2);
        m9879c();
    }
}
