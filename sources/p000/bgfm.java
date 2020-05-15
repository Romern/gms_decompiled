package p000;

import java.io.PrintWriter;

/* renamed from: bgfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgfm extends bfop {

    /* renamed from: a */
    final /* synthetic */ boolean f116357a;

    /* renamed from: b */
    final /* synthetic */ int f116358b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgfm(bfos bfos, long j, int i, int i2, boolean z, int i3) {
        super(bfos, j, null, null, i, i2, 0);
        this.f116357a = z;
        this.f116358b = i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60941a(PrintWriter printWriter) {
        printWriter.print(this.f116357a);
        printWriter.print(" osClientId=");
        printWriter.print(this.f116358b);
    }
}
