package p000;

import android.os.Build;
import android.os.ParcelFileDescriptor;

/* renamed from: cmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cmp implements cdm {

    /* renamed from: a */
    private final cme f7076a;

    public cmp(cme cme) {
        this.f7076a = cme;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cgj mo3743a(Object obj, int i, int i2, cdk cdk) {
        cme cme = this.f7076a;
        return cme.mo3972a(new cmm((ParcelFileDescriptor) obj, cme.f7054g, cme.f7053f), i, i2, cdk, cme.f7051e);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo3744a(Object obj, cdk cdk) {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        int i = Build.VERSION.SDK_INT;
        return true;
    }
}
