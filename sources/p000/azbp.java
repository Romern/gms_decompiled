package p000;

import android.content.Intent;
import org.json.JSONObject;

/* renamed from: azbp */
final /* synthetic */ class azbp implements bdaq {

    /* renamed from: a */
    private final azbq f98915a;

    public azbp(azbq azbq) {
        this.f98915a = azbq;
    }

    /* renamed from: a */
    public final void mo54573a(Object obj) {
        azqf a = azqf.m86130a(this.f98915a.f98916a);
        azph.m85998a(a.f99879a).mo55125a(1933);
        bmxv o = ((bcsp) obj).mo57471o();
        Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.conversation_updated");
        if (o.mo66813a()) {
            intent.putExtra("extra_conversation_json", ((JSONObject) o.mo66814b()).toString());
            intent.setPackage(a.f99879a.getPackageName());
            a.f99879a.sendBroadcast(intent);
            return;
        }
        azph.m85998a(a.f99879a).mo55126a(1934, 60);
    }
}
