package com.google.android.libraries.messaging.lighter.model;

import com.google.android.libraries.messaging.lighter.model.ContactId;

/* renamed from: com.google.android.libraries.messaging.lighter.model.$AutoValue_ContactId  reason: invalid class name */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C$AutoValue_ContactId extends ContactId {

    /* renamed from: a */
    public final String f111334a;

    /* renamed from: b */
    public final String f111335b;

    /* renamed from: c */
    public final ContactId.ContactType f111336c;

    /* renamed from: d */
    public final bmxv f111337d;

    public C$AutoValue_ContactId(String str, String str2, ContactId.ContactType contactType, bmxv bmxv) {
        if (str != null) {
            this.f111334a = str;
            if (str2 != null) {
                this.f111335b = str2;
                if (contactType != null) {
                    this.f111336c = contactType;
                    if (bmxv != null) {
                        this.f111337d = bmxv;
                        return;
                    }
                    throw new NullPointerException("Null handlerId");
                }
                throw new NullPointerException("Null type");
            }
            throw new NullPointerException("Null tachyonAppName");
        }
        throw new NullPointerException("Null id");
    }

    /* renamed from: a */
    public final String mo60492a() {
        return this.f111334a;
    }

    /* renamed from: b */
    public final String mo60493b() {
        return this.f111335b;
    }

    /* renamed from: c */
    public final ContactId.ContactType mo60494c() {
        return this.f111336c;
    }

    /* renamed from: d */
    public final bmxv mo60495d() {
        return this.f111337d;
    }

    /* renamed from: e */
    public final bcsk mo60496e() {
        return new bcsk(this);
    }

    public final String toString() {
        String str = this.f111334a;
        String str2 = this.f111335b;
        String valueOf = String.valueOf(this.f111336c);
        String valueOf2 = String.valueOf(this.f111337d);
        int length = str.length();
        int length2 = str2.length();
        StringBuilder sb = new StringBuilder(length + 50 + length2 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("ContactId{id=");
        sb.append(str);
        sb.append(", tachyonAppName=");
        sb.append(str2);
        sb.append(", type=");
        sb.append(valueOf);
        sb.append(", handlerId=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
