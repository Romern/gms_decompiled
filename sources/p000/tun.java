package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tun */
public final /* synthetic */ class tun implements rkl {

    /* renamed from: a */
    private final tuq f46685a;

    public tun(tuq tuq) {
        this.f46685a = tuq;
    }

    /* renamed from: a */
    public final void mo9454a(rkk rkk) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable;
        tuq tuq = this.f46685a;
        allh allh = (allh) rkk;
        try {
            if (allh.mo7183bo().mo17710c()) {
                bitmap = rzl.m34706a(alls.m61238a(allh.mo40486b()));
            } else {
                bitmap = null;
            }
            if (tuq.f46695d != null) {
                Resources resources = tuq.f46692a.getResources();
                AccessibilityManager accessibilityManager = (AccessibilityManager) tuq.f46692a.getSystemService("accessibility");
                if (bitmap != null) {
                    bitmapDrawable = new BitmapDrawable(resources, bitmap);
                } else {
                    bitmapDrawable = null;
                }
                if (accessibilityManager != null) {
                    if (accessibilityManager.isEnabled()) {
                        ImageView imageView = new ImageView(tuq.f46692a, null, 0, C0126R.style.pwmAvatar);
                        imageView.setImageDrawable(bitmapDrawable);
                        tuq.f46695d.setActionView(imageView);
                        tuq.mo26816a(tuq.f46695d, tuq.f46693b, tuq.f46696e);
                    }
                }
                tuq.f46695d.setActionView((View) null);
                tuq.f46695d.setIcon(bitmapDrawable);
                tuq.mo26816a(tuq.f46695d, tuq.f46693b, tuq.f46696e);
            }
        } finally {
            allh.mo12460c();
        }
    }
}
