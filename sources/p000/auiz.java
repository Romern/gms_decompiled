package p000;

import android.location.Location;
import android.os.Build;
import android.os.SystemClock;
import com.google.android.gms.thunderbird.state.ActivationInfo;
import java.util.concurrent.TimeUnit;

/* renamed from: auiz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class auiz {
    /* access modifiers changed from: protected */
    /* renamed from: bL */
    public abstract ActivationInfo mo50561bL();

    /* access modifiers changed from: protected */
    /* renamed from: bM */
    public String mo50562bM() {
        return mo50561bL().toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: bN */
    public abstract augv mo50572bN();

    /* renamed from: c */
    public final bold mo50575c(Location location) {
        bxvd da = bold.f133497f.mo74144da();
        int i = Build.VERSION.SDK_INT;
        long millis = TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos()) - mo50561bL().f109075e;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bold bold = (bold) da.f164949b;
        bold.f133499a |= 2;
        bold.f133501c = millis;
        int j = aeim.m51906j(location);
        if (j == 1) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bold bold2 = (bold) da.f164949b;
            bold2.f133500b = 2;
            bold2.f133499a = 1 | bold2.f133499a;
        } else if (j == 2) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bold bold3 = (bold) da.f164949b;
            bold3.f133500b = 4;
            bold3.f133499a = 1 | bold3.f133499a;
        } else if (j != 3) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bold bold4 = (bold) da.f164949b;
            bold4.f133500b = 1;
            bold4.f133499a = 1 | bold4.f133499a;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bold bold5 = (bold) da.f164949b;
            bold5.f133500b = 3;
            bold5.f133499a = 1 | bold5.f133499a;
        }
        float accuracy = location.getAccuracy();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bold bold6 = (bold) da.f164949b;
        bold6.f133499a = 4 | bold6.f133499a;
        bold6.f133502d = accuracy;
        if (aeim.m51904h(location)) {
            float i2 = aeim.m51905i(location);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bold bold7 = (bold) da.f164949b;
            bold7.f133499a |= 8;
            bold7.f133503e = i2;
        }
        return (bold) da.mo74062i();
    }

    /* renamed from: i */
    public final long mo50576i() {
        return SystemClock.elapsedRealtime() - mo50561bL().f109075e;
    }

    public final String toString() {
        String bM = mo50562bM();
        StringBuilder sb = new StringBuilder(String.valueOf(bM).length() + 2);
        sb.append("[");
        sb.append(bM);
        sb.append("]");
        return sb.toString();
    }
}
