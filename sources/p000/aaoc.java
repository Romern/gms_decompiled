package p000;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: aaoc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaoc {

    /* renamed from: a */
    public final aaob f28675a;

    /* renamed from: b */
    public final brta f28676b;

    public aaoc(blmp blmp) {
        this.f28675a = aaob.m21739a(blmp);
        this.f28676b = new brta(m21743a(blmp));
    }

    /* renamed from: a */
    public static Bundle m21743a(blmp blmp) {
        Bundle bundle = new Bundle();
        bundle.putString("from", blmp.f126868c);
        if (!blmp.f126880o.mo73779j()) {
            bundle.putByteArray("rawData", blmp.f126880o.mo73780k());
        }
        String str = blmp.f126871f;
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("collapse_key", str);
        }
        long j = blmp.f126878m;
        if (j != 0) {
            bundle.putLong("google.sent_time", j);
        }
        String str2 = blmp.f126873h;
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("google.message_id", str2);
        }
        int i = blmp.f126877l;
        if (i != 0) {
            bundle.putInt("google.ttl", i);
        }
        if (blmp.f126882q >= 10) {
            bundle.putString("google.original_priority", "high");
        } else {
            bundle.putString("google.original_priority", "normal");
        }
        int i2 = blmp.f126882q;
        if (i2 >= 10 && i2 != 17) {
            bundle.putString("google.delivered_priority", "high");
        } else {
            bundle.putString("google.delivered_priority", "normal");
        }
        bxwc bxwc = blmp.f126872g;
        int size = bxwc.size();
        for (int i3 = 0; i3 < size; i3++) {
            blmi blmi = (blmi) bxwc.get(i3);
            String str3 = blmi.f126845b;
            String str4 = blmi.f126846c;
            if (!"from".equals(str3) && (!str3.toLowerCase(Locale.US).startsWith("google.") || str3.toLowerCase(Locale.US).startsWith("google.c."))) {
                bundle.putString(str3, str4);
            }
        }
        return bundle;
    }
}
