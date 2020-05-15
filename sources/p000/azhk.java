package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.util.concurrent.TimeUnit;

/* renamed from: azhk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azhk extends azhc {

    /* renamed from: b */
    public final String f99382b;

    /* renamed from: c */
    public final int f99383c;

    /* renamed from: d */
    private final byte[] f99384d;

    /* renamed from: e */
    private LocalEntityId f99385e;

    /* renamed from: f */
    private azhj f99386f;

    public azhk(Context context, azfx azfx, byte[] bArr, String str, int i) {
        super(context, azfx, "LookupRegistered");
        this.f99384d = bArr;
        this.f99382b = str;
        this.f99383c = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo54920a(Object obj) {
        cbkm cbkm = (cbkm) obj;
        afjd afjd = (afjd) azht.m85748a(this.f99339a).mo54933a(16);
        ClientContext a = azht.m85748a(this.f99339a).mo54932a(16, this.f99385e);
        if (afjd.f64292e == null) {
            afjd.f64292e = chtv.m149566a(chtu.UNARY, "google.internal.communications.instantmessaging.v1.Registration/LookupRegistered", ciie.m150370a(cbkm.f177424b), ciie.m150370a(cbkn.f177427a));
        }
        return (cbkn) afjd.f64296a.mo25553a(afjd.f64292e, a, cbkm, (long) afjd.f64289b, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo54924b() {
        this.f99386f = new azhj(this);
        cbkm cbkm = (cbkm) azol.m85935a((bxxk) cbkm.f177424b.mo74142c(7), this.f99384d);
        bxvd bxvd = (bxvd) cbkm.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) cbkm);
        this.f99385e = azcv.m85357a(this.f99339a).mo54700c();
        bxvd a = azfn.m85571a(this.f99339a, this.f99385e);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        cbmo cbmo = (cbmo) a.mo74062i();
        cbmo.getClass();
        ((cbkm) bxvd.f164949b).f177426a = cbmo;
        azph.m85998a(this.f99339a).mo55141a(802, this.f99385e);
        return (cbkm) bxvd.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54922a(Object obj, Exception exc) {
        cbkm cbkm = (cbkm) obj;
        azoj.m85931a("LookupRegisteredH", exc, "Error sending LookupRegistered rpc", new Object[0]);
        azph.m85998a(this.f99339a).mo55154a(804, exc);
        azhj azhj = this.f99386f;
        int d = azfn.m85589d(exc);
        Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.return_look_up_registered");
        azhk azhk = azhj.f99381a;
        intent.setClassName(azhk.f99339a, azhk.f99382b);
        intent.putExtra("rpc_error_code", bopr.m111427a(d));
        intent.putExtra("look_up_registered_request_id", azhj.f99381a.f99383c);
        azhj.f99381a.f99339a.startService(intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54923a(Object obj, Object obj2) {
        cbkm cbkm = (cbkm) obj;
        azhj azhj = this.f99386f;
        Intent intent = new Intent("com.google.android.apps.libraries.matchstick.action.return_look_up_registered");
        azhk azhk = azhj.f99381a;
        intent.setClassName(azhk.f99339a, azhk.f99382b);
        intent.putExtra("look_up_registered_response", ((cbkn) obj2).serializeToBytes());
        intent.putExtra("look_up_registered_request_id", azhj.f99381a.f99383c);
        azhj.f99381a.f99339a.startService(intent);
        azph.m85998a(this.f99339a).mo55141a(803, this.f99385e);
    }
}
