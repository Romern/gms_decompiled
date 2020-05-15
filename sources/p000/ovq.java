package p000;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.opengl.GLES20;
import android.os.Build;
import android.util.Log;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ovq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ovq {

    /* renamed from: a */
    public final AtomicReference f38491a = new AtomicReference();

    /* renamed from: b */
    public int f38492b = -1;

    /* renamed from: c */
    public final Context f38493c;

    /* renamed from: d */
    public final npd f38494d;

    /* renamed from: e */
    public final ovr f38495e;

    /* renamed from: f */
    public final ors f38496f;

    /* renamed from: g */
    private final orn f38497g;

    public ovq(Context context, npd npd, ors ors) {
        orn orn = new orn(context, npd);
        this.f38493c = context;
        this.f38494d = npd;
        this.f38495e = new ovr(context);
        this.f38497g = orn;
        this.f38496f = ors;
    }

    /* renamed from: a */
    public final void mo22700a() {
        String[] supportedTypes;
        int a = this.f38495e.mo22703a();
        if (a != 0) {
            mo22701a(a);
            return;
        }
        if (ccui.f179964a.mo6606a().mo76831o()) {
            boolean z = false;
            MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
            int length = codecInfos.length;
            int i = 0;
            loop0:
            while (true) {
                if (i >= length) {
                    break;
                }
                MediaCodecInfo mediaCodecInfo = codecInfos[i];
                if (mediaCodecInfo.isEncoder()) {
                    for (String str : mediaCodecInfo.getSupportedTypes()) {
                        if (bmwb.m108443a(str, "video/hevc")) {
                            z = true;
                            break loop0;
                        }
                    }
                    continue;
                }
                i++;
            }
            this.f38497g.mo22548a(odi.m28455a(bpcy.GEARHEAD, bpeb.PHONE_CAPABILITY, z ? bpea.PHONE_SUPPORT_H265_ENCODER : bpea.PHONE_NOT_SUPPORT_H265_ENCODER).mo22019b());
        }
        npd npd = this.f38494d;
        if (npd.f36296c.getInt("car_device_encoder_iframe_interval", -1) != -1) {
            if (!Integer.toString(Build.VERSION.SDK_INT).equals(npd.mo21397h())) {
                npd.mo21397h();
                int i2 = Build.VERSION.SDK_INT;
            } else {
                mo22701a(this.f38495e.mo22704b() ? 1 : 0);
                return;
            }
        }
        ovp ovp = new ovp(this);
        ovp.start();
        this.f38491a.set(ovp);
    }

    /* renamed from: b */
    public final boolean mo22702b(int i) {
        if (this.f38491a.get() != Thread.currentThread()) {
            Log.w("CAR.SERVICE", "Not supported: not current thread");
            return false;
        }
        odw a = odu.m28520a(birv.MEDIA_CODEC_VIDEO_H264_BP, null);
        odp odp = (odp) a;
        if (odp.f37289b != null) {
            odp.mo22029a(800, 480, 30, i, 16000000, 12000000, 8000000, 0, 0);
            Semaphore semaphore = new Semaphore(0);
            Semaphore semaphore2 = new Semaphore(0);
            if (a.mo22033a(new ovo(semaphore, semaphore2))) {
                nqe a2 = nqe.m27300a(this.f38493c, odp.f37290c, 0);
                a2.mo21452b();
                float[] fArr = {0.0f, 0.5f};
                for (int i2 = 0; i2 < 2; i2++) {
                    GLES20.glClearColor(0.0f, fArr[i2], 0.0f, 1.0f);
                    GLES20.glClear(AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES);
                    a2.mo21453c();
                }
                a2.mo21451a();
                try {
                    if (this.f38491a.get() == Thread.currentThread()) {
                        if (!semaphore.tryAcquire(3000, TimeUnit.MILLISECONDS)) {
                            Log.w("CAR.SERVICE", "Not supported: no codec config");
                        } else if (this.f38491a.get() == Thread.currentThread()) {
                            boolean tryAcquire = semaphore2.tryAcquire(3000, TimeUnit.MILLISECONDS);
                            a.mo22034h();
                            if (!tryAcquire) {
                                Log.w("CAR.SERVICE", "Not supported: no encoding results");
                                return false;
                            }
                            this.f38492b = i;
                            return true;
                        }
                    }
                } catch (InterruptedException e) {
                    Log.w("CAR.SERVICE", "Not supported: cancelled");
                } catch (Throwable th) {
                    a.mo22034h();
                    throw th;
                }
                a.mo22034h();
                return false;
            }
            Log.w("CAR.SERVICE", "Not supported: cannot run video encoding");
            a.mo22034h();
            return false;
        }
        Log.w("CAR.SERVICE", "Not supported: no video encoder");
        return false;
    }

    /* renamed from: a */
    public final void mo22701a(int i) {
        String str;
        if (Log.isLoggable("CAR.MISC.AapSupChecker", 3)) {
            if (i != 0) {
                str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "DEVICE_NOT_CAPABLE_NO_VANAGON" : "DEVICE_NOT_CAPABLE" : "DEVICE_BLACKLISTED" : "COUNTRY_NOT_WHITELISTED" : "SUPPORTED_WHITELIST_BYPASS";
            } else {
                str = "SUPPORTED";
            }
            Log.d("CAR.MISC.AapSupChecker", str.length() == 0 ? new String("AAP support check result: ") : "AAP support check result: ".concat(str));
        }
        nuu.m27798c(new ovn(this, i));
    }
}
