package p000;

import android.content.Context;
import android.os.Build;

/* renamed from: dm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0936dm implements C0929df {

    /* renamed from: a */
    private final Context f13463a;

    /* renamed from: b */
    private final String f13464b;

    /* renamed from: c */
    private final C0925dc f13465c;

    /* renamed from: d */
    private final Object f13466d = new Object();

    /* renamed from: e */
    private C0935dl f13467e;

    /* renamed from: f */
    private boolean f13468f;

    public C0936dm(Context context, String str, C0925dc dcVar) {
        this.f13463a = context;
        this.f13464b = str;
        this.f13465c = dcVar;
    }

    /* renamed from: b */
    private final C0935dl m8800b() {
        C0935dl dlVar;
        synchronized (this.f13466d) {
            if (this.f13467e == null) {
                int i = Build.VERSION.SDK_INT;
                this.f13467e = new C0935dl(this.f13463a, this.f13464b, new C0933dj[1], this.f13465c);
                int i2 = Build.VERSION.SDK_INT;
                this.f13467e.setWriteAheadLoggingEnabled(this.f13468f);
            }
            dlVar = this.f13467e;
        }
        return dlVar;
    }

    /* renamed from: a */
    public final C0933dj mo8640a() {
        return m8800b().mo9248a();
    }

    public final void close() {
        m8800b().close();
    }

    /* renamed from: a */
    public final void mo8641a(boolean z) {
        synchronized (this.f13466d) {
            C0935dl dlVar = this.f13467e;
            if (dlVar != null) {
                dlVar.setWriteAheadLoggingEnabled(z);
            }
            this.f13468f = z;
        }
    }
}
