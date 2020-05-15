package p000;

import android.content.Context;
import com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService;
import java.util.Arrays;

/* renamed from: anhw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anhw {

    /* renamed from: a */
    public final String f76907a;

    /* renamed from: b */
    public final String f76908b;

    /* renamed from: c */
    public final braj f76909c;

    /* renamed from: d */
    anhx f76910d = null;

    /* renamed from: e */
    cahw f76911e = null;

    public anhw(String str, int i, String[] strArr, byte[] bArr, String str2, String str3, String str4) {
        this.f76907a = str2;
        this.f76908b = str3;
        braf braf = (braf) braj.f142139l.mo74144da();
        if (braf.f164950c) {
            braf.mo74035c();
            braf.f164950c = false;
        }
        braj braj = (braj) braf.f164949b;
        int i2 = braj.f142141a | 2;
        braj.f142141a = i2;
        braj.f142145e = i;
        braj.f142150j = 1;
        int i3 = i2 | 64;
        braj.f142141a = i3;
        if (str != null) {
            str.getClass();
            braj.f142141a = 1 | i3;
            braj.f142144d = str;
        }
        if (str4 != null) {
            str4.getClass();
            braj.f142142b = 7;
            braj.f142143c = str4;
        }
        if (strArr != null && strArr.length > 0) {
            braf.mo69472a(Arrays.asList(strArr));
        }
        if (bArr != null && bArr.length > 0) {
            bxtx a = bxtx.m123261a(bArr);
            if (braf.f164950c) {
                braf.mo74035c();
                braf.f164950c = false;
            }
            braj braj2 = (braj) braf.f164949b;
            a.getClass();
            braj2.f142141a |= 4;
            braj2.f142148h = a;
        }
        this.f76909c = (braj) braf.mo74062i();
    }

    /* renamed from: a */
    public final void mo41838a(Context context) {
        String str = this.f76907a;
        if (str == null) {
            throw new anfy(29500, "No user");
        } else if (!str.equals("") && !angd.m64196a(this.f76907a, context)) {
            throw new anfy(29500, "User not on device");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aniu.a(int, java.lang.String, java.lang.String[], java.lang.String[], boolean, cahw):void
     arg types: [int, java.lang.String, java.lang.String[], java.lang.String[], int, cahw]
     candidates:
      aniu.a(java.lang.String, long, long, java.lang.String, bqzi, android.database.sqlite.SQLiteStatement):void
      aniu.a(int, java.lang.String, java.lang.String[], java.lang.String[], boolean, cahw):void */
    /* renamed from: a */
    public final void mo41839a(Context context, boolean z) {
        if (anhs.m64428a(this.f76909c.f142144d, this.f76910d.f76914c)) {
            this.f76911e = (cahw) cahz.f174610h.mo74144da();
            aniu b = HeterodyneSyncTaskChimeraService.m68254b(context);
            if (z) {
                b.f76970d = null;
                b.f76971e = null;
                b.f76972f = true;
            }
            int i = this.f76910d.f76914c;
            String str = this.f76909c.f142144d;
            String str2 = this.f76907a;
            cahw cahw = this.f76911e;
            String[] a = b.mo25227a();
            if ("".equals(str2)) {
                b.mo41855a(i, str, new String[0], a, true, cahw);
                return;
            }
            b.mo41855a(i, str, new String[]{str2}, a, false, cahw);
        }
    }
}
