package p000;

import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;

/* renamed from: ogq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ogq extends nvt {
    public ogq(ogs ogs, Looper looper) {
        super(ogs, looper);
    }

    public final void handleMessage(Message message) {
        oga oga;
        ogs ogs = (ogs) mo21726f();
        if (ogs == null) {
            bnsi d = ogs.f37577a.mo68390d();
            d.mo68432a("ogq", "handleMessage", 1092, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Dropping message, no channel manager");
            return;
        }
        synchronized (ogs.f37580d) {
            oga = ogs.f37579c[message.arg1];
        }
        int i = message.what;
        if (i == 0) {
            ByteBuffer byteBuffer = (ByteBuffer) message.obj;
            if (oga.f37537h == 2) {
                oga.f37533d.mo22108a(byteBuffer);
            }
        } else if (i == 1) {
            ByteBuffer byteBuffer2 = (ByteBuffer) message.obj;
            short s = byteBuffer2.getShort();
            ByteBuffer slice = byteBuffer2.slice();
            ofx ofx = oga.f37539j;
            ofz ofz = (ofz) ofx.f37528a.get(s);
            if (ofz != null) {
                oga oga2 = ofx.f37529b;
                bnsn bnsn = oga.f37530a;
                synchronized (oga2.f37540k) {
                    ofz.mo22109a(slice);
                }
            }
        } else if (i == 2) {
            oga.f37533d.mo22087b(message.arg2);
        } else {
            int i2 = message.what;
            StringBuilder sb = new StringBuilder(27);
            sb.append("Unknown message ");
            sb.append(i2);
            throw new RuntimeException(sb.toString());
        }
    }
}
