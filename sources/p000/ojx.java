package p000;

import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: ojx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ojx extends ojh {

    /* renamed from: b */
    private static final bnsn f37811b = odk.m28481a("CAR.GAL.SENSOR");

    /* renamed from: g */
    private static final int f37812g = 32770;

    /* renamed from: h */
    private static final int f37813h = 32769;

    /* renamed from: i */
    private static final int f37814i = 32771;

    /* renamed from: j */
    private static final int f37815j = 32772;

    /* renamed from: a */
    public volatile boolean f37816a;

    /* renamed from: c */
    private final ojv f37817c;

    /* renamed from: d */
    private volatile boolean f37818d;

    /* renamed from: e */
    private final Semaphore f37819e;

    /* renamed from: f */
    private final SparseArray f37820f;

    public ojx(Bundle bundle, ojv ojv, ojm ojm) {
        super(7, ojv, ojm, 3);
        this.f37818d = false;
        this.f37819e = new Semaphore(0);
        this.f37820f = new SparseArray();
        this.f37817c = ojv;
        for (Pair pair : (List) ojq.m28925a(List.class, bundle.getBinder("sensor_records"))) {
            ojw ojw = new ojw();
            ojw.f37810b = ((Long) ((Pair) pair.second).second).longValue();
            ojw.f37809a = m28966a(biva.m102863a(((Integer) pair.first).intValue()), (byte[]) ((Pair) pair.second).first);
            synchronized (this.f37820f) {
                this.f37820f.put(((Integer) pair.first).intValue(), ojw);
            }
        }
    }

    /* renamed from: a */
    public static bxxc m28966a(biva biva, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        bmxy.m108582a(biva, "Missing SensorType");
        try {
            biva biva2 = biva.SENSOR_LOCATION;
            switch (biva.ordinal()) {
                case 0:
                    return (birs) GeneratedMessageLite.m124016a(birs.f121457h, bArr, bxus.m123744c());
                case 1:
                    return (bipr) GeneratedMessageLite.m124016a(bipr.f121205e, bArr, bxus.m123744c());
                case 2:
                    return (bivg) GeneratedMessageLite.m124016a(bivg.f121975e, bArr, bxus.m123744c());
                case 3:
                    return (biuj) GeneratedMessageLite.m124016a(biuj.f121795b, bArr, bxus.m123744c());
                case 4:
                    return (bitg) GeneratedMessageLite.m124016a(bitg.f121639d, bArr, bxus.m123744c());
                case 5:
                    return (biqi) GeneratedMessageLite.m124016a(biqi.f121282e, bArr, bxus.m123744c());
                case 6:
                    return (bith) GeneratedMessageLite.m124016a(bith.f121645b, bArr, bxus.m123744c());
                case 7:
                    return (biqn) GeneratedMessageLite.m124014a(biqn.f121305b, bArr);
                case 8:
                    return (bipy) GeneratedMessageLite.m124016a(bipy.f121238c, bArr, bxus.m123744c());
                case 9:
                    return (bitf) GeneratedMessageLite.m124016a(bitf.f121635c, bArr, bxus.m123744c());
                case 10:
                    return (biqd) GeneratedMessageLite.m124016a(biqd.f121254e, bArr, bxus.m123744c());
                case 11:
                    return (bira) GeneratedMessageLite.m124016a(bira.f121370d, bArr, bxus.m123744c());
                case 12:
                    return (biqc) GeneratedMessageLite.m124016a(biqc.f121249b, bArr, bxus.m123744c());
                case 13:
                    return (bipx) GeneratedMessageLite.m124016a(bipx.f121233d, bArr, bxus.m123744c());
                case 14:
                    return (biti) GeneratedMessageLite.m124016a(biti.f121650c, bArr, bxus.m123744c());
                case 15:
                    return (bipz) GeneratedMessageLite.m124016a(bipz.f121242e, bArr, bxus.m123744c());
                case 16:
                    return (birq) GeneratedMessageLite.m124014a(birq.f121445e, bArr);
                case 17:
                    return (bivo) GeneratedMessageLite.m124016a(bivo.f122021b, bArr, bxus.m123744c());
                case 18:
                    return (biol) GeneratedMessageLite.m124016a(biol.f121057e, bArr, bxus.m123744c());
                case 19:
                    return (biqv) GeneratedMessageLite.m124016a(biqv.f121353e, bArr, bxus.m123744c());
                case 20:
                    return (biqu) GeneratedMessageLite.m124014a(biqu.f121346e, bArr);
                case 21:
                    return (bivp) GeneratedMessageLite.m124016a(bivp.f122024b, bArr, bxus.m123744c());
                default:
                    String valueOf = String.valueOf(biva.name());
                    throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid type ") : "Invalid type ".concat(valueOf));
            }
        } catch (bxwf e) {
            throw new RuntimeException("Invalid bytes", e);
        }
    }

    /* renamed from: b */
    public final void mo22087b(int i) {
    }

    /* renamed from: c */
    public final bxxc mo22230c(int i) {
        bxxc bxxc;
        synchronized (this.f37820f) {
            ojw ojw = (ojw) this.f37820f.get(i);
            bxxc = ojw != null ? ojw.f37809a : null;
        }
        return bxxc;
    }

    /* renamed from: i */
    public final void mo22088i() {
        this.f37816a = true;
        super.mo22088i();
    }

    /* renamed from: c */
    public final int[] mo22231c() {
        int[] iArr;
        synchronized (this.f37820f) {
            iArr = new int[this.f37820f.size()];
            for (int i = 0; i < this.f37820f.size(); i++) {
                iArr[i] = this.f37820f.keyAt(i);
            }
        }
        return iArr;
    }

    public ojx(biuy biuy, ojv ojv, ojm ojm) {
        super(7, ojv, ojm, 3);
        this.f37818d = false;
        this.f37819e = new Semaphore(0);
        SparseArray sparseArray = new SparseArray();
        this.f37820f = sparseArray;
        this.f37817c = ojv;
        synchronized (sparseArray) {
            for (biux biux : biuy.f121890a) {
                SparseArray sparseArray2 = this.f37820f;
                biva a = biva.m102863a(biux.f121883a);
                if (a == null) {
                    a = biva.SENSOR_LOCATION;
                }
                sparseArray2.put(a.f121920w, new ojw());
            }
        }
    }

    /* renamed from: a */
    public static ojx m28967a(Bundle bundle, ojv ojv, ojm ojm) {
        if (bundle.containsKey("sensor_records")) {
            return new ojx(bundle, ojv, ojm);
        }
        return null;
    }

    /* renamed from: a */
    private final void m28968a(biuq biuq) {
        bnsi c = f37811b.mo68388c();
        c.mo68432a("ojx", "a", 419, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        biva a = biva.m102863a(biuq.f121860a);
        if (a == null) {
            a = biva.SENSOR_LOCATION;
        }
        bius a2 = bius.m102853a(biuq.f121861b);
        if (a2 == null) {
            a2 = bius.SENSOR_OK;
        }
        c.mo68424a("sensor error, sensor:%s error code:%s", a, a2);
    }

    /* renamed from: a */
    private final void m28969a(biuu biuu) {
        bisf a = bisf.m102781a(biuu.f121878a);
        if (a == null) {
            a = bisf.STATUS_UNSOLICITED_MESSAGE;
        }
        if (!bisf.STATUS_SUCCESS.equals(a)) {
            bnsi c = f37811b.mo68388c();
            c.mo68432a("ojx", "a", 409, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68420a("SensorResponse with error %s", a);
            this.f37818d = false;
        } else {
            this.f37818d = true;
        }
        this.f37819e.release();
    }

    /* renamed from: a */
    private final void m28970a(biva biva, bxxc bxxc) {
        synchronized (this.f37820f) {
            ojw ojw = (ojw) this.f37820f.get(biva.f121920w);
            if (ojw != null) {
                ojw.f37809a = bxxc;
            }
        }
        this.f37817c.mo21176a(biva, bxxc);
    }

    /* renamed from: a */
    public final void mo22084a(int i) {
        this.f37817c.mo21174a();
        this.f37816a = false;
        synchronized (this.f37820f) {
            this.f37820f.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo22085a(int i, ByteBuffer byteBuffer) {
        biuq biuq;
        int i2 = f37812g;
        if (i2 != 0) {
            if (i == i2) {
                biuu biuu = (biuu) GeneratedMessageLite.m124012a(biuu.f121876b, byteBuffer);
                if (biuu != null) {
                    bisf a = bisf.m102781a(biuu.f121878a);
                    if (a == null) {
                        a = bisf.STATUS_UNSOLICITED_MESSAGE;
                    }
                    if (!bisf.STATUS_SUCCESS.equals(a)) {
                        bnsi c = f37811b.mo68388c();
                        c.mo68432a("ojx", "a", 409, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c.mo68420a("SensorResponse with error %s", a);
                        this.f37818d = false;
                    } else {
                        this.f37818d = true;
                    }
                    this.f37819e.release();
                    return;
                }
                return;
            }
            int i3 = f37814i;
            if (i3 == 0) {
                throw null;
            } else if (i == i3) {
                biup biup = (biup) GeneratedMessageLite.m124012a(biup.f121833w, byteBuffer);
                if (biup != null) {
                    bxwc bxwc = biup.f121835a;
                    int size = bxwc.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        m28970a(biva.SENSOR_LOCATION, (bxxc) bxwc.get(i4));
                    }
                    bxwc bxwc2 = biup.f121836b;
                    int size2 = bxwc2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        m28970a(biva.SENSOR_COMPASS, (bxxc) bxwc2.get(i5));
                    }
                    bxwc bxwc3 = biup.f121837c;
                    int size3 = bxwc3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        m28970a(biva.SENSOR_SPEED, (bxxc) bxwc3.get(i6));
                    }
                    bxwc bxwc4 = biup.f121838d;
                    int size4 = bxwc4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        m28970a(biva.SENSOR_RPM, (bxxc) bxwc4.get(i7));
                    }
                    bxwc bxwc5 = biup.f121839e;
                    int size5 = bxwc5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        m28970a(biva.SENSOR_ODOMETER, (bxxc) bxwc5.get(i8));
                    }
                    bxwc bxwc6 = biup.f121840f;
                    int size6 = bxwc6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        m28970a(biva.SENSOR_FUEL, (bxxc) bxwc6.get(i9));
                    }
                    bxwc bxwc7 = biup.f121841g;
                    int size7 = bxwc7.size();
                    for (int i10 = 0; i10 < size7; i10++) {
                        m28970a(biva.SENSOR_PARKING_BRAKE, (bxxc) bxwc7.get(i10));
                    }
                    bxwc bxwc8 = biup.f121842h;
                    int size8 = bxwc8.size();
                    for (int i11 = 0; i11 < size8; i11++) {
                        m28970a(biva.SENSOR_GEAR, (bxxc) bxwc8.get(i11));
                    }
                    bxwc bxwc9 = biup.f121844j;
                    int size9 = bxwc9.size();
                    for (int i12 = 0; i12 < size9; i12++) {
                        m28970a(biva.SENSOR_NIGHT_MODE, (bxxc) bxwc9.get(i12));
                    }
                    bxwc bxwc10 = biup.f121845k;
                    int size10 = bxwc10.size();
                    for (int i13 = 0; i13 < size10; i13++) {
                        m28970a(biva.SENSOR_ENVIRONMENT_DATA, (bxxc) bxwc10.get(i13));
                    }
                    bxwc bxwc11 = biup.f121846l;
                    int size11 = bxwc11.size();
                    for (int i14 = 0; i14 < size11; i14++) {
                        m28970a(biva.SENSOR_HVAC_DATA, (bxxc) bxwc11.get(i14));
                    }
                    bxwc bxwc12 = biup.f121847m;
                    int size12 = bxwc12.size();
                    for (int i15 = 0; i15 < size12; i15++) {
                        m28970a(biva.SENSOR_DRIVING_STATUS_DATA, (bxxc) bxwc12.get(i15));
                    }
                    bxwc bxwc13 = biup.f121853s;
                    int size13 = bxwc13.size();
                    for (int i16 = 0; i16 < size13; i16++) {
                        m28970a(biva.SENSOR_ACCELEROMETER_DATA, (bxxc) bxwc13.get(i16));
                    }
                    bxwc bxwc14 = biup.f121854t;
                    int size14 = bxwc14.size();
                    for (int i17 = 0; i17 < size14; i17++) {
                        m28970a(biva.SENSOR_GYROSCOPE_DATA, (bxxc) bxwc14.get(i17));
                    }
                    bxwc bxwc15 = biup.f121855u;
                    int size15 = bxwc15.size();
                    for (int i18 = 0; i18 < size15; i18++) {
                        m28970a(biva.SENSOR_GPS_SATELLITE_DATA, (bxxc) bxwc15.get(i18));
                    }
                    bxwc bxwc16 = biup.f121848n;
                    int size16 = bxwc16.size();
                    for (int i19 = 0; i19 < size16; i19++) {
                        m28970a(biva.SENSOR_DEAD_RECKONING_DATA, (bxxc) bxwc16.get(i19));
                    }
                    bxwc bxwc17 = biup.f121850p;
                    int size17 = bxwc17.size();
                    for (int i20 = 0; i20 < size17; i20++) {
                        m28970a(biva.SENSOR_DOOR_DATA, (bxxc) bxwc17.get(i20));
                    }
                    bxwc bxwc18 = biup.f121851q;
                    int size18 = bxwc18.size();
                    for (int i21 = 0; i21 < size18; i21++) {
                        m28970a(biva.SENSOR_LIGHT_DATA, (bxxc) bxwc18.get(i21));
                    }
                    bxwc bxwc19 = biup.f121849o;
                    int size19 = bxwc19.size();
                    for (int i22 = 0; i22 < size19; i22++) {
                        m28970a(biva.SENSOR_PASSENGER_DATA, (bxxc) bxwc19.get(i22));
                    }
                    bxwc bxwc20 = biup.f121852r;
                    int size20 = bxwc20.size();
                    for (int i23 = 0; i23 < size20; i23++) {
                        m28970a(biva.SENSOR_TIRE_PRESSURE_DATA, (bxxc) bxwc20.get(i23));
                    }
                    bxwc bxwc21 = biup.f121843i;
                    int size21 = bxwc21.size();
                    for (int i24 = 0; i24 < size21; i24++) {
                        m28970a(biva.SENSOR_OBDII_DIAGNOSTIC_CODE, (bxxc) bxwc21.get(i24));
                    }
                    bxwc bxwc22 = biup.f121856v;
                    int size22 = bxwc22.size();
                    for (int i25 = 0; i25 < size22; i25++) {
                        m28970a(biva.SENSOR_TOLL_CARD, (bxxc) bxwc22.get(i25));
                    }
                }
            } else {
                int i26 = f37815j;
                if (i26 == 0) {
                    throw null;
                } else if (i == i26 && (biuq = (biuq) GeneratedMessageLite.m124012a(biuq.f121858c, byteBuffer)) != null) {
                    bnsi c2 = f37811b.mo68388c();
                    c2.mo68432a("ojx", "a", 419, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    biva a2 = biva.m102863a(biuq.f121860a);
                    if (a2 == null) {
                        a2 = biva.SENSOR_LOCATION;
                    }
                    bius a3 = bius.m102853a(biuq.f121861b);
                    if (a3 == null) {
                        a3 = bius.SENSOR_OK;
                    }
                    c2.mo68424a("sensor error, sensor:%s error code:%s", a2, a3);
                }
            }
        } else {
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo22146a(Bundle bundle) {
        if (this.f37816a) {
            if (this.f37819e.availablePermits() != 0) {
                bnsi c = f37811b.mo68388c();
                c.mo68432a("ojx", "a", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("sendSensorRequest wait semaphore available, SensorResponse came later?");
            }
            synchronized (this.f37820f) {
                ArrayList arrayList = new ArrayList(this.f37820f.size());
                for (int i = 0; i < this.f37820f.size(); i++) {
                    ojw ojw = (ojw) this.f37820f.valueAt(i);
                    bxxc bxxc = ojw.f37809a;
                    arrayList.add(Pair.create(Integer.valueOf(this.f37820f.keyAt(i)), Pair.create(bxxc != null ? bxxc.serializeToBytes() : null, Long.valueOf(ojw.f37810b))));
                }
                bundle.putBinder("sensor_records", ojq.m28926a(arrayList).asBinder());
            }
            return;
        }
        throw new IllegalStateException("Can't suspend SensorsEndPoint");
    }

    /* renamed from: a */
    public final void mo22228a(PrintWriter printWriter) {
        String str;
        printWriter.println("last events for sensors");
        try {
            int size = this.f37820f.size();
            for (int i = 0; i < size; i++) {
                int keyAt = this.f37820f.keyAt(i);
                ojw ojw = (ojw) this.f37820f.get(keyAt);
                if (ojw != null && ojw.f37809a != null) {
                    long j = ojw.f37810b;
                    StringBuilder sb = new StringBuilder(48);
                    sb.append("  sensor: ");
                    sb.append(keyAt);
                    sb.append(" rate: ");
                    sb.append(j);
                    printWriter.println(sb.toString());
                    if (!(keyAt == 1 || keyAt == 128 || keyAt == 21)) {
                        if (!ccvf.f180029a.mo6606a().mo76874a()) {
                            bxxc bxxc = ojw.f37809a;
                            bmxy.m108581a(bxxc);
                            String valueOf = String.valueOf(bxxc.toString().trim());
                            printWriter.println(valueOf.length() == 0 ? new String("    ") : "    ".concat(valueOf));
                        } else {
                            bxxc bxxc2 = ojw.f37809a;
                            bmxy.m108581a(bxxc2);
                            if (bxxc2 instanceof bitf) {
                                boolean z = ((bitf) bxxc2).f121638b;
                                StringBuilder sb2 = new StringBuilder(17);
                                sb2.append("Night mode: ");
                                sb2.append(z);
                                str = sb2.toString();
                            } else if (bxxc2 instanceof biqc) {
                                int i2 = ((biqc) bxxc2).f121251a;
                                StringBuilder sb3 = new StringBuilder(27);
                                sb3.append("Driving status: ");
                                sb3.append(i2);
                                str = sb3.toString();
                            } else {
                                String valueOf2 = String.valueOf(bxxc2.toString().trim());
                                str = valueOf2.length() == 0 ? new String("Message: ") : "Message: ".concat(valueOf2);
                            }
                            String valueOf3 = String.valueOf(str);
                            printWriter.println(valueOf3.length() == 0 ? new String("    ") : "    ".concat(valueOf3));
                        }
                    }
                }
            }
        } catch (ConcurrentModificationException e) {
            printWriter.println("concurrent modification happened");
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo22229a(biva biva, long j) {
        ojw ojw;
        if (!this.f37816a) {
            bnsi c = f37811b.mo68388c();
            c.mo68432a("ojx", "a", 230, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("sendSensorRequest on closed channel");
            return false;
        } else if (this.f37752m) {
            bnsi c2 = f37811b.mo68388c();
            c2.mo68432a("ojx", "a", 234, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c2.mo68405a("sendSensorRequest on quiting channel");
            return false;
        } else {
            synchronized (this.f37820f) {
                ojw = (ojw) this.f37820f.get(biva.f121920w);
            }
            if (ojw == null) {
                return false;
            }
            if (ojw.f37810b == j) {
                return true;
            }
            if (this.f37819e.availablePermits() != 0) {
                bnsi c3 = f37811b.mo68388c();
                c3.mo68432a("ojx", "a", 249, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c3.mo68405a("sendSensorRequest wait semaphore available, SensorResponse came later?");
                this.f37819e.drainPermits();
            }
            bxvd da = biut.f121870d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            biut biut = (biut) da.f164949b;
            biut.f121873b = biva.f121920w;
            int i = biut.f121872a | 1;
            biut.f121872a = i;
            biut.f121872a = i | 2;
            biut.f121874c = j;
            biut biut2 = (biut) da.mo74062i();
            int i2 = f37813h;
            if (i2 != 0) {
                mo22206a(i2, biut2);
                try {
                    if (this.f37819e.tryAcquire(2000, TimeUnit.MILLISECONDS)) {
                        ojw.f37810b = j;
                        if (j == -1) {
                            ojw.f37809a = null;
                        }
                        return this.f37818d;
                    }
                    bnsi b = f37811b.mo68387b();
                    b.mo68432a("ojx", "a", 259, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68405a("sendSensorRequest timed-out");
                    return false;
                } catch (InterruptedException e) {
                    return false;
                }
            } else {
                throw null;
            }
        }
    }
}
