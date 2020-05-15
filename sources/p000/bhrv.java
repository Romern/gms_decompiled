package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: bhrv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhrv {

    /* renamed from: a */
    private static final Comparator f119416a = new bhru();

    /* renamed from: b */
    private final bhwv f119417b;

    /* renamed from: c */
    private final boolean f119418c;

    /* renamed from: d */
    private final bicy f119419d;

    public bhrv(bicy bicy, bhwv bhwv, boolean z) {
        this.f119419d = bicy;
        this.f119417b = bhwv;
        this.f119418c = z;
    }

    /* renamed from: a */
    public final synchronized List mo64208a(bhun bhun, List list) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        bhwy bhwy;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        bhua bhua;
        int i;
        List list2;
        bhww[] bhwwArr;
        ArrayList arrayList7;
        int i2;
        bhun bhun2 = bhun;
        List list3 = list;
        synchronized (this) {
            try {
                List emptyList = Collections.emptyList();
                for (int i3 = 0; i3 < list.size(); i3++) {
                    bhvi bhvi = (bhvi) list3.get(i3);
                    if (i3 == 0) {
                        emptyList = bhvi.f119682a;
                    } else if (!emptyList.equals(bhvi.f119682a)) {
                        throw new IllegalArgumentException("Same batch of scoring modules scored on different candidate sets");
                    }
                }
                if (list.isEmpty()) {
                    arrayList = new ArrayList();
                } else {
                    if (list.isEmpty()) {
                        arrayList2 = new ArrayList();
                    } else {
                        int size = ((bhvi) list3.get(0)).f119682a.size();
                        ArrayList arrayList8 = new ArrayList(size);
                        for (int i4 = 0; i4 < size; i4++) {
                            arrayList8.add(new bhue());
                        }
                        int size2 = list.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            bhvi bhvi2 = (bhvi) list3.get(i5);
                            int i6 = 0;
                            while (true) {
                                i2 = i5 + 1;
                                if (i6 >= size) {
                                    break;
                                }
                                ((bhue) arrayList8.get(i6)).f119618a.mo8150a(((bhue) bhvi2.f119683b.get(i6)).f119618a);
                                i6++;
                            }
                            i5 = i2;
                        }
                        arrayList2 = arrayList8;
                    }
                    List list4 = ((bhvi) list3.get(0)).f119682a;
                    int size3 = list4.size();
                    bhwv bhwv = this.f119417b;
                    int size4 = list4.size();
                    float[] fArr = new float[size4];
                    if (size4 == 0) {
                        bhuj.m101555a().mo64360b("No candidates to score");
                        bhwy = new bhwy(bhwv.f119756a, fArr, fArr);
                        arrayList3 = arrayList2;
                    } else {
                        bhuj.m101555a();
                        String valueOf = String.valueOf(bhun2.f119644c.mo64321a());
                        if (valueOf.length() == 0) {
                            new String("Scoring with inference helper ");
                        } else {
                            "Scoring with inference helper ".concat(valueOf);
                        }
                        float[] a = bhun2.f119644c.mo64322a(bhun2, arrayList2);
                        bhwx bhwx = bhwv.f119757b;
                        int size5 = list4.size();
                        float[] a2 = bhwx.m101676a(a);
                        if (bicy.m101982a()) {
                            bhww[] bhwwArr2 = new bhww[size5];
                            for (int i7 = 0; i7 < size5; i7++) {
                                bhwwArr2[i7] = new bhww((bhsu) list4.get(i7), a[i7]);
                            }
                            if (size5 != 0) {
                                C1245ok okVar = new C1245ok();
                                ArrayList arrayList9 = new ArrayList();
                                int i8 = 0;
                                while (i8 < size5) {
                                    bhww bhww = bhwwArr2[i8];
                                    long h = bhww.f119758a.mo64234h();
                                    bvni i9 = bhww.f119758a.mo64236i();
                                    if (i9 != null) {
                                        arrayList7 = arrayList2;
                                        long j = i9.f156863a;
                                        if (j != h) {
                                            Long valueOf2 = Long.valueOf(j);
                                            if (!okVar.containsKey(valueOf2)) {
                                                okVar.put(valueOf2, new ArrayList());
                                            }
                                            ((List) okVar.get(valueOf2)).add(bhww);
                                        } else {
                                            bhuj.m101555a().mo64360b("Parent and child fprints are same.");
                                        }
                                    } else {
                                        arrayList7 = arrayList2;
                                        arrayList9.add(bhww);
                                    }
                                    i8++;
                                    arrayList2 = arrayList7;
                                }
                                arrayList3 = arrayList2;
                                int size6 = arrayList9.size();
                                for (int i10 = 0; i10 < size6; i10++) {
                                    bhwx.mo64372a((bhww) arrayList9.get(i10), okVar);
                                }
                                float[] fArr2 = new float[arrayList9.size()];
                                for (int i11 = 0; i11 < arrayList9.size(); i11++) {
                                    fArr2[i11] = ((bhww) arrayList9.get(i11)).f119759b;
                                }
                                float[] a3 = bhwx.m101676a(fArr2);
                                for (int i12 = 0; i12 < arrayList9.size(); i12++) {
                                    ((bhww) arrayList9.get(i12)).f119760c = a3[i12];
                                }
                                for (int i13 = 0; i13 < okVar.f26809h; i13++) {
                                    List list5 = (List) okVar.mo15621c(i13);
                                    float[] fArr3 = new float[list5.size()];
                                    for (int i14 = 0; i14 < list5.size(); i14++) {
                                        fArr3[i14] = ((bhww) list5.get(i14)).f119759b;
                                    }
                                    float[] a4 = bhwx.m101676a(fArr3);
                                    for (int i15 = 0; i15 < list5.size(); i15++) {
                                        ((bhww) list5.get(i15)).f119760c = a4[i15];
                                    }
                                }
                                int size7 = arrayList9.size();
                                int i16 = 0;
                                while (i16 < size7) {
                                    bhww bhww2 = (bhww) arrayList9.get(i16);
                                    bhww2.f119760c = bhwx.mo64371a(bhww2.f119758a.mo64234h(), 1.0f, bhww2.f119760c, okVar);
                                    i16++;
                                    bhwwArr2 = bhwwArr2;
                                    arrayList9 = arrayList9;
                                }
                                bhwwArr = bhwwArr2;
                            } else {
                                arrayList3 = arrayList2;
                                bhwwArr = bhwwArr2;
                            }
                            float[] fArr4 = new float[size5];
                            float[] fArr5 = new float[size5];
                            for (int i17 = 0; i17 < size5; i17++) {
                                bhww bhww3 = bhwwArr[i17];
                                fArr4[i17] = bhww3.f119760c;
                                fArr5[i17] = bhww3.f119759b;
                            }
                            bhwy = new bhwy(fArr5, a2, fArr4);
                        } else {
                            arrayList3 = arrayList2;
                            bhwy = new bhwy(a, a2, a2);
                        }
                    }
                    float[] fArr6 = bhwy.f119762a;
                    float[] fArr7 = bhwy.f119763b;
                    float[] fArr8 = bhwy.f119764c;
                    if (fArr7.length != size3) {
                        bhwp a5 = bhuj.m101555a();
                        String arrays = Arrays.toString(fArr7);
                        String valueOf3 = String.valueOf(list4);
                        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 49 + String.valueOf(valueOf3).length());
                        sb.append("Scorer returned wrong number of candidates: ");
                        sb.append(arrays);
                        sb.append(" for ");
                        sb.append(valueOf3);
                        a5.mo64362d(sb.toString());
                        arrayList4 = null;
                    } else {
                        C1245ok okVar2 = new C1245ok();
                        for (int i18 = 0; i18 < list4.size(); i18++) {
                            bhsu bhsu = (bhsu) list4.get(i18);
                            String str = bhsu.f119500c;
                            String a6 = bhsu.mo64225a();
                            if (a6 != null) {
                                if (!okVar2.containsKey(a6)) {
                                    okVar2.put(a6, new ArrayList());
                                }
                                ((List) okVar2.get(a6)).add(str);
                            }
                        }
                        ArrayList arrayList10 = new ArrayList();
                        int i19 = 0;
                        while (i19 < size3) {
                            bhsu bhsu2 = (bhsu) list4.get(i19);
                            String str2 = bhsu2.f119500c;
                            float f = fArr7[i19];
                            float f2 = fArr8[i19];
                            boolean z = bhsu2.f119498a.f156998c;
                            int i20 = size3;
                            ArrayList arrayList11 = arrayList10;
                            if (((double) f2) < ((double) ((float) cggm.f186849a.mo6606a().mo83713D()))) {
                                arrayList6 = arrayList11;
                                arrayList5 = arrayList3;
                            } else {
                                if (this.f119418c) {
                                    arrayList5 = arrayList3;
                                    bhua = new bhua((bhue) arrayList5.get(i19), fArr6[i19]);
                                } else {
                                    arrayList5 = arrayList3;
                                    bhua = null;
                                }
                                List arrayList12 = new ArrayList();
                                if (!bicy.m101982a()) {
                                    list2 = arrayList12;
                                    i = 0;
                                } else {
                                    if (okVar2.containsKey(str2)) {
                                        arrayList12 = (List) okVar2.get(str2);
                                    }
                                    list2 = arrayList12;
                                    i = bhsu2.f119498a.f157006k;
                                }
                                int a7 = bvnh.m121285a(bhsu2.f119498a.f157002g);
                                if (a7 == 0) {
                                    a7 = 1;
                                }
                                int i21 = a7 - 1;
                                arrayList6 = arrayList11;
                                arrayList6.add(new bhqh(str2, i21, bhsu2.mo64225a(), list2, i, f, f2, bhua, z));
                            }
                            i19++;
                            arrayList3 = arrayList5;
                            arrayList10 = arrayList6;
                            size3 = i20;
                        }
                        Collections.sort(arrayList10, f119416a);
                        arrayList4 = arrayList10;
                    }
                    bhuj.m101555a();
                    String valueOf4 = String.valueOf(arrayList4);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf4).length() + 30);
                    sb2.append("New Fused Inference computed: ");
                    sb2.append(valueOf4);
                    sb2.toString();
                    arrayList = arrayList4;
                }
            } catch (IllegalArgumentException e) {
                bhuj.m101555a().mo64359a("Error updating module results", e);
                return null;
            }
        }
        return arrayList;
    }
}
