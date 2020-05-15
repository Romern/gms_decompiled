package p000;

import android.app.Notification;
import android.os.Build;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.List;

/* renamed from: azpq */
final /* synthetic */ class azpq implements Runnable {

    /* renamed from: a */
    private final azpw f99843a;

    /* renamed from: b */
    private final azam f99844b;

    /* renamed from: c */
    private final ConversationId f99845c;

    public azpq(azpw azpw, azam azam, ConversationId conversationId) {
        this.f99843a = azpw;
        this.f99844b = azam;
        this.f99845c = conversationId;
    }

    public final void run() {
        String str;
        azpw azpw = this.f99843a;
        azam azam = this.f99844b;
        ConversationId conversationId = this.f99845c;
        azan a = azan.m85141a(azpw.f99860a);
        String obj = conversationId.toString();
        sey sey = a.f98858b;
        Notification.Builder a2 = azan.m85140a(a.f98857a, azam);
        int i = Build.VERSION.SDK_INT;
        if (azam.f98851o.mo66813a() && ((Long) azam.f98851o.mo66814b()).longValue() <= System.currentTimeMillis()) {
            a2.setShowWhen(true).setWhen(((Long) azam.f98851o.mo66814b()).longValue());
        }
        if (cfgs.m139403i() && !azam.f98848l.isEmpty()) {
            azph.m85998a(a.f98857a).mo55125a(1426);
            List list = azam.f98848l;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = Build.VERSION.SDK_INT;
                a2.addAction((Notification.Action) list.get(i2));
            }
        }
        if (azam.f98853q.mo66813a()) {
            Notification.InboxStyle inboxStyle = new Notification.InboxStyle(a2);
            if (azam.f98850n.mo66813a()) {
                inboxStyle.setBigContentTitle((CharSequence) azam.f98850n.mo66814b());
            }
            List list2 = (List) azam.f98853q.mo66814b();
            for (String str2 : list2.subList(Math.max(list2.size() - 5, 0), list2.size())) {
                inboxStyle.addLine(str2);
            }
            a2.setStyle(inboxStyle);
        }
        if (azam.f98854r.mo66813a()) {
            int intValue = ((Integer) azam.f98854r.mo66814b()).intValue();
            int i4 = Build.VERSION.SDK_INT;
            if (intValue != 4) {
                str = "matchstick_notification_channel";
            } else {
                str = "matchstick_notification_channel_new";
            }
            a2.setChannelId(str);
        }
        sey.mo25459a(obj, 0, a2.build());
    }
}
