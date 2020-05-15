package p000;

import android.content.Context;
import java.util.Collections;

/* renamed from: bifp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bifp {
    /* renamed from: a */
    public static final bifo m102273a(Context context, String str, String str2) {
        avwv avwv = new avwv();
        avwv.f94048b = "LEGACY_PLACES_MODULE";
        avwv.f94049c = Collections.singletonList(str);
        if (!stm.m36302d(str2)) {
            if (stm.m36302d(str2)) {
                String valueOf = String.valueOf(str2);
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid account name used : ") : "Invalid account name used : ".concat(valueOf));
            }
            avwv.f94047a = str2;
        }
        if (!stm.m36302d(avwv.f94048b)) {
            return new bifo(new avwu(context, new avww(avwv.f94047a, avwv.f94048b, avwv.f94049c)));
        }
        throw new IllegalArgumentException("Missing a client identifier");
    }
}
