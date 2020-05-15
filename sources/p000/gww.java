package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.concurrent.TimeUnit;

/* renamed from: gww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gww implements hep {

    /* renamed from: a */
    public final String f19139a;

    /* renamed from: b */
    public final BeginSignInRequest f19140b;

    /* renamed from: c */
    private final Context f19141c;

    /* renamed from: d */
    private final String f19142d;

    /* renamed from: e */
    private final qws f19143e;

    public gww(Context context, String str, String str2, BeginSignInRequest beginSignInRequest, qws qws) {
        sdo.m34959a(context);
        this.f19141c = context;
        sdo.m34977c(str);
        this.f19142d = str;
        sdo.m34977c(str2);
        this.f19139a = str2;
        sdo.m34959a(beginSignInRequest);
        this.f19140b = beginSignInRequest;
        this.f19143e = qws;
    }

    /* renamed from: a */
    public final adbj mo12290a() {
        return adbj.AUTH_API_CREDENTIALS_BEGIN_SIGNIN;
    }

    /* renamed from: a */
    public final bqgg mo12291a(hez hez) {
        bxvd da = bomu.f133718e.mo74144da();
        bxvd da2 = boms.f133709d.mo74144da();
        boolean z = this.f19140b.f10213b.f10216a;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        boms boms = (boms) da2.f164949b;
        int i = boms.f133711a | 1;
        boms.f133711a = i;
        boms.f133712b = z;
        boolean z2 = this.f19140b.f10213b.f10219d;
        boms.f133711a = i | 2;
        boms.f133713c = z2;
        boms boms2 = (boms) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bomu bomu = (bomu) da.f164949b;
        boms2.getClass();
        bomu.f133722c = boms2;
        bomu.f133720a |= 2;
        bxvd da3 = bomt.f133714c.mo74144da();
        boolean z3 = this.f19140b.f10212a.f10220a;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bomt bomt = (bomt) da3.f164949b;
        bomt.f133716a |= 1;
        bomt.f133717b = z3;
        bomt bomt2 = (bomt) da3.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bomu bomu2 = (bomu) da.f164949b;
        bomt2.getClass();
        bomu2.f133721b = bomt2;
        int i2 = bomu2.f133720a | 1;
        bomu2.f133720a = i2;
        String str = this.f19142d;
        str.getClass();
        bomu2.f133720a = i2 | 4;
        bomu2.f133723d = str;
        bomu bomu3 = (bomu) da.mo74062i();
        qws qws = this.f19143e;
        bxvd da4 = bong.f133782r.mo74144da();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bong bong = (bong) da4.f164949b;
        bong.f133785b = 9;
        int i3 = bong.f133784a | 1;
        bong.f133784a = i3;
        String str2 = this.f19139a;
        str2.getClass();
        int i4 = i3 | 2;
        bong.f133784a = i4;
        bong.f133786c = str2;
        bomu3.getClass();
        bong.f133793j = bomu3;
        bong.f133784a = i4 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        qws.mo24333a(da4.mo74062i()).mo24327b();
        try {
            if (((hje) hje.f19881a.mo33309a()).mo12574a(this.f19142d, (int) cccl.f178750a.mo6606a().mo75766a(), TimeUnit.MINUTES) < cccl.m129243b()) {
                return bqdx.m112673a(new hkh(this.f19141c, this.f19142d, this.f19140b).mo12291a(hez), new gwv(this), bqfb.INSTANCE);
            }
            throw adbe.m50106a(28436);
        } catch (PackageManager.NameNotFoundException e) {
            throw adbe.m50106a(28442);
        }
    }
}
