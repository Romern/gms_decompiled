package p000;

import java.io.PrintWriter;

/* renamed from: bgfp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgfp extends bfop {

    /* renamed from: a */
    final /* synthetic */ int f116365a;

    /* renamed from: b */
    final /* synthetic */ long f116366b;

    /* renamed from: c */
    final /* synthetic */ boolean f116367c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgfp(bfos bfos, long j, int i, int i2, int i3, int i4, long j2, boolean z) {
        super(bfos, j, null, null, i, i2, i3);
        this.f116365a = i4;
        this.f116366b = j2;
        this.f116367c = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60941a(PrintWriter printWriter) {
        printWriter.print(this.f116365a);
        printWriter.print(' ');
        printWriter.print(this.f116366b);
        printWriter.print(' ');
        printWriter.print(this.f116367c);
    }
}
