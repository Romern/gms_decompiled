package p000;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.gms.car.CarSensorEvent;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: nmv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nmv extends nsn implements ojv, ojn, ojo {

    /* renamed from: a */
    public static final bnsn f36061a = odk.m28481a("CAR.SENSOR");

    /* renamed from: f */
    private static final SparseIntArray f36062f;

    /* renamed from: p */
    private static final CarSensorEvent f36063p;

    /* renamed from: b */
    public final ReentrantLock f36064b = new ReentrantLock();

    /* renamed from: c */
    public final LinkedList f36065c = new LinkedList();

    /* renamed from: d */
    public npx f36066d;

    /* renamed from: e */
    public final ojm f36067e;

    /* renamed from: g */
    private final SparseArray f36068g = new SparseArray();

    /* renamed from: h */
    private int f36069h;

    /* renamed from: i */
    private List f36070i;

    /* renamed from: j */
    private List f36071j;

    /* renamed from: k */
    private final olt f36072k;

    /* renamed from: l */
    private final oln f36073l;

    /* renamed from: m */
    private final Context f36074m;

    /* renamed from: n */
    private final nmu f36075n = new nmu(this);

    /* renamed from: o */
    private biuy f36076o;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(21);
        f36062f = sparseIntArray;
        sparseIntArray.put(10, 1);
        f36062f.put(1, 2);
        f36062f.put(2, 3);
        f36062f.put(3, 4);
        f36062f.put(4, 5);
        f36062f.put(5, 6);
        f36062f.put(6, 7);
        f36062f.put(7, 8);
        f36062f.put(8, 9);
        f36062f.put(9, 10);
        f36062f.put(12, 11);
        f36062f.put(13, 12);
        f36062f.put(11, 13);
        f36062f.put(14, 19);
        f36062f.put(15, 14);
        f36062f.put(16, 16);
        f36062f.put(17, 21);
        f36062f.put(18, 20);
        f36062f.put(19, 17);
        f36062f.put(20, 15);
        f36062f.put(21, 18);
        f36062f.put(22, 22);
        CarSensorEvent carSensorEvent = new CarSensorEvent(11, SystemClock.elapsedRealtimeNanos(), 0, 1);
        f36063p = carSensorEvent;
        carSensorEvent.f29367e[0] = 31;
    }

    public nmv(olt olt, ojm ojm, oln oln, Context context) {
        this.f36072k = olt;
        this.f36067e = ojm;
        this.f36073l = oln;
        this.f36074m = context;
    }

    /* renamed from: a */
    public static int m26871a(int i) {
        int indexOfValue = f36062f.indexOfValue(i);
        if (indexOfValue >= 0) {
            return f36062f.keyAt(indexOfValue);
        }
        return 0;
    }

    /* renamed from: d */
    private static biva m26875d(int i) {
        int i2 = f36062f.get(i, -1);
        if (i2 != -1) {
            biva a = biva.m102863a(i2);
            bmxy.m108586a(a, "Invaild protoSensorType %s", i2);
            return a;
        }
        throw new RuntimeException("Unknown sensor type.");
    }

    /* renamed from: e */
    private static boolean m26876e(int i) {
        return i == 1 || i == 6 || i == 9 || i == 11;
    }

    /* renamed from: f */
    private final boolean m26877f(int i) {
        int i2;
        if (!m26876e(i)) {
            this.f36072k.mo21305aj();
        }
        if (Binder.getCallingUid() == Process.myUid()) {
            return true;
        }
        String h = m26879h(i);
        if (h != null) {
            i2 = npe.m27165c(this.f36074m, h);
        } else {
            i2 = 0;
        }
        if (i2 == -2) {
            bnsi c = f36061a.mo68388c();
            c.mo68432a("nmv", "f", 420, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68420a("PERMISSION_DENIED_IGNORE in client for permission: %s", m26879h(i));
            return false;
        } else if (i2 != -1) {
            return true;
        } else {
            String h2 = m26879h(i);
            int callingPid = Binder.getCallingPid();
            int callingUid = Binder.getCallingUid();
            StringBuilder sb = new StringBuilder(String.valueOf(h2).length() + 64);
            sb.append("client does not have permission:");
            sb.append(h2);
            sb.append(" pid:");
            sb.append(callingPid);
            sb.append(" uid:");
            sb.append(callingUid);
            throw new SecurityException(sb.toString());
        }
    }

    /* renamed from: g */
    private final void m26878g(int i) {
        if (!this.f36075n.mo21173b()) {
            bnsi c = f36061a.mo68388c();
            c.mo68432a("nmv", "g", 539, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Sensor channel not available.");
            return;
        }
        this.f36075n.mo21171a(m26875d(i), -1);
    }

    /* renamed from: h */
    private static final String m26879h(int i) {
        if (i == 2) {
            return "com.google.android.gms.permission.CAR_SPEED";
        }
        if (i == 10) {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        if (i == 4) {
            return "com.google.android.gms.permission.CAR_MILEAGE";
        }
        if (i != 5) {
            return null;
        }
        return "com.google.android.gms.permission.CAR_FUEL";
    }

    /* renamed from: i */
    private final void m26881i() {
        this.f36073l.mo22280d();
        if (!this.f36075n.mo21173b()) {
            throw new IllegalStateException("CarNotConnected");
        }
    }

    /* renamed from: b */
    public final CarSensorEvent mo21179b(int i) {
        m26881i();
        if (m26877f(i)) {
            return mo21181c(i);
        }
        return null;
    }

    /* renamed from: c */
    public final CarSensorEvent mo21181c(int i) {
        bxxc a = this.f36075n.mo21169a(m26875d(i));
        if (a != null) {
            return m26872a(i, a);
        }
        if (i == 11) {
            return f36063p;
        }
        return null;
    }

    /* renamed from: h */
    private final void m26880h() {
        if (this.f36064b.isHeldByCurrentThread()) {
            this.f36064b.unlock();
        }
    }

    /* renamed from: b */
    public final int[] mo21180b() {
        m26881i();
        int[] a = this.f36075n.mo21172a();
        if (this.f36072k.mo21306ak()) {
            return a;
        }
        int i = 0;
        for (int i2 : a) {
            if (m26876e(i2)) {
                i++;
            }
        }
        int[] iArr = new int[i];
        int i3 = 0;
        for (int i4 : a) {
            if (m26876e(i4)) {
                iArr[i3] = i4;
                i3++;
            }
        }
        return iArr;
    }

    /* renamed from: e */
    public final int[] mo21183e() {
        this.f36072k.mo21318aw();
        if (!this.f36070i.isEmpty()) {
            return bxzo.m124571a(this.f36070i);
        }
        return null;
    }

    /* renamed from: a */
    private static CarSensorEvent m26872a(int i, bxxc bxxc) {
        float f;
        float f2;
        int i2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i3;
        float f7;
        float f8;
        float f9;
        float f10;
        int i4;
        int i5;
        int i6 = i;
        byte b = -1;
        byte b2 = -1;
        byte b3 = -1;
        byte b4 = -1;
        int i7 = -1;
        byte b5 = -1;
        int i8 = -1;
        byte b6 = -1;
        float f11 = Float.NaN;
        float f12 = Float.NaN;
        float f13 = Float.NaN;
        float f14 = Float.NaN;
        float f15 = Float.NaN;
        float f16 = Float.NaN;
        float f17 = Float.NaN;
        float f18 = Float.NaN;
        float f19 = Float.NaN;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        switch (i6) {
            case 1:
                bipr bipr = (bipr) bxxc;
                CarSensorEvent carSensorEvent = new CarSensorEvent(1, SystemClock.elapsedRealtimeNanos(), 3, 0);
                float[] fArr = carSensorEvent.f29366d;
                fArr[0] = ((float) bipr.f121208b) * 1.0E-6f;
                int i14 = bipr.f121207a;
                if ((i14 & 2) != 0) {
                    f = ((float) bipr.f121209c) * 1.0E-6f;
                } else {
                    f = Float.NaN;
                }
                fArr[1] = f;
                if ((i14 & 4) != 0) {
                    f11 = ((float) bipr.f121210d) * 1.0E-6f;
                }
                fArr[2] = f11;
                return carSensorEvent;
            case 2:
                bivg bivg = (bivg) bxxc;
                CarSensorEvent carSensorEvent2 = new CarSensorEvent(2, SystemClock.elapsedRealtimeNanos(), 2, 1);
                float[] fArr2 = carSensorEvent2.f29366d;
                fArr2[0] = ((float) bivg.f121978b) * 0.001f;
                byte[] bArr = carSensorEvent2.f29367e;
                int i15 = bivg.f121977a;
                if ((i15 & 2) != 0) {
                    if (bivg.f121979c) {
                        b = 1;
                    } else {
                        b = 0;
                    }
                }
                bArr[0] = b;
                if ((i15 & 4) != 0) {
                    f19 = (float) bivg.f121980d;
                }
                fArr2[1] = f19;
                return carSensorEvent2;
            case 3:
                CarSensorEvent carSensorEvent3 = new CarSensorEvent(3, SystemClock.elapsedRealtimeNanos(), 1, 0);
                carSensorEvent3.f29366d[0] = ((float) ((biuj) bxxc).f121797a) * 0.001f;
                return carSensorEvent3;
            case 4:
                bitg bitg = (bitg) bxxc;
                CarSensorEvent carSensorEvent4 = new CarSensorEvent(4, SystemClock.elapsedRealtimeNanos(), 2, 0);
                float[] fArr3 = carSensorEvent4.f29366d;
                fArr3[0] = ((float) bitg.f121642b) * 0.1f;
                if ((bitg.f121641a & 2) != 0) {
                    f18 = ((float) bitg.f121643c) * 0.1f;
                }
                fArr3[1] = f18;
                return carSensorEvent4;
            case 5:
                biqi biqi = (biqi) bxxc;
                CarSensorEvent carSensorEvent5 = new CarSensorEvent(5, SystemClock.elapsedRealtimeNanos(), 2, 1);
                float[] fArr4 = carSensorEvent5.f29366d;
                int i16 = biqi.f121284a;
                if ((i16 & 1) != 0) {
                    f2 = (float) biqi.f121285b;
                } else {
                    f2 = Float.NaN;
                }
                fArr4[0] = f2;
                if ((i16 & 2) != 0) {
                    f17 = (float) biqi.f121286c;
                }
                fArr4[1] = f17;
                byte[] bArr2 = carSensorEvent5.f29367e;
                if ((i16 & 4) != 0) {
                    if (biqi.f121287d) {
                        b6 = 1;
                    } else {
                        b6 = 0;
                    }
                }
                bArr2[0] = b6;
                return carSensorEvent5;
            case 6:
                CarSensorEvent carSensorEvent6 = new CarSensorEvent(6, SystemClock.elapsedRealtimeNanos(), 0, 1);
                carSensorEvent6.f29367e[0] = ((bith) bxxc).f121647a;
                return carSensorEvent6;
            case 7:
                CarSensorEvent carSensorEvent7 = new CarSensorEvent(7, SystemClock.elapsedRealtimeNanos(), 0, 1);
                byte[] bArr3 = carSensorEvent7.f29367e;
                int a = biqm.m102733a(((biqn) bxxc).f121307a);
                if (a != 0) {
                    i13 = a;
                }
                bArr3[0] = (byte) (i13 - 1);
                return carSensorEvent7;
            case 8:
                bipy bipy = (bipy) bxxc;
                if ((bipy.f121240a & 1) != 0) {
                    i8 = bipy.f121241b.mo73744a();
                }
                CarSensorEvent carSensorEvent8 = new CarSensorEvent(8, SystemClock.elapsedRealtimeNanos(), 0, Math.max(1, i8 + 1));
                carSensorEvent8.f29367e[0] = (byte) i8;
                if ((bipy.f121240a & 1) != 0) {
                    System.arraycopy(bipy.f121241b.mo73780k(), 0, carSensorEvent8.f29367e, 1, bipy.f121241b.mo73744a());
                }
                return carSensorEvent8;
            case 9:
                bitf bitf = (bitf) bxxc;
                CarSensorEvent carSensorEvent9 = new CarSensorEvent(9, SystemClock.elapsedRealtimeNanos(), 0, 1);
                byte[] bArr4 = carSensorEvent9.f29367e;
                if ((bitf.f121637a & 1) != 0) {
                    if (bitf.f121638b) {
                        b5 = 1;
                    } else {
                        b5 = 0;
                    }
                }
                bArr4[0] = b5;
                return carSensorEvent9;
            case 10:
                birs birs = (birs) bxxc;
                CarSensorEvent carSensorEvent10 = new CarSensorEvent(10, SystemClock.elapsedRealtimeNanos(), 6, 9);
                float[] fArr5 = carSensorEvent10.f29366d;
                int i17 = birs.f121460b;
                fArr5[0] = ((float) i17) * 1.0E-7f;
                fArr5[1] = ((float) birs.f121461c) * 1.0E-7f;
                int i18 = birs.f121459a;
                if ((i18 & 8) != 0) {
                    fArr5[2] = ((float) birs.f121462d) * 0.001f;
                    i2 = 7;
                } else {
                    i2 = 3;
                }
                if ((i18 & 16) != 0) {
                    fArr5[3] = ((float) birs.f121463e) * 0.01f;
                    i2 |= 8;
                }
                if ((i18 & 32) != 0) {
                    fArr5[4] = ((float) birs.f121464f) * 0.001f;
                    i2 |= 16;
                }
                if ((i18 & 64) != 0) {
                    fArr5[5] = ((float) birs.f121465g) * 1.0E-6f;
                    i2 |= 32;
                }
                byte[] bArr5 = carSensorEvent10.f29367e;
                bArr5[0] = (byte) i2;
                CarSensorEvent.m22070a(bArr5, 1, i17);
                CarSensorEvent.m22070a(carSensorEvent10.f29367e, 5, birs.f121461c);
                return carSensorEvent10;
            case 11:
                CarSensorEvent carSensorEvent11 = new CarSensorEvent(11, SystemClock.elapsedRealtimeNanos(), 0, 1);
                carSensorEvent11.f29367e[0] = (byte) ((biqc) bxxc).f121251a;
                return carSensorEvent11;
            case 12:
                biqd biqd = (biqd) bxxc;
                CarSensorEvent carSensorEvent12 = new CarSensorEvent(12, SystemClock.elapsedRealtimeNanos(), 2, 1);
                float[] fArr6 = carSensorEvent12.f29366d;
                int i19 = biqd.f121256a;
                if ((i19 & 1) != 0) {
                    f3 = ((float) biqd.f121257b) * 0.001f;
                } else {
                    f3 = Float.NaN;
                }
                fArr6[0] = f3;
                if ((i19 & 2) != 0) {
                    f16 = ((float) biqd.f121258c) * 0.001f;
                }
                fArr6[1] = f16;
                byte[] bArr6 = carSensorEvent12.f29367e;
                if ((i19 & 4) != 0) {
                    i7 = biqd.f121259d;
                }
                bArr6[0] = (byte) i7;
                return carSensorEvent12;
            case 13:
                bira bira = (bira) bxxc;
                CarSensorEvent carSensorEvent13 = new CarSensorEvent(13, SystemClock.elapsedRealtimeNanos(), 2, 0);
                float[] fArr7 = carSensorEvent13.f29366d;
                int i20 = bira.f121372a;
                if ((i20 & 1) != 0) {
                    f4 = ((float) bira.f121373b) * 0.001f;
                } else {
                    f4 = Float.NaN;
                }
                fArr7[0] = f4;
                if ((i20 & 2) != 0) {
                    f15 = ((float) bira.f121374c) * 0.001f;
                }
                fArr7[1] = f15;
                return carSensorEvent13;
            case 14:
                biol biol = (biol) bxxc;
                CarSensorEvent carSensorEvent14 = new CarSensorEvent(14, SystemClock.elapsedRealtimeNanos(), 3, 0);
                float[] fArr8 = carSensorEvent14.f29366d;
                int i21 = biol.f121059a;
                if ((i21 & 1) != 0) {
                    f5 = ((float) biol.f121060b) * 0.001f;
                } else {
                    f5 = Float.NaN;
                }
                fArr8[0] = f5;
                if ((i21 & 2) != 0) {
                    f6 = ((float) biol.f121061c) * 0.001f;
                } else {
                    f6 = Float.NaN;
                }
                fArr8[1] = f6;
                if ((i21 & 4) != 0) {
                    f14 = ((float) biol.f121062d) * 0.001f;
                }
                fArr8[2] = f14;
                return carSensorEvent14;
            case 15:
                bipx bipx = (bipx) bxxc;
                CarSensorEvent carSensorEvent15 = new CarSensorEvent(15, SystemClock.elapsedRealtimeNanos(), bipx.f121237c.size() + 1, 1);
                float[] fArr9 = carSensorEvent15.f29366d;
                if ((bipx.f121235a & 1) != 0) {
                    f13 = ((float) bipx.f121236b) * 0.1f;
                }
                fArr9[0] = f13;
                carSensorEvent15.f29367e[0] = (byte) bipx.f121237c.size();
                while (i9 < bipx.f121237c.size()) {
                    int i22 = i9 + 1;
                    carSensorEvent15.f29366d[i22] = ((float) bipx.f121237c.mo74151b(i9)) * 0.001f;
                    i9 = i22;
                }
                return carSensorEvent15;
            case 16:
                bipz bipz = (bipz) bxxc;
                CarSensorEvent carSensorEvent16 = new CarSensorEvent(16, SystemClock.elapsedRealtimeNanos(), 0, bipz.f121247d.size() + 3);
                byte[] bArr7 = carSensorEvent16.f29367e;
                int i23 = bipz.f121244a;
                bArr7[0] = (i23 & 1) != 0 ? bipz.f121245b ? (byte) 1 : 0 : -1;
                if ((i23 & 2) != 0) {
                    if (bipz.f121246c) {
                        b4 = 1;
                    } else {
                        b4 = 0;
                    }
                }
                bArr7[1] = b4;
                bArr7[2] = (byte) bipz.f121247d.size();
                for (i12++; i12 < bipz.f121247d.size(); i12++) {
                    carSensorEvent16.f29367e[i12 + 3] = bipz.f121247d.mo73730b(i12);
                }
                return carSensorEvent16;
            case 17:
                biqu biqu = (biqu) bxxc;
                int min = Math.min(biqu.f121350c, biqu.f121351d.size());
                CarSensorEvent carSensorEvent17 = new CarSensorEvent(17, SystemClock.elapsedRealtimeNanos(), min * 4, min + 2);
                byte[] bArr8 = carSensorEvent17.f29367e;
                bArr8[0] = (byte) biqu.f121349b;
                if ((biqu.f121348a & 2) != 0) {
                    i3 = biqu.f121350c;
                } else {
                    i3 = 255;
                }
                bArr8[1] = (byte) i3;
                for (i11++; i11 < min; i11++) {
                    int i24 = i11 * 4;
                    biqt biqt = (biqt) biqu.f121351d.get(i11);
                    carSensorEvent17.f29367e[i11 + 2] = biqt.f121342d;
                    float[] fArr10 = carSensorEvent17.f29366d;
                    fArr10[i24] = (float) biqt.f121340b;
                    fArr10[i24 + 1] = ((float) biqt.f121341c) * 0.001f;
                    int i25 = i24 + 2;
                    int i26 = biqt.f121339a;
                    if ((i26 & 8) != 0) {
                        f7 = ((float) biqt.f121343e) * 0.001f;
                    } else {
                        f7 = Float.NaN;
                    }
                    fArr10[i25] = f7;
                    int i27 = i24 + 3;
                    if ((i26 & 16) != 0) {
                        f8 = ((float) biqt.f121344f) * 0.001f;
                    } else {
                        f8 = Float.NaN;
                    }
                    fArr10[i27] = f8;
                }
                return carSensorEvent17;
            case 18:
                biqv biqv = (biqv) bxxc;
                CarSensorEvent carSensorEvent18 = new CarSensorEvent(18, SystemClock.elapsedRealtimeNanos(), 3, 0);
                float[] fArr11 = carSensorEvent18.f29366d;
                int i28 = biqv.f121355a;
                if ((i28 & 1) != 0) {
                    f9 = ((float) biqv.f121356b) * 0.001f;
                } else {
                    f9 = Float.NaN;
                }
                fArr11[0] = f9;
                if ((i28 & 2) != 0) {
                    f10 = ((float) biqv.f121357c) * 0.001f;
                } else {
                    f10 = Float.NaN;
                }
                fArr11[1] = f10;
                if ((i28 & 4) != 0) {
                    f12 = ((float) biqv.f121358d) * 0.001f;
                }
                fArr11[2] = f12;
                return carSensorEvent18;
            case 19:
                birq birq = (birq) bxxc;
                CarSensorEvent carSensorEvent19 = new CarSensorEvent(19, SystemClock.elapsedRealtimeNanos(), 0, 3);
                byte[] bArr9 = carSensorEvent19.f29367e;
                if ((birq.f121447a & 1) != 0) {
                    i4 = biqz.m102746a(birq.f121448b);
                    if (i4 == 0) {
                        i4 = 1;
                    }
                } else {
                    i4 = 0;
                }
                bArr9[0] = (byte) i4;
                byte[] bArr10 = carSensorEvent19.f29367e;
                if ((birq.f121447a & 2) != 0) {
                    i5 = biwa.m102891a(birq.f121449c);
                    if (i5 == 0) {
                        i5 = 1;
                    }
                } else {
                    i5 = 0;
                }
                bArr10[1] = (byte) i5;
                byte[] bArr11 = carSensorEvent19.f29367e;
                if ((birq.f121447a & 4) != 0) {
                    if (birq.f121450d) {
                        b3 = 1;
                    } else {
                        b3 = 0;
                    }
                }
                bArr11[2] = b3;
                return carSensorEvent19;
            case 20:
                biti biti = (biti) bxxc;
                CarSensorEvent carSensorEvent20 = new CarSensorEvent(20, SystemClock.elapsedRealtimeNanos(), 0, 1);
                byte[] bArr12 = carSensorEvent20.f29367e;
                if ((biti.f121652a & 1) != 0) {
                    if (biti.f121653b) {
                        b2 = 1;
                    } else {
                        b2 = 0;
                    }
                }
                bArr12[0] = b2;
                return carSensorEvent20;
            case 21:
                bivo bivo = (bivo) bxxc;
                CarSensorEvent carSensorEvent21 = new CarSensorEvent(21, SystemClock.elapsedRealtimeNanos(), bivo.f122023a.size(), 1);
                carSensorEvent21.f29367e[0] = (byte) bivo.f122023a.size();
                for (i10++; i10 < bivo.f122023a.size(); i10++) {
                    carSensorEvent21.f29366d[i10] = ((float) bivo.f122023a.mo74151b(i10)) * 0.01f;
                }
                return carSensorEvent21;
            case 22:
                CarSensorEvent carSensorEvent22 = new CarSensorEvent(22, SystemClock.elapsedRealtimeNanos(), 0, 1);
                carSensorEvent22.f29367e[0] = ((bivp) bxxc).f122026a;
                return carSensorEvent22;
            default:
                StringBuilder sb = new StringBuilder(24);
                sb.append("Invalid type ");
                sb.append(i6);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    public final void mo20658c() {
        mo21174a();
        this.f36075n.f36055a = null;
    }

    /* renamed from: g */
    public final boolean mo21185g() {
        return this.f36075n.mo21173b();
    }

    /* renamed from: d */
    public final int mo21182d() {
        this.f36072k.mo21318aw();
        return this.f36069h;
    }

    /* renamed from: f */
    public final int[] mo21184f() {
        this.f36072k.mo21318aw();
        if (!this.f36071j.isEmpty()) {
            return bxzo.m124571a(this.f36071j);
        }
        return null;
    }

    /* renamed from: a */
    private final nmq m26873a(nsr nsr) {
        IBinder asBinder = nsr.asBinder();
        Iterator it = this.f36065c.iterator();
        while (it.hasNext()) {
            nmq nmq = (nmq) it.next();
            if (nmq.f36046a.asBinder() == asBinder) {
                return nmq;
            }
        }
        return null;
    }

    /* renamed from: a */
    private final boolean m26874a(int i, int i2) {
        if (!this.f36075n.mo21173b()) {
            bnsi c = f36061a.mo68388c();
            c.mo68432a("nmv", "a", 468, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Sensor channel not available.");
            return false;
        } else if (this.f36075n.mo21171a(m26875d(i), 0)) {
            return true;
        } else {
            bnsi c2 = f36061a.mo68388c();
            c2.mo68432a("nmv", "a", 474, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c2.mo68405a("requestSensorStart failed");
            return false;
        }
    }

    /* renamed from: a */
    public final ofs mo20914a(bivb bivb) {
        if ((bivb.f121923a & 2) == 0) {
            return null;
        }
        biuy biuy = bivb.f121925c;
        if (biuy == null) {
            biuy = biuy.f121888g;
        }
        this.f36076o = biuy;
        biuy biuy2 = bivb.f121925c;
        if (biuy2 == null) {
            biuy2 = biuy.f121888g;
        }
        this.f36069h = biuy2.f121891b;
        this.f36070i = new bxvv(this.f36076o.f121892c, biuy.f121886d);
        this.f36071j = new bxvv(this.f36076o.f121893e, biuy.f121887f);
        return this;
    }

    /* renamed from: a */
    public final ojh mo20646a(ojm ojm) {
        return new ojx(this.f36076o, this, ojm);
    }

    /* renamed from: a */
    public final void mo21174a() {
        if (this.f36075n.mo21173b()) {
            npx npx = this.f36066d;
            if (!(npx == null || npx.f36360d == null)) {
                npx.mo21442c();
                for (int i : npx.f36357b) {
                    npx.f36360d.mo21175a(i, npx);
                }
                npx.f36360d.mo21175a(10, npx);
            }
            try {
                this.f36064b.tryLock(1000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
            }
            try {
                for (int size = this.f36068g.size() - 1; size >= 0; size--) {
                    nms nms = (nms) this.f36068g.valueAt(size);
                    Iterator it = nms.f36052a.iterator();
                    while (it.hasNext()) {
                        ((nmr) it.next()).f36050a.mo21158b();
                    }
                    nms.f36052a.clear();
                }
                this.f36068g.clear();
                this.f36065c.clear();
            } finally {
                m26880h();
            }
        }
    }

    /* renamed from: a */
    public final void mo21175a(int i, nsr nsr) {
        ReentrantLock reentrantLock;
        nmq a;
        int i2;
        if (this.f36075n.mo21173b()) {
            this.f36064b.lock();
            try {
                if (Arrays.binarySearch(this.f36075n.mo21172a(), i) >= 0 && (a = m26873a(nsr)) != null) {
                    a.mo21155a(i);
                    if (a.f36047b.size() == 0) {
                        a.mo21158b();
                        this.f36065c.remove(a);
                    }
                    nms nms = (nms) this.f36068g.get(i);
                    if (nms != null) {
                        nmr a2 = nms.mo21165a(a);
                        if (a2 != null) {
                            nms.f36052a.remove(a2);
                            boolean z = true;
                            boolean z2 = false;
                            if (nms.mo21164a() != 0) {
                                Iterator it = nms.f36052a.iterator();
                                i2 = 3;
                                while (it.hasNext()) {
                                    int i3 = ((nmr) it.next()).f36051b;
                                    if (i3 < i2) {
                                        i2 = i3;
                                    }
                                }
                                if (nms.f36053b == i2) {
                                    z = false;
                                    i2 = 0;
                                } else {
                                    nms.f36053b = i2;
                                    z = false;
                                    z2 = true;
                                }
                            } else {
                                this.f36068g.remove(i);
                                i2 = 0;
                            }
                            if (z) {
                                if (!this.f36075n.mo21173b()) {
                                    bnsi c = f36061a.mo68388c();
                                    c.mo68432a("nmv", "g", 539, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    c.mo68405a("Sensor channel not available.");
                                    return;
                                }
                                this.f36075n.mo21171a(m26875d(i), -1);
                                return;
                            } else if (z2) {
                                m26874a(i, i2);
                                return;
                            } else {
                                return;
                            }
                        } else {
                            reentrantLock = this.f36064b;
                            reentrantLock.unlock();
                        }
                    }
                }
                reentrantLock = this.f36064b;
                reentrantLock.unlock();
            } finally {
                this.f36064b.unlock();
            }
        }
    }

    /* renamed from: a */
    public final void mo21176a(biva biva, bxxc bxxc) {
        int a = m26871a(biva.f121920w);
        this.f36064b.lock();
        try {
            nms nms = (nms) this.f36068g.get(a);
            if (nms == null) {
                bnsi c = f36061a.mo68388c();
                c.mo68432a("nmv", "a", 255, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68409a("sensor event while no listener, sensor:%d", a);
            } else {
                CarSensorEvent a2 = m26872a(a, bxxc);
                Iterator it = nms.f36052a.iterator();
                while (it.hasNext()) {
                    ((nmr) it.next()).f36050a.mo21156a(a2);
                }
            }
        } finally {
            this.f36064b.unlock();
        }
    }

    /* renamed from: a */
    public final void mo20649a(PrintWriter printWriter) {
        nmu nmu = this.f36075n;
        String valueOf = String.valueOf(Arrays.toString(nmu.f36057c));
        printWriter.println(valueOf.length() == 0 ? new String("supported sensors:") : "supported sensors:".concat(valueOf));
        if (nmu.f36055a != null) {
            nmu.f36055a.mo22228a(printWriter);
        } else if (nmu.f36056b != null) {
            printWriter.println("Proxy sensor endpoint");
        } else {
            printWriter.println("No sensor endpoint");
        }
        printWriter.println("clients");
        try {
            Iterator it = this.f36065c.iterator();
            while (it.hasNext()) {
                nmq nmq = (nmq) it.next();
                if (nmq != null) {
                    try {
                        String valueOf2 = String.valueOf(nmq.f36046a);
                        String arrays = Arrays.toString(nmq.mo21157a());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 23 + String.valueOf(arrays).length());
                        sb.append("binder:");
                        sb.append(valueOf2);
                        sb.append(" active sensors:");
                        sb.append(arrays);
                        printWriter.println(sb.toString());
                    } catch (ConcurrentModificationException e) {
                        printWriter.println("concurrent modification happened");
                    }
                } else {
                    printWriter.println("null client");
                }
            }
        } catch (ConcurrentModificationException e2) {
            printWriter.println("concurrent modification happened");
        }
        printWriter.println("sensor listeners");
        try {
            int size = this.f36068g.size();
            for (int i = 0; i < size; i++) {
                int keyAt = this.f36068g.keyAt(i);
                nms nms = (nms) this.f36068g.get(keyAt);
                if (nms != null) {
                    int a = nms.mo21164a();
                    int i2 = nms.f36053b;
                    StringBuilder sb2 = new StringBuilder(59);
                    sb2.append(" Sensor:");
                    sb2.append(keyAt);
                    sb2.append(" num client:");
                    sb2.append(a);
                    sb2.append(" rate:");
                    sb2.append(i2);
                    printWriter.println(sb2.toString());
                }
            }
        } catch (ConcurrentModificationException e3) {
            printWriter.println("concurrent modification happened");
        }
        String valueOf3 = String.valueOf(this.f36070i);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 12);
        sb3.append("fuel types: ");
        sb3.append(valueOf3);
        printWriter.println(sb3.toString());
        npx npx = this.f36066d;
    }

    /* renamed from: a */
    public final void mo20651a(ojh ojh) {
        nmu nmu = this.f36075n;
        ojx ojx = (ojx) ojh;
        nmu.f36055a = ojx;
        nmu.mo21170a(nmu.f36055a.mo22231c());
        synchronized (nmu) {
            nmu.f36055a = ojx;
            nmu.f36056b = null;
            nmu.f36058d = false;
            nmu.notifyAll();
        }
        this.f36066d.mo21438a(this);
    }

    /* renamed from: a */
    public final void mo21177a(omi omi) {
        nmu nmu = this.f36075n;
        nmu.f36056b = omi;
        try {
            nmu.mo21170a(nmu.f36056b.mo22292bl());
            nmu.f36056b.mo22287a(new nmt(nmu));
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final boolean mo21178a(int i, int i2, nsr nsr) {
        ReentrantLock reentrantLock;
        boolean z;
        Integer num;
        m26881i();
        if (!m26877f(i)) {
            return false;
        }
        this.f36064b.lock();
        try {
            if (Arrays.binarySearch(this.f36075n.mo21172a(), i) >= 0) {
                nmq a = m26873a(nsr);
                nms nms = (nms) this.f36068g.get(i);
                if (a == null) {
                    a = new nmq(this, nsr);
                    nsr.asBinder().linkToDeath(a, 0);
                    this.f36065c.add(a);
                }
                CarSensorEvent c = mo21181c(i);
                if (c != null) {
                    a.mo21156a(c);
                }
                nmr nmr = null;
                if (nms == null) {
                    nms = new nms(i2);
                    this.f36068g.put(i, nms);
                    num = null;
                    z = true;
                } else {
                    z = false;
                    num = Integer.valueOf(nms.f36053b);
                    nmr = nms.mo21165a(a);
                }
                if (nmr == null) {
                    nms.f36052a.add(new nmr(a, i2));
                } else {
                    nmr.f36051b = i2;
                }
                if (nms.f36053b > i2) {
                    nms.f36053b = i2;
                    z = true;
                }
                a.f36047b.put(i, true);
                this.f36064b.unlock();
                if (!z || m26874a(i, i2)) {
                    return true;
                }
                this.f36064b.lock();
                try {
                    a.mo21155a(i);
                    if (num == null) {
                        this.f36068g.remove(i);
                    } else {
                        nms.f36053b = num.intValue();
                    }
                    return false;
                } finally {
                    this.f36064b.unlock();
                }
            } else {
                bnsi d = f36061a.mo68390d();
                d.mo68432a("nmv", "a", 326, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68409a("Requested sensor %d not supported", i);
                reentrantLock = this.f36064b;
                reentrantLock.unlock();
                return false;
            }
        } catch (RemoteException e) {
            bnsi d2 = f36061a.mo68390d();
            d2.mo68432a("nmv", "a", 338, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("Adding listener failed.");
            reentrantLock = this.f36064b;
        } catch (Throwable th) {
            this.f36064b.unlock();
            throw th;
        }
    }
}
