package com.google.android.gms.droidguard;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DroidGuardChimeraService extends TracingIntentService {

    /* renamed from: a */
    public static final bnic f31244a = bnic.m109489a("android.permission-group.PHONE");

    /* renamed from: b */
    public vyc f31245b;

    /* renamed from: c */
    public vze f31246c;

    /* renamed from: d */
    public Executor f31247d;

    /* renamed from: e */
    public vwf f31248e;

    /* renamed from: f */
    private vyd f31249f;

    /* renamed from: g */
    private Handler f31250g;

    public DroidGuardChimeraService() {
        super("DG");
        setIntentRedelivery(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x02c2 A[Catch:{ all -> 0x02b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02c3 A[Catch:{ all -> 0x02b4 }] */
    /* renamed from: a */
    private final void m23147a(byte[] bArr) {
        vwf vwf;
        vvy vvy;
        vyq vyq = null;
        try {
            vyq a = vyp.m41599a(this);
            try {
                vwc vwc = (vwc) a.f50246b.f164949b;
                if ((vwc.f50115a & 16) != 0) {
                    vvy = vwc.f50120f;
                    if (vvy == null) {
                        vvy = vvy.f50097b;
                    }
                } else {
                    vvy = null;
                }
                int f = a.mo28977f();
                int d = a.mo28975d();
                bxvd bxvd = a.f50246b;
                long currentTimeMillis = System.currentTimeMillis();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                vwc vwc2 = (vwc) bxvd.f164949b;
                vwc vwc3 = vwc.f50113h;
                vwc2.f50115a |= 4;
                vwc2.f50118d = currentTimeMillis;
                bxvd bxvd2 = a.f50246b;
                int f2 = a.mo28977f() + 1;
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                vwc vwc4 = (vwc) bxvd2.f164949b;
                vwc4.f50115a |= 8;
                vwc4.f50119e = f2;
                bxvd bxvd3 = a.f50246b;
                bxvd da = vvx.f50091e.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                vvx vvx = (vvx) da.f164949b;
                "Process unexpectedly died".getClass();
                vvx.f50093a |= 1;
                vvx.f50094b = "Process unexpectedly died";
                vvx vvx2 = (vvx) da.mo74062i();
                bxvd da2 = vvy.f50097b.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                vvy vvy2 = (vvy) da2.f164949b;
                vvx2.getClass();
                vvy2.mo28908a();
                vvy2.f50099a.add(vvx2);
                vvy vvy3 = (vvy) da2.mo74062i();
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                vwc vwc5 = (vwc) bxvd3.f164949b;
                vvy3.getClass();
                vwc5.f50120f = vvy3;
                vwc5.f50115a |= 16;
                a.f50245a.mo28979a(((vwc) a.f50246b.mo74062i()).mo73642k());
                vyc vyc = this.f31245b;
                vyo a2 = mo18375a("");
                vxz a3 = vyc.f50220a.mo28947a("full");
                if (vvy != null) {
                    bxvd bxvd4 = a3.f50215a;
                    if (bxvd4.f164950c) {
                        bxvd4.mo74035c();
                        bxvd4.f164950c = false;
                    }
                    vvt vvt = (vvt) bxvd4.f164949b;
                    vvt vvt2 = vvt.f50051p;
                    vvy.getClass();
                    vvt.f50065m = vvy;
                    vvt.f50053a |= 1024;
                } else {
                    bxvd bxvd5 = a3.f50215a;
                    if (bxvd5.f164950c) {
                        bxvd5.mo74035c();
                        bxvd5.f164950c = false;
                    }
                    vvt vvt3 = (vvt) bxvd5.f164949b;
                    vvt vvt4 = vvt.f50051p;
                    vvt3.f50065m = null;
                    vvt3.f50053a &= -1025;
                }
                bxvd bxvd6 = a3.f50215a;
                if (bxvd6.f164950c) {
                    bxvd6.mo74035c();
                    bxvd6.f164950c = false;
                }
                vvt vvt5 = (vvt) bxvd6.f164949b;
                vvt5.f50053a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                vvt5.f50063k = f;
                a3.mo28946a(vyc.f50222c);
                if (bArr != null) {
                    bxvd bxvd7 = a3.f50215a;
                    vwa vwa = (vwa) GeneratedMessageLite.m124016a(vwa.f50105c, bArr, bxus.m123743b());
                    if (bxvd7.f164950c) {
                        bxvd7.mo74035c();
                        bxvd7.f164950c = false;
                    }
                    vvt vvt6 = (vvt) bxvd7.f164949b;
                    vwa.getClass();
                    vvt6.f50066n = vwa;
                    vvt6.f50053a |= 2048;
                }
                vyi a4 = vyc.f50220a.mo28948a(a3.mo28945a());
                vyc.mo28952a(a4);
                vyj vyj = a4.f50231b;
                DroidGuardResultsRequest droidGuardResultsRequest = new DroidGuardResultsRequest();
                droidGuardResultsRequest.mo18377a(0);
                byte[] a5 = vyc.f50222c.mo28988a("full", vyj, a2, droidGuardResultsRequest).mo28990a(Collections.emptyMap());
                vxz a6 = vyc.f50220a.mo28947a("fast");
                bxvd bxvd8 = a6.f50215a;
                bxtx a7 = bxtx.m123261a(a5);
                if (bxvd8.f164950c) {
                    bxvd8.mo74035c();
                    bxvd8.f164950c = false;
                }
                vvt vvt7 = (vvt) bxvd8.f164949b;
                a7.getClass();
                vvt7.f50053a |= 128;
                vvt7.f50062j = a7;
                a6.mo28946a(vyc.f50222c);
                if (d > 0) {
                    bxvd bxvd9 = a6.f50215a;
                    if (bxvd9.f164950c) {
                        bxvd9.mo74035c();
                        bxvd9.f164950c = false;
                    }
                    vvt vvt8 = (vvt) bxvd9.f164949b;
                    vvt8.f50053a |= 512;
                    vvt8.f50064l = d;
                }
                vyi a8 = vyc.f50220a.mo28948a(a6.mo28945a());
                if (!a8.f50233d) {
                    vyc.mo28952a(a8);
                    vyc.f50221b.mo28960a(new vym("fast"), a8.f50231b);
                    vzc vzc = a8.f50234e;
                    if (vzc != null) {
                        bxvd bxvd10 = a.f50246b;
                        long j = vzc.f50271a;
                        if (bxvd10.f164950c) {
                            bxvd10.mo74035c();
                            bxvd10.f164950c = false;
                        }
                        vwc vwc6 = (vwc) bxvd10.f164949b;
                        vwc6.f50115a |= 1;
                        vwc6.f50116b = j;
                        bxvd bxvd11 = a.f50246b;
                        long j2 = vzc.f50272b;
                        if (bxvd11.f164950c) {
                            bxvd11.mo74035c();
                            bxvd11.f164950c = false;
                        }
                        vwc vwc7 = (vwc) bxvd11.f164949b;
                        vwc7.f50115a |= 2;
                        vwc7.f50117c = j2;
                        bxvd bxvd12 = a.f50246b;
                        if (bxvd12.f164950c) {
                            bxvd12.mo74035c();
                            bxvd12.f164950c = false;
                        }
                        vwc vwc8 = (vwc) bxvd12.f164949b;
                        vwc8.f50115a |= 8;
                        vwc8.f50119e = 0;
                        bxvd bxvd13 = a.f50246b;
                        if (bxvd13.f164950c) {
                            bxvd13.mo74035c();
                            bxvd13.f164950c = false;
                        }
                        vwc vwc9 = (vwc) bxvd13.f164949b;
                        vwc9.f50120f = null;
                        vwc9.f50115a &= -17;
                        bxvd bxvd14 = a.f50246b;
                        vwc vwc10 = (vwc) bxvd14.f164949b;
                        if ((vwc10.f50115a & 32) != 0) {
                            int i = vwc10.f50121g + 1;
                            if (bxvd14.f164950c) {
                                bxvd14.mo74035c();
                                bxvd14.f164950c = false;
                            }
                            vwc vwc11 = (vwc) bxvd14.f164949b;
                            vwc11.f50115a |= 32;
                            vwc11.f50121g = i;
                        }
                        a.f50245a.mo28979a(((vwc) a.f50246b.mo74062i()).mo73642k());
                        try {
                            this.f31249f.mo28953a();
                        } catch (Exception e) {
                            e = e;
                            vwf = this.f31248e;
                            vwf.mo28911a(e);
                        }
                    } else {
                        throw new Exception("Server response is missing a repeat window");
                    }
                } else {
                    throw new Exception("Server requested a retry");
                }
            } catch (Exception | LinkageError e2) {
                e = e2;
                vyq = a;
                try {
                    Log.e("DG", "FSC error", e);
                    if (vyq == null) {
                    }
                    try {
                        this.f31249f.mo28953a();
                    } catch (Exception e3) {
                        e = e3;
                        vwf = this.f31248e;
                        vwf.mo28911a(e);
                    }
                } catch (Throwable th) {
                    try {
                        this.f31249f.mo28953a();
                    } catch (Exception e4) {
                        this.f31248e.mo28911a(e4);
                    }
                    throw th;
                }
            }
        } catch (Exception | LinkageError e5) {
            e = e5;
            Log.e("DG", "FSC error", e);
            if (vyq == null) {
                vyq.mo28972a(e);
            }
            this.f31249f.mo28953a();
        }
    }

    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.droidguard.service.START".equals(intent.getAction())) {
            return new vvo(this, this);
        }
        return null;
    }

    public final void onCreate() {
        this.f31248e = vwf.m41483a(this);
        this.f31245b = vyc.m41575a(this);
        this.f31249f = new vyd(this);
        this.f31250g = new adzt();
        int i = Build.VERSION.SDK_INT;
        this.f31246c = new vze(this.f31248e);
        this.f31247d = new soc(9, new LinkedBlockingQueue(1), new ThreadPoolExecutor.DiscardPolicy());
        super.onCreate();
    }

    public DroidGuardChimeraService(vyc vyc, vyd vyd, vyp vyp) {
        super("DG");
        setIntentRedelivery(true);
        this.f31245b = vyc;
        this.f31249f = vyd;
        this.f31250g = new adzt();
    }

    /* renamed from: a */
    public final vyo mo18375a(String str) {
        return new vyo(this, str);
    }

    /* renamed from: a */
    public final void mo6499a(Intent intent) {
        if (intent != null && "com.google.android.gms.droidguard.service.PING".equals(intent.getAction())) {
            if (!cdrq.m134759b()) {
                Log.i("DG", "Low-latency disabled");
                return;
            }
            byte[] byteArrayExtra = intent.getByteArrayExtra("data");
            long d = cdrq.f181609a.mo6606a().mo78221d();
            vvm vvm = new vvm(this, Thread.currentThread());
            this.f31250g.postDelayed(vvm, d);
            m23147a(byteArrayExtra);
            this.f31250g.removeCallbacks(vvm);
        }
    }
}
