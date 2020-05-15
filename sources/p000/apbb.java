package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: apbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apbb implements Runnable {

    /* renamed from: a */
    private final apal f84083a;

    /* renamed from: b */
    private final SharedPreferences f84084b;

    /* renamed from: c */
    private final aozz f84085c;

    static {
        aoyh.m69805a("DeviceInfoLoggerTask");
    }

    public apbb(Context context, apal apal) {
        SharedPreferences a = aozj.m69902a(context);
        apba apba = new apba(context);
        this.f84083a = apal;
        this.f84084b = a;
        this.f84085c = apba;
    }

    public final void run() {
        try {
            aozz aozz = this.f84085c;
            apal apal = this.f84083a;
            bzdb bzdb = (bzdb) bzdh.f169466A.mo74144da();
            if (!cgij.m145558p() || !((apba) aozz).f83967b.mo47077a(apal.f84030a)) {
                if (bzdb.f164950c) {
                    bzdb.mo74035c();
                    bzdb.f164950c = false;
                }
                bzdh bzdh = (bzdh) bzdb.f164949b;
                bzdh.f169469a |= 4096;
                bzdh.f169480l = true;
            } else {
                bzdh a = apak.m69965a(((apba) aozz).f83966a);
                bxvd bxvd = (bxvd) a.mo74142c(5);
                bxvd.mo73625a((bxvk) a);
                bzdb = (bzdb) bxvd;
                if (bzdb.f164950c) {
                    bzdb.mo74035c();
                    bzdb.f164950c = false;
                }
                bzdh bzdh2 = (bzdh) bzdb.f164949b;
                int i = bzdh2.f169469a | 64;
                bzdh2.f169469a = i;
                bzdh2.f169475g = true;
                int i2 = i | 128;
                bzdh2.f169469a = i2;
                bzdh2.f169476h = false;
                bzdh2.f169469a = i2 | 4096;
                bzdh2.f169480l = false;
            }
            if (aozz.m69930a(((bzdh) bzdb.mo74062i()).mo73642k(), apal.f84030a, ((apba) aozz).f84082e)) {
                this.f84084b.edit().putLong("romanesco-contacts-logger-full-upload-timestamp", 0).apply();
            }
        } catch (Exception e) {
            aoyj.m69819a().mo46996a("DeviceLoggerTask.logData_failure");
        }
    }
}
