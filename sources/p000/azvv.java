package p000;

import android.content.Context;
import android.webkit.JavascriptInterface;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* renamed from: azvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azvv extends azrk {

    /* renamed from: c */
    public final bbpk f100098c;

    /* renamed from: d */
    public final aztu f100099d;

    /* renamed from: e */
    final ConcurrentMap f100100e = bnmt.m109809c();

    /* renamed from: f */
    final ConcurrentMap f100101f = bnmt.m109809c();

    /* renamed from: g */
    final ConcurrentMap f100102g = bnmt.m109809c();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azvv(Context context, aztu aztu) {
        super(context);
        bbpk d = azbj.m85193a(context).mo54564d();
        this.f100098c = d;
        this.f100099d = aztu;
        this.f99943b.add(this.f100101f);
        this.f99943b.add(this.f100100e);
    }

    /* renamed from: a */
    public final String mo55250a() {
        return "MessagingController";
    }

    /* renamed from: b */
    public final String mo55303b(bqgg bqgg, int i) {
        try {
            bqgg.get();
            azqf.m86130a(this.f99942a);
            return azqf.m86145b("Success");
        } catch (InterruptedException | ExecutionException e) {
            azoj.m85931a("WAMessagingInterface", e, "Future failed to finish", new Object[0]);
            azph.m85998a(this.f99942a).mo55126a(i, 59);
            azqf.m86130a(this.f99942a);
            return azqf.m86138a("Void future from Lighter failed to finish.", new Object[0]);
        }
    }

    @JavascriptInterface
    @azqt
    public String deleteConversation(String str, String str2) {
        return mo55256a(str, str2, new azvu(this), 1539, 1540);
    }

    @JavascriptInterface
    @azqt
    public String getConversationAndSyncIfExpired(String str, String str2) {
        bmxj bmxj = azvp.f100092a;
        ConcurrentMap concurrentMap = this.f100101f;
        azrj azrj = new azrj(str, str2);
        azvq azvq = new azvq(this);
        aztu aztu = this.f100099d;
        aztu.getClass();
        return mo55258a(str, str2, bmxj, concurrentMap, azrj, azvq, new azvr(aztu), new azqy(this, azvs.f100095a, str2), 1513, 1514);
    }

    @JavascriptInterface
    @azqt
    public String getConversations(String str, int i, int i2) {
        bmxj bmxj = azuo.f100057a;
        ConcurrentMap concurrentMap = this.f100100e;
        azrj azrj = new azrj(str, Integer.valueOf(i), Integer.valueOf(i2));
        azuz azuz = new azuz(this, i, i2);
        aztu aztu = this.f100099d;
        aztu.getClass();
        return mo55258a(str, str, bmxj, concurrentMap, azrj, azuz, new azvk(aztu), new azvo(this), 1507, 1508);
    }

    @JavascriptInterface
    @azqt
    public String getMessagesForConversationByRenderingType(String str, String str2, int i, String str3) {
        String str4 = str2;
        String str5 = str3;
        azqf.m86130a(this.f99942a);
        bmxv a = azqf.m86132a(str5, azvd.f100077a);
        if (!a.mo66813a() || ((bngx) a.mo66814b()).isEmpty()) {
            azqf.m86130a(this.f99942a);
            return azqf.m86138a("Failed to get rendering types.", new Object[0]);
        }
        return mo55258a(str, str2, azve.f100078a, this.f100102g, new azrj(str4, Integer.valueOf(i), str5), new azvf(this, i, (bctq[]) ((bngx) a.mo66814b()).toArray(new bctq[((bngx) a.mo66814b()).size()])), new azvg(this, str2), new azvh(this), 1510, 1511);
    }

    @JavascriptInterface
    @azqt
    public String markMessagesAsReadForConversation(String str, String str2) {
        return mo55256a(str, str2, new azvt(this), 1521, 1522);
    }

    @JavascriptInterface
    @azqt
    public String postLocalMessage(String str, String str2) {
        return mo55257a(str, str2, new azus(this), new azut(this), new azuu(this), 1831, 1832);
    }

    @JavascriptInterface
    @azqt
    public String sendActionCallbackEvent(String str, String str2, String str3, String str4, String str5) {
        azqf.m86130a(this.f99942a);
        bmxv b = azqf.m86144b(str3, azuy.f100067a);
        if (b.mo66813a()) {
            return mo55257a(str, str2, azva.f100071a, new azvb(this, b, str4, str5), new azvc(this), 1833, 1834);
        }
        azoj.m85933c("WAMessagingInterface", "Could not parse event callack destination %s", str3);
        azph.m85998a(this.f99942a).mo55126a(1834, 60);
        azqf.m86130a(this.f99942a);
        return azqf.m86138a("Invalid event callack destination.", new Object[0]);
    }

    @JavascriptInterface
    @azqt
    public String sendMessage(String str, String str2) {
        bbpk bbpk = this.f100098c;
        bbpk.getClass();
        return mo55257a(str, str2, new azvi(bbpk), new azvj(this), new azvl(this), 1838, 1839);
    }

    @JavascriptInterface
    @azqt
    public String syncCloudDeleteConversation(String str, String str2) {
        return mo55257a(str, str2, azup.f100058a, new azuq(this), new azur(this), 1843, 1844);
    }

    @JavascriptInterface
    @azqt
    public String updateMessageProperties(String str, String str2) {
        return mo55257a(str, str2, new azuv(this), new azuw(this), new azux(this), 1835, 1836);
    }
}
