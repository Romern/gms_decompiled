package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Parcel;
import android.os.StrictMode;
import android.os.SystemClock;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: omq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class omq {

    /* renamed from: a */
    public final qws f37948a;

    /* renamed from: b */
    public omt f37949b;

    /* renamed from: c */
    private final Context f37950c;

    /* renamed from: d */
    private int f37951d = -1;

    /* renamed from: e */
    private long f37952e = -1;

    /* renamed from: f */
    private int f37953f;

    /* renamed from: g */
    private bmxv f37954g = bmvz.f131120a;

    static {
        odk.m28481a("CAR.ANALYTICS");
    }

    public omq(Context context) {
        this.f37950c = context;
        this.f37948a = new qws(context, "CAR", null);
    }

    /* renamed from: a */
    private final void m29177a(Context context) {
        bmxv bmxv;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f37952e > 60000) {
            this.f37952e = elapsedRealtime;
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int i = -1;
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra("level", -1);
                int intExtra2 = registerReceiver.getIntExtra("scale", -1);
                int intExtra3 = registerReceiver.getIntExtra("temperature", -1);
                if (intExtra >= 0 && intExtra2 >= 0) {
                    i = (intExtra * (100000 / intExtra2)) / 1000;
                }
                this.f37953f = i;
                if (intExtra3 >= 0 && intExtra3 <= 1000) {
                    bmxv = bmxv.m108566b(Integer.valueOf(intExtra3));
                } else {
                    bmxv = bmvz.f131120a;
                }
                this.f37954g = bmxv;
                return;
            }
            this.f37953f = -1;
            this.f37954g = bmvz.f131120a;
        }
    }

    /* renamed from: b */
    private final int m29178b(Context context) {
        m29177a(context);
        return this.f37953f;
    }

    /* renamed from: c */
    private static boolean m29179c(Context context) {
        return ((AudioManager) context.getSystemService("audio")).isMusicActive();
    }

    /* renamed from: a */
    public final bpcl mo22311a() {
        if (!ccql.m131268c()) {
            bxvd da = bpcl.f135759L.mo74144da();
            int b = m29178b(this.f37950c);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpcl bpcl = (bpcl) da.f164949b;
            bpcl.f135773a = 16777216 | bpcl.f135773a;
            bpcl.f135794v = b;
            boolean c = m29179c(this.f37950c);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpcl bpcl2 = (bpcl) da.f164949b;
            int i = 33554432 | bpcl2.f135773a;
            bpcl2.f135773a = i;
            bpcl2.f135795w = c;
            int i2 = this.f37951d;
            bpcl2.f135773a = 8388608 | i;
            bpcl2.f135793u = i2;
            return (bpcl) da.mo74062i();
        }
        m29177a(this.f37950c);
        if (this.f37954g.mo66813a()) {
            bxvd da2 = bpcl.f135759L.mo74144da();
            int b2 = m29178b(this.f37950c);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpcl bpcl3 = (bpcl) da2.f164949b;
            bpcl3.f135773a = 16777216 | bpcl3.f135773a;
            bpcl3.f135794v = b2;
            boolean c2 = m29179c(this.f37950c);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpcl bpcl4 = (bpcl) da2.f164949b;
            bpcl4.f135773a = 33554432 | bpcl4.f135773a;
            bpcl4.f135795w = c2;
            int intValue = ((Integer) this.f37954g.mo66814b()).intValue();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpcl bpcl5 = (bpcl) da2.f164949b;
            bpcl5.f135774b |= 1048576;
            bpcl5.f135769I = intValue;
            int i3 = this.f37951d;
            bpcl5.f135773a = 8388608 | bpcl5.f135773a;
            bpcl5.f135793u = i3;
            return (bpcl) da2.mo74062i();
        }
        bxvd da3 = bpcl.f135759L.mo74144da();
        int b3 = m29178b(this.f37950c);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bpcl bpcl6 = (bpcl) da3.f164949b;
        bpcl6.f135773a = 16777216 | bpcl6.f135773a;
        bpcl6.f135794v = b3;
        boolean c3 = m29179c(this.f37950c);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bpcl bpcl7 = (bpcl) da3.f164949b;
        int i4 = 33554432 | bpcl7.f135773a;
        bpcl7.f135773a = i4;
        bpcl7.f135795w = c3;
        int i5 = this.f37951d;
        bpcl7.f135773a = 8388608 | i4;
        bpcl7.f135793u = i5;
        return (bpcl) da3.mo74062i();
    }

    /* renamed from: a */
    public final void mo22312a(int i, OutputStream outputStream) {
        this.f37951d = i;
        if (!ccqc.f179744a.mo6606a().mo76637c()) {
            this.f37949b = outputStream != null ? new omt("CAR", outputStream) : null;
        }
    }

    /* renamed from: a */
    public final void mo22313a(bpcl bpcl, int i) {
        boolean z;
        byte[] k = bpcl.mo73642k();
        int i2 = 0;
        if (this.f37949b != null) {
            z = true;
        } else {
            z = false;
        }
        omp omp = new omp(this, k, z);
        oms oms = omp.f37947b;
        if (oms != null) {
            bmxy.m108581a(oms);
            int i3 = i - 1;
            if (i != 0) {
                oms.f37955a.f29522c = i3;
            } else {
                throw null;
            }
        } else {
            qwo qwo = omp.f37946a;
            bmxy.m108581a(qwo);
            int i4 = i - 1;
            if (i != 0) {
                qwo.mo24328b(i4);
            } else {
                throw null;
            }
        }
        oms oms2 = omp.f37947b;
        if (oms2 != null) {
            bmxy.m108581a(oms2);
            Parcel obtain = Parcel.obtain();
            obtain.writeParcelable(oms2.f37955a, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
            try {
                DataOutputStream dataOutputStream = oms2.f37956b.f37958b;
                if (marshall != null) {
                    i2 = marshall.length;
                }
                dataOutputStream.writeInt(i2);
                if (marshall != null) {
                    oms2.f37956b.f37958b.write(marshall);
                }
            } catch (IOException e) {
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw th;
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return;
        }
        qwo qwo2 = omp.f37946a;
        bmxy.m108581a(qwo2);
        qwo2.mo24327b();
    }
}
