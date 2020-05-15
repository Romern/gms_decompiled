package p000;

import com.google.android.gms.car.senderprotocol.ChannelMessage;
import java.util.Comparator;

/* renamed from: oje */
final /* synthetic */ class oje implements Comparator {

    /* renamed from: a */
    private final ojg f37743a;

    public oje(ojg ojg) {
        this.f37743a = ojg;
    }

    public final int compare(Object obj, Object obj2) {
        ojg ojg = this.f37743a;
        ChannelMessage channelMessage = (ChannelMessage) obj;
        ChannelMessage channelMessage2 = (ChannelMessage) obj2;
        bmxy.m108581a(channelMessage);
        int i = channelMessage.f29509b;
        bmxy.m108581a(channelMessage2);
        int i2 = channelMessage2.f29509b;
        olk olk = (olk) ojg.f37746b.get(Integer.valueOf(i));
        olk olk2 = (olk) ojg.f37746b.get(Integer.valueOf(i2));
        bneu bneu = bneu.f131545b;
        bmxy.m108581a(olk);
        int i3 = olk.f37912f;
        bmxy.m108581a(olk2);
        return bneu.mo67471a(i3, olk2.f37912f).mo67472a(channelMessage.f29517j, channelMessage2.f29517j).mo67470a();
    }
}
