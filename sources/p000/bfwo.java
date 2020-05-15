package p000;

import android.location.Location;
import android.util.Pair;
import java.util.LinkedList;

/* renamed from: bfwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfwo {

    /* renamed from: a */
    public final LinkedList f115521a = new LinkedList();

    /* renamed from: b */
    public Pair f115522b = null;

    /* renamed from: a */
    public final boolean mo62389a(long j, long j2, long j3, int i) {
        LinkedList<Pair> linkedList = null;
        if (this.f115521a.size() != 0 && j - ((Long) ((Pair) this.f115521a.getLast()).first).longValue() < 180000) {
            LinkedList linkedList2 = new LinkedList();
            for (int size = this.f115521a.size() - 1; size >= 0; size--) {
                Pair pair = (Pair) this.f115521a.get(size);
                if (((Long) pair.first).longValue() > j || j - ((Long) pair.first).longValue() > j2) {
                    break;
                }
                if (((Location) pair.second).getAccuracy() <= 80.0f) {
                    linkedList2.add(0, pair);
                }
            }
            if (linkedList2.size() < i || ((Long) ((Pair) linkedList2.getLast()).first).longValue() - ((Long) ((Pair) linkedList2.getFirst()).first).longValue() < j3) {
                boolean z = bfxc.f115575a;
            } else {
                linkedList = linkedList2;
            }
        }
        if (linkedList == null) {
            return false;
        }
        double d = Double.POSITIVE_INFINITY;
        double d2 = Double.NEGATIVE_INFINITY;
        double d3 = Double.NaN;
        double d4 = Double.NaN;
        for (Pair pair2 : linkedList) {
            Location location = (Location) pair2.second;
            d = Math.min(d, location.getLatitude());
            d2 = Math.max(d2, location.getLatitude());
            double longitude = location.getLongitude();
            if (Double.isNaN(d3)) {
                d3 = longitude;
                d4 = d3;
            } else {
                if (d3 > d4) {
                    if (d3 > longitude) {
                        if (longitude <= d4) {
                        }
                    }
                } else if (d3 <= longitude && longitude <= d4) {
                }
                if (((d3 - longitude) + 360.0d) % 360.0d < ((longitude - d4) + 360.0d) % 360.0d) {
                    d3 = longitude;
                } else {
                    d4 = longitude;
                }
            }
        }
        float[] fArr = new float[1];
        Location.distanceBetween(d, d3, d2, d4, fArr);
        boolean z2 = bfxc.f115575a;
        if (fArr[0] >= 30.0f) {
            return false;
        }
        return true;
    }
}
