package p000;

import java.io.PrintWriter;

/* renamed from: bgfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgfn extends bfop {

    /* renamed from: a */
    final /* synthetic */ String f116359a;

    /* renamed from: b */
    final /* synthetic */ String f116360b;

    /* renamed from: c */
    final /* synthetic */ String f116361c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgfn(bfos bfos, long j, String str, String str2, String str3) {
        super(bfos, j);
        this.f116359a = str;
        this.f116360b = str2;
        this.f116361c = str3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60941a(PrintWriter printWriter) {
        printWriter.print(this.f116359a);
        printWriter.print('/');
        printWriter.print(this.f116360b);
        printWriter.print(' ');
        printWriter.print(this.f116361c);
    }
}
