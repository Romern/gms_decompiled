package p000;

import android.content.Context;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;

/* renamed from: rxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rxf extends aney {

    /* renamed from: a */
    private final Context f43808a;

    public rxf(Context context) {
        super(context);
        this.f43808a = context;
    }

    /* renamed from: a */
    public final aucb mo25233a(String str) {
        aucb a;
        anfg a2 = anfg.m64152a(this.f43808a);
        try {
            new angx(str, this.f43808a.getPackageName()).mo41832a(this.f43808a, a2);
            a = aucu.m76778a((Object) null);
        } catch (anfx e) {
            int i = e.f76790a;
            if (i == 29512) {
                a = aucu.m76778a((Object) null);
            } else {
                throw new anfy(i, e.f76791b, e);
            }
        } catch (Throwable th) {
            a2.close();
            throw th;
        }
        a2.close();
        return a;
    }

    /* renamed from: b */
    public final aucb mo25238b(String str, String str2, String str3) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: n */
    public final aucb mo25239n(String str) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final aucb mo25234a(String str, int i, String[] strArr, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final aucb mo25235a(String str, int i, String[] strArr, int[] iArr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final aucb mo25236a(String str, String str2, String str3) {
        aucb a;
        anfg a2 = anfg.m64152a(this.f43808a);
        try {
            a = aucu.m76778a(new anhe(str, str2, str3, str, this.f43808a.getPackageName()).mo41834a(this.f43808a, a2));
        } catch (anfx e) {
            int i = e.f76790a;
            if (i == 29512) {
                a = aucu.m76778a(new Configurations("", "", new Configuration[0], false, null, 0));
            } else {
                throw new anfy(i, e.f76791b, e);
            }
        } catch (Throwable th) {
            a2.close();
            throw th;
        }
        a2.close();
        return a;
    }

    /* renamed from: a */
    public final aucb mo25237a(String str, String str2, Flag[] flagArr) {
        throw new UnsupportedOperationException();
    }
}
