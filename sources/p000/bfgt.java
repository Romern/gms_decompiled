package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: bfgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfgt extends Enum {

    /* renamed from: C */
    public static final Set f113809C;

    /* renamed from: D */
    private static final /* synthetic */ bfgt[] f113810D;

    /* renamed from: a */
    public static final bfgt f113811a = new bfgt("WIFI", 0, 1, "WiFi", false, 0, 0);

    /* renamed from: b */
    public static final bfgt f113812b = new bfgt("CELL", 1, 2, "cell", false, 0, 0);

    /* renamed from: c */
    public static final bfgt f113813c = new bfgt("ORIENTATION", 2, 4, "orientation", true, 3, 1);

    /* renamed from: d */
    public static final bfgt f113814d = new bfgt("ACCELEROMETER", 3, 8, "accelerometer", true, 3, 1);

    /* renamed from: e */
    public static final bfgt f113815e = new bfgt("GYROSCOPE", 4, 16, "gyroscope", true, 3, 1);

    /* renamed from: f */
    public static final bfgt f113816f = new bfgt("MAGNETIC_FIELD", 5, 32, "magnetic field", true, 3, 1);

    /* renamed from: g */
    public static final bfgt f113817g = new bfgt("GPS", 6, 64, "gps", false, 0, 0);

    /* renamed from: h */
    public static final bfgt f113818h = new bfgt("GPS_SATELLITE", 7, 128, "gps satellite", false, 0, 0);

    /* renamed from: i */
    public static final bfgt f113819i = new bfgt("BAROMETER", 8, PSKKeyManager.MAX_KEY_LENGTH_BYTES, "barometer", true, 1, 1);

    /* renamed from: j */
    public static final bfgt f113820j = new bfgt("UNCAL_MAGNETIC_FIELD", 9, 512, "uncal magnetic field", true, 6, 1);

    /* renamed from: k */
    public static final bfgt f113821k = new bfgt("LIGHT", 10, 1024, "light", true, 1, 2);

    /* renamed from: l */
    public static final bfgt f113822l = new bfgt("PROXIMITY", 11, 2048, "proximity", true, 1, 2);

    /* renamed from: m */
    public static final bfgt f113823m = new bfgt("SOUND", 12, 4096, "sound", true, 113, 0);

    /* renamed from: n */
    public static final bfgt f113824n = new bfgt("HEART_RATE", 13, 8192, "heart rate", true, 1, 2);

    /* renamed from: o */
    public static final bfgt f113825o = new bfgt("STEP_COUNTER", 14, AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES, "step counter", true, 1, 2);

    /* renamed from: p */
    public static final bfgt f113826p = new bfgt("DEVICE_STATE", 15, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT, "device state", false, 0, 0);

    /* renamed from: q */
    public static final bfgt f113827q = new bfgt("GNSS_MEASUREMENTS", 16, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE, "gnss measurements", false, 0, 0);

    /* renamed from: r */
    public static final bfgt f113828r = new bfgt("GNSS_NAVIGATION_MESSAGE", 17, AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE, "gnss navigation message", false, 0, 0);

    /* renamed from: s */
    public static final bfgt f113829s = new bfgt("BLUETOOTH_DEVICE", 18, AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE, "bluetooth device", false, 0, 0);

    /* renamed from: t */
    public static final bfgt f113830t = new bfgt("WIFI_RTT", 19, AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS, "wifi rtt ranging", false, 0, 0);

    /* renamed from: u */
    public static final bfgt f113831u = new bfgt("HEART_PPG", 20, 1048576, "heart ppg", true, 4, 1);

    /* renamed from: v */
    public static final bfgt f113832v = new bfgt("RAW_AUDIO", 21, 2097152, "raw audio", true, 0, 0);

    /* renamed from: w */
    public static final bfgt f113833w;

    /* renamed from: A */
    public final int f113834A;

    /* renamed from: B */
    public final int f113835B;

    /* renamed from: x */
    public final int f113836x;

    /* renamed from: y */
    public final boolean f113837y;

    /* renamed from: z */
    public final String f113838z;

    static {
        bfgt bfgt = new bfgt("UNKNOWN", 22, Integer.MIN_VALUE, "unknown", false, 0, 0);
        f113833w = bfgt;
        bfgt bfgt2 = f113811a;
        bfgt bfgt3 = f113812b;
        bfgt bfgt4 = f113813c;
        bfgt bfgt5 = f113814d;
        bfgt bfgt6 = f113815e;
        bfgt bfgt7 = f113816f;
        bfgt bfgt8 = f113817g;
        bfgt bfgt9 = f113818h;
        bfgt bfgt10 = f113819i;
        bfgt bfgt11 = f113820j;
        bfgt bfgt12 = f113821k;
        bfgt bfgt13 = f113822l;
        bfgt bfgt14 = f113823m;
        bfgt bfgt15 = f113824n;
        bfgt bfgt16 = f113825o;
        bfgt bfgt17 = f113826p;
        bfgt bfgt18 = f113827q;
        bfgt bfgt19 = f113828r;
        bfgt bfgt20 = f113829s;
        bfgt bfgt21 = f113830t;
        bfgt bfgt22 = f113831u;
        bfgt bfgt23 = f113832v;
        f113810D = new bfgt[]{bfgt2, bfgt3, bfgt4, bfgt5, bfgt6, bfgt7, bfgt8, bfgt9, bfgt10, bfgt11, bfgt12, bfgt13, bfgt14, bfgt15, bfgt16, bfgt17, bfgt18, bfgt19, bfgt20, bfgt21, bfgt22, bfgt23, bfgt};
        f113809C = Collections.unmodifiableSet(EnumSet.of(bfgt2, bfgt3, bfgt4, bfgt5, bfgt6, bfgt7, bfgt8, bfgt9, bfgt10, bfgt11, bfgt12, bfgt13, bfgt14, bfgt15, bfgt16, bfgt17, bfgt18, bfgt19, bfgt20, bfgt21, bfgt22, bfgt23));
        Collections.unmodifiableSet(EnumSet.of(f113813c, f113814d, f113815e, f113816f, f113819i, f113820j, f113821k, f113822l, f113824n, f113825o, f113831u));
    }

    private bfgt(String str, int i, int i2, String str2, boolean z, int i3, int i4) {
        this.f113836x = i2;
        this.f113838z = str2;
        this.f113837y = z;
        this.f113834A = i3;
        this.f113835B = i4;
    }

    /* renamed from: a */
    public static int m96705a(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((bfgt) it.next()).f113836x;
        }
        return i;
    }

    public static bfgt[] values() {
        return (bfgt[]) f113810D.clone();
    }

    public final String toString() {
        return String.valueOf(this.f113836x);
    }

    /* renamed from: a */
    public static Set m96706a(int i) {
        EnumSet noneOf = EnumSet.noneOf(bfgt.class);
        for (bfgt bfgt : f113809C) {
            if ((bfgt.f113836x & i) != 0) {
                noneOf.add(bfgt);
            }
        }
        return noneOf;
    }

    /* renamed from: a */
    public static Set m96707a(bfgt... bfgtArr) {
        return EnumSet.copyOf(Arrays.asList(bfgtArr));
    }
}
