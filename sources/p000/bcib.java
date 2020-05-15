package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bcib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcib {

    /* renamed from: a */
    private String f104191a;

    /* renamed from: b */
    private ConversationId f104192b;

    /* renamed from: c */
    private ContactId f104193c;

    /* renamed from: d */
    private Integer f104194d;

    /* renamed from: e */
    private Long f104195e;

    /* renamed from: f */
    private Long f104196f;

    /* renamed from: a */
    public final bcic mo56919a() {
        String str = this.f104191a == null ? " typingIndicatorId" : "";
        if (this.f104192b == null) {
            str = str.concat(" conversationId");
        }
        if (this.f104193c == null) {
            str = String.valueOf(str).concat(" sender");
        }
        if (this.f104194d == null) {
            str = String.valueOf(str).concat(" typingIndicatorStatus");
        }
        if (this.f104195e == null) {
            str = String.valueOf(str).concat(" refreshIntervalUSec");
        }
        if (this.f104196f == null) {
            str = String.valueOf(str).concat(" serverTimestampUSec");
        }
        if (str.isEmpty()) {
            return new bcha(this.f104191a, this.f104192b, this.f104193c, this.f104194d.intValue(), this.f104195e.longValue(), this.f104196f.longValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo56925b(long j) {
        this.f104196f = Long.valueOf(j);
    }

    /* renamed from: a */
    public final void mo56920a(int i) {
        this.f104194d = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo56921a(long j) {
        this.f104195e = Long.valueOf(j);
    }

    /* renamed from: a */
    public final void mo56922a(ContactId contactId) {
        if (contactId != null) {
            this.f104193c = contactId;
            return;
        }
        throw new NullPointerException("Null sender");
    }

    /* renamed from: a */
    public final void mo56923a(ConversationId conversationId) {
        if (conversationId != null) {
            this.f104192b = conversationId;
            return;
        }
        throw new NullPointerException("Null conversationId");
    }

    /* renamed from: a */
    public final void mo56924a(String str) {
        if (str != null) {
            this.f104191a = str;
            return;
        }
        throw new NullPointerException("Null typingIndicatorId");
    }
}
