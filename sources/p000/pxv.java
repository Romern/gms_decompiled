package p000;

import android.content.Context;

/* renamed from: pxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pxv extends aaab {

    /* renamed from: a */
    final /* synthetic */ Runnable f40598a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pxv(String str, Runnable runnable) {
        super(str);
        this.f40598a = runnable;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f40598a.run();
    }
}
