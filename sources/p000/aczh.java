package p000;

import android.accounts.Account;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.ParcelFileDescriptor;

/* renamed from: aczh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aczh implements bqfp {

    /* renamed from: a */
    final /* synthetic */ Account f61135a;

    /* renamed from: b */
    final /* synthetic */ aczl f61136b;

    public aczh(aczl aczl, Account account) {
        this.f61136b = aczl;
        this.f61135a = account;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        allh allh = (allh) obj;
        ParcelFileDescriptor b = allh.mo40486b();
        try {
            Bitmap a = alls.m61238a(b);
            if (a != null) {
                if (a.getWidth() != a.getHeight() || a.getWidth() != this.f61136b.f61154f) {
                    a = suj.m36369a(a, this.f61136b.f61154f);
                }
                Bitmap a2 = suj.m36368a(this.f61136b.f61152d, a, new Paint());
                aczd aczd = (aczd) this.f61136b.f61153e.get(this.f61135a);
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
        aczl.f61150a.mo25417e("Failed to load image", th, new Object[0]);
    }
}
