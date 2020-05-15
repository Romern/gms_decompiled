package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;

/* renamed from: sv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1364sv extends C1366sx {

    /* renamed from: a */
    final /* synthetic */ C1372tc f27040a;

    /* renamed from: c */
    private final PowerManager f27041c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1364sv(C1372tc tcVar, Context context) {
        super(tcVar);
        this.f27040a = tcVar;
        this.f27041c = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    /* renamed from: a */
    public final int mo15974a() {
        int i = Build.VERSION.SDK_INT;
        return this.f27041c.isPowerSaveMode() ? 2 : 1;
    }

    /* renamed from: b */
    public final void mo15975b() {
        this.f27040a.mo15951j();
    }

    /* renamed from: c */
    public final IntentFilter mo15976c() {
        int i = Build.VERSION.SDK_INT;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }
}
