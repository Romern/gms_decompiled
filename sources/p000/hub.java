package p000;

import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.auth.api.earlyupdate.EarlyUpdateChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: hub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hub extends hue implements aaai {

    /* renamed from: a */
    private final EarlyUpdateChimeraService f20433a;

    /* renamed from: b */
    private final aaag f20434b;

    public hub(EarlyUpdateChimeraService earlyUpdateChimeraService, aaag aaag) {
        sdo.m34959a(earlyUpdateChimeraService);
        this.f20433a = earlyUpdateChimeraService;
        this.f20434b = aaag;
    }

    @Deprecated
    /* renamed from: a */
    public final void mo12718a(hud hud) {
        EarlyUpdateChimeraService.f10198a.mo25371b("requesting feature auth_suw from GMSCore.");
        this.f20434b.mo16659a(this.f20433a, new hum(hud, Binder.getCallingUid()));
    }

    @Deprecated
    /* renamed from: b */
    public final void mo12721b(hud hud) {
        EarlyUpdateChimeraService.f10198a.mo25371b("unrequesting feature auth_suw from GMSCore.");
        this.f20434b.mo16659a(this.f20433a, new hun(hud, Binder.getCallingUid()));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: hud.a(com.google.android.gms.common.api.Status, boolean):void
     arg types: [com.google.android.gms.common.api.Status, int]
     candidates:
      dcj.a(int, android.os.Parcel):android.os.Parcel
      hud.a(com.google.android.gms.common.api.Status, boolean):void */
    @Deprecated
    /* renamed from: c */
    public final void mo12723c(hud hud) {
        hud.mo12725a(Status.f30109c, false);
    }

    @Deprecated
    /* renamed from: d */
    public final void mo12724d(hud hud) {
        this.f20434b.mo16659a(this.f20433a, new hui(hud));
    }

    /* renamed from: a */
    public final void mo12719a(rnt rnt) {
        this.f20434b.mo16659a(this.f20433a, new hui(rnt));
    }

    /* renamed from: b */
    public final void mo12722b(rnt rnt) {
        EarlyUpdateChimeraService.f10198a.mo25371b("unrequesting feature auth_suw from GMSCore.");
        this.f20434b.mo16659a(this.f20433a, new hun(rnt, Binder.getCallingUid()));
    }

    /* renamed from: a */
    public final void mo12720a(rnt rnt, Bundle bundle) {
        EarlyUpdateChimeraService.f10198a.mo25371b("requesting feature auth_suw from GMSCore.");
        this.f20434b.mo16659a(this.f20433a, new hum(rnt, Binder.getCallingUid(), bundle));
    }
}
