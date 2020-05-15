package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.C$AutoValue_Notification;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification;
import com.google.android.libraries.messaging.lighter.model.Notification;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: bcac */
final /* synthetic */ class bcac implements Runnable {

    /* renamed from: a */
    private final bcas f103861a;

    /* renamed from: b */
    private final Notification f103862b;

    public bcac(bcas bcas, Notification notification) {
        this.f103861a = bcas;
        this.f103862b = notification;
    }

    public final void run() {
        bcas bcas = this.f103861a;
        Notification notification = this.f103862b;
        bdae bdae = bcas.f103908c;
        Uri d = bcas.mo56655d("notifications");
        HashMap hashMap = new HashMap();
        Notification.NotificationType notificationType = Notification.NotificationType.MESSAGE_RECEIVED;
        if (notification.mo60565e().ordinal() == 0) {
            MessageReceivedNotification f = notification.mo60566f();
            HashMap hashMap2 = new HashMap();
            ConversationId a = f.mo60508a();
            HashMap hashMap3 = new HashMap();
            hashMap3.put("OWNER", bcbw.m88777a(a.mo60498a()));
            hashMap3.put("TYPE", Integer.valueOf(a.mo60556c().f111369c));
            ConversationId.IdType idType = ConversationId.IdType.ONE_TO_ONE;
            int ordinal = a.mo60556c().ordinal();
            if (ordinal == 0) {
                hashMap3.put("OTHER_PARTICIPANT", bcbw.m88777a(a.mo60558e()));
            } else if (ordinal == 1) {
                hashMap3.put("GROUP", bcca.m88791a(a.mo60557d()));
            }
            hashMap2.put("CONVERSATION_ID", hashMap3);
            hashMap2.put("MESSAGE_ID", f.mo60509b());
            hashMap2.put("SENDER_ID", bcbw.m88777a(f.mo60510c()));
            hashMap2.put("AVATAR_URL", f.mo60511d());
            hashMap2.put("TITLE", f.mo60512e());
            hashMap2.put("BODY", f.mo60514f());
            hashMap2.put("SENDER_NAME", f.mo60515g());
            hashMap2.put("MESSAGE_CONTENT", f.mo60516h());
            hashMap2.put("DISABLE_INLINE_RESPONSE", Boolean.valueOf(f.mo60518i()));
            hashMap.put("message_received_notification", hashMap2);
        }
        ContentValues contentValues = new ContentValues();
        C$AutoValue_Notification _autovalue_notification = (C$AutoValue_Notification) notification;
        contentValues.put("notification_id", _autovalue_notification.f111351a);
        contentValues.put("notification_type", Integer.valueOf(notification.mo60565e().f111372b));
        contentValues.put("notification_timestamp_received_ms", _autovalue_notification.f111352b);
        try {
            contentValues.put("notification_metadata", bbqu.m88422a((Serializable) new HashMap(((C$AutoValue_Notification) notification).f111353c.f111373a)));
            contentValues.put("notification_properties", bbqu.m88422a((Serializable) hashMap));
        } catch (IOException e) {
            bbos.m88292b("NotificationCursors", "Failed to serialize notification data.", e);
            contentValues = null;
        }
        if (bdae.mo54676a(d, contentValues, 5) >= 0) {
            bcas.mo56651c();
            return;
        }
        throw new SQLiteException("Failed to save notification.");
    }
}
