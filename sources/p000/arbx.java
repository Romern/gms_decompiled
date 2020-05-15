package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import java.util.ArrayList;
import java.util.List;

/* renamed from: arbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arbx extends arbt implements arib {

    /* renamed from: l */
    public static final sek f87330l = ascp.m73787a("D2D", arbx.class.getSimpleName());

    /* renamed from: m */
    private ards f87331m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final armu mo48376a(ariq ariq) {
        List a = ardn.m72536a(this.f87316b.f87197a);
        aqyq aqyq = new aqyq();
        aqyq.mo48282a(new ArrayList(a));
        aqyq.f87111a = true;
        BootstrapConfigurations a2 = aqyq.mo48280a();
        arai arai = this.f87316b;
        this.f87331m = new ards(arai.f87198b, a2, this, aqxc.m72189b(arai.f87197a));
        return new arbw(this, this.f87331m, ariq);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48378a(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48379a(BootstrapConfigurations bootstrapConfigurations) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48380a(BootstrapConfigurations bootstrapConfigurations, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo48381b() {
        return this.f87331m != null;
    }

    public arbx(arai arai) {
        super(arai, aras.m72348a(arai), arqd.m73297b(arai.f87197a), argz.m72750a(arai.f87197a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48377a() {
        f87330l.mo25409a("resetNearbyDirectTransferController", new Object[0]);
        ards ards = this.f87331m;
        if (ards != null) {
            ards.mo48264a();
            this.f87331m = null;
        }
    }

    /* renamed from: a */
    public final void mo48265a(int i, String str) {
        f87330l.mo25416d("Direct transfer error: %d, %s", Integer.valueOf(i), str);
        this.f87316b.f87200d.mo48402a(i);
    }

    /* renamed from: a */
    public final void mo48266a(PendingIntent pendingIntent) {
        try {
            pendingIntent.send();
        } catch (PendingIntent.CanceledException e) {
            f87330l.mo25410a((Throwable) e);
        }
    }

    /* renamed from: a */
    public final void mo48268a(BootstrapCompletionResult bootstrapCompletionResult) {
        f87330l.mo25409a("Direct transfer completed", new Object[0]);
        arin arin = this.f87321g;
        if (arin != null) {
            try {
                arin.mo48566a();
            } catch (RemoteException e) {
                f87330l.mo25410a((Throwable) e);
            }
        }
        this.f87316b.f87200d.mo48401a();
    }

    /* renamed from: a */
    public final void mo48269a(BootstrapOptions bootstrapOptions) {
        f87330l.mo25412b("onBootstrapOptions", new Object[0]);
        ariq ariq = this.f87322h;
        if (ariq != null) {
            try {
                ariq.mo48571a(bootstrapOptions);
            } catch (RemoteException e) {
                f87330l.mo25416d("Error invoking connectionListener#onConnected.", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public final void mo48270a(BootstrapProgressResult bootstrapProgressResult) {
        f87330l.mo25409a("Progress update", new Object[0]);
        arin arin = this.f87321g;
        if (arin != null) {
            try {
                arin.mo48567a(bootstrapProgressResult);
            } catch (RemoteException e) {
                f87330l.mo25410a((Throwable) e);
            }
        }
    }
}
