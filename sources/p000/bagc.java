package p000;

import android.accounts.Account;
import com.google.android.gms.libs.vcdiff.VcDiffEncoderDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: bagc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bagc {
    /* renamed from: a */
    public static byia m86829a(Account account, bygz bygz, byjj byjj, baok baok, boolean z, babr babr) {
        byif byif;
        bxvd da = byia.f166539f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byia byia = (byia) da.f164949b;
        bygz.getClass();
        byia.f166542b = bygz;
        int i = byia.f166541a | 1;
        byia.f166541a = i;
        byjj.getClass();
        byia.f166544d = byjj;
        byia.f166541a = i | 4;
        if (z) {
            bxvd da2 = byhz.f166535c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            byhz byhz = (byhz) da2.f164949b;
            byhz.f166537a |= 1;
            byhz.f166538b = true;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byia byia2 = (byia) da.f164949b;
            byhz byhz2 = (byhz) da2.mo74062i();
            byhz2.getClass();
            byia2.f166545e = byhz2;
            byia2.f166541a |= 8;
        }
        if (babr.mo32675G()) {
            bxvd da3 = byhe.f166435c.mo74144da();
            ArrayList arrayList = new ArrayList();
            for (baog baog : baok.mo55826a(account, bygz)) {
                bygx e = baog.mo55818e();
                if (e != null && e.f166403a == 1) {
                    bxvd da4 = byir.f166595b.mo74144da();
                    if (e.f166403a != 1) {
                        byif = byif.f166558b;
                    } else {
                        byif = (byif) e.f166404b;
                    }
                    bxwc bxwc = byif.f166560a;
                    int size = bxwc.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byja byja = (byja) bxwc.get(i2);
                        bxvd da5 = byit.f166599d.mo74144da();
                        int a = byiz.m124863a(byja.f166628c);
                        if (a == 0) {
                            a = 1;
                        }
                        int i3 = a - 1;
                        if (i3 == 0) {
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            byit byit = (byit) da5.f164949b;
                            byit.f166603c = 0;
                            byit.f166601a |= 2;
                        } else if (i3 != 1) {
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            byit byit2 = (byit) da5.f164949b;
                            byit2.f166603c = 2;
                            byit2.f166601a |= 2;
                        } else {
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            byit byit3 = (byit) da5.f164949b;
                            byit3.f166603c = 1;
                            byit3.f166601a |= 2;
                        }
                        if ((byja.f166626a & 1) != 0) {
                            ByteString bxtx = byja.f166627b;
                            byit byit4 = (byit) da5.f164949b;
                            bxtx.getClass();
                            byit4.f166601a |= 1;
                            byit4.f166602b = bxtx;
                        }
                        byit byit5 = (byit) da5.mo74062i();
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        byir byir = (byir) da4.f164949b;
                        byit5.getClass();
                        byir.mo74384c();
                        byir.f166597a.add(byit5);
                    }
                    arrayList.add((byir) da4.mo74062i());
                }
            }
            bxvd da6 = byig.f166561b.mo74144da();
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            byig byig = (byig) da6.f164949b;
            if (!byig.f166563a.mo73666a()) {
                byig.f166563a = GeneratedMessageLite.m124021a(byig.f166563a);
            }
            bxsy.m123078a(arrayList, byig.f166563a);
            byig byig2 = (byig) da6.mo74062i();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            byhe byhe = (byhe) da3.f164949b;
            byig2.getClass();
            byhe.f166438b = byig2;
            byhe.f166437a = 3;
            byhe byhe2 = (byhe) da3.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byia byia3 = (byia) da.f164949b;
            byhe2.getClass();
            byia3.f166543c = byhe2;
            byia3.f166541a |= 2;
        }
        return (byia) da.mo74062i();
    }

    /* renamed from: a */
    private static void m86830a(bafl bafl, bany bany, byhi byhi) {
        bafl.mo55670a(bany, bafl.mo55665a(byhi.f166455c), byhi.f166456d, byhi.f166454b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02cf, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02d4, code lost:
        if (r0.f166412a != 2) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02d6, code lost:
        r0 = (p000.byhn) r0.f166413b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02db, code lost:
        r0 = p000.byhn.f166478e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02dd, code lost:
        ((p000.achw) r26.mo16713a()).mo25409a("Downloaded %d changes to the local %s/%s InternalFootprintsLatestOnlySyncVariant.", java.lang.Integer.valueOf(r23.size()), java.lang.Integer.valueOf(r0.f166481b), java.lang.Integer.valueOf(r0.f166482c));
        r33.mo55899b((long) r1.f166549a.size());
        r33.mo55897a(r21, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0319, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0324, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0298, code lost:
        r23 = r13;
        r21 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        r3 = r1.f166550b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02a1, code lost:
        if (r3 != null) goto L_0x02a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r3 = p000.byjj.f166658c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r2.mo55671a(r10, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02ba, code lost:
        r24 = r8;
        r15 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        r29.mo55669a(r10, p000.badj.f100528b, r30.longValue(), r32.intValue(), r31.longValue(), r1.f166552d);
        r15.mo55796b();
     */
    /* renamed from: a */
    public static void m86831a(cayo cayo, bygz bygz, byid byid, bafl bafl, Long l, Long l2, Integer num, bara bara) {
        bany bany;
        Throwable th;
        bxwc bxwc;
        long j;
        Iterator it;
        byhi byhi;
        byhi byhi2;
        byhj byhj;
        byte[] a;
        bygz bygz2 = bygz;
        byid byid2 = byid;
        bafl bafl2 = bafl;
        bxwc bxwc2 = byid2.f166549a;
        int i = byid2.f164961ai;
        int i2 = -1;
        if (i == -1) {
            i = bxxm.f165037a.mo74228a(byid2).mo74223b(byid2);
            byid2.f164961ai = i;
        }
        long j2 = (long) i;
        bany b = bafl.mo55677c().mo55799b();
        try {
            if (bafl.mo55674b().mo55763a(b)) {
                Iterator it2 = bxwc2.iterator();
                long j3 = j2;
                while (true) {
                    int i3 = 1;
                    if (!it2.hasNext()) {
                        break;
                    }
                    try {
                        bygu bygu = (bygu) it2.next();
                        int a2 = bygt.m124796a(bygu.f166387d);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        int i4 = a2 + i2;
                        if (i4 == 1) {
                            it = it2;
                            bxwc = bxwc2;
                            j = j2;
                            bafl2.mo55668a(b);
                            bara.mo55900c();
                        } else if (i4 == 2) {
                            it = it2;
                            bxwc = bxwc2;
                            j = j2;
                            if (bygu.f166385b == 4) {
                                byhi = (byhi) bygu.f166386c;
                            } else {
                                byhi = byhi.f166451f;
                            }
                            m86830a(bafl2, b, byhi);
                        } else if (i4 == 3) {
                            String valueOf = String.valueOf(bygz);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
                            sb.append("Unsupported change type DELETE while syncing channel ");
                            sb.append(valueOf);
                            throw new bapa(sb.toString());
                        } else if (i4 == 4) {
                            int i5 = bygu.f166385b;
                            if (i5 == 6) {
                                byhj = (byhj) bygu.f166386c;
                                ByteString bxtx = byhj.f166463d;
                                badi b2 = badj.m86640b();
                                it = it2;
                                b2.mo55646a(bxtx.getKey(), 1);
                                List a3 = bafl2.mo55667a(b, b2.mo55645a(), null);
                                if (a3.size() == 1) {
                                    a = ((badk) a3.get(0)).mo55612a();
                                    byte[] a4 = VcDiffEncoderDecoder.m66817a(a, byhj.f166464e.getKey());
                                    bxvd da = byhi.f166451f.mo74144da();
                                    ByteString bxtx2 = byhj.f166463d;
                                    j = j2;
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    byhi byhi3 = (byhi) da.f164949b;
                                    bxtx2.getClass();
                                    int i6 = byhi3.f166453a | 2;
                                    byhi3.f166453a = i6;
                                    byhi3.f166455c = bxtx2;
                                    bxwc = bxwc2;
                                    long j4 = byhj.f166462c;
                                    byhi3.f166453a = i6 | 1;
                                    byhi3.f166454b = j4;
                                    ByteString a5 = bxtx.m123261a(a4);
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    byhi byhi4 = (byhi) da.f164949b;
                                    a5.getClass();
                                    byhi4.f166453a |= 4;
                                    byhi4.f166456d = a5;
                                    byhi2 = (byhi) da.mo74062i();
                                    ByteString a6 = bafi.m86739a(byhi2);
                                    if (!byhj.f166465f.equals(a6)) {
                                        achw achw = (achw) cayo.mo16713a();
                                        Object[] objArr = {bafi.m86744a(byhi2.f166455c), bafi.m86744a(byhi2.f166456d), bafi.m86744a(bxtx.m123261a(a)), bafi.m86744a(a6), bafi.m86744a(byhj.f166465f)};
                                        throw new baow("Footprint checksum after applying delta differs from expected delta!");
                                    }
                                } else {
                                    achw achw2 = (achw) cayo.mo16713a();
                                    new Object[1][0] = bafi.m86744a(bxtx);
                                    throw new baow("Delta target footprint not found!");
                                }
                            } else {
                                it = it2;
                                bxwc = bxwc2;
                                j = j2;
                                byhi2 = i5 == 4 ? (byhi) bygu.f166386c : byhi.f166451f;
                            }
                            m86830a(bafl2, b, byhi2);
                            if (bygu.f166385b == 6) {
                                byhj byhj2 = (byhj) bygu.f166386c;
                                int i7 = byhj2.f164961ai;
                                if (i7 == -1) {
                                    i7 = bxxm.f165037a.mo74228a(byhj2).mo74223b(byhj2);
                                    byhj2.f164961ai = i7;
                                }
                                long j5 = j3 - ((long) i7);
                                int i8 = byhi2.f164961ai;
                                if (i8 == -1) {
                                    i8 = bxxm.f165037a.mo74228a(byhi2).mo74223b(byhi2);
                                    byhi2.f164961ai = i8;
                                }
                                j3 = j5 + ((long) i8);
                            }
                        } else if (i4 != 5) {
                            int a7 = bygt.m124796a(bygu.f166387d);
                            if (a7 != 0) {
                                i3 = a7;
                            }
                            String valueOf2 = String.valueOf(bygt.m124797b(i3));
                            String valueOf3 = String.valueOf(bygz);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 47 + String.valueOf(valueOf3).length());
                            sb2.append("Got unknown change type ");
                            sb2.append(valueOf2);
                            sb2.append(" while syncing channel ");
                            sb2.append(valueOf3);
                            throw new bapa(sb2.toString());
                        } else {
                            String valueOf4 = String.valueOf(bygz);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 59);
                            sb3.append("Unsupported change type DELETE_RANGE while syncing channel ");
                            sb3.append(valueOf4);
                            throw new bapa(sb3.toString());
                        }
                        it2 = it;
                        j2 = j;
                        bxwc2 = bxwc;
                        i2 = -1;
                    } catch (aefa e) {
                        throw new badv(e);
                    } catch (badv e2) {
                        achw achw3 = (achw) cayo.mo16713a();
                        Object[] objArr2 = {bafi.m86744a(byhj.f166463d), bafi.m86744a(ByteString.m123261a(a)), bafi.m86744a(byhj.f166464e)};
                        throw new baow("Decoding failed when trying to apply delta on footprint!", e2);
                    } catch (Throwable th2) {
                        th = th2;
                        bany = b;
                        try {
                            bany.close();
                        } catch (Throwable th3) {
                            bqye.m113761a(th, th3);
                        }
                        throw th;
                    }
                }
            } else {
                bany = b;
                throw new baqd("GetChanges aborted due to pending local changes", 3);
            }
        } catch (Throwable th4) {
            th = th4;
            bany = b;
            th = th;
            bany.close();
            throw th;
        }
    }
}
