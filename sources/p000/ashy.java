package p000;

import java.net.URI;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;

/* renamed from: ashy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ashy implements ashx {

    /* renamed from: a */
    private final String f88997a;

    /* renamed from: b */
    private final HttpEntity f88998b;

    public ashy(String str, HttpEntity httpEntity) {
        this.f88997a = str;
        this.f88998b = httpEntity;
    }

    /* renamed from: a */
    public final HttpUriRequest mo49166a(URI uri) {
        HttpPost httpPost = new HttpPost(uri);
        String str = this.f88997a;
        if (str != null) {
            httpPost.addHeader("X-HTTP-Method-Override", str);
        }
        httpPost.setEntity(this.f88998b);
        return httpPost;
    }
}
