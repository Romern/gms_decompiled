package p000;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

/* renamed from: mmb */
final /* synthetic */ class mmb implements mmr {

    /* renamed from: a */
    private final mmc f33988a;

    /* renamed from: b */
    private final mph f33989b;

    public mmb(mmc mmc, mph mph) {
        this.f33988a = mmc;
        this.f33989b = mph;
    }

    /* renamed from: a */
    public final InputStream mo20161a() {
        mtr mtr;
        long j;
        mmc mmc = this.f33988a;
        mph mph = this.f33989b;
        ((mft) mmc.f33992c).f33603d.block();
        if (!mmc.m25320a(mph.f34146d)) {
            mfr mfr = mmc.f33992c;
            String str = mph.f34146d;
            synchronized (mfr) {
                ((mft) mfr).f33605f = true;
            }
            if (sqw.m36047b(cckw.f179263a.mo6606a().mo76248m().split(",")).contains(str)) {
                j = cckw.f179263a.mo6606a().mo76249n();
            } else {
                j = cckw.f179263a.mo6606a().mo76237b();
            }
            mft.f33602c.mo25409a("Timeout for %s is %s seconds", str, Long.valueOf(j));
            long millis = TimeUnit.SECONDS.toMillis(j);
            mft mft = (mft) mfr;
            Context context = mft.f33598b;
            mft mft2 = mft;
            mex mex = r11;
            mex mex2 = new mex(context, new lvp(context), new mfp(mft.f33598b), str, millis, mft.f33604e);
            mex.mo19903a();
            if (ccnu.m130914b()) {
                mft.f33602c.mo25409a("Waiting for backup task to finish.", new Object[0]);
            }
            try {
                if (ccnu.m130914b()) {
                    mex.f33552a.mo25409a("Waiting for backup complete latch.", new Object[0]);
                }
                mex mex3 = mex;
                mex3.f33554c.await();
                synchronized (mfr) {
                    ((mft) mfr).f33605f = false;
                    ((mft) mfr).mo19947b();
                }
                met met = mft2.f33597a;
                Integer num = mex3.f33557f;
                Integer num2 = mex3.f33558g;
                bxvd da = mtp.f34688g.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                mtp mtp = (mtp) da.f164949b;
                str.getClass();
                int i = 1 | mtp.f34690a;
                mtp.f34690a = i;
                mtp.f34691b = str;
                mtp.f34693d = 2;
                mtp.f34690a = i | 4;
                if (num != null) {
                    int intValue = num.intValue();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    mtp mtp2 = (mtp) da.f164949b;
                    mtp2.f34690a |= 16;
                    mtp2.f34695f = intValue;
                }
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    mtp mtp3 = (mtp) da.f164949b;
                    mtp3.f34690a |= 8;
                    mtp3.f34694e = intValue2;
                }
                met.f33538g.add((mtp) da.mo74062i());
                Integer num3 = mex3.f33557f;
                if (num3 == null || num3.intValue() != 0) {
                    String valueOf = String.valueOf(mph.f34146d);
                    throw new C1577mms(valueOf.length() == 0 ? new String("Unable to perform backup ") : "Unable to perform backup ".concat(valueOf));
                }
                File a = mmc.f33994e.mo19920a(mph.f34146d);
                if ("@pm@".equals(mph.f34146d) && mmc.f33995f) {
                    try {
                        mmc.f33991b.mo20012a(a);
                        mmc.f33990a.mo25414c("Telephony data appended.", new Object[0]);
                    } catch (mae e) {
                        mmc.f33990a.mo25417e("Couldn't append telephony data.", e, new Object[0]);
                    }
                }
                return new FileInputStream(a);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new RuntimeException("Interrupted", e2);
            }
        } else {
            if (cckw.m130264b()) {
                mtr b = mmc.mo20165b();
                mmc.f33990a.mo25409a("Sms/mms stats before backup: %s", b.toString());
                mmc.f33993d.mo19897a(b);
            }
            File a2 = mmc.f33994e.mo19920a("com.android.providers.telephony");
            try {
                mhf mhf = mmc.f33991b;
                mhf.mo20013a(a2, mhf.f33715b);
                mmc.f33990a.mo25412b("Telephony backup done.", new Object[0]);
                mmc.f33993d.mo19896a("com.android.providers.telephony", 0);
                if (cckw.m130264b() && ccnu.m130915c()) {
                    mtr = mmc.mo20165b();
                    mmc.f33990a.mo25409a("Sms/mms stats after backup: %s", mtr.toString());
                    mmc.f33993d.mo19897a(mtr);
                }
            } catch (mae e3) {
                mmc.f33990a.mo25417e("Couldn't get telephony data.", e3, new Object[0]);
                mmc.f33993d.mo19896a("com.android.providers.telephony", 8);
                if (cckw.m130264b() && ccnu.m130915c()) {
                    mtr = mmc.mo20165b();
                    mmc.f33990a.mo25409a("Sms/mms stats after backup: %s", mtr.toString());
                }
            } catch (Throwable th) {
                if (cckw.m130264b() && ccnu.m130915c()) {
                    mtr b2 = mmc.mo20165b();
                    mmc.f33990a.mo25409a("Sms/mms stats after backup: %s", b2.toString());
                    mmc.f33993d.mo19897a(b2);
                }
                throw th;
            }
            return new FileInputStream(a2);
        }
    }
}
