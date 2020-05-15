package p000;

import java.io.PrintWriter;

/* renamed from: bfop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bfop {

    /* renamed from: e */
    public final bfos f114568e;

    /* renamed from: f */
    public final int f114569f;

    /* renamed from: g */
    public final int f114570g;

    /* renamed from: h */
    public final int f114571h;

    /* renamed from: i */
    public final Object f114572i;

    /* renamed from: j */
    final long f114573j;

    /* renamed from: k */
    final String f114574k;

    /* renamed from: l */
    public bfop f114575l;

    public bfop(bfos bfos, long j) {
        this(bfos, j, null, null, -1, -1, -1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo60941a(PrintWriter printWriter) {
        String str;
        String str2 = this.f114574k;
        if (str2 != null) {
            Object[] objArr = new Object[4];
            Object obj = this.f114572i;
            if (obj != null) {
                str = obj.toString();
            } else {
                str = "";
            }
            objArr[0] = str;
            objArr[1] = Integer.valueOf(this.f114569f);
            objArr[2] = Integer.valueOf(this.f114570g);
            objArr[3] = Integer.valueOf(this.f114571h);
            printWriter.print(String.format(str2, objArr));
        }
    }

    public bfop(bfos bfos, long j, int i) {
        this(bfos, j, null, null, i, -1, -1);
    }

    public bfop(bfos bfos, long j, int i, int i2) {
        this(bfos, j, null, null, i, i2, -1);
    }

    public bfop(bfos bfos, long j, int i, int i2, int i3) {
        this(bfos, j, null, null, i, i2, i3);
    }

    public bfop(bfos bfos, long j, String str, int i) {
        this(bfos, j, str, null, i, -1, -1);
    }

    public bfop(bfos bfos, long j, String str, Object obj, int i, int i2, int i3) {
        this.f114568e = bfos;
        this.f114573j = j;
        this.f114572i = obj;
        this.f114569f = i;
        this.f114570g = i2;
        this.f114571h = i3;
        this.f114574k = str;
    }
}
