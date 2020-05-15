package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: sab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class sab extends saf {

    /* renamed from: a */
    public final int f43913a;

    /* renamed from: b */
    public final Bundle f43914b;

    /* renamed from: c */
    final /* synthetic */ sam f43915c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected sab(sam sam, int i, Bundle bundle) {
        super(sam, true);
        this.f43915c = sam;
        this.f43913a = i;
        this.f43914b = bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25279a(ConnectionResult connectionResult);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo25280a(Object obj) {
        Boolean bool = (Boolean) obj;
        int i = this.f43913a;
        PendingIntent pendingIntent = null;
        if (i != 0) {
            if (i != 10) {
                this.f43915c.m34754a(1, (IInterface) null);
                Bundle bundle = this.f43914b;
                if (bundle != null) {
                    pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                }
                mo25279a(new ConnectionResult(this.f43913a, pendingIntent));
                return;
            }
            this.f43915c.m34754a(1, (IInterface) null);
            if (!sqr.m35998a() || !this.f43915c.mo6463a().equals("com.google.android.gms.games.service.START")) {
                throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", getClass().getSimpleName(), this.f43915c.mo6463a(), this.f43915c.mo6464b()));
            } else {
                mo25279a(new ConnectionResult(this.f43913a, null));
            }
        } else if (!mo25281a()) {
            this.f43915c.m34754a(1, (IInterface) null);
            mo25279a(new ConnectionResult(8, null));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo25281a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo25282b() {
    }
}
