package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import com.android.volley.VolleyError;
import com.felicanetworks.mfc.C0126R;

/* renamed from: annu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class annu implements Runnable {

    /* renamed from: a */
    public final String f77234a;

    /* renamed from: b */
    public Bitmap f77235b;

    /* renamed from: c */
    final /* synthetic */ annw f77236c;

    public annu(annw annw, String str) {
        this.f77236c = annw;
        this.f77234a = str;
    }

    public final void run() {
        try {
            String a = rzi.m34705a(this.f77234a, this.f77236c.f77242e.getDimensionPixelSize(C0126R.dimen.plus_apps_max_icon_size));
            annw annw = this.f77236c;
            byte[] a2 = annw.f77239b.mo25543a(annw.f77240c, a);
            if (a2 != null) {
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(a2, 0, a2.length, this.f77236c.f77241d);
                this.f77235b = decodeByteArray;
                if (decodeByteArray != null) {
                    Handler handler = this.f77236c.f77238a;
                    handler.sendMessage(handler.obtainMessage(0, this));
                    return;
                }
                Handler handler2 = this.f77236c.f77238a;
                handler2.sendMessage(handler2.obtainMessage(1, this));
                return;
            }
            Handler handler3 = this.f77236c.f77238a;
            handler3.sendMessage(handler3.obtainMessage(1, this));
        } catch (VolleyError e) {
            Handler handler4 = this.f77236c.f77238a;
            handler4.sendMessage(handler4.obtainMessage(1, this));
        }
    }
}
