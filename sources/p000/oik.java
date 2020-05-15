package p000;

import android.os.SystemClock;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: oik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class oik extends ojh {

    /* renamed from: a */
    public static final bnsn f37698a = odk.m28481a("CAR.GAL.MEDIA");

    /* renamed from: b */
    public volatile int f37699b;

    /* renamed from: c */
    protected volatile boolean f37700c;

    /* renamed from: d */
    public final Object f37701d = new Object();

    /* renamed from: e */
    public final oit f37702e;

    /* renamed from: f */
    public final oiu f37703f;

    /* renamed from: g */
    private final birv f37704g;

    /* renamed from: h */
    private boolean f37705h = false;

    /* renamed from: i */
    private volatile int f37706i = -1;

    /* renamed from: j */
    private final AtomicInteger f37707j = new AtomicInteger(1);

    /* renamed from: k */
    private final Map f37708k;

    /* renamed from: l */
    private final Map f37709l;

    /* renamed from: r */
    private final AtomicInteger f37710r = new AtomicInteger(0);

    /* renamed from: s */
    private boolean f37711s = false;

    public oik(int i, ofs ofs, ojm ojm, oiu oiu, int i2, birv birv, oit oit) {
        super(i, ofs, ojm, i2);
        this.f37703f = oiu;
        this.f37702e = oit;
        this.f37704g = birv;
        this.f37709l = new ConcurrentHashMap();
        this.f37708k = new ConcurrentHashMap();
    }

    /* renamed from: a */
    public static String m28816a(birv birv) {
        if (birv == null) {
            return "UNKNOWN";
        }
        switch (birv.ordinal()) {
            case 0:
                return "PCM";
            case 1:
                return "AAC";
            case 2:
                return "H264";
            case 3:
                return "AAC-ADTS";
            case 4:
                return "VP9";
            case 5:
                return "AV1";
            case 6:
                return "H265";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: d */
    private final void mo22244d(int i) {
        if (cctf.m131515b()) {
            Long l = (Long) this.f37708k.remove(Integer.valueOf(i));
            if (l == null) {
                bnsi b = f37698a.mo68387b();
                b.mo68432a("oik", "d", 468, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Attempted to remove non-existent callback timestamp from MediaSourceEndPoint.");
                return;
            }
            this.f37703f.mo20693b(SystemClock.elapsedRealtime() - l.longValue());
        }
    }

    /* renamed from: f */
    private final boolean mo22245f() {
        if (this.f37708k.size() >= 500 && !this.f37711s) {
            bnsi b = f37698a.mo68387b();
            b.mo68432a("oik", "f", (int) ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Media callback queue overflow. MediaSourceEndpoint is not processing callbacks or media frames are not being processed quickly enough.");
            this.f37711s = true;
        } else if (this.f37708k.size() < 500) {
            this.f37711s = false;
        }
        return this.f37708k.size() < 500;
    }

    /* renamed from: c */
    public final void mo22187c(int i) {
        if (this.f37705h) {
            bxvd da = bivh.f121982d.mo74144da();
            int i2 = this.f37699b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bivh bivh = (bivh) da.f164949b;
            int i3 = bivh.f121984a | 1;
            bivh.f121984a = i3;
            bivh.f121985b = i2;
            bivh.f121984a = i3 | 2;
            bivh.f121986c = i;
            this.f37702e.mo22193b();
            this.f37710r.set(0);
            mo22206a(32769, (bivh) da.mo74062i());
            this.f37700c = true;
            return;
        }
        bnsi b = f37698a.mo68387b();
        b.mo68432a("oik", "c", 231, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b.mo68409a("Trying to start Media before receiving Config message, ch:%d", this.f37755p.mo22112a());
    }

    /* renamed from: e */
    public final void mo22189e() {
        if (!this.f37700c) {
            bnsi b = f37698a.mo68387b();
            b.mo68432a("oik", "e", (int) PSKKeyManager.MAX_KEY_LENGTH_BYTES, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68409a("Trying to stop Media before starting, ch:%d", this.f37755p.mo22112a());
            return;
        }
        this.f37706i = this.f37699b;
        this.f37699b++;
        mo22206a(32770, bivn.f122019a);
        this.f37700c = false;
    }

    /* renamed from: i */
    public final void mo22088i() {
        super.mo22088i();
        this.f37755p.mo22112a();
        bxvd da = bivf.f121970c.mo74144da();
        birv birv = this.f37704g;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bivf bivf = (bivf) da.f164949b;
        bivf.f121973b = birv.f121478h;
        bivf.f121972a |= 1;
        mo22206a((int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT, (bivf) da.mo74062i());
    }

    /* renamed from: a */
    private final void m28817a(int i, int i2) {
        if (this.f37700c) {
            Integer valueOf = Integer.valueOf(i);
            int a = okb.m28990a(valueOf) % PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (a != this.f37699b % PSKKeyManager.MAX_KEY_LENGTH_BYTES) {
                if (a != this.f37706i % PSKKeyManager.MAX_KEY_LENGTH_BYTES) {
                    bnsi c = f37698a.mo68388c();
                    c.mo68432a("oik", "a", (int) BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68425a("Got mismatch session id in ack. Expected: %d got: %d ch:%d", Integer.valueOf(this.f37699b), valueOf, Integer.valueOf(this.f37755p.mo22112a()));
                    return;
                }
                return;
            }
        } else {
            Integer valueOf2 = Integer.valueOf(i);
            if (okb.m28990a(valueOf2) != this.f37706i) {
                bnsi c2 = f37698a.mo68388c();
                c2.mo68432a("oik", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c2.mo68425a("Got ack while not started. Previous session id was %dgot: %d ch:%d", Integer.valueOf(this.f37706i), valueOf2, Integer.valueOf(this.f37755p.mo22112a()));
                return;
            }
        }
        this.f37710r.set(0);
        if (okb.m28990a(Integer.valueOf(i2)) <= 0) {
            ojm ojm = this.f37756q;
            bpdn bpdn = bpdn.PROTOCOL_WRONG_MESSAGE;
            bpdo bpdo = bpdo.INVALID_ACK;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Ack must ack > 0 frames, was ");
            sb.append(i2);
            ojm.mo21328b(bpdn, bpdo, sb.toString());
            return;
        }
        this.f37702e.mo22191a(i2);
        if (!mo22188c()) {
            synchronized (this.f37701d) {
                this.f37701d.notifyAll();
            }
        }
    }

    /* renamed from: b */
    public final void mo22087b(int i) {
        if (cctf.m131515b()) {
            Long l = (Long) this.f37708k.remove(Integer.valueOf(i));
            if (l == null) {
                bnsi b = f37698a.mo68387b();
                b.mo68432a("oik", "d", 468, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Attempted to remove non-existent callback timestamp from MediaSourceEndPoint.");
            } else {
                this.f37703f.mo20693b(SystemClock.elapsedRealtime() - l.longValue());
            }
        }
        Runnable runnable = (Runnable) this.f37709l.remove(Integer.valueOf(i));
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: d */
    public final void mo22149d() {
        super.mo22149d();
        oit oit = this.f37702e;
        if (oit != null) {
            oit.mo22194c();
        }
    }

    /* renamed from: c */
    public final boolean mo22188c() {
        return this.f37702e.mo22190a() > 0;
    }

    /* renamed from: a */
    public void mo22084a(int i) {
        this.f37755p.mo22112a();
        if (this.f37700c) {
            this.f37700c = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22085a(int i, ByteBuffer byteBuffer) {
        int b = birw.m102772b(i);
        if (b == 32772) {
            bipu bipu = (bipu) GeneratedMessageLite.m124012a(bipu.f121213d, byteBuffer);
            if (bipu != null) {
                mo22070a(bipu);
            }
        } else if (b == 32773) {
            biom biom = (biom) GeneratedMessageLite.m124012a(biom.f121063d, byteBuffer);
            if (biom != null) {
                int i2 = biom.f121066b;
                int i3 = biom.f121067c;
                if (this.f37700c) {
                    Integer valueOf = Integer.valueOf(i2);
                    int a = okb.m28990a(valueOf) % PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (a != this.f37699b % PSKKeyManager.MAX_KEY_LENGTH_BYTES) {
                        if (a != this.f37706i % PSKKeyManager.MAX_KEY_LENGTH_BYTES) {
                            bnsi c = f37698a.mo68388c();
                            c.mo68432a("oik", "a", (int) BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            c.mo68425a("Got mismatch session id in ack. Expected: %d got: %d ch:%d", Integer.valueOf(this.f37699b), valueOf, Integer.valueOf(this.f37755p.mo22112a()));
                            return;
                        }
                        return;
                    }
                } else {
                    Integer valueOf2 = Integer.valueOf(i2);
                    if (okb.m28990a(valueOf2) != this.f37706i) {
                        bnsi c2 = f37698a.mo68388c();
                        c2.mo68432a("oik", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c2.mo68425a("Got ack while not started. Previous session id was %dgot: %d ch:%d", Integer.valueOf(this.f37706i), valueOf2, Integer.valueOf(this.f37755p.mo22112a()));
                        return;
                    }
                }
                this.f37710r.set(0);
                if (okb.m28990a(Integer.valueOf(i3)) <= 0) {
                    ojm ojm = this.f37756q;
                    bpdn bpdn = bpdn.PROTOCOL_WRONG_MESSAGE;
                    bpdo bpdo = bpdo.INVALID_ACK;
                    StringBuilder sb = new StringBuilder(40);
                    sb.append("Ack must ack > 0 frames, was ");
                    sb.append(i3);
                    ojm.mo21328b(bpdn, bpdo, sb.toString());
                    return;
                }
                this.f37702e.mo22191a(i3);
                if (!mo22188c()) {
                    synchronized (this.f37701d) {
                        this.f37701d.notifyAll();
                    }
                }
            }
        } else {
            bnsi c3 = f37698a.mo68388c();
            c3.mo68432a("oik", "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c3.mo68411a("Received message with invalid type header: %d ch:%d", i, this.f37755p.mo22112a());
        }
    }

    /* renamed from: a */
    public final void mo22182a(long j) {
        synchronized (this.f37701d) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = j + elapsedRealtime;
            while (mo22188c() && elapsedRealtime < j2) {
                this.f37755p.mo22112a();
                try {
                    this.f37701d.wait(j2 - elapsedRealtime);
                } catch (InterruptedException e) {
                }
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
        }
        if (mo22188c()) {
            bnsi c = f37698a.mo68388c();
            c.mo68432a("oik", "a", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Car did not give all ACKs. Just reset counter");
            this.f37702e.mo22193b();
        }
    }

    /* renamed from: a */
    public final void mo22183a(long j, ByteBuffer byteBuffer) {
        mo22185a(j, byteBuffer, (Runnable) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22184a(long j, ByteBuffer byteBuffer, int i) {
        if (this.f37700c) {
            int position = byteBuffer.position();
            byteBuffer.position(2);
            byteBuffer.putLong(j);
            byteBuffer.position(position);
            if (cctf.m131515b()) {
                if (this.f37708k.size() >= 500 && !this.f37711s) {
                    bnsi b = f37698a.mo68387b();
                    b.mo68432a("oik", "f", (int) ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68405a("Media callback queue overflow. MediaSourceEndpoint is not processing callbacks or media frames are not being processed quickly enough.");
                    this.f37711s = true;
                } else if (this.f37708k.size() < 500) {
                    this.f37711s = false;
                }
                if (this.f37708k.size() < 500) {
                    this.f37708k.put(Integer.valueOf(i), Long.valueOf(SystemClock.elapsedRealtime()));
                }
            }
            this.f37755p.mo22113a(byteBuffer, new ogv(true, true, i));
            return;
        }
        bnsi b2 = f37698a.mo68387b();
        b2.mo68432a("oik", "a", 373, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b2.mo68409a("Trying to send media data before starting, ch:%d", this.f37755p.mo22112a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0082 A[Catch:{ InterruptedException -> 0x0115 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0083 A[Catch:{ InterruptedException -> 0x0115 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090 A[Catch:{ InterruptedException -> 0x0115 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00dd A[Catch:{ InterruptedException -> 0x0115 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f9 A[Catch:{ InterruptedException -> 0x0115 }] */
    /* renamed from: a */
    public final void mo22185a(long j, ByteBuffer byteBuffer, Runnable runnable) {
        int i;
        int incrementAndGet;
        ByteBuffer byteBuffer2 = byteBuffer;
        Runnable runnable2 = runnable;
        if (!this.f37752m) {
            try {
                if (!this.f37702e.mo22195d() && (incrementAndGet = this.f37710r.incrementAndGet()) > 400) {
                    bpdo bpdo = this.f37754o != 1 ? bpdo.AUDIO_ACK_TIMEOUT : bpdo.VIDEO_ACK_TIMEOUT;
                    ojm ojm = this.f37756q;
                    bpdn bpdn = bpdn.CAR_NOT_RESPONDING;
                    int a = this.f37755p.mo22112a();
                    int i2 = this.f37704g.f121478h;
                    int i3 = this.f37699b;
                    StringBuilder sb = new StringBuilder(109);
                    sb.append("Car not sending ACK, channel:");
                    sb.append(a);
                    sb.append(", timeouts:");
                    sb.append(incrementAndGet);
                    sb.append(", media type:");
                    sb.append(i2);
                    sb.append(", sessionId:");
                    sb.append(i3);
                    ojm.mo21328b(bpdn, bpdo, sb.toString());
                }
                int position = byteBuffer.position();
                if (!cctf.m131515b()) {
                    if (runnable2 == null) {
                        i = 0;
                        if (runnable2 == null) {
                            this.f37709l.put(Integer.valueOf(i), runnable2);
                        }
                        if (!this.f37700c) {
                            int position2 = byteBuffer.position();
                            byteBuffer2.position(2);
                            byteBuffer2.putLong(j);
                            byteBuffer2.position(position2);
                            if (cctf.m131515b()) {
                                if (this.f37708k.size() >= 500) {
                                    if (!this.f37711s) {
                                        bnsi b = f37698a.mo68387b();
                                        b.mo68432a("oik", "f", (int) ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        b.mo68405a("Media callback queue overflow. MediaSourceEndpoint is not processing callbacks or media frames are not being processed quickly enough.");
                                        this.f37711s = true;
                                        if (this.f37708k.size() < 500) {
                                            this.f37708k.put(Integer.valueOf(i), Long.valueOf(SystemClock.elapsedRealtime()));
                                        }
                                    }
                                }
                                if (this.f37708k.size() < 500) {
                                    this.f37711s = false;
                                }
                                if (this.f37708k.size() < 500) {
                                }
                            }
                            this.f37755p.mo22113a(byteBuffer2, new ogv(true, true, i));
                        } else {
                            bnsi b2 = f37698a.mo68387b();
                            b2.mo68432a("oik", "a", 373, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            b2.mo68409a("Trying to send media data before starting, ch:%d", this.f37755p.mo22112a());
                        }
                        this.f37703f.mo20689a(position);
                    }
                }
                i = this.f37707j.getAndIncrement();
                if (runnable2 == null) {
                }
                if (!this.f37700c) {
                }
                this.f37703f.mo20689a(position);
            } catch (InterruptedException e) {
                bnsi c = f37698a.mo68388c();
                c.mo68432a("oik", "a", 362, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68409a("Dropping frame, ch:%d", this.f37755p.mo22112a());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22070a(bipu bipu) {
        int i = bipu.f121216b;
        if (i <= 0) {
            ojm ojm = this.f37756q;
            bpdn bpdn = bpdn.PROTOCOL_WRONG_CONFIGURATION;
            bpdo bpdo = bpdo.INVALID_ACK_CONFIG;
            int i2 = bipu.f121216b;
            StringBuilder sb = new StringBuilder(40);
            sb.append("MaxUnacked must be >= 0, was ");
            sb.append(i2);
            ojm.mo21328b(bpdn, bpdo, sb.toString());
        } else if (this.f37705h) {
            this.f37756q.mo21328b(bpdn.PROTOCOL_WRONG_CONFIGURATION, bpdo.MULTIPLE_DISPLAY_CONFIGS, "Multiple media configs received");
        } else {
            this.f37705h = true;
            this.f37702e.mo22196b(i);
        }
    }

    /* renamed from: a */
    public final void mo22186a(byte[] bArr) {
        if (!this.f37700c) {
            bnsi b = f37698a.mo68387b();
            b.mo68432a("oik", "a", 297, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68409a("Trying to send codec config without starting media, ch:%d", this.f37755p.mo22112a());
            return;
        }
        mo22208a(1, bArr, true, 0, bArr.length);
    }
}
