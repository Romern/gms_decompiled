package p000;

import com.google.android.gms.car.senderprotocol.ChannelMessage;
import java.util.ArrayList;
import java.util.List;

/* renamed from: oht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class oht implements ohs {

    /* renamed from: a */
    private final List f37684a = new ArrayList();

    /* renamed from: a */
    public final void mo22116a(ChannelMessage channelMessage) {
        this.f37684a.add(channelMessage);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22174a(ohs ohs) {
        List list = this.f37684a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ohs.mo22116a((ChannelMessage) list.get(i));
        }
        this.f37684a.clear();
    }
}
