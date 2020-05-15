package p000;

import android.content.Context;
import android.location.Location;
import android.os.Message;
import com.google.android.location.quake.ShakeEvent;
import com.google.android.location.quake.ShakeVettingHints;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: bgrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgrp extends bgtf {

    /* renamed from: a */
    private final Context f117368a;

    /* renamed from: b */
    private final bgsd f117369b;

    /* renamed from: c */
    private final bgrr f117370c;

    /* renamed from: d */
    private final bgrh f117371d;

    /* renamed from: e */
    private bgpo f117372e;

    /* renamed from: i */
    private final bgqx f117373i;

    public bgrp(Context context, bgsd bgsd, bgrr bgrr, bgrh bgrh, bgqx bgqx) {
        super("ResRep");
        this.f117368a = context;
        this.f117369b = bgsd;
        this.f117370c = bgrr;
        this.f117371d = bgrh;
        this.f117373i = bgqx;
    }

    /* renamed from: a */
    public final void mo63111a() {
        srn srn = bgrw.f117381a;
        bgpo bgpo = new bgpo(this.f117373i.f117317a.f117383b);
        this.f117372e = bgpo;
        bgpo.mo63074a();
        this.f117482h.mo63156c();
    }

    /* renamed from: b */
    public final void mo63113b() {
        bgpo bgpo = this.f117372e;
        if (bgpo != null) {
            bgpo.mo63076b();
            this.f117372e = null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bsax.b(int, long):void
     arg types: [int, int]
     candidates:
      bsax.b(int, double):void
      bsax.b(int, float):void
      bsax.b(int, java.lang.Object):void
      bsax.b(int, boolean):void
      bsax.b(int, int):byte[]
      bsax.b(int, long):void */
    /* renamed from: a */
    public final boolean mo63112a(Message message) {
        bfku bfku;
        Location location;
        bsax bsax;
        if (this.f117372e == null) {
            return false;
        }
        int i = message.what;
        if (i == 6) {
            srn srn = bgrw.f117381a;
            if (!cezu.f183534a.mo6606a().seismicSendSessionHeartbeat()) {
                return false;
            }
            bgrz a = ((bgru) this.f117370c).f117376a.mo63125a(bgpt.m99738a(this.f117368a), System.currentTimeMillis());
            bgpo bgpo = this.f117372e;
            long j = a.f117398c;
            int i2 = a.f117399d;
            int i3 = a.f117400e;
            int i4 = a.f117401f;
            int i5 = a.f117402g;
            int i6 = a.f117396a;
            long j2 = a.f117397b;
            int i7 = bgpo.f117206d;
            bsax bsax2 = new bsax(bgox.f117136q);
            bsax2.mo70105a(1, 2);
            bsax2.mo70106a(2, j);
            bsax2.mo70105a(3, i2);
            bsax2.mo70105a(4, i3);
            bsax2.mo70105a(5, i4);
            bsax2.mo70105a(6, i5);
            bsax2.mo70105a(7, i6);
            if (cezu.f183534a.mo6606a().seismicHeartbeatEnableS2CellReporting()) {
                bsax2.mo70106a(8, j2);
            }
            bsax bsax3 = new bsax(bgox.f117133n);
            bsax3.mo70118b(2, bsax2);
            bgpo.mo63075a(bgpo.m99709a(bsax3, null));
            return false;
        } else if (i == 8) {
            srn srn2 = bgrw.f117381a;
            this.f117482h.f117486b.mo63149a(10, message.getData(), cezu.m138494o() / 2);
            return false;
        } else if (i != 10) {
            return false;
        } else {
            srn srn3 = bgrw.f117381a;
            if (this.f117372e == null) {
                return true;
            }
            ShakeEvent shakeEvent = (ShakeEvent) bgtg.m99902b(message);
            buoc f = this.f117371d.mo63110f();
            long j3 = shakeEvent.f150846a;
            long nanos = TimeUnit.MILLISECONDS.toNanos(cezu.m138494o()) / 2;
            long j4 = j3 - f.f154481i;
            bfkf bfkf = f.f154473a;
            long j5 = j4 - nanos;
            int a2 = bfkf.mo61828a(j5, bfkf.mo61827a(j5));
            int a3 = f.f154473a.mo61827a(j4 + nanos);
            if (a2 == -1) {
                bfku = null;
            } else if (a3 == -1) {
                bfku = null;
            } else if (a3 >= a2) {
                int i8 = (a3 - a2) + 1;
                long[] jArr = new long[i8];
                int[] iArr = new int[2];
                iArr[1] = i8;
                iArr[0] = 3;
                float[][] fArr = (float[][]) Array.newInstance(float.class, iArr);
                int i9 = 0;
                while (i9 < i8) {
                    int i10 = a2 + i9;
                    jArr[i9] = f.f154473a.mo61829a(i10) + f.f154481i;
                    fArr[0][i9] = f.f154473a.mo61826a(i10, 0);
                    fArr[1][i9] = f.f154473a.mo61826a(i10, 1);
                    fArr[2][i9] = f.f154473a.mo61826a(i10, 2);
                    i9++;
                    a2 = a2;
                }
                bfku = new bfku(jArr, fArr);
            } else {
                bfku = null;
            }
            bgpo bgpo2 = this.f117372e;
            Location d = this.f117369b.mo63078d();
            Location f2 = this.f117369b.mo63080f();
            Location e = this.f117369b.mo63079e();
            Long g = this.f117369b.mo63081g();
            long millis = TimeUnit.NANOSECONDS.toMillis(shakeEvent.f150846a);
            ShakeVettingHints shakeVettingHints = shakeEvent.f150847b;
            bfku bfku2 = bfku;
            long j6 = shakeVettingHints.f150848a;
            boolean z = shakeVettingHints.f150849b;
            boolean z2 = shakeVettingHints.f150850c;
            Location location2 = f2;
            double d2 = shakeVettingHints.f150851d;
            double d3 = shakeVettingHints.f150852e;
            double d4 = shakeVettingHints.f150853f;
            double d5 = shakeVettingHints.f150854g;
            double d6 = shakeVettingHints.f150855h;
            double d7 = shakeVettingHints.f150856i;
            int i11 = shakeVettingHints.f150857j;
            int i12 = bgpo.f117206d;
            bgpo bgpo3 = bgpo2;
            bsax bsax4 = new bsax(bgox.f117134o);
            if (d != null) {
                location = d;
                bsax4.mo70107a(1, bgpo.m99708a(d));
            } else {
                location = d;
            }
            if (location2 != null) {
                bsax4.mo70107a(2, bgpo.m99708a(location2));
            }
            if (e != null) {
                bsax4.mo70107a(3, bgpo.m99708a(e));
            }
            bsax4.mo70106a(4, millis);
            if (g != null) {
                bsax4.mo70106a(5, g.longValue());
            }
            if (cezu.f183534a.mo6606a().seismicReportActiveVibe()) {
                bsax4.mo70106a(6, j6);
            }
            if (cezu.m138482c()) {
                bsax4.mo70108a(7, z);
            }
            if (cezu.m138483d()) {
                bsax4.mo70108a(8, z2);
            }
            if (cezu.f183534a.mo6606a().seismicAccelReportAngles()) {
                bsax bsax5 = new bsax(bgox.f117135p);
                bsax5.mo70103a(1, d2);
                bsax5.mo70103a(2, d3);
                bsax4.mo70107a(9, bsax5);
            }
            if (cezu.m138481b() || cezu.m138485f()) {
                bsax4.mo70103a(10, d4);
            }
            if (cezu.m138485f()) {
                bsax4.mo70103a(11, d5);
                bsax4.mo70103a(12, d6);
                bsax4.mo70103a(13, d7);
            }
            if (cezu.m138503x() == 1) {
                bsax4.mo70105a(14, i11);
            }
            bsax bsax6 = new bsax(bgox.f117133n);
            bsax6.mo70107a(1, bsax4);
            if (bfku2 != null) {
                bsax = new bsax(bgox.f117112bz);
                bsax.mo70117b(1, 0L);
                bfku bfku3 = bfku2;
                long a4 = bfku3.mo61857a(0);
                int i13 = 0;
                while (i13 < bfku3.f114316b) {
                    bsax bsax7 = new bsax(bgox.f117062bB);
                    long a5 = bfku3.mo61857a(i13);
                    long a6 = bfku3.mo61857a(i13);
                    bsax7.mo70117b(8, a5 - a4);
                    bsax7.mo70116b(1, bfku3.mo61854a(i13, 0));
                    bsax7.mo70116b(2, bfku3.mo61854a(i13, 1));
                    bsax7.mo70116b(3, bfku3.mo61854a(i13, 2));
                    bsax.mo70107a(3, bsax7);
                    i13++;
                    a4 = a6;
                }
                if (location != null) {
                    bsax.mo70107a(8, bgpo.m99708a(location));
                }
            } else {
                bsax = null;
            }
            bsax a7 = bgpo.m99709a(bsax6, bsax);
            bgpo3.mo63075a(a7);
            Context context = bgpo3.f117207a;
            if (!cezu.m138491l()) {
                return true;
            }
            try {
                File a8 = bgph.m99701a(context);
                if (a8 == null) {
                    return true;
                }
                new FileOutputStream(new File(a8, String.valueOf(new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss", Locale.getDefault()).format(new Date())).concat(".gloc"))).write(a7.mo70120b());
                return true;
            } catch (IOException e2) {
                return true;
            }
        }
    }
}
