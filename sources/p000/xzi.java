package p000;

import android.content.Context;
import com.google.android.gms.fido.common.Transport;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: xzi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xzi extends xzb {

    /* renamed from: f */
    public static final sek f53449f = new sek(new String[]{"StringStoreKeyHandleCache"}, (short[]) null);

    /* renamed from: b */
    public final xwj f53450b;

    /* renamed from: c */
    public final xwg f53451c;

    /* renamed from: d */
    public final Lock f53452d = new ReentrantLock();

    /* renamed from: e */
    public xwf f53453e;

    public xzi(Context context, xwj xwj, xwg xwg) {
        Lock lock;
        this.f53450b = xwj;
        this.f53451c = xwg;
        f53449f.mo25414c("initU2fDeviceCache", new Object[0]);
        this.f53452d.lock();
        try {
            this.f53453e = new xwf(new File(context.getFilesDir(), "fido.keyhandle.cache"));
            lock = this.f53452d;
        } catch (IOException e) {
            xwg xwg2 = this.f53451c;
            if (xwg2 != null) {
                xwg2.mo30184a(this.f53450b, e);
            }
            f53449f.mo25417e("initU2fDeviceCache failed", e, new Object[0]);
            lock = this.f53452d;
        } catch (Throwable th) {
            this.f53452d.unlock();
            throw th;
        }
        lock.unlock();
    }

    /* renamed from: a */
    public static final String m43684a(Transport transport, String str) {
        String valueOf = String.valueOf(transport);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append("-");
        sb.append(str);
        return sb.toString();
    }
}
