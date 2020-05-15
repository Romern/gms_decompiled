package p000;

import java.io.PrintWriter;

/* renamed from: bgdb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgdb extends bfop {

    /* renamed from: a */
    final /* synthetic */ int f116090a;

    /* renamed from: b */
    final /* synthetic */ String f116091b;

    /* renamed from: c */
    final /* synthetic */ String f116092c;

    /* renamed from: d */
    final /* synthetic */ long f116093d;

    /* renamed from: m */
    final /* synthetic */ long f116094m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgdb(bfos bfos, long j, Object obj, int i, int i2, int i3, int i4, String str, String str2, long j2, long j3) {
        super(bfos, j, null, obj, i, i2, i3);
        this.f116090a = i4;
        this.f116091b = str;
        this.f116092c = str2;
        this.f116093d = j2;
        this.f116094m = j3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60941a(PrintWriter printWriter) {
        int i = this.f116090a;
        StringBuilder sb = new StringBuilder(25);
        sb.append("pendingIntent=");
        sb.append(i);
        printWriter.print(sb.toString());
        String valueOf = String.valueOf(this.f116091b);
        printWriter.print(valueOf.length() == 0 ? new String(", packageName=") : ", packageName=".concat(valueOf));
        String valueOf2 = String.valueOf(this.f116092c);
        printWriter.print(valueOf2.length() == 0 ? new String(", tag=") : ", tag=".concat(valueOf2));
        long j = this.f116093d;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append(", periodMillis=");
        sb2.append(j);
        printWriter.print(sb2.toString());
        long j2 = this.f116094m;
        StringBuilder sb3 = new StringBuilder(45);
        sb3.append(", maxReportLatencyMillis=");
        sb3.append(j2);
        printWriter.print(sb3.toString());
    }
}
