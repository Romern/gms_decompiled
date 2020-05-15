package p000;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: bvdy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bvdy implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ bved f155687a;

    public bvdy(bved bved) {
        this.f155687a = bved;
    }

    public final boolean handleMessage(Message message) {
        if (this.f155687a.mo73358b()) {
            return false;
        }
        int i = message.what;
        if (i == 1) {
            this.f155687a.f155702h.set(true);
            this.f155687a.f155701g = SystemClock.elapsedRealtime();
            synchronized (this.f155687a.f155695a) {
                int size = this.f155687a.f155695a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    srn srn = bvcm.f155598a;
                    this.f155687a.f155695a.keyAt(i2);
                    ((bvct) this.f155687a.f155695a.valueAt(i2)).mo73286b();
                }
                this.f155687a.f155698d.shutdownNow();
                try {
                    this.f155687a.f155698d.awaitTermination(5, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                }
                srn srn2 = bvcm.f155598a;
                bved bved = this.f155687a;
                bved.f155697c.mo72987c(bved.f155704j);
            }
        } else if (i == 2) {
            bvct bvct = (bvct) message.obj;
            if (this.f155687a.f155702h.get()) {
                this.f155687a.mo73355a(Integer.valueOf(bvct.f155605k));
            } else {
                bvct.mo73285a();
            }
        } else if (i == 3) {
            ((bvct) message.obj).mo73286b();
        } else if (i == 4 || i == 5) {
            ((bvcv) message.obj).mo73327a();
        } else {
            int i3 = message.what;
            StringBuilder sb = new StringBuilder(53);
            sb.append("NearbyDirectService Unknown message type: ");
            sb.append(i3);
            throw new RuntimeException(sb.toString());
        }
        return true;
    }
}
