package p000;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.TransactionTooLargeException;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: acxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acxl {

    /* renamed from: a */
    static final AtomicInteger f61021a = new AtomicInteger();

    /* renamed from: j */
    private static final String[] f61022j = {"query", "query_universal", "suggest"};

    /* renamed from: b */
    public int f61023b;

    /* renamed from: c */
    public int f61024c;

    /* renamed from: d */
    public int f61025d;

    /* renamed from: e */
    public int f61026e;

    /* renamed from: f */
    public boolean f61027f;

    /* renamed from: g */
    public boolean f61028g;

    /* renamed from: h */
    public String f61029h;

    /* renamed from: i */
    public int f61030i = 2;

    /* renamed from: k */
    private long f61031k;

    /* renamed from: l */
    private long f61032l;

    /* renamed from: m */
    private long f61033m;

    /* renamed from: n */
    private int f61034n;

    /* renamed from: o */
    private long f61035o;

    /* renamed from: p */
    private final bxvd f61036p;

    public acxl(bpzh bpzh, int i) {
        bxvd da = bpxd.f139655C.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpxd bpxd = (bpxd) da.f164949b;
        bpxd.f139660b = bpzh.mo3214a();
        bpxd.f139659a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpxd bpxd2 = (bpxd) da.f164949b;
        bpxd2.f139664f = i - 2;
        bpxd2.f139659a |= 64;
        boolean booleanValue = ((Boolean) abzt.f58948bj.mo58455c()).booleanValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpxd bpxd3 = (bpxd) da.f164949b;
        bpxd3.f139659a |= 4194304;
        bpxd3.f139680v = booleanValue;
        this.f61036p = da;
    }

    /* renamed from: b */
    private final void m49942b(String str, String str2, String str3) {
        int i = this.f61034n;
        if (!(i == 3 || i == 4)) {
            this.f61030i = 24;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bxvd bxvd = this.f61036p;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpxd bpxd = (bpxd) bxvd.f164949b;
        bpxd bpxd2 = bpxd.f139655C;
        str2.getClass();
        int i2 = bpxd.f139659a | 4;
        bpxd.f139659a = i2;
        bpxd.f139661c = str2;
        str3.getClass();
        bpxd.f139659a = i2 | 16;
        bpxd.f139662d = str3;
        String str4 = this.f61029h;
        if (str4 == null) {
            bxvd bxvd2 = this.f61036p;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bpxd bpxd3 = (bpxd) bxvd2.f164949b;
            bpxd3.f139659a &= -33;
            bpxd3.f139663e = bpxd.f139655C.f139663e;
        } else {
            bxvd bxvd3 = this.f61036p;
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            bpxd bpxd4 = (bpxd) bxvd3.f164949b;
            str4.getClass();
            bpxd4.f139659a |= 32;
            bpxd4.f139663e = str4;
        }
        bxvd bxvd4 = this.f61036p;
        int i3 = (int) (elapsedRealtime - this.f61031k);
        if (bxvd4.f164950c) {
            bxvd4.mo74035c();
            bxvd4.f164950c = false;
        }
        bpxd bpxd5 = (bpxd) bxvd4.f164949b;
        int i4 = bpxd5.f139659a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        bpxd5.f139659a = i4;
        bpxd5.f139675q = i3;
        bpxd bpxd6 = (bpxd) this.f61036p.f164949b;
        int i5 = bpxd6.f139673o;
        int i6 = bpxd6.f139675q;
        bpxd5.f139659a = i4 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        bpxd5.f139673o = i5 + i6;
        int length = str.length();
        if (bxvd4.f164950c) {
            bxvd4.mo74035c();
            bxvd4.f164950c = false;
        }
        bpxd bpxd7 = (bpxd) bxvd4.f164949b;
        int i7 = bpxd7.f139659a | 128;
        bpxd7.f139659a = i7;
        bpxd7.f139665g = length;
        int i8 = this.f61023b;
        int i9 = i7 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        bpxd7.f139659a = i9;
        bpxd7.f139666h = i8;
        int i10 = this.f61024c;
        int i11 = i9 | 512;
        bpxd7.f139659a = i11;
        bpxd7.f139667i = i10;
        int i12 = this.f61025d;
        int i13 = i11 | 1024;
        bpxd7.f139659a = i13;
        bpxd7.f139668j = i12;
        int i14 = this.f61026e;
        int i15 = i13 | 2048;
        bpxd7.f139659a = i15;
        bpxd7.f139669k = i14;
        boolean z = this.f61027f;
        int i16 = i15 | 16777216;
        bpxd7.f139659a = i16;
        bpxd7.f139682x = z;
        boolean z2 = this.f61028g;
        bpxd7.f139659a = i16 | 33554432;
        bpxd7.f139683y = z2;
        bpxd7.f139658B = bqay.m112492a(this.f61030i);
        bpxd7.f139659a |= 268435456;
        this.f61034n = 4;
    }

    /* renamed from: c */
    public final void mo33208c() {
        boolean z = true;
        if (this.f61034n != 1) {
            z = false;
        }
        sdo.m34974b(z);
        this.f61033m = SystemClock.elapsedRealtime();
        this.f61034n = 5;
    }

    /* renamed from: d */
    public final void mo33209d() {
        boolean z;
        if (this.f61034n == 5) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bxvd bxvd = this.f61036p;
        int i = (int) (elapsedRealtime - this.f61033m);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpxd bpxd = (bpxd) bxvd.f164949b;
        bpxd bpxd2 = bpxd.f139655C;
        bpxd.f139659a |= 8192;
        bpxd.f139672n = i;
        this.f61034n = 6;
    }

    /* renamed from: e */
    public final void mo33210e() {
        boolean z;
        if (this.f61034n == 6) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bxvd bxvd = this.f61036p;
        int i = (int) (elapsedRealtime - this.f61032l);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpxd bpxd = (bpxd) bxvd.f164949b;
        bpxd bpxd2 = bpxd.f139655C;
        bpxd.f139659a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        bpxd.f139674p = i;
        bxvd bxvd2 = this.f61036p;
        int i2 = ((bpxd) bxvd2.f164949b).f139674p;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bpxd bpxd3 = (bpxd) bxvd2.f164949b;
        bpxd3.f139659a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        bpxd3.f139673o = i2;
        this.f61031k = elapsedRealtime;
        this.f61034n = 2;
    }

    /* renamed from: f */
    public final void mo33211f() {
        boolean z;
        if (this.f61034n == 2) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bxvd bxvd = this.f61036p;
        int i = (int) (elapsedRealtime - this.f61031k);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpxd bpxd = (bpxd) bxvd.f164949b;
        bpxd bpxd2 = bpxd.f139655C;
        bpxd.f139659a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        bpxd.f139676r = i;
        this.f61031k = elapsedRealtime;
        this.f61034n = 3;
    }

    /* renamed from: a */
    public final bpxd mo33201a(String str, String str2, String str3) {
        m49942b(str, str2, bmxx.m108578b(str3));
        Object[] objArr = new Object[13];
        objArr[0] = Integer.valueOf(((bpxd) this.f61036p.f164949b).f139684z);
        objArr[1] = Integer.valueOf(((bpxd) this.f61036p.f164949b).f139657A);
        String[] strArr = f61022j;
        bpzh a = bpzh.m112427a(((bpxd) this.f61036p.f164949b).f139660b);
        if (a == null) {
            a = bpzh.QUERY;
        }
        objArr[2] = strArr[a.mo3214a()];
        objArr[3] = str;
        objArr[4] = Integer.valueOf(((bpxd) this.f61036p.f164949b).f139666h);
        objArr[5] = Integer.valueOf(((bpxd) this.f61036p.f164949b).f139667i);
        objArr[6] = Integer.valueOf(((bpxd) this.f61036p.f164949b).f139668j);
        objArr[7] = Integer.valueOf(((bpxd) this.f61036p.f164949b).f139671m);
        objArr[8] = Integer.valueOf(((bpxd) this.f61036p.f164949b).f139672n);
        objArr[9] = Integer.valueOf(((bpxd) this.f61036p.f164949b).f139674p);
        objArr[10] = Integer.valueOf(((bpxd) this.f61036p.f164949b).f139675q);
        objArr[11] = Integer.valueOf(((bpxd) this.f61036p.f164949b).f139676r);
        bpxd bpxd = (bpxd) this.f61036p.f164949b;
        objArr[12] = Integer.valueOf(bpxd.f139671m + bpxd.f139673o + bpxd.f139676r);
        absg.m48194b("#%d (%d ms): %s [%s] req/res/sco %d/%d/%d in init:%d + lock_wait:%d + prepBefore:%d + prepAfter:%d + execute:%d = %d ms", objArr);
        return (bpxd) this.f61036p.mo74062i();
    }

    /* renamed from: b */
    public final void mo33207b() {
        boolean z;
        if (this.f61034n == 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bxvd bxvd = this.f61036p;
        int i = (int) (elapsedRealtime - this.f61031k);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpxd bpxd = (bpxd) bxvd.f164949b;
        bpxd bpxd2 = bpxd.f139655C;
        bpxd.f139659a |= 4096;
        bpxd.f139671m = i;
        this.f61032l = elapsedRealtime;
        this.f61034n = 1;
    }

    /* renamed from: a */
    public final void mo33202a() {
        bxvd bxvd = this.f61036p;
        int incrementAndGet = f61021a.incrementAndGet();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpxd bpxd = (bpxd) bxvd.f164949b;
        bpxd bpxd2 = bpxd.f139655C;
        bpxd.f139659a |= 67108864;
        bpxd.f139684z = incrementAndGet;
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - abrv.f58061a);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpxd bpxd3 = (bpxd) bxvd.f164949b;
        bpxd3.f139659a |= 134217728;
        bpxd3.f139657A = elapsedRealtime;
        this.f61035o = System.currentTimeMillis();
        this.f61031k = SystemClock.elapsedRealtime();
        this.f61034n = 0;
    }

    /* renamed from: a */
    public final void mo33203a(abtn abtn) {
        if (abtn != null) {
            bxvd bxvd = this.f61036p;
            bpyt bpyt = abtn.f58274b;
            if (bpyt == null) {
                bpyt = bpyt.f139932a;
            }
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpxd bpxd = (bpxd) bxvd.f164949b;
            bpxd bpxd2 = bpxd.f139655C;
            bpyt.getClass();
            bpxd.f139679u = bpyt;
            bpxd.f139659a |= 2097152;
            bpyk bpyk = abtn.f58273a;
            if (bpyk == null) {
                bpyk = bpyk.f139875a;
            }
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpxd bpxd3 = (bpxd) bxvd.f164949b;
            bpyk.getClass();
            bpxd3.f139681w = bpyk;
            bpxd3.f139659a |= 8388608;
        }
    }

    /* renamed from: a */
    public final void mo33204a(Exception exc) {
        if (exc == null) {
            return;
        }
        if (exc instanceof TransactionTooLargeException) {
            this.f61030i = 21;
        } else if (exc instanceof DeadObjectException) {
            this.f61030i = 22;
        } else if (exc instanceof RemoteException) {
            this.f61030i = 23;
        } else {
            this.f61030i = exc instanceof RuntimeException ? 25 : 26;
        }
    }

    /* renamed from: a */
    public final void mo33205a(String str, String str2, String str3, Bundle bundle) {
        m49942b(str, str2, bmxx.m108578b(str3));
        if (bundle != null) {
            bxvd bxvd = this.f61036p;
            int i = (int) (this.f61035o - bundle.getLong("request_timestamp_ms"));
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpxd bpxd = (bpxd) bxvd.f164949b;
            bpxd bpxd2 = bpxd.f139655C;
            bpxd.f139659a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
            bpxd.f139677s = i;
            bundle.putByteArray("IcingQueryStatsLog", ((bpxd) this.f61036p.mo74062i()).mo73642k());
            bundle.putBoolean("should_log_stats", true);
            bundle.putLong("query_task_done_timestamp_ms", System.currentTimeMillis());
        }
    }

    /* renamed from: a */
    public final void mo33206a(String[] strArr) {
        HashSet<bpzf> hashSet = new HashSet();
        for (String str : strArr) {
            if ("com.google.android.gms-apps".equals(str)) {
                hashSet.add(bpzf.APPS);
            } else if ("com.google.android.gms-contacts_contact_id".equals(str)) {
                hashSet.add(bpzf.CONTACTS);
            } else if ("com.google.android.gms-phones_data_id".equals(str)) {
                hashSet.add(bpzf.PHONES);
            } else if ("com.google.android.gms-emails_data_id".equals(str)) {
                hashSet.add(bpzf.EMAILS);
            } else if ("com.google.android.gms-postals_data_id".equals(str)) {
                hashSet.add(bpzf.POSTALS);
            } else if ("com.google.android.gms-sms".equals(str)) {
                hashSet.add(bpzf.SMS);
            }
        }
        if (!hashSet.isEmpty()) {
            bxvd bxvd = this.f61036p;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpxd bpxd = (bpxd) bxvd.f164949b;
            bpxd bpxd2 = bpxd.f139655C;
            if (!bpxd.f139670l.mo73666a()) {
                bpxd.f139670l = bxvk.m124019a(bpxd.f139670l);
            }
            for (bpzf bpzf : hashSet) {
                bpxd.f139670l.mo74153d(bpzf.mo3214a());
            }
        }
    }
}
