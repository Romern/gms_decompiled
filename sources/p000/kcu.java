package p000;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.android.gms.autofill.data.DataIntent$ResultTransformer;
import java.nio.charset.StandardCharsets;

/* renamed from: kcu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kcu {

    /* renamed from: a */
    public final Intent f23838a;

    /* renamed from: b */
    public final Uri f23839b;

    /* renamed from: c */
    public final DataIntent$ResultTransformer f23840c;

    private kcu(Uri uri, Intent intent, DataIntent$ResultTransformer dataIntent$ResultTransformer) {
        this.f23839b = uri;
        this.f23838a = intent;
        this.f23840c = dataIntent$ResultTransformer;
    }

    /* renamed from: a */
    private static String m17652a(String str) {
        return Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kcu) {
            return bmxi.m108538a(this.f23839b, ((kcu) obj).f23839b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23839b.hashCode();
    }

    /* renamed from: a */
    public static kcu m17653a(Account account, kcs kcs, Intent intent, DataIntent$ResultTransformer dataIntent$ResultTransformer) {
        String format = String.format("account|%s|%s", m17652a(account.type), m17652a(account.name));
        Uri.Builder scheme = new Uri.Builder().scheme("autofill");
        String encode = Uri.encode(format);
        kcn kcn = (kcn) kcs;
        String encode2 = Uri.encode(kcn.f23823a);
        StringBuilder sb = new StringBuilder(String.valueOf(encode).length() + 1 + String.valueOf(encode2).length());
        sb.append(encode);
        sb.append('@');
        sb.append(encode2);
        return new kcu(scheme.encodedAuthority(sb.toString()).path(kcn.f23824b).build(), intent, dataIntent$ResultTransformer);
    }
}
