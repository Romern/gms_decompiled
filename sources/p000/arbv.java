package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;

/* renamed from: arbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arbv extends arbt implements aqxy {

    /* renamed from: l */
    public static final sek f87327l = ascp.m73787a("D2D", arbv.class.getSimpleName());

    /* renamed from: m */
    private aray f87328m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final armu mo48376a(ariq ariq) {
        this.f87328m = new aray(this.f87316b, this, ariq);
        return new arbu(this, this.f87328m, ariq);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo48381b() {
        return this.f87328m != null;
    }

    public arbv(arai arai) {
        super(arai, aras.m72348a(arai), arqd.m73297b(arai.f87197a), argz.m72750a(arai.f87197a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48377a() {
        f87327l.mo25409a("resetBootstrapController()", new Object[0]);
        aray aray = this.f87328m;
        if (aray != null) {
            aray.mo48239e();
            this.f87328m = null;
        }
    }

    /* renamed from: a */
    public final void mo48223a(int i) {
        this.f87316b.f87200d.mo48402a(i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48378a(Bundle bundle) {
        aray aray = this.f87328m;
        if (aray != null) {
            sdo.m34971a(aray.f87245h, (Object) "Bootstrap needs to first be paused before it can be resumed.");
            if (bundle.containsKey("pendingIntentResult") && aray.f87247j != null) {
                aray.f87241d.mo25409a("Resuming bootstrap, pending intents are completed", new Object[0]);
                bundle.getInt("pendingIntentResult");
                if (aray.f87247j.f87209e.decrementAndGet() == 0) {
                    aray.f87245h = false;
                    return;
                }
                return;
            }
            aray.f87245h = false;
            aran aran = aray.f87246i;
            if (aran == null) {
                aray.f87241d.mo25418e("resumeBootstrap called but SourceAccountTransferController was null!", new Object[0]);
            } else {
                aran.mo48346a(bundle.getParcelableArrayList("accounts"));
            }
        }
    }

    /* renamed from: a */
    public final void mo48224a(BootstrapCompletionResult bootstrapCompletionResult) {
        arin arin = this.f87321g;
        if (arin != null) {
            try {
                arin.mo48566a();
            } catch (RemoteException e) {
                f87327l.mo25410a((Throwable) e);
            }
        }
        this.f87316b.f87200d.mo48401a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aray.a(com.google.android.gms.smartdevice.d2d.BootstrapConfigurations, boolean):void
     arg types: [com.google.android.gms.smartdevice.d2d.BootstrapConfigurations, int]
     candidates:
      aray.a(com.google.android.gms.smartdevice.d2d.BootstrapConfigurations, int):void
      aray.a(com.google.android.gms.smartdevice.d2d.BootstrapConfigurations, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48379a(BootstrapConfigurations bootstrapConfigurations) {
        aray aray = this.f87328m;
        if (aray != null) {
            aray.f87241d.mo25409a("Updating BootstrapConfigurations.", new Object[0]);
            sdo.m34966a(bootstrapConfigurations, "bootstrapConfigurations cannot be null.");
            aray.f87244g = bootstrapConfigurations;
            aray.mo48357a(bootstrapConfigurations, true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48380a(BootstrapConfigurations bootstrapConfigurations, int i) {
        aray aray = this.f87328m;
        if (aray != null) {
            aray.mo48356a(bootstrapConfigurations, i);
        }
    }

    /* renamed from: a */
    public final void mo48225a(String str) {
        arin arin = this.f87321g;
        if (arin != null) {
            try {
                arin.mo48568a(str);
            } catch (RemoteException e) {
                f87327l.mo25410a((Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo48226a(BootstrapProgressResult bootstrapProgressResult) {
        arin arin = this.f87321g;
        if (arin == null) {
            return false;
        }
        try {
            arin.mo48567a(bootstrapProgressResult);
            return false;
        } catch (RemoteException e) {
            f87327l.mo25410a((Throwable) e);
            return false;
        }
    }
}
