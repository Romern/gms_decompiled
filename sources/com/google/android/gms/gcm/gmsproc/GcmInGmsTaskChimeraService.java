package com.google.android.gms.gcm.gmsproc;

import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmInGmsTaskChimeraService extends aeah {
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00de  */
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        char c;
        String str = aecc.f63128a;
        int hashCode = str.hashCode();
        if (hashCode != -1877394740) {
            if (hashCode != -1512919536) {
                if (hashCode == -1394514069 && str.equals("gms_registration")) {
                    c = 0;
                    if (c != 0) {
                        String o = cecz.m136067o();
                        String valueOf = String.valueOf(o);
                        Log.i("GCM-GMS", valueOf.length() == 0 ? new String("Registering GMS ") : "Registering GMS ".concat(valueOf));
                        try {
                            String a = addi.m50206a(this).mo33343a(o, "GCM");
                            Log.i("GCM-GMS", "Got GMS registration");
                            SharedPreferences b = aakw.m21417b(this);
                            String string = b.getString("regId", "");
                            SharedPreferences.Editor edit = b.edit();
                            edit.putString("regId", a);
                            edit.putString("sender", o);
                            edit.putInt("GCM_V", 201515033);
                            edit.putLong("reg_time", System.currentTimeMillis());
                            if (!edit.commit()) {
                                Log.w("GCM-GMS", "Failed to write GMS registration");
                            } else if (!a.equals(string)) {
                                Intent intent = new Intent("com.google.android.gms.gcm.REGISTERED");
                                intent.setPackage("com.google.android.gms");
                                sendBroadcast(intent);
                            }
                            return 0;
                        } catch (IOException e) {
                            String valueOf2 = String.valueOf(e);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                            sb.append("Failed to get registration: ");
                            sb.append(valueOf2);
                            Log.w("GCM-GMS", sb.toString());
                            return 1;
                        }
                    } else if (c == 1) {
                        return aaof.m21749a(this).mo17173b() ? 0 : 1;
                    } else {
                        if (c != 2) {
                            String valueOf3 = String.valueOf(str);
                            Log.e("GCM-GMS", valueOf3.length() == 0 ? new String("Unknown task tag: ") : "Unknown task tag: ".concat(valueOf3));
                            return 2;
                        }
                        aytw.m84814b();
                        if (ceck.m135995e()) {
                            if (Log.isLoggable("GCM-GMS", 4)) {
                                Log.i("GCM-GMS", "Registering GMS for direct boot.");
                            }
                            try {
                                String a2 = addi.m50206a(this).mo33343a(cecz.m136067o(), cecz.f182285a.mo6606a().mo78855w());
                                SharedPreferences.Editor edit2 = aaoe.m21748d(this).edit();
                                edit2.putString("gcm_local_directboot_token", a2);
                                if (Log.isLoggable("GCM-GMS", 4)) {
                                    Log.i("GCM-GMS", "Got GMS direct boot token.");
                                }
                                if (!edit2.commit()) {
                                    return 1;
                                }
                            } catch (IOException e2) {
                                if (Log.isLoggable("GCM-GMS", 5)) {
                                    String valueOf4 = String.valueOf(e2);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf4).length() + 33);
                                    sb2.append("Failed to get direct boot token: ");
                                    sb2.append(valueOf4);
                                    Log.w("GCM-GMS", sb2.toString());
                                }
                            }
                        }
                        return 0;
                    }
                }
            } else if (str.equals("direct_boot_registration")) {
                c = 2;
                if (c != 0) {
                }
            }
        } else if (str.equals("groups_upload")) {
            c = 1;
            if (c != 0) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
    }
}
