package p000;

import android.content.Context;

/* renamed from: joj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class joj extends joi {
    public joj(Context context) {
        super(context);
    }

    /* renamed from: b */
    public final String mo13942b(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("LAST_CONFIG_") : "LAST_CONFIG_".concat(valueOf);
    }

    /* renamed from: c */
    public final String mo13943c(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("SCHEDULED_SYNC_") : "SCHEDULED_SYNC_".concat(valueOf);
    }
}
