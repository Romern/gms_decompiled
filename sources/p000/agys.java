package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: agys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agys extends soa {

    /* renamed from: a */
    private final agyr f66881a;

    /* renamed from: b */
    private final String f66882b;

    static {
        srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);
    }

    public agys(agyr agyr, String str) {
        super(9);
        this.f66881a = agyr;
        this.f66882b = str;
    }

    public final void run() {
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream((InputStream) new URL(this.f66882b).getContent());
            if (decodeStream != null) {
                this.f66881a.mo36147a(decodeStream, this.f66882b);
            } else {
                this.f66881a.mo36150v();
            }
        } catch (MalformedURLException e) {
            this.f66881a.mo36150v();
        } catch (IOException e2) {
            this.f66881a.mo36150v();
        }
    }
}
