package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: acst */
public final /* synthetic */ class acst implements bqeh {

    /* renamed from: a */
    private final acsx f60701a;

    /* renamed from: b */
    private final acxq f60702b;

    public acst(acsx acsx, acxq acxq) {
        this.f60701a = acsx;
        this.f60702b = acxq;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011c, code lost:
        if (r0.f191695c.equals(r5.mo33054a()) != false) goto L_0x015b;
     */
    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        actf actf;
        long j;
        cixm cixm;
        acsx acsx = this.f60701a;
        acxq acxq = this.f60702b;
        bdwj bdwj = (bdwj) obj;
        acsh acsh = acsx.f60709d;
        abuu abuu = acxq.f61046a;
        boolean z = abuu.f58481k;
        abuy a = abuy.m48299a(abuu.f58478h);
        if (a == null) {
            a = abuy.GENERAL_USE;
        }
        boolean a2 = acxq.mo33218a();
        abuu abuu2 = acxq.f61046a;
        long j2 = abuu2.f58477g;
        String str = abuu2.f58472b;
        String str2 = abuu2.f58475e;
        abqe abqe = abuu2.f58479i;
        if (abqe == null) {
            abqe = abqe.f57949g;
        }
        if (!z) {
            if (a != abuy.GENERAL_USE && a != abuy.FIREBASE_USER_ACTIONS_USE) {
                absg.m48202d("Usage type: %s not allowed for upload", a);
            } else if (a2 && acsh.mo33055b() && acsh.mo33055b()) {
                if (j2 < acsh.f60675c.longValue()) {
                    absg.m48203d("Report was created at %d, before current sign in at %d", Long.valueOf(j2), acsh.f60675c);
                } else {
                    abyv c = acsh.f60673a.mo32505c(str);
                    if (!celu.f182917a.mo6606a().mo79284a()) {
                        absg.m48201d("Feature flag to tie upload to data sharing ui is not enabled.");
                    } else if (!c.mo32468a(str, acsh.f60673a.f58772a.mo32490a())) {
                        absg.m48203d("Data sharing is not enabled for %s corpus in %s", str2, str);
                    }
                    if (!acsh.m49798a(str, acsh.f60674b)) {
                        int i = 4;
                        int i2 = 0;
                        if (celu.m137198b()) {
                            bxwc bxwc = abqe.f57955e;
                            int size = bxwc.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size) {
                                    break;
                                }
                                abqd abqd = (abqd) bxwc.get(i3);
                                abqo abqo = abqd.f57948d;
                                if (abqo == null) {
                                    abqo = abqo.f57975r;
                                }
                                if (".private:action".equals(abqo.f57988m)) {
                                    try {
                                        ByteString bxtx = abqd.f57947c;
                                        bxus c2 = bxus.m123744c();
                                        cixm cixm2 = cixm.f191686d;
                                        try {
                                            bxuc h = bxtx.mo73764h();
                                            GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) cixm2.mo74142c(i);
                                            bxxv a3 = bxxm.f165037a.mo74228a(GeneratedMessageLite);
                                            a3.mo74220a(GeneratedMessageLite, bxud.m123454a(h), c2);
                                            a3.mo74225d(GeneratedMessageLite);
                                            h.mo73787a(i2);
                                            GeneratedMessageLite.m124027b(GeneratedMessageLite);
                                            bxwc bxwc2 = ((cixm) GeneratedMessageLite).f191690c;
                                            int size2 = bxwc2.size();
                                            int i4 = 0;
                                            while (i4 < size2) {
                                                cixk cixk = (cixk) bxwc2.get(i4);
                                                i4++;
                                                if ("account".equals(cixk.f191684b)) {
                                                    cixn cixn = cixk.f191685c;
                                                    if (cixn == null) {
                                                        cixn = cixn.f191691g;
                                                    }
                                                }
                                            }
                                            continue;
                                        } catch (IOException e) {
                                            if (!(e.getCause() instanceof bxwf)) {
                                                throw new bxwf(e.getMessage());
                                            }
                                            throw ((bxwf) e.getCause());
                                        } catch (RuntimeException e2) {
                                            if (e2.getCause() instanceof bxwf) {
                                                throw ((bxwf) e2.getCause());
                                            }
                                            throw e2;
                                        } catch (bxwf e3) {
                                            throw e3;
                                        } catch (bxwf e4) {
                                            throw e4;
                                        }
                                    } catch (bxwf e5) {
                                        absg.m48191b("Failed to parse schemaOrgAction proto.");
                                    }
                                }
                                i3++;
                                i = 4;
                                i2 = 0;
                            }
                        }
                        PackageManager packageManager = acsx.f60706a.getPackageManager();
                        if (acsx.f60710e == null) {
                            if (!acsx.f60711f.mo33066a().contains("ActionsUploadSalt")) {
                                acsx.f60711f.mo33066a().edit().putLong("ActionsUploadSalt", new SecureRandom().nextLong() & Long.MAX_VALUE).commit();
                            }
                            acsx.f60710e = new acsz(acsx.f60711f.mo33066a().getLong("ActionsUploadSalt", -1));
                        }
                        acsz acsz = acsx.f60710e;
                        if (acsx.f60707b == null) {
                            Integer valueOf = Integer.valueOf(spn.m35881e(acsx.f60706a));
                            Integer num = valueOf.intValue() != -1 ? valueOf : null;
                            Context context = acsx.f60706a;
                            acsx.f60707b = spn.m35846a(context, false, null, packageManager.getPackageInfo(context.getPackageName(), 0).versionCode, num, null, null);
                        }
                        cafx cafx = acsx.f60707b;
                        bxvd da = actd.f60721f.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        actd actd = (actd) da.f164949b;
                        cafx.getClass();
                        actd.f60727d = cafx;
                        actd.f60724a |= 4;
                        String str3 = acxq.f61046a.f58472b;
                        bxvd da2 = actg.f60738e.mo74144da();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        actg actg = (actg) da2.f164949b;
                        str3.getClass();
                        actg.f60740a |= 1;
                        actg.f60741b = str3;
                        int i5 = Build.VERSION.SDK_INT;
                        PackageInfo packageInfo = packageManager.getPackageInfo(str3, 134217728);
                        long longVersionCode = packageInfo.getLongVersionCode();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        actg actg2 = (actg) da2.f164949b;
                        actg2.f60740a |= 2;
                        actg2.f60742c = longVersionCode;
                        SigningInfo signingInfo = packageInfo.signingInfo;
                        if (signingInfo == null) {
                            actf = actf.f60734c;
                        } else if (signingInfo.hasMultipleSigners()) {
                            bxvd da3 = actf.f60734c.mo74144da();
                            bngx a4 = acsz.m49824a(signingInfo.getApkContentsSigners());
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            actf actf2 = (actf) da3.f164949b;
                            if (!actf2.f60736a.mo73666a()) {
                                actf2.f60736a = GeneratedMessageLite.m124021a(actf2.f60736a);
                            }
                            bxsy.m123078a(a4, actf2.f60736a);
                            actf = (actf) da3.mo74062i();
                        } else {
                            bxvd da4 = actf.f60734c.mo74144da();
                            bngx a5 = acsz.m49824a(signingInfo.getSigningCertificateHistory());
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            actf actf3 = (actf) da4.f164949b;
                            if (!actf3.f60737b.mo73666a()) {
                                actf3.f60737b = GeneratedMessageLite.m124021a(actf3.f60737b);
                            }
                            bxsy.m123078a(a5, actf3.f60737b);
                            actf = (actf) da4.mo74062i();
                        }
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        actg actg3 = (actg) da2.f164949b;
                        actf.getClass();
                        actg3.f60743d = actf;
                        actg3.f60740a |= 4;
                        actg actg4 = (actg) da2.mo74062i();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        actd actd2 = (actd) da.f164949b;
                        actg4.getClass();
                        actd2.f60726c = actg4;
                        actd2.f60724a |= 2;
                        String str4 = acxq.f61046a.f58472b;
                        String str5 = acxq.mo33219b().f57953c;
                        if (cenc.f183045a.mo6606a().mo79406i()) {
                            j = TimeUnit.MILLISECONDS.toSeconds(acxq.f61046a.f58477g);
                        } else {
                            j = acxq.f61046a.f58477g;
                        }
                        UUID nameUUIDFromBytes = UUID.nameUUIDFromBytes(String.format(Locale.US, "%s-%s-%d-%d", str4, str5, Long.valueOf(j), Long.valueOf(acsz.f60715a)).getBytes());
                        ByteString a6 = ByteString.m123261a(ByteBuffer.allocate(16).putLong(nameUUIDFromBytes.getMostSignificantBits()).putLong(nameUUIDFromBytes.getLeastSignificantBits()).array());
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        actd actd3 = (actd) da.f164949b;
                        a6.getClass();
                        actd3.f60724a |= 8;
                        actd3.f60728e = a6;
                        abuu abuu3 = acxq.f61046a;
                        abqe b = acxq.mo33219b();
                        actb actb = new actb(b);
                        caee caee = (caee) caef.f172809f.mo74144da();
                        String str6 = b.f57953c;
                        if (caee.f164950c) {
                            caee.mo74035c();
                            caee.f164950c = false;
                        }
                        caef caef = (caef) caee.f164949b;
                        str6.getClass();
                        caef.f172811a |= 2;
                        caef.f172813c = str6;
                        acsz.m49827a(caee, "sameAs", actb.mo33068b("url"));
                        caee caee2 = (caee) caef.f172809f.mo74144da();
                        acsz.m49827a(caee2, "action", actb.mo33067a("intent_action"));
                        acsz.m49827a(caee2, "data", actb.mo33067a("intent_data"));
                        acsz.m49827a(caee2, "activity", actb.mo33067a("intent_activity"));
                        caee caee3 = (caee) caef.f172809f.mo74144da();
                        acsz.m49827a(caee3, "data", actb.mo33067a("intent_extra_data"));
                        acsz.m49826a(caee2, "extra", (caef) caee3.mo74062i());
                        acsz.m49826a(caee, "intent", (caef) caee2.mo74062i());
                        acsz.m49827a(caee, "name", actb.mo33068b("name"));
                        acsz.m49825a(caee, "timestampMs", abuu3.f58477g, abuu.f58469m.f58477g);
                        abuy a7 = abuy.m48299a(abuu3.f58478h);
                        if (a7 == null) {
                            a7 = abuy.GENERAL_USE;
                        }
                        long j3 = (long) a7.f58502g;
                        abuy a8 = abuy.m48299a(abuu.f58469m.f58478h);
                        if (a8 == null) {
                            a8 = abuy.GENERAL_USE;
                        }
                        acsz.m49825a(caee, "usageType", j3, (long) a8.f58502g);
                        abtc a9 = abtc.m48241a(abuu3.f58482l);
                        if (a9 == null) {
                            a9 = abtc.UNKNOWN;
                        }
                        long j4 = (long) a9.f58200d;
                        abtc a10 = abtc.m48241a(abuu.f58469m.f58482l);
                        if (a10 == null) {
                            a10 = abtc.UNKNOWN;
                        }
                        acsz.m49825a(caee, "eventStatus", j4, (long) a10.f58200d);
                        ByteString c3 = actb.mo33069c(".private:action");
                        try {
                            bxus c4 = bxus.m123744c();
                            cixm cixm3 = cixm.f191686d;
                            try {
                                bxuc h2 = c3.mo73764h();
                                GeneratedMessageLite GeneratedMessageLite2 = (GeneratedMessageLite) cixm3.mo74142c(4);
                                bxxv a11 = bxxm.f165037a.mo74228a(GeneratedMessageLite2);
                                a11.mo74220a(GeneratedMessageLite2, bxud.m123454a(h2), c4);
                                a11.mo74225d(GeneratedMessageLite2);
                                h2.mo73787a(0);
                                GeneratedMessageLite.m124027b(GeneratedMessageLite2);
                                cixm = (cixm) GeneratedMessageLite2;
                                acsz.m49827a(caee, "additionalType", cixm.f191689b);
                                caee.mo74632a(acta.m49828a(cixm).f172814d);
                                caef caef2 = (caef) caee.mo74062i();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                actd actd4 = (actd) da.f164949b;
                                caef2.getClass();
                                actd4.f60725b = caef2;
                                actd4.f60724a |= 1;
                                actd actd5 = (actd) da.mo74062i();
                                acsw acsw = acsx.f60708c;
                                bxvd da5 = bxbp.f162718e.mo74144da();
                                if (da5.f164950c) {
                                    da5.mo74035c();
                                    da5.f164950c = false;
                                }
                                bxbp bxbp = (bxbp) da5.f164949b;
                                int i6 = bxbp.f162720a | 1;
                                bxbp.f162720a = i6;
                                bxbp.f162721b = 2099;
                                bxbp.f162720a = i6 | 2;
                                bxbp.f162722c = 220671791;
                                bxvf bxvf = (bxvf) bygn.f166357a.mo74144da();
                                bxvf.mo74125a(actd.f60722g, actd5);
                                if (da5.f164950c) {
                                    da5.mo74035c();
                                    da5.f164950c = false;
                                }
                                bxbp bxbp2 = (bxbp) da5.f164949b;
                                bygn bygn = (bygn) bxvf.mo74062i();
                                bygn.getClass();
                                bxbp2.f162723d = bygn;
                                bxbp2.f162720a |= 32;
                                acsw.f60704a.add((bxbp) da5.mo74062i());
                                int i7 = acsw.f60705b;
                                int i8 = actd5.f164961ai;
                                if (i8 == -1) {
                                    i8 = bxxm.f165037a.mo74228a(actd5).mo74223b(actd5);
                                    actd5.f164961ai = i8;
                                }
                                acsw.f60705b = i7 + i8;
                                acsw acsw2 = acsx.f60708c;
                                if (acsw2.f60704a.size() < 10 && acsw2.f60705b < 50000) {
                                    return bqga.m112775a((Object) null);
                                }
                                return acsx.mo33064a(bdwj);
                            } catch (IOException e6) {
                                if (!(e6.getCause() instanceof bxwf)) {
                                    throw new bxwf(e6.getMessage());
                                }
                                throw ((bxwf) e6.getCause());
                            } catch (RuntimeException e7) {
                                if (e7.getCause() instanceof bxwf) {
                                    throw ((bxwf) e7.getCause());
                                }
                                throw e7;
                            } catch (bxwf e8) {
                                throw e8;
                            } catch (bxwf e9) {
                                throw e9;
                            }
                        } catch (bxwf e10) {
                            absg.m48191b("Failed to parse schemaOrgAction proto.");
                            cixm = cixm.f191686d;
                        }
                    }
                }
            }
        }
        absg.m48184a("Report is ineligible for upload. Skipping");
        return bqga.m112775a((Object) null);
    }
}
