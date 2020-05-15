package p000;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import com.google.android.gms.icing.proxy.UpdateIcingCorporaIntentOperation;

/* renamed from: acnh */
final /* synthetic */ class acnh implements Runnable {

    /* renamed from: a */
    private final Context f60232a;

    /* renamed from: b */
    private final abym f60233b;

    public acnh(Context context, abym abym) {
        this.f60232a = context;
        this.f60233b = abym;
    }

    public final void run() {
        Context context = this.f60232a;
        abym abym = this.f60233b;
        aclp a = aclp.m49388a(context);
        if (a != null) {
            a.mo32848d();
        }
        if (acni.m49502a()) {
            bxvd da = bpwt.f139567g.mo74144da();
            int a2 = (int) (sra.m36059a(context, "icing_contacts.db") >> 10);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpwt bpwt = (bpwt) da.f164949b;
            bpwt.f139569a |= 1;
            bpwt.f139570b = a2;
            acne acne = new acne(abym, context.getContentResolver());
            int a3 = (int) (((long) acnc.m49492a(acne, ContactsContract.Contacts.CONTENT_URI)) - acnl.m49508a(acnl.m49509a(context).getReadableDatabase(), "contacts"));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpwt bpwt2 = (bpwt) da.f164949b;
            bpwt2.f139569a |= 2;
            bpwt2.f139571c = a3;
            int a4 = (int) (((long) acnc.m49492a(acne, ContactsContract.CommonDataKinds.Phone.CONTENT_URI)) - acnl.m49508a(acnl.m49509a(context).getReadableDatabase(), "phones"));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpwt bpwt3 = (bpwt) da.f164949b;
            bpwt3.f139569a |= 4;
            bpwt3.f139572d = a4;
            int a5 = (int) (((long) acnc.m49492a(acne, ContactsContract.CommonDataKinds.Email.CONTENT_URI)) - acnl.m49508a(acnl.m49509a(context).getReadableDatabase(), "emails"));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpwt bpwt4 = (bpwt) da.f164949b;
            bpwt4.f139569a |= 8;
            bpwt4.f139573e = a5;
            int a6 = (int) (((long) acnc.m49492a(acne, ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI)) - acnl.m49508a(acnl.m49509a(context).getReadableDatabase(), "postals"));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpwt bpwt5 = (bpwt) da.f164949b;
            bpwt5.f139569a |= 16;
            bpwt5.f139574f = a6;
            bpwt bpwt6 = (bpwt) da.mo74062i();
            long d = cema.m137237d();
            if (abym.mo32452a(d)) {
                bxvd bxvd = (bxvd) bpwt6.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) bpwt6);
                int a7 = abym.m48546a(bpwt6.f139571c);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpwt bpwt7 = (bpwt) bxvd.f164949b;
                bpwt7.f139569a |= 2;
                bpwt7.f139571c = a7;
                int a8 = abym.m48546a(bpwt6.f139572d);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpwt bpwt8 = (bpwt) bxvd.f164949b;
                bpwt8.f139569a |= 4;
                bpwt8.f139572d = a8;
                int a9 = abym.m48546a(bpwt6.f139573e);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpwt bpwt9 = (bpwt) bxvd.f164949b;
                bpwt9.f139569a |= 8;
                bpwt9.f139573e = a9;
                int a10 = abym.m48546a(bpwt6.f139574f);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpwt bpwt10 = (bpwt) bxvd.f164949b;
                bpwt10.f139569a |= 16;
                bpwt10.f139574f = a10;
                bpwt bpwt11 = (bpwt) bxvd.mo74062i();
                bxvd da2 = bpxb.f139606R.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpxb bpxb = (bpxb) da2.f164949b;
                bpwt11.getClass();
                bpxb.f139638n = bpwt11;
                bpxb.f139625a |= 8192;
                abym.mo32438a(2003, da2, d);
            }
            Intent b = UpdateIcingCorporaIntentOperation.m66730b(context);
            if (b != null) {
                context.startService(b);
            }
        }
        acok c = acok.m49603c(context);
        if (c != null) {
            acoe.m49588a().mo32944a(acoe.m49589a("SmsCorpusLogHealthStatsRunnable", new acoi(c)));
        }
    }
}
