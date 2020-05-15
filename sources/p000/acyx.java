package p000;

import android.accounts.Account;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.ParcelFileDescriptor;

/* renamed from: acyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acyx implements bqfp {

    /* renamed from: a */
    final /* synthetic */ Account f61096a;

    /* renamed from: b */
    final /* synthetic */ acza f61097b;

    public acyx(acza acza, Account account) {
        this.f61097b = acza;
        this.f61096a = account;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        allh allh = (allh) obj;
        ParcelFileDescriptor b = allh.mo40486b();
        try {
            Bitmap a = alls.m61238a(b);
            if (a != null) {
                if (a.getWidth() != a.getHeight() || a.getWidth() != this.f61097b.f61106d) {
                    a = suj.m36369a(a, this.f61097b.f61106d);
                }
                Bitmap a2 = suj.m36368a(this.f61097b.f61104b, a, new Paint());
                aczd aczd = (aczd) this.f61097b.f61105c.get(this.f61096a);
                bmxy.m108581a(aczd);
                aczd.f61131e = a2;
            }
        } finally {
            srz.m36170a(b);
            allh.mo12460c();
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        acza.f61102a.mo25417e("Failed to load image", th, new Object[0]);
    }
}
