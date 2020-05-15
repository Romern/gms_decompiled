package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.List;

/* renamed from: bcgy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcgy extends bchw {

    /* renamed from: a */
    public final int f104144a;

    /* renamed from: b */
    public final String f104145b;

    /* renamed from: c */
    public final List f104146c;

    /* renamed from: d */
    public final ConversationId f104147d;

    /* renamed from: e */
    private final ContactId f104148e;

    public bcgy(int i, String str, List list, ContactId contactId, ConversationId conversationId) {
        this.f104144a = i;
        this.f104145b = str;
        this.f104146c = list;
        this.f104148e = contactId;
        this.f104147d = conversationId;
    }

    /* renamed from: a */
    public final int mo56860a() {
        return this.f104144a;
    }

    /* renamed from: b */
    public final String mo56861b() {
        return this.f104145b;
    }

    /* renamed from: c */
    public final List mo56862c() {
        return this.f104146c;
    }

    /* renamed from: d */
    public final ContactId mo56863d() {
        return this.f104148e;
    }

    /* renamed from: e */
    public final ConversationId mo56864e() {
        return this.f104147d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bchw) {
            bchw bchw = (bchw) obj;
            return this.f104144a == bchw.mo56860a() && this.f104145b.equals(bchw.mo56861b()) && this.f104146c.equals(bchw.mo56862c()) && this.f104148e.equals(bchw.mo56863d()) && this.f104147d.equals(bchw.mo56864e());
        }
    }

    public final int hashCode() {
        return ((((((((this.f104144a ^ 1000003) * 1000003) ^ this.f104145b.hashCode()) * 1000003) ^ this.f104146c.hashCode()) * 1000003) ^ this.f104148e.hashCode()) * 1000003) ^ this.f104147d.hashCode();
    }

    public final String toString() {
        int i = this.f104144a;
        String str = this.f104145b;
        String valueOf = String.valueOf(this.f104146c);
        String valueOf2 = String.valueOf(this.f104148e);
        String valueOf3 = String.valueOf(this.f104147d);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 86 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("Receipt{receiptType=");
        sb.append(i);
        sb.append(", receiptId=");
        sb.append(str);
        sb.append(", messageIds=");
        sb.append(valueOf);
        sb.append(", recipient=");
        sb.append(valueOf2);
        sb.append(", conversationId=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
