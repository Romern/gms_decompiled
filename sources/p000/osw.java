package p000;

import com.google.android.gms.carsetup.CarSetupServiceImpl;

/* renamed from: osw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class osw implements Runnable {

    /* renamed from: a */
    public boolean f38369a;

    /* renamed from: b */
    final /* synthetic */ CarSetupServiceImpl f38370b;

    public osw(CarSetupServiceImpl carSetupServiceImpl) {
        this.f38370b = carSetupServiceImpl;
    }

    public final void run() {
        this.f38369a = oju.m28959a().mo22226a(this.f38370b.getApplicationContext());
        nuu.m27792a(new osv(this));
    }
}
