package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: azqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azqi {

    /* renamed from: a */
    private static WeakReference f99885a = new WeakReference(null);

    /* renamed from: b */
    private final Context f99886b;

    public azqi(Context context) {
        this.f99886b = context;
    }

    /* renamed from: a */
    public static synchronized azqi m86166a(Context context) {
        azqi azqi;
        synchronized (azqi.class) {
            azqi = (azqi) f99885a.get();
            if (azqi == null) {
                azqi = new azqi(context.getApplicationContext());
                f99885a = new WeakReference(azqi);
            }
        }
        return azqi;
    }

    /* renamed from: a */
    private final void m86167a(String str, String str2) {
        Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.UPDATE_WEB_APP");
        intent.setPackage(this.f99886b.getPackageName());
        intent.putExtra(str, str2);
        new Object[1][0] = str2;
        this.f99886b.sendBroadcast(intent);
    }

    /* renamed from: a */
    public final void mo55219a(bcoh bcoh) {
        bmxv g = bcoh.mo57062g();
        if (g.mo66813a()) {
            m86167a("account_context", ((JSONObject) g.mo66814b()).toString());
            azph.m85998a(this.f99886b).mo55125a(1819);
            return;
        }
        azoj.m85933c("WebAppBroadcastUtils", "Could not convert account context to JSON", new Object[0]);
        azph.m85998a(this.f99886b).mo55126a(1820, 60);
    }

    /* renamed from: a */
    public final void mo55220a(ConversationId conversationId) {
        bmxv g = conversationId.mo60559g();
        if (g.mo66813a()) {
            m86167a("lighter_conversation_id", ((JSONObject) g.mo66814b()).toString());
            azph.m85998a(this.f99886b).mo55146a(1548, conversationId);
            return;
        }
        mo55221a("Could not convert conversationId to JSON");
    }

    /* renamed from: a */
    public final void mo55221a(String str) {
        azoj.m85933c("WebAppBroadcastUtils", str, new Object[0]);
        azph.m85998a(this.f99886b).mo55172c(1549, str);
        m86167a("error", str);
    }

    /* renamed from: a */
    public final void mo55222a(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (JSONException e) {
                azoj.m85933c("WebAppBroadcastUtils", "Unable to add metadata map entry to JSONObject %s:%s", entry.getKey(), entry.getValue());
            }
        }
        m86167a("intent_map", jSONObject.toString());
        azph.m85998a(this.f99886b).mo55125a(1809);
    }
}
