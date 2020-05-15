package p000;

import android.accounts.Account;
import android.graphics.Bitmap;
import android.util.Base64;
import com.google.android.gms.auth.firstparty.dataservice.GoogleAccountData;
import java.io.ByteArrayOutputStream;
import java.util.List;
import org.json.JSONObject;

/* renamed from: wcv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wcv extends cazu {

    /* renamed from: b */
    private final cazn f50513b;

    /* renamed from: c */
    private final cazn f50514c;

    /* renamed from: d */
    private final cazn f50515d;

    public wcv(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        super(cijl2, cbag.m127657a(wcv.class), cijl);
        this.f50513b = cbac.m127643a(cazn);
        this.f50514c = cbac.m127643a(cazn2);
        this.f50515d = cbac.m127643a(cazn3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f50513b.mo75201b(), this.f50514c.mo75201b(), this.f50515d.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        Account account = (Account) list.get(0);
        GoogleAccountData googleAccountData = (GoogleAccountData) list.get(1);
        allh allh = (allh) list.get(2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", account.name);
        if (!bmxx.m108577a(googleAccountData.f10632e)) {
            jSONObject.put("firstName", googleAccountData.f10632e);
        }
        if (!bmxx.m108577a(googleAccountData.f10633f)) {
            jSONObject.put("lastName", googleAccountData.f10633f);
        }
        String str = account.name;
        bmxy.m108588a(allh.mo7183bo().mo17710c());
        Bitmap a = alls.m61238a(allh.mo40486b());
        if (a == null) {
            String valueOf = String.valueOf(str);
            throw new NullPointerException(valueOf.length() == 0 ? new String("Invalid bitmap data for account ") : "Invalid bitmap data for account ".concat(valueOf));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (!a.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream)) {
            String valueOf2 = String.valueOf(str);
            throw new RuntimeException(valueOf2.length() == 0 ? new String("Failed to compress bitmap data for account ") : "Failed to compress bitmap data for account ".concat(valueOf2));
        }
        jSONObject.put("img", Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
        return bqga.m112775a(jSONObject);
    }
}
