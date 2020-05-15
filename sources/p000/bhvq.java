package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: bhvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhvq implements bhul {

    /* renamed from: a */
    private static final Comparator f119696a = Collections.reverseOrder(new bhvo());

    /* renamed from: b */
    private final bhul f119697b;

    /* renamed from: c */
    private final bhul f119698c;

    /* renamed from: d */
    private final boolean f119699d;

    /* renamed from: e */
    private final int f119700e;

    public bhvq(bhul bhul, bhul bhul2, boolean z, int i) {
        this.f119697b = bhul;
        this.f119698c = bhul2;
        this.f119699d = z;
        this.f119700e = i;
    }

    /* renamed from: a */
    public final String mo64321a() {
        return String.format("TwoPass[%s,%s]", this.f119697b.mo64321a(), this.f119698c.mo64321a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0120 A[RETURN] */
    /* renamed from: a */
    public final float[] mo64322a(bhun bhun, List list) {
        bhvp bhvp;
        float[] fArr;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            bhuj.m101555a().mo64360b("No candidates to score");
            return new float[0];
        } else if (!this.f119699d && size <= this.f119700e) {
            return this.f119698c.mo64322a(bhun, list);
        } else {
            int min = Math.min(this.f119700e, size);
            int size2 = list.size();
            boolean[] zArr = new boolean[size2];
            ArrayList arrayList = new ArrayList();
            float[] a = this.f119697b.mo64322a(bhun, list);
            PriorityQueue priorityQueue = new PriorityQueue(list.size(), f119696a);
            if (a.length == list.size()) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    priorityQueue.add(new bhvn(a[i2], i2));
                }
                int i3 = 0;
                while (true) {
                    if (i3 < min) {
                        int i4 = ((bhvn) priorityQueue.poll()).f119691b;
                        if (i4 >= size2) {
                            bhuj.m101555a().mo64362d("Invalid first pass inference helper candidate index.");
                            bhvp = new bhvp(zArr, arrayList, list.size(), a);
                            break;
                        }
                        zArr[i4] = true;
                        i3++;
                    } else {
                        for (int i5 = 0; i5 < list.size(); i5++) {
                            if (zArr[i5]) {
                                arrayList.add((bhue) list.get(i5));
                            }
                        }
                        bhvp = new bhvp(zArr, arrayList, list.size(), a);
                    }
                }
            } else {
                bhuj.m101555a().mo64362d("Invalid first pass inference helper result.");
                bhvp = new bhvp(zArr, arrayList, list.size(), new float[list.size()]);
            }
            int i6 = bhvp.f119694c;
            if (i6 == bhvp.f119692a.length) {
                fArr = bhvp.f119695d;
                if (i6 == fArr.length) {
                    float[] a2 = this.f119698c.mo64322a(bhun, bhvp.f119693b);
                    int i7 = 0;
                    while (true) {
                        if (i >= bhvp.f119694c) {
                            break;
                        }
                        if (bhvp.f119692a[i]) {
                            if (i7 >= a2.length) {
                                bhuj.m101555a().mo64362d("Second pass and first pass scoring results don't match.");
                                break;
                            }
                            if (this.f119699d) {
                                fArr[i] = fArr[i] + bhxi.m101704a(a2[i7]);
                            } else {
                                fArr[i] = a2[i7];
                            }
                            i7++;
                        } else if (!this.f119699d) {
                            fArr[i] = -3.4028235E38f;
                        }
                        i++;
                    }
                    if (fArr.length != size) {
                        return fArr;
                    }
                    bhuj.m101555a().mo64362d("Invalid number of 2-pass scoring output");
                    return new float[size];
                }
            }
            bhuj.m101555a().mo64362d("Invalid first pass scoring result.");
            fArr = new float[bhvp.f119694c];
            if (fArr.length != size) {
            }
        }
    }
}
