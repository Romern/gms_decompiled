package p000;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.car.senderprotocol.ChannelMessage;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: ohe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ohe extends adzt {

    /* renamed from: a */
    final /* synthetic */ ohf f37629a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ohe(ohf ohf, Looper looper) {
        super(looper);
        this.f37629a = ohf;
    }

    public final void handleMessage(Message message) {
        try {
            int i = message.what;
            if (i == 1) {
                ChannelMessage channelMessage = (ChannelMessage) message.obj;
                if (this.f37629a.f37856d) {
                    this.f37629a.f37858f.mo22172a(channelMessage, true);
                    return;
                }
                ohf ohf = this.f37629a;
                bnsn bnsn = ohf.f37630a;
                ohf.f37631b.add(channelMessage);
            } else if (i != 2) {
                bnsi b = ohf.f37630a.mo68387b();
                b.mo68432a("ohe", "handleMessage", 102, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Unexpected message");
            } else {
                ohf ohf2 = this.f37629a;
                bnsn bnsn2 = ohf.f37630a;
                Iterator it = ohf2.f37631b.iterator();
                while (it.hasNext()) {
                    this.f37629a.f37858f.mo22172a((ChannelMessage) it.next(), true);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
