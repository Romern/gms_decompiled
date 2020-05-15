package p000;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import com.google.android.gms.libs.scheduler.PendingCallback;
import com.google.android.gms.search.administration.BundleResponse;
import com.google.firebase.appindexing.internal.Thing;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DeflaterOutputStream;
import org.whispersystems.curve25519.Curve25519;

/* renamed from: apmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class apmq extends aplq {

    /* renamed from: a */
    public final abrv f84734a;

    public apmq(abrv abrv, Bundle bundle, abyy abyy) {
        super(bqbd.DIAGNOSTIC, 1, 4, abrv.f58066b, bundle, abyy);
        this.f84734a = abrv;
    }

    /* renamed from: a */
    private final void m70663a(Writer writer) {
        this.f84734a.mo32322e();
        PrintWriter printWriter = new PrintWriter(writer);
        abrv abrv = this.f84734a;
        acwz.m49916a(abrv.f58066b, printWriter, new String[]{Curve25519.NATIVE, "verbose"}, abrv);
        printWriter.flush();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final BundleResponse mo11132a() {
        String str;
        FileOutputStream fileOutputStream;
        Throwable th;
        Cursor query;
        Throwable th2;
        String str2;
        String str3;
        String str4;
        int i;
        Bundle bundle = new Bundle();
        ClassLoader classLoader = Thing.class.getClassLoader();
        if (classLoader != null) {
            ((Bundle) this.f84708n).setClassLoader(classLoader);
        }
        String string = ((Bundle) this.f84708n).getString("name");
        ArrayList arrayList = new ArrayList();
        if (string == null) {
            str = "No operation named";
        } else if ("flush".equals(string)) {
            abrv abrv = this.f84734a;
            abrv.mo32322e();
            acpl acpl = abrv.f58067c;
            abrb abrb = new abrb(abrv, bqbd.FLUSH_INDEX);
            acpl.mo32995d(abrb);
            arrayList.add(abrb);
            str = null;
        } else if ("commit".equals(string)) {
            this.f84734a.mo32323f();
            str = null;
        } else if ("clear".equals(string)) {
            abrv abrv2 = this.f84734a;
            abrv2.mo32332o();
            arrayList.add(abrv2.mo32299a(true));
            str = null;
        } else if ("killGmsCore".equals(string)) {
            Process.killProcess(Process.myPid());
            str = null;
        } else if ("compact".equals(string)) {
            arrayList.add(this.f84734a.mo32324g());
            str = null;
        } else if ("rebuild".equals(string)) {
            abrv abrv3 = this.f84734a;
            abrv3.mo32322e();
            acpl acpl2 = abrv3.f58067c;
            abrc abrc = new abrc(abrv3, bqbd.REBUILD_INDEX);
            acpl2.mo32995d(abrc);
            arrayList.add(abrc);
            str = null;
        } else if ("compactAndPurge".equals(string)) {
            if (((Bundle) this.f84708n).containsKey("target")) {
                double d = ((Bundle) this.f84708n).getDouble("target");
                abrv abrv4 = this.f84734a;
                abrv4.mo32322e();
                acpl acpl3 = abrv4.f58067c;
                abre abre = new abre(abrv4, bqbd.COMPACT_AND_PURGE_INDEX, d);
                acpl3.mo32995d(abre);
                arrayList.add(abre);
                str = null;
            } else {
                str = "No target free for compactAndPurge specified";
            }
        } else if ("getDebugString".equals(string)) {
            if (!((Bundle) this.f84708n).getBoolean("deflated", false)) {
                StringWriter stringWriter = new StringWriter();
                m70663a((Writer) stringWriter);
                bundle.putString("debug", stringWriter.toString());
                str = null;
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new DeflaterOutputStream(byteArrayOutputStream), "UTF-8");
                    m70663a((Writer) outputStreamWriter);
                    outputStreamWriter.close();
                } catch (IOException e) {
                }
                bundle.putByteArray("deflated_debug", byteArrayOutputStream.toByteArray());
                str = null;
            }
        } else if ("copyIndexToLocation".equals(string)) {
            if (!Build.TAGS.contains("test-keys")) {
                bundle.putString("debug", "Operation disabled on non-rooted devices for data security reasons.");
                str = null;
            } else {
                String string2 = ((Bundle) this.f84708n).getString("output_folder_for_dump", "");
                if (!string2.isEmpty()) {
                    if (!NativeIndex.nativeCopyIndexToDirectory(this.f84734a.f58078n.f79071b, string2, abzu.m48730a().serializeToBytes())) {
                        String valueOf = String.valueOf(string2);
                        bundle.putString("debug", valueOf.length() == 0 ? new String("Failed copying over index to: ") : "Failed copying over index to: ".concat(valueOf));
                        str = null;
                    } else {
                        String valueOf2 = String.valueOf(string2);
                        bundle.putString("debug", valueOf2.length() == 0 ? new String("Successfully copied index to: ") : "Successfully copied index to: ".concat(valueOf2));
                        str = null;
                    }
                } else {
                    bundle.putString("debug", "index-copy failed - no output folder provided.");
                    str = null;
                }
            }
        } else if ("readresources".equals(string)) {
            acpl acpl4 = this.f84734a.f58067c;
            apml apml = new apml(this, bqbd.READ_CLIENT_INFO_FROM_RESOURCES);
            acpl4.mo32995d(apml);
            arrayList.add(apml);
            str = null;
        } else if ("maintenance".equals(string)) {
            arrayList.add(this.f84734a.mo32325h());
            abrv abrv5 = this.f84734a;
            acpl acpl5 = abrv5.f58067c;
            abwy abwy = new abwy(abrv5);
            acpl5.mo32995d(abwy);
            arrayList.add(abwy);
            str = null;
        } else if ("maintenance_intent".equals(string)) {
            Intent intent = new Intent("com.google.android.gms.icing.GCM_TASK");
            intent.setClassName(this.f84734a.f58066b.getPackageName(), "com.google.android.gms.icing.service.IndexWorkerService");
            intent.putExtra("tag", "maintenance");
            this.f84734a.f58066b.startService(intent);
            str = null;
        } else if ("InternalCorporaMaintenance".equals(string)) {
            acni.m49505c(this.f84734a.f58066b);
            str = null;
        } else if ("slurpUsageReports".equals(string)) {
            abrv abrv6 = this.f84734a;
            acpl acpl6 = abrv6.f58067c;
            abva abva = new abva(abrv6, false, true);
            acpl6.mo32995d(abva);
            arrayList.add(abva);
            str = null;
        } else if ("uploadAppHistory".equals(string)) {
            abrv abrv7 = this.f84734a;
            acpl acpl7 = abrv7.f58067c;
            Context context = abrv7.f58066b;
            acrl acrl = abrv7.f58071g;
            abzo a = abrv7.mo32298a();
            abrv abrv8 = this.f84734a;
            abyx abyx = abrv8.f58077m;
            acao acao = abrv8.f58085u;
            NativeIndex nativeIndex = abrv8.f58078n;
            abym abym = abrv8.f58083s;
            abyp n = abrv8.mo32331n();
            abrv abrv9 = this.f84734a;
            abpk abpk = new abpk(context, acrl, a, abyx, acao, nativeIndex, abym, abrv8, n, abrv9.f58086v, abrv9.f58087w);
            acpl7.mo32995d(abpk);
            arrayList.add(abpk);
            str = null;
        } else if ("dummyTask".equals(string)) {
            acpl acpl8 = this.f84734a.f58067c;
            acpn acpn = new acpn(bqbd.DIAGNOSTIC);
            acpl8.mo32995d(acpn);
            arrayList.add(acpn);
            str = null;
        } else if ("startRecording".equals(string)) {
            acxk acxk = this.f84734a.f58090z;
            if (!acxk.f61020e) {
                synchronized (acxk.f61016a) {
                    absg.m48184a("Start recording");
                    acxk.f61017b = true;
                }
                List b = acxk.mo33200b();
                synchronized (acxk.f61016a) {
                    if (b != null) {
                        try {
                            i = b.size();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    } else {
                        i = 0;
                    }
                    acxk.f61019d = i;
                }
                str = null;
            } else {
                absg.m48205e("Trying to record queries in prod build, ignoring.");
                str = null;
            }
        } else if ("stopRecording".equals(string)) {
            acxk acxk2 = this.f84734a.f58090z;
            synchronized (acxk2.f61016a) {
                absg.m48184a("Stop recording");
                acxk2.f61017b = false;
            }
            str = null;
        } else if ("clearRecording".equals(string)) {
            acxk acxk3 = this.f84734a.f58090z;
            synchronized (acxk3.f61016a) {
                acxk3.f61018c.delete();
                acxk3.f61019d = 0;
            }
            str = null;
        } else if ("getRecords".equals(string)) {
            List b2 = this.f84734a.f58090z.mo33200b();
            if (b2 != null) {
                int i2 = ((Bundle) this.f84708n).getInt("query_record_index");
                try {
                    bundle.putByteArray("query_record", ((abtt) b2.get(i2)).serializeToBytes());
                } catch (IndexOutOfBoundsException e2) {
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Record not found for index ");
                    sb.append(i2);
                    absg.m48191b(sb.toString());
                    str = null;
                }
            }
            str = null;
        } else if ("updateAppParams".equals(string)) {
            abrv abrv10 = this.f84734a;
            acpl acpl9 = abrv10.f58067c;
            Context context2 = abrv10.f58066b;
            acrl acrl2 = abrv10.f58071g;
            abzo a2 = abrv10.mo32298a();
            abrv abrv11 = this.f84734a;
            apsu apsu = new apsu(context2, acrl2, a2, abrv11.f58077m, abrv11.f58085u, abrv11.f58069e);
            acpl9.mo32995d(apsu);
            arrayList.add(apsu);
            str = null;
        } else if ("appIndexingCallAsGmsCore".equals(string)) {
            String string3 = ((Bundle) this.f84708n).getString("app_indexing_api_call_type");
            if (bmxx.m108577a(string3)) {
                str = "Must set app_indexing_api_call_type parameter";
            } else if (string3.equals("update")) {
                Thing thing = (Thing) ((Bundle) this.f84708n).getParcelable("app_indexing_update_param");
                if (thing != null) {
                    arrayList.add(new apmp(brhj.m114016a(this.f84734a.f58066b).mo32869a(thing)));
                }
                str = null;
            } else if (string3.equals("patch")) {
                Thing thing2 = (Thing) ((Bundle) this.f84708n).getParcelable("app_indexing_update_param");
                if (thing2 != null) {
                    arrayList.add(new apmp(brhj.m114016a(this.f84734a.f58066b).mo32872b(thing2)));
                }
                str4 = null;
            } else {
                str4 = "app_indexing_api_call_type is not supported yet.";
            }
        } else if ("clearAppData".equals(string)) {
            String string4 = ((Bundle) this.f84708n).getString("package_name");
            if (!TextUtils.isEmpty(string4)) {
                acpl acpl10 = this.f84734a.f58067c;
                apmm apmm = new apmm(this, bqbd.CLEAR_APP_DATA, string4);
                acpl10.mo32995d(apmm);
                arrayList.add(apmm);
                str3 = null;
            } else {
                str3 = "Must set package_name parameter";
            }
        } else if ("appIndexingOneoffRebuildIndex".equals(string)) {
            String string5 = ((Bundle) this.f84708n).getString("package_name");
            if (!TextUtils.isEmpty(string5)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("packageName", string5);
                m70664a("com.google.android.gms.icing.indexapi.OneoffRebuildIndexService", bundle2);
                str2 = null;
            } else {
                str2 = "Must set package_name parameter";
            }
        } else if ("appIndexingPeriodicRebuildIndex".equals(string)) {
            m70664a("com.google.android.gms.icing.indexapi.PeriodicRebuildIndexService", (Bundle) null);
            str = null;
        } else if ("appIndexingEnableErrorCache".equals(string)) {
            abxp.m48475a(this.f84734a.f58066b).mo32417a(((Bundle) this.f84708n).getBoolean("error_cache_preference"));
            str = null;
        } else if ("clearCorpusData".equals(string)) {
            String string6 = ((Bundle) this.f84708n).getString("package_name");
            String string7 = ((Bundle) this.f84708n).getString("corpus_name");
            if (!TextUtils.isEmpty(string6) && !TextUtils.isEmpty(string7)) {
                acpl acpl11 = this.f84734a.f58067c;
                apmn apmn = new apmn(this, bqbd.CLEAR_CORPUS_DATA, string6, string7);
                acpl11.mo32995d(apmn);
                arrayList.add(apmn);
                str = null;
            } else {
                str = "Must set both package_name and corpus_name parameters";
            }
        } else if ("getSequenceTableSummary".equals(string)) {
            String string8 = ((Bundle) this.f84708n).getString("package_name");
            String string9 = ((Bundle) this.f84708n).getString("extended_type_name");
            if (!TextUtils.isEmpty(string8) && !TextUtils.isEmpty(string9)) {
                try {
                    abvo a3 = abvo.m48336a(this.f84734a.f58066b, string8);
                    if (a3 == null) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(string8).length() + 24);
                        sb2.append("Package ");
                        sb2.append(string8);
                        sb2.append(" is blacklisted.");
                        str = sb2.toString();
                    } else {
                        query = a3.getReadableDatabase().query(abxu.m48513a(abww.m48412a(string9, string8)), new String[]{"seqno"}, null, null, null, null, null, null);
                        int count = query.getCount();
                        long[] jArr = new long[count];
                        for (int i3 = 0; i3 < count; i3++) {
                            sdo.m34970a(query.moveToNext());
                            jArr[i3] = query.getLong(0);
                        }
                        sdo.m34970a(!query.moveToNext());
                        bundle.putLongArray("seqno", jArr);
                        if (query != null) {
                            query.close();
                        }
                        str = null;
                    }
                } catch (Exception e3) {
                    str = e3.toString();
                } catch (Throwable th4) {
                    bqye.m113761a(th2, th4);
                }
            } else {
                str = "Must set both package_name and extended_type_name parameters";
            }
        } else if ("MobStoreCreateSuccessFile".equals(string)) {
            File file = new File(this.f84734a.f58066b.getFilesDir(), "datadownload/shared/public");
            if (!file.mkdirs()) {
                String valueOf3 = String.valueOf(file);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 22);
                sb3.append("Failed to create dir: ");
                sb3.append(valueOf3);
                str = sb3.toString();
            } else {
                File file2 = new File(file, "success.txt");
                absg.m48185a("Writing diagnostic MobStore success file: %s", file2);
                try {
                    fileOutputStream = new FileOutputStream(file2);
                    fileOutputStream.write("success\n".getBytes("UTF-8"));
                    fileOutputStream.close();
                    str = null;
                } catch (IOException e4) {
                    String valueOf4 = String.valueOf(file2);
                    String valueOf5 = String.valueOf(e4);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 27 + String.valueOf(valueOf5).length());
                    sb4.append("Failed to write file: ");
                    sb4.append(valueOf4);
                    sb4.append(" bc: ");
                    sb4.append(valueOf5);
                    str = sb4.toString();
                } catch (Throwable th5) {
                    bqye.m113761a(th, th5);
                }
            }
        } else if ("updateNativeConfig".equals(string)) {
            abrv abrv12 = this.f84734a;
            acpl acpl12 = abrv12.f58067c;
            abrh abrh = new abrh(abrv12, bqbd.UPDATE_NATIVE_CONFIG);
            acpl12.mo32995d(abrh);
            arrayList.add(abrh);
            str = null;
        } else if ("newModuleIntent".equals(string)) {
            Intent intent2 = new Intent(IntentOperation.ACTION_NEW_MODULE);
            intent2.setClassName(this.f84734a.f58066b.getPackageName(), "com.google.android.gms.icing.service.IndexWorkerService");
            this.f84734a.f58066b.startService(intent2);
            str = null;
        } else {
            StringBuilder sb5 = new StringBuilder(string.length() + 20);
            sb5.append("Unknown operation \"");
            sb5.append(string);
            sb5.append("\"");
            str = sb5.toString();
        }
        if (((Bundle) this.f84708n).getBoolean("block")) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                Object h = ((acpw) arrayList.get(i4)).mo32295h();
                if (h != null && !(h instanceof Void)) {
                    if (h instanceof Boolean) {
                        if (!((Boolean) h).booleanValue()) {
                            str = "Operation failed";
                        }
                    } else if (h instanceof String) {
                        str = (String) h;
                    } else {
                        String valueOf6 = String.valueOf(h.getClass());
                        StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf6).length() + 21);
                        sb6.append("Unknown return type: ");
                        sb6.append(valueOf6);
                        str = sb6.toString();
                    }
                }
            }
        }
        bundle.putString("error_message", str);
        BundleResponse bundleResponse = new BundleResponse();
        bundleResponse.f107355a = Status.f30107a;
        bundleResponse.f107356b = bundle;
        return bundleResponse;
        throw th;
        throw th2;
    }

    /* renamed from: a */
    private final void m70664a(String str, Bundle bundle) {
        PendingCallback pendingCallback = new PendingCallback(new apmo());
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", str);
        intent.setAction("com.google.android.gms.gcm.ACTION_TASK_READY");
        intent.putExtra("tag", "Diagnostic");
        if (bundle != null) {
            intent.putExtra("extras", bundle);
        }
        intent.putExtra("callback", pendingCallback);
        this.f84734a.f58066b.startService(intent);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo47405a(Status status) {
        BundleResponse bundleResponse = new BundleResponse();
        bundleResponse.f107355a = status;
        return bundleResponse;
    }
}
