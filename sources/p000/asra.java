package p000;

import java.util.Set;
import org.json.JSONObject;

/* renamed from: asra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asra implements assh {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ asrx mo3414a(JSONObject jSONObject, JSONObject jSONObject2) {
        return new asqy(jSONObject);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ asry mo3415a(asrx asrx, JSONObject jSONObject, byte[] bArr, asrz asrz, Set set) {
        asqy asqy = (asqy) asrx;
        if (asrz.mo49426b()) {
            return new asqz(asqy.f89470a, new ctp(jSONObject));
        }
        throw new assg();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ assc mo3416a(asrx asrx, JSONObject jSONObject, byte[] bArr, asse asse, asrz asrz) {
        ctp ctp = new ctp(jSONObject);
        ctr a = cth.m7546a(new ctn(((asqy) asrx).f89470a, ctp), (int) (Math.abs(asse.f89557a) % 100000000));
        return new asrv(ctp.f12030a, a.mo8293a(), a.f12037a, a.f12038b, a.f12039c + 2000);
    }
}
