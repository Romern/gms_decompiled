package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: azsg */
final /* synthetic */ class azsg implements azrh {

    /* renamed from: a */
    private final azto f99972a;

    /* renamed from: b */
    private final String f99973b;

    public azsg(azto azto, String str) {
        this.f99972a = azto;
        this.f99973b = str;
    }

    /* renamed from: a */
    public final Object mo55247a(bcoh bcoh, Object obj) {
        azto azto = this.f99972a;
        String str = this.f99973b;
        bctr a = azbj.m85193a(azto.f99942a).mo54564d().mo56307a((ConversationId) obj, str);
        azto.mo55260a(bcoh, a, 1);
        return a;
    }
}
