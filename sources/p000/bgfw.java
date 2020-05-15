package p000;

import java.io.PrintWriter;

/* renamed from: bgfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgfw extends bfop {

    /* renamed from: a */
    final /* synthetic */ long f116378a;

    /* renamed from: b */
    final /* synthetic */ long f116379b;

    /* renamed from: c */
    final /* synthetic */ long f116380c;

    /* renamed from: d */
    final /* synthetic */ boolean f116381d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgfw(bfos bfos, long j, Object obj, int i, int i2, int i3, long j2, long j3, long j4, boolean z) {
        super(bfos, j, null, obj, i, i2, i3);
        this.f116378a = j2;
        this.f116379b = j3;
        this.f116380c = j4;
        this.f116381d = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60941a(PrintWriter printWriter) {
        printWriter.print(this.f116378a);
        printWriter.print(" low power period ");
        printWriter.print(this.f116379b);
        printWriter.print(" batch period ");
        printWriter.print(this.f116380c);
        printWriter.print(" trigger ");
        printWriter.print(this.f116381d);
    }
}
