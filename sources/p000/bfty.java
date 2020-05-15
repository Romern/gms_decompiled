package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.location.DeviceOrientation;
import com.google.android.location.fused.orientation.DeviceOrientationDetector$1;
import java.util.concurrent.TimeUnit;

/* renamed from: bfty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfty extends aaco {

    /* renamed from: E */
    private static final float f115272E = (1.0f - (200000.0f / ((float) TimeUnit.SECONDS.toMicros(3))));

    /* renamed from: l */
    public static final /* synthetic */ int f115273l = 0;

    /* renamed from: m */
    private static final Long f115274m = Long.valueOf(TimeUnit.SECONDS.toNanos(1));

    /* renamed from: A */
    private int f115275A = -1;

    /* renamed from: B */
    private int f115276B = -1;

    /* renamed from: C */
    private float f115277C = Float.NaN;

    /* renamed from: D */
    private float f115278D = Float.NaN;

    /* renamed from: F */
    private final bfuf f115279F;

    /* renamed from: a */
    bunk f115280a = null;

    /* renamed from: b */
    public boolean f115281b;

    /* renamed from: c */
    public float f115282c = 0.0f;

    /* renamed from: d */
    public Location f115283d = null;

    /* renamed from: e */
    public final Context f115284e;

    /* renamed from: f */
    public final BroadcastReceiver f115285f;

    /* renamed from: g */
    public final PowerManager f115286g;

    /* renamed from: h */
    public float f115287h = Float.MAX_VALUE;

    /* renamed from: i */
    public boolean f115288i;

    /* renamed from: j */
    public final Object f115289j = new Object();

    /* renamed from: k */
    public boolean f115290k;

    /* renamed from: n */
    private final Display f115291n;

    /* renamed from: o */
    private final SensorManager f115292o;

    /* renamed from: p */
    private final Handler f115293p;

    /* renamed from: q */
    private final Sensor f115294q;

    /* renamed from: r */
    private final Sensor f115295r;

    /* renamed from: s */
    private final Sensor f115296s;

    /* renamed from: t */
    private final DeviceOrientation f115297t = new DeviceOrientation();

    /* renamed from: u */
    private float f115298u = Float.NaN;

    /* renamed from: v */
    private final float[] f115299v = new float[9];

    /* renamed from: w */
    private final float[] f115300w = new float[9];

    /* renamed from: x */
    private final float[] f115301x = new float[4];

    /* renamed from: y */
    private final int f115302y;

    /* renamed from: z */
    private long f115303z = Long.MIN_VALUE;

    public bfty(Context context, SensorManager sensorManager, Handler handler, bfuf bfuf) {
        super("DeviceOrientationDetector", "location");
        this.f115284e = context;
        this.f115293p = handler;
        this.f115292o = sensorManager;
        this.f115286g = (PowerManager) context.getSystemService("power");
        SensorManager sensorManager2 = this.f115292o;
        int i = Build.VERSION.SDK_INT;
        Sensor defaultSensor = sensorManager2.getDefaultSensor(14);
        this.f115294q = defaultSensor == null ? sensorManager2.getDefaultSensor(2) : defaultSensor;
        this.f115295r = this.f115292o.getDefaultSensor(1);
        this.f115296s = this.f115292o.getDefaultSensor(4);
        this.f115291n = ((WindowManager) this.f115284e.getSystemService("window")).getDefaultDisplay();
        this.f115302y = (int) TimeUnit.MILLISECONDS.toMicros(cewg.f183473a.mo6606a().fopSensorSamplingPeriodMilliseconds());
        this.f115285f = new DeviceOrientationDetector$1(this, "location");
        this.f115281b = false;
        this.f115279F = bfuf;
    }

    /* renamed from: a */
    public final void mo62264a() {
        Sensor sensor;
        if (this.f115288i && (sensor = this.f115294q) != null && this.f115295r != null && this.f115296s != null) {
            mo62265a(sensor, this.f115302y);
            mo62265a(this.f115296s, this.f115302y);
            mo62265a(this.f115295r, this.f115302y);
        }
    }

    /* renamed from: b */
    public final void mo62266b() {
        if (this.f115294q != null && this.f115295r != null && this.f115296s != null) {
            this.f115292o.unregisterListener(this);
        }
    }

    /* renamed from: c */
    public final void mo62267c() {
        this.f115298u = Float.NaN;
        this.f115287h = Float.MAX_VALUE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62265a(Sensor sensor, int i) {
        int i2 = Build.VERSION.SDK_INT;
        this.f115292o.registerListener(this, sensor, i, 200000, this.f115293p);
    }

    /* renamed from: a */
    public final void mo9869a(SensorEvent sensorEvent) {
        float f;
        float f2;
        float f3;
        float f4;
        bunk bunk;
        float f5;
        bunn bunn;
        float f6;
        int i;
        int i2;
        float f7;
        float f8;
        bunk bunk2;
        SensorEvent sensorEvent2 = sensorEvent;
        if (sensorEvent2 != null && sensorEvent2.values != null && sensorEvent2.values.length >= 3 && this.f115280a != null) {
            if (this.f115288i) {
                if (!(this.f115303z == Long.MIN_VALUE || sensorEvent2.timestamp - this.f115303z <= f115274m.longValue() || (bunk2 = this.f115280a) == null)) {
                    bunk2.f154368d = false;
                    bunk2.f154369e = 0.0f;
                    bunk2.f154370f = 0.0f;
                    bunk2.f154371g = 0.0f;
                    bunk2.f154372h = Double.NaN;
                    bunk2.f154366b.mo72900a();
                    bunk2.f154365a.mo72896b();
                    bunj bunj = bunk2.f154367c;
                    bunj.f154349a = Float.NaN;
                    bunj.f154350b = Float.NaN;
                    bunj.f154351c = Float.NaN;
                    bunj.f154360m = Float.NaN;
                    bunj.f154361n = Float.NaN;
                    bunj.f154352e.mo72914a();
                    bunj.f154353f.mo72914a();
                    bunj.f154354g.mo72914a();
                    bunj.f154355h = 45.0f;
                    bunj.f154362o = Long.MIN_VALUE;
                    bunk2.f154375k.mo72911b();
                    bunk2.f154373i = Long.MIN_VALUE;
                    bunk2.f154374j.mo72901a();
                }
                this.f115303z = sensorEvent2.timestamp;
                int type = sensorEvent2.sensor.getType();
                if (type != 1) {
                    if (type == 2) {
                        f3 = 0.0f;
                        f2 = 0.0f;
                        f = 0.0f;
                    } else if (type == 4) {
                        bunk bunk3 = this.f115280a;
                        float f9 = sensorEvent2.values[0];
                        float f10 = sensorEvent2.values[1];
                        float f11 = sensorEvent2.values[2];
                        long j = this.f115303z;
                        bunl bunl = bunk3.f154366b;
                        if (bunl.f154378c > 0 && TimeUnit.NANOSECONDS.toSeconds(j - bunl.f154378c) > 1) {
                            bunl.mo72900a();
                        }
                        bunl.f154378c = j;
                        if (bunl.f154379d) {
                            bunl.f154377b.mo72911b();
                            bunr bunr = bunl.f154377b;
                            buno buno = bunl.f154380e;
                            float f12 = ((float) (j - buno.f154392d)) * 1.0E-9f;
                            if (f12 > 0.04f) {
                                f12 = buno.f154391c ? buno.f154389a : 0.01f;
                            } else if (buno.f154390b != 0) {
                                buno.f154389a = bunp.m120074a(0.95f, buno.f154389a, f12);
                                int i3 = buno.f154390b + 1;
                                buno.f154390b = i3;
                                if (((float) i3) >= 10.0f) {
                                    buno.f154391c = true;
                                }
                            } else {
                                buno.f154389a = f12;
                                buno.f154390b = 1;
                            }
                            buno.f154392d = j;
                            float sqrt = (float) Math.sqrt((double) ((f9 * f9) + (f10 * f10) + (f11 * f11)));
                            float f13 = f12 * sqrt;
                            if (((double) sqrt) > 1.0E-10d) {
                                f8 = ((float) Math.sin((double) (f13 / 2.0f))) / sqrt;
                            } else {
                                f8 = 0.0f;
                            }
                            bunr.f154394a = f9 * f8;
                            bunr.f154395b = f10 * f8;
                            bunr.f154396c = f8 * f11;
                            bunr.f154397d = (float) Math.cos((double) (f13 / 2.0f));
                            bunr bunr2 = bunl.f154376a;
                            bunr bunr3 = bunl.f154377b;
                            float f14 = bunr2.f154397d;
                            float f15 = bunr3.f154394a;
                            float f16 = bunr2.f154394a;
                            float f17 = bunr3.f154397d;
                            float f18 = bunr2.f154395b;
                            float f19 = bunr3.f154396c;
                            float f20 = bunr2.f154396c;
                            float f21 = bunr3.f154395b;
                            float f22 = (((f14 * f15) + (f16 * f17)) + (f18 * f19)) - (f20 * f21);
                            bunr2.f154394a = f22;
                            float f23 = ((f14 * f21) - (f16 * f19)) + (f18 * f17) + (f20 * f15);
                            bunr2.f154395b = f23;
                            float f24 = (((f14 * f19) + (f16 * f21)) - (f18 * f15)) + (f20 * f17);
                            bunr2.f154396c = f24;
                            float f25 = (((f14 * f17) - (f16 * f15)) - (f18 * f21)) - (f20 * f19);
                            bunr2.f154397d = f25;
                            float f26 = (f22 * f22) + (f23 * f23) + (f24 * f24) + (f25 * f25);
                            if (Math.abs(1.0f - f26) >= 2.107342E-8f) {
                                float sqrt2 = (float) Math.sqrt((double) f26);
                                if (sqrt2 != 0.0f) {
                                    float f27 = 1.0f / sqrt2;
                                    bunr2.f154394a *= f27;
                                    bunr2.f154395b *= f27;
                                    bunr2.f154396c *= f27;
                                    bunr2.f154397d *= f27;
                                } else {
                                    bunr2.mo72911b();
                                }
                            }
                        } else {
                            bunl.f154376a.mo72911b();
                            bunl.f154380e = new buno(j);
                            bunl.f154379d = true;
                        }
                        bunk3.f154365a.mo72895a(j, f9, f10, f11);
                        bunr bunr4 = bunk3.f154366b.f154376a;
                        bunj bunj2 = bunk3.f154367c;
                        float f28 = bunr4.f154395b;
                        float f29 = bunr4.f154396c;
                        float f30 = bunr4.f154394a;
                        float f31 = bunr4.f154397d;
                        float a = bunp.m120073a(((float) Math.toDegrees(Math.atan2((double) (1.0f - (((f28 + f28) * f28) + ((f29 + f29) * f29))), (double) (((f30 + f30) * f28) + ((f31 + f31) * f29))))) - 0.049804688f);
                        if (!Float.isNaN(a)) {
                            bunj2.f154350b = a;
                            bunj2.f154357j = j;
                            return;
                        }
                        return;
                    } else if (type == 14) {
                        if (sensorEvent2.values.length >= 6) {
                            f2 = sensorEvent2.values[3];
                            f = sensorEvent2.values[4];
                            f3 = sensorEvent2.values[5];
                        } else {
                            f3 = 0.0f;
                            f2 = 0.0f;
                            f = 0.0f;
                        }
                    } else {
                        return;
                    }
                    bunk bunk4 = this.f115280a;
                    float f32 = sensorEvent2.values[0];
                    float f33 = sensorEvent2.values[1];
                    float f34 = sensorEvent2.values[2];
                    long j2 = this.f115303z;
                    bunm bunm = bunk4.f154374j;
                    bunn bunn2 = bunm.f154383c;
                    if (bunn2 == null) {
                        bunm.f154383c = new bunn(j2, f2, f, f3);
                    } else if (Math.abs(bunn2.f154385a - f2) > 0.1f || Math.abs(bunm.f154383c.f154386b - f) > 0.1f || Math.abs(bunm.f154383c.f154387c - f3) > 0.1f) {
                        float f35 = f32 - f2;
                        float f36 = f33 - f;
                        float f37 = f34 - f3;
                        float sqrt3 = (float) Math.sqrt((double) ((f35 * f35) + (f36 * f36) + (f37 * f37)));
                        if (Float.isNaN(bunm.f154382b) || Math.abs(sqrt3 - bunm.f154382b) < 10.0f) {
                            bunm.f154383c = new bunn(j2, f2, f, f3);
                            bunm.f154384d = j2;
                        }
                    }
                    bunn bunn3 = bunk4.f154374j.f154383c;
                    if (bunn3 != null) {
                        f2 = bunn3.f154385a;
                        f = bunn3.f154386b;
                        f3 = bunn3.f154387c;
                    }
                    float f38 = f32 - f2;
                    float f39 = f33 - f;
                    float f40 = f34 - f3;
                    double sqrt4 = Math.sqrt((double) ((f38 * f38) + (f39 * f39) + (f40 * f40)));
                    if (bunk4.f154368d) {
                        float f41 = bunk4.f154371g;
                        float f42 = bunk4.f154370f;
                        double d = (double) ((f39 * f41) - (f40 * f42));
                        float f43 = bunk4.f154369e;
                        double d2 = (double) ((f40 * f43) - (f41 * f38));
                        double d3 = (double) ((f42 * f38) - (f43 * f39));
                        Double.isNaN(d);
                        Double.isNaN(d);
                        Double.isNaN(d2);
                        Double.isNaN(d2);
                        Double.isNaN(d3);
                        Double.isNaN(d3);
                        double sqrt5 = 1.0d / Math.sqrt(((d * d) + (d2 * d2)) + (d3 * d3));
                        bunk = bunk4;
                        float f44 = bunk.f154369e;
                        float f45 = bunk.f154370f;
                        f4 = f40;
                        float f46 = bunk.f154371g;
                        double sqrt6 = 1.0d / Math.sqrt((double) (((f44 * f44) + (f45 * f45)) + (f46 * f46)));
                        float f47 = bunk.f154369e;
                        Double.isNaN(d2);
                        f5 = f39;
                        double d4 = (double) bunk.f154371g;
                        Double.isNaN(d4);
                        Double.isNaN(d);
                        double d5 = d4 * sqrt6 * d * sqrt5;
                        double d6 = (double) f47;
                        Double.isNaN(d6);
                        Double.isNaN(d3);
                        bunk.f154372h = Math.atan2(d2 * sqrt5, d5 - ((d6 * sqrt6) * (d3 * sqrt5)));
                        bunk.f154373i = j2;
                    } else {
                        f4 = f40;
                        f5 = f39;
                        bunk = bunk4;
                    }
                    bunj bunj3 = bunk.f154367c;
                    float f48 = (float) sqrt4;
                    if (!Float.isNaN(f48)) {
                        if (!Float.isNaN(bunj3.f154349a)) {
                            f48 = bunp.m120074a(0.8f, bunj3.f154349a, f48);
                        }
                        bunj3.f154349a = f48;
                        bunj3.f154356i = j2;
                    }
                    bunj bunj4 = bunk.f154367c;
                    bunm bunm2 = bunk.f154374j;
                    long j3 = bunm2.f154384d;
                    bunr bunr5 = null;
                    if (j3 == 0 || j2 - j3 >= bunm.f154381a) {
                        bunn = null;
                    } else {
                        bunn = bunm2.f154383c;
                    }
                    if (bunn != null) {
                        bunj4.f154362o = bunn.f154388d;
                    }
                    if (!Double.isNaN(bunk.f154372h)) {
                        bunj bunj5 = bunk.f154367c;
                        float degrees = (float) Math.toDegrees(bunk.f154372h);
                        if (!Float.isNaN(degrees)) {
                            if (!Float.isNaN(bunj5.f154351c)) {
                                bunj5.f154351c = bunp.m120073a((bunp.m120073a(bunj5.f154351c - degrees) * 0.7f) + degrees);
                            } else {
                                bunj5.f154351c = degrees;
                            }
                            bunj5.f154358k = j2;
                            long j4 = bunj5.f154359l;
                            if (j4 == Long.MIN_VALUE || j2 - j4 >= bunj.f154347d) {
                                if (bunj5.f154356i != Long.MIN_VALUE && !Float.isNaN(bunj5.f154349a)) {
                                    bunj5.f154354g.mo72915a(bunj5.f154349a);
                                }
                                if (bunj5.f154357j != Long.MIN_VALUE && !Float.isNaN(bunj5.f154350b) && !Float.isNaN(bunj5.f154360m)) {
                                    bunj5.f154352e.mo72915a(bunp.m120073a(bunj5.f154350b - bunj5.f154360m));
                                }
                                long j5 = bunj5.f154358k;
                                if (j5 == Long.MIN_VALUE || j2 - j5 > bunj.f154347d || Float.isNaN(bunj5.f154351c) || Float.isNaN(bunj5.f154361n)) {
                                    long j6 = bunj5.f154358k;
                                    if (j6 != Long.MIN_VALUE && j2 - j6 > bunj.f154347d) {
                                        bunj5.f154353f.mo72915a(1.0f);
                                    }
                                } else {
                                    bunj5.f154353f.mo72915a(bunp.m120073a(bunj5.f154351c - bunj5.f154361n));
                                }
                                bunj5.f154360m = bunj5.f154350b;
                                bunj5.f154361n = bunj5.f154351c;
                                bunj5.f154359l = j2;
                            }
                        }
                    }
                    float a2 = bunk.f154367c.mo72897a(j2);
                    if (a2 == -1.0f) {
                        a2 = 180.0f;
                    }
                    bunk.f154365a.mo72894a(f38, f5, f4, a2);
                    if (this.f115280a.mo72898a(this.f115303z)) {
                        float[] b = this.f115280a.mo72899b(this.f115303z);
                        float[] fArr = this.f115299v;
                        System.arraycopy(b, 0, fArr, 0, fArr.length);
                        bunk bunk5 = this.f115280a;
                        if (bunk5.mo72898a(this.f115303z)) {
                            f6 = bunk5.f154365a.mo72892a();
                        } else {
                            f6 = Float.NaN;
                        }
                        this.f115298u = f6;
                        float a3 = bfuq.m97942a(this.f115291n.getRotation(), this.f115299v, this.f115300w);
                        if (Math.abs(-3.4028235E38f + a3) < 1.0E-6f) {
                            mo62267c();
                        } else {
                            this.f115290k = bfup.m97941a(this.f115300w);
                            if (bfuq.m97943a(a3)) {
                                f7 = bfuq.m97944b(this.f115282c + a3);
                            } else {
                                f7 = Float.MAX_VALUE;
                            }
                            this.f115287h = f7;
                            float f49 = this.f115298u;
                            this.f115298u = (!bfuq.m97943a(a3) || f49 < 0.0f || ((double) f49) > 3.141592653589793d) ? Float.NaN : this.f115298u;
                        }
                        bunk bunk6 = this.f115280a;
                        long j7 = this.f115303z;
                        if (bunk6.mo72899b(j7) != null) {
                            bunr5 = bunk6.f154375k;
                            float[] b2 = bunk6.mo72899b(j7);
                            if (b2 != null) {
                                float f50 = b2[0];
                                float f51 = b2[4];
                                float f52 = b2[8];
                                float f53 = f50 + f51 + f52;
                                if (f53 > 1.0E-6f) {
                                    double sqrt7 = Math.sqrt((double) (f53 + 1.0f));
                                    float f54 = (float) (sqrt7 + sqrt7);
                                    bunr5.f154397d = 0.25f * f54;
                                    bunr5.f154394a = (b2[7] - b2[5]) / f54;
                                    bunr5.f154395b = (b2[2] - b2[6]) / f54;
                                    bunr5.f154396c = (b2[3] - b2[1]) / f54;
                                } else if (f50 > f51 && f50 > f52) {
                                    double sqrt8 = Math.sqrt((double) (((f50 + 1.0f) - f51) - f52));
                                    float f55 = (float) (sqrt8 + sqrt8);
                                    bunr5.f154397d = (b2[7] - b2[5]) / f55;
                                    bunr5.f154394a = 0.25f * f55;
                                    bunr5.f154395b = (b2[3] + b2[1]) / f55;
                                    bunr5.f154396c = (b2[2] + b2[6]) / f55;
                                } else if (f51 > f52) {
                                    double sqrt9 = Math.sqrt((double) (((f51 + 1.0f) - f50) - f52));
                                    float f56 = (float) (sqrt9 + sqrt9);
                                    bunr5.f154397d = (b2[2] - b2[6]) / f56;
                                    bunr5.f154394a = (b2[3] + b2[1]) / f56;
                                    bunr5.f154395b = 0.25f * f56;
                                    bunr5.f154396c = (b2[7] + b2[5]) / f56;
                                } else {
                                    double sqrt10 = Math.sqrt((double) (((f52 + 1.0f) - f50) - f51));
                                    float f57 = (float) (sqrt10 + sqrt10);
                                    bunr5.f154397d = (b2[3] - b2[1]) / f57;
                                    bunr5.f154394a = (b2[2] + b2[6]) / f57;
                                    bunr5.f154395b = (b2[7] + b2[5]) / f57;
                                    bunr5.f154396c = f57 * 0.25f;
                                }
                            }
                        }
                        if (bunr5 != null) {
                            float[] fArr2 = this.f115301x;
                            fArr2[0] = bunr5.f154394a;
                            fArr2[1] = bunr5.f154395b;
                            fArr2[2] = bunr5.f154396c;
                            fArr2[3] = bunr5.f154397d;
                            float degrees2 = (float) ((int) Math.toDegrees((double) this.f115298u));
                            if (degrees2 != Float.NaN) {
                                i = degrees2 > ((float) cewg.m138353k()) ? degrees2 > ((float) cewg.m138355m()) ? degrees2 <= ((float) cewg.m138354l()) ? 1 : 0 : 2 : 3;
                            } else {
                                i = -1;
                            }
                            this.f115276B = i;
                            float a4 = this.f115280a.f154367c.mo72897a(this.f115303z);
                            if (a4 == -1.0f) {
                                a4 = 180.0f;
                            }
                            if (!Float.isNaN(this.f115278D)) {
                                a4 = bunp.m120074a(f115272E, this.f115278D, a4);
                            }
                            this.f115278D = a4;
                            if (Float.isNaN(this.f115277C) || Math.abs(this.f115278D - this.f115277C) >= ((float) cewg.f183473a.mo6606a().fopMinChangeErrorDegreesForLevelUpdate())) {
                                float f58 = this.f115278D;
                                this.f115277C = f58;
                                if (f58 <= 179.0f) {
                                    if (f58 >= 0.0f) {
                                        if (f58 <= ((float) cewg.m138353k())) {
                                            i2 = 3;
                                        } else if (f58 <= ((float) cewg.m138355m())) {
                                            i2 = 2;
                                        } else if (f58 <= ((float) cewg.m138354l())) {
                                            i2 = 1;
                                        }
                                    }
                                    i2 = 0;
                                } else {
                                    i2 = -1;
                                }
                                this.f115275A = i2;
                            }
                            if (this.f115279F != null && bfuq.m97943a(this.f115287h)) {
                                float f59 = this.f115278D;
                                if (f59 >= 0.0f && f59 <= 180.0f) {
                                    this.f115297t.mo43532j();
                                    DeviceOrientation deviceOrientation = this.f115297t;
                                    deviceOrientation.f79327g = this.f115303z;
                                    deviceOrientation.f79324d = this.f115275A;
                                    deviceOrientation.f79328h = (byte) (deviceOrientation.f79328h | 2);
                                    deviceOrientation.mo43519a((float) Math.toDegrees((double) this.f115287h));
                                    DeviceOrientation deviceOrientation2 = this.f115297t;
                                    deviceOrientation2.f79323c = this.f115276B;
                                    deviceOrientation2.f79328h = (byte) (deviceOrientation2.f79328h | 1);
                                    deviceOrientation2.mo43520a(this.f115301x);
                                    this.f115297t.mo43521b(this.f115278D);
                                    this.f115279F.mo62278a(this.f115297t);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    mo62267c();
                    return;
                }
                bunk bunk7 = this.f115280a;
                float f60 = sensorEvent2.values[0];
                float f61 = sensorEvent2.values[1];
                float f62 = sensorEvent2.values[2];
                if (bunk7.f154368d) {
                    bunk7.f154369e = (bunk7.f154369e * 0.8f) + (f60 * 0.19999999f);
                    bunk7.f154370f = (bunk7.f154370f * 0.8f) + (f61 * 0.19999999f);
                    bunk7.f154371g = (bunk7.f154371g * 0.8f) + (0.19999999f * f62);
                } else {
                    bunk7.f154369e = f60;
                    bunk7.f154370f = f61;
                    bunk7.f154371g = f62;
                    bunk7.f154368d = true;
                }
                bunk7.f154365a.mo72893a(f60, f61, f62);
                return;
            }
            mo62267c();
        }
    }
}
