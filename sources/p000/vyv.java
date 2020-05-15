package p000;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: vyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vyv {

    /* renamed from: a */
    public final Context f50255a;

    /* renamed from: b */
    private final List f50256b = new ArrayList();

    /* renamed from: a */
    public static File m41612a(Context context) {
        return new File(m41616b(context), String.valueOf(UUID.randomUUID().toString()).concat(".apk"));
    }

    /* renamed from: b */
    public static File m41616b(Context context) {
        return context.getDir("dg_cache", 0);
    }

    public vyv(Context context) {
        this.f50255a = context;
    }

    /* renamed from: a */
    private final vyx m41613a() {
        String valueOf = String.valueOf(UUID.randomUUID().toString());
        return mo28980a(valueOf.length() == 0 ? new String("tmp_") : "tmp_".concat(valueOf));
    }

    /* renamed from: b */
    private final void m41617b() {
        List list = this.f50256b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            File file = (File) list.get(i);
            if (!vxl.m41539a(file)) {
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                sb.append("Failed to clean up temporary file ");
                sb.append(valueOf);
                sb.append(".");
                Log.e("DG", sb.toString());
            }
        }
        this.f50256b.clear();
    }

    /* renamed from: a */
    private static void m41614a(File file, File file2) {
        if (!file.renameTo(file2)) {
            String valueOf = String.valueOf(file);
            String valueOf2 = String.valueOf(file2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22 + String.valueOf(valueOf2).length());
            sb.append("Failed to rename ");
            sb.append(valueOf);
            sb.append(" -> ");
            sb.append(valueOf2);
            sb.append(".");
            throw new vxy(sb.toString());
        }
    }

    /* renamed from: a */
    public static final void m41615a(vyx vyx) {
        File file = vyx.f50260c;
        try {
            if (!file.exists()) {
                if (!file.createNewFile()) {
                    String valueOf = String.valueOf(vyx);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                    sb.append("Failed to touch last-used file for ");
                    sb.append(valueOf);
                    sb.append(".");
                    throw new vxy(sb.toString());
                }
            }
            if (!file.setLastModified(System.currentTimeMillis())) {
                String valueOf2 = String.valueOf(vyx);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 42);
                sb2.append("Failed to update last-used timestamp for ");
                sb2.append(valueOf2);
                sb2.append(".");
                throw new vxy(sb2.toString());
            }
        } catch (IOException e) {
            String valueOf3 = String.valueOf(vyx);
            String valueOf4 = String.valueOf(e);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 37 + String.valueOf(valueOf4).length());
            sb3.append("Failed to touch last-used file for ");
            sb3.append(valueOf3);
            sb3.append(": ");
            sb3.append(valueOf4);
            throw new vxy(sb3.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final vyx mo28980a(String str) {
        File file = new File(m41616b(this.f50255a), str);
        return new vyx(new File(file, "the.apk"), new File(file, "opt"), new File(file, "t"));
    }

    /* renamed from: a */
    public final vyx mo28981a(vyy vyy) {
        vyx a = mo28980a(vyy.f50261a);
        if (!a.mo28984b()) {
            return null;
        }
        m41615a(a);
        return a;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x0048=Splitter:B:22:0x0048, B:43:0x00c9=Splitter:B:43:0x00c9} */
    /* renamed from: a */
    public final void mo28982a(vyy vyy, vyx vyx) {
        File file;
        synchronized (this.f50256b) {
            try {
                vyx a = m41613a();
                this.f50256b.add(a.mo28983a());
                File a2 = a.mo28983a();
                if ((a2 == null || a2.exists() || a2.mkdirs()) && (file = a.f50259b) != null && a.f50260c != null && (file.exists() || a.f50259b.mkdirs())) {
                    try {
                        if (a.f50260c.exists() || a.f50260c.createNewFile()) {
                            m41614a(vyx.f50258a, a.f50258a);
                            vyx a3 = mo28980a(vyy.f50261a);
                            if (a3.mo28983a().exists()) {
                                vyx a4 = m41613a();
                                this.f50256b.add(a4.mo28983a());
                                m41614a(a3.mo28983a(), a4.mo28983a());
                            }
                            m41615a(a);
                            m41614a(a.mo28983a(), a3.mo28983a());
                            File b = m41616b(this.f50255a);
                            long currentTimeMillis = System.currentTimeMillis();
                            for (String str : b.list()) {
                                vyx a5 = mo28980a(str);
                                if (a5.mo28984b()) {
                                    File file2 = a5.f50260c;
                                    if (file2.exists()) {
                                        if (currentTimeMillis < file2.lastModified() + 1209600000) {
                                        }
                                    }
                                    vxl.m41539a(a5.mo28983a());
                                }
                            }
                            m41617b();
                        }
                    } catch (IOException e) {
                    }
                }
                String valueOf = String.valueOf(a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
                sb.append("Failed to make directores for ");
                sb.append(valueOf);
                sb.append(".");
                throw new vxy(sb.toString());
            } catch (Throwable th) {
                m41617b();
                throw th;
            }
        }
    }
}
