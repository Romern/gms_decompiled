package p000;

import android.util.Log;

/* renamed from: auiw */
final /* synthetic */ class auiw implements bmxj {

    /* renamed from: a */
    private final auix f91924a;

    public auiw(auix auix) {
        this.f91924a = auix;
    }

    public final Object apply(Object obj) {
        auix auix = this.f91924a;
        aufs aufs = (aufs) obj;
        auix.f91929e = auix.mo50576i() - auix.f91928d;
        bmxy.m108581a(aufs);
        auix.f91930f = aufs;
        if (!aufs.f91738a) {
            String valueOf = String.valueOf(auix);
            int i = aufs.f91739b;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
            sb.append(valueOf);
            sb.append(" error reporting location - ");
            sb.append(i);
            Log.w("Thunderbird", sb.toString(), aufs.f91740c);
        }
        if (auho.m77070a()) {
            String valueOf2 = String.valueOf(auix);
            int i2 = aufs.f91739b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 30);
            sb2.append(valueOf2);
            sb2.append(" report complete [");
            sb2.append(i2);
            sb2.append("]");
            Log.d("Thunderbird", sb2.toString());
        }
        return auix;
    }
}
