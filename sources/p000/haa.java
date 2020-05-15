package p000;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;

/* renamed from: haa */
final /* synthetic */ class haa implements bmxj {

    /* renamed from: a */
    private final hab f19337a;

    public haa(hab hab) {
        this.f19337a = hab;
    }

    /* JADX INFO: finally extract failed */
    public final Object apply(Object obj) {
        hab hab = this.f19337a;
        allh allh = (allh) obj;
        ParcelFileDescriptor b = allh.mo40486b();
        try {
            Bitmap a = alls.m61238a(b);
            if (a != null) {
                if (a.getWidth() == a.getHeight()) {
                    if (a.getWidth() != hab.f19338a) {
                    }
                }
                a = suj.m36369a(a, hab.f19338a);
            }
            srz.m36170a(b);
            allh.mo12460c();
            return bmxv.m108567c(a);
        } catch (Throwable th) {
            srz.m36170a(b);
            allh.mo12460c();
            throw th;
        }
    }
}
