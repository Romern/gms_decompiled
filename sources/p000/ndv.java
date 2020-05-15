package p000;

import android.content.Context;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* renamed from: ndv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ndv extends ndr {

    /* renamed from: b */
    public final long f35367b;

    /* renamed from: c */
    public final String f35368c = UUID.randomUUID().toString();

    /* renamed from: d */
    public final Set f35369d;

    /* renamed from: e */
    public bxvd f35370e = null;

    /* renamed from: a */
    public final ndu mo20502a(String str, boolean z) {
        return new ndu(this, str, this.f35358a, z);
    }

    public ndv(long j, int i) {
        super(i);
        this.f35367b = j;
        this.f35369d = new HashSet();
    }

    /* renamed from: a */
    public final void mo20503a(Context context, int i) {
        bxvd bxvd = this.f35370e;
        if (bxvd != null) {
            mo20495a(context, bxvd, mqj.COMMON_RESTORE);
            this.f35369d.remove(this.f35370e);
        }
        bxvd a = lyu.m24685a();
        this.f35370e = a;
        String str = this.f35368c;
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        mqk mqk = (mqk) a.f164949b;
        mqk mqk2 = mqk.f34276G;
        str.getClass();
        mqk.f34284a |= 1;
        mqk.f34286c = str;
        bxvd bxvd2 = this.f35370e;
        bxvd da = mra.f34378e.mo74144da();
        long j = this.f35367b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mra mra = (mra) da.f164949b;
        int i2 = mra.f34380a | 2;
        mra.f34380a = i2;
        mra.f34382c = j;
        mra.f34380a = i2 | 1;
        mra.f34381b = i;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        mqk mqk3 = (mqk) bxvd2.f164949b;
        mra mra2 = (mra) da.mo74062i();
        mra2.getClass();
        mqk3.f34289f = mra2;
        mqk3.f34284a |= 8;
        this.f35369d.add(this.f35370e);
    }

    /* renamed from: a */
    public final void mo20504a(String str) {
        if (ccmk.m130673e() && this.f35370e == null) {
            Log.e("BackupRestoreLogManager", "recordActualRestoredPackage() called before any restore responsereceived");
            return;
        }
        bxvd da = mqz.f34374c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mqz mqz = (mqz) da.f164949b;
        str.getClass();
        mqz.f34376a |= 1;
        mqz.f34377b = str;
        mqz mqz2 = (mqz) da.mo74062i();
        bxvd bxvd = this.f35370e;
        mra mra = ((mqk) bxvd.f164949b).f34289f;
        if (mra == null) {
            mra = mra.f34378e;
        }
        bxvd bxvd2 = (bxvd) mra.mo74142c(5);
        bxvd2.mo73625a((bxvk) mra);
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        mra mra2 = (mra) bxvd2.f164949b;
        mqz2.getClass();
        if (!mra2.f34383d.mo73666a()) {
            mra2.f34383d = bxvk.m124021a(mra2.f34383d);
        }
        mra2.f34383d.add(mqz2);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        mqk mqk = (mqk) bxvd.f164949b;
        mra mra3 = (mra) bxvd2.mo74062i();
        mqk mqk2 = mqk.f34276G;
        mra3.getClass();
        mqk.f34289f = mra3;
        mqk.f34284a |= 8;
    }
}
