package p000;

import android.os.ParcelFileDescriptor;

/* renamed from: axvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axvp implements ayfj {

    /* renamed from: a */
    final /* synthetic */ Object f96490a;

    /* renamed from: b */
    final /* synthetic */ axvq f96491b;

    public axvp(axvq axvq, Object obj) {
        this.f96491b = axvq;
        this.f96490a = obj;
    }

    /* renamed from: a */
    public final int mo53615a(ParcelFileDescriptor parcelFileDescriptor, byte[] bArr, int i, int i2) {
        throw null;
    }

    /* renamed from: a */
    public final boolean mo53618a() {
        throw null;
    }

    /* renamed from: b */
    public final int mo53619b(ParcelFileDescriptor parcelFileDescriptor, byte[] bArr, int i, int i2) {
        throw null;
    }

    /* renamed from: b */
    public final void mo53620b() {
        throw null;
    }

    public final void close() {
        this.f96491b.f96493b.close();
    }

    /* renamed from: a */
    public final void mo53616a(ParcelFileDescriptor parcelFileDescriptor) {
        ayfj ayfj = this.f96491b.f96493b;
        sdo.m34959a(parcelFileDescriptor);
        ayfk ayfk = (ayfk) ayfj;
        sdo.m34975b(!ayfk.f97481a.containsKey(parcelFileDescriptor), "pfd already registered");
        ayfk.f97481a.put(parcelFileDescriptor, ayfi.NONE);
        this.f96491b.f96492a.put(parcelFileDescriptor, this.f96490a);
    }

    /* renamed from: b */
    public final void mo53621b(ParcelFileDescriptor parcelFileDescriptor) {
        Object obj = this.f96491b.f96492a.get(parcelFileDescriptor);
        Object obj2 = this.f96490a;
        if (obj == obj2) {
            ayfj ayfj = this.f96491b.f96493b;
            sdo.m34959a(parcelFileDescriptor);
            ayfk ayfk = (ayfk) ayfj;
            sdo.m34975b(ayfk.f97481a.containsKey(parcelFileDescriptor), "pfd not registered");
            ayfk.f97481a.remove(parcelFileDescriptor);
            this.f96491b.f96492a.remove(parcelFileDescriptor);
            return;
        }
        throw new IllegalStateException(String.format("unregister(...) on an unregistered fd. Expected <%s>, found <%s>", obj2, obj));
    }

    /* renamed from: a */
    public final void mo53617a(ParcelFileDescriptor parcelFileDescriptor, ayfi ayfi) {
        ayfj ayfj = this.f96491b.f96493b;
        sdo.m34959a(parcelFileDescriptor);
        sdo.m34959a(ayfi);
        ayfk ayfk = (ayfk) ayfj;
        sdo.m34975b(ayfk.f97481a.containsKey(parcelFileDescriptor), "pfd not registered");
        ayfk.f97481a.put(parcelFileDescriptor, ayfi);
    }
}
