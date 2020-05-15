package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: acss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acss {
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ae  */
    /* renamed from: a */
    public static acsn m49815a(Context context, acao acao, abqv abqv, NativeIndex nativeIndex, abzo abzo, abym abym, bdsg bdsg) {
        bdry bdry;
        bdsg bdsg2 = bdsg;
        Account a = m49817a(context, acao.mo32592a());
        File file = new File(acsq.m49814a(context), "deletions");
        bdqz a2 = m49818a(context, a, 12804);
        bdse bdse = new bdse();
        bdse.f106343a = file;
        bdqu a3 = bdqu.m91313a(context, "icing-user-actions");
        if (a3 != null) {
            bdse.f106344b = a3;
            bdse.f106345c = a;
            bdse.f106346d = 2099;
            bdse.f106347e = 220671791;
            bdse.f106348f = Integer.valueOf(abzm.f58810a);
            bdse.f106349g = 10;
            bdse.f106350h = 7;
            String str = bdse.f106343a == null ? " storageDirectory" : "";
            if (bdse.f106344b == null) {
                str = str.concat(" applicationId");
            }
            if (bdse.f106345c == null) {
                str = String.valueOf(str).concat(" account");
            }
            if (bdse.f106346d == null) {
                str = String.valueOf(str).concat(" corpus");
            }
            if (bdse.f106347e == null) {
                str = String.valueOf(str).concat(" datatype");
            }
            if (bdse.f106348f == null) {
                str = String.valueOf(str).concat(" deviceTtlSec");
            }
            if (bdse.f106349g == null) {
                str = String.valueOf(str).concat(" pushPayloadMaxCount");
            }
            if (bdse.f106350h == null) {
                str = String.valueOf(str).concat(" pushPayloadMaxAgeDays");
            }
            if (!str.isEmpty()) {
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
            }
            bdrq bdrq = new bdrq(bdse.f106343a, bdse.f106344b, bdse.f106345c, bdse.f106346d.intValue(), bdse.f106347e.intValue(), bdse.f106348f.intValue(), bdse.f106349g.intValue(), bdse.f106350h.intValue());
            File file2 = bdrq.f106316a;
            boolean z = false;
            try {
                if (!file2.exists()) {
                    if (file2.mkdir()) {
                        z = true;
                    } else {
                        throw new bdrc("Could not create storage directory.");
                    }
                }
                try {
                    File file3 = new File(bdrq.f106316a, "deletions.db");
                    TimeUnit timeUnit = TimeUnit.DAYS;
                    ayte ayte = bdsg2.f106352b;
                    bdtn a4 = bdtn.m91418a(file3, bdrq.f106318c, bdrq.f106322g, (long) bdrq.f106323h, timeUnit);
                    bdqu bdqu = bdrq.f106317b;
                    int i = bdrq.f106319d;
                    int i2 = bdrq.f106320e;
                    int i3 = bdrq.f106321f;
                    bmzi a5 = bmzn.m108681a((bmzi) new bdsa(bdsg2, file2));
                    bdrl bdrl = bdsg2.f106356f;
                    bdrl.getClass();
                    bdsb bdsb = new bdsb(bdrl);
                    bdsg2.f106355e.getClass();
                    bdrp bdrp = new bdrp(bdsb, new bdsc(), bdrq.f106317b);
                    ayte ayte2 = bdsg2.f106352b;
                    bdry bdti = new bdti(bdqu, i, i2, i3, a5, bdrp, a4, a2, bdsg2.f106353c);
                    if (cenc.m137458c() > 0) {
                        bdry = new bdrs(bdti, bmzn.m108681a((bmzi) new bdsd(bdsg2, bdrq)), bdsg2.f106353c);
                    } else {
                        bdry = bdti;
                    }
                    return new acsn(abzo, abqv, nativeIndex, bdry, abym, bqfb.INSTANCE);
                } catch (bdvx e) {
                    throw new bdrc(e);
                } catch (Exception e2) {
                    e = e2;
                    if (z) {
                    }
                    a2.close();
                    throw e;
                }
            } catch (Exception e3) {
                e = e3;
                if (z) {
                    file2.delete();
                }
                a2.close();
                throw e;
            }
        } else {
            throw new NullPointerException("Null applicationId");
        }
    }

    /* renamed from: a */
    public static acsx m49816a(Context context, abyx abyx, acao acao, acrl acrl, abzo abzo, abqv abqv, NativeIndex nativeIndex, abym abym, bdwt bdwt) {
        bdwt bdwt2 = bdwt;
        acsh acsh = new acsh(abyx, acao, acrl);
        Account a = m49817a(context, acsh.mo33054a());
        acso.m49811a(a.name, context, abzo, abqv, nativeIndex, abym);
        bdqz a2 = m49818a(context, a, 12803);
        File file = new File(acsq.m49814a(context), "upload");
        bdqu a3 = bdqu.m91313a(context, "icing-user-actions");
        int i = abzm.f58810a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        int b = bqcn.m112585b(cenc.f183045a.mo6606a().mo79413p());
        long j = (long) i;
        bdxv bdxv = new bdxv(bdwt2.f106550b);
        boolean z = true;
        bmxy.m108588a(b >= 0);
        if (file.exists() || !file.mkdir()) {
            z = false;
        }
        bqgg a4 = bqga.m112778a(new bdxt(bdxv, a, new File(file, "footprints_queue.db")), bdxv.f106609a);
        if (z) {
            a4 = bqdf.m112620a(a4, bdvx.class, new bdwl(file), bdwt2.f106550b);
        }
        Account account = a;
        acsh acsh2 = acsh;
        bdwt bdwt3 = bdwt2;
        bqgg a5 = bqdx.m112673a(a4, new bdwm(bdwt, a2, a3, timeUnit, j, b, file), bdwt3.f106550b);
        if (cenc.m137463h() > 0) {
            a5 = bqdx.m112673a(a5, new bdwo(bdwt3, bmzn.m108681a((bmzi) new bdwn(bdwt3, a3, account))), bqfb.INSTANCE);
        }
        a5.mo741a(new bdwp(a5, a2), bdwt3.f106550b);
        return new acsx(context, acsh2, new acsy(context), a5);
    }

    /* renamed from: a */
    private static Account m49817a(Context context, String str) {
        if (!str.isEmpty()) {
            Account account = new Account(str, "com.google");
            if (soz.m35791a(context, account)) {
                return account;
            }
            throw new acsr("Signed-in account does not exist");
        }
        throw new acsr("Not signed in");
    }

    /* renamed from: a */
    private static bdqz m49818a(Context context, Account account, int i) {
        if (!cenc.f183045a.mo6606a().mo79414q()) {
            bqfb bqfb = bqfb.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            return new acbb(account, new adym(new shl(applicationContext, cenc.m137461f(), (int) cenc.m137462g(), applicationContext.getApplicationInfo().uid, i)), applicationContext.getApplicationInfo().uid, applicationContext.getPackageName(), bqfb);
        }
        bruh a = aefi.m51787a(i);
        bmxv b = bmxv.m108566b(bqbu.m112533a(cenc.m137461f(), (int) cenc.m137462g()));
        return new bdrj((bxox) ((bxox) ((bxox) ciih.m150373a(new bxov(), a.mo69980a(bxqr.f164418h))).mo86139a(bruw.f143433a, bruw.m114733a(account.name))).mo86139a(brup.f143420a, ((bqbu) ((bmyg) b).f131198a).toString()));
    }
}
