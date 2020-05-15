package p000;

import java.io.IOException;

/* renamed from: juo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class juo implements Runnable {

    /* renamed from: a */
    final /* synthetic */ byte[] f23235a;

    /* renamed from: b */
    final /* synthetic */ jup f23236b;

    public juo(jup jup, byte[] bArr) {
        this.f23236b = jup;
        this.f23235a = bArr;
    }

    public final void run() {
        if (this.f23236b.f23240d.get()) {
            jup.f23237a.mo25416d("Write failed because this connection is already disconnected.", new Object[0]);
            return;
        }
        try {
            this.f23236b.f23239c.writeInt(this.f23235a.length);
            this.f23236b.f23239c.write(this.f23235a);
            this.f23236b.f23239c.flush();
        } catch (IOException e) {
            jup.f23237a.mo25410a((Throwable) e);
            this.f23236b.mo14113a();
        }
    }
}
