package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: jay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jay extends aaab {

    /* renamed from: a */
    private static final Logger f22057a = jdh.m16547a("SetKeyMaterialOperation");

    /* renamed from: b */
    private final izw f22058b;

    /* renamed from: c */
    private final jcf f22059c = ((jcf) jcf.f22150a.mo13145b());

    /* renamed from: d */
    private final jcm f22060d = ((jcm) jcm.f22159a.mo13145b());

    /* renamed from: e */
    private final String f22061e;

    /* renamed from: f */
    private final String f22062f;

    /* renamed from: g */
    private final SharedKey[] f22063g;

    public jay(izw izw, String str, String str2, SharedKey[] sharedKeyArr) {
        super(172, "SetKeyMaterial");
        this.f22058b = izw;
        sdo.m34977c(str2);
        this.f22061e = str2;
        sdo.m34977c(str);
        this.f22062f = str;
        this.f22063g = (SharedKey[]) sdo.m34959a(sharedKeyArr);
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
            if (spn.m35869b()) {
                jcf jcf = this.f22059c;
                String str = this.f22061e;
                String str2 = this.f22062f;
                SharedKey[] sharedKeyArr = this.f22063g;
                int length = sharedKeyArr.length;
                ArrayList arrayList = new ArrayList(length);
                for (SharedKey sharedKey : sharedKeyArr) {
                    bxvd da = jbg.f22090c.mo74144da();
                    int i = sharedKey.f10905a;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ((jbg) da.f164949b).f22092a = i;
                    ByteString a = ByteString.m123261a(sharedKey.f10906b);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    a.getClass();
                    ((jbg) da.f164949b).f22093b = a;
                    arrayList.add((jbg) da.mo74062i());
                }
                jcf.mo13570a(str, str2, arrayList);
                this.f22059c.mo13572a(this.f22061e, this.f22062f, false);
                jcn jcn = new jcn();
                jcn.f22164a = new Account(this.f22061e, "com.google");
                jcn.mo13586a(this.f22062f);
                jcn.f22165b = jco.SET_KEY_MATERIAL;
                this.f22060d.mo13583b(jcn.mo13585a());
                this.f22058b.mo13540a(Status.f30107a);
                return;
            }
            f22057a.mo25418e("Blocked attempt to use 0P API", new Object[0]);
            throw new SecurityException("Access denied");
        } catch (gid | IOException e) {
            this.f22058b.mo13540a(new Status(8));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f22058b.mo13540a(status);
    }
}
