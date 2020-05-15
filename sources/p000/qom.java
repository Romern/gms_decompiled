package p000;

import android.content.Context;
import android.util.Log;
import java.io.File;

/* renamed from: qom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qom {

    /* renamed from: e */
    private static volatile qom f41873e = null;

    /* renamed from: a */
    public final Context f41874a;

    /* renamed from: b */
    public final Object f41875b = new Object();

    /* renamed from: c */
    public qol f41876c = null;

    /* renamed from: d */
    private final File f41877d;

    public qom(Context context) {
        Context d = aytw.m84817d(context.getApplicationContext());
        this.f41874a = d;
        this.f41877d = dft.m8317a(d);
    }

    /* renamed from: a */
    public static synchronized qom m32578a(Context context) {
        qom qom;
        synchronized (qom.class) {
            qom = f41873e;
            if (qom == null) {
                synchronized (qom.class) {
                    qom = f41873e;
                    if (qom == null) {
                        qom = new qom(context);
                        f41873e = qom;
                    }
                }
            }
        }
        return qom;
    }

    /* renamed from: a */
    public final qok mo24171a() {
        byte[] a = dft.m8323a(new File(this.f41877d, "next_container.pb"));
        if (a == null) {
            return null;
        }
        try {
            bxvd da = qok.f41865e.mo74144da();
            da.mo73635b(a, bxus.m123743b());
            return (qok) da.mo74062i();
        } catch (bxwf e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("Failed to read config file: ");
            sb.append(valueOf);
            Log.e("SyncUpdateMgr", sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo24172a(qok qok) {
        return dft.m8316a(qok.serializeToBytes(), new File(this.f41877d, "pending_next_container.pb"), new File(this.f41877d, "next_container.pb"), false) > 0;
    }
}
