package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;

/* renamed from: bfjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfjl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Calendar f114182a;

    /* renamed from: b */
    final /* synthetic */ bsax f114183b;

    /* renamed from: c */
    final /* synthetic */ bfjm f114184c;

    public bfjl(bfjm bfjm, Calendar calendar, bsax bsax) {
        this.f114184c = bfjm;
        this.f114182a = calendar;
        this.f114183b = bsax;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bsax.b(int, boolean):void
     arg types: [int, int]
     candidates:
      bsax.b(int, double):void
      bsax.b(int, float):void
      bsax.b(int, long):void
      bsax.b(int, java.lang.Object):void
      bsax.b(int, int):byte[]
      bsax.b(int, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x088f  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x08f5  */
    /* JADX WARNING: Removed duplicated region for block: B:455:? A[RETURN, SYNTHETIC] */
    public final void run() {
        bfne bfne;
        Boolean bool;
        Integer num;
        bfnl bfnl;
        bsax bsax;
        bfnl bfnl2;
        String id;
        int i;
        int i2;
        Iterator it;
        HashMap hashMap;
        bsax bsax2;
        bfjq bfjq;
        HashMap hashMap2;
        bfjm bfjm;
        int i3;
        int i4;
        bfjq bfjq2;
        int i5;
        int i6;
        ArrayList arrayList;
        Long l;
        Iterator it2;
        HashMap hashMap3;
        bsax bsax3;
        HashMap hashMap4;
        Calendar calendar;
        boolean z;
        int i7;
        int i8;
        int i9;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z2;
        bfjm bfjm2 = this.f114184c;
        Calendar calendar2 = this.f114182a;
        bsax bsax4 = this.f114183b;
        if (bsax4.mo70138j(4) != 0) {
            int i10 = 0;
            bsax f6 = bsax4.mo70131f(4, 0);
            if (f6.mo70137i(9)) {
                bsax e = f6.mo70129e(9);
                List a = bhcr.m100643a(e, 10);
                List a2 = bhcr.m100643a(e, 4);
                if (a == null) {
                    bfne = bfne.m97311a(false, Double.valueOf(0.0d));
                } else {
                    int size = a.size();
                    if (size > 3) {
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            if (i12 >= 3) {
                                i11 += ((bsax) a.get(i12)).mo70138j(2);
                            }
                        }
                        f = ((float) i11) / ((float) (size - 3));
                    } else {
                        f = 0.0f;
                    }
                    float a3 = bfji.m97019a(a, true);
                    int size2 = a.size();
                    if (size2 >= 5) {
                        long b = ((long) ((bsax) a.get(size2 - 1)).mo70114b(1)) / 2;
                        ArrayList arrayList2 = new ArrayList();
                        while (i10 < size2 && ((long) ((bsax) a.get(i10)).mo70114b(1)) <= b) {
                            arrayList2.add((bsax) a.get(i10));
                            i10++;
                        }
                        f2 = bfji.m97019a(arrayList2, true);
                    } else {
                        f2 = 360.0f;
                    }
                    int size3 = a.size();
                    if (size3 >= 5) {
                        int i13 = size3 - 1;
                        long b2 = ((long) ((bsax) a.get(i13)).mo70114b(1)) / 2;
                        ArrayList arrayList3 = new ArrayList();
                        while (i13 >= 0 && ((long) ((bsax) a.get(i13)).mo70114b(1)) > b2) {
                            arrayList3.add((bsax) a.get(i13));
                            i13--;
                        }
                        Collections.reverse(arrayList3);
                        f3 = bfji.m97019a(arrayList3, false);
                    } else {
                        f3 = 360.0f;
                    }
                    int size4 = a.size();
                    if (size4 > 3) {
                        float f7 = 0.0f;
                        float f8 = 0.0f;
                        for (int i14 = 0; i14 < size4; i14++) {
                            if (i14 >= 3) {
                                bsax bsax5 = (bsax) a.get(i14);
                                float f9 = 0.0f;
                                for (int i15 = 0; i15 < bsax5.mo70138j(2); i15++) {
                                    float d = bsax5.mo70131f(2, i15).mo70126d(2);
                                    if (d > 18.0f) {
                                        f9 += d - 0.234375f;
                                    }
                                }
                                if (f9 > 0.0f) {
                                    f8 += f9;
                                    f7 += 1.0f;
                                }
                            }
                        }
                        if (f7 != 0.0f) {
                            f4 = f8 / f7;
                        } else {
                            f4 = 0.0f;
                        }
                    } else {
                        f4 = 0.0f;
                    }
                    int size5 = a.size();
                    int i16 = 3;
                    if (size5 > 3) {
                        float f10 = 0.0f;
                        int i17 = 0;
                        int i18 = 0;
                        while (i17 < size5) {
                            if (i17 >= i16) {
                                bsax bsax6 = (bsax) a.get(i17);
                                float f11 = 0.0f;
                                for (int i19 = 0; i19 < bsax6.mo70138j(2); i19++) {
                                    bsax f12 = bsax6.mo70131f(2, i19);
                                    float d2 = f12.mo70126d(3);
                                    if (f12.mo70126d(2) > 18.0f && d2 > f11) {
                                        f11 = d2;
                                    }
                                }
                                f10 += f11;
                                i18++;
                            }
                            i17++;
                            i16 = 3;
                        }
                        f5 = f10 / ((float) i18);
                    } else {
                        f5 = 0.0f;
                    }
                    bfjh bfjh = new bfjh(f, a3, f2, f3, f4, f5);
                    double d3 = (double) bfjh.f114166a;
                    Double.isNaN(d3);
                    double d4 = (double) bfjh.f114167b;
                    Double.isNaN(d4);
                    double d5 = (d3 * -0.1323d) + 0.7071d + (d4 * -0.0256d);
                    double d6 = (double) bfjh.f114168c;
                    Double.isNaN(d6);
                    double d7 = d5 + (d6 * -0.0013d);
                    double d8 = (double) bfjh.f114169d;
                    Double.isNaN(d8);
                    double d9 = d7 + (d8 * 0.0349d);
                    double d10 = (double) bfjh.f114170e;
                    Double.isNaN(d10);
                    double d11 = (double) bfjh.f114171f;
                    Double.isNaN(d11);
                    double pow = 1.0d / (Math.pow(2.718281828459045d, -((d9 + (d10 * -0.0907d)) + (d11 * -0.009d))) + 1.0d);
                    if (pow >= 0.5d) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        pow = 1.0d - pow;
                    }
                    bfne = bfne.m97311a(Boolean.valueOf(z2), Double.valueOf(pow));
                }
                double[][] a4 = bfja.m96975a(a2);
                if (a4 == null) {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[1];
                    if (a2 != null) {
                        i9 = a2.size();
                    } else {
                        i9 = 0;
                    }
                    objArr[0] = Integer.valueOf(i9);
                    bool = null;
                } else {
                    Locale locale2 = Locale.US;
                    Object[] objArr2 = {Double.valueOf(a4[1][0]), Double.valueOf(a4[1][1]), Double.valueOf(a4[1][2])};
                    double[] dArr = a4[1];
                    bool = Boolean.valueOf(dArr[0] < 8.0E-5d && dArr[1] < 8.0E-5d && dArr[2] < 8.0E-5d);
                }
                if (e != null && e.mo70137i(8)) {
                    float f13 = 0.0f;
                    int i20 = 0;
                    float f14 = 0.0f;
                    for (int i21 = 0; i21 < e.mo70138j(8); i21++) {
                        bsax f15 = e.mo70131f(8, i21);
                        if (f15.mo70137i(8) && f15.mo70114b(8) == 0 && f15.mo70137i(16)) {
                            i20++;
                            float d12 = f15.mo70126d(16);
                            if (d12 >= f13) {
                                f14 = f13;
                                f13 = d12;
                            }
                        }
                    }
                    if (i20 >= 2) {
                        num = Integer.valueOf((int) (((f13 + f14) / 2.0f) * 10.0f));
                        Locale locale3 = Locale.US;
                        Object[] objArr3 = {bfne.f114467a, bfne.f114468b, bool, num};
                        bfnl = r9;
                        bfnl bfnl3 = new bfnl(1, bfjm2.f114186b.mo63005a(), 2, bfjm2.f114186b.mo63006b(), bgox.f117084bX, bfjm2.f114187c.mo62785e(), bfjm2);
                        bsax a5 = bfnl.mo61993a();
                        bfnl2 = bfnl;
                        int i22 = bfnl2.f114485b;
                        StringBuilder sb = new StringBuilder(32);
                        sb.append("Actual file version: ");
                        sb.append(i22);
                        sb.toString();
                        bsax = a5;
                        id = calendar2.getTimeZone().getID();
                        if (id == null) {
                            if (bsax.mo70137i(1)) {
                                i8 = 0;
                                for (int i23 = 0; i23 < bsax.mo70138j(1); i23++) {
                                    bsax f16 = bsax.mo70131f(1, i23);
                                    if (f16.mo70137i(1)) {
                                        i = 2;
                                        if (f16.mo70137i(2)) {
                                            int b3 = f16.mo70114b(2);
                                            if (id.equalsIgnoreCase(f16.mo70132f(1))) {
                                                i2 = b3;
                                                break;
                                            }
                                            i8 = Math.max(i8, b3);
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                                i = 2;
                            } else {
                                i = 2;
                                i8 = 0;
                            }
                            i2 = i8 + 1;
                            bsax bsax7 = new bsax(bgox.f117082bV);
                            bsax7.mo70118b(1, id);
                            bsax7.mo70134g(i, i2);
                            bsax.mo70107a(1, bsax7);
                            Locale locale4 = Locale.US;
                            Object[] objArr4 = new Object[i];
                            objArr4[0] = id;
                            objArr4[1] = Integer.valueOf(i2);
                        } else {
                            i = 2;
                            i2 = -1;
                        }
                        if (i2 < 0) {
                            long timeInMillis = calendar2.getTimeInMillis();
                            bsax bsax8 = new bsax(bgox.f117083bW);
                            bsax8.mo70117b(1, timeInMillis);
                            bsax8.mo70134g(i, i2);
                            Object obj = bfne.f114467a;
                            if (obj != null) {
                                if (!((Boolean) obj).booleanValue()) {
                                    bsax8.mo70119b(3, ((Boolean) bfne.f114467a).booleanValue());
                                }
                            }
                            Object obj2 = bfne.f114468b;
                            if (obj2 != null) {
                                bsax8.mo70134g(4, (int) (((Double) obj2).doubleValue() * 100.0d));
                            }
                            if (bool != null) {
                                if (bool.booleanValue()) {
                                    bsax8.mo70119b(5, true);
                                }
                            }
                            if (num != null) {
                                bsax8.mo70134g(6, num.intValue());
                            }
                            bsax8.mo70134g(7, 1);
                            int j = bsax.mo70138j(i);
                            if (j > 1000) {
                                int min = Math.min(j, 12);
                                for (int i24 = 0; i24 < min; i24++) {
                                    bsax.mo70139k(i);
                                }
                            }
                            bsax.mo70107a(i, bsax8);
                            try {
                                bfnl2.mo61994a(bsax);
                            } catch (IOException e2) {
                            }
                            bfjq bfjq3 = new bfjq((bfla) bfjy.f114242j.get(0));
                            int j2 = bsax.mo70138j(1);
                            HashMap hashMap5 = new HashMap(j2);
                            int i25 = 0;
                            while (i25 < j2) {
                                bfjq bfjq4 = bfjq3;
                                bsax bsax9 = bsax;
                                HashMap hashMap6 = hashMap5;
                                bfjm bfjm3 = bfjm2;
                                bsax f17 = bsax9.mo70131f(1, i25);
                                if (f17.mo70137i(2) && f17.mo70137i(1)) {
                                    hashMap6.put(Integer.valueOf(f17.mo70114b(2)), f17.mo70132f(1));
                                }
                                i25++;
                                bfjm2 = bfjm3;
                                hashMap5 = hashMap6;
                                bfjq3 = bfjq4;
                                i = 2;
                                bsax = bsax9;
                            }
                            Set entrySet = hashMap5.entrySet();
                            HashMap hashMap7 = new HashMap(entrySet.size());
                            Iterator it3 = entrySet.iterator();
                            while (it3.hasNext()) {
                                Map.Entry entry = (Map.Entry) it3.next();
                                Integer num2 = (Integer) entry.getKey();
                                TreeMap treeMap = new TreeMap();
                                int j3 = bsax.mo70138j(i);
                                int i26 = 0;
                                while (i26 < j3) {
                                    bfjq bfjq5 = bfjq3;
                                    Iterator it4 = it3;
                                    HashMap hashMap8 = hashMap5;
                                    bfjm bfjm4 = bfjm2;
                                    HashMap hashMap9 = hashMap7;
                                    bsax bsax10 = bsax;
                                    bsax f18 = bsax10.mo70131f(2, i26);
                                    if (f18.mo70114b(2) != num2.intValue()) {
                                        hashMap4 = hashMap8;
                                    } else {
                                        if (!f18.mo70137i(2) || !f18.mo70137i(1)) {
                                            hashMap4 = hashMap8;
                                        } else {
                                            hashMap4 = hashMap8;
                                            String str = (String) hashMap4.get(Integer.valueOf(f18.mo70114b(2)));
                                            if (str != null) {
                                                calendar = Calendar.getInstance(TimeZone.getTimeZone(str));
                                                calendar.setTimeInMillis(f18.mo70124c(1));
                                                if (calendar == null) {
                                                    if (calendar.get(7) != 7) {
                                                        if (calendar.get(7) != 1) {
                                                            bfjq bfjq6 = bfjq5;
                                                            if (bfjq6.f114199a.mo61869b(calendar)) {
                                                                long c = bfla.m97167c(calendar);
                                                                bfjq5 = bfjq6;
                                                                Long valueOf = Long.valueOf(c - ((c - bfjq6.f114199a.f114327a) % 600000));
                                                                bfjp bfjp = (bfjp) treeMap.get(valueOf);
                                                                if (!f18.mo70113a(3)) {
                                                                    z = f18.mo70113a(5);
                                                                } else {
                                                                    z = true;
                                                                }
                                                                if (bfjp == null) {
                                                                    treeMap.put(valueOf, new bfjp(z ? 1 : 0));
                                                                } else {
                                                                    if (z) {
                                                                        i7 = 1;
                                                                        bfjp.f114197a++;
                                                                    } else {
                                                                        i7 = 1;
                                                                    }
                                                                    bfjp.f114198b += i7;
                                                                }
                                                            } else {
                                                                bfjq5 = bfjq6;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        calendar = null;
                                        if (calendar == null) {
                                        }
                                    }
                                    i26++;
                                    bsax = bsax10;
                                    hashMap7 = hashMap9;
                                    hashMap5 = hashMap4;
                                    bfjm2 = bfjm4;
                                    bfjq3 = bfjq5;
                                    it3 = it4;
                                }
                                TreeMap treeMap2 = new TreeMap();
                                for (Map.Entry entry2 : treeMap.entrySet()) {
                                    bfjp bfjp2 = (bfjp) entry2.getValue();
                                    treeMap2.put((Long) entry2.getKey(), bfne.m97311a(Integer.valueOf(bfjp2.f114197a), Integer.valueOf(bfjp2.f114198b)));
                                }
                                TreeMap treeMap3 = new TreeMap();
                                for (Map.Entry entry3 : treeMap2.entrySet()) {
                                    long longValue = ((Long) entry3.getKey()).longValue();
                                    Integer num3 = (Integer) ((bfne) entry3.getValue()).f114467a;
                                    Integer num4 = (Integer) ((bfne) entry3.getValue()).f114468b;
                                    if (num3 != null && num4 != null) {
                                        long j4 = longValue;
                                        double intValue = (double) num3.intValue();
                                        long intValue2 = (long) num4.intValue();
                                        bfjn bfjn = bfjn.UNKNOWN;
                                        if (intValue2 >= 3) {
                                            double d13 = (double) intValue2;
                                            Double.isNaN(intValue);
                                            Double.isNaN(d13);
                                            float f19 = (float) (intValue / d13);
                                            if (f19 >= 0.8f) {
                                                bfjn = bfjn.INDOOR;
                                                treeMap3.put(Long.valueOf(j4), bfjn);
                                            } else {
                                                bfjn = f19 > 0.19999999f ? bfjn.MIX : bfjn.OUTDOOR;
                                            }
                                        } else {
                                            if (intValue2 > 0) {
                                                if (intValue == ((double) intValue2)) {
                                                    bfjn = bfjn.INDOOR_LOW_CONFIDENCE;
                                                } else if (intValue == 0.0d) {
                                                    bfjn = bfjn.OUTDOOR_LOW_CONFIDENCE;
                                                }
                                            }
                                            treeMap3.put(Long.valueOf(j4), bfjn);
                                        }
                                        treeMap3.put(Long.valueOf(j4), bfjn);
                                    }
                                }
                                for (long j5 = bfjq3.f114199a.f114327a; j5 < bfjq3.f114199a.f114328b; j5 += 600000) {
                                    Long valueOf2 = Long.valueOf(j5);
                                    if (!treeMap3.containsKey(valueOf2)) {
                                        treeMap3.put(valueOf2, bfjn.UNKNOWN);
                                    }
                                }
                                for (Map.Entry entry4 : treeMap3.entrySet()) {
                                    if (entry4.getValue() == bfjn.INDOOR_LOW_CONFIDENCE) {
                                        Map.Entry lowerEntry = treeMap3.lowerEntry((Long) entry4.getKey());
                                        Map.Entry higherEntry = treeMap3.higherEntry((Long) entry4.getKey());
                                        if ((lowerEntry == null || lowerEntry.getValue() == bfjn.INDOOR) && (higherEntry == null || higherEntry.getValue() == bfjn.INDOOR)) {
                                            entry4.setValue(bfjn.INDOOR);
                                        }
                                    } else if (entry4.getValue() == bfjn.OUTDOOR_LOW_CONFIDENCE) {
                                        Map.Entry lowerEntry2 = treeMap3.lowerEntry((Long) entry4.getKey());
                                        Map.Entry higherEntry2 = treeMap3.higherEntry((Long) entry4.getKey());
                                        if ((lowerEntry2 == null || lowerEntry2.getValue() == bfjn.OUTDOOR) && (higherEntry2 == null || higherEntry2.getValue() == bfjn.OUTDOOR)) {
                                            entry4.setValue(bfjn.OUTDOOR);
                                        }
                                    }
                                }
                                ArrayList arrayList4 = new ArrayList();
                                if (treeMap3.size() > 0) {
                                    long j6 = -1;
                                    long j7 = -1;
                                    bfjn bfjn2 = null;
                                    Long l2 = null;
                                    for (Map.Entry entry5 : treeMap3.entrySet()) {
                                        bfjn bfjn3 = (bfjn) entry5.getValue();
                                        if (j7 == j6) {
                                            if (bfjn3 == bfjn.INDOOR || bfjn3 == bfjn.OUTDOOR) {
                                                j7 = ((Long) entry5.getKey()).longValue();
                                                bfjn2 = (bfjn) entry5.getValue();
                                                it2 = it3;
                                                bsax3 = bsax;
                                                hashMap3 = hashMap5;
                                            } else {
                                                it2 = it3;
                                                bsax3 = bsax;
                                                hashMap3 = hashMap5;
                                            }
                                        } else if (bfjn3 != bfjn2) {
                                            bmxy.m108581a(l2);
                                            if ((l2.longValue() - j7) + 600000 >= 900000) {
                                                hashMap3 = hashMap5;
                                                long j8 = bfjq3.f114199a.f114328b;
                                                long longValue2 = l2.longValue();
                                                it2 = it3;
                                                bsax3 = bsax;
                                                arrayList4.add(new bfjo(j7, Math.min(j8, longValue2 + 600000)));
                                            } else {
                                                it2 = it3;
                                                bsax3 = bsax;
                                                hashMap3 = hashMap5;
                                            }
                                            if (bfjn3 == bfjn.INDOOR || bfjn3 == bfjn.OUTDOOR) {
                                                j7 = ((Long) entry5.getKey()).longValue();
                                                bfjn2 = (bfjn) entry5.getValue();
                                            } else {
                                                j7 = -1;
                                                bfjn2 = null;
                                            }
                                        } else {
                                            it2 = it3;
                                            bsax3 = bsax;
                                            hashMap3 = hashMap5;
                                        }
                                        bsax = bsax3;
                                        hashMap5 = hashMap3;
                                        it3 = it2;
                                        j6 = -1;
                                        l2 = (Long) entry5.getKey();
                                    }
                                    it = it3;
                                    bsax2 = bsax;
                                    hashMap = hashMap5;
                                    if (!(j7 == -1 || (l = (Long) treeMap3.lastKey()) == null || (l.longValue() - j7) + 600000 < 900000)) {
                                        arrayList4.add(new bfjo(j7, Math.min(bfjq3.f114199a.f114328b, l.longValue() + 600000)));
                                    }
                                } else {
                                    it = it3;
                                    bsax2 = bsax;
                                    hashMap = hashMap5;
                                }
                                String valueOf3 = String.valueOf((String) entry.getValue());
                                if (valueOf3.length() == 0) {
                                    new String("Final result for time zone: ");
                                } else {
                                    "Final result for time zone: ".concat(valueOf3);
                                }
                                ArrayList arrayList5 = new ArrayList();
                                arrayList5.add(bfjq3.f114199a);
                                int size6 = arrayList4.size();
                                int i27 = 0;
                                while (i27 < size6) {
                                    bfla bfla = ((bfjo) arrayList4.get(i27)).f114196a;
                                    long j9 = bfla.f114327a;
                                    bfla bfla2 = bfjq3.f114199a;
                                    if (j9 != bfla2.f114327a) {
                                        j9 += 150000;
                                    }
                                    long j10 = bfla.f114328b;
                                    if (j10 != bfla2.f114328b) {
                                        j10 -= 150000;
                                    }
                                    if (j10 > j9) {
                                        bfla bfla3 = new bfla(j9, j10);
                                        ArrayList arrayList6 = new ArrayList();
                                        int size7 = arrayList5.size();
                                        int i28 = 0;
                                        while (i28 < size7) {
                                            bfla bfla4 = (bfla) arrayList5.get(i28);
                                            long j11 = bfla3.f114328b;
                                            bfjm bfjm5 = bfjm2;
                                            HashMap hashMap10 = hashMap7;
                                            long j12 = bfla4.f114327a;
                                            if (j11 > j12) {
                                                bfjq2 = bfjq3;
                                                arrayList = arrayList5;
                                                long j13 = bfla3.f114327a;
                                                i6 = size6;
                                                i5 = i27;
                                                long j14 = bfla4.f114328b;
                                                if (j13 < j14) {
                                                    if (j13 <= j12) {
                                                        if (j14 > j11) {
                                                            arrayList6.add(new bfla(j11, j14));
                                                        }
                                                    } else if (j14 > j11) {
                                                        arrayList6.add(new bfla(j12, j13));
                                                        arrayList6.add(new bfla(bfla3.f114328b, bfla4.f114328b));
                                                    } else {
                                                        arrayList6.add(new bfla(j12, j13));
                                                    }
                                                    i28++;
                                                    arrayList5 = arrayList;
                                                    size6 = i6;
                                                    i27 = i5;
                                                    bfjm2 = bfjm5;
                                                    hashMap7 = hashMap10;
                                                    bfjq3 = bfjq2;
                                                }
                                            } else {
                                                bfjq2 = bfjq3;
                                                arrayList = arrayList5;
                                                i6 = size6;
                                                i5 = i27;
                                            }
                                            arrayList6.add(bfla4);
                                            i28++;
                                            arrayList5 = arrayList;
                                            size6 = i6;
                                            i27 = i5;
                                            bfjm2 = bfjm5;
                                            hashMap7 = hashMap10;
                                            bfjq3 = bfjq2;
                                        }
                                        bfjq = bfjq3;
                                        i4 = size6;
                                        i3 = i27;
                                        bfjm = bfjm2;
                                        hashMap2 = hashMap7;
                                        arrayList5 = arrayList6;
                                    } else {
                                        bfjq = bfjq3;
                                        i4 = size6;
                                        i3 = i27;
                                        bfjm = bfjm2;
                                        hashMap2 = hashMap7;
                                    }
                                    i27 = i3 + 1;
                                    size6 = i4;
                                    bfjm2 = bfjm;
                                    hashMap7 = hashMap2;
                                    bfjq3 = bfjq;
                                }
                                bfjq bfjq7 = bfjq3;
                                ArrayList arrayList7 = arrayList5;
                                bfjm bfjm6 = bfjm2;
                                HashMap hashMap11 = hashMap7;
                                int size8 = arrayList7.size();
                                for (int i29 = 0; i29 < size8; i29++) {
                                    ((bfla) arrayList7.get(i29)).toString();
                                }
                                hashMap11.put((String) entry.getValue(), arrayList7);
                                hashMap7 = hashMap11;
                                bsax = bsax2;
                                bfjm2 = bfjm6;
                                hashMap5 = hashMap;
                                bfjq3 = bfjq7;
                                it3 = it;
                                i = 2;
                            }
                            bfjf bfjf = bfjm2.f114188d;
                            long b4 = bfjm2.f114185a.mo62775b();
                            ArrayList arrayList8 = new ArrayList(hashMap7.size());
                            for (Map.Entry entry6 : hashMap7.entrySet()) {
                                arrayList8.add(new bfje((String) entry6.getKey(), (List) entry6.getValue()));
                            }
                            synchronized (bfjf) {
                                bfjf.f114156c = bngx.m109368a((Collection) arrayList8);
                                bfjf.f114155b = b4;
                            }
                            return;
                        }
                        return;
                    }
                }
                num = null;
                Locale locale32 = Locale.US;
                Object[] objArr32 = {bfne.f114467a, bfne.f114468b, bool, num};
                bfnl = bfnl3;
                bfnl bfnl32 = new bfnl(1, bfjm2.f114186b.mo63005a(), 2, bfjm2.f114186b.mo63006b(), bgox.f117084bX, bfjm2.f114187c.mo62785e(), bfjm2);
                try {
                    bsax a52 = bfnl.mo61993a();
                    bfnl2 = bfnl;
                    try {
                        int i222 = bfnl2.f114485b;
                        StringBuilder sb2 = new StringBuilder(32);
                        sb2.append("Actual file version: ");
                        sb2.append(i222);
                        sb2.toString();
                        bsax = a52;
                    } catch (IOException e3) {
                        bsax = new bsax(bgox.f117084bX);
                        id = calendar2.getTimeZone().getID();
                        if (id == null) {
                        }
                        if (i2 < 0) {
                        }
                    }
                } catch (IOException e4) {
                    bfnl2 = bfnl;
                    bsax = new bsax(bgox.f117084bX);
                    id = calendar2.getTimeZone().getID();
                    if (id == null) {
                    }
                    if (i2 < 0) {
                    }
                }
                id = calendar2.getTimeZone().getID();
                if (id == null) {
                }
                if (i2 < 0) {
                }
            }
        }
    }
}
