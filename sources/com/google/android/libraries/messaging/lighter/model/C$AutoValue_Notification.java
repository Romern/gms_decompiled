package com.google.android.libraries.messaging.lighter.model;

import com.google.android.libraries.messaging.lighter.model.Notification;

/* renamed from: com.google.android.libraries.messaging.lighter.model.$AutoValue_Notification  reason: invalid class name */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C$AutoValue_Notification extends Notification {

    /* renamed from: a */
    public final String f111351a;

    /* renamed from: b */
    public final Long f111352b;

    /* renamed from: c */
    public final NotificationMetadata f111353c;

    /* renamed from: d */
    public final Notification.OneOfType f111354d;

    public C$AutoValue_Notification(String str, Long l, NotificationMetadata notificationMetadata, Notification.OneOfType oneOfType) {
        if (str != null) {
            this.f111351a = str;
            if (l != null) {
                this.f111352b = l;
                if (notificationMetadata != null) {
                    this.f111353c = notificationMetadata;
                    if (oneOfType != null) {
                        this.f111354d = oneOfType;
                        return;
                    }
                    throw new NullPointerException("Null oneOfType");
                }
                throw new NullPointerException("Null metadata");
            }
            throw new NullPointerException("Null timeStampMillis");
        }
        throw new NullPointerException("Null id");
    }

    /* renamed from: a */
    public final String mo60520a() {
        return this.f111351a;
    }

    /* renamed from: b */
    public final Long mo60521b() {
        return this.f111352b;
    }

    /* renamed from: c */
    public final NotificationMetadata mo60522c() {
        return this.f111353c;
    }

    /* renamed from: d */
    public final Notification.OneOfType mo60523d() {
        return this.f111354d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Notification) {
            Notification notification = (Notification) obj;
            return this.f111351a.equals(notification.mo60520a()) && this.f111352b.equals(notification.mo60521b()) && this.f111353c.equals(notification.mo60522c()) && this.f111354d.equals(notification.mo60523d());
        }
    }

    public final int hashCode() {
        return ((((((this.f111351a.hashCode() ^ 1000003) * 1000003) ^ this.f111352b.hashCode()) * 1000003) ^ this.f111353c.hashCode()) * 1000003) ^ this.f111354d.hashCode();
    }

    public final String toString() {
        String str = this.f111351a;
        String valueOf = String.valueOf(this.f111352b);
        String valueOf2 = String.valueOf(this.f111353c);
        String valueOf3 = String.valueOf(this.f111354d);
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 58 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("Notification{id=");
        sb.append(str);
        sb.append(", timeStampMillis=");
        sb.append(valueOf);
        sb.append(", metadata=");
        sb.append(valueOf2);
        sb.append(", oneOfType=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
