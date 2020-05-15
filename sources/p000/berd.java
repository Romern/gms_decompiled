package p000;

import java.io.PrintWriter;

/* renamed from: berd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class berd extends bfop {

    /* renamed from: a */
    final /* synthetic */ String f112201a;

    /* renamed from: b */
    final /* synthetic */ int f112202b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public berd(bfos bfos, long j, int i, int i2, String str, int i3) {
        super(bfos, j, i, i2);
        this.f112201a = str;
        this.f112202b = i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60941a(PrintWriter printWriter) {
        printWriter.print(this.f112201a);
        printWriter.print(' ');
        printWriter.print(this.f112202b);
    }
}
