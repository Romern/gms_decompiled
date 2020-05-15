package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: bfey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfey extends bfgs implements bfgr {

    /* renamed from: a */
    public final List f113610a;

    /* renamed from: b */
    private final boolean f113611b;

    /* renamed from: c */
    private final bfho f113612c;

    /* renamed from: d */
    private final Context f113613d;

    /* renamed from: e */
    private final int f113614e;

    /* renamed from: f */
    private final int f113615f;

    /* renamed from: l */
    private boolean f113616l = false;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x020d A[LOOP:1: B:84:0x020b->B:85:0x020d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0223  */
    public bfey(Context context, Set set, Map map, bfho bfho, bfgy bfgy, bfko bfko, bgnx bgnx, long j, long j2, boolean z, bfev bfev, boolean z2, bfew bfew, bhdb bhdb, bgmj bgmj, int i, int i2) {
        super(r12, bfew, bhdb);
        ArrayList arrayList;
        char c;
        ArrayList arrayList2;
        int size;
        int i3;
        BluetoothAdapter defaultAdapter;
        bflb bflb;
        bfif bfif;
        Object obj;
        Context context2 = context;
        Set set2 = set;
        bfho bfho2 = bfho;
        bfev bfev2 = bfev;
        this.f113613d = context2;
        this.f113612c = bfho2;
        this.f113615f = i;
        this.f113614e = i2;
        if (!set2.contains(bfgt.f113823m) || !set2.contains(bfgt.f113832v)) {
            ArrayList arrayList3 = new ArrayList();
            if (set2.contains(bfgt.f113812b)) {
                TelephonyManager telephonyManager = (TelephonyManager) context2.getSystemService("phone");
                if (bfho2 == null && telephonyManager.getSimState() == 5) {
                    arrayList3.add(new bfei(telephonyManager, bfev2, this.f113806i, this.f113804g));
                }
            }
            if (!set2.contains(bfgt.f113811a)) {
                arrayList = arrayList3;
            } else if (bgnx == null) {
                throw new IllegalArgumentException("wifiService can't be null when WiFi scan is requested.");
            } else if (bfho2 == null) {
                bgkc bgkc = (bgkc) bgnx;
                if (bgkx.f116729g.mo62944a(bgkc.f116685d, bgkc.f116682a)) {
                    if (!z) {
                        bflb = bflb.f114329a;
                    } else {
                        bflb = bfks.f114313a;
                    }
                    if (set2.contains(bfgt.f113830t)) {
                        int i4 = Build.VERSION.SDK_INT;
                        bfif = new bfif();
                    } else {
                        bfif = null;
                    }
                    if (m96545a(context)) {
                        arrayList = arrayList3;
                        obj = new bfil(context, bfev, bflb, this.f113806i, this.f113804g, bgmj, j, bfif);
                    } else {
                        arrayList = arrayList3;
                        obj = new bfid(context, bfev, bflb, this.f113806i, this.f113804g, j, bfif);
                    }
                    arrayList.add(obj);
                } else {
                    arrayList = arrayList3;
                }
            } else {
                arrayList = arrayList3;
            }
            if (set2.contains(bfgt.f113823m)) {
                arrayList.add(new bfhs(context, bfev, this.f113806i, this.f113804g, new bgof()));
            } else if (set2.contains(bfgt.f113832v)) {
                arrayList.add(new bfgf(context, bfev, this.f113806i, this.f113804g, new bgof(), this.f113615f, this.f113614e));
            }
            if (set2.contains(bfgt.f113826p)) {
                arrayList.add(new bffe(context2, bfev2, this.f113806i, this.f113804g));
            }
            if (set2.contains(bfgt.f113829s) && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null && defaultAdapter.isEnabled()) {
                arrayList.add(new bfee(context2, bfev2, this.f113806i, this.f113804g));
            }
            boolean contains = set2.contains(bfgt.f113817g);
            boolean contains2 = set2.contains(bfgt.f113818h);
            boolean contains3 = set2.contains(bfgt.f113827q);
            boolean contains4 = set2.contains(bfgt.f113828r);
            if (!contains && !contains2 && !contains3 && !contains4) {
                arrayList2 = arrayList;
                c = 0;
            } else {
                LocationManager locationManager = (LocationManager) context2.getSystemService("location");
                if (bfho2 == null) {
                    try {
                        if (!locationManager.isProviderEnabled("gps")) {
                            arrayList2 = arrayList;
                            c = 0;
                        } else {
                            arrayList2 = arrayList;
                            c = 0;
                            try {
                                arrayList2.add(new bffp(context, contains, contains2, contains3, contains4, bfko, bfev, this.f113806i, this.f113804g, j2));
                            } catch (SecurityException e) {
                                e = e;
                            }
                        }
                    } catch (SecurityException e2) {
                        e = e2;
                        arrayList2 = arrayList;
                        c = 0;
                        String valueOf = String.valueOf(e.getMessage());
                        if (valueOf.length() == 0) {
                            new String("GPS scan skipped: can't check GPS ");
                        } else {
                            "GPS scan skipped: can't check GPS ".concat(valueOf);
                        }
                        ArrayList arrayList4 = new ArrayList();
                        SensorManager sensorManager = (SensorManager) context2.getSystemService("sensor");
                        while (r3.hasNext()) {
                        }
                        size = arrayList4.size();
                        while (i3 < size) {
                        }
                        if (!map.isEmpty()) {
                        }
                        this.f113610a = arrayList2;
                        this.f113611b = z2;
                        return;
                    }
                } else {
                    arrayList2 = arrayList;
                    c = 0;
                }
            }
            ArrayList arrayList42 = new ArrayList();
            SensorManager sensorManager2 = (SensorManager) context2.getSystemService("sensor");
            for (Integer num : map.keySet()) {
                int intValue = num.intValue();
                List<Sensor> sensorList = sensorManager2.getSensorList(intValue);
                if (sensorList == null || sensorList.size() == 0) {
                    Locale locale = Locale.US;
                    Integer valueOf2 = Integer.valueOf(intValue);
                    new Object[1][c] = valueOf2;
                    arrayList42.add(valueOf2);
                }
            }
            size = arrayList42.size();
            for (i3 = 0; i3 < size; i3++) {
                map.remove((Integer) arrayList42.get(i3));
            }
            if (!map.isEmpty()) {
                arrayList2.add(new bfgx(context, bfho, map, bfgy, bfev, this.f113806i, this.f113804g));
            }
            this.f113610a = arrayList2;
            this.f113611b = z2;
            return;
        }
        throw new IllegalArgumentException("Cannot collect both sound features and raw audio in parallel.");
    }

    /* renamed from: a */
    static final boolean m96545a(Context context) {
        int i = Build.VERSION.SDK_INT;
        try {
            if (context.checkSelfPermission("android.permission.LOCATION_HARDWARE") != 0 || context.getSystemService("wifiscanner") == null) {
                return false;
            }
            return true;
        } catch (NoSuchMethodError e) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo61529b() {
        List list = this.f113610a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((bfgs) list.get(i)).mo61673h();
        }
        bfew bfew = this.f113806i;
        if (bfew != null) {
            bfew.mo61486a();
        }
        if (this.f113611b) {
            this.f113805h.mo61566a();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo61527a() {
        List list = this.f113610a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((bfgs) list.get(i)).mo61671a(this);
        }
        bfho bfho = this.f113612c;
        if (bfho != null) {
            if (!bfho.f113940d) {
                bfho.mo61705a(this.f113808k, this.f113613d);
            } else if (!this.f113616l) {
                bfdl bfdl = this.f113808k;
                Context context = this.f113613d;
                bfho.mo61705a(bfdl, context);
                AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
                long incrementAndGet = bfho.f113936i.incrementAndGet();
                StringBuilder sb = new StringBuilder(73);
                sb.append("com.google.location.lbs.collectionlib.BATCHING_ALARM.");
                sb.append(incrementAndGet);
                bfho.f113945j = sb.toString();
                bfho.f113944h = PendingIntent.getBroadcast(context, 0, new Intent(bfho.f113945j), 0);
                context.registerReceiver(bfho.f113949n, new IntentFilter(bfho.f113945j));
                bfho.m96782a(alarmManager, 2, 30000, bfho.f113944h);
                bfho.f113943g = alarmManager;
                this.f113616l = true;
            } else {
                bfho.mo61703a();
            }
        }
    }
}
