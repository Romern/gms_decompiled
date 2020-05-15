package p000;

import android.content.Context;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.security.MessageDigest;

/* renamed from: bbcb */
final /* synthetic */ class bbcb implements bqeh {

    /* renamed from: a */
    private final bbch f102300a;

    /* renamed from: b */
    private final bavd f102301b;

    /* renamed from: c */
    private final bavr f102302c;

    public bbcb(bbch bbch, bavd bavd, bavr bavr) {
        this.f102300a = bbch;
        this.f102301b = bavd;
        this.f102302c = bavr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0236, code lost:
        p000.bbev.m87910b("%s File details missing in added group = %s, file id = %s", "DataFileGroupValidator", r0.f101873c, r13.f101850b);
     */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x021a A[LOOP:1: B:96:0x017f->B:135:0x021a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0200 A[SYNTHETIC] */
    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        String str;
        int a;
        boolean z;
        boolean z2;
        boolean z3;
        bxwc bxwc;
        int i;
        boolean z4;
        boolean z5;
        bznz bznz;
        bbch bbch = this.f102300a;
        bavd bavd = this.f102301b;
        bavr bavr = this.f102302c;
        Void voidR = (Void) obj;
        Context context = bbch.f102315b;
        if (bavd.f101873c.isEmpty()) {
            bbev.m87905a("%s Group name missing in added group", "DataFileGroupValidator");
        } else if (bavd.f101873c.contains("|")) {
            bbev.m87906a("%s Group name = %s contains '|'", "DataFileGroupValidator", bavd.f101873c);
        } else if (!bavd.f101874d.contains("|")) {
            bxwc bxwc2 = bavd.f101880j;
            int size = bxwc2.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    bauy bauy = (bauy) bxwc2.get(i2);
                    if (bauy.f101850b.isEmpty() || bauy.f101850b.contains("|")) {
                        break;
                    }
                    if (!bbfe.m87922a(bauy)) {
                        z = (bauy.f101849a & 16) != 0 && !bauy.f101854f.isEmpty();
                    } else {
                        z = (bauy.f101849a & 64) != 0 && !bauy.f101856h.isEmpty();
                    }
                    int a2 = baux.m87590a(bauy.f101853e);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    if (a2 - 1 != 0) {
                        z2 = !z;
                    } else {
                        z2 = z;
                    }
                    if (!bbfe.m87922a(bauy)) {
                        z3 = false;
                    } else {
                        z3 = !z;
                    }
                    boolean z6 = z2 | z3;
                    if (bauy.f101851c.isEmpty() || bauy.f101851c.contains("|") || bauy.f101852d < 0 || !z6 || bbfe.m87923b(bauy).contains("|")) {
                        break;
                    }
                    if ((bauy.f101849a & 32) != 0) {
                        bzny bzny = bauy.f101855g;
                        if (bzny == null) {
                            bzny = bzny.f170777b;
                        }
                        if (!baxv.m87681a(bzny)) {
                            break;
                        }
                        String str2 = bavd.f101873c;
                        if (bbfe.m87922a(bauy)) {
                            if (ceni.f183073a.mo6606a().mo79436m()) {
                                bzny bzny2 = bauy.f101855g;
                                if (bzny2 == null) {
                                    bzny2 = bzny.f170777b;
                                }
                                if (bzny2.f170779a.size() <= 1) {
                                    bzny bzny3 = bauy.f101855g;
                                    if (bzny3 == null) {
                                        bzny3 = bzny.f170777b;
                                    }
                                    bznx bznx = (bznx) bzny3.f170779a.get(0);
                                    if (bznx.f170775a == 4) {
                                        bznz = (bznz) bznx.f170776b;
                                    } else {
                                        bznz = bznz.f170780c;
                                    }
                                    if (!"*".equals(bznz.f170783b)) {
                                        bbev.m87906a("Download zip folder transform can only have * as target. Group = %s, file id = %s", str2, bauy.f101850b);
                                        break;
                                    }
                                } else {
                                    bbev.m87906a("Download zip folder transform cannot not be applied with other transforms. Group = %s, file id = %s", str2, bauy.f101850b);
                                    break;
                                }
                            } else {
                                bbev.m87906a("Feature enableZipFolder is not enabled. Group = %s, file id = %s", str2, bauy.f101850b);
                                break;
                            }
                        }
                        int a3 = baux.m87590a(bauy.f101853e);
                        if ((a3 == 0 || a3 != 2) && (bauy.f101849a & 64) == 0) {
                            bbev.m87906a("Download checksum must be provided. Group = %s, file id = %s", bavd.f101873c, bauy.f101850b);
                            break;
                        }
                    }
                    if ((bauy.f101849a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        bzny bzny4 = bauy.f101858j;
                        if (bzny4 == null) {
                            bzny4 = bzny.f170777b;
                        }
                        if (!baxv.m87681a(bzny4)) {
                            break;
                        }
                    }
                    String str3 = bavd.f101873c;
                    bxwc bxwc3 = bauy.f101859k;
                    int size2 = bxwc3.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            bxwc = bxwc2;
                            i = size;
                            z4 = true;
                            break;
                        }
                        bxwc = bxwc2;
                        bavg bavg = (bavg) bxwc3.get(i3);
                        bxwc bxwc4 = bxwc3;
                        if (bavg.f101887b.isEmpty() || bavg.f101887b.contains("|") || (bavg.f101886a & 2) == 0 || bavg.f101888c < 0 || bavg.f101889d.isEmpty() || bavg.f101889d.contains("|") || (bavg.f101886a & 8) == 0) {
                            i = size;
                        } else {
                            int a4 = bavf.m87598a(bavg.f101890e);
                            if (a4 == 0) {
                                i = size;
                                z5 = false;
                            } else {
                                i = size;
                                if (!(a4 == 1 || (bavg.f101886a & 16) == 0)) {
                                    bauv bauv = bavg.f101891f;
                                    if (bauv == null) {
                                        bauv = bauv.f101842b;
                                    }
                                    if (!bauv.f101844a.isEmpty()) {
                                        bauv bauv2 = bavg.f101891f;
                                        if (bauv2 == null) {
                                            bauv2 = bauv.f101842b;
                                        }
                                        if (!bauv2.f101844a.contains("|")) {
                                            z5 = true;
                                        }
                                    }
                                    z5 = false;
                                }
                            }
                            i3++;
                            if (z5) {
                                bbev.m87910b("%s Delta File of Datafile details missing in added group = %s, file id = %s, delta file UrlToDownload = %s.", "DataFileGroupValidator", str3, bauy.f101850b, bavg.f101887b);
                                z4 = false;
                                break;
                            }
                            bxwc3 = bxwc4;
                            bxwc2 = bxwc;
                            size = i;
                        }
                        z5 = false;
                        i3++;
                        if (z5) {
                        }
                    }
                    i2++;
                    if (!z4) {
                        break;
                    }
                    bxwc2 = bxwc;
                    size = i;
                } else {
                    int i4 = 0;
                    loop2:
                    while (true) {
                        if (i4 < bavd.f101880j.size()) {
                            int i5 = i4 + 1;
                            for (int i6 = i5; i6 < bavd.f101880j.size(); i6++) {
                                if (((bauy) bavd.f101880j.get(i4)).f101850b.equals(((bauy) bavd.f101880j.get(i6)).f101850b)) {
                                    bbev.m87910b("%s Repeated file id in added group = %s, file id = %s", "DataFileGroupValidator", bavd.f101873c, ((bauy) bavd.f101880j.get(i4)).f101850b);
                                    break loop2;
                                }
                            }
                            i4 = i5;
                        } else {
                            bavn bavn = bavd.f101879i;
                            if (bavn == null) {
                                bavn = bavn.f101895f;
                            }
                            int a5 = bavk.m87603a(bavn.f101899c);
                            if (a5 != 0 && a5 == 3) {
                                bavn bavn2 = bavd.f101879i;
                                if (bavn2 == null) {
                                    bavn2 = bavn.f101895f;
                                }
                                if (bavn2.f101900d <= 0) {
                                    bbev.m87905a("%s For DOWNLOAD_FIRST_ON_WIFI_THEN_ON_ANY_NETWORK policy, the download_first_on_wifi_period_secs must be > 0", "DataFileGroupValidator");
                                }
                            }
                            if (!bbbb.m87768a(context) && (a = bavb.m87594a(bavd.f101876f)) != 0 && a == 3) {
                                bbev.m87905a("%s For AllowedReaders ALL_APPS policy, the device should be migrated to new key", "DataFileGroupValidator");
                            } else {
                                bxwc bxwc5 = bavd.f101880j;
                                int size3 = bxwc5.size();
                                int i7 = 0;
                                while (true) {
                                    if (i7 < size3) {
                                        int a6 = baux.m87590a(((bauy) bxwc5.get(i7)).f101853e);
                                        if (a6 == 0) {
                                            a6 = 1;
                                        }
                                        i7++;
                                        if (a6 == 2) {
                                            bxvd bxvd = (bxvd) bavd.mo74142c(5);
                                            bxvd.mo73625a((bxvk) bavd);
                                            bavc bavc = (bavc) bxvd;
                                            if (bavc.f164950c) {
                                                bavc.mo74035c();
                                                bavc.f164950c = false;
                                            }
                                            bavd bavd2 = bavd.f101869m;
                                            ((bavd) bavc.f164949b).f101880j = bxvk.m124030de();
                                            bxwc bxwc6 = bavd.f101880j;
                                            int size4 = bxwc6.size();
                                            for (int i8 = 0; i8 < size4; i8++) {
                                                bauy bauy2 = (bauy) bxwc6.get(i8);
                                                int a7 = baux.m87590a(bauy2.f101853e);
                                                if (a7 == 0) {
                                                    a7 = 1;
                                                }
                                                if (a7 - 1 != 0) {
                                                    bxvd bxvd2 = (bxvd) bauy2.mo74142c(5);
                                                    bxvd2.mo73625a((bxvk) bauy2);
                                                    String str4 = bauy2.f101851c;
                                                    MessageDigest a8 = bbeh.m87881a("SHA1");
                                                    if (a8 != null) {
                                                        byte[] bytes = str4.getBytes();
                                                        a8.update(bytes, 0, bytes.length);
                                                        str = bbeh.m87880a(a8.digest());
                                                    } else {
                                                        str = "";
                                                    }
                                                    if (!bbfe.m87922a(bauy2)) {
                                                        if (bxvd2.f164950c) {
                                                            bxvd2.mo74035c();
                                                            bxvd2.f164950c = false;
                                                        }
                                                        bauy bauy3 = (bauy) bxvd2.f164949b;
                                                        bauy bauy4 = bauy.f101847l;
                                                        str.getClass();
                                                        bauy3.f101849a |= 16;
                                                        bauy3.f101854f = str;
                                                    } else {
                                                        if (bxvd2.f164950c) {
                                                            bxvd2.mo74035c();
                                                            bxvd2.f164950c = false;
                                                        }
                                                        bauy bauy5 = (bauy) bxvd2.f164949b;
                                                        bauy bauy6 = bauy.f101847l;
                                                        str.getClass();
                                                        bauy5.f101849a |= 64;
                                                        bauy5.f101856h = str;
                                                    }
                                                    bauy bauy7 = (bauy) bxvd2.f164949b;
                                                    bavc.mo55990a((bauy) bxvd2.mo74062i());
                                                } else {
                                                    bavc.mo55990a(bauy2);
                                                }
                                            }
                                            bavd = (bavd) bavc.mo74062i();
                                        }
                                    }
                                }
                                try {
                                    bbav bbav = bbch.f102317d;
                                    if (bbfe.m87921a(bbfe.m87919a(bavd), bbav.f102249f)) {
                                        bbev.m87906a("%s: Trying to add expired group %s.", "FileGroupManager", bavr.f101919b);
                                        bbav.f102245b.mo34980a(1048, bavd.f101873c, bavd.f101875e);
                                        throw new bayh();
                                    } else if (bbav.mo56049a(bavr.f101920c)) {
                                        bqgg a9 = bqga.m112775a((Object) null);
                                        if (ceni.m137521e()) {
                                            bavn bavn3 = bavd.f101879i;
                                            if (bavn3 == null) {
                                                bavn3 = bavn.f101895f;
                                            }
                                            int a10 = bavi.m87601a(bavn3.f101901e);
                                            if (a10 != 0) {
                                                if (a10 == 2) {
                                                    a9 = bqdx.m112674a(bbav.f102247d.mo56057c(bavr), new bayi(bbav, bavr, bavd), bbav.f102251h);
                                                }
                                            }
                                        }
                                        return bqdx.m112674a(bqdx.m112674a(bqdx.m112674a(bqfl.m112747c(a9), new bayt(bbav, bavr, bavd), bbav.f102251h), new baze(bbav, bavr, bavd), bbav.f102251h), new bbbu(bbch, bavr, bavd), bbch.f102327n);
                                    } else {
                                        bbev.m87910b("%s: Trying to add group %s for uninstalled app %s.", "FileGroupManager", bavr.f101919b, bavr.f101920c);
                                        bbav.f102245b.mo34980a(1042, bavd.f101873c, bavd.f101875e);
                                        throw new bbde();
                                    }
                                } catch (baxu | bayh | bbde e) {
                                    bbev.m87912c("%s %s", "MDDManager", e.getClass());
                                    return bqga.m112777a(e);
                                } catch (IOException e2) {
                                    bbev.m87906a("%s %s", "MDDManager", e2.getClass());
                                    bbch.f102322i.mo55999a("Failed to add group to MDD", e2);
                                    return bqga.m112777a((Throwable) e2);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            bbev.m87906a("%s Owner package = %s contains '|'", "DataFileGroupValidator", bavd.f101874d);
        }
        bbch.f102316c.mo34980a(1020, bavd.f101873c, bavd.f101875e);
        return bqga.m112775a((Object) false);
    }
}
