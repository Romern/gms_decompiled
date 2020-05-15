package p000;

import java.net.URLEncoder;

/* renamed from: wdl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wdl implements cayy {

    /* renamed from: a */
    private final cijl f50552a;

    public wdl(cijl cijl) {
        this.f50552a = cijl;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        String valueOf = String.valueOf(URLEncoder.encode(((bycs) this.f50552a.mo6445a()).f165686e));
        String encode = URLEncoder.encode(valueOf.length() == 0 ? new String("continue=") : "continue=".concat(valueOf));
        StringBuilder sb = new StringBuilder(String.valueOf(encode).length() + 14);
        sb.append("weblogin:");
        sb.append(encode);
        sb.append("&de=1");
        String sb2 = sb.toString();
        cazf.m127593a(sb2, "Cannot return null from a non-@Nullable @Provides method");
        return sb2;
    }
}
