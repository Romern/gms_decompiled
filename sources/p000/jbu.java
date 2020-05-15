package p000;

import android.accounts.Account;
import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: jbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jbu {

    /* renamed from: a */
    private final Context f22125a;

    /* renamed from: b */
    private final Account f22126b;

    public jbu(Context context, Account account) {
        this.f22125a = context;
        this.f22126b = account;
    }

    /* renamed from: a */
    public static jbu m16476a(Context context, Account account) {
        return new jbu(context, account);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f6 A[Catch:{ chux -> 0x00b5, all -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f8 A[Catch:{ chux -> 0x00b5, all -> 0x00b3 }] */
    /* renamed from: a */
    public final Object mo13566a(jbt jbt) {
        String str;
        int ordinal;
        jdi jdi = new jdi(this.f22125a, this.f22126b);
        try {
            String a = gie.m13187a(jdi.f22223d, jdi.f22222c, ccfy.f178890a.mo6606a().mo75905t());
            ArrayList arrayList = new ArrayList();
            int i = 1;
            arrayList.add(new chvt(jdi.f22223d, a, true));
            try {
                str = new iei(jdi.f22223d).mo12952a(jdi.f22223d.getPackageName());
            } catch (gid | IOException e) {
                jdi.f22220a.mo25415d("Exception while trying to retrieve appCert.", e, new Object[0]);
                str = null;
            }
            if (str != null) {
                arrayList.add(new chvl(str));
            }
            chtr chtr = new chtr();
            chtr.mo85648a(chtn.m149535a("X-Goog-Api-Key", chtr.f189134b), "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
            chtr.mo85648a(chtn.m149535a("X-Android-Package", chtr.f189134b), jdi.f22223d.getPackageName());
            chtn a2 = chtn.m149535a("X-Android-Cert", chtr.f189134b);
            Context context = jdi.f22223d;
            chtr.mo85648a(a2, spn.m35895h(context, context.getPackageName()));
            arrayList.add(ciiu.m150402a(chtr));
            bqne bqne = (bqne) ciig.m150372a(new bqnd(), chqx.m149438a(jdi.f22221b, arrayList));
            if (bqne != null) {
                int i2 = 1;
                while (true) {
                    try {
                        Object a3 = jbt.mo13565a(bqne);
                        jdi.mo13600a();
                        return a3;
                    } catch (chux e2) {
                        if (i2 != 3) {
                            if (ccfy.f178890a.mo6606a().mo75881G()) {
                                chus chus = e2.f189238a.f189233s;
                                chus chus2 = chus.OK;
                                int ordinal2 = chus.ordinal();
                                if (!(ordinal2 == 3 || ordinal2 == 12 || ordinal2 == 14)) {
                                    switch (ordinal2) {
                                    }
                                }
                            }
                            i2++;
                        }
                        chus chus3 = e2.f189238a.f189233s;
                        chus chus4 = chus.OK;
                        ordinal = chus3.ordinal();
                        switch (ordinal) {
                        }
                        throw new eic("Failed to VaultServiceOperation", e2, i);
                    } catch (Throwable th) {
                        jdi.mo13600a();
                        throw th;
                    }
                }
                chus chus32 = e2.f189238a.f189233s;
                chus chus42 = chus.OK;
                ordinal = chus32.ordinal();
                if (!(ordinal == 1 || ordinal == 4 || ordinal == 14)) {
                    switch (ordinal) {
                        case 8:
                        case 10:
                            break;
                        case 9:
                            i = 8;
                            break;
                        default:
                            i = 2;
                            break;
                    }
                }
                throw new eic("Failed to VaultServiceOperation", e2, i);
            }
            throw new eic("blockingStub is null");
        } catch (gid | IOException e3) {
            throw new eic("failed to create stub", e3, 7);
        }
    }
}
