package com.google.android.libraries.messaging.lighter.model;

import com.google.android.libraries.messaging.lighter.model.Notification;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AutoOneOf_Notification_OneOfType$Impl_messageReceived extends AutoOneOf_Notification_OneOfType$Parent_ {

    /* renamed from: a */
    private final MessageReceivedNotification f111357a;

    /* renamed from: a */
    public final MessageReceivedNotification mo60536a() {
        return this.f111357a;
    }

    /* renamed from: b */
    public final Notification.NotificationType mo60537b() {
        return Notification.NotificationType.MESSAGE_RECEIVED;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Notification.OneOfType) {
            Notification.OneOfType oneOfType = (Notification.OneOfType) obj;
            if (Notification.NotificationType.MESSAGE_RECEIVED != oneOfType.mo60537b() || !this.f111357a.equals(oneOfType.mo60536a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f111357a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f111357a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("OneOfType{messageReceived=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public AutoOneOf_Notification_OneOfType$Impl_messageReceived(MessageReceivedNotification messageReceivedNotification) {
        this.f111357a = messageReceivedNotification;
    }
}
