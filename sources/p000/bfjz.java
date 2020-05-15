package p000;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Random;

/* renamed from: bfjz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfjz {

    /* renamed from: a */
    public final bfla f114253a;

    /* renamed from: b */
    public final bngx f114254b;

    /* renamed from: c */
    public final int f114255c;

    /* renamed from: d */
    private final long f114256d;

    public bfjz(bfla bfla, bngx bngx, int i, Calendar calendar, long j) {
        long j2;
        long j3;
        bfla bfla2;
        this.f114253a = bfla;
        this.f114256d = j;
        ArrayList arrayList = new ArrayList();
        if (bngx != null) {
            bnre i2 = bngx.listIterator();
            bfla bfla3 = null;
            while (i2.hasNext()) {
                bfla bfla4 = (bfla) i2.next();
                long max = Math.max(bfla4.f114327a, bfla.f114327a);
                long min = Math.min(bfla4.f114328b, bfla.f114328b);
                if (min > max) {
                    bfla2 = new bfla(max, min);
                } else {
                    bfla2 = null;
                }
                if (!(bfla2 == null || bfla3 == null)) {
                    long j4 = bfla2.f114327a;
                    long j5 = bfla3.f114328b;
                    if (j4 < j5) {
                        long j6 = bfla2.f114328b;
                        bfla2 = j5 < j6 ? new bfla(j5, j6) : null;
                    }
                }
                if (bfla2 != null) {
                    arrayList.add(bfla2);
                    bfla3 = bfla2;
                }
            }
        }
        if (arrayList.size() == 0) {
            arrayList.add(bfla);
        }
        bngx a = bngx.m109368a((Collection) arrayList);
        if (a.size() == 1 && ((bfla) a.get(0)).equals(bfla)) {
            i = 1;
        }
        this.f114255c = i;
        int size = a.size();
        long j7 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            j7 += ((bfla) a.get(i3)).mo61866a();
        }
        Calendar calendar2 = (Calendar) calendar.clone();
        bfla.m97164a(calendar2, this.f114253a.f114327a);
        double nextDouble = new Random(this.f114256d ^ calendar2.getTimeInMillis()).nextDouble();
        long j8 = this.f114253a.f114327a;
        double d = (double) (j7 / 2);
        Double.isNaN(d);
        long j9 = (long) (nextDouble * d);
        int size2 = a.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                j2 = Long.MAX_VALUE;
                break;
            }
            bfla bfla5 = (bfla) a.get(i4);
            if (j8 > bfla5.f114327a) {
                long j10 = bfla5.f114328b;
                if (j8 < j10) {
                    j3 = j10 - j8;
                } else {
                    j3 = 0;
                }
            } else {
                j3 = bfla5.mo61866a();
            }
            if (j3 > j9) {
                j2 = Math.max(bfla5.f114327a, j8) + j9;
                break;
            } else {
                j9 -= j3;
                i4++;
            }
        }
        ArrayList arrayList2 = new ArrayList(a.size());
        int size3 = a.size();
        for (int i5 = 0; i5 < size3; i5++) {
            bfla bfla6 = (bfla) a.get(i5);
            if (bfla6.f114328b > j2) {
                if (bfla6.mo61867a(j2)) {
                    arrayList2.add(new bfla(j2, bfla6.f114328b));
                } else {
                    arrayList2.add(bfla6);
                }
            }
        }
        this.f114254b = bngx.m109368a((Collection) arrayList2);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f114253a);
        String valueOf2 = String.valueOf(this.f114254b);
        String str = this.f114255c != 1 ? "REFINED_BY_IN_OUTDOOR" : "FULL";
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 75 + String.valueOf(valueOf2).length() + str.length());
        sb.append("SensorCollectionTimeSpan [targetTimeSpan=");
        sb.append(valueOf);
        sb.append(", subTimeSpans=");
        sb.append(valueOf2);
        sb.append(", subTimeSpanType=");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
