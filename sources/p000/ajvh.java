package p000;

import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.List;
import java.util.Locale;

/* renamed from: ajvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajvh {
    /* renamed from: a */
    public static int m59100a() {
        int x = (int) cfov.f185185a.mo6606a().mo82400x();
        if (x != 1) {
            return x != 2 ? 1 : 3;
        }
        return 2;
    }

    /* renamed from: b */
    public static bvga m59105b(int i) {
        bxvd da = bvga.f155948e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvga bvga = (bvga) da.f164949b;
        bvga.f155953d = i - 1;
        int i2 = bvga.f155950a | 4;
        bvga.f155950a = i2;
        bvga.f155951b = 1;
        int i3 = i2 | 1;
        bvga.f155950a = i3;
        bvga.f155952c = 1;
        bvga.f155950a = i3 | 2;
        return (bvga) da.mo74062i();
    }

    /* renamed from: c */
    public static int m59106c(int i) {
        if (i == 1) {
            return 4;
        }
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                return 1;
            }
        }
        return i2;
    }

    /* renamed from: d */
    public static bxvd m59107d(int i) {
        bxvd da = bvgd.f155960B.mo74144da();
        int a = m59100a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvgd bvgd = (bvgd) da.f164949b;
        bvgd.f155985v = a - 1;
        int i2 = bvgd.f155964a | 67108864;
        bvgd.f155964a = i2;
        bvgd.f155965b = i - 1;
        bvgd.f155964a = i2 | 1;
        String W = cfov.m142047W();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvgd bvgd2 = (bvgd) da.f164949b;
        W.getClass();
        bvgd2.f155964a |= Integer.MIN_VALUE;
        bvgd2.f155962A = W;
        return da;
    }

    /* renamed from: e */
    private static int m59108e(int i) {
        if (i == 0) {
            return 5;
        }
        if (i != 1) {
            return i != 2 ? 1 : 4;
        }
        return 2;
    }

    /* renamed from: a */
    public static ajuz m59101a(int i) {
        bxvd d = m59107d(15);
        bxvd da = bvfq.f155902c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvfq bvfq = (bvfq) da.f164949b;
        bvfq.f155905b = i - 1;
        bvfq.f155904a |= 1;
        bvfq bvfq2 = (bvfq) da.mo74062i();
        if (d.f164950c) {
            d.mo74035c();
            d.f164950c = false;
        }
        bvgd bvgd = (bvgd) d.f164949b;
        bvgd bvgd2 = bvgd.f155960B;
        bvfq2.getClass();
        bvgd.f155979p = bvfq2;
        bvgd.f155964a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        return new ajuz((bvgd) d.mo74062i());
    }

    /* renamed from: a */
    public static ajvb m59102a(int i, int i2) {
        bxvd d = m59107d(4);
        bxvd da = bvfz.f155943d.mo74144da();
        int e = m59108e(i);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvfz bvfz = (bvfz) da.f164949b;
        bvfz.f155947c = e - 1;
        bvfz.f155945a |= 2;
        int e2 = m59108e(i2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvfz bvfz2 = (bvfz) da.f164949b;
        bvfz2.f155946b = e2 - 1;
        bvfz2.f155945a |= 1;
        if (d.f164950c) {
            d.mo74035c();
            d.f164950c = false;
        }
        bvgd bvgd = (bvgd) d.f164949b;
        bvfz bvfz3 = (bvfz) da.mo74062i();
        bvgd bvgd2 = bvgd.f155960B;
        bvfz3.getClass();
        bvgd.f155968e = bvfz3;
        bvgd.f155964a |= 16;
        return new ajvb((bvgd) d.mo74062i());
    }

    /* renamed from: a */
    public static ajvb m59103a(int i, int i2, long j) {
        bxvd d = m59107d(26);
        bxvd da = bvfi.f155868e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvfi bvfi = (bvfi) da.f164949b;
        bvfi.f155872c = i - 1;
        int i3 = bvfi.f155870a | 2;
        bvfi.f155870a = i3;
        bvfi.f155871b = i2 - 1;
        bvfi.f155870a = i3 | 1;
        if (cfov.f185185a.mo6606a().mo82382f()) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvfi bvfi2 = (bvfi) da.f164949b;
            bvfi2.f155870a |= 4;
            bvfi2.f155873d = j;
        }
        if (d.f164950c) {
            d.mo74035c();
            d.f164950c = false;
        }
        bvgd bvgd = (bvgd) d.f164949b;
        bvfi bvfi3 = (bvfi) da.mo74062i();
        bvgd bvgd2 = bvgd.f155960B;
        bvfi3.getClass();
        bvgd.f155986w = bvfi3;
        bvgd.f155964a |= 134217728;
        return new ajvb((bvgd) d.mo74062i());
    }

    /* renamed from: a */
    public static bvfe m59104a(List list) {
        bxvd da = bvfe.f155851c.mo74144da();
        if (list.isEmpty()) {
            return (bvfe) da.mo74062i();
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Attachment attachment = (Attachment) list.get(i);
            long a = attachment.mo44383a();
            int i2 = 3;
            if (attachment.mo44386d()) {
                int b = attachment.mo44384b();
                if (b == 1) {
                    i2 = 2;
                } else if (b != 2) {
                    i2 = b != 3 ? 1 : 4;
                }
                bxvd da2 = bvgc.f155955d.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bvgc bvgc = (bvgc) da2.f164949b;
                bvgc.f155958b = i2 - 1;
                int i3 = bvgc.f155957a | 1;
                bvgc.f155957a = i3;
                bvgc.f155957a = i3 | 2;
                bvgc.f155959c = a;
                bvgc bvgc2 = (bvgc) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvfe bvfe = (bvfe) da.f164949b;
                bvgc2.getClass();
                if (!bvfe.f155853a.mo73666a()) {
                    bvfe.f155853a = bxvk.m124021a(bvfe.f155853a);
                }
                bvfe.f155853a.add(bvgc2);
            } else if (attachment.mo44385c()) {
                int b2 = attachment.mo44384b();
                if (b2 == 1) {
                    i2 = 2;
                } else if (b2 != 2) {
                    i2 = b2 != 3 ? b2 != 4 ? 1 : 5 : 4;
                }
                FileAttachment fileAttachment = (FileAttachment) attachment;
                if (i2 == 1 || i2 == 4) {
                    String str = fileAttachment.f80881a;
                    String[] strArr = akif.f72050a;
                    int length = strArr.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            break;
                        }
                        if (str.toLowerCase(Locale.getDefault()).endsWith(strArr[i4])) {
                            i2 = 6;
                            break;
                        }
                        i4++;
                    }
                }
                bxvd da3 = bvfk.f155875e.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bvfk bvfk = (bvfk) da3.f164949b;
                bvfk.f155878b = i2 - 1;
                int i5 = bvfk.f155877a | 1;
                bvfk.f155877a = i5;
                int i6 = i5 | 2;
                bvfk.f155877a = i6;
                bvfk.f155879c = a;
                String str2 = fileAttachment.f80886f;
                str2.getClass();
                bvfk.f155877a = 4 | i6;
                bvfk.f155880d = str2;
                bvfk bvfk2 = (bvfk) da3.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvfe bvfe2 = (bvfe) da.f164949b;
                bvfk2.getClass();
                if (!bvfe2.f155854b.mo73666a()) {
                    bvfe2.f155854b = bxvk.m124021a(bvfe2.f155854b);
                }
                bvfe2.f155854b.add(bvfk2);
            } else {
                ((bnsl) ajvp.f71371a.mo68388c()).mo68420a("Unable to create event for attachment info. Unknown attachment %s", attachment);
            }
        }
        return (bvfe) da.mo74062i();
    }
}
