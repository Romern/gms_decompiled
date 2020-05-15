package p000;

import android.content.Context;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.google.android.chimera.config.ModuleManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: zmr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zmr {

    /* renamed from: a */
    private final Context f55486a;

    /* renamed from: b */
    private final String f55487b;

    /* renamed from: c */
    private final zre f55488c;

    /* renamed from: d */
    private final zrk f55489d;

    /* renamed from: e */
    private final zeb f55490e;

    /* renamed from: f */
    private final zjn f55491f;

    /* renamed from: g */
    private final zst f55492g;

    /* renamed from: h */
    private final sqv f55493h;

    public zmr(Context context, String str, zre zre, zrk zrk, zeb zeb, zst zst, sqv sqv) {
        this.f55486a = context;
        this.f55487b = str;
        this.f55488c = zre;
        this.f55489d = zrk;
        this.f55490e = zeb;
        this.f55491f = new zjn(context, sqv);
        this.f55492g = zst;
        this.f55493h = sqv;
    }

    /* renamed from: a */
    private static String m45776a(long j) {
        if (j <= 0) {
            return "unset";
        }
        return String.format(Locale.US, "%1$tF %1$tT", Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo31261a(PrintWriter printWriter) {
        String str;
        String str2;
        PrintWriter printWriter2 = printWriter;
        zeb zeb = this.f55490e;
        printWriter2.append((CharSequence) "RecordingManager:\n");
        for (Map.Entry entry : zeb.f54999b.entrySet()) {
            printWriter2.append((CharSequence) "  ").append((CharSequence) entry.getKey()).append((CharSequence) ":\n");
            for (zkh zkh : (List) entry.getValue()) {
                yqe yqe = zkh.f55301d;
                printWriter2.append((CharSequence) "    ").append((CharSequence) yyo.m45045c(yqe.f54381b));
                cadr cadr = yqe.f54383d;
                if (cadr != null) {
                    printWriter2.append((CharSequence) " for ").append((CharSequence) yyo.m45044b(cadr));
                }
                printWriter2.append((CharSequence) " active ").append((CharSequence) String.format(Locale.US, "%1$tF %1$tT", Long.valueOf(zkh.f55304g)));
                printWriter2.append((CharSequence) "\n");
            }
        }
        zeb.f55000c.mo19156a(printWriter2);
        zeb.f55001d.mo31404a(printWriter2);
        printWriter2.append((CharSequence) "=== Subscriptions ===\n");
        char c = 10;
        try {
            bnrd a = this.f55489d.mo31396a().iterator();
            while (a.hasNext()) {
                printWriter2.append((CharSequence) ((yqe) a.next()).toString()).append(10);
            }
        } catch (IOException e) {
            printWriter2.append((CharSequence) "Error: ").append((CharSequence) e.toString()).append(10);
        }
        printWriter2.append((CharSequence) "=== Latest sync details ===\n");
        bngx a2 = this.f55492g.mo31467a(this.f55493h.mo20505a());
        bnre i = a2.subList(Math.max(a2.size() - 5, 0), a2.size()).listIterator();
        while (i.hasNext()) {
            bpgw bpgw = (bpgw) i.next();
            Locale locale = Locale.US;
            Object[] objArr = new Object[18];
            objArr[0] = Long.valueOf(bpgw.f137574b);
            objArr[1] = Integer.valueOf(bpgw.f137575c);
            objArr[2] = Integer.valueOf(bpgw.f137580h);
            objArr[3] = Integer.valueOf(bpgw.f137582j);
            objArr[4] = Integer.valueOf(bpgw.f137583k);
            objArr[5] = Integer.valueOf(bpgw.f137589q);
            int i2 = 6;
            objArr[6] = Integer.valueOf(bpgw.f137590r);
            objArr[7] = Integer.valueOf(bpgw.f137585m);
            objArr[8] = Integer.valueOf(bpgw.f137586n);
            objArr[9] = Integer.valueOf(bpgw.f137587o);
            objArr[c] = Integer.valueOf(bpgw.f137588p);
            objArr[11] = Integer.valueOf(bpgw.f137584l);
            objArr[12] = Integer.valueOf(bpgw.f137578f);
            objArr[13] = Integer.valueOf(bpgw.f137593u);
            objArr[14] = Integer.valueOf(bpgw.f137594v);
            objArr[15] = Integer.valueOf(bpgw.f137591s);
            objArr[16] = Integer.valueOf(bpgw.f137592t);
            bpgy a3 = bpgy.m111917a(bpgw.f137576d);
            if (a3 == null) {
                a3 = bpgy.UNKNOWN_SYNC_SOURCE;
            }
            objArr[17] = a3;
            printWriter2.format(locale, "SyncDetails{start:%1$tF %1$tT, Durations (ms): %2$s [data sources:%14$s data point upload:%15$s data point download (bidi):%6$s data point download:%7$s session upload:%16$s session download:%17$s], Datasources sent:%8$s received:%9$s, Sessions sent:%10$s received:%11$s, ChangeLogs sent:%3$s acked:%4$s failed:%5$s received:%12$s, RPC count:%13$s SyncSource:%18$s", objArr);
            if (cdza.m135455c()) {
                bxwc bxwc = bpgw.f137581i;
                int size = bxwc.size();
                int i3 = 0;
                while (i3 < size) {
                    bpft bpft = (bpft) bxwc.get(i3);
                    Locale locale2 = Locale.US;
                    Object[] objArr2 = new Object[i2];
                    objArr2[0] = Integer.valueOf(bpft.f137441d + bpft.f137442e);
                    if (!bpft.f137440c) {
                        str = "non-platform";
                    } else {
                        str = "platform";
                    }
                    objArr2[1] = str;
                    bzzv a4 = bzzv.m126373a(bpft.f137439b);
                    if (a4 == null) {
                        a4 = bzzv.UNKNOWN_DATA_TYPE;
                    }
                    switch (a4.ordinal()) {
                        case 0:
                        case 6:
                        case 7:
                        case 12:
                        case 17:
                        case 24:
                        case 25:
                        case 27:
                        case 36:
                        case FelicaException.TYPE_NOT_CLOSED:
                        case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                        case FelicaException.TYPE_RESET_FAILED:
                        case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                        case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                        case 47:
                        case FelicaException.TYPE_NOW_EXECUTING_FALP:
                        case FelicaException.TYPE_MFC_NOT_FOUND:
                        case 62:
                        case 63:
                        case 64:
                        case KeyInformation.AES128_DES56:
                        case 73:
                            str2 = "unknown";
                            break;
                        case 1:
                            str2 = "com.google.activity.samples";
                            break;
                        case 2:
                            str2 = "com.google.activity.segment";
                            break;
                        case 3:
                            str2 = "com.google.calories.bmr";
                            break;
                        case 4:
                            str2 = "com.google.calories.expended";
                            break;
                        case 5:
                            str2 = "com.google.distance.delta";
                            break;
                        case 8:
                            str2 = "com.google.heart_rate.bpm";
                            break;
                        case 9:
                            str2 = "com.google.height";
                            break;
                        case 10:
                            str2 = "com.google.location.sample";
                            break;
                        case 11:
                            str2 = "com.google.nutrition";
                            break;
                        case 13:
                            str2 = "com.google.speed";
                            break;
                        case 14:
                            str2 = "com.google.step_count.cumulative";
                            break;
                        case 15:
                            str2 = "com.google.step_count.delta";
                            break;
                        case 16:
                            str2 = "com.google.weight";
                            break;
                        case 18:
                            str2 = "com.google.step_count.cadence";
                            break;
                        case 19:
                            str2 = "com.google.stride_model";
                            break;
                        case 20:
                            str2 = "com.google.internal.sports_model";
                            break;
                        case 21:
                            str2 = "com.google.calories.consumed";
                            break;
                        case 22:
                            str2 = "com.google.power.sample";
                            break;
                        case 23:
                            str2 = "com.google.activity.sample";
                            break;
                        case 26:
                            str2 = "com.google.sensor.events";
                            break;
                        case 28:
                            str2 = "com.google.internal.goal";
                            break;
                        case 29:
                            str2 = "com.google.location.track";
                            break;
                        case 30:
                            str2 = "com.google.distance.cumulative";
                            break;
                        case 31:
                            str2 = "com.google.cycling.wheel_revolution.cumulative";
                            break;
                        case 32:
                            str2 = "com.google.cycling.wheel_revolution.rpm";
                            break;
                        case 33:
                            str2 = "com.google.cycling.pedaling.cumulative";
                            break;
                        case 34:
                            str2 = "com.google.cycling.pedaling.cadence";
                            break;
                        case 35:
                            str2 = "com.google.body.fat.percentage";
                            break;
                        case FelicaException.TYPE_USED_BY_OTHER_APP:
                            str2 = "com.google.hydration";
                            break;
                        case FelicaException.TYPE_PUSH_FAILED:
                            str2 = "com.google.active_minutes";
                            break;
                        case 41:
                            str2 = "com.google.activity.exercise";
                            break;
                        case FelicaException.TYPE_ALREADY_ACTIVATED:
                            str2 = "com.google.heart_minutes";
                            break;
                        case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                            str2 = "com.google.location.bounding_box";
                            break;
                        case 48:
                            str2 = "com.google.blood_pressure";
                            break;
                        case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                            str2 = "com.google.blood_glucose";
                            break;
                        case 50:
                            str2 = "com.google.oxygen_saturation";
                            break;
                        case 51:
                            str2 = "com.google.body.temperature";
                            break;
                        case 52:
                            str2 = "com.google.body.temperature.basal";
                            break;
                        case 53:
                            str2 = "com.google.cervical_mucus";
                            break;
                        case 54:
                            str2 = "com.google.cervical_position";
                            break;
                        case 55:
                            str2 = "com.google.menstruation";
                            break;
                        case FelicaException.TYPE_ACTIVATE_FAILED:
                            str2 = "com.google.ovulation_test";
                            break;
                        case 57:
                            str2 = "com.google.vaginal_spotting";
                            break;
                        case FelicaException.TYPE_OFFLINE_CANCELED:
                            str2 = "com.google.device_on_body";
                            break;
                        case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                            str2 = "com.google.internal.primary_device";
                            break;
                        case 66:
                            str2 = "com.google.heart_rate.summary";
                            break;
                        case KeyInformation.AES128_DES112:
                            str2 = "com.google.weight.summary";
                            break;
                        case 68:
                            str2 = "com.google.calories.bmr.summary";
                            break;
                        case 69:
                            str2 = "com.google.power.summary";
                            break;
                        case 70:
                            str2 = "com.google.body.temperature.summary";
                            break;
                        case 71:
                            str2 = "com.google.blood_glucose.summary";
                            break;
                        case 72:
                            str2 = "com.google.blood_pressure.summary";
                            break;
                        case 74:
                            str2 = "com.google.speed.summary";
                            break;
                        case 75:
                            str2 = "com.google.activity.summary";
                            break;
                        case 76:
                            str2 = "com.google.body.temperature.basal.summary";
                            break;
                        case 77:
                            str2 = "com.google.nutrition.summary";
                            break;
                        case 78:
                            str2 = "com.google.height.summary";
                            break;
                        case KeyInformation.AES128:
                            str2 = "com.google.body.fat.percentage.summary";
                            break;
                        case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_LONG_MESSAGE /*80*/:
                            str2 = "com.google.oxygen_saturation.summary";
                            break;
                        case 81:
                            str2 = "com.google.heart_minutes.summary";
                            break;
                        case 82:
                            str2 = "com.google.internal.sleep_attributes";
                            break;
                        case 83:
                            str2 = "com.google.sleep.segment";
                            break;
                        case 84:
                            str2 = "com.google.internal.sleep_schedule";
                            break;
                        default:
                            throw new AssertionError();
                    }
                    objArr2[2] = str2;
                    objArr2[3] = Integer.valueOf(bpft.f137441d);
                    objArr2[4] = Integer.valueOf(bpft.f137442e);
                    objArr2[5] = Integer.valueOf(bpft.f137443f);
                    printWriter2.format(locale2, "\n\tSent %1$s %2$s %3$s ChangeLogs [insert:%4$s delete:%5$s bytes:%6$s]", objArr2);
                    i3++;
                    i2 = 6;
                }
                continue;
            }
            printWriter2.append((CharSequence) "}\n");
            c = 10;
        }
        if (ceab.m135734g()) {
            zvj.m46562a(printWriter);
        } else {
            sre.m36089i(this.f55486a);
        }
        yvq.m44917j(this.f55486a);
        sre.m36089i(this.f55486a);
        zvj.m46567c(printWriter);
        printWriter2.append((CharSequence) "=== Sync ===\n");
        try {
            printWriter2.append((CharSequence) String.format("Adapter enabled: %s\n", Boolean.valueOf(zux.m46541b(this.f55487b)))).append((CharSequence) String.format("Periodic Sync initialized: %s", Boolean.valueOf(zuq.m46520c(this.f55487b)))).append((CharSequence) "\nLast sync: ").append((CharSequence) m45776a(zuw.m46534a(this.f55486a, this.f55487b))).append((CharSequence) "\nOldest un-synced phone: ").append((CharSequence) m45776a(this.f55488c.mo31349b())).append((CharSequence) "\nOldest un-synced wear: ").append((CharSequence) m45776a(zuw.m46538d(this.f55486a, this.f55487b).getLong("oldest_wear", -1))).append((CharSequence) "\nOverlap window start: ").append((CharSequence) m45776a(zuw.m46536b(this.f55486a, this.f55487b)));
            zst zst = this.f55492g;
            long a5 = this.f55493h.mo20505a();
            bngf f = bngf.m109302f();
            bnre i4 = zst.mo31467a(a5).listIterator();
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i4.hasNext()) {
                bpgw bpgw2 = (bpgw) i4.next();
                i5++;
                i6 += bpgw2.f137578f;
                i7 += bpgw2.f137575c;
                i8 += bpgw2.f137584l + bpgw2.f137586n + bpgw2.f137588p;
                i9 += bpgw2.f137580h + bpgw2.f137585m + bpgw2.f137587o;
                bpgy a6 = bpgy.m111917a(bpgw2.f137576d);
                if (a6 == null) {
                    a6 = bpgy.UNKNOWN_SYNC_SOURCE;
                }
                f.add(cadu.m126522a(a6.f137611k));
            }
            bnha h = bnhe.m109414h();
            for (bnno bnno : f.mo67324e()) {
                h.mo67695b((cadu) bnno.f131866a, Integer.valueOf(bnno.mo68118a()));
            }
            printWriter2.append((CharSequence) "\nDaily summary:\n").append((CharSequence) new zso(i5, i6, i7, i8, i9, bnhe.m109413a(h.mo67618b())).toString());
            printWriter2.append((CharSequence) "\nData source stats:\n");
            for (Map.Entry entry2 : this.f55488c.mo31389i().entrySet()) {
                ygw ygw = (ygw) entry2.getValue();
                printWriter2.append((CharSequence) String.format("\t%s: %s-%s min contiguous time: %s, remote: %s\n", ((caae) entry2.getKey()).f172326b, Long.valueOf(ygw.mo30468a()), Long.valueOf(ygw.mo30469b()), Long.valueOf(ygw.f53785e), Boolean.valueOf(ygw.f53782b)));
            }
        } catch (IOException e2) {
            printWriter2.append((CharSequence) "Error: ").append((CharSequence) e2.toString()).append(10);
        }
        try {
            ModuleManager.ModuleInfo currentModule = ModuleManager.get(this.f55486a).getCurrentModule();
            printWriter2.append((CharSequence) "=== Module info ===\n");
            printWriter2.append((CharSequence) String.format("module id: %s version:%s\n", currentModule.moduleId, Integer.valueOf(currentModule.moduleVersion)));
            ModuleManager.ModuleApkInfo moduleApkInfo = currentModule.moduleApk;
            printWriter2.append((CharSequence) String.format("apk: %s %s(%s)\n", moduleApkInfo.apkPackageName, moduleApkInfo.apkVersionName, Integer.valueOf(moduleApkInfo.apkVersionCode)));
        } catch (IllegalStateException e3) {
            printWriter2.append((CharSequence) "- no module info -\n");
        }
        printWriter2.append((CharSequence) "=== System ===\n").append((CharSequence) "Boot: ").append((CharSequence) m45776a(TimeUnit.NANOSECONDS.toMillis(this.f55491f.mo31174a()))).append((CharSequence) "\nLast crash: ").append((CharSequence) m45776a(zvo.f56032a.get())).append((CharSequence) "\nLast update: ").append((CharSequence) m45776a(zvo.m46575a(this.f55486a))).append(10);
    }
}
