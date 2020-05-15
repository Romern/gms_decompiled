package p000;

import java.io.PrintWriter;

/* renamed from: bgfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgfk extends bfop {

    /* renamed from: a */
    final /* synthetic */ int f116351a;

    /* renamed from: b */
    final /* synthetic */ int f116352b;

    /* renamed from: c */
    final /* synthetic */ boolean f116353c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgfk(bfos bfos, long j, int i, int i2, int i3, int i4, int i5, boolean z) {
        super(bfos, j, null, null, i, i2, i3);
        this.f116351a = i4;
        this.f116352b = i5;
        this.f116353c = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60941a(PrintWriter printWriter) {
        printWriter.print("scale ");
        printWriter.print(this.f116351a);
        printWriter.print(" level ");
        printWriter.print(this.f116352b);
        printWriter.print(" plugged ");
        printWriter.print(this.f116353c);
    }
}
