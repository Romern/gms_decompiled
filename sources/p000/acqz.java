package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.icing.GcmReceiverChimeraService;
import com.google.android.gms.icing.appindexing.service.OneoffRebuildIndexChimeraService;
import com.google.android.gms.icing.appindexing.service.PeriodicRebuildIndexChimeraService;
import com.google.android.gms.icing.proxy.IcingInternalCorporaUpdateChimeraService;
import com.google.android.gms.icing.service.IndexWorkerChimeraService;
import com.google.android.gms.icing.service.SystemEventIntentOperation;
import java.io.File;
import java.io.IOException;

/* renamed from: acqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acqz extends acpn {

    /* renamed from: a */
    final /* synthetic */ Intent f60568a;

    /* renamed from: b */
    final /* synthetic */ IndexWorkerChimeraService f60569b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public acqz(IndexWorkerChimeraService indexWorkerChimeraService, bqbd bqbd, Intent intent) {
        super(bqbd, 1);
        this.f60569b = indexWorkerChimeraService;
        this.f60568a = intent;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x023e, code lost:
        if (r4.equals("update-app-params") != false) goto L_0x027e;
     */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        String action;
        ByteString a;
        byte[] a2;
        acqv acqv;
        long j;
        acri acri = this.f60569b.f79088b;
        if (acri != null) {
            acpl acpl = acri.f60610c;
            Intent intent = this.f60568a;
            if (!(intent == null || (action = intent.getAction()) == null)) {
                if (action.equals("com.google.android.gms.icing.INDEX_SERVICE")) {
                    this.f60569b.mo43420a();
                } else {
                    String action2 = this.f60568a.getAction();
                    if (action2.equals("android.intent.action.PACKAGE_ADDED") || action2.equals("android.intent.action.PACKAGE_REPLACED") || action2.equals("android.intent.action.PACKAGE_CHANGED") || action2.equals("android.intent.action.PACKAGE_DATA_CLEARED") || action2.equals("android.intent.action.PACKAGE_REMOVED")) {
                        abrv a3 = this.f60569b.mo43420a();
                        if (!a3.mo32320d()) {
                            absg.m48192b("Couldn't handle %s intent due to initialization failure.", action);
                        } else {
                            Intent intent2 = this.f60568a;
                            String valueOf = String.valueOf(intent2);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
                            sb.append("Got package manager broadcast: ");
                            sb.append(valueOf);
                            absg.m48184a(sb.toString());
                            String action3 = intent2.getAction();
                            if (!a3.mo32320d()) {
                                absg.m48206e("Couldn't handle %s intent due to initialization failure.", action3);
                            } else {
                                acxh acxh = new acxh(a3.f58066b, intent2);
                                a3.f58067c.mo32995d(new abrq(a3, bqbd.HANDLE_PACKAGE_MANAGER_BROADCAST, acxh.mo33194c(), acxh));
                            }
                            Context context = a3.f58066b;
                            acxh acxh2 = new acxh(context, this.f60568a);
                            if (((Boolean) abzt.f58900ao.mo58455c()).booleanValue() && (acxh2.mo33192a() || acxh2.mo33193b())) {
                                OneoffRebuildIndexChimeraService.m66669a(context, a3.f58071g, this.f60568a);
                            }
                        }
                    } else {
                        char c = 0;
                        if (action.equals("android.intent.action.BOOT_COMPLETED")) {
                            IndexWorkerChimeraService indexWorkerChimeraService = this.f60569b;
                            int i = IndexWorkerChimeraService.f79087c;
                            if (indexWorkerChimeraService.mo43423c().getBoolean("maintenance_scheduled", false)) {
                                absg.m48184a("Not scheduling maintenance on boot, because one was already scheduled");
                            } else {
                                this.f60569b.mo43421a("boot completed");
                                PeriodicRebuildIndexChimeraService.m66673a(this.f60569b.mo43422b());
                                absh.m48214a(this.f60569b.mo43422b(), false);
                            }
                            if (celx.m137222b()) {
                                acrz.m49786a(this.f60569b.getApplicationContext()).mo33051a();
                            }
                        } else if (action.equals("com.google.gservices.intent.action.GSERVICES_CHANGED") || action.equals("com.google.android.gms.phenotype.COMMITTED") || action.equals(SystemEventIntentOperation.f79093a) || action.equals(SystemEventIntentOperation.f79094b)) {
                            absg.m48201d(action.length() == 0 ? new String("Received config update event: ") : "Received config update event: ".concat(action));
                            if (action.equals("com.google.gservices.intent.action.GSERVICES_CHANGED") || "com.google.android.gms.icing".equals(this.f60568a.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
                                StringBuilder sb2 = new StringBuilder(action.length() + 40);
                                sb2.append("Processing config change triggered by '");
                                sb2.append(action);
                                sb2.append("'");
                                absg.m48201d(sb2.toString());
                                abrv a4 = this.f60569b.mo43420a();
                                if (!a4.mo32320d()) {
                                    absg.m48205e("Couldn't handle GServices change due to initialization failure");
                                } else {
                                    a4.f58067c.mo32995d(new abqy(a4, bqbd.HANDLE_GSERVICES_CHANGED));
                                }
                                IcingInternalCorporaUpdateChimeraService.m66708a(a4.f58066b);
                                IndexWorkerChimeraService indexWorkerChimeraService2 = this.f60569b;
                                long longValue = ((Long) abzt.f58859a.mo58455c()).longValue();
                                SharedPreferences c2 = indexWorkerChimeraService2.mo43423c();
                                if (c2.getLong("maintenance_frequency_ms", 0) != longValue) {
                                    SharedPreferences.Editor edit = c2.edit();
                                    edit.putLong("maintenance_frequency_ms", longValue);
                                    edit.apply();
                                    IndexWorkerChimeraService indexWorkerChimeraService3 = this.f60569b;
                                    int i2 = IndexWorkerChimeraService.f79087c;
                                    indexWorkerChimeraService3.mo43421a("GserviceValue changed");
                                }
                            } else {
                                String stringExtra = this.f60568a.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
                                StringBuilder sb3 = new StringBuilder(action.length() + 35 + String.valueOf(stringExtra).length());
                                sb3.append("Action '");
                                sb3.append(action);
                                sb3.append("' intended for '");
                                sb3.append(stringExtra);
                                sb3.append("', ignoring");
                                absg.m48201d(sb3.toString());
                            }
                        } else if (action.equals("android.intent.action.LOCALE_CHANGED")) {
                            abrv a5 = this.f60569b.mo43420a();
                            String language = a5.f58066b.getResources().getConfiguration().locale.getLanguage();
                            if (a5.mo32320d()) {
                                a5.f58067c.mo32995d(new abrk(a5, bqbd.REPARSE_GLOBAL_SEARCH_SECTION_MAPPINGS, language));
                            } else {
                                absg.m48191b("Global Search Section Mappings reparsing skipped because init failed");
                            }
                        } else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW") || action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                            abrv a6 = this.f60569b.mo43420a();
                            Intent intent3 = this.f60568a;
                            String valueOf2 = String.valueOf(intent3);
                            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 23);
                            sb4.append("Got storage broadcast: ");
                            sb4.append(valueOf2);
                            absg.m48184a(sb4.toString());
                            String action4 = intent3.getAction();
                            if (!a6.mo32320d()) {
                                absg.m48206e("Couldn't handle %s intent due to initialization failure.", action4);
                            } else if (!"android.intent.action.DEVICE_STORAGE_LOW".equals(action4)) {
                                if ("android.intent.action.DEVICE_STORAGE_OK".equals(action4)) {
                                    a6.f58067c.mo32995d(new abrs(a6, bqbd.HANDLE_DEVICE_STORAGE_OK));
                                } else {
                                    String valueOf3 = String.valueOf(action4);
                                    throw new acas(valueOf3.length() == 0 ? new String("Unknown intent action ") : "Unknown intent action ".concat(valueOf3));
                                }
                            }
                        } else if (action.equals("com.google.android.gms.icing.INDEX_CONTENT_PROVIDER")) {
                            Bundle extras = this.f60568a.getExtras();
                            if (extras != null) {
                                j = extras.getLong("delay", -1);
                            } else {
                                j = -1;
                            }
                            if (j != -1) {
                                abrv a7 = this.f60569b.mo43420a();
                                a7.f58067c.mo32995d(new abrg(a7, bqbd.RETRY_FAILED_INDEXING_CORPORA, j));
                            } else {
                                absg.m48192b("Received invalid intent: %s", this.f60568a);
                            }
                        } else if (action.equals("com.google.android.c2dm.intent.RECEIVE")) {
                            if (cenc.m137460e()) {
                                IndexWorkerChimeraService indexWorkerChimeraService4 = this.f60569b;
                                Intent intent4 = this.f60568a;
                                int i3 = IndexWorkerChimeraService.f79087c;
                                if (intent4.hasExtra("icing-gcm-msg-base64") && (a2 = GcmReceiverChimeraService.m66664a(intent4)) != null) {
                                    try {
                                        acqv = (acqv) GeneratedMessageLite.m124016a(acqv.f60548d, a2, bxus.m123744c());
                                    } catch (bxwf e) {
                                        absg.m48192b("Gcm message parse failed: %s", e.getMessage());
                                        acqv = null;
                                    }
                                    if (acqv != null) {
                                        indexWorkerChimeraService4.mo43420a().mo32306a(acqv);
                                    }
                                }
                                if (intent4.hasExtra("icing-fpop-user-actions-base64") && (a = ByteString.m123261a(GcmReceiverChimeraService.m66665a(intent4, "icing-fpop-user-actions-base64"))) != null) {
                                    abrv a8 = indexWorkerChimeraService4.mo43420a();
                                    if (a8.mo32320d()) {
                                        acpl.mo32995d(new acsp(a8.f58066b, a8.f58085u, a8, a8.f58078n, a8.mo32298a(), a8.mo32331n(), a8.f58083s, a, a8.f58087w));
                                    } else {
                                        absg.m48191b("Unable to run ActionDeletionsPushTask because of IndexManager initialization failure");
                                    }
                                }
                            } else {
                                byte[] a9 = GcmReceiverChimeraService.m66664a(this.f60568a);
                                if (a9 != null) {
                                    try {
                                        this.f60569b.mo43420a().mo32306a((acqv) GeneratedMessageLite.m124016a(acqv.f60548d, a9, bxus.m123744c()));
                                    } catch (bxwf e2) {
                                        absg.m48192b("Gcm message parse failed: %s", e2.getMessage());
                                    }
                                }
                            }
                        } else if (action.equals("com.google.android.gms.icing.GCM_TASK")) {
                            if (this.f60569b.mo43420a().mo32320d()) {
                                IndexWorkerChimeraService indexWorkerChimeraService5 = this.f60569b;
                                Intent intent5 = this.f60568a;
                                int i4 = IndexWorkerChimeraService.f79087c;
                                abrv a10 = indexWorkerChimeraService5.mo43420a();
                                String stringExtra2 = intent5.getStringExtra("tag");
                                if (stringExtra2 != null) {
                                    switch (stringExtra2.hashCode()) {
                                        case -1038446582:
                                            if (stringExtra2.equals("action-deletions-download-push-triggered")) {
                                                c = 2;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -377711994:
                                            if (stringExtra2.equals("app-history-upload")) {
                                                c = 1;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 216563530:
                                            if (stringExtra2.equals("Maintenance.BatchProcessing.24h")) {
                                                c = 6;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 317649683:
                                            if (stringExtra2.equals("maintenance")) {
                                                c = 4;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 526899711:
                                            if (stringExtra2.equals("Maintenance.BatchDownload.24h")) {
                                                c = 5;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1470091582:
                                            if (stringExtra2.equals("drain-request-queue")) {
                                                c = 3;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1984331318:
                                            break;
                                        default:
                                            c = 65535;
                                            break;
                                    }
                                    switch (c) {
                                        case 0:
                                            acpl.mo32995d(new apsu(a10.f58066b, a10.f58071g, a10.mo32298a(), a10.f58077m, a10.f58085u, a10.f58069e));
                                            break;
                                        case 1:
                                            acpl.mo32995d(new abpk(a10.f58066b, a10.f58071g, a10.mo32298a(), a10.f58077m, a10.f58085u, a10.f58078n, a10.f58083s, a10, a10.mo32331n(), a10.f58086v, a10.f58087w));
                                            break;
                                        case 2:
                                            if (cenc.m137460e() && cenc.m137459d()) {
                                                acpl.mo32995d(new acsg(a10.f58066b, a10.f58085u, a10, a10.f58078n, a10.mo32298a(), a10.mo32331n(), a10.f58083s, a10.f58087w, bdrw.CHANGE_NOTIFICATION));
                                                break;
                                            }
                                        case 3:
                                            abvx abvx = a10.f58081q;
                                            if (abvx != null) {
                                                abvx.mo32375b();
                                                break;
                                            }
                                            break;
                                        case 4:
                                            absg.m48184a("IndexWorkerChimeraService: starting maintenance");
                                            if (celx.m137222b()) {
                                                acrz.m49786a(indexWorkerChimeraService5.getApplicationContext()).mo33051a();
                                            }
                                            indexWorkerChimeraService5.mo43420a().mo32325h();
                                            acpl.mo32995d(new abwy(indexWorkerChimeraService5.mo43420a()));
                                            if (!((Boolean) abzt.f58912b.mo58455c()).booleanValue()) {
                                                acni.m49505c(a10.f58066b);
                                                break;
                                            }
                                            break;
                                        case 5:
                                            if (cenc.m137460e()) {
                                                acpl.mo32995d(new acsg(a10.f58066b, a10.f58085u, a10, a10.f58078n, a10.mo32298a(), a10.mo32331n(), a10.f58083s, a10.f58087w, bdrw.PERIODIC_SYNC));
                                                break;
                                            }
                                            break;
                                        case 6:
                                            absg.m48185a("No tasks to execute in maintenance window: %s", stringExtra2);
                                            break;
                                        default:
                                            absg.m48206e("Received unexpected gcm tag: %s", stringExtra2);
                                            break;
                                    }
                                }
                            } else {
                                absg.m48205e("Couldn't run gcm task due to initialization failure");
                            }
                        } else if (action.equals("com.google.android.gms.chimera.container.CONTAINER_UPDATED") || action.equals(IntentOperation.ACTION_NEW_MODULE) || action.equals("android.intent.action.MY_PACKAGE_REPLACED")) {
                            if (cemq.m137367d()) {
                                File file = new File(this.f60569b.mo43420a().f58066b.getFilesDir(), "unpacked/shared/cld3model/cld3-model-0001");
                                if (!file.exists()) {
                                    File parentFile = file.getParentFile();
                                    if (parentFile != null) {
                                        srj.m36120a(parentFile);
                                    }
                                    Context context2 = this.f60569b.mo43420a().f58066b;
                                    File file2 = new File(context2.getFilesDir().getAbsolutePath(), "unpacked/shared/cld3model/cld3-model-0001");
                                    if (!file2.exists()) {
                                        try {
                                            File parentFile2 = file2.getParentFile();
                                            if (parentFile2 != null) {
                                                if (!parentFile2.exists() && !parentFile2.mkdirs()) {
                                                    String path = parentFile2.getPath();
                                                    StringBuilder sb5 = new StringBuilder(String.valueOf(path).length() + 44);
                                                    sb5.append("Unable to create parent directory ");
                                                    sb5.append(path);
                                                    sb5.append(" for asset");
                                                    absg.m48191b(sb5.toString());
                                                }
                                            }
                                            srj.m36118a(context2.getAssets().open("cld3model/gmscore_model.smfb"), file2);
                                        } catch (IOException e3) {
                                            absg.m48189a(e3, "Unable to open asset cld3model/gmscore_model.smfb");
                                            file2.delete();
                                        }
                                    }
                                    file2.getAbsolutePath();
                                }
                            }
                            IndexWorkerChimeraService indexWorkerChimeraService6 = this.f60569b;
                            int i5 = IndexWorkerChimeraService.f79087c;
                            indexWorkerChimeraService6.mo43421a("package replaced");
                            PeriodicRebuildIndexChimeraService.m66673a(this.f60569b.mo43422b());
                            absg.m48184a("Registering phenotype on container/module update.");
                            if (celx.m137222b()) {
                                acrz.m49786a(this.f60569b.getApplicationContext()).mo33051a();
                            }
                            absg.m48184a("Registering IDD GCM Tasks on container/module update.");
                            absh.m48214a(this.f60569b.mo43422b(), true);
                        } else {
                            absg.m48192b("Received unexpected intent: %s", action);
                        }
                    }
                }
            }
        }
        return null;
    }
}
