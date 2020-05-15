package com.google.android.libraries.messaging.lighter.model;

import com.felicanetworks.mfc.mfi.MfiClientException;

/* renamed from: com.google.android.libraries.messaging.lighter.model.$AutoValue_MessageReceivedNotification  reason: invalid class name */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class C$AutoValue_MessageReceivedNotification extends MessageReceivedNotification {

    /* renamed from: a */
    public final ConversationId f111342a;

    /* renamed from: b */
    public final String f111343b;

    /* renamed from: c */
    public final ContactId f111344c;

    /* renamed from: d */
    public final String f111345d;

    /* renamed from: e */
    public final String f111346e;

    /* renamed from: f */
    public final String f111347f;

    /* renamed from: g */
    public final String f111348g;

    /* renamed from: h */
    public final String f111349h;

    /* renamed from: i */
    public final boolean f111350i;

    public C$AutoValue_MessageReceivedNotification(ConversationId conversationId, String str, ContactId contactId, String str2, String str3, String str4, String str5, String str6, boolean z) {
        if (conversationId != null) {
            this.f111342a = conversationId;
            if (str != null) {
                this.f111343b = str;
                if (contactId != null) {
                    this.f111344c = contactId;
                    if (str2 != null) {
                        this.f111345d = str2;
                        if (str3 != null) {
                            this.f111346e = str3;
                            if (str4 != null) {
                                this.f111347f = str4;
                                if (str5 != null) {
                                    this.f111348g = str5;
                                    if (str6 != null) {
                                        this.f111349h = str6;
                                        this.f111350i = z;
                                        return;
                                    }
                                    throw new NullPointerException("Null messageContent");
                                }
                                throw new NullPointerException("Null senderName");
                            }
                            throw new NullPointerException("Null body");
                        }
                        throw new NullPointerException("Null title");
                    }
                    throw new NullPointerException("Null avatarUrl");
                }
                throw new NullPointerException("Null senderId");
            }
            throw new NullPointerException("Null messageId");
        }
        throw new NullPointerException("Null conversationId");
    }

    /* renamed from: a */
    public final ConversationId mo60508a() {
        return this.f111342a;
    }

    /* renamed from: b */
    public final String mo60509b() {
        return this.f111343b;
    }

    /* renamed from: c */
    public final ContactId mo60510c() {
        return this.f111344c;
    }

    /* renamed from: d */
    public final String mo60511d() {
        return this.f111345d;
    }

    /* renamed from: e */
    public final String mo60512e() {
        return this.f111346e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessageReceivedNotification) {
            MessageReceivedNotification messageReceivedNotification = (MessageReceivedNotification) obj;
            return this.f111342a.equals(messageReceivedNotification.mo60508a()) && this.f111343b.equals(messageReceivedNotification.mo60509b()) && this.f111344c.equals(messageReceivedNotification.mo60510c()) && this.f111345d.equals(messageReceivedNotification.mo60511d()) && this.f111346e.equals(messageReceivedNotification.mo60512e()) && this.f111347f.equals(messageReceivedNotification.mo60514f()) && this.f111348g.equals(messageReceivedNotification.mo60515g()) && this.f111349h.equals(messageReceivedNotification.mo60516h()) && this.f111350i == messageReceivedNotification.mo60518i();
        }
    }

    /* renamed from: f */
    public final String mo60514f() {
        return this.f111347f;
    }

    /* renamed from: g */
    public final String mo60515g() {
        return this.f111348g;
    }

    /* renamed from: h */
    public final String mo60516h() {
        return this.f111349h;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f111342a.hashCode() ^ 1000003) * 1000003) ^ this.f111343b.hashCode()) * 1000003) ^ this.f111344c.hashCode()) * 1000003) ^ this.f111345d.hashCode()) * 1000003) ^ this.f111346e.hashCode()) * 1000003) ^ this.f111347f.hashCode()) * 1000003) ^ this.f111348g.hashCode()) * 1000003) ^ this.f111349h.hashCode()) * 1000003) ^ (!this.f111350i ? 1237 : 1231);
    }

    /* renamed from: i */
    public final boolean mo60518i() {
        return this.f111350i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f111342a);
        String str = this.f111343b;
        String valueOf2 = String.valueOf(this.f111344c);
        String str2 = this.f111345d;
        String str3 = this.f111346e;
        String str4 = this.f111347f;
        String str5 = this.f111348g;
        String str6 = this.f111349h;
        boolean z = this.f111350i;
        int length = String.valueOf(valueOf).length();
        int length2 = str.length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = str2.length();
        int length5 = str3.length();
        int length6 = str4.length();
        int length7 = str5.length();
        StringBuilder sb = new StringBuilder(length + MfiClientException.TYPE_MFICLIENT_STARTED + length2 + length3 + length4 + length5 + length6 + length7 + str6.length());
        sb.append("MessageReceivedNotification{conversationId=");
        sb.append(valueOf);
        sb.append(", messageId=");
        sb.append(str);
        sb.append(", senderId=");
        sb.append(valueOf2);
        sb.append(", avatarUrl=");
        sb.append(str2);
        sb.append(", title=");
        sb.append(str3);
        sb.append(", body=");
        sb.append(str4);
        sb.append(", senderName=");
        sb.append(str5);
        sb.append(", messageContent=");
        sb.append(str6);
        sb.append(", disableInlineResponse=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
