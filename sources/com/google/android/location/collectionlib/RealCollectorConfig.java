package com.google.android.location.collectionlib;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.location.collectionlib.utils.ParcelableSensorScannerConfig;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class RealCollectorConfig implements Parcelable, bfek {
    public static final Parcelable.Creator CREATOR = new bfgh();

    /* renamed from: a */
    public static final Map f150689a = new HashMap();

    /* renamed from: b */
    public static final Map f150690b = new HashMap();

    /* renamed from: c */
    public final Set f150691c;

    /* renamed from: d */
    public final String f150692d;

    /* renamed from: e */
    final String f150693e;

    /* renamed from: f */
    final Map f150694f;

    /* renamed from: g */
    public boolean f150695g;

    /* renamed from: h */
    public volatile boolean f150696h;

    /* renamed from: i */
    public final int f150697i;

    /* renamed from: j */
    private final byte[] f150698j;

    /* renamed from: k */
    private final long f150699k;

    /* renamed from: l */
    private final long f150700l;

    /* renamed from: m */
    private final long f150701m;

    /* renamed from: n */
    private final boolean f150702n;

    /* renamed from: o */
    private final boolean f150703o;

    /* renamed from: p */
    private final ParcelableSensorScannerConfig f150704p;

    /* renamed from: q */
    private final int f150705q;

    /* renamed from: r */
    private final int f150706r;

    /* renamed from: s */
    private int f150707s;

    /* renamed from: t */
    private String f150708t;

    /* renamed from: u */
    private final boolean f150709u;

    /* renamed from: v */
    private bgmj f150710v;

    static {
        f150689a.put(bfgt.f113813c, 3);
        f150689a.put(bfgt.f113814d, 1);
        f150689a.put(bfgt.f113815e, 4);
        f150689a.put(bfgt.f113816f, 2);
        f150689a.put(bfgt.f113819i, 6);
        int i = Build.VERSION.SDK_INT;
        f150689a.put(bfgt.f113820j, 14);
        int i2 = Build.VERSION.SDK_INT;
        f150689a.put(bfgt.f113825o, 19);
        int i3 = Build.VERSION.SDK_INT;
        f150689a.put(bfgt.f113824n, 21);
        f150689a.put(bfgt.f113821k, 5);
        f150689a.put(bfgt.f113822l, 8);
        f150689a.put(bfgt.f113831u, 65541);
        for (Map.Entry entry : f150689a.entrySet()) {
            f150690b.put((Integer) entry.getValue(), (bfgt) entry.getKey());
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x015c  */
    public RealCollectorConfig(Parcel parcel) {
        boolean z;
        Bundle readBundle;
        int readInt;
        char c;
        int i = 2;
        this.f150707s = 2;
        this.f150694f = Collections.synchronizedMap(new HashMap());
        boolean z2 = false;
        this.f150695g = false;
        this.f150696h = false;
        this.f150691c = bfgt.m96706a(parcel.readInt());
        String readString = parcel.readString();
        if (readString != null) {
            switch (readString.hashCode()) {
                case -2024427263:
                    if (readString.equals("MEMORY")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1973849472:
                    if (readString.equals("MEMORY_SENSOR_EVENTS")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1881281466:
                    if (readString.equals("REMOTE")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -603675139:
                    if (readString.equals("LOCAL_AND_MEMORY")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 72607563:
                    if (readString.equals("LOCAL")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1595802704:
                    if (readString.equals("LOCAL_AND_TEMP_MEMORY")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c == 2) {
                        i = 3;
                    } else if (c == 3) {
                        i = 4;
                    } else if (c == 4) {
                        i = 5;
                    } else if (c == 5) {
                        i = 6;
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                this.f150697i = i;
                this.f150692d = parcel.readString();
                if (parcel.readInt() != 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.f150702n = z;
                this.f150699k = parcel.readLong();
                this.f150700l = parcel.readLong();
                long readLong = parcel.readLong();
                ParcelableSensorScannerConfig parcelableSensorScannerConfig = (ParcelableSensorScannerConfig) parcel.readParcelable(null);
                this.f150704p = parcelableSensorScannerConfig;
                this.f150701m = parcelableSensorScannerConfig != null ? 0 : readLong;
                this.f150707s = parcel.readInt();
                readBundle = parcel.readBundle();
                Map map = this.f150694f;
                if (readBundle != null) {
                    for (String str : readBundle.keySet()) {
                        try {
                            int parseInt = Integer.parseInt(str);
                            bfgt bfgt = null;
                            int i2 = 0;
                            for (bfgt bfgt2 : bfgt.f113809C) {
                                if ((bfgt2.f113836x & parseInt) != 0) {
                                    i2++;
                                    bfgt = bfgt2;
                                }
                            }
                            if (i2 != 1) {
                                bfgt = null;
                            }
                            if (bfgt != null) {
                                map.put(bfgt, Integer.valueOf(readBundle.getInt(str)));
                            }
                        } catch (NumberFormatException e) {
                        }
                    }
                }
                this.f150708t = parcel.readString();
                this.f150693e = parcel.readString();
                readInt = parcel.readInt();
                if (readInt <= 0) {
                    byte[] bArr = new byte[readInt];
                    this.f150698j = bArr;
                    parcel.readByteArray(bArr);
                } else {
                    this.f150698j = null;
                }
                this.f150695g = parcel.readInt() == 0;
                this.f150709u = parcel.readInt() == 0;
                this.f150696h = parcel.readInt() == 0;
                parcel.readParcelable(null);
                this.f150703o = parcel.readInt() != 0 ? true : z2;
                this.f150706r = parcel.readInt();
                this.f150705q = parcel.readInt();
            }
        }
        i = 1;
        this.f150697i = i;
        this.f150692d = parcel.readString();
        if (parcel.readInt() != 1) {
        }
        this.f150702n = z;
        this.f150699k = parcel.readLong();
        this.f150700l = parcel.readLong();
        long readLong2 = parcel.readLong();
        ParcelableSensorScannerConfig parcelableSensorScannerConfig2 = (ParcelableSensorScannerConfig) parcel.readParcelable(null);
        this.f150704p = parcelableSensorScannerConfig2;
        this.f150701m = parcelableSensorScannerConfig2 != null ? 0 : readLong2;
        this.f150707s = parcel.readInt();
        readBundle = parcel.readBundle();
        Map map2 = this.f150694f;
        if (readBundle != null) {
        }
        this.f150708t = parcel.readString();
        this.f150693e = parcel.readString();
        readInt = parcel.readInt();
        if (readInt <= 0) {
        }
        this.f150695g = parcel.readInt() == 0;
        this.f150709u = parcel.readInt() == 0;
        this.f150696h = parcel.readInt() == 0;
        parcel.readParcelable(null);
        this.f150703o = parcel.readInt() != 0 ? true : z2;
        this.f150706r = parcel.readInt();
        this.f150705q = parcel.readInt();
    }

    /* renamed from: a */
    public final int mo61536a(bfgt bfgt) {
        Integer num = (Integer) this.f150694f.get(bfgt);
        if (num == null) {
            return this.f150707s;
        }
        return num.intValue();
    }

    /* renamed from: a */
    public final bgmj mo61537a() {
        return this.f150710v;
    }

    /* renamed from: b */
    public final String mo61538b() {
        return this.f150708t;
    }

    /* renamed from: c */
    public final Set mo61539c() {
        return this.f150691c;
    }

    /* renamed from: d */
    public final String mo61540d() {
        return this.f150692d;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final long mo61541e() {
        return this.f150699k;
    }

    /* renamed from: f */
    public final long mo61542f() {
        return this.f150700l;
    }

    /* renamed from: g */
    public final long mo61543g() {
        return this.f150701m;
    }

    /* renamed from: h */
    public final boolean mo61544h() {
        return this.f150702n;
    }

    /* renamed from: i */
    public final bfgy mo61545i() {
        ParcelableSensorScannerConfig parcelableSensorScannerConfig = this.f150704p;
        if (parcelableSensorScannerConfig != null) {
            return parcelableSensorScannerConfig.f150711a;
        }
        return null;
    }

    /* renamed from: j */
    public final byte[] mo61546j() {
        return this.f150698j;
    }

    /* renamed from: k */
    public final boolean mo61547k() {
        return this.f150695g;
    }

    /* renamed from: l */
    public final boolean mo61548l() {
        return this.f150709u;
    }

    /* renamed from: m */
    public final bfek mo61549m() {
        String str = this.f150693e;
        if (str == null) {
            return this;
        }
        Set set = this.f150691c;
        boolean z = this.f150702n;
        long j = this.f150699k;
        long j2 = this.f150700l;
        long j3 = this.f150701m;
        ParcelableSensorScannerConfig parcelableSensorScannerConfig = this.f150704p;
        int i = this.f150697i;
        String str2 = this.f150692d;
        File file = new File(str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[128];
        while (true) {
            String str3 = str2;
            int read = fileInputStream.read(bArr);
            FileInputStream fileInputStream2 = fileInputStream;
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
                fileInputStream = fileInputStream2;
                str2 = str3;
            } else {
                RealCollectorConfig realCollectorConfig = new RealCollectorConfig(set, z, j, j2, j3, parcelableSensorScannerConfig, i, str3, byteArrayOutputStream.toByteArray(), this.f150709u, this.f150710v, this.f150703o, this.f150706r, this.f150705q);
                realCollectorConfig.f150707s = this.f150707s;
                realCollectorConfig.f150694f.putAll(this.f150694f);
                realCollectorConfig.f150708t = this.f150708t;
                realCollectorConfig.f150695g = this.f150695g;
                realCollectorConfig.f150696h = this.f150696h;
                return realCollectorConfig;
            }
        }
    }

    /* renamed from: n */
    public final Map mo61550n() {
        HashMap hashMap = new HashMap();
        for (bfgt bfgt : this.f150691c) {
            if (f150689a.containsKey(bfgt)) {
                Integer num = (Integer) f150689a.get(bfgt);
                Integer num2 = (Integer) this.f150694f.get(bfgt);
                hashMap.put(num, Integer.valueOf(num2 != null ? num2.intValue() : this.f150707s));
            }
        }
        return hashMap;
    }

    /* renamed from: o */
    public final boolean mo61551o() {
        return this.f150696h;
    }

    /* renamed from: p */
    public final boolean mo61552p() {
        return this.f150703o;
    }

    /* renamed from: q */
    public final int mo61553q() {
        return this.f150705q;
    }

    /* renamed from: r */
    public final int mo61554r() {
        return this.f150706r;
    }

    /* renamed from: s */
    public final int mo61555s() {
        return this.f150697i;
    }

    public final String toString() {
        return String.format(Locale.US, "Scanner types: %s; Dest: %s; WifiDelay: %d; GpsDelay: %d, ScanDuration: %d, SensorConfig: %s, SensorDelay: %s; Data path: %s; Key path: %s; View opted out WIFI APs: %s; AutomaticShutDown: %s; ForceUpload: %s; Batching Sensor Allowed: %s; Batch scan duration %s.", this.f150691c, bfej.m96500a(this.f150697i), Long.valueOf(this.f150699k), Long.valueOf(this.f150700l), Long.valueOf(this.f150701m), this.f150704p, mo61550n(), this.f150692d, this.f150693e, Boolean.valueOf(this.f150695g), Boolean.valueOf(this.f150709u), Boolean.valueOf(this.f150696h), Boolean.valueOf(this.f150703o), Long.valueOf(this.f150701m));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(bfgt.m96705a(this.f150691c));
        int i3 = this.f150697i;
        String a = bfej.m96500a(i3);
        if (i3 != 0) {
            parcel.writeString(a);
            parcel.writeString(this.f150692d);
            parcel.writeInt(this.f150702n ? 1 : 0);
            parcel.writeLong(this.f150699k);
            parcel.writeLong(this.f150700l);
            parcel.writeLong(this.f150701m);
            parcel.writeParcelable(this.f150704p, i);
            parcel.writeInt(this.f150707s);
            Map map = this.f150694f;
            Bundle bundle = new Bundle();
            for (Map.Entry entry : map.entrySet()) {
                bundle.putInt(String.valueOf(((bfgt) entry.getKey()).f113836x), ((Integer) entry.getValue()).intValue());
            }
            parcel.writeBundle(bundle);
            parcel.writeString(this.f150708t);
            parcel.writeString(this.f150693e);
            byte[] bArr = this.f150698j;
            if (bArr != null) {
                i2 = bArr.length;
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            if (i2 > 0) {
                parcel.writeByteArray(this.f150698j);
            }
            parcel.writeInt(this.f150695g ? 1 : 0);
            parcel.writeInt(this.f150709u ? 1 : 0);
            parcel.writeInt(this.f150696h ? 1 : 0);
            parcel.writeParcelable(null, i);
            parcel.writeInt(this.f150703o ? 1 : 0);
            parcel.writeInt(this.f150706r);
            parcel.writeInt(this.f150705q);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo70860a(bfgt bfgt, int i) {
        this.f150694f.put(bfgt, Integer.valueOf(i));
    }

    public RealCollectorConfig(Set set, boolean z, long j, long j2, long j3, ParcelableSensorScannerConfig parcelableSensorScannerConfig, int i, String str, byte[] bArr, boolean z2, bgmj bgmj, boolean z3, int i2, int i3) {
        boolean z4;
        long j4;
        boolean z5;
        boolean z6;
        Set set2 = set;
        long j5 = j;
        long j6 = j2;
        ParcelableSensorScannerConfig parcelableSensorScannerConfig2 = parcelableSensorScannerConfig;
        int i4 = i;
        String str2 = str;
        byte[] bArr2 = bArr;
        int i5 = i2;
        int i6 = i3;
        this.f150707s = 2;
        this.f150694f = Collections.synchronizedMap(new HashMap());
        this.f150695g = false;
        this.f150696h = false;
        bmxy.m108589a(j5 >= 0, "delayBetweenWifiScansMills cannot be negative");
        if (j6 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        bmxy.m108589a(z4, "delayBetweenGpsScansMills cannot be negative");
        if (parcelableSensorScannerConfig2 != null) {
            this.f150702n = false;
            j4 = 0;
        } else {
            this.f150702n = z;
            j4 = j3;
        }
        if (i4 == 2) {
            bmxy.m108582a(str2, "dataPath could not be null if you want to write data to local storage");
        }
        if (i4 != 1) {
            bmxy.m108589a(j4 >= 0, "Scan duration should be >= 0");
        } else {
            bmxy.m108589a((parcelableSensorScannerConfig2 != null ? parcelableSensorScannerConfig2.f150711a.f113853c : j4) >= 0, "Invalid scan duration for MEMORY collection destination.");
        }
        if (i4 == 4) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!((bfgt) it.next()).f113837y) {
                    throw new IllegalArgumentException("Scanner types can't include non-sensor type when destination is ScannerType.MEMORY_SENSOR_EVENTS");
                }
            }
        }
        if (!bfib.m96840a(str)) {
            bmxy.m108589a(!bfib.m96840a(null) ? true : bArr2 != null && bArr2.length == 32, "You must specify a valid key for encryption when writing data to persistent storage.");
            if (bArr2 == null) {
                bmxy.m108581a((Object) null);
                File file = new File((String) null);
                try {
                    bmxy.m108601b(file.getCanonicalPath().startsWith("/data/"), "The key should be in the /data/ partition.");
                    if (!file.isFile() || !file.exists()) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    z5 = false;
                    bmxy.m108601b(z6, String.format(Locale.US, "%s does not exist.", null));
                } catch (IOException e) {
                    throw new IllegalArgumentException("Unable to parse the key path.");
                }
            } else {
                z5 = false;
            }
        } else {
            z5 = false;
        }
        bmxy.m108588a(!set2.contains(bfgt.f113823m) || !set2.contains(bfgt.f113832v));
        if (set2.contains(bfgt.f113832v)) {
            bmxy.m108588a(i6 >= 0);
            bmxy.m108588a(i5 >= 0);
            bmxy.m108588a(i6 >= i5 ? true : z5);
        }
        this.f150693e = null;
        this.f150698j = bArr2;
        this.f150691c = set2;
        this.f150699k = j5;
        this.f150700l = j6;
        this.f150701m = j4;
        this.f150704p = parcelableSensorScannerConfig2;
        this.f150697i = i;
        this.f150692d = str;
        this.f150709u = z2;
        this.f150710v = bgmj;
        this.f150703o = z3;
        this.f150706r = i5;
        this.f150705q = i6;
    }
}
