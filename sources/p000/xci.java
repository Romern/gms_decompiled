package p000;

import android.content.Context;
import android.security.keystore.KeyInfo;
import java.security.PublicKey;

/* renamed from: xci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class xci implements xch {

    /* renamed from: a */
    private final xmo f51921a;

    /* renamed from: b */
    private final byte[] f51922b;

    /* renamed from: c */
    private final String f51923c;

    public xci(Context context, byte[] bArr, String str) {
        bmxy.m108581a(context);
        bmxy.m108581a(bArr);
        bmxy.m108581a(str);
        this.f51921a = wzk.m42530d(context);
        int i = xdf.f51991a;
        this.f51922b = bArr;
        this.f51923c = str;
        xdf.m42704c(str);
    }

    /* renamed from: a */
    public bqgg mo29630a() {
        this.f51921a.mo29952a(this.f51923c, System.currentTimeMillis());
        return adbb.m50100a(this.f51921a.mo29951a(this.f51923c));
    }

    /* renamed from: b */
    public final byte[] mo29631b() {
        return this.f51922b;
    }

    /* renamed from: c */
    public final PublicKey mo29632c() {
        PublicKey b = xdf.m42703b(this.f51923c);
        if (b != null) {
            return b;
        }
        adbd a = adbe.m50105a();
        a.f61234c = 8;
        a.f61232a = "Failed to get the public key.";
        throw a.mo33301a();
    }

    public xci(xmo xmo, xdf xdf, byte[] bArr, String str, KeyInfo keyInfo) {
        bmxy.m108581a(xmo);
        bmxy.m108581a(xdf);
        bmxy.m108581a(bArr);
        bmxy.m108581a(str);
        bmxy.m108581a(keyInfo);
        this.f51921a = xmo;
        this.f51922b = bArr;
        this.f51923c = str;
    }
}
