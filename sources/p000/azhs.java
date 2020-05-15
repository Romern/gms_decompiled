package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.util.concurrent.TimeUnit;

/* renamed from: azhs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azhs extends azhc {

    /* renamed from: b */
    private final byte[] f99426b;

    /* renamed from: c */
    private final LocalEntityId f99427c;

    /* renamed from: d */
    private final LocalEntityId f99428d;

    public azhs(Context context, azfx azfx, LocalEntityId localEntityId, byte[] bArr, LocalEntityId localEntityId2) {
        super(context, azfx, "Send tachyon message");
        this.f99426b = bArr;
        this.f99427c = localEntityId;
        this.f99428d = localEntityId2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo54920a(Object obj) {
        cbkk cbkk = (cbkk) obj;
        afjc afjc = (afjc) azht.m85748a(this.f99339a).mo54933a(32);
        ClientContext a = azht.m85748a(this.f99339a).mo54932a(32, this.f99428d);
        if (afjc.f64286c == null) {
            afjc.f64286c = chtv.m149566a(chtu.UNARY, "google.internal.communications.instantmessaging.v1.Messaging/SendMessage", ciie.m150370a(cbkk.f177417d), ciie.m150370a(cbkl.f177422a));
        }
        return (cbkl) afjc.f64288a.mo25553a(afjc.f64286c, a, cbkk, (long) afjc.f64285b, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo54924b() {
        cbkj cbkj = (cbkj) azol.m85935a((bxxk) cbkj.f177405k.mo74142c(7), this.f99426b);
        if (cbkj == null) {
            azoj.m85933c("SendTachyonMH", "invalid inboxMessage", new Object[0]);
            return null;
        }
        bxvd da = cbkk.f177417d.mo74144da();
        bxvd a = azfn.m85571a(this.f99339a, this.f99428d);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbmo cbmo = (cbmo) a.mo74062i();
        cbmo.getClass();
        ((cbkk) da.f164949b).f177421c = cbmo;
        cbma b = this.f99427c.mo60371b();
        if (b != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            b.getClass();
            ((cbkk) da.f164949b).f177419a = b;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbkj.getClass();
        ((cbkk) da.f164949b).f177420b = cbkj;
        azph.m85998a(this.f99339a).mo55143a(552, this.f99428d, "TY");
        return (cbkk) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54922a(Object obj, Exception exc) {
        cbkk cbkk = (cbkk) obj;
        azoj.m85931a("SendTachyonMH", exc, " Error sending rpc", new Object[0]);
        azph.m85998a(this.f99339a).mo55156a(554, exc, "TY");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54923a(Object obj, Object obj2) {
        cbkk cbkk = (cbkk) obj;
        Object[] objArr = {(cbkl) obj2};
        azph.m85998a(this.f99339a).mo55143a(553, this.f99428d, "TY");
    }
}
