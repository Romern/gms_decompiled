package p000;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsStates;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: bgba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgba {

    /* renamed from: a */
    public boolean f115958a;

    /* renamed from: b */
    private final Context f115959b;

    /* renamed from: c */
    private final bgav f115960c;

    /* renamed from: d */
    private final boolean f115961d;

    /* renamed from: e */
    private boolean f115962e;

    /* renamed from: f */
    private boolean f115963f;

    public bgba(Context context, bgav bgav, String str) {
        this.f115959b = context;
        this.f115960c = bgav;
        this.f115961d = rfz.m33557a(bgav.f115940a).mo24610b(str);
    }

    /* renamed from: a */
    private final boolean m98492a(boolean z) {
        if (!z || this.f115960c.mo62580g()) {
            return false;
        }
        if (this.f115961d) {
            return this.f115960c.mo62581h();
        }
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.fill(boolean[], boolean):void}
     arg types: [boolean[], int]
     candidates:
      ClspMth{java.util.Arrays.fill(double[], double):void}
      ClspMth{java.util.Arrays.fill(byte[], byte):void}
      ClspMth{java.util.Arrays.fill(long[], long):void}
      ClspMth{java.util.Arrays.fill(char[], char):void}
      ClspMth{java.util.Arrays.fill(short[], short):void}
      ClspMth{java.util.Arrays.fill(java.lang.Object[], java.lang.Object):void}
      ClspMth{java.util.Arrays.fill(int[], int):void}
      ClspMth{java.util.Arrays.fill(float[], float):void}
      ClspMth{java.util.Arrays.fill(boolean[], boolean):void} */
    /* renamed from: a */
    public final bgaz mo62589a() {
        boolean z;
        int i;
        boolean[] zArr = new boolean[9];
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = true;
        if (this.f115962e) {
            this.f115963f = true;
        }
        if (this.f115960c.mo62580g()) {
            zArr[8] = true;
            z = false;
        } else {
            z = true;
        }
        if (this.f115963f && !this.f115960c.mo62573a() && this.f115960c.mo62575b()) {
            zArr[0] = true;
            z = false;
        }
        if (this.f115962e && this.f115960c.mo62577d()) {
            if (!this.f115960c.mo62576c()) {
                zArr[1] = true;
                z = false;
            }
            if (this.f115960c.f115942c.hasSystemFeature("android.hardware.wifi") && !this.f115960c.f115941b.isWifiEnabled()) {
                bgav bgav = this.f115960c;
                int i3 = Build.VERSION.SDK_INT;
                if (!bgav.f115941b.isScanAlwaysAvailable() || bgav.mo62583j()) {
                    int i4 = Build.VERSION.SDK_INT;
                    zArr[3] = true;
                    z = false;
                }
            }
        }
        if ((this.f115963f || this.f115962e) && !this.f115960c.mo62581h() && this.f115961d) {
            zArr[4] = true;
            z = false;
        }
        if (this.f115958a && this.f115960c.mo62578e() && !this.f115960c.mo62582i() && !this.f115960c.mo62579f()) {
            int i5 = Build.VERSION.SDK_INT;
            zArr[7] = true;
            z = false;
        }
        int i6 = 8500;
        if ((!zArr[0] && !zArr[1]) || !this.f115960c.mo62574a("no_share_location") || this.f115960c.mo62580g()) {
            int i7 = 8505;
            if (!zArr[5] && !zArr[7]) {
                if (zArr[2] || zArr[3]) {
                    if (!this.f115960c.mo62583j()) {
                        i7 = 0;
                    }
                    if (i7 != 0) {
                        Arrays.fill(zArr, false);
                        i = i7;
                    }
                } else if (z) {
                    i = 0;
                }
                i = 6;
            } else {
                if (!this.f115960c.mo62574a("no_config_bluetooth")) {
                    i6 = this.f115960c.mo62583j() ? 8505 : 0;
                }
                if (i6 != 0) {
                    Arrays.fill(zArr, false);
                    i = i6;
                } else {
                    i = 6;
                }
            }
        } else {
            Arrays.fill(zArr, false);
            i = 8500;
        }
        Context context = this.f115959b;
        bgav bgav2 = this.f115960c;
        aeij aeij = new aeij();
        aeij.f63418a = m98492a(this.f115960c.mo62573a());
        aeij.f63419b = m98492a(this.f115960c.mo62576c());
        if (!this.f115960c.mo62578e() || !this.f115960c.mo62582i()) {
            int i8 = Build.VERSION.SDK_INT;
            if (!this.f115960c.mo62579f()) {
                z2 = false;
            }
        }
        aeij.f63420c = z2;
        aeij.f63421d = this.f115960c.mo62575b();
        aeij.f63422e = this.f115960c.mo62577d();
        return new bgaz(context, bgav2, i, new LocationSettingsStates(aeij.f63418a, aeij.f63419b, aeij.f63420c, aeij.f63421d, aeij.f63422e, this.f115960c.mo62578e()), zArr);
    }

    /* renamed from: a */
    public final void mo62590a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LocationRequest locationRequest = (LocationRequest) it.next();
            if (locationRequest != null) {
                int i = locationRequest.f79349a;
                if (i == 100) {
                    sre.m36087g(this.f115959b);
                    this.f115963f = true;
                    this.f115962e = true;
                } else if (i == 102) {
                    sre.m36087g(this.f115959b);
                    this.f115962e = true;
                } else if (i == 104) {
                    sre.m36087g(this.f115959b);
                    this.f115962e = true;
                }
            }
        }
    }
}
