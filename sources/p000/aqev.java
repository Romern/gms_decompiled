package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.EventLog;
import android.util.Pair;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: aqev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqev {

    /* renamed from: g */
    private static final Set f85907g = new HashSet(Arrays.asList(1, 2, 3));

    /* renamed from: h */
    private static final byte[][] f85908h = {new byte[]{-16, -3, 108, 91, 65, 15, 37, -53, 37, -61, -75, 51, 70, -56, -105, 47, -82, 48, -8, -18, 116, 17, -33, -111, 4, Byte.MIN_VALUE, -83, 107, 45, 96, -37, -125}, new byte[]{61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74}, new byte[]{124, -86, -74, -26, -70, 112, 14, 13, -36, -9, 92, -54, 82, -72, -61, -79, -102, 60, 125, 35, 48, -113, 126, -79, 119, -90, 78, -78, 71, 97, -105, -67}};

    /* renamed from: a */
    public final Context f85909a;

    /* renamed from: b */
    public final aqfa f85910b;

    /* renamed from: c */
    public final aqfv f85911c;

    /* renamed from: d */
    public SparseIntArray f85912d;

    /* renamed from: e */
    public final bnic f85913e;

    /* renamed from: f */
    public int[] f85914f;

    static {
        aqev.class.getCanonicalName();
    }

    public aqev(Context context, aqfa aqfa, aqfv aqfv) {
        int length;
        this.f85909a = context;
        this.f85910b = aqfa;
        this.f85911c = aqfv;
        String a = aqfa.f85935b.mo47806a("report_event_logs");
        if (!TextUtils.isEmpty(a)) {
            String[] split = a.split(",");
            this.f85914f = new int[(split.length + 1)];
            SparseIntArray sparseIntArray = new SparseIntArray();
            this.f85912d = sparseIntArray;
            sparseIntArray.put(1397638484, 3);
            int i = 0;
            while (true) {
                length = split.length;
                if (i >= length) {
                    break;
                }
                try {
                    String[] split2 = split[i].split(":");
                    if (split2.length == 2) {
                        String str = split2[0];
                        int parseInt = Integer.parseInt(split2[1]);
                        if (parseInt == 3) {
                            this.f85914f[i] = 1397638484;
                        } else if (f85907g.contains(Integer.valueOf(parseInt))) {
                            int parseInt2 = Integer.parseInt(str);
                            this.f85914f[i] = parseInt2;
                            if (this.f85912d.get(parseInt2, -1) == -1) {
                                this.f85912d.put(parseInt2, parseInt);
                            }
                        } else {
                            this.f85914f[i] = -1;
                        }
                    } else {
                        this.f85914f[i] = -1;
                    }
                } catch (NumberFormatException e) {
                    this.f85914f[i] = -1;
                }
                i++;
            }
            this.f85914f[length] = 1397638484;
        }
        String m = cgkt.f187180a.mo6606a().mo84038m();
        if (!TextUtils.isEmpty(m)) {
            HashSet hashSet = new HashSet();
            for (String str2 : bmyx.m108640a(',').mo66918a((CharSequence) m)) {
                String trim = str2.trim();
                if (!TextUtils.isEmpty(trim) && !hashSet.contains(trim)) {
                    hashSet.add(trim);
                }
            }
            this.f85913e = bnic.m109495a((Collection) hashSet);
            return;
        }
        this.f85913e = bnon.f131923a;
    }

    /* renamed from: a */
    public static List m71456a(String[] strArr, aqef aqef) {
        aqed aqed;
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (cgkt.m145942n()) {
                aqed = aqef.mo47770a(str, true);
            } else {
                aqed = aqef.mo47770a(str, false);
            }
            if (aqed != null) {
                arrayList.add(aqed);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    static void m71457a(String str) {
        if (str != null) {
            EventLog.writeEvent(1397638484, "do-not-log-execution-checkpoint-tag", -1, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d3, code lost:
        r13 = null;
     */
    /* renamed from: b */
    static final aqeq m71459b(long j) {
        Integer num;
        boolean z;
        String str;
        HashMap hashMap = new HashMap();
        aqeq aqeq = new aqeq();
        aqeq.f85895b = new ArrayList();
        ArrayList arrayList = new ArrayList();
        try {
            int i = 524292;
            EventLog.readEvents(new int[]{524292}, arrayList);
            int size = arrayList.size();
            long j2 = -1;
            int i2 = 0;
            while (i2 < size) {
                EventLog.Event event = (EventLog.Event) arrayList.get(i2);
                long timeNanos = event.getTimeNanos();
                Object data = event.getData();
                if (timeNanos > j && event.getTag() == i && (data instanceof Object[])) {
                    Object[] objArr = (Object[]) data;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= objArr.length - 1) {
                            break;
                        }
                        Object obj = objArr[i3];
                        Object obj2 = objArr[i3 + 1];
                        if (!(obj instanceof Integer) || ((Integer) obj).intValue() != 1514) {
                            i3 += 2;
                        } else if (obj2 instanceof Integer) {
                            num = Integer.valueOf(((Integer) obj2).intValue());
                        }
                    }
                    num = null;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= objArr.length - 1) {
                            break;
                        }
                        Object obj3 = objArr[i4];
                        Object obj4 = objArr[i4 + 1];
                        if (!(obj3 instanceof Integer) || ((Integer) obj3).intValue() != 757) {
                            i4 += 2;
                        } else if (obj4 instanceof Integer) {
                            z = ((Integer) obj4).intValue() == 1513;
                        }
                    }
                    z = false;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= objArr.length - 1) {
                            break;
                        }
                        Object obj5 = objArr[i5];
                        Object obj6 = objArr[i5 + 1];
                        if (!(obj5 instanceof Integer) || ((Integer) obj5).intValue() != 1526) {
                            i5 += 2;
                        } else if (obj6 instanceof String) {
                            str = (String) obj6;
                        }
                    }
                    if (!(num == null || !z || str == null)) {
                        bxvd da = apym.f85151d.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        apym apym = (apym) da.f164949b;
                        str.getClass();
                        apym.f85153a |= 2;
                        apym.f85155c = str;
                        int intValue = num.intValue();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        apym apym2 = (apym) da.f164949b;
                        apym2.f85153a |= 1;
                        apym2.f85154b = intValue;
                        apym apym3 = (apym) da.mo74062i();
                        Integer num2 = (Integer) hashMap.get(apym3);
                        if (num2 == null) {
                            num2 = 0;
                        }
                        hashMap.put(apym3, Integer.valueOf(num2.intValue() + 1));
                    }
                }
                i2++;
                j2 = timeNanos;
                i = 524292;
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                bxvd da2 = apyl.f85146d.mo74144da();
                apym apym4 = (apym) entry.getKey();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                apyl apyl = (apyl) da2.f164949b;
                apym4.getClass();
                apyl.f85149b = apym4;
                apyl.f85148a |= 1;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                apyl apyl2 = (apyl) da2.f164949b;
                apyl2.f85148a |= 2;
                apyl2.f85150c = intValue2;
                aqeq.f85895b.add((apyl) da2.mo74062i());
            }
            aqeq.f85894a = j2;
            return aqeq;
        } catch (IOException e) {
            return aqeq;
        }
    }

    /* renamed from: a */
    public static boolean m71458a(aqed aqed) {
        byte[] bArr;
        byte[][] bArr2 = aqed.f85849c;
        if (!(bArr2 == null || bArr2.length != 1 || (bArr = bArr2[0]) == null)) {
            for (byte[] bArr3 : f85908h) {
                if (Arrays.equals(bArr, bArr3)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d9  */
    /* renamed from: a */
    public final aqer mo47802a(long j) {
        int i;
        aqer aqer = new aqer();
        aqer.f85897b = new ArrayList();
        ArrayList arrayList = new ArrayList();
        try {
            EventLog.readEvents(this.f85914f, arrayList);
            int size = arrayList.size();
            long j2 = -1;
            for (int i2 = 0; i2 < size; i2++) {
                EventLog.Event event = (EventLog.Event) arrayList.get(i2);
                j2 = event.getTimeNanos();
                if (j2 > j) {
                    bxvd da = apyn.f85156g.mo74144da();
                    int tag = event.getTag();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    apyn apyn = (apyn) da.f164949b;
                    apyn.f85158a |= 1;
                    apyn.f85159b = tag;
                    long timeNanos = event.getTimeNanos();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    apyn apyn2 = (apyn) da.f164949b;
                    apyn2.f85158a |= 4;
                    apyn2.f85161d = timeNanos;
                    int i3 = this.f85912d.get(event.getTag());
                    if (i3 != 2) {
                        if (i3 == 3) {
                            aqeu aqeu = new aqeu();
                            try {
                                Object[] objArr = (Object[]) event.getData();
                                if (objArr != null && objArr.length == 3) {
                                    Object obj = objArr[0];
                                    if (obj instanceof String) {
                                        aqeu.f85905b = (String) obj;
                                        Object obj2 = objArr[1];
                                        if (obj2 instanceof Integer) {
                                            i = ((Integer) obj2).intValue();
                                        } else {
                                            i = -1;
                                        }
                                        aqeu.f85904a = i;
                                        Object obj3 = objArr[2];
                                        if (obj3 instanceof String) {
                                            aqeu.f85906c = (String) obj3;
                                        }
                                        if (aqeu != null && !aqeu.f85905b.startsWith("do-not-log-") && (!cgkt.m145952x() || this.f85913e.contains(aqeu.f85905b))) {
                                            String str = aqeu.f85905b;
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            apyn apyn3 = (apyn) da.f164949b;
                                            str.getClass();
                                            int i4 = 2 | apyn3.f85158a;
                                            apyn3.f85158a = i4;
                                            apyn3.f85160c = str;
                                            int i5 = aqeu.f85904a;
                                            int i6 = i4 | 8;
                                            apyn3.f85158a = i6;
                                            apyn3.f85162e = i5;
                                            String str2 = aqeu.f85906c;
                                            str2.getClass();
                                            apyn3.f85158a = i6 | 16;
                                            apyn3.f85163f = str2;
                                        }
                                    }
                                }
                                aqeu = null;
                            } catch (ClassCastException e) {
                                aqeu = null;
                            }
                            String str3 = aqeu.f85905b;
                            if (da.f164950c) {
                            }
                            apyn apyn32 = (apyn) da.f164949b;
                            str3.getClass();
                            int i42 = 2 | apyn32.f85158a;
                            apyn32.f85158a = i42;
                            apyn32.f85160c = str3;
                            int i52 = aqeu.f85904a;
                            int i62 = i42 | 8;
                            apyn32.f85158a = i62;
                            apyn32.f85162e = i52;
                            String str22 = aqeu.f85906c;
                            str22.getClass();
                            apyn32.f85158a = i62 | 16;
                            apyn32.f85163f = str22;
                        }
                    } else if (event.getData() instanceof Integer) {
                        int intValue = ((Integer) event.getData()).intValue();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        apyn apyn4 = (apyn) da.f164949b;
                        apyn4.f85158a |= 8;
                        apyn4.f85162e = intValue;
                    }
                    aqer.f85897b.add((apyn) da.mo74062i());
                }
            }
            aqer.f85896a = j2;
            return aqer;
        } catch (IOException e2) {
            return aqer;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo47803a(List list) {
        aqef aqef = new aqef(this.f85909a, this.f85910b);
        PackageManager packageManager = this.f85909a.getPackageManager();
        bndu r = bndu.m109109r();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            apyl apyl = (apyl) list.get(i);
            apym apym = apyl.f85149b;
            if (apym == null) {
                apym = apym.f85151d;
            }
            Integer valueOf = Integer.valueOf(apym.f85154b);
            apym apym2 = apyl.f85149b;
            if (apym2 == null) {
                apym2 = apym.f85151d;
            }
            r.mo67268a(valueOf, Pair.create(apym2.f85155c, Integer.valueOf(apyl.f85150c)));
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : r.mo67318q().entrySet()) {
            String[] packagesForUid = packageManager.getPackagesForUid(((Integer) entry.getKey()).intValue());
            if (packagesForUid != null) {
                List a = m71456a(packagesForUid, aqef);
                if (!a.isEmpty() && !m71460b(a)) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Pair pair : (Collection) entry.getValue()) {
                        arrayList2.add(new aqeg((String) pair.first, ((Integer) pair.second).intValue()));
                    }
                    aqep aqep = new aqep();
                    aqep.f85892a = a;
                    aqep.f85893b = arrayList2;
                    arrayList.add(aqep);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static boolean m71460b(List list) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (m71458a((aqed) list.get(i))) {
                return true;
            }
            i = i2;
        }
        return false;
    }
}
