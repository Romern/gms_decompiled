package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bcop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bcop {
    /* renamed from: a */
    public static bmxv m89512a(JSONObject jSONObject) {
        try {
            int b = bcoq.m89517b(jSONObject.getInt("EVENT_CALLBACK_DESTINATION_TYPE"));
            bcon bcon = bcon.UNKNOWN;
            int i = b - 1;
            if (i == 0) {
                return bmxv.m108566b(bcpm.f104662a);
            }
            if (i != 1) {
                bmxv a = ConversationId.GroupId.m94846a(jSONObject.getJSONObject("EVENT_CALLBACK_DESTINATION"));
                if (a.mo66813a()) {
                    return bmxv.m108566b(bcpo.m89593a((ConversationId.GroupId) a.mo66814b()));
                }
            } else {
                bmxv a2 = ContactId.m94828a(jSONObject.getJSONObject("EVENT_CALLBACK_DESTINATION"));
                if (a2.mo66813a()) {
                    return bmxv.m108566b(bcpo.m89592a((ContactId) a2.mo66814b()));
                }
            }
            return bmvz.f131120a;
        } catch (JSONException e) {
            bbos.m88294d("Action", "failed to convert JSONObject to EventCallbackDestination");
            return bmvz.f131120a;
        }
    }

    /* renamed from: a */
    public abstract ContactId mo57101a();

    /* renamed from: b */
    public abstract ConversationId.GroupId mo57102b();

    /* renamed from: c */
    public abstract int mo57103c();
}
