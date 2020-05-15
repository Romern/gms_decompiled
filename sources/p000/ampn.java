package p000;

import android.content.Context;
import com.android.volley.Request;
import com.google.android.gms.common.internal.ClientContext;
import java.util.HashMap;

/* renamed from: ampn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ampn extends ampo {

    /* renamed from: m */
    final ampo f75686m;

    /* renamed from: n */
    public String f75687n;

    /* JADX WARNING: Illegal instructions before constructor call */
    public ampn(ampo ampo) {
        super(r1, r2, r3, r4, r5, null, null);
        String str;
        Context context = ampo.f44453i;
        String str2 = ampo.f44445e;
        String str3 = ampo.f44444d;
        if (str3 != null) {
            str = str3.replace(str2, "");
        } else {
            str = null;
        }
        boolean z = ampo.f44441a;
        boolean z2 = false;
        if (ampo.f44443c && ((Boolean) rsv.f43612a.mo25081c()).booleanValue()) {
            z2 = true;
        }
        this.f75686m = ampo;
    }

    /* renamed from: a */
    public final int mo25510a() {
        return this.f75686m.f44447g;
    }

    /* renamed from: a */
    public final String mo25518a(String str, String str2) {
        return this.f75686m.mo25518a(str, str2);
    }

    /* renamed from: b */
    public final int mo25524b() {
        return this.f75686m.f44448h;
    }

    /* renamed from: a */
    public final HashMap mo25519a(Context context, ClientContext clientContext) {
        HashMap a = super.mo25519a(context, clientContext);
        String str = this.f75687n;
        if (str != null) {
            a.put("x-goog-sherlog-context", str);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9812a(Request request, String str) {
        this.f75686m.mo9812a(request, str);
    }

    /* renamed from: a */
    public final void mo25538a(Request request, boolean z, String str) {
        this.f75686m.mo25538a(request, z, str);
    }
}
