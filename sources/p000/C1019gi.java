package p000;

import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.view.Window;

/* renamed from: gi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1019gi extends C1034gv implements C0062bt, agt {

    /* renamed from: a */
    final /* synthetic */ C1021gj f18282a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1019gi(C1021gj gjVar) {
        super(gjVar, gjVar, new Handler());
        this.f18282a = gjVar;
    }

    /* renamed from: a */
    public final View mo11664a(int i) {
        return this.f18282a.findViewById(i);
    }

    /* renamed from: b */
    public final void mo11897b() {
        this.f18282a.mo8650b();
    }

    public final C0008af getLifecycle() {
        return this.f18282a.f18325b;
    }

    public final C0061bs getViewModelStore() {
        return this.f18282a.getViewModelStore();
    }

    /* renamed from: a */
    public final void mo11896a(C1018gh ghVar, Intent intent, int i) {
        this.f18282a.mo11921a(ghVar, intent, i);
    }

    /* renamed from: a */
    public final boolean mo11665a() {
        Window window = this.f18282a.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }
}
