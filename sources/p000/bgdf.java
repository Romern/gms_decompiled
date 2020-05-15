package p000;

import java.io.PrintWriter;

/* renamed from: bgdf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgdf extends bfop {

    /* renamed from: a */
    final /* synthetic */ int f116105a;

    /* renamed from: b */
    final /* synthetic */ String f116106b;

    /* renamed from: c */
    final /* synthetic */ String f116107c;

    /* renamed from: d */
    final /* synthetic */ int f116108d;

    /* renamed from: m */
    final /* synthetic */ int f116109m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgdf(bfos bfos, long j, Object obj, int i, int i2, int i3, int i4, String str, String str2, int i5, int i6) {
        super(bfos, j, null, obj, i, i2, i3);
        this.f116105a = i4;
        this.f116106b = str;
        this.f116107c = str2;
        this.f116108d = i5;
        this.f116109m = i6;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60941a(PrintWriter printWriter) {
        int i = this.f116105a;
        StringBuilder sb = new StringBuilder(25);
        sb.append("pendingIntent=");
        sb.append(i);
        printWriter.print(sb.toString());
        String valueOf = String.valueOf(this.f116106b);
        printWriter.print(valueOf.length() == 0 ? new String(", packageName=") : ", packageName=".concat(valueOf));
        String valueOf2 = String.valueOf(this.f116107c);
        printWriter.print(valueOf2.length() == 0 ? new String(", tag=") : ", tag=".concat(valueOf2));
        int i2 = this.f116108d;
        StringBuilder sb2 = new StringBuilder(22);
        sb2.append(", activity=");
        sb2.append(i2);
        printWriter.print(sb2.toString());
        int i3 = this.f116109m;
        StringBuilder sb3 = new StringBuilder(24);
        sb3.append(", transition=");
        sb3.append(i3);
        printWriter.print(sb3.toString());
    }
}
