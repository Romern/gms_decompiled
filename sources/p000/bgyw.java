package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.location.reporting.UlrPrivateModeRequest;
import java.util.Collections;
import java.util.List;

/* renamed from: bgyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgyw {

    /* renamed from: b */
    private static bgyw f118137b;

    /* renamed from: a */
    private final bgyh f118138a;

    /* renamed from: c */
    private final List f118139c;

    public bgyw(List list, bgyh bgyh) {
        this.f118138a = bgyh;
        this.f118139c = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public static synchronized bgyw m100433a(Context context) {
        synchronized (bgyw.class) {
            if (f118137b == null) {
                bgzo.m100459a(context);
                List a = bgzo.m100458a(chdb.f188478a.mo6606a().mo85133a());
                rfz.m33557a(context);
                bgyw bgyw = new bgyw(a, bgyh.m100364a(context));
                f118137b = bgyw;
                return bgyw;
            }
            bgyw bgyw2 = f118137b;
            return bgyw2;
        }
    }

    /* renamed from: a */
    public final synchronized int mo63451a(Context context, String str, UlrPrivateModeRequest ulrPrivateModeRequest) {
        if (!chdb.m148501b()) {
            bgur.m100025c("GCoreUlr", "Ulr private Mode feature is not enabled");
            return 3515;
        } else if (this.f118139c.contains(str)) {
            boolean z = ulrPrivateModeRequest.f79611b;
            boolean b = this.f118138a.mo63411b();
            if (b == z) {
                StringBuilder sb = new StringBuilder(39);
                sb.append("Private mode is already ");
                sb.append(z);
                sb.append(". Ignored!");
                sb.toString();
            } else {
                if (!b) {
                    bgur.m100011a("GCoreUlr", "Enter Private mode!");
                } else {
                    bgur.m100011a("GCoreUlr", "Exit Private mode!");
                }
                SharedPreferences.Editor edit = this.f118138a.f118032a.edit();
                edit.putBoolean("privateModeKey", z);
                edit.apply();
                bgxx.m100278b(context, "PrivateUpdate");
            }
            return 0;
        } else {
            String valueOf = String.valueOf(this.f118139c);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(valueOf).length());
            sb2.append(str);
            sb2.append(" is not in:");
            sb2.append(valueOf);
            bgur.m100025c("GCoreUlr", sb2.toString());
            return 3500;
        }
    }
}
