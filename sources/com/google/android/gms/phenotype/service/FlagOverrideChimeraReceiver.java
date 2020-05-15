package com.google.android.gms.phenotype.service;

import android.content.Context;
import android.content.Intent;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.gms.phenotype.Flag;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class FlagOverrideChimeraReceiver extends BroadcastReceiver {

    /* renamed from: b */
    public static final srn f82138b = srn.m36127a(sgj.PHENOTYPE);

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    /* renamed from: a */
    static void m68249a(Context context, Intent intent, aney aney) {
        char c;
        boolean z;
        int i;
        Intent intent2 = intent;
        aney aney2 = aney;
        if ("com.google.android.gms.phenotype.FLAG_OVERRIDE".equals(intent.getAction())) {
            if (!"delete".equals(intent2.getStringExtra("action"))) {
                String stringExtra = intent2.getStringExtra("package");
                String stringExtra2 = intent2.getStringExtra("user");
                boolean booleanExtra = intent2.getBooleanExtra("commit", false);
                String[] stringArrayExtra = intent2.getStringArrayExtra("flags");
                String[] stringArrayExtra2 = intent2.getStringArrayExtra("values");
                String[] stringArrayExtra3 = intent2.getStringArrayExtra("types");
                if (stringArrayExtra == null || stringArrayExtra2 == null || stringArrayExtra3 == null) {
                    String stringExtra3 = intent2.getStringExtra("flags");
                    String stringExtra4 = intent2.getStringExtra("values");
                    String stringExtra5 = intent2.getStringExtra("types");
                    if (!(stringExtra3 == null || stringExtra4 == null || stringExtra5 == null)) {
                        String[] split = stringExtra3.split(",");
                        stringArrayExtra2 = stringExtra4.split(",");
                        stringArrayExtra3 = stringExtra5.split(",");
                        stringArrayExtra = split;
                    }
                }
                if (stringArrayExtra == null || stringArrayExtra2 == null || stringArrayExtra3 == null) {
                    bnsl bnsl = (bnsl) f82138b.mo68388c();
                    bnsl.mo68432a("com.google.android.gms.phenotype.service.FlagOverrideChimeraReceiver", "a", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Missing flags, values, or types parameter");
                    return;
                }
                int length = stringArrayExtra.length;
                int length2 = stringArrayExtra2.length;
                if (length == length2 && length2 == stringArrayExtra3.length) {
                    Flag[] flagArr = new Flag[length];
                    int i2 = 0;
                    while (i2 < length) {
                        String str = stringArrayExtra3[i2];
                        int i3 = 1;
                        switch (str.hashCode()) {
                            case -1325958191:
                                if (str.equals("double")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -891985903:
                                if (str.equals("string")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3327612:
                                if (str.equals("long")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 64711720:
                                if (str.equals("boolean")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 94224491:
                                if (str.equals("bytes")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        if (c != 0) {
                            if (c == 1) {
                                i3 = 2;
                            } else if (c == 2) {
                                i3 = 3;
                            } else if (c == 3) {
                                i3 = 4;
                            } else if (c != 4) {
                                bnsl bnsl2 = (bnsl) f82138b.mo68388c();
                                bnsl2.mo68432a("com.google.android.gms.phenotype.service.FlagOverrideChimeraReceiver", "a", 137, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl2.mo68420a("Invalid flag type %s", stringArrayExtra3[i2]);
                                return;
                            } else {
                                i3 = 5;
                            }
                        }
                        int i4 = length;
                        String replace = stringArrayExtra2[i2].replace('\'', ',');
                        try {
                            String str2 = stringArrayExtra[i2];
                            if (!booleanExtra) {
                                z = booleanExtra;
                                i = 0;
                            } else {
                                z = booleanExtra;
                                i = -1000;
                            }
                            try {
                                flagArr[i2] = new Flag(str2, replace, i3, i);
                            } catch (IllegalArgumentException e) {
                            }
                        } catch (IllegalArgumentException e2) {
                            z = booleanExtra;
                            bnsl bnsl3 = (bnsl) f82138b.mo68388c();
                            bnsl3.mo68432a("com.google.android.gms.phenotype.service.FlagOverrideChimeraReceiver", "a", 146, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl3.mo68424a("Invalid flag value for flag type %s: %s", stringArrayExtra3[i2], replace);
                            i2++;
                            length = i4;
                            booleanExtra = z;
                        }
                        i2++;
                        length = i4;
                        booleanExtra = z;
                    }
                    aney2.mo25237a(stringExtra, stringExtra2, flagArr).mo50371a(angq.f76808a);
                    return;
                }
                bnsl bnsl4 = (bnsl) f82138b.mo68388c();
                bnsl4.mo68432a("com.google.android.gms.phenotype.service.FlagOverrideChimeraReceiver", "a", 114, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("Mismatched lengths in flags, values, and types");
                return;
            }
            aney2.mo25238b(intent2.getStringExtra("package"), intent2.getStringExtra("user"), intent2.getStringExtra("flag")).mo50371a(angr.f76809a);
        } else if ("com.google.android.gms.phenotype.CODEGEN_MIGRATION".equals(intent.getAction())) {
            bnsl bnsl5 = (bnsl) f82138b.mo68388c();
            bnsl5.mo68432a("com.google.android.gms.phenotype.service.FlagOverrideChimeraReceiver", "a", 85, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68420a("Action %s not supported on non-debug builds", "com.google.android.gms.phenotype.CODEGEN_MIGRATION");
        }
    }

    /* renamed from: b */
    static final /* synthetic */ void m68252b(aucb aucb) {
        bnsl bnsl = (bnsl) f82138b.mo68390d();
        bnsl.mo68432a("com.google.android.gms.phenotype.service.FlagOverrideChimeraReceiver", "b", (int) MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Successfully set flag overrides? %b", Boolean.valueOf(aucb.mo50384b()));
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    public final void onReceive(Context context, Intent intent) {
        char c;
        boolean z;
        int i;
        Intent intent2 = intent;
        aney a = anef.m64089a(context);
        if ("com.google.android.gms.phenotype.FLAG_OVERRIDE".equals(intent.getAction())) {
            if (!"delete".equals(intent2.getStringExtra("action"))) {
                String stringExtra = intent2.getStringExtra("package");
                String stringExtra2 = intent2.getStringExtra("user");
                boolean booleanExtra = intent2.getBooleanExtra("commit", false);
                String[] stringArrayExtra = intent2.getStringArrayExtra("flags");
                String[] stringArrayExtra2 = intent2.getStringArrayExtra("values");
                String[] stringArrayExtra3 = intent2.getStringArrayExtra("types");
                if (stringArrayExtra == null || stringArrayExtra2 == null || stringArrayExtra3 == null) {
                    String stringExtra3 = intent2.getStringExtra("flags");
                    String stringExtra4 = intent2.getStringExtra("values");
                    String stringExtra5 = intent2.getStringExtra("types");
                    if (!(stringExtra3 == null || stringExtra4 == null || stringExtra5 == null)) {
                        String[] split = stringExtra3.split(",");
                        stringArrayExtra2 = stringExtra4.split(",");
                        stringArrayExtra3 = stringExtra5.split(",");
                        stringArrayExtra = split;
                    }
                }
                if (stringArrayExtra == null || stringArrayExtra2 == null || stringArrayExtra3 == null) {
                    bnsl bnsl = (bnsl) f82138b.mo68388c();
                    bnsl.mo68432a("com.google.android.gms.phenotype.service.FlagOverrideChimeraReceiver", "a", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Missing flags, values, or types parameter");
                    return;
                }
                int length = stringArrayExtra.length;
                int length2 = stringArrayExtra2.length;
                if (length == length2 && length2 == stringArrayExtra3.length) {
                    Flag[] flagArr = new Flag[length];
                    int i2 = 0;
                    while (i2 < length) {
                        String str = stringArrayExtra3[i2];
                        int i3 = 1;
                        switch (str.hashCode()) {
                            case -1325958191:
                                if (str.equals("double")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -891985903:
                                if (str.equals("string")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3327612:
                                if (str.equals("long")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 64711720:
                                if (str.equals("boolean")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 94224491:
                                if (str.equals("bytes")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        if (c != 0) {
                            if (c == 1) {
                                i3 = 2;
                            } else if (c == 2) {
                                i3 = 3;
                            } else if (c == 3) {
                                i3 = 4;
                            } else if (c != 4) {
                                bnsl bnsl2 = (bnsl) f82138b.mo68388c();
                                bnsl2.mo68432a("com.google.android.gms.phenotype.service.FlagOverrideChimeraReceiver", "a", 137, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl2.mo68420a("Invalid flag type %s", stringArrayExtra3[i2]);
                                return;
                            } else {
                                i3 = 5;
                            }
                        }
                        int i4 = length;
                        String replace = stringArrayExtra2[i2].replace('\'', ',');
                        try {
                            String str2 = stringArrayExtra[i2];
                            if (!booleanExtra) {
                                z = booleanExtra;
                                i = 0;
                            } else {
                                z = booleanExtra;
                                i = -1000;
                            }
                            try {
                                flagArr[i2] = new Flag(str2, replace, i3, i);
                            } catch (IllegalArgumentException e) {
                            }
                        } catch (IllegalArgumentException e2) {
                            z = booleanExtra;
                            bnsl bnsl3 = (bnsl) f82138b.mo68388c();
                            bnsl3.mo68432a("com.google.android.gms.phenotype.service.FlagOverrideChimeraReceiver", "a", 146, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl3.mo68424a("Invalid flag value for flag type %s: %s", stringArrayExtra3[i2], replace);
                            i2++;
                            length = i4;
                            booleanExtra = z;
                        }
                        i2++;
                        length = i4;
                        booleanExtra = z;
                    }
                    a.mo25237a(stringExtra, stringExtra2, flagArr).mo50371a(angq.f76808a);
                    return;
                }
                bnsl bnsl4 = (bnsl) f82138b.mo68388c();
                bnsl4.mo68432a("com.google.android.gms.phenotype.service.FlagOverrideChimeraReceiver", "a", 114, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("Mismatched lengths in flags, values, and types");
                return;
            }
            a.mo25238b(intent2.getStringExtra("package"), intent2.getStringExtra("user"), intent2.getStringExtra("flag")).mo50371a(angr.f76809a);
        } else if ("com.google.android.gms.phenotype.CODEGEN_MIGRATION".equals(intent.getAction())) {
            bnsl bnsl5 = (bnsl) f82138b.mo68388c();
            bnsl5.mo68432a("com.google.android.gms.phenotype.service.FlagOverrideChimeraReceiver", "a", 85, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68420a("Action %s not supported on non-debug builds", "com.google.android.gms.phenotype.CODEGEN_MIGRATION");
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    /* renamed from: a */
    private static void m68250a(Intent intent, aney aney) {
        char c;
        boolean z;
        int i;
        Intent intent2 = intent;
        String stringExtra = intent2.getStringExtra("package");
        String stringExtra2 = intent2.getStringExtra("user");
        boolean booleanExtra = intent2.getBooleanExtra("commit", false);
        String[] stringArrayExtra = intent2.getStringArrayExtra("flags");
        String[] stringArrayExtra2 = intent2.getStringArrayExtra("values");
        String[] stringArrayExtra3 = intent2.getStringArrayExtra("types");
        if (stringArrayExtra == null || stringArrayExtra2 == null || stringArrayExtra3 == null) {
            String stringExtra3 = intent2.getStringExtra("flags");
            String stringExtra4 = intent2.getStringExtra("values");
            String stringExtra5 = intent2.getStringExtra("types");
            if (!(stringExtra3 == null || stringExtra4 == null || stringExtra5 == null)) {
                String[] split = stringExtra3.split(",");
                stringArrayExtra2 = stringExtra4.split(",");
                stringArrayExtra3 = stringExtra5.split(",");
                stringArrayExtra = split;
            }
        }
        if (stringArrayExtra == null || stringArrayExtra2 == null || stringArrayExtra3 == null) {
            bnsl bnsl = (bnsl) f82138b.mo68388c();
            bnsl.mo68432a("com.google.android.gms.phenotype.service.FlagOverrideChimeraReceiver", "a", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Missing flags, values, or types parameter");
            return;
        }
        int length = stringArrayExtra.length;
        int length2 = stringArrayExtra2.length;
        if (length == length2 && length2 == stringArrayExtra3.length) {
            Flag[] flagArr = new Flag[length];
            int i2 = 0;
            while (i2 < length) {
                String str = stringArrayExtra3[i2];
                int i3 = 2;
                switch (str.hashCode()) {
                    case -1325958191:
                        if (str.equals("double")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -891985903:
                        if (str.equals("string")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3327612:
                        if (str.equals("long")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 64711720:
                        if (str.equals("boolean")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 94224491:
                        if (str.equals("bytes")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    i3 = 1;
                } else if (c != 1) {
                    if (c == 2) {
                        i3 = 3;
                    } else if (c == 3) {
                        i3 = 4;
                    } else if (c != 4) {
                        bnsl bnsl2 = (bnsl) f82138b.mo68388c();
                        bnsl2.mo68432a("com.google.android.gms.phenotype.service.FlagOverrideChimeraReceiver", "a", 137, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68420a("Invalid flag type %s", stringArrayExtra3[i2]);
                        return;
                    } else {
                        i3 = 5;
                    }
                }
                String replace = stringArrayExtra2[i2].replace('\'', ',');
                try {
                    String str2 = stringArrayExtra[i2];
                    if (!booleanExtra) {
                        z = booleanExtra;
                        i = 0;
                    } else {
                        z = booleanExtra;
                        i = -1000;
                    }
                    try {
                        flagArr[i2] = new Flag(str2, replace, i3, i);
                    } catch (IllegalArgumentException e) {
                    }
                } catch (IllegalArgumentException e2) {
                    z = booleanExtra;
                    bnsl bnsl3 = (bnsl) f82138b.mo68388c();
                    bnsl3.mo68432a("com.google.android.gms.phenotype.service.FlagOverrideChimeraReceiver", "a", 146, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68424a("Invalid flag value for flag type %s: %s", stringArrayExtra3[i2], replace);
                    i2++;
                    booleanExtra = z;
                }
                i2++;
                booleanExtra = z;
            }
            aney.mo25237a(stringExtra, stringExtra2, flagArr).mo50371a(angq.f76808a);
            return;
        }
        bnsl bnsl4 = (bnsl) f82138b.mo68388c();
        bnsl4.mo68432a("com.google.android.gms.phenotype.service.FlagOverrideChimeraReceiver", "a", 114, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl4.mo68405a("Mismatched lengths in flags, values, and types");
    }

    /* renamed from: a */
    static final /* synthetic */ void m68251a(aucb aucb) {
        bnsl bnsl = (bnsl) f82138b.mo68390d();
        bnsl.mo68432a("com.google.android.gms.phenotype.service.FlagOverrideChimeraReceiver", "a", 162, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Successfully deleted flag overrides? %b", Boolean.valueOf(aucb.mo50384b()));
    }
}
