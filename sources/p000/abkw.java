package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.Activity;

/* renamed from: abkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abkw {

    /* renamed from: a */
    private static final srn f57650a = srn.m36127a(sgj.GROWTH);

    /* renamed from: a */
    public static Intent m47829a(cejn cejn) {
        Intent intent = new Intent();
        if ((cejn.f182793a & 1) != 0) {
            intent.setAction(cejn.f182794b);
        }
        if ((cejn.f182793a & 2) != 0) {
            intent.setData(Uri.parse(cejn.f182795c));
        }
        if ((cejn.f182793a & 4) != 0) {
            intent.setComponent(ComponentName.unflattenFromString(cejn.f182796d));
        }
        if ((cejn.f182793a & 8) != 0) {
            intent.setFlags(cejn.f182797e);
        }
        if ((cejn.f182793a & 16) != 0) {
            cejm cejm = cejn.f182798f;
            if (cejm == null) {
                cejm = cejm.f182788b;
            }
            m47830a(intent, cejm);
        }
        return intent;
    }

    /* renamed from: a */
    public static void m47830a(Intent intent, cejm cejm) {
        String str;
        bxtx bxtx;
        int i;
        boolean z;
        double d;
        bxwc bxwc = cejm.f182790a;
        int size = bxwc.size();
        for (int i2 = 0; i2 < size; i2++) {
            cejl cejl = (cejl) bxwc.get(i2);
            cejk a = cejk.m136983a(cejl.f182784a);
            cejc cejc = cejc.START_ACTIVITY;
            switch (a.ordinal()) {
                case 0:
                    String str2 = cejl.f182786c;
                    if (cejl.f182784a == 2) {
                        str = (String) cejl.f182785b;
                    } else {
                        str = "";
                    }
                    intent.putExtra(str2, str);
                    break;
                case 1:
                    String str3 = cejl.f182786c;
                    if (cejl.f182784a == 3) {
                        bxtx = (bxtx) cejl.f182785b;
                    } else {
                        bxtx = bxtx.f164797b;
                    }
                    intent.putExtra(str3, bxtx.mo73780k());
                    break;
                case 2:
                    String str4 = cejl.f182786c;
                    if (cejl.f182784a == 4) {
                        i = ((Integer) cejl.f182785b).intValue();
                    } else {
                        i = 0;
                    }
                    intent.putExtra(str4, i);
                    break;
                case 3:
                    intent.putExtra(cejl.f182786c, cejl.f182784a == 5 ? ((Long) cejl.f182785b).longValue() : 0);
                    break;
                case 4:
                    String str5 = cejl.f182786c;
                    if (cejl.f182784a == 6) {
                        z = ((Boolean) cejl.f182785b).booleanValue();
                    } else {
                        z = false;
                    }
                    intent.putExtra(str5, z);
                    break;
                case 5:
                    String str6 = cejl.f182786c;
                    if (cejl.f182784a == 7) {
                        d = ((Double) cejl.f182785b).doubleValue();
                    } else {
                        d = 0.0d;
                    }
                    intent.putExtra(str6, d);
                    break;
                case 6:
                    bnsl bnsl = (bnsl) f57650a.mo68387b();
                    bnsl.mo68432a("abkw", "a", 66, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Failed to handle unsupported extra type %s", a);
                    break;
            }
        }
    }

    /* renamed from: a */
    public static void m47831a(Activity activity, Intent intent, cejg cejg) {
        ceje ceje;
        ceje ceje2;
        cejd cejd;
        cejd cejd2;
        cejc a = cejc.m136975a(cejg.f182763a);
        cejk cejk = cejk.STRING_VALUE;
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            if (cejg.f182763a == 1) {
                ceje = (ceje) cejg.f182764b;
            } else {
                ceje = ceje.f182754c;
            }
            if (ceje.f182756a) {
                if (cejg.f182763a == 1) {
                    ceje2 = (ceje) cejg.f182764b;
                } else {
                    ceje2 = ceje.f182754c;
                }
                activity.startActivityForResult(intent, ceje2.f182757b);
                return;
            }
            activity.startActivity(intent);
        } else if (ordinal == 1) {
            activity.startService(intent);
        } else if (ordinal == 2) {
            if (cejg.f182763a == 3) {
                cejd = (cejd) cejg.f182764b;
            } else {
                cejd = cejd.f182750c;
            }
            if ((cejd.f182752a & 1) != 0) {
                if (cejg.f182763a == 3) {
                    cejd2 = (cejd) cejg.f182764b;
                } else {
                    cejd2 = cejd.f182750c;
                }
                activity.sendBroadcast(intent, cejd2.f182753b);
                return;
            }
            activity.sendBroadcast(intent);
        } else if (ordinal == 3) {
            bnsl bnsl = (bnsl) f57650a.mo68387b();
            bnsl.mo68432a("abkw", "a", 95, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to handle unsupported operation %s", a);
        }
    }
}
