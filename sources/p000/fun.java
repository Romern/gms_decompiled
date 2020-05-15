package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.support.p002v7.widget.Toolbar;
import com.google.android.gms.appinvite.AppInviteChimeraActivity;

/* renamed from: fun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fun extends AsyncTask {

    /* renamed from: a */
    public final rke f17272a;

    /* renamed from: b */
    final /* synthetic */ AppInviteChimeraActivity f17273b;

    /* renamed from: c */
    private final Context f17274c;

    /* renamed from: d */
    private final Toolbar f17275d;

    public fun(AppInviteChimeraActivity appInviteChimeraActivity, Context context, rkb rkb, String str, Toolbar toolbar) {
        this.f17273b = appInviteChimeraActivity;
        this.f17274c = context;
        appInviteChimeraActivity.f9720b = rkb;
        rjo rjo = allr.f73629a;
        this.f17272a = amcy.m62631b(rkb, str, 1, 0);
        this.f17275d = toolbar;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        allh allh = (allh) this.f17272a.mo9455a();
        if (allh == null || allh.mo7183bo() == null || !allh.mo7183bo().mo17710c()) {
            return null;
        }
        ParcelFileDescriptor b = allh.mo40486b();
        try {
            Bitmap a = alls.m61238a(b);
            if (a != null) {
                if (a.getWidth() != a.getHeight()) {
                    a = suj.m36369a(a, Math.max(a.getWidth(), a.getHeight()));
                }
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f17274c.getResources(), suj.m36368a(this.f17274c, a, new Paint()));
                srz.m36170a(b);
                return bitmapDrawable;
            }
            srz.m36170a(b);
            return null;
        } catch (Throwable th) {
            srz.m36170a(b);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
        super.onPostExecute(bitmapDrawable);
        if (!isCancelled() && bitmapDrawable != null) {
            this.f17275d.mo1681b(bitmapDrawable);
            this.f17273b.f9733o = true;
        }
    }
}
