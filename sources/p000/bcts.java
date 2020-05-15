package p000;

import com.google.android.libraries.messaging.lighter.model.AutoValue_MessageReceivedNotification;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification;

/* renamed from: bcts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcts {

    /* renamed from: a */
    private ConversationId f104889a;

    /* renamed from: b */
    private String f104890b;

    /* renamed from: c */
    private ContactId f104891c;

    /* renamed from: d */
    private String f104892d;

    /* renamed from: e */
    private String f104893e;

    /* renamed from: f */
    private String f104894f;

    /* renamed from: g */
    private String f104895g;

    /* renamed from: h */
    private String f104896h;

    /* renamed from: i */
    private Boolean f104897i;

    /* renamed from: a */
    public final MessageReceivedNotification mo57534a() {
        String str = this.f104889a == null ? " conversationId" : "";
        if (this.f104890b == null) {
            str = str.concat(" messageId");
        }
        if (this.f104891c == null) {
            str = String.valueOf(str).concat(" senderId");
        }
        if (this.f104892d == null) {
            str = String.valueOf(str).concat(" avatarUrl");
        }
        if (this.f104893e == null) {
            str = String.valueOf(str).concat(" title");
        }
        if (this.f104894f == null) {
            str = String.valueOf(str).concat(" body");
        }
        if (this.f104895g == null) {
            str = String.valueOf(str).concat(" senderName");
        }
        if (this.f104896h == null) {
            str = String.valueOf(str).concat(" messageContent");
        }
        if (this.f104897i == null) {
            str = String.valueOf(str).concat(" disableInlineResponse");
        }
        if (str.isEmpty()) {
            return new AutoValue_MessageReceivedNotification(this.f104889a, this.f104890b, this.f104891c, this.f104892d, this.f104893e, this.f104894f, this.f104895g, this.f104896h, this.f104897i.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo57539b(String str) {
        if (str != null) {
            this.f104894f = str;
            return;
        }
        throw new NullPointerException("Null body");
    }

    /* renamed from: c */
    public final void mo57540c(String str) {
        if (str != null) {
            this.f104896h = str;
            return;
        }
        throw new NullPointerException("Null messageContent");
    }

    /* renamed from: d */
    public final void mo57541d(String str) {
        if (str != null) {
            this.f104890b = str;
            return;
        }
        throw new NullPointerException("Null messageId");
    }

    /* renamed from: e */
    public final void mo57542e(String str) {
        if (str != null) {
            this.f104895g = str;
            return;
        }
        throw new NullPointerException("Null senderName");
    }

    /* renamed from: f */
    public final void mo57543f(String str) {
        if (str != null) {
            this.f104893e = str;
            return;
        }
        throw new NullPointerException("Null title");
    }

    /* renamed from: a */
    public final void mo57535a(ContactId contactId) {
        if (contactId != null) {
            this.f104891c = contactId;
            return;
        }
        throw new NullPointerException("Null senderId");
    }

    /* renamed from: a */
    public final void mo57536a(ConversationId conversationId) {
        if (conversationId != null) {
            this.f104889a = conversationId;
            return;
        }
        throw new NullPointerException("Null conversationId");
    }

    /* renamed from: a */
    public final void mo57537a(String str) {
        if (str != null) {
            this.f104892d = str;
            return;
        }
        throw new NullPointerException("Null avatarUrl");
    }

    /* renamed from: a */
    public final void mo57538a(boolean z) {
        this.f104897i = Boolean.valueOf(z);
    }
}
