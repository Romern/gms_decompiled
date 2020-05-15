package p000;

import android.app.KeyguardManager;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.carsetup.BinderParcel;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.List;

/* renamed from: otw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class otw implements owi {

    /* renamed from: a */
    public static final bnsn f38439a = odk.m28481a("CAR.SETUP");

    /* renamed from: b */
    public final Context f38440b;

    /* renamed from: c */
    public final CarInfoInternal f38441c;

    /* renamed from: d */
    public final npd f38442d;

    /* renamed from: e */
    public final int f38443e;

    /* renamed from: f */
    public final boolean f38444f;

    /* renamed from: g */
    public ovi f38445g;

    /* renamed from: h */
    public final boolean f38446h;

    /* renamed from: i */
    public final otv f38447i;

    /* renamed from: j */
    public boolean f38448j;

    /* renamed from: k */
    public boolean f38449k;

    /* renamed from: l */
    public boolean f38450l;

    /* renamed from: m */
    public boolean f38451m;

    /* renamed from: n */
    public boolean f38452n;

    /* renamed from: o */
    public final oxe f38453o;

    /* renamed from: p */
    private final orn f38454p;

    public otw(Context context, CarInfoInternal carInfoInternal, npd npd, int i, oxe oxe, boolean z, boolean z2, boolean z3, otv otv, orn orn) {
        this.f38440b = context;
        this.f38441c = carInfoInternal;
        this.f38442d = npd;
        this.f38443e = i;
        this.f38453o = oxe;
        this.f38444f = z;
        this.f38447i = otv;
        this.f38454p = orn;
        if (z2) {
            this.f38446h = false;
            if (!z3) {
                this.f38450l = false;
            } else {
                this.f38450l = true;
            }
        } else {
            this.f38446h = true;
            this.f38450l = false;
        }
    }

    /* renamed from: a */
    public static otw m29729a(Intent intent) {
        oul oul;
        IBinder iBinder;
        IBinder iBinder2 = ((BinderParcel) intent.getParcelableExtra("frx_state")).f29535a;
        vzr vzr = null;
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.carsetup.ILocalBinderTransport");
            oul = queryLocalInterface instanceof oul ? (oul) queryLocalInterface : new ouj(iBinder2);
        } else {
            oul = null;
        }
        try {
            iBinder = oul.mo22655a();
        } catch (RemoteException e) {
            iBinder = null;
        }
        if (iBinder == null) {
            return null;
        }
        if (iBinder != null) {
            IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface2 instanceof vzr) {
                vzr = (vzr) queryLocalInterface2;
            } else {
                vzr = new vzp(iBinder);
            }
        }
        return (otw) vzs.m41641a(vzr);
    }

    /* renamed from: i */
    private final boolean m29730i() {
        PackageManager packageManager = this.f38440b.getPackageManager();
        try {
            String[] strArr = pby.f38802a;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                if (packageManager.getPackageInfo(str, 0) == null) {
                    i++;
                } else {
                    bnsi d = f38439a.mo68390d();
                    d.mo68432a("otw", "i", 585, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d.mo68420a("%s is installed!", str);
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.os.IBinder, vzr], assign insn: 0x0063: INVOKE  (r3v1 ? I:vzr) = (r5v0 'this' otw A[THIS]) type: STATIC call: vzs.a(java.lang.Object):vzr */
    /* renamed from: b */
    public final void mo22632b() {
        bnsi d = f38439a.mo68390d();
        d.mo68432a("otw", "b", 238, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Starting setup");
        if (ccuu.f180009a.mo6606a().mo76858a()) {
            ((UiModeManager) this.f38440b.getSystemService("uimode")).disableCarMode(0);
        }
        ((KeyguardManager) this.f38440b.getSystemService("keyguard")).isKeyguardLocked();
        this.f38449k = true;
        this.f38453o.mo22737a(this);
        Context context = this.f38440b;
        Intent intent = new Intent();
        intent.setComponent(nzg.f37002d);
        intent.addFlags(268435456);
        intent.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT);
        intent.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
        intent.putExtra("frx_state", new BinderParcel(new ouk(vzs.m41642a(this))));
        context.startActivity(intent);
    }

    /* renamed from: c */
    public final void mo22635c(boolean z) {
        if (this.f38448j) {
            bnsi b = f38439a.mo68387b();
            b.mo68432a("otw", "c", 430, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Failed to set bluetooth authorization, setup already finished.");
            return;
        }
        this.f38447i.mo22591c(z);
    }

    /* renamed from: d */
    public final boolean mo22637d() {
        return this.f38441c.f29541c;
    }

    /* renamed from: e */
    public final void mo22638e() {
        this.f38452n = true;
        if (!ccpv.f179719a.mo6606a().mo76618f()) {
            bnsi d = f38439a.mo68390d();
            d.mo68432a("otw", "e", 540, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("CarService started. Notifying listener.");
            this.f38445g.mo22664b();
        } else if (this.f38449k) {
            bnsi d2 = f38439a.mo68390d();
            d2.mo68432a("otw", "e", 533, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("CarService started. Notifying listener.");
            this.f38445g.mo22664b();
        } else {
            bnsi c = f38439a.mo68388c();
            c.mo68432a("otw", "e", 536, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Setup not running. Will not notify listener.");
        }
    }

    /* renamed from: f */
    public final boolean mo22639f() {
        PackageManager packageManager = this.f38440b.getPackageManager();
        try {
            String[] strArr = pby.f38802a;
            for (String str : strArr) {
                if (packageManager.getPackageInfo(str, 0) != null) {
                    bnsi d = f38439a.mo68390d();
                    d.mo68432a("otw", "i", 585, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d.mo68420a("%s is installed!", str);
                    break;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        try {
            if (((long) this.f38440b.getPackageManager().getPackageInfo("com.google.android.projection.gearhead", 0).versionCode) < 17629000) {
                return true;
            }
            pbx g = mo22640g();
            return g.mo22893a() && g.mo22892a("car_tos_data") > 0 && g.mo22892a("car_tos_safety") > 0;
        } catch (PackageManager.NameNotFoundException e2) {
            bnsi b = f38439a.mo68387b();
            b.mo68437a(e2);
            b.mo68432a("otw", "f", 568, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Gearhead isn't installed; this check must be in the wrong position");
            return true;
        }
    }

    /* renamed from: g */
    public final pbx mo22640g() {
        return new pbx(this.f38442d);
    }

    /* renamed from: h */
    public final int mo22641h() {
        return this.f38441c.f29539a.f29336e;
    }

    /* renamed from: c */
    public final boolean mo22636c() {
        bpdu[] bpduArr;
        String str = "false";
        try {
            str = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "debug.car.skip_frx", str);
        } catch (Exception e) {
        }
        if (!"true".equalsIgnoreCase(str)) {
            List a = oqx.m29633a(this.f38440b, this).mo22527a();
            if (!a.isEmpty()) {
                bpduArr = new bpdu[a.size()];
                int size = a.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    bpduArr[i2] = oqx.m29634b((String) a.get(i));
                    i++;
                    i2++;
                }
            } else {
                bpduArr = null;
            }
            boolean isEmpty = TextUtils.isEmpty(ccui.m131664d().trim());
            bpdi bpdi = bpdi.EXPERIMENT;
            bpdh bpdh = isEmpty ^ true ? bpdh.MEDIA_APP_REQUIREMENT_CONTROL : bpdh.MEDIA_APP_REQUIREMENT_TREATMENT;
            bxvd da = bpdj.f136247f.mo74144da();
            int i3 = bpdi.f136246K;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpdj bpdj = (bpdj) da.f164949b;
            int i4 = bpdj.f136249a | 1;
            bpdj.f136249a = i4;
            bpdj.f136250b = i3;
            int i5 = bpdh.f136208em;
            bpdj.f136249a = 2 | i4;
            bpdj.f136251c = i5;
            bpdj bpdj2 = (bpdj) da.mo74062i();
            bxvd da2 = bpcl.f135759L.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpcl bpcl = (bpcl) da2.f164949b;
            bpdj2.getClass();
            bpcl.f135785m = bpdj2;
            bpcl.f135773a |= 8192;
            mo22627a((bpcl) da2.mo74062i(), 38);
            if (!this.f38450l) {
                bnsi d = f38439a.mo68390d();
                d.mo68432a("otw", "c", 345, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68405a("Triggering FRX: car connection is not allowed");
                mo22626a(3, bpduArr);
                return true;
            } else if (!mo22637d()) {
                bnsi d2 = f38439a.mo68390d();
                d2.mo68432a("otw", "c", 350, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d2.mo68405a("Triggering FRX: did not finish FRX");
                mo22626a(4, bpduArr);
                return true;
            } else if (bpduArr != null) {
                bnsi d3 = f38439a.mo68390d();
                d3.mo68432a("otw", "c", 355, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d3.mo68420a("Triggering FRX: applications are not up to date %s", a);
                mo22626a(5, bpduArr);
                return true;
            } else if (nyz.m28216a()) {
                bnsi d4 = f38439a.mo68390d();
                d4.mo68432a("otw", "c", 360, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d4.mo68405a("Triggering FRX: GMSCore permissions missing");
                mo22626a(6, (bpdu[]) null);
                return true;
            } else {
                int i6 = this.f38443e;
                if (i6 != 0 && i6 != 1) {
                    bnsi d5 = f38439a.mo68390d();
                    d5.mo68432a("otw", "c", 366, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d5.mo68405a("Triggering FRX: device not supported");
                    mo22626a(9, (bpdu[]) null);
                    return true;
                } else if (mo22639f()) {
                    return false;
                } else {
                    bnsi d6 = f38439a.mo68390d();
                    d6.mo68432a("otw", "c", 371, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d6.mo68405a("Triggering FRX: TOS not accepted");
                    mo22626a(8, (bpdu[]) null);
                    return true;
                }
            }
        } else {
            bnsi d7 = f38439a.mo68390d();
            d7.mo68432a("otw", "c", 318, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d7.mo68405a("Skipping FRX: adb override");
            return false;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: otw.a(java.lang.Boolean, boolean):void
     arg types: [java.lang.Boolean, int]
     candidates:
      otw.a(int, bpdu[]):void
      otw.a(bpcl, int):void
      otw.a(java.lang.Boolean, boolean):void */
    /* renamed from: a */
    public final void mo22624a() {
        bnsi d = f38439a.mo68390d();
        d.mo68432a("otw", "a", (int) BaseMfiEventCallback.TYPE_OPSRV_RESULT_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("onSetupSuccess");
        mo22629a(Boolean.TRUE, true);
    }

    /* renamed from: a */
    public final void mo22625a(int i) {
        ovi ovi = this.f38445g;
        if (ovi != null) {
            ovj ovj = ovi.f38472a;
            if (ovj.f38475a) {
                ovj.f38583d.mo22757a(new ovg(ovi, i));
            }
        }
    }

    /* renamed from: a */
    public final void mo22626a(int i, bpdu[] bpduArr) {
        bxvd da = bpdd.f135910e.mo74144da();
        int i2 = i - 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpdd bpdd = (bpdd) da.f164949b;
        int i3 = 1;
        int i4 = bpdd.f135912a | 1;
        bpdd.f135912a = i4;
        bpdd.f135913b = i2;
        if (i == 9) {
            int i5 = this.f38443e;
            if (i5 != 2) {
                i3 = 3;
                if (i5 == 3) {
                    bpdd.f135912a = i4 | 4;
                    bpdd.f135915d = 2;
                } else if (i5 != 4) {
                    if (i5 != 5) {
                        bpdd.f135912a = i4 | 4;
                        bpdd.f135915d = 0;
                    } else {
                        bpdd.f135912a = i4 | 4;
                        bpdd.f135915d = 4;
                    }
                }
            }
            bpdd.f135912a = i4 | 4;
            bpdd.f135915d = i3;
        }
        if (bpduArr != null) {
            List b = bqcn.m112586b(bxzo.m124572a(bpduArr));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpdd bpdd2 = (bpdd) da.f164949b;
            if (!bpdd2.f135914c.mo73666a()) {
                bpdd2.f135914c = bxvk.m124019a(bpdd2.f135914c);
            }
            bxsy.m123078a(b, bpdd2.f135914c);
        }
        bxvd da2 = bpcl.f135759L.mo74144da();
        bpdd bpdd3 = (bpdd) da.mo74062i();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpcl bpcl = (bpcl) da2.f164949b;
        bpdd3.getClass();
        bpcl.f135797y = bpdd3;
        bpcl.f135773a |= Integer.MIN_VALUE;
        mo22627a((bpcl) da2.mo74062i(), 18);
    }

    /* renamed from: b */
    public final void mo22633b(int i) {
        SharedPreferences.Editor edit = this.f38442d.f36296c.edit();
        edit.putInt("times_show_reminder_notification", i);
        edit.apply();
    }

    /* renamed from: b */
    public final void mo22634b(boolean z) {
        if (this.f38448j) {
            bnsi b = f38439a.mo68387b();
            b.mo68432a("otw", "b", 390, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Failed to update car authorization, setup already finished.");
            return;
        }
        this.f38450l = z;
        this.f38447i.mo22589b(z);
    }

    /* renamed from: a */
    public final void mo22627a(bpcl bpcl, int i) {
        if (this.f38448j) {
            bnsi d = f38439a.mo68390d();
            d.mo68432a("otw", "a", 509, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Dropping clearcut event. Setup already finished");
            return;
        }
        this.f38454p.mo22545a(bpcl, i);
    }

    /* renamed from: a */
    public final void mo22628a(bpea bpea) {
        bpeb bpeb = bpeb.CAR_SETUP_NOTIFICATION;
        bxvd da = bped.f137237x.mo74144da();
        int i = bpeb.f137221cE;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bped bped = (bped) da.f164949b;
        int i2 = bped.f137239a | 1;
        bped.f137239a = i2;
        bped.f137240b = i;
        int i3 = bpea.f137033jW;
        bped.f137239a = i2 | 2;
        bped.f137241c = i3;
        bped bped2 = (bped) da.mo74062i();
        bxvd da2 = bpcl.f135759L.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpcl bpcl = (bpcl) da2.f164949b;
        bped2.getClass();
        bpcl.f135784l = bped2;
        bpcl.f135773a |= 4096;
        mo22627a((bpcl) da2.mo74062i(), 37);
    }

    /* renamed from: a */
    public final void mo22629a(Boolean bool, boolean z) {
        bnsi d = f38439a.mo68390d();
        d.mo68432a("otw", "a", 290, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("Setup finished: supported=%b", Boolean.valueOf(z));
        if (this.f38449k) {
            this.f38445g = null;
            this.f38449k = false;
            this.f38453o.mo22738b(this);
            if (bool != null) {
                if (bool.booleanValue()) {
                    this.f38447i.mo22588b();
                } else {
                    this.f38447i.mo22587a(z);
                }
            }
            this.f38447i.mo22592d();
            this.f38448j = true;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: otw.a(java.lang.Boolean, boolean):void
     arg types: [java.lang.Boolean, int]
     candidates:
      otw.a(int, bpdu[]):void
      otw.a(bpcl, int):void
      otw.a(java.lang.Boolean, boolean):void */
    /* renamed from: a */
    public final void mo22630a(ovi ovi) {
        if (this.f38449k) {
            if (this.f38445g == null || ovi == null) {
                this.f38445g = ovi;
                this.f38447i.mo22586a();
                return;
            }
            bnsi b = f38439a.mo68387b();
            b.mo68432a("otw", "a", 190, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Unexpected listener registration");
            mo22629a(Boolean.FALSE, true);
        } else if (ovi != null) {
            ovi.mo22663a();
        }
    }

    /* renamed from: a */
    public final void mo22631a(boolean z) {
        bnsi d = f38439a.mo68390d();
        d.mo68432a("otw", "a", (int) BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("setup failed");
        mo22629a(Boolean.FALSE, z);
    }
}
