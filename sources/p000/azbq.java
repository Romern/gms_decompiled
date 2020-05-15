package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: azbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azbq implements bbpi {

    /* renamed from: a */
    public final Context f98916a;

    /* renamed from: b */
    public WeakReference f98917b;

    /* renamed from: c */
    final Map f98918c = new HashMap();

    /* renamed from: d */
    final Map f98919d = new HashMap();

    public azbq(Context context) {
        this.f98916a = context.getApplicationContext();
        this.f98917b = new WeakReference(null);
    }

    /* renamed from: a */
    public final void mo54574a() {
    }

    /* renamed from: b */
    public final void mo54578b() {
        this.f98918c.clear();
    }

    /* renamed from: a */
    public final void mo54575a(azfy azfy) {
        this.f98917b = new WeakReference(azfy);
    }

    /* renamed from: a */
    public final void mo54576a(bcoh bcoh, ConversationId conversationId) {
        if (!this.f98918c.containsKey(conversationId)) {
            bdar a = azbj.m85193a(this.f98916a).mo54564d().mo56311a(bcoh, conversationId, 5, 0);
            this.f98918c.put(conversationId, a);
            a.mo56710a((bdaq) new azbo(this, conversationId));
        } else {
            new Object[1][0] = conversationId;
        }
        if (!cfgs.m139397c()) {
            return;
        }
        if (!this.f98919d.containsKey(conversationId)) {
            azph.m85998a(this.f98916a).mo55146a(1932, conversationId);
            bdar a2 = azbj.m85193a(this.f98916a).mo54564d().mo56309a(bcoh, conversationId);
            this.f98919d.put(conversationId, a2);
            a2.mo56710a((bdaq) new azbp(this));
            return;
        }
        new Object[1][0] = conversationId;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    public final void mo54577a(ContactId contactId) {
        new Object[1][0] = contactId;
        if (!cfgs.m139391K()) {
            Intent intent = new Intent(this.f98916a, SilentRegisterIntentOperation.class);
            intent.setAction("com.google.android.gms.matchstick.gaia_register_intent_action");
            intent.putExtra("force_refresh", true);
            SilentRegisterIntentOperation.m94594b(intent, this.f98916a);
        }
        Intent intent2 = new Intent(this.f98916a, SilentRegisterIntentOperation.class);
        intent2.setAction("com.google.android.gms.matchstick.check_registration_with_lighter_action");
        SilentRegisterIntentOperation.m94594b(intent2, this.f98916a);
    }
}
