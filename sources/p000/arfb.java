package p000;

import android.os.SystemClock;
import android.util.Base64;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.SourceDevice;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import java.io.UnsupportedEncodingException;

/* renamed from: arfb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arfb extends ahia {

    /* renamed from: a */
    final /* synthetic */ arfd f87555a;

    public arfb(arfd arfd) {
        this.f87555a = arfd;
    }

    /* renamed from: a */
    public final void mo20142a(String str) {
        arfd arfd = this.f87555a;
        armu armu = arfd.f87567k;
        if (arfd.f87563g != null && armu != null) {
            arfd.f87557a.mo25412b("Disconnected from source device. %s", str);
            bxvd bxvd = this.f87555a.f87560d.f87919j.f87930b;
            int i = ((bowi) bxvd.f164949b).f135139f + 1;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bowi bowi = (bowi) bxvd.f164949b;
            bowi bowi2 = bowi.f135132i;
            bowi.f135134a |= 16;
            bowi.f135139f = i;
            arfd arfd2 = this.f87555a;
            arfd2.f87566j = null;
            arfd2.f87563g = null;
            arfd2.f87568l = false;
            armu.mo48347a();
            this.f87555a.f87567k = null;
        }
    }

    /* renamed from: a */
    public final void mo20144a(String str, ahhz ahhz) {
        arfd.f87557a.mo25412b("Incoming connection request from %s", str);
        if (this.f87555a.f87562f != null) {
            arfd.f87557a.mo25412b("Stop fastpair advertising.", new Object[0]);
            this.f87555a.f87562f.mo48778a();
            this.f87555a.f87562f.mo48779b();
        }
        String str2 = ahhz.f67228a;
        arfd arfd = this.f87555a;
        arnz arnz = null;
        try {
            try {
                arnz arnz2 = new arnz(Base64.decode(str2.getBytes("UTF-8"), 0));
                if (arnz2.f87991a.length <= 3) {
                    arnz = arnz2;
                }
            } catch (IllegalArgumentException e) {
            }
        } catch (UnsupportedEncodingException e2) {
        }
        arfd.f87565i = arnz;
        arnz arnz3 = this.f87555a.f87565i;
        if (arnz3 != null) {
            arfd.f87557a.mo25409a("With name: %s", arnz3);
            armn armn = this.f87555a.f87560d;
            int a = arqi.m73306a(arnz3.f87991a[2]);
            bxvd bxvd = armn.f87920k;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bouk bouk = (bouk) bxvd.f164949b;
            bouk bouk2 = bouk.f134931h;
            bouk.f134939g = a - 1;
            bouk.f134933a |= 32;
        } else {
            arfd.f87557a.mo25409a("With name: %s", str2);
        }
        arfd arfd2 = this.f87555a;
        if (arfd2.f87563g != null) {
            arfd.f87557a.mo25412b("Connection to %s already in progress", this.f87555a.f87563g);
            this.f87555a.f87561e.mo36519a(str);
            return;
        }
        arnt arnt = arfd2.f87564h;
        armu armu = arfd2.f87567k;
        if (armu != null && arnt != null) {
            arfd2.f87563g = str;
            String str3 = ahhz.f67229b;
            String a2 = aroa.m73209a(str3, arnt.mo48699b().mo48692a());
            arfd arfd3 = this.f87555a;
            byte[] bArr = arfd3.f87572p;
            if (bArr != null) {
                arfd3.f87573q = arhn.m72767a(1, str3, bArr);
            }
            arfd arfd4 = this.f87555a;
            arfd4.f87566j = a2;
            arfd4.f87561e.mo36521a(str, new arnm(arfd4.f87574r, arfd4.f87576t));
            armr armr = this.f87555a.f87560d.f87919j;
            bxvd bxvd2 = armr.f87930b;
            int a3 = bqcn.m112578a(SystemClock.elapsedRealtime() - armr.f87929a);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bowi bowi = (bowi) bxvd2.f164949b;
            bowi bowi2 = bowi.f135132i;
            bowi.f135134a |= 2;
            bowi.f135136c = a3;
            arnz arnz4 = this.f87555a.f87565i;
            if (arnz4 == null || !arnz4.mo48703a()) {
                sek sek = arfd.f87557a;
                StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 42);
                sb.append("Forwarding pin (");
                sb.append(a2);
                sb.append(") to bootstrap controller.");
                sek.mo25409a(sb.toString(), new Object[0]);
                armu.mo48351a(a2);
            }
        }
    }

    /* renamed from: a */
    public final void mo20145a(String str, ahid ahid) {
        arnz arnz;
        if (!str.equals(this.f87555a.f87563g)) {
            arfd.f87557a.mo25409a("Unexpected endpoint (%s) result %s", str, ahid.f67235a);
            return;
        }
        armu armu = this.f87555a.f87567k;
        if (armu != null) {
            Status status = ahid.f67235a;
            if (!status.mo17710c()) {
                arfd.f87557a.mo25416d("Connection to %s rejected (%d)", str, Integer.valueOf(status.f30115i));
                armu.mo48348a(status.f30115i);
                bxvd bxvd = this.f87555a.f87560d.f87919j.f87930b;
                int i = ((bowi) bxvd.f164949b).f135138e + 1;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bowi bowi = (bowi) bxvd.f164949b;
                bowi bowi2 = bowi.f135132i;
                bowi.f135134a |= 8;
                bowi.f135138e = i;
                this.f87555a.f87563g = null;
                return;
            }
            arfd.f87557a.mo25412b("Connected to source device %s", str);
            armr armr = this.f87555a.f87560d.f87919j;
            bxvd bxvd2 = armr.f87930b;
            int a = bqcn.m112578a(SystemClock.elapsedRealtime() - armr.f87929a);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bowi bowi3 = (bowi) bxvd2.f164949b;
            bowi bowi4 = bowi.f135132i;
            bowi3.f135134a |= 4;
            bowi3.f135137d = a;
            this.f87555a.f87561e.mo36524a();
            TargetConnectionArgs targetConnectionArgs = new TargetConnectionArgs();
            SourceDevice sourceDevice = new SourceDevice();
            arfd arfd = this.f87555a;
            sourceDevice.f107916c = !arfd.f87558b.mo48742a() ? arfd.f87558b.mo48743b() ? (byte) 2 : 0 : 1;
            sourceDevice.f107914a.add(3);
            targetConnectionArgs.f107938b = sourceDevice;
            targetConnectionArgs.f107937a.add(2);
            arfd arfd2 = this.f87555a;
            arfd2.f87568l = true;
            if (arfd2.f87573q == null || (arnz = arfd2.f87565i) == null || !arnz.mo48703a()) {
                armu.mo48349a(new arhb(this.f87555a.f87561e, str), targetConnectionArgs);
                return;
            }
            arfd.f87557a.mo25409a("Attempting to connect to source with out-of-band", new Object[0]);
            this.f87555a.mo48478a(str);
        }
    }
}
