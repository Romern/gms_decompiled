package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.people.model.AvatarReference;
import com.google.android.gms.people.p062ui.widget.AvatarReferenceImageView;

/* renamed from: anbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anbq extends AsyncTask {

    /* renamed from: a */
    public final rke f76583a;

    /* renamed from: b */
    final /* synthetic */ AvatarReferenceImageView f76584b;

    /* renamed from: c */
    private final Context f76585c;

    /* renamed from: d */
    private final AvatarReference f76586d;

    /* renamed from: e */
    private final boolean f76587e;

    public anbq(AvatarReferenceImageView avatarReferenceImageView, rkb rkb, AvatarReference avatarReference, allg allg, boolean z) {
        this.f76584b = avatarReferenceImageView;
        this.f76585c = avatarReferenceImageView.getContext();
        rjo rjo = allr.f73629a;
        this.f76583a = rkb.mo24787a((rle) new amcv(rkb, avatarReference, allg));
        this.f76586d = avatarReference;
        this.f76587e = z;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        allh allh = (allh) this.f76583a.mo9455a();
        BitmapDrawable bitmapDrawable = null;
        if (allh.mo7183bo() != null && allh.mo7183bo().mo17710c()) {
            ParcelFileDescriptor b = allh.mo40486b();
            try {
                Bitmap a = alls.m61238a(b);
                if (a != null) {
                    if (this.f76587e) {
                        if (a.getWidth() != a.getHeight()) {
                            a = suj.m36369a(a, Math.max(a.getWidth(), a.getHeight()));
                        }
                        a = suj.m36368a(this.f76585c, a, new Paint());
                    }
                    bitmapDrawable = new BitmapDrawable(this.f76585c.getResources(), a);
                }
            } finally {
                srz.m36170a(b);
            }
        }
        return bitmapDrawable;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
        super.onPostExecute(bitmapDrawable);
        AvatarReference avatarReference = this.f76586d;
        AvatarReferenceImageView avatarReferenceImageView = this.f76584b;
        int i = AvatarReferenceImageView.f82057h;
        if (avatarReference.equals(avatarReferenceImageView.f82060b)) {
            boolean z = this.f76587e;
            AvatarReferenceImageView avatarReferenceImageView2 = this.f76584b;
            if (z == avatarReferenceImageView2.f82065g) {
                avatarReferenceImageView2.f82063e = null;
                avatarReferenceImageView2.f82062d = bitmapDrawable;
                if (!isCancelled() && bitmapDrawable != null) {
                    this.f76584b.f82059a.setImageDrawable(bitmapDrawable);
                    this.f76584b.mo46480c();
                }
            }
        }
    }
}
