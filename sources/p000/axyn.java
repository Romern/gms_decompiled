package p000;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: axyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axyn implements axyk {

    /* renamed from: a */
    public final String f96782a;

    /* renamed from: b */
    private final HashMap f96783b = new HashMap();

    public axyn(String str) {
        this.f96782a = str;
    }

    /* renamed from: a */
    static File m83572a(String str, String str2) {
        File file = new File(new File(str, "incomingmessages"), str2);
        if (!file.mkdirs() && Log.isLoggable("wearable", 3)) {
            Log.d("wearable", String.format("%s already existed", file));
        }
        return new File(file, String.valueOf(str2).concat(".tmp"));
    }

    /* renamed from: a */
    private final void m83573a(String str) {
        axym axym = (axym) this.f96783b.get(str);
        if (axym != null) {
            axym.mo53769a();
        }
    }

    /* renamed from: a */
    public final axzx mo53767a(ayev ayev) {
        if ((ayev.f97378a & 1024) != 0) {
            synchronized (this.f96783b) {
                HashMap hashMap = this.f96783b;
                ayet ayet = ayev.f97389l;
                if (ayet == null) {
                    ayet = ayet.f97366f;
                }
                axym axym = (axym) hashMap.get(ayet.f97369b);
                ayet ayet2 = ayev.f97389l;
                if (ayet2 == null) {
                    ayet2 = ayet.f97366f;
                }
                try {
                    if (axym.f96779c == null) {
                        axym.f96779c = m83572a(axym.f96781e.f96782a, ayet2.f97369b);
                        axym.f96780d = new FileOutputStream(axym.f96779c);
                    }
                    axym.f96778b.update(ayet2.f97371d.mo73780k());
                    ayet2.f97371d.mo73757a(axym.f96780d);
                    if (!ayet2.f97370c) {
                        axzx axzx = new axzx(axym.f96777a, null, false);
                        return axzx;
                    }
                    axym.mo53769a();
                    String b = axxv.m83503b(axym.f96778b.digest());
                    ayet ayet3 = ayev.f97389l;
                    if (ayet3 == null) {
                        ayet3 = ayet.f97366f;
                    }
                    if (!b.equals(ayet3.f97372e)) {
                        ayet ayet4 = ayev.f97389l;
                        if (ayet4 == null) {
                            ayet4 = ayet.f97366f;
                        }
                        String str = ayet4.f97372e;
                        StringBuilder sb = new StringBuilder(b.length() + 75 + String.valueOf(str).length());
                        sb.append("Received file digest did not match original digest; received: ");
                        sb.append(b);
                        sb.append(" ; original: ");
                        sb.append(str);
                        Log.e("wearable", sb.toString());
                    }
                    HashMap hashMap2 = this.f96783b;
                    ayet ayet5 = ayev.f97389l;
                    if (ayet5 == null) {
                        ayet5 = ayet.f97366f;
                    }
                    hashMap2.remove(ayet5.f97369b);
                    axzx axzx2 = new axzx(axym.f96777a, new axyt(b, axym.f96779c));
                    return axzx2;
                } catch (IOException e) {
                    Log.w("wearable", "IncomingMessageBuffer: IOException encountered when writing file.", e);
                    axym.mo53769a();
                }
            }
        } else if (!ayev.f97390m) {
            return new axzx(ayev, null);
        } else {
            String a = axxv.m83495a(ayev.mo73642k());
            synchronized (this.f96783b) {
                m83573a(a);
                this.f96783b.put(a, new axym(this, ayev));
            }
            if (Log.isLoggable("wearable", 3)) {
                String valueOf = String.valueOf(ayev);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb2.append("Buffering message: ");
                sb2.append(valueOf);
                Log.d("wearable", sb2.toString());
            }
            return new axzx(ayev, null, false);
        }
    }

    /* renamed from: a */
    public final void mo53768a() {
        synchronized (this.f96783b) {
            for (String str : this.f96783b.keySet()) {
                m83573a(str);
            }
        }
    }
}
