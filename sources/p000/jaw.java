package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* renamed from: jaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jaw extends aaab {

    /* renamed from: a */
    private final izw f22046a;

    /* renamed from: b */
    private final jcm f22047b = ((jcm) jcm.f22159a.mo13145b());

    /* renamed from: c */
    private final jcf f22048c = ((jcf) jcf.f22150a.mo13145b());

    /* renamed from: d */
    private final String f22049d;

    /* renamed from: e */
    private final String f22050e;

    public jaw(izw izw, String str, String str2) {
        super(172, "MarkLocalKeysAsStale");
        this.f22046a = izw;
        sdo.m34977c(str);
        this.f22049d = str;
        sdo.m34977c(str2);
        this.f22050e = str2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: jcf.a(java.lang.String, java.lang.String, boolean):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      jcf.a(java.lang.String, java.lang.String, java.util.List):void
      jcf.a(java.lang.String, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        try {
            this.f22048c.mo13572a(this.f22050e, this.f22049d, true);
            this.f22046a.mo13540a(Status.f30107a);
        } catch (gid | IOException e) {
            this.f22046a.mo13540a(Status.f30109c);
        }
        jcn jcn = new jcn();
        jcn.f22164a = new Account(this.f22050e, "com.google");
        jcn.mo13586a(this.f22049d);
        jcn.f22165b = jco.INVALIDATE_LOCAL_KEYS;
        this.f22047b.mo13583b(jcn.mo13585a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f22046a.mo13540a(status);
    }
}
