package p000;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/* renamed from: mbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mbx {

    /* renamed from: e */
    private static final lvn f33380e = new lvn("ClearcutEventLogger");

    /* renamed from: a */
    public int f33381a;

    /* renamed from: b */
    public int f33382b;

    /* renamed from: c */
    public int f33383c;

    /* renamed from: d */
    public int f33384d;

    /* renamed from: f */
    private final Random f33385f = new Random();

    /* renamed from: g */
    private final qws f33386g;

    /* renamed from: h */
    private final mbu f33387h;

    /* renamed from: i */
    private boolean f33388i;

    public mbx(Context context) {
        qws qws = new qws(context, "ANDROID_BACKUP", null);
        mbu mbu = new mbu(context);
        this.f33386g = qws;
        this.f33387h = mbu;
        this.f33388i = true;
    }

    /* renamed from: a */
    private final void m24819a(mcf mcf, String str, int i) {
        int i2;
        bxvd a = lyu.m24685a();
        bxvd da = mrs.f34482d.mo74144da();
        mcf mcf2 = mcf.ELIGIBLE;
        switch (mcf.ordinal()) {
            case 1:
                i2 = 2;
                break;
            case 2:
                i2 = 3;
                break;
            case 3:
                i2 = 4;
                break;
            case 4:
                i2 = 5;
                break;
            case 5:
                i2 = 6;
                break;
            case 6:
                i2 = 7;
                break;
            case 7:
                i2 = 8;
                break;
            case 8:
                i2 = 9;
                break;
            case 9:
                i2 = 10;
                break;
            case 10:
                i2 = 11;
                break;
            default:
                f33380e.mo25418e("Ineligible event logged with an unknown eligibility value: %s", mcf);
                i2 = 1;
                break;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mrs mrs = (mrs) da.f164949b;
        mrs.f34485b = i2 - 1;
        int i3 = mrs.f34484a | 1;
        mrs.f34484a = i3;
        if (str != null) {
            str.getClass();
            mrs.f34484a = i3 | 2;
            mrs.f34486c = str;
        }
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        mqk mqk = (mqk) a.f164949b;
        mrs mrs2 = (mrs) da.mo74062i();
        mqk mqk2 = mqk.f34276G;
        mrs2.getClass();
        mqk.f34303t = mrs2;
        mqk.f34284a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        mo19833a(a, mqj.INELIGIBILITY, i);
    }

    /* renamed from: b */
    public final void mo19837b(int i) {
        bxvd a = lyu.m24685a();
        bxvd da = msr.f34581c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        msr msr = (msr) da.f164949b;
        msr.f34584b = i - 1;
        msr.f34583a |= 1;
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        mqk mqk = (mqk) a.f164949b;
        msr msr2 = (msr) da.mo74062i();
        mqk mqk2 = mqk.f34276G;
        msr2.getClass();
        mqk.f34300q = msr2;
        mqk.f34284a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        mo19833a(a, mqj.RESTORE_INFO, this.f33382b);
    }

    /* renamed from: c */
    public final void mo19840c(int i) {
        if (ccls.m130540s()) {
            bxvd a = lyu.m24685a();
            bxvd da = mrz.f34496i.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mrz mrz = (mrz) da.f164949b;
            mrz.f34499b = 9;
            int i2 = mrz.f34498a | 1;
            mrz.f34498a = i2;
            mrz.f34502e = i - 1;
            mrz.f34498a = i2 | 8;
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            mqk mqk = (mqk) a.f164949b;
            mrz mrz2 = (mrz) da.mo74062i();
            mqk mqk2 = mqk.f34276G;
            mrz2.getClass();
            mqk.f34280C = mrz2;
            mqk.f34285b |= 64;
            mo19833a(a, mqj.MMS_BACKUP, this.f33383c);
        }
    }

    /* renamed from: d */
    public final void mo19841d(int i) {
        if (ccls.m130540s()) {
            bxvd a = lyu.m24685a();
            bxvd da = mse.f34525e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mse mse = (mse) da.f164949b;
            mse.f34528b = 4;
            int i2 = mse.f34527a | 1;
            mse.f34527a = i2;
            mse.f34530d = i - 1;
            mse.f34527a = i2 | 4;
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            mqk mqk = (mqk) a.f164949b;
            mse mse2 = (mse) da.mo74062i();
            mqk mqk2 = mqk.f34276G;
            mse2.getClass();
            mqk.f34282E = mse2;
            mqk.f34285b |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            mo19833a(a, mqj.MMS_RESTORE, this.f33384d);
        }
    }

    /* renamed from: e */
    public final void mo19842e(int i) {
        bxvd a = lyu.m24685a();
        bxvd da = msu.f34592c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        msu msu = (msu) da.f164949b;
        msu.f34595b = i - 1;
        msu.f34594a |= 1;
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        mqk mqk = (mqk) a.f164949b;
        msu msu2 = (msu) da.mo74062i();
        mqk mqk2 = mqk.f34276G;
        msu2.getClass();
        mqk.f34281D = msu2;
        mqk.f34285b |= 128;
        mo19833a(a, mqj.SET_BACKUP_ACCOUNT_SERVICE_INVOKED, 0);
    }

    /* renamed from: b */
    public final void mo19838b(int i, int i2) {
        mo19824a(i, i2, (String) null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: mbx.a(int, java.lang.String, boolean):void
     arg types: [int, java.lang.String, int]
     candidates:
      mbx.a(mcf, java.lang.String, int):void
      mbx.a(int, int, int):void
      mbx.a(int, int, java.lang.String):void
      mbx.a(int, msk, int):void
      mbx.a(int, boolean, boolean):void
      mbx.a(bxvd, mqj, int):void
      mbx.a(int, java.lang.String, boolean):void */
    /* renamed from: b */
    public final void mo19839b(int i, String str) {
        mo19827a(i, str, false);
    }

    /* renamed from: a */
    private static boolean m24820a(msk msk) {
        return msk == msk.KV_BACKUP_PARTIAL_REQUEST || msk == msk.KV_BACKUP_FINAL_REQUEST || msk == msk.KV_BACKUP_ABORT_REQUEST || msk == msk.FULL_BACKUP_REQUEST || msk == msk.ENCRYPTED_BACKUP_NON_INCREMENTAL || msk == msk.ENCRYPTED_BACKUP_INCREMENTAL || msk == msk.SET_ACTIVE_SECONDARY_KEY;
    }

    /* renamed from: a */
    public final int mo19820a() {
        return this.f33385f.nextInt(2147483646) + 1;
    }

    /* renamed from: a */
    public final void mo19821a(int i) {
        bxvd a = lyu.m24685a();
        bxvd da = mqr.f34342c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mqr mqr = (mqr) da.f164949b;
        mqr.f34345b = i - 1;
        mqr.f34344a |= 1;
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        mqk mqk = (mqk) a.f164949b;
        mqr mqr2 = (mqr) da.mo74062i();
        mqk mqk2 = mqk.f34276G;
        mqr2.getClass();
        mqk.f34294k = mqr2;
        mqk.f34284a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        mo19833a(a, mqj.BACKUP_END, this.f33381a);
        this.f33388i = true;
    }

    /* renamed from: a */
    public final void mo19822a(int i, int i2) {
        mo19823a(i, i2, 0);
    }

    /* renamed from: a */
    public final void mo19823a(int i, int i2, int i3) {
        bxvd a = lyu.m24685a();
        bxvd da = mqt.f34347e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mqt mqt = (mqt) da.f164949b;
        mqt.f34350b = i - 1;
        int i4 = mqt.f34349a | 1;
        mqt.f34349a = i4;
        mqt.f34351c = i2 - 1;
        int i5 = i4 | 2;
        mqt.f34349a = i5;
        mqt.f34349a = i5 | 4;
        mqt.f34352d = i3;
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        mqk mqk = (mqk) a.f164949b;
        mqt mqt2 = (mqt) da.mo74062i();
        mqk mqk2 = mqk.f34276G;
        mqt2.getClass();
        mqk.f34295l = mqt2;
        mqk.f34284a |= 512;
        mo19833a(a, mqj.BACKUP_ERROR, this.f33381a);
        if (i2 == 4) {
            this.f33388i = true;
        }
    }

    /* renamed from: a */
    public final void mo19824a(int i, int i2, String str) {
        bxvd a = lyu.m24685a();
        bxvd da = msp.f34574e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        msp msp = (msp) da.f164949b;
        msp.f34577b = i - 1;
        int i3 = msp.f34576a | 1;
        msp.f34576a = i3;
        msp.f34579d = i2 - 1;
        int i4 = i3 | 4;
        msp.f34576a = i4;
        if (str != null) {
            str.getClass();
            msp.f34576a = i4 | 2;
            msp.f34578c = str;
        }
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        mqk mqk = (mqk) a.f164949b;
        msp msp2 = (msp) da.mo74062i();
        mqk mqk2 = mqk.f34276G;
        msp2.getClass();
        mqk.f34301r = msp2;
        mqk.f34284a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        mo19833a(a, mqj.RESTORE_ERROR, this.f33382b);
    }

    /* renamed from: a */
    public final void mo19825a(int i, long j) {
        if (ccls.m130540s()) {
            bxvd da = mrz.f34496i.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mrz mrz = (mrz) da.f164949b;
            mrz.f34499b = 6;
            int i2 = mrz.f34498a | 1;
            mrz.f34498a = i2;
            mrz.f34504g = i - 1;
            mrz.f34498a = i2 | 32;
            if (ccls.m130541t()) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                mrz mrz2 = (mrz) da.f164949b;
                mrz2.f34498a |= 64;
                mrz2.f34505h = j;
            }
            bxvd a = lyu.m24685a();
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            mqk mqk = (mqk) a.f164949b;
            mrz mrz3 = (mrz) da.mo74062i();
            mqk mqk2 = mqk.f34276G;
            mrz3.getClass();
            mqk.f34280C = mrz3;
            mqk.f34285b |= 64;
            this.f33383c = mo19820a();
            mo19833a(a, mqj.MMS_BACKUP, this.f33383c);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: mbx.a(int, java.lang.String, boolean, boolean):void
     arg types: [int, java.lang.String, int, int]
     candidates:
      mbx.a(int, msk, int, int):void
      mbx.a(int, java.lang.String, boolean, boolean):void */
    /* renamed from: a */
    public final void mo19826a(int i, String str) {
        mo19828a(i, str, false, false);
    }

    /* renamed from: a */
    public final void mo19827a(int i, String str, boolean z) {
        bxvd a = lyu.m24685a();
        bxvd da = msg.f34532e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        msg msg = (msg) da.f164949b;
        msg.f34535b = i - 1;
        int i2 = msg.f34534a | 1;
        msg.f34534a = i2;
        if (str != null) {
            str.getClass();
            i2 |= 2;
            msg.f34534a = i2;
            msg.f34536c = str;
        }
        if (z) {
            msg.f34534a = i2 | 4;
            msg.f34537d = true;
        }
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        mqk mqk = (mqk) a.f164949b;
        msg msg2 = (msg) da.mo74062i();
        mqk mqk2 = mqk.f34276G;
        msg2.getClass();
        mqk.f34298o = msg2;
        mqk.f34284a |= 4096;
        mo19833a(a, mqj.NEXT_RESTORE_PACKAGE, this.f33382b);
    }

    /* renamed from: a */
    public final void mo19828a(int i, String str, boolean z, boolean z2) {
        bxvd a = lyu.m24685a();
        bxvd da = mqw.f34359f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mqw mqw = (mqw) da.f164949b;
        mqw.f34362b = i - 1;
        int i2 = mqw.f34361a | 1;
        mqw.f34361a = i2;
        int i3 = i2 | 4;
        mqw.f34361a = i3;
        mqw.f34364d = z;
        if (str != null) {
            str.getClass();
            i3 |= 2;
            mqw.f34361a = i3;
            mqw.f34363c = str;
        }
        if (z2) {
            mqw.f34361a = i3 | 8;
            mqw.f34365e = true;
        }
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        mqk mqk = (mqk) a.f164949b;
        mqw mqw2 = (mqw) da.mo74062i();
        mqk mqk2 = mqk.f34276G;
        mqw2.getClass();
        mqk.f34293j = mqw2;
        mqk.f34284a |= 128;
        if (this.f33388i) {
            this.f33381a = mo19820a();
            this.f33388i = false;
        }
        mo19833a(a, mqj.BACKUP_START, this.f33381a);
    }

    /* renamed from: a */
    public final void mo19829a(int i, msk msk, int i2) {
        mo19830a(i, msk, i2, 0);
    }

    /* renamed from: a */
    public final void mo19830a(int i, msk msk, int i2, int i3) {
        mo19831a(i, msk, i2, i3, 0);
    }

    /* renamed from: a */
    public final void mo19831a(int i, msk msk, int i2, int i3, int i4) {
        bxvd a = lyu.m24685a();
        bxvd da = msl.f34558g.mo74144da();
        int i5 = 0;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        msl msl = (msl) da.f164949b;
        int i6 = i - 1;
        if (i != 0) {
            msl.f34562c = i6;
            int i7 = msl.f34560a | 2;
            msl.f34560a = i7;
            msl.f34561b = msk.f34557l;
            int i8 = i7 | 1;
            msl.f34560a = i8;
            msl.f34563d = i2 - 1;
            int i9 = i8 | 4;
            msl.f34560a = i9;
            int i10 = i9 | 8;
            msl.f34560a = i10;
            msl.f34564e = i3;
            msl.f34560a = i10 | 16;
            msl.f34565f = i4;
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            mqk mqk = (mqk) a.f164949b;
            msl msl2 = (msl) da.mo74062i();
            mqk mqk2 = mqk.f34276G;
            msl2.getClass();
            mqk.f34296m = msl2;
            mqk.f34284a |= 1024;
            if (m24820a(msk) && i2 == 4) {
                this.f33388i = true;
            }
            mqj mqj = mqj.REQUEST_ERROR;
            if (m24820a(msk)) {
                i5 = this.f33381a;
            } else if (msk == msk.RESTORE_REQUEST) {
                i5 = this.f33382b;
            } else if (msk != msk.GET_DEVICES_REQUEST) {
                f33380e.mo25418e("RequestErrorEvent logged with an unknown request type %s, can't set flow id.", msk);
            }
            mo19833a(a, mqj, i5);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo19832a(int i, boolean z, boolean z2) {
        bxvd a = lyu.m24685a();
        bxvd da = msn.f34567e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        msn msn = (msn) da.f164949b;
        msn.f34570b = i - 1;
        int i2 = msn.f34569a | 1;
        msn.f34569a = i2;
        int i3 = i2 | 2;
        msn.f34569a = i3;
        msn.f34571c = z;
        msn.f34569a = i3 | 4;
        msn.f34572d = z2;
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        mqk mqk = (mqk) a.f164949b;
        msn msn2 = (msn) da.mo74062i();
        mqk mqk2 = mqk.f34276G;
        msn2.getClass();
        mqk.f34299p = msn2;
        mqk.f34284a |= 8192;
        mo19833a(a, mqj.RESTORE_END, this.f33382b);
    }

    /* renamed from: a */
    public final void mo19833a(bxvd bxvd, mqj mqj, int i) {
        FileOutputStream fileOutputStream;
        if (!ccnf.f179489a.mo6606a().mo76431c()) {
            f33380e.mo25412b("Dropping transport Clearcut log event because logging is disabled by gservice.", new Object[0]);
            return;
        }
        int g = (int) ccnf.m130738g();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        mqk mqk = (mqk) bxvd.f164949b;
        mqk mqk2 = mqk.f34276G;
        mqk.f34284a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        mqk.f34304u = g;
        if (ccnf.f179489a.mo6606a().mo76426T()) {
            mbu mbu = this.f33387h;
            mqk mqk3 = (mqk) bxvd.mo74062i();
            mbu.f33377b.mkdirs();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            File a = mbu.mo19818a(elapsedRealtime, 0);
            int i2 = 0;
            while (a.exists()) {
                i2++;
                a = mbu.mo19818a(elapsedRealtime, i2);
            }
            try {
                mbu.f33376a.mo25409a("Dumping log to file %s", a.getName());
                fileOutputStream = new FileOutputStream(a);
                mqk3.mo73638a(fileOutputStream);
                fileOutputStream.close();
                return;
            } catch (IOException e) {
                mbu.f33376a.mo25415d("Failed to dump log", e, new Object[0]);
                return;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            qwo a2 = this.f33386g.mo24335a(((mqk) bxvd.mo74062i()).mo73642k());
            a2.mo24328b(mqj.f34275R);
            a2.mo24323a((long) i);
            a2.mo24327b();
            return;
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo19834a(mcf mcf) {
        m24819a(mcf, (String) null, this.f33381a);
        this.f33388i = true;
    }

    /* renamed from: a */
    public final void mo19835a(mcf mcf, String str) {
        m24819a(mcf, str, this.f33382b);
    }

    /* renamed from: a */
    public final void mo19836a(boolean z) {
        int i;
        if (ccls.m130540s()) {
            bxvd a = lyu.m24685a();
            bxvd da = mrz.f34496i.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mrz mrz = (mrz) da.f164949b;
            mrz.f34499b = 7;
            int i2 = mrz.f34498a | 1;
            mrz.f34498a = i2;
            if (!z) {
                i = 3;
            } else {
                i = 2;
            }
            mrz.f34503f = i - 1;
            mrz.f34498a = i2 | 16;
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            mqk mqk = (mqk) a.f164949b;
            mrz mrz2 = (mrz) da.mo74062i();
            mqk mqk2 = mqk.f34276G;
            mrz2.getClass();
            mqk.f34280C = mrz2;
            mqk.f34285b |= 64;
            mo19833a(a, mqj.MMS_BACKUP, this.f33383c);
        }
    }
}
