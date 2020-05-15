package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.util.concurrent.TimeUnit;

/* renamed from: azhd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azhd extends azhc {

    /* renamed from: b */
    private final String f99342b;

    /* renamed from: c */
    private final boolean f99343c;

    /* renamed from: d */
    private final azfo f99344d;

    /* renamed from: e */
    private final LocalEntityId f99345e;

    /* renamed from: f */
    private azcs f99346f;

    public azhd(Context context, azfx azfx, String str, boolean z, azfo azfo, LocalEntityId localEntityId) {
        super(context, azfx, "blockApp");
        this.f99342b = str;
        this.f99343c = z;
        this.f99344d = azfo;
        this.f99345e = localEntityId;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo54920a(Object obj) {
        cbgv cbgv = (cbgv) obj;
        afiz afiz = (afiz) azht.m85748a(this.f99339a).mo54933a(2);
        ClientContext a = azht.m85748a(this.f99339a).mo54932a(2, this.f99345e);
        if (afiz.f64271c == null) {
            afiz.f64271c = chtv.m149566a(chtu.UNARY, "google.internal.communications.instantmessaging.v1.MatchstickAbuse/BlockApp", ciie.m150370a(cbgv.f177091c), ciie.m150370a(cbgw.f177095a));
        }
        return (cbgw) afiz.f64277a.mo25553a(afiz.f64271c, a, cbgv, (long) afiz.f64270b, TimeUnit.MILLISECONDS);
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
        azcd.m85252a(this.f99339a).mo54610b(this.f99342b, true);
        if (!this.f99343c) {
            return null;
        }
        bxvd da = cbgv.f177091c.mo74144da();
        this.f99346f = azcv.m85357a(this.f99339a).mo54689a(this.f99345e);
        cbmo cbmo = (cbmo) azfn.m85571a(this.f99339a, this.f99345e).mo74062i();
        if (cbmo != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbmo.getClass();
            ((cbgv) da.f164949b).f177093a = cbmo;
        }
        String str = this.f99342b;
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str.getClass();
            ((cbgv) da.f164949b).f177094b = str;
        }
        new Object[1][0] = da.mo74062i();
        return (cbgv) da.mo74062i();
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
        cbgv cbgv = (cbgv) obj;
        azph.m85998a(this.f99339a).mo55156a(1409, exc, this.f99342b);
        azcd.m85252a(this.f99339a).mo54604a(this.f99342b, false);
        azoj.m85931a("BlockAppHandler", exc, "Error sending rpc", new Object[0]);
        azho.m85727a(this.f99339a, this.f99344d, exc, (Intent) null, this.f99345e, this.f99346f);
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
        cbgv cbgv = (cbgv) obj;
        Object[] objArr = {(cbgw) obj2};
        azcd.m85252a(this.f99339a).mo54604a(this.f99342b, true);
    }
}
