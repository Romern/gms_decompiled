package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.util.HashSet;

/* renamed from: zti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zti implements zqz {

    /* renamed from: a */
    private final ztl f55881a;

    public zti(ztl ztl) {
        this.f55881a = ztl;
    }

    /* renamed from: a */
    public final bngx mo31340a() {
        Throwable th;
        String str = "name";
        ztk b = this.f55881a.mo31503b();
        try {
            b.mo31497a();
            srn srn = ztl.f55885a;
            zsu a = b.mo31492a("BleDevices", new String[]{"_id", "address", str, "type", "device_name", "model_number", "manufacturer", "hardware_revision", "firmware_revision", "software_revision"}, (String) null, (String[]) null);
            try {
                bnge s = bnge.m109299s();
                while (a.mo31476c()) {
                    String f = a.mo31481f("address");
                    String e = a.mo31480e("type");
                    if (e != null) {
                        s.mo67268a(f, e);
                    }
                }
                a.f55836a.moveToPosition(-1);
                HashSet hashSet = new HashSet();
                bngs j = bngx.m109377j();
                while (a.mo31476c()) {
                    String f2 = a.mo31481f("address");
                    if (!hashSet.contains(f2)) {
                        hashSet.add(f2);
                        j.mo67668c(new yqq(yya.m44975a(f2, bmxx.m108578b(a.mo31480e(str)), s.mo67361a(f2), yqn.m44587a(s.mo67361a(f2))), a.mo31480e("device_name"), a.mo31480e("model_number"), a.mo31480e("manufacturer"), a.mo31480e("hardware_revision"), a.mo31480e("firmware_revision"), a.mo31480e("software_revision")));
                        hashSet = hashSet;
                        str = str;
                    }
                }
                b.mo31498b();
                bngx a2 = j.mo67664a();
                if (a != null) {
                    a.close();
                }
                b.close();
                return a2;
            } catch (SQLiteException e2) {
                throw new IOException(e2);
            } catch (Throwable th2) {
                th = th2;
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            Throwable th4 = th3;
            try {
                b.close();
            } catch (Throwable th5) {
                bqye.m113761a(th4, th5);
            }
            throw th4;
        }
    }

    /* renamed from: b */
    public final void mo31343b(String str) {
        ztk b = this.f55881a.mo31503b();
        try {
            b.mo31497a();
            b.mo31489a("BleDevices", String.format("%s = ?", "address"), new String[]{str});
            b.mo31498b();
            b.close();
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo31341a(yqq yqq) {
        ztk b;
        try {
            b = this.f55881a.mo31503b();
            b.mo31497a();
            ContentValues contentValues = new ContentValues();
            cacv cacv = yqq.f54423a;
            for (String str : cacv.f172633d) {
                contentValues.clear();
                contentValues.put("address", cacv.f172631b);
                contentValues.put("name", cacv.f172632c);
                contentValues.put("type", str);
                contentValues.put("device_name", yqq.f54424b);
                contentValues.put("model_number", yqq.f54425c);
                contentValues.put("manufacturer", yqq.f54426d);
                contentValues.put("hardware_revision", yqq.f54427e);
                contentValues.put("firmware_revision", yqq.f54428f);
                contentValues.put("software_revision", yqq.f54429g);
                b.mo31490a("BleDevices", contentValues);
            }
            b.mo31498b();
            b.close();
            return;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final boolean mo31342a(String str) {
        zsu a;
        ztk b = this.f55881a.mo31503b();
        try {
            b.mo31497a();
            a = b.mo31492a("BleDevices", new String[]{"address"}, String.format("%s = ?", "address"), new String[]{str});
            boolean b2 = a.mo31474b();
            b.mo31498b();
            if (a != null) {
                a.close();
            }
            b.close();
            return b2;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
            throw th;
        }
        throw th;
    }
}
