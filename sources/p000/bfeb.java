package p000;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: bfeb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfeb implements bffa {

    /* renamed from: k */
    private static bfeb f113547k;

    /* renamed from: a */
    public final bhdb f113548a;

    /* renamed from: b */
    public final bfhb f113549b;

    /* renamed from: c */
    public final Object f113550c = new Object();

    /* renamed from: d */
    public bfea f113551d;

    /* renamed from: e */
    public final List f113552e = new ArrayList();

    /* renamed from: f */
    public final SparseArray f113553f;

    /* renamed from: g */
    public int f113554g = 0;

    /* renamed from: h */
    public long f113555h = 200;

    /* renamed from: i */
    public final Context f113556i;

    /* renamed from: j */
    public final bffr f113557j;

    /* renamed from: l */
    private final SensorEventListener f113558l;

    private bfeb(Context context, bgns bgns, bhdb bhdb) {
        this.f113556i = context.getApplicationContext();
        this.f113548a = bfib.m96837a(bhdb);
        this.f113549b = new bfhb(context, bgns, new bgof());
        this.f113557j = new bffr(context);
        this.f113558l = new bfdx(this);
        this.f113553f = new SparseArray();
    }

    /* renamed from: a */
    public static synchronized bfeb m96484a(Context context, bgns bgns, bhdb bhdb) {
        bfeb bfeb;
        synchronized (bfeb.class) {
            int i = Build.VERSION.SDK_INT;
            if (f113547k == null) {
                f113547k = new bfeb(context, bgns, bhdb);
            }
            bfeb = f113547k;
        }
        return bfeb;
    }

    /* renamed from: a */
    private final void m96485a() {
        bfea bfea = this.f113551d;
        if (this.f113553f.size() == 0 && bfea != null) {
            if (bfea.f113545c) {
                synchronized (bfea.f113546d.f113550c) {
                    for (bffc bffc : bfea.f113546d.f113552e) {
                        bhdb bhdb = bfea.f113546d.f113548a;
                        String valueOf = String.valueOf(bffc);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                        sb.append("DataReader ");
                        sb.append(valueOf);
                        sb.append(" started by shutdown.");
                        sb.toString();
                        bfea.f113544b.post(bffc);
                    }
                    bfea.f113546d.f113552e.clear();
                    bfea.f113544b.getLooper().quitSafely();
                }
            }
            this.f113551d = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo61520a(bffc bffc, bfho bfho) {
        synchronized (this.f113550c) {
            bfea bfea = this.f113551d;
            if (bfea == null) {
                bfho.mo61706b();
            } else if (this.f113549b.mo61686a()) {
                int i = Build.VERSION.SDK_INT;
                this.f113554g = this.f113553f.size();
                bffr bffr = this.f113557j;
                SensorEventListener sensorEventListener = this.f113558l;
                int i2 = Build.VERSION.SDK_INT;
                bffr.f113711a.flush(sensorEventListener);
                if (bfea.f113544b.postDelayed(new bfdy(this, bffc), this.f113555h)) {
                    this.f113552e.add(bffc);
                } else {
                    bfho.mo61706b();
                }
            } else {
                bfho.mo61706b();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61521a(bfgt bfgt) {
        if (!bfgt.f113837y || this.f113557j.mo61624a(bfgt) == null) {
            String valueOf = String.valueOf(bfgt);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 76);
            sb.append("Not a supported sensor or the device doesn't have the sensor. Scanner Type: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0085, code lost:
        if (r4 == null) goto L_0x0087;
     */
    /* renamed from: a */
    public final void mo61522a(String str, bfgt bfgt) {
        mo61521a(bfgt);
        synchronized (this.f113550c) {
            if (!bfgt.f113837y) {
                String str2 = bfgt.f113838z;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 26);
                sb.append("ScannerType ");
                sb.append(str2);
                sb.append(" not supported");
                sb.toString();
            } else {
                int i = bfgt.f113836x;
                Sensor a = this.f113557j.mo61624a(bfgt);
                bfdz bfdz = (bfdz) this.f113553f.get(i);
                if (bfdz != null) {
                    Object remove = bfdz.f113542b.remove(str);
                    bfdz.mo61518a();
                    if (bfdz.f113542b.size() == 0) {
                        this.f113553f.remove(i);
                        bmxy.m108581a(a);
                        bffr bffr = this.f113557j;
                        bffr.f113711a.unregisterListener(this.f113558l, a);
                        String valueOf = String.valueOf(bfgt);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 64);
                        sb2.append("Canceling batch for scanner type ");
                        sb2.append(valueOf);
                        sb2.append(" because no client requests it.");
                        sb2.toString();
                    }
                }
                String valueOf2 = String.valueOf(bfgt);
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(valueOf2).length());
                sb3.append("ClientId ");
                sb3.append(str);
                sb3.append(" for scanner type ");
                sb3.append(valueOf2);
                sb3.append(" not exists.");
                sb3.toString();
            }
            m96485a();
        }
    }

    /* renamed from: a */
    public final void mo61523a(Set set, long j, bfho bfho) {
        bffc bffc;
        synchronized (this.f113550c) {
            bffc = new bffc(this.f113556i, this.f113549b, bfho, set, j, -1, this.f113557j, this);
        }
        mo61520a(bffc, bfho);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a9, code lost:
        if (r8 == false) goto L_0x00ad;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:32:0x00b3=Splitter:B:32:0x00b3, B:25:0x00ad=Splitter:B:25:0x00ad} */
    /* renamed from: a */
    public final boolean mo61524a(String str, bfgt bfgt, int i, int i2) {
        Sensor sensor;
        String str2 = str;
        bfgt bfgt2 = bfgt;
        int i3 = i2;
        mo61521a(bfgt2);
        String valueOf = String.valueOf(bfgt);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 81 + String.valueOf(valueOf).length());
        sb.append("startBatch: clientId=");
        sb.append(str2);
        sb.append(" scannerType=");
        sb.append(valueOf);
        sb.append(" sensorDelay=");
        sb.append(i);
        sb.append(" bufferSize=");
        sb.append(i3);
        sb.toString();
        synchronized (this.f113550c) {
            bfhb bfhb = this.f113549b;
            synchronized (bfhb.f113865d) {
                boolean z = true;
                if (!bfhb.f113868g) {
                    if (!bfhb.f113866e) {
                        int[] iArr = bfhb.f113862a;
                        int length = iArr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length) {
                                sensor = bfhb.f113871j.mo61623a(iArr[i4]);
                                if (sensor != null) {
                                    break;
                                }
                                i4++;
                            } else {
                                sensor = null;
                                break;
                            }
                        }
                        if (sensor != null) {
                            bfhb.f113863b.mo62923b(bgnq.COLLECTIONLIB, 600000, null);
                            bfha bfha = new bfha(bfhb);
                            bfhb.f113867f = bfha;
                            bfhb.f113868g = true;
                            adzt adzt = new adzt(Looper.getMainLooper());
                            boolean a = bfhb.f113871j.mo61626a(bfha, sensor, 1, adzt);
                            if (a) {
                                adzt.postDelayed(bfhb.f113870i, 5000);
                            } else {
                                bfhb.mo61685a(false, 0);
                                bfhb.f113867f = null;
                            }
                        }
                        return false;
                    }
                }
                if (this.f113551d == null) {
                    bfea bfea = new bfea(this);
                    this.f113551d = bfea;
                    bfea.start();
                    try {
                        bfea.f113543a.await();
                        bfea.f113545c = true;
                    } catch (InterruptedException e) {
                        this.f113551d = null;
                        return false;
                    }
                }
                if (!bfgt2.f113837y) {
                    String str3 = bfgt2.f113838z;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 31);
                    sb2.append("ScannerType ");
                    sb2.append(str3);
                    sb2.append(" not supported yet.");
                    sb2.toString();
                    z = false;
                } else {
                    int i5 = bfgt2.f113836x;
                    Sensor a2 = this.f113557j.mo61624a(bfgt2);
                    bfdz bfdz = (bfdz) this.f113553f.get(i5);
                    if (bfdz == null) {
                        this.f113553f.put(i5, new bfdz(str2, bfgt2.f113834A, i3));
                        bmxy.m108581a(a2);
                        bmxy.m108581a(this.f113551d);
                        bffr bffr = this.f113557j;
                        SensorEventListener sensorEventListener = this.f113558l;
                        Handler handler = this.f113551d.f113544b;
                        int i6 = Build.VERSION.SDK_INT;
                        z = bffr.f113711a.registerListener(sensorEventListener, a2, i, Integer.MAX_VALUE, handler);
                        if (!z) {
                            this.f113553f.remove(i5);
                            z = false;
                        }
                    } else {
                        bfdz.f113542b.put(str2, Integer.valueOf(i2));
                        bfdz.mo61518a();
                    }
                }
                m96485a();
                return z;
            }
        }
    }
}
