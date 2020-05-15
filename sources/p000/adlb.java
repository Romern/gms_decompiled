package p000;

import android.content.Intent;
import android.text.TextUtils;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: adlb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adlb {
    /* renamed from: a */
    public static Intent m50785a(boolean z) {
        Intent flags = new Intent().setClassName("com.google.android.gms", "com.google.android.gms.instantapps.settings.OptInActivity").putExtra("lastChance", z).setFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
        if (!TextUtils.isEmpty(null)) {
            flags.putExtra("defaultAccount", (String) null);
        }
        return flags;
    }
}
