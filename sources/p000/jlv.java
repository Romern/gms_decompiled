package p000;

import android.content.SharedPreferences;
import java.util.HashSet;

/* renamed from: jlv */
final /* synthetic */ class jlv implements Runnable {

    /* renamed from: a */
    private final jma f22775a;

    public jlv(jma jma) {
        this.f22775a = jma;
    }

    public final void run() {
        jma jma = this.f22775a;
        if (!jma.f22803q.get()) {
            jll.m16886b(rpr.m34216b(), jma.f22793g, jma.f22792f, jma.f22791e);
        }
        if (!jma.f22794h) {
            jnm.m16980a();
            String str = jma.f22790d;
            String str2 = jma.f22793g;
            SharedPreferences sharedPreferences = rpr.m34216b().getSharedPreferences("ResponderGcmSecureChannelCrashRecoverer.PREF_FILE", 0);
            HashSet a = bnpf.m110049a((Iterable) sharedPreferences.getStringSet("CHANNEL_SET", new C1225nr()));
            String a2 = jnm.m16979a(str, str2);
            a.remove(a2);
            sharedPreferences.edit().putStringSet("CHANNEL_SET", a).remove(jnm.m16981b("MY_SHORT_DEVICE_ID", a2)).remove(jnm.m16981b("REMOTE_DEVICE_ID", a2)).remove(jnm.m16981b("PUBLIC_TOPIC_NAME", a2)).remove(jnm.m16981b("ACCOUNT_NAME", a2)).apply();
        }
        jma.f22788b.shutdownNow();
    }
}
