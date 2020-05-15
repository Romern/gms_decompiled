package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* renamed from: jax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jax extends aaab {

    /* renamed from: a */
    private final izz f22051a;

    /* renamed from: b */
    private final String f22052b;

    /* renamed from: c */
    private final String f22053c;

    /* renamed from: d */
    private final boolean f22054d;

    /* renamed from: e */
    private final jcm f22055e = ((jcm) jcm.f22159a.mo13145b());

    /* renamed from: f */
    private final jcf f22056f = ((jcf) jcf.f22150a.mo13145b());

    public jax(izz izz, String str, String str2, boolean z) {
        super(172, "SetConsent");
        this.f22051a = izz;
        sdo.m34977c(str);
        this.f22052b = str;
        sdo.m34977c(str2);
        this.f22053c = str2;
        this.f22054d = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        int i = 8;
        try {
            jcn jcn = new jcn();
            jcn.f22164a = new Account(this.f22053c, "com.google");
            jcn.mo13586a(this.f22052b);
            jcn.f22165b = jco.SET_CONSENT;
            jcn.f22166c = bmxv.m108566b(Boolean.valueOf(this.f22054d));
            this.f22055e.mo13582a(jcn.mo13585a());
            try {
                jcf jcf = this.f22056f;
                String str = this.f22053c;
                bqfy.m112768a(jcf.f22152c.mo60777a(new jbw(jcf.f22151b.mo13599a(str), this.f22052b, this.f22054d), bqfb.INSTANCE), IOException.class);
                this.f22051a.mo13541a(Status.f30107a, this.f22054d);
            } catch (gid | IOException e) {
                this.f22051a.mo13541a(new Status(8, "Could not save consent locally."), false);
            }
        } catch (jck e2) {
            izz izz = this.f22051a;
            int i2 = e2.f22158a;
            int i3 = i2 - 1;
            if (i2 != 0) {
                if (i3 == 7) {
                    i = 7;
                } else if (i3 == 8 || i3 == 9) {
                    i = 38501;
                } else if (i3 == 11) {
                    i = 38500;
                }
                izz.mo13541a(new Status(i, "Could not sync consent."), false);
                return;
            }
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f22051a.mo13541a(status, false);
    }
}
