package com.google.android.gms.ads.config;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.client.C0341h;
import com.google.android.gms.ads.internal.config.C0365i;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.flag.C0389b;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.ads.config.d */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0235d {

    /* renamed from: a */
    public static final Set f7946a;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("gads:content_age_weight");
        hashSet.add("gads:content_length_weight");
        hashSet.add("gads:dynamite_load:fail:sample_rate");
        hashSet.add("gads:fingerprint_number");
        hashSet.add("gads:min_content_len");
        hashSet.add("gads:sleep_sec");
        f7946a = hashSet;
    }

    /* renamed from: a */
    public static void m5106a(Context context) {
        C0371o.m5339a(context);
        C0341h.m5278e();
        SharedPreferences.Editor edit = C0365i.m5332a(context).edit();
        C0389b.m5383a(new C0234c(edit));
        edit.putString("gad:dynamite_module:experiment_id", cdis.f180958a.mo6606a().mo77655a());
        if (!((Boolean) C0371o.f8212Z.mo6604a()).booleanValue()) {
            C0341h.m5278e();
            C0365i.m5333a(context, edit);
        }
    }
}
