package p000;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: bdiy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdiy {

    /* renamed from: a */
    public final File f105715a;

    /* renamed from: b */
    private final List f105716b;

    /* renamed from: c */
    private final int f105717c;

    /* renamed from: d */
    private final List f105718d;

    public bdiy(File file, List list, int i, bngx bngx) {
        this.f105715a = file;
        this.f105717c = i;
        this.f105718d = list;
        this.f105716b = bngx;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0121  */
    /* renamed from: a */
    public final long mo58077a(bdix bdix) {
        bxvd da = ciol.f191077e.mo74144da();
        String str = bdix.f105712a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ciol ciol = (ciol) da.f164949b;
        str.getClass();
        ciol.f191079a |= 1;
        ciol.f191080b = str;
        long j = 0;
        try {
            File[] listFiles = new File(bdix.f105714c.f105715a, bdix.f105712a).listFiles();
            if (bdix.f105713b >= this.f105717c || this.f105718d.size() >= 512) {
                j = bdiz.m90882a(listFiles);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ciol ciol2 = (ciol) da.f164949b;
                ciol2.f191079a |= 2;
                ciol2.f191082d = j;
                this.f105718d.add((ciol) da.mo74062i());
                return j;
            }
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                try {
                    File file = listFiles[i];
                    if (!bdiz.m90885a(file)) {
                        if (file.isFile()) {
                            String name = file.getName();
                            if (bdix.f105713b != 0) {
                                String str2 = bdix.f105712a;
                                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(name).length());
                                sb.append(str2);
                                sb.append('/');
                                sb.append(name);
                                name = sb.toString();
                            }
                            if (this.f105718d.size() < 512) {
                                Iterator it = this.f105716b.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    } else if (((Pattern) it.next()).matcher(name).matches()) {
                                        bxvd da2 = ciol.f191077e.mo74144da();
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        ciol ciol3 = (ciol) da2.f164949b;
                                        name.getClass();
                                        ciol3.f191079a |= 1;
                                        ciol3.f191080b = name;
                                        long length2 = file.length();
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        ciol ciol4 = (ciol) da2.f164949b;
                                        ciol4.f191079a |= 2;
                                        ciol4.f191082d = length2;
                                        this.f105718d.add((ciol) da2.mo74062i());
                                    }
                                }
                            }
                            j += file.length();
                        } else if (file.isDirectory()) {
                            j += mo58077a(new bdix(this, bdix, file.getName()));
                        }
                    }
                    i++;
                } catch (IOException | SecurityException e) {
                    bnrt bnrt = bdiz.f105719a;
                    if (da.f164950c) {
                    }
                    ciol ciol22 = (ciol) da.f164949b;
                    ciol22.f191079a |= 2;
                    ciol22.f191082d = j;
                    this.f105718d.add((ciol) da.mo74062i());
                    return j;
                }
            }
            if (da.f164950c) {
            }
            ciol ciol222 = (ciol) da.f164949b;
            ciol222.f191079a |= 2;
            ciol222.f191082d = j;
            this.f105718d.add((ciol) da.mo74062i());
            return j;
        } catch (IOException | SecurityException e2) {
            bnrt bnrt2 = bdiz.f105719a;
            if (da.f164950c) {
            }
            ciol ciol2222 = (ciol) da.f164949b;
            ciol2222.f191079a |= 2;
            ciol2222.f191082d = j;
            this.f105718d.add((ciol) da.mo74062i());
            return j;
        }
    }
}
