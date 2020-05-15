package p000;

import java.io.PrintWriter;
import java.util.List;

/* renamed from: bgdc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgdc extends bfop {

    /* renamed from: a */
    final /* synthetic */ int f116095a;

    /* renamed from: b */
    final /* synthetic */ long f116096b;

    /* renamed from: c */
    final /* synthetic */ String f116097c;

    /* renamed from: d */
    final /* synthetic */ List f116098d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgdc(bfos bfos, long j, Object obj, int i, int i2, int i3, int i4, long j2, String str, List list) {
        super(bfos, j, null, obj, i, i2, i3);
        this.f116095a = i4;
        this.f116096b = j2;
        this.f116097c = str;
        this.f116098d = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60941a(PrintWriter printWriter) {
        int i = this.f116095a;
        StringBuilder sb = new StringBuilder(25);
        sb.append("pendingIntent=");
        sb.append(i);
        printWriter.print(sb.toString());
        long j = this.f116096b;
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append(", fullPowerPeriodMillis=");
        sb2.append(j);
        printWriter.print(sb2.toString());
        String valueOf = String.valueOf(this.f116097c);
        printWriter.print(valueOf.length() == 0 ? new String(", tag=") : ", tag=".concat(valueOf));
        String valueOf2 = String.valueOf(this.f116098d);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 14);
        sb3.append(", workSources=");
        sb3.append(valueOf2);
        printWriter.print(sb3.toString());
    }
}
