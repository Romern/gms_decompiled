package p000;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* renamed from: clk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class clk implements cdn {

    /* renamed from: a */
    private final cgt f7022a;

    /* renamed from: b */
    private final cdn f7023b;

    public clk(cgt cgt, cdn cdn) {
        this.f7022a = cgt;
        this.f7023b = cdn;
    }

    /* renamed from: a */
    public final int mo3745a() {
        return 2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo3725a(Object obj, File file, cdk cdk) {
        return this.f7023b.mo3725a(new clm(((BitmapDrawable) ((cgj) obj).mo3842b()).getBitmap(), this.f7022a), file, cdk);
    }
}
