package p000;

import android.net.Uri;

/* renamed from: bcdn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcdn {

    /* renamed from: a */
    public bngx f104007a;

    /* renamed from: b */
    public String f104008b;

    /* renamed from: c */
    public bngx f104009c;

    /* renamed from: d */
    public String f104010d;

    /* renamed from: e */
    public bmxz f104011e;

    /* renamed from: f */
    private Uri f104012f;

    /* renamed from: g */
    private Integer f104013g;

    /* renamed from: h */
    private Integer f104014h;

    /* renamed from: a */
    public final bcdo mo56713a() {
        String str = this.f104012f == null ? " tableUri" : "";
        if (this.f104013g == null) {
            str = str.concat(" limit");
        }
        if (this.f104014h == null) {
            str = String.valueOf(str).concat(" offset");
        }
        if (str.isEmpty()) {
            return new bccy(this.f104012f, this.f104007a, this.f104008b, this.f104009c, this.f104010d, this.f104013g.intValue(), this.f104014h.intValue(), this.f104011e);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo56716b(int i) {
        this.f104014h = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo56714a(int i) {
        this.f104013g = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo56715a(Uri uri) {
        if (uri != null) {
            this.f104012f = uri;
            return;
        }
        throw new NullPointerException("Null tableUri");
    }
}
