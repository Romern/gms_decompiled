package p000;

import android.content.Context;
import com.android.volley.NetworkResponse;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Locale;

/* renamed from: avau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class avau extends avav {

    /* renamed from: k */
    private static final srn f92878k = srn.m36124a();

    /* renamed from: a */
    protected final avap f92879a;

    /* renamed from: b */
    protected final byte[] f92880b;

    public avau(Context context, avdl avdl, ClientContext clientContext, String str, String str2, avap avap, byte[] bArr) {
        super(context, avdl, clientContext, str, str2);
        sdo.m34959a(avap);
        this.f92879a = avap;
        this.f92880b = (byte[]) sdo.m34959a(bArr);
    }

    /* renamed from: a */
    static String m78158a(String str) {
        if (stm.m36302d(str)) {
            str = "me";
        }
        if (str.equalsIgnoreCase("me") || chbe.f188233a.mo6606a().mo84915k()) {
            return str;
        }
        throw new avbp("User delegation is disabled.");
    }

    /* renamed from: a */
    static boolean m78159a(String str, String str2) {
        return !avjb.m78604a(str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final aaaj mo51128a(VolleyError volleyError) {
        if (volleyError instanceof TimeoutError) {
            return new aaaj(15, null);
        }
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse == null) {
            return new aaaj(4502, null);
        }
        if (networkResponse.statusCode == 403) {
            bnsl bnsl = (bnsl) f92878k.mo68387b();
            bnsl.mo68432a("avau", "a", 62, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("package '%s' doesn't have access to the API", this.f92887h);
            if (rfy.m33549f(this.f92882c)) {
                sil.m35353a(volleyError, this.f27820m);
                bnsl bnsl2 = (bnsl) f92878k.mo68387b();
                bnsl2.mo68432a("avau", "a", 65, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("package '%s' needs to be white-listed for UDC API", this.f92887h);
            }
        }
        return new aaaj(4505, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final avcc mo51129a() {
        return new avcc(this.f92882c, this.f92886g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bxvd mo51130a(bxss bxss) {
        bxvd bxvd = (bxvd) bxss.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bxss);
        String format = String.format(Locale.ENGLISH, "%d;%d", 201515000, Integer.valueOf(ModuleManager.get(this.f92882c).getCurrentModule().moduleVersion));
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bxss bxss2 = (bxss) bxvd.f164949b;
        bxss bxss3 = bxss.f164728i;
        format.getClass();
        bxss2.f164730a |= 16;
        bxss2.f164734e = format;
        bxvd da = bxsq.f164721c.mo74144da();
        String str = this.f92887h;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxsq bxsq = (bxsq) da.f164949b;
        str.getClass();
        bxsq.f164723a = 1 | bxsq.f164723a;
        bxsq.f164724b = str;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bxss bxss4 = (bxss) bxvd.f164949b;
        bxsq bxsq2 = (bxsq) da.mo74062i();
        bxsq2.getClass();
        bxss4.f164735f = bxsq2;
        bxss4.f164730a |= 32;
        return bxvd;
    }
}
