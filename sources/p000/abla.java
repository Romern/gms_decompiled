package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.util.Base64;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: abla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abla {

    /* renamed from: a */
    public static final srn f57655a = srn.m36127a(sgj.GROWTH);

    /* renamed from: c */
    private static final Object f57656c = new Object();

    /* renamed from: b */
    public final abji f57657b;

    /* renamed from: d */
    private final cijl f57658d;

    public abla(cijl cijl, abji abji) {
        this.f57658d = cijl;
        this.f57657b = abji;
    }

    /* renamed from: a */
    static final /* synthetic */ void m47835a(Throwable th) {
        bnsl bnsl = (bnsl) f57655a.mo68388c();
        bnsl.mo68437a(th);
        bnsl.mo68432a("abla", "a", 308, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Storage failure during onHandleDsuwStateChange");
    }

    /* renamed from: b */
    private static bsmg m47836b(blcs blcs, String str) {
        try {
            bxte bxte = blcs.f125986k;
            if (bxte == null) {
                bxte = bxte.f164763c;
            }
            ByteString bxtx = bxte.f164766b;
            bxus b = bxus.m123743b();
            bsmg bsmg = bsmg.f145015h;
            try {
                bxuc h = bxtx.mo73764h();
                GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) bsmg.mo74142c(4);
                bxxv a = bxxm.f165037a.mo74228a(GeneratedMessageLite);
                a.mo74220a(GeneratedMessageLite, bxud.m123454a(h), b);
                a.mo74225d(GeneratedMessageLite);
                h.mo73787a(0);
                GeneratedMessageLite.m124027b(GeneratedMessageLite);
                return (bsmg) GeneratedMessageLite;
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
            bnsl bnsl = (bnsl) f57655a.mo68388c();
            bnsl.mo68432a("abla", "b", 125, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to parse gms core notification payload from %s", str);
            return null;
        }
    }

    /* renamed from: c */
    private static SharedPreferences m47837c(Context context) {
        return context.getSharedPreferences("com.google.android.gms.growth.notifications", 0);
    }

    /* renamed from: c */
    private static bsmg m47838c(blcs blcs, String str) {
        try {
            bxus a = bxus.m123742a();
            a.mo73904a(bsmg.f145016i);
            bxte bxte = blcs.f125986k;
            if (bxte == null) {
                bxte = bxte.f164763c;
            }
            ByteString bxtx = bxte.f164766b;
            bldd bldd = bldd.f126046a;
            try {
                bxuc h = bxtx.mo73764h();
                GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) bldd.mo74142c(4);
                bxxv a2 = bxxm.f165037a.mo74228a(GeneratedMessageLite);
                a2.mo74220a(GeneratedMessageLite, bxud.m123454a(h), a);
                a2.mo74225d(GeneratedMessageLite);
                h.mo73787a(0);
                GeneratedMessageLite.m124027b(GeneratedMessageLite);
                bldd bldd2 = (bldd) GeneratedMessageLite;
                bxvj bxvj = bsmg.f145016i;
                bldd2.mo74135a(bxvj);
                if (bldd2.f164952m.mo73911a(bxvj.f164958d)) {
                    bxvj bxvj2 = bsmg.f145016i;
                    bldd2.mo74135a(bxvj2);
                    Object b = bldd2.f164952m.mo73913b(bxvj2.f164958d);
                    if (b == null) {
                        b = bxvj2.f164956b;
                    } else {
                        bxvj2.mo74139a(b);
                    }
                    return (bsmg) b;
                }
                bnsl bnsl = (bnsl) f57655a.mo68388c();
                bnsl.mo68432a("abla", "c", 145, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("AppPayload missing extension");
                return null;
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
            bnsl bnsl2 = (bnsl) f57655a.mo68388c();
            bnsl2.mo68432a("abla", "c", 140, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Failed to parse app payload from %s", str);
            return null;
        }
    }

    /* renamed from: a */
    public final blcs mo32190a(String str) {
        try {
            return (blcs) GeneratedMessageLite.m124016a(blcs.f125974l, Base64.decode(str, 9), bxus.m123744c());
        } catch (bxwf | IllegalArgumentException e) {
            bnsl bnsl = (bnsl) f57655a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("abla", "a", 102, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to parse GUNS payload: %s", str);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ bqgg mo32191a(Context context, abij abij, byte[] bArr) {
        try {
            Parcelable.Creator creator = Intent.CREATOR;
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            Object createFromParcel = creator.createFromParcel(obtain);
            obtain.recycle();
            mo32198b(context, (Intent) createFromParcel, abij);
        } catch (RuntimeException e) {
            bnsl bnsl = (bnsl) f57655a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("abla", "a", 298, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("failed to re-create the notification intent. This is expected in case of an OS update for example.");
        }
        return bqga.m112775a((Object) null);
    }

    /* renamed from: a */
    public final bsmg mo32192a(blcs blcs, String str) {
        if (cejr.f182803a.mo6606a().mo79194b()) {
            bxte bxte = blcs.f125986k;
            if (bxte == null) {
                bxte = bxte.f164763c;
            }
            if (bxte.f164765a.equals("type.googleapis.com/id.boq.growth.gmscore.GmsCoreNotificationPayload")) {
                try {
                    bxte bxte2 = blcs.f125986k;
                    if (bxte2 == null) {
                        bxte2 = bxte.f164763c;
                    }
                    ByteString bxtx = bxte2.f164766b;
                    bxus b = bxus.m123743b();
                    bsmg bsmg = bsmg.f145015h;
                    try {
                        bxuc h = bxtx.mo73764h();
                        GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) bsmg.mo74142c(4);
                        bxxv a = bxxm.f165037a.mo74228a(GeneratedMessageLite);
                        a.mo74220a(GeneratedMessageLite, bxud.m123454a(h), b);
                        a.mo74225d(GeneratedMessageLite);
                        h.mo73787a(0);
                        GeneratedMessageLite.m124027b(GeneratedMessageLite);
                        return (bsmg) GeneratedMessageLite;
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
                    bnsl bnsl = (bnsl) f57655a.mo68388c();
                    bnsl.mo68432a("abla", "b", 125, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Failed to parse gms core notification payload from %s", str);
                    return null;
                }
            }
        }
        try {
            bxus a2 = bxus.m123742a();
            a2.mo73904a(bsmg.f145016i);
            bxte bxte3 = blcs.f125986k;
            if (bxte3 == null) {
                bxte3 = bxte.f164763c;
            }
            ByteString bxtx2 = bxte3.f164766b;
            bldd bldd = bldd.f126046a;
            try {
                bxuc h2 = bxtx2.mo73764h();
                GeneratedMessageLite GeneratedMessageLite2 = (GeneratedMessageLite) bldd.mo74142c(4);
                bxxv a3 = bxxm.f165037a.mo74228a(GeneratedMessageLite2);
                a3.mo74220a(GeneratedMessageLite2, bxud.m123454a(h2), a2);
                a3.mo74225d(GeneratedMessageLite2);
                h2.mo73787a(0);
                GeneratedMessageLite.m124027b(GeneratedMessageLite2);
                bldd bldd2 = (bldd) GeneratedMessageLite2;
                bxvj bxvj = bsmg.f145016i;
                bldd2.mo74135a(bxvj);
                if (bldd2.f164952m.mo73911a(bxvj.f164958d)) {
                    bxvj bxvj2 = bsmg.f145016i;
                    bldd2.mo74135a(bxvj2);
                    Object b2 = bldd2.f164952m.mo73913b(bxvj2.f164958d);
                    if (b2 == null) {
                        b2 = bxvj2.f164956b;
                    } else {
                        bxvj2.mo74139a(b2);
                    }
                    return (bsmg) b2;
                }
                bnsl bnsl2 = (bnsl) f57655a.mo68388c();
                bnsl2.mo68432a("abla", "c", 145, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("AppPayload missing extension");
                return null;
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
            bnsl bnsl3 = (bnsl) f57655a.mo68388c();
            bnsl3.mo68432a("abla", "c", 140, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("Failed to parse app payload from %s", str);
            return null;
        }
    }

    /* renamed from: b */
    public final boolean mo32197b(Context context) {
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "user_setup_personalization_state") != 10) {
                return false;
            }
            return true;
        } catch (Settings.SettingNotFoundException e) {
            bnsl bnsl = (bnsl) f57655a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("abla", "b", 259, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("USER_SETUP_PERSONALIZATION setting not found during check DSUW state.");
            return true;
        }
    }

    /* renamed from: b */
    public final boolean mo32198b(Context context, Intent intent, abij abij) {
        if (!cejr.m136993b()) {
            mo32195a(context, intent, abij);
            return true;
        } else if (mo32197b(context)) {
            mo32195a(context, intent, abij);
            return true;
        } else {
            bnsl bnsl = (bnsl) f57655a.mo68390d();
            bnsl.mo68432a("abla", "b", 277, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("DSUW state not complete. Rescheduling notification.");
            ((ablh) this.f57658d.mo6445a()).mo32201a(context, intent);
            return false;
        }
    }

    /* renamed from: a */
    public final String mo32193a(Context context, blcs blcs) {
        if (blcs != null) {
            blcw blcw = blcs.f125977b;
            if (blcw == null) {
                blcw = blcw.f125993b;
            }
            if (!blcw.f125995a.isEmpty()) {
                blcw blcw2 = blcs.f125977b;
                if (blcw2 == null) {
                    blcw2 = blcw.f125993b;
                }
                String str = blcw2.f125995a;
                try {
                    for (Account account : soz.m35801d(context, context.getPackageName())) {
                        if (str.equals(gik.m13218f(context, account.name))) {
                            return account.name;
                        }
                    }
                } catch (gid | IOException e) {
                    bnsl bnsl = (bnsl) f57655a.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("abla", "a", 170, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Failed to get account ID for OID: %s.", str);
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final Set mo32194a(Context context) {
        Set<String> stringSet;
        synchronized (f57656c) {
            stringSet = m47837c(context).getStringSet("shown_notification_types", bnon.f131923a);
        }
        return stringSet;
    }

    /* renamed from: a */
    public final void mo32195a(Context context, Intent intent, abij abij) {
        Intent intent2 = (Intent) intent.getParcelableExtra("gcmIntent");
        intent2.setClassName(context.getApplicationContext(), "com.google.android.gms.notifications.GcmBroadcastReceiver");
        context.sendOrderedBroadcast(intent2, null);
        this.f57657b.f57576a.mo60777a(abjh.f57575a, bqfb.INSTANCE);
        String stringExtra = intent2.getStringExtra("gms.gnots.payload");
        blcs a = mo32190a(stringExtra);
        if (a == null) {
            bnsl bnsl = (bnsl) f57655a.mo68388c();
            bnsl.mo68432a("abla", "a", 193, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to log notification was forwarded to Guns module. Reason: failed to get payload.");
            return;
        }
        bsmg a2 = mo32192a(a, stringExtra);
        if (a2 == null) {
            bnsl bnsl2 = (bnsl) f57655a.mo68388c();
            bnsl2.mo68432a("abla", "a", 202, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to log notification was forwarded to Guns module. Reason: failed to get gmsCoreNotificationPayload.");
            return;
        }
        bsqe bsqe = a2.f145019b;
        if (bsqe == null) {
            bsqe = bsqe.f146627e;
        }
        String str = bsqe.f146632d;
        synchronized (f57656c) {
            HashSet hashSet = new HashSet(mo32194a(context));
            hashSet.add(str);
            m47837c(context).edit().putStringSet("shown_notification_types", hashSet).apply();
        }
        String a3 = mo32193a(context, a);
        bsqe bsqe2 = a2.f145019b;
        if (bsqe2 == null) {
            bsqe2 = bsqe.f146627e;
        }
        mo32196a(a3, bsqe2, 4, abij);
    }

    /* renamed from: a */
    public final void mo32196a(String str, bsqe bsqe, int i, abij abij) {
        bxvd da = bspy.f146601f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bspy bspy = (bspy) da.f164949b;
        bspy.f146604b = i - 1;
        int i2 = bspy.f146603a | 1;
        bspy.f146603a = i2;
        bsqe.getClass();
        bspy.f146606d = bsqe;
        bspy.f146603a = i2 | 4;
        abij.mo32130a(str, da);
    }
}
