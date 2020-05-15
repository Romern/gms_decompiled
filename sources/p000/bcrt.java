package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bcrt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcrt extends bctr {

    /* renamed from: a */
    public final String f104743a;

    /* renamed from: b */
    public final ContactId f104744b;

    /* renamed from: c */
    public final ConversationId f104745c;

    /* renamed from: d */
    public final Long f104746d;

    /* renamed from: e */
    public final bmxv f104747e;

    /* renamed from: f */
    public final bcti f104748f;

    /* renamed from: g */
    public final bctk f104749g;

    /* renamed from: h */
    public final bmxv f104750h;

    /* renamed from: i */
    public final bnhe f104751i;

    /* renamed from: j */
    public final int f104752j;

    /* renamed from: k */
    public final bcto f104753k;

    /* renamed from: l */
    public final int f104754l;

    /* renamed from: m */
    public final int f104755m;

    /* renamed from: n */
    public final int f104756n;

    public bcrt(String str, int i, ContactId contactId, ConversationId conversationId, Long l, bmxv bmxv, bcti bcti, bctk bctk, bmxv bmxv2, bnhe bnhe, int i2, bcto bcto, int i3, int i4) {
        this.f104743a = str;
        this.f104756n = i;
        this.f104744b = contactId;
        this.f104745c = conversationId;
        this.f104746d = l;
        this.f104747e = bmxv;
        this.f104748f = bcti;
        this.f104749g = bctk;
        this.f104750h = bmxv2;
        this.f104751i = bnhe;
        this.f104752j = i2;
        this.f104753k = bcto;
        this.f104754l = i3;
        this.f104755m = i4;
    }

    /* renamed from: a */
    public final String mo57359a() {
        return this.f104743a;
    }

    /* renamed from: b */
    public final ContactId mo57360b() {
        return this.f104744b;
    }

    /* renamed from: c */
    public final ConversationId mo57361c() {
        return this.f104745c;
    }

    /* renamed from: d */
    public final Long mo57362d() {
        return this.f104746d;
    }

    /* renamed from: e */
    public final bmxv mo57363e() {
        return this.f104747e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bctr) {
            bctr bctr = (bctr) obj;
            if (this.f104743a.equals(bctr.mo57359a())) {
                int i = this.f104756n;
                int o = bctr.mo57375o();
                if (i != 0) {
                    return i == o && this.f104744b.equals(bctr.mo57360b()) && this.f104745c.equals(bctr.mo57361c()) && this.f104746d.equals(bctr.mo57362d()) && this.f104747e.equals(bctr.mo57363e()) && this.f104748f.equals(bctr.mo57365f()) && this.f104749g.equals(bctr.mo57366g()) && this.f104750h.equals(bctr.mo57367h()) && this.f104751i.equals(bctr.mo57369i()) && this.f104752j == bctr.mo57370j() && this.f104753k.equals(bctr.mo57371k()) && this.f104754l == bctr.mo57372l() && this.f104755m == bctr.mo57373m();
                }
                throw null;
            }
        }
    }

    /* renamed from: f */
    public final bcti mo57365f() {
        return this.f104748f;
    }

    /* renamed from: g */
    public final bctk mo57366g() {
        return this.f104749g;
    }

    /* renamed from: h */
    public final bmxv mo57367h() {
        return this.f104750h;
    }

    public final int hashCode() {
        int hashCode = (this.f104743a.hashCode() ^ 1000003) * 1000003;
        int i = this.f104756n;
        if (i != 0) {
            return ((((((((((((((((((((((((hashCode ^ i) * 1000003) ^ this.f104744b.hashCode()) * 1000003) ^ this.f104745c.hashCode()) * 1000003) ^ this.f104746d.hashCode()) * 1000003) ^ this.f104747e.hashCode()) * 1000003) ^ this.f104748f.hashCode()) * 1000003) ^ this.f104749g.hashCode()) * 1000003) ^ this.f104750h.hashCode()) * 1000003) ^ this.f104751i.hashCode()) * 1000003) ^ this.f104752j) * 1000003) ^ this.f104753k.hashCode()) * 1000003) ^ this.f104754l) * 1000003) ^ this.f104755m;
        }
        throw null;
    }

    /* renamed from: i */
    public final bnhe mo57369i() {
        return this.f104751i;
    }

    /* renamed from: j */
    public final int mo57370j() {
        return this.f104752j;
    }

    /* renamed from: k */
    public final bcto mo57371k() {
        return this.f104753k;
    }

    /* renamed from: l */
    public final int mo57372l() {
        return this.f104754l;
    }

    /* renamed from: m */
    public final int mo57373m() {
        return this.f104755m;
    }

    /* renamed from: n */
    public final bcte mo57374n() {
        return new bcte(this);
    }

    /* renamed from: o */
    public final int mo57375o() {
        return this.f104756n;
    }

    public final String toString() {
        String str = this.f104743a;
        int i = this.f104756n;
        String str2 = i != 1 ? i != 2 ? "null" : "OUTGOING" : "INCOMING";
        String valueOf = String.valueOf(this.f104744b);
        String valueOf2 = String.valueOf(this.f104745c);
        String valueOf3 = String.valueOf(this.f104746d);
        String valueOf4 = String.valueOf(this.f104747e);
        String valueOf5 = String.valueOf(this.f104748f);
        String valueOf6 = String.valueOf(this.f104749g);
        String valueOf7 = String.valueOf(this.f104750h);
        String valueOf8 = String.valueOf(this.f104751i);
        int i2 = this.f104752j;
        String valueOf9 = String.valueOf(this.f104753k);
        int i3 = this.f104754l;
        int i4 = this.f104755m;
        int length = String.valueOf(str).length();
        int length2 = str2.length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(valueOf4).length();
        int length7 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + 251 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length() + String.valueOf(valueOf9).length());
        sb.append("Message{messageId=");
        sb.append(str);
        sb.append(", messageType=");
        sb.append(str2);
        sb.append(", sender=");
        sb.append(valueOf);
        sb.append(", conversationId=");
        sb.append(valueOf2);
        sb.append(", serverTimestampUs=");
        sb.append(valueOf3);
        sb.append(", fallback=");
        sb.append(valueOf4);
        sb.append(", messageContent=");
        sb.append(valueOf5);
        sb.append(", messageStatus=");
        sb.append(valueOf6);
        sb.append(", snippet=");
        sb.append(valueOf7);
        sb.append(", metadata=");
        sb.append(valueOf8);
        sb.append(", capability=");
        sb.append(i2);
        sb.append(", renderingDetails=");
        sb.append(valueOf9);
        sb.append(", intendedRenderingType=");
        sb.append(i3);
        sb.append(", filterableFlags=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
