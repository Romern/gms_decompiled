package p000;

import com.google.android.libraries.messaging.lighter.model.AutoValue_ConversationId_GroupId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bcsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcsr {

    /* renamed from: a */
    private String f104825a;

    /* renamed from: b */
    private String f104826b;

    /* renamed from: a */
    public final ConversationId.GroupId mo57476a() {
        String str = this.f104825a == null ? " id" : "";
        if (this.f104826b == null) {
            str = str.concat(" appName");
        }
        if (str.isEmpty()) {
            return new AutoValue_ConversationId_GroupId(this.f104825a, this.f104826b);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo57478b(String str) {
        if (str != null) {
            this.f104825a = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    /* renamed from: a */
    public final void mo57477a(String str) {
        if (str != null) {
            this.f104826b = str;
            return;
        }
        throw new NullPointerException("Null appName");
    }
}
