package p000;

import android.util.EventLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: aujm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aujm implements aujh {

    /* renamed from: a */
    private final C1223np f91948a = new C1223np();

    /* renamed from: b */
    private int[] f91949b;

    /* renamed from: c */
    private final ArrayList f91950c = new ArrayList();

    public aujm() {
        mo50600a(new aukd());
        mo50600a(new aukb());
        mo50600a(new aukc());
        mo50600a(new aujw());
        mo50600a(new aujv());
        mo50600a(new aujs());
        mo50600a(new aujp());
        mo50600a(new aujr());
        mo50600a(new aujx());
        mo50600a(new aujy());
        mo50600a(new aujq());
        mo50600a(new aujt());
        mo50600a(new aujj());
        mo50600a(new aujn());
        mo50600a(new aujo());
        mo50600a(new auka());
        mo50600a(new aujz());
        mo50600a(new aujl());
    }

    /* renamed from: a */
    public final boolean mo50583a() {
        return false;
    }

    /* renamed from: a */
    public final void mo50582a(auji auji) {
        boolean c = cgzf.m147724c();
        if (cgzf.m147725d()) {
            try {
                if (this.f91949b == null) {
                    this.f91949b = new int[this.f91948a.f26809h];
                    int i = 0;
                    while (true) {
                        C1223np npVar = this.f91948a;
                        if (i >= npVar.f26809h) {
                            break;
                        }
                        this.f91949b[i] = ((auke) npVar.mo15621c(i)).mo50597a();
                        i++;
                    }
                }
                int[] iArr = this.f91949b;
                ArrayList arrayList = this.f91950c;
                ArrayList arrayList2 = new ArrayList();
                EventLog.readEvents(iArr, arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new aujk((EventLog.Event) it.next()));
                }
            } catch (IOException e) {
                bqye.m113758a(e);
            }
            if (c) {
                int size = this.f91950c.size();
                StringBuilder sb = new StringBuilder(34);
                sb.append("read this many events: ");
                sb.append(size);
                sb.toString();
            }
            EventLog.writeEvent(208000, new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo50584b(auji auji) {
        boolean z;
        long j;
        int i;
        long j2;
        long j3;
        ArrayList arrayList;
        Object[] objArr;
        aujm aujm = this;
        auji auji2 = auji;
        boolean c = cgzf.m147724c();
        if (cgzf.m147725d()) {
            long j4 = 1000000;
            if (!aujm.f91950c.isEmpty()) {
                ArrayList arrayList2 = aujm.f91950c;
                int size = arrayList2.size();
                j2 = Long.MAX_VALUE;
                j3 = 0;
                int i2 = 0;
                i = 0;
                j = 0;
                while (i2 < size) {
                    aujk aujk = (aujk) arrayList2.get(i2);
                    boolean z2 = c;
                    ArrayList arrayList3 = arrayList2;
                    long j5 = aujk.f91945a / j4;
                    j2 = Math.min(j2, j5);
                    j = Math.max(j, j5);
                    if (aujk.f91946b == 208000) {
                        i++;
                        j3 = Math.max(j3, j5);
                    }
                    i2++;
                    c = z2;
                    arrayList2 = arrayList3;
                    j4 = 1000000;
                }
                z = c;
            } else {
                z = c;
                j3 = 0;
                j2 = 0;
                i = 0;
                j = 0;
            }
            long j6 = j - j2;
            auji2.mo50590a("tron_eventlog_horizon", j6 / 60000);
            auji2.mo50590a("tron_hearts_seen", (long) i);
            if (i > 0) {
                auji2.mo50590a("tron_last_heart_minutes", (j - j3) / 60000);
            }
            ArrayList arrayList4 = aujm.f91950c;
            int size2 = arrayList4.size();
            int i3 = 0;
            while (i3 < size2) {
                aujk aujk2 = (aujk) arrayList4.get(i3);
                long j7 = aujk2.f91945a / 1000000;
                if (j7 > j3) {
                    int i4 = aujk2.f91946b;
                    auke auke = (auke) aujm.f91948a.get(Integer.valueOf(i4));
                    if (auke != null) {
                        if (z) {
                            StringBuilder sb = new StringBuilder(24);
                            sb.append("parsing tag: ");
                            sb.append(i4);
                            sb.toString();
                        }
                        boolean c2 = cgzf.m147724c();
                        Object obj = aujk2.f91947c;
                        if (obj instanceof Object[]) {
                            Object[] objArr2 = (Object[]) obj;
                            int i5 = 0;
                            while (true) {
                                arrayList = arrayList4;
                                if (i5 >= objArr2.length) {
                                    objArr = objArr2;
                                    break;
                                } else if (objArr2[i5] != null) {
                                    i5++;
                                    arrayList4 = arrayList;
                                } else if (c2) {
                                    int i6 = aujk2.f91946b;
                                    StringBuilder sb2 = new StringBuilder(33);
                                    sb2.append("unexpected null value:");
                                    sb2.append(i6);
                                    sb2.toString();
                                }
                            }
                        } else {
                            objArr = new Object[]{obj};
                            arrayList = arrayList4;
                        }
                        auke.mo50598a(auji2, aujk2.f91945a / 1000000, objArr);
                    } else {
                        arrayList = arrayList4;
                        if (z) {
                            StringBuilder sb3 = new StringBuilder(24);
                            sb3.append("unknown tag: ");
                            sb3.append(i4);
                            sb3.toString();
                        }
                    }
                } else {
                    arrayList = arrayList4;
                    if (z) {
                        StringBuilder sb4 = new StringBuilder(54);
                        sb4.append("old event: ");
                        sb4.append(j7);
                        sb4.append(" < ");
                        sb4.append(j3);
                        sb4.toString();
                    }
                }
                i3++;
                aujm = this;
                arrayList4 = arrayList;
            }
            long j8 = j6 / 2;
            if (i > 0) {
                double a = cgzf.f188102a.mo6606a().mo84792a();
                double d = (double) j8;
                Double.isNaN(d);
                double d2 = d * a;
                double d3 = 1.0d - a;
                double d4 = (double) (j - j3);
                Double.isNaN(d4);
                j8 = (long) (d2 + (d3 * d4));
            }
            if (j8 == 0) {
                j8 = cgzf.f188102a.mo6606a().mo84797f();
            }
            auji2.mo50586a(j8);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50600a(auke auke) {
        this.f91948a.put(Integer.valueOf(auke.mo50597a()), auke);
        this.f91949b = null;
    }
}
