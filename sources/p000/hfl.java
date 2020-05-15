package p000;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;

/* renamed from: hfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hfl implements hep {

    /* renamed from: a */
    public final SavePasswordRequest f19660a;

    /* renamed from: b */
    public final String f19661b;

    /* renamed from: c */
    private final Context f19662c;

    /* renamed from: d */
    private final String f19663d;

    /* renamed from: e */
    private final String f19664e;

    /* renamed from: f */
    private final qws f19665f;

    /* renamed from: g */
    private final bmxv f19666g;

    public hfl(Context context, SavePasswordRequest savePasswordRequest, String str, String str2, qws qws, bmxv bmxv, String str3) {
        this.f19662c = context;
        this.f19660a = savePasswordRequest;
        this.f19663d = str;
        this.f19661b = str2;
        this.f19665f = qws;
        this.f19666g = bmxv;
        this.f19664e = str3;
    }

    /* renamed from: a */
    public final adbj mo12290a() {
        return adbj.AUTH_API_CREDENTIALS_SAVE_SIGNIN_PASSWORD;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        if (((p000.aczn) r7.f19666g.mo66814b()).f61169a.hasEnabledAutofillServices() != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0044, code lost:
        if (((p000.hjg) p000.hjg.f19886a.mo33309a()).mo12577b(r7.f19663d) == false) goto L_0x0046;
     */
    /* renamed from: a */
    public final bqgg mo12291a(hez hez) {
        if (!ccdd.f178778a.mo6606a().mo75788a()) {
            if (((Boolean) hfc.f19636a.mo58455c()).booleanValue()) {
                int i = Build.VERSION.SDK_INT;
                if (this.f19666g.mo66813a()) {
                }
            }
            return bqdx.m112674a(new hoo(this.f19662c, this.f19663d).mo12291a(hez), new hfk(this), bqfb.INSTANCE);
        }
        qws qws = this.f19665f;
        bxvd da = bong.f133782r.mo74144da();
        String str = this.f19661b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bong bong = (bong) da.f164949b;
        str.getClass();
        int i2 = bong.f133784a | 2;
        bong.f133784a = i2;
        bong.f133786c = str;
        bong.f133785b = 11;
        bong.f133784a = i2 | 1;
        bxvd da2 = bomy.f133736f.mo74144da();
        String str2 = this.f19664e;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bomy bomy = (bomy) da2.f164949b;
        str2.getClass();
        int i3 = bomy.f133738a | 8;
        bomy.f133738a = i3;
        bomy.f133742e = str2;
        bomy.f133738a = i3 | 2;
        bomy.f133740c = true;
        bomy bomy2 = (bomy) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bong bong2 = (bong) da.f164949b;
        bomy2.getClass();
        bong2.f133795l = bomy2;
        bong2.f133784a |= 1024;
        qws.mo24333a(da.mo74062i()).mo24327b();
        return bqga.m112777a((Throwable) adbe.m50106a(28431));
    }
}
