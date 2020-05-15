package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Matcher;

/* renamed from: asgh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asgh extends asen {
    /* renamed from: a */
    public final int mo49089a() {
        return (int) cgut.f187785a.mo6606a().mo84516b();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d9 A[Catch:{ IOException -> 0x0114, all -> 0x0110, all -> 0x0124 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e5 A[SYNTHETIC] */
    /* renamed from: b */
    public final calx mo49102b(Context context, InputStream inputStream, long j, long j2, qxq qxq) {
        boolean z;
        asgi asgi = new asgi(new asgj());
        calu calu = (calu) calx.f175201v.mo74144da();
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.metrics", 0);
        if (calu.f164950c) {
            calu.mo74035c();
            calu.f164950c = false;
        }
        calx calx = (calx) calu.f164949b;
        int i = calx.f175203a | 1;
        calx.f175203a = i;
        calx.f175206d = j;
        calx.f175203a = i | 2;
        calx.f175207e = j2;
        try {
            String str = new String(srz.m36178b(inputStream), asem.f88778e);
            StringBuilder sb = new StringBuilder();
            String str2 = null;
            for (String str3 : asgi.f88918a.split(str)) {
                String trim = str3.trim();
                if (asgi.m74037a(trim) != null) {
                    String a = asgi.m74037a(trim);
                    sb.append(trim);
                    sb.append(10);
                    str2 = a;
                } else if (str2 != null) {
                    Matcher matcher = asgi.f88919b.matcher(trim);
                    String group = !matcher.matches() ? "" : matcher.group(1);
                    if (group.length() > 0) {
                        asgj asgj = asgi.f88920c;
                        if (cgut.f187785a.mo6606a().mo84518d()) {
                            if (sharedPreferences != null) {
                                try {
                                    String valueOf = String.valueOf(group);
                                    z = sharedPreferences.getBoolean(valueOf.length() == 0 ? new String("SettingsStats__") : "SettingsStats__".concat(valueOf), false);
                                } catch (ClassCastException e) {
                                    qxq.mo24383c("SettingsClassCastException").mo24359a();
                                }
                                if (!z) {
                                    sb.append(trim);
                                    sb.append(10);
                                }
                            }
                        }
                        z = asgj.f88921a.contains(group);
                        if (!z) {
                        }
                    }
                }
            }
            String sb2 = sb.toString();
            if (calu.f164950c) {
                calu.mo74035c();
                calu.f164950c = false;
            }
            calx calx2 = (calx) calu.f164949b;
            sb2.getClass();
            calx2.f175203a |= 8;
            calx2.f175209g = sb2;
            calx calx3 = (calx) calu.mo74062i();
            srz.m36171a((Closeable) inputStream);
            return calx3;
        } catch (IOException e2) {
            Log.w(this.f88779a, "Failed to read dumpsys output file for settings stats.");
            throw new asel(e2);
        } catch (Throwable th) {
            th = th;
            srz.m36171a((Closeable) inputStream);
            throw th;
        }
    }

    /* renamed from: c */
    public final long mo49094c() {
        return cgut.f187785a.mo6606a().mo84517c();
    }

    /* renamed from: d */
    public final long mo49095d() {
        return 0;
    }

    /* renamed from: g */
    public final boolean mo49098g() {
        return cgut.f187785a.mo6606a().mo84515a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asgh() {
        super("Settingsstats", "settings", "SETTINGS_STATS", false);
        int i = Build.VERSION.SDK_INT;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String[] mo49101a(long j, long j2) {
        int i = Build.VERSION.SDK_INT;
        return new String[0];
    }

    /* renamed from: b */
    public final boolean mo49093b() {
        if (!cgsf.f187633a.mo6606a().mo84395k()) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        return true;
    }
}
