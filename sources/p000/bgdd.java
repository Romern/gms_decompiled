package p000;

import java.io.PrintWriter;

/* renamed from: bgdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgdd extends bfop {

    /* renamed from: a */
    final /* synthetic */ int f116099a;

    /* renamed from: b */
    final /* synthetic */ String f116100b;

    /* renamed from: c */
    final /* synthetic */ String f116101c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgdd(bfos bfos, long j, Object obj, int i, int i2, String str, String str2) {
        super(bfos, j, null, obj, i, -1, -1);
        this.f116099a = i2;
        this.f116100b = str;
        this.f116101c = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60941a(PrintWriter printWriter) {
        int i = this.f116099a;
        StringBuilder sb = new StringBuilder(25);
        sb.append("pendingIntent=");
        sb.append(i);
        printWriter.print(sb.toString());
        String valueOf = String.valueOf(this.f116100b);
        printWriter.print(valueOf.length() == 0 ? new String(", packageName=") : ", packageName=".concat(valueOf));
        String valueOf2 = String.valueOf(this.f116101c);
        printWriter.print(valueOf2.length() == 0 ? new String(", tag=") : ", tag=".concat(valueOf2));
    }
}
