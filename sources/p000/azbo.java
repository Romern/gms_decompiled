package p000;

import android.content.Intent;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: azbo */
final /* synthetic */ class azbo implements bdaq {

    /* renamed from: a */
    private final azbq f98913a;

    /* renamed from: b */
    private final ConversationId f98914b;

    public azbo(azbq azbq, ConversationId conversationId) {
        this.f98913a = azbq;
        this.f98914b = conversationId;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: azqf.a(java.util.Collection, bmxj):org.json.JSONArray
     arg types: [bngx, azqb]
     candidates:
      azqf.a(java.lang.String, bmxj):bmxv
      azqf.a(bmxv, bmxv):java.lang.String
      azqf.a(java.lang.String, java.lang.Object[]):java.lang.String
      azqf.a(java.util.List, bmxj):java.util.List
      azqf.a(java.util.Collection, bmxj):org.json.JSONArray */
    /* renamed from: a */
    public final void mo54573a(Object obj) {
        azbq azbq = this.f98913a;
        ConversationId conversationId = this.f98914b;
        azqf a = azqf.m86130a(azbq.f98916a);
        JSONArray a2 = azqf.m86142a((Collection) ((bngx) obj), (bmxj) new azqb(a));
        bmxv g = conversationId.mo60559g();
        Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.messages_for_conversation_updated");
        if (g.mo66813a()) {
            intent.putExtra("extra_conversation_id_json", ((JSONObject) g.mo66814b()).toString());
        }
        intent.setPackage(a.f99879a.getPackageName());
        intent.putExtra("extra_messages_json_array", a2.toString());
        azph.m85998a(a.f99879a).mo55165b(1938);
        a.f99879a.sendBroadcast(intent);
    }
}
