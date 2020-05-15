package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import com.google.android.gms.people.p062ui.widget.AvatarReferenceImageView;

/* renamed from: anbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anbr extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ AvatarReferenceImageView f76588a;

    /* renamed from: b */
    private final Context f76589b;

    /* renamed from: c */
    private final long f76590c;

    /* renamed from: d */
    private final boolean f76591d;

    public anbr(AvatarReferenceImageView avatarReferenceImageView, long j, boolean z) {
        this.f76588a = avatarReferenceImageView;
        this.f76589b = avatarReferenceImageView.getContext();
        this.f76590c = j;
        this.f76591d = z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: altf.b(android.content.Context, long, boolean):byte[]
     arg types: [android.content.Context, long, int]
     candidates:
      altf.b(android.content.Context, java.lang.String, java.lang.String):long
      altf.b(android.content.Context, long, boolean):byte[] */
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Bitmap decodeByteArray;
        Void[] voidArr = (Void[]) objArr;
        byte[] b = altf.m61754b(this.f76589b, this.f76590c, true);
        if (b == null || (decodeByteArray = BitmapFactory.decodeByteArray(b, 0, b.length)) == null) {
            return null;
        }
        if (this.f76591d) {
            if (decodeByteArray.getWidth() != decodeByteArray.getHeight()) {
                decodeByteArray = suj.m36369a(decodeByteArray, Math.max(decodeByteArray.getWidth(), decodeByteArray.getHeight()));
            }
            decodeByteArray = suj.m36368a(this.f76589b, decodeByteArray, new Paint());
        }
        return new BitmapDrawable(this.f76589b.getResources(), decodeByteArray);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
        super.onPostExecute(bitmapDrawable);
        Long valueOf = Long.valueOf(this.f76590c);
        AvatarReferenceImageView avatarReferenceImageView = this.f76588a;
        int i = AvatarReferenceImageView.f82057h;
        if (sdg.m34949a(valueOf, avatarReferenceImageView.f82061c)) {
            boolean z = this.f76591d;
            AvatarReferenceImageView avatarReferenceImageView2 = this.f76588a;
            if (z == avatarReferenceImageView2.f82065g) {
                avatarReferenceImageView2.f82064f = null;
                avatarReferenceImageView2.f82062d = bitmapDrawable;
                if (!isCancelled() && bitmapDrawable != null) {
                    this.f76588a.f82059a.setImageDrawable(bitmapDrawable);
                    this.f76588a.mo46480c();
                }
            }
        }
    }
}
