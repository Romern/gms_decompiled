package p000;

import java.io.PrintWriter;

/* renamed from: bgfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgfv extends bfop {

    /* renamed from: a */
    final /* synthetic */ int f116376a;

    /* renamed from: b */
    final /* synthetic */ int f116377b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgfv(bfos bfos, long j, int i, int i2, int i3, int i4) {
        super(bfos, j, i, i2);
        this.f116376a = i3;
        this.f116377b = i4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60941a(PrintWriter printWriter) {
        int i = this.f116376a;
        StringBuilder sb = new StringBuilder(27);
        sb.append("fusion activity=");
        sb.append(i);
        printWriter.print(sb.toString());
        int i2 = this.f116377b;
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(", fusion event type =");
        sb2.append(i2);
        printWriter.print(sb2.toString());
    }
}
