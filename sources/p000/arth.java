package p000;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: arth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arth extends arjh implements aaai {

    /* renamed from: a */
    private final arsi f88279a;

    /* renamed from: b */
    private final aaag f88280b;

    public arth(LifecycleSynchronizer lifecycleSynchronizer, Context context, String str, boolean z) {
        aaag a = aaag.m21014a(context, lifecycleSynchronizer, arpy.m73286a());
        armd armd = new armd(context);
        armd.mo48636a(str, z);
        this.f88279a = new arsi(context, 100, armd);
        this.f88280b = a;
    }

    /* renamed from: a */
    public final String mo48492a(BootstrapOptions bootstrapOptions) {
        return "";
    }

    /* renamed from: a */
    public final void mo48493a(arjf arjf) {
    }

    /* renamed from: a */
    public final void mo48494a(arjf arjf, arjc arjc) {
    }

    /* renamed from: a */
    public final void mo48495a(arjf arjf, BootstrapOptions bootstrapOptions, arjc arjc) {
    }

    /* renamed from: a */
    public final void mo48496a(arjf arjf, BootstrapOptions bootstrapOptions, ParcelFileDescriptor[] parcelFileDescriptorArr, arij arij) {
    }

    /* renamed from: a */
    public final void mo48497a(arjf arjf, BootstrapOptions bootstrapOptions, ParcelFileDescriptor[] parcelFileDescriptorArr, arik arik) {
    }

    /* renamed from: b */
    public final void mo48501b(arjf arjf) {
    }

    /* renamed from: c */
    public final void mo48505c(arjf arjf) {
    }

    /* renamed from: d */
    public final void mo48506d(arjf arjf) {
    }

    /* renamed from: e */
    public final void mo48507e(arjf arjf) {
    }

    /* renamed from: f */
    public final void mo48508f(arjf arjf) {
    }

    /* renamed from: b */
    public final void mo48502b(artk artk) {
        this.f88280b.mo16658a(new artg(artk, this.f88279a));
    }

    /* renamed from: b */
    public final void mo48503b(artk artk, HandshakeData handshakeData) {
        this.f88280b.mo16658a(new artd(artk, this.f88279a, handshakeData));
    }

    /* renamed from: a */
    public final void mo48498a(artk artk) {
        this.f88280b.mo16658a(new arte(artk, this.f88279a));
    }

    /* renamed from: a */
    public final void mo48499a(artk artk, HandshakeData handshakeData) {
        this.f88280b.mo16658a(new artf(artk, this.f88279a, handshakeData));
    }
}
