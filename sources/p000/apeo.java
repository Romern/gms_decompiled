package p000;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.romanesco.service.ContactsLoggerUploadService;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: apeo */
public final /* synthetic */ class apeo implements bbjr {

    /* renamed from: a */
    private final ContactsLoggerUploadService f84255a;

    /* renamed from: b */
    private final boolean f84256b;

    public apeo(ContactsLoggerUploadService contactsLoggerUploadService, boolean z) {
        this.f84255a = contactsLoggerUploadService;
        this.f84256b = z;
    }

    /* renamed from: a */
    public final bqgg mo34062a(bbmw bbmw) {
        bbjq bbjq;
        boolean z;
        bzcx bzcx;
        ContactsLoggerUploadService contactsLoggerUploadService = this.f84255a;
        boolean z2 = this.f84256b;
        if (z2 && !apam.f84036a) {
            throw new apeq("delta API not supported");
        }
        apal apal = new apal();
        apal.f84032c = System.currentTimeMillis();
        if (!contactsLoggerUploadService.f107311c.mo6527a(apal)) {
            ContactsLoggerUploadService.f107309a.mo46981b("cannot run");
            bbjq = bbjq.m88103a();
        } else {
            apal.f84034e = z2;
            apal.f84033d = true;
            apal.f84035f = true;
            apaj apaj = (apaj) contactsLoggerUploadService.f107310b.apply(apal);
            Set set = apal.f84031b;
            if (set.isEmpty()) {
                apaj.f84014e.mo46981b("no accounts to sync");
                z = false;
            } else {
                if (set.size() > 1) {
                    apaj.f84014e.mo46983c("multiple accounts; will only sync the first!");
                }
                String str = (String) set.iterator().next();
                Set set2 = apal.f84031b;
                bzcv a = apaj.mo47056a(apal);
                if (a != null) {
                    apaj.m69950a(set2, a);
                    if (!apal.f84034e) {
                        apaj.m69958b(set2, a);
                    }
                    bzcx = (bzcx) a.mo74062i();
                } else {
                    bzcx = null;
                }
                if (bzcx != null) {
                    boolean z3 = apal.f84034e;
                    apbv apbv = new apbv(apaj.f83966a);
                    if (cgjk.f187071a.mo6606a().mo83905c() && z3) {
                        ClientContext a2 = apbs.m70036a(apaj.f83966a, str);
                        bxvd da = btex.f148588c.mo74144da();
                        bxvd a3 = apaz.m69984a(bzcx);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        btcp btcp = (btcp) a3.mo74062i();
                        btcp.getClass();
                        ((btex) da.f164949b).f148591b = btcp;
                        bxwc bxwc = bzcx.f169432b;
                        int size = bxwc.size();
                        for (int i = 0; i < size; i++) {
                            bxvd a4 = apaz.m69983a((bzcu) bxwc.get(i), bzcx);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            btex btex = (btex) da.f164949b;
                            btcr btcr = (btcr) a4.mo74062i();
                            btcr.getClass();
                            if (!btex.f148590a.mo73666a()) {
                                btex.f148590a = bxvk.m124021a(btex.f148590a);
                            }
                            btex.f148590a.add(btcr);
                        }
                        btex btex2 = (btex) da.mo74062i();
                        apbt apbt = apbv.f84114b;
                        long b = cgjp.m145738b();
                        if (apbt.f84106b == null) {
                            apbt.f84106b = chtv.m149566a(chtu.UNARY, "google.internal.people.v2.InternalDeviceContactsService/UpsertDeviceContacts", ciie.m150370a(btex.f148588c), ciie.m150370a(btey.f148593a));
                        }
                        btey btey = (btey) apbt.f84109a.mo25553a(apbt.f84106b, a2, btex2, b, TimeUnit.MILLISECONDS);
                        if (cgij.f186992a.mo6606a().mo83888x() && !bzcx.f169434d.isEmpty()) {
                            ClientContext a5 = apbs.m70036a(apaj.f83966a, str);
                            bxvd da2 = btci.f148274c.mo74144da();
                            bxvd a6 = apaz.m69984a(bzcx);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            btcp btcp2 = (btcp) a6.mo74062i();
                            btcp2.getClass();
                            ((btci) da2.f164949b).f148277b = btcp2;
                            bxvw bxvw = bzcx.f169434d;
                            int size2 = bxvw.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                long longValue = ((Long) bxvw.get(i2)).longValue();
                                bxvd da3 = btcq.f148303b.mo74144da();
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = false;
                                }
                                ((btcq) da3.f164949b).f148305a = longValue;
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                btci btci = (btci) da2.f164949b;
                                btcq btcq = (btcq) da3.mo74062i();
                                btcq.getClass();
                                if (!btci.f148276a.mo73666a()) {
                                    btci.f148276a = bxvk.m124021a(btci.f148276a);
                                }
                                btci.f148276a.add(btcq);
                            }
                            btci btci2 = (btci) da2.mo74062i();
                            apbt apbt2 = apbv.f84114b;
                            long b2 = cgjp.m145738b();
                            if (apbt.f84107c == null) {
                                apbt.f84107c = chtv.m149566a(chtu.UNARY, "google.internal.people.v2.InternalDeviceContactsService/DeleteDeviceContacts", ciie.m150370a(btci.f148274c), ciie.m150370a(btcj.f148278a));
                            }
                            btcj btcj = (btcj) apbt2.f84109a.mo25553a(apbt.f84107c, a5, btci2, b2, TimeUnit.MILLISECONDS);
                        }
                    } else if (cgjk.f187071a.mo6606a().mo83903a() && !z3) {
                        ClientContext a7 = apbs.m70036a(apaj.f83966a, str);
                        bxvd da4 = btbv.f148220c.mo74144da();
                        bxvd a8 = apaz.m69984a(bzcx);
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        btcp btcp3 = (btcp) a8.mo74062i();
                        btcp3.getClass();
                        ((btbv) da4.f164949b).f148223b = btcp3;
                        bxwc bxwc2 = bzcx.f169432b;
                        int size3 = bxwc2.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            bxvd a9 = apaz.m69983a((bzcu) bxwc2.get(i3), bzcx);
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            btbv btbv = (btbv) da4.f164949b;
                            btcr btcr2 = (btcr) a9.mo74062i();
                            btcr2.getClass();
                            if (!btbv.f148222a.mo73666a()) {
                                btbv.f148222a = bxvk.m124021a(btbv.f148222a);
                            }
                            btbv.f148222a.add(btcr2);
                        }
                        btbv btbv2 = (btbv) da4.mo74062i();
                        apbt apbt3 = apbv.f84114b;
                        long b3 = cgjp.m145738b();
                        if (apbt.f84108d == null) {
                            apbt.f84108d = chtv.m149566a(chtu.UNARY, "google.internal.people.v2.InternalDeviceContactsService/BatchUploadDeviceContacts", ciie.m150370a(btbv.f148220c), ciie.m150370a(btbw.f148225a));
                        }
                        btbw btbw = (btbw) apbt3.f84109a.mo25553a(apbt.f84108d, a7, btbv2, b3, TimeUnit.MILLISECONDS);
                    }
                    if (cgjk.m145709b()) {
                        SharedPreferences.Editor edit = aozj.m69902a(apaj.f83966a).edit();
                        if (!apal.f84034e) {
                            new Object[1][0] = Long.valueOf(apal.f84032c);
                            edit.putLong("romanesco-contacts-grpc-full-upload-timestamp", apal.f84032c);
                        }
                        z = true;
                        new Object[1][0] = Long.valueOf(apal.f84032c);
                        edit.putLong("romanesco-contacts-grpc-incremental-upload-timestamp", apal.f84032c);
                        if (!cgjk.m145711d()) {
                            edit.putBoolean("romanesco-contacts-logger-pending-significant-update", false);
                        }
                        edit.commit();
                    } else {
                        z = true;
                    }
                } else {
                    apaj.f84014e.mo46981b("Nothing to upload!");
                    z = false;
                }
            }
            bbjp b4 = bbjq.m88104b(null);
            b4.f102772c = z;
            bbjq = b4.mo56173a();
        }
        return bqga.m112775a(bbjq);
    }
}
