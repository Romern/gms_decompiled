package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.HashMap;

/* renamed from: bcbh */
final /* synthetic */ class bcbh implements bmxj {

    /* renamed from: a */
    static final bmxj f103932a = new bcbh();

    private bcbh() {
    }

    public final Object apply(Object obj) {
        HashMap hashMap = (HashMap) obj;
        try {
            int b = bcoq.m89517b(((Integer) hashMap.get("EVENT_CALLBACK_DESTINATION_TYPE")).intValue()) - 1;
            if (b == 1) {
                bmxv a = bcbw.m88776a((HashMap) hashMap.get("EVENT_CALLBACK_DESTINATION"));
                if (a.mo66813a()) {
                    return bmxv.m108566b(bcpo.m89592a((ContactId) a.mo66814b()));
                }
            } else if (b != 2) {
                try {
                    bbos.m88294d("EventCallDestConvter", "encountered unknown EventCallbackDestinationType");
                    return bmvz.f131120a;
                } catch (IllegalStateException | NullPointerException e) {
                    bbos.m88292b("EventCallDestConvter", "failed to convert Map to EventCallbackDestination", e);
                    return bmvz.f131120a;
                }
            } else {
                bmxv a2 = bcca.m88790a((HashMap) hashMap.get("EVENT_CALLBACK_DESTINATION"));
                if (a2.mo66813a()) {
                    return bmxv.m108566b(bcpo.m89593a((ConversationId.GroupId) a2.mo66814b()));
                }
            }
            return bmvz.f131120a;
        } catch (ClassCastException e2) {
            return bmvz.f131120a;
        }
    }
}
