package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification;
import com.google.android.libraries.messaging.lighter.model.Notification;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: azpw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azpw {

    /* renamed from: b */
    public static final /* synthetic */ int f99858b = 0;

    /* renamed from: c */
    private static WeakReference f99859c = new WeakReference(null);

    /* renamed from: a */
    public final Context f99860a;

    public azpw(Context context) {
        this.f99860a = context;
    }

    /* renamed from: a */
    public static synchronized azpw m86109a(Context context) {
        azpw azpw;
        synchronized (azpw.class) {
            azpw = (azpw) f99859c.get();
            if (azpw == null) {
                azpw = new azpw(context.getApplicationContext());
                f99859c = new WeakReference(azpw);
            }
        }
        return azpw;
    }

    /* renamed from: b */
    public final azam mo55202b(bcoh bcoh, ConversationId conversationId) {
        Bitmap bitmap;
        Bitmap bitmap2;
        azam azam = new azam();
        azqf.m86130a(this.f99860a);
        String a = azqf.m86137a(conversationId);
        new azpv(this, a).start();
        if (!azcd.m85252a(this.f99860a).mo54619k(a)) {
            azoj.m85933c("LTNotifUtils", "Delayed notification for Lighter message because AppData not synced for %s", a);
        } else {
            azop.m85954a(this.f99860a, azam, a);
        }
        if (conversationId.mo60556c() == ConversationId.IdType.ONE_TO_ONE) {
            bdar a2 = azbj.m85193a(this.f99860a).mo54568h().mo56305a(bcoh, conversationId.mo60558e());
            azqf.m86130a(this.f99860a);
            bmxv a3 = azqf.m86131a(a2);
            if (a3.mo66813a()) {
                bcsj bcsj = (bcsj) a3.mo66814b();
                if (bcsj.mo57303b().mo66813a()) {
                    azam.f98844h = (String) bcsj.mo57303b().mo66814b();
                    azam.f98850n = bmxv.m108566b((String) bcsj.mo57303b().mo66814b());
                } else {
                    azoj.m85933c("LTNotifUtils", "Failed to get name from Contact %s", bcsj);
                    azph.m85998a(this.f99860a).mo55129a(1430, 44, conversationId);
                }
                bmxv e = bcsj.mo57306e();
                if (e.mo66813a()) {
                    bitmap2 = (Bitmap) e.mo66814b();
                } else {
                    azoj.m85933c("LTNotifUtils", "Could not find avatar image for contact %s", bcsj);
                    azph.m85998a(this.f99860a).mo55129a(1429, 44, conversationId);
                    bitmap2 = azny.m85881a(this.f99860a);
                }
                azam.f98837a = bitmap2;
            } else {
                azoj.m85933c("LTNotifUtils", "Error when getting Contact to post notification", new Object[0]);
                azam.f98837a = azny.m85881a(this.f99860a);
                azph.m85998a(this.f99860a).mo55129a(1431, 44, conversationId);
            }
        } else {
            bdar a4 = azbj.m85193a(this.f99860a).mo54564d().mo56309a(bcoh, conversationId);
            azqf.m86130a(this.f99860a);
            bmxv a5 = azqf.m86131a(a4);
            if (a5.mo66813a()) {
                bcsp bcsp = (bcsp) a5.mo66814b();
                if (bcsp.mo57318b().mo66813a()) {
                    azam.f98844h = (String) bcsp.mo57318b().mo66814b();
                    azam.f98850n = bmxv.m108566b((String) bcsp.mo57318b().mo66814b());
                } else {
                    azoj.m85933c("LTNotifUtils", "Failed to get title from Conversation %s", bcsp);
                    azph.m85998a(this.f99860a).mo55129a(1430, 45, conversationId);
                }
                bmxv d = bcsp.mo57320d();
                if (d.mo66813a()) {
                    bitmap = (Bitmap) d.mo66814b();
                } else {
                    azoj.m85933c("LTNotifUtils", "Could not find avatar image for conversation %s", bcsp);
                    azph.m85998a(this.f99860a).mo55129a(1429, 45, conversationId);
                    bitmap = azny.m85881a(this.f99860a);
                }
                azam.f98837a = bitmap;
            } else {
                azoj.m85933c("LTNotifUtils", "Error when getting Conversation to post notification", new Object[0]);
                azam.f98837a = azny.m85881a(this.f99860a);
                azph.m85998a(this.f99860a).mo55129a(1432, 45, conversationId);
            }
        }
        return azam;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
        if ((r1.getCause() instanceof p000.bxwf) != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0092, code lost:
        throw ((p000.bxwf) r1.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0094, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009b, code lost:
        if ((r1.getCause() instanceof p000.bxwf) == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a6, code lost:
        throw new p000.bxwf(r1.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ad, code lost:
        throw ((p000.bxwf) r1.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ae, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e1 A[ExcHandler: IllegalArgumentException (e java.lang.IllegalArgumentException), Splitter:B:7:0x0021] */
    /* renamed from: a */
    public final String mo55193a(bctr bctr) {
        if (bctr.mo57365f().mo57180a() == 2) {
            return bctr.mo57365f().mo57192d();
        }
        if (bctr.mo57369i().containsKey("l_wlpp_notif")) {
            try {
                ByteString bxtx = (ByteString) bctr.mo57369i().get("l_wlpp_notif");
                bxus c = bxus.m123744c();
                bxte bxte = bxte.f164763c;
                bxuc h = bxtx.mo73764h();
                GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) bxte.mo74142c(4);
                bxxv a = bxxm.f165037a.mo74228a(GeneratedMessageLite);
                a.mo74220a(GeneratedMessageLite, bxud.m123454a(h), c);
                a.mo74225d(GeneratedMessageLite);
                h.mo73787a(0);
                GeneratedMessageLite.m124027b(GeneratedMessageLite);
                ByteString bxtx2 = ((bxte) GeneratedMessageLite).f164766b;
                bxus c2 = bxus.m123744c();
                bxye bxye = bxye.f165087b;
                bxuc h2 = bxtx2.mo73764h();
                GeneratedMessageLite GeneratedMessageLite2 = (GeneratedMessageLite) bxye.mo74142c(4);
                bxxv a2 = bxxm.f165037a.mo74228a(GeneratedMessageLite2);
                a2.mo74220a(GeneratedMessageLite2, bxud.m123454a(h2), c2);
                a2.mo74225d(GeneratedMessageLite2);
                h2.mo73787a(0);
                GeneratedMessageLite.m124027b(GeneratedMessageLite2);
                return ((bxye) GeneratedMessageLite2).f165089a;
            } catch (IOException e) {
                if (!(e.getCause() instanceof bxwf)) {
                    throw new bxwf(e.getMessage());
                }
                throw ((bxwf) e.getCause());
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof bxwf) {
                    throw ((bxwf) e2.getCause());
                }
                throw e2;
            } catch (bxwf e3) {
                throw e3;
            } catch (IllegalArgumentException e4) {
            } catch (bxwf e5) {
                throw e5;
            }
        }
        if (!bctr.mo57367h().mo66813a() && !TextUtils.isEmpty((CharSequence) bctr.mo57367h().mo66814b())) {
            return (String) bctr.mo57367h().mo66814b();
        }
        if (bctr.mo57363e().mo66813a() || TextUtils.isEmpty((CharSequence) bctr.mo57363e().mo66814b())) {
            return this.f99860a.getResources().getString(C0126R.string.fallback_message_text_without_sender_name);
        }
        return (String) bctr.mo57363e().mo66814b();
        azph.m85998a(this.f99860a).mo55140a(1442, bctr);
        azoj.m85933c("LTNotifUtils", "failed to read the notification text in metadata", new Object[0]);
        if (!bctr.mo57367h().mo66813a()) {
        }
        if (bctr.mo57363e().mo66813a()) {
        }
        return this.f99860a.getResources().getString(C0126R.string.fallback_message_text_without_sender_name);
    }

    /* renamed from: a */
    public final void mo55194a() {
        try {
            bnre i = ((bngx) azbj.m85193a(this.f99860a).mo54563c().mo56338a().get()).listIterator();
            while (i.hasNext()) {
                bcoh bcoh = (bcoh) i.next();
                azbj.m85193a(this.f99860a).mo54567g().mo56333a(bcoh).mo57830c(new azpp(this, bcoh));
            }
        } catch (InterruptedException | ExecutionException e) {
            azoj.m85933c("LTNotifUtils", "Unable to get accounts to post renotifications", new Object[0]);
            azph.m85998a(this.f99860a).mo55126a(1438, 59);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo55195a(azam azam, ConversationId conversationId) {
        if (azam.f98837a == null || azam.f98839c <= 0 || azam.f98840d == null || azam.f98844h == null || azam.f98845i == null || azam.f98846j == null || azam.f98847k == null) {
            azoj.m85933c("LTNotifUtils", "Missing data for notification, not posting yet.", new Object[0]);
        } else {
            new Object[1][0] = conversationId;
            azph.m85998a(this.f99860a).mo55146a(1436, conversationId);
            new soa(9, new azpq(this, azam, conversationId)).start();
        }
        if (!azan.m85141a(this.f99860a).mo54542b()) {
            azph.m85998a(this.f99860a).mo55146a(56, conversationId);
        }
    }

    /* renamed from: a */
    public final void mo55196a(bcoh bcoh) {
        azbj.m85193a(this.f99860a).mo54564d().mo56308a(bcoh, 0, -1).mo57830c(new azpr(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0278  */
    /* renamed from: a */
    public final void mo55197a(bcoh bcoh, azam azam, ConversationId conversationId, int i) {
        bmxv bmxv;
        bbpk d = azbj.m85193a(this.f99860a).mo54564d();
        if (i <= 0) {
            i = 1;
        }
        bdar a = d.mo56311a(bcoh, conversationId, Integer.valueOf(i), 0);
        azqf.m86130a(this.f99860a);
        bmxv a2 = azqf.m86131a(a);
        bmxv bmxv2 = bmvz.f131120a;
        if (!a2.mo66813a() || ((bngx) a2.mo66814b()).isEmpty()) {
            azoj.m85933c("LTNotifUtils", "Could not get last message for conversation %s", conversationId);
            azph.m85998a(this.f99860a).mo55129a(1435, 57, conversationId);
        } else {
            bngx bngx = (bngx) a2.mo66814b();
            bctr bctr = (bctr) bngx.get(0);
            bmxv b = bmxv.m108566b(bctr);
            int o = bctr.mo57375o();
            int i2 = o - 1;
            if (o != 0) {
                if (i2 == 0) {
                    azam.f98845i = mo55193a(bctr);
                    String valueOf = String.valueOf(azam.f98845i);
                    if (valueOf.length() == 0) {
                        new String("notification text: ");
                    } else {
                        "notification text: ".concat(valueOf);
                    }
                    if (!bngx.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        bnre i3 = bngx.listIterator();
                        while (i3.hasNext()) {
                            arrayList.add(mo55193a((bctr) i3.next()));
                        }
                        azam.f98853q = bmxv.m108566b(arrayList);
                        azam.f98842f = this.f99860a.getResources().getQuantityString(C0126R.plurals.notification_new_messages, bngx.size());
                    }
                } else if (i2 == 1) {
                    azcd a3 = azcd.m85252a(this.f99860a);
                    azqf.m86130a(this.f99860a);
                    String a4 = a3.mo54600a(azqf.m86137a(conversationId), 19);
                    if (TextUtils.isEmpty(a4)) {
                        azph.m85998a(this.f99860a).mo55146a((int) MfiClientException.TYPE_ILLEGAL_CARD_OPERATION, conversationId);
                        a4 = this.f99860a.getString(C0126R.string.reply_again_notification_text_fallback);
                    }
                    azam.f98845i = a4;
                }
                azam.f98851o = bmxv.m108566b(Long.valueOf(TimeUnit.MICROSECONDS.toMillis(bctr.mo57362d().longValue())));
                bmxv2 = b;
            } else {
                throw null;
            }
        }
        Intent putExtra = new Intent("com.google.android.apps.libraries.matchstick.action.LIGHTER_NOTIFICATION_CLEARED").setClassName(this.f99860a, "com.google.android.gms.matchstick.net.MessagingService").putExtra("notification_id", conversationId.toString());
        bmxv g = bcoh.mo57062g();
        if (g.mo66813a()) {
            putExtra.putExtra("account_context_json", ((JSONObject) g.mo66814b()).toString());
        }
        azam.f98846j = PendingIntent.getService(this.f99860a, conversationId.hashCode(), putExtra, 134217728);
        azqf a5 = azqf.m86130a(this.f99860a);
        if (bmxv2.mo66813a()) {
            bmxv a6 = azbj.m85193a(a5.f99879a).mo54564d().mo56315a((bctr) bmxv2.mo66814b());
            if (a6.mo66813a()) {
                String optString = ((JSONObject) a6.mo66814b()).optString("web_app_url_key");
                if (!TextUtils.isEmpty(optString)) {
                    bmxv = bmxv.m108566b(optString);
                    if (!bmxv.mo66813a()) {
                        azqf a7 = azqf.m86130a(this.f99860a);
                        String str = (String) bmxv.mo66814b();
                        Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.INTERNAL_VIEW");
                        intent.setClassName(a7.f99879a, "com.google.android.gms.matchstick.ui.EntryActivity");
                        if (!cfgs.m139413s()) {
                            intent.addFlags(268468224);
                        }
                        a7.mo55215a(bcoh, intent, conversationId, str);
                        azam.f98847k = PendingIntent.getActivity(this.f99860a, conversationId.hashCode(), intent, 134217728);
                        String str2 = (String) bmxv.mo66814b();
                        if (cfgs.m139403i()) {
                            azam.f98848l.clear();
                            azqf.m86130a(this.f99860a);
                            cbhz[] h = azcd.m85252a(this.f99860a).mo54616h(azqf.m86137a(conversationId));
                            if (h != null && (r1 = h.length) != 0) {
                                for (cbhz cbhz : h) {
                                    cbhj cbhj = cbhz.f177222b;
                                    if (cbhj == null) {
                                        cbhj = cbhj.f177133d;
                                    }
                                    Intent a8 = azoi.m85922a(cbhj);
                                    if (a8 != null) {
                                        azqf.m86130a(this.f99860a).mo55215a(bcoh, a8, conversationId, str2);
                                        List list = azam.f98848l;
                                        int i4 = azop.f99797a;
                                        list.add(azop.m85941a(-1, cbhz.f177221a, PendingIntent.getActivity(this.f99860a, a8.hashCode(), a8, 134217728)));
                                    } else {
                                        azph.m85998a(this.f99860a).mo55129a(1424, 6, conversationId);
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    azoj.m85933c("LTNotifUtils", "Could not get WebApp URL from Message", new Object[0]);
                    azph.m85998a(this.f99860a).mo55129a(1428, 42, conversationId);
                    return;
                }
            }
        }
        azoj.m85933c("LighterUtils", "No URL in message, using AppMetadata", new Object[0]);
        String i5 = azcd.m85252a(a5.f99879a).mo54617i(azqf.m86137a(conversationId));
        if (!TextUtils.isEmpty(i5)) {
            new Object[1][0] = i5;
            bmxv = bmxv.m108566b(i5);
        } else {
            azoj.m85933c("LighterUtils", "No URL found in message or AppMetadata", new Object[0]);
            azph.m85998a(a5.f99879a).mo55129a(1534, 42, conversationId);
            bmxv = bmvz.f131120a;
        }
        if (!bmxv.mo66813a()) {
        }
    }

    /* renamed from: a */
    public final void mo55198a(bcoh bcoh, bctr bctr) {
        if (cfgs.m139419y()) {
            bctt g = Notification.m94865g();
            g.mo57546a(bctr.mo57361c().toString());
            g.f104898a = Long.valueOf(System.currentTimeMillis());
            g.mo57547a(new HashMap());
            bcts j = MessageReceivedNotification.m94855j();
            j.mo57541d(bctr.mo57359a());
            j.mo57536a(bctr.mo57361c());
            j.mo57535a(bctr.mo57360b());
            j.mo57537a("unused");
            j.mo57543f("unused");
            j.mo57539b("unused");
            j.mo57542e("unused");
            j.mo57540c("unused");
            g.mo57545a(j.mo57534a());
            azbj.m85193a(this.f99860a).mo54567g().mo56335a(bcoh, g.mo57544a());
        }
    }

    /* renamed from: a */
    public final void mo55199a(bcoh bcoh, ConversationId conversationId) {
        azbj.m85193a(this.f99860a).mo54564d().mo56310a(bcoh, conversationId, 1).mo57830c(new azpo(this, bcoh, conversationId));
    }

    /* renamed from: a */
    public final void mo55200a(bmxz bmxz) {
        try {
            bnre i = ((bngx) azbj.m85193a(this.f99860a).mo54563c().mo56338a().get()).listIterator();
            while (i.hasNext()) {
                bcoh bcoh = (bcoh) i.next();
                azbj.m85193a(this.f99860a).mo54566f().mo56306a(bcoh, -1, bmxz).mo57830c(new azpn(this, bcoh));
            }
        } catch (InterruptedException | ExecutionException e) {
            azoj.m85933c("LTNotifUtils", "Unable to get accounts to post unread notifications", new Object[0]);
            azph.m85998a(this.f99860a).mo55126a(1427, 59);
        }
    }

    /* renamed from: a */
    public final void mo55201a(ConversationId conversationId) {
        azan.m85141a(this.f99860a).mo54544d(conversationId.toString());
    }
}
