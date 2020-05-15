package p000;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fty {

    /* renamed from: a */
    protected String f17233a;

    /* renamed from: b */
    protected String f17234b;

    /* renamed from: c */
    protected final Map f17235c = new HashMap();

    /* renamed from: d */
    public String f17236d;

    /* renamed from: e */
    protected String f17237e;

    /* renamed from: f */
    public String f17238f;

    /* renamed from: g */
    public String f17239g;

    /* renamed from: h */
    public String f17240h;

    /* renamed from: i */
    protected boolean f17241i;

    /* renamed from: a */
    public final ftz mo11327a() {
        return new ftz(this.f17233a, this.f17234b, this.f17237e, this.f17239g, this.f17240h, this.f17235c, this.f17241i, this.f17236d, this.f17238f);
    }

    /* renamed from: a */
    public final void mo11330a(String str, boolean z) {
        this.f17237e = str;
        this.f17241i = z;
    }

    /* renamed from: b */
    public final void mo11331b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f17234b = str;
            return;
        }
        throw new IllegalArgumentException("A valid tableName must be supplied");
    }

    /* renamed from: a */
    public final void mo11328a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f17233a = str;
            return;
        }
        throw new IllegalArgumentException("A valid corpus ID must be supplied");
    }

    /* renamed from: a */
    public final void mo11329a(String str, String str2) {
        if (this.f17235c.containsKey(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Corpus map already contains mapping for section ") : "Corpus map already contains mapping for section ".concat(valueOf));
        } else {
            this.f17235c.put(str, str2);
        }
    }
}
