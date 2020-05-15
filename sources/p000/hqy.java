package p000;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: hqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hqy implements bqfp {

    /* renamed from: a */
    final /* synthetic */ String f20262a;

    /* renamed from: b */
    final /* synthetic */ long f20263b;

    /* renamed from: c */
    final /* synthetic */ hqz f20264c;

    public hqy(hqz hqz, String str, long j) {
        this.f20264c = hqz;
        this.f20262a = str;
        this.f20263b = j;
    }

    /* renamed from: a */
    private final void m14763a(Status status) {
        his his = this.f20264c.f20266b;
        bxvd da = bodi.f132694f.mo74144da();
        String str = this.f20262a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bodi bodi = (bodi) da.f164949b;
        str.getClass();
        int i = bodi.f132696a | 1;
        bodi.f132696a = i;
        bodi.f132697b = str;
        String str2 = this.f20264c.f20265a;
        str2.getClass();
        int i2 = i | 16;
        bodi.f132696a = i2;
        bodi.f132700e = str2;
        int i3 = status.f30115i;
        bodi.f132696a = i2 | 4;
        bodi.f132698c = i3;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f20263b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bodi bodi2 = (bodi) da.f164949b;
        bodi2.f132696a |= 8;
        bodi2.f132699d = elapsedRealtime;
        bodi bodi3 = (bodi) da.mo74062i();
        bxvd da2 = boct.f132600I.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        boct boct = (boct) da2.f164949b;
        boct.f132612c = 9;
        int i4 = boct.f132610a | 1;
        boct.f132610a = i4;
        bodi3.getClass();
        boct.f132620k = bodi3;
        boct.f132610a = i4 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        his.mo12509a((boct) da2.mo74062i());
    }

    /* renamed from: a */
    public final void mo6480a(Object obj) {
        m14763a(Status.f30107a);
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        m14763a(adbe.m50109a(th).mo33302b());
    }
}
