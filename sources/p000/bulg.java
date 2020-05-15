package p000;

import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: bulg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bulg implements bukj {

    /* renamed from: a */
    private long f154135a = 0;

    /* renamed from: b */
    private long[] f154136b;

    /* renamed from: c */
    private long f154137c = 0;

    /* renamed from: d */
    private long f154138d = 0;

    /* renamed from: e */
    private final ArrayList f154139e = new ArrayList();

    /* renamed from: a */
    public final long mo72771a() {
        return this.f154135a;
    }

    /* renamed from: a */
    public final void mo72772a(long j) {
        this.f154135a = j;
    }

    /* renamed from: b */
    public final void mo72775b(long j) {
        this.f154138d = j;
    }

    /* renamed from: c */
    public final void mo72776c(long j) {
        this.f154139e.add(Long.valueOf(j));
    }

    /* renamed from: d */
    public final void mo72777d(long j) {
        this.f154137c += j;
    }

    /* renamed from: a */
    public final void mo72773a(bsax bsax) {
        int j = bsax.mo70138j(1);
        this.f154136b = new long[j];
        for (int i = 0; i < j; i++) {
            this.f154136b[i] = bsax.mo70127d(1, i);
        }
    }

    /* renamed from: a */
    public final void mo72774a(PrintWriter printWriter) {
        printWriter.print("{outcome=");
        if (this.f154138d == 0) {
            printWriter.print("pending");
        } else {
            printWriter.print("received in ");
            printWriter.print(this.f154138d - this.f154135a);
            printWriter.print("ms");
        }
        printWriter.print("; requestedMacs=[");
        long[] jArr = this.f154136b;
        if (jArr != null) {
            int length = jArr.length;
            for (int i = 0; i < length; i++) {
                printWriter.printf("%012X, ", Long.valueOf(jArr[i]));
            }
        }
        printWriter.print("]; receivedTileS2CellIds=[");
        ArrayList arrayList = this.f154139e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            printWriter.printf("0x%016X, ", (Long) arrayList.get(i2));
        }
        printWriter.print("]; clearedMacsCount=");
        printWriter.print(this.f154137c);
        printWriter.println("}");
    }
}
