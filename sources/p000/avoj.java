package p000;

import android.content.Context;
import android.os.Build;
import android.os.RecoverySystem;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: avoj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avoj extends avnn {

    /* renamed from: e */
    public static final avto f93623e = new avto("file_path", "");

    /* renamed from: f */
    private static final sek f93624f = avpq.m79018e("NonStreamingProcessPackageAction");

    /* renamed from: g */
    private final Context f93625g;

    /* renamed from: h */
    private final avtn f93626h = ((avtn) avtn.f93892a.mo51589b());

    /* renamed from: i */
    private final avmx f93627i = ((avmx) avmx.f93453h.mo51589b());

    public avoj(Context context, avte avte) {
        super("non-streaming-process-package", avte);
        this.f93625g = context;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avmx.a(int, double):void
     arg types: [int, int]
     candidates:
      avmx.a(int, int):void
      avmx.a(int, double):void */
    /* renamed from: c */
    public final avni mo51435c() {
        ZipFile zipFile;
        ZipFile zipFile2;
        Throwable th;
        long j;
        ArrayList arrayList;
        this.f93627i.mo51402a(3, -1.0d);
        File file = new File((String) mo51433a(f93623e));
        boolean z = true;
        try {
            zipFile = new ZipFile(file);
            this.f93626h.mo51605a(avnp.f93532g.mo51602b(bmxv.m108566b(avlx.m78765a(zipFile))));
            zipFile.close();
            if (avls.m78732a()) {
                int i = Build.VERSION.SDK_INT;
                sdo.m34970a(true);
                ArrayList arrayList2 = new ArrayList();
                zipFile2 = new ZipFile(file);
                Enumeration<? extends ZipEntry> entries = zipFile2.entries();
                avsq avsq = null;
                long j2 = 0;
                while (entries.hasMoreElements()) {
                    ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                    String name = zipEntry.getName();
                    if (zipEntry.getExtra() != null) {
                        j = (long) zipEntry.getExtra().length;
                    } else {
                        j = 0;
                    }
                    ArrayList arrayList3 = arrayList2;
                    j2 += ((long) (name.length() + 30)) + j;
                    if (!zipEntry.isDirectory()) {
                        long compressedSize = zipEntry.getCompressedSize();
                        if ("payload.bin".equals(name)) {
                            arrayList = arrayList3;
                            if (zipEntry.getMethod() == 0) {
                                bxvd da = avsq.f93848d.mo74144da();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                avsq avsq2 = (avsq) da.f164949b;
                                "payload.bin".getClass();
                                avsq2.f93850a = "payload.bin";
                                avsq2.f93851b = j2;
                                avsq2.f93852c = compressedSize;
                                avsq = (avsq) da.mo74062i();
                            } else {
                                throw new IOException("Invalid compression method.");
                            }
                        } else if (!"payload_properties.txt".equals(name)) {
                            arrayList = arrayList3;
                        } else {
                            InputStream inputStream = zipFile2.getInputStream(zipEntry);
                            if (inputStream != null) {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                                ArrayList arrayList4 = new ArrayList();
                                bobk bobk = new bobk(bufferedReader);
                                while (true) {
                                    String a = bobk.mo68856a();
                                    if (a == null) {
                                        break;
                                    }
                                    arrayList4.add(a);
                                    arrayList3 = arrayList3;
                                }
                                arrayList = arrayList3;
                                arrayList.addAll(arrayList4);
                            } else {
                                arrayList = arrayList3;
                            }
                        }
                        j2 += compressedSize;
                        arrayList2 = arrayList;
                    } else {
                        arrayList2 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList2;
                zipFile2.close();
                if (avsq != null) {
                    avso avso = (avso) avsp.f93843d.mo74144da();
                    String valueOf = String.valueOf(file.getAbsolutePath());
                    String str = valueOf.length() == 0 ? new String("file://") : "file://".concat(valueOf);
                    if (avso.f164950c) {
                        avso.mo74035c();
                        avso.f164950c = false;
                    }
                    avsp avsp = (avsp) avso.f164949b;
                    str.getClass();
                    avsp.f93845a = str;
                    avsq.getClass();
                    avsp.f93847c = avsq;
                    avso.mo51585a(arrayList5);
                    this.f93626h.mo51605a(avnp.f93533h.mo51602b(bmxv.m108566b((avsp) avso.mo74062i())));
                } else {
                    throw new IOException("Failed to find payload entry in the given package.");
                }
            }
            RecoverySystem.verifyPackage(file, null, null);
            if (avls.m78732a()) {
                avov.m78966a(file);
            }
            if (!avls.m78732a()) {
                if (avme.m78793b(this.f93625g, this.f93627i.mo51414d())) {
                    try {
                        f93624f.mo25414c("Processing the package...", new Object[0]);
                        RecoverySystem.processPackage(this.f93625g, file, null);
                    } catch (IOException e) {
                        f93624f.mo25417e("Error processing the package.", e, new Object[0]);
                        z = false;
                    }
                } else {
                    z = false;
                }
                avtd a2 = avte.m79303a();
                a2.mo51594a(avog.f93581e, (String) mo51432a().mo51597a(f93623e));
                a2.mo51594a(avog.f93582f, Boolean.valueOf(z));
                return new avni("non-ab-reboot", a2.mo51593a());
            }
            avtd a3 = avte.m79303a();
            a3.mo51595a(avnu.f93559e.mo51602b((String) mo51432a().mo51597a(f93623e)));
            return new avni("ab-update-prep", a3.mo51593a());
        } catch (IOException | GeneralSecurityException e2) {
            f93624f.mo25417e("Package verification failed.", e2, new Object[0]);
            this.f93627i.mo51402a(!avls.m78732a() ? 263 : 274, -1.0d);
            avtn avtn = (avtn) avtn.f93892a.mo51589b();
            avtn.mo51605a(avnp.f93530e.mo51602b(Integer.valueOf(((Integer) avtn.mo51603a(avnp.f93530e).f93879b).intValue() + 1)));
            return avon.m78931a(this.f93625g, false);
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
        throw th;
    }
}
