package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.car.senderprotocol.ChannelMessage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ojg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ojg extends okj {

    /* renamed from: a */
    public static final bnsn f37745a = odk.m28481a("CAR.GAL.GAL");

    /* renamed from: b */
    final Map f37746b = new HashMap();

    /* renamed from: c */
    final BlockingQueue f37747c = new PriorityBlockingQueue(80, new oje(this));

    /* renamed from: g */
    private final AtomicLong f37748g = new AtomicLong(1);

    /* renamed from: h */
    private volatile Handler f37749h;

    public ojg(oho oho, ogo ogo, Bundle bundle) {
        super(oho, ogo);
        if (bundle.containsKey("writer_channel_priority_state")) {
            this.f37746b.putAll((Map) ojq.m28925a(Map.class, bundle.getBinder("writer_channel_priority_state")));
        }
        if (bundle.containsKey("writer_message_queue_state")) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("writer_message_queue_state");
            bmxy.m108581a(parcelableArrayList);
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                ChannelMessage channelMessage = (ChannelMessage) parcelableArrayList.get(i);
                channelMessage.mo17393a(this.f37748g.getAndIncrement());
                mo22153a(channelMessage);
            }
        }
    }

    /* renamed from: a */
    private final void m28900a(int i) {
        Map map = this.f37746b;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            throw new IllegalStateException(String.format("Attempting to send a message on channel (%d) before it has been prepared", valueOf));
        } else if (this.f37746b.get(valueOf) == null) {
            throw new IllegalStateException(String.format("Attempting to send a message on channel (%d) without an assigned priority.", valueOf));
        }
    }

    /* access modifiers changed from: protected */
    public final void onLooperPrepared() {
        super.onLooperPrepared();
        this.f37749h = new ojf(this, getLooper());
        this.f37749h.sendEmptyMessage(1);
    }

    /* renamed from: a */
    public final void mo22152a(Bundle bundle) {
        bundle.putParcelableArrayList("writer_message_queue_state", new ArrayList(this.f37747c));
        bundle.putBinder("writer_channel_priority_state", (IBinder) ojq.m28926a(bnhe.m109413a(this.f37746b)));
    }

    /* renamed from: a */
    public final void mo22153a(ChannelMessage channelMessage) {
        m28900a(channelMessage.f29509b);
        if (!channelMessage.mo17394a()) {
            channelMessage.mo17393a(this.f37748g.getAndIncrement());
        }
        this.f37747c.add(channelMessage);
        if (this.f37749h != null) {
            this.f37749h.sendEmptyMessage(1);
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List, java.util.Collection], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final void mo22203a(Collection r8) {
        long andAdd = this.f37748g.getAndAdd((long) r8.size());
        int size = r8.size();
        for (int i = 0; i < size; i++) {
            ChannelMessage channelMessage = (ChannelMessage) r8.get(i);
            m28900a(channelMessage.f29509b);
            if (!channelMessage.mo17394a()) {
                channelMessage.mo17393a(andAdd);
                andAdd = 1 + andAdd;
            }
            this.f37747c.add(channelMessage);
        }
        if (this.f37749h != null) {
            this.f37749h.sendEmptyMessage(1);
        }
    }

    /* renamed from: a */
    public final void mo22204a(oga oga) {
        int i = oga.f37531b;
        this.f37746b.put(Integer.valueOf(i), oga.f37535f);
    }
}
