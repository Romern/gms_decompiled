package p000;

import android.text.format.Time;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;

/* renamed from: axyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axyd implements ayjm {

    /* renamed from: a */
    private final Deque f96753a = new ArrayDeque();

    /* renamed from: b */
    private final Map f96754b = new TreeMap();

    /* renamed from: c */
    private final String f96755c = TimeZone.getDefault().getID();

    /* renamed from: a */
    private final String m83552a(long j) {
        Time time = new Time(this.f96755c);
        time.set(j);
        return time.format("%Y-%m-%d %H:%M:%S");
    }

    /* renamed from: b */
    public final void mo53760b(String str) {
        mo53759a(str, "");
    }

    /* renamed from: a */
    private final void m83553a(String str, Long l, String str2) {
        this.f96753a.addLast(new axyc(str, l.longValue(), System.currentTimeMillis(), str2));
        while (this.f96753a.size() > 300) {
            this.f96753a.removeFirst();
        }
    }

    /* renamed from: a */
    public final void mo53757a() {
        for (Map.Entry entry : this.f96754b.entrySet()) {
            m83553a((String) entry.getKey(), (Long) entry.getValue(), "force end");
        }
        this.f96754b.clear();
    }

    /* renamed from: a */
    public final void mo53758a(String str) {
        this.f96754b.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: a */
    public final void mo53759a(String str, String str2) {
        Long l = (Long) this.f96754b.remove(str);
        if (l != null) {
            m83553a(str, l, str2);
        }
    }

    /* renamed from: a */
    public final void mo53558a(ssb ssb, boolean z, boolean z2) {
        ssb ssb2 = ssb;
        ssb.mo26034a();
        char c = 0;
        char c2 = 1;
        ssb2.printf("      %19s: %6s %-15s %s\n", "Start Time", "ms", "Event", "additional info");
        long currentTimeMillis = System.currentTimeMillis();
        int i = 1;
        for (Map.Entry entry : this.f96754b.entrySet()) {
            long longValue = ((Long) entry.getValue()).longValue();
            ssb2.printf("%3d - %19s: %6d %-15s %s\n", Integer.valueOf(i), m83552a(longValue), Long.valueOf(currentTimeMillis - longValue), entry.getKey(), "IN PROGRESS");
            i++;
        }
        Iterator descendingIterator = this.f96753a.descendingIterator();
        while (descendingIterator.hasNext()) {
            axyc axyc = (axyc) descendingIterator.next();
            Object[] objArr = new Object[5];
            objArr[c] = Integer.valueOf(i);
            objArr[c2] = m83552a(axyc.f96750b);
            objArr[2] = Long.valueOf(axyc.f96751c - axyc.f96750b);
            objArr[3] = axyc.f96749a;
            objArr[4] = axyc.f96752d;
            ssb2.printf("%3d - %19s: %6d %-15s %s\n", objArr);
            i++;
            c = 0;
            c2 = 1;
        }
        ssb.mo26035b();
    }
}
