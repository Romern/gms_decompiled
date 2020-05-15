package p000;

import android.location.Location;
import android.os.Looper;
import android.os.Message;
import java.util.Collection;

/* renamed from: bfso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfso extends adzt {

    /* renamed from: a */
    final /* synthetic */ bfsr f115153a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfso(bfsr bfsr, Looper looper) {
        super(looper);
        this.f115153a = bfsr;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            boolean z = true;
            if (i == 1) {
                this.f115153a.f114732e.mo62061b();
            } else if (i == 2) {
                bfrc bfrc = this.f115153a.f114732e;
                Collection collection = (Collection) message.obj;
                if (message.arg1 == 0) {
                    z = false;
                }
                bfrc.mo62059a(collection, z);
            } else if (i == 3) {
                this.f115153a.f114732e.mo62069a((Location) message.obj, message.arg1);
            } else if (i == 4) {
                this.f115153a.f114732e.mo62070a((bfps) message.obj);
            } else if (i == 5) {
                this.f115153a.f114732e.mo62071a((bfrb) message.obj);
            }
        } else {
            this.f115153a.f114732e.mo62058a();
        }
    }
}
