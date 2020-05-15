package p000;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;

/* renamed from: izs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class izs {

    /* renamed from: a */
    public static final izs f22010a = new izs();

    /* renamed from: b */
    private static final sek f22011b = jdh.m16547a("SignedCertificatesCache");

    /* renamed from: c */
    private static final File m16381c(Context context) {
        File file = new File(context.getFilesDir(), "auth_folsom");
        file.mkdir();
        return new File(file, "signed_certificates");
    }

    /* renamed from: a */
    public final synchronized bmxv mo13537a(Context context) {
        if (ccfy.m129492d()) {
            f22011b.mo25416d("Not getting cached certificates list, as cache is disabled.", new Object[0]);
            return bmvz.f131120a;
        }
        try {
            File c = m16381c(context);
            if (!c.exists()) {
                f22011b.mo25412b("Certs cache file did not exist", new Object[0]);
                return bmvz.f131120a;
            }
            try {
                byte[] readAllBytes = Files.readAllBytes(c.toPath());
                try {
                    jib jib = (jib) bxvk.m124016a(jib.f22535e, readAllBytes, bxus.m123744c());
                    if (jib.f22538b.mo73779j()) {
                        f22011b.mo25418e("Cached certificates list was empty", new Object[0]);
                        return bmvz.f131120a;
                    } else if (!jib.f22539c.mo73779j()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        long j = jib.f22540d;
                        if (currentTimeMillis >= j) {
                            f22011b.mo25414c("Invalidating expired cached value (current time %d, cache expired %d)", Long.valueOf(currentTimeMillis), Long.valueOf(jib.f22540d));
                            mo13539b(context);
                            return bmvz.f131120a;
                        } else if (j - currentTimeMillis > ccfy.m129497i()) {
                            f22011b.mo25416d("Device clock skewed. Invalidating cache. (current time %d, cache expired %d)", Long.valueOf(currentTimeMillis), Long.valueOf(jib.f22540d));
                            mo13539b(context);
                            return bmvz.f131120a;
                        } else {
                            return bmxv.m108566b(jib);
                        }
                    } else {
                        f22011b.mo25418e("Cached certificates signature was empty", new Object[0]);
                        return bmvz.f131120a;
                    }
                } catch (bxwf e) {
                    f22011b.mo25417e("Could not decode signed certs proto", e, new Object[0]);
                    return bmvz.f131120a;
                }
            } catch (IOException e2) {
                f22011b.mo25417e("IO error reading cached certs", e2, new Object[0]);
                return bmvz.f131120a;
            }
        } catch (IOException e3) {
            f22011b.mo25417e("IO error opening cached certs", e3, new Object[0]);
            return bmvz.f131120a;
        }
    }

    /* renamed from: b */
    public final synchronized void mo13539b(Context context) {
        try {
            m16381c(context).delete();
        } catch (IOException e) {
            f22011b.mo25417e("IO error while invalidating cache", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final synchronized void mo13538a(Context context, jib jib) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if ((jib.f22537a & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "Null certificates");
        if (jib.f22538b.mo73744a() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        bmxy.m108589a(z2, "Empty certificates byte array");
        if ((jib.f22537a & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        bmxy.m108601b(z3, "Null signature");
        if (jib.f22539c.mo73744a() <= 0) {
            z4 = false;
        }
        bmxy.m108589a(z4, "Empty signature byte array");
        try {
            try {
                jib.mo73638a(Files.newOutputStream(m16381c(context).toPath(), new OpenOption[0]));
            } catch (IOException e) {
                f22011b.mo25417e("Failed to write certs to file", e, new Object[0]);
            }
        } catch (IOException e2) {
            f22011b.mo25417e("Failed to open certs cache file for writing", e2, new Object[0]);
        }
    }
}
