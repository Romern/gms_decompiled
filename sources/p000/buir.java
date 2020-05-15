package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: buir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buir {

    /* renamed from: a */
    static final Comparator f153967a = new buin();

    /* renamed from: b */
    private static final buip f153968b = new buip(Float.NEGATIVE_INFINITY, -1.0f, new HashSet());

    /* renamed from: a */
    static float m119574a(List list, float f) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        } else if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException();
        } else if (f != 1.0f) {
            return ((buje) list.get((int) (((float) list.size()) * f))).f154012e;
        } else {
            return ((buje) list.get(list.size() - 1)).f154012e;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    /* renamed from: a */
    public static buip m119575a(Set set, cewk cewk) {
        if (!cewk.elevationLocalizerUseWeightedLikelihoods()) {
            if (!set.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    buje buje = (buje) it.next();
                    if (buje.mo72719a() && buje.f154013f >= ((float) cewk.elevationFromWifiMinRssiDbm())) {
                        arrayList.add(buje);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Collections.sort(arrayList, f153967a);
                    if (((double) (m119574a(arrayList, 0.75f) - m119574a(arrayList, 0.25f))) <= cewk.elevationFromWifiOutlierThresholdM()) {
                        float a = m119574a(arrayList, 0.5f);
                        float max = Math.max(2.0f, m119574a(arrayList, 0.8f) - m119574a(arrayList, 0.2f));
                        if (((double) max) < cewk.elevationMaxVerticalAccuracyMeters()) {
                            return new buip(a + ((float) cewk.elevationDeltaPhoneFromFloorM()), max, arrayList);
                        }
                    }
                }
            }
            return f153968b;
        } else if (set.isEmpty()) {
            return f153968b;
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                buje buje2 = (buje) it2.next();
                if (buje2.mo72719a()) {
                    arrayList2.add(buje2);
                }
            }
            if (arrayList2.isEmpty()) {
                return f153968b;
            }
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList2.size();
            double d = Double.POSITIVE_INFINITY;
            double d2 = Double.NEGATIVE_INFINITY;
            int i = 0;
            while (i < size) {
                buje buje3 = (buje) arrayList2.get(i);
                float f = buje3.f154012e;
                double max2 = (double) Math.max(1.0f, buje3.f154013f + 105.0f);
                double elevationApNormalDistributionSigmaMultiplier = cewk.elevationApNormalDistributionSigmaMultiplier() / Math.pow(max2, cewk.elevationApNormalDistributionSigmaExponent());
                double d3 = d2;
                int i2 = i;
                Double.isNaN(max2);
                buiq buiq = new buiq((double) f, elevationApNormalDistributionSigmaMultiplier, max2 / (cewk.elevationApNormalDistributionWeightDivisor() * Math.pow(elevationApNormalDistributionSigmaMultiplier, cewk.elevationApNormalDistributionWeightExponent())));
                arrayList3.add(buiq);
                d2 = buiq.f153964a;
                if (d2 < d) {
                    d = d2;
                }
                if (d2 <= d3) {
                    d2 = d3;
                }
                i = i2 + 1;
            }
            double d4 = 0.0d;
            buio buio = new buio(0.0d, -1.0d);
            ArrayList arrayList4 = new ArrayList();
            double d5 = d - 0.4375d;
            double d6 = d2 + 10.0d;
            double d7 = 0.0d;
            while (d5 <= d6) {
                int size2 = arrayList3.size();
                int i3 = 0;
                while (i3 < size2) {
                    buiq buiq2 = (buiq) arrayList3.get(i3);
                    d4 += (buiq2.f153966c / (buiq2.f153965b * Math.sqrt(6.283185307179586d))) * Math.exp(Math.pow((d5 - buiq2.f153964a) / buiq2.f153965b, 2.0d) * -0.5d);
                    i3++;
                    arrayList3 = arrayList3;
                    d6 = d6;
                    arrayList2 = arrayList2;
                }
                ArrayList arrayList5 = arrayList2;
                ArrayList arrayList6 = arrayList3;
                double d8 = d6;
                buio buio2 = new buio(d5, d4);
                arrayList4.add(buio2);
                d7 += d4;
                if (buio2.f153960b > buio.f153960b) {
                    buio = buio2;
                }
                d5 += 0.25d;
                arrayList3 = arrayList6;
                d6 = d8;
                arrayList2 = arrayList5;
                d4 = 0.0d;
            }
            ArrayList arrayList7 = arrayList2;
            int indexOf = arrayList4.indexOf(buio);
            if (indexOf != -1) {
                double d9 = buio.f153960b;
                double d10 = d7 * 0.68d;
                int i4 = 1;
                buio buio3 = buio;
                buio buio4 = buio3;
                while (d9 < d10) {
                    ArrayList arrayList8 = arrayList7;
                    int i5 = indexOf + i4;
                    if (i5 < arrayList4.size()) {
                        buio3 = (buio) arrayList4.get(i5);
                        d9 += buio3.f153960b;
                    }
                    int i6 = indexOf - i4;
                    if (i6 >= 0) {
                        buio4 = (buio) arrayList4.get(i6);
                        d9 += buio4.f153960b;
                    }
                    i4++;
                    arrayList7 = arrayList8;
                }
                return new buip((float) (buio.f153959a + cewk.elevationDeltaPhoneFromFloorM()), (float) Math.max(2.0d, (buio3.f153959a - buio4.f153959a) / 2.0d), arrayList7);
            }
            throw new IllegalArgumentException("Couldn't find the most likely hypothesis within the list.");
        }
    }
}
