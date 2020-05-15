package p000;

import android.os.SystemClock;

/* renamed from: bete */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bete {

    /* renamed from: a */
    public boolean f112367a = false;

    /* renamed from: b */
    public final bgmk f112368b;

    /* renamed from: c */
    public long f112369c;

    /* renamed from: d */
    public int f112370d;

    /* renamed from: e */
    private final bgnr f112371e;

    /* renamed from: f */
    private final bfgt f112372f;

    /* renamed from: g */
    private final boolean f112373g;

    /* renamed from: h */
    private final bfor f112374h;

    /* renamed from: i */
    private int f112375i;

    public bete(bfgt bfgt, bgmk bgmk, bgnr bgnr, bfor bfor) {
        this.f112368b = bgmk;
        this.f112371e = bgnr;
        this.f112372f = bfgt;
        this.f112373g = bgnr.mo62798b(bfgt);
        this.f112374h = bfor;
        String valueOf = String.valueOf(bfgt);
        boolean z = this.f112373g;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("sensor=");
        sb.append(valueOf);
        sb.append(", supportSensorBatching=");
        sb.append(z);
        sb.toString();
    }

    /* renamed from: a */
    public final void mo61122a() {
        if (this.f112367a) {
            bgnr bgnr = this.f112371e;
            bfgt bfgt = this.f112372f;
            bgjr bgjr = (bgjr) bgnr;
            bfeb a = bfeb.m96484a(bgjr.f116649e, bgjr.f116646b, new bhdb("RealSensorService"));
            bmxy.m108581a(a);
            a.mo61522a("ActivityDetectionScheduler", bfgt);
            this.f112367a = false;
            String valueOf = String.valueOf(this.f112372f);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Sensor batching is off for ");
            sb.append(valueOf);
            sb.toString();
            this.f112374h.mo62050a(bfos.SENSOR_BATCHING_CHANGED, 0, Integer.numberOfTrailingZeros(this.f112372f.f113836x));
        }
    }

    /* renamed from: a */
    public final void mo61123a(int i, int i2) {
        int i3;
        boolean z = this.f112367a;
        if ((!z || this.f112375i != i2) && this.f112373g) {
            if (z && (i3 = this.f112375i) != i2) {
                StringBuilder sb = new StringBuilder(52);
                sb.append("Resizing buffer size from ");
                sb.append(i3);
                sb.append(" to ");
                sb.append(i2);
                sb.toString();
            }
            this.f112375i = i2;
            bgnr bgnr = this.f112371e;
            bfgt bfgt = this.f112372f;
            bgjr bgjr = (bgjr) bgnr;
            bfeb a = bfeb.m96484a(bgjr.f116649e, bgjr.f116646b, new bhdb("ActivityScheduler"));
            bmxy.m108581a(a);
            a.f113555h = cese.f183399a.mo6606a().sensorBatchingFlushTimeoutMillis();
            boolean a2 = a.mo61524a("ActivityDetectionScheduler", bfgt, i, i2);
            this.f112367a = a2;
            if (a2) {
                this.f112369c = SystemClock.elapsedRealtime();
                this.f112370d = i;
                String valueOf = String.valueOf(this.f112372f);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 26);
                sb2.append("Sensor batching is on for ");
                sb2.append(valueOf);
                sb2.toString();
                this.f112374h.mo62051a(bfos.SENSOR_BATCHING_CHANGED, 1, Integer.numberOfTrailingZeros(this.f112372f.f113836x), i);
            }
        }
    }
}
