package p000;

import android.content.SharedPreferences;
import android.util.Log;
import android.util.LruCache;
import java.io.Closeable;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: rdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rdd implements Closeable {

    /* renamed from: a */
    final Set f42696a = new C1225nr();

    /* renamed from: b */
    boolean f42697b = false;

    /* renamed from: c */
    final Map f42698c = new C1223np();

    /* renamed from: d */
    final /* synthetic */ rde f42699d;

    public rdd(rde rde) {
        this.f42699d = rde;
    }

    /* renamed from: a */
    private final void m33353a() {
        SharedPreferences sharedPreferences = this.f42699d.f42706d.getSharedPreferences("LogDropPref", 0);
        synchronized (this.f42699d.f42705c) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            int i = 0;
            for (Map.Entry entry : this.f42698c.entrySet()) {
                i += ((Integer) entry.getValue()).intValue();
                edit.putInt((String) entry.getKey(), sharedPreferences.getInt((String) entry.getKey(), 0) + ((Integer) entry.getValue()).intValue());
            }
            if (!edit.commit()) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Failed to record ");
                sb.append(i);
                sb.append(" dropped logs");
                Log.e("FlatFileLogStore", sb.toString());
            }
        }
        this.f42698c.clear();
    }

    public final void close() {
        int i;
        if (!this.f42697b) {
            this.f42697b = true;
            if (!this.f42698c.isEmpty()) {
                m33353a();
            }
            for (File file : this.f42696a) {
                if (file.isDirectory()) {
                    String name = file.getParentFile().getName();
                    rcz a = rcz.m33351a(file);
                    String[] strArr = a.f42688b;
                    if (strArr == null || strArr.length <= 1) {
                        Iterator it = a.iterator();
                        while (it.hasNext()) {
                            File a2 = ((rcy) it).next();
                            long length = a2.length();
                            boolean equals = a2.getName().equals("play_logger_context.pb");
                            if (!equals) {
                                i = rde.m33368c(a2);
                            } else {
                                i = 0;
                            }
                            if (!a2.delete()) {
                                Log.e("FlatFileLogStore", String.valueOf(a2.getAbsolutePath()).concat(" could not be deleted."));
                            } else if (!equals) {
                                this.f42699d.mo24483a(name, -length);
                                this.f42699d.m33369c(name, -1);
                                this.f42699d.mo24484a(name, rcv.DIR_HAS_NO_PLC_FILE, i);
                            }
                        }
                        if (!file.delete()) {
                            Log.e("FlatFileLogStore", String.valueOf(file.getAbsolutePath()).concat(" could not be deleted."));
                        } else {
                            this.f42699d.mo24492b(name, -1);
                            try {
                                int parseInt = Integer.parseInt(file.getName());
                                LruCache lruCache = this.f42699d.f42708f;
                                Integer valueOf = Integer.valueOf(parseInt);
                                lruCache.remove(valueOf);
                                this.f42699d.f42709g.remove(valueOf);
                            } catch (NumberFormatException e) {
                                String valueOf2 = String.valueOf(file.getName());
                                Log.e("FlatFileLogStore", valueOf2.length() == 0 ? new String("Failed to parse to int ") : "Failed to parse to int ".concat(valueOf2));
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo24477a(File file) {
        if (!this.f42697b) {
            long length = file.length();
            boolean delete = file.delete();
            String name = file.getParentFile().getParentFile().getName();
            if (!delete) {
                Log.e("FlatFileLogStore", String.valueOf(file.getAbsolutePath()).concat(" could not be deleted."));
                return;
            }
            this.f42699d.mo24483a(name, -length);
            this.f42699d.m33369c(name, -1);
            this.f42696a.add(file.getParentFile());
            return;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo24478a(File file, String str, rdm rdm, int i) {
        if (!this.f42697b) {
            long length = file.length();
            boolean delete = file.delete();
            if (!delete) {
                Log.e("FlatFileLogStore", String.valueOf(file.getAbsolutePath()).concat(" could not be deleted."));
            } else {
                this.f42699d.mo24483a(str, -length);
                this.f42699d.m33369c(str, -1);
                rai.m33154a(str, rdm.mo24467a(), i);
                String valueOf = String.valueOf(rdm);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(valueOf).length());
                sb.append(str);
                sb.append(",");
                sb.append(valueOf);
                String sb2 = sb.toString();
                Integer num = (Integer) this.f42698c.get(sb2);
                if (num == null) {
                    this.f42698c.put(sb2, Integer.valueOf(i));
                } else {
                    this.f42698c.put(sb2, Integer.valueOf(num.intValue() + i));
                }
                if (((C1245ok) this.f42698c).f26809h > 100) {
                    m33353a();
                }
                this.f42696a.add(file.getParentFile());
            }
            return delete;
        }
        throw new IllegalStateException();
    }
}
