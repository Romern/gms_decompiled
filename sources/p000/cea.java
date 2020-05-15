package p000;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;

/* renamed from: cea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cea extends cdq {
    public cea(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* renamed from: a */
    public final Class mo3747a() {
        return ParcelFileDescriptor.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo3750a(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo3752a(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }
}
