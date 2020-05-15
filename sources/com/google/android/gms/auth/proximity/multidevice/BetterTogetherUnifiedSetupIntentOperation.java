package com.google.android.gms.auth.proximity.multidevice;

import android.accounts.Account;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BetterTogetherUnifiedSetupIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f11249a = jsy.m17256a("BetterTogetherSetup");

    /* renamed from: b */
    private final jta f11250b = jsz.m17257a();

    public BetterTogetherUnifiedSetupIntentOperation() {
    }

    /* renamed from: a */
    public static Intent m6878a(Context context) {
        return IntentOperation.getStartIntent(context, BetterTogetherUnifiedSetupIntentOperation.class, "com.google.android.gms.auth.proximity.multidevice.UPDATE_UNIFIED_SETUP");
    }

    /* JADX WARN: Type inference failed for: r4v1, assign insn: 0x0011: CONST  (r4v1 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r4v24, assign insn: 0x0142: CONST  (r4v24 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.auth.proximity.multidevice.BetterTogetherUnifiedSetupIntentOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r4v6, types: [boolean, int], assign insn: PHI: (r4v6 int) = (r4v1 ?), (r4v24 ?) binds: [B:26:0x0087, B:46:0x013f] */
    public final void onHandleIntent(Intent intent) {
        boolean z;
        boolean z2;
        Intent intent2 = intent;
        if (intent2 != null) {
            ? r4 = 1;
            if ("com.google.android.gms.auth.proximity.multidevice.UPDATE_UNIFIED_SETUP".equals(intent.getAction())) {
                spn.m35856a((Context) this, SettingsChimeraActivity.m6881e(), true);
                spn.m35856a((Context) this, "com.google.android.gms.auth.proximity.multidevice.SettingsContentProvider", true);
            } else if ("com.google.android.gms.auth.proximity.multidevice.UNIFIED_SETUP_REQUESTED".equals(intent.getAction())) {
                String stringExtra = intent2.getStringExtra("EXTRA_ACCOUNT_NAME_FOR_SETUP");
                if (stringExtra == null || stringExtra.isEmpty()) {
                    f11249a.mo25418e("No accounts for Better Together setup", new Object[0]);
                    this.f11250b.mo14070z(2);
                    return;
                }
                SyncedCryptauthDevice a = jpv.m17085a(this, stringExtra);
                jlg a2 = jlf.m16865a(this);
                if (a == null) {
                    this.f11250b.mo14070z(3);
                    return;
                }
                Account account = new Account(stringExtra, "com.google");
                boolean a3 = a2.mo13851a(account, bsni.BETTER_TOGETHER_HOST);
                HashSet<String> hashSet = new HashSet(a.f11198m);
                sek sek = f11249a;
                String str = !a3 ? "disable" : "enable";
                sek.mo25414c(str.length() == 0 ? new String("Trying to ") : "Trying to ".concat(str), new Object[0]);
                if (a3) {
                    HashSet hashSet2 = new HashSet(jlh.m16871a(this).mo13854a(account));
                    List list = a.f11197l;
                    int size = list.size();
                    int i = 0;
                    int i2 = 0;
                    int i3 = 0;
                    while (i < size) {
                        String str2 = (String) list.get(i);
                        try {
                            boolean contains = hashSet2.contains(bsni.m116007a(str2));
                            boolean contains2 = hashSet.contains(str2);
                            boolean contains3 = new HashSet(Arrays.asList(TextUtils.split(ccig.f179039a.mo6606a().mo76005b(), ","))).contains(str2);
                            if (contains && !contains2 && !contains3) {
                                sek sek2 = f11249a;
                                Object[] objArr = new Object[r4];
                                objArr[0] = str2;
                                sek2.mo25414c("Enabling disabled feature %s", objArr);
                                i2++;
                                if (!jqj.m17125a(str2, r4, account.name, this)) {
                                    sek sek3 = f11249a;
                                    String valueOf = String.valueOf(str2);
                                    sek3.mo25418e(valueOf.length() == 0 ? new String("Failed to enable feature: ") : "Failed to enable feature: ".concat(valueOf), new Object[0]);
                                } else {
                                    i3++;
                                }
                                i++;
                                r4 = 1;
                            } else {
                                f11249a.mo25414c("Not enabling feature %s. isLocallySupported: %s isFeatureAlreadyEnabled: %s isFeatureSupportBlacklisted: %s", str2, Boolean.valueOf(contains), Boolean.valueOf(contains2), Boolean.valueOf(contains3));
                                i++;
                                r4 = 1;
                            }
                        } catch (IllegalArgumentException e) {
                            f11249a.mo25416d("Invalid supported feature: %s", str2);
                        }
                    }
                    if (i2 == 0) {
                        this.f11250b.mo14070z(1);
                        z2 = false;
                    } else if (i3 == 0) {
                        this.f11250b.mo14070z(4);
                        return;
                    } else if (i2 > i3) {
                        this.f11250b.mo14070z(5);
                        z2 = false;
                    } else {
                        z2 = false;
                        this.f11250b.mo14070z(0);
                    }
                    if (i3 > 0 && !getSharedPreferences("com.google.android.gms.auth.proximity.UNIFIED_SETUP", z2 ? 1 : 0).getBoolean("SETUP_COMPLETE_NOTIFICATION", z2)) {
                        sex a4 = sex.m35104a(this);
                        Resources resources = getResources();
                        int i4 = Build.VERSION.SDK_INT;
                        if (a4.mo25437a("better-together-notification-channel-id") == null) {
                            a4.mo25442a(new NotificationChannel("better-together-notification-channel-id", resources.getString(C0126R.string.better_together_app_name), 3));
                        }
                        String string = resources.getString(C0126R.string.settings_subhead_enabled, SettingsChimeraContentProvider.m6884a(this, stringExtra), "");
                        C1102je jeVar = new C1102je(this, "better-together-notification-channel-id");
                        jeVar.mo13630b(qkj.m32287a(this, C0126R.C0127drawable.quantum_ic_devices_white_24));
                        jeVar.f22271w = resources.getColor(C0126R.color.quantum_googblue);
                        jeVar.f22258j = 0;
                        jeVar.mo13640e(resources.getString(C0126R.string.settings_summary_enabled));
                        jeVar.mo13632b(string);
                        C1101jd jdVar = new C1101jd();
                        jdVar.mo13593a(string);
                        jeVar.mo13626a(jdVar);
                        jeVar.f22254f = PendingIntent.getActivity(this, 0, new Intent().setClassName(this, SettingsChimeraActivity.m6881e()).putExtra("FROM_BETTER_TOGETHER_NOTIFICATION", true), 134217728);
                        jeVar.mo13627a(true);
                        int i5 = Build.VERSION.SDK_INT;
                        Bundle bundle = new Bundle();
                        bundle.putString("android.substName", resources.getString(C0126R.string.notification_substitute_app_name));
                        jeVar.mo13623a(bundle);
                        a4.mo25445a("better-together-setup-complete-tag", 1, jeVar.mo13629b());
                        jtb.m17295a(this, true);
                        return;
                    }
                    return;
                }
                int i6 = 0;
                int i7 = 0;
                for (String str3 : hashSet) {
                    if (new HashSet(Arrays.asList(TextUtils.split(ccig.f179039a.mo6606a().mo76004a(), ","))).contains(str3)) {
                        f11249a.mo25414c("Not disabling enabled feature %s since it is blacklisted for disabling", str3);
                    } else {
                        f11249a.mo25414c("Attempting to disable enabled feature %s", str3);
                        i6++;
                        if (!jqj.m17124a(str3, stringExtra, this)) {
                            sek sek4 = f11249a;
                            String valueOf2 = String.valueOf(str3);
                            sek4.mo25418e(valueOf2.length() == 0 ? new String("Failed to disable feature: ") : "Failed to disable feature: ".concat(valueOf2), new Object[0]);
                        } else {
                            i7++;
                        }
                    }
                }
                if (i6 == 0) {
                    this.f11250b.mo14034A(1);
                    z = false;
                } else if (i7 == 0) {
                    this.f11250b.mo14034A(2);
                    z = false;
                } else if (i6 <= i7) {
                    z = false;
                    this.f11250b.mo14034A(0);
                } else {
                    z = false;
                    this.f11250b.mo14034A(3);
                }
                jtb.m17295a(this, z);
            }
        } else {
            f11249a.mo25416d("Better Together setup was started with a null intent.", new Object[0]);
        }
    }

    /* renamed from: a */
    public static Intent m6879a(Context context, String str) {
        Intent startIntent = IntentOperation.getStartIntent(context, BetterTogetherUnifiedSetupIntentOperation.class, "com.google.android.gms.auth.proximity.multidevice.UNIFIED_SETUP_REQUESTED");
        startIntent.putExtra("EXTRA_ACCOUNT_NAME_FOR_SETUP", str);
        return startIntent;
    }

    public BetterTogetherUnifiedSetupIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
