package p000;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import com.google.android.gms.auth.api.credentials.Credential;
import java.util.Locale;

/* renamed from: hsm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hsm {

    /* renamed from: a */
    public final int f20369a;

    /* renamed from: b */
    public final boolean f20370b;

    /* renamed from: c */
    public final String f20371c;

    /* renamed from: d */
    public final String f20372d;

    /* renamed from: e */
    public final String f20373e;

    public hsm(hsl hsl) {
        this.f20369a = hsl.f20364a;
        this.f20371c = hsl.f20365b;
        this.f20372d = hsl.f20367d;
        this.f20373e = hsl.f20368e;
        this.f20370b = hsl.f20366c;
    }

    /* renamed from: a */
    public static hsm m14822a(Credential credential) {
        int i;
        hsl hsl = new hsl();
        if (!Patterns.EMAIL_ADDRESS.matcher(credential.f10092a).matches()) {
            i = !Patterns.PHONE.matcher(credential.f10092a).matches() ? 3 : 1;
        } else {
            i = 2;
        }
        if (!TextUtils.isEmpty(credential.f10093b)) {
            hsl.f20367d = credential.f10093b;
            hsl.f20368e = m14823a(credential.f10092a, i);
        } else {
            hsl.f20367d = m14823a(credential.f10092a, i);
        }
        hsl.mo12694a(i);
        Uri uri = credential.f10094c;
        if (uri != null) {
            hsl.f20365b = uri.toString();
        }
        return hsl.mo12693a();
    }

    /* renamed from: a */
    private static String m14823a(String str, int i) {
        if (i != 1) {
            return str;
        }
        beao a = beao.m91670a();
        try {
            str = a.mo58486a(a.mo58483a(str, Locale.getDefault().getCountry()), 3);
        } catch (bean e) {
        }
        return C1211nd.m19662a(Locale.getDefault()).mo15491a(str);
    }
}
