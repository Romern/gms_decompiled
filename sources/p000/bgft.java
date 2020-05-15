package p000;

import java.io.PrintWriter;

/* renamed from: bgft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgft extends bfop {

    /* renamed from: a */
    final /* synthetic */ int f116372a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgft(bfos bfos, long j, int i, int i2) {
        super(bfos, j, 1, Integer.MAX_VALUE, i);
        this.f116372a = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60941a(PrintWriter printWriter) {
        printWriter.print("command=1");
        StringBuilder sb = new StringBuilder(23);
        sb.append(", latencyMs=2147483647");
        printWriter.print(sb.toString());
        int i = this.f116372a;
        StringBuilder sb2 = new StringBuilder(28);
        sb2.append(", transitionSize=");
        sb2.append(i);
        printWriter.print(sb2.toString());
    }
}
