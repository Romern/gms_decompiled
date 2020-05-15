package p000;

import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

/* renamed from: aztu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aztu {

    /* renamed from: a */
    public azwo f100029a;

    /* renamed from: b */
    public final Context f100030b;

    public aztu(Context context, azwo azwo) {
        this.f100029a = azwo;
        this.f100030b = context.getApplicationContext();
    }

    /* renamed from: a */
    public final void mo55282a(bcoh bcoh) {
        bmxv g = bcoh.mo57062g();
        if (g.mo66813a()) {
            mo55291c(String.format("onCurrentAccountContextUpdated(%s)", g.mo66814b()));
            azph.m85998a(this.f100030b).mo55125a(1821);
            return;
        }
        azoj.m85933c("LTWebAppNotifier", "Failed to encode accountContext to JSONObject %s", bcoh);
        azph.m85998a(this.f100030b).mo55126a(1822, 58);
    }

    /* renamed from: b */
    public final void mo55290b(String str) {
        mo55291c(String.format("onError('%s')", str));
    }

    /* renamed from: c */
    public final void mo55291c(String str) {
        azwo azwo = this.f100029a;
        if (azwo == null) {
            azoj.m85933c("LTWebAppNotifier", "Attempting to notify already destroyed WebView", new Object[0]);
            azph.m85998a(this.f100030b).mo55126a(1727, 51);
            return;
        }
        new Object[1][0] = str;
        azwo.mo54821a(str);
    }

    /* renamed from: a */
    public final void mo55283a(bcsp bcsp) {
        bmxv o = bcsp.mo57471o();
        if (o.mo66813a()) {
            mo55287a(((JSONObject) o.mo66814b()).toString());
            return;
        }
        azoj.m85933c("LTWebAppNotifier", "Failed to convert conversation to JSONObject", new Object[0]);
        azph.m85998a(this.f100030b).mo55129a(1516, 58, bcsp.mo57317a());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: azqf.a(java.util.Collection, bmxj):org.json.JSONArray
     arg types: [bngx, bmxj]
     candidates:
      azqf.a(java.lang.String, bmxj):bmxv
      azqf.a(bmxv, bmxv):java.lang.String
      azqf.a(java.lang.String, java.lang.Object[]):java.lang.String
      azqf.a(java.util.List, bmxj):java.util.List
      azqf.a(java.util.Collection, bmxj):org.json.JSONArray */
    /* renamed from: a */
    public final void mo55284a(bngx bngx) {
        azqf.m86130a(this.f100030b);
        mo55291c(String.format("onConversationsForAccountUpdated(%s)", azqf.m86142a((Collection) bngx, aztp.f100023a)));
        azph.m85998a(this.f100030b).mo55125a(1509);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: azqf.a(java.util.List, bmxj):java.util.List
     arg types: [bngx, aztq]
     candidates:
      azqf.a(java.lang.String, bmxj):bmxv
      azqf.a(bmxv, bmxv):java.lang.String
      azqf.a(java.lang.String, java.lang.Object[]):java.lang.String
      azqf.a(java.util.Collection, bmxj):org.json.JSONArray
      azqf.a(java.util.List, bmxj):java.util.List */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: azqf.a(java.util.Collection, bmxj):org.json.JSONArray
     arg types: [bngx, azts]
     candidates:
      azqf.a(java.lang.String, bmxj):bmxv
      azqf.a(bmxv, bmxv):java.lang.String
      azqf.a(java.lang.String, java.lang.Object[]):java.lang.String
      azqf.a(java.util.List, bmxj):java.util.List
      azqf.a(java.util.Collection, bmxj):org.json.JSONArray */
    /* renamed from: a */
    public final void mo55285a(bngx bngx, String str) {
        if (!cfgs.m139400f() || !cfgs.m139405k()) {
            azqf.m86130a(this.f100030b);
            mo55288a(azqf.m86142a((Collection) bngx, (bmxj) new azts(this)).toString(), str);
            return;
        }
        List a = azqf.m86130a(this.f100030b).mo55213a((List) bngx, (bmxj) new aztq(this));
        azqf.m86130a(this.f100030b);
        azqf.m86148b(a, new aztr(this, str));
    }

    /* renamed from: a */
    public final void mo55286a(ConversationId conversationId) {
        bmxv g = conversationId.mo60559g();
        if (g.mo66813a()) {
            mo55291c(String.format("onNewConversationId(%s)", g.mo66814b()));
            azph.m85998a(this.f100030b).mo55146a(1568, conversationId);
            return;
        }
        azoj.m85933c("LTWebAppNotifier", "Failed to encode conversationId to JSONObject %s", conversationId);
        azph.m85998a(this.f100030b).mo55126a(1569, 58);
    }

    /* renamed from: a */
    public final void mo55287a(String str) {
        mo55291c(String.format("onConversationUpdated(%s)", str));
        azph.m85998a(this.f100030b).mo55168b(1515, str);
    }

    /* renamed from: a */
    public final void mo55288a(String str, String str2) {
        mo55291c(String.format("onMessagesForConversationUpdated(%s, %s)", str, str2));
        azph.m85998a(this.f100030b).mo55168b(1512, str2);
    }

    /* renamed from: a */
    public final void mo55289a(boolean z) {
        mo55291c(String.format("onVisibilityChanged(%b)", Boolean.valueOf(z)));
    }
}
