package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: bbxp */
final /* synthetic */ class bbxp implements Runnable {

    /* renamed from: a */
    private final bbxu f103697a;

    /* renamed from: b */
    private final int f103698b;

    /* renamed from: c */
    private final ConversationId f103699c;

    /* renamed from: d */
    private final bcoh f103700d;

    public bbxp(bbxu bbxu, int i, ConversationId conversationId, bcoh bcoh) {
        this.f103697a = bbxu;
        this.f103698b = i;
        this.f103699c = conversationId;
        this.f103700d = bcoh;
    }

    public final void run() {
        long j;
        int i;
        bbxu bbxu = this.f103697a;
        int i2 = this.f103698b;
        ConversationId conversationId = this.f103699c;
        bcoh bcoh = this.f103700d;
        long longValue = ((Long) bbqt.m88417a(bbxu.f103723a).f103140ai.mo58455c()).longValue();
        long micros = TimeUnit.MILLISECONDS.toMicros(((Long) bbqt.m88417a(bbxu.f103723a).f103139ah.mo58455c()).longValue());
        if (bbxu.mo56499a()) {
            boolean z = true;
            if (i2 != 1) {
                if (i2 == 2) {
                    i = 343;
                } else if (i2 == 3) {
                    i = 344;
                } else if (i2 != 4) {
                    bbos.m88294d("LitTypingIndicatorCntrl", "Unknown typing event");
                    i = 341;
                } else {
                    i = 345;
                }
                bbxu.mo56498a(bcoh, conversationId, false, micros, i);
                synchronized (bbxu) {
                    bbxu.f103726d.remove(conversationId);
                }
                return;
            }
            synchronized (bbxu) {
                if (bbxu.f103726d.containsKey(conversationId)) {
                    if (bbxu.f103727e.containsKey(conversationId)) {
                        bbon.m88284a();
                        if (System.currentTimeMillis() - ((Long) bbxu.f103727e.get(conversationId)).longValue() > TimeUnit.MICROSECONDS.toMillis(micros) - 2000) {
                            j = micros;
                        }
                    }
                    j = micros;
                    z = false;
                } else {
                    j = micros;
                    bbxu.f103728f.postDelayed(new bbxt(bbxu, bcoh, conversationId, longValue, micros), longValue);
                    z = true;
                }
                Map map = bbxu.f103726d;
                bbon.m88284a();
                map.put(conversationId, Long.valueOf(System.currentTimeMillis()));
            }
            if (z) {
                bbxu.mo56498a(bcoh, conversationId, true, j, 342);
            }
        }
    }
}
