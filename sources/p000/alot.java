package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.util.concurrent.ExecutorService;

/* renamed from: alot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class alot extends amqd {

    /* renamed from: a */
    private static final ExecutorService f73982a = snp.m35704b(9);

    /* renamed from: c */
    public static final byte[] f73983c = new byte[0];

    /* renamed from: d */
    public static final byte[] f73984d = new byte[0];

    /* renamed from: b */
    private final boolean f73985b = cfyx.m143985b();

    /* renamed from: e */
    protected final boolean f73986e = false;

    /* renamed from: f */
    protected almh f73987f;

    /* renamed from: g */
    protected final almp f73988g;

    protected alot(String str, int i, almp almp, String str2) {
        super(str, i, null, str2, null);
        this.f73988g = almp;
    }

    /* renamed from: a */
    private final void m61436a(alos alos) {
        almh almh;
        almh almh2;
        ParcelFileDescriptor parcelFileDescriptor;
        try {
            anco anco = alos.f73978f;
            if (anco != null) {
                parcelFileDescriptor = anco.f76637a;
            } else {
                parcelFileDescriptor = null;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("width", alos.f73979g);
            bundle.putInt("height", alos.f73980h);
            bundle.putBoolean("rewindable", alos.f73981i);
            mo40608a();
            amqv amqv = alos.f73977e;
            int i = alos.f73979g;
            int i2 = alos.f73980h;
            boolean z = alos.f73981i;
            ancp.m64027a(parcelFileDescriptor);
            almp almp = this.f73988g;
            amqv amqv2 = alos.f73977e;
            almp.mo40530a(amqv2.f75784a, amqv2.f75785b, parcelFileDescriptor, bundle);
        } catch (DeadObjectException e) {
            if (this.f73985b && (almh = this.f75735r) != null) {
                almh.mo40510b(7, 0);
            }
        } catch (Exception e2) {
            Log.e("BasePeopleOperation", "Unknown error", e2);
            if (this.f73985b && (almh2 = this.f75735r) != null) {
                almh2.mo40510b(6, 0);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo40608a();

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final void mo40603b(Context context) {
        almh almh;
        almh almh2;
        almh almh3;
        almh almh4;
        almh almh5;
        almh almh6;
        ParcelFileDescriptor parcelFileDescriptor;
        almh almh7;
        almh almh8;
        int i = 0;
        if (this.f75733p) {
            if (this.f73986e && (almh8 = this.f73987f) != null) {
                almh8.mo40507a(8, 0);
            }
            if (this.f73985b && (almh7 = this.f75735r) != null) {
                almh7.mo40510b(8, 0);
                return;
            }
            return;
        }
        try {
            alos c = mo40609c(context);
            anco anco = c.f73978f;
            if (anco != null) {
                this.f75734q.add(anco);
            }
            m61436a(c);
            int i2 = 2;
            if (!this.f73986e) {
                if (!this.f73985b) {
                    i2 = 1;
                    if (this.f73986e && (almh6 = this.f73987f) != null) {
                        almh6.mo40507a(i2, i);
                    }
                    if (this.f73985b && (almh5 = this.f75735r) != null && almh5.f73704r == 1) {
                        almh5.mo40510b(i2, i);
                        return;
                    }
                    return;
                }
            }
            anco anco2 = c.f73978f;
            if (!(anco2 == null || (parcelFileDescriptor = anco2.f76637a) == null || parcelFileDescriptor.getFileDescriptor() == null || !c.f73978f.f76637a.getFileDescriptor().valid() || c.f73980h == 0 || c.f73979g == 0)) {
                i = 1;
            }
            almh6.mo40507a(i2, i);
            if (this.f73985b) {
            }
        } catch (Exception e) {
            Log.e("BasePeopleOperation", "Error during operation", e);
            m61436a(alos.f73975c);
            boolean z = this.f73986e;
            int i3 = 6;
            if (!z && !this.f73985b) {
                i3 = 1;
            }
            if (z && (almh2 = this.f73987f) != null) {
                almh2.mo40507a(i3, 0);
            }
            if (this.f73985b && (almh = this.f75735r) != null && almh.f73704r == 1) {
                almh.mo40510b(i3, 0);
            }
        } catch (Throwable th) {
            if (this.f73986e && (almh4 = this.f73987f) != null) {
                almh4.mo40507a(1, 0);
            }
            if (this.f73985b && (almh3 = this.f75735r) != null && almh3.f73704r == 1) {
                almh3.mo40510b(1, 0);
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract alos mo40609c(Context context);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final ExecutorService mo16649j() {
        return f73982a;
    }

    public alot(String str, String str2, int i, almp almp, String str3) {
        super(str, i, str2, str3, null);
        this.f73988g = almp;
        amig.m62939a();
        if (this.f73986e) {
            almh almh = new almh(str3);
            this.f73987f = almh;
            almh.f73688b = str2;
            almh.f73689c = str;
        }
    }
}
