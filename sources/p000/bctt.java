package p000;

import com.google.android.libraries.messaging.lighter.model.AutoValue_Notification;
import com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification;
import com.google.android.libraries.messaging.lighter.model.Notification;
import com.google.android.libraries.messaging.lighter.model.NotificationMetadata;
import java.util.HashMap;

/* renamed from: bctt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bctt {

    /* renamed from: a */
    public Long f104898a;

    /* renamed from: b */
    private String f104899b;

    /* renamed from: c */
    private NotificationMetadata f104900c;

    /* renamed from: d */
    private Notification.OneOfType f104901d;

    /* renamed from: a */
    public final Notification mo57544a() {
        String str = this.f104899b == null ? " id" : "";
        if (this.f104898a == null) {
            str = str.concat(" timeStampMillis");
        }
        if (this.f104900c == null) {
            str = String.valueOf(str).concat(" metadata");
        }
        if (this.f104901d == null) {
            str = String.valueOf(str).concat(" oneOfType");
        }
        if (str.isEmpty()) {
            return new AutoValue_Notification(this.f104899b, this.f104898a, this.f104900c, this.f104901d);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo57545a(MessageReceivedNotification messageReceivedNotification) {
        this.f104901d = bcqh.m89627a(messageReceivedNotification);
    }

    /* renamed from: a */
    public final void mo57546a(String str) {
        if (str != null) {
            this.f104899b = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    /* renamed from: a */
    public final void mo57547a(HashMap hashMap) {
        this.f104900c = new NotificationMetadata(hashMap);
    }
}
