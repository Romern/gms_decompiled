package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.List;

/* renamed from: bchv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bchv {

    /* renamed from: a */
    private Integer f104183a;

    /* renamed from: b */
    private String f104184b;

    /* renamed from: c */
    private List f104185c;

    /* renamed from: d */
    private ContactId f104186d;

    /* renamed from: e */
    private ConversationId f104187e;

    /* renamed from: a */
    public final bchw mo56903a() {
        String str = this.f104183a == null ? " receiptType" : "";
        if (this.f104184b == null) {
            str = str.concat(" receiptId");
        }
        if (this.f104185c == null) {
            str = String.valueOf(str).concat(" messageIds");
        }
        if (this.f104186d == null) {
            str = String.valueOf(str).concat(" recipient");
        }
        if (this.f104187e == null) {
            str = String.valueOf(str).concat(" conversationId");
        }
        if (str.isEmpty()) {
            return new bcgy(this.f104183a.intValue(), this.f104184b, this.f104185c, this.f104186d, this.f104187e);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo56904a(int i) {
        this.f104183a = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo56905a(ContactId contactId) {
        if (contactId != null) {
            this.f104186d = contactId;
            return;
        }
        throw new NullPointerException("Null recipient");
    }

    /* renamed from: a */
    public final void mo56906a(ConversationId conversationId) {
        if (conversationId != null) {
            this.f104187e = conversationId;
            return;
        }
        throw new NullPointerException("Null conversationId");
    }

    /* renamed from: a */
    public final void mo56907a(String str) {
        if (str != null) {
            this.f104184b = str;
            return;
        }
        throw new NullPointerException("Null receiptId");
    }

    /* renamed from: a */
    public final void mo56908a(List list) {
        if (list != null) {
            this.f104185c = list;
            return;
        }
        throw new NullPointerException("Null messageIds");
    }
}
