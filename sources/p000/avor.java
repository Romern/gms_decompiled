package p000;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: avor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avor extends avnn {

    /* renamed from: e */
    public static final avto f93664e = new avto("dir_path", "");

    /* renamed from: f */
    private static final Logger f93665f = avpq.m79018e("StreamingProcessPackageAction");

    /* renamed from: g */
    private final Context f93666g;

    /* renamed from: h */
    private final avtn f93667h = ((avtn) avtn.f93892a.mo51589b());

    /* renamed from: i */
    private final avmx f93668i = ((avmx) avmx.f93453h.mo51589b());

    protected avor(Context context, avte avte) {
        super("streaming-process-package", avte);
        this.f93666g = context;
    }

    /* renamed from: a */
    public static avor m78949a(Context context, avte avte) {
        sdo.m34970a(avls.m78732a());
        int i = Build.VERSION.SDK_INT;
        sdo.m34970a(true);
        return new avor(context, avte);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avmx.a(int, double):void
     arg types: [int, int]
     candidates:
      avmx.a(int, int):void
      avmx.a(int, double):void */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0172, code lost:
        if (((java.lang.Boolean) android.os.RecoverySystem.class.getMethod("verifyPackageCompatibility", java.io.File.class).invoke(null, r5)).booleanValue() == false) goto L_0x0185;
     */
    /* renamed from: c */
    public final avni mo51435c() {
        this.f93668i.mo51402a(3, -1.0d);
        try {
            this.f93667h.mo51605a(avnp.f93532g.mo51602b(bmxv.m108566b(avlx.m78763a(new File((String) mo51433a(f93664e), "metadata")))));
            bmxv f = bnjd.m109599f(avlz.m78770a(bmxx.m108578b((String) avma.f93363i.mo51364a())), avoq.f93663a);
            if (f.mo66813a()) {
                String str = this.f93668i.mo51414d().f109459a;
                long j = ((avly) f.mo66814b()).f93351b;
                long j2 = ((avly) f.mo66814b()).f93352c;
                File file = new File((String) mo51433a(f93664e), "payload_properties.txt");
                sdo.m34977c(str);
                int i = Build.VERSION.SDK_INT;
                sdo.m34970a(true);
                avso avso = (avso) avsp.f93843d.mo74144da();
                if (avso.f164950c) {
                    avso.mo74035c();
                    avso.f164950c = false;
                }
                str.getClass();
                ((avsp) avso.f164949b).f93845a = str;
                bxvd da = avsq.f93848d.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                avsq avsq = (avsq) da.f164949b;
                "payload.bin".getClass();
                avsq.f93850a = "payload.bin";
                avsq.f93851b = j;
                avsq.f93852c = j2;
                if (avso.f164950c) {
                    avso.mo74035c();
                    avso.f164950c = false;
                }
                avsq avsq2 = (avsq) da.mo74062i();
                avsq2.getClass();
                ((avsp) avso.f164949b).f93847c = avsq2;
                boaw a = bobi.m111039a(file, bmwy.f131158c);
                bobf bobf = new bobf();
                bmxy.m108581a(bobf);
                bobb a2 = bobb.m111033a();
                try {
                    InputStreamReader inputStreamReader = new InputStreamReader(((bobh) ((boap) a).f132474b).mo68853b(), ((boap) a).f132473a);
                    a2.mo68842a(inputStreamReader);
                    bmxy.m108581a(inputStreamReader);
                    bmxy.m108581a(bobf);
                    bobk bobk = new bobk(inputStreamReader);
                    while (true) {
                        String a3 = bobk.mo68856a();
                        if (a3 == null) {
                            break;
                        }
                        bobf.f132494a.add(a3);
                    }
                    List list = bobf.f132494a;
                    a2.close();
                    avso.mo51585a(list);
                    this.f93667h.mo51605a(avnp.f93533h.mo51602b(bmxv.m108566b((avsp) avso.mo74062i())));
                    int i2 = Build.VERSION.SDK_INT;
                    if (cfsg.f185570a.mo6606a().mo82625I()) {
                        File file2 = new File((String) mo51433a(f93664e), "compatibility.zip");
                        if (file2.exists()) {
                            try {
                            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
                                f93665f.mo25417e("Failed to call RecoverySystem.verifyPackageCompatibility().", e, new Object[0]);
                            }
                        }
                    }
                    File[] listFiles = new File((String) mo51433a(f93664e)).listFiles();
                    if (listFiles != null) {
                        for (File file3 : listFiles) {
                            avov.m78966a(file3);
                        }
                    }
                    avtd a4 = avte.m79303a();
                    a4.mo51594a(avnu.f93560f, (String) mo51433a(f93664e));
                    return new avni("ab-update-prep", a4.mo51593a());
                } catch (Throwable th) {
                    a2.close();
                    throw th;
                }
            } else {
                throw new IOException("Failed to find payload.bin entry.");
            }
            f93665f.mo25418e("Failed to verify package compatibility.", new Object[0]);
            this.f93668i.mo51402a(274, -1.0d);
            return new avni("finished-execution", avte.m79305a(new avtc[0]));
        } catch (IOException e2) {
            f93665f.mo25417e("Failed to parse package files.", e2, new Object[0]);
            this.f93668i.mo51402a(274, -1.0d);
            return avon.m78931a(this.f93666g, true);
        }
    }
}
