package p000;

import java.io.PrintWriter;

/* renamed from: bgfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgfu extends bfop {

    /* renamed from: a */
    final /* synthetic */ int f116373a;

    /* renamed from: b */
    final /* synthetic */ int f116374b;

    /* renamed from: c */
    final /* synthetic */ int f116375c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgfu(bfos bfos, long j, int i, int i2, int i3, int i4, int i5, int i6) {
        super(bfos, j, i, i2, i3);
        this.f116373a = i4;
        this.f116374b = i5;
        this.f116375c = i6;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60941a(PrintWriter printWriter) {
        int i = this.f116373a;
        StringBuilder sb = new StringBuilder(18);
        sb.append("reason=");
        sb.append(i);
        printWriter.print(sb.toString());
        int i2 = this.f116374b;
        StringBuilder sb2 = new StringBuilder(25);
        sb2.append(", sampleCount=");
        sb2.append(i2);
        printWriter.print(sb2.toString());
        int i3 = this.f116375c;
        StringBuilder sb3 = new StringBuilder(29);
        sb3.append(", transitionCount=");
        sb3.append(i3);
        printWriter.print(sb3.toString());
    }
}
