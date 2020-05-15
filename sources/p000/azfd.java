package p000;

import android.content.Context;
import android.util.Base64;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: azfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azfd implements azgw {

    /* renamed from: a */
    private final Context f99216a;

    /* renamed from: b */
    private final cbkj f99217b;

    /* renamed from: c */
    private final azet f99218c;

    /* renamed from: d */
    private bcoh f99219d;

    public azfd(Context context, cbkj cbkj, azet azet) {
        String valueOf = String.valueOf(cbkj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("Lighter message received: ");
        sb.append(valueOf);
        sb.toString();
        Context applicationContext = context.getApplicationContext();
        this.f99216a = applicationContext;
        this.f99217b = cbkj;
        this.f99218c = azet;
        azph.m85998a(applicationContext).mo55125a(1720);
        azcv a = azcv.m85357a(context);
        cbma cbma = cbkj.f177414h;
        azct c = a.mo54699c(LocalEntityId.m94551b(cbma == null ? cbma.f177591f : cbma));
        if (c != null) {
            List list = c.f99010g;
            if (!list.isEmpty()) {
                LocalEntityId localEntityId = (LocalEntityId) list.get(0);
                bcsk f = ContactId.m94830f();
                f.mo57453b(localEntityId.f111074a);
                f.mo57454c("MS");
                azqf.m86130a(this.f99216a);
                f.mo57451a(azqf.m86134a(localEntityId.f111075b));
                ContactId a2 = f.mo57450a();
                try {
                    bmxv bmxv = (bmxv) azbj.m85193a(context.getApplicationContext()).mo54563c().mo56342c(a2).get();
                    if (!bmxv.mo66813a()) {
                        azbr.m85217a(context, c);
                        bmxv bmxv2 = (bmxv) azbj.m85193a(context.getApplicationContext()).mo54563c().mo56342c(a2).get();
                        if (!bmxv2.mo66813a()) {
                            azoj.m85933c("LitMsgHandler", "Failed to migrate registration to Lighter on receiving message", new Object[0]);
                            azph.m85998a(this.f99216a).mo55126a(1722, 49);
                            return;
                        }
                        this.f99219d = (bcoh) bmxv2.mo66814b();
                        return;
                    }
                    this.f99219d = (bcoh) bmxv.mo66814b();
                } catch (InterruptedException | ExecutionException e) {
                    String valueOf2 = String.valueOf(a2);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 39);
                    sb2.append("Exception getting account context for: ");
                    sb2.append(valueOf2);
                    azoj.m85933c("LitMsgHandler", sb2.toString(), new Object[0]);
                    azph.m85998a(this.f99216a).mo55126a(1723, 59);
                }
            } else {
                azoj.m85933c("LitMsgHandler", "No users for registration", new Object[0]);
                azph.m85998a(this.f99216a).mo55126a(1724, 49);
            }
        } else {
            azoj.m85933c("LitMsgHandler", "Failed to get registration info for user ID", new Object[0]);
            azph.m85998a(this.f99216a).mo55126a(1725, 49);
        }
    }

    /* renamed from: a */
    public final void mo54860a(azbz azbz) {
    }

    /* renamed from: b */
    public final azdd mo54862b() {
        return null;
    }

    /* renamed from: c */
    public final void mo54863c() {
    }

    /* renamed from: a */
    public final boolean mo54861a() {
        if (this.f99219d == null) {
            azoj.m85933c("LitMsgHandler", "No account context found", new Object[0]);
            azph.m85998a(this.f99216a).mo55126a(1726, 49);
            return false;
        }
        try {
            if (azbm.m85205a(this.f99216a).f98909d.f98917b.get() == null) {
                azbm.m85205a(this.f99216a).f98909d.mo54575a(this.f99218c.f99193i);
            }
            boolean booleanValue = ((Boolean) azbj.m85193a(this.f99216a).mo54564d().mo56320a(this.f99219d, Base64.encode(this.f99217b.serializeToBytes(), 8)).get()).booleanValue();
            if (booleanValue) {
                this.f99218c.mo54843a(Collections.singletonList(this.f99217b.f177409c));
                azph.m85998a(this.f99216a).mo55125a(1721);
            }
            return booleanValue;
        } catch (InterruptedException | ExecutionException e) {
            azph.m85998a(this.f99216a).mo55126a(1726, 59);
            return false;
        }
    }
}
