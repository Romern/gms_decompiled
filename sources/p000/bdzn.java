package p000;

import android.util.Log;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: bdzn */
final /* synthetic */ class bdzn implements aubq {

    /* renamed from: a */
    private final bdzo f106697a;

    public bdzn(bdzo bdzo) {
        this.f106697a = bdzo;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        String str;
        FileOutputStream fileOutputStream;
        Throwable th;
        bdzo bdzo = this.f106697a;
        if (!aucb.mo50384b()) {
            Log.e("FileFlagSource", "Could not read flags from Phenotype API, not performing optimistic update");
            return;
        }
        Configurations configurations = (Configurations) aucb.mo50386d();
        if (configurations != null && (str = configurations.f82074a) != null && !str.isEmpty()) {
            beae beae = (beae) beaf.f106724g.mo74144da();
            Configuration[] configurationArr = configurations.f82077d;
            boolean z = false;
            if (configurationArr != null) {
                int length = configurationArr.length;
                int i = 0;
                while (i < length) {
                    Flag[] flagArr = configurationArr[i].f82071b;
                    if (flagArr != null) {
                        int length2 = flagArr.length;
                        int i2 = 0;
                        while (i2 < length2) {
                            Flag flag = flagArr[i2];
                            bxvd da = beag.f106732e.mo74144da();
                            String str2 = flag.f82099a;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = z;
                            }
                            beag beag = (beag) da.f164949b;
                            str2.getClass();
                            beag.f106734a |= 1;
                            beag.f106737d = str2;
                            int i3 = flag.f82105g;
                            if (i3 == 1) {
                                long a = flag.mo46497a();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                beag beag2 = (beag) da.f164949b;
                                beag2.f106735b = 2;
                                beag2.f106736c = Long.valueOf(a);
                            } else if (i3 == 2) {
                                boolean b = flag.mo46499b();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                beag beag3 = (beag) da.f164949b;
                                beag3.f106735b = 3;
                                beag3.f106736c = Boolean.valueOf(b);
                            } else if (i3 == 3) {
                                double c = flag.mo46500c();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                beag beag4 = (beag) da.f164949b;
                                beag4.f106735b = 4;
                                beag4.f106736c = Double.valueOf(c);
                            } else if (i3 == 4) {
                                String d = flag.mo46502d();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                beag beag5 = (beag) da.f164949b;
                                d.getClass();
                                beag5.f106735b = 5;
                                beag5.f106736c = d;
                            } else if (i3 == 5) {
                                ByteString a2 = ByteString.m123261a(flag.mo46503e());
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                beag beag6 = (beag) da.f164949b;
                                a2.getClass();
                                beag6.f106735b = 6;
                                beag6.f106736c = a2;
                            } else {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Impossible flag value type: ");
                                sb.append(i3);
                                throw new AssertionError(sb.toString());
                            }
                            beae.mo58475a(da);
                            i2++;
                            z = false;
                        }
                        continue;
                    }
                    i++;
                    z = false;
                }
            }
            String str3 = configurations.f82076c;
            if (str3 != null) {
                if (beae.f164950c) {
                    beae.mo74035c();
                    beae.f164950c = false;
                }
                beaf beaf = (beaf) beae.f164949b;
                str3.getClass();
                beaf.f106726a |= 4;
                beaf.f106729d = str3;
            }
            String str4 = configurations.f82074a;
            if (str4 != null) {
                if (beae.f164950c) {
                    beae.mo74035c();
                    beae.f164950c = false;
                }
                beaf beaf2 = (beaf) beae.f164949b;
                str4.getClass();
                beaf2.f106726a |= 1;
                beaf2.f106727b = str4;
            }
            long j = configurations.f82080g;
            if (beae.f164950c) {
                beae.mo74035c();
                beae.f164950c = false;
            }
            beaf beaf3 = (beaf) beae.f164949b;
            beaf3.f106726a |= 8;
            beaf3.f106730e = j;
            byte[] bArr = configurations.f82075b;
            if (bArr != null) {
                ByteString a3 = ByteString.m123261a(bArr);
                if (beae.f164950c) {
                    beae.mo74035c();
                    beae.f164950c = false;
                }
                beaf beaf4 = (beaf) beae.f164949b;
                a3.getClass();
                beaf4.f106726a |= 2;
                beaf4.f106728c = a3;
            }
            beaf beaf5 = (beaf) beae.mo74062i();
            try {
                fileOutputStream = new FileOutputStream(bdzo.mo58467b());
                beaf5.mo73638a(fileOutputStream);
                fileOutputStream.close();
                if (!bdzo.f106701d.mo58474a(bdzo.m91642a(beaf5))) {
                    bdzz.m91651a(bdzo.f106699b.mo58441a());
                    return;
                }
                return;
            } catch (IOException e) {
                Log.e("FileFlagSource", "Could not write Phenotype flags to local storage: ", e);
                return;
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
        } else {
            return;
        }
        throw th;
    }
}
