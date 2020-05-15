package p000;

import android.os.ParcelFileDescriptor;
import android.util.Log;

/* renamed from: axvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axvf extends axvn {

    /* renamed from: a */
    final /* synthetic */ axvz f96465a;

    /* renamed from: b */
    final /* synthetic */ axrs f96466b;

    /* renamed from: c */
    final /* synthetic */ ParcelFileDescriptor f96467c;

    /* renamed from: d */
    final /* synthetic */ long f96468d;

    /* renamed from: e */
    final /* synthetic */ long f96469e;

    /* renamed from: f */
    final /* synthetic */ axvr f96470f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public axvf(axvr axvr, axvz axvz, axrs axrs, ParcelFileDescriptor parcelFileDescriptor, long j, long j2) {
        super(axvr);
        this.f96470f = axvr;
        this.f96465a = axvz;
        this.f96466b = axrs;
        this.f96467c = parcelFileDescriptor;
        this.f96468d = j;
        this.f96469e = j2;
    }

    /* renamed from: a */
    public final void mo53610a() {
        try {
            axvx axvx = (axvx) this.f96470f.f96497d.mo53628a(this.f96465a);
            this.f96486g = axvx;
            if (axvx != null) {
                if (!axvx.mo53649f()) {
                    if (!axvx.mo53647e()) {
                        axvx.mo53638a(this.f96467c, null, this.f96468d, this.f96469e);
                        axvr.m83316a(this.f96466b, 0);
                        return;
                    }
                    Log.w("ChannelManager", "Error: Channel.sendFile or Channel.getInputStream mayonly be called once per channel");
                    axvr.m83316a(this.f96466b, 10);
                    return;
                }
            }
            Log.w("ChannelManager", "Called Channel.sendFile on closed channel");
            axvr.m83316a(this.f96466b, 13);
        } catch (RuntimeException e) {
            axvr.m83316a(this.f96466b, 8);
            throw e;
        }
    }
}
