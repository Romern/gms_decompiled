package p000;

import com.google.android.gms.auth.api.credentials.Credential;

/* renamed from: hml */
final /* synthetic */ class hml implements bqeh {

    /* renamed from: a */
    private final hms f20025a;

    /* renamed from: b */
    private final acyr f20026b;

    /* renamed from: c */
    private final String f20027c;

    /* renamed from: d */
    private final String f20028d;

    /* renamed from: e */
    private final String f20029e;

    public hml(hms hms, acyr acyr, String str, String str2, String str3) {
        this.f20025a = hms;
        this.f20026b = acyr;
        this.f20027c = str;
        this.f20028d = str2;
        this.f20029e = str3;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        hms hms = this.f20025a;
        Credential credential = (Credential) obj;
        return bqdf.m112619a(hms.f20044d.mo25819b(new hmo(hms, this.f20026b, this.f20027c, this.f20028d, this.f20029e, credential)), Exception.class, new hmp(credential), bqfb.INSTANCE);
    }
}
