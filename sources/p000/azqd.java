package p000;

import android.util.Base64;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.concurrent.TimeUnit;

/* renamed from: azqd */
final /* synthetic */ class azqd implements Runnable {

    /* renamed from: a */
    private final azqf f99869a;

    /* renamed from: b */
    private final bcoh f99870b;

    /* renamed from: c */
    private final ConversationId f99871c;

    /* renamed from: d */
    private final String f99872d;

    public azqd(azqf azqf, bcoh bcoh, ConversationId conversationId, String str) {
        this.f99869a = azqf;
        this.f99870b = bcoh;
        this.f99871c = conversationId;
        this.f99872d = str;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bbpk.a(bcoh, com.google.android.libraries.messaging.lighter.model.ConversationId, java.lang.Integer, java.lang.Integer, bctq[]):bdar
     arg types: [bcoh, com.google.android.libraries.messaging.lighter.model.ConversationId, ?[OBJECT, ARRAY], int, bctq[]]
     candidates:
      bbpk.a(bcoh, com.google.android.libraries.messaging.lighter.model.ConversationId, bcop, java.lang.String, bmxv):bqgg
      bbpk.a(bcoh, com.google.android.libraries.messaging.lighter.model.ConversationId, java.lang.Integer, java.lang.Integer, bctq[]):bdar */
    public final void run() {
        azqf azqf = this.f99869a;
        bcoh bcoh = this.f99870b;
        ConversationId conversationId = this.f99871c;
        String str = this.f99872d;
        bmxv a = azqf.m86131a(azbj.m85193a(azqf.f99879a).mo54564d().mo56312a(bcoh, conversationId, (Integer) null, (Integer) 0, bctq.f104884e));
        if (!a.mo66813a() || !((bngx) a.mo66814b()).isEmpty()) {
            azph.m85998a(azqf.f99879a).mo55146a(1848, conversationId);
            return;
        }
        azph.m85998a(azqf.f99879a).mo55146a(1846, conversationId);
        cbds a2 = azqf.m86133a(conversationId.mo60558e());
        cbds a3 = azqf.m86133a(conversationId.mo60498a());
        bxvd da = cbff.f176892t.mo74144da();
        int hashCode = conversationId.hashCode();
        StringBuilder sb = new StringBuilder(31);
        sb.append("fake-welcome-message");
        sb.append(hashCode);
        String sb2 = sb.toString();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        sb2.getClass();
        ((cbff) da.f164949b).f176900g = sb2;
        cbei cbei = cbei.TEXT;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbff) da.f164949b).f176905l = cbei.mo3214a();
        bxvd da2 = cbfk.f176928b.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        str.getClass();
        ((cbfk) da2.f164949b).f176930a = str;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbff cbff = (cbff) da.f164949b;
        cbfk cbfk = (cbfk) da2.mo74062i();
        cbfk.getClass();
        cbff.f176897d = cbfk;
        cbff.f176896c = 102;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a2.getClass();
        ((cbff) da.f164949b).f176902i = a2;
        bxvd da3 = cbdl.f176754d.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        ((cbdl) da3.f164949b).f176758c = cbej.m127774a(3);
        cbdz cbdz = (cbdz) cbea.f176814b.mo74144da();
        cbdz.mo75226a(a3);
        cbdz.mo75226a(a2);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        cbdl cbdl = (cbdl) da3.f164949b;
        cbea cbea = (cbea) cbdz.mo74062i();
        cbea.getClass();
        cbdl.f176757b = cbea;
        cbdl.f176756a = 101;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbdl cbdl2 = (cbdl) da3.mo74062i();
        cbdl2.getClass();
        ((cbff) da.f164949b).f176903j = cbdl2;
        long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbff cbff2 = (cbff) da.f164949b;
        cbff2.f176901h = micros;
        str.getClass();
        cbff2.f176904k = str;
        str.getClass();
        cbff2.f176907n = str;
        cbff2.f176908o = true;
        cbff2.f176911r = 0;
        bxvd da4 = cbkj.f177405k.mo74144da();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        ((cbkj) da4.f164949b).f177410d = cbki.m127937a(26);
        String str2 = ((cbff) da.f164949b).f176900g;
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        str2.getClass();
        ((cbkj) da4.f164949b).f177409c = str2;
        ByteString aL = ((cbff) da.mo74062i()).mo73639aL();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        aL.getClass();
        ((cbkj) da4.f164949b).f177411e = aL;
        long micros2 = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        ((cbkj) da4.f164949b).f177412f = micros2;
        azbj.m85193a(azqf.f99879a).mo54564d().mo56320a(bcoh, Base64.encode(((cbkj) da4.mo74062i()).serializeToBytes(), 8));
    }
}
