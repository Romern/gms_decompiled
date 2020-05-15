package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: azhw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azhw extends azhc {

    /* renamed from: b */
    private final azbx f99446b;

    /* renamed from: c */
    private final azcv f99447c;

    /* renamed from: d */
    private final LocalEntityId f99448d;

    /* renamed from: e */
    private azcs f99449e;

    public azhw(Context context, azfx azfx, azbx azbx, azcv azcv, LocalEntityId localEntityId) {
        super(context, azfx, "preKey upload");
        this.f99446b = azbx;
        this.f99447c = azcv;
        this.f99448d = localEntityId;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo54920a(Object obj) {
        cbns cbns = (cbns) obj;
        new Object[1][0] = this.f99448d;
        afjd afjd = (afjd) azht.m85748a(this.f99339a).mo54933a(16);
        ClientContext a = azht.m85748a(this.f99339a).mo54932a(16, this.f99448d);
        if (afjd.f64293f == null) {
            afjd.f64293f = chtv.m149566a(chtu.UNARY, "google.internal.communications.instantmessaging.v1.Registration/SetPreKeys", ciie.m150370a(cbns.f177755c), ciie.m150370a(cbnt.f177759a));
        }
        return (cbnt) afjd.f64296a.mo25553a(afjd.f64293f, a, cbns, (long) afjd.f64289b, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo54924b() {
        byte[] bArr;
        new Object[1][0] = this.f99448d;
        bxvd da = cbns.f177755c.mo74144da();
        azcs a = this.f99447c.mo54689a(this.f99448d);
        this.f99449e = a;
        if (a != null) {
            bArr = a.f99002a;
        } else {
            bArr = null;
        }
        cbmo a2 = azfn.m85575a(bArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a2.getClass();
        ((cbns) da.f164949b).f177757a = a2;
        if (cfeo.f183719a.mo6606a().mo81068ct() && (azdl.m85412a(this.f99339a).mo54789k() == null || azdl.m85412a(this.f99339a).mo54790l() == null)) {
            azct c = azcv.m85357a(this.f99339a).mo54699c(this.f99448d);
            if (c == null || c.f99008e == null || c.f99007d == null) {
                azoj.m85933c("UploadPrekeysH", "Key pair missing in DB, failed to copy", new Object[0]);
                azph.m85998a(this.f99339a).mo55141a(1656, this.f99448d);
            } else {
                azdl.m85412a(this.f99339a).mo54746a(c.f99008e);
                azdl.m85412a(this.f99339a).mo54754b(c.f99007d);
                azph.m85998a(this.f99339a).mo55141a(1657, this.f99448d);
            }
        }
        List a3 = this.f99446b.mo54584a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbns cbns = (cbns) da.f164949b;
        if (!cbns.f177758b.mo73666a()) {
            cbns.f177758b = bxvk.m124021a(cbns.f177758b);
        }
        bxsy.m123078a(a3, cbns.f177758b);
        new Object[1][0] = da.mo74062i();
        return (cbns) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54922a(Object obj, Exception exc) {
        cbns cbns = (cbns) obj;
        azph.m85998a(this.f99339a).mo55154a(138, exc);
        azoj.m85931a("UploadPrekeysH", exc, "Error uploading prekeys", new Object[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54923a(Object obj, Object obj2) {
        cbns cbns = (cbns) obj;
        azph.m85998a(this.f99339a).mo55141a(137, this.f99448d);
        Object[] objArr = {(cbnt) obj2};
    }
}
