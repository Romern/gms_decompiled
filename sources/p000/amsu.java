package p000;

import android.content.Context;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: amsu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amsu {

    /* renamed from: a */
    public final ggk f75880a;

    /* renamed from: b */
    public final Context f75881b;

    public amsu(Context context) {
        ggk a = ggh.m13102a(context.getApplicationContext());
        this.f75881b = context;
        this.f75880a = a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41314a(String str, boolean z, int i) {
        aucb aucb;
        bsqv bsqv = (bsqv) bsqw.f146695g.mo74144da();
        bxvd da = bsrf.f146744d.mo74144da();
        bsmz bsmz = bsmz.CONTACTS_SYNC_BACKUP_SYNC_SETTING_CHANGE;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsrf bsrf = (bsrf) da.f164949b;
        bsrf.f146747b = bsmz.f146213dO;
        bsrf.f146746a |= 1;
        bxvd da2 = bsqz.f146720d.mo74144da();
        bxvd da3 = bssl.f146873c.mo74144da();
        int i2 = !z ? 3 : 2;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bssl bssl = (bssl) da3.f164949b;
        bssl.f146876b = i2 - 1;
        bssl.f146875a |= 1;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bsqz bsqz = (bsqz) da2.f164949b;
        bssl bssl2 = (bssl) da3.mo74062i();
        bssl2.getClass();
        bsqz.f146723b = bssl2;
        bsqz.f146722a |= 1;
        if (z && i == 0) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsqz bsqz2 = (bsqz) da2.f164949b;
            bsqz2.f146722a |= 2;
            bsqz2.f146724c = true;
        }
        bxvd da4 = bsrg.f146749m.mo74144da();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bsrg bsrg = (bsrg) da4.f164949b;
        bsqz bsqz3 = (bsqz) da2.mo74062i();
        bsqz3.getClass();
        bsrg.f146757g = bsqz3;
        bsrg.f146751a |= 32;
        bsrg bsrg2 = (bsrg) da4.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsrf bsrf2 = (bsrf) da.f164949b;
        bsrg2.getClass();
        bsrf2.f146748c = bsrg2;
        bsrf2.f146746a |= 2;
        if (bsqv.f164950c) {
            bsqv.mo74035c();
            bsqv.f164950c = false;
        }
        bsqw bsqw = (bsqw) bsqv.f164949b;
        bsrf bsrf3 = (bsrf) da.mo74062i();
        bsrf3.getClass();
        bsqw.f146701e = bsrf3;
        bsqw.f146697a |= 4;
        bxvd da5 = bssm.f146877d.mo74144da();
        bsmx bsmx = bsmx.CONTACTS_SYNC_ANDROID_BACKUP_SYNC_OPT_IN;
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        bssm bssm = (bssm) da5.f164949b;
        bssm.f146880b = bsmx.f145962iC;
        bssm.f146879a |= 1;
        bxvd da6 = bsqy.f146707l.mo74144da();
        bsqp bsqp = (bsqp) bsqq.f146675b.mo74144da();
        bsqp.mo70703a((int) C0126R.string.people_backup_sync_activity_title);
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        bsqy bsqy = (bsqy) da6.f164949b;
        bsqq bsqq = (bsqq) bsqp.mo74062i();
        bsqq.getClass();
        bsqy.f146710b = bsqq;
        bsqy.f146709a |= 1;
        bsqp bsqp2 = (bsqp) bsqq.f146675b.mo74144da();
        bsqp2.mo70703a((int) C0126R.string.people_backup_sync_information_banner);
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        bsqy bsqy2 = (bsqy) da6.f164949b;
        bsqq bsqq2 = (bsqq) bsqp2.mo74062i();
        bsqq2.getClass();
        bsqy2.f146711c = bsqq2;
        bsqy2.f146709a |= 2;
        bsqp bsqp3 = (bsqp) bsqq.f146675b.mo74144da();
        bsqp3.mo70703a((int) C0126R.string.people_backup_sync_toggle_text);
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        bsqy bsqy3 = (bsqy) da6.f164949b;
        bsqq bsqq3 = (bsqq) bsqp3.mo74062i();
        bsqq3.getClass();
        bsqy3.f146712d = bsqq3;
        bsqy3.f146709a |= 4;
        bsqp bsqp4 = (bsqp) bsqq.f146675b.mo74144da();
        bsqp4.mo70703a((int) C0126R.string.people_backup_sync_exclude_sources_banner);
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        bsqy bsqy4 = (bsqy) da6.f164949b;
        bsqq bsqq4 = (bsqq) bsqp4.mo74062i();
        bsqq4.getClass();
        bsqy4.f146713e = bsqq4;
        bsqy4.f146709a |= 8;
        bsqp bsqp5 = (bsqp) bsqq.f146675b.mo74144da();
        bsqp5.mo70703a((int) C0126R.plurals.people_backup_sync_contacts_not_backed_up);
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        bsqy bsqy5 = (bsqy) da6.f164949b;
        bsqq bsqq5 = (bsqq) bsqp5.mo74062i();
        bsqq5.getClass();
        bsqy5.f146715g = bsqq5;
        bsqy5.f146709a |= 32;
        bsqp bsqp6 = (bsqp) bsqq.f146675b.mo74144da();
        bsqp6.mo70703a((int) C0126R.string.people_select_account_for_backup);
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        bsqy bsqy6 = (bsqy) da6.f164949b;
        bsqq bsqq6 = (bsqq) bsqp6.mo74062i();
        bsqq6.getClass();
        bsqy6.f146716h = bsqq6;
        bsqy6.f146709a |= 64;
        bsqp bsqp7 = (bsqp) bsqq.f146675b.mo74144da();
        bsqp7.mo70703a((int) C0126R.string.people_backup_sync_will_sync_button);
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        bsqy bsqy7 = (bsqy) da6.f164949b;
        bsqq bsqq7 = (bsqq) bsqp7.mo74062i();
        bsqq7.getClass();
        bsqy7.f146717i = bsqq7;
        bsqy7.f146709a |= 128;
        bsqp bsqp8 = (bsqp) bsqq.f146675b.mo74144da();
        bsqp8.mo70703a((int) C0126R.string.people_backup_sync_account);
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        bsqy bsqy8 = (bsqy) da6.f164949b;
        bsqq bsqq8 = (bsqq) bsqp8.mo74062i();
        bsqq8.getClass();
        bsqy8.f146718j = bsqq8;
        bsqy8.f146709a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (cfut.f185746a.mo6606a().mo82754f()) {
            String d = cfus.m143106d();
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            bsqy bsqy9 = (bsqy) da6.f164949b;
            d.getClass();
            bsqy9.f146709a |= 512;
            bsqy9.f146719k = d;
        } else {
            String e = cfus.f185744a.mo6606a().mo82765e();
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            bsqy bsqy10 = (bsqy) da6.f164949b;
            e.getClass();
            bsqy10.f146709a |= 16;
            bsqy10.f146714f = e;
        }
        bxvd da7 = bssi.f146862i.mo74144da();
        if (da7.f164950c) {
            da7.mo74035c();
            da7.f164950c = false;
        }
        bssi bssi = (bssi) da7.f164949b;
        bsqy bsqy11 = (bsqy) da6.mo74062i();
        bsqy11.getClass();
        bssi.f146870g = bsqy11;
        bssi.f146864a |= 2048;
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        bssm bssm2 = (bssm) da5.f164949b;
        bssi bssi2 = (bssi) da7.mo74062i();
        bssi2.getClass();
        bssm2.f146881c = bssi2;
        bssm2.f146879a |= 8;
        if (bsqv.f164950c) {
            bsqv.mo74035c();
            bsqv.f164950c = false;
        }
        bsqw bsqw2 = (bsqw) bsqv.f164949b;
        bssm bssm3 = (bssm) da5.mo74062i();
        bssm3.getClass();
        bsqw2.f146702f = bssm3;
        bsqw2.f146697a |= 8;
        Context context = this.f75881b;
        if (str != null) {
            aucf aucf = new aucf();
            new amsr(context, str, aucf).start();
            aucb = aucf.f91388a;
        } else {
            aucb = aucu.m76778a((Object) null);
        }
        aucb.mo50382b(new amst(this, bsqv, str)).mo50371a(new amss(str, bsqv));
    }
}
