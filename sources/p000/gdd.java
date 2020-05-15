package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.HandlerThread;
import com.google.android.gms.audiomodem.AudioPlayer$1;
import com.google.android.gms.audiomodem.Encoding;

/* renamed from: gdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gdd {

    /* renamed from: a */
    public final AudioTrack[] f17921a;

    /* renamed from: b */
    public final AudioManager f17922b;

    /* renamed from: c */
    public final adzt f17923c;

    /* renamed from: d */
    public final adzt[] f17924d;

    /* renamed from: e */
    public gdc f17925e;

    /* renamed from: f */
    public final geu f17926f;

    /* renamed from: g */
    public boolean[] f17927g;

    /* renamed from: h */
    public volatile boolean[] f17928h;

    /* renamed from: i */
    public int[] f17929i;

    /* renamed from: j */
    public int f17930j;

    /* renamed from: k */
    public boolean f17931k;

    /* renamed from: l */
    private final Context f17932l;

    /* renamed from: m */
    private final get f17933m;

    /* renamed from: n */
    private boolean f17934n;

    /* renamed from: o */
    private boolean f17935o;

    /* renamed from: p */
    private final IntentFilter f17936p;

    /* renamed from: q */
    private final BroadcastReceiver f17937q = new AudioPlayer$1(this, "nearby");

    public gdd(Context context, int i, gdc gdc) {
        this.f17932l = context;
        this.f17922b = (AudioManager) context.getSystemService("audio");
        this.f17923c = new adzt();
        this.f17933m = new get(this.f17922b);
        this.f17926f = (geu) ahgz.m55754a(context, geu.class);
        IntentFilter intentFilter = new IntentFilter();
        this.f17936p = intentFilter;
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        this.f17921a = new AudioTrack[i];
        this.f17924d = new adzt[i];
        for (int i2 = 0; i2 < i; i2++) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("AudioTrackThread");
            sb.append(i2);
            HandlerThread handlerThread = new HandlerThread(sb.toString());
            handlerThread.start();
            this.f17924d[i2] = new adzt(handlerThread.getLooper());
        }
        this.f17925e = gdc;
        this.f17927g = new boolean[i];
        this.f17928h = new boolean[i];
        this.f17929i = new int[i];
    }

    /* renamed from: d */
    public static int m12964d(int i) {
        return AudioTrack.getMinBufferSize(i, 4, 2);
    }

    /* renamed from: e */
    public static final Encoding m12965e(int i) {
        return new Encoding(i, null, null);
    }

    /* renamed from: a */
    public final int mo11670a(int i, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        int i5 = i;
        int i6 = i2;
        if (!mo11676c(i)) {
            if (i5 >= 0) {
                AudioTrack[] audioTrackArr = this.f17921a;
                if (i5 < audioTrackArr.length) {
                    AudioTrack audioTrack = audioTrackArr[i5];
                    if (audioTrack == null) {
                        audioTrackArr[i5] = mo11671a(i6);
                    } else if (audioTrack.getSampleRate() != i6) {
                        this.f17921a[i5].release();
                        this.f17921a[i5] = mo11671a(i6);
                    }
                    AudioTrack audioTrack2 = this.f17921a[i5];
                    if (audioTrack2 == null) {
                        this.f17926f.mo11750a(9, m12965e(i));
                        bnsl bnsl = (bnsl) gdv.f17985a.mo68387b();
                        bnsl.mo68432a("gdd", "a", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("Could not create AudioTrack");
                        return 2;
                    }
                    this.f17927g[i5] = true;
                    this.f17929i[i5] = i3;
                    this.f17928h[i5] = false;
                    mo11673b();
                    this.f17924d[i5].post(new gdb(this, audioTrack2, i, bArr, bArr2, new gcz(this, i), this.f17923c, i4));
                    return 0;
                }
            }
            bnsl bnsl2 = (bnsl) gdv.f17985a.mo68387b();
            bnsl2.mo68432a("gdd", "a", 178, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Invalid track");
            return 2;
        }
        this.f17926f.mo11750a(10, m12965e(i));
        srn srn = gdv.f17985a;
        return 1;
    }

    /* renamed from: b */
    public final void mo11673b() {
        int i;
        int i2 = 0;
        int i3 = -1;
        while (true) {
            if (i2 >= this.f17921a.length) {
                break;
            }
            if (mo11676c(i2)) {
                int i4 = this.f17929i[i2];
                if (i4 == -1) {
                    i3 = -1;
                    break;
                }
                i3 = Math.max(i4, i3);
            }
            i2++;
        }
        if (i3 == -1) {
            if (this.f17934n) {
                this.f17934n = false;
                this.f17922b.setStreamVolume(3, this.f17930j, 0);
                srn srn = gdv.f17985a;
            }
            i = 0;
        } else if (!this.f17922b.isMusicActive()) {
            this.f17934n = true;
            this.f17930j = this.f17922b.getStreamVolume(3);
            this.f17922b.setStreamVolume(3, i3, 0);
            srn srn2 = gdv.f17985a;
            i = 0;
        } else {
            i = 0;
        }
        while (i < this.f17921a.length) {
            if (mo11676c(i) && this.f17929i[i] != -1) {
                if (!this.f17935o) {
                    this.f17932l.registerReceiver(this.f17937q, this.f17936p, null, this.f17923c);
                    this.f17935o = true;
                }
                mo11675c();
                return;
            }
            i++;
        }
        if (this.f17935o) {
            this.f17932l.unregisterReceiver(this.f17937q);
            this.f17935o = false;
        }
    }

    /* renamed from: c */
    public final void mo11675c() {
        int i;
        float f;
        int streamVolume = this.f17922b.getStreamVolume(3);
        if (streamVolume != 0) {
            for (int i2 = 0; i2 < this.f17921a.length; i2++) {
                if (mo11676c(i2) && (i = this.f17929i[i2]) != -1) {
                    AudioTrack audioTrack = this.f17921a[i2];
                    get get = this.f17933m;
                    if (i != streamVolume) {
                        f = get.mo11748a(i) / get.mo11748a(streamVolume);
                    } else {
                        f = 1.0f;
                    }
                    if (((double) f) <= 1.0d) {
                        srn srn = gdv.f17985a;
                        int i3 = this.f17929i[i2];
                        int i4 = Build.VERSION.SDK_INT;
                        audioTrack.setVolume(f);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final boolean mo11676c(int i) {
        return this.f17927g[i];
    }

    /* renamed from: b */
    public final void mo11674b(int i) {
        if (mo11676c(i)) {
            this.f17928h[i] = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AudioTrack mo11671a(int i) {
        AudioTrack audioTrack = new AudioTrack(3, i, 4, 2, m12964d(i), 1);
        if (audioTrack.getState() != 0) {
            return audioTrack;
        }
        bnsl bnsl = (bnsl) gdv.f17985a.mo68387b();
        bnsl.mo68432a("gdd", "a", 137, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Failed to initialize AudioTrack");
        audioTrack.release();
        return null;
    }

    /* renamed from: a */
    public final boolean mo11672a() {
        for (int i = 0; i < this.f17921a.length; i++) {
            if (mo11676c(i)) {
                return true;
            }
        }
        return false;
    }
}
