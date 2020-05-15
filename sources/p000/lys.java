package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/* renamed from: lys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class lys {

    /* renamed from: a */
    public static final lvn f33210a = new lvn("MigrateLogger");

    /* renamed from: b */
    public final Context f33211b;

    /* renamed from: c */
    public long f33212c;

    /* renamed from: d */
    public long f33213d;

    /* renamed from: e */
    public final bxvd f33214e;

    /* renamed from: f */
    public bxvd f33215f;

    /* renamed from: g */
    private final ArrayList f33216g = new ArrayList();

    /* renamed from: h */
    private final qws f33217h;

    public lys(Context context) {
        qws qws = new qws(context, "ANDROID_MIGRATE", null);
        qws.mo24337a(cagz.FAST_IF_RADIO_AWAKE);
        this.f33217h = qws;
        this.f33211b = context;
        bxvd da = mta.f34617g.mo74144da();
        this.f33214e = da;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mta mta = (mta) da.f164949b;
        mta.f34619a |= 1;
        mta.f34620b = -10;
        bxvd da2 = mtn.f34677i.mo74144da();
        this.f33215f = da2;
        mti mti = mti.f34670a;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        mtn mtn = (mtn) da2.f164949b;
        mti.getClass();
        mtn.f34685g = mti;
        mtn.f34679a |= 16;
        bxvd bxvd = this.f33215f;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        mtn mtn2 = (mtn) bxvd.f164949b;
        mtn2.f34680b = 0;
        mtn2.f34679a |= 1;
        bxvd bxvd2 = this.f33215f;
        int b = mo19757b();
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        mtn mtn3 = (mtn) bxvd2.f164949b;
        mtn3.f34679a |= 4;
        mtn3.f34683e = b;
        this.f33212c = SystemClock.elapsedRealtime();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19752a() {
    }

    /* renamed from: a */
    public abstract void mo19756a(mtn mtn);

    /* renamed from: b */
    public final int mo19757b() {
        Intent registerReceiver = this.f33211b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra >= 0 && intExtra2 > 0) {
                return (intExtra * 100) / intExtra2;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo19759d();

    /* renamed from: a */
    public final void mo19753a(int i) {
        f33210a.mo25412b("logMigrateStatusCode: %d", Integer.valueOf(i));
        bxvd bxvd = this.f33214e;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        mta mta = (mta) bxvd.f164949b;
        mta mta2 = mta.f34617g;
        mta.f34619a = 1 | mta.f34619a;
        mta.f34620b = i;
    }

    /* renamed from: c */
    public final void mo19758c() {
        Throwable th;
        IOException e;
        String str;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bxvd bxvd = this.f33215f;
        long j = this.f33212c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        mtn mtn = (mtn) bxvd.f164949b;
        mtn mtn2 = mtn.f34677i;
        mtn.f34679a |= 32;
        mtn.f34686h = j;
        bxvd bxvd2 = this.f33215f;
        long j2 = elapsedRealtime - this.f33212c;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        mtn mtn3 = (mtn) bxvd2.f164949b;
        mtn3.f34679a |= 2;
        mtn3.f34681c = j2;
        bxvd bxvd3 = this.f33215f;
        int b = mo19757b();
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        mtn mtn4 = (mtn) bxvd3.f164949b;
        mtn4.f34679a |= 8;
        mtn4.f34684f = b;
        mo19756a((mtn) this.f33215f.mo74062i());
        synchronized (this.f33216g) {
            bxvd bxvd4 = this.f33214e;
            if (bxvd4.f164950c) {
                bxvd4.mo74035c();
                bxvd4.f164950c = false;
            }
            mta mta = mta.f34617g;
            ((mta) bxvd4.f164949b).f34624f = bxvk.m124030de();
            ArrayList arrayList = this.f33216g;
            if (bxvd4.f164950c) {
                bxvd4.mo74035c();
                bxvd4.f164950c = false;
            }
            mta mta2 = (mta) bxvd4.f164949b;
            if (!mta2.f34624f.mo73666a()) {
                mta2.f34624f = bxvk.m124021a(mta2.f34624f);
            }
            bxsy.m123078a(arrayList, mta2.f34624f);
        }
        int d = mo19759d();
        if (cckw.f179263a.mo6606a().mo76254s()) {
            mo19752a();
            mta mta3 = (mta) this.f33214e.mo74062i();
            FileOutputStream fileOutputStream = null;
            if (cckw.f179263a.mo6606a().mo76225O()) {
                qwo a = this.f33217h.mo24335a(mta3.mo73642k());
                int i = d - 1;
                if (d != 0) {
                    a.mo24328b(i);
                    a.mo24327b();
                    lvn lvn = f33210a;
                    Object[] objArr = new Object[1];
                    int i2 = mta3.f34619a;
                    if ((i2 & 8) != 0) {
                        mtb mtb = mta3.f34622d;
                        if (mtb == null) {
                            mtb = mtb.f34626o;
                        }
                        str = mtb.f34629b;
                    } else if ((i2 & 16) != 0) {
                        mtc mtc = mta3.f34623e;
                        if (mtc == null) {
                            mtc = mtc.f34642b;
                        }
                        str = mtc.f34644a;
                    } else {
                        str = (i2 & 4) != 0 ? "[iOS session has no tracer]" : "[no tracer found]";
                    }
                    objArr[0] = str;
                    lvn.mo25414c("Sending log to clearcut with tracer %s", objArr);
                    return;
                }
                throw null;
            }
            File b2 = mce.m24859b(this.f33211b, "migrate_log_files");
            long time = new Date().getTime();
            StringBuilder sb = new StringBuilder(37);
            sb.append("migrate_logs_");
            sb.append(time);
            sb.append(".txt");
            File file = new File(b2, sb.toString());
            mce.f33399a.mo25414c("Dumping logs to file %s", file.getAbsolutePath());
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    mta3.mo73638a(fileOutputStream2);
                    srz.m36171a(fileOutputStream2);
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    try {
                        mce.f33399a.mo25415d("Failed writing logs to file", e, new Object[0]);
                        srz.m36171a(fileOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        srz.m36171a(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                    srz.m36171a(fileOutputStream);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                mce.f33399a.mo25415d("Failed writing logs to file", e, new Object[0]);
                srz.m36171a(fileOutputStream);
            } catch (Throwable th4) {
                th = th4;
                srz.m36171a(fileOutputStream);
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void mo19754a(int i, long j) {
        synchronized (this.f33216g) {
            if (((long) this.f33216g.size()) < cckw.f179263a.mo6606a().mo76216F()) {
                bxvd da = mtv.f34719d.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                mtv mtv = (mtv) da.f164949b;
                int i2 = mtv.f34721a | 1;
                mtv.f34721a = i2;
                mtv.f34722b = i;
                mtv.f34721a = i2 | 2;
                mtv.f34723c = j;
                this.f33216g.add((mtv) da.mo74062i());
                return;
            }
            f33210a.mo25416d("Not logging USB transport error to ClearCut - too many errors", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo19755a(mtf mtf, int i) {
        bxvd da = mth.f34664e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mth mth = (mth) da.f164949b;
        mth.f34667b = mtf.f34662d;
        int i2 = mth.f34666a | 1;
        mth.f34666a = i2;
        mth.f34668c = i - 1;
        mth.f34666a = i2 | 2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mth mth2 = (mth) da.f164949b;
        mth2.f34666a |= 4;
        mth2.f34669d = elapsedRealtime;
        mth mth3 = (mth) da.mo74062i();
        bxvd bxvd = this.f33215f;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        mtn mtn = (mtn) bxvd.f164949b;
        mtn mtn2 = mtn.f34677i;
        mth3.getClass();
        if (!mtn.f34682d.mo73666a()) {
            mtn.f34682d = bxvk.m124021a(mtn.f34682d);
        }
        mtn.f34682d.add(mth3);
    }
}
