package p000;

import android.accounts.Account;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.ParcelFileDescriptor;
import android.util.Log;

/* renamed from: rgi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rgi implements bqfp {

    /* renamed from: a */
    final /* synthetic */ Account f42916a;

    /* renamed from: b */
    final /* synthetic */ rgn f42917b;

    public rgi(rgn rgn, Account account) {
        this.f42917b = rgn;
        this.f42916a = account;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        allh allh = (allh) obj;
        ParcelFileDescriptor b = allh.mo40486b();
        try {
            Bitmap a = alls.m61238a(b);
            if (a != null) {
                if (a.getWidth() != a.getHeight() || a.getWidth() != this.f42917b.f42929d) {
                    a = suj.m36369a(a, this.f42917b.f42929d);
                }
                Bitmap a2 = suj.m36368a(this.f42917b.getContext(), a, new Paint());
                rgn rgn = this.f42917b;
                String str = this.f42916a.name;
                if (a2 != null) {
                    rgj rgj = (rgj) rgn.f42927b.get(str);
                    if (rgj == null) {
                        rgj = new rgj();
                    }
                    rgj.f42919b = a2;
                    rgn.f42927b.put(str, rgj);
                }
            }
        } finally {
            srz.m36170a(b);
            allh.mo12460c();
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        Log.e("AccountChipArrayAdapter", "Failed to load image", th);
    }
}
