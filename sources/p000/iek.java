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
    public final String getSpatulaHeader(String packageName) {
        sdo.checkIfNull((Object) packageName, (Object) "Package name cannot be null!");
        this.f20796a.mo13127a(Binder.getCallingUid());
        String str2 = null;
        if (!gnv.m13498H()) {
            AppCertChimeraService.f10369a.mo25409a("DeviceKey is turned off", new Object[0]);
            return null;
        }
        iem iem = this.f20797b;
        sdo.checkIfNull((Object) packageName, (Object) "Package name cannot be null!");
        if (!gnv.m13498H()) {
            p000.iem.log.logVerbose("DeviceKey is turned off");
        } else {
            synchronized (iem.f20803e) {
                bzxb deviceKey = iem.f20802d.getDeviceKeyFromFile();
                if (deviceKey == null) {
                    iem.createAndWriteDeviceKey();
                    deviceKey = iem.f20802d.getDeviceKeyFromFile();
                }
                if (deviceKey != null && (deviceKey.f171718a & 8) != 0 && deviceKey.f171721d.mo73744a() != 0) {
                    try {
                        byte[] sha1sum = spn.getSHA1OfPackage(iem.packageInfo.context, packageName);
                        if (sha1sum == null) {
                            p000.iem.log.mo25418e("Unable to get package certificate hash.");
                            return null;
                        }
                        bxvd da = bklr.f124834d.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bklr bklr = (bklr) da.f164949b;
                        bklr.f124836a |= 1;
                        bklr.packageName = packageName;
                        String base64PackageHash = Base64.encodeToString(sha1sum, 2);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bklr bklr2 = (bklr) da.f164949b;
                        bklr2.f124836a |= 2;
                        bklr2.packageCertHash = base64PackageHash;
                        bxvd da2 = bkls.f124839g.mo74144da();
                        if (deviceKey != null) {
                            long j = deviceKey.f171720c;
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bkls bkls = (bkls) da2.f164949b;
                            int i = bkls.f124841a | 4;
                            bkls.f124841a = i;
                            bkls.f124844d = j;
                            long j2 = deviceKey.f171719b;
                            int i2 = i | 8;
                            bkls.f124841a = i2;
                            bkls.f124845e = j2;
                            ByteString bxtx = deviceKey.f171722e;
                            bkls.f124841a = i2 | 16;
                            bkls.f124846f = bxtx;
                            try {
                                String valueOf = String.valueOf(packageName);
                                String valueOf2 = String.valueOf(((bklr) da.f164949b).packageCertHash);
                                ByteString a2 = ByteString.m123261a(iem.getHMACSHA256ofString(deviceKey, valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2)));
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bkls bkls2 = (bkls) da2.f164949b;
                                bkls2.f124841a |= 2;
                                bkls2.f124843c = a2;
                            } catch (IOException | IllegalArgumentException e) {
                                Logger Logger = iem.log;
                                String valueOf3 = String.valueOf(e);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 40);
                                sb.append("Error while creating spatula signature: ");
                                sb.append(valueOf3);
                                Logger.mo25418e(sb.toString(), new Object[0]);
                            }
                        } else {
                            long a3 = spn.getAndroidId(iem.packageInfo.context);
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
                        bkls4.f124842b = bklr3;
                        bkls4.f124841a |= 1;
                        str2 = Base64.encodeToString(((bkls) da2.mo74062i()).serializeToBytes(), 2);

                        return str2;
                    } catch (PackageManager.NameNotFoundException e2) {
                        p000.iem.log.mo25417e("Invalid package name!", e2);
                        return null;
                    }
                } else {
                    p000.iem.log.mo25418e("Invalid device key.");
                    return null;
                }
            }
        }
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
            return this.f20797b.createAndWriteDeviceKey();
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
            String a2 = getSpatulaHeader(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(a2);
        }
        return true;
    }
}
