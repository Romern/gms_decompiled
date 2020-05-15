package com.google.android.libraries.messaging.lighter.model;

import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: com.google.android.libraries.messaging.lighter.model.$AutoValue_ConversationId_GroupId  reason: invalid class name */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class C$AutoValue_ConversationId_GroupId extends ConversationId.GroupId {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    public final String f111340a;

    /* renamed from: b */
    public final String f111341b;

    public C$AutoValue_ConversationId_GroupId(String str, String str2) {
        if (str != null) {
            this.f111340a = str;
            if (str2 != null) {
                this.f111341b = str2;
                return;
            }
            throw new NullPointerException("Null appName");
        }
        throw new NullPointerException("Null id");
    }

    /* renamed from: a */
    public final String mo60503a() {
        return this.f111340a;
    }

    /* renamed from: b */
    public final String mo60504b() {
        return this.f111341b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConversationId.GroupId) {
            ConversationId.GroupId groupId = (ConversationId.GroupId) obj;
            return this.f111340a.equals(groupId.mo60503a()) && this.f111341b.equals(groupId.mo60504b());
        }
    }

    public final int hashCode() {
        return ((this.f111340a.hashCode() ^ 1000003) * 1000003) ^ this.f111341b.hashCode();
    }

    public final String toString() {
        String str = this.f111340a;
        String str2 = this.f111341b;
        StringBuilder sb = new StringBuilder(str.length() + 22 + str2.length());
        sb.append("GroupId{id=");
        sb.append(str);
        sb.append(", appName=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
