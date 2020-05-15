package p000;

import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bcdm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcdm {
    /* renamed from: a */
    public static Uri m88826a(long j) {
        return m88831a("notifications", "REGISTRATION", String.valueOf(j), "NOTIFICATION_PATH");
    }

    /* renamed from: b */
    public static Uri m88832b(long j) {
        return m88831a("conversations", "REGISTRATION", String.valueOf(j), "CONVERSATION_LIST_PATH");
    }

    /* renamed from: c */
    public static Uri m88834c(long j, ConversationId conversationId) {
        return m88831a("messages", "REGISTRATION", String.valueOf(j), "UNREAD_COUNT_FOR_CONVERSATION_PATH", String.valueOf(conversationId.hashCode()));
    }

    /* renamed from: a */
    public static Uri m88827a(long j, bdbe bdbe) {
        return m88831a("conversations", "REGISTRATION", String.valueOf(j), "BLOCKS_PATH", String.valueOf(bdbe.hashCode()));
    }

    /* renamed from: b */
    public static Uri m88833b(long j, ConversationId conversationId) {
        return m88831a("conversations", "REGISTRATION", String.valueOf(j), "CONVERSATION_PATH", String.valueOf(conversationId.hashCode()));
    }

    /* renamed from: a */
    public static Uri m88828a(long j, ContactId contactId) {
        return m88831a("contacts", "REGISTRATION", String.valueOf(j), "CONTACT_PATH", String.valueOf(contactId.hashCode()));
    }

    /* renamed from: a */
    public static Uri m88829a(long j, ConversationId conversationId) {
        return m88831a("messages", "REGISTRATION", String.valueOf(j), "MESSAGES_FOR_CONVERSATION_PATH", String.valueOf(conversationId.hashCode()));
    }

    /* renamed from: a */
    public static Uri m88830a(long j, String str) {
        return m88831a("messages", "REGISTRATION", String.valueOf(j), "MESSAGES_PATH", String.valueOf(str));
    }

    /* renamed from: a */
    public static Uri m88831a(String str, String... strArr) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority("com.google.android.libraries.messaging.lighter.internal.data");
        builder.appendEncodedPath(str);
        for (String str2 : strArr) {
            builder.appendEncodedPath(str2);
        }
        return builder.build();
    }
}
