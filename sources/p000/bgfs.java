package p000;

import java.io.PrintWriter;

/* renamed from: bgfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgfs extends bfop {

    /* renamed from: a */
    final /* synthetic */ int f116371a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgfs(bfos bfos, long j, int i, int i2) {
        super(bfos, j, i);
        this.f116371a = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60941a(PrintWriter printWriter) {
        int i = this.f116371a;
        StringBuilder sb = new StringBuilder(35);
        sb.append("activityRecognitionMode=");
        sb.append(i);
        printWriter.print(sb.toString());
    }
}
