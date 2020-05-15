package p000;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: ssq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ssq {

    /* renamed from: a */
    public long f45098a = SystemClock.elapsedRealtime();

    /* renamed from: b */
    public final C1245ok f45099b = new C1245ok();

    /* renamed from: c */
    public ssp f45100c = null;

    /* renamed from: b */
    public final void mo26057b(Object obj, long j) {
        ssp ssp = (ssp) this.f45099b.get(obj);
        if (ssp == null) {
            ssp = this.f45100c;
        }
        if (ssp == null) {
            Log.e("PeriodStatsTracker", "Couldn't find package statistics when removing location request.");
        } else if (ssp.f45089a <= 0) {
            Log.e("PeriodStatsTracker", "Reference counting corrupted in usage statistics.");
        } else {
            ssp.mo26051c();
            int i = 0;
            while (true) {
                int i2 = ssp.f45089a;
                if (i >= i2) {
                    break;
                }
                long[] jArr = ssp.f45092d;
                if (j == jArr[i] && i < i2 - 1) {
                    System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
                    break;
                }
                i++;
            }
            ssp.f45089a--;
        }
    }

    public final String toString() {
        return mo26055a(null);
    }

    /* renamed from: a */
    public final long mo26054a() {
        return SystemClock.elapsedRealtime() - this.f45098a;
    }

    /* renamed from: a */
    public final String mo26055a(bfqc bfqc) {
        int i = this.f45099b.f26809h;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            if (bfqc != null) {
                Object b = this.f45099b.mo15620b(i2);
                String str = bfqc.f114837a;
                String[] strArr = bfqm.f114869a;
                if (!((bfql) b).f114866a.startsWith(str)) {
                }
            }
            arrayList.add((ssp) this.f45099b.mo15621c(i2));
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        sb.append("Tracked duration ");
        double elapsedRealtime = (double) (SystemClock.elapsedRealtime() - this.f45098a);
        Double.isNaN(elapsedRealtime);
        sb.append(Math.round(elapsedRealtime / 60000.0d));
        sb.append("[minutes]\n");
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            sb.append(arrayList.get(i3));
            sb.append(10);
        }
        if (this.f45100c != null) {
            sb.append("Overflow: ");
            sb.append(this.f45100c);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo26056a(Object obj, long j) {
        ssp ssp = (ssp) this.f45099b.get(obj);
        if (ssp == null) {
            if (this.f45099b.f26809h < 40) {
                ssp = new ssp(obj);
                this.f45099b.put(obj, ssp);
            } else {
                if (this.f45100c == null) {
                    this.f45100c = new ssp(null);
                }
                ssp = this.f45100c;
            }
        }
        ssp.mo26051c();
        int i = ssp.f45089a;
        long[] jArr = ssp.f45092d;
        int length = jArr.length;
        if (i >= length) {
            ssp.f45092d = Arrays.copyOf(jArr, length + 3);
        }
        long[] jArr2 = ssp.f45092d;
        int i2 = ssp.f45089a;
        jArr2[i2] = j;
        int i3 = i2 + 1;
        ssp.f45089a = i3;
        ssp.f45091c++;
        if (j < ssp.f45093e) {
            ssp.f45093e = j;
        }
        if (j > ssp.f45094f) {
            ssp.f45094f = j;
        }
        if (i3 == 1) {
            ssp.f45090b = SystemClock.elapsedRealtime();
        }
    }
}
