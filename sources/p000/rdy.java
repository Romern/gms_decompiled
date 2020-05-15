package p000;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPost;

/* renamed from: rdy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rdy extends HttpPost {

    /* renamed from: a */
    private final rea f42770a;

    /* renamed from: b */
    private HttpEntity f42771b;

    /* renamed from: c */
    private final sqv f42772c;

    public rdy(String str, rea rea, sqv sqv) {
        super(str);
        this.f42770a = rea;
        this.f42772c = sqv;
    }

    public final HttpEntity getEntity() {
        if (this.f42771b == null) {
            this.f42771b = new rdx(this.f42770a);
        }
        return this.f42771b;
    }
}
