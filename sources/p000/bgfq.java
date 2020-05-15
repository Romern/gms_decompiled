package p000;

import java.io.PrintWriter;

/* renamed from: bgfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgfq extends bfop {

    /* renamed from: a */
    final /* synthetic */ int f116368a;

    /* renamed from: b */
    final /* synthetic */ bfmj f116369b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgfq(bfos bfos, long j, Object obj, int i, int i2, int i3, bfmj bfmj) {
        super(bfos, j, null, obj, i, i2, -1);
        this.f116368a = i3;
        this.f116369b = bfmj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60941a(PrintWriter printWriter) {
        printWriter.print(this.f116368a);
        String valueOf = String.valueOf(this.f116369b.mo61925c());
        printWriter.print(valueOf.length() == 0 ? new String(" deviceAddress=") : " deviceAddress=".concat(valueOf));
        String valueOf2 = String.valueOf(this.f116369b.mo61923a());
        printWriter.print(valueOf2.length() == 0 ? new String(", deviceName=") : ", deviceName=".concat(valueOf2));
    }
}
