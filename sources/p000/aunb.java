package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;

/* renamed from: aunb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aunb extends aune {

    /* renamed from: c */
    private static WeakReference f92126c = new WeakReference(null);

    public aunb(Context context) {
        super(context, aumk.f92083b);
    }

    /* renamed from: a */
    public static synchronized aunb m77366a(Context context) {
        aunb aunb;
        synchronized (aunb.class) {
            aunb = (aunb) f92126c.get();
            if (aunb == null) {
                aunb = new aunb(context.getApplicationContext());
                f92126c = new WeakReference(aunb);
            }
        }
        return aunb;
    }

    /* renamed from: a */
    public final SharedPreferences mo50695a() {
        return aupo.m77578a(this.f92124a);
    }

    /* renamed from: a */
    public final String mo50696a(aumy aumy, String str) {
        if (aumy.equals(aumk.f92084c)) {
            return "auth_trust_agent_pref_trustlet_enabled_FaceUnlockTrustlet";
        }
        throw new IllegalArgumentException("Unsupported attribute.");
    }
}
