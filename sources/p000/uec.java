package p000;

import android.content.Context;
import com.google.android.gms.drive.internal.FileUploadPreferencesImpl;
import com.google.android.gms.drive.internal.SetFileUploadPreferencesRequest;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: uec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uec extends ucg {

    /* renamed from: f */
    private final SetFileUploadPreferencesRequest f47338f;

    public uec(ubk ubk, SetFileUploadPreferencesRequest setFileUploadPreferencesRequest, uto uto) {
        super("SetFileUploadPreferencesOperation", ubk, uto, 19);
        this.f47338f = setFileUploadPreferencesRequest;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: b */
    public final void mo27230b(Context context) {
        boolean z;
        aaal.m21020a(this.f47338f, "Invalid request: unable to update preferences.");
        aaal.m21020a(this.f47338f.f30918a, "Invalid request: unable to update preferences.");
        vcy vcy = this.f47239c;
        FileUploadPreferencesImpl fileUploadPreferencesImpl = this.f47338f.f30918a;
        vdk vdk = (vdk) vcy;
        vdk.mo28330k();
        if ((((bkzo) vdk.f49080e.f164949b).f125643a & 1024) != 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(!z, (Object) "Can't call setPreferenceChange() twice");
        bxvd da = bkzd.f125557e.mo74144da();
        int b = fileUploadPreferencesImpl.mo18193b();
        if (b == 256) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkzd bkzd = (bkzd) da.f164949b;
            bkzd.f125561c = 1;
            bkzd.f125559a |= 2;
        } else if (b != 257) {
            vdk.f49076a.mo25374b("ImpressionLogEvent", "Unknown battery usage preference (%d) in %s", Integer.valueOf(fileUploadPreferencesImpl.mo18193b()), vdk.f49078c);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkzd bkzd2 = (bkzd) da.f164949b;
            bkzd2.f125561c = 0;
            bkzd2.f125559a |= 2;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkzd bkzd3 = (bkzd) da.f164949b;
            bkzd3.f125561c = 2;
            bkzd3.f125559a |= 2;
        }
        int a = fileUploadPreferencesImpl.mo18192a();
        if (a == 1) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkzd bkzd4 = (bkzd) da.f164949b;
            bkzd4.f125560b = 1;
            bkzd4.f125559a = 1 | bkzd4.f125559a;
        } else if (a != 2) {
            vdk.f49076a.mo25374b("ImpressionLogEvent", "Unknown data connection preference (%d) in %s", Integer.valueOf(fileUploadPreferencesImpl.mo18192a()), vdk.f49078c);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkzd bkzd5 = (bkzd) da.f164949b;
            bkzd5.f125560b = 0;
            bkzd5.f125559a = 1 | bkzd5.f125559a;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bkzd bkzd6 = (bkzd) da.f164949b;
            bkzd6.f125560b = 2;
            bkzd6.f125559a = 1 | bkzd6.f125559a;
        }
        bxvd bxvd = vdk.f49080e;
        boolean z2 = fileUploadPreferencesImpl.f30850c;
        bkzd bkzd7 = (bkzd) da.f164949b;
        bkzd7.f125559a |= 4;
        bkzd7.f125562d = z2;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzo bkzo = (bkzo) bxvd.f164949b;
        bkzd bkzd8 = (bkzd) da.mo74062i();
        bkzo bkzo2 = bkzo.f125631K;
        bkzd8.getClass();
        bkzo.f125655m = bkzd8;
        bkzo.f125643a |= 1024;
        ubk ubk = this.f47237a;
        FileUploadPreferencesImpl fileUploadPreferencesImpl2 = this.f47338f.f30918a;
        int a2 = fileUploadPreferencesImpl2.mo18192a();
        boolean z3 = fileUploadPreferencesImpl2.f30850c;
        int b2 = fileUploadPreferencesImpl2.mo18193b();
        txi txi = new txi();
        txi.f46910b = a2;
        txi.f46911c = z3;
        txi.f46912d = b2;
        txg a3 = txi.mo26871a();
        uce uce = ubk.f47142c.f49744C;
        uey uey = ubk.f47143d;
        ucf ucf = (ucf) uce;
        ucf.f47235b.mo27435d();
        try {
            uin b3 = ((ucf) uce).f47235b.mo27419b(uey);
            sdo.checkIfNull(b3, "Authorized app doesn't exist");
            int i = ((txh) a3).f46906a;
            int i2 = ((txh) a3).f46908c;
            if (i != 0) {
                b3.f47710c = i;
            }
            if (i2 != 0) {
                b3.f47711d = i2;
            }
            b3.f47712e = ((txh) a3).f46907b;
            b3.mo27725t();
            ((ucf) uce).f47235b.mo27442f();
            ucf.f47235b.mo27439e();
            ArrayList arrayList = new ArrayList();
            synchronized (ucf.f47236c) {
                Set set = (Set) ((ucf) uce).f47236c.get(uey);
                if (set != null) {
                    arrayList.addAll(set);
                }
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((vel) arrayList.get(i3)).mo28354a(a3);
            }
            ubk.f47146g.mo27001b();
            this.f47238b.mo27971a();
        } catch (Throwable th) {
            ucf.f47235b.mo27439e();
            throw th;
        }
    }
}
