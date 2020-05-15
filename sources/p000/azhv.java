package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.util.concurrent.TimeUnit;

/* renamed from: azhv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azhv extends azhc {

    /* renamed from: b */
    private final String f99440b;

    /* renamed from: c */
    private final Intent f99441c;

    /* renamed from: d */
    private final boolean f99442d;

    /* renamed from: e */
    private final azfo f99443e;

    /* renamed from: f */
    private final LocalEntityId f99444f;

    /* renamed from: g */
    private azcs f99445g;

    public azhv(Context context, azfx azfx, String str, Intent intent, boolean z, azfo azfo, LocalEntityId localEntityId) {
        super(context, azfx, "unblockApp");
        this.f99440b = str;
        this.f99441c = intent;
        this.f99442d = z;
        this.f99443e = azfo;
        this.f99444f = localEntityId;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo54920a(Object obj) {
        cbhe cbhe = (cbhe) obj;
        afiz afiz = (afiz) azht.m85748a(this.f99339a).mo54933a(2);
        ClientContext a = azht.m85748a(this.f99339a).mo54932a(2, this.f99444f);
        if (afiz.f64272d == null) {
            afiz.f64272d = chtv.m149566a(chtu.UNARY, "google.internal.communications.instantmessaging.v1.MatchstickAbuse/UnblockApp", ciie.m150370a(cbhe.f177121c), ciie.m150370a(cbhf.f177125a));
        }
        return (cbhf) afiz.f64277a.mo25553a(afiz.f64272d, a, cbhe, (long) afiz.f64270b, TimeUnit.MILLISECONDS);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: azcd.b(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      azcd.b(java.lang.String, android.content.ContentValues):void
      azcd.b(java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo54924b() {
        azcd.m85252a(this.f99339a).mo54610b(this.f99440b, false);
        if (!this.f99442d) {
            return null;
        }
        bxvd da = cbhe.f177121c.mo74144da();
        this.f99445g = azcv.m85357a(this.f99339a).mo54689a(this.f99444f);
        bxvd a = azfn.m85571a(this.f99339a, this.f99444f);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbmo cbmo = (cbmo) a.mo74062i();
        cbmo.getClass();
        ((cbhe) da.f164949b).f177123a = cbmo;
        String str = this.f99440b;
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str.getClass();
            ((cbhe) da.f164949b).f177124b = str;
        }
        new Object[1][0] = da.mo74062i();
        return (cbhe) da.mo74062i();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: azcd.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      azcd.a(android.content.ContentResolver, java.lang.String[]):android.database.Cursor
      azcd.a(java.lang.String, java.lang.String[]):android.database.Cursor
      azcd.a(java.lang.String, int):java.lang.String
      azcd.a(java.lang.String, long):java.lang.String
      azcd.a(java.lang.String, java.util.List):void
      azcd.a(java.lang.String, android.content.ContentValues):boolean
      azcd.a(java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54922a(Object obj, Exception exc) {
        cbhe cbhe = (cbhe) obj;
        azph.m85998a(this.f99339a).mo55156a(1409, exc, this.f99440b);
        azcd.m85252a(this.f99339a).mo54604a(this.f99440b, false);
        azoj.m85931a("UnblockAppHandler", exc, "Error sending rpc", new Object[0]);
        azho.m85727a(this.f99339a, this.f99443e, exc, this.f99441c, this.f99444f, this.f99445g);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: azcd.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      azcd.a(android.content.ContentResolver, java.lang.String[]):android.database.Cursor
      azcd.a(java.lang.String, java.lang.String[]):android.database.Cursor
      azcd.a(java.lang.String, int):java.lang.String
      azcd.a(java.lang.String, long):java.lang.String
      azcd.a(java.lang.String, java.util.List):void
      azcd.a(java.lang.String, android.content.ContentValues):boolean
      azcd.a(java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54923a(Object obj, Object obj2) {
        cbhe cbhe = (cbhe) obj;
        Object[] objArr = {(cbhf) obj2};
        azcd.m85252a(this.f99339a).mo54604a(this.f99440b, true);
    }
}
