package p000;

import android.util.Base64;
import com.felicanetworks.cmnctrl.net.DataParser;
import java.io.ByteArrayInputStream;

/* renamed from: bcwk */
final /* synthetic */ class bcwk implements bqeh {

    /* renamed from: a */
    private final bcwl f105062a;

    /* renamed from: b */
    private final cbnb f105063b;

    public bcwk(bcwl bcwl, cbnb cbnb) {
        this.f105062a = bcwl;
        this.f105063b = cbnb;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bcwl bcwl = this.f105062a;
        cbnb cbnb = this.f105063b;
        bcwg bcwg = (bcwg) obj;
        byte[] bArr = bcwl.f105064a;
        String encodeToString = Base64.encodeToString(cbnb.mo73642k(), 2);
        String str = (String) bcwg.f105052b.f103161c.mo58455c();
        bzsv a = bzsw.m126179a();
        a.f171297a = 5;
        bzsw a2 = a.mo74579a();
        bzsf bzsf = new bzsf(new ByteArrayInputStream(bArr), 4000000);
        bzsa bzsa = new bzsa();
        bzsa.mo74559a("X-Goog-Upload-Header-Content-Length", Long.toString((long) bArr.length));
        String valueOf = String.valueOf(bcwg.f105053c);
        bzsa.mo74559a("Authorization", valueOf.length() == 0 ? new String("Bearer ") : "Bearer ".concat(valueOf));
        return bqdx.m112673a(bcwg.f105054d.mo74581a(str, DataParser.CONNECT_TYPE_POST, bzsa, bzsf, encodeToString, a2).mo74567a(), new bcwf(), bcwg.f105051a);
    }
}
