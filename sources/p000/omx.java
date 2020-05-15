package p000;

import android.content.Context;
import android.hardware.usb.UsbManager;
import android.os.Looper;
import java.io.PrintWriter;

/* renamed from: omx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class omx {

    /* renamed from: a */
    private static omx f37976a;

    /* renamed from: a */
    public static omx m29200a(Context context) {
        bngx bngx;
        if (f37976a == null) {
            Context applicationContext = context.getApplicationContext();
            adzt adzt = new adzt(Looper.getMainLooper());
            ony a = ony.m29286a(applicationContext, (UsbManager) applicationContext.getSystemService("usb"));
            bngs bngs = new bngs();
            bngs.mo67668c(new ona(applicationContext, adzt, ccvx.f180056a.mo6606a().mo76899d()));
            if (ccvx.f180056a.mo6606a().mo76915t()) {
                bngs.mo67668c(new onl(applicationContext, adzt));
            }
            if (!ccvx.f180056a.mo6606a().mo76904i()) {
                bngx = bngs.mo67664a();
            } else {
                bngs bngs2 = new bngs();
                bnre i = bngs.mo67664a().listIterator();
                while (i.hasNext()) {
                    bngs2.mo67668c(new onq(applicationContext, (onm) i.next()));
                }
                bngx = bngs2.mo67664a();
            }
            f37976a = new omy(a, new ont(applicationContext, adzt, a, new onp(bngx), 50), applicationContext);
        }
        return f37976a;
    }

    /* renamed from: a */
    public abstract void mo22342a(PrintWriter printWriter);

    /* renamed from: a */
    public abstract void mo22343a(Object obj);

    /* renamed from: a */
    public abstract void mo22344a(Object obj, int i);

    /* renamed from: a */
    public abstract boolean mo22345a();
}
