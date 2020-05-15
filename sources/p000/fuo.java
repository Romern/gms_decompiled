package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.gms.appinvite.AppInviteChimeraActivity;
import java.io.IOException;

/* renamed from: fuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fuo extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ AppInviteChimeraActivity f17276a;

    /* renamed from: b */
    private final Context f17277b;

    /* renamed from: c */
    private final Uri f17278c;

    /* renamed from: d */
    private final ImageView f17279d;

    public fuo(AppInviteChimeraActivity appInviteChimeraActivity, Context context, Uri uri, ImageView imageView) {
        this.f17276a = appInviteChimeraActivity;
        this.f17277b = context;
        this.f17278c = uri;
        this.f17279d = imageView;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        String scheme = this.f17278c.getScheme();
        if (scheme.equals("http") || scheme.equals("https")) {
            rjo rjo = allr.f73629a;
            allh allh = (allh) amcy.m62629a(this.f17276a.f9720b, this.f17278c.toString()).mo9455a();
            if (allh.mo7183bo() == null || !allh.mo7183bo().mo17710c()) {
                return null;
            }
            ParcelFileDescriptor b = allh.mo40486b();
            try {
                return alls.m61238a(b);
            } finally {
                srz.m36170a(b);
            }
        } else {
            try {
                return MediaStore.Images.Media.getBitmap(this.f17277b.getContentResolver(), this.f17278c);
            } catch (IOException e) {
                String valueOf = String.valueOf(this.f17278c.toString());
                Log.e("AppInvite", valueOf.length() == 0 ? new String("Cannot load image from: ") : "Cannot load image from: ".concat(valueOf));
                return null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        super.onPostExecute(bitmap);
        if (!isCancelled() && bitmap != null) {
            this.f17276a.f9728j = bitmap;
            this.f17279d.setImageDrawable(new BitmapDrawable(this.f17277b.getResources(), bitmap));
            this.f17276a.f9726h.setVisibility(0);
        }
    }
}
