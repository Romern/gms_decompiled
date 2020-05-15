package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.RemoveHarmfulAppData;

/* renamed from: aqbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqbh extends apuk {

    /* renamed from: d */
    private static aqbh f85552d;

    /* renamed from: b */
    protected String f85553b;

    /* renamed from: c */
    protected byte[] f85554c;

    static {
        aqbh.class.getSimpleName();
    }

    private aqbh(Context context) {
        this.f84920a = context;
    }

    /* renamed from: a */
    public static synchronized aqbh m71290a(Context context) {
        aqbh aqbh;
        synchronized (aqbh.class) {
            if (f85552d == null) {
                f85552d = new aqbh(context.getApplicationContext());
            }
            aqbh = f85552d;
        }
        return aqbh;
    }

    /* renamed from: a */
    static synchronized void m71291a() {
        synchronized (aqbh.class) {
            f85552d = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo47615b() {
        apue.m71014a(this.f84920a).mo47620a(3);
        m71291a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47614a(Status status, apga apga, int i) {
        int i2;
        boolean z;
        synchronized (this) {
            if (i == 3) {
                i2 = 2;
            } else {
                i2 = i;
            }
            if (i == 3) {
                z = true;
            } else {
                z = false;
            }
            try {
                apga.mo47171a(status, new RemoveHarmfulAppData(i2, z));
            } catch (RemoteException e) {
            }
        }
    }
}
