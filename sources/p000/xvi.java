package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.ParcelFileDescriptor;
import com.google.android.chimera.FragmentActivity;
import com.google.android.material.chip.Chip;

/* renamed from: xvi */
final /* synthetic */ class xvi implements rkl {

    /* renamed from: a */
    private final FragmentActivity f53220a;

    /* renamed from: b */
    private final Chip f53221b;

    public xvi(FragmentActivity fragmentActivity, Chip chip) {
        this.f53220a = fragmentActivity;
        this.f53221b = chip;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo9454a(rkk rkk) {
        FragmentActivity fragmentActivity = this.f53220a;
        Chip chip = this.f53221b;
        allh allh = (allh) rkk;
        if (allh.mo7183bo().mo17710c() && allh.mo40486b() != null) {
            ParcelFileDescriptor b = allh.mo40486b();
            try {
                Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(b.getFileDescriptor());
                srz.m36170a(b);
                chip.mo71076a(new BitmapDrawable(fragmentActivity.getResources(), suj.m36368a(fragmentActivity, decodeFileDescriptor, null)));
            } catch (Throwable th) {
                srz.m36170a(b);
                throw th;
            }
        }
    }
}
