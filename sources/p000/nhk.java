package p000;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.audiopolicy.AudioMix;
import android.media.audiopolicy.AudioMixingRule;
import android.media.audiopolicy.AudioPolicy;
import android.os.Build;
import android.os.SystemClock;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.car.CarAudioConfiguration;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;

/* renamed from: nhk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nhk implements nxc {

    /* renamed from: A */
    private CarAudioConfiguration[] f35616A;

    /* renamed from: B */
    private int f35617B = -1;

    /* renamed from: C */
    private volatile boolean f35618C = false;

    /* renamed from: a */
    public final bnsn f35619a;

    /* renamed from: b */
    public final int f35620b;

    /* renamed from: c */
    public final String f35621c;

    /* renamed from: d */
    public volatile boolean f35622d;

    /* renamed from: e */
    public volatile boolean f35623e = false;

    /* renamed from: f */
    public volatile nxe f35624f;

    /* renamed from: g */
    public volatile int f35625g = 0;

    /* renamed from: h */
    public volatile nxe f35626h;

    /* renamed from: i */
    public final nxb f35627i;

    /* renamed from: j */
    public final olr f35628j;

    /* renamed from: k */
    public final olt f35629k;

    /* renamed from: l */
    public final nhs f35630l;

    /* renamed from: m */
    public final nxg f35631m;

    /* renamed from: n */
    public final Context f35632n;

    /* renamed from: o */
    public nwz f35633o;

    /* renamed from: p */
    public boolean f35634p = false;

    /* renamed from: q */
    public long f35635q = 0;

    /* renamed from: r */
    public final int f35636r;

    /* renamed from: s */
    public final boolean f35637s;

    /* renamed from: t */
    public boolean f35638t;

    /* renamed from: u */
    public final int f35639u;

    /* renamed from: v */
    private final String f35640v;

    /* renamed from: w */
    private final boolean f35641w;

    /* renamed from: x */
    private Thread f35642x;

    /* renamed from: y */
    private volatile boolean f35643y = false;

    /* renamed from: z */
    private bioo[] f35644z;

    public nhk(Context context, nxb nxb, olo olo, olr olr, olt olt, nhs nhs, nxg nxg, int i, boolean z, boolean z2) {
        int i2;
        String d = njp.m26591d(i);
        this.f35621c = d;
        String valueOf = String.valueOf(d);
        String str = valueOf.length() == 0 ? new String("CAR.AUDIO.") : "CAR.AUDIO.".concat(valueOf);
        this.f35640v = str;
        this.f35619a = odk.m28481a(str);
        this.f35627i = nxb;
        this.f35628j = olr;
        this.f35629k = olt;
        this.f35630l = nhs;
        this.f35632n = context;
        this.f35620b = i;
        this.f35637s = z2;
        this.f35631m = nxg;
        if ("GalReceiver-Local".equals(olo.mo21346p().f29333b)) {
            this.f35641w = false;
        } else {
            this.f35641w = z;
        }
        if (this.f35620b != 3) {
            int i3 = Build.VERSION.SDK_INT;
            this.f35636r = 2;
            i2 = 8;
        } else {
            this.f35636r = 1;
            i2 = 12;
        }
        this.f35639u = i2;
    }

    /* renamed from: a */
    private final AudioRecord m26288a(int i) {
        bnsi d = this.f35619a.mo68390d();
        d.mo68432a("nhk", "a", 736, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Mixing media and guidance audio");
        bmxy.m108581a(this.f35631m);
        nxg nxg = this.f35631m;
        int i2 = Build.VERSION.SDK_INT;
        Object obj = nxg.f36856a;
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setUsage(1);
        AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
        builder2.setUsage(12);
        AudioMixingRule build = new AudioMixingRule.Builder().addRule(builder.build(), 1).addRule(builder2.build(), 1).build();
        AudioMix build2 = new AudioMix.Builder(build).setFormat(new AudioFormat.Builder().setEncoding(2).setChannelMask(12).setSampleRate(i).build()).setRouteFlags(2).build();
        AudioPolicy audioPolicy = (AudioPolicy) obj;
        audioPolicy.attachMixes(bngx.m109356a(build2));
        return audioPolicy.createAudioRecordSink(build2);
    }

    /* renamed from: g */
    private final synchronized void m26291g() {
        bnsi d = this.f35619a.mo68390d();
        d.mo68432a("nhk", "g", 359, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("startSystemSoundStreaming %s", this.f35621c);
        m26293i();
    }

    /* renamed from: h */
    private final synchronized void m26292h() {
        bnsi d = this.f35619a.mo68390d();
        d.mo68432a("nhk", "h", 365, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("stopSoundStreaming %s", this.f35621c);
        m26294j();
    }

    /* renamed from: i */
    private final void m26293i() {
        String str;
        int b = npe.m27160b(this.f35632n, "android.permission.RECORD_AUDIO");
        if (b == -2 || b == -1) {
            bnsi c = npe.f36300a.mo68388c();
            c.mo68432a("npe", "a", 59, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            if (b != -1) {
                str = " PERMISSION_DENIED_APP_OP";
            } else {
                str = " PERMISSION_DENIED";
            }
            c.mo68424a("Google play services does not have permission for permission: %s%s", "android.permission.RECORD_AUDIO", str);
        } else if (b == 0) {
            this.f35622d = false;
            String valueOf = String.valueOf(this.f35621c);
            nhj nhj = new nhj(this, valueOf.length() == 0 ? new String("AudioCapture-") : "AudioCapture-".concat(valueOf));
            this.f35642x = nhj;
            nhj.start();
        } else {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Unknown result from PermissionChecker: ");
            sb.append(b);
            throw new SecurityException(sb.toString());
        }
    }

    /* renamed from: j */
    private final void m26294j() {
        Thread thread;
        this.f35622d = true;
        Thread thread2 = this.f35642x;
        if (thread2 != null && thread2.isAlive() && Thread.currentThread() != (thread = this.f35642x)) {
            try {
                thread.interrupt();
                this.f35642x.join(500);
                if (this.f35642x.isAlive()) {
                    bnsi c = this.f35619a.mo68388c();
                    c.mo68432a("nhk", "j", 408, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68420a("audio capturing thread not finishing for stream: %s", this.f35621c);
                    this.f35642x.interrupt();
                    this.f35642x.join(500);
                    if (this.f35642x.isAlive() && this.f35618C) {
                        bnsi b = this.f35619a.mo68387b();
                        b.mo68432a("nhk", "j", 412, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        b.mo68420a("audio capturing thread not finishing, 2nd trial, for stream: %s", this.f35621c);
                        if (cctv.m131557b()) {
                            this.f35628j.mo21287a(olq.AUDIO_CAPTURE_THREAD);
                        } else {
                            this.f35628j.mo21297ab();
                        }
                    }
                }
            } catch (InterruptedException e) {
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo20676a(bioo[] biooArr, CarAudioConfiguration[] carAudioConfigurationArr) {
        this.f35644z = biooArr;
        this.f35616A = carAudioConfigurationArr;
    }

    /* renamed from: b */
    public final int mo20677b() {
        return this.f35620b;
    }

    /* renamed from: c */
    public final synchronized void mo20679c() {
        this.f35618C = true;
        this.f35643y = false;
        m26292h();
        this.f35625g = 0;
        notifyAll();
    }

    /* renamed from: d */
    public final void mo20680d() {
        if (this.f35642x != null && this.f35641w) {
            bnsi d = this.f35619a.mo68390d();
            d.mo68432a("nhk", "d", 389, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Resetting system capture");
            m26294j();
            m26293i();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, java.lang.String]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0397  */
    /* renamed from: e */
    public final void mo20681e() {
        int i;
        AudioRecord audioRecord;
        boolean z;
        nwy nwy;
        boolean z2;
        boolean z3;
        nwy nwy2;
        int i2;
        int i3;
        Object obj;
        int i4 = this.f35620b;
        int a = nxa.m28078a(i4);
        int i5 = 3;
        if (this.f35620b != 3) {
            i = 2048;
        } else {
            i = 8192;
        }
        int i6 = i * 8;
        bnsi d = this.f35619a.mo68390d();
        d.mo68432a("nhk", "e", 436, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68425a("Start capturing system audio with stream type: %s, sampling rate: %d, buffer size: %d", Integer.valueOf(this.f35620b), Integer.valueOf(a), Integer.valueOf(i6));
        if (this.f35629k.mo21351u() == 0) {
            int i7 = Build.VERSION.SDK_INT;
        }
        if (this.f35631m != null && !this.f35637s) {
            bnsi d2 = this.f35619a.mo68390d();
            d2.mo68432a("nhk", "e", 453, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("Try getting audio from car audio policy");
            nxg nxg = this.f35631m;
            int i8 = this.f35620b;
            Object obj2 = nxg.f36857b;
            if (obj2 == null || (obj = nxg.f36858c) == null) {
                throw new IllegalStateException("Mixes not initialized");
            }
            if (i8 != 3) {
                obj2 = obj;
            }
            audioRecord = ((AudioPolicy) nxg.f36856a).createAudioRecordSink((AudioMix) obj2);
            if (audioRecord != null && audioRecord.getState() == 0) {
                bnsi c = this.f35619a.mo68388c();
                c.mo68432a("nhk", "e", 456, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("Audio record uninitialized");
                audioRecord = null;
            }
            if (audioRecord == null && i4 == 3) {
                bnsi d3 = this.f35619a.mo68390d();
                d3.mo68432a("nhk", "e", 460, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d3.mo68405a("Second try with fixed volume. Capture only media stream.");
                audioRecord = mo20670a(i6, a);
            }
        } else {
            bnsi d4 = this.f35619a.mo68390d();
            d4.mo68432a("nhk", "e", 464, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d4.mo68405a("API level L or force single channel capturing");
            audioRecord = mo20670a(i6, a);
        }
        if (audioRecord == null || audioRecord.getState() == 0) {
            bnsi c2 = this.f35619a.mo68388c();
            c2.mo68432a("nhk", "e", 471, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c2.mo68405a("Failed to setup audio capture with new APIs.");
            if (i4 == 3) {
                bnsi c3 = this.f35619a.mo68388c();
                c3.mo68432a("nhk", "e", 473, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c3.mo68405a("Trying remote submix for media stream");
                audioRecord = new AudioRecord(8, a, 12, 2, i6);
            } else {
                bnsi c4 = this.f35619a.mo68388c();
                c4.mo68432a("nhk", "e", 482, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c4.mo68405a("Give up capturing for non-media stream");
                return;
            }
        }
        try {
            audioRecord.startRecording();
            this.f35627i.mo21307al();
            AudioManager audioManager = (AudioManager) this.f35632n.getSystemService("audio");
            int streamVolume = audioManager.getStreamVolume(3);
            bnsi d5 = this.f35619a.mo68390d();
            d5.mo68432a("nhk", "e", 502, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d5.mo68409a("setting volume to %d", streamVolume);
            audioManager.setStreamVolume(3, streamVolume, 0);
            boolean z4 = false;
            boolean z5 = false;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                if (this.f35622d || z4) {
                    break;
                }
                int i11 = this.f35625g;
                int i12 = -1;
                if (i11 == 1) {
                    bnsi d6 = this.f35619a.mo68390d();
                    d6.mo68432a("nhk", "a", 289, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d6.mo68424a("focus gain, stream: %s, bh: %s", this.f35621c, njp.m26591d(this.f35626h.mo20645a()));
                    this.f35623e = true;
                    this.f35624f = this.f35626h;
                    this.f35624f.mo20647a(this.f35636r);
                } else if (i11 == 2) {
                    this.f35623e = false;
                    nxe nxe = this.f35624f;
                    bnsi d7 = this.f35619a.mo68390d();
                    d7.mo68432a("nhk", "a", (int) ErrorInfo.TYPE_FSC_HTTP_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    String str = this.f35621c;
                    if (nxe != null) {
                        i2 = nxe.mo20645a();
                    } else {
                        i2 = -1;
                    }
                    d7.mo68424a("focus loss, stream: %s, old bh: %s", str, njp.m26591d(i2));
                    if (nxe != null) {
                        nxe.mo20652a(false);
                    }
                    if (z5) {
                        this.f35630l.mo20699b(this.f35620b);
                    }
                    this.f35624f = null;
                } else if (i11 == i5) {
                    nxe nxe2 = this.f35624f;
                    bnsi d8 = this.f35619a.mo68390d();
                    d8.mo68432a("nhk", "a", 316, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    String str2 = this.f35621c;
                    if (nxe2 != null) {
                        i3 = nxe2.mo20645a();
                    } else {
                        i3 = -1;
                    }
                    d8.mo68425a("switching BH for stream: %s, from BH: %s to BH %s", str2, njp.m26591d(i3), njp.m26591d(this.f35626h.mo20645a()));
                    if (nxe2 != null) {
                        nxe2.mo20652a(false);
                    }
                    this.f35623e = true;
                    this.f35626h.mo20647a(this.f35636r);
                    this.f35624f = this.f35626h;
                }
                if (i11 != 0) {
                    this.f35625g = 0;
                    synchronized (this) {
                        notifyAll();
                    }
                }
                if (this.f35623e && !z5) {
                    mo20682f();
                    this.f35624f.mo20645a();
                    int i13 = njp.f35842m;
                    this.f35624f.mo20652a(false);
                    this.f35623e = false;
                }
                if (this.f35623e) {
                    nwy = this.f35624f.mo20665j();
                    z = true;
                } else {
                    nwy = this.f35633o.mo21774a();
                    z = false;
                }
                int b = nwy.mo21773b();
                int a2 = nwy.mo21772a();
                while (true) {
                    if (this.f35622d || b <= 0) {
                        break;
                    }
                    int read = audioRecord.read(nwy.f36852b.array(), a2, b);
                    if (read < 0) {
                        bnsi c5 = this.f35619a.mo68388c();
                        c5.mo68432a("nhk", "e", 550, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c5.mo68413a("AudioRecord read returned %d, stream %s", read, (Object) this.f35621c);
                        z4 = true;
                        break;
                    }
                    a2 += read;
                    b -= read;
                }
                ByteBuffer byteBuffer = nwy.f36852b;
                byte[] array = byteBuffer.array();
                int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                int arrayOffset2 = byteBuffer.arrayOffset() + byteBuffer.limit();
                int i14 = arrayOffset2 - arrayOffset;
                if (i14 <= 60) {
                    if (m26290a(array, arrayOffset, arrayOffset2)) {
                        i9 = 0;
                        if (i9 < 4) {
                            nwy.f36851a = SystemClock.elapsedRealtime() * 1000;
                            if (!ccsh.m131421b() || (!this.f35622d && !z4)) {
                                if (z5) {
                                    z2 = z5;
                                    z3 = true;
                                } else if (this.f35623e) {
                                    bnsi d9 = this.f35619a.mo68390d();
                                    d9.mo68432a("nhk", "e", 611, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    d9.mo68420a("bottom half starts streaming for %s", this.f35621c);
                                    this.f35624f.mo20647a(this.f35636r);
                                    z3 = true;
                                    i10 = 0;
                                    z2 = true;
                                } else {
                                    nxe nxe3 = this.f35624f;
                                    if (nxe3 != null && nxe3.mo20662g() == this) {
                                        bnsi c6 = this.f35619a.mo68388c();
                                        c6.mo68432a("nhk", "e", 617, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        c6.mo68405a("previous session not released");
                                        nxe3.mo20652a(false);
                                    }
                                    bnsi d10 = this.f35619a.mo68390d();
                                    d10.mo68432a("nhk", "e", 620, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    d10.mo68420a("Requesting bottom half for %s", this.f35621c);
                                    nxe a3 = this.f35630l.mo20696a(this.f35620b);
                                    if (a3 != null) {
                                        this.f35624f = a3;
                                        bnsi d11 = this.f35619a.mo68390d();
                                        d11.mo68432a("nhk", "e", 624, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        d11.mo68420a("bottom half starts streaming for %s", this.f35621c);
                                        this.f35624f.mo20647a(this.f35636r);
                                        z3 = true;
                                        this.f35623e = true;
                                    } else {
                                        z3 = true;
                                    }
                                    this.f35633o.mo21778c();
                                    this.f35634p = z3;
                                    i10 = 0;
                                    z2 = true;
                                }
                                i10 += z3 ? 1 : 0;
                                if (this.f35623e) {
                                    mo20682f();
                                    this.f35624f.mo20656b(nwy);
                                    this.f35635q = SystemClock.elapsedRealtime();
                                } else {
                                    this.f35633o.mo21775a(nwy);
                                    if (this.f35633o.mo21779d() > this.f35639u) {
                                        nwz nwz = this.f35633o;
                                        synchronized (nwz) {
                                            nwy2 = (nwy) nwz.f36853a.poll();
                                        }
                                        if (nwy2 != null) {
                                            nwz.mo21777b(nwy2);
                                        }
                                    }
                                }
                                z5 = z2;
                            }
                        } else {
                            if (z5) {
                                bnsi d12 = this.f35619a.mo68390d();
                                d12.mo68432a("nhk", "e", 569, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                String str3 = this.f35621c;
                                Integer valueOf = Integer.valueOf(i10);
                                if (this.f35623e) {
                                    i12 = this.f35624f.mo20645a();
                                }
                                d12.mo68425a("stopping streaming %s due to zero data, frames captured: %d, bh: %s", str3, valueOf, njp.m26591d(i12));
                                if (this.f35623e) {
                                    bnsi d13 = this.f35619a.mo68390d();
                                    d13.mo68432a("nhk", "e", 576, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    d13.mo68405a("Stop stream and release bottom half");
                                    this.f35624f.mo20652a(false);
                                    this.f35623e = false;
                                    z5 = false;
                                } else {
                                    bnsi d14 = this.f35619a.mo68390d();
                                    d14.mo68432a("nhk", "e", 580, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    d14.mo68405a("Cancel bottom half request");
                                    this.f35630l.mo20700c(this.f35620b);
                                    z5 = false;
                                }
                            } else if (i9 >= this.f35639u && this.f35633o.mo21779d() > 0) {
                                bnsi d15 = this.f35619a.mo68390d();
                                d15.mo68432a("nhk", "e", 585, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                d15.mo68405a("Cancel bottom half request and clear the system capture queue");
                                this.f35630l.mo20700c(this.f35620b);
                                this.f35633o.mo21778c();
                            }
                            if (!z) {
                                this.f35633o.mo21777b(nwy);
                            } else {
                                this.f35624f.mo20650a(nwy);
                            }
                        }
                        i5 = 3;
                    }
                } else if (m26290a(array, arrayOffset, 20) || m26290a(array, (i14 - 20) >> 1, 20) || m26290a(array, arrayOffset2 - 20, 20)) {
                    i9 = 0;
                    if (i9 < 4) {
                    }
                    i5 = 3;
                }
                if (i9 < Integer.MAX_VALUE) {
                    i9++;
                }
                if (i9 < 4) {
                }
                i5 = 3;
            }
            bnsi c7 = this.f35619a.mo68388c();
            c7.mo68432a("nhk", "e", 603, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c7.mo68405a("Quit audio capture");
            if (audioRecord.getRecordingState() == 3) {
                audioRecord.stop();
            }
            audioRecord.release();
            if (this.f35638t) {
                ((AudioManager) this.f35632n.getSystemService("audio")).adjustStreamVolume(3, -100, 0);
            }
            if (this.f35623e) {
                bnsi d16 = this.f35619a.mo68390d();
                d16.mo68432a("nhk", "e", 664, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d16.mo68405a("Properly stop audio stream before shutdown");
                this.f35624f.mo20652a(ccsh.m131421b());
                this.f35623e = false;
            }
        } catch (IllegalStateException e) {
            bnsi b2 = this.f35619a.mo68387b();
            b2.mo68437a(e);
            b2.mo68432a("nhk", "e", 489, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b2.mo68405a("This device does not support audio capturing.");
            this.f35628j.mo21273a(bpdn.CAR_SERVICE_INIT_ERROR, bpdo.NO_AUDIO_CAPTURE, "cannot capture audio");
        }
    }

    /* renamed from: f */
    public final void mo20682f() {
        long j;
        float f;
        if (this.f35623e) {
            if (this.f35634p) {
                int i = this.f35620b;
                if (!this.f35629k.mo21199l() || this.f35629k.mo21350t() != 2) {
                    if (i != 3) {
                        j = ccse.f179831a.mo6606a().mo76707d();
                    } else {
                        j = ccse.f179831a.mo6606a().mo76706c();
                    }
                } else if (i != 3) {
                    j = ccse.f179831a.mo6606a().mo76709f();
                } else {
                    j = ccse.f179831a.mo6606a().mo76708e();
                }
                if (i != 3) {
                    f = 15.625f;
                } else {
                    f = 23.4375f;
                }
                double elapsedRealtime = (double) (SystemClock.elapsedRealtime() - this.f35635q);
                Double.isNaN(elapsedRealtime);
                double d = (double) f;
                Double.isNaN(d);
                long min = Math.min(j, (long) ((int) (((elapsedRealtime / 1000.0d) * d) - 8.0d)));
                if (((long) this.f35633o.mo21779d()) < min) {
                    for (long d2 = min - ((long) this.f35633o.mo21779d()); d2 > 0; d2--) {
                        nwy a = this.f35633o.mo21774a();
                        int a2 = a.mo21772a();
                        byte[] array = a.f36852b.array();
                        for (int i2 = 0; i2 < a.mo21773b(); i2++) {
                            array[a2 + i2] = 0;
                        }
                        this.f35624f.mo20656b(a);
                        this.f35635q = SystemClock.elapsedRealtime();
                    }
                }
                this.f35634p = false;
            }
            nwy b = this.f35633o.mo21776b();
            while (b != null) {
                this.f35624f.mo20656b(b);
                this.f35635q = SystemClock.elapsedRealtime();
                b = this.f35633o.mo21776b();
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo20678b(nxe nxe) {
        bnsi d = this.f35619a.mo68390d();
        d.mo68432a("nhk", "b", 233, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("onBottomHalfAvailable, stream: %s", this.f35621c);
        this.f35626h = nxe;
        this.f35625g = 1;
        if (!this.f35641w && this.f35620b == 5) {
            int i = Build.VERSION.SDK_INT;
        }
        m26289a(1000L);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: a */
    private final void m26289a(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (this.f35625g != 0 && j > 0) {
            try {
                wait(j);
                j = elapsedRealtime - SystemClock.elapsedRealtime();
            } catch (InterruptedException e) {
            }
        }
        if (this.f35625g != 0) {
            bnsi c = this.f35619a.mo68388c();
            c.mo68432a("nhk", "a", 278, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68422a("Focus command time-out, stream: %s, command: %s", (Object) this.f35621c, this.f35625g);
        }
    }

    /* renamed from: a */
    public static final boolean m26290a(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            if (bArr[i3] != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: a */
    public final AudioRecord mo20670a(int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (!ccsh.f179839a.mo6606a().mo76716f()) {
            bnsi d = this.f35619a.mo68390d();
            d.mo68432a("nhk", "a", 679, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68422a("Trying audio capturing with L API, stream %s, sampling rate: %d", (Object) this.f35621c, i2);
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            try {
                AudioAttributes.Builder builder2 = (AudioAttributes.Builder) builder.getClass().getMethod("setInternalCapturePreset", Integer.TYPE).invoke(builder, 8);
                try {
                    AudioAttributes build = ((AudioAttributes.Builder) builder2.getClass().getMethod("addTag", String.class).invoke(builder2, "fixedVolume")).build();
                    AudioFormat build2 = new AudioFormat.Builder().setEncoding(2).setChannelMask(12).setSampleRate(i2).build();
                    try {
                        Constructor constructor = AudioRecord.class.getConstructor(AudioAttributes.class, AudioFormat.class, Integer.TYPE, Integer.TYPE);
                        constructor.setAccessible(true);
                        AudioRecord audioRecord = (AudioRecord) constructor.newInstance(build, build2, Integer.valueOf(i), 0);
                        int i4 = Build.VERSION.SDK_INT;
                        AudioManager audioManager = (AudioManager) this.f35632n.getSystemService("audio");
                        boolean isStreamMute = audioManager.isStreamMute(3);
                        this.f35638t = isStreamMute;
                        if (isStreamMute) {
                            audioManager.adjustStreamVolume(3, 100, 0);
                        }
                        return audioRecord;
                    } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                        bnsi b = this.f35619a.mo68387b();
                        b.mo68437a(e);
                        b.mo68432a("nhk", "a", 721, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        b.mo68405a("AudioRecord construction failed");
                        return null;
                    }
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                    bnsi b2 = this.f35619a.mo68387b();
                    b2.mo68437a(e2);
                    b2.mo68432a("nhk", "a", 697, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b2.mo68405a("addTag failed");
                    return null;
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
                bnsi b3 = this.f35619a.mo68387b();
                b3.mo68437a(e3);
                b3.mo68432a("nhk", "a", 688, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b3.mo68405a("setInternalCapturePreset failed");
                return null;
            }
        } else {
            bnsi d2 = this.f35619a.mo68390d();
            d2.mo68432a("nhk", "a", 736, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("Mixing media and guidance audio");
            bmxy.m108581a(this.f35631m);
            nxg nxg = this.f35631m;
            int i5 = Build.VERSION.SDK_INT;
            Object obj = nxg.f36856a;
            AudioAttributes.Builder builder3 = new AudioAttributes.Builder();
            builder3.setUsage(1);
            AudioAttributes.Builder builder4 = new AudioAttributes.Builder();
            builder4.setUsage(12);
            AudioMixingRule build3 = new AudioMixingRule.Builder().addRule(builder3.build(), 1).addRule(builder4.build(), 1).build();
            AudioMix build4 = new AudioMix.Builder(build3).setFormat(new AudioFormat.Builder().setEncoding(2).setChannelMask(12).setSampleRate(i2).build()).setRouteFlags(2).build();
            AudioPolicy audioPolicy = (AudioPolicy) obj;
            audioPolicy.attachMixes(bngx.m109356a(build4));
            return audioPolicy.createAudioRecordSink(build4);
        }
    }

    /* renamed from: a */
    public final synchronized void mo20671a() {
        bnsi d = this.f35619a.mo68390d();
        d.mo68432a("nhk", "a", (int) ErrorInfo.TYPE_SDU_UNKNOWN, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("AudioSourceService is ready with stream type: %s", this.f35621c);
        if (!this.f35643y) {
            int a = njp.m26585a(this.f35620b, this.f35616A);
            if (this.f35641w) {
                this.f35617B = a;
                this.f35633o = new nwz(njp.m26586a(this.f35616A[a]));
                m26291g();
            }
            this.f35643y = true;
        }
    }

    /* renamed from: a */
    public final void mo20672a(PrintWriter printWriter) {
        String str = this.f35621c;
        boolean z = this.f35623e;
        int i = this.f35617B;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55);
        sb.append("stream type: ");
        sb.append(str);
        sb.append(" has focus:");
        sb.append(z);
        sb.append(" config chosen:");
        sb.append(i);
        printWriter.println(sb.toString());
        printWriter.println("Supported configs");
        bioo[] biooArr = this.f35644z;
        if (biooArr != null) {
            for (bioo bioo : biooArr) {
                if (bioo != null) {
                    int i2 = bioo.f121080c;
                    int i3 = bioo.f121081d;
                    int i4 = bioo.f121079b;
                    StringBuilder sb2 = new StringBuilder(66);
                    sb2.append("num bits:");
                    sb2.append(i2);
                    sb2.append(" num chs:");
                    sb2.append(i3);
                    sb2.append(" sampling rate:");
                    sb2.append(i4);
                    printWriter.println(sb2.toString());
                }
            }
            return;
        }
        printWriter.println("null configs");
    }

    /* renamed from: a */
    public final synchronized void mo20673a(nxe nxe) {
        if (nxe == this.f35624f) {
            bnsi d = this.f35619a.mo68390d();
            d.mo68432a("nhk", "a", 226, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68420a("onBottomHalfLost, stream: %s", this.f35621c);
            this.f35625g = 2;
            m26289a(1000L);
        }
    }

    /* renamed from: a */
    public final synchronized void mo20674a(nxe nxe, long j) {
        bnsi d = this.f35619a.mo68390d();
        d.mo68432a("nhk", "a", 248, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68424a("onBottomHalfSwitch, stream: %s, new bh: %s", this.f35621c, njp.m26591d(nxe.mo20645a()));
        this.f35626h = nxe;
        this.f35625g = 3;
        m26289a(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20675a(boolean z) {
        int i = this.f35625g;
        if (i != 1) {
            int i2 = -1;
            if (i == 2) {
                this.f35623e = false;
                nxe nxe = this.f35624f;
                bnsi d = this.f35619a.mo68390d();
                d.mo68432a("nhk", "a", (int) ErrorInfo.TYPE_FSC_HTTP_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                String str = this.f35621c;
                if (nxe != null) {
                    i2 = nxe.mo20645a();
                }
                d.mo68424a("focus loss, stream: %s, old bh: %s", str, njp.m26591d(i2));
                if (nxe != null) {
                    nxe.mo20652a(false);
                }
                if (z) {
                    this.f35630l.mo20699b(this.f35620b);
                }
                this.f35624f = null;
            } else if (i == 3) {
                nxe nxe2 = this.f35624f;
                bnsi d2 = this.f35619a.mo68390d();
                d2.mo68432a("nhk", "a", 316, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                String str2 = this.f35621c;
                if (nxe2 != null) {
                    i2 = nxe2.mo20645a();
                }
                d2.mo68425a("switching BH for stream: %s, from BH: %s to BH %s", str2, njp.m26591d(i2), njp.m26591d(this.f35626h.mo20645a()));
                if (nxe2 != null) {
                    nxe2.mo20652a(false);
                }
                this.f35623e = true;
                this.f35626h.mo20647a(this.f35636r);
                this.f35624f = this.f35626h;
            }
        } else {
            bnsi d3 = this.f35619a.mo68390d();
            d3.mo68432a("nhk", "a", 289, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d3.mo68424a("focus gain, stream: %s, bh: %s", this.f35621c, njp.m26591d(this.f35626h.mo20645a()));
            this.f35623e = true;
            this.f35624f = this.f35626h;
            this.f35624f.mo20647a(this.f35636r);
        }
        if (i != 0) {
            this.f35625g = 0;
            synchronized (this) {
                notifyAll();
            }
        }
    }
}
