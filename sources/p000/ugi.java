package p000;

import android.content.Context;
import android.net.Uri;
import com.felicanetworks.cmnctrl.net.DataParser;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

/* renamed from: ugi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ugi implements ugu {

    /* renamed from: a */
    protected final Context f47526a;

    /* renamed from: b */
    protected final ugt f47527b;

    /* renamed from: c */
    protected final ufb f47528c;

    /* renamed from: d */
    final ugv f47529d;

    /* renamed from: e */
    int f47530e = 0;

    public ugi(Context context, ugt ugt, ufb ufb, ugv ugv) {
        sdo.m34959a(context);
        this.f47526a = context;
        sdo.m34959a(ugt);
        this.f47527b = ugt;
        sdo.m34959a(ufb);
        this.f47528c = ufb;
        sdo.m34959a(ugv);
        this.f47529d = ugv;
    }

    /* renamed from: f */
    private static final Uri.Builder m38328f() {
        Uri.Builder builder = new Uri.Builder();
        List c = bmyx.m108643a("://").mo66925c((CharSequence) twy.f46800K.mo58455c());
        builder.scheme((String) c.get(0));
        builder.authority((String) c.get(1));
        builder.appendPath("upload");
        for (String str : bmyx.m108643a("/").mo66918a((CharSequence) "/drive/v2beta/")) {
            builder.appendPath(str);
        }
        return builder;
    }

    /* renamed from: a */
    public final int mo27324a() {
        return this.f47530e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final URL mo27325b() {
        String str;
        ugt ugt = this.f47527b;
        if (!ugt.f47564c) {
            sdo.m34959a(ugt.f47565d);
            sdo.m34959a((Object) this.f47527b.f47565d.f30728a);
            Uri.Builder appendQueryParameter = m38328f().appendPath("files").appendPath(this.f47527b.f47565d.f30728a).appendQueryParameter("setModifiedDate", "true");
            if (!mo27326c().isEmpty()) {
                appendQueryParameter.appendQueryParameter("uploadType", mo27326c());
            }
            str = appendQueryParameter.build().toString();
        } else {
            Uri.Builder appendQueryParameter2 = m38328f().appendPath("files").appendQueryParameter("setModifiedDate", "true");
            if (!mo27326c().isEmpty()) {
                appendQueryParameter2.appendQueryParameter("uploadType", mo27326c());
            }
            str = appendQueryParameter2.build().toString();
        }
        return ugv.m38381a(str, new HashMap());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo27326c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo27327d() {
        return !this.f47527b.f47564c ? "PUT" : DataParser.CONNECT_TYPE_POST;
    }
}
