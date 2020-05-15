package p000;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import org.json.JSONArray;

/* renamed from: azto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azto extends azrk {

    /* renamed from: c */
    public final aztu f100017c;

    /* renamed from: d */
    final ConcurrentMap f100018d = bnmt.m109809c();

    /* renamed from: e */
    final ConcurrentMap f100019e = bnmt.m109809c();

    /* renamed from: f */
    final ConcurrentMap f100020f = bnmt.m109809c();

    /* renamed from: g */
    final ConcurrentMap f100021g = bnmt.m109809c();

    /* renamed from: h */
    final ConcurrentMap f100022h = bnmt.m109809c();

    public azto(Context context, aztu aztu) {
        super(context);
        this.f100017c = aztu;
        this.f99943b.add(this.f100019e);
        this.f99943b.add(this.f100020f);
        this.f99943b.add(this.f100021g);
        this.f99943b.add(this.f100018d);
        this.f99943b.add(this.f100022h);
    }

    /* renamed from: a */
    public final String mo55250a() {
        return "Lighter";
    }

    @JavascriptInterface
    @azqt
    public String blockConversation(String str) {
        return mo55253a(str, new azsy(this), 1525, 1526);
    }

    @JavascriptInterface
    @azqt
    public String blockConversationAndMarkAsSpam(String str) {
        return mo55253a(str, new azsx(this), 1527, 1528);
    }

    @JavascriptInterface
    @azqt
    @Deprecated
    public String createBitmapFromUri(String str) {
        bmxv a = azqf.m86130a(this.f99942a).mo55212a(str);
        if (a.mo66813a()) {
            azqf.m86130a(this.f99942a);
            return azqf.m86145b((String) a.mo66814b());
        }
        azqf.m86130a(this.f99942a);
        return azqf.m86138a("can not create bitmap from %s", str);
    }

    @JavascriptInterface
    @azqt
    public String deleteConversation(String str) {
        return mo55253a(str, new aztg(this), 1539, 1540);
    }

    @JavascriptInterface
    @azqt
    public String downloadImage(String str) {
        if (cfeo.m138890u()) {
            return mo55254a(str, new azsr(this), azss.f99989a, new azst(this), new azsv(this, str), 1553, 1554);
        }
        azoj.m85933c("LTWebAppInterface", "Photo flag is not enabled", new Object[0]);
        azqf.m86130a(this.f99942a);
        return azqf.m86138a("Photo flag is not enabled", new Object[0]);
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
    @JavascriptInterface
    @azqt
    public String getAllAccountContexts() {
        azph.m85998a(this.f99942a).mo55125a(1529);
        try {
            azqf.m86130a(this.f99942a);
            JSONArray a = azqf.m86142a((Collection) ((bngx) azbj.m85193a(this.f99942a).mo54563c().mo56338a().get()), azsw.f99994a);
            azqf.m86130a(this.f99942a);
            return azqf.m86139a(a);
        } catch (InterruptedException | ExecutionException e) {
            azoj.m85931a("LTWebAppInterface", e, "Exception while getting all accounts", new Object[0]);
            azph.m85998a(this.f99942a).mo55126a(1530, 59);
            azqf.m86130a(this.f99942a);
            return azqf.m86138a("Exception while getting all accounts", new Object[0]);
        }
    }

    @JavascriptInterface
    @azqt
    public String getContact(String str, String str2) {
        azqf.m86130a(this.f99942a);
        bmxv b = azqf.m86144b(str2, azrw.f99961a);
        if (!b.mo66813a()) {
            azoj.m85933c("LTWebAppInterface", "Could not parse Web app query %s", str2);
            azph.m85998a(this.f99942a).mo55126a(1518, 60);
            azqf.m86130a(this.f99942a);
            return azqf.m86138a("Could not parse %s", str2);
        }
        bmxj bmxj = azrx.f99962a;
        bmxj bmxj2 = azrz.f99964a;
        ConcurrentMap concurrentMap = this.f100018d;
        azrj azrj = new azrj(str, str2);
        azsa azsa = new azsa(this, b);
        aztu aztu = this.f100017c;
        aztu.getClass();
        return mo55255a(str, bmxj, bmxj2, concurrentMap, azrj, azsa, new azsb(aztu), azsc.f99968a, 1517, 1518);
    }

    @JavascriptInterface
    @azqt
    public String getConversation(String str) {
        bmxj bmxj = azrr.f99956a;
        bmxj bmxj2 = azrs.f99957a;
        ConcurrentMap concurrentMap = this.f100019e;
        azrj azrj = new azrj(str);
        azrt azrt = new azrt(this);
        aztu aztu = this.f100017c;
        aztu.getClass();
        return mo55255a(str, bmxj, bmxj2, concurrentMap, azrj, azrt, new azru(aztu), azrv.f99960a, 1513, 1514);
    }

    @JavascriptInterface
    @azqt
    public String getConversationBlock(String str) {
        return mo55259b(str, azta.f99998a, aztb.f99999a, this.f100022h, new azrj(str), new aztc(this), new aztd(this, str), new azte(this), 1596, 1597);
    }

    @JavascriptInterface
    @azqt
    public String getConversationsForAccount(String str, int i, int i2) {
        bmxj bmxj = azrn.f99951a;
        bmxj bmxj2 = azry.f99963a;
        ConcurrentMap concurrentMap = this.f100021g;
        azrj azrj = new azrj(str, Integer.valueOf(i), Integer.valueOf(i2));
        azsj azsj = new azsj(this, i, i2);
        aztu aztu = this.f100017c;
        aztu.getClass();
        return mo55259b(str, bmxj, bmxj2, concurrentMap, azrj, azsj, new azsu(aztu), new aztf(this), 1507, 1508);
    }

    @JavascriptInterface
    @azqt
    public String getMessage(String str, String str2) {
        return mo55254a(str2, azsn.f99982a, azso.f99983a, new azsp(this, str), new azsq(this, str), 1555, 1556);
    }

    @JavascriptInterface
    @azqt
    public String getMessagesForConversation(String str, int i) {
        return mo55259b(str, azti.f100007a, aztj.f100008a, this.f100020f, new azrj(str, Integer.valueOf(i)), new aztk(this, i), new aztl(this, str), new aztm(this, str), 1510, 1511);
    }

    @JavascriptInterface
    @azqt
    public void logError(int i, int i2, String str) {
        if (bopu.m111432b(i) == 0 || bopr.m111428b(i2) == 0) {
            logGenericEvent(String.format(Locale.getDefault(), "%s : %d | %d", "error", Integer.valueOf(i2), Integer.valueOf(i)), str);
            return;
        }
        azph.m85998a(this.f99942a).mo55173d(bopu.m111432b(i), bopr.m111428b(i2), str);
    }

    @JavascriptInterface
    @azqt
    public void logEvent(int i, String str) {
        if (bopu.m111432b(i) == 0) {
            logGenericEvent(Integer.toString(i), str);
        } else {
            azph.m85998a(this.f99942a).mo55168b(bopu.m111432b(i), str);
        }
    }

    @JavascriptInterface
    @azqt
    public void logEventWithMessageId(int i, String str, String str2) {
        if (bopu.m111432b(i) == 0) {
            logGenericEventWithMessageId(Integer.toString(i), str, str2);
        } else {
            azph.m85998a(this.f99942a).mo55150a(bopu.m111432b(i), str, str2);
        }
    }

    @JavascriptInterface
    @azqt
    public void logGenericEvent(String str, String str2) {
        azph a = azph.m85998a(this.f99942a);
        azqf.m86130a(a.f99818d);
        bmxv b = azqf.m86144b(str2, azpb.f99806a);
        if (b.mo66813a()) {
            a.mo55136a(1531, 0, str, null, null, (ConversationId) b.mo66814b());
        } else {
            a.mo55172c(1531, str);
        }
    }

    @JavascriptInterface
    @azqt
    public void logGenericEventWithMessageId(String str, String str2, String str3) {
        azph.m85998a(this.f99942a).mo55153a(1531, str, str2, str3);
    }

    @JavascriptInterface
    @azqt
    public String markConversationAsRead(String str) {
        return mo55253a(str, new azsd(this), 1521, 1522);
    }

    @JavascriptInterface
    @azqt
    public String retrySendingMessage(String str) {
        return mo55254a(str, new azsi(this), azsk.f99979a, new azsl(this), new azsm(this), 1546, 1547);
    }

    @JavascriptInterface
    @azqt
    public String sendTextMessage(String str, String str2) {
        return mo55254a(str, azse.f99970a, azsf.f99971a, new azsg(this, str2), new azsh(this), 1523, 1524);
    }

    @JavascriptInterface
    @azqt
    public String unblockConversation(String str) {
        return mo55253a(str, new azsz(this), 1532, 1533);
    }

    /* renamed from: a */
    public final void mo55260a(bcoh bcoh, bctr bctr, int i) {
        azbj.m85193a(this.f99942a).mo54564d().mo56318a(bcoh, bctr, i);
        azpw.m86109a(this.f99942a).mo55198a(bcoh, bctr);
    }
}
