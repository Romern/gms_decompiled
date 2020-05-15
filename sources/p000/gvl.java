package p000;

import android.net.Uri;
import com.google.android.gms.auth.api.credentials.Credential;
import java.util.List;

/* renamed from: gvl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gvl {

    /* renamed from: a */
    public String f19077a;

    /* renamed from: b */
    public Uri f19078b;

    /* renamed from: c */
    public List f19079c;

    /* renamed from: d */
    public String f19080d;

    /* renamed from: e */
    public String f19081e;

    /* renamed from: f */
    public String f19082f;

    /* renamed from: g */
    public String f19083g;

    /* renamed from: h */
    private final String f19084h;

    public gvl(Credential credential) {
        this.f19084h = credential.f10092a;
        this.f19077a = credential.f10093b;
        this.f19078b = credential.f10094c;
        this.f19079c = credential.f10095d;
        this.f19080d = credential.f10096e;
        this.f19081e = credential.f10097f;
        this.f19082f = credential.f10098g;
        this.f19083g = credential.f10099h;
    }

    /* renamed from: a */
    public final Credential mo12267a() {
        return new Credential(this.f19084h, this.f19077a, this.f19078b, this.f19079c, this.f19080d, this.f19081e, this.f19082f, this.f19083g);
    }

    public gvl(String str) {
        this.f19084h = str;
    }
}
