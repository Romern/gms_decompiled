package p000;

import java.io.PrintWriter;

/* renamed from: bfoo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfoo extends bfop {

    /* renamed from: a */
    final /* synthetic */ String f114567a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfoo(bfos bfos, long j, Object obj, int i, String str) {
        super(bfos, j, null, obj, i, -1, -1);
        this.f114567a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60941a(PrintWriter printWriter) {
        int i = this.f114569f;
        StringBuilder sb = new StringBuilder(25);
        sb.append("pendingIntent=");
        sb.append(i);
        printWriter.print(sb.toString());
        String valueOf = String.valueOf(this.f114567a);
        printWriter.print(valueOf.length() == 0 ? new String(", packageName=") : ", packageName=".concat(valueOf));
    }
}
