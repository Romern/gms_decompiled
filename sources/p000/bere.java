package p000;

import java.io.PrintWriter;

/* renamed from: bere */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bere extends bfop {

    /* renamed from: a */
    final /* synthetic */ long f112203a;

    /* renamed from: b */
    final /* synthetic */ long f112204b;

    /* renamed from: c */
    final /* synthetic */ long f112205c;

    /* renamed from: d */
    final /* synthetic */ boolean f112206d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bere(bfos bfos, long j, Object obj, int i, int i2, int i3, long j2, long j3, long j4, boolean z) {
        super(bfos, j, null, obj, i, i2, i3);
        this.f112203a = j2;
        this.f112204b = j3;
        this.f112205c = j4;
        this.f112206d = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60941a(PrintWriter printWriter) {
        long j = this.f112203a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("minPeriodMillis=");
        sb.append(j);
        printWriter.print(sb.toString());
        long j2 = this.f112204b;
        StringBuilder sb2 = new StringBuilder(45);
        sb2.append(", maxReportLatencyMillis=");
        sb2.append(j2);
        printWriter.print(sb2.toString());
        long j3 = this.f112205c;
        StringBuilder sb3 = new StringBuilder(50);
        sb3.append(", minPeriodTiltDetectorMillis=");
        sb3.append(j3);
        printWriter.print(sb3.toString());
        boolean z = this.f112206d;
        StringBuilder sb4 = new StringBuilder(25);
        sb4.append(", forceDetectionNow=");
        sb4.append(z);
        printWriter.print(sb4.toString());
    }
}
