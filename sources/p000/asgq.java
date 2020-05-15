package p000;

import android.content.Context;
import android.os.Build;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: asgq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asgq extends asgr {

    /* renamed from: h */
    private static final bnhe f88938h;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b("MISC", new String[]{"vers", "period", "config"});
        h.mo67695b("PKG_PROC_DUR", new String[]{"pkgproc"});
        h.mo67695b("PKG_PROC_MEM", new String[]{"pkgpss"});
        h.mo67695b("PKG_PROC_KILL", new String[]{"pkgkills"});
        h.mo67695b("PKG_PROC_ALL", new String[]{"pkgproc", "pkgpss", "pkgkills"});
        h.mo67695b("PROC_DUR", new String[]{"proc"});
        h.mo67695b("PROC_MEM", new String[]{"pss"});
        h.mo67695b("PROC_KILL", new String[]{"kills"});
        h.mo67695b("PROC_ALL", new String[]{"proc", "pss", "kills"});
        h.mo67695b("PKG_SVC_RUN", new String[]{"pkgsvc-run"});
        h.mo67695b("PKG_SVC_START", new String[]{"pkgsvc-start"});
        h.mo67695b("PKG_SVC_BOUND", new String[]{"pkgsvc-bound"});
        h.mo67695b("PKG_SVC_EXEC", new String[]{"pkgsvc-exec"});
        h.mo67695b("PKG_SVC_ALL", new String[]{"pkgsvc-run", "pkgsvc-start", "pkgsvc-bound", "pkgsvc-exec"});
        h.mo67695b("DEVICE_MEM_DUR", new String[]{"total"});
        h.mo67695b("SYS_MEM_USAGE", new String[]{"sysmemusage"});
        h.mo67695b("MEM_WEIGHTS", new String[]{"weights"});
        h.mo67695b("MEM_PAGE_STATS", new String[]{"availablepages"});
        h.mo67695b("SYS_MEM_ALL", new String[]{"total", "sysmemusage", "weights", "availablepages"});
        f88938h = h.mo67618b();
    }

    public asgq() {
        super("Procstats", "procstats", "PROC_STATS", cgta.f187697a.mo6606a().mo84451j());
    }

    /* renamed from: a */
    public final String[] mo49101a(long j, long j2) {
        return new String[]{"-c", "--hours", String.valueOf(TimeUnit.HOURS.convert(j2 - j, TimeUnit.MILLISECONDS))};
    }

    /* renamed from: b */
    public final calx mo49102b(Context context, InputStream inputStream, long j, long j2, qxq qxq) {
        ByteArrayInputStream byteArrayInputStream;
        InputStream inputStream2;
        if (cgtp.f187750a.mo6606a().mo84490a()) {
            HashSet hashSet = new HashSet();
            for (String str : bmyx.m108640a(',').mo66918a((CharSequence) cgtp.f187750a.mo6606a().mo84491b())) {
                String trim = str.trim();
                if (f88938h.containsKey(trim)) {
                    Collections.addAll(hashSet, (String[]) f88938h.get(trim));
                }
            }
            try {
                inputStream2 = inputStream;
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        String trim2 = readLine.trim();
                        if (!trim2.isEmpty()) {
                            int indexOf = trim2.indexOf(44);
                            if (indexOf != -1) {
                                if (hashSet.contains(trim2.substring(0, indexOf))) {
                                }
                            }
                            sb.append(trim2);
                            sb.append(10);
                        }
                    }
                    byteArrayInputStream = new ByteArrayInputStream(sb.toString().getBytes(asem.f88778e));
                } catch (IOException e) {
                }
            } catch (IOException e2) {
                inputStream2 = inputStream;
            }
        } else {
            inputStream2 = inputStream;
            byteArrayInputStream = inputStream2;
        }
        return mo49099a(context, byteArrayInputStream, j, j2, qxq);
    }

    /* renamed from: c */
    public final long mo49094c() {
        return cgta.f187697a.mo6606a().mo84452k();
    }

    /* renamed from: h */
    public final boolean mo49104h() {
        return cgta.f187697a.mo6606a().mo84450i();
    }

    /* renamed from: b */
    public final boolean mo49093b() {
        int i = Build.VERSION.SDK_INT;
        return cgsf.f187633a.mo6606a().mo84394j();
    }
}
