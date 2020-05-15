package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.carsetup.BinderParcel;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.android.gms.carsetup.CarSetupServiceImpl;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: osq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class osq implements pan {

    /* renamed from: a */
    public final AtomicBoolean f38337a = new AtomicBoolean(false);

    /* renamed from: b */
    public final Runnable f38338b = new osj(this);

    /* renamed from: c */
    public final Handler f38339c;

    /* renamed from: d */
    public final CarSetupServiceImpl f38340d;

    /* renamed from: e */
    public final Context f38341e;

    /* renamed from: f */
    public final ozl f38342f;

    /* renamed from: g */
    public Closeable f38343g;

    /* renamed from: h */
    public Bundle f38344h;

    /* renamed from: i */
    public Runnable f38345i;

    /* renamed from: j */
    public long f38346j;

    /* renamed from: k */
    public int f38347k;

    /* renamed from: l */
    public int f38348l;

    /* renamed from: m */
    public pao f38349m;

    /* renamed from: n */
    public boolean f38350n;

    /* renamed from: o */
    public boolean f38351o;

    /* renamed from: p */
    public volatile boolean f38352p;

    /* renamed from: q */
    public ComponentName f38353q;

    /* renamed from: r */
    private final orn f38354r;

    /* renamed from: s */
    private final pbn f38355s;

    /* renamed from: t */
    private final pbr f38356t;

    public osq(Handler handler, CarSetupServiceImpl carSetupServiceImpl, Context context, orn orn, pbn pbn, ozl ozl, pbr pbr) {
        this.f38339c = handler;
        this.f38349m = null;
        this.f38340d = carSetupServiceImpl;
        this.f38341e = context;
        this.f38354r = orn;
        this.f38355s = pbn;
        this.f38342f = ozl;
        this.f38356t = pbr;
    }

    /* renamed from: a */
    private final void m29679a(ComponentName componentName) {
        bmxy.m108581a(componentName);
        this.f38353q = componentName;
        bnsi d = CarSetupServiceImpl.f29560a.mo68390d();
        d.mo68432a("osq", "a", 1969, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Interested in handoff - start handoff");
        orn orn = this.f38354r;
        bxvd da = bpcl.f135759L.mo74144da();
        bxvd da2 = bpdj.f136247f.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpdj bpdj = (bpdj) da2.f164949b;
        int i = bpdj.f136249a | 1;
        bpdj.f136249a = i;
        bpdj.f136250b = 27;
        bpdj.f136249a = i | 2;
        bpdj.f136251c = 3009;
        bpdj bpdj2 = (bpdj) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpcl bpcl = (bpcl) da.f164949b;
        bpdj2.getClass();
        bpcl.f135785m = bpdj2;
        bpcl.f135773a |= 8192;
        orn.mo22545a((bpcl) da.mo74062i(), 38);
        this.f38339c.post(new osk(this));
    }

    /* renamed from: b */
    public final Bundle mo22576b(boolean z) {
        Bundle bundle = new Bundle();
        CarSetupServiceImpl carSetupServiceImpl = this.f38340d;
        bnsn bnsn = CarSetupServiceImpl.f29560a;
        if (((Boolean) carSetupServiceImpl.f29607x.mo6606a()).booleanValue()) {
            bundle.putBoolean("car_handoff_start_activities", true);
            bundle.putBoolean("car_handoff_user_authorized_projection", z);
            bundle.putInt("connection_tag", this.f38348l);
        }
        return bundle;
    }

    /* renamed from: c */
    public final void mo22578c() {
        mo22567a();
        this.f38339c.post(this.f38338b);
    }

    /* JADX WARN: Type inference failed for: r4v29, types: [oib, android.os.IBinder], assign insn: 0x00e7: INVOKE  (r4v29 ? I:oib) = (r4v28 com.google.android.gms.carsetup.CarInfoInternal) type: STATIC call: oja.a(java.lang.Object):oib */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: d */
    public final void mo22579d() {
        mo22567a();
        bnsi d = CarSetupServiceImpl.f29560a.mo68390d();
        d.mo68432a("osq", "d", 2098, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Starting transfer for handoff.");
        this.f38351o = true;
        if (((Boolean) this.f38340d.f29607x.mo6606a()).booleanValue()) {
            this.f38349m.mo22837a(this.f38346j, mo22576b(!this.f38350n));
        }
        Context context = this.f38341e;
        Closeable closeable = osp.f38336a;
        ovk ovk = this.f38340d.f29566E;
        osr osr = new osr(closeable, CarSetupServiceImpl.f29561b, this.f38347k);
        mo22567a();
        if (this.f38352p) {
            Intent putExtra = new Intent("com.google.android.gms.car.HANDOFF").setComponent((ComponentName) nzg.f36999a.mo6606a()).putExtra("car_handoff_session_id", this.f38346j).putExtra("car_handoff_component", this.f38353q.flattenToString()).putExtra("car_handoff_start_activities", true).putExtra("car_handoff_user_authorized_projection", !this.f38350n).putExtra("car_handoff_connection_type", this.f38347k).putExtra("connection_tag", this.f38348l);
            CarSetupServiceImpl.m22119a(this.f38342f, putExtra);
            if (((Boolean) this.f38340d.f29608y.mo6606a()).booleanValue()) {
                putExtra.putExtra("car_handoff_analytics_session_id", (int) this.f38346j);
            }
            if (((Boolean) this.f38340d.f29607x.mo6606a()).booleanValue()) {
                putExtra.putExtra("car_handoff_use_gearhead_for_projection", true);
            }
            putExtra.putExtra("connection_tear_down_helper", new BinderParcel(new osx(osr)));
            if (!ccpv.m131198g()) {
                putExtra.putExtra("car_handoff_car_info", new BinderParcel(oja.m28892a(this.f38340d.f29595l)));
            } else {
                CarInfoInternal carInfoInternal = this.f38340d.f29595l;
                if (carInfoInternal != null) {
                    sef.m35071a(carInfoInternal, putExtra, "car_handoff_car_info");
                }
            }
            context.startService(putExtra);
            if (!this.f38350n) {
                this.f38339c.postDelayed(this.f38338b, 5000);
                return;
            }
            return;
        }
        throw new IllegalStateException("No component accepted the handoff.");
    }

    /* renamed from: e */
    public final void mo22580e() {
        mo22567a();
        bnsn bnsn = CarSetupServiceImpl.f29560a;
        if (!this.f38351o) {
            pao pao = this.f38349m;
            bnsi d = pbm.f38775a.mo68390d();
            d.mo68432a("pbm", "d", 296, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Tearing down car connection");
            pbm pbm = (pbm) pao;
            pbm.mo22868c().execute(new paz(pbm));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: f */
    public final void mo22581f() {
        boolean z;
        mo22567a();
        if (this.f38350n) {
            CarSetupServiceImpl carSetupServiceImpl = this.f38340d;
            bnsn bnsn = CarSetupServiceImpl.f29560a;
            if (((Boolean) carSetupServiceImpl.f29607x.mo6606a()).booleanValue()) {
                try {
                    z = ((Boolean) this.f38349m.mo22837a(this.f38346j, mo22576b(true)).get(500, TimeUnit.MILLISECONDS)).booleanValue();
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    bnsi c = CarSetupServiceImpl.f29560a.mo68388c();
                    c.mo68437a(e);
                    c.mo68432a("osq", "f", 2162, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Could not complete call to startup service");
                    z = false;
                }
                bmxy.m108601b(z, "Failed to signal user authorization state");
            }
            Context context = this.f38341e;
            mo22567a();
            Intent putExtra = new Intent("com.google.android.gms.car.HANDOFF_USER_AUTHORIZATION").setComponent((ComponentName) nzg.f36999a.mo6606a()).putExtra("car_handoff_user_authorized_projection", true).putExtra("car_handoff_session_id", this.f38346j);
            CarSetupServiceImpl.m22119a(this.f38342f, putExtra);
            if (((Boolean) this.f38340d.f29607x.mo6606a()).booleanValue()) {
                putExtra.putExtra("car_handoff_use_gearhead_for_projection", true);
            }
            context.startService(putExtra);
        }
    }

    /* renamed from: g */
    public final void mo22582g() {
        mo22567a();
        if (this.f38337a.compareAndSet(false, true)) {
            bnsi d = CarSetupServiceImpl.f29560a.mo68390d();
            d.mo68432a("osq", "g", 2187, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Car setup no longer needed");
            try {
                this.f38343g.close();
            } catch (IOException e) {
            }
            this.f38339c.removeCallbacks(this.f38338b);
            this.f38340d.mo17423g();
            this.f38349m.mo22838a();
        }
    }

    /* renamed from: b */
    public final void mo22577b() {
        mo22567a();
        if (this.f38350n) {
            this.f38339c.post(new osm(this));
        } else {
            this.f38339c.post(this.f38338b);
        }
    }

    /* renamed from: a */
    public final void mo22567a() {
        CarSetupServiceImpl carSetupServiceImpl = this.f38340d;
        bnsn bnsn = CarSetupServiceImpl.f29560a;
        if (((Boolean) carSetupServiceImpl.f29606w.mo6606a()).booleanValue()) {
            bmxy.m108581a(this.f38343g);
            bmxy.m108581a(this.f38344h);
            bmxy.m108581a(this.f38345i);
            bmxy.m108581a(this.f38349m);
        }
    }

    /* renamed from: a */
    public final void mo22568a(int i, int i2, String str) {
        this.f38339c.post(new osn(this, i, i2, str));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, boolean):void
     arg types: [java.lang.String, java.lang.String, boolean]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void */
    /* renamed from: a */
    public final void mo22569a(ComponentName componentName, boolean z) {
        String str;
        mo22567a();
        bnsi d = CarSetupServiceImpl.f29560a.mo68390d();
        d.mo68432a("osq", "a", 1936, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        if (componentName != null) {
            str = componentName.flattenToString();
        } else {
            str = "null";
        }
        d.mo68431a("Interested in handoff %s %b", (Object) str, z);
        if (z) {
            if (!nzi.m28224a() && ccpz.m131237d() && !ccpz.m131235b()) {
                this.f38349m.mo22839a(this.f38355s);
            }
            if (!nzi.m28224a() && ccpz.m131235b()) {
                File a = pbp.m30149a(this.f38341e);
                if (a.exists()) {
                    bnsi d2 = pbp.f38794a.mo68390d();
                    d2.mo68432a("pbp", "b", 75, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d2.mo68405a("Removing car database.");
                    a.delete();
                }
            }
            if (!nzi.m28224a() && cctv.f179911a.mo6606a().mo76773e()) {
                this.f38349m.mo22839a(this.f38356t);
            }
            bmxy.m108581a(componentName);
            this.f38353q = componentName;
            bnsi d3 = CarSetupServiceImpl.f29560a.mo68390d();
            d3.mo68432a("osq", "a", 1969, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d3.mo68405a("Interested in handoff - start handoff");
            orn orn = this.f38354r;
            bxvd da = bpcl.f135759L.mo74144da();
            bxvd da2 = bpdj.f136247f.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpdj bpdj = (bpdj) da2.f164949b;
            int i = bpdj.f136249a | 1;
            bpdj.f136249a = i;
            bpdj.f136250b = 27;
            bpdj.f136249a = i | 2;
            bpdj.f136251c = 3009;
            bpdj bpdj2 = (bpdj) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpcl bpcl = (bpcl) da.f164949b;
            bpdj2.getClass();
            bpcl.f135785m = bpdj2;
            bpcl.f135773a |= 8192;
            orn.mo22545a((bpcl) da.mo74062i(), 38);
            this.f38339c.post(new osk(this));
        } else if (componentName != null) {
            pbm pbm = (pbm) this.f38349m;
            pbm.f38780f.post(new pau(pbm));
        } else {
            this.f38349m.mo22838a();
            this.f38339c.post(this.f38345i);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    public final void mo22570a(bipi bipi) {
        mo22567a();
        bnsn bnsn = CarSetupServiceImpl.f29560a;
        int i = bipi.f121169f;
        if (this.f38351o) {
            mo22567a();
            if (this.f38350n) {
                if (((Boolean) this.f38340d.f29607x.mo6606a()).booleanValue()) {
                    this.f38349m.mo22837a(this.f38346j, mo22576b(false));
                }
                Context context = this.f38341e;
                mo22567a();
                Intent putExtra = new Intent("com.google.android.gms.car.HANDOFF_USER_AUTHORIZATION").setComponent((ComponentName) nzg.f36999a.mo6606a()).putExtra("car_handoff_user_authorized_projection", false).putExtra("car_handoff_session_id", this.f38346j).putExtra("car_handoff_user_not_authorized_projection_bye_bye_reason", bipi.f121169f);
                CarSetupServiceImpl.m22119a(this.f38342f, putExtra);
                if (((Boolean) this.f38340d.f29607x.mo6606a()).booleanValue()) {
                    putExtra.putExtra("car_handoff_use_gearhead_for_projection", true);
                }
                context.startService(putExtra);
                return;
            }
            return;
        }
        pao pao = this.f38349m;
        bnsi d = pbm.f38775a.mo68390d();
        d.mo68432a("pbm", "a", 331, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68409a("Tearing down car connection with reason %s", bipi.f121169f);
        pbm pbm = (pbm) pao;
        pbm.mo22868c().execute(new pba(pbm, bipi));
    }

    /* renamed from: a */
    public final void mo22571a(omi omi) {
        this.f38339c.post(new oso(this, omi));
    }

    /* renamed from: a */
    public final void mo22572a(boolean z) {
        mo22567a();
        bnsi d = CarSetupServiceImpl.f29560a.mo68390d();
        d.mo68432a("osq", "a", 1985, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("handoff initiated: %b", Boolean.valueOf(z));
        ofd.m28611a(this.f38341e, "com.google.android.gms.car.CONNECTION_HANDOFF", !z ? ofa.FAILED : ofa.COMPLETED);
        this.f38352p = z;
        if (!z) {
            this.f38349m.mo22838a();
            this.f38339c.post(this.f38345i);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, boolean):void
     arg types: [java.lang.String, java.lang.String, boolean]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void */
    /* renamed from: a */
    public final void mo22573a(boolean z, int i, CarInfoInternal carInfoInternal, bivd bivd, List list) {
        String str;
        mo22567a();
        bnsi d = CarSetupServiceImpl.f29560a.mo68390d();
        d.mo68432a("osq", "a", 2008, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        ComponentName componentName = this.f38353q;
        if (componentName != null) {
            str = componentName.flattenToString();
        } else {
            str = "<null>";
        }
        d.mo68431a("Handoff complete. Interested component: %s. Success: %b", (Object) str, z);
        orn orn = this.f38354r;
        CarInfo carInfo = carInfoInternal.f29539a;
        orn.mo22544a(carInfo.f29336e, carInfo.f29337f, bivd);
        this.f38339c.post(new osl(this, z, list, bivd, carInfoInternal, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo22574a(boolean z, List list, bivd bivd, CarInfoInternal carInfoInternal, int i) {
        try {
            this.f38343g.close();
        } catch (IOException e) {
        }
        if (z) {
            bnsi d = CarSetupServiceImpl.f29560a.mo68390d();
            d.mo68432a("osq", "a", 2026, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68409a("Handoff success with %d", list.size());
            this.f38340d.mo17413a(carInfoInternal, bivd.f121962n);
            return;
        }
        bnsi b = CarSetupServiceImpl.f29560a.mo68387b();
        b.mo68432a("osq", "a", 2032, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b.mo68409a("Handoff failed with %d", i);
    }

    /* renamed from: a */
    public final void mo22575a(boolean z, boolean z2) {
        mo22567a();
        if (!this.f38349m.mo22840a(z, z2)) {
            throw new IllegalStateException("Authorization state failed to persist");
        }
    }
}
