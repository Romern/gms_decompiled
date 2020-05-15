package p000;

import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.lang.ref.WeakReference;

/* renamed from: azqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azqh {

    /* renamed from: b */
    private static WeakReference f99883b = new WeakReference(null);

    /* renamed from: a */
    public final Context f99884a;

    public azqh(Context context) {
        this.f99884a = context;
    }

    /* renamed from: a */
    public static synchronized azqh m86163a(Context context) {
        azqh azqh;
        synchronized (azqh.class) {
            azqh = (azqh) f99883b.get();
            if (azqh == null) {
                azqh = new azqh(context.getApplicationContext());
                f99883b = new WeakReference(azqh);
            }
        }
        return azqh;
    }

    /* renamed from: a */
    public static final String m86164a(ConversationId conversationId) {
        if (conversationId.mo60556c() == ConversationId.IdType.ONE_TO_ONE) {
            return conversationId.mo60558e().mo60493b();
        }
        return conversationId.mo60557d().mo60504b();
    }

    /* renamed from: a */
    public final cbbl mo55218a(cbbl cbbl) {
        if (azqf.m86130a(this.f99884a).mo55211a(cbbl.f176591o).mo66813a()) {
            return cbbl;
        }
        bxvd bxvd = (bxvd) cbbl.mo74142c(5);
        bxvd.mo73625a((bxvk) cbbl);
        "lighter_system_key".getClass();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        cbbl cbbl2 = (cbbl) bxvd.f164949b;
        bxww bxww = cbbl2.f176590n;
        if (!bxww.f165014a) {
            cbbl2.f176590n = bxww.mo74203a();
        }
        cbbl2.f176590n.remove("lighter_system_key");
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        ((cbbl) bxvd.f164949b).f176591o = 0;
        return (cbbl) bxvd.mo74062i();
    }
}
