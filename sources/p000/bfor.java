package p000;

import java.io.PrintWriter;
import java.text.FieldPosition;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;

/* renamed from: bfor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfor {

    /* renamed from: a */
    private final LinkedList f114576a = new LinkedList();

    /* renamed from: b */
    private final bfot f114577b;

    /* renamed from: c */
    private final String f114578c;

    /* renamed from: d */
    private final bfog f114579d;

    /* renamed from: e */
    private final bfop[] f114580e;

    /* renamed from: f */
    private final int[] f114581f;

    /* renamed from: g */
    private final long[] f114582g;

    /* renamed from: h */
    private final long f114583h;

    /* renamed from: i */
    private bfop f114584i;

    /* renamed from: j */
    private bfop f114585j;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.fill(long[], long):void}
     arg types: [long[], int]
     candidates:
      ClspMth{java.util.Arrays.fill(double[], double):void}
      ClspMth{java.util.Arrays.fill(byte[], byte):void}
      ClspMth{java.util.Arrays.fill(boolean[], boolean):void}
      ClspMth{java.util.Arrays.fill(char[], char):void}
      ClspMth{java.util.Arrays.fill(short[], short):void}
      ClspMth{java.util.Arrays.fill(java.lang.Object[], java.lang.Object):void}
      ClspMth{java.util.Arrays.fill(int[], int):void}
      ClspMth{java.util.Arrays.fill(float[], float):void}
      ClspMth{java.util.Arrays.fill(long[], long):void} */
    public bfor(String str, String str2, int i, bfot bfot, bfog bfog) {
        new FieldPosition(0);
        new SimpleDateFormat("yyyy.MM.dd HH:mm:ss ", Locale.US);
        this.f114580e = new bfop[bfos.values().length];
        this.f114581f = new int[bfos.values().length];
        long[] jArr = new long[bfos.values().length];
        this.f114582g = jArr;
        this.f114578c = str2;
        this.f114577b = bfot;
        this.f114579d = bfog;
        Arrays.fill(jArr, -1L);
        this.f114583h = bfot.mo62057a();
        this.f114584i = null;
        this.f114585j = null;
        mo62047a(new bfop(bfos.EVENT_LOG_CREATE, this.f114583h, null, str, i, -1, -1));
    }

    /* renamed from: a */
    public final String mo62045a(String str) {
        this.f114578c.equals(str);
        return "";
    }

    /* renamed from: b */
    public final long mo62055b() {
        return this.f114577b.mo62057a();
    }

    /* renamed from: a */
    public final void mo62046a() {
        bfop bfop;
        synchronized (this) {
            bfop = this.f114584i;
            this.f114584i = null;
            this.f114585j = null;
        }
        new Date();
        while (bfop != null) {
            bfos bfos = bfop.f114568e;
            bfop bfop2 = bfop.f114575l;
            if (!(this.f114579d == null || bfos == bfos.LOG)) {
                this.f114579d.mo62033a(bfos, bfop.f114573j, bfop.f114569f, bfop.f114570g, bfop.f114571h, bfop.f114572i);
            }
            bfop = bfop2;
        }
    }

    /* renamed from: b */
    public final void mo62056b(bfos bfos, boolean z) {
        mo62047a(new bfop(bfos, this.f114577b.mo62057a(), !z ? "off" : "on", z ? 1 : 0));
    }

    /* renamed from: a */
    public final synchronized void mo62047a(bfop bfop) {
        if (this.f114576a.size() > 0) {
            this.f114582g[((bfop) this.f114576a.getLast()).f114568e.ordinal()] = bfop.f114573j;
        }
        this.f114580e[bfop.f114568e.ordinal()] = bfop;
        int[] iArr = this.f114581f;
        int ordinal = bfop.f114568e.ordinal();
        iArr[ordinal] = iArr[ordinal] + 1;
        if (bfop.f114568e == bfos.GPS_LOCATION && this.f114576a.size() >= 2 && ((bfop) this.f114576a.getLast()).f114568e == bfos.GPS_LOCATION) {
            LinkedList linkedList = this.f114576a;
            if (((bfop) linkedList.get(linkedList.size() - 2)).f114568e == bfos.GPS_LOCATION) {
                this.f114576a.removeLast();
            }
        }
        this.f114576a.addLast(bfop);
        while (this.f114576a.size() > 200) {
            this.f114576a.removeFirst();
        }
        int i = bfop.f114568e.f114719bC;
        bfop.f114575l = null;
        if (this.f114584i != null) {
            bfop bfop2 = this.f114585j;
            if (bfop2 != null) {
                bfop2.f114575l = bfop;
            }
        } else {
            this.f114584i = bfop;
        }
        this.f114585j = bfop;
    }

    /* renamed from: a */
    public final void mo62048a(bfos bfos) {
        mo62047a(new bfop(bfos, this.f114577b.mo62057a()));
    }

    /* renamed from: a */
    public final void mo62049a(bfos bfos, int i) {
        mo62047a(new bfop(bfos, this.f114577b.mo62057a(), i));
    }

    /* renamed from: a */
    public final void mo62050a(bfos bfos, int i, int i2) {
        mo62047a(new bfop(bfos, this.f114577b.mo62057a(), i, i2));
    }

    /* renamed from: a */
    public final void mo62051a(bfos bfos, int i, int i2, int i3) {
        mo62047a(new bfop(bfos, this.f114577b.mo62057a(), null, null, i, i2, i3));
    }

    /* renamed from: a */
    public final void mo62052a(bfos bfos, int i, String str) {
        mo62047a(new bfoo(bfos, this.f114577b.mo62057a(), "", i, str));
    }

    /* renamed from: a */
    public final void mo62053a(bfos bfos, boolean z) {
        mo62047a(new bfop(bfos, this.f114577b.mo62057a(), !z ? "disabled" : "enabled", z ? 1 : 0));
    }

    /* renamed from: a */
    public final synchronized void mo62054a(Format format, long j, PrintWriter printWriter) {
        PrintWriter printWriter2 = printWriter;
        synchronized (this) {
            long a = this.f114577b.mo62057a();
            StringBuilder sb = new StringBuilder(36);
            sb.append("elapsedRealtime ");
            sb.append(a);
            printWriter2.println(sb.toString());
            long j2 = this.f114583h;
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("Process restart time: ");
            sb2.append(j2);
            printWriter2.println(sb2.toString());
            printWriter.flush();
            Date date = new Date(0);
            long j3 = -600000 + a;
            Iterator it = this.f114576a.iterator();
            while (it.hasNext()) {
                bfop bfop = (bfop) it.next();
                if (bfop.f114573j >= j3) {
                    if (bfop.f114568e.f114719bC == 1) {
                        printWriter2.print(10);
                    }
                    date.setTime(j);
                    date.setTime(date.getTime() + bfop.f114573j);
                    printWriter2.print(format.format(date));
                    printWriter2.print(' ');
                    printWriter2.print('@');
                    printWriter2.print(bfop.f114573j);
                    printWriter2.print(' ');
                    printWriter2.print(bfop.f114568e.toString());
                    printWriter2.print(' ');
                    bfop.mo60941a(printWriter2);
                    printWriter2.print(10);
                    j3 = j3;
                }
            }
            StringBuilder sb3 = new StringBuilder(36);
            sb3.append("elapsedRealtime ");
            sb3.append(a);
            printWriter2.println(sb3.toString());
            printWriter.flush();
            bfog bfog = this.f114579d;
            if (bfog != null) {
                bfog.mo62034a(printWriter2, a);
                StringBuilder sb4 = new StringBuilder(36);
                sb4.append("elapsedRealtime ");
                sb4.append(a);
                printWriter2.println(sb4.toString());
            }
        }
    }
}
