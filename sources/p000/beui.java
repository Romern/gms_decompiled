package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: beui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beui implements bfmt {

    /* renamed from: a */
    public static final bnic f112480a = bnic.m109494a("vehicle", "automobile", "mb bluetooth", "himbox", "abarth", "alfa romeo", "allroad", "aston martin", "bentley", "bmw", "bugatti", "cadillac", "chevrolet", "chevy", "chrysler", "citroen", "corvette", "daewoo", "daihatsu", "daimler", "datsun", "ferrari", "hummer", "hyundai", "infiniti", "innocenti", "maserati", "maybach", "mercedes", "mercury", "mitsubishi", "my rogue", "pontiac", "porsche", "prius", "santa fe", "ssangyong", "subaru", "suzuki", "volkswagen", "btc45", "atmobile", "rfbtaux", "deh-150", "bv7942", "deh-x6700", "avhx2700bs", "bv9973", "kdr540", "blue&me", "handsfreelink", "vauxhall", "automotive", "motorcycle", "toyota", "deh-x6600bt", "elantra", "altima");

    /* renamed from: b */
    public static final bnic f112481b = bnic.m109494a("car", "ktm", "kia", "fiat", "audi", "ford", "jeep", "coupe", "lada", "opel", "himbox", "hb01", "iveco", "dodge", "josse", "motor", "motors", "lotus", "spectre", "royce", "saab", "skoda", "tesla", "honda", "rover", "lexus", "maxima", "mazda", "dacia", "buick", "jaguar", "volvo", "vw", "nissan", "uconnect", "gmc");

    /* renamed from: e */
    private static final bnic f112482e = bnic.m109494a("chromebook", "keyboard", "headphone", "earbud", "computer", "boombox", "jambox", "bose mini soundlink", "bluebuds", "bose ae2w", "logitech adapter", "airwave", "rgb light");

    /* renamed from: f */
    private static final bnic f112483f = bnic.m109494a("watch", "home", "desk", "iphone", "buds", "ihome", "soundbar", "ipod", "ledblue");

    /* renamed from: g */
    private static final bngx f112484g = bngx.m109365a("surge", "charge hr", "zip", "flex", "up24", "one", "up2", "nexus 5", "nexus 6", "nexus 4");

    /* renamed from: c */
    public final Object f112485c = new Object();

    /* renamed from: d */
    public final Map f112486d = new HashMap();

    /* renamed from: h */
    private final bgly f112487h;

    /* renamed from: i */
    private final Object f112488i = new Object();

    /* renamed from: j */
    private final List f112489j = new ArrayList();

    /* renamed from: k */
    private final bgja f112490k;

    /* renamed from: a */
    public static beuh m95880a(bgma bgma) {
        return new beuh(bgma, true);
    }

    /* renamed from: b */
    static boolean m95883b(bfmj bfmj) {
        if (bfmj != null) {
            int f = bfmj.mo61929f();
            int e = bfmj.mo61927e();
            if (!(f == 2304 || f == 768 || f == 2048 || f == 512 || e == 1068 || e == 1096 || e == 1060 || e == 1796 || e == 1812 || e == 1804 || (f == 256 ? e != 256 : e == 1048))) {
                for (String str : Arrays.asList(bfmj.mo61923a(), bfmj.mo61924b())) {
                    if (str != null && (f112484g.contains(str.toLowerCase(Locale.US)) || m95882a(str, f112482e, f112483f))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public beui(bgly bgly, bgja bgja) {
        this.f112487h = bgly;
        this.f112490k = bgja;
    }

    /* renamed from: a */
    private final void m95881a(beuh beuh) {
        int i;
        synchronized (this.f112488i) {
            for (bfms bfms : this.f112489j) {
                boolean z = beuh.f112478b;
                if (!beuh.mo61151a()) {
                    i = beuh.mo61152b() ? 2 : 3;
                } else {
                    i = 1;
                }
                bfms.mo60973a(z, i, beuh.f112479c);
            }
        }
    }

    /* renamed from: a */
    public static boolean m95882a(String str, Iterable iterable, Set set) {
        if (str == null) {
            return false;
        }
        for (String str2 : str.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])| |_|-")) {
            if (set.contains(str2.toLowerCase(Locale.US))) {
                return true;
            }
        }
        String lowerCase = str.toLowerCase(Locale.US);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (lowerCase.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final Map mo61154a() {
        HashMap hashMap;
        synchronized (this.f112485c) {
            hashMap = new HashMap();
            for (beuh beuh : this.f112486d.values()) {
                if (beuh.mo61151a()) {
                    hashMap.put(Long.valueOf(beuh.f112479c.f114403a), beuh);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo61155a(bfmj bfmj) {
        bgja bgja = this.f112490k;
        if (bgja != null && bgja.mo62877a() != null && this.f112490k.mo62877a().size() < this.f112486d.size()) {
            HashSet hashSet = new HashSet();
            for (bgma bgma : this.f112490k.mo62877a()) {
                hashSet.add(Long.valueOf(bgma.f114403a));
            }
            ArrayList arrayList = new ArrayList();
            for (Long l : this.f112486d.keySet()) {
                if (!hashSet.contains(l) && (bfmj == null || l.longValue() != bfmj.f114403a)) {
                    arrayList.add(l);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Long l2 = (Long) arrayList.get(i);
                beuh beuh = (beuh) this.f112486d.get(l2);
                Locale locale = Locale.US;
                new Object[1][0] = beuh.f112479c.mo61923a();
                beuh beuh2 = new beuh(beuh.f112479c, false);
                this.f112486d.put(l2, beuh2);
                m95881a(beuh2);
            }
            this.f112486d.keySet().removeAll(arrayList);
        }
    }

    /* renamed from: a */
    public final void mo61156a(bfmj bfmj, int i) {
        boolean z;
        String str;
        String str2;
        char c = i != 1 ? i == 4 ? 1 : (i == 2 || i == 5) ? (char) 2 : 0 : 1;
        if (c == 1 || c == 2) {
            if (c == 1) {
                z = true;
            } else {
                z = false;
            }
            beuh beuh = new beuh(bfmj, z);
            this.f112486d.put(Long.valueOf(bfmj.f114403a), beuh);
            Locale locale = Locale.US;
            Object[] objArr = new Object[3];
            if (!z) {
                str = "disconnected";
            } else {
                str = "connected";
            }
            objArr[0] = str;
            objArr[1] = bfmj.mo61923a();
            objArr[2] = Integer.valueOf(beuh.f112477a);
            if (z && cese.f183399a.mo6606a().collectBluetoothInVehicleDeviceClassification()) {
                if (!beuh.mo61151a()) {
                    str2 = "bluetooth_device_classified_not_in_vehicle";
                } else {
                    str2 = "bluetooth_device_classified_in_vehicle";
                }
                this.f112487h.mo62998a("ar", str2, bfmj.mo61923a() + ":" + bfmj.mo61924b() + bfmj.mo61927e(), 0);
            }
            m95881a(beuh);
        }
    }

    /* renamed from: a */
    public final void mo61157a(bfms bfms) {
        synchronized (this.f112488i) {
            this.f112489j.add(bfms);
        }
    }
}
