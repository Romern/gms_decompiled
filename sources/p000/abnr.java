package p000;

import android.location.Location;
import android.os.Build;
import android.os.SystemClock;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: abnr */
final /* synthetic */ class abnr implements aubw {

    /* renamed from: a */
    private final bxvd f57747a;

    public abnr(bxvd bxvd) {
        this.f57747a = bxvd;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        bxvd bxvd = this.f57747a;
        Location location = (Location) obj;
        int i = eoa.f15378a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bosu bosu = (bosu) bxvd.f164949b;
        bosu bosu2 = bosu.f134668af;
        bosu.f134684O = 7;
        bosu.f134702b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        if (location == null) {
            abnd.m47941a().mo54078b("empty");
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        abnt.m47965a(location, bxvd, SystemClock.elapsedRealtimeNanos());
        abnd.m47941a().mo54078b("success");
    }
}
