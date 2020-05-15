package p000;

import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.auth.appcert.p026be.AppCertChimeraService;
import java.io.IOException;

/* renamed from: iek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iek extends dck implements iel {

    /* renamed from: a */
    private final ilw f20796a;

    /* renamed from: b */
    private final iem f20797b;

    public iek() {
        super("com.google.android.gms.auth.appcert.IAppCertService");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    public final String mo12953a(String str) {
        sdo.m34966a((Object) str, (Object) "Package name cannot be null!");
        this.f20796a.mo13127a(Binder.getCallingUid());
        String str2 = null;
        if (!gnv.m13498H()) {
            AppCertChimeraService.f10369a.mo25409a("DeviceKey is turned off", new Object[0]);
            return null;
        }
        iem iem = this.f20797b;
        sdo.m34966a((Object) str, (Object) "Package name cannot be null!");
        if (!gnv.m13498H()) {
            iem.f20798a.mo25409a("DeviceKey is turned off", new Object[0]);
        } else {
            synchronized (iem.f20803e) {
                bzxb a = iem.f20802d.mo12957a();
                if (a == null) {
                    iem.mo12955a();
                    a = iem.f20802d.mo12957a();
                }
                if (a != null) {
                    if ((a.f171718a & 8) != 0) {
                        if (a.f171721d.mo73744a() != 0) {
                        }
                    }
                    iem.f20798a.mo25418e("Invalid device key.", new Object[0]);
                }
                try {
                    byte[] f = spn.m35888f(iem.f20801c.f21306a, str);
                    if (f == null) {
                        iem.f20798a.mo25418e("Unable to get package certificate hash.", new Object[0]);
                    } else {
                        bxvd da = bklr.f124834d.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bklr bklr = (bklr) da.f164949b;
                        str.getClass();
                        bklr.f124836a |= 1;
                        bklr.f124837b = str;
                        String encodeToString = Base64.encodeToString(f, 2);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bklr bklr2 = (bklr) da.f164949b;
                        encodeToString.getClass();
                        bklr2.f124836a |= 2;
                        bklr2.f124838c = encodeToString;
                        bxvd da2 = bkls.f124839g.mo74144da();
                        if (a != null) {
                            long j = a.f171720c;
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bkls bkls = (bkls) da2.f164949b;
                            int i = bkls.f124841a | 4;
                            bkls.f124841a = i;
                            bkls.f124844d = j;
                            long j2 = a.f171719b;
                            int i2 = i | 8;
                            bkls.f124841a = i2;
                            bkls.f124845e = j2;
                            bxtx bxtx = a.f171722e;
                            bxtx.getClass();
                            bkls.f124841a = i2 | 16;
                            bkls.f124846f = bxtx;
                            try {
                                String valueOf = String.valueOf(str);
                                String valueOf2 = String.valueOf(((bklr) da.f164949b).f124838c);
                                bxtx a2 = bxtx.m123261a(iem.mo12956a(a, valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2)));
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bkls bkls2 = (bkls) da2.f164949b;
                                a2.getClass();
                                bkls2.f124841a |= 2;
                                bkls2.f124843c = a2;
                            } catch (IOException | IllegalArgumentException e) {
                                sek sek = iem.f20798a;
                                String valueOf3 = String.valueOf(e);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 40);
                                sb.append("Error while creating spatula signature: ");
                                sb.append(valueOf3);
                                sek.mo25418e(sb.toString(), new Object[0]);
                            }
                        } else {
                            long a3 = spn.m35843a(iem.f20801c.f21306a);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bkls bkls3 = (bkls) da2.f164949b;
                            bkls3.f124841a |= 4;
                            bkls3.f124844d = a3;
                        }
                        bkls bkls4 = (bkls) da2.f164949b;
                        bklr bklr3 = (bklr) da.mo74062i();
                        bklr3.getClass();
                        bkls4.f124842b = bklr3;
                        bkls4.f124841a |= 1;
                        str2 = Base64.encodeToString(((bkls) da2.mo74062i()).mo73642k(), 2);
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    iem.f20798a.mo25417e("Invalid package name!", e2, new Object[0]);
                }
            }
        }
        return str2;
    }

    public iek(ilw ilw, iem iem) {
        super("com.google.android.gms.auth.appcert.IAppCertService");
        this.f20796a = ilw;
        this.f20797b = iem;
    }

    /* renamed from: a */
    public final boolean mo12954a() {
        this.f20796a.mo13127a(Binder.getCallingUid());
        if (gnv.m13498H()) {
            return this.f20797b.mo12955a();
        }
        AppCertChimeraService.f10369a.mo25409a("DeviceKey is turned off", new Object[0]);
        return false;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            boolean a = mo12954a();
            parcel2.writeNoException();
            dcl.m8166a(parcel2, a);
        } else if (i != 2) {
            return false;
        } else {
            String a2 = mo12953a(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(a2);
        }
        return true;
    }
}
