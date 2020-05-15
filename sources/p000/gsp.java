package p000;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import java.util.Arrays;

@Deprecated
/* renamed from: gsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gsp implements rjh, rjj {

    /* renamed from: a */
    public static final gsp f18959a = new gso().mo12173a();

    /* renamed from: b */
    public final String f18960b;

    /* renamed from: c */
    public final boolean f18961c;

    /* renamed from: d */
    public final String f18962d;

    public gsp(gso gso) {
        this.f18960b = gso.f18956a;
        this.f18961c = gso.f18957b.booleanValue();
        this.f18962d = gso.f18958c;
    }

    /* renamed from: a */
    public static gsp m13834a(Bundle bundle) {
        gso gso = new gso();
        ClassLoader classLoader = PasswordSpecification.class.getClassLoader();
        sdo.m34959a(classLoader);
        bundle.setClassLoader(classLoader);
        String string = bundle.getString("consumer_package");
        if (!TextUtils.isEmpty(string)) {
            sdo.m34959a((Object) string);
            gso.f18956a = string;
        }
        if (bundle.containsKey("force_save_dialog") && bundle.getBoolean("force_save_dialog", false)) {
            gso.f18957b = true;
        }
        String string2 = bundle.getString("log_session_id");
        if (!TextUtils.isEmpty(string2)) {
            gso.f18958c = string2;
        }
        return gso.mo12173a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gsp) {
            gsp gsp = (gsp) obj;
            return sdg.m34949a(this.f18960b, gsp.f18960b) && this.f18961c == gsp.f18961c && sdg.m34949a(this.f18962d, gsp.f18962d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18960b, Boolean.valueOf(this.f18961c), this.f18962d});
    }
}
