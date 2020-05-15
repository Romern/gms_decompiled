package p000;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: agcx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agcx {

    /* renamed from: a */
    public final agje f65266a;

    public agcx(agje agje) {
        this.f65266a = agje;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35296a(String str, Bundle bundle) {
        this.f65266a.mo35512p();
        if (!this.f65266a.mo35513q()) {
            String str2 = null;
            if (bundle != null && !bundle.isEmpty()) {
                if (str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f65266a.mo35499a().f65638w.mo35463a(str2);
                this.f65266a.mo35499a().f65639x.mo35459a(System.currentTimeMillis());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo35297a() {
        return this.f65266a.mo35499a().f65639x.mo35458a() > 0;
    }
}
