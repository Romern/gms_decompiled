package p000;

import android.content.Context;
import com.google.android.gms.ads.identifier.C0272d;
import java.io.IOException;

/* renamed from: akvp */
final /* synthetic */ class akvp implements bmzi {

    /* renamed from: a */
    private final Context f72967a;

    public akvp(Context context) {
        this.f72967a = context;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        Context context = this.f72967a;
        sek sek = akvq.f72968a;
        try {
            return C0272d.m5150a(context);
        } catch (IOException | rfv | rfw e) {
            akvq.f72968a.mo25417e("Failed to fetch the AdID info", e, new Object[0]);
            return null;
        }
    }
}
