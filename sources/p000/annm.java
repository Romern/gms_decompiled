package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.util.Log;
import com.android.volley.VolleyError;

/* renamed from: annm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class annm implements Runnable {

    /* renamed from: a */
    public final anxl f77204a;

    /* renamed from: b */
    public Bitmap f77205b;

    /* renamed from: c */
    final /* synthetic */ anno f77206c;

    /* renamed from: d */
    private final String f77207d;

    public annm(anno anno, anxl anxl, String str) {
        this.f77206c = anno;
        this.f77204a = anxl;
        this.f77207d = str;
    }

    public final void run() {
        try {
            anno anno = this.f77206c;
            byte[] a = anno.f77210b.mo25543a(anno.f77211c, this.f77207d);
            if (a != null) {
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(a, 0, a.length, this.f77206c.f77212d);
                this.f77205b = decodeByteArray;
                if (decodeByteArray != null) {
                    Handler handler = this.f77206c.f77209a;
                    handler.sendMessage(handler.obtainMessage(0, this));
                    return;
                }
                Handler handler2 = this.f77206c.f77209a;
                handler2.sendMessage(handler2.obtainMessage(1, this));
                return;
            }
            Handler handler3 = this.f77206c.f77209a;
            handler3.sendMessage(handler3.obtainMessage(1, this));
        } catch (VolleyError e) {
            Handler handler4 = this.f77206c.f77209a;
            handler4.sendMessage(handler4.obtainMessage(1, this));
        } catch (NullPointerException e2) {
            String valueOf = String.valueOf(this.f77207d);
            Log.e("ListAppsImageManager", valueOf.length() == 0 ? new String("Malformed image URL: ") : "Malformed image URL: ".concat(valueOf));
            Handler handler5 = this.f77206c.f77209a;
            handler5.sendMessage(handler5.obtainMessage(1, this));
        }
    }
}
