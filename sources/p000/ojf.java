package p000;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.car.senderprotocol.ChannelMessage;
import java.io.IOException;

/* renamed from: ojf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ojf extends adzt {

    /* renamed from: a */
    final /* synthetic */ ojg f37744a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ojf(ojg ojg, Looper looper) {
        super(looper);
        this.f37744a = ojg;
    }

    public final void handleMessage(Message message) {
        ChannelMessage channelMessage;
        try {
            if (message.what == 1) {
                while (true) {
                    if (this.f37744a.f37856d) {
                        channelMessage = (ChannelMessage) this.f37744a.f37747c.poll();
                    } else {
                        channelMessage = null;
                    }
                    if (channelMessage != null) {
                        ojg ojg = this.f37744a;
                        ojg.f37858f.mo22172a(channelMessage, ojg.f37747c.isEmpty());
                    } else {
                        return;
                    }
                }
            } else {
                bnsi b = ojg.f37745a.mo68387b();
                b.mo68432a("ojf", "handleMessage", 181, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Unexpected message");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
