package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bcha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcha extends bcic {

    /* renamed from: a */
    public final String f104152a;

    /* renamed from: b */
    public final ConversationId f104153b;

    /* renamed from: c */
    public final int f104154c;

    /* renamed from: d */
    public final long f104155d;

    /* renamed from: e */
    private final ContactId f104156e;

    /* renamed from: f */
    private final long f104157f;

    public bcha(String str, ConversationId conversationId, ContactId contactId, int i, long j, long j2) {
        this.f104152a = str;
        this.f104153b = conversationId;
        this.f104156e = contactId;
        this.f104154c = i;
        this.f104155d = j;
        this.f104157f = j2;
    }

    /* renamed from: a */
    public final String mo56875a() {
        return this.f104152a;
    }

    /* renamed from: b */
    public final ConversationId mo56876b() {
        return this.f104153b;
    }

    /* renamed from: c */
    public final ContactId mo56877c() {
        return this.f104156e;
    }

    /* renamed from: d */
    public final int mo56878d() {
        return this.f104154c;
    }

    /* renamed from: e */
    public final long mo56879e() {
        return this.f104155d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcic) {
            bcic bcic = (bcic) obj;
            return this.f104152a.equals(bcic.mo56875a()) && this.f104153b.equals(bcic.mo56876b()) && this.f104156e.equals(bcic.mo56877c()) && this.f104154c == bcic.mo56878d() && this.f104155d == bcic.mo56879e() && this.f104157f == bcic.mo56881f();
        }
    }

    /* renamed from: f */
    public final long mo56881f() {
        return this.f104157f;
    }

    public final int hashCode() {
        int hashCode = this.f104152a.hashCode();
        int hashCode2 = this.f104153b.hashCode();
        int hashCode3 = this.f104156e.hashCode();
        int i = this.f104154c;
        long j = this.f104155d;
        long j2 = this.f104157f;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        String str = this.f104152a;
        String valueOf = String.valueOf(this.f104153b);
        String valueOf2 = String.valueOf(this.f104156e);
        int i = this.f104154c;
        long j = this.f104155d;
        long j2 = this.f104157f;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 180 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("TypingIndicator{typingIndicatorId=");
        sb.append(str);
        sb.append(", conversationId=");
        sb.append(valueOf);
        sb.append(", sender=");
        sb.append(valueOf2);
        sb.append(", typingIndicatorStatus=");
        sb.append(i);
        sb.append(", refreshIntervalUSec=");
        sb.append(j);
        sb.append(", serverTimestampUSec=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
