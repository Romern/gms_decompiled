package p000;

import android.location.LocationManager;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.WorkSource;
import android.telephony.TelephonyManager;
import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.concurrent.Executor;

/* renamed from: bghz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bghz extends adzt {

    /* renamed from: a */
    final /* synthetic */ bgid f116471a;

    /* renamed from: b */
    private final TelephonyManager f116472b = ((TelephonyManager) this.f116471a.f116480a.getSystemService("phone"));

    /* renamed from: c */
    private long f116473c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bghz(bgid bgid, Looper looper) {
        super(looper);
        this.f116471a = bgid;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    public final void handleMessage(Message message) {
        boolean z;
        boolean z2;
        Object obj;
        Executor b;
        bgks bgks;
        Message message2 = message;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z3 = false;
        if (message2.arg2 == 4321) {
            z = true;
        } else if (message2.arg2 == 8534) {
            z = false;
        } else {
            int i = message2.what;
            StringBuilder sb = new StringBuilder(50);
            sb.append("No wakelock mode specified for command ");
            sb.append(i);
            throw new RuntimeException(sb.toString());
        }
        if (elapsedRealtime > this.f116473c) {
            this.f116473c = 120000 + elapsedRealtime;
            bgid bgid = this.f116471a;
            bgid.mo62840a(bgid.f116491l);
        }
        try {
            int i2 = message2.what;
            if (i2 == 11) {
                z2 = z;
                if (this.f116471a.f116490k) {
                    bgjm bgjm = (bgjm) message2.obj;
                    bgfx.m98781a(this.f116471a.f116481b, bgjm);
                    this.f116471a.f116491l.mo61026a(bgjm);
                }
            } else if (i2 == 13) {
                z2 = z;
                this.f116471a.f116491l.mo61041b((bsax) message2.obj);
            } else if (i2 == 15) {
                z2 = z;
                if (message2.arg1 != 0) {
                    z3 = true;
                }
                this.f116471a.f116481b.mo62053a(bfos.FULL_COLLECTION_MODE_CHANGED, z3);
                this.f116471a.f116491l.mo61054h(z3);
            } else if (i2 == 24) {
                z2 = z;
                ((Runnable) message2.obj).run();
            } else if (i2 == 39) {
                z2 = z;
                bghr bghr = (bghr) message2.obj;
                this.f116471a.f116491l.mo61019a(bghr.f116455a, bghr.f116456b, bghr.f116457c);
            } else if (i2 != 41) {
                switch (i2) {
                    case 1:
                        z2 = z;
                        this.f116471a.f116481b.mo62048a(bfos.QUIT);
                        bgoz bgoz = this.f116471a.f116491l;
                        if (bgoz != null) {
                            if (message2.arg1 != 0) {
                                z3 = true;
                            }
                            bgoz.mo61048e(z3);
                        }
                        LocationManager locationManager = (LocationManager) this.f116471a.f116480a.getSystemService("location");
                        bgid bgid2 = this.f116471a;
                        locationManager.removeUpdates((bgid2.f116490k ? bgid2.f116483d : bgid2.f116482c).f116477c);
                        locationManager.removeGpsStatusListener(this.f116471a.f116484e);
                        Looper myLooper = Looper.myLooper();
                        if (myLooper != null) {
                            myLooper.quit();
                        }
                        this.f116471a.mo62848b();
                        this.f116471a.f116491l = new bgoz(new bghy());
                        break;
                    case 2:
                        z2 = z;
                        this.f116471a.f116491l.mo61015a();
                        break;
                    case 3:
                        if (message2.arg1 == 1) {
                            z3 = true;
                        }
                        bfmx bfmx = (bfmx) message2.obj;
                        bfor bfor = this.f116471a.f116481b;
                        long j = bfmx.f114436b;
                        long j2 = bfmx.f114437c;
                        long j3 = bfmx.f114438d;
                        z2 = z;
                        try {
                            int min = (int) Math.min(j / 1000, 2147483647L);
                            long j4 = j2;
                            int min2 = (int) Math.min(j2 / 1000, 2147483647L);
                            int min3 = (int) Math.min(j3 / 1000, 2147483647L);
                            bfos bfos = bfos.SET_PERIOD;
                            long b2 = bfor.mo62055b();
                            if (!z3) {
                                obj = "0";
                            } else {
                                obj = "1";
                            }
                            bfor.mo62047a(new bgfw(bfos, b2, obj, min, min2, min3, j, j4, j3, z3));
                            this.f116471a.f116491l.mo61024a(bfmx, z3);
                            break;
                        } catch (Exception e) {
                            e = e;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                break;
                            }
                        }
                    case 4:
                        int i3 = message2.arg1;
                        bgkx bgkx = bgkx.f116729g;
                        TelephonyManager telephonyManager = this.f116472b;
                        bghx bghx = new bghx(this);
                        bgmj bgmj = (bgmj) message2.obj;
                        b = this.f116471a.f116485f.f116630k.mo62922b();
                        bgkt bgkt = new bgkt((bgkw) bgkx, bghx, elapsedRealtime);
                        bgks = new bgks(bghx);
                        bgkv bgkv = new bgkv(b, bgks);
                        if (!(bgmj instanceof bhcv)) {
                            telephonyManager.requestCellInfoUpdate(bgkv, bgkt);
                            z2 = z;
                            break;
                        } else {
                            WorkSource b3 = ((bhcv) bgmj).mo63559b();
                            if (b3 == null) {
                                telephonyManager.requestCellInfoUpdate(bgkv, bgkt);
                                z2 = z;
                                break;
                            } else {
                                telephonyManager.requestCellInfoUpdate(b3, bgkv, bgkt);
                                z2 = z;
                                break;
                            }
                        }
                    case 5:
                        bgoz bgoz2 = this.f116471a.f116491l;
                        if (message2.arg1 != 0) {
                            z3 = true;
                        }
                        bgoz2.mo61050f(z3);
                        z2 = z;
                        break;
                    case 6:
                        bghs bghs = (bghs) message2.obj;
                        this.f116471a.f116491l.mo61037a(bghs.f116458a, bghs.f116459b, bghs.f116460c);
                        z2 = z;
                        break;
                    case 7:
                        if (this.f116471a.f116490k) {
                            z2 = z;
                            break;
                        } else {
                            bgjm bgjm2 = (bgjm) message2.obj;
                            bgfx.m98781a(this.f116471a.f116481b, bgjm2);
                            this.f116471a.f116491l.mo61026a(bgjm2);
                            z2 = z;
                            break;
                        }
                    case 8:
                        bgic bgic = (bgic) message2.obj;
                        this.f116471a.f116491l.mo61038a(bgic.f116478a, bgic.f116479b);
                        z2 = z;
                        break;
                    case 9:
                        bght bght = (bght) message2.obj;
                        this.f116471a.f116491l.mo61033a(bght.f116461a, bght.f116462b);
                        z2 = z;
                        break;
                    default:
                        switch (i2) {
                            case 17:
                                this.f116471a.f116491l.mo61030a((bsax) message2.obj);
                                z2 = z;
                                break;
                            case 18:
                                bfct bfct = (bfct) message2.obj;
                                this.f116471a.f116481b.mo62048a(bfos.NLP_PARAMS_CHANGED);
                                bfnw.f114518g = bfct.mo61417k();
                                this.f116471a.f116491l.mo61021a(bfct);
                                z2 = z;
                                break;
                            case 19:
                                this.f116471a.f116491l.mo61031a((ActivityRecognitionResult) message2.obj);
                                z2 = z;
                                break;
                            case 20:
                                bghq bghq = (bghq) message2.obj;
                                this.f116471a.f116491l.mo61018a(bghq.f116449a, bghq.f116450b, bghq.f116451c, bghq.f116452d, bghq.f116453e, bghq.f116454f);
                                z2 = z;
                                break;
                            case 21:
                                this.f116471a.f116491l.mo61025a((bfnp) message2.obj);
                                z2 = z;
                                break;
                            default:
                                int i4 = message2.what;
                                StringBuilder sb2 = new StringBuilder(30);
                                sb2.append("unexpected message ");
                                sb2.append(i4);
                                throw new RuntimeException(sb2.toString());
                        }
                }
            } else {
                z2 = z;
                this.f116471a.f116491l.mo61049f();
            }
        } catch (IllegalArgumentException e2) {
            if (!ceze.f183524a.mo6606a().enableQTelephonyExceptions()) {
                b.execute(bgks);
                z2 = z;
            } else {
                throw e2;
            }
        } catch (Exception e3) {
            e = e3;
            z2 = z;
            throw e;
        } catch (Throwable th2) {
            th = th2;
            z2 = z;
            if (z2) {
                this.f116471a.f116485f.f116630k.mo62925c(bgnq.CALLBACK_RUNNER);
            }
            throw th;
        }
        this.f116471a.f116481b.mo62046a();
        if (z2) {
            this.f116471a.f116485f.f116630k.mo62925c(bgnq.CALLBACK_RUNNER);
        }
    }
}
