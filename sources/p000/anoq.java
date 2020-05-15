package p000;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.plus.audience.AudienceSelectionListPersonView;

/* renamed from: anoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anoq implements rkl {

    /* renamed from: a */
    final /* synthetic */ Object f77317a;

    /* renamed from: b */
    final /* synthetic */ AudienceSelectionListPersonView f77318b;

    /* renamed from: c */
    final /* synthetic */ String f77319c;

    /* renamed from: d */
    final /* synthetic */ boolean f77320d;

    /* renamed from: e */
    final /* synthetic */ anpb f77321e;

    public anoq(anpb anpb, Object obj, AudienceSelectionListPersonView audienceSelectionListPersonView, String str, boolean z) {
        this.f77321e = anpb;
        this.f77317a = obj;
        this.f77318b = audienceSelectionListPersonView;
        this.f77319c = str;
        this.f77320d = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        Bitmap a;
        allh allh = (allh) rkk;
        ParcelFileDescriptor b = allh.mo40486b();
        try {
            if (allh.mo7183bo().mo17710c()) {
                if (this.f77317a == this.f77318b.f77417d) {
                    if (!(b == null || (a = alls.m61238a(b)) == null)) {
                        this.f77321e.f77344D.mo15547a(this.f77319c, a);
                        this.f77321e.mo42060a(this.f77318b, a, this.f77320d);
                    }
                }
            }
        } finally {
            srz.m36170a(b);
        }
    }
}
