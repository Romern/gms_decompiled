package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: apua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apua extends apuk {

    /* renamed from: b */
    private static apua f84900b;

    static {
        apua.class.getSimpleName();
    }

    private apua(Context context) {
        this.f84920a = context;
    }

    /* renamed from: a */
    public static synchronized apua m71005a(Context context) {
        apua apua;
        synchronized (apua.class) {
            if (f84900b == null) {
                f84900b = new apua(context.getApplicationContext());
            }
            apua = f84900b;
        }
        return apua;
    }

    /* renamed from: a */
    static synchronized void m71006a() {
        synchronized (apua.class) {
            f84900b = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo47615b() {
        apue.m71014a(this.f84920a).mo47620a(1);
        m71006a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47614a(Status status, apga apga, int i) {
        try {
            apga.mo47166a(status, i == 0);
        } catch (RemoteException e) {
        }
    }
}
