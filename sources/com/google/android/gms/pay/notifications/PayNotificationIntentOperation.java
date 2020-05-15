package com.google.android.gms.pay.notifications;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PayNotificationIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final srn f81675a = srn.m36127a(sgj.PAY);

    /* renamed from: a */
    private final void m67781a(Intent intent) {
        bztg bztg;
        bztf bztf;
        try {
            bxbn bxbn = (bxbn) GeneratedMessageLite.m124016a(bxbn.f161818c, Base64.decode(intent.getStringExtra("data"), 1), bxus.m123744c());
            if ((bxbn.f161820a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                bnsl bnsl = (bnsl) f81675a.mo68388c();
                bnsl.mo68432a("com.google.android.gms.pay.notifications.PayNotificationIntentOperation", "a", 63, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("ClientPayload missing");
                return;
            }
            bxte bxte = bxbn.f161821b;
            if (bxte == null) {
                bxte = bxte.f164763c;
            }
            bxtx bxtx = bxte.f164766b;
            bxus c = bxus.m123744c();
            bztc bztc = bztc.f171313b;
            try {
                bxuc h = bxtx.mo73764h();
                GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) bztc.mo74142c(4);
                bxxv a = bxxm.f165037a.mo74228a(GeneratedMessageLite);
                a.mo74220a(GeneratedMessageLite, bxud.m123454a(h), c);
                a.mo74225d(GeneratedMessageLite);
                h.mo73787a(0);
                GeneratedMessageLite.m124027b(GeneratedMessageLite);
                bzte bzte = ((bztc) GeneratedMessageLite).f171315a;
                if (bzte == null) {
                    bnsl bnsl2 = (bnsl) f81675a.mo68388c();
                    bnsl2.mo68432a("com.google.android.gms.pay.notifications.PayNotificationIntentOperation", "a", 70, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("PayAppPayload missing");
                    return;
                }
                int a2 = bztd.m126187a(bzte.f171318a);
                int i = a2 - 1;
                if (a2 == 0) {
                    throw null;
                } else if (i == 0) {
                    if (bzte.f171318a == 1) {
                        bztg = (bztg) bzte.f171319b;
                    } else {
                        bztg = bztg.f171323b;
                    }
                    bztb bztb = bztg.f171325a;
                    if (bztb == null) {
                        bztb = bztb.f171309b;
                    }
                    m67782a(bztb, this);
                } else if (i == 1) {
                    if (bzte.f171318a == 2) {
                        bztf = (bztf) bzte.f171319b;
                    } else {
                        bztf = bztf.f171320b;
                    }
                    bztb bztb2 = bztf.f171322a;
                    if (bztb2 == null) {
                        bztb2 = bztb.f171309b;
                    }
                    m67782a(bztb2, this);
                } else if (i == 2) {
                    bnsl bnsl3 = (bnsl) f81675a.mo68388c();
                    bnsl3.mo68432a("com.google.android.gms.pay.notifications.PayNotificationIntentOperation", "a", 76, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("payAppPayload is empty");
                }
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
            bnsl bnsl4 = (bnsl) f81675a.mo68387b();
            bnsl4.mo68437a(e5);
            bnsl4.mo68432a("com.google.android.gms.pay.notifications.PayNotificationIntentOperation", "a", 85, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("Invalid protocol buffer while parsing notification");
        }
    }

    public final void onHandleIntent(Intent intent) {
        bztg bztg;
        bztf bztf;
        try {
            if ("com.google.android.gms.pay.notifications.HANDLE_NOTIFICATION".equals(intent.getAction())) {
                try {
                    bxbn bxbn = (bxbn) GeneratedMessageLite.m124016a(bxbn.f161818c, Base64.decode(intent.getStringExtra("data"), 1), bxus.m123744c());
                    if ((bxbn.f161820a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                        bnsl bnsl = (bnsl) f81675a.mo68388c();
                        bnsl.mo68432a("com.google.android.gms.pay.notifications.PayNotificationIntentOperation", "a", 63, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("ClientPayload missing");
                    } else {
                        bxte bxte = bxbn.f161821b;
                        if (bxte == null) {
                            bxte = bxte.f164763c;
                        }
                        bxtx bxtx = bxte.f164766b;
                        bxus c = bxus.m123744c();
                        bztc bztc = bztc.f171313b;
                        try {
                            bxuc h = bxtx.mo73764h();
                            GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) bztc.mo74142c(4);
                            bxxv a = bxxm.f165037a.mo74228a(GeneratedMessageLite);
                            a.mo74220a(GeneratedMessageLite, bxud.m123454a(h), c);
                            a.mo74225d(GeneratedMessageLite);
                            h.mo73787a(0);
                            GeneratedMessageLite.m124027b(GeneratedMessageLite);
                            bzte bzte = ((bztc) GeneratedMessageLite).f171315a;
                            if (bzte == null) {
                                bnsl bnsl2 = (bnsl) f81675a.mo68388c();
                                bnsl2.mo68432a("com.google.android.gms.pay.notifications.PayNotificationIntentOperation", "a", 70, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl2.mo68405a("PayAppPayload missing");
                            } else {
                                int a2 = bztd.m126187a(bzte.f171318a);
                                int i = a2 - 1;
                                if (a2 == 0) {
                                    throw null;
                                } else if (i == 0) {
                                    if (bzte.f171318a == 1) {
                                        bztg = (bztg) bzte.f171319b;
                                    } else {
                                        bztg = bztg.f171323b;
                                    }
                                    bztb bztb = bztg.f171325a;
                                    if (bztb == null) {
                                        bztb = bztb.f171309b;
                                    }
                                    m67782a(bztb, this);
                                } else if (i == 1) {
                                    if (bzte.f171318a == 2) {
                                        bztf = (bztf) bzte.f171319b;
                                    } else {
                                        bztf = bztf.f171320b;
                                    }
                                    bztb bztb2 = bztf.f171322a;
                                    if (bztb2 == null) {
                                        bztb2 = bztb.f171309b;
                                    }
                                    m67782a(bztb2, this);
                                } else if (i == 2) {
                                    bnsl bnsl3 = (bnsl) f81675a.mo68388c();
                                    bnsl3.mo68432a("com.google.android.gms.pay.notifications.PayNotificationIntentOperation", "a", 76, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl3.mo68405a("payAppPayload is empty");
                                }
                            }
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
                    }
                } catch (bxwf e5) {
                    bnsl bnsl4 = (bnsl) f81675a.mo68387b();
                    bnsl4.mo68437a(e5);
                    bnsl4.mo68432a("com.google.android.gms.pay.notifications.PayNotificationIntentOperation", "a", 85, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68405a("Invalid protocol buffer while parsing notification");
                }
                asfd.m73946a(this, intent);
            }
            bnsl bnsl5 = (bnsl) f81675a.mo68388c();
            bnsl5.mo68432a("com.google.android.gms.pay.notifications.PayNotificationIntentOperation", "onHandleIntent", 42, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68420a("Unknown intent action %s, dropping intent", intent.getAction());
            asfd.m73946a(this, intent);
        } catch (RuntimeException e6) {
            bnsl bnsl6 = (bnsl) f81675a.mo68388c();
            bnsl6.mo68437a(e6);
            bnsl6.mo68432a("com.google.android.gms.pay.notifications.PayNotificationIntentOperation", "onHandleIntent", 48, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68405a("Error handling notification");
        } catch (Throwable th) {
            asfd.m73946a(this, intent);
            throw th;
        }
    }

    /* renamed from: a */
    private final void m67782a(bztb bztb, Context context) {
        int i = bztb.f171311a;
        int i2 = 5;
        if (i == 0) {
            i2 = 6;
        } else if (i == 1) {
            i2 = 1;
        } else if (i == 2) {
            i2 = 2;
        } else if (i == 3) {
            i2 = 3;
        } else if (i == 4) {
            i2 = 4;
        } else if (i != 5) {
            i2 = 0;
        }
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            bnsl bnsl = (bnsl) f81675a.mo68390d();
            bnsl.mo68432a("com.google.android.gms.pay.notifications.PayNotificationIntentOperation", "a", 92, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Requesting Pay Module after receiving Sync Valuable");
            new alhw(context).mo40356a(7);
        }
    }
}
