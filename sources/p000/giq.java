package p000;

import android.text.TextUtils;
import com.google.android.gms.auth.TokenData;
import java.util.List;

/* renamed from: giq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class giq {

    /* renamed from: a */
    public String f18307a = null;

    /* renamed from: b */
    public Long f18308b = null;

    /* renamed from: c */
    public boolean f18309c = false;

    /* renamed from: d */
    public boolean f18310d = false;

    /* renamed from: e */
    public List f18311e = null;

    /* renamed from: f */
    public String f18312f = null;

    /* renamed from: a */
    public final TokenData mo11915a() {
        if (this.f18310d && this.f18311e == null) {
            throw new IllegalStateException("Granted scopes must be set if the token is snowballed.");
        } else if (!TextUtils.isEmpty(this.f18307a)) {
            return new TokenData(1, this.f18307a, this.f18308b, this.f18309c, this.f18310d, this.f18311e, this.f18312f);
        } else {
            return null;
        }
    }
}
