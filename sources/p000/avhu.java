package p000;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.ConsistencyInformation;
import com.google.android.gms.udc.p077ui.UdcConsentChimeraActivity;
import java.util.concurrent.TimeUnit;

/* renamed from: avhu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avhu implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ UdcConsentChimeraActivity f93190a;

    /* renamed from: b */
    private DialogFragment f93191b;

    public avhu(UdcConsentChimeraActivity udcConsentChimeraActivity) {
        avhq avhq;
        this.f93190a = udcConsentChimeraActivity;
        FragmentManager supportFragmentManager = udcConsentChimeraActivity.getSupportFragmentManager();
        int i = avig.f93226c;
        try {
            avhq = (avhq) supportFragmentManager.findFragmentByTag("UdcDialog");
        } catch (ClassCastException e) {
            bnsl bnsl = (bnsl) avhq.f93185a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("avhq", "a", 33, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error finding dialog fragment");
            avhq = null;
        }
        this.f93191b = avhq;
    }

    /* renamed from: a */
    private final void m78524a() {
        DialogFragment dialogFragment = this.f93191b;
        if (dialogFragment != null) {
            avii avii = this.f93190a.f109409h;
            avii.sendMessage(avii.obtainMessage(2, dialogFragment));
            this.f93191b = null;
        }
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        avif avif = new avif();
        avif.f93184a.putString("UdcDialogMessage", this.f93190a.getString(C0126R.string.udc_please_wait));
        FragmentManager supportFragmentManager = this.f93190a.getSupportFragmentManager();
        avhq b = avif.mo51240b();
        b.show(supportFragmentManager, "UdcDialog");
        this.f93191b = b;
        UdcConsentChimeraActivity udcConsentChimeraActivity = this.f93190a;
        srn srn = UdcConsentChimeraActivity.f109402a;
        String str = udcConsentChimeraActivity.f109403b;
        avel avel = new avel(udcConsentChimeraActivity, new Account(str, "com.google"), udcConsentChimeraActivity.f109408g);
        avel.mo51183a(chbe.f188233a.mo6606a().mo84910f(), TimeUnit.MILLISECONDS);
        return avel;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fa  */
    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        avjn avjn;
        avac avac = (avac) obj;
        m78524a();
        ConsistencyInformation consistencyInformation = null;
        if (avac.mo7183bo().mo17710c()) {
            bxsv bxsv = (bxsv) avac.mo51105b();
            if (chay.f188218a.mo6606a().mo84894c() && (bxsv.f164753a & 1) != 0) {
                bxrf bxrf = bxsv.f164754b;
                if (bxrf == null) {
                    bxrf = bxrf.f164550c;
                }
                if ((bxrf.f164552a & 1) != 0) {
                    bxrf bxrf2 = bxsv.f164754b;
                    if (bxrf2 == null) {
                        bxrf2 = bxrf.f164550c;
                    }
                    blbt blbt = bxrf2.f164553b;
                    if (blbt == null) {
                        blbt = blbt.f125862d;
                    }
                    consistencyInformation = new ConsistencyInformation(blbt.f125865b, blbt.f125866c);
                    UdcConsentChimeraActivity udcConsentChimeraActivity = this.f93190a;
                    srn srn = UdcConsentChimeraActivity.f109402a;
                    Intent intent = udcConsentChimeraActivity.f109407f;
                    if (intent != null) {
                        intent.putExtra("udc.consent.consistency_info", consistencyInformation);
                    }
                }
            }
            avjh a = avjh.m78608a();
            UdcConsentChimeraActivity udcConsentChimeraActivity2 = this.f93190a;
            srn srn2 = UdcConsentChimeraActivity.f109402a;
            a.mo51289a(udcConsentChimeraActivity2.f109403b, consistencyInformation);
            UdcConsentChimeraActivity udcConsentChimeraActivity3 = this.f93190a;
            udcConsentChimeraActivity3.f109412k = false;
            udcConsentChimeraActivity3.setResult(-1, udcConsentChimeraActivity3.f109407f);
            this.f93190a.finish();
            return;
        }
        avjh a2 = avjh.m78608a();
        UdcConsentChimeraActivity udcConsentChimeraActivity4 = this.f93190a;
        srn srn3 = UdcConsentChimeraActivity.f109402a;
        a2.mo51289a(udcConsentChimeraActivity4.f109403b, null);
        Status bo = avac.mo7183bo();
        bnsl bnsl = (bnsl) UdcConsentChimeraActivity.f109402a.mo68387b();
        bnsl.mo68432a("avhu", "a", 625, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68424a("Error (%s) writing the consent: %s", avak.m78140a(bo.f30115i), bo.f30116j);
        int i = bo.f30115i;
        int i2 = C0126R.string.udc_generic_error;
        if (i != 7) {
            if (i == 8 || i == 15) {
                i2 = C0126R.string.udc_server_error;
                UdcConsentChimeraActivity udcConsentChimeraActivity5 = this.f93190a;
                avjn = udcConsentChimeraActivity5.f109413l;
                if (avjn == null) {
                    bnsl bnsl2 = (bnsl) UdcConsentChimeraActivity.f109402a.mo68387b();
                    bnsl2.mo68432a("avhu", "a", 655, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("UdcClearcutLogger is null.");
                } else {
                    int i3 = udcConsentChimeraActivity5.f109414m;
                    srn srn4 = avgr.f93153a;
                    bxvd da = bsph.f146490m.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bsph bsph = (bsph) da.f164949b;
                    bsph.f146493b = 6;
                    bsph.f146492a |= 1;
                    bxvd da2 = bsoo.f146410c.mo74144da();
                    int b = avgr.m78485b(i2);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bsoo bsoo = (bsoo) da2.f164949b;
                    bsoo.f146413b = b - 1;
                    bsoo.f146412a |= 1;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bsph bsph2 = (bsph) da.f164949b;
                    bsoo bsoo2 = (bsoo) da2.mo74062i();
                    bsoo2.getClass();
                    bsph2.f146498g = bsoo2;
                    bsph2.f146492a |= 128;
                    avjn.mo51293a(i3, (bsph) da.mo74062i());
                }
                UdcConsentChimeraActivity udcConsentChimeraActivity6 = this.f93190a;
                udcConsentChimeraActivity6.f109412k = true;
                udcConsentChimeraActivity6.f109408g = null;
                avii avii = udcConsentChimeraActivity6.f109409h;
                avhk avhk = new avhk();
                avhk.mo51233a(this.f93190a.getString(i2));
                avhk.f93184a.putCharSequence("UdcDialogPositive", this.f93190a.getString(17039370));
                avii.sendMessage(avii.obtainMessage(5, avhk.mo51240b()));
            }
            switch (i) {
                case 4502:
                    break;
                case 4503:
                    break;
                case 4504:
                    i2 = C0126R.string.udc_auth_error;
                    break;
                case 4505:
                case 4506:
                    i2 = C0126R.string.udc_setting_write_error;
                    break;
                default:
                    bnsl bnsl3 = (bnsl) UdcConsentChimeraActivity.f109402a.mo68387b();
                    bnsl3.mo68432a("avhu", "a", 650, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68409a("Unknown statuscode:%d", i);
                    break;
            }
            UdcConsentChimeraActivity udcConsentChimeraActivity52 = this.f93190a;
            avjn = udcConsentChimeraActivity52.f109413l;
            if (avjn == null) {
            }
            UdcConsentChimeraActivity udcConsentChimeraActivity62 = this.f93190a;
            udcConsentChimeraActivity62.f109412k = true;
            udcConsentChimeraActivity62.f109408g = null;
            avii avii2 = udcConsentChimeraActivity62.f109409h;
            avhk avhk2 = new avhk();
            avhk2.mo51233a(this.f93190a.getString(i2));
            avhk2.f93184a.putCharSequence("UdcDialogPositive", this.f93190a.getString(17039370));
            avii2.sendMessage(avii2.obtainMessage(5, avhk2.mo51240b()));
        }
        i2 = C0126R.string.udc_network_error_write;
        UdcConsentChimeraActivity udcConsentChimeraActivity522 = this.f93190a;
        avjn = udcConsentChimeraActivity522.f109413l;
        if (avjn == null) {
        }
        UdcConsentChimeraActivity udcConsentChimeraActivity622 = this.f93190a;
        udcConsentChimeraActivity622.f109412k = true;
        udcConsentChimeraActivity622.f109408g = null;
        avii avii22 = udcConsentChimeraActivity622.f109409h;
        avhk avhk22 = new avhk();
        avhk22.mo51233a(this.f93190a.getString(i2));
        avhk22.f93184a.putCharSequence("UdcDialogPositive", this.f93190a.getString(17039370));
        avii22.sendMessage(avii22.obtainMessage(5, avhk22.mo51240b()));
    }

    public final void onLoaderReset(Loader loader) {
        m78524a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0070  */
    /* renamed from: a */
    private final void m78525a(Status status) {
        avjn avjn;
        bnsl bnsl = (bnsl) UdcConsentChimeraActivity.f109402a.mo68387b();
        bnsl.mo68432a("avhu", "a", 625, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68424a("Error (%s) writing the consent: %s", avak.m78140a(status.f30115i), status.f30116j);
        int i = status.f30115i;
        int i2 = C0126R.string.udc_generic_error;
        if (i != 7) {
            if (i == 8 || i == 15) {
                i2 = C0126R.string.udc_server_error;
                UdcConsentChimeraActivity udcConsentChimeraActivity = this.f93190a;
                avjn = udcConsentChimeraActivity.f109413l;
                if (avjn == null) {
                    bnsl bnsl2 = (bnsl) UdcConsentChimeraActivity.f109402a.mo68387b();
                    bnsl2.mo68432a("avhu", "a", 655, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("UdcClearcutLogger is null.");
                } else {
                    int i3 = udcConsentChimeraActivity.f109414m;
                    srn srn = avgr.f93153a;
                    bxvd da = bsph.f146490m.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bsph bsph = (bsph) da.f164949b;
                    bsph.f146493b = 6;
                    bsph.f146492a |= 1;
                    bxvd da2 = bsoo.f146410c.mo74144da();
                    int b = avgr.m78485b(i2);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bsoo bsoo = (bsoo) da2.f164949b;
                    bsoo.f146413b = b - 1;
                    bsoo.f146412a |= 1;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bsph bsph2 = (bsph) da.f164949b;
                    bsoo bsoo2 = (bsoo) da2.mo74062i();
                    bsoo2.getClass();
                    bsph2.f146498g = bsoo2;
                    bsph2.f146492a |= 128;
                    avjn.mo51293a(i3, (bsph) da.mo74062i());
                }
                UdcConsentChimeraActivity udcConsentChimeraActivity2 = this.f93190a;
                udcConsentChimeraActivity2.f109412k = true;
                udcConsentChimeraActivity2.f109408g = null;
                avii avii = udcConsentChimeraActivity2.f109409h;
                avhk avhk = new avhk();
                avhk.mo51233a(this.f93190a.getString(i2));
                avhk.f93184a.putCharSequence("UdcDialogPositive", this.f93190a.getString(17039370));
                avii.sendMessage(avii.obtainMessage(5, avhk.mo51240b()));
            }
            switch (i) {
                case 4502:
                    break;
                case 4503:
                    break;
                case 4504:
                    i2 = C0126R.string.udc_auth_error;
                    break;
                case 4505:
                case 4506:
                    i2 = C0126R.string.udc_setting_write_error;
                    break;
                default:
                    bnsl bnsl3 = (bnsl) UdcConsentChimeraActivity.f109402a.mo68387b();
                    bnsl3.mo68432a("avhu", "a", 650, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68409a("Unknown statuscode:%d", i);
                    break;
            }
            UdcConsentChimeraActivity udcConsentChimeraActivity3 = this.f93190a;
            avjn = udcConsentChimeraActivity3.f109413l;
            if (avjn == null) {
            }
            UdcConsentChimeraActivity udcConsentChimeraActivity22 = this.f93190a;
            udcConsentChimeraActivity22.f109412k = true;
            udcConsentChimeraActivity22.f109408g = null;
            avii avii2 = udcConsentChimeraActivity22.f109409h;
            avhk avhk2 = new avhk();
            avhk2.mo51233a(this.f93190a.getString(i2));
            avhk2.f93184a.putCharSequence("UdcDialogPositive", this.f93190a.getString(17039370));
            avii2.sendMessage(avii2.obtainMessage(5, avhk2.mo51240b()));
        }
        i2 = C0126R.string.udc_network_error_write;
        UdcConsentChimeraActivity udcConsentChimeraActivity32 = this.f93190a;
        avjn = udcConsentChimeraActivity32.f109413l;
        if (avjn == null) {
        }
        UdcConsentChimeraActivity udcConsentChimeraActivity222 = this.f93190a;
        udcConsentChimeraActivity222.f109412k = true;
        udcConsentChimeraActivity222.f109408g = null;
        avii avii22 = udcConsentChimeraActivity222.f109409h;
        avhk avhk22 = new avhk();
        avhk22.mo51233a(this.f93190a.getString(i2));
        avhk22.f93184a.putCharSequence("UdcDialogPositive", this.f93190a.getString(17039370));
        avii22.sendMessage(avii22.obtainMessage(5, avhk22.mo51240b()));
    }
}
