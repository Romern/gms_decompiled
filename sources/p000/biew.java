package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: biew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biew extends bien {

    /* renamed from: b */
    public final CountDownLatch f120414b = new CountDownLatch(1);

    /* renamed from: c */
    public bidp f120415c;

    /* renamed from: d */
    public final bieq f120416d;

    /* renamed from: e */
    private final biev f120417e;

    public biew(PlacesParams placesParams, bidi bidi, bidx bidx, bieq bieq, String str, bhpt bhpt) {
        super(67, str, placesParams, bidi, bidx, bieq.mo64574c(), bhpt);
        this.f120416d = bieq;
        this.f120417e = new biev(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo64562a() {
        return this.f120416d.mo64569a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo64563b() {
        return this.f120416d.mo64573b();
    }

    /* renamed from: c */
    public final bpqk mo64564c() {
        return this.f120416d.mo64570a(this.f120388a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo64566e() {
        return this.f120416d.mo64575d();
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        super.mo6502a(context);
        Intent intent = new Intent("com.google.android.gms.location.places.PlaceDetectionAsyncService");
        intent.setPackage(context.getPackageName());
        if (context.bindService(intent, this.f120417e, 1)) {
            try {
                if (this.f120414b.await(cggm.f186849a.mo6606a().mo83716G(), TimeUnit.SECONDS)) {
                    try {
                        this.f120416d.mo64571a(context, this.f120415c, this.f120388a);
                        return;
                    } finally {
                        context.unbindService(this.f120417e);
                    }
                }
            } catch (InterruptedException e) {
            }
        }
        context.unbindService(this.f120417e);
        throw new aaaj(8, "Failed to bind to inner service");
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f120416d.mo64572a(status);
    }
}
