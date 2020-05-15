package p000;

import android.database.Cursor;
import android.database.SQLException;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: bbwz */
final /* synthetic */ class bbwz implements bqeg {

    /* renamed from: a */
    private final bbxm f103646a;

    /* renamed from: b */
    private final ContactId f103647b;

    public bbwz(bbxm bbxm, ContactId contactId) {
        this.f103646a = bbxm;
        this.f103647b = contactId;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x023d, code lost:
        if (r5.containsAll(r2) != false) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x024a, code lost:
        if (r11 <= (r0.mo57396a().longValue() + r7)) goto L_0x0290;
     */
    /* renamed from: a */
    public final bqgg mo7073a() {
        Throwable th;
        bmxv bmxv;
        Throwable th2;
        bbxm bbxm = this.f103646a;
        bmxv a = bbxm.f103676b.mo56669a(this.f103647b);
        boolean booleanValue = ((Boolean) bbqt.m88417a(bbxm.f103675a).f103170l.mo58455c()).booleanValue();
        if (!a.mo66813a()) {
            return bqga.m112775a(a);
        }
        bmxv a2 = bbxm.f103676b.mo56668a((bcoh) a.mo66814b());
        if (((bcoh) a.mo66814b()).mo57060d() == bcog.INVALID) {
            bbxm.mo56490d(((bcoh) a.mo66814b()).mo57058b().mo57074e());
            return bqga.m112775a(a);
        } else if (!a2.mo66813a()) {
            bbos.m88294d("TyRegController", "AuthToken not present for a valid account context");
            return bqga.m112775a(a);
        } else {
            if (booleanValue && bbxm.mo56489a((bcoz) a2.mo66814b())) {
                bbxm.f103685k.mo25819b(new bbxc(bbxm, a));
            }
            bbqe a3 = bbqe.m88387a(bbxm.f103675a);
            boolean a4 = chqc.f188988a.mo6606a().mo85526a();
            if (a3.f103063b.mo66813a()) {
                azbn azbn = (azbn) a3.f103063b.mo66814b();
                a4 = azbn.m85208a(19, a4);
            }
            if (a4) {
                bdaw bdaw = bbxm.f103676b;
                ContactId e = ((bcoh) a.mo66814b()).mo57058b().mo57074e();
                bcav bcav = (bcav) bdaw;
                bcav.f103920a.mo54678a();
                try {
                    Cursor b = ((bcav) bdaw).mo56672b(e);
                    try {
                        if (b.moveToFirst()) {
                            long j = (long) b.getInt(bced.m88857a(1));
                            Cursor a5 = ((bcav) bdaw).f103920a.mo54677a(((bcav) bdaw).mo56666a("registration"), new String[]{"registration_properties"}, "registration_id=?", new String[]{Long.toString(j)}, null, null);
                            try {
                                if (a5.moveToFirst()) {
                                    byte[] blob = a5.getBlob(0);
                                    if (blob != null) {
                                        HashMap b2 = bbqu.m88424b(blob);
                                        bctx c = bcty.m89986c();
                                        if (b2.containsKey("last_reported_capabilities")) {
                                            c.mo57556a(bngx.m109368a((Collection) ((ArrayList) b2.get("last_reported_capabilities"))));
                                        }
                                        if (b2.containsKey("last_reported_capabilities_time_ms")) {
                                            c.mo57555a((Long) b2.get("last_reported_capabilities_time_ms"));
                                        }
                                        bmxv = bmxv.m108566b(c.mo57554a());
                                        if (a5 != null) {
                                            a5.close();
                                        }
                                        if (b != null) {
                                            b.close();
                                        }
                                    } else {
                                        bmxv = bmvz.f131120a;
                                        if (a5 != null) {
                                            a5.close();
                                        }
                                        if (b != null) {
                                            b.close();
                                        }
                                    }
                                } else {
                                    bmxv = bmvz.f131120a;
                                    if (a5 != null) {
                                        a5.close();
                                    }
                                    if (b != null) {
                                        b.close();
                                    }
                                }
                            } catch (Exception e2) {
                                bbos.m88294d("RegCursors", "Failed to de-serialize registration properties");
                                bmxv = bmvz.f131120a;
                            } catch (Throwable th3) {
                                th2 = th3;
                                if (a5 != null) {
                                    a5.close();
                                }
                                throw th2;
                            }
                            bcav.f103920a.mo54681d();
                            bcav.f103920a.mo54679b();
                        } else {
                            if (b != null) {
                                b.close();
                            }
                            bcav.f103920a.mo54681d();
                            bcav.f103920a.mo54679b();
                            bmxv = bmvz.f131120a;
                        }
                        if (bmxv.mo66813a()) {
                            bcty bcty = (bcty) bmxv.mo66814b();
                            long longValue = ((Long) bbqt.m88417a(bbxm.f103675a).f103145an.mo58455c()).longValue();
                            int nextInt = bbxm.f103679e.nextInt(((Integer) bbqt.m88417a(bbxm.f103675a).f103146ao.mo58455c()).intValue());
                            long longValue2 = ((Long) bbqt.m88417a(bbxm.f103675a).f103144am.mo58455c()).longValue() + ((long) bbxm.f103679e.nextInt(((Integer) bbqt.m88417a(bbxm.f103675a).f103146ao.mo58455c()).intValue()));
                            bbon.m88284a();
                            long currentTimeMillis = System.currentTimeMillis();
                            if (currentTimeMillis <= bcty.mo57396a().longValue() + longValue + ((long) nextInt)) {
                                bngx a6 = bngx.m109368a((Collection) bbpw.m88374a(bbxm.f103675a).mo56349a());
                                bngx b3 = bcty.mo57397b();
                                if (a6.containsAll(b3)) {
                                }
                            }
                        }
                        bqga.m112786c(bbxm.f103685k.mo25819b(new bbxd(bbxm, a))).mo69216a(new bbxe(bbxm, a), bqfb.INSTANCE);
                    } catch (Throwable th4) {
                        th = th4;
                        if (b != null) {
                            b.close();
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    try {
                        throw new SQLException("Error when executing transaction!!", e3);
                    } catch (Throwable th5) {
                        bcav.f103920a.mo54681d();
                        bcav.f103920a.mo54679b();
                        throw th5;
                    }
                } catch (Throwable th6) {
                    bqye.m113761a(th, th6);
                }
            }
            return bqga.m112775a(a);
        }
    }
}
