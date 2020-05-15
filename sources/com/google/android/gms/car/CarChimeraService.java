package com.google.android.gms.car;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.hardware.usb.UsbAccessory;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.RemoteViews;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.Service;
import com.google.android.gms.car.compat.TracingBroadcastReceiver;
import com.google.android.gms.car.diagnostics.CriticalError;
import com.google.android.gms.carsetup.BinderParcel;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.FileDescriptor;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CarChimeraService extends Service implements noz {

    /* renamed from: a */
    public static final bnsn f29307a = odk.m28481a("CAR.SERVICE");

    /* renamed from: d */
    private static final bnic f29308d = bnic.m109490a("android.permission-group.MICROPHONE", "android.permission-group.PHONE");

    /* renamed from: b */
    public npz f29309b;

    /* renamed from: c */
    public oei f29310c;

    /* renamed from: e */
    private ConnectionStatusReceiver f29311e;

    /* renamed from: f */
    private olx f29312f;

    /* renamed from: g */
    private final ozl f29313g = new ozo();

    /* renamed from: h */
    private UiModeManager f29314h;

    /* renamed from: i */
    private Configuration f29315i;

    /* renamed from: j */
    private npd f29316j;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class ConnectionStatusReceiver extends TracingBroadcastReceiver {
        public ConnectionStatusReceiver() {
            super("car");
        }

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            bnsn bnsn = CarChimeraService.f29307a;
            String action = intent.getAction();
            if ("com.google.android.gms.car.CarChimeraService.EXIT_APP".equals(action)) {
                if (ccvx.m131833b()) {
                    bnsi c = CarChimeraService.f29307a.mo68388c();
                    c.mo68432a("com.google.android.gms.car.CarChimeraService$ConnectionStatusReceiver", "a", 607, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Received debug request to reset connection.");
                    CarChimeraService.this.f29309b.mo21200m();
                    return;
                }
                CarChimeraService.this.mo17316a(CriticalError.m22086a(bpdn.PROTOCOL_BYEBYE_REQUESTED_BY_USER, bpdo.BYEBYE_BY_USER));
            } else if ("android.hardware.usb.action.USB_ACCESSORY_DETACHED".equals(action) && ((UsbAccessory) intent.getParcelableExtra("accessory")) != null) {
                CarChimeraService.this.mo17316a(CriticalError.m22086a(bpdn.PROTOCOL_BYEBYE_REQUESTED_BY_USER, bpdo.BYEBYE_BY_USER));
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: npz.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      npz.a(java.lang.String, double):double
      npz.a(java.lang.String, int):int
      npz.a(android.content.res.Configuration, int):void
      npz.a(com.google.android.gms.car.CarInfo, java.lang.String):void
      npz.a(java.lang.String, java.lang.String):void
      npz.a(java.lang.String, java.util.List):void
      npz.a(byte[], int):void
      npz.a(android.content.Intent, android.os.Bundle):boolean
      nqu.a(java.lang.String, double):double
      nqu.a(java.lang.String, int):int
      nqu.a(com.google.android.gms.car.CarInfo, java.lang.String):void
      nqu.a(java.lang.String, java.lang.String):void
      nqu.a(java.lang.String, java.util.List):void
      nqu.a(byte[], int):void
      nqu.a(android.content.Intent, android.os.Bundle):boolean
      nmw.a(android.content.res.Configuration, int):void
      nmw.a(java.lang.String, java.lang.String):void
      nmw.a(java.lang.String, java.util.List):void
      nqu.a(java.lang.String, double):double
      nqu.a(java.lang.String, int):int
      nqu.a(com.google.android.gms.car.CarInfo, java.lang.String):void
      nqu.a(java.lang.String, java.lang.String):void
      nqu.a(java.lang.String, java.util.List):void
      nqu.a(byte[], int):void
      nqu.a(android.content.Intent, android.os.Bundle):boolean
      npz.a(java.lang.String, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0107 A[Catch:{ IllegalStateException -> 0x01b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0143 A[Catch:{ IllegalStateException -> 0x01b4 }] */
    /* renamed from: a */
    private final void m22053a(PrintWriter printWriter, String[] strArr) {
        char c;
        Intent intent;
        Intent intent2;
        Intent intent3;
        String str;
        String lowerCase;
        boolean z;
        char c2;
        PrintWriter printWriter2 = printWriter;
        String[] strArr2 = strArr;
        String str2 = strArr2[0];
        int i = 1;
        switch (str2.hashCode()) {
            case -1877977640:
                if (str2.equals("reset-audio")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 113762:
                if (str2.equals("set")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 94627080:
                if (str2.equals("check")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 106858757:
                if (str2.equals("power")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 109757538:
                if (str2.equals("start")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str3 = "false";
        if (c == 0) {
            try {
                Intent intent4 = new Intent();
                Intent intent5 = intent4;
                String str4 = null;
                int i2 = 1;
                Uri uri = null;
                boolean z2 = false;
                while (true) {
                    if (i2 < strArr2.length) {
                        int i3 = i2 + 1;
                        String str5 = strArr2[i2];
                        if (str5.equals("-a")) {
                            str = str3;
                            i2 = i3 + 1;
                            intent5.setAction(strArr2[i3]);
                            if (intent5 == intent4) {
                                z2 = true;
                            }
                        } else if (str5.equals("-d")) {
                            str = str3;
                            i2 = i3 + 1;
                            uri = Uri.parse(strArr2[i3]);
                            if (intent5 == intent4) {
                                z2 = true;
                            }
                        } else if (str5.equals("-t")) {
                            str = str3;
                            i2 = i3 + 1;
                            str4 = strArr2[i3];
                            if (intent5 == intent4) {
                                z2 = true;
                            }
                        } else if (!str5.equals("-c")) {
                            if (str5.equals("-e")) {
                                str = str3;
                            } else if (str5.equals("--es")) {
                                str = str3;
                            } else if (str5.equals("--esn")) {
                                str = str3;
                                i2 = i3 + 1;
                                intent5.putExtra(strArr2[i3], (String) null);
                            } else if (str5.equals("--ei")) {
                                int i4 = i3 + 1;
                                intent5.putExtra(strArr2[i3], Integer.decode(strArr2[i4]));
                                i2 = i4 + 1;
                                str = str3;
                            } else if (str5.equals("--eu")) {
                                int i5 = i3 + 1;
                                intent5.putExtra(strArr2[i3], Uri.parse(strArr2[i5]));
                                i2 = i5 + 1;
                                str = str3;
                            } else if (str5.equals("--ecn")) {
                                str = str3;
                                int i6 = i3 + 1;
                                String str6 = strArr2[i3];
                                int i7 = i6 + 1;
                                String str7 = strArr2[i6];
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str7);
                                if (unflattenFromString == null) {
                                    String valueOf = String.valueOf(str7);
                                    throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Bad component name: ") : "Bad component name: ".concat(valueOf));
                                } else {
                                    intent5.putExtra(str6, unflattenFromString);
                                    i2 = i7;
                                }
                            } else if (str5.equals("--eia")) {
                                str = str3;
                                int i8 = i3 + 1;
                                String str8 = strArr2[i3];
                                int i9 = i8 + 1;
                                String[] split = strArr2[i8].split(",");
                                int[] iArr = new int[split.length];
                                int i10 = 0;
                                while (true) {
                                    int i11 = i9;
                                    if (i10 < split.length) {
                                        iArr[i10] = Integer.decode(split[i10]).intValue();
                                        i10++;
                                        i9 = i11;
                                    } else {
                                        intent5.putExtra(str8, iArr);
                                        i2 = i11;
                                    }
                                }
                            } else if (str5.equals("--el")) {
                                int i12 = i3 + 1;
                                intent5.putExtra(strArr2[i3], Long.valueOf(strArr2[i12]));
                                i2 = i12 + 1;
                                str = str3;
                            } else if (str5.equals("--ela")) {
                                str = str3;
                                int i13 = i3 + 1;
                                String str9 = strArr2[i3];
                                int i14 = i13 + 1;
                                String[] split2 = strArr2[i13].split(",");
                                long[] jArr = new long[split2.length];
                                int i15 = 0;
                                while (true) {
                                    int i16 = i14;
                                    if (i15 < split2.length) {
                                        jArr[i15] = Long.valueOf(split2[i15]).longValue();
                                        i15++;
                                        i14 = i16;
                                    } else {
                                        intent5.putExtra(str9, jArr);
                                        i2 = i16;
                                        z2 = true;
                                    }
                                }
                            } else if (str5.equals("--ef")) {
                                int i17 = i3 + 1;
                                intent5.putExtra(strArr2[i3], Float.valueOf(strArr2[i17]));
                                i2 = i17 + 1;
                                str = str3;
                                z2 = true;
                            } else if (str5.equals("--efa")) {
                                int i18 = i3 + 1;
                                String str10 = strArr2[i3];
                                int i19 = i18 + 1;
                                String[] split3 = strArr2[i18].split(",");
                                float[] fArr = new float[split3.length];
                                int i20 = i19;
                                int i21 = 0;
                                while (true) {
                                    str = str3;
                                    if (i21 < split3.length) {
                                        fArr[i21] = Float.valueOf(split3[i21]).floatValue();
                                        i21++;
                                        str3 = str;
                                    } else {
                                        intent5.putExtra(str10, fArr);
                                        i2 = i20;
                                        z2 = true;
                                    }
                                }
                            } else if (str5.equals("--esa")) {
                                int i22 = i3 + 1;
                                intent5.putExtra(strArr2[i3], strArr2[i22].split("(?<!\\\\),"));
                                i2 = i22 + 1;
                                str = str3;
                                z2 = true;
                            } else if (str5.equals("--ez")) {
                                int i23 = i3 + 1;
                                String str11 = strArr2[i3];
                                int i24 = i23 + 1;
                                lowerCase = strArr2[i23].toLowerCase();
                                if ("true".equals(lowerCase) || "t".equals(lowerCase)) {
                                    z = true;
                                } else {
                                    if (!str3.equals(lowerCase) && !"f".equals(lowerCase)) {
                                        if (Integer.decode(lowerCase).intValue() != 0) {
                                            z = true;
                                        }
                                    }
                                    z = false;
                                }
                                intent5.putExtra(str11, z);
                                i2 = i24;
                                str = str3;
                            } else if (str5.equals("-n")) {
                                int i25 = i3 + 1;
                                String str12 = strArr2[i3];
                                ComponentName unflattenFromString2 = ComponentName.unflattenFromString(str12);
                                if (unflattenFromString2 == null) {
                                    String valueOf2 = String.valueOf(str12);
                                    throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("Bad component name: ") : "Bad component name: ".concat(valueOf2));
                                }
                                intent5.setComponent(unflattenFromString2);
                                z2 = (intent5 == intent4) | z2;
                                str = str3;
                                i2 = i25;
                            } else if (str5.equals("-p")) {
                                int i26 = i3 + 1;
                                intent5.setPackage(strArr2[i3]);
                                z2 = (intent5 == intent4) | z2;
                                i2 = i26;
                                str = str3;
                            } else if (!str5.equals("-f")) {
                                if (str5.equals("--grant-read-uri-permission")) {
                                    intent5.addFlags(1);
                                } else if (str5.equals("--grant-write-uri-permission")) {
                                    intent5.addFlags(2);
                                } else if (str5.equals("--grant-persistable-uri-permission")) {
                                    intent5.addFlags(64);
                                } else if (str5.equals("--grant-prefix-uri-permission")) {
                                    intent5.addFlags(128);
                                } else if (str5.equals("--exclude-stopped-packages")) {
                                    intent5.addFlags(16);
                                } else if (str5.equals("--include-stopped-packages")) {
                                    intent5.addFlags(32);
                                } else if (str5.equals("--debug-log-resolution")) {
                                    intent5.addFlags(8);
                                } else if (str5.equals("--activity-brought-to-front")) {
                                    intent5.addFlags(4194304);
                                } else if (str5.equals("--activity-clear-top")) {
                                    intent5.addFlags(67108864);
                                } else if (str5.equals("--activity-clear-when-task-reset")) {
                                    intent5.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
                                } else if (str5.equals("--activity-exclude-from-recents")) {
                                    intent5.addFlags(8388608);
                                } else if (str5.equals("--activity-launched-from-history")) {
                                    intent5.addFlags(1048576);
                                } else if (str5.equals("--activity-multiple-task")) {
                                    intent5.addFlags(134217728);
                                } else if (str5.equals("--activity-no-animation")) {
                                    intent5.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
                                } else if (str5.equals("--activity-no-history")) {
                                    intent5.addFlags(JGCastService.FLAG_PRIVATE_DISPLAY);
                                } else if (str5.equals("--activity-no-user-action")) {
                                    intent5.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE);
                                } else if (str5.equals("--activity-previous-is-top")) {
                                    intent5.addFlags(16777216);
                                } else if (str5.equals("--activity-reorder-to-front")) {
                                    intent5.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE);
                                } else if (str5.equals("--activity-reset-task-if-needed")) {
                                    intent5.addFlags(2097152);
                                } else if (str5.equals("--activity-single-top")) {
                                    intent5.addFlags(536870912);
                                } else if (str5.equals("--activity-clear-task")) {
                                    intent5.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT);
                                } else if (str5.equals("--activity-task-on-home")) {
                                    intent5.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES);
                                } else if (str5.equals("--receiver-registered-only")) {
                                    intent5.addFlags(JGCastService.FLAG_PRIVATE_DISPLAY);
                                } else if (str5.equals("--receiver-replace-pending")) {
                                    intent5.addFlags(536870912);
                                } else if (!str5.equals("--selector")) {
                                    PrintStream printStream = System.err;
                                    String valueOf3 = String.valueOf(str5);
                                    printStream.println(valueOf3.length() == 0 ? new String("Error: Unknown option: ") : "Error: Unknown option: ".concat(valueOf3));
                                    intent3 = null;
                                } else {
                                    intent5.setDataAndType(uri, str4);
                                    intent5 = new Intent();
                                    i2 = i3;
                                    str = str3;
                                }
                                i2 = i3;
                                str = str3;
                            } else {
                                intent5.setFlags(Integer.decode(strArr2[i3]).intValue());
                                i2 = i3 + 1;
                                str = str3;
                            }
                            int i27 = i3 + 1;
                            intent5.putExtra(strArr2[i3], strArr2[i27]);
                            i2 = i27 + 1;
                        } else {
                            str = str3;
                            i2 = i3 + 1;
                            intent5.addCategory(strArr2[i3]);
                            if (intent5 == intent4) {
                                z2 = true;
                            }
                        }
                        str3 = str;
                    } else {
                        intent5.setDataAndType(uri, str4);
                        if (intent5 != intent4) {
                            intent4.setSelector(intent5);
                            intent = intent4;
                        } else {
                            intent = intent5;
                        }
                        String a = olu.m29110a(strArr2, i2);
                        if (a != null) {
                            if (a.indexOf(58) >= 0) {
                                intent2 = Intent.parseUri(a, 7);
                            } else if (a.indexOf(47) >= 0) {
                                intent2 = new Intent("android.intent.action.MAIN");
                                intent2.addCategory("android.intent.category.LAUNCHER");
                                intent2.setComponent(ComponentName.unflattenFromString(a));
                            } else {
                                intent2 = new Intent("android.intent.action.MAIN");
                                intent2.addCategory("android.intent.category.LAUNCHER");
                                intent2.setPackage(a);
                            }
                        } else if (intent5 != intent4) {
                            intent2 = new Intent("android.intent.action.MAIN");
                            intent2.addCategory("android.intent.category.LAUNCHER");
                        } else {
                            intent2 = null;
                        }
                        if (intent2 != null) {
                            Bundle extras = intent.getExtras();
                            Bundle bundle = null;
                            intent.replaceExtras(bundle);
                            Bundle extras2 = intent2.getExtras();
                            intent2.replaceExtras(bundle);
                            if (intent.getAction() != null && intent2.getCategories() != null) {
                                Iterator it = new HashSet(intent2.getCategories()).iterator();
                                while (it.hasNext()) {
                                    intent2.removeCategory((String) it.next());
                                }
                            }
                            intent.fillIn(intent2, 72);
                            if (extras != null) {
                                if (extras2 != null) {
                                    extras2.putAll(extras);
                                }
                                intent.replaceExtras(extras);
                            }
                            extras = extras2;
                            intent.replaceExtras(extras);
                        } else if (!z2) {
                            throw new IllegalArgumentException("No intent supplied");
                        }
                        intent3 = intent;
                    }
                }
                if (intent3.getComponent() != null) {
                    if (intent3.getComponent().getPackageName().equals("com.google.android.gms")) {
                        printWriter2.println("Error: Cannot create intents with the Google Play Services package");
                        return;
                    }
                }
                nip g = this.f29309b.mo21194g();
                if (g == null || !g.mo20816a(intent3)) {
                    printWriter2.println("Error");
                } else {
                    printWriter2.println("OK");
                }
            } catch (NumberFormatException e) {
                String valueOf4 = String.valueOf(lowerCase);
                throw new IllegalArgumentException(valueOf4.length() == 0 ? new String("Invalid boolean value: ") : "Invalid boolean value: ".concat(valueOf4), e);
            } catch (Exception e2) {
                String valueOf5 = String.valueOf(e2.getMessage());
                printWriter2.println(valueOf5.length() == 0 ? new String("Error creating intent from the arguments: ") : "Error creating intent from the arguments: ".concat(valueOf5));
            }
        } else if (c == 1) {
            float f = 30.0f;
            int i28 = 100;
            while (i < strArr2.length) {
                try {
                    if (strArr2[i].equals("t")) {
                        f = Float.valueOf(strArr2[i + 1]).floatValue();
                        i += 2;
                    } else if (strArr2[i].equals("b")) {
                        i28 = Integer.valueOf(strArr2[i + 1]).intValue();
                        i += 2;
                    } else {
                        printWriter2.println("Error: Unknown arguments");
                        return;
                    }
                } catch (ArrayIndexOutOfBoundsException e3) {
                    printWriter2.println("Error: Wrong number of arguments");
                    return;
                }
            }
            this.f29309b.mo21196i().mo22044a(f, i28);
            printWriter2.println("OK");
        } else if (c != 2) {
            if (c != 3) {
                if (c != 4) {
                    String valueOf6 = String.valueOf(str2);
                    printWriter2.println(valueOf6.length() == 0 ? new String("Error: Unknown command: ") : "Error: Unknown command: ".concat(valueOf6));
                    return;
                }
                this.f29309b.mo21043c().mo20918b();
            } else if (strArr2.length != 2) {
                printWriter2.println("Error: expected 'check [package-name]'");
            } else {
                String str13 = strArr2[1];
                StringBuilder sb = new StringBuilder(String.valueOf(str13).length() + 31);
                sb.append("Validating ");
                sb.append(str13);
                sb.append(" (results in logcat)");
                printWriter2.println(sb.toString());
                ExecutorService b = adzl.f62962b.mo25879b(2);
                b.execute(new nld(this, strArr2));
                b.shutdown();
            }
        } else if (strArr2.length < 4) {
            printWriter2.println("Error: not enough arguments to set.");
            printWriter2.println("set [setting] [string|boolean] [value]");
        } else {
            try {
                String str14 = strArr2[2];
                int hashCode = str14.hashCode();
                if (hashCode != -891985903) {
                    if (hashCode != -189262159) {
                        if (hashCode == 64711720 && str14.equals("boolean")) {
                            c2 = 0;
                            if (c2 == 0) {
                                if (c2 == 1) {
                                    this.f29309b.mo21190a(strArr2[1], strArr2[3]);
                                } else if (c2 != 2) {
                                    String valueOf7 = String.valueOf(strArr2[2]);
                                    printWriter2.println(valueOf7.length() == 0 ? new String("Error: Unknown value type: ") : "Error: Unknown value type: ".concat(valueOf7));
                                    return;
                                } else {
                                    this.f29309b.mo21191a(strArr2[1], Arrays.asList(strArr2[3].split(",", -1)));
                                }
                            } else if (strArr2[3].equals("true")) {
                                this.f29309b.mo21192a(strArr2[1], true);
                            } else if (!strArr2[3].equals(str3)) {
                                String valueOf8 = String.valueOf(strArr2[3]);
                                printWriter2.println(valueOf8.length() == 0 ? new String("Error: Unrecognized boolean value: ") : "Error: Unrecognized boolean value: ".concat(valueOf8));
                                return;
                            } else {
                                this.f29309b.mo21192a(strArr2[1], false);
                            }
                            String str15 = strArr2[1];
                            String str16 = strArr2[3];
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str15).length() + 17 + String.valueOf(str16).length());
                            sb2.append("Success. Set ");
                            sb2.append(str15);
                            sb2.append(" to ");
                            sb2.append(str16);
                            printWriter2.println(sb2.toString());
                        }
                    } else if (str14.equals("stringset")) {
                        c2 = 2;
                        if (c2 == 0) {
                        }
                        String str152 = strArr2[1];
                        String str162 = strArr2[3];
                        StringBuilder sb22 = new StringBuilder(String.valueOf(str152).length() + 17 + String.valueOf(str162).length());
                        sb22.append("Success. Set ");
                        sb22.append(str152);
                        sb22.append(" to ");
                        sb22.append(str162);
                        printWriter2.println(sb22.toString());
                    }
                } else if (str14.equals("string")) {
                    c2 = 1;
                    if (c2 == 0) {
                    }
                    String str1522 = strArr2[1];
                    String str1622 = strArr2[3];
                    StringBuilder sb222 = new StringBuilder(String.valueOf(str1522).length() + 17 + String.valueOf(str1622).length());
                    sb222.append("Success. Set ");
                    sb222.append(str1522);
                    sb222.append(" to ");
                    sb222.append(str1622);
                    printWriter2.println(sb222.toString());
                }
                c2 = 65535;
                if (c2 == 0) {
                }
                String str15222 = strArr2[1];
                String str16222 = strArr2[3];
                StringBuilder sb2222 = new StringBuilder(String.valueOf(str15222).length() + 17 + String.valueOf(str16222).length());
                sb2222.append("Success. Set ");
                sb2222.append(str15222);
                sb2222.append(" to ");
                sb2222.append(str16222);
                printWriter2.println(sb2222.toString());
            } catch (IllegalStateException e4) {
                String valueOf9 = String.valueOf(e4.getMessage());
                printWriter2.println(valueOf9.length() == 0 ? new String("Error: ") : "Error: ".concat(valueOf9));
            }
        }
    }

    /* renamed from: b */
    private static final void m22056b(Configuration configuration) {
        configuration.uiMode &= -16;
        configuration.uiMode |= 3;
    }

    /* renamed from: a */
    public final boolean mo17317a() {
        return true;
    }

    /* renamed from: c */
    public final Configuration mo17319c() {
        Configuration configuration = new Configuration(this.f29315i);
        m22056b(configuration);
        return configuration;
    }

    /* renamed from: d */
    public final void mo17320d() {
        int a = nyw.m28209a(this);
        C1102je jeVar = new C1102je(this);
        jeVar.mo13640e(getString(C0126R.string.car_app_name));
        jeVar.mo13632b(getString(C0126R.string.car_notification_message));
        jeVar.mo13630b(a);
        jeVar.f22271w = getResources().getColor(C0126R.color.car_light_blue_500);
        jeVar.f22258j = 2;
        if (ccry.f179825a.mo6606a().mo76700a() || ccvx.m131833b()) {
            int i = Build.VERSION.SDK_INT;
            RemoteViews remoteViews = new RemoteViews(nyx.m28211a(this), (int) C0126R.C0128layout.car_connected_notification_layout);
            remoteViews.setOnClickPendingIntent(C0126R.C0129id.car_exit_button, PendingIntent.getBroadcast(this, 211696329, new Intent().setAction("com.google.android.gms.car.CarChimeraService.EXIT_APP").setPackage(getPackageName()), 0));
            jeVar.f22274z = remoteViews;
        }
        oed.m28558a(jeVar, getString(C0126R.string.car_app_name));
        int i2 = Build.VERSION.SDK_INT;
        nyy a2 = nyy.m28213a(this);
        if (a2.mo21865a("car.default_notification_channel") == null) {
            a2.mo21866a(new NotificationChannel("car.default_notification_channel", getString(C0126R.string.car_app_name), 3));
        }
        jeVar.f22244B = "car.default_notification_channel";
        startForeground(2, jeVar.mo13629b());
    }

    public final void onConfigurationChanged(Configuration configuration) {
        int nightMode = this.f29314h.getNightMode();
        if (nightMode == 1 ? (configuration.uiMode & 16) == 0 : nightMode == 2 && (configuration.uiMode & 32) == 0) {
            bnsi c = f29307a.mo68388c();
            c.mo68432a("com.google.android.gms.car.CarChimeraService", "onConfigurationChanged", 657, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("New Config and UiModeManager out of sync!");
        }
        if (!this.f29309b.mo21199l() || !m22055a(this.f29315i) || m22055a(configuration)) {
            int i = this.f29315i.uiMode;
            int i2 = configuration.uiMode;
            int updateFrom = this.f29315i.updateFrom(configuration);
            int i3 = ((i ^ i2) & -16) != 0 ? -1 : -513;
            Configuration configuration2 = new Configuration(configuration);
            m22056b(configuration2);
            this.f29309b.mo21186a(configuration2, i3 & updateFrom);
            return;
        }
        bnsi d = f29307a.mo68390d();
        d.mo68432a("com.google.android.gms.car.CarChimeraService", "onConfigurationChanged", 662, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Car mode exited; quitting projection");
        this.f29309b.mo21187a(bipi.USER_SELECTION);
    }

    public final void onCreate() {
        super.onCreate();
        this.f29316j = npd.m27127a(this);
        this.f29310c = oen.m28584a(this);
        this.f29309b = new npz(new noj(this, this, this.f29316j, this.f29310c));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.hardware.usb.action.USB_ACCESSORY_DETACHED");
        intentFilter.addAction("com.google.android.gms.car.CarChimeraService.EXIT_APP");
        ConnectionStatusReceiver connectionStatusReceiver = new ConnectionStatusReceiver();
        this.f29311e = connectionStatusReceiver;
        registerReceiver(connectionStatusReceiver, intentFilter);
        this.f29312f = new olx(this, this.f29309b, f29308d, new nlc(this));
        this.f29315i = new Configuration(getResources().getConfiguration());
        this.f29314h = (UiModeManager) getSystemService("uimode");
    }

    public final void onDestroy() {
        ConnectionStatusReceiver connectionStatusReceiver = this.f29311e;
        if (connectionStatusReceiver != null) {
            unregisterReceiver(connectionStatusReceiver);
            this.f29311e = null;
        }
        super.onDestroy();
        this.f29309b.mo21197j();
        this.f29310c = null;
        oen.m28585a();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        oux oux;
        CarInfoInternal carInfoInternal;
        Intent intent2 = intent;
        if (intent2 == null) {
            stopSelf(i2);
            return 2;
        } else if (!nzc.INSTANCE.mo21867a()) {
            return 2;
        } else {
            if (!this.f29313g.mo22807a(this, intent2)) {
                bnsi c = f29307a.mo68388c();
                c.mo68432a("com.google.android.gms.car.CarChimeraService", "onStartCommand", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("Failed validation, not starting anything");
                return 2;
            }
            bipi bipi = null;
            ouf ouf = null;
            oib oib = null;
            bipi = null;
            if ("com.google.android.gms.car.TRANSFER".equals(intent.getAction())) {
                IBinder iBinder = ((BinderParcel) intent2.getParcelableExtra("connection")).f29535a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.carsetup.IConnectionTransfer");
                    if (queryLocalInterface instanceof ouf) {
                        ouf = (ouf) queryLocalInterface;
                    } else {
                        ouf = new oud(iBinder);
                    }
                }
                this.f29309b.mo21193a(ouf);
                return 2;
            } else if ("com.google.android.gms.car.HANDOFF".equals(intent.getAction())) {
                IBinder iBinder2 = ((BinderParcel) intent2.getParcelableExtra("connection_tear_down_helper")).f29535a;
                if (iBinder2 != null) {
                    IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.carsetup.ITransferStateCallbacks");
                    oux = queryLocalInterface2 instanceof oux ? (oux) queryLocalInterface2 : new ouv(iBinder2);
                } else {
                    oux = null;
                }
                nlb nlb = new nlb(oux);
                nmw h = this.f29309b.mo21195h();
                if (ccpv.m131198g()) {
                    bmxy.m108581a(intent2.getByteArrayExtra("car_handoff_car_info"));
                    carInfoInternal = (CarInfoInternal) sef.m35067a(intent2, "car_handoff_car_info", CarInfoInternal.CREATOR);
                } else {
                    IBinder iBinder3 = ((BinderParcel) intent2.getParcelableExtra("car_handoff_car_info")).f29535a;
                    if (iBinder3 != null) {
                        IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.car.senderprotocol.IObjectWrapper");
                        if (queryLocalInterface3 instanceof oib) {
                            oib = (oib) queryLocalInterface3;
                        } else {
                            oib = new ohz(iBinder3);
                        }
                    }
                    CarInfoInternal carInfoInternal2 = (CarInfoInternal) oja.m28891a(oib);
                    bmxy.m108581a(carInfoInternal2);
                    carInfoInternal = carInfoInternal2;
                }
                noy noy = r1;
                nmw nmw = h;
                String str = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                String str2 = "onStartCommand";
                noy noy2 = new noy(this, intent2.getIntExtra("car_handoff_connection_type", 1), intent2.getBooleanExtra("car_handoff_start_activities", false), intent2.getIntExtra("car_handoff_analytics_session_id", 0), intent2.getIntExtra("connection_tag", -1), nlb, carInfoInternal, intent2.getBooleanExtra("car_handoff_use_gearhead_for_projection", false), h.mo21195h());
                ComponentName unflattenFromString = ComponentName.unflattenFromString(intent2.getStringExtra("car_handoff_component"));
                long longExtra = intent2.getLongExtra("car_handoff_session_id", 0);
                boolean booleanExtra = intent2.getBooleanExtra("car_handoff_user_authorized_projection", false);
                unflattenFromString.flattenToString();
                noy.f36274n = booleanExtra;
                if (longExtra != noy.f36270j) {
                    noy.f36270j = longExtra;
                    if (!booleanExtra && !noy.f36266f) {
                        pam pam = (pam) noy.f36262b;
                        pam.f38719c.post(new ozr(pam, longExtra, unflattenFromString, noy.f36263c, noy.f36267g));
                    } else {
                        pam pam2 = (pam) noy.f36262b;
                        pam2.f38719c.post(new ozq(pam2, longExtra, unflattenFromString, noy.f36263c));
                    }
                }
                bnsi d = f29307a.mo68390d();
                d.mo68432a("com.google.android.gms.car.CarChimeraService", str2, 254, str);
                d.mo68405a("Overriding delegate with new Lite CarServiceBinder");
                bmxy.m108601b(this.f29309b.f36383p.compareAndSet(nmw, noy), "Failed to update delegate");
                return 2;
            } else {
                String str3 = "car_handoff_user_authorized_projection";
                String str4 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                String str5 = "onStartCommand";
                String str6 = "car_handoff_session_id";
                if (!"com.google.android.gms.car.HANDOFF_USER_AUTHORIZATION".equals(intent.getAction())) {
                    return 2;
                }
                nmw h2 = this.f29309b.mo21195h();
                long longExtra2 = intent2.getLongExtra(str6, 0);
                if (h2.mo21195h() != h2) {
                    noy noy3 = (noy) h2;
                    if (noy3.f36270j == longExtra2) {
                        boolean booleanExtra2 = intent2.getBooleanExtra(str3, false);
                        if (!booleanExtra2 && intent2.hasExtra("car_handoff_user_not_authorized_projection_bye_bye_reason")) {
                            int intExtra = intent2.getIntExtra("car_handoff_user_not_authorized_projection_bye_bye_reason", 0);
                            bipi a = bipi.m102695a(intExtra);
                            if (a == null) {
                                bnsi b = f29307a.mo68387b();
                                b.mo68432a("com.google.android.gms.car.CarChimeraService", str5, 276, str4);
                                b.mo68409a("Unknown ByeByeReason number %d given, should never happen", intExtra);
                            }
                            bipi = a;
                        }
                        noy3.f36274n = booleanExtra2;
                        if (longExtra2 != noy3.f36270j) {
                            return 2;
                        }
                        if (!booleanExtra2) {
                            if (bipi == null) {
                                noy3.f36262b.mo22809a();
                            } else {
                                noy3.f36262b.mo22810a(bipi);
                            }
                            noy3.mo21195h().mo21310ao();
                            noy3.mo21195h().mo21188a(CriticalError.m22086a(bpdn.PROTOCOL_BYEBYE_REQUESTED_BY_USER, bpdo.BYEBYE_BY_USER));
                            noy3.mo21370b();
                            return 2;
                        } else if (!noy3.f36273m) {
                            return 2;
                        } else {
                            noy3.mo21369a();
                            return 2;
                        }
                    } else {
                        bnsi c2 = f29307a.mo68388c();
                        c2.mo68432a("com.google.android.gms.car.CarChimeraService", str5, 284, str4);
                        c2.mo68415a("received user authorization on an invalid session %d", longExtra2);
                        return 2;
                    }
                } else {
                    bnsi c3 = f29307a.mo68388c();
                    c3.mo68432a("com.google.android.gms.car.CarChimeraService", str5, 287, str4);
                    c3.mo68405a("received user authorization without car handoff command");
                    return 2;
                }
            }
        }
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (npe.m27160b(this, "android.permission.DUMP") == 0) {
            nyx.m28212a(this, printWriter);
            if (strArr.length == 0) {
                String valueOf = String.valueOf(this.f29315i);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
                sb.append("current config:");
                sb.append(valueOf);
                printWriter.println(sb.toString());
                npz npz = this.f29309b;
                if (npz != null) {
                    npz.mo21189a(printWriter);
                    return;
                }
                return;
            }
            m22053a(printWriter, strArr);
            return;
        }
        int callingPid = Binder.getCallingPid();
        int callingUid = Binder.getCallingUid();
        StringBuilder sb2 = new StringBuilder(83);
        sb2.append("Permission Denial: can't dump CarService from from pid=");
        sb2.append(callingPid);
        sb2.append(", uid=");
        sb2.append(callingUid);
        printWriter.println(sb2.toString());
    }

    /* renamed from: e */
    public final void mo17321e() {
        stopForeground(true);
    }

    public final IBinder onBind(Intent intent) {
        if (!nzc.INSTANCE.mo21867a()) {
            return null;
        }
        if ("com.google.android.gms.car.service.START".equals(intent.getAction())) {
            return this.f29312f;
        }
        bnsi c = f29307a.mo68388c();
        c.mo68432a("com.google.android.gms.car.CarChimeraService", "onBind", 347, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68420a("No binder for action %s", intent.getAction());
        return null;
    }

    /* renamed from: b */
    public final void mo17318b() {
        stopSelf();
    }

    /* renamed from: a */
    static final /* synthetic */ void m22054a(oux oux) {
        try {
            oux.mo22595a();
        } catch (RemoteException e) {
            bnsi c = f29307a.mo68388c();
            c.mo68437a(e);
            c.mo68432a("com.google.android.gms.car.CarChimeraService", "a", (int) BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Failed to call transferStateCallbacks.close().");
        }
    }

    /* renamed from: a */
    private static boolean m22055a(Configuration configuration) {
        return (configuration.uiMode & 15) == 3;
    }

    /* renamed from: a */
    public final void mo17315a(bipi bipi) {
        this.f29309b.mo21187a(bipi);
    }

    /* renamed from: a */
    public final void mo17316a(CriticalError criticalError) {
        this.f29309b.mo21188a(criticalError);
    }
}
