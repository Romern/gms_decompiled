package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.common.api.Status;

/* renamed from: anhq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anhq extends angu {

    /* renamed from: a */
    private final angj f76894a;

    /* renamed from: b */
    private final anhr f76895b;

    public anhq(angj angj, braj[] brajArr) {
        super("BulkRegisterOperationCall", caif.BULK_REGISTER);
        sdo.m34959a(angj);
        this.f76894a = angj;
        this.f76895b = new anhr(brajArr);
    }

    /* renamed from: a */
    private final void m64421a(Context context, anhx[] anhxArr) {
        String str = null;
        int i = 1;
        boolean z = true;
        for (anhx anhx : anhxArr) {
            if (anhx != null) {
                int i2 = anhx.f76914c;
                if (i2 - 1 > i - 1 && anhs.m64428a(anhx.f76912a, i2)) {
                    i = anhx.f76914c;
                    str = anhx.f76912a;
                }
            } else {
                z = false;
            }
        }
        if (i != 1) {
            anij.m64478a(context, i, str);
        }
        if (z) {
            this.f76894a.mo41783a(Status.f30107a);
            return;
        }
        throw new anfy(29507);
    }

    /* renamed from: b */
    public final void mo41827b(Context context) {
        anhr anhr = this.f76895b;
        anhr.mo41837a();
        braj[] brajArr = anhr.f76896a;
        anhx[] anhxArr = new anhx[brajArr.length];
        boolean z = false;
        for (int i = 0; i < brajArr.length; i++) {
            try {
                anhx b = anhy.m64447b(context, brajArr[i], null);
                anhxArr[i] = b;
                boolean z2 = true;
                if (!b.f76913b && !brajArr[i].f142149i) {
                    z2 = false;
                }
                z |= z2;
            } catch (anfy e) {
            }
        }
        if (z) {
            anhj.m64401a();
        }
        anhr.f76897b = anhxArr;
        m64421a(context, anhr.f76897b);
    }

    /* renamed from: a */
    public final cahp mo41825a() {
        int i;
        anhx[] anhxArr = this.f76895b.f76897b;
        String str = null;
        if (anhxArr != null) {
            i = 1;
            for (anhx anhx : anhxArr) {
                if (anhx != null) {
                    int i2 = anhx.f76914c;
                    if (i2 - 1 > i - 1) {
                        str = anhx.f76912a;
                        i = i2;
                    }
                }
            }
        } else {
            i = 1;
        }
        caho caho = (caho) cahp.f174572m.mo74144da();
        if (str != null) {
            if (caho.f164950c) {
                caho.mo74035c();
                caho.f164950c = false;
            }
            cahp cahp = (cahp) caho.f164949b;
            str.getClass();
            cahp.f174574a = 1 | cahp.f174574a;
            cahp.f174575b = str;
        }
        int i3 = i - 1;
        if (caho.f164950c) {
            caho.mo74035c();
            caho.f164950c = false;
        }
        cahp cahp2 = (cahp) caho.f164949b;
        cahp2.f174574a |= 64;
        cahp2.f174583j = i3;
        return (cahp) caho.mo74062i();
    }

    /* renamed from: b */
    public final void mo41828b(Context context, anfw anfw) {
        anhr anhr = this.f76895b;
        anhr.mo41837a();
        braj[] brajArr = anhr.f76896a;
        anhx[] anhxArr = new anhx[brajArr.length];
        SQLiteDatabase writableDatabase = anfw.getWritableDatabase();
        writableDatabase.beginTransaction();
        int i = 0;
        boolean z = false;
        while (i < brajArr.length) {
            try {
                try {
                    anhx a = anhy.m64441a(context, writableDatabase, brajArr[i], (String) null);
                    anhxArr[i] = a;
                    boolean z2 = true;
                    if (!a.f76913b && !brajArr[i].f142149i) {
                        z2 = false;
                    }
                    z |= z2;
                } catch (anfy e) {
                }
                i++;
            } finally {
                writableDatabase.endTransaction();
            }
        }
        writableDatabase.setTransactionSuccessful();
        if (z) {
            anhj.m64401a();
        }
        anhr.f76897b = anhxArr;
        m64421a(context, anhr.f76897b);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f76894a.mo41783a(status);
    }

    /* renamed from: b */
    public final cahp[] mo41829b() {
        braj[] brajArr = this.f76895b.f76896a;
        if (brajArr == null) {
            return null;
        }
        int length = brajArr.length;
        cahp[] cahpArr = new cahp[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            braj braj = brajArr[i];
            if (braj == null) {
                return null;
            }
            int i3 = i2 + 1;
            caho caho = (caho) cahp.f174572m.mo74144da();
            String str = braj.f142144d;
            if (caho.f164950c) {
                caho.mo74035c();
                caho.f164950c = false;
            }
            cahp cahp = (cahp) caho.f164949b;
            str.getClass();
            int i4 = cahp.f174574a | 1;
            cahp.f174574a = i4;
            cahp.f174575b = str;
            int i5 = braj.f142145e;
            cahp.f174574a = i4 | 2;
            cahp.f174576c = i5;
            caho.mo74646a(braj.f142146f);
            caho.mo74647b(braj.f142147g);
            cahpArr[i2] = (cahp) caho.mo74062i();
            i++;
            i2 = i3;
        }
        return cahpArr;
    }
}
