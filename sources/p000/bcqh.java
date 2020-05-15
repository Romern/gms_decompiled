package p000;

import com.google.android.libraries.messaging.lighter.model.AutoOneOf_Notification_OneOfType$Impl_messageReceived;
import com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification;
import com.google.android.libraries.messaging.lighter.model.Notification;

/* renamed from: bcqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcqh {
    /* renamed from: a */
    static Notification.OneOfType m89627a(MessageReceivedNotification messageReceivedNotification) {
        if (messageReceivedNotification != null) {
            return new AutoOneOf_Notification_OneOfType$Impl_messageReceived(messageReceivedNotification);
        }
        throw null;
    }
}
