package p000;

import android.content.Context;
import android.util.Base64;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Map;

/* renamed from: tdj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tdj {

    /* renamed from: b */
    private static final sek f45695b = tea.m36798a("droidguard_provider");

    /* renamed from: c */
    private static final Charset f45696c = Charset.forName("UTF-8");

    /* renamed from: a */
    public vvq f45697a;

    /* renamed from: a */
    public static String m36753a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes(f45696c));
            return Base64.encodeToString(Arrays.copyOf(instance.digest(), 64), 3).substring(0, 32);
        } catch (NoSuchAlgorithmException e) {
            f45695b.mo25415d("NoSuchAlgorithmException", e, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public final String mo26396a(Map map) {
        f45695b.mo25409a("getting snapshot", new Object[0]);
        return this.f45697a.mo28905a(map);
    }

    /* renamed from: a */
    public final void mo26397a(Context context, String str) {
        this.f45697a = vvp.m41462a(context, str);
    }
}
