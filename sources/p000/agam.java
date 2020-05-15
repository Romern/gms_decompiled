package p000;

import com.google.android.gms.mdns.MdnsOptions;

/* renamed from: agam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agam {

    /* renamed from: a */
    private final String f65079a;

    /* renamed from: b */
    private final String f65080b;

    public agam(String str, String str2) {
        sdo.m34959a((Object) str);
        this.f65079a = str;
        sdo.m34977c(str2);
        this.f65080b = str2;
    }

    /* renamed from: a */
    public final MdnsOptions mo35140a() {
        return new MdnsOptions(this.f65079a, this.f65080b);
    }
}
