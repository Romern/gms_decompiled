package p000;

import android.accounts.Account;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.ParcelFileDescriptor;
import android.util.Log;

/* renamed from: eom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class eom implements bqfp {

    /* renamed from: a */
    final /* synthetic */ Account f15415a;

    /* renamed from: b */
    final /* synthetic */ eoq f15416b;

    public eom(eoq eoq, Account account) {
        this.f15416b = eoq;
        this.f15415a = account;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        allh allh = (allh) obj;
        ParcelFileDescriptor b = allh.mo40486b();
        try {
            Bitmap a = alls.m61238a(b);
            if (a != null) {
                if (a.getWidth() != a.getHeight() || a.getWidth() != this.f15416b.f15426c) {
                    a = suj.m36369a(a, this.f15416b.f15426c);
                }
                Bitmap a2 = suj.m36368a(this.f15416b.getContext(), a, new Paint());
                eoq eoq = this.f15416b;
                String str = this.f15415a.name;
                if (a2 != null) {
                    eon eon = (eon) eoq.f15425b.get(str);
                    if (eon == null) {
                        eon = new eon();
                    }
                    eon.f15418b = a2;
                    eoq.f15425b.put(str, eon);
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
